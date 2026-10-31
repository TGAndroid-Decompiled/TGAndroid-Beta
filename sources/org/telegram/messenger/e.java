package org.telegram.messenger;

import j$.util.Base64;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.tl.TL_aicompose;
public final class e {
    public final int f15335a;
    public long f15337c;
    public boolean d;
    public boolean e;
    public final ArrayList f15336b = new ArrayList();
    public int f15338f = -1;
    public long f15339g = 0;

    public e(int i10) {
        this.f15335a = i10;
    }

    public final void a() {
        this.f15339g = 0L;
        if (this.d) {
            b();
        }
    }

    public final void b() {
        ArrayList arrayList = this.f15336b;
        boolean z10 = this.e;
        int i10 = this.f15335a;
        if (!z10) {
            this.e = true;
            try {
                String string = vp.r1(i10).f7.getString("ai_styles", null);
                if (string != null) {
                    SerializedData serializedData = new SerializedData(Base64.getDecoder().decode(string));
                    TL_aicompose.Tones TLdeserialize = TL_aicompose.Tones.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                    if (TLdeserialize instanceof TL_aicompose.TL_tones) {
                        this.f15337c = ((TL_aicompose.TL_tones) TLdeserialize).hash;
                        arrayList.clear();
                        arrayList.addAll(((TL_aicompose.TL_tones) TLdeserialize).tones);
                    }
                }
            } catch (Exception e) {
                f8.g(e, true);
            }
        }
        if (this.f15338f < 0 && System.currentTimeMillis() - this.f15339g >= 1800000) {
            TL_aicompose.getTones gettones = new TL_aicompose.getTones();
            gettones.hash = this.f15337c;
            this.f15338f = ConnectionsManager.getInstance(i10).sendRequestTyped(gettones, new a3.b(1), new d(this, 0));
        }
    }

    public final void c() {
        zs.f(this.f15335a).k(zs.Y3, this);
    }

    public final void d() {
        TL_aicompose.TL_tones tL_tones = new TL_aicompose.TL_tones();
        tL_tones.hash = this.f15337c;
        tL_tones.tones.addAll(this.f15336b);
        SerializedData serializedData = new SerializedData(tL_tones.getObjectSize());
        tL_tones.serializeToStream(serializedData);
        vp.r1(this.f15335a).f7.edit().putString("ai_styles", Base64.getEncoder().encodeToString(serializedData.toByteArray())).apply();
    }
}
