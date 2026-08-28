package bg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.z8;
public final class a2 extends FrameLayout {
    public final o9 f1695a;
    public final b2 f1696b;
    public final Paint f1697c;
    public TLRPC.Chat d;
    public final z8 f1698e;

    public a2(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f1697c = paint;
        this.f1698e = new z8((b6) null);
        o9 o9Var = new o9(getContext());
        this.f1695a = o9Var;
        o9Var.setRoundRadius(AndroidUtilities.dp(30.0f));
        ?? view = new View(context);
        Paint paint2 = new Paint(1);
        view.f1707a = paint2;
        view.f1708b = view.getContext().getDrawable(R.drawable.mini_boost_remove);
        int i9 = f6.f23072h5;
        paint2.setColor(f6.w0(null, i9, false));
        this.f1696b = view;
        view.setAlpha(0.0f);
        addView(o9Var, e6.d(-1, -1.0f, 0, 5.0f, 5.0f, 5.0f, 5.0f));
        addView((View) view, e6.d(28, 28.0f, 85, 0.0f, 0.0f, 0.0f, 3.0f));
        paint.setColor(f6.w0(null, i9, false));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(2.0f), this.f1697c);
        super.dispatchDraw(canvas);
    }
}
