package bg;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.p01;
public final class i3 implements Runnable {
    public final int f2322a;
    public final u3 f2323b;

    public i3(u3 u3Var, int i10) {
        this.f2322a = i10;
        this.f2323b = u3Var;
    }

    @Override
    public final void run() {
        switch (this.f2322a) {
            case 0:
                u3 u3Var = this.f2323b;
                s3 s3Var = u3Var.S;
                if (s3Var != null) {
                    if (s3Var.f2525r != null) {
                        MediaController.getInstance().cancelVideoConvert(u3Var.S.f2525r);
                        FileLoader.getInstance(u3Var.f2550a).cancelFileUpload(u3Var.S.f2511b, false);
                        u3Var.S.getClass();
                    }
                    u3Var.S.a();
                    u3Var.S = null;
                }
                u3Var.W.a();
                u3Var.W = null;
                return;
            default:
                u3 u3Var2 = this.f2323b;
                p01 p01Var = u3Var2.O;
                if (p01Var != null) {
                    u3Var2.O = null;
                    u3Var2.removeView(p01Var);
                    return;
                }
                return;
        }
    }
}
