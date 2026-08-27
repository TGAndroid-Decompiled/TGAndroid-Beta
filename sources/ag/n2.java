package ag;

import org.telegram.messenger.MessagesController;

public final class n2 implements Runnable {

    public final int f573a;

    public final y2 f574b;

    public n2(y2 y2Var, int i10) {
        this.f573a = i10;
        this.f574b = y2Var;
    }

    @Override
    public final void run() {
        switch (this.f573a) {
            case 0:
                y2 y2Var = this.f574b;
                we.e.s(y2Var.getContext(), "https://" + MessagesController.getInstance(y2Var.U).linkPrefix + "/nft/" + y2Var.f732z0.slug);
                break;
            case 1:
                y2 y2Var2 = this.f574b;
                try {
                    y2Var2.container.performHapticFeedback(3, 2);
                    break;
                } catch (Exception unused) {
                }
                y2Var2.f718k0.c(y2Var2.G0);
                break;
            default:
                this.f574b.K0[0].setVisibility(8);
                break;
        }
    }
}
