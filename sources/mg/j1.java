package mg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.r8;
import w7.b6;
public final class j1 extends FrameLayout implements k6 {
    public final g9 f13171a;
    public final k1 f13172b;
    public final Paint f13173c;
    public TLRPC.Chat d;
    public final r8 e;

    public j1(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f13173c = paint;
        this.e = new r8((p6) null);
        g9 g9Var = new g9(getContext());
        this.f13171a = g9Var;
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(30.0f));
        k1 k1Var = new k1(context);
        Paint paint2 = new Paint(1);
        k1Var.f13179b = paint2;
        k1Var.f13180c = k1Var.getContext().getDrawable(2131231931);
        int i10 = t6.f21001h5;
        paint2.setColor(t6.x0(null, i10, false));
        this.f13172b = k1Var;
        k1Var.setAlpha(0.0f);
        addView(g9Var, b6.d(-1, -1.0f, 0, 5.0f, 5.0f, 5.0f, 5.0f));
        addView(k1Var, b6.d(28, 28.0f, 85, 0.0f, 0.0f, 0.0f, 3.0f));
        paint.setColor(t6.x0(null, i10, false));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - org.telegram.messenger.i0.L(2.0f), this.f13173c);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void updateColors() {
        this.f13173c.setColor(t6.x0(null, t6.f21001h5, false));
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
