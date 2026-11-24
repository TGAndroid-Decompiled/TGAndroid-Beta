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
public final class b2c extends FrameLayout implements vlb {
    public final ylb a;
    public boolean b;
    public final y1c c;
    public final TextView d;
    public final FrameLayout.LayoutParams e;
    public final z1c f;
    public boolean h;
    public final ImageView n;
    public int r;
    public final ln s;

    public b2c(Context context, ylb ylbVar) {
        super(context);
        int i;
        float f;
        this.r = -1;
        this.s = new ln(this, 0L, 320L, d53.h);
        this.a = ylbVar;
        setClipToPadding(false);
        setPadding(gm.L(20.0f), 0, gm.L(20.0f), gm.L(16.0f));
        y1c y1cVar = new y1c(this, context);
        this.c = y1cVar;
        nm7.i(y1cVar);
        y1cVar.setTextSize(1, 16.0f);
        y1cVar.setMaxLines(1);
        y1cVar.setSingleLine();
        y1cVar.setEllipsize(TextUtils.TruncateAt.END);
        addView(y1cVar, qoe.c(-2.0f, -1));
        TextView textView = new TextView(context);
        this.d = textView;
        td4.v(14.0f, 2131751398, 1, textView, null);
        textView.setIncludeFontPadding(false);
        textView.setGravity(17);
        Rect rect = new Rect();
        Paint.FontMetrics fontMetrics = textView.getPaint().getFontMetrics();
        textView.getPaint().getTextBounds("x", 0, 1, rect);
        float f2 = (rect.top / 2.0f) - ((fontMetrics.ascent + fontMetrics.descent) / 2.0f);
        int round = Math.round(Math.abs(f2) * 2.0f);
        int L = gm.L(8.0f);
        if (f2 < 0.0f) {
            i = round;
        } else {
            i = 0;
        }
        textView.setPadding(L, i, gm.L(8.0f), f2 <= 0.0f ? 0 : round);
        rve.a(textView);
        Paint.FontMetrics fontMetrics2 = y1cVar.getPaint().getFontMetrics();
        y1cVar.getPaint().getTextBounds("x", 0, 1, rect);
        if (y1cVar.getIncludeFontPadding()) {
            f = fontMetrics2.top;
        } else {
            f = fontMetrics2.ascent;
        }
        addView(textView, qoe.d(-2, 18.0f, 53, 0.0f, Math.max(0.0f, (((rect.top / 2.0f) + (-f)) - gm.L(9.0f)) / gm.p), 0.0f, 0.0f));
        ?? xnaVar = new xna(context);
        this.f = xnaVar;
        nm7.i(xnaVar);
        xnaVar.setTextSize(1, 16.0f);
        xnaVar.setTextIsSelectable(true);
        FrameLayout.LayoutParams c = qoe.c(-2.0f, -1);
        this.e = c;
        addView((View) xnaVar, c);
        ImageView imageView = new ImageView(context);
        this.n = imageView;
        imageView.setImageResource(2131232109);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(jb6.M0(2131751704, null));
        rve.a(imageView);
        addView(imageView, qoe.d(38, 38.0f, 85, 0.0f, 0.0f, -16.0f, -12.0f));
        imageView.setVisibility(8);
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.F6));
        hashSet.add(Integer.valueOf(cmb.K6));
        hashSet.add(Integer.valueOf(cmb.kg));
        hashSet.add(Integer.valueOf(cmb.lg));
        hashSet.add(Integer.valueOf(cmb.Ei));
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
            Paint U0 = cmb.U0("paintDivider", this.a);
            if (U0 == null) {
                U0 = cmb.j0;
            }
            Paint paint = U0;
            if (jb6.a0) {
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
            if (layout.getLineCount() > 0 && layout.getLineRight(layout.getLineCount() - 1) > layout.getWidth() - gm.L(42.0f)) {
                layoutParams.bottomMargin = gm.L(26.0f);
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
        z1c z1cVar = this.f;
        if (Build.VERSION.SDK_INT >= 29 && !p0f.b()) {
            try {
                Drawable textSelectHandleLeft = z1cVar.getTextSelectHandleLeft();
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                textSelectHandleLeft.setColorFilter(i, mode);
                z1cVar.setTextSelectHandleLeft(textSelectHandleLeft);
                Drawable textSelectHandle = z1cVar.getTextSelectHandle();
                textSelectHandle.setColorFilter(i, mode);
                z1cVar.setTextSelectHandle(textSelectHandle);
                Drawable textSelectHandleRight = z1cVar.getTextSelectHandleRight();
                textSelectHandleRight.setColorFilter(i, mode);
                z1cVar.setTextSelectHandleRight(textSelectHandleRight);
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final void updateColors() {
        int i = cmb.F6;
        ylb ylbVar = this.a;
        this.c.setTextColor(cmb.v0(i, ylbVar));
        int i2 = cmb.K6;
        int v0 = cmb.v0(i2, ylbVar);
        TextView textView = this.d;
        textView.setTextColor(v0);
        textView.setBackground(cmb.b0(gm.L(9.0f), cmb.p1(0.1f, cmb.v0(i2, ylbVar))));
        int v02 = cmb.v0(i, ylbVar);
        z1c z1cVar = this.f;
        z1cVar.setTextColor(v02);
        z1cVar.setLinkTextColor(cmb.v0(i2, ylbVar));
        z1cVar.setHighlightColor(cmb.v0(cmb.kg, ylbVar));
        setHandlesColor(cmb.v0(cmb.lg, ylbVar));
        int i3 = cmb.Ei;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(cmb.v0(i3, ylbVar), PorterDuff.Mode.SRC_IN);
        ImageView imageView = this.n;
        imageView.setColorFilter(porterDuffColorFilter);
        imageView.setBackground(cmb.f0(cmb.p1(0.1f, cmb.v0(i3, ylbVar)), 1, -1));
    }
}
