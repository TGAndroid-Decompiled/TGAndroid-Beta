package lg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.internal.play_billing.k3;
import ei.y3;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import w7.z5;
public class c extends FrameLayout {
    public final TextView f16095a;
    public final TextView f16096b;
    public final TextView f16097c;
    public final TextView d;
    public boolean e;
    public boolean f16098f;
    public final Drawable h;
    public final int f16099n;
    public final g6 f16100r;

    public c(Context context, g6 g6Var) {
        super(context);
        this.e = true;
        new SimpleDateFormat("d MMM yyyy");
        this.f16100r = g6Var;
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(14.0f);
        textPaint.setTypeface(AndroidUtilities.bold());
        int measureText = (int) textPaint.measureText("00 MMM 0000 - 00 MMM 000");
        this.f16099n = measureText;
        TextView textView = new TextView(context);
        this.f16095a = textView;
        k3.m(15.0f, 1, textView);
        addView(textView, z5.d(-2, -2.0f, 8388627, 16.0f, 0.0f, measureText, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 15.0f);
        textView2.setTypeface(Typeface.DEFAULT_BOLD);
        textView2.setGravity(8388627);
        addView(textView2, z5.d(-2, -2.0f, 8388627, 8.0f, 0.0f, 8.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.f16096b = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setGravity(8388629);
        addView(textView3, z5.d(-2, -2.0f, 8388629, 16.0f, 0.0f, 16.0f, 0.0f));
        TextView textView4 = new TextView(context);
        this.f16097c = textView4;
        textView4.setTextSize(1, 13.0f);
        textView4.setTypeface(AndroidUtilities.bold());
        textView4.setGravity(8388629);
        addView(textView4, z5.d(-2, -2.0f, 8388629, 16.0f, 0.0f, 16.0f, 0.0f));
        textView4.setVisibility(8);
        textView2.setVisibility(8);
        textView2.setText(LocaleController.getString(R.string.ZoomOut));
        Drawable drawable = getContext().getDrawable(R.drawable.msg_zoomout_stats);
        this.h = drawable;
        textView2.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        textView2.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
        textView2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f));
        textView2.setBackground(k6.I0(AndroidUtilities.dp(3.0f), k6.w0(k6.Rh, g6Var)));
        textView4.addOnLayoutChangeListener(new y3(this, 1));
        a();
    }

    public final void a() {
        int i10 = k6.f21290j5;
        TextView textView = this.f16095a;
        g6 g6Var = this.f16100r;
        r6.W(textView, i10, g6Var);
        r6.W(this.f16096b, i10, g6Var);
        r6.W(this.f16097c, i10, g6Var);
        int i11 = k6.fj;
        r6.W(this.d, i11, g6Var);
        r6.z(this, this.h, i11, g6Var, PorterDuff.Mode.SRC_IN);
    }

    public final void b(long j10, long j11) {
        String format;
        boolean z10 = this.e;
        TextView textView = this.f16096b;
        if (!z10) {
            textView.setVisibility(8);
            this.f16097c.setVisibility(8);
            return;
        }
        if (this.f16098f) {
            j11 += 604800000;
        }
        if (j11 - j10 >= 86400000) {
            format = LocaleController.getInstance().getFormatterYear().format(new Date(j10)) + " — " + LocaleController.getInstance().getFormatterYear().format(new Date(j11));
        } else {
            format = LocaleController.getInstance().getFormatterYear().format(new Date(j10));
        }
        textView.setText(format);
        textView.setVisibility(0);
    }

    public final void c(boolean z10) {
        this.e = z10;
        TextView textView = this.f16095a;
        if (!z10) {
            this.f16097c.setVisibility(8);
            this.f16096b.setVisibility(8);
            textView.setLayoutParams(z5.d(-2, -2.0f, 8388627, 16.0f, 0.0f, 16.0f, 0.0f));
            textView.requestLayout();
            return;
        }
        textView.setLayoutParams(z5.d(-2, -2.0f, 8388627, 16.0f, 0.0f, this.f16099n, 0.0f));
    }

    public final void d(long j10, boolean z10) {
        b(j10, j10);
        TextView textView = this.d;
        textView.setVisibility(0);
        TextView textView2 = this.f16095a;
        if (z10) {
            textView.setAlpha(0.0f);
            textView.setScaleX(0.3f);
            textView.setScaleY(0.3f);
            textView.setPivotX(0.0f);
            textView.setPivotY(AndroidUtilities.dp(40.0f));
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
        this.f16095a.setText(str);
    }

    public void setUseWeekInterval(boolean z10) {
        this.f16098f = z10;
    }
}
