package og;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.widget.FrameLayout;
import android.widget.TextView;
import b8.mf;
import gi.m3;
import java.text.SimpleDateFormat;
import java.util.Date;
import k2.p1;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
public class c extends FrameLayout {
    public final TextView f21061a;
    public final TextView f21062b;
    public final TextView f21063c;
    public final TextView d;
    public boolean f21064e;
    public boolean f21065f;
    public final Drawable h;
    public final int f21066n;
    public final e6 f21067r;

    public c(Context context, e6 e6Var) {
        super(context);
        this.f21064e = true;
        new SimpleDateFormat("d MMM yyyy");
        this.f21067r = e6Var;
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(14.0f);
        textPaint.setTypeface(g0.o());
        int measureText = (int) textPaint.measureText("00 MMM 0000 - 00 MMM 000");
        this.f21066n = measureText;
        TextView textView = new TextView(context);
        this.f21061a = textView;
        p1.t(textView, 1, 15.0f);
        addView(textView, mf.d(-2, -2.0f, 8388627, 16.0f, 0.0f, measureText, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 15.0f);
        textView2.setTypeface(Typeface.DEFAULT_BOLD);
        textView2.setGravity(8388627);
        addView(textView2, mf.d(-2, -2.0f, 8388627, 8.0f, 0.0f, 8.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.f21062b = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setTypeface(g0.o());
        textView3.setGravity(8388629);
        addView(textView3, mf.d(-2, -2.0f, 8388629, 16.0f, 0.0f, 16.0f, 0.0f));
        TextView textView4 = new TextView(context);
        this.f21063c = textView4;
        textView4.setTextSize(1, 13.0f);
        textView4.setTypeface(g0.o());
        textView4.setGravity(8388629);
        addView(textView4, mf.d(-2, -2.0f, 8388629, 16.0f, 0.0f, 16.0f, 0.0f));
        textView4.setVisibility(8);
        textView2.setVisibility(8);
        textView2.setText(bd.M0(2131742797, null));
        Drawable drawable = getContext().getDrawable(2131232440);
        this.h = drawable;
        textView2.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        textView2.setCompoundDrawablePadding(g0.L(4.0f));
        textView2.setPadding(g0.L(8.0f), g0.L(4.0f), g0.L(8.0f), g0.L(4.0f));
        textView2.setBackground(k6.J0(g0.L(3.0f), k6.w0(k6.Fi, e6Var)));
        textView4.addOnLayoutChangeListener(new m3(this, 1));
        a();
    }

    public final void a() {
        int i3 = k6.f27988j5;
        TextView textView = this.f21061a;
        e6 e6Var = this.f21067r;
        r6.V(textView, i3, e6Var);
        r6.V(this.f21062b, i3, e6Var);
        r6.V(this.f21063c, i3, e6Var);
        int i10 = k6.Tj;
        r6.V(this.d, i10, e6Var);
        r6.y(this, this.h, i10, e6Var, PorterDuff.Mode.SRC_IN);
    }

    public final void b(long j10, long j11) {
        String format;
        boolean z10 = this.f21064e;
        TextView textView = this.f21062b;
        if (!z10) {
            textView.setVisibility(8);
            this.f21063c.setVisibility(8);
            return;
        }
        if (this.f21065f) {
            j11 += 604800000;
        }
        if (j11 - j10 >= 86400000) {
            format = bd.E0().C0().format(new Date(j10)) + " — " + bd.E0().C0().format(new Date(j11));
        } else {
            format = bd.E0().C0().format(new Date(j10));
        }
        textView.setText(format);
        textView.setVisibility(0);
    }

    public final void c(boolean z10) {
        this.f21064e = z10;
        TextView textView = this.f21061a;
        if (!z10) {
            this.f21063c.setVisibility(8);
            this.f21062b.setVisibility(8);
            textView.setLayoutParams(mf.d(-2, -2.0f, 8388627, 16.0f, 0.0f, 16.0f, 0.0f));
            textView.requestLayout();
            return;
        }
        textView.setLayoutParams(mf.d(-2, -2.0f, 8388627, 16.0f, 0.0f, this.f21066n, 0.0f));
    }

    public final void d(long j10, boolean z10) {
        b(j10, j10);
        TextView textView = this.d;
        textView.setVisibility(0);
        TextView textView2 = this.f21061a;
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
        this.f21061a.setText(str);
    }

    public void setUseWeekInterval(boolean z10) {
        this.f21065f = z10;
    }
}
