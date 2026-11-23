package ai;

import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_aicompose;
public final class c {
    public final String f1142a;
    public final long f1143b;
    public final TL_aicompose.AiComposeTone f1144c;
    public final boolean d;

    public c(String str, long j3, TL_aicompose.AiComposeTone aiComposeTone, boolean z10) {
        this.f1142a = str;
        this.f1143b = j3;
        this.f1144c = aiComposeTone;
        this.d = z10;
    }

    public final String a() {
        if (this.d) {
            return hd.N0(2131745060, null);
        }
        return this.f1142a;
    }
}
