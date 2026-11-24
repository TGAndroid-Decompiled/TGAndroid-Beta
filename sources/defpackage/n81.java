package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class n81 extends FrameLayout {
    public final jh2 a;
    public final FrameLayout b;
    public final TextView c;
    public boolean d;
    public byte e;
    public final byte f;
    public final i81 h;

    public n81(i81 i81Var, Context context, byte b) {
        super(context);
        this.f = b;
        this.h = i81Var;
        jh2 jh2Var = new jh2(21, null, context);
        this.a = jh2Var;
        jh2Var.setDrawBackgroundAsArc(14);
        jh2Var.b(cmb.h7, cmb.f7, cmb.j7);
        View view = new View(getContext());
        view.setOnClickListener(new k81(this, (byte) 0));
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 16.0f);
        textView.setGravity(5);
        anb.X(textView, cmb.m6, null);
        if (jb6.a0) {
            addView(jh2Var, qoe.d(24, 24.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
            addView(view, qoe.d(40, 40.0f, 21, 0.0f, 0.0f, 0.0f, 0.0f));
            addView(frameLayout, qoe.d(-1, -2.0f, 0, 90.0f, 0.0f, 40.0f, 0.0f));
            addView(textView, qoe.d(69, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
            return;
        }
        addView(jh2Var, qoe.d(24, 24.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
        addView(view, qoe.d(40, 40.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(frameLayout, qoe.d(-1, -2.0f, 0, 48.0f, 0.0f, 90.0f, 0.0f));
        addView(textView, qoe.d(69, -2.0f, 21, 0.0f, 0.0f, 21.0f, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.d) {
            if (jb6.a0) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - gm.L(48.0f), getMeasuredHeight() - 1, cmb.j0);
            } else {
                canvas.drawLine(getMeasuredWidth() - gm.L(90.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, cmb.j0);
            }
        }
    }
}
