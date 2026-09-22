package m;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
public final class l3 implements k1 {
    public Toolbar f14221a;
    public int f14222b;
    public View f14223c;
    public Drawable d;
    public Drawable e;
    public Drawable f14224f;
    public boolean f14225g;
    public CharSequence h;
    public CharSequence f14226i;
    public CharSequence f14227j;
    public Window.Callback f14228k;
    public boolean f14229l;
    public h f14230m;
    public int f14231n;
    public Drawable f14232o;

    public final void a(int i10) {
        View view;
        Toolbar toolbar = this.f14221a;
        int i11 = this.f14222b ^ i10;
        this.f14222b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    b();
                }
                if ((this.f14222b & 4) != 0) {
                    Drawable drawable = this.f14224f;
                    if (drawable == null) {
                        drawable = this.f14232o;
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
                    toolbar.setSubtitle(this.f14226i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) != 0 && (view = this.f14223c) != null) {
                if ((i10 & 16) != 0) {
                    toolbar.addView(view);
                } else {
                    toolbar.removeView(view);
                }
            }
        }
    }

    public final void b() {
        Toolbar toolbar = this.f14221a;
        if ((this.f14222b & 4) != 0) {
            if (TextUtils.isEmpty(this.f14227j)) {
                toolbar.setNavigationContentDescription(this.f14231n);
            } else {
                toolbar.setNavigationContentDescription(this.f14227j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i10 = this.f14222b;
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
        this.f14221a.setLogo(drawable);
    }
}
