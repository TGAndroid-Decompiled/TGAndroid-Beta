package defpackage;

import j$.util.Base64;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.tl.TL_aicompose;
public final class ic {
    public final int a;
    public long c;
    public boolean d;
    public boolean e;
    public final ArrayList b = new ArrayList();
    public int f = -1;
    public long g = 0;

    public ic(int i) {
        this.a = i;
    }

    public final void a() {
        this.g = 0L;
        if (this.d) {
            b();
        }
    }

    public final void b() {
        ArrayList arrayList = this.b;
        boolean z = this.e;
        int i = this.a;
        if (!z) {
            this.e = true;
            try {
                String string = na7.q1(i).X3.getString("ai_styles", null);
                if (string != null) {
                    SerializedData serializedData = new SerializedData(Base64.getDecoder().decode(string));
                    TL_aicompose.Tones TLdeserialize = TL_aicompose.Tones.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                    if (TLdeserialize instanceof TL_aicompose.TL_tones) {
                        this.c = ((TL_aicompose.TL_tones) TLdeserialize).hash;
                        arrayList.clear();
                        arrayList.addAll(((TL_aicompose.TL_tones) TLdeserialize).tones);
                    }
                }
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
        if (this.f < 0 && System.currentTimeMillis() - this.g >= 1800000) {
            TL_aicompose.getTones gettones = new TL_aicompose.getTones();
            gettones.hash = this.c;
            this.f = ConnectionsManager.getInstance(i).sendRequestTyped(gettones, new hc((byte) 0), new f(this, (byte) 9));
        }
    }

    public final void c() {
        kk7.f(this.a).k(kk7.a4, this);
    }

    public final void d() {
        TL_aicompose.TL_tones tL_tones = new TL_aicompose.TL_tones();
        tL_tones.hash = this.c;
        tL_tones.tones.addAll(this.b);
        SerializedData serializedData = new SerializedData(tL_tones.getObjectSize());
        tL_tones.serializeToStream(serializedData);
        na7.q1(this.a).X3.edit().putString("ai_styles", Base64.getEncoder().encodeToString(serializedData.toByteArray())).apply();
    }
}
