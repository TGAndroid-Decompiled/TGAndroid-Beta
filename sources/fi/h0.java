package fi;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.w51;
import s4.c1;
import w7.y5;
public abstract class h0 extends FrameLayout {
    public org.telegram.ui.ActionBar.k f9092a;
    public final jh.f f9093b;
    public final FrameLayout f9094c;
    public s61 d;
    public boolean e;
    public final k0 f9095f;

    public h0(k0 k0Var, Context context) {
        super(context);
        this.f9095f = k0Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f9094c = frameLayout;
        frameLayout.setPadding(0, 0, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, y5.e(-1, -1, 119));
        ?? view = new View(getContext());
        this.f9093b = view;
        view.setupColorKey(h6.f19003a7);
        view.setFadeZoneBottom(AndroidUtilities.dp(72.0f) + AndroidUtilities.navigationBarHeight);
        view.setFadeHeightBottom(AndroidUtilities.dp(24.0f));
        view.setFadeZoneTop(AndroidUtilities.dp(64.0f) + AndroidUtilities.statusBarHeight);
        view.f13017a.b(-AndroidUtilities.dp(20.0f), false);
        frameLayout.addView((View) view, y5.g());
    }

    public final void a() {
        this.d.j(new ai.r(this, 6));
        g0 g0Var = new g0(this);
        g0Var.n(350L);
        g0Var.o(sr.h);
        g0Var.C = false;
        g0Var.f42994m = false;
        this.d.setItemAnimator(g0Var);
    }

    public float b() {
        float f7 = AndroidUtilities.displaySize.y;
        for (int i10 = 0; i10 < this.d.getChildCount(); i10++) {
            View childAt = this.d.getChildAt(i10);
            c1 T = this.d.T(childAt);
            if (T != null) {
                w51 G = this.d.Y2.G(T.b());
                if (G != null && G.d != 99) {
                    f7 = Math.min(childAt.getY() + this.f9094c.getPaddingTop(), f7);
                }
            }
        }
        return f7;
    }

    public void c() {
        float b10 = b();
        org.telegram.ui.ActionBar.k kVar = this.f9092a;
        if (kVar != null) {
            kVar.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, b10));
        }
    }
}
