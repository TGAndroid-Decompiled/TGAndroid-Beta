package li;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import bi.u1;
import c8.ma;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.o41;
import v4.f1;
public abstract class b0 extends FrameLayout {
    public org.telegram.ui.ActionBar.k f19921a;
    public final lh.f f19922b;
    public final FrameLayout f19923c;
    public h51 d;
    public boolean f19924e;
    public final d0 f19925f;

    public b0(d0 d0Var, Context context) {
        super(context);
        this.f19925f = d0Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f19923c = frameLayout;
        frameLayout.setPadding(0, 0, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, ma.e(-1, -1, 119));
        lh.f fVar = new lh.f(getContext());
        this.f19922b = fVar;
        fVar.setupColorKey(m6.f29324a7);
        fVar.setFadeZoneBottom(org.telegram.messenger.g0.L(72.0f) + org.telegram.messenger.g0.f24041n);
        fVar.setFadeHeightBottom(org.telegram.messenger.g0.L(24.0f));
        fVar.setFadeZoneTop(org.telegram.messenger.g0.L(64.0f) + org.telegram.messenger.g0.f24040m);
        fVar.f19896a.b(-org.telegram.messenger.g0.L(20.0f), false);
        frameLayout.addView(fVar, ma.g());
    }

    public final void a() {
        this.d.j(new u1(this, 25));
        a0 a0Var = new a0(this);
        a0Var.n(350L);
        a0Var.o(nr.h);
        a0Var.C = false;
        a0Var.f59194m = false;
        this.d.setItemAnimator(a0Var);
    }

    public float b() {
        float f10 = org.telegram.messenger.g0.f24046q.y;
        for (int i7 = 0; i7 < this.d.getChildCount(); i7++) {
            View childAt = this.d.getChildAt(i7);
            f1 T = this.d.T(childAt);
            if (T != null) {
                o41 G = this.d.f35789g3.G(T.b());
                if (G != null && G.d != 99) {
                    f10 = Math.min(childAt.getY() + this.f19923c.getPaddingTop(), f10);
                }
            }
        }
        return f10;
    }

    public void c() {
        float b10 = b();
        org.telegram.ui.ActionBar.k kVar = this.f19921a;
        if (kVar != null) {
            kVar.setTranslationY(Math.max(org.telegram.messenger.g0.f24040m, b10));
        }
    }
}
