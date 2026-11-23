package m;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
public final class k3 implements k1 {
    public Toolbar f20192a;
    public int f20193b;
    public View f20194c;
    public Drawable d;
    public Drawable f20195e;
    public Drawable f20196f;
    public boolean f20197g;
    public CharSequence h;
    public CharSequence f20198i;
    public CharSequence f20199j;
    public Window.Callback f20200k;
    public boolean f20201l;
    public h f20202m;
    public int f20203n;
    public Drawable f20204o;

    public final void a(int i7) {
        View view;
        Toolbar toolbar = this.f20192a;
        int i10 = this.f20193b ^ i7;
        this.f20193b = i7;
        if (i10 != 0) {
            if ((i10 & 4) != 0) {
                if ((i7 & 4) != 0) {
                    b();
                }
                if ((this.f20193b & 4) != 0) {
                    Drawable drawable = this.f20196f;
                    if (drawable == null) {
                        drawable = this.f20204o;
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
                    toolbar.setSubtitle(this.f20198i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i10 & 16) != 0 && (view = this.f20194c) != null) {
                if ((i7 & 16) != 0) {
                    toolbar.addView(view);
                } else {
                    toolbar.removeView(view);
                }
            }
        }
    }

    public final void b() {
        Toolbar toolbar = this.f20192a;
        if ((this.f20193b & 4) != 0) {
            if (TextUtils.isEmpty(this.f20199j)) {
                toolbar.setNavigationContentDescription(this.f20203n);
            } else {
                toolbar.setNavigationContentDescription(this.f20199j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i7 = this.f20193b;
        if ((i7 & 2) != 0) {
            if ((i7 & 1) != 0) {
                drawable = this.f20195e;
                if (drawable == null) {
                    drawable = this.d;
                }
            } else {
                drawable = this.d;
            }
        } else {
            drawable = null;
        }
        this.f20192a.setLogo(drawable);
    }
}
