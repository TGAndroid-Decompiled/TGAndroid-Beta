package fi;

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
import org.telegram.messenger.gf;
import org.telegram.messenger.hc;
import org.telegram.messenger.id;
import org.telegram.ui.Components.xp;
public final class a extends View implements org.telegram.ui.ActionBar.b6 {
    public final ImageReceiver f11575a;
    public final String f11576b;
    public final String f11577c;
    public final TextPaint d;
    public StaticLayout f11578e;
    public float f11579f;
    public float h;
    public final TextPaint f11580n;
    public StaticLayout f11581r;
    public float f11582s;
    public float f11583w;
    public final org.telegram.ui.ActionBar.g6 f11584x;

    public a(Context context, gf gfVar, String str, int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        String str2;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f11575a = imageReceiver;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.f11580n = textPaint2;
        this.f11584x = g6Var;
        setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        setBackground(org.telegram.ui.ActionBar.l6.N0(false));
        setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        setLayoutParams(new LinearLayout.LayoutParams(-1, 48));
        int i10 = org.telegram.ui.ActionBar.l6.E8;
        textPaint.setColor(org.telegram.ui.ActionBar.l6.w0(i10, g6Var));
        textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
        textPaint2.setColor(org.telegram.ui.ActionBar.l6.w0(i10, g6Var));
        textPaint2.setAlpha(102);
        textPaint2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        String str3 = "";
        String str4 = "" + ((Object) str);
        this.f11576b = str4;
        this.f11577c = jg.g.j(i7, "");
        imageReceiver.J0(org.telegram.messenger.g0.L(4.0f));
        Drawable mutate = context.getResources().getDrawable(2131232220).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(1308622847, PorterDuff.Mode.MULTIPLY));
        xp xpVar = new xp(org.telegram.ui.ActionBar.l6.d0(org.telegram.messenger.g0.L(6.0f), -13750737), mutate);
        xpVar.f40453x = false;
        int L = org.telegram.messenger.g0.L(18.0f);
        int L2 = org.telegram.messenger.g0.L(18.0f);
        xpVar.f40447e = L;
        xpVar.f40448f = L2;
        if (gfVar != null && (str2 = gfVar.f26846c) != null) {
            imageReceiver.s0(hc.g(str2), "30.0_30.0", null, null, xpVar, null, 0);
        } else {
            if (gfVar != null) {
                int i11 = gfVar.C;
                String str5 = gfVar.I;
                if (str5 != null) {
                    if (gfVar.f26845b) {
                        imageReceiver.s0(hc.g("vthumb://" + i11 + ":" + str5), "30.0_30.0", null, null, xpVar, null, 0);
                    } else {
                        imageReceiver.s0(hc.g("thumb://" + i11 + ":" + str5), "30.0_30.0", null, null, xpVar, null, 0);
                    }
                }
            }
            imageReceiver.w0(xpVar);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) str4);
        if (i7 > 0) {
            str3 = " " + id.H(',', "Media", i7);
        }
        sb2.append(str3);
        setContentDescription(sb2.toString());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float paddingLeft = getPaddingLeft();
        ImageReceiver imageReceiver = this.f11575a;
        imageReceiver.y0(paddingLeft, (getMeasuredHeight() - org.telegram.messenger.g0.L(30.0f)) / 2.0f, org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(30.0f));
        imageReceiver.h(canvas, null);
        float L = paddingLeft + org.telegram.messenger.g0.L(30.0f) + org.telegram.messenger.g0.L(12.0f);
        if (this.f11578e != null) {
            canvas.save();
            canvas.translate(L - this.h, (getMeasuredHeight() - this.f11578e.getHeight()) / 2.0f);
            this.f11578e.draw(canvas);
            L = L + this.f11579f + org.telegram.messenger.g0.L(6.0f);
            canvas.restore();
        }
        if (this.f11581r != null) {
            canvas.save();
            canvas.translate(L - this.f11583w, org.telegram.messenger.g0.N(1.6f) + ((getMeasuredHeight() - this.f11581r.getHeight()) / 2.0f));
            this.f11581r.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f11575a.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f11575a.R();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        float f11;
        float f12;
        int size = (((View.MeasureSpec.getSize(i7) - org.telegram.messenger.g0.L(30.0f)) - org.telegram.messenger.g0.L(12.0f)) - getPaddingLeft()) - getPaddingRight();
        StaticLayout staticLayout = this.f11578e;
        if (staticLayout == null || staticLayout.getWidth() != size) {
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            String str = this.f11576b;
            TextPaint textPaint = this.d;
            CharSequence ellipsize = TextUtils.ellipsize(str, textPaint, size, truncateAt);
            int max = Math.max(0, size);
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            StaticLayout staticLayout2 = new StaticLayout(ellipsize, textPaint, max, alignment, 1.0f, 0.0f, false);
            this.f11578e = staticLayout2;
            int lineCount = staticLayout2.getLineCount();
            float f13 = 0.0f;
            if (lineCount > 0) {
                f10 = this.f11578e.getLineLeft(0);
            } else {
                f10 = 0.0f;
            }
            this.h = f10;
            if (this.f11578e.getLineCount() > 0) {
                f11 = this.f11578e.getLineWidth(0);
            } else {
                f11 = 0.0f;
            }
            this.f11579f = f11;
            int L = size - ((int) (f11 + org.telegram.messenger.g0.L(8.0f)));
            TextPaint textPaint2 = this.f11580n;
            StaticLayout staticLayout3 = new StaticLayout(TextUtils.ellipsize(this.f11577c, textPaint2, L, truncateAt), textPaint2, Math.max(0, L), alignment, 1.0f, 0.0f, false);
            this.f11581r = staticLayout3;
            if (staticLayout3.getLineCount() > 0) {
                f12 = this.f11581r.getLineLeft(0);
            } else {
                f12 = 0.0f;
            }
            this.f11583w = f12;
            if (this.f11581r.getLineCount() > 0) {
                f13 = this.f11581r.getLineWidth(0);
            }
            this.f11582s = f13;
        }
        if (View.MeasureSpec.getMode(i7) == Integer.MIN_VALUE) {
            setMeasuredDimension((int) Math.min(org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.L(30.0f) + getPaddingLeft() + this.f11579f + org.telegram.messenger.g0.L(8.0f) + this.f11582s + getPaddingRight(), View.MeasureSpec.getSize(i7)), org.telegram.messenger.g0.L(48.0f));
        } else if (View.MeasureSpec.getMode(i7) == 1073741824) {
            setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(48.0f));
        }
    }

    @Override
    public final void updateColors() {
        TextPaint textPaint = this.f11580n;
        try {
            int w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.E8, this.f11584x);
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
