package gf;

import android.view.Window;
import java.lang.ref.WeakReference;
import org.telegram.ui.LaunchActivity;

public final class t0 implements s0 {

    public final int f7060a = 0;

    public boolean f7061b;

    public boolean f7062c;
    public final Object d;

    public t0(u0 u0Var) {
        this.d = u0Var;
    }

    @Override
    public final void a(boolean z10) {
        switch (this.f7060a) {
            case 0:
                u0 u0Var = (u0) this.d;
                if (this.f7061b != z10 && !this.f7062c) {
                    this.f7061b = z10;
                    if (z10) {
                        u0Var.f7063a++;
                    } else {
                        u0Var.f7063a--;
                    }
                    boolean z11 = u0Var.f7063a > 0;
                    if (u0Var.f7064b != z11) {
                        u0Var.f7064b = z11;
                        Window window = (Window) ((WeakReference) u0Var.f7065c.f35b).get();
                        if (window != null) {
                            window.getDecorView().setVisibility(z11 ? 8 : 0);
                        }
                    }
                    break;
                }
                break;
            default:
                if (this.f7061b != z10 && !this.f7062c) {
                    this.f7061b = z10;
                    LaunchActivity launchActivity = (LaunchActivity) ((WeakReference) this.d).get();
                    if (launchActivity != null) {
                        int i10 = launchActivity.f35542w1 + (z10 ? 1 : -1);
                        launchActivity.f35542w1 = i10;
                        org.telegram.ui.n0 n0Var = launchActivity.f35533s0;
                        if (n0Var != null) {
                            n0Var.setVisibility(i10 > 0 ? 8 : 0);
                        }
                        launchActivity.getWindow();
                    }
                    break;
                }
                break;
        }
    }

    @Override
    public final void destroy() {
        switch (this.f7060a) {
            case 0:
                a(false);
                this.f7062c = true;
                break;
            default:
                a(false);
                this.f7062c = true;
                break;
        }
    }

    public t0(LaunchActivity launchActivity, boolean z10) {
        this.d = new WeakReference(launchActivity);
    }
}
