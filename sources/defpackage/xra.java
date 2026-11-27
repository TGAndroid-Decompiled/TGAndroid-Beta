package defpackage;

import org.telegram.tgnet.tl.TL_stars;
public final class xra implements Runnable {
    public final byte a;
    public final bxa b;
    public final TL_stars.TL_starGiftUnique c;

    public xra(bxa bxaVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, byte b) {
        this.a = b;
        this.b = bxaVar;
        this.c = tL_starGiftUnique;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = this.c;
        bxa bxaVar = this.b;
        switch (b) {
            case 0:
                if (bxaVar instanceof ed9) {
                    ((ed9) bxaVar).q(tL_starGiftUnique);
                    return;
                }
                return;
            default:
                if (bxaVar instanceof ed9) {
                    ((ed9) bxaVar).q(tL_starGiftUnique);
                    return;
                }
                return;
        }
    }
}
