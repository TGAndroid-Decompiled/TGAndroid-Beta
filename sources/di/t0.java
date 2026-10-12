package di;

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
import org.telegram.ui.Components.gq;
public final class t0 extends ImageView {
    public int f7812a;
    public FrameLayout f7813b;
    public boolean f7814c;
    public boolean d;
    public boolean e;
    public gq f7815f;
    public ha h;
    public s0 f7816n;
    public k8 f7817r;
    public q0 f7818s;
    public Uri v;
    public boolean f7819w;
    public boolean f7820x;

    public static void a(t0 t0Var) {
        ha haVar = t0Var.h;
        int i10 = Build.VERSION.SDK_INT;
        if ((i10 <= 28 || BuildVars.NO_SCOPED_STORAGE) && t0Var.getContext().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            Activity findActivity = AndroidUtilities.findActivity(t0Var.getContext());
            if (findActivity != null) {
                findActivity.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 113);
            }
        } else if (!t0Var.f7814c && t0Var.f7817r != null) {
            if (t0Var.v != null) {
                if (i10 >= 30) {
                    t0Var.getContext().getContentResolver().delete(t0Var.v, null);
                    t0Var.v = null;
                } else if (i10 < 29) {
                    try {
                        new File(t0Var.v.toString()).delete();
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    t0Var.v = null;
                }
            }
            t0Var.f7814c = true;
            s0 s0Var = t0Var.f7816n;
            if (s0Var != null) {
                s0Var.a();
                t0Var.f7816n = null;
            }
            q0 q0Var = t0Var.f7818s;
            if (q0Var != null) {
                q0Var.a(true);
                t0Var.f7818s = null;
            }
            if (haVar != null) {
                t0Var.e = true;
                haVar.run(new n0(t0Var, 0));
            }
            t0Var.d();
            if (haVar == null) {
                t0Var.b();
            }
        }
    }

    public final void b() {
        k8 k8Var;
        if (this.e && (k8Var = this.f7817r) != null) {
            this.e = false;
            if (k8Var.E()) {
                this.d = true;
                s0 s0Var = new s0(getContext());
                this.f7816n = s0Var;
                s0Var.setOnCancelListener(new n0(this, 1));
                this.f7813b.addView(this.f7816n);
                File generateVideoPath = AndroidUtilities.generateVideoPath();
                this.f7818s = new q0(this.f7812a, this.f7817r, generateVideoPath, new o0(this, generateVideoPath, 0), new p0(this, 0), new n0(this, 2));
            } else {
                this.d = false;
                File generatePicturePath = AndroidUtilities.generatePicturePath(false, "png");
                if (generatePicturePath == null) {
                    this.f7816n.b(R.raw.error, 3500, LocaleController.getString("UnknownError"));
                    this.f7814c = false;
                    d();
                    return;
                }
                Utilities.themeQueue.postRunnable(new o0(this, generatePicturePath, 1));
            }
            d();
        }
    }

    public final void c(int i10, String str) {
        s0 s0Var = this.f7816n;
        if (s0Var != null) {
            s0Var.a();
            this.f7816n = null;
        }
        s0 s0Var2 = new s0(getContext());
        this.f7816n = s0Var2;
        s0Var2.b(i10, 3500, str);
        this.f7813b.addView(this.f7816n);
    }

    public final void d() {
        boolean z10;
        boolean z11;
        float f7;
        boolean z12;
        boolean z13 = this.f7819w;
        boolean z14 = this.f7814c;
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
            this.f7819w = z12;
            if (z12) {
                AndroidUtilities.updateImageViewImageAnimated(this, this.f7815f);
            } else {
                AndroidUtilities.updateImageViewImageAnimated(this, R.drawable.media_download);
            }
        }
        boolean z16 = this.f7820x;
        if (this.f7814c && this.d) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z16 != z11) {
            clearAnimation();
            ViewPropertyAnimator animate = animate();
            if (this.f7814c && this.d) {
                z15 = true;
            }
            this.f7820x = z15;
            if (z15) {
                f7 = 0.4f;
            } else {
                f7 = 1.0f;
            }
            animate.alpha(f7).start();
        }
    }

    public void setEntry(k8 k8Var) {
        this.v = null;
        this.f7817r = k8Var;
        q0 q0Var = this.f7818s;
        if (q0Var != null) {
            q0Var.a(true);
            this.f7818s = null;
        }
        s0 s0Var = this.f7816n;
        if (s0Var != null) {
            s0Var.a();
            this.f7816n = null;
        }
        if (k8Var == null) {
            this.f7814c = false;
            d();
        }
    }
}
