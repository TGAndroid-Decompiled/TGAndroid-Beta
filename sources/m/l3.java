package m;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
public final class l3 implements k1 {
    public Toolbar f15785a;
    public int f15786b;
    public View f15787c;
    public Drawable d;
    public Drawable f15788e;
    public Drawable f15789f;
    public boolean f15790g;
    public CharSequence h;
    public CharSequence f15791i;
    public CharSequence f15792j;
    public Window.Callback f15793k;
    public boolean f15794l;
    public h f15795m;
    public int f15796n;
    public Drawable f15797o;

    public final void a(int i10) {
        View view;
        Toolbar toolbar = this.f15785a;
        int i11 = this.f15786b ^ i10;
        this.f15786b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    b();
                }
                if ((this.f15786b & 4) != 0) {
                    Drawable drawable = this.f15789f;
                    if (drawable == null) {
                        drawable = this.f15797o;
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
                    toolbar.setSubtitle(this.f15791i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) != 0 && (view = this.f15787c) != null) {
                if ((i10 & 16) != 0) {
                    toolbar.addView(view);
                } else {
                    toolbar.removeView(view);
                }
            }
        }
    }

    public final void b() {
        Toolbar toolbar = this.f15785a;
        if ((this.f15786b & 4) != 0) {
            if (TextUtils.isEmpty(this.f15792j)) {
                toolbar.setNavigationContentDescription(this.f15796n);
            } else {
                toolbar.setNavigationContentDescription(this.f15792j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i10 = this.f15786b;
        if ((i10 & 2) != 0) {
            if ((i10 & 1) != 0) {
                drawable = this.f15788e;
                if (drawable == null) {
                    drawable = this.d;
                }
            } else {
                drawable = this.d;
            }
        } else {
            drawable = null;
        }
        this.f15785a.setLogo(drawable);
    }
}
