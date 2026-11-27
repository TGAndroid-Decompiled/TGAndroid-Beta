package defpackage;

import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
public final class f1b {
    public final sk4 a;
    public o46 b;
    public final int c;
    public final g1b d;

    public f1b(g1b g1bVar, int i) {
        this.d = g1bVar;
        this.c = i;
        ?? view = new View(g1bVar.getContext());
        view.c = true;
        TextPaint textPaint = new TextPaint(1);
        view.e = textPaint;
        view.f = new Paint(1);
        Paint paint = new Paint(1);
        view.h = paint;
        Paint paint2 = new Paint(1);
        view.n = paint2;
        view.x = hl.L(35.0f);
        view.y = hl.L(22.0f);
        view.E = hl.L(8.0f);
        view.F = hl.L(3.5f);
        view.G = new RectF();
        view.H = 0.0f;
        textPaint.setTextSize(hl.L(14.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTypeface(Typeface.create("sans-serif-medium", 0));
        paint.setStrokeWidth(hl.N(1.5f));
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint2.setStyle(style);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeWidth(hl.L(2.0f));
        this.a = view;
        view.setPadding(hl.L(16.0f), 0, hl.L(16.0f), 0);
        g1bVar.h.addView(view);
        g1bVar.n.add(this);
    }
}
