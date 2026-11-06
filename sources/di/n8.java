package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.ha;
import java.util.HashSet;
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLRPC;
public final class n8 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final Paint f9431a;
    public final Paint f9432b;
    public final TextView f9433c;
    public final TextView d;
    public final TextView f9434e;
    public final org.telegram.ui.ActionBar.f6 f9435f;

    public n8(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f9431a = paint;
        Paint paint2 = new Paint(1);
        this.f9432b = paint2;
        this.f9435f = f6Var;
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28090q7, f6Var));
        paint2.setColor(-1);
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.f9433c = textView;
        jg.g.v(textView, 1, 14.0f, null, 2131744669);
        textView.setTextColor(-1);
        addView(textView, ha.d(-2, -2.0f, 19, 44.0f, 0.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 8.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.k6.r1(0.5f, -1));
        textView2.setVisibility(8);
        textView2.setTranslationY(org.telegram.messenger.g0.L(9.0f));
        addView(textView2, ha.d(-2, -2.0f, 19, 44.0f, 0.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.f9434e = textView3;
        textView3.setPadding(org.telegram.messenger.g0.L(13.0f), 0, org.telegram.messenger.g0.L(13.0f), 0);
        int L = org.telegram.messenger.g0.L(16.0f);
        textView3.setBackground(org.telegram.ui.ActionBar.k6.k0(L, L, L, L, 536870911, 956301311, 956301311));
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setText(hd.M0(2131743944, null));
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(-1);
        textView3.setGravity(17);
        addView(textView3, ha.d(-2, 32.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float L = org.telegram.messenger.g0.L(23.0f);
        float height = getHeight() / 2.0f;
        canvas.drawCircle(L, height, org.telegram.messenger.g0.L(10.0f), this.f9431a);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(L - org.telegram.messenger.g0.L(1.0f), height - org.telegram.messenger.g0.N(4.6f), org.telegram.messenger.g0.L(1.0f) + L, org.telegram.messenger.g0.N(1.6f) + height);
        Paint paint = this.f9432b;
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), paint);
        rectF.set(L - org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.N(2.6f) + height, L + org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.N(4.6f) + height);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), paint);
    }

    public void set(TLRPC.TL_error tL_error) {
        TextView textView = this.f9433c;
        TextView textView2 = this.d;
        if (tL_error != null && !TextUtils.isEmpty(tL_error.text)) {
            textView.setTranslationY(-org.telegram.messenger.g0.N(5.33f));
            textView2.setText(tL_error.text);
            textView2.setVisibility(0);
            return;
        }
        textView.setTranslationY(0.0f);
        textView2.setVisibility(8);
    }

    @Override
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f9434e.setOnClickListener(onClickListener);
    }

    @Override
    public final void updateColors() {
        try {
            this.f9431a.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28090q7, this.f9435f));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
