package m;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
public final class o3 implements l1 {
    public Toolbar f16274a;
    public int f16275b;
    public View f16276c;
    public Drawable d;
    public Drawable e;
    public Drawable f16277f;
    public boolean f16278g;
    public CharSequence h;
    public CharSequence f16279i;
    public CharSequence f16280j;
    public Window.Callback f16281k;
    public boolean f16282l;
    public i f16283m;
    public int f16284n;
    public Drawable f16285o;

    public final void a(int i10) {
        View view;
        Toolbar toolbar = this.f16274a;
        int i11 = this.f16275b ^ i10;
        this.f16275b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    b();
                }
                if ((this.f16275b & 4) != 0) {
                    Drawable drawable = this.f16277f;
                    if (drawable == null) {
                        drawable = this.f16285o;
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
                    toolbar.setSubtitle(this.f16279i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) != 0 && (view = this.f16276c) != null) {
                if ((i10 & 16) != 0) {
                    toolbar.addView(view);
                } else {
                    toolbar.removeView(view);
                }
            }
        }
    }

    public final void b() {
        Toolbar toolbar = this.f16274a;
        if ((this.f16275b & 4) != 0) {
            if (TextUtils.isEmpty(this.f16280j)) {
                toolbar.setNavigationContentDescription(this.f16284n);
            } else {
                toolbar.setNavigationContentDescription(this.f16280j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i10 = this.f16275b;
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
        this.f16274a.setLogo(drawable);
    }
}
