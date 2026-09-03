package hg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.z8;
public final class l1 extends FrameLayout {
    public static final int f7555f = 0;
    public final p9 f7556a;
    public final k1 f7557b;
    public final Paint f7558c;
    public boolean d;
    public final z8 f7559e;

    public l1(Context context, float f10) {
        super(context);
        Paint paint = new Paint(1);
        this.f7558c = paint;
        this.d = true;
        this.f7559e = new z8((g6) null);
        p9 p9Var = new p9(getContext());
        this.f7556a = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(f10));
        ?? view = new View(context);
        TextPaint textPaint = new TextPaint(1);
        view.f7542a = textPaint;
        textPaint.setTextAlign(Paint.Align.CENTER);
        int i10 = k6.f21607a7;
        textPaint.setColor(k6.w0(null, i10, false));
        textPaint.setTextSize(AndroidUtilities.dp(11.5f));
        textPaint.setTypeface(AndroidUtilities.bold());
        this.f7557b = view;
        view.setAlpha(0.0f);
        addView(p9Var, c6.d(-1, -1.0f, 0, 5.0f, 5.0f, 5.0f, 5.0f));
        addView((View) view, c6.d(26, 26.0f, 85, 0.0f, 0.0f, 1.0f, 3.0f));
        paint.setColor(k6.w0(null, i10, false));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.d) {
            canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(2.0f), this.f7558c);
        }
        super.dispatchDraw(canvas);
    }
}
