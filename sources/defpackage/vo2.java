package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.a;
public abstract class vo2 extends FrameLayout {
    public a a;
    public final jz1 b;
    public final FrameLayout c;
    public q9c d;
    public boolean e;
    public final xo2 f;

    public vo2(xo2 xo2Var, Context context) {
        super(context);
        this.f = xo2Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        frameLayout.setPadding(0, 0, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, tre.e(-1, -1, 119));
        jz1 jz1Var = new jz1(getContext());
        this.b = jz1Var;
        jz1Var.setupColorKey(aob.a7);
        jz1Var.setFadeZoneBottom(hl.L(72.0f) + hl.n);
        jz1Var.setFadeHeightBottom(hl.L(24.0f));
        jz1Var.setFadeZoneTop(hl.L(64.0f) + hl.m);
        jz1Var.a.b(-hl.L(20.0f), false);
        frameLayout.addView(jz1Var, tre.g());
    }

    public final void a() {
        this.d.j(new to2(this, (byte) 0));
        uo2 uo2Var = new uo2(this);
        uo2Var.n(350L);
        uo2Var.o(k43.h);
        uo2Var.C = false;
        uo2Var.m = false;
        this.d.setItemAnimator(uo2Var);
    }

    public float b() {
        float f = hl.q.y;
        for (int i = 0; i < this.d.getChildCount(); i++) {
            View childAt = this.d.getChildAt(i);
            f89 U = this.d.U(childAt);
            if (U != null) {
                b8c G = this.d.g3.G(U.b());
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
            aVar.setTranslationY(Math.max(hl.m, b));
        }
    }
}
