package m;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
public final class o3 implements l1 {
    public Toolbar f16276a;
    public int f16277b;
    public View f16278c;
    public Drawable d;
    public Drawable e;
    public Drawable f16279f;
    public boolean f16280g;
    public CharSequence h;
    public CharSequence f16281i;
    public CharSequence f16282j;
    public Window.Callback f16283k;
    public boolean f16284l;
    public i f16285m;
    public int f16286n;
    public Drawable f16287o;

    public final void a(int i10) {
        View view;
        Toolbar toolbar = this.f16276a;
        int i11 = this.f16277b ^ i10;
        this.f16277b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    b();
                }
                if ((this.f16277b & 4) != 0) {
                    Drawable drawable = this.f16279f;
                    if (drawable == null) {
                        drawable = this.f16287o;
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
                    toolbar.setSubtitle(this.f16281i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) != 0 && (view = this.f16278c) != null) {
                if ((i10 & 16) != 0) {
                    toolbar.addView(view);
                } else {
                    toolbar.removeView(view);
                }
            }
        }
    }

    public final void b() {
        Toolbar toolbar = this.f16276a;
        if ((this.f16277b & 4) != 0) {
            if (TextUtils.isEmpty(this.f16282j)) {
                toolbar.setNavigationContentDescription(this.f16286n);
            } else {
                toolbar.setNavigationContentDescription(this.f16282j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i10 = this.f16277b;
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
        this.f16276a.setLogo(drawable);
    }
}
