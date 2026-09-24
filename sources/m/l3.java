package m;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
public final class l3 implements k1 {
    public Toolbar f14449a;
    public int f14450b;
    public View f14451c;
    public Drawable d;
    public Drawable e;
    public Drawable f14452f;
    public boolean f14453g;
    public CharSequence h;
    public CharSequence f14454i;
    public CharSequence f14455j;
    public Window.Callback f14456k;
    public boolean f14457l;
    public h f14458m;
    public int f14459n;
    public Drawable f14460o;

    public final void a(int i10) {
        View view;
        Toolbar toolbar = this.f14449a;
        int i11 = this.f14450b ^ i10;
        this.f14450b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    b();
                }
                if ((this.f14450b & 4) != 0) {
                    Drawable drawable = this.f14452f;
                    if (drawable == null) {
                        drawable = this.f14460o;
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
                    toolbar.setSubtitle(this.f14454i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) != 0 && (view = this.f14451c) != null) {
                if ((i10 & 16) != 0) {
                    toolbar.addView(view);
                } else {
                    toolbar.removeView(view);
                }
            }
        }
    }

    public final void b() {
        Toolbar toolbar = this.f14449a;
        if ((this.f14450b & 4) != 0) {
            if (TextUtils.isEmpty(this.f14455j)) {
                toolbar.setNavigationContentDescription(this.f14459n);
            } else {
                toolbar.setNavigationContentDescription(this.f14455j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i10 = this.f14450b;
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
        this.f14449a.setLogo(drawable);
    }
}
