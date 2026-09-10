package jg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.widget.FrameLayout;
import android.widget.TextView;
import bi.y4;
import com.google.android.gms.internal.vision.e2;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import w7.a6;
public class c extends FrameLayout {
    public final TextView f11893a;
    public final TextView f11894b;
    public final TextView f11895c;
    public final TextView d;
    public boolean e;
    public boolean f11896f;
    public final Drawable h;
    public final int f11897n;
    public final f6 f11898r;

    public c(Context context, f6 f6Var) {
        super(context);
        this.e = true;
        new SimpleDateFormat("d MMM yyyy");
        this.f11898r = f6Var;
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(14.0f);
        textPaint.setTypeface(AndroidUtilities.bold());
        int measureText = (int) textPaint.measureText("00 MMM 0000 - 00 MMM 000");
        this.f11897n = measureText;
        TextView textView = new TextView(context);
        this.f11893a = textView;
        e2.k(15.0f, 1, textView);
        addView(textView, a6.d(-2, -2.0f, 8388627, 16.0f, 0.0f, measureText, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 15.0f);
        textView2.setTypeface(Typeface.DEFAULT_BOLD);
        textView2.setGravity(8388627);
        addView(textView2, a6.d(-2, -2.0f, 8388627, 8.0f, 0.0f, 8.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.f11894b = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setGravity(8388629);
        addView(textView3, a6.d(-2, -2.0f, 8388629, 16.0f, 0.0f, 16.0f, 0.0f));
        TextView textView4 = new TextView(context);
        this.f11895c = textView4;
        textView4.setTextSize(1, 13.0f);
        textView4.setTypeface(AndroidUtilities.bold());
        textView4.setGravity(8388629);
        addView(textView4, a6.d(-2, -2.0f, 8388629, 16.0f, 0.0f, 16.0f, 0.0f));
        textView4.setVisibility(8);
        textView2.setVisibility(8);
        textView2.setText(LocaleController.getString(R.string.ZoomOut));
        Drawable drawable = getContext().getDrawable(R.drawable.msg_zoomout_stats);
        this.h = drawable;
        textView2.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        textView2.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
        textView2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f));
        textView2.setBackground(j6.G0(AndroidUtilities.dp(3.0f), j6.v0(j6.Rh, f6Var)));
        textView4.addOnLayoutChangeListener(new y4(this, 1));
        a();
    }

    public final void a() {
        int i10 = j6.f18034j5;
        f6 f6Var = this.f11898r;
        this.f11893a.setTextColor(j6.v0(i10, f6Var));
        this.f11894b.setTextColor(j6.v0(i10, f6Var));
        this.f11895c.setTextColor(j6.v0(i10, f6Var));
        int i11 = j6.fj;
        this.d.setTextColor(j6.v0(i11, f6Var));
        this.h.setColorFilter(j6.v0(i11, f6Var), PorterDuff.Mode.SRC_IN);
    }

    public final void b(long j3, long j10) {
        String format;
        boolean z10 = this.e;
        TextView textView = this.f11894b;
        if (!z10) {
            textView.setVisibility(8);
            this.f11895c.setVisibility(8);
            return;
        }
        if (this.f11896f) {
            j10 += 604800000;
        }
        if (j10 - j3 >= 86400000) {
            format = LocaleController.getInstance().getFormatterYear().format(new Date(j3)) + " — " + LocaleController.getInstance().getFormatterYear().format(new Date(j10));
        } else {
            format = LocaleController.getInstance().getFormatterYear().format(new Date(j3));
        }
        textView.setText(format);
        textView.setVisibility(0);
    }

    public final void c(boolean z10) {
        this.e = z10;
        TextView textView = this.f11893a;
        if (!z10) {
            this.f11895c.setVisibility(8);
            this.f11894b.setVisibility(8);
            textView.setLayoutParams(a6.d(-2, -2.0f, 8388627, 16.0f, 0.0f, 16.0f, 0.0f));
            textView.requestLayout();
            return;
        }
        textView.setLayoutParams(a6.d(-2, -2.0f, 8388627, 16.0f, 0.0f, this.f11897n, 0.0f));
    }

    public final void d(long j3, boolean z10) {
        b(j3, j3);
        TextView textView = this.d;
        textView.setVisibility(0);
        TextView textView2 = this.f11893a;
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
        this.f11893a.setText(str);
    }

    public void setUseWeekInterval(boolean z10) {
        this.f11896f = z10;
    }
}
