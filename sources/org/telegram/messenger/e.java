package org.telegram.messenger;

import j$.util.Base64;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.tl.TL_aicompose;
public final class e {
    public final int f22123a;
    public long f22125c;
    public boolean d;
    public boolean f22126e;
    public final ArrayList f22124b = new ArrayList();
    public int f22127f = -1;
    public long f22128g = 0;

    public e(int i7) {
        this.f22123a = i7;
    }

    public final void a() {
        this.f22128g = 0L;
        if (this.d) {
            b();
        }
    }

    public final void b() {
        ArrayList arrayList = this.f22124b;
        boolean z9 = this.f22126e;
        int i7 = this.f22123a;
        if (!z9) {
            this.f22126e = true;
            try {
                String string = qp.s1(i7).f24759e7.getString("ai_styles", null);
                if (string != null) {
                    SerializedData serializedData = new SerializedData(Base64.getDecoder().decode(string));
                    TL_aicompose.Tones TLdeserialize = TL_aicompose.Tones.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                    if (TLdeserialize instanceof TL_aicompose.TL_tones) {
                        this.f22125c = ((TL_aicompose.TL_tones) TLdeserialize).hash;
                        arrayList.clear();
                        arrayList.addAll(((TL_aicompose.TL_tones) TLdeserialize).tones);
                    }
                }
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
        if (this.f22127f < 0 && System.currentTimeMillis() - this.f22128g >= 1800000) {
            TL_aicompose.getTones gettones = new TL_aicompose.getTones();
            gettones.hash = this.f22125c;
            this.f22127f = ConnectionsManager.getInstance(i7).sendRequestTyped(gettones, new d3.b(1), new d(this, 0));
        }
    }

    public final void c() {
        qs.f(this.f22123a).k(qs.Y3, this);
    }

    public final void d() {
        TL_aicompose.TL_tones tL_tones = new TL_aicompose.TL_tones();
        tL_tones.hash = this.f22125c;
        tL_tones.tones.addAll(this.f22124b);
        SerializedData serializedData = new SerializedData(tL_tones.getObjectSize());
        tL_tones.serializeToStream(serializedData);
        qp.s1(this.f22123a).f24759e7.edit().putString("ai_styles", Base64.getEncoder().encodeToString(serializedData.toByteArray())).apply();
    }
}
