package bg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.z8;
public final class s1 extends FrameLayout {
    public static final int f1954f = 0;
    public final o9 f1955a;
    public final r1 f1956b;
    public final Paint f1957c;
    public boolean d;
    public final z8 f1958e;

    public s1(Context context, float f10) {
        super(context);
        Paint paint = new Paint(1);
        this.f1957c = paint;
        this.d = true;
        this.f1958e = new z8((b6) null);
        o9 o9Var = new o9(getContext());
        this.f1955a = o9Var;
        o9Var.setRoundRadius(AndroidUtilities.dp(f10));
        ?? view = new View(context);
        TextPaint textPaint = new TextPaint(1);
        view.f1943a = textPaint;
        textPaint.setTextAlign(Paint.Align.CENTER);
        int i9 = f6.f22947a7;
        textPaint.setColor(f6.w0(null, i9, false));
        textPaint.setTextSize(AndroidUtilities.dp(11.5f));
        textPaint.setTypeface(AndroidUtilities.bold());
        this.f1956b = view;
        view.setAlpha(0.0f);
        addView(o9Var, e6.d(-1, -1.0f, 0, 5.0f, 5.0f, 5.0f, 5.0f));
        addView((View) view, e6.d(26, 26.0f, 85, 0.0f, 0.0f, 1.0f, 3.0f));
        paint.setColor(f6.w0(null, i9, false));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.d) {
            canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(2.0f), this.f1957c);
        }
        super.dispatchDraw(canvas);
    }
}
