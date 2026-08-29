package m;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
public final class o3 implements l1 {
    public Toolbar f16625a;
    public int f16626b;
    public View f16627c;
    public Drawable d;
    public Drawable f16628e;
    public Drawable f16629f;
    public boolean f16630g;
    public CharSequence h;
    public CharSequence f16631i;
    public CharSequence f16632j;
    public Window.Callback f16633k;
    public boolean f16634l;
    public i f16635m;
    public int f16636n;
    public Drawable f16637o;

    public final void a(int i10) {
        View view;
        Toolbar toolbar = this.f16625a;
        int i11 = this.f16626b ^ i10;
        this.f16626b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    b();
                }
                if ((this.f16626b & 4) != 0) {
                    Drawable drawable = this.f16629f;
                    if (drawable == null) {
                        drawable = this.f16637o;
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
                    toolbar.setSubtitle(this.f16631i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) != 0 && (view = this.f16627c) != null) {
                if ((i10 & 16) != 0) {
                    toolbar.addView(view);
                } else {
                    toolbar.removeView(view);
                }
            }
        }
    }

    public final void b() {
        Toolbar toolbar = this.f16625a;
        if ((this.f16626b & 4) != 0) {
            if (TextUtils.isEmpty(this.f16632j)) {
                toolbar.setNavigationContentDescription(this.f16636n);
            } else {
                toolbar.setNavigationContentDescription(this.f16632j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i10 = this.f16626b;
        if ((i10 & 2) != 0) {
            if ((i10 & 1) != 0) {
                drawable = this.f16628e;
                if (drawable == null) {
                    drawable = this.d;
                }
            } else {
                drawable = this.d;
            }
        } else {
            drawable = null;
        }
        this.f16625a.setLogo(drawable);
    }
}
