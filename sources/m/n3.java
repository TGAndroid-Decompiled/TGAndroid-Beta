package m;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
public final class n3 implements k1 {
    public Toolbar f17784a;
    public int f17785b;
    public View f17786c;
    public Drawable d;
    public Drawable e;
    public Drawable f17787f;
    public boolean f17788g;
    public CharSequence h;
    public CharSequence f17789i;
    public CharSequence f17790j;
    public Window.Callback f17791k;
    public boolean f17792l;
    public h f17793m;
    public int f17794n;
    public Drawable f17795o;

    public final void a(int i10) {
        View view;
        Toolbar toolbar = this.f17784a;
        int i11 = this.f17785b ^ i10;
        this.f17785b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    b();
                }
                if ((this.f17785b & 4) != 0) {
                    Drawable drawable = this.f17787f;
                    if (drawable == null) {
                        drawable = this.f17795o;
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
                    toolbar.setSubtitle(this.f17789i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) != 0 && (view = this.f17786c) != null) {
                if ((i10 & 16) != 0) {
                    toolbar.addView(view);
                } else {
                    toolbar.removeView(view);
                }
            }
        }
    }

    public final void b() {
        Toolbar toolbar = this.f17784a;
        if ((this.f17785b & 4) != 0) {
            if (TextUtils.isEmpty(this.f17790j)) {
                toolbar.setNavigationContentDescription(this.f17794n);
            } else {
                toolbar.setNavigationContentDescription(this.f17790j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i10 = this.f17785b;
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
        this.f17784a.setLogo(drawable);
    }
}
