package kh;

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
import org.telegram.ui.Components.jp;
public final class v0 extends ImageView {
    public int f16182a;
    public FrameLayout f16183b;
    public boolean f16184c;
    public boolean d;
    public boolean f16185e;
    public jp f16186f;
    public w9 h;
    public u0 f16187n;
    public a8 f16188r;
    public s0 f16189s;
    public Uri v;
    public boolean f16190w;
    public boolean f16191x;

    public static void a(v0 v0Var) {
        w9 w9Var = v0Var.h;
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 23 && ((i9 <= 28 || BuildVars.NO_SCOPED_STORAGE) && v0Var.getContext().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0)) {
            Activity findActivity = AndroidUtilities.findActivity(v0Var.getContext());
            if (findActivity != null) {
                findActivity.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 113);
            }
        } else if (!v0Var.f16184c && v0Var.f16188r != null) {
            if (v0Var.v != null) {
                if (i9 >= 30) {
                    v0Var.getContext().getContentResolver().delete(v0Var.v, null);
                    v0Var.v = null;
                } else if (i9 < 29) {
                    try {
                        new File(v0Var.v.toString()).delete();
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                    v0Var.v = null;
                }
            }
            v0Var.f16184c = true;
            u0 u0Var = v0Var.f16187n;
            if (u0Var != null) {
                u0Var.a();
                v0Var.f16187n = null;
            }
            s0 s0Var = v0Var.f16189s;
            if (s0Var != null) {
                s0Var.a(true);
                v0Var.f16189s = null;
            }
            if (w9Var != null) {
                v0Var.f16185e = true;
                w9Var.run(new p0(v0Var, 0));
            }
            v0Var.d();
            if (w9Var == null) {
                v0Var.b();
            }
        }
    }

    public final void b() {
        a8 a8Var;
        if (this.f16185e && (a8Var = this.f16188r) != null) {
            this.f16185e = false;
            if (a8Var.E()) {
                this.d = true;
                u0 u0Var = new u0(getContext());
                this.f16187n = u0Var;
                u0Var.setOnCancelListener(new p0(this, 1));
                this.f16183b.addView(this.f16187n);
                File generateVideoPath = AndroidUtilities.generateVideoPath();
                this.f16189s = new s0(this.f16182a, this.f16188r, generateVideoPath, new q0(this, generateVideoPath, 0), new r0(this, 0), new p0(this, 2));
            } else {
                this.d = false;
                File generatePicturePath = AndroidUtilities.generatePicturePath(false, "png");
                if (generatePicturePath == null) {
                    this.f16187n.b(R.raw.error, 3500, LocaleController.getString("UnknownError"));
                    this.f16184c = false;
                    d();
                    return;
                }
                Utilities.themeQueue.postRunnable(new q0(this, generatePicturePath, 1));
            }
            d();
        }
    }

    public final void c(int i9, String str) {
        u0 u0Var = this.f16187n;
        if (u0Var != null) {
            u0Var.a();
            this.f16187n = null;
        }
        u0 u0Var2 = new u0(getContext());
        this.f16187n = u0Var2;
        u0Var2.b(i9, 3500, str);
        this.f16183b.addView(this.f16187n);
    }

    public final void d() {
        boolean z10;
        boolean z11;
        float f10;
        boolean z12;
        boolean z13 = this.f16190w;
        boolean z14 = this.f16184c;
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
            this.f16190w = z12;
            if (z12) {
                AndroidUtilities.updateImageViewImageAnimated(this, this.f16186f);
            } else {
                AndroidUtilities.updateImageViewImageAnimated(this, R.drawable.media_download);
            }
        }
        boolean z16 = this.f16191x;
        if (this.f16184c && this.d) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z16 != z11) {
            clearAnimation();
            ViewPropertyAnimator animate = animate();
            if (this.f16184c && this.d) {
                z15 = true;
            }
            this.f16191x = z15;
            if (z15) {
                f10 = 0.4f;
            } else {
                f10 = 1.0f;
            }
            animate.alpha(f10).start();
        }
    }

    public void setEntry(a8 a8Var) {
        this.v = null;
        this.f16188r = a8Var;
        s0 s0Var = this.f16189s;
        if (s0Var != null) {
            s0Var.a(true);
            this.f16189s = null;
        }
        u0 u0Var = this.f16187n;
        if (u0Var != null) {
            u0Var.a();
            this.f16187n = null;
        }
        if (a8Var == null) {
            this.f16184c = false;
            d();
        }
    }
}
