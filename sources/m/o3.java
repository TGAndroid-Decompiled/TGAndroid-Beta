package m;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
public final class o3 implements l1 {
    public Toolbar f16277a;
    public int f16278b;
    public View f16279c;
    public Drawable d;
    public Drawable e;
    public Drawable f16280f;
    public boolean f16281g;
    public CharSequence h;
    public CharSequence f16282i;
    public CharSequence f16283j;
    public Window.Callback f16284k;
    public boolean f16285l;
    public i f16286m;
    public int f16287n;
    public Drawable f16288o;

    public final void a(int i10) {
        View view;
        Toolbar toolbar = this.f16277a;
        int i11 = this.f16278b ^ i10;
        this.f16278b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    b();
                }
                if ((this.f16278b & 4) != 0) {
                    Drawable drawable = this.f16280f;
                    if (drawable == null) {
                        drawable = this.f16288o;
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
                    toolbar.setSubtitle(this.f16282i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) != 0 && (view = this.f16279c) != null) {
                if ((i10 & 16) != 0) {
                    toolbar.addView(view);
                } else {
                    toolbar.removeView(view);
                }
            }
        }
    }

    public final void b() {
        Toolbar toolbar = this.f16277a;
        if ((this.f16278b & 4) != 0) {
            if (TextUtils.isEmpty(this.f16283j)) {
                toolbar.setNavigationContentDescription(this.f16287n);
            } else {
                toolbar.setNavigationContentDescription(this.f16283j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i10 = this.f16278b;
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
        this.f16277a.setLogo(drawable);
    }
}
