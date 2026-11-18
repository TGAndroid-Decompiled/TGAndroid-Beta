package org.telegram.messenger;

import j$.util.Base64;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.tl.TL_aicompose;
public final class e {
    public final int f23610a;
    public long f23612c;
    public boolean d;
    public boolean f23613e;
    public final ArrayList f23611b = new ArrayList();
    public int f23614f = -1;
    public long f23615g = 0;

    public e(int i7) {
        this.f23610a = i7;
    }

    public final void a() {
        this.f23615g = 0L;
        if (this.d) {
            b();
        }
    }

    public final void b() {
        ArrayList arrayList = this.f23611b;
        boolean z10 = this.f23613e;
        int i7 = this.f23610a;
        if (!z10) {
            this.f23613e = true;
            try {
                String string = mp.u1(i7).h7.getString("ai_styles", null);
                if (string != null) {
                    SerializedData serializedData = new SerializedData(Base64.getDecoder().decode(string));
                    TL_aicompose.Tones TLdeserialize = TL_aicompose.Tones.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                    if (TLdeserialize instanceof TL_aicompose.TL_tones) {
                        this.f23612c = ((TL_aicompose.TL_tones) TLdeserialize).hash;
                        arrayList.clear();
                        arrayList.addAll(((TL_aicompose.TL_tones) TLdeserialize).tones);
                    }
                }
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
        if (this.f23614f < 0 && System.currentTimeMillis() - this.f23615g >= 1800000) {
            TL_aicompose.getTones gettones = new TL_aicompose.getTones();
            gettones.hash = this.f23612c;
            this.f23614f = ConnectionsManager.getInstance(i7).sendRequestTyped(gettones, new d3.b(1), new d(this, 0));
        }
    }

    public final void c() {
        ks.f(this.f23610a).k(ks.f25091b4, this);
    }

    public final void d() {
        TL_aicompose.TL_tones tL_tones = new TL_aicompose.TL_tones();
        tL_tones.hash = this.f23612c;
        tL_tones.tones.addAll(this.f23611b);
        SerializedData serializedData = new SerializedData(tL_tones.getObjectSize());
        tL_tones.serializeToStream(serializedData);
        mp.u1(this.f23610a).h7.edit().putString("ai_styles", Base64.getEncoder().encodeToString(serializedData.toByteArray())).apply();
    }
}
