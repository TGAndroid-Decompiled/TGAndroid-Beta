package cg;

import android.view.View;
import android.view.Window;
import java.lang.ref.WeakReference;
import org.telegram.ui.LaunchActivity;
public final class u0 {
    public final int f4753a;
    public boolean f4754b;
    public boolean f4755c;
    public final Object d;

    public u0(Object obj, int i3) {
        this.f4753a = i3;
        this.d = obj;
    }

    public void a() {
        if (!this.f4754b) {
            this.f4754b = true;
            Runnable runnable = (Runnable) this.d;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public void b() {
        switch (this.f4753a) {
            case 0:
                c(false);
                this.f4755c = true;
                return;
            default:
                c(false);
                this.f4755c = true;
                return;
        }
    }

    public void c(boolean z10) {
        int i3;
        int i10;
        switch (this.f4753a) {
            case 0:
                v0 v0Var = (v0) this.d;
                if (this.f4754b != z10 && !this.f4755c) {
                    this.f4754b = z10;
                    boolean z11 = true;
                    if (z10) {
                        v0Var.f4758b++;
                    } else {
                        v0Var.f4758b--;
                    }
                    int i11 = 0;
                    if (v0Var.f4758b <= 0) {
                        z11 = false;
                    }
                    if (v0Var.f4757a != z11) {
                        v0Var.f4757a = z11;
                        Window window = (Window) ((WeakReference) ((a1.c) v0Var.f4759c).f39b).get();
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
                if (this.f4754b != z10 && !this.f4755c) {
                    this.f4754b = z10;
                    LaunchActivity launchActivity = (LaunchActivity) ((WeakReference) this.d).get();
                    if (launchActivity != null) {
                        int i12 = launchActivity.D1;
                        if (z10) {
                            i3 = 1;
                        } else {
                            i3 = -1;
                        }
                        int i13 = i12 + i3;
                        launchActivity.D1 = i13;
                        org.telegram.ui.l0 l0Var = launchActivity.f41326x0;
                        if (l0Var != null) {
                            if (i13 > 0) {
                                i10 = 8;
                            } else {
                                i10 = 0;
                            }
                            l0Var.setVisibility(i10);
                        }
                        launchActivity.getWindow();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public u0(LaunchActivity launchActivity, boolean z10) {
        this.f4753a = 1;
        this.d = new WeakReference(launchActivity);
    }
}
