package m;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
public final class k3 implements k1 {
    public Toolbar f18622a;
    public int f18623b;
    public View f18624c;
    public Drawable d;
    public Drawable f18625e;
    public Drawable f18626f;
    public boolean f18627g;
    public CharSequence h;
    public CharSequence f18628i;
    public CharSequence f18629j;
    public Window.Callback f18630k;
    public boolean f18631l;
    public h f18632m;
    public int f18633n;
    public Drawable f18634o;

    public final void a(int i3) {
        View view;
        Toolbar toolbar = this.f18622a;
        int i10 = this.f18623b ^ i3;
        this.f18623b = i3;
        if (i10 != 0) {
            if ((i10 & 4) != 0) {
                if ((i3 & 4) != 0) {
                    b();
                }
                if ((this.f18623b & 4) != 0) {
                    Drawable drawable = this.f18626f;
                    if (drawable == null) {
                        drawable = this.f18634o;
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
                if ((i3 & 8) != 0) {
                    toolbar.setTitle(this.h);
                    toolbar.setSubtitle(this.f18628i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i10 & 16) != 0 && (view = this.f18624c) != null) {
                if ((i3 & 16) != 0) {
                    toolbar.addView(view);
                } else {
                    toolbar.removeView(view);
                }
            }
        }
    }

    public final void b() {
        Toolbar toolbar = this.f18622a;
        if ((this.f18623b & 4) != 0) {
            if (TextUtils.isEmpty(this.f18629j)) {
                toolbar.setNavigationContentDescription(this.f18633n);
            } else {
                toolbar.setNavigationContentDescription(this.f18629j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i3 = this.f18623b;
        if ((i3 & 2) != 0) {
            if ((i3 & 1) != 0) {
                drawable = this.f18625e;
                if (drawable == null) {
                    drawable = this.d;
                }
            } else {
                drawable = this.d;
            }
        } else {
            drawable = null;
        }
        this.f18622a.setLogo(drawable);
    }
}
