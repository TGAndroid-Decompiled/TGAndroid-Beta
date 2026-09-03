package dg;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.rq;
public class b extends EditTextBoldCursor {
    public final Canvas f4382b;
    public final TextPaint f4383c;
    public final Paint d;
    public Bitmap e;
    public boolean f4384f;
    public int h;
    public float f4385n;
    public int f4386r;
    public final rq f4387s;
    public RectF[] v;
    public RectF f4388w;
    public boolean f4389x;
    public float f4390y;

    public b(Context context) {
        super(context);
        this.f4382b = new Canvas();
        TextPaint textPaint = new TextPaint(1);
        this.f4383c = textPaint;
        this.d = new Paint(1);
        this.f4387s = new rq();
        this.h = 0;
        setInputType(getInputType() | 655360);
        this.f4384f = true;
        this.f4389x = true;
        setFrameRoundRadius(AndroidUtilities.dp(16.0f));
        textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
    }

    private void setFrameRoundRadius(float f10) {
        if (Math.abs(this.f4390y - f10) > 0.1f) {
            this.f4390y = f10;
            this.d.setPathEffect(new CornerPathEffect(f10));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z4;
        int i10 = 0;
        if (this.e != null && this.h != 0) {
            boolean z10 = this.f4384f;
            TextPaint textPaint = this.f4383c;
            if (z10) {
                int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                int measuredHeight = getMeasuredHeight();
                Editable text = getText();
                Bitmap bitmap = this.e;
                Canvas canvas2 = this.f4382b;
                canvas2.setBitmap(bitmap);
                canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
                float f10 = this.f4385n;
                if (f10 <= 0.0f) {
                    f10 = (float) Math.ceil(getTextSize() / 11.5f);
                }
                textPaint.setStrokeWidth(f10);
                textPaint.setColor(this.h);
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
                this.f4384f = false;
            }
            canvas.drawBitmap(this.e, 0.0f, 0.0f, textPaint);
        }
        if (this.f4386r != 0) {
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            int i11 = this.f4386r;
            Paint paint = this.d;
            paint.setColor(i11);
            Layout layout = getLayout();
            if (layout == null) {
                super.onDraw(canvas);
                return;
            }
            RectF[] rectFArr = this.v;
            if (rectFArr == null || rectFArr.length != layout.getLineCount()) {
                this.v = new RectF[layout.getLineCount()];
                this.f4389x = true;
            }
            if (this.f4389x) {
                this.f4389x = false;
                for (int i12 = 0; i12 < layout.getLineCount(); i12++) {
                    RectF[] rectFArr2 = this.v;
                    if (rectFArr2[i12] == null) {
                        rectFArr2[i12] = new RectF();
                    }
                    this.v[i12].set(layout.getLineLeft(i12), layout.getLineTop(i12), layout.getLineRight(i12), layout.getLineBottom(i12));
                    if (this.v[i12].width() > AndroidUtilities.dp(1.0f)) {
                        this.v[i12].inset((-getTextSize()) / 3.0f, 0.0f);
                        RectF rectF = this.v[i12];
                        rectF.top = AndroidUtilities.dpf2(1.2f) + rectF.top;
                        RectF rectF2 = this.v[i12];
                        rectF2.bottom = AndroidUtilities.dpf2(1.0f) + rectF2.bottom;
                        this.v[i12].left = Math.max(-getPaddingLeft(), this.v[i12].left);
                        this.v[i12].right = Math.min(getWidth() - getPaddingLeft(), this.v[i12].right);
                    } else {
                        RectF rectF3 = this.v[i12];
                        rectF3.left = rectF3.right;
                    }
                    if (i12 > 0) {
                        int i13 = i12 - 1;
                        if (this.v[i13].width() > 0.0f) {
                            RectF[] rectFArr3 = this.v;
                            rectFArr3[i13].bottom = rectFArr3[i12].top;
                        }
                    }
                }
                if (this.f4388w == null) {
                    this.f4388w = new RectF();
                }
                this.f4388w.left = getMeasuredWidth();
                this.f4388w.top = getMeasuredHeight();
                RectF rectF4 = this.f4388w;
                rectF4.bottom = 0.0f;
                rectF4.right = 0.0f;
                for (int i14 = 0; i14 < this.v.length; i14++) {
                    RectF rectF5 = this.f4388w;
                    rectF5.left = Math.min(rectF5.left, getPaddingLeft() + this.v[i14].left);
                    RectF rectF6 = this.f4388w;
                    rectF6.top = Math.min(rectF6.top, getPaddingTop() + this.v[i14].top);
                    RectF rectF7 = this.f4388w;
                    rectF7.right = Math.max(rectF7.right, getPaddingLeft() + this.v[i14].right);
                    RectF rectF8 = this.f4388w;
                    rectF8.bottom = Math.max(rectF8.bottom, getPaddingTop() + this.v[i14].bottom);
                }
                RectF rectF9 = this.f4388w;
                RectF rectF10 = this.f4388w;
                rectF9.right = getMeasuredWidth() - rectF10.right;
                rectF10.bottom = getMeasuredHeight() - this.f4388w.bottom;
            }
            rq rqVar = this.f4387s;
            rqVar.rewind();
            float textSize = getTextSize() / 3.0f;
            float f11 = 1.5f * textSize;
            int i15 = 1;
            while (true) {
                RectF[] rectFArr4 = this.v;
                if (i15 >= rectFArr4.length) {
                    break;
                }
                RectF rectF11 = rectFArr4[i15 - 1];
                RectF rectF12 = rectFArr4[i15];
                if (rectF11.width() >= AndroidUtilities.dp(1.0f) && rectF12.width() >= AndroidUtilities.dp(1.0f)) {
                    if (Math.abs(rectF11.left - rectF12.left) < f11) {
                        float min = Math.min(rectF12.left, rectF11.left);
                        rectF11.left = min;
                        rectF12.left = min;
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (Math.abs(rectF11.right - rectF12.right) < f11) {
                        float max = Math.max(rectF12.right, rectF11.right);
                        rectF11.right = max;
                        rectF12.right = max;
                        z4 = true;
                    }
                    if (z4) {
                        for (int i16 = i15; i16 >= 1; i16--) {
                            RectF[] rectFArr5 = this.v;
                            RectF rectF13 = rectFArr5[i16 - 1];
                            RectF rectF14 = rectFArr5[i16];
                            if (rectF13.width() >= AndroidUtilities.dp(1.0f) && rectF14.width() >= AndroidUtilities.dp(1.0f)) {
                                if (Math.abs(rectF13.left - rectF14.left) < f11) {
                                    float min2 = Math.min(rectF14.left, rectF13.left);
                                    rectF13.left = min2;
                                    rectF14.left = min2;
                                }
                                if (Math.abs(rectF13.right - rectF14.right) < f11) {
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
                RectF[] rectFArr6 = this.v;
                if (i10 >= rectFArr6.length) {
                    break;
                }
                if (rectFArr6[i10].width() != 0.0f) {
                    rqVar.addRect(this.v[i10], Path.Direction.CW);
                }
                i10++;
            }
            rqVar.a();
            setFrameRoundRadius(textSize);
            canvas.drawPath(rqVar, paint);
            canvas.restore();
        } else {
            this.f4388w = null;
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 > 0 && i11 > 0) {
            this.f4384f = true;
            this.f4389x = true;
            Bitmap bitmap = this.e;
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.e = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            return;
        }
        this.e = null;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        this.f4384f = true;
        this.f4389x = true;
    }

    public void setFrameColor(int i10) {
        int i11 = this.f4386r;
        if (i11 == 0 && i10 != 0) {
            setPadding(AndroidUtilities.dp(19.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(7.0f));
            setCursorColor(-1);
        } else if (i11 != 0 && i10 == 0) {
            setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
            setCursorColor(-1);
        }
        this.f4386r = i10;
        if (i10 != 0) {
            float computePerceivedBrightness = AndroidUtilities.computePerceivedBrightness(i10);
            if (computePerceivedBrightness == 0.0f) {
                computePerceivedBrightness = Color.red(this.f4386r) / 255.0f;
            }
            if (computePerceivedBrightness > 0.87d) {
                setTextColor(-16777216);
            } else {
                setTextColor(-1);
            }
            this.f4389x = true;
        }
        this.f4384f = true;
        invalidate();
    }

    @Override
    public void setGravity(int i10) {
        super.setGravity(i10);
        this.f4384f = true;
        this.f4389x = true;
        invalidate();
    }

    public void setStrokeColor(int i10) {
        this.h = i10;
        this.f4384f = true;
        invalidate();
    }

    public void setStrokeWidth(float f10) {
        this.f4385n = f10;
        this.f4384f = true;
        invalidate();
    }
}
