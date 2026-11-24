package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
public final class cda extends pi4 {
    public final pca V;
    public final nfa W;

    public cda(nfa nfaVar, Context context, pca pcaVar) {
        super(context, null);
        this.W = nfaVar;
        this.V = pcaVar;
    }

    @Override
    public final int getColumnsCount() {
        return this.W.p1[nfa.j0(this.V.F) ? 1 : 0];
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
                } else if (nfa.j0(i)) {
                    return 27;
                }
                return 1;
            }
        }
        return 6;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        nfa nfaVar = this.W;
        Paint paint = nfaVar.W0;
        paint.setColor(nfaVar.c0(bkb.c6));
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
        super.onDraw(canvas);
    }
}
