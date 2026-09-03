package kf;

import android.view.View;
import android.view.Window;
import java.lang.ref.WeakReference;
import org.telegram.ui.LaunchActivity;
public final class t0 implements s0 {
    public final int f10502a = 0;
    public boolean f10503b;
    public boolean f10504c;
    public final Object d;

    public t0(u0 u0Var) {
        this.d = u0Var;
    }

    @Override
    public final void a(boolean z4) {
        int i10;
        int i11;
        switch (this.f10502a) {
            case 0:
                u0 u0Var = (u0) this.d;
                if (this.f10503b != z4 && !this.f10504c) {
                    this.f10503b = z4;
                    boolean z10 = true;
                    if (z4) {
                        u0Var.f10508a++;
                    } else {
                        u0Var.f10508a--;
                    }
                    int i12 = 0;
                    if (u0Var.f10508a <= 0) {
                        z10 = false;
                    }
                    if (u0Var.f10509b != z10) {
                        u0Var.f10509b = z10;
                        Window window = (Window) ((WeakReference) u0Var.f10510c.f6605b).get();
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
                if (this.f10503b != z4 && !this.f10504c) {
                    this.f10503b = z4;
                    LaunchActivity launchActivity = (LaunchActivity) ((WeakReference) this.d).get();
                    if (launchActivity != null) {
                        int i13 = launchActivity.f31633x1;
                        if (z4) {
                            i10 = 1;
                        } else {
                            i10 = -1;
                        }
                        int i14 = i13 + i10;
                        launchActivity.f31633x1 = i14;
                        org.telegram.ui.n0 n0Var = launchActivity.f31624t0;
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
        switch (this.f10502a) {
            case 0:
                a(false);
                this.f10504c = true;
                return;
            default:
                a(false);
                this.f10504c = true;
                return;
        }
    }

    public t0(LaunchActivity launchActivity, boolean z4) {
        this.d = new WeakReference(launchActivity);
    }
}
