package m;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
public final class n3 implements l1 {
    public Toolbar f15497a;
    public int f15498b;
    public View f15499c;
    public Drawable d;
    public Drawable f15500e;
    public Drawable f15501f;
    public boolean f15502g;
    public CharSequence h;
    public CharSequence f15503i;
    public CharSequence f15504j;
    public Window.Callback f15505k;
    public boolean f15506l;
    public h f15507m;
    public int f15508n;
    public Drawable f15509o;

    public final void a(int i10) {
        View view;
        Toolbar toolbar = this.f15497a;
        int i11 = this.f15498b ^ i10;
        this.f15498b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    b();
                }
                if ((this.f15498b & 4) != 0) {
                    Drawable drawable = this.f15501f;
                    if (drawable == null) {
                        drawable = this.f15509o;
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
                    toolbar.setSubtitle(this.f15503i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) != 0 && (view = this.f15499c) != null) {
                if ((i10 & 16) != 0) {
                    toolbar.addView(view);
                } else {
                    toolbar.removeView(view);
                }
            }
        }
    }

    public final void b() {
        Toolbar toolbar = this.f15497a;
        if ((this.f15498b & 4) != 0) {
            if (TextUtils.isEmpty(this.f15504j)) {
                toolbar.setNavigationContentDescription(this.f15508n);
            } else {
                toolbar.setNavigationContentDescription(this.f15504j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i10 = this.f15498b;
        if ((i10 & 2) != 0) {
            if ((i10 & 1) != 0) {
                drawable = this.f15500e;
                if (drawable == null) {
                    drawable = this.d;
                }
            } else {
                drawable = this.d;
            }
        } else {
            drawable = null;
        }
        this.f15497a.setLogo(drawable);
    }
}
