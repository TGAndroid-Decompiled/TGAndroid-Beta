package jg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.text.Editable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.jq;
public class b extends EditTextBoldCursor {
    public final Canvas G1;
    public final TextPaint H1;
    public final Paint I1;
    public Bitmap J1;
    public boolean K1;
    public int L1;
    public float M1;
    public int N1;
    public final jq O1;
    public RectF[] P1;
    public RectF Q1;
    public boolean R1;
    public float S1;

    public b(Context context) {
        super(context);
        this.G1 = new Canvas();
        TextPaint textPaint = new TextPaint(1);
        this.H1 = textPaint;
        this.I1 = new Paint(1);
        this.O1 = new jq();
        this.L1 = 0;
        setInputType(getInputType() | 655360);
        this.K1 = true;
        this.R1 = true;
        setFrameRoundRadius(org.telegram.messenger.i0.L(16.0f));
        textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
    }

    private void setFrameRoundRadius(float f7) {
        if (Math.abs(this.S1 - f7) > 0.1f) {
            this.S1 = f7;
            this.I1.setPathEffect(new CornerPathEffect(f7));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10;
        int i10 = 0;
        if (this.J1 != null && this.L1 != 0) {
            boolean z11 = this.K1;
            TextPaint textPaint = this.H1;
            if (z11) {
                int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                int measuredHeight = getMeasuredHeight();
                Editable text = getText();
                Bitmap bitmap = this.J1;
                Canvas canvas2 = this.G1;
                canvas2.setBitmap(bitmap);
                canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
                float f7 = this.M1;
                if (f7 <= 0.0f) {
                    f7 = (float) Math.ceil(getTextSize() / 11.5f);
                }
                textPaint.setStrokeWidth(f7);
                textPaint.setColor(this.L1);
                textPaint.setTextSize(getTextSize());
                textPaint.setTypeface(getTypeface());
                textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                if (getLayout() != null) {
                    alignment = getLayout().getAlignment();
                }
                StaticLayout staticLayout = new StaticLayout(text, textPaint, measuredWidth, alignment, 1.0f, 0.0f, true);
                canvas2.save();
                canvas2.translate(getPaddingLeft(), ((((measuredHeight - getPaddingTop()) - getPaddingBottom()) - staticLayout.getHeight()) / 2.0f) + getPaddingTop());
                staticLayout.draw(canvas2);
                canvas2.restore();
                this.K1 = false;
            }
            canvas.drawBitmap(this.J1, 0.0f, 0.0f, textPaint);
        }
        if (this.N1 != 0) {
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            int i11 = this.N1;
            Paint paint = this.I1;
            paint.setColor(i11);
            Layout layout = getLayout();
            if (layout == null) {
                super.onDraw(canvas);
                return;
            }
            RectF[] rectFArr = this.P1;
            if (rectFArr == null || rectFArr.length != layout.getLineCount()) {
                this.P1 = new RectF[layout.getLineCount()];
                this.R1 = true;
            }
            if (this.R1) {
                this.R1 = false;
                for (int i12 = 0; i12 < layout.getLineCount(); i12++) {
                    RectF[] rectFArr2 = this.P1;
                    if (rectFArr2[i12] == null) {
                        rectFArr2[i12] = new RectF();
                    }
                    this.P1[i12].set(layout.getLineLeft(i12), layout.getLineTop(i12), layout.getLineRight(i12), layout.getLineBottom(i12));
                    if (this.P1[i12].width() > org.telegram.messenger.i0.L(1.0f)) {
                        this.P1[i12].inset((-getTextSize()) / 3.0f, 0.0f);
                        RectF rectF = this.P1[i12];
                        rectF.top = org.telegram.messenger.i0.N(1.2f) + rectF.top;
                        RectF rectF2 = this.P1[i12];
                        rectF2.bottom = org.telegram.messenger.i0.N(1.0f) + rectF2.bottom;
                        this.P1[i12].left = Math.max(-getPaddingLeft(), this.P1[i12].left);
                        this.P1[i12].right = Math.min(getWidth() - getPaddingLeft(), this.P1[i12].right);
                    } else {
                        RectF rectF3 = this.P1[i12];
                        rectF3.left = rectF3.right;
                    }
                    if (i12 > 0) {
                        int i13 = i12 - 1;
                        if (this.P1[i13].width() > 0.0f) {
                            RectF[] rectFArr3 = this.P1;
                            rectFArr3[i13].bottom = rectFArr3[i12].top;
                        }
                    }
                }
                if (this.Q1 == null) {
                    this.Q1 = new RectF();
                }
                this.Q1.left = getMeasuredWidth();
                this.Q1.top = getMeasuredHeight();
                RectF rectF4 = this.Q1;
                rectF4.bottom = 0.0f;
                rectF4.right = 0.0f;
                for (int i14 = 0; i14 < this.P1.length; i14++) {
                    RectF rectF5 = this.Q1;
                    rectF5.left = Math.min(rectF5.left, getPaddingLeft() + this.P1[i14].left);
                    RectF rectF6 = this.Q1;
                    rectF6.top = Math.min(rectF6.top, getPaddingTop() + this.P1[i14].top);
                    RectF rectF7 = this.Q1;
                    rectF7.right = Math.max(rectF7.right, getPaddingLeft() + this.P1[i14].right);
                    RectF rectF8 = this.Q1;
                    rectF8.bottom = Math.max(rectF8.bottom, getPaddingTop() + this.P1[i14].bottom);
                }
                RectF rectF9 = this.Q1;
                RectF rectF10 = this.Q1;
                rectF9.right = getMeasuredWidth() - rectF10.right;
                rectF10.bottom = getMeasuredHeight() - this.Q1.bottom;
            }
            jq jqVar = this.O1;
            jqVar.rewind();
            float textSize = getTextSize() / 3.0f;
            float f10 = 1.5f * textSize;
            int i15 = 1;
            while (true) {
                RectF[] rectFArr4 = this.P1;
                if (i15 >= rectFArr4.length) {
                    break;
                }
                RectF rectF11 = rectFArr4[i15 - 1];
                RectF rectF12 = rectFArr4[i15];
                if (rectF11.width() >= org.telegram.messenger.i0.L(1.0f) && rectF12.width() >= org.telegram.messenger.i0.L(1.0f)) {
                    if (Math.abs(rectF11.left - rectF12.left) < f10) {
                        float min = Math.min(rectF12.left, rectF11.left);
                        rectF11.left = min;
                        rectF12.left = min;
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (Math.abs(rectF11.right - rectF12.right) < f10) {
                        float max = Math.max(rectF12.right, rectF11.right);
                        rectF11.right = max;
                        rectF12.right = max;
                        z10 = true;
                    }
                    if (z10) {
                        for (int i16 = i15; i16 >= 1; i16--) {
                            RectF[] rectFArr5 = this.P1;
                            RectF rectF13 = rectFArr5[i16 - 1];
                            RectF rectF14 = rectFArr5[i16];
                            if (rectF13.width() >= org.telegram.messenger.i0.L(1.0f) && rectF14.width() >= org.telegram.messenger.i0.L(1.0f)) {
                                if (Math.abs(rectF13.left - rectF14.left) < f10) {
                                    float min2 = Math.min(rectF14.left, rectF13.left);
                                    rectF13.left = min2;
                                    rectF14.left = min2;
                                }
                                if (Math.abs(rectF13.right - rectF14.right) < f10) {
                                    float max2 = Math.max(rectF14.right, rectF13.right);
                                    rectF13.right = max2;
                                    rectF14.right = max2;
                                }
                            }
                        }
                    }
                }
                i15++;
            }
            while (true) {
                RectF[] rectFArr6 = this.P1;
                if (i10 >= rectFArr6.length) {
                    break;
                }
                if (rectFArr6[i10].width() != 0.0f) {
                    jqVar.addRect(this.P1[i10], Path.Direction.CW);
                }
                i10++;
            }
            jqVar.a();
            setFrameRoundRadius(textSize);
            canvas.drawPath(jqVar, paint);
            canvas.restore();
        } else {
            this.Q1 = null;
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 > 0 && i11 > 0) {
            this.K1 = true;
            this.R1 = true;
            Bitmap bitmap = this.J1;
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.J1 = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            return;
        }
        this.J1 = null;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        this.K1 = true;
        this.R1 = true;
    }

    public void setFrameColor(int i10) {
        int i11 = this.N1;
        if (i11 == 0 && i10 != 0) {
            setPadding(org.telegram.messenger.i0.L(19.0f), org.telegram.messenger.i0.L(7.0f), org.telegram.messenger.i0.L(19.0f), org.telegram.messenger.i0.L(7.0f));
            setCursorColor(-1);
        } else if (i11 != 0 && i10 == 0) {
            setPadding(org.telegram.messenger.i0.L(7.0f), org.telegram.messenger.i0.L(7.0f), org.telegram.messenger.i0.L(7.0f), org.telegram.messenger.i0.L(7.0f));
            setCursorColor(-1);
        }
        this.N1 = i10;
        if (i10 != 0) {
            float B = org.telegram.messenger.i0.B(i10);
            if (B == 0.0f) {
                B = Color.red(this.N1) / 255.0f;
            }
            if (B > 0.87d) {
                setTextColor(-16777216);
            } else {
                setTextColor(-1);
            }
            this.R1 = true;
        }
        this.K1 = true;
        invalidate();
    }

    @Override
    public void setGravity(int i10) {
        super.setGravity(i10);
        this.K1 = true;
        this.R1 = true;
        invalidate();
    }

    public void setStrokeColor(int i10) {
        this.L1 = i10;
        this.K1 = true;
        invalidate();
    }

    public void setStrokeWidth(float f7) {
        this.M1 = f7;
        this.K1 = true;
        invalidate();
    }
}
