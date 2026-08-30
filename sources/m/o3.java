package m;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
public final class o3 implements l1 {
    public Toolbar f13582a;
    public int f13583b;
    public View f13584c;
    public Drawable d;
    public Drawable e;
    public Drawable f13585f;
    public boolean f13586g;
    public CharSequence h;
    public CharSequence f13587i;
    public CharSequence f13588j;
    public Window.Callback f13589k;
    public boolean f13590l;
    public h f13591m;
    public int f13592n;
    public Drawable f13593o;

    public final void a(int i10) {
        View view;
        Toolbar toolbar = this.f13582a;
        int i11 = this.f13583b ^ i10;
        this.f13583b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    b();
                }
                if ((this.f13583b & 4) != 0) {
                    Drawable drawable = this.f13585f;
                    if (drawable == null) {
                        drawable = this.f13593o;
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
                    toolbar.setSubtitle(this.f13587i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) != 0 && (view = this.f13584c) != null) {
                if ((i10 & 16) != 0) {
                    toolbar.addView(view);
                } else {
                    toolbar.removeView(view);
                }
            }
        }
    }

    public final void b() {
        Toolbar toolbar = this.f13582a;
        if ((this.f13583b & 4) != 0) {
            if (TextUtils.isEmpty(this.f13588j)) {
                toolbar.setNavigationContentDescription(this.f13592n);
            } else {
                toolbar.setNavigationContentDescription(this.f13588j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i10 = this.f13583b;
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
        this.f13582a.setLogo(drawable);
    }
}
