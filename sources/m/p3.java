package m;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
public final class p3 implements m1 {
    public Toolbar f14924a;
    public int f14925b;
    public View f14926c;
    public Drawable d;
    public Drawable e;
    public Drawable f14927f;
    public boolean f14928g;
    public CharSequence h;
    public CharSequence f14929i;
    public CharSequence f14930j;
    public Window.Callback f14931k;
    public boolean f14932l;
    public i f14933m;
    public int f14934n;
    public Drawable f14935o;

    public final void a(int i10) {
        View view;
        Toolbar toolbar = this.f14924a;
        int i11 = this.f14925b ^ i10;
        this.f14925b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    b();
                }
                if ((this.f14925b & 4) != 0) {
                    Drawable drawable = this.f14927f;
                    if (drawable == null) {
                        drawable = this.f14935o;
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
                    toolbar.setSubtitle(this.f14929i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) != 0 && (view = this.f14926c) != null) {
                if ((i10 & 16) != 0) {
                    toolbar.addView(view);
                } else {
                    toolbar.removeView(view);
                }
            }
        }
    }

    public final void b() {
        Toolbar toolbar = this.f14924a;
        if ((this.f14925b & 4) != 0) {
            if (TextUtils.isEmpty(this.f14930j)) {
                toolbar.setNavigationContentDescription(this.f14934n);
            } else {
                toolbar.setNavigationContentDescription(this.f14930j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i10 = this.f14925b;
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
        this.f14924a.setLogo(drawable);
    }
}
