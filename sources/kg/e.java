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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.z;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.sq;
import org.telegram.ui.Components.y5;
import w7.z5;
public class e extends FrameLayout {
    public boolean E;
    public boolean F;
    public boolean G;
    public Drawable H;
    public z I;
    public final d6 J;
    public final q4 K;
    public DecimalFormat L;
    public boolean f14782a;
    public final LinearLayout f14783b;
    public qi.f[] f14784c;
    public final TextView d;
    public final TextView f14785e;
    public final ImageView f14786f;
    public final RadialProgressView h;
    public final SimpleDateFormat f14787n;
    public final SimpleDateFormat f14788r;
    public final SimpleDateFormat f14789s;
    public final SimpleDateFormat v;
    public final SimpleDateFormat f14790w;
    public boolean f14791x;
    public boolean f14792y;

    public e(Context context, d6 d6Var) {
        super(context);
        this.f14787n = new SimpleDateFormat("E, ");
        this.f14788r = new SimpleDateFormat("MMM dd");
        this.f14789s = new SimpleDateFormat("d MMM yyyy");
        this.v = new SimpleDateFormat("d MMM");
        this.f14790w = new SimpleDateFormat(" HH:mm");
        this.G = true;
        this.K = new q4(this, 23);
        this.J = d6Var;
        setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f14783b = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        TextView textView2 = new TextView(context);
        this.f14785e = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        ImageView imageView = new ImageView(context);
        this.f14786f = imageView;
        imageView.setImageResource(R.drawable.ic_chevron_right_black_18dp);
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.h = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(12.0f));
        radialProgressView.setStrokeWidth(AndroidUtilities.dp(0.5f));
        radialProgressView.setVisibility(8);
        addView(linearLayout, z5.d(-2, -2.0f, 0, 0.0f, 22.0f, 0.0f, 0.0f));
        addView(textView, z5.d(-2, -2.0f, 8388611, 4.0f, 0.0f, 4.0f, 0.0f));
        addView(textView2, z5.d(-2, -2.0f, 8388613, 4.0f, 0.0f, 4.0f, 0.0f));
        addView(imageView, z5.d(18, 18.0f, 8388661, 0.0f, 2.0f, 0.0f, 0.0f));
        addView(radialProgressView, z5.d(18, 18.0f, 8388661, 0.0f, 2.0f, 0.0f, 0.0f));
        b();
    }

    public static String a(String str) {
        if (str.length() > 0) {
            return Character.toUpperCase(str.charAt(0)) + str.substring(1);
        }
        return str;
    }

    public void b() {
        int i10 = i6.f20925j5;
        d6 d6Var = this.J;
        this.d.setTextColor(i6.v0(i10, d6Var));
        this.f14785e.setTextColor(i6.v0(i10, d6Var));
        int i11 = i6.gj;
        this.f14786f.setColorFilter(i6.v0(i11, d6Var));
        this.h.setProgressColor(i6.v0(i11, d6Var));
        this.H = getContext().getResources().getDrawable(R.drawable.stats_tooltip).mutate();
        int dp = AndroidUtilities.dp(4.0f);
        this.I = i6.i0(dp, dp, dp, dp, i6.v0(i6.f20889h5, d6Var), i6.v0(i6.f20908i6, d6Var), -16777216);
        sq sqVar = new sq(this.H, this.I, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        sqVar.f30856w = true;
        setBackground(sqVar);
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
        this.f14786f.animate().setDuration(80L).alpha(1.0f).start();
        if (radialProgressView.getVisibility() == 0) {
            radialProgressView.animate().setDuration(80L).alpha(0.0f).setListener(new ai.b(this, 24)).start();
        }
    }

    public void setSize(int i10) {
        LinearLayout linearLayout = this.f14783b;
        linearLayout.removeAllViews();
        this.f14784c = new qi.f[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            qi.f[] fVarArr = this.f14784c;
            ?? obj = new Object();
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            obj.d = linearLayout2;
            linearLayout2.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
            if (this.E) {
                TextView textView = new TextView(getContext());
                obj.f45528c = textView;
                linearLayout2.addView(textView);
                textView.getLayoutParams().width = AndroidUtilities.dp(36.0f);
                textView.setVisibility(8);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setTextSize(1, 13.0f);
            }
            TextView textView2 = new TextView(getContext());
            obj.f45527b = textView2;
            linearLayout2.addView(textView2, z5.k(0.0f, 0.0f, 20.0f, 0.0f, -2, -2));
            y5 y5Var = new y5(getContext());
            obj.f45526a = y5Var;
            linearLayout2.addView(y5Var, z5.n(-1, -2));
            textView2.setGravity(8388611);
            y5Var.setGravity(8388613);
            y5Var.setTypeface(AndroidUtilities.bold());
            y5Var.setTextSize(1, 13.0f);
            textView2.setTextSize(1, 13.0f);
            fVarArr[i11] = obj;
            linearLayout.addView((LinearLayout) this.f14784c[i11].d);
        }
    }

    public void setUseWeek(boolean z10) {
        this.f14791x = z10;
    }
}
