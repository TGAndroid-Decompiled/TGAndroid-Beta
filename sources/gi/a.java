package gi;

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
import org.telegram.messenger.ac;
import org.telegram.messenger.bd;
import org.telegram.messenger.ye;
import org.telegram.ui.Components.xp;
public final class a extends View implements org.telegram.ui.ActionBar.z5 {
    public final ImageReceiver f12370a;
    public final String f12371b;
    public final String f12372c;
    public final TextPaint d;
    public StaticLayout f12373e;
    public float f12374f;
    public float h;
    public final TextPaint f12375n;
    public StaticLayout f12376r;
    public float f12377s;
    public float f12378w;
    public final org.telegram.ui.ActionBar.e6 f12379x;

    public a(Context context, ye yeVar, String str, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        String str2;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f12370a = imageReceiver;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.f12375n = textPaint2;
        this.f12379x = e6Var;
        setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        setBackground(org.telegram.ui.ActionBar.k6.N0(false));
        setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        setLayoutParams(new LinearLayout.LayoutParams(-1, 48));
        int i10 = org.telegram.ui.ActionBar.k6.E8;
        textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(i10, e6Var));
        textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
        textPaint2.setColor(org.telegram.ui.ActionBar.k6.w0(i10, e6Var));
        textPaint2.setAlpha(102);
        textPaint2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        String str3 = "";
        String str4 = "" + ((Object) str);
        this.f12371b = str4;
        this.f12372c = k2.p1.i(i3, "");
        imageReceiver.J0(org.telegram.messenger.g0.L(4.0f));
        Drawable mutate = context.getResources().getDrawable(2131232220).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(1308622847, PorterDuff.Mode.MULTIPLY));
        xp xpVar = new xp(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(6.0f), -13750737), mutate);
        xpVar.f40447x = false;
        int L = org.telegram.messenger.g0.L(18.0f);
        int L2 = org.telegram.messenger.g0.L(18.0f);
        xpVar.f40441e = L;
        xpVar.f40442f = L2;
        if (yeVar != null && (str2 = yeVar.f25311c) != null) {
            imageReceiver.s0(ac.g(str2), "30.0_30.0", null, null, xpVar, null, 0);
        } else {
            if (yeVar != null) {
                int i11 = yeVar.C;
                String str5 = yeVar.I;
                if (str5 != null) {
                    if (yeVar.f25310b) {
                        imageReceiver.s0(ac.g("vthumb://" + i11 + ":" + str5), "30.0_30.0", null, null, xpVar, null, 0);
                    } else {
                        imageReceiver.s0(ac.g("thumb://" + i11 + ":" + str5), "30.0_30.0", null, null, xpVar, null, 0);
                    }
                }
            }
            imageReceiver.w0(xpVar);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) str4);
        if (i3 > 0) {
            str3 = " " + bd.H(',', "Media", i3);
        }
        sb2.append(str3);
        setContentDescription(sb2.toString());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float paddingLeft = getPaddingLeft();
        ImageReceiver imageReceiver = this.f12370a;
        imageReceiver.y0(paddingLeft, (getMeasuredHeight() - org.telegram.messenger.g0.L(30.0f)) / 2.0f, org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(30.0f));
        imageReceiver.h(canvas, null);
        float L = paddingLeft + org.telegram.messenger.g0.L(30.0f) + org.telegram.messenger.g0.L(12.0f);
        if (this.f12373e != null) {
            canvas.save();
            canvas.translate(L - this.h, (getMeasuredHeight() - this.f12373e.getHeight()) / 2.0f);
            this.f12373e.draw(canvas);
            L = L + this.f12374f + org.telegram.messenger.g0.L(6.0f);
            canvas.restore();
        }
        if (this.f12376r != null) {
            canvas.save();
            canvas.translate(L - this.f12378w, org.telegram.messenger.g0.N(1.6f) + ((getMeasuredHeight() - this.f12376r.getHeight()) / 2.0f));
            this.f12376r.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f12370a.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f12370a.R();
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        float f10;
        float f11;
        float f12;
        int size = (((View.MeasureSpec.getSize(i3) - org.telegram.messenger.g0.L(30.0f)) - org.telegram.messenger.g0.L(12.0f)) - getPaddingLeft()) - getPaddingRight();
        StaticLayout staticLayout = this.f12373e;
        if (staticLayout == null || staticLayout.getWidth() != size) {
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            String str = this.f12371b;
            TextPaint textPaint = this.d;
            CharSequence ellipsize = TextUtils.ellipsize(str, textPaint, size, truncateAt);
            int max = Math.max(0, size);
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            StaticLayout staticLayout2 = new StaticLayout(ellipsize, textPaint, max, alignment, 1.0f, 0.0f, false);
            this.f12373e = staticLayout2;
            int lineCount = staticLayout2.getLineCount();
            float f13 = 0.0f;
            if (lineCount > 0) {
                f10 = this.f12373e.getLineLeft(0);
            } else {
                f10 = 0.0f;
            }
            this.h = f10;
            if (this.f12373e.getLineCount() > 0) {
                f11 = this.f12373e.getLineWidth(0);
            } else {
                f11 = 0.0f;
            }
            this.f12374f = f11;
            int L = size - ((int) (f11 + org.telegram.messenger.g0.L(8.0f)));
            TextPaint textPaint2 = this.f12375n;
            StaticLayout staticLayout3 = new StaticLayout(TextUtils.ellipsize(this.f12372c, textPaint2, L, truncateAt), textPaint2, Math.max(0, L), alignment, 1.0f, 0.0f, false);
            this.f12376r = staticLayout3;
            if (staticLayout3.getLineCount() > 0) {
                f12 = this.f12376r.getLineLeft(0);
            } else {
                f12 = 0.0f;
            }
            this.f12378w = f12;
            if (this.f12376r.getLineCount() > 0) {
                f13 = this.f12376r.getLineWidth(0);
            }
            this.f12377s = f13;
        }
        if (View.MeasureSpec.getMode(i3) == Integer.MIN_VALUE) {
            setMeasuredDimension((int) Math.min(org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.L(30.0f) + getPaddingLeft() + this.f12374f + org.telegram.messenger.g0.L(8.0f) + this.f12377s + getPaddingRight(), View.MeasureSpec.getSize(i3)), org.telegram.messenger.g0.L(48.0f));
        } else if (View.MeasureSpec.getMode(i3) == 1073741824) {
            setMeasuredDimension(View.MeasureSpec.getSize(i3), org.telegram.messenger.g0.L(48.0f));
        }
    }

    @Override
    public final void updateColors() {
        TextPaint textPaint = this.f12375n;
        try {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, this.f12379x);
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
