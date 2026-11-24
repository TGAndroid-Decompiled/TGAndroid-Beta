package defpackage;

import org.telegram.tgnet.tl.TL_aicompose;
public final class vm3 {
    public final String a;
    public final long b;
    public final TL_aicompose.AiComposeTone c;
    public final boolean d;

    public vm3(String str, long j, TL_aicompose.AiComposeTone aiComposeTone, boolean z) {
        this.a = str;
        this.b = j;
        this.c = aiComposeTone;
        this.d = z;
    }

    public final String a() {
        if (this.d) {
            return jb6.M0(2131744990, null);
        }
        return this.a;
    }
}
