package m;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
public final class k3 implements k1 {
    public Toolbar f20098a;
    public int f20099b;
    public View f20100c;
    public Drawable d;
    public Drawable f20101e;
    public Drawable f20102f;
    public boolean f20103g;
    public CharSequence h;
    public CharSequence f20104i;
    public CharSequence f20105j;
    public Window.Callback f20106k;
    public boolean f20107l;
    public h f20108m;
    public int f20109n;
    public Drawable f20110o;

    public final void a(int i7) {
        View view;
        Toolbar toolbar = this.f20098a;
        int i10 = this.f20099b ^ i7;
        this.f20099b = i7;
        if (i10 != 0) {
            if ((i10 & 4) != 0) {
                if ((i7 & 4) != 0) {
                    b();
                }
                if ((this.f20099b & 4) != 0) {
                    Drawable drawable = this.f20102f;
                    if (drawable == null) {
                        drawable = this.f20110o;
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
                    toolbar.setSubtitle(this.f20104i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i10 & 16) != 0 && (view = this.f20100c) != null) {
                if ((i7 & 16) != 0) {
                    toolbar.addView(view);
                } else {
                    toolbar.removeView(view);
                }
            }
        }
    }

    public final void b() {
        Toolbar toolbar = this.f20098a;
        if ((this.f20099b & 4) != 0) {
            if (TextUtils.isEmpty(this.f20105j)) {
                toolbar.setNavigationContentDescription(this.f20109n);
            } else {
                toolbar.setNavigationContentDescription(this.f20105j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i7 = this.f20099b;
        if ((i7 & 2) != 0) {
            if ((i7 & 1) != 0) {
                drawable = this.f20101e;
                if (drawable == null) {
                    drawable = this.d;
                }
            } else {
                drawable = this.d;
            }
        } else {
            drawable = null;
        }
        this.f20098a.setLogo(drawable);
    }
}
