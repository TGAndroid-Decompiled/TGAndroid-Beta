package li;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import bi.q1;
import c8.ma;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.lr;
import v4.f1;
public abstract class b0 extends FrameLayout {
    public org.telegram.ui.ActionBar.k f19893a;
    public final lh.f f19894b;
    public final FrameLayout f19895c;
    public e51 d;
    public boolean f19896e;
    public final d0 f19897f;

    public b0(d0 d0Var, Context context) {
        super(context);
        this.f19897f = d0Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f19895c = frameLayout;
        frameLayout.setPadding(0, 0, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, ma.e(-1, -1, 119));
        lh.f fVar = new lh.f(getContext());
        this.f19894b = fVar;
        fVar.setupColorKey(n6.f29339a7);
        fVar.setFadeZoneBottom(org.telegram.messenger.g0.L(72.0f) + org.telegram.messenger.g0.f24116n);
        fVar.setFadeHeightBottom(org.telegram.messenger.g0.L(24.0f));
        fVar.setFadeZoneTop(org.telegram.messenger.g0.L(64.0f) + org.telegram.messenger.g0.f24115m);
        fVar.f19868a.b(-org.telegram.messenger.g0.L(20.0f), false);
        frameLayout.addView(fVar, ma.g());
    }

    public final void a() {
        this.d.j(new q1(this, 25));
        a0 a0Var = new a0(this);
        a0Var.n(350L);
        a0Var.o(lr.h);
        a0Var.C = false;
        a0Var.f59151m = false;
        this.d.setItemAnimator(a0Var);
    }

    public float b() {
        float f10 = org.telegram.messenger.g0.f24121q.y;
        for (int i7 = 0; i7 < this.d.getChildCount(); i7++) {
            View childAt = this.d.getChildAt(i7);
            f1 T = this.d.T(childAt);
            if (T != null) {
                l41 G = this.d.f34607g3.G(T.b());
                if (G != null && G.d != 99) {
                    f10 = Math.min(childAt.getY() + this.f19895c.getPaddingTop(), f10);
                }
            }
        }
        return f10;
    }

    public void c() {
        float b10 = b();
        org.telegram.ui.ActionBar.k kVar = this.f19893a;
        if (kVar != null) {
            kVar.setTranslationY(Math.max(org.telegram.messenger.g0.f24115m, b10));
        }
    }
}
