package ai;

import org.telegram.messenger.gd;
import org.telegram.tgnet.tl.TL_aicompose;
public final class g {
    public final String f1200a;
    public final long f1201b;
    public final TL_aicompose.AiComposeTone f1202c;
    public final boolean d;

    public g(String str, long j3, TL_aicompose.AiComposeTone aiComposeTone, boolean z10) {
        this.f1200a = str;
        this.f1201b = j3;
        this.f1202c = aiComposeTone;
        this.d = z10;
    }

    public final String a() {
        if (this.d) {
            return gd.N0(2131745060, null);
        }
        return this.f1200a;
    }
}
