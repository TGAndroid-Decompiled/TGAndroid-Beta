package m;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
public final class l3 implements k1 {
    public Toolbar f14491a;
    public int f14492b;
    public View f14493c;
    public Drawable d;
    public Drawable e;
    public Drawable f14494f;
    public boolean f14495g;
    public CharSequence h;
    public CharSequence f14496i;
    public CharSequence f14497j;
    public Window.Callback f14498k;
    public boolean f14499l;
    public h f14500m;
    public int f14501n;
    public Drawable f14502o;

    public final void a(int i10) {
        View view;
        Toolbar toolbar = this.f14491a;
        int i11 = this.f14492b ^ i10;
        this.f14492b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    b();
                }
                if ((this.f14492b & 4) != 0) {
                    Drawable drawable = this.f14494f;
                    if (drawable == null) {
                        drawable = this.f14502o;
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
                    toolbar.setSubtitle(this.f14496i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) != 0 && (view = this.f14493c) != null) {
                if ((i10 & 16) != 0) {
                    toolbar.addView(view);
                } else {
                    toolbar.removeView(view);
                }
            }
        }
    }

    public final void b() {
        Toolbar toolbar = this.f14491a;
        if ((this.f14492b & 4) != 0) {
            if (TextUtils.isEmpty(this.f14497j)) {
                toolbar.setNavigationContentDescription(this.f14501n);
            } else {
                toolbar.setNavigationContentDescription(this.f14497j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i10 = this.f14492b;
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
        this.f14491a.setLogo(drawable);
    }
}
