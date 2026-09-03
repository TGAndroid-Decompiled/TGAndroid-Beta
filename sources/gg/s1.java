package gg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.z8;
public final class s1 extends FrameLayout {
    public final p9 f6735a;
    public final t1 f6736b;
    public final Paint f6737c;
    public TLRPC.Chat d;
    public final z8 e;

    public s1(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f6737c = paint;
        this.e = new z8((f6) null);
        p9 p9Var = new p9(getContext());
        this.f6735a = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(30.0f));
        ?? view = new View(context);
        Paint paint2 = new Paint(1);
        view.f6743a = paint2;
        view.f6744b = view.getContext().getDrawable(R.drawable.mini_boost_remove);
        int i10 = j6.f19952h5;
        paint2.setColor(j6.w0(null, i10, false));
        this.f6736b = view;
        view.setAlpha(0.0f);
        addView(p9Var, b6.d(-1, -1.0f, 0, 5.0f, 5.0f, 5.0f, 5.0f));
        addView((View) view, b6.d(28, 28.0f, 85, 0.0f, 0.0f, 0.0f, 3.0f));
        paint.setColor(j6.w0(null, i10, false));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(2.0f), this.f6737c);
        super.dispatchDraw(canvas);
    }
}
