package m;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
public final class l3 implements k1 {
    public Toolbar f14480a;
    public int f14481b;
    public View f14482c;
    public Drawable d;
    public Drawable e;
    public Drawable f14483f;
    public boolean f14484g;
    public CharSequence h;
    public CharSequence f14485i;
    public CharSequence f14486j;
    public Window.Callback f14487k;
    public boolean f14488l;
    public h f14489m;
    public int f14490n;
    public Drawable f14491o;

    public final void a(int i10) {
        View view;
        Toolbar toolbar = this.f14480a;
        int i11 = this.f14481b ^ i10;
        this.f14481b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    b();
                }
                if ((this.f14481b & 4) != 0) {
                    Drawable drawable = this.f14483f;
                    if (drawable == null) {
                        drawable = this.f14491o;
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
                    toolbar.setSubtitle(this.f14485i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) != 0 && (view = this.f14482c) != null) {
                if ((i10 & 16) != 0) {
                    toolbar.addView(view);
                } else {
                    toolbar.removeView(view);
                }
            }
        }
    }

    public final void b() {
        Toolbar toolbar = this.f14480a;
        if ((this.f14481b & 4) != 0) {
            if (TextUtils.isEmpty(this.f14486j)) {
                toolbar.setNavigationContentDescription(this.f14490n);
            } else {
                toolbar.setNavigationContentDescription(this.f14486j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i10 = this.f14481b;
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
        this.f14480a.setLogo(drawable);
    }
}
