package m;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
public final class l3 implements k1 {
    public Toolbar f14459a;
    public int f14460b;
    public View f14461c;
    public Drawable d;
    public Drawable e;
    public Drawable f14462f;
    public boolean f14463g;
    public CharSequence h;
    public CharSequence f14464i;
    public CharSequence f14465j;
    public Window.Callback f14466k;
    public boolean f14467l;
    public h f14468m;
    public int f14469n;
    public Drawable f14470o;

    public final void a(int i10) {
        View view;
        Toolbar toolbar = this.f14459a;
        int i11 = this.f14460b ^ i10;
        this.f14460b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    b();
                }
                if ((this.f14460b & 4) != 0) {
                    Drawable drawable = this.f14462f;
                    if (drawable == null) {
                        drawable = this.f14470o;
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
                    toolbar.setSubtitle(this.f14464i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) != 0 && (view = this.f14461c) != null) {
                if ((i10 & 16) != 0) {
                    toolbar.addView(view);
                } else {
                    toolbar.removeView(view);
                }
            }
        }
    }

    public final void b() {
        Toolbar toolbar = this.f14459a;
        if ((this.f14460b & 4) != 0) {
            if (TextUtils.isEmpty(this.f14465j)) {
                toolbar.setNavigationContentDescription(this.f14469n);
            } else {
                toolbar.setNavigationContentDescription(this.f14465j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i10 = this.f14460b;
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
        this.f14459a.setLogo(drawable);
    }
}
