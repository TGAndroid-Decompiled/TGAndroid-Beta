package m;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
public final class l3 implements k1 {
    public Toolbar f14211a;
    public int f14212b;
    public View f14213c;
    public Drawable d;
    public Drawable e;
    public Drawable f14214f;
    public boolean f14215g;
    public CharSequence h;
    public CharSequence f14216i;
    public CharSequence f14217j;
    public Window.Callback f14218k;
    public boolean f14219l;
    public h f14220m;
    public int f14221n;
    public Drawable f14222o;

    public final void a(int i10) {
        View view;
        Toolbar toolbar = this.f14211a;
        int i11 = this.f14212b ^ i10;
        this.f14212b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    b();
                }
                if ((this.f14212b & 4) != 0) {
                    Drawable drawable = this.f14214f;
                    if (drawable == null) {
                        drawable = this.f14222o;
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
                    toolbar.setSubtitle(this.f14216i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) != 0 && (view = this.f14213c) != null) {
                if ((i10 & 16) != 0) {
                    toolbar.addView(view);
                } else {
                    toolbar.removeView(view);
                }
            }
        }
    }

    public final void b() {
        Toolbar toolbar = this.f14211a;
        if ((this.f14212b & 4) != 0) {
            if (TextUtils.isEmpty(this.f14217j)) {
                toolbar.setNavigationContentDescription(this.f14221n);
            } else {
                toolbar.setNavigationContentDescription(this.f14217j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i10 = this.f14212b;
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
        this.f14211a.setLogo(drawable);
    }
}
