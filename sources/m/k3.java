package m;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
public final class k3 implements k1 {
    public Toolbar f20129a;
    public int f20130b;
    public View f20131c;
    public Drawable d;
    public Drawable f20132e;
    public Drawable f20133f;
    public boolean f20134g;
    public CharSequence h;
    public CharSequence f20135i;
    public CharSequence f20136j;
    public Window.Callback f20137k;
    public boolean f20138l;
    public h f20139m;
    public int f20140n;
    public Drawable f20141o;

    public final void a(int i7) {
        View view;
        Toolbar toolbar = this.f20129a;
        int i10 = this.f20130b ^ i7;
        this.f20130b = i7;
        if (i10 != 0) {
            if ((i10 & 4) != 0) {
                if ((i7 & 4) != 0) {
                    b();
                }
                if ((this.f20130b & 4) != 0) {
                    Drawable drawable = this.f20133f;
                    if (drawable == null) {
                        drawable = this.f20141o;
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
                    toolbar.setSubtitle(this.f20135i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i10 & 16) != 0 && (view = this.f20131c) != null) {
                if ((i7 & 16) != 0) {
                    toolbar.addView(view);
                } else {
                    toolbar.removeView(view);
                }
            }
        }
    }

    public final void b() {
        Toolbar toolbar = this.f20129a;
        if ((this.f20130b & 4) != 0) {
            if (TextUtils.isEmpty(this.f20136j)) {
                toolbar.setNavigationContentDescription(this.f20140n);
            } else {
                toolbar.setNavigationContentDescription(this.f20136j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i7 = this.f20130b;
        if ((i7 & 2) != 0) {
            if ((i7 & 1) != 0) {
                drawable = this.f20132e;
                if (drawable == null) {
                    drawable = this.d;
                }
            } else {
                drawable = this.d;
            }
        } else {
            drawable = null;
        }
        this.f20129a.setLogo(drawable);
    }
}
