package m;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
public final class k3 implements k1 {
    public Toolbar f20126a;
    public int f20127b;
    public View f20128c;
    public Drawable d;
    public Drawable f20129e;
    public Drawable f20130f;
    public boolean f20131g;
    public CharSequence h;
    public CharSequence f20132i;
    public CharSequence f20133j;
    public Window.Callback f20134k;
    public boolean f20135l;
    public h f20136m;
    public int f20137n;
    public Drawable f20138o;

    public final void a(int i7) {
        View view;
        Toolbar toolbar = this.f20126a;
        int i10 = this.f20127b ^ i7;
        this.f20127b = i7;
        if (i10 != 0) {
            if ((i10 & 4) != 0) {
                if ((i7 & 4) != 0) {
                    b();
                }
                if ((this.f20127b & 4) != 0) {
                    Drawable drawable = this.f20130f;
                    if (drawable == null) {
                        drawable = this.f20138o;
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
                    toolbar.setSubtitle(this.f20132i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i10 & 16) != 0 && (view = this.f20128c) != null) {
                if ((i7 & 16) != 0) {
                    toolbar.addView(view);
                } else {
                    toolbar.removeView(view);
                }
            }
        }
    }

    public final void b() {
        Toolbar toolbar = this.f20126a;
        if ((this.f20127b & 4) != 0) {
            if (TextUtils.isEmpty(this.f20133j)) {
                toolbar.setNavigationContentDescription(this.f20137n);
            } else {
                toolbar.setNavigationContentDescription(this.f20133j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i7 = this.f20127b;
        if ((i7 & 2) != 0) {
            if ((i7 & 1) != 0) {
                drawable = this.f20129e;
                if (drawable == null) {
                    drawable = this.d;
                }
            } else {
                drawable = this.d;
            }
        } else {
            drawable = null;
        }
        this.f20126a.setLogo(drawable);
    }
}
