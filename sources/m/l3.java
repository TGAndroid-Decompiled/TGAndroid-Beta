package m;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
public final class l3 implements k1 {
    public Toolbar f14465a;
    public int f14466b;
    public View f14467c;
    public Drawable d;
    public Drawable e;
    public Drawable f14468f;
    public boolean f14469g;
    public CharSequence h;
    public CharSequence f14470i;
    public CharSequence f14471j;
    public Window.Callback f14472k;
    public boolean f14473l;
    public h f14474m;
    public int f14475n;
    public Drawable f14476o;

    public final void a(int i10) {
        View view;
        Toolbar toolbar = this.f14465a;
        int i11 = this.f14466b ^ i10;
        this.f14466b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    b();
                }
                if ((this.f14466b & 4) != 0) {
                    Drawable drawable = this.f14468f;
                    if (drawable == null) {
                        drawable = this.f14476o;
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
                    toolbar.setSubtitle(this.f14470i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) != 0 && (view = this.f14467c) != null) {
                if ((i10 & 16) != 0) {
                    toolbar.addView(view);
                } else {
                    toolbar.removeView(view);
                }
            }
        }
    }

    public final void b() {
        Toolbar toolbar = this.f14465a;
        if ((this.f14466b & 4) != 0) {
            if (TextUtils.isEmpty(this.f14471j)) {
                toolbar.setNavigationContentDescription(this.f14475n);
            } else {
                toolbar.setNavigationContentDescription(this.f14471j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i10 = this.f14466b;
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
        this.f14465a.setLogo(drawable);
    }
}
