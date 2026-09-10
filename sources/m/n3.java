package m;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
public final class n3 implements k1 {
    public Toolbar f13078a;
    public int f13079b;
    public View f13080c;
    public Drawable d;
    public Drawable e;
    public Drawable f13081f;
    public boolean f13082g;
    public CharSequence h;
    public CharSequence f13083i;
    public CharSequence f13084j;
    public Window.Callback f13085k;
    public boolean f13086l;
    public h f13087m;
    public int f13088n;
    public Drawable f13089o;

    public final void a(int i10) {
        View view;
        Toolbar toolbar = this.f13078a;
        int i11 = this.f13079b ^ i10;
        this.f13079b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    b();
                }
                if ((this.f13079b & 4) != 0) {
                    Drawable drawable = this.f13081f;
                    if (drawable == null) {
                        drawable = this.f13089o;
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
                    toolbar.setSubtitle(this.f13083i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) != 0 && (view = this.f13080c) != null) {
                if ((i10 & 16) != 0) {
                    toolbar.addView(view);
                } else {
                    toolbar.removeView(view);
                }
            }
        }
    }

    public final void b() {
        Toolbar toolbar = this.f13078a;
        if ((this.f13079b & 4) != 0) {
            if (TextUtils.isEmpty(this.f13084j)) {
                toolbar.setNavigationContentDescription(this.f13088n);
            } else {
                toolbar.setNavigationContentDescription(this.f13084j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i10 = this.f13079b;
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
        this.f13078a.setLogo(drawable);
    }
}
