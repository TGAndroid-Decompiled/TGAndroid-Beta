package li;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
public final class x1 extends ImageView implements p6 {
    public final int f17611a;
    public int f17612b;
    public boolean f17613c;
    public boolean d;
    public int e;
    public int f17614f;
    public final u6 h;
    public boolean f17615n;
    public boolean f17616r;
    public boolean f17617s;

    public x1(Context context, int i10, u6 u6Var) {
        super(context);
        this.e = 20;
        this.f17614f = y6.f23356d6;
        this.f17615n = true;
        this.f17617s = true;
        this.f17612b = i10;
        this.f17611a = i10;
        this.h = u6Var;
        if (i10 != 0) {
            setImageResource(i10);
        }
        setScaleType(ImageView.ScaleType.CENTER);
        gb1.b(this);
        updateColors();
    }

    public final void a() {
        e(this.f17611a);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(y6.Oh));
        hashSet.add(Integer.valueOf(y6.G6));
        hashSet.add(Integer.valueOf(y6.f23448i6));
        hashSet.add(Integer.valueOf(this.f17614f));
    }

    public final void b() {
        if (!this.f17617s) {
            return;
        }
        this.f17617s = false;
        updateColors();
    }

    public final void c(int i10) {
        if (this.f17614f == i10) {
            return;
        }
        this.f17614f = i10;
        updateColors();
    }

    public final void d() {
        this.f17613c = true;
        z1 z1Var = new z1(getContext(), this.f17612b);
        z1Var.d = this.f17614f;
        z1Var.a(this.d);
        setImageDrawable(z1Var);
    }

    public final void e(int i10) {
        if (this.f17612b == i10) {
            return;
        }
        this.f17612b = i10;
        if (this.f17613c) {
            z1 z1Var = new z1(getContext(), i10);
            z1Var.d = this.f17614f;
            z1Var.a(this.d);
            AndroidUtilities.updateImageViewImageAnimated(this, z1Var);
            return;
        }
        AndroidUtilities.updateImageViewImageAnimated(this, i10);
    }

    @Override
    public void setEnabled(boolean z10) {
        float f7;
        if (this.f17615n == z10) {
            return;
        }
        setClickable(z10);
        ViewPropertyAnimator animate = animate();
        this.f17615n = z10;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.5f;
        }
        animate.alpha(f7).setDuration(320L).setInterpolator(ds.h).start();
    }

    public void setPremiumLocked(boolean z10) {
        this.d = z10;
        if (getDrawable() instanceof z1) {
            ((z1) getDrawable()).a(z10);
        }
    }

    @Override
    public void setSelected(boolean z10) {
        if (this.f17616r == z10) {
            return;
        }
        this.f17616r = z10;
        updateColors();
    }

    @Override
    public final void updateColors() {
        int i10;
        boolean z10 = this.f17616r;
        u6 u6Var = this.h;
        if (z10) {
            if (this.f17617s) {
                i10 = y6.Oh;
            } else {
                i10 = y6.G6;
            }
            int x02 = y6.x0(null, i10, false);
            setBackground(y6.a0(y6.v(y6.w0(this.f17614f, u6Var), y6.o1(0.1f, x02)), y6.o1(0.1f, x02), AndroidUtilities.dp(this.e), AndroidUtilities.dp(this.e)));
            setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
            return;
        }
        setBackground(y6.a0(y6.w0(this.f17614f, u6Var), y6.w0(y6.f23448i6, u6Var), AndroidUtilities.dp(this.e), AndroidUtilities.dp(this.e)));
        setColorFilter(new PorterDuffColorFilter(y6.w0(y6.G6, u6Var), PorterDuff.Mode.SRC_IN));
    }
}
