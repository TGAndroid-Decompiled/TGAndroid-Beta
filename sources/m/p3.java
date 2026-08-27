package m;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

public final class p3 implements l1 {

    public Toolbar f17412a;

    public int f17413b;

    public View f17414c;
    public Drawable d;

    public Drawable f17415e;

    public Drawable f17416f;

    public boolean f17417g;
    public CharSequence h;

    public CharSequence f17418i;

    public CharSequence f17419j;

    public Window.Callback f17420k;

    public boolean f17421l;

    public i f17422m;

    public int f17423n;

    public Drawable f17424o;

    public final void a(int i10) {
        View view;
        Toolbar toolbar = this.f17412a;
        int i11 = this.f17413b ^ i10;
        this.f17413b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    b();
                }
                if ((this.f17413b & 4) != 0) {
                    Drawable drawable = this.f17416f;
                    if (drawable == null) {
                        drawable = this.f17424o;
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
                    toolbar.setSubtitle(this.f17418i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) == 0 || (view = this.f17414c) == null) {
                return;
            }
            if ((i10 & 16) != 0) {
                toolbar.addView(view);
            } else {
                toolbar.removeView(view);
            }
        }
    }

    public final void b() {
        Toolbar toolbar = this.f17412a;
        if ((this.f17413b & 4) != 0) {
            if (TextUtils.isEmpty(this.f17419j)) {
                toolbar.setNavigationContentDescription(this.f17423n);
            } else {
                toolbar.setNavigationContentDescription(this.f17419j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i10 = this.f17413b;
        if ((i10 & 2) == 0) {
            drawable = null;
        } else if ((i10 & 1) == 0 || (drawable = this.f17415e) == null) {
            drawable = this.d;
        }
        this.f17412a.setLogo(drawable);
    }
}
