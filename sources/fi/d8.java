package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.ma;
import java.util.HashSet;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLRPC;
public final class d8 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final Paint f11861a;
    public final Paint f11862b;
    public final TextView f11863c;
    public final TextView d;
    public final TextView f11864e;
    public final org.telegram.ui.ActionBar.i6 f11865f;

    public d8(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f11861a = paint;
        Paint paint2 = new Paint(1);
        this.f11862b = paint2;
        this.f11865f = i6Var;
        paint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29637q7, i6Var));
        paint2.setColor(-1);
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.f11863c = textView;
        i5.c.r(14.0f, 1, 2131744433, textView, null);
        textView.setTextColor(-1);
        addView(textView, ma.d(-2, -2.0f, 19, 44.0f, 0.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 8.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.n6.r1(0.5f, -1));
        textView2.setVisibility(8);
        textView2.setTranslationY(org.telegram.messenger.g0.L(9.0f));
        addView(textView2, ma.d(-2, -2.0f, 19, 44.0f, 0.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.f11864e = textView3;
        textView3.setPadding(org.telegram.messenger.g0.L(13.0f), 0, org.telegram.messenger.g0.L(13.0f), 0);
        int L = org.telegram.messenger.g0.L(16.0f);
        textView3.setBackground(org.telegram.ui.ActionBar.n6.k0(L, L, L, L, 536870911, 956301311, 956301311));
        textView3.setTypeface(org.telegram.messenger.g0.o());
        n10.l(14.0f, 2131743706, 1, textView3, null);
        textView3.setTextColor(-1);
        textView3.setGravity(17);
        addView(textView3, ma.d(-2, 32.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float L = org.telegram.messenger.g0.L(23.0f);
        float height = getHeight() / 2.0f;
        canvas.drawCircle(L, height, org.telegram.messenger.g0.L(10.0f), this.f11861a);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(L - org.telegram.messenger.g0.L(1.0f), height - org.telegram.messenger.g0.N(4.6f), org.telegram.messenger.g0.L(1.0f) + L, org.telegram.messenger.g0.N(1.6f) + height);
        Paint paint = this.f11862b;
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), paint);
        rectF.set(L - org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.N(2.6f) + height, L + org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.N(4.6f) + height);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), paint);
    }

    public void set(TLRPC.TL_error tL_error) {
        TextView textView = this.f11863c;
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
        this.f11864e.setOnClickListener(onClickListener);
    }

    @Override
    public final void updateColors() {
        try {
            this.f11861a.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29637q7, this.f11865f));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
