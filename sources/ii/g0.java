package ii;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.u61;
import s4.e1;
public abstract class g0 extends FrameLayout {
    public org.telegram.ui.ActionBar.k f14346a;
    public final lh.f f14347b;
    public final FrameLayout f14348c;
    public s71 d;
    public boolean e;
    public final j0 f14349f;

    public g0(j0 j0Var, Context context) {
        super(context);
        this.f14349f = j0Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f14348c = frameLayout;
        frameLayout.setPadding(0, 0, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, kb1.i(-1, -1, 119));
        ?? view = new View(getContext());
        this.f14347b = view;
        view.setupColorKey(y6.f23300a7);
        view.setFadeZoneBottom(AndroidUtilities.dp(72.0f) + AndroidUtilities.navigationBarHeight);
        view.setFadeHeightBottom(AndroidUtilities.dp(24.0f));
        view.setFadeZoneTop(AndroidUtilities.dp(64.0f) + AndroidUtilities.statusBarHeight);
        view.f17037a.b(-AndroidUtilities.dp(20.0f), false);
        frameLayout.addView((View) view, kb1.k());
    }

    public final void a() {
        this.d.j(new ai.b(this, 15));
        f0 f0Var = new f0(this);
        f0Var.n(350L);
        f0Var.o(ds.h);
        f0Var.C = false;
        f0Var.f47798m = false;
        this.d.setItemAnimator(f0Var);
    }

    public float b() {
        float f7 = AndroidUtilities.displaySize.y;
        for (int i10 = 0; i10 < this.d.getChildCount(); i10++) {
            View childAt = this.d.getChildAt(i10);
            e1 T = this.d.T(childAt);
            if (T != null) {
                u61 G = this.d.f32504g3.G(T.b());
                if (G != null && G.d != 99) {
                    f7 = Math.min(childAt.getY() + this.f14348c.getPaddingTop(), f7);
                }
            }
        }
        return f7;
    }

    public void c() {
        float b10 = b();
        org.telegram.ui.ActionBar.k kVar = this.f14346a;
        if (kVar != null) {
            kVar.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, b10));
        }
    }
}
