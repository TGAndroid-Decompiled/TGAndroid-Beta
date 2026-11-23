package bg;

import android.view.View;
import android.view.Window;
import java.lang.ref.WeakReference;
import org.telegram.ui.LaunchActivity;
public final class v0 {
    public final int f3317a = 0;
    public boolean f3318b;
    public boolean f3319c;
    public final Object d;

    public v0(w0 w0Var) {
        this.d = w0Var;
    }

    public final void a() {
        switch (this.f3317a) {
            case 0:
                b(false);
                this.f3319c = true;
                return;
            default:
                b(false);
                this.f3319c = true;
                return;
        }
    }

    public final void b(boolean z10) {
        int i7;
        int i10;
        switch (this.f3317a) {
            case 0:
                w0 w0Var = (w0) this.d;
                if (this.f3318b != z10 && !this.f3319c) {
                    this.f3318b = z10;
                    boolean z11 = true;
                    if (z10) {
                        w0Var.f3325b++;
                    } else {
                        w0Var.f3325b--;
                    }
                    int i11 = 0;
                    if (w0Var.f3325b <= 0) {
                        z11 = false;
                    }
                    if (w0Var.f3324a != z11) {
                        w0Var.f3324a = z11;
                        Window window = (Window) ((WeakReference) ((a1.c) w0Var.f3326c).f38b).get();
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
                if (this.f3318b != z10 && !this.f3319c) {
                    this.f3318b = z10;
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
                        org.telegram.ui.k0 k0Var = launchActivity.f43226v0;
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

    public v0(LaunchActivity launchActivity, boolean z10) {
        this.d = new WeakReference(launchActivity);
    }
}
