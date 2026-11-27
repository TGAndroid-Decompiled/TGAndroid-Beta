package defpackage;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class w72 extends f12 {
    public final b34 n;
    public final d79 r;
    public final byte s;
    public final kr w;
    public int x;

    public w72(int i, n12 n12Var, vnb vnbVar, Context context) {
        super(n12Var, vnbVar, context);
        this.s = i;
        b34 b34Var = new b34(context, vnbVar);
        this.n = b34Var;
        b34Var.setText(ob6.M0(2131747911, null));
        b34Var.setOnTouchListener(null);
        b34Var.setTextSize(16);
        addView(b34Var, tre.c(-2.0f, -1));
        b34Var.a(2131624088, 150, 150);
        TLRPC.Chat T0 = this.b.T0();
        if (i == 1) {
            b34Var.setText(xc2.L(7, T0));
        } else if (i == 3) {
            b34Var.setText(xc2.L(18, T0));
        } else if (i == 4) {
            b34Var.setText(xc2.L(19, T0));
        } else {
            b34Var.setText(xc2.L(22, T0));
        }
        b34Var.c();
        d79 d79Var = new d79(context, vnbVar);
        this.r = d79Var;
        d79Var.setSectionsType(2);
        d79Var.setVerticalScrollBarEnabled(false);
        d79Var.setLayoutManager(new x46());
        d79Var.setClipToPadding(false);
        kr krVar = new kr(this, (byte) 4);
        this.w = krVar;
        d79Var.setAdapter(krVar);
        d79Var.setPadding(0, 0, 0, hl.L(48.0f));
        d79Var.setOnScrollListener(new y(this, (byte) 23));
        addView(d79Var, tre.c(-1.0f, -1));
    }

    @Override
    public final void C(int r3, int r4) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w72.C(int, int):void");
    }

    @Override
    public int getCurrentItemTop() {
        d79 d79Var = this.r;
        if (d79Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i = 0;
        View childAt = d79Var.getChildAt(0);
        n69 n69Var = (n69) d79Var.H(childAt);
        int top = childAt.getTop() - hl.L(8.0f);
        if (top > 0 && n69Var != null && n69Var.b() == 0) {
            i = top;
        }
        if (top < 0 || n69Var == null || n69Var.b() != 0) {
            top = i;
        }
        b34 b34Var = this.n;
        b34Var.setTranslationY(((((getMeasuredHeight() - top) - hl.L(50.0f)) - b34Var.getMeasuredHeight()) / 2) + top);
        return hl.L(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return hl.L(4.0f) + getListTopPadding();
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
