package ji;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.g0;
public final class o extends View {
    public final int f17979a;
    public final q f17980b;

    public o(q qVar, Context context, int i7) {
        super(context);
        this.f17979a = i7;
        this.f17980b = qVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        int i10;
        switch (this.f17979a) {
            case 0:
                RectF rectF = g0.P;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                q qVar = this.f17980b;
                if (qVar.f18003g0) {
                    i7 = -1;
                } else {
                    i7 = qVar.f18005h0;
                }
                qVar.j(canvas, rectF, i7, 1.0f);
                return;
            default:
                RectF rectF2 = g0.P;
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                q qVar2 = this.f17980b;
                if (qVar2.f18003g0) {
                    i10 = -1;
                } else {
                    i10 = qVar2.f18005h0;
                }
                qVar2.e(canvas, rectF2, i10, 1.0f);
                return;
        }
    }
}
