package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class ks0 extends r47 {
    public TL_iv.RichMessage u3;
    public final boolean v3;
    public final TLRPC.BotInlineResult w3;

    public ks0(int i, TLRPC.TL_message tL_message, boolean z, TLRPC.BotInlineResult botInlineResult) {
        super(i, tL_message, true, true);
        this.v3 = z;
        this.w3 = botInlineResult;
    }

    @Override
    public final TL_iv.RichMessage E0() {
        if (this.v3) {
            TL_iv.RichMessage richMessage = this.u3;
            if (richMessage == null) {
                TL_iv.RichMessage n = k0d.n(k0d.w(this.K1, this.w3));
                this.u3 = n;
                return n;
            }
            return richMessage;
        }
        return super.E0();
    }

    @Override
    public final boolean N3() {
        return false;
    }

    @Override
    public final boolean O3() {
        return false;
    }
}
