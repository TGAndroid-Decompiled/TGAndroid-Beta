package li;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import bi.z4;
import c8.ja;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.u41;
import v4.e1;
public abstract class b0 extends FrameLayout {
    public org.telegram.ui.ActionBar.k f19526a;
    public final lh.f f19527b;
    public final FrameLayout f19528c;
    public u41 d;
    public boolean f19529e;
    public final d0 f19530f;

    public b0(d0 d0Var, Context context) {
        super(context);
        this.f19530f = d0Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f19528c = frameLayout;
        frameLayout.setPadding(0, 0, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, ja.e(-1, -1, 119));
        lh.f fVar = new lh.f(getContext());
        this.f19527b = fVar;
        fVar.setupColorKey(j6.f28792a7);
        fVar.setFadeZoneBottom(org.telegram.messenger.g0.L(72.0f) + org.telegram.messenger.g0.f23606n);
        fVar.setFadeHeightBottom(org.telegram.messenger.g0.L(24.0f));
        fVar.setFadeZoneTop(org.telegram.messenger.g0.L(64.0f) + org.telegram.messenger.g0.f23605m);
        fVar.f19501a.b(-org.telegram.messenger.g0.L(20.0f), false);
        frameLayout.addView(fVar, ja.g());
    }

    public final void a() {
        this.d.j(new z4(this, 24));
        a0 a0Var = new a0(this);
        a0Var.n(350L);
        a0Var.o(er.h);
        a0Var.C = false;
        a0Var.f58564m = false;
        this.d.setItemAnimator(a0Var);
    }

    public float b() {
        float f10 = org.telegram.messenger.g0.f23611q.y;
        for (int i7 = 0; i7 < this.d.getChildCount(); i7++) {
            View childAt = this.d.getChildAt(i7);
            e1 T = this.d.T(childAt);
            if (T != null) {
                b41 G = this.d.f39892g3.G(T.b());
                if (G != null && G.d != 99) {
                    f10 = Math.min(childAt.getY() + this.f19528c.getPaddingTop(), f10);
                }
            }
        }
        return f10;
    }

    public void c() {
        float b10 = b();
        org.telegram.ui.ActionBar.k kVar = this.f19526a;
        if (kVar != null) {
            kVar.setTranslationY(Math.max(org.telegram.messenger.g0.f23605m, b10));
        }
    }
}
