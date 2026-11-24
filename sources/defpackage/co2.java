package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.a;
public abstract class co2 extends FrameLayout {
    public a a;
    public final ry1 b;
    public final FrameLayout c;
    public q5c d;
    public boolean e;
    public final eo2 f;

    public co2(eo2 eo2Var, Context context) {
        super(context);
        this.f = eo2Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        frameLayout.setPadding(0, 0, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, nme.e(-1, -1, 119));
        ry1 ry1Var = new ry1(getContext());
        this.b = ry1Var;
        ry1Var.setupColorKey(bkb.Z6);
        ry1Var.setFadeZoneBottom(gl.L(72.0f) + gl.n);
        ry1Var.setFadeHeightBottom(gl.L(24.0f));
        ry1Var.setFadeZoneTop(gl.L(64.0f) + gl.m);
        ry1Var.a.b(-gl.L(20.0f), false);
        frameLayout.addView(ry1Var, nme.g());
    }

    public final void a() {
        this.d.j(new ao2(this, (byte) 0));
        bo2 bo2Var = new bo2(this);
        bo2Var.n(350L);
        bo2Var.o(s33.h);
        bo2Var.C = false;
        bo2Var.m = false;
        this.d.setItemAnimator(bo2Var);
    }

    public float b() {
        float f = gl.q.y;
        for (int i = 0; i < this.d.getChildCount(); i++) {
            View childAt = this.d.getChildAt(i);
            s49 T = this.d.T(childAt);
            if (T != null) {
                c4c G = this.d.g3.G(T.b());
                if (G != null && G.d != 99) {
                    f = Math.min(childAt.getY() + this.c.getPaddingTop(), f);
                }
            }
        }
        return f;
    }

    public void c() {
        float b = b();
        a aVar = this.a;
        if (aVar != null) {
            aVar.setTranslationY(Math.max(gl.m, b));
        }
    }
}
