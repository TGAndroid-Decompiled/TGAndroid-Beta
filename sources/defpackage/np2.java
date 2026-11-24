package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.a;
public abstract class np2 extends FrameLayout {
    public a a;
    public final e02 b;
    public final FrameLayout c;
    public q7c d;
    public boolean e;
    public final pp2 f;

    public np2(pp2 pp2Var, Context context) {
        super(context);
        this.f = pp2Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        frameLayout.setPadding(0, 0, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, qoe.e(-1, -1, 119));
        e02 e02Var = new e02(getContext());
        this.b = e02Var;
        e02Var.setupColorKey(cmb.Z6);
        e02Var.setFadeZoneBottom(gm.L(72.0f) + gm.n);
        e02Var.setFadeHeightBottom(gm.L(24.0f));
        e02Var.setFadeZoneTop(gm.L(64.0f) + gm.m);
        e02Var.a.b(-gm.L(20.0f), false);
        frameLayout.addView(e02Var, qoe.g());
    }

    public final void a() {
        this.d.j(new ip2(this, (byte) 1));
        mp2 mp2Var = new mp2(this);
        mp2Var.n(350L);
        mp2Var.o(d53.h);
        mp2Var.C = false;
        mp2Var.m = false;
        this.d.setItemAnimator(mp2Var);
    }

    public float b() {
        float f = gm.q.y;
        for (int i = 0; i < this.d.getChildCount(); i++) {
            View childAt = this.d.getChildAt(i);
            u69 T = this.d.T(childAt);
            if (T != null) {
                c6c G = this.d.g3.G(T.b());
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
            aVar.setTranslationY(Math.max(gm.m, b));
        }
    }
}
