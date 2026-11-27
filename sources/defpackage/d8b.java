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
public final class d8b extends FrameLayout implements snb {
    public final Paint a;
    public final Paint b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final x53 f;

    public d8b(Context context, x53 x53Var) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        this.f = x53Var;
        paint.setColor(aob.v0(aob.q7, x53Var));
        paint2.setColor(-1);
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.c = textView;
        bs2.r(14.0f, 1, 2131744322, textView, null);
        textView.setTextColor(-1);
        addView(textView, tre.d(-2, -2.0f, 19, 44.0f, 0.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 8.0f);
        textView2.setTextColor(aob.p1(0.5f, -1));
        textView2.setVisibility(8);
        textView2.setTranslationY(hl.L(9.0f));
        addView(textView2, tre.d(-2, -2.0f, 19, 44.0f, 0.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.e = textView3;
        textView3.setPadding(hl.L(13.0f), 0, hl.L(13.0f), 0);
        int L = hl.L(16.0f);
        textView3.setBackground(aob.i0(L, L, L, L, 536870911, 956301311, 956301311));
        textView3.setTypeface(hl.o());
        qd4.u(14.0f, 2131743598, 1, textView3, null);
        textView3.setTextColor(-1);
        textView3.setGravity(17);
        addView(textView3, tre.d(-2, 32.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float L = hl.L(23.0f);
        float height = getHeight() / 2.0f;
        canvas.drawCircle(L, height, hl.L(10.0f), this.a);
        RectF rectF = hl.P;
        rectF.set(L - hl.L(1.0f), height - hl.N(4.6f), hl.L(1.0f) + L, hl.N(1.6f) + height);
        Paint paint = this.b;
        canvas.drawRoundRect(rectF, hl.L(3.0f), hl.L(3.0f), paint);
        rectF.set(L - hl.L(1.0f), hl.N(2.6f) + height, L + hl.L(1.0f), hl.N(4.6f) + height);
        canvas.drawRoundRect(rectF, hl.L(3.0f), hl.L(3.0f), paint);
    }

    public void set(TLRPC.TL_error tL_error) {
        TextView textView = this.c;
        TextView textView2 = this.d;
        if (tL_error != null && !TextUtils.isEmpty(tL_error.text)) {
            textView.setTranslationY(-hl.N(5.33f));
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
            this.a.setColor(aob.v0(aob.q7, this.f));
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
