package m;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
public final class l3 implements k1 {
    public Toolbar f15784a;
    public int f15785b;
    public View f15786c;
    public Drawable d;
    public Drawable f15787e;
    public Drawable f15788f;
    public boolean f15789g;
    public CharSequence h;
    public CharSequence f15790i;
    public CharSequence f15791j;
    public Window.Callback f15792k;
    public boolean f15793l;
    public h f15794m;
    public int f15795n;
    public Drawable f15796o;

    public final void a(int i10) {
        View view;
        Toolbar toolbar = this.f15784a;
        int i11 = this.f15785b ^ i10;
        this.f15785b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    b();
                }
                if ((this.f15785b & 4) != 0) {
                    Drawable drawable = this.f15788f;
                    if (drawable == null) {
                        drawable = this.f15796o;
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
                    toolbar.setSubtitle(this.f15790i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) != 0 && (view = this.f15786c) != null) {
                if ((i10 & 16) != 0) {
                    toolbar.addView(view);
                } else {
                    toolbar.removeView(view);
                }
            }
        }
    }

    public final void b() {
        Toolbar toolbar = this.f15784a;
        if ((this.f15785b & 4) != 0) {
            if (TextUtils.isEmpty(this.f15791j)) {
                toolbar.setNavigationContentDescription(this.f15795n);
            } else {
                toolbar.setNavigationContentDescription(this.f15791j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i10 = this.f15785b;
        if ((i10 & 2) != 0) {
            if ((i10 & 1) != 0) {
                drawable = this.f15787e;
                if (drawable == null) {
                    drawable = this.d;
                }
            } else {
                drawable = this.d;
            }
        } else {
            drawable = null;
        }
        this.f15784a.setLogo(drawable);
    }
}
