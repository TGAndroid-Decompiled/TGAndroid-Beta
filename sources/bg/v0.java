package bg;

import android.view.View;
import android.view.Window;
import java.lang.ref.WeakReference;
import org.telegram.ui.LaunchActivity;
public final class v0 {
    public final int f3388a;
    public boolean f3389b;
    public boolean f3390c;
    public final Object d;

    public v0(Object obj, int i7) {
        this.f3388a = i7;
        this.d = obj;
    }

    public void a() {
        if (!this.f3389b) {
            this.f3389b = true;
            Runnable runnable = (Runnable) this.d;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public void b() {
        switch (this.f3388a) {
            case 0:
                c(false);
                this.f3390c = true;
                return;
            default:
                c(false);
                this.f3390c = true;
                return;
        }
    }

    public void c(boolean z9) {
        int i7;
        int i10;
        switch (this.f3388a) {
            case 0:
                w0 w0Var = (w0) this.d;
                if (this.f3389b != z9 && !this.f3390c) {
                    this.f3389b = z9;
                    boolean z10 = true;
                    if (z9) {
                        w0Var.f3393b++;
                    } else {
                        w0Var.f3393b--;
                    }
                    int i11 = 0;
                    if (w0Var.f3393b <= 0) {
                        z10 = false;
                    }
                    if (w0Var.f3392a != z10) {
                        w0Var.f3392a = z10;
                        Window window = (Window) ((WeakReference) ((a1.c) w0Var.f3394c).f38b).get();
                        if (window != null) {
                            View decorView = window.getDecorView();
                            if (z10) {
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
                if (this.f3389b != z9 && !this.f3390c) {
                    this.f3389b = z9;
                    LaunchActivity launchActivity = (LaunchActivity) ((WeakReference) this.d).get();
                    if (launchActivity != null) {
                        int i12 = launchActivity.A1;
                        if (z9) {
                            i7 = 1;
                        } else {
                            i7 = -1;
                        }
                        int i13 = i12 + i7;
                        launchActivity.A1 = i13;
                        org.telegram.ui.k0 k0Var = launchActivity.f41291u0;
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

    public v0(LaunchActivity launchActivity, boolean z9) {
        this.f3388a = 1;
        this.d = new WeakReference(launchActivity);
    }
}
