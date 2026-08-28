package ff;

import android.view.View;
import android.view.Window;
import java.lang.ref.WeakReference;
import org.telegram.ui.LaunchActivity;
public final class t0 implements s0 {
    public final int f6260a = 0;
    public boolean f6261b;
    public boolean f6262c;
    public final Object d;

    public t0(u0 u0Var) {
        this.d = u0Var;
    }

    @Override
    public final void a(boolean z10) {
        int i9;
        int i10;
        switch (this.f6260a) {
            case 0:
                u0 u0Var = (u0) this.d;
                if (this.f6261b != z10 && !this.f6262c) {
                    this.f6261b = z10;
                    boolean z11 = true;
                    if (z10) {
                        u0Var.f6263a++;
                    } else {
                        u0Var.f6263a--;
                    }
                    int i11 = 0;
                    if (u0Var.f6263a <= 0) {
                        z11 = false;
                    }
                    if (u0Var.f6264b != z11) {
                        u0Var.f6264b = z11;
                        Window window = (Window) ((WeakReference) u0Var.f6265c.f35b).get();
                        if (window != null) {
                            View decorView = window.getDecorView();
                            if (z11) {
                                i11 = 8;
                            }
                            decorView.setVisibility(i11);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                if (this.f6261b != z10 && !this.f6262c) {
                    this.f6261b = z10;
                    LaunchActivity launchActivity = (LaunchActivity) ((WeakReference) this.d).get();
                    if (launchActivity != null) {
                        int i12 = launchActivity.f35539w1;
                        if (z10) {
                            i9 = 1;
                        } else {
                            i9 = -1;
                        }
                        int i13 = i12 + i9;
                        launchActivity.f35539w1 = i13;
                        org.telegram.ui.m0 m0Var = launchActivity.f35530s0;
                        if (m0Var != null) {
                            if (i13 > 0) {
                                i10 = 8;
                            } else {
                                i10 = 0;
                            }
                            m0Var.setVisibility(i10);
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
        switch (this.f6260a) {
            case 0:
                a(false);
                this.f6262c = true;
                return;
            default:
                a(false);
                this.f6262c = true;
                return;
        }
    }

    public t0(LaunchActivity launchActivity, boolean z10) {
        this.d = new WeakReference(launchActivity);
    }
}
