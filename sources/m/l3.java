package m;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
public final class l3 implements k1 {
    public Toolbar f14408a;
    public int f14409b;
    public View f14410c;
    public Drawable d;
    public Drawable e;
    public Drawable f14411f;
    public boolean f14412g;
    public CharSequence h;
    public CharSequence f14413i;
    public CharSequence f14414j;
    public Window.Callback f14415k;
    public boolean f14416l;
    public h f14417m;
    public int f14418n;
    public Drawable f14419o;

    public final void a(int i10) {
        View view;
        Toolbar toolbar = this.f14408a;
        int i11 = this.f14409b ^ i10;
        this.f14409b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    b();
                }
                if ((this.f14409b & 4) != 0) {
                    Drawable drawable = this.f14411f;
                    if (drawable == null) {
                        drawable = this.f14419o;
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
                    toolbar.setSubtitle(this.f14413i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) != 0 && (view = this.f14410c) != null) {
                if ((i10 & 16) != 0) {
                    toolbar.addView(view);
                } else {
                    toolbar.removeView(view);
                }
            }
        }
    }

    public final void b() {
        Toolbar toolbar = this.f14408a;
        if ((this.f14409b & 4) != 0) {
            if (TextUtils.isEmpty(this.f14414j)) {
                toolbar.setNavigationContentDescription(this.f14418n);
            } else {
                toolbar.setNavigationContentDescription(this.f14414j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i10 = this.f14409b;
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
        this.f14408a.setLogo(drawable);
    }
}
