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
public final class g4b extends FrameLayout implements tjb {
    public final Paint a;
    public final Paint b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final f53 f;

    public g4b(Context context, f53 f53Var) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        this.f = f53Var;
        paint.setColor(bkb.v0(bkb.p7, f53Var));
        paint2.setColor(-1);
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.c = textView;
        ir2.r(14.0f, 1, 2131744428, textView, null);
        textView.setTextColor(-1);
        addView(textView, nme.d(-2, -2.0f, 19, 44.0f, 0.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 8.0f);
        textView2.setTextColor(bkb.p1(0.5f, -1));
        textView2.setVisibility(8);
        textView2.setTranslationY(gl.L(9.0f));
        addView(textView2, nme.d(-2, -2.0f, 19, 44.0f, 0.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.e = textView3;
        textView3.setPadding(gl.L(13.0f), 0, gl.L(13.0f), 0);
        int L = gl.L(16.0f);
        textView3.setBackground(bkb.i0(L, L, L, L, 536870911, 956301311, 956301311));
        textView3.setTypeface(gl.o());
        tb4.u(14.0f, 2131743704, 1, textView3, null);
        textView3.setTextColor(-1);
        textView3.setGravity(17);
        addView(textView3, nme.d(-2, 32.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float L = gl.L(23.0f);
        float height = getHeight() / 2.0f;
        canvas.drawCircle(L, height, gl.L(10.0f), this.a);
        RectF rectF = gl.P;
        rectF.set(L - gl.L(1.0f), height - gl.N(4.6f), gl.L(1.0f) + L, gl.N(1.6f) + height);
        Paint paint = this.b;
        canvas.drawRoundRect(rectF, gl.L(3.0f), gl.L(3.0f), paint);
        rectF.set(L - gl.L(1.0f), gl.N(2.6f) + height, L + gl.L(1.0f), gl.N(4.6f) + height);
        canvas.drawRoundRect(rectF, gl.L(3.0f), gl.L(3.0f), paint);
    }

    public void set(TLRPC.TL_error tL_error) {
        TextView textView = this.c;
        TextView textView2 = this.d;
        if (tL_error != null && !TextUtils.isEmpty(tL_error.text)) {
            textView.setTranslationY(-gl.N(5.33f));
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
            this.a.setColor(bkb.v0(bkb.p7, this.f));
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
