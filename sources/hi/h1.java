package hi;

import org.telegram.messenger.ij;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class h1 extends ij {
    public TL_iv.RichMessage f14692s3;
    public final boolean f14693t3;
    public final TLRPC.BotInlineResult f14694u3;

    public h1(int i7, TLRPC.TL_message tL_message, boolean z9, TLRPC.BotInlineResult botInlineResult) {
        super(i7, tL_message, true, true);
        this.f14693t3 = z9;
        this.f14694u3 = botInlineResult;
    }

    @Override
    public final TL_iv.RichMessage E0() {
        if (this.f14693t3) {
            if (this.f14692s3 == null) {
                this.f14692s3 = org.telegram.utils.twidget.n0.o(org.telegram.utils.twidget.n0.v(this.I1, this.f14694u3));
            }
            return this.f14692s3;
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
