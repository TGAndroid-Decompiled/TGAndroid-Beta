package m;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
public final class o3 implements l1 {
    public Toolbar f16338a;
    public int f16339b;
    public View f16340c;
    public Drawable d;
    public Drawable e;
    public Drawable f16341f;
    public boolean f16342g;
    public CharSequence h;
    public CharSequence f16343i;
    public CharSequence f16344j;
    public Window.Callback f16345k;
    public boolean f16346l;
    public i f16347m;
    public int f16348n;
    public Drawable f16349o;

    public final void a(int i10) {
        View view;
        Toolbar toolbar = this.f16338a;
        int i11 = this.f16339b ^ i10;
        this.f16339b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    b();
                }
                if ((this.f16339b & 4) != 0) {
                    Drawable drawable = this.f16341f;
                    if (drawable == null) {
                        drawable = this.f16349o;
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
                    toolbar.setSubtitle(this.f16343i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) != 0 && (view = this.f16340c) != null) {
                if ((i10 & 16) != 0) {
                    toolbar.addView(view);
                } else {
                    toolbar.removeView(view);
                }
            }
        }
    }

    public final void b() {
        Toolbar toolbar = this.f16338a;
        if ((this.f16339b & 4) != 0) {
            if (TextUtils.isEmpty(this.f16344j)) {
                toolbar.setNavigationContentDescription(this.f16348n);
            } else {
                toolbar.setNavigationContentDescription(this.f16344j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i10 = this.f16339b;
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
        this.f16338a.setLogo(drawable);
    }
}
