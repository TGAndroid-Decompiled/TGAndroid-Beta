package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
public final class tga extends tk4 {
    public final gga V;
    public final eja W;

    public tga(eja ejaVar, Context context, gga ggaVar) {
        super(context, null);
        this.W = ejaVar;
        this.V = ggaVar;
    }

    @Override
    public final int getColumnsCount() {
        return this.W.p1[eja.j0(this.V.F) ? 1 : 0];
    }

    @Override
    public final int getViewType() {
        setIsSingleCell(false);
        int i = this.V.F;
        if (i == 0 || i == 5) {
            return 2;
        }
        if (i == 1) {
            return 3;
        }
        if (i != 2 && i != 4) {
            if (i == 3) {
                return 5;
            }
            if (i != 7) {
                if (i == 6) {
                    if (this.W.L0.getTabsCount() == 1) {
                        setIsSingleCell(true);
                        return 1;
                    }
                } else if (eja.j0(i)) {
                    return 27;
                }
                return 1;
            }
        }
        return 6;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        eja ejaVar = this.W;
        Paint paint = ejaVar.W0;
        paint.setColor(ejaVar.c0(aob.d6));
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
        super.onDraw(canvas);
    }
}
