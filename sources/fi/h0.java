package fi;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.tr;
import s4.c1;
import w7.z5;
public abstract class h0 extends FrameLayout {
    public org.telegram.ui.ActionBar.k f9897a;
    public final jh.f f9898b;
    public final FrameLayout f9899c;
    public c71 d;
    public boolean f9900e;
    public final k0 f9901f;

    public h0(k0 k0Var, Context context) {
        super(context);
        this.f9901f = k0Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f9899c = frameLayout;
        frameLayout.setPadding(0, 0, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, z5.e(-1, -1, 119));
        ?? view = new View(getContext());
        this.f9898b = view;
        view.setupColorKey(i6.f20761a7);
        view.setFadeZoneBottom(AndroidUtilities.dp(72.0f) + AndroidUtilities.navigationBarHeight);
        view.setFadeHeightBottom(AndroidUtilities.dp(24.0f));
        view.setFadeZoneTop(AndroidUtilities.dp(64.0f) + AndroidUtilities.statusBarHeight);
        view.f14151a.b(-AndroidUtilities.dp(20.0f), false);
        frameLayout.addView((View) view, z5.g());
    }

    public final void a() {
        this.d.j(new ai.r(this, 7));
        g0 g0Var = new g0(this);
        g0Var.n(350L);
        g0Var.o(tr.h);
        g0Var.C = false;
        g0Var.f46562m = false;
        this.d.setItemAnimator(g0Var);
    }

    public float b() {
        float f7 = AndroidUtilities.displaySize.y;
        for (int i10 = 0; i10 < this.d.getChildCount(); i10++) {
            View childAt = this.d.getChildAt(i10);
            c1 T = this.d.T(childAt);
            if (T != null) {
                g61 G = this.d.f25244f3.G(T.b());
                if (G != null && G.d != 99) {
                    f7 = Math.min(childAt.getY() + this.f9899c.getPaddingTop(), f7);
                }
            }
        }
        return f7;
    }

    public void c() {
        float b10 = b();
        org.telegram.ui.ActionBar.k kVar = this.f9897a;
        if (kVar != null) {
            kVar.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, b10));
        }
    }
}
