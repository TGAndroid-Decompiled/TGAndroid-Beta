package ng;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.ha;
import fi.n3;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.s6;
public class c extends FrameLayout {
    public final TextView f20544a;
    public final TextView f20545b;
    public final TextView f20546c;
    public final TextView d;
    public boolean f20547e;
    public boolean f20548f;
    public final Drawable h;
    public final int f20549n;
    public final g6 f20550r;

    public c(Context context, g6 g6Var) {
        super(context);
        this.f20547e = true;
        new SimpleDateFormat("d MMM yyyy");
        this.f20550r = g6Var;
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(14.0f);
        textPaint.setTypeface(g0.o());
        int measureText = (int) textPaint.measureText("00 MMM 0000 - 00 MMM 000");
        this.f20549n = measureText;
        TextView textView = new TextView(context);
        this.f20544a = textView;
        com.google.android.recaptcha.internal.a.q(textView, 1, 15.0f);
        addView(textView, ha.d(-2, -2.0f, 8388627, 16.0f, 0.0f, measureText, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 15.0f);
        textView2.setTypeface(Typeface.DEFAULT_BOLD);
        textView2.setGravity(8388627);
        addView(textView2, ha.d(-2, -2.0f, 8388627, 8.0f, 0.0f, 8.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.f20545b = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setTypeface(g0.o());
        textView3.setGravity(8388629);
        addView(textView3, ha.d(-2, -2.0f, 8388629, 16.0f, 0.0f, 16.0f, 0.0f));
        TextView textView4 = new TextView(context);
        this.f20546c = textView4;
        textView4.setTextSize(1, 13.0f);
        textView4.setTypeface(g0.o());
        textView4.setGravity(8388629);
        addView(textView4, ha.d(-2, -2.0f, 8388629, 16.0f, 0.0f, 16.0f, 0.0f));
        textView4.setVisibility(8);
        textView2.setVisibility(8);
        textView2.setText(id.M0(2131742787, null));
        Drawable drawable = getContext().getDrawable(2131232440);
        this.h = drawable;
        textView2.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        textView2.setCompoundDrawablePadding(g0.L(4.0f));
        textView2.setPadding(g0.L(8.0f), g0.L(4.0f), g0.L(8.0f), g0.L(4.0f));
        textView2.setBackground(l6.J0(g0.L(3.0f), l6.w0(l6.Fi, g6Var)));
        textView4.addOnLayoutChangeListener(new n3(this, 1));
        a();
    }

    public final void a() {
        int i7 = l6.f27973j5;
        TextView textView = this.f20544a;
        g6 g6Var = this.f20550r;
        s6.U(textView, i7, g6Var);
        s6.U(this.f20545b, i7, g6Var);
        s6.U(this.f20546c, i7, g6Var);
        int i10 = l6.Tj;
        s6.U(this.d, i10, g6Var);
        s6.x(this, this.h, i10, g6Var, PorterDuff.Mode.SRC_IN);
    }

    public final void b(long j3, long j10) {
        String format;
        boolean z9 = this.f20547e;
        TextView textView = this.f20545b;
        if (!z9) {
            textView.setVisibility(8);
            this.f20546c.setVisibility(8);
            return;
        }
        if (this.f20548f) {
            j10 += 604800000;
        }
        if (j10 - j3 >= 86400000) {
            format = id.E0().C0().format(new Date(j3)) + " — " + id.E0().C0().format(new Date(j10));
        } else {
            format = id.E0().C0().format(new Date(j3));
        }
        textView.setText(format);
        textView.setVisibility(0);
    }

    public final void c(boolean z9) {
        this.f20547e = z9;
        TextView textView = this.f20544a;
        if (!z9) {
            this.f20546c.setVisibility(8);
            this.f20545b.setVisibility(8);
            textView.setLayoutParams(ha.d(-2, -2.0f, 8388627, 16.0f, 0.0f, 16.0f, 0.0f));
            textView.requestLayout();
            return;
        }
        textView.setLayoutParams(ha.d(-2, -2.0f, 8388627, 16.0f, 0.0f, this.f20549n, 0.0f));
    }

    public final void d(long j3, boolean z9) {
        b(j3, j3);
        TextView textView = this.d;
        textView.setVisibility(0);
        TextView textView2 = this.f20544a;
        if (z9) {
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
        this.f20544a.setText(str);
    }

    public void setUseWeekInterval(boolean z9) {
        this.f20548f = z9;
    }
}
