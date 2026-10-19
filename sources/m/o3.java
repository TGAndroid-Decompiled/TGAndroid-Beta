package m;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
public final class o3 implements l1 {
    public Toolbar f16275a;
    public int f16276b;
    public View f16277c;
    public Drawable d;
    public Drawable e;
    public Drawable f16278f;
    public boolean f16279g;
    public CharSequence h;
    public CharSequence f16280i;
    public CharSequence f16281j;
    public Window.Callback f16282k;
    public boolean f16283l;
    public i f16284m;
    public int f16285n;
    public Drawable f16286o;

    public final void a(int i10) {
        View view;
        Toolbar toolbar = this.f16275a;
        int i11 = this.f16276b ^ i10;
        this.f16276b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    b();
                }
                if ((this.f16276b & 4) != 0) {
                    Drawable drawable = this.f16278f;
                    if (drawable == null) {
                        drawable = this.f16286o;
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
                    toolbar.setSubtitle(this.f16280i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) != 0 && (view = this.f16277c) != null) {
                if ((i10 & 16) != 0) {
                    toolbar.addView(view);
                } else {
                    toolbar.removeView(view);
                }
            }
        }
    }

    public final void b() {
        Toolbar toolbar = this.f16275a;
        if ((this.f16276b & 4) != 0) {
            if (TextUtils.isEmpty(this.f16281j)) {
                toolbar.setNavigationContentDescription(this.f16285n);
            } else {
                toolbar.setNavigationContentDescription(this.f16281j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i10 = this.f16276b;
        if ((i10 & 2) != 0) {
            if ((i10 & 1) != 0) {
                drawable = this.e;
                if (drawable == null) {
                    drawable = this.d;
                }
            } else {
                drawable = this.d;
            }
        } else {
            drawable = null;
        }
        this.f16275a.setLogo(drawable);
    }
}
