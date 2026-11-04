package ji;

import ai.j5;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import b8.mf;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.xq;
import u4.d1;
public abstract class z extends FrameLayout {
    public org.telegram.ui.ActionBar.k f16379a;
    public final mh.f f16380b;
    public final FrameLayout f16381c;
    public l41 d;
    public boolean f16382e;
    public final b0 f16383f;

    public z(b0 b0Var, Context context) {
        super(context);
        this.f16383f = b0Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f16381c = frameLayout;
        frameLayout.setPadding(0, 0, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, mf.e(-1, -1, 119));
        mh.f fVar = new mh.f(getContext());
        this.f16380b = fVar;
        fVar.setupColorKey(k6.f27824a7);
        fVar.setFadeZoneBottom(org.telegram.messenger.g0.L(72.0f) + org.telegram.messenger.g0.f22603n);
        fVar.setFadeHeightBottom(org.telegram.messenger.g0.L(24.0f));
        fVar.setFadeZoneTop(org.telegram.messenger.g0.L(64.0f) + org.telegram.messenger.g0.f22602m);
        fVar.f19407a.b(-org.telegram.messenger.g0.L(20.0f), false);
        frameLayout.addView(fVar, mf.g());
    }

    public final void a() {
        this.d.j(new j5(this, 21));
        y yVar = new y(this);
        yVar.n(350L);
        yVar.o(xq.h);
        yVar.C = false;
        yVar.f55567m = false;
        this.d.setItemAnimator(yVar);
    }

    public float b() {
        float f10 = org.telegram.messenger.g0.f22608q.y;
        for (int i3 = 0; i3 < this.d.getChildCount(); i3++) {
            View childAt = this.d.getChildAt(i3);
            d1 T = this.d.T(childAt);
            if (T != null) {
                r31 G = this.d.f35594g3.G(T.b());
                if (G != null && G.d != 99) {
                    f10 = Math.min(childAt.getY() + this.f16381c.getPaddingTop(), f10);
                }
            }
        }
        return f10;
    }

    public void c() {
        float b10 = b();
        org.telegram.ui.ActionBar.k kVar = this.f16379a;
        if (kVar != null) {
            kVar.setTranslationY(Math.max(org.telegram.messenger.g0.f22602m, b10));
        }
    }
}
