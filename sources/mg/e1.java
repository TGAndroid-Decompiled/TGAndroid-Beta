package mg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.f8;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.r8;
import w7.b6;
public final class e1 extends FrameLayout implements k6 {
    public static final int f13105f = 0;
    public final g9 f13106a;
    public final d1 f13107b;
    public final Paint f13108c;
    public boolean d;
    public final r8 e;

    public e1(Context context, float f7) {
        super(context);
        Paint paint = new Paint(1);
        this.f13108c = paint;
        this.d = true;
        this.e = new r8((p6) null);
        g9 g9Var = new g9(getContext());
        this.f13106a = g9Var;
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(f7));
        ?? view = new View(context);
        TextPaint textPaint = new TextPaint(1);
        view.f13092a = textPaint;
        textPaint.setTextAlign(Paint.Align.CENTER);
        int i10 = t6.f20872a7;
        textPaint.setColor(t6.x0(null, i10, false));
        textPaint.setTextSize(org.telegram.messenger.i0.L(11.5f));
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        this.f13107b = view;
        view.setAlpha(0.0f);
        addView(g9Var, b6.d(-1, -1.0f, 0, 5.0f, 5.0f, 5.0f, 5.0f));
        addView((View) view, b6.d(26, 26.0f, 85, 0.0f, 0.0f, 1.0f, 3.0f));
        paint.setColor(t6.x0(null, i10, false));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.d) {
            canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - org.telegram.messenger.i0.L(2.0f), this.f13108c);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void updateColors() {
        try {
            this.f13108c.setColor(t6.x0(null, t6.f20872a7, false));
            invalidate();
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
