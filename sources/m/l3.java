package m;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
public final class l3 implements k1 {
    public Toolbar f15794a;
    public int f15795b;
    public View f15796c;
    public Drawable d;
    public Drawable f15797e;
    public Drawable f15798f;
    public boolean f15799g;
    public CharSequence h;
    public CharSequence f15800i;
    public CharSequence f15801j;
    public Window.Callback f15802k;
    public boolean f15803l;
    public h f15804m;
    public int f15805n;
    public Drawable f15806o;

    public final void a(int i10) {
        View view;
        Toolbar toolbar = this.f15794a;
        int i11 = this.f15795b ^ i10;
        this.f15795b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    b();
                }
                if ((this.f15795b & 4) != 0) {
                    Drawable drawable = this.f15798f;
                    if (drawable == null) {
                        drawable = this.f15806o;
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
                    toolbar.setSubtitle(this.f15800i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) != 0 && (view = this.f15796c) != null) {
                if ((i10 & 16) != 0) {
                    toolbar.addView(view);
                } else {
                    toolbar.removeView(view);
                }
            }
        }
    }

    public final void b() {
        Toolbar toolbar = this.f15794a;
        if ((this.f15795b & 4) != 0) {
            if (TextUtils.isEmpty(this.f15801j)) {
                toolbar.setNavigationContentDescription(this.f15805n);
            } else {
                toolbar.setNavigationContentDescription(this.f15801j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i10 = this.f15795b;
        if ((i10 & 2) != 0) {
            if ((i10 & 1) != 0) {
                drawable = this.f15797e;
                if (drawable == null) {
                    drawable = this.d;
                }
            } else {
                drawable = this.d;
            }
        } else {
            drawable = null;
        }
        this.f15794a.setLogo(drawable);
    }
}
