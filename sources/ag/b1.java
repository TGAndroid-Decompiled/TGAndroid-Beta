package ag;

import android.view.View;
import android.view.Window;
import java.lang.ref.WeakReference;
import org.telegram.ui.LaunchActivity;
public final class b1 implements a1 {
    public final int f1254a;
    public boolean f1255b;
    public boolean f1256c;
    public final Object d;

    public b1(Object obj, int i10) {
        this.f1254a = i10;
        this.d = obj;
    }

    @Override
    public void a(boolean z10) {
        int i10;
        int i11;
        switch (this.f1254a) {
            case 0:
                c1 c1Var = (c1) this.d;
                if (this.f1255b != z10 && !this.f1256c) {
                    this.f1255b = z10;
                    boolean z11 = true;
                    if (z10) {
                        c1Var.f1258a++;
                    } else {
                        c1Var.f1258a--;
                    }
                    int i12 = 0;
                    if (c1Var.f1258a <= 0) {
                        z11 = false;
                    }
                    if (c1Var.f1259b != z11) {
                        c1Var.f1259b = z11;
                        Window window = (Window) ((WeakReference) c1Var.f1260c.f35b).get();
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
                if (this.f1255b != z10 && !this.f1256c) {
                    this.f1255b = z10;
                    LaunchActivity launchActivity = (LaunchActivity) ((WeakReference) this.d).get();
                    if (launchActivity != null) {
                        int i13 = launchActivity.C1;
                        if (z10) {
                            i10 = 1;
                        } else {
                            i10 = -1;
                        }
                        int i14 = i13 + i10;
                        launchActivity.C1 = i14;
                        org.telegram.ui.k0 k0Var = launchActivity.f35589w0;
                        if (k0Var != null) {
                            if (i14 > 0) {
                                i11 = 8;
                            } else {
                                i11 = 0;
                            }
                            k0Var.setVisibility(i11);
                        }
                        launchActivity.getWindow();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public void b() {
        if (!this.f1255b) {
            this.f1255b = true;
            Runnable runnable = (Runnable) this.d;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    @Override
    public void destroy() {
        switch (this.f1254a) {
            case 0:
                a(false);
                this.f1256c = true;
                return;
            default:
                a(false);
                this.f1256c = true;
                return;
        }
    }

    public b1(LaunchActivity launchActivity, boolean z10) {
        this.f1254a = 1;
        this.d = new WeakReference(launchActivity);
    }
}
