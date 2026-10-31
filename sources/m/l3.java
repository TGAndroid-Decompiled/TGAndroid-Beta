package m;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
public final class l3 implements k1 {
    public Toolbar f12458a;
    public int f12459b;
    public View f12460c;
    public Drawable d;
    public Drawable e;
    public Drawable f12461f;
    public boolean f12462g;
    public CharSequence h;
    public CharSequence f12463i;
    public CharSequence f12464j;
    public Window.Callback f12465k;
    public boolean f12466l;
    public h f12467m;
    public int f12468n;
    public Drawable f12469o;

    public final void a(int i10) {
        View view;
        Toolbar toolbar = this.f12458a;
        int i11 = this.f12459b ^ i10;
        this.f12459b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    b();
                }
                if ((this.f12459b & 4) != 0) {
                    Drawable drawable = this.f12461f;
                    if (drawable == null) {
                        drawable = this.f12469o;
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
                    toolbar.setSubtitle(this.f12463i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) != 0 && (view = this.f12460c) != null) {
                if ((i10 & 16) != 0) {
                    toolbar.addView(view);
                } else {
                    toolbar.removeView(view);
                }
            }
        }
    }

    public final void b() {
        Toolbar toolbar = this.f12458a;
        if ((this.f12459b & 4) != 0) {
            if (TextUtils.isEmpty(this.f12464j)) {
                toolbar.setNavigationContentDescription(this.f12468n);
            } else {
                toolbar.setNavigationContentDescription(this.f12464j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i10 = this.f12459b;
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
        this.f12458a.setLogo(drawable);
    }
}
