package ei;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import b8.mf;
import java.util.HashSet;
import org.telegram.messenger.bd;
import org.telegram.tgnet.TLRPC;
public final class n8 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final Paint f10677a;
    public final Paint f10678b;
    public final TextView f10679c;
    public final TextView d;
    public final TextView f10680e;
    public final org.telegram.ui.ActionBar.e6 f10681f;

    public n8(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f10677a = paint;
        Paint paint2 = new Paint(1);
        this.f10678b = paint2;
        this.f10681f = e6Var;
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28122q7, e6Var));
        paint2.setColor(-1);
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.f10679c = textView;
        k2.p1.u(textView, 1, 14.0f, null, 2131744678);
        textView.setTextColor(-1);
        addView(textView, mf.d(-2, -2.0f, 19, 44.0f, 0.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 8.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.k6.r1(0.5f, -1));
        textView2.setVisibility(8);
        textView2.setTranslationY(org.telegram.messenger.g0.L(9.0f));
        addView(textView2, mf.d(-2, -2.0f, 19, 44.0f, 0.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.f10680e = textView3;
        textView3.setPadding(org.telegram.messenger.g0.L(13.0f), 0, org.telegram.messenger.g0.L(13.0f), 0);
        int L = org.telegram.messenger.g0.L(16.0f);
        textView3.setBackground(org.telegram.ui.ActionBar.k6.k0(L, L, L, L, 536870911, 956301311, 956301311));
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setText(bd.M0(2131743953, null));
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(-1);
        textView3.setGravity(17);
        addView(textView3, mf.d(-2, 32.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float L = org.telegram.messenger.g0.L(23.0f);
        float height = getHeight() / 2.0f;
        canvas.drawCircle(L, height, org.telegram.messenger.g0.L(10.0f), this.f10677a);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(L - org.telegram.messenger.g0.L(1.0f), height - org.telegram.messenger.g0.N(4.6f), org.telegram.messenger.g0.L(1.0f) + L, org.telegram.messenger.g0.N(1.6f) + height);
        Paint paint = this.f10678b;
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), paint);
        rectF.set(L - org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.N(2.6f) + height, L + org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.N(4.6f) + height);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), paint);
    }

    public void set(TLRPC.TL_error tL_error) {
        TextView textView = this.f10679c;
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
        this.f10680e.setOnClickListener(onClickListener);
    }

    @Override
    public final void updateColors() {
        try {
            this.f10677a.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28122q7, this.f10681f));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
