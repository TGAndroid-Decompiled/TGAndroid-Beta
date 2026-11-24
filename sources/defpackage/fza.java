package defpackage;

import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
public final class fza {
    public final sk4 a;
    public l46 b;
    public final int c;
    public final gza d;

    public fza(gza gzaVar, int i) {
        this.d = gzaVar;
        this.c = i;
        ?? view = new View(gzaVar.getContext());
        view.c = true;
        TextPaint textPaint = new TextPaint(1);
        view.e = textPaint;
        view.f = new Paint(1);
        Paint paint = new Paint(1);
        view.h = paint;
        Paint paint2 = new Paint(1);
        view.n = paint2;
        view.x = gm.L(35.0f);
        view.y = gm.L(22.0f);
        view.E = gm.L(8.0f);
        view.F = gm.L(3.5f);
        view.G = new RectF();
        view.H = 0.0f;
        textPaint.setTextSize(gm.L(14.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTypeface(Typeface.create("sans-serif-medium", 0));
        paint.setStrokeWidth(gm.N(1.5f));
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint2.setStyle(style);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeWidth(gm.L(2.0f));
        this.a = view;
        view.setPadding(gm.L(16.0f), 0, gm.L(16.0f), 0);
        gzaVar.h.addView(view);
        gzaVar.n.add(this);
    }
}
