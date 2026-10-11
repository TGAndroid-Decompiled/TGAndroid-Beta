package kg;

import ai.r4;
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
import org.telegram.ui.Components.a6;
import org.telegram.ui.Components.fr;
import w7.x5;
public class e extends FrameLayout {
    public boolean E;
    public boolean F;
    public boolean G;
    public Drawable H;
    public z I;
    public final d6 J;
    public final r4 K;
    public DecimalFormat L;
    public boolean f14829a;
    public final LinearLayout f14830b;
    public pi.f[] f14831c;
    public final TextView d;
    public final TextView f14832e;
    public final ImageView f14833f;
    public final RadialProgressView h;
    public final SimpleDateFormat f14834n;
    public final SimpleDateFormat f14835r;
    public final SimpleDateFormat f14836s;
    public final SimpleDateFormat v;
    public final SimpleDateFormat f14837w;
    public boolean f14838x;
    public boolean f14839y;

    public e(Context context, d6 d6Var) {
        super(context);
        this.f14834n = new SimpleDateFormat("E, ");
        this.f14835r = new SimpleDateFormat("MMM dd");
        this.f14836s = new SimpleDateFormat("d MMM yyyy");
        this.v = new SimpleDateFormat("d MMM");
        this.f14837w = new SimpleDateFormat(" HH:mm");
        this.G = true;
        this.K = new r4(this, 23);
        this.J = d6Var;
        setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f14830b = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        TextView textView2 = new TextView(context);
        this.f14832e = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        ImageView imageView = new ImageView(context);
        this.f14833f = imageView;
        imageView.setImageResource(R.drawable.ic_chevron_right_black_18dp);
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.h = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(12.0f));
        radialProgressView.setStrokeWidth(AndroidUtilities.dp(0.5f));
        radialProgressView.setVisibility(8);
        addView(linearLayout, x5.a(-2.0f, 0.0f, 22.0f, 0.0f, 0.0f, -2, 0));
        addView(textView, x5.a(-2.0f, 4.0f, 0.0f, 4.0f, 0.0f, -2, 8388611));
        addView(textView2, x5.a(-2.0f, 4.0f, 0.0f, 4.0f, 0.0f, -2, 8388613));
        addView(imageView, x5.a(18.0f, 0.0f, 2.0f, 0.0f, 0.0f, 18, 8388661));
        addView(radialProgressView, x5.a(18.0f, 0.0f, 2.0f, 0.0f, 0.0f, 18, 8388661));
        b();
    }

    public static String a(String str) {
        if (str.length() > 0) {
            return Character.toUpperCase(str.charAt(0)) + str.substring(1);
        }
        return str;
    }

    public void b() {
        int i10 = h6.f20930j5;
        d6 d6Var = this.J;
        this.d.setTextColor(h6.w0(i10, d6Var));
        this.f14832e.setTextColor(h6.w0(i10, d6Var));
        int i11 = h6.gj;
        this.f14833f.setColorFilter(h6.w0(i11, d6Var));
        this.h.setProgressColor(h6.w0(i11, d6Var));
        this.H = getContext().getResources().getDrawable(R.drawable.stats_tooltip).mutate();
        int dp = AndroidUtilities.dp(4.0f);
        this.I = h6.j0(dp, dp, dp, dp, h6.w0(h6.f20893h5, d6Var), h6.w0(h6.f20913i6, d6Var), -16777216);
        fr frVar = new fr(this.H, this.I, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        frVar.f26552w = true;
        setBackground(frVar);
    }

    public final void c(int r22, long r23, java.util.ArrayList r25, boolean r26, int r27, float r28) {
        throw new UnsupportedOperationException("Method not decompiled: kg.e.c(int, long, java.util.ArrayList, boolean, int, float):void");
    }

    public final void d(boolean z10, boolean z11) {
        r4 r4Var = this.K;
        if (z10) {
            AndroidUtilities.runOnUIThread(r4Var, 300L);
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(r4Var);
        RadialProgressView radialProgressView = this.h;
        if (z11) {
            radialProgressView.setVisibility(8);
            return;
        }
        this.f14833f.animate().setDuration(80L).alpha(1.0f).start();
        if (radialProgressView.getVisibility() == 0) {
            radialProgressView.animate().setDuration(80L).alpha(0.0f).setListener(new ai.b(this, 24)).start();
        }
    }

    public void setSize(int i10) {
        LinearLayout linearLayout = this.f14830b;
        linearLayout.removeAllViews();
        this.f14831c = new pi.f[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            pi.f[] fVarArr = this.f14831c;
            ?? obj = new Object();
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            obj.d = linearLayout2;
            linearLayout2.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
            if (this.E) {
                TextView textView = new TextView(getContext());
                obj.f45974c = textView;
                linearLayout2.addView(textView);
                textView.getLayoutParams().width = AndroidUtilities.dp(36.0f);
                textView.setVisibility(8);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setTextSize(1, 13.0f);
            }
            TextView textView2 = new TextView(getContext());
            obj.f45973b = textView2;
            linearLayout2.addView(textView2, x5.k(0.0f, 0.0f, 20.0f, 0.0f, -2, -2));
            a6 a6Var = new a6(getContext());
            obj.f45972a = a6Var;
            linearLayout2.addView(a6Var, x5.n(-1, -2));
            textView2.setGravity(8388611);
            a6Var.setGravity(8388613);
            a6Var.setTypeface(AndroidUtilities.bold());
            a6Var.setTextSize(1, 13.0f);
            textView2.setTextSize(1, 13.0f);
            fVarArr[i11] = obj;
            linearLayout.addView((LinearLayout) this.f14831c[i11].d);
        }
    }

    public void setUseWeek(boolean z10) {
        this.f14838x = z10;
    }
}
