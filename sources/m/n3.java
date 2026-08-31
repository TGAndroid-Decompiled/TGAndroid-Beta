package m;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
public final class n3 implements k1 {
    public Toolbar f13264a;
    public int f13265b;
    public View f13266c;
    public Drawable d;
    public Drawable f13267e;
    public Drawable f13268f;
    public boolean f13269g;
    public CharSequence h;
    public CharSequence f13270i;
    public CharSequence f13271j;
    public Window.Callback f13272k;
    public boolean f13273l;
    public h f13274m;
    public int f13275n;
    public Drawable f13276o;

    public final void a(int i10) {
        View view;
        Toolbar toolbar = this.f13264a;
        int i11 = this.f13265b ^ i10;
        this.f13265b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    b();
                }
                if ((this.f13265b & 4) != 0) {
                    Drawable drawable = this.f13268f;
                    if (drawable == null) {
                        drawable = this.f13276o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i11 & 3) != 0) {
                c();
            }
            if ((i11 & 8) != 0) {
                if ((i10 & 8) != 0) {
                    toolbar.setTitle(this.h);
                    toolbar.setSubtitle(this.f13270i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) != 0 && (view = this.f13266c) != null) {
                if ((i10 & 16) != 0) {
                    toolbar.addView(view);
                } else {
                    toolbar.removeView(view);
                }
            }
        }
    }

    public final void b() {
        Toolbar toolbar = this.f13264a;
        if ((this.f13265b & 4) != 0) {
            if (TextUtils.isEmpty(this.f13271j)) {
                toolbar.setNavigationContentDescription(this.f13275n);
            } else {
                toolbar.setNavigationContentDescription(this.f13271j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i10 = this.f13265b;
        if ((i10 & 2) != 0) {
            if ((i10 & 1) != 0) {
                drawable = this.f13267e;
                if (drawable == null) {
                    drawable = this.d;
                }
            } else {
                drawable = this.d;
            }
        } else {
            drawable = null;
        }
        this.f13264a.setLogo(drawable);
    }
}
