package m;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
public final class k3 implements k1 {
    public Toolbar f19734a;
    public int f19735b;
    public View f19736c;
    public Drawable d;
    public Drawable f19737e;
    public Drawable f19738f;
    public boolean f19739g;
    public CharSequence h;
    public CharSequence f19740i;
    public CharSequence f19741j;
    public Window.Callback f19742k;
    public boolean f19743l;
    public h f19744m;
    public int f19745n;
    public Drawable f19746o;

    public final void a(int i7) {
        View view;
        Toolbar toolbar = this.f19734a;
        int i10 = this.f19735b ^ i7;
        this.f19735b = i7;
        if (i10 != 0) {
            if ((i10 & 4) != 0) {
                if ((i7 & 4) != 0) {
                    b();
                }
                if ((this.f19735b & 4) != 0) {
                    Drawable drawable = this.f19738f;
                    if (drawable == null) {
                        drawable = this.f19746o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i10 & 3) != 0) {
                c();
            }
            if ((i10 & 8) != 0) {
                if ((i7 & 8) != 0) {
                    toolbar.setTitle(this.h);
                    toolbar.setSubtitle(this.f19740i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i10 & 16) != 0 && (view = this.f19736c) != null) {
                if ((i7 & 16) != 0) {
                    toolbar.addView(view);
                } else {
                    toolbar.removeView(view);
                }
            }
        }
    }

    public final void b() {
        Toolbar toolbar = this.f19734a;
        if ((this.f19735b & 4) != 0) {
            if (TextUtils.isEmpty(this.f19741j)) {
                toolbar.setNavigationContentDescription(this.f19745n);
            } else {
                toolbar.setNavigationContentDescription(this.f19741j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i7 = this.f19735b;
        if ((i7 & 2) != 0) {
            if ((i7 & 1) != 0) {
                drawable = this.f19737e;
                if (drawable == null) {
                    drawable = this.d;
                }
            } else {
                drawable = this.d;
            }
        } else {
            drawable = null;
        }
        this.f19734a.setLogo(drawable);
    }
}
