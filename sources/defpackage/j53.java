package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.TextPaint;
import android.view.View;
import java.util.HashSet;
public final class j53 extends View implements snb {
    public final TextPaint a;
    public final TextPaint b;
    public final String c;
    public final String d;
    public final Rect e;

    public j53(Context context, String str, String str2) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.a = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.b = textPaint2;
        this.e = new Rect();
        this.c = str;
        this.d = str2;
        textPaint.setTextSize(hl.L(24.0f));
        textPaint2.setTextSize(hl.L(14.0f));
        textPaint.setColor(aob.w0(null, aob.G6, false));
        textPaint2.setColor(aob.w0(null, aob.H6, false));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        TextPaint textPaint = this.b;
        String str = this.d;
        float measureText = textPaint.measureText(str);
        TextPaint textPaint2 = this.a;
        String str2 = this.c;
        float measureText2 = textPaint2.measureText(str2);
        int length = str2.length();
        Rect rect = this.e;
        textPaint2.getTextBounds(str2, 0, length, rect);
        textPaint.getTextBounds(str, 0, str.length(), rect);
        canvas.drawText(str2, (getWidth() * 0.25f) - (measureText2 / 2.0f), (getHeight() / 2.0f) + (rect.height() / 2.0f), textPaint2);
        canvas.drawText(str, (getWidth() * 0.7f) - (measureText / 2.0f), (getHeight() / 2.0f) + (rect.height() / 2.0f), textPaint);
    }

    @Override
    public final void updateColors() {
        this.a.setColor(aob.w0(null, aob.G6, false));
        this.b.setColor(aob.w0(null, aob.H6, false));
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
