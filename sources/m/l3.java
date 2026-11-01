package m;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
public final class l3 implements k1 {
    public Toolbar f12459a;
    public int f12460b;
    public View f12461c;
    public Drawable d;
    public Drawable e;
    public Drawable f12462f;
    public boolean f12463g;
    public CharSequence h;
    public CharSequence f12464i;
    public CharSequence f12465j;
    public Window.Callback f12466k;
    public boolean f12467l;
    public h f12468m;
    public int f12469n;
    public Drawable f12470o;

    public final void a(int i10) {
        View view;
        Toolbar toolbar = this.f12459a;
        int i11 = this.f12460b ^ i10;
        this.f12460b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    b();
                }
                if ((this.f12460b & 4) != 0) {
                    Drawable drawable = this.f12462f;
                    if (drawable == null) {
                        drawable = this.f12470o;
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
                    toolbar.setSubtitle(this.f12464i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) != 0 && (view = this.f12461c) != null) {
                if ((i10 & 16) != 0) {
                    toolbar.addView(view);
                } else {
                    toolbar.removeView(view);
                }
            }
        }
    }

    public final void b() {
        Toolbar toolbar = this.f12459a;
        if ((this.f12460b & 4) != 0) {
            if (TextUtils.isEmpty(this.f12465j)) {
                toolbar.setNavigationContentDescription(this.f12469n);
            } else {
                toolbar.setNavigationContentDescription(this.f12465j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i10 = this.f12460b;
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
        this.f12459a.setLogo(drawable);
    }
}
