package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class cd extends FrameLayout {
    public final ylb a;
    public final bf0 b;
    public final pc0 c;
    public final tm d;
    public final TextView e;
    public final TextView f;
    public final ImageView h;
    public final ImageView n;
    public boolean r;

    public cd(int i, ylb ylbVar, Context context) {
        super(context);
        int i2;
        int i3;
        int i4;
        float f;
        float f2;
        int i5;
        pc0 pc0Var = new pc0((ylb) null);
        this.c = pc0Var;
        this.a = ylbVar;
        bf0 bf0Var = new bf0(context);
        this.b = bf0Var;
        bf0Var.setRoundRadius(gm.L(8.0f));
        pc0Var.r = gm.L(8.0f);
        if (jb6.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        addView(bf0Var, qoe.d(28, 28.0f, i2 | 16, 15.0f, 0.0f, 15.0f, 0.0f));
        tm tmVar = new tm(gm.L(28.0f), 7, bf0Var, false);
        this.d = tmVar;
        tmVar.y = Integer.valueOf(i);
        LinearLayout i6 = hg9.i(context, 1);
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(cmb.v0(cmb.F6, ylbVar));
        textView.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        if (jb6.a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        textView.setGravity(i3);
        i6.addView(textView, qoe.o(-1, -2));
        TextView textView2 = new TextView(context);
        this.f = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setTextColor(cmb.v0(cmb.x6, ylbVar));
        textView2.setSingleLine();
        textView2.setEllipsize(truncateAt);
        if (jb6.a0) {
            i4 = 5;
        } else {
            i4 = 3;
        }
        textView2.setGravity(i4);
        i6.addView(textView2, qoe.k(0.0f, 2.0f, 0.0f, 0.0f, -1, -2));
        boolean z = jb6.a0;
        if (z) {
            f = 56.0f;
        } else {
            f = 61.0f;
        }
        if (z) {
            f2 = 61.0f;
        } else {
            f2 = 56.0f;
        }
        addView(i6, qoe.d(-1, -2.0f, 23, f, 0.0f, f2, 0.0f));
        ImageView imageView = new ImageView(context);
        this.h = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131231007);
        int v0 = cmb.v0(cmb.Ci, ylbVar);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(v0, mode));
        if (jb6.a0) {
            i5 = 3;
        } else {
            i5 = 5;
        }
        addView(imageView, qoe.d(24, 24.0f, i5 | 16, 18.0f, 0.0f, 18.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.n = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(2131232065);
        imageView2.setColorFilter(new PorterDuffColorFilter(cmb.v0(cmb.l6, ylbVar), mode));
        if (jb6.a0) {
            imageView2.setScaleX(-1.0f);
        }
        addView(imageView2, qoe.d(24, 24.0f, (jb6.a0 ? 3 : 5) | 16, 14.0f, 0.0f, 14.0f, 0.0f));
        setWillNotDraw(false);
    }

    public final void a(org.telegram.tgnet.tl.TL_agent.agentProvider r10, java.lang.String r11, boolean r12, boolean r13, boolean r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cd.a(org.telegram.tgnet.tl.TL_agent$agentProvider, java.lang.String, boolean, boolean, boolean, boolean):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.b();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i;
        super.onDraw(canvas);
        if (this.r) {
            if (jb6.a0) {
                L = 0.0f;
            } else {
                L = gm.L(61.0f);
            }
            float f = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (jb6.a0) {
                i = gm.L(61.0f);
            } else {
                i = 0;
            }
            canvas.drawLine(f, measuredHeight, measuredWidth - i, getMeasuredHeight() - 1, cmb.U0("paintDivider", this.a));
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(60.0f) + (this.r ? 1 : 0), 1073741824));
    }
}
