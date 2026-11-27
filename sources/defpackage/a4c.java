package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
public final class a4c extends FrameLayout implements snb {
    public final vnb a;
    public boolean b;
    public final x3c c;
    public final TextView d;
    public final FrameLayout.LayoutParams e;
    public final y3c f;
    public boolean h;
    public final ImageView n;
    public int r;
    public final mm s;

    public a4c(Context context, vnb vnbVar) {
        super(context);
        int i;
        float f;
        this.r = -1;
        this.s = new mm(this, 0L, 320L, k43.h);
        this.a = vnbVar;
        setClipToPadding(false);
        setPadding(hl.L(20.0f), 0, hl.L(20.0f), hl.L(16.0f));
        x3c x3cVar = new x3c(this, context);
        this.c = x3cVar;
        jn7.i(x3cVar);
        x3cVar.setTextSize(1, 16.0f);
        x3cVar.setMaxLines(1);
        x3cVar.setSingleLine();
        x3cVar.setEllipsize(TextUtils.TruncateAt.END);
        addView(x3cVar, tre.c(-2.0f, -1));
        TextView textView = new TextView(context);
        this.d = textView;
        qd4.u(14.0f, 2131751426, 1, textView, null);
        textView.setIncludeFontPadding(false);
        textView.setGravity(17);
        Rect rect = new Rect();
        Paint.FontMetrics fontMetrics = textView.getPaint().getFontMetrics();
        textView.getPaint().getTextBounds("x", 0, 1, rect);
        float f2 = (rect.top / 2.0f) - ((fontMetrics.ascent + fontMetrics.descent) / 2.0f);
        int round = Math.round(Math.abs(f2) * 2.0f);
        int L = hl.L(8.0f);
        if (f2 < 0.0f) {
            i = round;
        } else {
            i = 0;
        }
        textView.setPadding(L, i, hl.L(8.0f), f2 <= 0.0f ? 0 : round);
        iye.a(textView);
        Paint.FontMetrics fontMetrics2 = x3cVar.getPaint().getFontMetrics();
        x3cVar.getPaint().getTextBounds("x", 0, 1, rect);
        if (x3cVar.getIncludeFontPadding()) {
            f = fontMetrics2.top;
        } else {
            f = fontMetrics2.ascent;
        }
        addView(textView, tre.d(-2, 18.0f, 53, 0.0f, Math.max(0.0f, (((rect.top / 2.0f) + (-f)) - hl.L(9.0f)) / hl.p), 0.0f, 0.0f));
        ?? tpaVar = new tpa(context);
        this.f = tpaVar;
        jn7.i(tpaVar);
        tpaVar.setTextSize(1, 16.0f);
        tpaVar.setTextIsSelectable(true);
        FrameLayout.LayoutParams c = tre.c(-2.0f, -1);
        this.e = c;
        addView((View) tpaVar, c);
        ImageView imageView = new ImageView(context);
        this.n = imageView;
        imageView.setImageResource(2131232108);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(ob6.M0(2131751732, null));
        iye.a(imageView);
        addView(imageView, tre.d(38, 38.0f, 85, 0.0f, 0.0f, -16.0f, -12.0f));
        imageView.setVisibility(8);
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.G6));
        hashSet.add(Integer.valueOf(aob.L6));
        hashSet.add(Integer.valueOf(aob.lg));
        hashSet.add(Integer.valueOf(aob.mg));
        hashSet.add(Integer.valueOf(aob.Fi));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getWidth(), this.s.e(false, this.r));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        View view;
        super.onDraw(canvas);
        if (this.b) {
            if (this.h) {
                view = this.c;
            } else {
                view = this.f;
            }
            Paint U0 = aob.U0("paintDivider", this.a);
            if (U0 == null) {
                U0 = aob.j0;
            }
            Paint paint = U0;
            if (ob6.a0) {
                canvas.drawRect(0.0f, getMeasuredHeight() - 1, view.getRight(), getMeasuredHeight(), paint);
            } else {
                canvas.drawRect(view.getLeft(), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), paint);
            }
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        this.r = getMeasuredHeight();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
        FrameLayout.LayoutParams layoutParams = this.e;
        layoutParams.bottomMargin = 0;
        super.onMeasure(makeMeasureSpec, i2);
        if (this.n.getVisibility() == 0) {
            Layout layout = this.f.getLayout();
            if (layout.getLineCount() > 0 && layout.getLineRight(layout.getLineCount() - 1) > layout.getWidth() - hl.L(42.0f)) {
                layoutParams.bottomMargin = hl.L(26.0f);
                super.onMeasure(makeMeasureSpec, i2);
            }
        }
        if (getMeasuredHeight() > this.r && !this.h) {
            this.r = getMeasuredHeight();
            invalidate();
            return;
        }
        int measuredHeight = getMeasuredHeight();
        this.r = measuredHeight;
        this.s.e(true, measuredHeight);
    }

    public void setHandlesColor(int i) {
        y3c y3cVar = this.f;
        if (Build.VERSION.SDK_INT >= 29 && !f3f.b()) {
            try {
                Drawable textSelectHandleLeft = y3cVar.getTextSelectHandleLeft();
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                textSelectHandleLeft.setColorFilter(i, mode);
                y3cVar.setTextSelectHandleLeft(textSelectHandleLeft);
                Drawable textSelectHandle = y3cVar.getTextSelectHandle();
                textSelectHandle.setColorFilter(i, mode);
                y3cVar.setTextSelectHandle(textSelectHandle);
                Drawable textSelectHandleRight = y3cVar.getTextSelectHandleRight();
                textSelectHandleRight.setColorFilter(i, mode);
                y3cVar.setTextSelectHandleRight(textSelectHandleRight);
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final void updateColors() {
        int i = aob.G6;
        vnb vnbVar = this.a;
        this.c.setTextColor(aob.v0(i, vnbVar));
        int i2 = aob.L6;
        int v0 = aob.v0(i2, vnbVar);
        TextView textView = this.d;
        textView.setTextColor(v0);
        textView.setBackground(aob.b0(hl.L(9.0f), aob.p1(0.1f, aob.v0(i2, vnbVar))));
        int v02 = aob.v0(i, vnbVar);
        y3c y3cVar = this.f;
        y3cVar.setTextColor(v02);
        y3cVar.setLinkTextColor(aob.v0(i2, vnbVar));
        y3cVar.setHighlightColor(aob.v0(aob.lg, vnbVar));
        setHandlesColor(aob.v0(aob.mg, vnbVar));
        int i3 = aob.Fi;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(aob.v0(i3, vnbVar), PorterDuff.Mode.SRC_IN);
        ImageView imageView = this.n;
        imageView.setColorFilter(porterDuffColorFilter);
        imageView.setBackground(aob.f0(aob.p1(0.1f, aob.v0(i3, vnbVar)), 1, -1));
    }
}
