package gi;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.m61;
import s4.b1;
import w7.z5;
public abstract class h0 extends FrameLayout {
    public org.telegram.ui.ActionBar.k f10189a;
    public final kh.f f10190b;
    public final FrameLayout f10191c;
    public i71 d;
    public boolean e;
    public final k0 f10192f;

    public h0(k0 k0Var, Context context) {
        super(context);
        this.f10192f = k0Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f10191c = frameLayout;
        frameLayout.setPadding(0, 0, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, z5.e(-1, -1, 119));
        ?? view = new View(getContext());
        this.f10190b = view;
        view.setupColorKey(g6.f19543a7);
        view.setFadeZoneBottom(AndroidUtilities.dp(72.0f) + AndroidUtilities.navigationBarHeight);
        view.setFadeHeightBottom(AndroidUtilities.dp(24.0f));
        view.setFadeZoneTop(AndroidUtilities.dp(64.0f) + AndroidUtilities.statusBarHeight);
        view.f14278a.b(-AndroidUtilities.dp(20.0f), false);
        frameLayout.addView((View) view, z5.g());
    }

    public final void a() {
        this.d.j(new ah.d0(this, 7));
        g0 g0Var = new g0(this);
        g0Var.n(350L);
        g0Var.o(es.h);
        g0Var.C = false;
        g0Var.f44872m = false;
        this.d.setItemAnimator(g0Var);
    }

    public float b() {
        float f7 = AndroidUtilities.displaySize.y;
        for (int i10 = 0; i10 < this.d.getChildCount(); i10++) {
            View childAt = this.d.getChildAt(i10);
            b1 T = this.d.T(childAt);
            if (T != null) {
                m61 G = this.d.W2.G(T.b());
                if (G != null && G.d != 99) {
                    f7 = Math.min(childAt.getY() + this.f10191c.getPaddingTop(), f7);
                }
            }
        }
        return f7;
    }

    public void c() {
        float b10 = b();
        org.telegram.ui.ActionBar.k kVar = this.f10189a;
        if (kVar != null) {
            kVar.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, b10));
        }
    }
}
