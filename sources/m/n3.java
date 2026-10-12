package m;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
public final class n3 implements l1 {
    public Toolbar f15498a;
    public int f15499b;
    public View f15500c;
    public Drawable d;
    public Drawable f15501e;
    public Drawable f15502f;
    public boolean f15503g;
    public CharSequence h;
    public CharSequence f15504i;
    public CharSequence f15505j;
    public Window.Callback f15506k;
    public boolean f15507l;
    public h f15508m;
    public int f15509n;
    public Drawable f15510o;

    public final void a(int i10) {
        View view;
        Toolbar toolbar = this.f15498a;
        int i11 = this.f15499b ^ i10;
        this.f15499b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    b();
                }
                if ((this.f15499b & 4) != 0) {
                    Drawable drawable = this.f15502f;
                    if (drawable == null) {
                        drawable = this.f15510o;
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
                    toolbar.setSubtitle(this.f15504i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) != 0 && (view = this.f15500c) != null) {
                if ((i10 & 16) != 0) {
                    toolbar.addView(view);
                } else {
                    toolbar.removeView(view);
                }
            }
        }
    }

    public final void b() {
        Toolbar toolbar = this.f15498a;
        if ((this.f15499b & 4) != 0) {
            if (TextUtils.isEmpty(this.f15505j)) {
                toolbar.setNavigationContentDescription(this.f15509n);
            } else {
                toolbar.setNavigationContentDescription(this.f15505j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i10 = this.f15499b;
        if ((i10 & 2) != 0) {
            if ((i10 & 1) != 0) {
                drawable = this.f15501e;
                if (drawable == null) {
                    drawable = this.d;
                }
            } else {
                drawable = this.d;
            }
        } else {
            drawable = null;
        }
        this.f15498a.setLogo(drawable);
    }
}
