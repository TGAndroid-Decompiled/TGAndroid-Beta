package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class h6b extends FrameLayout implements vlb {
    public final Paint a;
    public final Paint b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final r63 f;

    public h6b(Context context, r63 r63Var) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        this.f = r63Var;
        paint.setColor(cmb.v0(cmb.p7, r63Var));
        paint2.setColor(-1);
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.c = textView;
        ts2.q(14.0f, 1, 2131744354, textView, null);
        textView.setTextColor(-1);
        addView(textView, qoe.d(-2, -2.0f, 19, 44.0f, 0.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 8.0f);
        textView2.setTextColor(cmb.p1(0.5f, -1));
        textView2.setVisibility(8);
        textView2.setTranslationY(gm.L(9.0f));
        addView(textView2, qoe.d(-2, -2.0f, 19, 44.0f, 0.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.e = textView3;
        textView3.setPadding(gm.L(13.0f), 0, gm.L(13.0f), 0);
        int L = gm.L(16.0f);
        textView3.setBackground(cmb.i0(L, L, L, L, 536870911, 956301311, 956301311));
        textView3.setTypeface(gm.o());
        td4.v(14.0f, 2131743630, 1, textView3, null);
        textView3.setTextColor(-1);
        textView3.setGravity(17);
        addView(textView3, qoe.d(-2, 32.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float L = gm.L(23.0f);
        float height = getHeight() / 2.0f;
        canvas.drawCircle(L, height, gm.L(10.0f), this.a);
        RectF rectF = gm.P;
        rectF.set(L - gm.L(1.0f), height - gm.N(4.6f), gm.L(1.0f) + L, gm.N(1.6f) + height);
        Paint paint = this.b;
        canvas.drawRoundRect(rectF, gm.L(3.0f), gm.L(3.0f), paint);
        rectF.set(L - gm.L(1.0f), gm.N(2.6f) + height, L + gm.L(1.0f), gm.N(4.6f) + height);
        canvas.drawRoundRect(rectF, gm.L(3.0f), gm.L(3.0f), paint);
    }

    public void set(TLRPC.TL_error tL_error) {
        TextView textView = this.c;
        TextView textView2 = this.d;
        if (tL_error != null && !TextUtils.isEmpty(tL_error.text)) {
            textView.setTranslationY(-gm.N(5.33f));
            textView2.setText(tL_error.text);
            textView2.setVisibility(0);
            return;
        }
        textView.setTranslationY(0.0f);
        textView2.setVisibility(8);
    }

    @Override
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.e.setOnClickListener(onClickListener);
    }

    @Override
    public final void updateColors() {
        try {
            this.a.setColor(cmb.v0(cmb.p7, this.f));
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
