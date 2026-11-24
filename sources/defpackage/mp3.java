package defpackage;

import android.view.ViewGroup;
public final class mp3 implements Runnable {
    public final byte a;
    public final np3 b;

    public mp3(np3 np3Var, byte b) {
        this.a = b;
        this.b = np3Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        np3 np3Var = this.b;
        switch (b) {
            case 0:
                if (np3Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) np3Var.getParent()).removeView(np3Var);
                    return;
                }
                return;
            default:
                np3Var.a();
                return;
        }
    }
}
