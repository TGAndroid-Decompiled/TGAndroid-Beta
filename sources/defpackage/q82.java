package defpackage;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class q82 extends a22 {
    public final r34 n;
    public final r59 r;
    public final byte s;
    public final js w;
    public int x;

    public q82(int i, i22 i22Var, ylb ylbVar, Context context) {
        super(i22Var, ylbVar, context);
        this.s = i;
        r34 r34Var = new r34(context, ylbVar);
        this.n = r34Var;
        r34Var.setText(jb6.M0(2131747914, null));
        r34Var.setOnTouchListener(null);
        r34Var.setTextSize(16);
        addView(r34Var, qoe.c(-2.0f, -1));
        r34Var.a(2131624088, 150, 150);
        TLRPC.Chat S0 = this.b.S0();
        if (i == 1) {
            r34Var.setText(sd2.L(7, S0));
        } else if (i == 3) {
            r34Var.setText(sd2.L(18, S0));
        } else if (i == 4) {
            r34Var.setText(sd2.L(19, S0));
        } else {
            r34Var.setText(sd2.L(22, S0));
        }
        r34Var.c();
        r59 r59Var = new r59(context, ylbVar);
        this.r = r59Var;
        r59Var.setSectionsType(2);
        r59Var.setVerticalScrollBarEnabled(false);
        r59Var.setLayoutManager(new u46());
        r59Var.setClipToPadding(false);
        js jsVar = new js(this, (byte) 4);
        this.w = jsVar;
        r59Var.setAdapter(jsVar);
        r59Var.setPadding(0, 0, 0, gm.L(48.0f));
        r59Var.setOnScrollListener(new y(this, (byte) 24));
        addView(r59Var, qoe.c(-1.0f, -1));
    }

    @Override
    public final void B(int r3, int r4) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q82.B(int, int):void");
    }

    @Override
    public int getCurrentItemTop() {
        r59 r59Var = this.r;
        if (r59Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i = 0;
        View childAt = r59Var.getChildAt(0);
        b59 b59Var = (b59) r59Var.G(childAt);
        int top = childAt.getTop() - gm.L(8.0f);
        if (top > 0 && b59Var != null && b59Var.b() == 0) {
            i = top;
        }
        if (top < 0 || b59Var == null || b59Var.b() != 0) {
            top = i;
        }
        r34 r34Var = this.n;
        r34Var.setTranslationY(((((getMeasuredHeight() - top) - gm.L(50.0f)) - r34Var.getMeasuredHeight()) / 2) + top);
        return gm.L(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return gm.L(4.0f) + getListTopPadding();
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
