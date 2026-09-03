package dg;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.a11;
public final class e3 implements Runnable {
    public final int f4504a;
    public final q3 f4505b;

    public e3(q3 q3Var, int i10) {
        this.f4504a = i10;
        this.f4505b = q3Var;
    }

    @Override
    public final void run() {
        switch (this.f4504a) {
            case 0:
                q3 q3Var = this.f4505b;
                o3 o3Var = q3Var.T;
                if (o3Var != null) {
                    if (o3Var.f4717r != null) {
                        MediaController.getInstance().cancelVideoConvert(q3Var.T.f4717r);
                        FileLoader.getInstance(q3Var.f4744a).cancelFileUpload(q3Var.T.f4704b, false);
                        q3Var.T.getClass();
                    }
                    q3Var.T.a();
                    q3Var.T = null;
                }
                q3Var.f4745a0.a();
                q3Var.f4745a0 = null;
                return;
            default:
                q3 q3Var2 = this.f4505b;
                a11 a11Var = q3Var2.P;
                if (a11Var != null) {
                    q3Var2.P = null;
                    q3Var2.removeView(a11Var);
                    return;
                }
                return;
        }
    }
}
