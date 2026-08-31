package lf;

import android.view.View;
import android.view.Window;
import java.lang.ref.WeakReference;
import org.telegram.ui.LaunchActivity;
public final class s0 implements r0 {
    public final int f12510a = 0;
    public boolean f12511b;
    public boolean f12512c;
    public final Object d;

    public s0(t0 t0Var) {
        this.d = t0Var;
    }

    @Override
    public final void a(boolean z4) {
        int i10;
        int i11;
        switch (this.f12510a) {
            case 0:
                t0 t0Var = (t0) this.d;
                if (this.f12511b != z4 && !this.f12512c) {
                    this.f12511b = z4;
                    boolean z10 = true;
                    if (z4) {
                        t0Var.f12513a++;
                    } else {
                        t0Var.f12513a--;
                    }
                    int i12 = 0;
                    if (t0Var.f12513a <= 0) {
                        z10 = false;
                    }
                    if (t0Var.f12514b != z10) {
                        t0Var.f12514b = z10;
                        Window window = (Window) ((WeakReference) t0Var.f12515c.f7462b).get();
                        if (window != null) {
                            View decorView = window.getDecorView();
                            if (z10) {
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
                if (this.f12511b != z4 && !this.f12512c) {
                    this.f12511b = z4;
                    LaunchActivity launchActivity = (LaunchActivity) ((WeakReference) this.d).get();
                    if (launchActivity != null) {
                        int i13 = launchActivity.f34181x1;
                        if (z4) {
                            i10 = 1;
                        } else {
                            i10 = -1;
                        }
                        int i14 = i13 + i10;
                        launchActivity.f34181x1 = i14;
                        org.telegram.ui.l0 l0Var = launchActivity.f34172t0;
                        if (l0Var != null) {
                            if (i14 > 0) {
                                i11 = 8;
                            } else {
                                i11 = 0;
                            }
                            l0Var.setVisibility(i11);
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
        switch (this.f12510a) {
            case 0:
                a(false);
                this.f12512c = true;
                return;
            default:
                a(false);
                this.f12512c = true;
                return;
        }
    }

    public s0(LaunchActivity launchActivity, boolean z4) {
        this.d = new WeakReference(launchActivity);
    }
}
