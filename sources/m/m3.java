package m;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
public final class m3 implements l1 {
    public Toolbar f19162a;
    public int f19163b;
    public View f19164c;
    public Drawable d;
    public Drawable f19165e;
    public Drawable f19166f;
    public boolean f19167g;
    public CharSequence h;
    public CharSequence f19168i;
    public CharSequence f19169j;
    public Window.Callback f19170k;
    public boolean f19171l;
    public i f19172m;
    public int f19173n;
    public Drawable f19174o;

    public final void a(int i7) {
        View view;
        Toolbar toolbar = this.f19162a;
        int i10 = this.f19163b ^ i7;
        this.f19163b = i7;
        if (i10 != 0) {
            if ((i10 & 4) != 0) {
                if ((i7 & 4) != 0) {
                    b();
                }
                if ((this.f19163b & 4) != 0) {
                    Drawable drawable = this.f19166f;
                    if (drawable == null) {
                        drawable = this.f19174o;
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
                    toolbar.setSubtitle(this.f19168i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i10 & 16) != 0 && (view = this.f19164c) != null) {
                if ((i7 & 16) != 0) {
                    toolbar.addView(view);
                } else {
                    toolbar.removeView(view);
                }
            }
        }
    }

    public final void b() {
        Toolbar toolbar = this.f19162a;
        if ((this.f19163b & 4) != 0) {
            if (TextUtils.isEmpty(this.f19169j)) {
                toolbar.setNavigationContentDescription(this.f19173n);
            } else {
                toolbar.setNavigationContentDescription(this.f19169j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i7 = this.f19163b;
        if ((i7 & 2) != 0) {
            if ((i7 & 1) != 0) {
                drawable = this.f19165e;
                if (drawable == null) {
                    drawable = this.d;
                }
            } else {
                drawable = this.d;
            }
        } else {
            drawable = null;
        }
        this.f19162a.setLogo(drawable);
    }
}
