package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class ppb extends FrameLayout {
    public final byte a;
    public final RectF b;
    public final pqb c;

    public ppb(pqb pqbVar, Context context, byte b) {
        super(context);
        this.a = b;
        switch (b) {
            case 1:
                this.c = pqbVar;
                super(context);
                this.b = new RectF();
                return;
            default:
                this.c = pqbVar;
                this.b = new RectF();
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        byte b = this.a;
        pqb pqbVar = this.c;
        RectF rectF = this.b;
        switch (b) {
            case 0:
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ppb ppbVar = pqbVar.F0;
                fqb fqbVar = pqbVar.z0;
                rpb rpbVar = pqbVar.a;
                aob.s(ppbVar, fqbVar, rpbVar);
                canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, rpbVar.d("paintChatActionBackground"));
                if (aob.b1()) {
                    canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, rpbVar.d("paintChatActionBackgroundDarken"));
                    return;
                }
                return;
            default:
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ppb ppbVar2 = pqbVar.G0;
                fqb fqbVar2 = pqbVar.z0;
                rpb rpbVar2 = pqbVar.a;
                aob.s(ppbVar2, fqbVar2, rpbVar2);
                canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, rpbVar2.d("paintChatActionBackground"));
                if (aob.b1()) {
                    canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, rpbVar2.d("paintChatActionBackgroundDarken"));
                    return;
                }
                return;
        }
    }
}
