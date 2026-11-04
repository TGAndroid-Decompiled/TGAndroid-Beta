package org.telegram.messenger;

import j$.util.Base64;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.tl.TL_aicompose;
public final class e {
    public final int f22271a;
    public long f22273c;
    public boolean d;
    public boolean f22274e;
    public final ArrayList f22272b = new ArrayList();
    public int f22275f = -1;
    public long f22276g = 0;

    public e(int i3) {
        this.f22271a = i3;
    }

    public final void a() {
        this.f22276g = 0L;
        if (this.d) {
            b();
        }
    }

    public final void b() {
        ArrayList arrayList = this.f22272b;
        boolean z10 = this.f22274e;
        int i3 = this.f22271a;
        if (!z10) {
            this.f22274e = true;
            try {
                String string = hp.s1(i3).f22999e7.getString("ai_styles", null);
                if (string != null) {
                    SerializedData serializedData = new SerializedData(Base64.getDecoder().decode(string));
                    TL_aicompose.Tones TLdeserialize = TL_aicompose.Tones.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                    if (TLdeserialize instanceof TL_aicompose.TL_tones) {
                        this.f22273c = ((TL_aicompose.TL_tones) TLdeserialize).hash;
                        arrayList.clear();
                        arrayList.addAll(((TL_aicompose.TL_tones) TLdeserialize).tones);
                    }
                }
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
        if (this.f22275f < 0 && System.currentTimeMillis() - this.f22276g >= 1800000) {
            TL_aicompose.getTones gettones = new TL_aicompose.getTones();
            gettones.hash = this.f22273c;
            this.f22275f = ConnectionsManager.getInstance(i3).sendRequestTyped(gettones, new c3.b(1), new d(this, 0));
        }
    }

    public final void c() {
        hs.f(this.f22271a).k(hs.Y3, this);
    }

    public final void d() {
        TL_aicompose.TL_tones tL_tones = new TL_aicompose.TL_tones();
        tL_tones.hash = this.f22273c;
        tL_tones.tones.addAll(this.f22272b);
        SerializedData serializedData = new SerializedData(tL_tones.getObjectSize());
        tL_tones.serializeToStream(serializedData);
        hp.s1(this.f22271a).f22999e7.edit().putString("ai_styles", Base64.getEncoder().encodeToString(serializedData.toByteArray())).apply();
    }
}
