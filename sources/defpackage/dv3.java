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
public class dv3 extends EditTextBoldCursor {
    public final Canvas M1;
    public final TextPaint N1;
    public final Paint O1;
    public Bitmap P1;
    public boolean Q1;
    public int R1;
    public float S1;
    public int T1;
    public final zx2 U1;
    public RectF[] V1;
    public RectF W1;
    public boolean X1;
    public float Y1;
    public boolean Z1;
    public int[] a2;
    public long b2;
    public int c2;
    public Paint d2;
    public final Path e2;
    public final RectF f2;
    public final RectF g2;

    public dv3(Context context) {
        super(context);
        this.M1 = new Canvas();
        TextPaint textPaint = new TextPaint(1);
        this.N1 = textPaint;
        this.O1 = new Paint(1);
        this.U1 = new zx2();
        this.c2 = Integer.MIN_VALUE;
        this.e2 = new Path();
        this.f2 = new RectF();
        this.g2 = new RectF();
        this.R1 = 0;
        setInputType(getInputType() | 655360);
        this.Q1 = true;
        this.X1 = true;
        setFrameRoundRadius(gm.L(16.0f));
        textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
    }

    private void setFrameRoundRadius(float f) {
        if (Math.abs(this.Y1 - f) > 0.1f) {
            this.Y1 = f;
            this.O1.setPathEffect(new CornerPathEffect(f));
        }
    }

    public final boolean A(long j) {
        this.b2 = j;
        if (this.a2 == null) {
            return false;
        }
        int B = B(j);
        if (B < 0) {
            B = -1;
        } else if (j - this.a2[(B << 2) + 2] < 240) {
            B = -2;
        }
        if (B == this.c2 && B != -2) {
            return false;
        }
        this.c2 = B;
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
            int[] iArr = this.a2;
            if (i6 >= iArr.length || iArr[i5 + 2] > j) {
                break;
            }
            i3 = i2 + 1;
        }
        return i;
    }

    public final boolean C(Layout layout, int i, RectF rectF) {
        int[] iArr = this.a2;
        int i2 = i << 2;
        int i3 = iArr[i2];
        int i4 = iArr[i2 + 1];
        if (i3 >= 0 && i3 < i4 && i4 <= layout.getText().length()) {
            Path path = this.e2;
            path.rewind();
            layout.getSelectionPath(i3, i4, path);
            path.computeBounds(rectF, false);
            if (!rectF.isEmpty()) {
                Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
                float lineBaseline = layout.getLineBaseline(layout.getLineForOffset(i3));
                float textSize = getTextSize() * 0.14f;
                rectF.set(rectF.left - textSize, ((fontMetrics.ascent * 0.86f) + lineBaseline) - textSize, rectF.right + textSize, ts2.i(fontMetrics.descent, 0.9f, lineBaseline, textSize));
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dv3.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (i != i3) {
            this.X1 = true;
            invalidate();
        }
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i > 0 && i2 > 0) {
            this.Q1 = true;
            this.X1 = true;
            Bitmap bitmap = this.P1;
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.P1 = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            return;
        }
        this.P1 = null;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        this.Q1 = true;
        this.X1 = true;
    }

    public void setFrameColor(int i) {
        int i2 = this.T1;
        if (i2 == 0 && i != 0) {
            setPadding(gm.L(19.0f), gm.L(7.0f), gm.L(19.0f), gm.L(7.0f));
            setCursorColor(-1);
        } else if (i2 != 0 && i == 0) {
            setPadding(gm.L(7.0f), gm.L(7.0f), gm.L(7.0f), gm.L(7.0f));
            setCursorColor(-1);
        }
        this.T1 = i;
        if (i != 0) {
            float B = gm.B(i);
            if (B == 0.0f) {
                B = Color.red(this.T1) / 255.0f;
            }
            if (B > 0.87d) {
                setTextColor(-16777216);
            } else {
                setTextColor(-1);
            }
            this.X1 = true;
        }
        this.Q1 = true;
        invalidate();
    }

    @Override
    public void setGravity(int i) {
        super.setGravity(i);
        this.Q1 = true;
        this.X1 = true;
        invalidate();
    }

    public void setSpokenWords(int[] iArr) {
        if (this.a2 == iArr) {
            return;
        }
        this.a2 = iArr;
        this.c2 = Integer.MIN_VALUE;
        invalidate();
    }

    public void setStrokeColor(int i) {
        this.R1 = i;
        this.Q1 = true;
        invalidate();
    }

    public void setStrokeWidth(float f) {
        this.S1 = f;
        this.Q1 = true;
        invalidate();
    }

    public void setTallFrame(boolean z) {
        if (this.Z1 == z) {
            return;
        }
        this.Z1 = z;
        this.X1 = true;
        invalidate();
    }
}
