package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class r19 extends FrameLayout implements tjb {
    public final be0 a;
    public final kv b;
    public final Paint c;
    public TLRPC.Chat d;
    public final pb0 e;

    public r19(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.c = paint;
        this.e = new pb0((wjb) null);
        be0 be0Var = new be0(getContext());
        this.a = be0Var;
        be0Var.setRoundRadius(gl.L(30.0f));
        kv kvVar = new kv(context);
        Paint paint2 = new Paint(1);
        kvVar.b = paint2;
        kvVar.c = kvVar.getContext().getDrawable(2131231936);
        int i = bkb.g5;
        paint2.setColor(bkb.w0(null, i, false));
        this.b = kvVar;
        kvVar.setAlpha(0.0f);
        addView(be0Var, nme.d(-1, -1.0f, 0, 5.0f, 5.0f, 5.0f, 5.0f));
        addView(kvVar, nme.d(28, 28.0f, 85, 0.0f, 0.0f, 0.0f, 3.0f));
        paint.setColor(bkb.w0(null, i, false));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - gl.L(2.0f), this.c);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void updateColors() {
        this.c.setColor(bkb.w0(null, bkb.g5, false));
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
