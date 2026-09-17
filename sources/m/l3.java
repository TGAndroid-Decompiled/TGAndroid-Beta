package m;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
public final class l3 implements k1 {
    public Toolbar f14233a;
    public int f14234b;
    public View f14235c;
    public Drawable d;
    public Drawable e;
    public Drawable f14236f;
    public boolean f14237g;
    public CharSequence h;
    public CharSequence f14238i;
    public CharSequence f14239j;
    public Window.Callback f14240k;
    public boolean f14241l;
    public h f14242m;
    public int f14243n;
    public Drawable f14244o;

    public final void a(int i10) {
        View view;
        Toolbar toolbar = this.f14233a;
        int i11 = this.f14234b ^ i10;
        this.f14234b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    b();
                }
                if ((this.f14234b & 4) != 0) {
                    Drawable drawable = this.f14236f;
                    if (drawable == null) {
                        drawable = this.f14244o;
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
                    toolbar.setSubtitle(this.f14238i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) != 0 && (view = this.f14235c) != null) {
                if ((i10 & 16) != 0) {
                    toolbar.addView(view);
                } else {
                    toolbar.removeView(view);
                }
            }
        }
    }

    public final void b() {
        Toolbar toolbar = this.f14233a;
        if ((this.f14234b & 4) != 0) {
            if (TextUtils.isEmpty(this.f14239j)) {
                toolbar.setNavigationContentDescription(this.f14243n);
            } else {
                toolbar.setNavigationContentDescription(this.f14239j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i10 = this.f14234b;
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
        this.f14233a.setLogo(drawable);
    }
}
