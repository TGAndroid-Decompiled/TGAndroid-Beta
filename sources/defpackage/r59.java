package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.ActionBar.e;
public final class r59 extends FrameLayout {
    public final lc0 a;
    public final TextView b;
    public m59 c;

    public r59(int i, vnb vnbVar, Context context) {
        super(context);
        this.a = new lc0(i, this, hl.L(24.0f), hl.L(10.0f), hl.N(1.0f));
        TextView textView = new TextView(context);
        this.b = textView;
        yob.X(textView, aob.E8, vnbVar);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(19);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(1, 16.0f);
        setPadding(hl.L(16.0f), 0, hl.L(68.0f), 0);
        addView(textView, tre.g());
    }

    public final q9c a(e eVar, long j, int i, byte[] bArr, int i2, pcc pccVar) {
        m59 m59Var = this.c;
        if (m59Var != null) {
            return m59Var;
        }
        q59 q59Var = new q59(eVar.getCurrentAccount(), eVar.getMessagesController().j1(j), i, bArr, new uk8(this, (byte) 26), pccVar);
        hl.d3(new uk8(q59Var, (byte) 27), 1000L);
        m59 m59Var2 = new m59(eVar, new l59(q59Var, (byte) 0), i2);
        this.c = m59Var2;
        m59Var2.g3.r = false;
        m59Var2.j(new bj1(this, q59Var, (byte) 10));
        return this.c;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int width = getWidth() - hl.L(11.0f);
        lc0 lc0Var = this.a;
        lc0Var.setBounds(width - ((int) lc0Var.c.d.f.a), hl.L(12.0f), getWidth() - hl.L(11.0f), hl.L(24.0f) + hl.L(12.0f));
        lc0Var.c(canvas);
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
