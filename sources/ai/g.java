package ai;

import org.telegram.messenger.gd;
import org.telegram.tgnet.tl.TL_aicompose;
public final class g {
    public final String f1199a;
    public final long f1200b;
    public final TL_aicompose.AiComposeTone f1201c;
    public final boolean d;

    public g(String str, long j3, TL_aicompose.AiComposeTone aiComposeTone, boolean z10) {
        this.f1199a = str;
        this.f1200b = j3;
        this.f1201c = aiComposeTone;
        this.d = z10;
    }

    public final String a() {
        if (this.d) {
            return gd.M0(2131745066, null);
        }
        return this.f1199a;
    }
}
