package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.ActionBar.d;
public final class g49 extends FrameLayout {
    public final jd0 a;
    public final TextView b;
    public b49 c;

    public g49(int i, ylb ylbVar, Context context) {
        super(context);
        this.a = new jd0(i, this, gm.L(24.0f), gm.L(10.0f), gm.N(1.0f));
        TextView textView = new TextView(context);
        this.b = textView;
        anb.X(textView, cmb.D8, ylbVar);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(19);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(1, 16.0f);
        setPadding(gm.L(16.0f), 0, gm.L(68.0f), 0);
        addView(textView, qoe.g());
    }

    public final q7c a(d dVar, long j, int i, byte[] bArr, int i2, qac qacVar) {
        b49 b49Var = this.c;
        if (b49Var != null) {
            return b49Var;
        }
        f49 f49Var = new f49(dVar.getCurrentAccount(), dVar.getMessagesController().i1(j), i, bArr, new pp8(this, (byte) 18), qacVar);
        gm.d3(new pp8(f49Var, (byte) 19), 1000L);
        b49 b49Var2 = new b49(dVar, new a49(f49Var, (byte) 0), i2);
        this.c = b49Var2;
        b49Var2.g3.r = false;
        b49Var2.j(new bk1(this, f49Var, (byte) 10));
        return this.c;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int width = getWidth() - gm.L(11.0f);
        jd0 jd0Var = this.a;
        jd0Var.setBounds(width - ((int) jd0Var.c.d.f.a), gm.L(12.0f), getWidth() - gm.L(11.0f), gm.L(24.0f) + gm.L(12.0f));
        jd0Var.c(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.b();
    }

    public void setText(String str) {
        this.b.setText(str);
    }
}
