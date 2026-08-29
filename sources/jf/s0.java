package jf;

import android.view.View;
import android.view.Window;
import java.lang.ref.WeakReference;
import org.telegram.ui.LaunchActivity;
public final class s0 implements r0 {
    public final int f11674a = 0;
    public boolean f11675b;
    public boolean f11676c;
    public final Object d;

    public s0(t0 t0Var) {
        this.d = t0Var;
    }

    @Override
    public final void a(boolean z10) {
        int i10;
        int i11;
        switch (this.f11674a) {
            case 0:
                t0 t0Var = (t0) this.d;
                if (this.f11675b != z10 && !this.f11676c) {
                    this.f11675b = z10;
                    boolean z11 = true;
                    if (z10) {
                        t0Var.f11677a++;
                    } else {
                        t0Var.f11677a--;
                    }
                    int i12 = 0;
                    if (t0Var.f11677a <= 0) {
                        z11 = false;
                    }
                    if (t0Var.f11678b != z11) {
                        t0Var.f11678b = z11;
                        Window window = (Window) ((WeakReference) t0Var.f11679c.f6096b).get();
                        if (window != null) {
                            View decorView = window.getDecorView();
                            if (z11) {
                                i12 = 8;
                            }
                            decorView.setVisibility(i12);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                if (this.f11675b != z10 && !this.f11676c) {
                    this.f11675b = z10;
                    LaunchActivity launchActivity = (LaunchActivity) ((WeakReference) this.d).get();
                    if (launchActivity != null) {
                        int i13 = launchActivity.f35606w1;
                        if (z10) {
                            i10 = 1;
                        } else {
                            i10 = -1;
                        }
                        int i14 = i13 + i10;
                        launchActivity.f35606w1 = i14;
                        org.telegram.ui.n0 n0Var = launchActivity.f35597s0;
                        if (n0Var != null) {
                            if (i14 > 0) {
                                i11 = 8;
                            } else {
                                i11 = 0;
                            }
                            n0Var.setVisibility(i11);
                        }
                        launchActivity.getWindow();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void destroy() {
        switch (this.f11674a) {
            case 0:
                a(false);
                this.f11676c = true;
                return;
            default:
                a(false);
                this.f11676c = true;
                return;
        }
    }

    public s0(LaunchActivity launchActivity, boolean z10) {
        this.d = new WeakReference(launchActivity);
    }
}
