package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.ActionBar.d;
public final class c29 extends FrameLayout {
    public final jc0 a;
    public final TextView b;
    public x19 c;

    public c29(int i, wjb wjbVar, Context context) {
        super(context);
        this.a = new jc0(i, this, gl.L(24.0f), gl.L(10.0f), gl.N(1.0f));
        TextView textView = new TextView(context);
        this.b = textView;
        zkb.X(textView, bkb.D8, wjbVar);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(19);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(1, 16.0f);
        setPadding(gl.L(16.0f), 0, gl.L(68.0f), 0);
        addView(textView, nme.g());
    }

    public final q5c a(d dVar, long j, int i, byte[] bArr, int i2, p8c p8cVar) {
        x19 x19Var = this.c;
        if (x19Var != null) {
            return x19Var;
        }
        b29 b29Var = new b29(dVar.getCurrentAccount(), dVar.getMessagesController().h1(j), i, bArr, new sr8(this, (byte) 10), p8cVar);
        gl.e3(new sr8(b29Var, (byte) 11), 1000L);
        x19 x19Var2 = new x19(dVar, new w19(b29Var, (byte) 0), i2);
        this.c = x19Var2;
        x19Var2.g3.r = false;
        x19Var2.j(new si1(this, b29Var, (byte) 10));
        return this.c;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int width = getWidth() - gl.L(11.0f);
        jc0 jc0Var = this.a;
        jc0Var.setBounds(width - ((int) jc0Var.c.d.f.a), gl.L(12.0f), getWidth() - gl.L(11.0f), gl.L(24.0f) + gl.L(12.0f));
        jc0Var.c(canvas);
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
