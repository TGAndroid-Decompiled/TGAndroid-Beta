package gi;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.pr;
import s4.c1;
import w7.x5;
public abstract class h0 extends FrameLayout {
    public org.telegram.ui.ActionBar.k f10720a;
    public final kh.f f10721b;
    public final FrameLayout f10722c;
    public d61 d;
    public boolean f10723e;
    public final k0 f10724f;

    public h0(k0 k0Var, Context context) {
        super(context);
        this.f10724f = k0Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f10722c = frameLayout;
        frameLayout.setPadding(0, 0, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, x5.e(-1, -1, 119));
        ?? view = new View(getContext());
        this.f10721b = view;
        view.setupColorKey(j6.f20634a7);
        view.setFadeZoneBottom(AndroidUtilities.dp(72.0f) + AndroidUtilities.navigationBarHeight);
        view.setFadeHeightBottom(AndroidUtilities.dp(24.0f));
        view.setFadeZoneTop(AndroidUtilities.dp(64.0f) + AndroidUtilities.statusBarHeight);
        view.f14981a.b(-AndroidUtilities.dp(20.0f), false);
        frameLayout.addView((View) view, x5.g());
    }

    public final void a() {
        this.d.j(new ah.e0(this, 8));
        g0 g0Var = new g0(this);
        g0Var.n(350L);
        g0Var.o(pr.h);
        g0Var.C = false;
        g0Var.f45805m = false;
        this.d.setItemAnimator(g0Var);
    }

    public float b() {
        float f7 = AndroidUtilities.displaySize.y;
        for (int i10 = 0; i10 < this.d.getChildCount(); i10++) {
            View childAt = this.d.getChildAt(i10);
            c1 T = this.d.T(childAt);
            if (T != null) {
                h51 G = this.d.Y2.G(T.b());
                if (G != null && G.d != 99) {
                    f7 = Math.min(childAt.getY() + this.f10722c.getPaddingTop(), f7);
                }
            }
        }
        return f7;
    }

    public void c() {
        float b10 = b();
        org.telegram.ui.ActionBar.k kVar = this.f10720a;
        if (kVar != null) {
            kVar.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, b10));
        }
    }
}
