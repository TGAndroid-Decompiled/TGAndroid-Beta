package m;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
public final class m3 implements k1 {
    public Toolbar f15739a;
    public int f15740b;
    public View f15741c;
    public Drawable d;
    public Drawable f15742e;
    public Drawable f15743f;
    public boolean f15744g;
    public CharSequence h;
    public CharSequence f15745i;
    public CharSequence f15746j;
    public Window.Callback f15747k;
    public boolean f15748l;
    public h f15749m;
    public int f15750n;
    public Drawable f15751o;

    public final void a(int i10) {
        View view;
        Toolbar toolbar = this.f15739a;
        int i11 = this.f15740b ^ i10;
        this.f15740b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    b();
                }
                if ((this.f15740b & 4) != 0) {
                    Drawable drawable = this.f15743f;
                    if (drawable == null) {
                        drawable = this.f15751o;
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
                    toolbar.setSubtitle(this.f15745i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) != 0 && (view = this.f15741c) != null) {
                if ((i10 & 16) != 0) {
                    toolbar.addView(view);
                } else {
                    toolbar.removeView(view);
                }
            }
        }
    }

    public final void b() {
        Toolbar toolbar = this.f15739a;
        if ((this.f15740b & 4) != 0) {
            if (TextUtils.isEmpty(this.f15746j)) {
                toolbar.setNavigationContentDescription(this.f15750n);
            } else {
                toolbar.setNavigationContentDescription(this.f15746j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i10 = this.f15740b;
        if ((i10 & 2) != 0) {
            if ((i10 & 1) != 0) {
                drawable = this.f15742e;
                if (drawable == null) {
                    drawable = this.d;
                }
            } else {
                drawable = this.d;
            }
        } else {
            drawable = null;
        }
        this.f15739a.setLogo(drawable);
    }
}
