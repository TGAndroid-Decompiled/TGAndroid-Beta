package ji;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.g0;
public final class o extends View {
    public final int f18081a;
    public final q f18082b;

    public o(q qVar, Context context, int i7) {
        super(context);
        this.f18081a = i7;
        this.f18082b = qVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        int i10;
        switch (this.f18081a) {
            case 0:
                RectF rectF = g0.P;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                q qVar = this.f18082b;
                if (qVar.f18105g0) {
                    i7 = -1;
                } else {
                    i7 = qVar.f18107h0;
                }
                qVar.j(canvas, rectF, i7, 1.0f);
                return;
            default:
                RectF rectF2 = g0.P;
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                q qVar2 = this.f18082b;
                if (qVar2.f18105g0) {
                    i10 = -1;
                } else {
                    i10 = qVar2.f18107h0;
                }
                qVar2.e(canvas, rectF2, i10, 1.0f);
                return;
        }
    }
}
