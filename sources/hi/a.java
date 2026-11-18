package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ef;
import org.telegram.messenger.fc;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.mq;
public final class a extends View implements org.telegram.ui.ActionBar.c6 {
    public final ImageReceiver f14166a;
    public final String f14167b;
    public final String f14168c;
    public final TextPaint d;
    public StaticLayout f14169e;
    public float f14170f;
    public float h;
    public final TextPaint f14171n;
    public StaticLayout f14172r;
    public float f14173s;
    public float f14174w;
    public final org.telegram.ui.ActionBar.i6 f14175x;

    public a(Context context, ef efVar, String str, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        String str2;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f14166a = imageReceiver;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.f14171n = textPaint2;
        this.f14175x = i6Var;
        setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        setBackground(org.telegram.ui.ActionBar.n6.N0(false));
        setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        setLayoutParams(new LinearLayout.LayoutParams(-1, 48));
        int i10 = org.telegram.ui.ActionBar.n6.E8;
        textPaint.setColor(org.telegram.ui.ActionBar.n6.w0(i10, i6Var));
        textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
        textPaint2.setColor(org.telegram.ui.ActionBar.n6.w0(i10, i6Var));
        textPaint2.setAlpha(102);
        textPaint2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        String str3 = "";
        String str4 = "" + ((Object) str);
        this.f14167b = str4;
        this.f14168c = i5.c.i(i7, "");
        imageReceiver.J0(org.telegram.messenger.g0.L(4.0f));
        Drawable mutate = context.getResources().getDrawable(2131232222).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(1308622847, PorterDuff.Mode.MULTIPLY));
        mq mqVar = new mq(org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(6.0f), -13750737), mutate);
        mqVar.f37616x = false;
        int L = org.telegram.messenger.g0.L(18.0f);
        int L2 = org.telegram.messenger.g0.L(18.0f);
        mqVar.f37610e = L;
        mqVar.f37611f = L2;
        if (efVar != null && (str2 = efVar.f27850c) != null) {
            imageReceiver.s0(fc.g(str2), "30.0_30.0", null, null, mqVar, null, 0);
        } else {
            if (efVar != null) {
                int i11 = efVar.C;
                String str5 = efVar.I;
                if (str5 != null) {
                    if (efVar.f27849b) {
                        imageReceiver.s0(fc.g("vthumb://" + i11 + ":" + str5), "30.0_30.0", null, null, mqVar, null, 0);
                    } else {
                        imageReceiver.s0(fc.g("thumb://" + i11 + ":" + str5), "30.0_30.0", null, null, mqVar, null, 0);
                    }
                }
            }
            imageReceiver.w0(mqVar);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) str4);
        if (i7 > 0) {
            str3 = " " + gd.H(',', "Media", i7);
        }
        sb2.append(str3);
        setContentDescription(sb2.toString());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float paddingLeft = getPaddingLeft();
        ImageReceiver imageReceiver = this.f14166a;
        imageReceiver.y0(paddingLeft, (getMeasuredHeight() - org.telegram.messenger.g0.L(30.0f)) / 2.0f, org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(30.0f));
        imageReceiver.h(canvas, null);
        float L = paddingLeft + org.telegram.messenger.g0.L(30.0f) + org.telegram.messenger.g0.L(12.0f);
        if (this.f14169e != null) {
            canvas.save();
            canvas.translate(L - this.h, (getMeasuredHeight() - this.f14169e.getHeight()) / 2.0f);
            this.f14169e.draw(canvas);
            L = L + this.f14170f + org.telegram.messenger.g0.L(6.0f);
            canvas.restore();
        }
        if (this.f14172r != null) {
            canvas.save();
            canvas.translate(L - this.f14174w, org.telegram.messenger.g0.N(1.6f) + ((getMeasuredHeight() - this.f14172r.getHeight()) / 2.0f));
            this.f14172r.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f14166a.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f14166a.R();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        float f11;
        float f12;
        int size = (((View.MeasureSpec.getSize(i7) - org.telegram.messenger.g0.L(30.0f)) - org.telegram.messenger.g0.L(12.0f)) - getPaddingLeft()) - getPaddingRight();
        StaticLayout staticLayout = this.f14169e;
        if (staticLayout == null || staticLayout.getWidth() != size) {
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            String str = this.f14167b;
            TextPaint textPaint = this.d;
            CharSequence ellipsize = TextUtils.ellipsize(str, textPaint, size, truncateAt);
            int max = Math.max(0, size);
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            StaticLayout staticLayout2 = new StaticLayout(ellipsize, textPaint, max, alignment, 1.0f, 0.0f, false);
            this.f14169e = staticLayout2;
            int lineCount = staticLayout2.getLineCount();
            float f13 = 0.0f;
            if (lineCount > 0) {
                f10 = this.f14169e.getLineLeft(0);
            } else {
                f10 = 0.0f;
            }
            this.h = f10;
            if (this.f14169e.getLineCount() > 0) {
                f11 = this.f14169e.getLineWidth(0);
            } else {
                f11 = 0.0f;
            }
            this.f14170f = f11;
            int L = size - ((int) (f11 + org.telegram.messenger.g0.L(8.0f)));
            TextPaint textPaint2 = this.f14171n;
            StaticLayout staticLayout3 = new StaticLayout(TextUtils.ellipsize(this.f14168c, textPaint2, L, truncateAt), textPaint2, Math.max(0, L), alignment, 1.0f, 0.0f, false);
            this.f14172r = staticLayout3;
            if (staticLayout3.getLineCount() > 0) {
                f12 = this.f14172r.getLineLeft(0);
            } else {
                f12 = 0.0f;
            }
            this.f14174w = f12;
            if (this.f14172r.getLineCount() > 0) {
                f13 = this.f14172r.getLineWidth(0);
            }
            this.f14173s = f13;
        }
        if (View.MeasureSpec.getMode(i7) == Integer.MIN_VALUE) {
            setMeasuredDimension((int) Math.min(org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.L(30.0f) + getPaddingLeft() + this.f14170f + org.telegram.messenger.g0.L(8.0f) + this.f14173s + getPaddingRight(), View.MeasureSpec.getSize(i7)), org.telegram.messenger.g0.L(48.0f));
        } else if (View.MeasureSpec.getMode(i7) == 1073741824) {
            setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(48.0f));
        }
    }

    @Override
    public final void updateColors() {
        TextPaint textPaint = this.f14171n;
        try {
            int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.E8, this.f14175x);
            this.d.setColor(w02);
            textPaint.setColor(w02);
            textPaint.setAlpha(102);
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
