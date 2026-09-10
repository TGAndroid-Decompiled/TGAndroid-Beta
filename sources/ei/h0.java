package ei;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import bi.a2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.wr;
import s4.c1;
import w7.a6;
public abstract class h0 extends FrameLayout {
    public org.telegram.ui.ActionBar.l f7554a;
    public final ih.f f7555b;
    public final FrameLayout f7556c;
    public r61 d;
    public boolean e;
    public final k0 f7557f;

    public h0(k0 k0Var, Context context) {
        super(context);
        this.f7557f = k0Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f7556c = frameLayout;
        frameLayout.setPadding(0, 0, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, a6.e(-1, -1, 119));
        ?? view = new View(getContext());
        this.f7555b = view;
        view.setupColorKey(j6.f17872a7);
        view.setFadeZoneBottom(AndroidUtilities.dp(72.0f) + AndroidUtilities.navigationBarHeight);
        view.setFadeHeightBottom(AndroidUtilities.dp(24.0f));
        view.setFadeZoneTop(AndroidUtilities.dp(64.0f) + AndroidUtilities.statusBarHeight);
        view.f10617a.b(-AndroidUtilities.dp(20.0f), false);
        frameLayout.addView((View) view, a6.g());
    }

    public final void a() {
        this.d.j(new a2(this, 5));
        g0 g0Var = new g0(this);
        g0Var.n(350L);
        g0Var.o(wr.h);
        g0Var.C = false;
        g0Var.f41645m = false;
        this.d.setItemAnimator(g0Var);
    }

    public float b() {
        float f7 = AndroidUtilities.displaySize.y;
        for (int i10 = 0; i10 < this.d.getChildCount(); i10++) {
            View childAt = this.d.getChildAt(i10);
            c1 T = this.d.T(childAt);
            if (T != null) {
                v51 G = this.d.Y2.G(T.b());
                if (G != null && G.d != 99) {
                    f7 = Math.min(childAt.getY() + this.f7556c.getPaddingTop(), f7);
                }
            }
        }
        return f7;
    }

    public void c() {
        float b10 = b();
        org.telegram.ui.ActionBar.l lVar = this.f7554a;
        if (lVar != null) {
            lVar.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, b10));
        }
    }
}
