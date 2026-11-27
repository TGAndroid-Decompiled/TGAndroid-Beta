package defpackage;
public final class ew7 implements Runnable {
    public final byte a;
    public final vab b;

    public ew7(vab vabVar, byte b) {
        this.a = b;
        this.b = vabVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        vab vabVar = this.b;
        switch (b) {
            case 0:
                tw7 tw7Var = vabVar.Y1;
                if (tw7Var != null) {
                    tw7Var.J0();
                    return;
                }
                return;
            default:
                vabVar.o2.q1.setVisibility(8);
                return;
        }
    }
}
