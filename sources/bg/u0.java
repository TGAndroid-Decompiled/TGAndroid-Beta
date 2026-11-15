package bg;

import android.view.View;
import android.view.Window;
import java.lang.ref.WeakReference;
import org.telegram.ui.LaunchActivity;
public final class u0 {
    public final int f3339a;
    public boolean f3340b;
    public boolean f3341c;
    public final Object d;

    public u0(Object obj, int i7) {
        this.f3339a = i7;
        this.d = obj;
    }

    public void a() {
        if (!this.f3340b) {
            this.f3340b = true;
            Runnable runnable = (Runnable) this.d;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public void b() {
        switch (this.f3339a) {
            case 0:
                c(false);
                this.f3341c = true;
                return;
            default:
                c(false);
                this.f3341c = true;
                return;
        }
    }

    public void c(boolean z10) {
        int i7;
        int i10;
        switch (this.f3339a) {
            case 0:
                v0 v0Var = (v0) this.d;
                if (this.f3340b != z10 && !this.f3341c) {
                    this.f3340b = z10;
                    boolean z11 = true;
                    if (z10) {
                        v0Var.f3347b++;
                    } else {
                        v0Var.f3347b--;
                    }
                    int i11 = 0;
                    if (v0Var.f3347b <= 0) {
                        z11 = false;
                    }
                    if (v0Var.f3346a != z11) {
                        v0Var.f3346a = z11;
                        Window window = (Window) ((WeakReference) ((a1.c) v0Var.f3348c).f38b).get();
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
                if (this.f3340b != z10 && !this.f3341c) {
                    this.f3340b = z10;
                    LaunchActivity launchActivity = (LaunchActivity) ((WeakReference) this.d).get();
                    if (launchActivity != null) {
                        int i12 = launchActivity.B1;
                        if (z10) {
                            i7 = 1;
                        } else {
                            i7 = -1;
                        }
                        int i13 = i12 + i7;
                        launchActivity.B1 = i13;
                        org.telegram.ui.k0 k0Var = launchActivity.f42661v0;
                        if (k0Var != null) {
                            if (i13 > 0) {
                                i10 = 8;
                            } else {
                                i10 = 0;
                            }
                            k0Var.setVisibility(i10);
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
        this.f3339a = 1;
        this.d = new WeakReference(launchActivity);
    }
}
