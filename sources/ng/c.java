package ng;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.widget.FrameLayout;
import android.widget.TextView;
import bi.s1;
import c8.ma;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
public class c extends FrameLayout {
    public final TextView f21506a;
    public final TextView f21507b;
    public final TextView f21508c;
    public final TextView d;
    public boolean f21509e;
    public boolean f21510f;
    public final Drawable h;
    public final int f21511n;
    public final h6 f21512r;

    public c(Context context, h6 h6Var) {
        super(context);
        this.f21509e = true;
        new SimpleDateFormat("d MMM yyyy");
        this.f21512r = h6Var;
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(14.0f);
        textPaint.setTypeface(g0.o());
        int measureText = (int) textPaint.measureText("00 MMM 0000 - 00 MMM 000");
        this.f21511n = measureText;
        TextView textView = new TextView(context);
        this.f21506a = textView;
        i5.c.x(textView, 1, 15.0f);
        addView(textView, ma.d(-2, -2.0f, 8388627, 16.0f, 0.0f, measureText, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 15.0f);
        textView2.setTypeface(Typeface.DEFAULT_BOLD);
        textView2.setGravity(8388627);
        addView(textView2, ma.d(-2, -2.0f, 8388627, 8.0f, 0.0f, 8.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.f21507b = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setTypeface(g0.o());
        textView3.setGravity(8388629);
        addView(textView3, ma.d(-2, -2.0f, 8388629, 16.0f, 0.0f, 16.0f, 0.0f));
        TextView textView4 = new TextView(context);
        this.f21508c = textView4;
        textView4.setTextSize(1, 13.0f);
        textView4.setTypeface(g0.o());
        textView4.setGravity(8388629);
        addView(textView4, ma.d(-2, -2.0f, 8388629, 16.0f, 0.0f, 16.0f, 0.0f));
        textView4.setVisibility(8);
        textView2.setVisibility(8);
        textView2.setText(hd.N0(2131742521, null));
        Drawable drawable = getContext().getDrawable(2131232442);
        this.h = drawable;
        textView2.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        textView2.setCompoundDrawablePadding(g0.L(4.0f));
        textView2.setPadding(g0.L(8.0f), g0.L(4.0f), g0.L(8.0f), g0.L(4.0f));
        textView2.setBackground(m6.J0(g0.L(3.0f), m6.w0(m6.Ii, h6Var)));
        textView4.addOnLayoutChangeListener(new s1(this, 2));
        a();
    }

    public final void a() {
        int i7 = m6.f29489j5;
        TextView textView = this.f21506a;
        h6 h6Var = this.f21512r;
        t6.U(textView, i7, h6Var);
        t6.U(this.f21507b, i7, h6Var);
        t6.U(this.f21508c, i7, h6Var);
        int i10 = m6.Wj;
        t6.U(this.d, i10, h6Var);
        t6.x(this, this.h, i10, h6Var, PorterDuff.Mode.SRC_IN);
    }

    public final void b(long j3, long j10) {
        String format;
        boolean z10 = this.f21509e;
        TextView textView = this.f21507b;
        if (!z10) {
            textView.setVisibility(8);
            this.f21508c.setVisibility(8);
            return;
        }
        if (this.f21510f) {
            j10 += 604800000;
        }
        if (j10 - j3 >= 86400000) {
            format = hd.E0().C0().format(new Date(j3)) + " — " + hd.E0().C0().format(new Date(j10));
        } else {
            format = hd.E0().C0().format(new Date(j3));
        }
        textView.setText(format);
        textView.setVisibility(0);
    }

    public final void c(boolean z10) {
        this.f21509e = z10;
        TextView textView = this.f21506a;
        if (!z10) {
            this.f21508c.setVisibility(8);
            this.f21507b.setVisibility(8);
            textView.setLayoutParams(ma.d(-2, -2.0f, 8388627, 16.0f, 0.0f, 16.0f, 0.0f));
            textView.requestLayout();
            return;
        }
        textView.setLayoutParams(ma.d(-2, -2.0f, 8388627, 16.0f, 0.0f, this.f21511n, 0.0f));
    }

    public final void d(long j3, boolean z10) {
        b(j3, j3);
        TextView textView = this.d;
        textView.setVisibility(0);
        TextView textView2 = this.f21506a;
        if (z10) {
            textView.setAlpha(0.0f);
            textView.setScaleX(0.3f);
            textView.setScaleY(0.3f);
            textView.setPivotX(0.0f);
            textView.setPivotY(g0.L(40.0f));
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
        this.f21506a.setText(str);
    }

    public void setUseWeekInterval(boolean z10) {
        this.f21510f = z10;
    }
}
