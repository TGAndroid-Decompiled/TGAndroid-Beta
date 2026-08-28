package m;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
public final class p3 implements l1 {
    public Toolbar f17037a;
    public int f17038b;
    public View f17039c;
    public Drawable d;
    public Drawable f17040e;
    public Drawable f17041f;
    public boolean f17042g;
    public CharSequence h;
    public CharSequence f17043i;
    public CharSequence f17044j;
    public Window.Callback f17045k;
    public boolean f17046l;
    public i f17047m;
    public int f17048n;
    public Drawable f17049o;

    public final void a(int i9) {
        View view;
        Toolbar toolbar = this.f17037a;
        int i10 = this.f17038b ^ i9;
        this.f17038b = i9;
        if (i10 != 0) {
            if ((i10 & 4) != 0) {
                if ((i9 & 4) != 0) {
                    b();
                }
                if ((this.f17038b & 4) != 0) {
                    Drawable drawable = this.f17041f;
                    if (drawable == null) {
                        drawable = this.f17049o;
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
                if ((i9 & 8) != 0) {
                    toolbar.setTitle(this.h);
                    toolbar.setSubtitle(this.f17043i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i10 & 16) != 0 && (view = this.f17039c) != null) {
                if ((i9 & 16) != 0) {
                    toolbar.addView(view);
                } else {
                    toolbar.removeView(view);
                }
            }
        }
    }

    public final void b() {
        Toolbar toolbar = this.f17037a;
        if ((this.f17038b & 4) != 0) {
            if (TextUtils.isEmpty(this.f17044j)) {
                toolbar.setNavigationContentDescription(this.f17048n);
            } else {
                toolbar.setNavigationContentDescription(this.f17044j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i9 = this.f17038b;
        if ((i9 & 2) != 0) {
            if ((i9 & 1) != 0) {
                drawable = this.f17040e;
                if (drawable == null) {
                    drawable = this.d;
                }
            } else {
                drawable = this.d;
            }
        } else {
            drawable = null;
        }
        this.f17037a.setLogo(drawable);
    }
}
