package hg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.z8;
public final class s1 extends FrameLayout {
    public final p9 f7602a;
    public final t1 f7603b;
    public final Paint f7604c;
    public TLRPC.Chat d;
    public final z8 f7605e;

    public s1(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f7604c = paint;
        this.f7605e = new z8((g6) null);
        p9 p9Var = new p9(getContext());
        this.f7602a = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(30.0f));
        ?? view = new View(context);
        Paint paint2 = new Paint(1);
        view.f7611a = paint2;
        view.f7612b = view.getContext().getDrawable(R.drawable.mini_boost_remove);
        int i10 = k6.f21733h5;
        paint2.setColor(k6.w0(null, i10, false));
        this.f7603b = view;
        view.setAlpha(0.0f);
        addView(p9Var, c6.d(-1, -1.0f, 0, 5.0f, 5.0f, 5.0f, 5.0f));
        addView((View) view, c6.d(28, 28.0f, 85, 0.0f, 0.0f, 0.0f, 3.0f));
        paint.setColor(k6.w0(null, i10, false));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(2.0f), this.f7604c);
        super.dispatchDraw(canvas);
    }
}
