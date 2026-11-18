package ki;

import org.telegram.messenger.fj;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class g1 extends fj {
    public TL_iv.RichMessage f18691u3;
    public final boolean f18692v3;
    public final TLRPC.BotInlineResult f18693w3;

    public g1(int i7, TLRPC.TL_message tL_message, boolean z10, TLRPC.BotInlineResult botInlineResult) {
        super(i7, tL_message, true, true);
        this.f18692v3 = z10;
        this.f18693w3 = botInlineResult;
    }

    @Override
    public final TL_iv.RichMessage E0() {
        if (this.f18692v3) {
            if (this.f18691u3 == null) {
                this.f18691u3 = org.telegram.utils.twidget.n0.o(org.telegram.utils.twidget.n0.v(this.K1, this.f18693w3));
            }
            return this.f18691u3;
        }
        return super.E0();
    }

    @Override
    public final boolean N3() {
        return false;
    }

    @Override
    public final boolean P3() {
        return false;
    }
}
