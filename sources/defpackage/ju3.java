package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.text.TextPaint;
import org.telegram.ui.Components.EditTextBoldCursor;
public class ju3 extends EditTextBoldCursor {
    public final Canvas N1;
    public final TextPaint O1;
    public final Paint P1;
    public Bitmap Q1;
    public boolean R1;
    public int S1;
    public float T1;
    public int U1;
    public final jx2 V1;
    public RectF[] W1;
    public RectF X1;
    public boolean Y1;
    public float Z1;
    public boolean a2;
    public int[] b2;
    public long c2;
    public int d2;
    public Paint e2;
    public final Path f2;
    public final RectF g2;
    public final RectF h2;

    public ju3(Context context) {
        super(context);
        this.N1 = new Canvas();
        TextPaint textPaint = new TextPaint(1);
        this.O1 = textPaint;
        this.P1 = new Paint(1);
        this.V1 = new jx2();
        this.d2 = Integer.MIN_VALUE;
        this.f2 = new Path();
        this.g2 = new RectF();
        this.h2 = new RectF();
        this.S1 = 0;
        setInputType(getInputType() | 655360);
        this.R1 = true;
        this.Y1 = true;
        setFrameRoundRadius(hl.L(16.0f));
        textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
    }

    private void setFrameRoundRadius(float f) {
        if (Math.abs(this.Z1 - f) > 0.1f) {
            this.Z1 = f;
            this.P1.setPathEffect(new CornerPathEffect(f));
        }
    }

    public final boolean A(long j) {
        this.c2 = j;
        if (this.b2 == null) {
            return false;
        }
        int B = B(j);
        if (B < 0) {
            B = -1;
        } else if (j - this.b2[(B << 2) + 2] < 240) {
            B = -2;
        }
        if (B == this.d2 && B != -2) {
            return false;
        }
        this.d2 = B;
        invalidate();
        return true;
    }

    public final int B(long j) {
        int i;
        int i2 = -1;
        int i3 = 0;
        while (true) {
            int i4 = i3;
            i = i2;
            i2 = i4;
            int i5 = i2 << 2;
            int i6 = i5 + 3;
            int[] iArr = this.b2;
            if (i6 >= iArr.length || iArr[i5 + 2] > j) {
                break;
            }
            i3 = i2 + 1;
        }
        return i;
    }

    public final boolean C(Layout layout, int i, RectF rectF) {
        int[] iArr = this.b2;
        int i2 = i << 2;
        int i3 = iArr[i2];
        int i4 = iArr[i2 + 1];
        if (i3 >= 0 && i3 < i4 && i4 <= layout.getText().length()) {
            Path path = this.f2;
            path.rewind();
            layout.getSelectionPath(i3, i4, path);
            path.computeBounds(rectF, false);
            if (!rectF.isEmpty()) {
                Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
                float lineBaseline = layout.getLineBaseline(layout.getLineForOffset(i3));
                float textSize = getTextSize() * 0.14f;
                rectF.set(rectF.left - textSize, ((fontMetrics.ascent * 0.86f) + lineBaseline) - textSize, rectF.right + textSize, bs2.i(fontMetrics.descent, 0.9f, lineBaseline, textSize));
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ju3.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (i != i3) {
            this.Y1 = true;
            invalidate();
        }
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i > 0 && i2 > 0) {
            this.R1 = true;
            this.Y1 = true;
            Bitmap bitmap = this.Q1;
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.Q1 = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            return;
        }
        this.Q1 = null;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        this.R1 = true;
        this.Y1 = true;
    }

    public void setFrameColor(int i) {
        int i2 = this.U1;
        if (i2 == 0 && i != 0) {
            setPadding(hl.L(19.0f), hl.L(7.0f), hl.L(19.0f), hl.L(7.0f));
            setCursorColor(-1);
        } else if (i2 != 0 && i == 0) {
            setPadding(hl.L(7.0f), hl.L(7.0f), hl.L(7.0f), hl.L(7.0f));
            setCursorColor(-1);
        }
        this.U1 = i;
        if (i != 0) {
            float B = hl.B(i);
            if (B == 0.0f) {
                B = Color.red(this.U1) / 255.0f;
            }
            if (B > 0.87d) {
                setTextColor(-16777216);
            } else {
                setTextColor(-1);
            }
            this.Y1 = true;
        }
        this.R1 = true;
        invalidate();
    }

    @Override
    public void setGravity(int i) {
        super.setGravity(i);
        this.R1 = true;
        this.Y1 = true;
        invalidate();
    }

    public void setSpokenWords(int[] iArr) {
        if (this.b2 == iArr) {
            return;
        }
        this.b2 = iArr;
        this.d2 = Integer.MIN_VALUE;
        invalidate();
    }

    public void setStrokeColor(int i) {
        this.S1 = i;
        this.R1 = true;
        invalidate();
    }

    public void setStrokeWidth(float f) {
        this.T1 = f;
        this.R1 = true;
        invalidate();
    }

    public void setTallFrame(boolean z) {
        if (this.a2 == z) {
            return;
        }
        this.a2 = z;
        this.Y1 = true;
        invalidate();
    }
}
