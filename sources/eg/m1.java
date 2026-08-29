package eg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.t9;
public final class m1 extends FrameLayout {
    public static final int f6087f = 0;
    public final t9 f6088a;
    public final l1 f6089b;
    public final Paint f6090c;
    public boolean d;
    public final e9 f6091e;

    public m1(Context context, float f9) {
        super(context);
        Paint paint = new Paint(1);
        this.f6090c = paint;
        this.d = true;
        this.f6091e = new e9((c6) null);
        t9 t9Var = new t9(getContext());
        this.f6088a = t9Var;
        t9Var.setRoundRadius(AndroidUtilities.dp(f9));
        ?? view = new View(context);
        TextPaint textPaint = new TextPaint(1);
        view.f6077a = textPaint;
        textPaint.setTextAlign(Paint.Align.CENTER);
        int i10 = g6.f23009a7;
        textPaint.setColor(g6.w0(null, i10, false));
        textPaint.setTextSize(AndroidUtilities.dp(11.5f));
        textPaint.setTypeface(AndroidUtilities.bold());
        this.f6089b = view;
        view.setAlpha(0.0f);
        addView(t9Var, f6.d(-1, -1.0f, 0, 5.0f, 5.0f, 5.0f, 5.0f));
        addView((View) view, f6.d(26, 26.0f, 85, 0.0f, 0.0f, 1.0f, 3.0f));
        paint.setColor(g6.w0(null, i10, false));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.d) {
            canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(2.0f), this.f6090c);
        }
        super.dispatchDraw(canvas);
    }
}
