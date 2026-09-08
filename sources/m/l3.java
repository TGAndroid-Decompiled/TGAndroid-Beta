package m;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
public final class l3 implements k1 {
    public Toolbar f15596a;
    public int f15597b;
    public View f15598c;
    public Drawable d;
    public Drawable f15599e;
    public Drawable f15600f;
    public boolean f15601g;
    public CharSequence h;
    public CharSequence f15602i;
    public CharSequence f15603j;
    public Window.Callback f15604k;
    public boolean f15605l;
    public h f15606m;
    public int f15607n;
    public Drawable f15608o;

    public final void a(int i10) {
        View view;
        Toolbar toolbar = this.f15596a;
        int i11 = this.f15597b ^ i10;
        this.f15597b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    b();
                }
                if ((this.f15597b & 4) != 0) {
                    Drawable drawable = this.f15600f;
                    if (drawable == null) {
                        drawable = this.f15608o;
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
                    toolbar.setSubtitle(this.f15602i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) != 0 && (view = this.f15598c) != null) {
                if ((i10 & 16) != 0) {
                    toolbar.addView(view);
                } else {
                    toolbar.removeView(view);
                }
            }
        }
    }

    public final void b() {
        Toolbar toolbar = this.f15596a;
        if ((this.f15597b & 4) != 0) {
            if (TextUtils.isEmpty(this.f15603j)) {
                toolbar.setNavigationContentDescription(this.f15607n);
            } else {
                toolbar.setNavigationContentDescription(this.f15603j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i10 = this.f15597b;
        if ((i10 & 2) != 0) {
            if ((i10 & 1) != 0) {
                drawable = this.f15599e;
                if (drawable == null) {
                    drawable = this.d;
                }
            } else {
                drawable = this.d;
            }
        } else {
            drawable = null;
        }
        this.f15596a.setLogo(drawable);
    }
}
