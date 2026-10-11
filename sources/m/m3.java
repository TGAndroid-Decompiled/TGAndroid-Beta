package m;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
public final class m3 implements k1 {
    public Toolbar f15760a;
    public int f15761b;
    public View f15762c;
    public Drawable d;
    public Drawable f15763e;
    public Drawable f15764f;
    public boolean f15765g;
    public CharSequence h;
    public CharSequence f15766i;
    public CharSequence f15767j;
    public Window.Callback f15768k;
    public boolean f15769l;
    public h f15770m;
    public int f15771n;
    public Drawable f15772o;

    public final void a(int i10) {
        View view;
        Toolbar toolbar = this.f15760a;
        int i11 = this.f15761b ^ i10;
        this.f15761b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    b();
                }
                if ((this.f15761b & 4) != 0) {
                    Drawable drawable = this.f15764f;
                    if (drawable == null) {
                        drawable = this.f15772o;
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
                    toolbar.setSubtitle(this.f15766i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) != 0 && (view = this.f15762c) != null) {
                if ((i10 & 16) != 0) {
                    toolbar.addView(view);
                } else {
                    toolbar.removeView(view);
                }
            }
        }
    }

    public final void b() {
        Toolbar toolbar = this.f15760a;
        if ((this.f15761b & 4) != 0) {
            if (TextUtils.isEmpty(this.f15767j)) {
                toolbar.setNavigationContentDescription(this.f15771n);
            } else {
                toolbar.setNavigationContentDescription(this.f15767j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i10 = this.f15761b;
        if ((i10 & 2) != 0) {
            if ((i10 & 1) != 0) {
                drawable = this.f15763e;
                if (drawable == null) {
                    drawable = this.d;
                }
            } else {
                drawable = this.d;
            }
        } else {
            drawable = null;
        }
        this.f15760a.setLogo(drawable);
    }
}
