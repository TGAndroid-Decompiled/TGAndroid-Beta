package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class g59 extends FrameLayout implements snb {
    public final de0 a;
    public final lv b;
    public final Paint c;
    public TLRPC.Chat d;
    public final rb0 e;

    public g59(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.c = paint;
        this.e = new rb0((vnb) null);
        de0 de0Var = new de0(getContext());
        this.a = de0Var;
        de0Var.setRoundRadius(hl.L(30.0f));
        lv lvVar = new lv(context);
        Paint paint2 = new Paint(1);
        lvVar.b = paint2;
        lvVar.c = lvVar.getContext().getDrawable(2131231936);
        int i = aob.h5;
        paint2.setColor(aob.w0(null, i, false));
        this.b = lvVar;
        lvVar.setAlpha(0.0f);
        addView(de0Var, tre.d(-1, -1.0f, 0, 5.0f, 5.0f, 5.0f, 5.0f));
        addView(lvVar, tre.d(28, 28.0f, 85, 0.0f, 0.0f, 0.0f, 3.0f));
        paint.setColor(aob.w0(null, i, false));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - hl.L(2.0f), this.c);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void updateColors() {
        this.c.setColor(aob.w0(null, aob.h5, false));
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
