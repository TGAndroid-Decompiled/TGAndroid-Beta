package m;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
public final class o3 implements l1 {
    public Toolbar f13566a;
    public int f13567b;
    public View f13568c;
    public Drawable d;
    public Drawable e;
    public Drawable f13569f;
    public boolean f13570g;
    public CharSequence h;
    public CharSequence f13571i;
    public CharSequence f13572j;
    public Window.Callback f13573k;
    public boolean f13574l;
    public h f13575m;
    public int f13576n;
    public Drawable f13577o;

    public final void a(int i10) {
        View view;
        Toolbar toolbar = this.f13566a;
        int i11 = this.f13567b ^ i10;
        this.f13567b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    b();
                }
                if ((this.f13567b & 4) != 0) {
                    Drawable drawable = this.f13569f;
                    if (drawable == null) {
                        drawable = this.f13577o;
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
                    toolbar.setSubtitle(this.f13571i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) != 0 && (view = this.f13568c) != null) {
                if ((i10 & 16) != 0) {
                    toolbar.addView(view);
                } else {
                    toolbar.removeView(view);
                }
            }
        }
    }

    public final void b() {
        Toolbar toolbar = this.f13566a;
        if ((this.f13567b & 4) != 0) {
            if (TextUtils.isEmpty(this.f13572j)) {
                toolbar.setNavigationContentDescription(this.f13576n);
            } else {
                toolbar.setNavigationContentDescription(this.f13572j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i10 = this.f13567b;
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
        this.f13566a.setLogo(drawable);
    }
}
