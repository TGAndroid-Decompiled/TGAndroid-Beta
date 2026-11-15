package ki;

import org.telegram.messenger.gj;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class i1 extends gj {
    public TL_iv.RichMessage f18360u3;
    public final boolean f18361v3;
    public final TLRPC.BotInlineResult f18362w3;

    public i1(int i7, TLRPC.TL_message tL_message, boolean z10, TLRPC.BotInlineResult botInlineResult) {
        super(i7, tL_message, true, true);
        this.f18361v3 = z10;
        this.f18362w3 = botInlineResult;
    }

    @Override
    public final TL_iv.RichMessage E0() {
        if (this.f18361v3) {
            if (this.f18360u3 == null) {
                this.f18360u3 = org.telegram.utils.twidget.n0.o(org.telegram.utils.twidget.n0.v(this.K1, this.f18362w3));
            }
            return this.f18360u3;
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
