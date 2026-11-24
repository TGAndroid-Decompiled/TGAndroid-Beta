package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class v39 extends FrameLayout implements vlb {
    public final bf0 a;
    public final kw b;
    public final Paint c;
    public TLRPC.Chat d;
    public final pc0 e;

    public v39(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.c = paint;
        this.e = new pc0((ylb) null);
        bf0 bf0Var = new bf0(getContext());
        this.a = bf0Var;
        bf0Var.setRoundRadius(gm.L(30.0f));
        kw kwVar = new kw(context);
        Paint paint2 = new Paint(1);
        kwVar.b = paint2;
        kwVar.c = kwVar.getContext().getDrawable(2131231937);
        int i = cmb.g5;
        paint2.setColor(cmb.w0(null, i, false));
        this.b = kwVar;
        kwVar.setAlpha(0.0f);
        addView(bf0Var, qoe.d(-1, -1.0f, 0, 5.0f, 5.0f, 5.0f, 5.0f));
        addView(kwVar, qoe.d(28, 28.0f, 85, 0.0f, 0.0f, 0.0f, 3.0f));
        paint.setColor(cmb.w0(null, i, false));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - gm.L(2.0f), this.c);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void updateColors() {
        this.c.setColor(cmb.w0(null, cmb.g5, false));
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
