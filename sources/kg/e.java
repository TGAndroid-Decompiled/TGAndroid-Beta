package kg;

import ai.q4;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.z;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.rq;
import w7.y5;
public class e extends FrameLayout {
    public boolean E;
    public boolean F;
    public boolean G;
    public Drawable H;
    public z I;
    public final d6 J;
    public final q4 K;
    public DecimalFormat L;
    public boolean f13596a;
    public final LinearLayout f13597b;
    public oi.f[] f13598c;
    public final TextView d;
    public final TextView e;
    public final ImageView f13599f;
    public final RadialProgressView h;
    public final SimpleDateFormat f13600n;
    public final SimpleDateFormat f13601r;
    public final SimpleDateFormat f13602s;
    public final SimpleDateFormat v;
    public final SimpleDateFormat f13603w;
    public boolean f13604x;
    public boolean f13605y;

    public e(Context context, d6 d6Var) {
        super(context);
        this.f13600n = new SimpleDateFormat("E, ");
        this.f13601r = new SimpleDateFormat("MMM dd");
        this.f13602s = new SimpleDateFormat("d MMM yyyy");
        this.v = new SimpleDateFormat("d MMM");
        this.f13603w = new SimpleDateFormat(" HH:mm");
        this.G = true;
        this.K = new q4(this, 23);
        this.J = d6Var;
        setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f13597b = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        TextView textView2 = new TextView(context);
        this.e = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        ImageView imageView = new ImageView(context);
        this.f13599f = imageView;
        imageView.setImageResource(R.drawable.ic_chevron_right_black_18dp);
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.h = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(12.0f));
        radialProgressView.setStrokeWidth(AndroidUtilities.dp(0.5f));
        radialProgressView.setVisibility(8);
        addView(linearLayout, y5.d(-2, -2.0f, 0, 0.0f, 22.0f, 0.0f, 0.0f));
        addView(textView, y5.d(-2, -2.0f, 8388611, 4.0f, 0.0f, 4.0f, 0.0f));
        addView(textView2, y5.d(-2, -2.0f, 8388613, 4.0f, 0.0f, 4.0f, 0.0f));
        addView(imageView, y5.d(18, 18.0f, 8388661, 0.0f, 2.0f, 0.0f, 0.0f));
        addView(radialProgressView, y5.d(18, 18.0f, 8388661, 0.0f, 2.0f, 0.0f, 0.0f));
        b();
    }

    public static String a(String str) {
        if (str.length() > 0) {
            return Character.toUpperCase(str.charAt(0)) + str.substring(1);
        }
        return str;
    }

    public void b() {
        int i10 = h6.f19165j5;
        d6 d6Var = this.J;
        this.d.setTextColor(h6.v0(i10, d6Var));
        this.e.setTextColor(h6.v0(i10, d6Var));
        int i11 = h6.gj;
        this.f13599f.setColorFilter(h6.v0(i11, d6Var));
        this.h.setProgressColor(h6.v0(i11, d6Var));
        this.H = getContext().getResources().getDrawable(R.drawable.stats_tooltip).mutate();
        int dp = AndroidUtilities.dp(4.0f);
        this.I = h6.i0(dp, dp, dp, dp, h6.v0(h6.f19129h5, d6Var), h6.v0(h6.f19148i6, d6Var), -16777216);
        rq rqVar = new rq(this.H, this.I, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        rqVar.f28035w = true;
        setBackground(rqVar);
    }

    public final void c(int r22, long r23, java.util.ArrayList r25, boolean r26, int r27, float r28) {
        throw new UnsupportedOperationException("Method not decompiled: kg.e.c(int, long, java.util.ArrayList, boolean, int, float):void");
    }

    public final void d(boolean z10, boolean z11) {
        q4 q4Var = this.K;
        if (z10) {
            AndroidUtilities.runOnUIThread(q4Var, 300L);
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(q4Var);
        RadialProgressView radialProgressView = this.h;
        if (z11) {
            radialProgressView.setVisibility(8);
            return;
        }
        this.f13599f.animate().setDuration(80L).alpha(1.0f).start();
        if (radialProgressView.getVisibility() == 0) {
            radialProgressView.animate().setDuration(80L).alpha(0.0f).setListener(new ai.b(this, 24)).start();
        }
    }

    public void setSize(int i10) {
        LinearLayout linearLayout = this.f13597b;
        linearLayout.removeAllViews();
        this.f13598c = new oi.f[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            oi.f[] fVarArr = this.f13598c;
            ?? obj = new Object();
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            obj.d = linearLayout2;
            linearLayout2.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
            if (this.E) {
                TextView textView = new TextView(getContext());
                obj.f15761c = textView;
                linearLayout2.addView(textView);
                textView.getLayoutParams().width = AndroidUtilities.dp(36.0f);
                textView.setVisibility(8);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setTextSize(1, 13.0f);
            }
            TextView textView2 = new TextView(getContext());
            obj.f15760b = textView2;
            linearLayout2.addView(textView2, y5.k(0.0f, 0.0f, 20.0f, 0.0f, -2, -2));
            org.telegram.ui.Components.y5 y5Var = new org.telegram.ui.Components.y5(getContext());
            obj.f15759a = y5Var;
            linearLayout2.addView(y5Var, y5.n(-1, -2));
            textView2.setGravity(8388611);
            y5Var.setGravity(8388613);
            y5Var.setTypeface(AndroidUtilities.bold());
            y5Var.setTextSize(1, 13.0f);
            textView2.setTextSize(1, 13.0f);
            fVarArr[i11] = obj;
            linearLayout.addView((LinearLayout) this.f13598c[i11].d);
        }
    }

    public void setUseWeek(boolean z10) {
        this.f13604x = z10;
    }
}
