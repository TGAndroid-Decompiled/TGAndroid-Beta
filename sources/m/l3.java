package m;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
public final class l3 implements k1 {
    public Toolbar f14444a;
    public int f14445b;
    public View f14446c;
    public Drawable d;
    public Drawable e;
    public Drawable f14447f;
    public boolean f14448g;
    public CharSequence h;
    public CharSequence f14449i;
    public CharSequence f14450j;
    public Window.Callback f14451k;
    public boolean f14452l;
    public h f14453m;
    public int f14454n;
    public Drawable f14455o;

    public final void a(int i10) {
        View view;
        Toolbar toolbar = this.f14444a;
        int i11 = this.f14445b ^ i10;
        this.f14445b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    b();
                }
                if ((this.f14445b & 4) != 0) {
                    Drawable drawable = this.f14447f;
                    if (drawable == null) {
                        drawable = this.f14455o;
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
                    toolbar.setSubtitle(this.f14449i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) != 0 && (view = this.f14446c) != null) {
                if ((i10 & 16) != 0) {
                    toolbar.addView(view);
                } else {
                    toolbar.removeView(view);
                }
            }
        }
    }

    public final void b() {
        Toolbar toolbar = this.f14444a;
        if ((this.f14445b & 4) != 0) {
            if (TextUtils.isEmpty(this.f14450j)) {
                toolbar.setNavigationContentDescription(this.f14454n);
            } else {
                toolbar.setNavigationContentDescription(this.f14450j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i10 = this.f14445b;
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
        this.f14444a.setLogo(drawable);
    }
}
