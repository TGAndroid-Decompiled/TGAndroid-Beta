package ng;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.ja;
import hi.m3;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
public class c extends FrameLayout {
    public final TextView f21114a;
    public final TextView f21115b;
    public final TextView f21116c;
    public final TextView d;
    public boolean f21117e;
    public boolean f21118f;
    public final Drawable h;
    public final int f21119n;
    public final e6 f21120r;

    public c(Context context, e6 e6Var) {
        super(context);
        this.f21117e = true;
        new SimpleDateFormat("d MMM yyyy");
        this.f21120r = e6Var;
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(14.0f);
        textPaint.setTypeface(g0.o());
        int measureText = (int) textPaint.measureText("00 MMM 0000 - 00 MMM 000");
        this.f21119n = measureText;
        TextView textView = new TextView(context);
        this.f21114a = textView;
        i5.c.v(textView, 1, 15.0f);
        addView(textView, ja.d(-2, -2.0f, 8388627, 16.0f, 0.0f, measureText, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 15.0f);
        textView2.setTypeface(Typeface.DEFAULT_BOLD);
        textView2.setGravity(8388627);
        addView(textView2, ja.d(-2, -2.0f, 8388627, 8.0f, 0.0f, 8.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.f21115b = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setTypeface(g0.o());
        textView3.setGravity(8388629);
        addView(textView3, ja.d(-2, -2.0f, 8388629, 16.0f, 0.0f, 16.0f, 0.0f));
        TextView textView4 = new TextView(context);
        this.f21116c = textView4;
        textView4.setTextSize(1, 13.0f);
        textView4.setTypeface(g0.o());
        textView4.setGravity(8388629);
        addView(textView4, ja.d(-2, -2.0f, 8388629, 16.0f, 0.0f, 16.0f, 0.0f));
        textView4.setVisibility(8);
        textView2.setVisibility(8);
        textView2.setText(hd.M0(2131742787, null));
        Drawable drawable = getContext().getDrawable(2131232441);
        this.h = drawable;
        textView2.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        textView2.setCompoundDrawablePadding(g0.L(4.0f));
        textView2.setPadding(g0.L(8.0f), g0.L(4.0f), g0.L(8.0f), g0.L(4.0f));
        textView2.setBackground(j6.J0(g0.L(3.0f), j6.w0(j6.Ii, e6Var)));
        textView4.addOnLayoutChangeListener(new m3(this, 1));
        a();
    }

    public final void a() {
        int i7 = j6.f28957j5;
        TextView textView = this.f21114a;
        e6 e6Var = this.f21120r;
        q6.U(textView, i7, e6Var);
        q6.U(this.f21115b, i7, e6Var);
        q6.U(this.f21116c, i7, e6Var);
        int i10 = j6.Wj;
        q6.U(this.d, i10, e6Var);
        q6.x(this, this.h, i10, e6Var, PorterDuff.Mode.SRC_IN);
    }

    public final void b(long j3, long j10) {
        String format;
        boolean z10 = this.f21117e;
        TextView textView = this.f21115b;
        if (!z10) {
            textView.setVisibility(8);
            this.f21116c.setVisibility(8);
            return;
        }
        if (this.f21118f) {
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
        this.f21117e = z10;
        TextView textView = this.f21114a;
        if (!z10) {
            this.f21116c.setVisibility(8);
            this.f21115b.setVisibility(8);
            textView.setLayoutParams(ja.d(-2, -2.0f, 8388627, 16.0f, 0.0f, 16.0f, 0.0f));
            textView.requestLayout();
            return;
        }
        textView.setLayoutParams(ja.d(-2, -2.0f, 8388627, 16.0f, 0.0f, this.f21119n, 0.0f));
    }

    public final void d(long j3, boolean z10) {
        b(j3, j3);
        TextView textView = this.d;
        textView.setVisibility(0);
        TextView textView2 = this.f21114a;
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
        this.f21114a.setText(str);
    }

    public void setUseWeekInterval(boolean z10) {
        this.f21118f = z10;
    }
}
