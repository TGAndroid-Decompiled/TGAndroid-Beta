package defpackage;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class f72 extends p02 {
    public final g24 n;
    public final o39 r;
    public final byte s;
    public final jr w;
    public int x;

    public f72(int i, x02 x02Var, wjb wjbVar, Context context) {
        super(x02Var, wjbVar, context);
        this.s = i;
        g24 g24Var = new g24(context, wjbVar);
        this.n = g24Var;
        g24Var.setText(k96.M0(2131747988, null));
        g24Var.setOnTouchListener(null);
        g24Var.setTextSize(16);
        addView(g24Var, nme.c(-2.0f, -1));
        g24Var.a(2131624088, 150, 150);
        TLRPC.Chat S0 = this.b.S0();
        if (i == 1) {
            g24Var.setText(hc2.L(7, S0));
        } else if (i == 3) {
            g24Var.setText(hc2.L(18, S0));
        } else if (i == 4) {
            g24Var.setText(hc2.L(19, S0));
        } else {
            g24Var.setText(hc2.L(22, S0));
        }
        g24Var.c();
        o39 o39Var = new o39(context, wjbVar);
        this.r = o39Var;
        o39Var.setSectionsType(2);
        o39Var.setVerticalScrollBarEnabled(false);
        o39Var.setLayoutManager(new t26());
        o39Var.setClipToPadding(false);
        jr jrVar = new jr(this, (byte) 4);
        this.w = jrVar;
        o39Var.setAdapter(jrVar);
        o39Var.setPadding(0, 0, 0, gl.L(48.0f));
        o39Var.setOnScrollListener(new y(this, (byte) 23));
        addView(o39Var, nme.c(-1.0f, -1));
    }

    @Override
    public final void C(int r3, int r4) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f72.C(int, int):void");
    }

    @Override
    public int getCurrentItemTop() {
        o39 o39Var = this.r;
        if (o39Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i = 0;
        View childAt = o39Var.getChildAt(0);
        y29 y29Var = (y29) o39Var.G(childAt);
        int top = childAt.getTop() - gl.L(8.0f);
        if (top > 0 && y29Var != null && y29Var.b() == 0) {
            i = top;
        }
        if (top < 0 || y29Var == null || y29Var.b() != 0) {
            top = i;
        }
        g24 g24Var = this.n;
        g24Var.setTranslationY(((((getMeasuredHeight() - top) - gl.L(50.0f)) - g24Var.getMeasuredHeight()) / 2) + top);
        return gl.L(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return gl.L(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.r.getPaddingTop();
    }

    @Override
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        this.b.b.invalidate();
    }
}
