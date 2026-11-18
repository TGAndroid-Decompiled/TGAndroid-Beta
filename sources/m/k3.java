package m;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
public final class k3 implements k1 {
    public Toolbar f20101a;
    public int f20102b;
    public View f20103c;
    public Drawable d;
    public Drawable f20104e;
    public Drawable f20105f;
    public boolean f20106g;
    public CharSequence h;
    public CharSequence f20107i;
    public CharSequence f20108j;
    public Window.Callback f20109k;
    public boolean f20110l;
    public h f20111m;
    public int f20112n;
    public Drawable f20113o;

    public final void a(int i7) {
        View view;
        Toolbar toolbar = this.f20101a;
        int i10 = this.f20102b ^ i7;
        this.f20102b = i7;
        if (i10 != 0) {
            if ((i10 & 4) != 0) {
                if ((i7 & 4) != 0) {
                    b();
                }
                if ((this.f20102b & 4) != 0) {
                    Drawable drawable = this.f20105f;
                    if (drawable == null) {
                        drawable = this.f20113o;
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
                    toolbar.setSubtitle(this.f20107i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i10 & 16) != 0 && (view = this.f20103c) != null) {
                if ((i7 & 16) != 0) {
                    toolbar.addView(view);
                } else {
                    toolbar.removeView(view);
                }
            }
        }
    }

    public final void b() {
        Toolbar toolbar = this.f20101a;
        if ((this.f20102b & 4) != 0) {
            if (TextUtils.isEmpty(this.f20108j)) {
                toolbar.setNavigationContentDescription(this.f20112n);
            } else {
                toolbar.setNavigationContentDescription(this.f20108j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i7 = this.f20102b;
        if ((i7 & 2) != 0) {
            if ((i7 & 1) != 0) {
                drawable = this.f20104e;
                if (drawable == null) {
                    drawable = this.d;
                }
            } else {
                drawable = this.d;
            }
        } else {
            drawable = null;
        }
        this.f20101a.setLogo(drawable);
    }
}
