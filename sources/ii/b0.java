package ii;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import c8.ha;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.xq;
import v4.d1;
public abstract class b0 extends FrameLayout {
    public org.telegram.ui.ActionBar.k f15487a;
    public final lh.f f15488b;
    public final FrameLayout f15489c;
    public p41 d;
    public boolean f15490e;
    public final d0 f15491f;

    public b0(d0 d0Var, Context context) {
        super(context);
        this.f15491f = d0Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f15489c = frameLayout;
        frameLayout.setPadding(0, 0, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, ha.e(-1, -1, 119));
        lh.f fVar = new lh.f(getContext());
        this.f15488b = fVar;
        fVar.setupColorKey(k6.f27792a7);
        fVar.setFadeZoneBottom(org.telegram.messenger.g0.L(72.0f) + org.telegram.messenger.g0.f22532n);
        fVar.setFadeHeightBottom(org.telegram.messenger.g0.L(24.0f));
        fVar.setFadeZoneTop(org.telegram.messenger.g0.L(64.0f) + org.telegram.messenger.g0.f22531m);
        fVar.f18365a.b(-org.telegram.messenger.g0.L(20.0f), false);
        frameLayout.addView(fVar, ha.g());
    }

    public final void a() {
        this.d.j(new ai.b(this, 18));
        a0 a0Var = new a0(this);
        a0Var.n(350L);
        a0Var.o(xq.h);
        a0Var.C = false;
        a0Var.f56979m = false;
        this.d.setItemAnimator(a0Var);
    }

    public float b() {
        float f10 = org.telegram.messenger.g0.f22537q.y;
        for (int i7 = 0; i7 < this.d.getChildCount(); i7++) {
            View childAt = this.d.getChildAt(i7);
            d1 T = this.d.T(childAt);
            if (T != null) {
                w31 G = this.d.f36781f3.G(T.b());
                if (G != null && G.d != 99) {
                    f10 = Math.min(childAt.getY() + this.f15489c.getPaddingTop(), f10);
                }
            }
        }
        return f10;
    }

    public void c() {
        float b10 = b();
        org.telegram.ui.ActionBar.k kVar = this.f15487a;
        if (kVar != null) {
            kVar.setTranslationY(Math.max(org.telegram.messenger.g0.f22531m, b10));
        }
    }
}
