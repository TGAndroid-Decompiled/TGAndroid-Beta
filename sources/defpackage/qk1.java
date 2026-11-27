package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.text.SimpleDateFormat;
import java.util.Date;
public class qk1 extends FrameLayout {
    public final TextView a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public boolean e;
    public boolean f;
    public final Drawable h;
    public final int n;
    public final vnb r;

    public qk1(Context context, vnb vnbVar) {
        super(context);
        this.e = true;
        new SimpleDateFormat("d MMM yyyy");
        this.r = vnbVar;
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(14.0f);
        textPaint.setTypeface(hl.o());
        int measureText = (int) textPaint.measureText("00 MMM 0000 - 00 MMM 000");
        this.n = measureText;
        TextView textView = new TextView(context);
        this.a = textView;
        bs2.t(textView, 1, 15.0f);
        addView(textView, tre.d(-2, -2.0f, 8388627, 16.0f, 0.0f, measureText, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 15.0f);
        textView2.setTypeface(Typeface.DEFAULT_BOLD);
        textView2.setGravity(8388627);
        addView(textView2, tre.d(-2, -2.0f, 8388627, 8.0f, 0.0f, 8.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.b = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setTypeface(hl.o());
        textView3.setGravity(8388629);
        addView(textView3, tre.d(-2, -2.0f, 8388629, 16.0f, 0.0f, 16.0f, 0.0f));
        TextView textView4 = new TextView(context);
        this.c = textView4;
        textView4.setTextSize(1, 13.0f);
        textView4.setTypeface(hl.o());
        textView4.setGravity(8388629);
        addView(textView4, tre.d(-2, -2.0f, 8388629, 16.0f, 0.0f, 16.0f, 0.0f));
        textView4.setVisibility(8);
        textView2.setVisibility(8);
        textView2.setText(ob6.M0(2131742418, null));
        Drawable drawable = getContext().getDrawable(2131232445);
        this.h = drawable;
        textView2.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        textView2.setCompoundDrawablePadding(hl.L(4.0f));
        textView2.setPadding(hl.L(8.0f), hl.L(4.0f), hl.L(8.0f), hl.L(4.0f));
        textView2.setBackground(aob.H0(hl.L(3.0f), aob.v0(aob.Ii, vnbVar)));
        textView4.addOnLayoutChangeListener(new pk1(this, (byte) 0));
        a();
    }

    public final void a() {
        int i = aob.j5;
        TextView textView = this.a;
        vnb vnbVar = this.r;
        yob.X(textView, i, vnbVar);
        yob.X(this.b, i, vnbVar);
        yob.X(this.c, i, vnbVar);
        int i2 = aob.Wj;
        yob.X(this.d, i2, vnbVar);
        yob.x(this, this.h, i2, vnbVar, PorterDuff.Mode.SRC_IN);
    }

    public final void b(long j, long j2) {
        String format;
        boolean z = this.e;
        TextView textView = this.b;
        if (!z) {
            textView.setVisibility(8);
            this.c.setVisibility(8);
            return;
        }
        if (this.f) {
            j2 += 604800000;
        }
        if (j2 - j >= 86400000) {
            format = ob6.D0().B0().format(new Date(j)) + " — " + ob6.D0().B0().format(new Date(j2));
        } else {
            format = ob6.D0().B0().format(new Date(j));
        }
        textView.setText(format);
        textView.setVisibility(0);
    }

    public final void c(boolean z) {
        this.e = z;
        TextView textView = this.a;
        if (!z) {
            this.c.setVisibility(8);
            this.b.setVisibility(8);
            textView.setLayoutParams(tre.d(-2, -2.0f, 8388627, 16.0f, 0.0f, 16.0f, 0.0f));
            textView.requestLayout();
            return;
        }
        textView.setLayoutParams(tre.d(-2, -2.0f, 8388627, 16.0f, 0.0f, this.n, 0.0f));
    }

    public final void d(long j, boolean z) {
        b(j, j);
        TextView textView = this.d;
        textView.setVisibility(0);
        TextView textView2 = this.a;
        if (z) {
            textView.setAlpha(0.0f);
            textView.setScaleX(0.3f);
            textView.setScaleY(0.3f);
            textView.setPivotX(0.0f);
            textView.setPivotY(hl.L(40.0f));
            textView.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(200L).start();
            textView2.setAlpha(1.0f);
            textView2.setTranslationX(0.0f);
            textView2.setTranslationY(0.0f);
            textView2.setScaleX(1.0f);
            textView2.setScaleY(1.0f);
            textView2.setPivotX(0.0f);
            textView2.setPivotY(0.0f);
            textView2.animate().alpha(0.0f).scaleY(0.3f).scaleX(0.3f).setDuration(200L).start();
            return;
        }
        textView.setAlpha(1.0f);
        textView.setTranslationX(0.0f);
        textView.setTranslationY(0.0f);
        textView.setScaleX(1.0f);
        textView.setScaleY(1.0f);
        textView2.setAlpha(0.0f);
    }

    public void setTitle(String str) {
        this.a.setText(str);
    }

    public void setUseWeekInterval(boolean z) {
        this.f = z;
    }
}
