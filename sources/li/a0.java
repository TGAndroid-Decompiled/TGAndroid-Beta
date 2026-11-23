package li;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import bi.v1;
import c8.na;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.n41;
import v4.f1;
public abstract class a0 extends FrameLayout {
    public org.telegram.ui.ActionBar.k f19986a;
    public final lh.f f19987b;
    public final FrameLayout f19988c;
    public g51 d;
    public boolean f19989e;
    public final c0 f19990f;

    public a0(c0 c0Var, Context context) {
        super(context);
        this.f19990f = c0Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f19988c = frameLayout;
        frameLayout.setPadding(0, 0, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, na.e(-1, -1, 119));
        lh.f fVar = new lh.f(getContext());
        this.f19987b = fVar;
        fVar.setupColorKey(n6.f29394a7);
        fVar.setFadeZoneBottom(org.telegram.messenger.g0.L(72.0f) + org.telegram.messenger.g0.f24221n);
        fVar.setFadeHeightBottom(org.telegram.messenger.g0.L(24.0f));
        fVar.setFadeZoneTop(org.telegram.messenger.g0.L(64.0f) + org.telegram.messenger.g0.f24220m);
        fVar.f19962a.b(-org.telegram.messenger.g0.L(20.0f), false);
        frameLayout.addView(fVar, na.g());
    }

    public final void a() {
        this.d.j(new v1(this, 25));
        z zVar = new z(this);
        zVar.n(350L);
        zVar.o(kr.h);
        zVar.C = false;
        zVar.f59274m = false;
        this.d.setItemAnimator(zVar);
    }

    public float b() {
        float f10 = org.telegram.messenger.g0.f24226q.y;
        for (int i7 = 0; i7 < this.d.getChildCount(); i7++) {
            View childAt = this.d.getChildAt(i7);
            f1 T = this.d.T(childAt);
            if (T != null) {
                n41 G = this.d.f35323g3.G(T.b());
                if (G != null && G.d != 99) {
                    f10 = Math.min(childAt.getY() + this.f19988c.getPaddingTop(), f10);
                }
            }
        }
        return f10;
    }

    public void c() {
        float b10 = b();
        org.telegram.ui.ActionBar.k kVar = this.f19986a;
        if (kVar != null) {
            kVar.setTranslationY(Math.max(org.telegram.messenger.g0.f24220m, b10));
        }
    }
}
