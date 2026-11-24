package defpackage;

import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import java.util.ArrayList;
import java.util.HashMap;
public final class wf5 {
    public final TextPaint a;
    public final float b;
    public final HashMap c;
    public final RectF d;
    public final RectF e;
    public final Paint f;
    public final ArrayList g;
    public final float h;

    public wf5() {
        float f;
        TextPaint textPaint = new TextPaint(1);
        this.a = textPaint;
        this.b = 1.0f;
        this.c = new HashMap();
        this.d = new RectF();
        this.e = new RectF();
        Paint paint = new Paint();
        this.f = paint;
        this.g = new ArrayList();
        this.h = 1000.0f / gm.r;
        textPaint.setTypeface(gm.o());
        textPaint.setColor(-1);
        int o = gda.o();
        if (o != 0) {
            if (o != 1) {
                f = 0.75f;
                this.b = 0.75f;
            } else {
                f = 0.5f;
                this.b = 0.5f;
            }
        } else {
            f = 0.25f;
            this.b = 0.25f;
        }
        textPaint.setTextSize(gm.L(f * 24.0f));
        paint.setColor(-1);
    }
}
