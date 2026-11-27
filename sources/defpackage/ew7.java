package defpackage;
public final class ew7 implements Runnable {
    public final byte a;
    public final wab b;

    public ew7(wab wabVar, byte b) {
        this.a = b;
        this.b = wabVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        wab wabVar = this.b;
        switch (b) {
            case 0:
                tw7 tw7Var = wabVar.Y1;
                if (tw7Var != null) {
                    tw7Var.J0();
                    return;
                }
                return;
            default:
                wabVar.o2.q1.setVisibility(8);
                return;
        }
    }
}
