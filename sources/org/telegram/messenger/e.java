package org.telegram.messenger;

import j$.util.Base64;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.tl.TL_aicompose;
public final class e {
    public final int f22158a;
    public long f22160c;
    public boolean d;
    public boolean f22161e;
    public final ArrayList f22159b = new ArrayList();
    public int f22162f = -1;
    public long f22163g = 0;

    public e(int i7) {
        this.f22158a = i7;
    }

    public final void a() {
        this.f22163g = 0L;
        if (this.d) {
            b();
        }
    }

    public final void b() {
        ArrayList arrayList = this.f22159b;
        boolean z9 = this.f22161e;
        int i7 = this.f22158a;
        if (!z9) {
            this.f22161e = true;
            try {
                String string = qp.s1(i7).f24778e7.getString("ai_styles", null);
                if (string != null) {
                    SerializedData serializedData = new SerializedData(Base64.getDecoder().decode(string));
                    TL_aicompose.Tones TLdeserialize = TL_aicompose.Tones.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                    if (TLdeserialize instanceof TL_aicompose.TL_tones) {
                        this.f22160c = ((TL_aicompose.TL_tones) TLdeserialize).hash;
                        arrayList.clear();
                        arrayList.addAll(((TL_aicompose.TL_tones) TLdeserialize).tones);
                    }
                }
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
        if (this.f22162f < 0 && System.currentTimeMillis() - this.f22163g >= 1800000) {
            TL_aicompose.getTones gettones = new TL_aicompose.getTones();
            gettones.hash = this.f22160c;
            this.f22162f = ConnectionsManager.getInstance(i7).sendRequestTyped(gettones, new d3.b(1), new d(this, 0));
        }
    }

    public final void c() {
        qs.f(this.f22158a).k(qs.Y3, this);
    }

    public final void d() {
        TL_aicompose.TL_tones tL_tones = new TL_aicompose.TL_tones();
        tL_tones.hash = this.f22160c;
        tL_tones.tones.addAll(this.f22159b);
        SerializedData serializedData = new SerializedData(tL_tones.getObjectSize());
        tL_tones.serializeToStream(serializedData);
        qp.s1(this.f22158a).f24778e7.edit().putString("ai_styles", Base64.getEncoder().encodeToString(serializedData.toByteArray())).apply();
    }
}
