package jg;

import android.content.Context;
import android.graphics.Paint;
import org.telegram.ui.cr0;
public final class k0 extends d {
    public final Paint h;
    public long f10074n;
    public float f10075r;
    public float f10076s;
    public final cr0 f10077w;

    public k0(cr0 cr0Var, Context context, a6.i iVar) {
        super(context, iVar);
        this.f10077w = cr0Var;
        Paint paint = new Paint();
        this.h = paint;
        setWillNotDraw(false);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r14) {
        throw new UnsupportedOperationException("Method not decompiled: jg.k0.onDraw(android.graphics.Canvas):void");
    }
}
