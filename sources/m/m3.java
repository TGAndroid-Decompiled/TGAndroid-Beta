package m;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
public final class m3 implements k1 {
    public Toolbar f15735a;
    public int f15736b;
    public View f15737c;
    public Drawable d;
    public Drawable f15738e;
    public Drawable f15739f;
    public boolean f15740g;
    public CharSequence h;
    public CharSequence f15741i;
    public CharSequence f15742j;
    public Window.Callback f15743k;
    public boolean f15744l;
    public h f15745m;
    public int f15746n;
    public Drawable f15747o;

    public final void a(int i10) {
        View view;
        Toolbar toolbar = this.f15735a;
        int i11 = this.f15736b ^ i10;
        this.f15736b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    b();
                }
                if ((this.f15736b & 4) != 0) {
                    Drawable drawable = this.f15739f;
                    if (drawable == null) {
                        drawable = this.f15747o;
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
                    toolbar.setSubtitle(this.f15741i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) != 0 && (view = this.f15737c) != null) {
                if ((i10 & 16) != 0) {
                    toolbar.addView(view);
                } else {
                    toolbar.removeView(view);
                }
            }
        }
    }

    public final void b() {
        Toolbar toolbar = this.f15735a;
        if ((this.f15736b & 4) != 0) {
            if (TextUtils.isEmpty(this.f15742j)) {
                toolbar.setNavigationContentDescription(this.f15746n);
            } else {
                toolbar.setNavigationContentDescription(this.f15742j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i10 = this.f15736b;
        if ((i10 & 2) != 0) {
            if ((i10 & 1) != 0) {
                drawable = this.f15738e;
                if (drawable == null) {
                    drawable = this.d;
                }
            } else {
                drawable = this.d;
            }
        } else {
            drawable = null;
        }
        this.f15735a.setLogo(drawable);
    }
}
