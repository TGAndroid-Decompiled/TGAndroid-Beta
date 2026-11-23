package li;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import bi.v1;
import c8.na;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.o41;
import v4.e1;
public abstract class b0 extends FrameLayout {
    public org.telegram.ui.ActionBar.k f19887a;
    public final lh.f f19888b;
    public final FrameLayout f19889c;
    public h51 d;
    public boolean f19890e;
    public final d0 f19891f;

    public b0(d0 d0Var, Context context) {
        super(context);
        this.f19891f = d0Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f19889c = frameLayout;
        frameLayout.setPadding(0, 0, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, na.e(-1, -1, 119));
        lh.f fVar = new lh.f(getContext());
        this.f19888b = fVar;
        fVar.setupColorKey(m6.f29290a7);
        fVar.setFadeZoneBottom(org.telegram.messenger.g0.L(72.0f) + org.telegram.messenger.g0.f24005n);
        fVar.setFadeHeightBottom(org.telegram.messenger.g0.L(24.0f));
        fVar.setFadeZoneTop(org.telegram.messenger.g0.L(64.0f) + org.telegram.messenger.g0.f24004m);
        fVar.f19862a.b(-org.telegram.messenger.g0.L(20.0f), false);
        frameLayout.addView(fVar, na.g());
    }

    public final void a() {
        this.d.j(new v1(this, 25));
        a0 a0Var = new a0(this);
        a0Var.n(350L);
        a0Var.o(nr.h);
        a0Var.C = false;
        a0Var.f59139m = false;
        this.d.setItemAnimator(a0Var);
    }

    public float b() {
        float f10 = org.telegram.messenger.g0.f24010q.y;
        for (int i7 = 0; i7 < this.d.getChildCount(); i7++) {
            View childAt = this.d.getChildAt(i7);
            e1 T = this.d.T(childAt);
            if (T != null) {
                o41 G = this.d.f35742g3.G(T.b());
                if (G != null && G.d != 99) {
                    f10 = Math.min(childAt.getY() + this.f19889c.getPaddingTop(), f10);
                }
            }
        }
        return f10;
    }

    public void c() {
        float b10 = b();
        org.telegram.ui.ActionBar.k kVar = this.f19887a;
        if (kVar != null) {
            kVar.setTranslationY(Math.max(org.telegram.messenger.g0.f24004m, b10));
        }
    }
}
