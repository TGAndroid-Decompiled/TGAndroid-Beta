package m;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
public final class k3 implements k1 {
    public Toolbar f20095a;
    public int f20096b;
    public View f20097c;
    public Drawable d;
    public Drawable f20098e;
    public Drawable f20099f;
    public boolean f20100g;
    public CharSequence h;
    public CharSequence f20101i;
    public CharSequence f20102j;
    public Window.Callback f20103k;
    public boolean f20104l;
    public h f20105m;
    public int f20106n;
    public Drawable f20107o;

    public final void a(int i7) {
        View view;
        Toolbar toolbar = this.f20095a;
        int i10 = this.f20096b ^ i7;
        this.f20096b = i7;
        if (i10 != 0) {
            if ((i10 & 4) != 0) {
                if ((i7 & 4) != 0) {
                    b();
                }
                if ((this.f20096b & 4) != 0) {
                    Drawable drawable = this.f20099f;
                    if (drawable == null) {
                        drawable = this.f20107o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i10 & 3) != 0) {
                c();
            }
            if ((i10 & 8) != 0) {
                if ((i7 & 8) != 0) {
                    toolbar.setTitle(this.h);
                    toolbar.setSubtitle(this.f20101i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i10 & 16) != 0 && (view = this.f20097c) != null) {
                if ((i7 & 16) != 0) {
                    toolbar.addView(view);
                } else {
                    toolbar.removeView(view);
                }
            }
        }
    }

    public final void b() {
        Toolbar toolbar = this.f20095a;
        if ((this.f20096b & 4) != 0) {
            if (TextUtils.isEmpty(this.f20102j)) {
                toolbar.setNavigationContentDescription(this.f20106n);
            } else {
                toolbar.setNavigationContentDescription(this.f20102j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i7 = this.f20096b;
        if ((i7 & 2) != 0) {
            if ((i7 & 1) != 0) {
                drawable = this.f20098e;
                if (drawable == null) {
                    drawable = this.d;
                }
            } else {
                drawable = this.d;
            }
        } else {
            drawable = null;
        }
        this.f20095a.setLogo(drawable);
    }
}
