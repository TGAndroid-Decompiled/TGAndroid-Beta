package m;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
public final class m3 implements l1 {
    public Toolbar f19167a;
    public int f19168b;
    public View f19169c;
    public Drawable d;
    public Drawable f19170e;
    public Drawable f19171f;
    public boolean f19172g;
    public CharSequence h;
    public CharSequence f19173i;
    public CharSequence f19174j;
    public Window.Callback f19175k;
    public boolean f19176l;
    public i f19177m;
    public int f19178n;
    public Drawable f19179o;

    public final void a(int i7) {
        View view;
        Toolbar toolbar = this.f19167a;
        int i10 = this.f19168b ^ i7;
        this.f19168b = i7;
        if (i10 != 0) {
            if ((i10 & 4) != 0) {
                if ((i7 & 4) != 0) {
                    b();
                }
                if ((this.f19168b & 4) != 0) {
                    Drawable drawable = this.f19171f;
                    if (drawable == null) {
                        drawable = this.f19179o;
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
                    toolbar.setSubtitle(this.f19173i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i10 & 16) != 0 && (view = this.f19169c) != null) {
                if ((i7 & 16) != 0) {
                    toolbar.addView(view);
                } else {
                    toolbar.removeView(view);
                }
            }
        }
    }

    public final void b() {
        Toolbar toolbar = this.f19167a;
        if ((this.f19168b & 4) != 0) {
            if (TextUtils.isEmpty(this.f19174j)) {
                toolbar.setNavigationContentDescription(this.f19178n);
            } else {
                toolbar.setNavigationContentDescription(this.f19174j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i7 = this.f19168b;
        if ((i7 & 2) != 0) {
            if ((i7 & 1) != 0) {
                drawable = this.f19170e;
                if (drawable == null) {
                    drawable = this.d;
                }
            } else {
                drawable = this.d;
            }
        } else {
            drawable = null;
        }
        this.f19167a.setLogo(drawable);
    }
}
