package ki;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.zr;
public final class z1 extends ImageView implements org.telegram.ui.ActionBar.b6 {
    public final int f15743a;
    public int f15744b;
    public boolean f15745c;
    public boolean d;
    public int e;
    public int f15746f;
    public final org.telegram.ui.ActionBar.g6 h;
    public boolean f15747n;
    public boolean f15748r;
    public boolean f15749s;

    public z1(Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.e = 20;
        this.f15746f = k6.f21184d6;
        this.f15747n = true;
        this.f15749s = true;
        this.f15744b = i10;
        this.f15743a = i10;
        this.h = g6Var;
        if (i10 != 0) {
            setImageResource(i10);
        }
        setScaleType(ImageView.ScaleType.CENTER);
        w7.b6.a(this);
        updateColors();
    }

    public final void a() {
        e(this.f15743a);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.Oh));
        hashSet.add(Integer.valueOf(k6.G6));
        hashSet.add(Integer.valueOf(k6.f21273i6));
        hashSet.add(Integer.valueOf(this.f15746f));
    }

    public final void b() {
        if (!this.f15749s) {
            return;
        }
        this.f15749s = false;
        updateColors();
    }

    public final void c(int i10) {
        if (this.f15746f == i10) {
            return;
        }
        this.f15746f = i10;
        updateColors();
    }

    public final void d() {
        this.f15745c = true;
        b2 b2Var = new b2(getContext(), this.f15744b);
        b2Var.d = this.f15746f;
        b2Var.a(this.d);
        setImageDrawable(b2Var);
    }

    public final void e(int i10) {
        if (this.f15744b == i10) {
            return;
        }
        this.f15744b = i10;
        if (this.f15745c) {
            b2 b2Var = new b2(getContext(), i10);
            b2Var.d = this.f15746f;
            b2Var.a(this.d);
            AndroidUtilities.updateImageViewImageAnimated(this, b2Var);
            return;
        }
        AndroidUtilities.updateImageViewImageAnimated(this, i10);
    }

    @Override
    public void setEnabled(boolean z10) {
        float f7;
        if (this.f15747n == z10) {
            return;
        }
        setClickable(z10);
        ViewPropertyAnimator animate = animate();
        this.f15747n = z10;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.5f;
        }
        animate.alpha(f7).setDuration(320L).setInterpolator(zr.h).start();
    }

    public void setPremiumLocked(boolean z10) {
        this.d = z10;
        if (getDrawable() instanceof b2) {
            ((b2) getDrawable()).a(z10);
        }
    }

    @Override
    public void setSelected(boolean z10) {
        if (this.f15748r == z10) {
            return;
        }
        this.f15748r = z10;
        updateColors();
    }

    @Override
    public final void updateColors() {
        int i10;
        boolean z10 = this.f15748r;
        org.telegram.ui.ActionBar.g6 g6Var = this.h;
        if (z10) {
            if (this.f15749s) {
                i10 = k6.Oh;
            } else {
                i10 = k6.G6;
            }
            int x02 = k6.x0(null, i10, false);
            setBackground(k6.a0(k6.v(k6.w0(this.f15746f, g6Var), k6.o1(0.1f, x02)), k6.o1(0.1f, x02), AndroidUtilities.dp(this.e), AndroidUtilities.dp(this.e)));
            setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
            return;
        }
        setBackground(k6.a0(k6.w0(this.f15746f, g6Var), k6.w0(k6.f21273i6, g6Var), AndroidUtilities.dp(this.e), AndroidUtilities.dp(this.e)));
        setColorFilter(new PorterDuffColorFilter(k6.w0(k6.G6, g6Var), PorterDuff.Mode.SRC_IN));
    }
}
