package m;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
public final class m3 implements k1 {
    public Toolbar f15796a;
    public int f15797b;
    public View f15798c;
    public Drawable d;
    public Drawable f15799e;
    public Drawable f15800f;
    public boolean f15801g;
    public CharSequence h;
    public CharSequence f15802i;
    public CharSequence f15803j;
    public Window.Callback f15804k;
    public boolean f15805l;
    public h f15806m;
    public int f15807n;
    public Drawable f15808o;

    public final void a(int i10) {
        View view;
        Toolbar toolbar = this.f15796a;
        int i11 = this.f15797b ^ i10;
        this.f15797b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    b();
                }
                if ((this.f15797b & 4) != 0) {
                    Drawable drawable = this.f15800f;
                    if (drawable == null) {
                        drawable = this.f15808o;
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
                    toolbar.setSubtitle(this.f15802i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) != 0 && (view = this.f15798c) != null) {
                if ((i10 & 16) != 0) {
                    toolbar.addView(view);
                } else {
                    toolbar.removeView(view);
                }
            }
        }
    }

    public final void b() {
        Toolbar toolbar = this.f15796a;
        if ((this.f15797b & 4) != 0) {
            if (TextUtils.isEmpty(this.f15803j)) {
                toolbar.setNavigationContentDescription(this.f15807n);
            } else {
                toolbar.setNavigationContentDescription(this.f15803j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i10 = this.f15797b;
        if ((i10 & 2) != 0) {
            if ((i10 & 1) != 0) {
                drawable = this.f15799e;
                if (drawable == null) {
                    drawable = this.d;
                }
            } else {
                drawable = this.d;
            }
        } else {
            drawable = null;
        }
        this.f15796a.setLogo(drawable);
    }
}
