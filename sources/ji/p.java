package ji;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.g0;
public final class p extends View {
    public final int f18013a;
    public final r f18014b;

    public p(r rVar, Context context, int i7) {
        super(context);
        this.f18013a = i7;
        this.f18014b = rVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        int i10;
        switch (this.f18013a) {
            case 0:
                RectF rectF = g0.P;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                r rVar = this.f18014b;
                if (rVar.f18037g0) {
                    i7 = -1;
                } else {
                    i7 = rVar.f18039h0;
                }
                rVar.j(canvas, rectF, i7, 1.0f);
                return;
            default:
                RectF rectF2 = g0.P;
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                r rVar2 = this.f18014b;
                if (rVar2.f18037g0) {
                    i10 = -1;
                } else {
                    i10 = rVar2.f18039h0;
                }
                rVar2.e(canvas, rectF2, i10, 1.0f);
                return;
        }
    }
}
