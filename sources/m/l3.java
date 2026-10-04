package m;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
public final class l3 implements k1 {
    public Toolbar f15789a;
    public int f15790b;
    public View f15791c;
    public Drawable d;
    public Drawable f15792e;
    public Drawable f15793f;
    public boolean f15794g;
    public CharSequence h;
    public CharSequence f15795i;
    public CharSequence f15796j;
    public Window.Callback f15797k;
    public boolean f15798l;
    public h f15799m;
    public int f15800n;
    public Drawable f15801o;

    public final void a(int i10) {
        View view;
        Toolbar toolbar = this.f15789a;
        int i11 = this.f15790b ^ i10;
        this.f15790b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    b();
                }
                if ((this.f15790b & 4) != 0) {
                    Drawable drawable = this.f15793f;
                    if (drawable == null) {
                        drawable = this.f15801o;
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
                    toolbar.setSubtitle(this.f15795i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) != 0 && (view = this.f15791c) != null) {
                if ((i10 & 16) != 0) {
                    toolbar.addView(view);
                } else {
                    toolbar.removeView(view);
                }
            }
        }
    }

    public final void b() {
        Toolbar toolbar = this.f15789a;
        if ((this.f15790b & 4) != 0) {
            if (TextUtils.isEmpty(this.f15796j)) {
                toolbar.setNavigationContentDescription(this.f15800n);
            } else {
                toolbar.setNavigationContentDescription(this.f15796j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i10 = this.f15790b;
        if ((i10 & 2) != 0) {
            if ((i10 & 1) != 0) {
                drawable = this.f15792e;
                if (drawable == null) {
                    drawable = this.d;
                }
            } else {
                drawable = this.d;
            }
        } else {
            drawable = null;
        }
        this.f15789a.setLogo(drawable);
    }
}
