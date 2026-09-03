package gg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.z8;
public final class l1 extends FrameLayout {
    public static final int f6692f = 0;
    public final p9 f6693a;
    public final k1 f6694b;
    public final Paint f6695c;
    public boolean d;
    public final z8 e;

    public l1(Context context, float f10) {
        super(context);
        Paint paint = new Paint(1);
        this.f6695c = paint;
        this.d = true;
        this.e = new z8((f6) null);
        p9 p9Var = new p9(getContext());
        this.f6693a = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(f10));
        ?? view = new View(context);
        TextPaint textPaint = new TextPaint(1);
        view.f6680a = textPaint;
        textPaint.setTextAlign(Paint.Align.CENTER);
        int i10 = j6.f19827a7;
        textPaint.setColor(j6.w0(null, i10, false));
        textPaint.setTextSize(AndroidUtilities.dp(11.5f));
        textPaint.setTypeface(AndroidUtilities.bold());
        this.f6694b = view;
        view.setAlpha(0.0f);
        addView(p9Var, b6.d(-1, -1.0f, 0, 5.0f, 5.0f, 5.0f, 5.0f));
        addView((View) view, b6.d(26, 26.0f, 85, 0.0f, 0.0f, 1.0f, 3.0f));
        paint.setColor(j6.w0(null, i10, false));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.d) {
            canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(2.0f), this.f6695c);
        }
        super.dispatchDraw(canvas);
    }
}
