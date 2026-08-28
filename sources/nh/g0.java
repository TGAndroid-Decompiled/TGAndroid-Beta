package nh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import bg.o2;
import f2.q1;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.l41;
public abstract class g0 extends FrameLayout {
    public org.telegram.ui.ActionBar.k f18637a;
    public final rg.f f18638b;
    public final FrameLayout f18639c;
    public i51 d;
    public boolean f18640e;
    public final j0 f18641f;

    public g0(j0 j0Var, Context context) {
        super(context);
        this.f18641f = j0Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f18639c = frameLayout;
        frameLayout.setPadding(0, 0, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, e6.e(-1, -1, 119));
        ?? view = new View(getContext());
        this.f18638b = view;
        view.setupColorKey(f6.f22947a7);
        view.setFadeZoneBottom(AndroidUtilities.dp(72.0f) + AndroidUtilities.navigationBarHeight);
        view.setFadeHeightBottom(AndroidUtilities.dp(24.0f));
        view.setFadeZoneTop(AndroidUtilities.dp(64.0f) + AndroidUtilities.statusBarHeight);
        view.f47190a.b(-AndroidUtilities.dp(20.0f), false);
        frameLayout.addView((View) view, e6.g());
    }

    public final void a() {
        this.d.j(new o2(this, 17));
        f0 f0Var = new f0(this);
        f0Var.n(350L);
        f0Var.o(gr.h);
        f0Var.C = false;
        f0Var.f5532m = false;
        this.d.setItemAnimator(f0Var);
    }

    public float b() {
        float f10 = AndroidUtilities.displaySize.y;
        for (int i9 = 0; i9 < this.d.getChildCount(); i9++) {
            View childAt = this.d.getChildAt(i9);
            q1 T = this.d.T(childAt);
            if (T != null) {
                l41 G = this.d.U2.G(T.b());
                if (G != null && G.d != 99) {
                    f10 = Math.min(childAt.getY() + this.f18639c.getPaddingTop(), f10);
                }
            }
        }
        return f10;
    }

    public void c() {
        float b10 = b();
        org.telegram.ui.ActionBar.k kVar = this.f18637a;
        if (kVar != null) {
            kVar.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, b10));
        }
    }
}
