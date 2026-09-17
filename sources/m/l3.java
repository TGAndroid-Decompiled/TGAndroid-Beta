package m;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
public final class l3 implements k1 {
    public Toolbar f15569a;
    public int f15570b;
    public View f15571c;
    public Drawable d;
    public Drawable f15572e;
    public Drawable f15573f;
    public boolean f15574g;
    public CharSequence h;
    public CharSequence f15575i;
    public CharSequence f15576j;
    public Window.Callback f15577k;
    public boolean f15578l;
    public h f15579m;
    public int f15580n;
    public Drawable f15581o;

    public final void a(int i10) {
        View view;
        Toolbar toolbar = this.f15569a;
        int i11 = this.f15570b ^ i10;
        this.f15570b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    b();
                }
                if ((this.f15570b & 4) != 0) {
                    Drawable drawable = this.f15573f;
                    if (drawable == null) {
                        drawable = this.f15581o;
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
                    toolbar.setSubtitle(this.f15575i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) != 0 && (view = this.f15571c) != null) {
                if ((i10 & 16) != 0) {
                    toolbar.addView(view);
                } else {
                    toolbar.removeView(view);
                }
            }
        }
    }

    public final void b() {
        Toolbar toolbar = this.f15569a;
        if ((this.f15570b & 4) != 0) {
            if (TextUtils.isEmpty(this.f15576j)) {
                toolbar.setNavigationContentDescription(this.f15580n);
            } else {
                toolbar.setNavigationContentDescription(this.f15576j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i10 = this.f15570b;
        if ((i10 & 2) != 0) {
            if ((i10 & 1) != 0) {
                drawable = this.f15572e;
                if (drawable == null) {
                    drawable = this.d;
                }
            } else {
                drawable = this.d;
            }
        } else {
            drawable = null;
        }
        this.f15569a.setLogo(drawable);
    }
}
