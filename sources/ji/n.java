package ji;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.g0;
public final class n extends View {
    public final int f17982a;
    public final p f17983b;

    public n(p pVar, Context context, int i7) {
        super(context);
        this.f17982a = i7;
        this.f17983b = pVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        int i10;
        switch (this.f17982a) {
            case 0:
                RectF rectF = g0.P;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                p pVar = this.f17983b;
                if (pVar.f18006g0) {
                    i7 = -1;
                } else {
                    i7 = pVar.f18008h0;
                }
                pVar.j(canvas, rectF, i7, 1.0f);
                return;
            default:
                RectF rectF2 = g0.P;
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                p pVar2 = this.f17983b;
                if (pVar2.f18006g0) {
                    i10 = -1;
                } else {
                    i10 = pVar2.f18008h0;
                }
                pVar2.e(canvas, rectF2, i10, 1.0f);
                return;
        }
    }
}
