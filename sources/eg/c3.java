package eg;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.a11;
public final class c3 implements Runnable {
    public final int f5141a;
    public final o3 f5142b;

    public c3(o3 o3Var, int i10) {
        this.f5141a = i10;
        this.f5142b = o3Var;
    }

    @Override
    public final void run() {
        switch (this.f5141a) {
            case 0:
                o3 o3Var = this.f5142b;
                m3 m3Var = o3Var.T;
                if (m3Var != null) {
                    if (m3Var.f5371r != null) {
                        MediaController.getInstance().cancelVideoConvert(o3Var.T.f5371r);
                        FileLoader.getInstance(o3Var.f5400a).cancelFileUpload(o3Var.T.f5357b, false);
                        o3Var.T.getClass();
                    }
                    o3Var.T.a();
                    o3Var.T = null;
                }
                o3Var.f5401a0.a();
                o3Var.f5401a0 = null;
                return;
            default:
                o3 o3Var2 = this.f5142b;
                a11 a11Var = o3Var2.P;
                if (a11Var != null) {
                    o3Var2.P = null;
                    o3Var2.removeView(a11Var);
                    return;
                }
                return;
        }
    }
}
