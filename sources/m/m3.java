package m;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
public final class m3 implements l1 {
    public Toolbar f19159a;
    public int f19160b;
    public View f19161c;
    public Drawable d;
    public Drawable f19162e;
    public Drawable f19163f;
    public boolean f19164g;
    public CharSequence h;
    public CharSequence f19165i;
    public CharSequence f19166j;
    public Window.Callback f19167k;
    public boolean f19168l;
    public i f19169m;
    public int f19170n;
    public Drawable f19171o;

    public final void a(int i7) {
        View view;
        Toolbar toolbar = this.f19159a;
        int i10 = this.f19160b ^ i7;
        this.f19160b = i7;
        if (i10 != 0) {
            if ((i10 & 4) != 0) {
                if ((i7 & 4) != 0) {
                    b();
                }
                if ((this.f19160b & 4) != 0) {
                    Drawable drawable = this.f19163f;
                    if (drawable == null) {
                        drawable = this.f19171o;
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
                    toolbar.setSubtitle(this.f19165i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i10 & 16) != 0 && (view = this.f19161c) != null) {
                if ((i7 & 16) != 0) {
                    toolbar.addView(view);
                } else {
                    toolbar.removeView(view);
                }
            }
        }
    }

    public final void b() {
        Toolbar toolbar = this.f19159a;
        if ((this.f19160b & 4) != 0) {
            if (TextUtils.isEmpty(this.f19166j)) {
                toolbar.setNavigationContentDescription(this.f19170n);
            } else {
                toolbar.setNavigationContentDescription(this.f19166j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i7 = this.f19160b;
        if ((i7 & 2) != 0) {
            if ((i7 & 1) != 0) {
                drawable = this.f19162e;
                if (drawable == null) {
                    drawable = this.d;
                }
            } else {
                drawable = this.d;
            }
        } else {
            drawable = null;
        }
        this.f19159a.setLogo(drawable);
    }
}
