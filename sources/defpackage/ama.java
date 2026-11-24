package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class ama extends CharacterStyle {
    public final Paint a;
    public final Path b;

    public ama() {
        Paint paint = new Paint(1);
        this.a = paint;
        this.b = new Path();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
    }

    public static void a(Canvas canvas, Layout layout) {
        CharSequence text;
        int lineStart;
        int lineEnd;
        Layout layout2 = layout;
        if (layout2 != null && (text = layout2.getText()) != null && (text instanceof Spanned)) {
            Spanned spanned = (Spanned) text;
            ama[] amaVarArr = (ama[]) spanned.getSpans(0, spanned.length(), ama.class);
            if (amaVarArr != null && amaVarArr.length != 0) {
                int i = 0;
                while (i < amaVarArr.length) {
                    ama amaVar = amaVarArr[i];
                    int spanStart = spanned.getSpanStart(amaVar);
                    int spanEnd = spanned.getSpanEnd(amaVar);
                    int lineForOffset = layout2.getLineForOffset(spanStart);
                    int lineForOffset2 = layout2.getLineForOffset(spanEnd);
                    int i2 = lineForOffset;
                    while (i2 <= lineForOffset2) {
                        float lineBottom = layout2.getLineBottom(i2) - gl.L(1.0f);
                        if (i2 == lineForOffset) {
                            lineStart = spanStart;
                        } else {
                            lineStart = layout2.getLineStart(i2);
                        }
                        float primaryHorizontal = layout2.getPrimaryHorizontal(lineStart);
                        if (i2 == lineForOffset2) {
                            lineEnd = spanEnd;
                        } else {
                            lineEnd = layout2.getLineEnd(i2) - 1;
                        }
                        float primaryHorizontal2 = layout2.getPrimaryHorizontal(lineEnd);
                        amaVar.getClass();
                        float L = gl.L(1.33f);
                        float L2 = gl.L(10.0f);
                        float L3 = gl.L(2.0f);
                        Paint paint = amaVar.a;
                        Spanned spanned2 = spanned;
                        ama[] amaVarArr2 = amaVarArr;
                        int i3 = i;
                        paint.setColor(bkb.w0(null, bkb.Ei, false));
                        paint.setStrokeWidth(L);
                        Path path = amaVar.b;
                        path.rewind();
                        path.moveTo(primaryHorizontal, lineBottom);
                        float f = primaryHorizontal;
                        while (f < primaryHorizontal2) {
                            float f2 = f;
                            float f3 = L2;
                            path.quadTo((L2 / 4.0f) + f, lineBottom - L3, (L2 / 2.0f) + f2, lineBottom);
                            float f4 = f2 + f3;
                            path.quadTo(((f3 * 3.0f) / 4.0f) + f2, lineBottom + L3, f4, lineBottom);
                            f = f4;
                            L2 = f3;
                        }
                        if (f > primaryHorizontal2) {
                            canvas.save();
                            float f5 = L / 2.0f;
                            canvas.clipRect(primaryHorizontal - f5, (lineBottom - L3) - f5, primaryHorizontal2 + f5, lineBottom + L3 + f5);
                            canvas.drawPath(path, paint);
                            canvas.restore();
                        } else {
                            canvas.drawPath(path, paint);
                        }
                        i2++;
                        layout2 = layout;
                        spanned = spanned2;
                        amaVarArr = amaVarArr2;
                        i = i3;
                    }
                    i++;
                    layout2 = layout;
                }
            }
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
    }
}
