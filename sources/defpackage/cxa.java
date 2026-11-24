package defpackage;

import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
public final class cxa {
    public final oi4 a;
    public k26 b;
    public final int c;
    public final dxa d;

    public cxa(dxa dxaVar, int i) {
        this.d = dxaVar;
        this.c = i;
        ?? view = new View(dxaVar.getContext());
        view.c = true;
        TextPaint textPaint = new TextPaint(1);
        view.e = textPaint;
        view.f = new Paint(1);
        Paint paint = new Paint(1);
        view.h = paint;
        Paint paint2 = new Paint(1);
        view.n = paint2;
        view.x = gl.L(35.0f);
        view.y = gl.L(22.0f);
        view.E = gl.L(8.0f);
        view.F = gl.L(3.5f);
        view.G = new RectF();
        view.H = 0.0f;
        textPaint.setTextSize(gl.L(14.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTypeface(Typeface.create("sans-serif-medium", 0));
        paint.setStrokeWidth(gl.N(1.5f));
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint2.setStyle(style);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeWidth(gl.L(2.0f));
        this.a = view;
        view.setPadding(gl.L(16.0f), 0, gl.L(16.0f), 0);
        dxaVar.h.addView(view);
        dxaVar.n.add(this);
    }
}
