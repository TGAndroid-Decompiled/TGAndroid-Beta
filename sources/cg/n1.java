package cg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.widget.FrameLayout;
import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.y8;

public final class n1 extends FrameLayout {

    public static final int f2781f = 0;

    public final n9 f2782a;

    public final m1 f2783b;

    public final Paint f2784c;
    public boolean d;

    public final y8 f2785e;

    public n1(Context context, float f10) {
        super(context);
        Paint paint = new Paint(1);
        this.f2784c = paint;
        this.d = true;
        this.f2785e = new y8((c6) null);
        n9 n9Var = new n9(getContext());
        this.f2782a = n9Var;
        n9Var.setRoundRadius(AndroidUtilities.dp(f10));
        m1 m1Var = new m1(context);
        TextPaint textPaint = new TextPaint(1);
        m1Var.f2773a = textPaint;
        textPaint.setTextAlign(Paint.Align.CENTER);
        int i10 = g6.f22999a7;
        textPaint.setColor(g6.w0(null, i10, false));
        textPaint.setTextSize(AndroidUtilities.dp(11.5f));
        textPaint.setTypeface(AndroidUtilities.bold());
        this.f2783b = m1Var;
        m1Var.setAlpha(0.0f);
        addView(n9Var, z5.d(-1, -1.0f, 0, 5.0f, 5.0f, 5.0f, 5.0f));
        addView(m1Var, z5.d(26, 26.0f, 85, 0.0f, 0.0f, 1.0f, 3.0f));
        paint.setColor(g6.w0(null, i10, false));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.d) {
            canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(2.0f), this.f2784c);
        }
        super.dispatchDraw(canvas);
    }
}
