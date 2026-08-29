package eg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.t9;
public final class t1 extends FrameLayout {
    public final t9 f6133a;
    public final u1 f6134b;
    public final Paint f6135c;
    public TLRPC.Chat d;
    public final e9 f6136e;

    public t1(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f6135c = paint;
        this.f6136e = new e9((c6) null);
        t9 t9Var = new t9(getContext());
        this.f6133a = t9Var;
        t9Var.setRoundRadius(AndroidUtilities.dp(30.0f));
        ?? view = new View(context);
        Paint paint2 = new Paint(1);
        view.f6141a = paint2;
        view.f6142b = view.getContext().getDrawable(R.drawable.mini_boost_remove);
        int i10 = g6.f23133h5;
        paint2.setColor(g6.w0(null, i10, false));
        this.f6134b = view;
        view.setAlpha(0.0f);
        addView(t9Var, f6.d(-1, -1.0f, 0, 5.0f, 5.0f, 5.0f, 5.0f));
        addView((View) view, f6.d(28, 28.0f, 85, 0.0f, 0.0f, 0.0f, 3.0f));
        paint.setColor(g6.w0(null, i10, false));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(2.0f), this.f6135c);
        super.dispatchDraw(canvas);
    }
}
