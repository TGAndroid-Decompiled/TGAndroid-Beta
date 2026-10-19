package ei;

import android.app.Activity;
import android.net.Uri;
import android.os.Build;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.dq;
public final class u0 extends ImageView {
    public int f9876a;
    public FrameLayout f9877b;
    public boolean f9878c;
    public boolean d;
    public boolean e;
    public dq f9879f;
    public u9 h;
    public t0 f9880n;
    public a8 f9881r;
    public r0 f9882s;
    public Uri v;
    public boolean f9883w;
    public boolean f9884x;

    public static void a(u0 u0Var) {
        u9 u9Var = u0Var.h;
        int i10 = Build.VERSION.SDK_INT;
        if ((i10 <= 28 || BuildVars.NO_SCOPED_STORAGE) && u0Var.getContext().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            Activity findActivity = AndroidUtilities.findActivity(u0Var.getContext());
            if (findActivity != null) {
                findActivity.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 113);
            }
        } else if (!u0Var.f9878c && u0Var.f9881r != null) {
            if (u0Var.v != null) {
                if (i10 >= 30) {
                    u0Var.getContext().getContentResolver().delete(u0Var.v, null);
                    u0Var.v = null;
                } else if (i10 < 29) {
                    try {
                        new File(u0Var.v.toString()).delete();
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    u0Var.v = null;
                }
            }
            u0Var.f9878c = true;
            t0 t0Var = u0Var.f9880n;
            if (t0Var != null) {
                t0Var.a();
                u0Var.f9880n = null;
            }
            r0 r0Var = u0Var.f9882s;
            if (r0Var != null) {
                r0Var.a(true);
                u0Var.f9882s = null;
            }
            if (u9Var != null) {
                u0Var.e = true;
                u9Var.run(new o0(u0Var, 0));
            }
            u0Var.d();
            if (u9Var == null) {
                u0Var.b();
            }
        }
    }

    public final void b() {
        a8 a8Var;
        if (this.e && (a8Var = this.f9881r) != null) {
            this.e = false;
            if (a8Var.E()) {
                this.d = true;
                t0 t0Var = new t0(getContext());
                this.f9880n = t0Var;
                t0Var.setOnCancelListener(new o0(this, 1));
                this.f9877b.addView(this.f9880n);
                File generateVideoPath = AndroidUtilities.generateVideoPath();
                this.f9882s = new r0(this.f9876a, this.f9881r, generateVideoPath, new p0(this, generateVideoPath, 0), new q0(this, 0), new o0(this, 2));
            } else {
                this.d = false;
                File generatePicturePath = AndroidUtilities.generatePicturePath(false, "png");
                if (generatePicturePath == null) {
                    this.f9880n.b(R.raw.error, 3500, LocaleController.getString("UnknownError"));
                    this.f9878c = false;
                    d();
                    return;
                }
                Utilities.themeQueue.postRunnable(new p0(this, generatePicturePath, 1));
            }
            d();
        }
    }

    public final void c(int i10, String str) {
        t0 t0Var = this.f9880n;
        if (t0Var != null) {
            t0Var.a();
            this.f9880n = null;
        }
        t0 t0Var2 = new t0(getContext());
        this.f9880n = t0Var2;
        t0Var2.b(i10, 3500, str);
        this.f9877b.addView(this.f9880n);
    }

    public final void d() {
        boolean z10;
        boolean z11;
        float f7;
        boolean z12;
        boolean z13 = this.f9883w;
        boolean z14 = this.f9878c;
        boolean z15 = false;
        if (z14 && !this.d) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z13 != z10) {
            if (z14 && !this.d) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f9883w = z12;
            if (z12) {
                AndroidUtilities.updateImageViewImageAnimated(this, this.f9879f);
            } else {
                AndroidUtilities.updateImageViewImageAnimated(this, R.drawable.media_download);
            }
        }
        boolean z16 = this.f9884x;
        if (this.f9878c && this.d) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z16 != z11) {
            clearAnimation();
            ViewPropertyAnimator animate = animate();
            if (this.f9878c && this.d) {
                z15 = true;
            }
            this.f9884x = z15;
            if (z15) {
                f7 = 0.4f;
            } else {
                f7 = 1.0f;
            }
            animate.alpha(f7).start();
        }
    }

    public void setEntry(a8 a8Var) {
        this.v = null;
        this.f9881r = a8Var;
        r0 r0Var = this.f9882s;
        if (r0Var != null) {
            r0Var.a(true);
            this.f9882s = null;
        }
        t0 t0Var = this.f9880n;
        if (t0Var != null) {
            t0Var.a();
            this.f9880n = null;
        }
        if (a8Var == null) {
            this.f9878c = false;
            d();
        }
    }
}
