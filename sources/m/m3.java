package m;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
public final class m3 implements k1 {
    public Toolbar f15164a;
    public int f15165b;
    public View f15166c;
    public Drawable d;
    public Drawable e;
    public Drawable f15167f;
    public boolean f15168g;
    public CharSequence h;
    public CharSequence f15169i;
    public CharSequence f15170j;
    public Window.Callback f15171k;
    public boolean f15172l;
    public h f15173m;
    public int f15174n;
    public Drawable f15175o;

    public final void a(int i10) {
        View view;
        Toolbar toolbar = this.f15164a;
        int i11 = this.f15165b ^ i10;
        this.f15165b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    b();
                }
                if ((this.f15165b & 4) != 0) {
                    Drawable drawable = this.f15167f;
                    if (drawable == null) {
                        drawable = this.f15175o;
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
                    toolbar.setSubtitle(this.f15169i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) != 0 && (view = this.f15166c) != null) {
                if ((i10 & 16) != 0) {
                    toolbar.addView(view);
                } else {
                    toolbar.removeView(view);
                }
            }
        }
    }

    public final void b() {
        Toolbar toolbar = this.f15164a;
        if ((this.f15165b & 4) != 0) {
            if (TextUtils.isEmpty(this.f15170j)) {
                toolbar.setNavigationContentDescription(this.f15174n);
            } else {
                toolbar.setNavigationContentDescription(this.f15170j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i10 = this.f15165b;
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
        this.f15164a.setLogo(drawable);
    }
}
