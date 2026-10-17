package m;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
public final class o3 implements l1 {
    public Toolbar f16269a;
    public int f16270b;
    public View f16271c;
    public Drawable d;
    public Drawable e;
    public Drawable f16272f;
    public boolean f16273g;
    public CharSequence h;
    public CharSequence f16274i;
    public CharSequence f16275j;
    public Window.Callback f16276k;
    public boolean f16277l;
    public i f16278m;
    public int f16279n;
    public Drawable f16280o;

    public final void a(int i10) {
        View view;
        Toolbar toolbar = this.f16269a;
        int i11 = this.f16270b ^ i10;
        this.f16270b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    b();
                }
                if ((this.f16270b & 4) != 0) {
                    Drawable drawable = this.f16272f;
                    if (drawable == null) {
                        drawable = this.f16280o;
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
                    toolbar.setSubtitle(this.f16274i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) != 0 && (view = this.f16271c) != null) {
                if ((i10 & 16) != 0) {
                    toolbar.addView(view);
                } else {
                    toolbar.removeView(view);
                }
            }
        }
    }

    public final void b() {
        Toolbar toolbar = this.f16269a;
        if ((this.f16270b & 4) != 0) {
            if (TextUtils.isEmpty(this.f16275j)) {
                toolbar.setNavigationContentDescription(this.f16279n);
            } else {
                toolbar.setNavigationContentDescription(this.f16275j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i10 = this.f16270b;
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
        this.f16269a.setLogo(drawable);
    }
}
