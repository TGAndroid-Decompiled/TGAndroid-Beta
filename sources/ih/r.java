package ih;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import bi.t3;
import org.telegram.messenger.i0;
import org.telegram.messenger.q20;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.w8;
import w7.b6;
public final class r extends FrameLayout {
    public final w8 f8574a;
    public final TextView f8575b;
    public l f8576c;

    public r(int i10, Context context, p6 p6Var) {
        super(context);
        this.f8574a = new w8(i10, this, i0.L(24.0f), i0.L(10.0f), i0.N(1.0f));
        TextView textView = new TextView(context);
        this.f8575b = textView;
        a7.V(textView, t6.E8, p6Var);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(19);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(1, 16.0f);
        setPadding(i0.L(16.0f), 0, i0.L(68.0f), 0);
        addView(textView, b6.g());
    }

    public final u51 a(k2 k2Var, long j10, int i10, byte[] bArr, int i11, q20 q20Var) {
        l lVar = this.f8576c;
        if (lVar != null) {
            return lVar;
        }
        q qVar = new q(k2Var.getCurrentAccount(), k2Var.getMessagesController().i1(j10), i10, bArr, new gg.c(this, 12), q20Var);
        i0.h3(new gg.c(qVar, 13), 1000L);
        l lVar2 = new l(k2Var, new k(qVar, 0), i11);
        this.f8576c = lVar2;
        lVar2.f30819f3.f29295r = false;
        lVar2.j(new t3(1, this, qVar));
        return this.f8576c;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int width = getWidth() - i0.L(11.0f);
        w8 w8Var = this.f8574a;
        w8Var.setBounds(width - ((int) w8Var.f32101c.d.f7041f.f7048a), i0.L(12.0f), getWidth() - i0.L(11.0f), i0.L(24.0f) + i0.L(12.0f));
        w8Var.c(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f8574a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f8574a.b();
    }

    public void setText(String str) {
        this.f8575b.setText(str);
    }
}
