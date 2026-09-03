package m;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
public final class n3 implements k1 {
    public Toolbar f13266a;
    public int f13267b;
    public View f13268c;
    public Drawable d;
    public Drawable f13269e;
    public Drawable f13270f;
    public boolean f13271g;
    public CharSequence h;
    public CharSequence f13272i;
    public CharSequence f13273j;
    public Window.Callback f13274k;
    public boolean f13275l;
    public h f13276m;
    public int f13277n;
    public Drawable f13278o;

    public final void a(int i10) {
        View view;
        Toolbar toolbar = this.f13266a;
        int i11 = this.f13267b ^ i10;
        this.f13267b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    b();
                }
                if ((this.f13267b & 4) != 0) {
                    Drawable drawable = this.f13270f;
                    if (drawable == null) {
                        drawable = this.f13278o;
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
                    toolbar.setSubtitle(this.f13272i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) != 0 && (view = this.f13268c) != null) {
                if ((i10 & 16) != 0) {
                    toolbar.addView(view);
                } else {
                    toolbar.removeView(view);
                }
            }
        }
    }

    public final void b() {
        Toolbar toolbar = this.f13266a;
        if ((this.f13267b & 4) != 0) {
            if (TextUtils.isEmpty(this.f13273j)) {
                toolbar.setNavigationContentDescription(this.f13277n);
            } else {
                toolbar.setNavigationContentDescription(this.f13273j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i10 = this.f13267b;
        if ((i10 & 2) != 0) {
            if ((i10 & 1) != 0) {
                drawable = this.f13269e;
                if (drawable == null) {
                    drawable = this.d;
                }
            } else {
                drawable = this.d;
            }
        } else {
            drawable = null;
        }
        this.f13266a.setLogo(drawable);
    }
}
