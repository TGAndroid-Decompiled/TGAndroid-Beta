package m;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
public final class n3 implements k1 {
    public Toolbar f17785a;
    public int f17786b;
    public View f17787c;
    public Drawable d;
    public Drawable e;
    public Drawable f17788f;
    public boolean f17789g;
    public CharSequence h;
    public CharSequence f17790i;
    public CharSequence f17791j;
    public Window.Callback f17792k;
    public boolean f17793l;
    public h f17794m;
    public int f17795n;
    public Drawable f17796o;

    public final void a(int i10) {
        View view;
        Toolbar toolbar = this.f17785a;
        int i11 = this.f17786b ^ i10;
        this.f17786b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    b();
                }
                if ((this.f17786b & 4) != 0) {
                    Drawable drawable = this.f17788f;
                    if (drawable == null) {
                        drawable = this.f17796o;
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
                    toolbar.setSubtitle(this.f17790i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) != 0 && (view = this.f17787c) != null) {
                if ((i10 & 16) != 0) {
                    toolbar.addView(view);
                } else {
                    toolbar.removeView(view);
                }
            }
        }
    }

    public final void b() {
        Toolbar toolbar = this.f17785a;
        if ((this.f17786b & 4) != 0) {
            if (TextUtils.isEmpty(this.f17791j)) {
                toolbar.setNavigationContentDescription(this.f17795n);
            } else {
                toolbar.setNavigationContentDescription(this.f17791j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i10 = this.f17786b;
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
        this.f17785a.setLogo(drawable);
    }
}
