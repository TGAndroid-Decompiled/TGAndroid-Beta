package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
public final class cfa extends tk4 {
    public final pea V;
    public final nha W;

    public cfa(nha nhaVar, Context context, pea peaVar) {
        super(context, null);
        this.W = nhaVar;
        this.V = peaVar;
    }

    @Override
    public final int getColumnsCount() {
        return this.W.p1[nha.j0(this.V.F) ? 1 : 0];
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
                } else if (nha.j0(i)) {
                    return 27;
                }
                return 1;
            }
        }
        return 6;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        nha nhaVar = this.W;
        Paint paint = nhaVar.W0;
        paint.setColor(nhaVar.c0(cmb.c6));
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
        super.onDraw(canvas);
    }
}
