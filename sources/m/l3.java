package m;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
public final class l3 implements k1 {
    public Toolbar f14464a;
    public int f14465b;
    public View f14466c;
    public Drawable d;
    public Drawable e;
    public Drawable f14467f;
    public boolean f14468g;
    public CharSequence h;
    public CharSequence f14469i;
    public CharSequence f14470j;
    public Window.Callback f14471k;
    public boolean f14472l;
    public h f14473m;
    public int f14474n;
    public Drawable f14475o;

    public final void a(int i10) {
        View view;
        Toolbar toolbar = this.f14464a;
        int i11 = this.f14465b ^ i10;
        this.f14465b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    b();
                }
                if ((this.f14465b & 4) != 0) {
                    Drawable drawable = this.f14467f;
                    if (drawable == null) {
                        drawable = this.f14475o;
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
                    toolbar.setSubtitle(this.f14469i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) != 0 && (view = this.f14466c) != null) {
                if ((i10 & 16) != 0) {
                    toolbar.addView(view);
                } else {
                    toolbar.removeView(view);
                }
            }
        }
    }

    public final void b() {
        Toolbar toolbar = this.f14464a;
        if ((this.f14465b & 4) != 0) {
            if (TextUtils.isEmpty(this.f14470j)) {
                toolbar.setNavigationContentDescription(this.f14474n);
            } else {
                toolbar.setNavigationContentDescription(this.f14470j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i10 = this.f14465b;
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
        this.f14464a.setLogo(drawable);
    }
}
