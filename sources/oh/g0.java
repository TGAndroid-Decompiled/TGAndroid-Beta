package oh;

import ag.z2;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import f2.o1;
import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.n41;

public abstract class g0 extends FrameLayout {

    public org.telegram.ui.ActionBar.k f19486a;

    public final sg.f f19487b;

    public final FrameLayout f19488c;
    public k51 d;

    public boolean f19489e;

    public final j0 f19490f;

    public g0(j0 j0Var, Context context) {
        super(context);
        this.f19490f = j0Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f19488c = frameLayout;
        frameLayout.setPadding(0, 0, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, z5.e(-1, -1, 119));
        sg.f fVar = new sg.f(getContext());
        this.f19487b = fVar;
        fVar.setupColorKey(g6.f22999a7);
        fVar.setFadeZoneBottom(AndroidUtilities.dp(72.0f) + AndroidUtilities.navigationBarHeight);
        fVar.setFadeHeightBottom(AndroidUtilities.dp(24.0f));
        fVar.setFadeZoneTop(AndroidUtilities.dp(64.0f) + AndroidUtilities.statusBarHeight);
        fVar.f47911a.b(-AndroidUtilities.dp(20.0f), false);
        frameLayout.addView(fVar, z5.g());
    }

    public final void a() {
        this.d.j(new z2(this, 18));
        f0 f0Var = new f0(this);
        f0Var.n(350L);
        f0Var.o(er.h);
        f0Var.C = false;
        f0Var.f5819m = false;
        this.d.setItemAnimator(f0Var);
    }

    public float b() {
        float fMin = AndroidUtilities.displaySize.y;
        for (int i10 = 0; i10 < this.d.getChildCount(); i10++) {
            View childAt = this.d.getChildAt(i10);
            o1 o1VarT = this.d.T(childAt);
            if (o1VarT != null) {
                n41 n41VarG = this.d.U2.G(o1VarT.b());
                if (n41VarG != null && n41VarG.d != 99) {
                    fMin = Math.min(childAt.getY() + this.f19488c.getPaddingTop(), fMin);
                }
            }
        }
        return fMin;
    }

    public void c() {
        float fB = b();
        org.telegram.ui.ActionBar.k kVar = this.f19486a;
        if (kVar != null) {
            kVar.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, fB));
        }
    }
}
