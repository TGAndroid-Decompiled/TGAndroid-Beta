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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.z;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.w5;
import w7.x5;
public class e extends FrameLayout {
    public boolean E;
    public boolean F;
    public boolean G;
    public Drawable H;
    public z I;
    public final f6 J;
    public final q4 K;
    public DecimalFormat L;
    public boolean f13611a;
    public final LinearLayout f13612b;
    public ni.f[] f13613c;
    public final TextView d;
    public final TextView e;
    public final ImageView f13614f;
    public final RadialProgressView h;
    public final SimpleDateFormat f13615n;
    public final SimpleDateFormat f13616r;
    public final SimpleDateFormat f13617s;
    public final SimpleDateFormat v;
    public final SimpleDateFormat f13618w;
    public boolean f13619x;
    public boolean f13620y;

    public e(Context context, f6 f6Var) {
        super(context);
        this.f13615n = new SimpleDateFormat("E, ");
        this.f13616r = new SimpleDateFormat("MMM dd");
        this.f13617s = new SimpleDateFormat("d MMM yyyy");
        this.v = new SimpleDateFormat("d MMM");
        this.f13618w = new SimpleDateFormat(" HH:mm");
        this.G = true;
        this.K = new q4(this, 23);
        this.J = f6Var;
        setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f13612b = linearLayout;
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
        this.f13614f = imageView;
        imageView.setImageResource(R.drawable.ic_chevron_right_black_18dp);
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.h = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(12.0f));
        radialProgressView.setStrokeWidth(AndroidUtilities.dp(0.5f));
        radialProgressView.setVisibility(8);
        addView(linearLayout, x5.d(-2, -2.0f, 0, 0.0f, 22.0f, 0.0f, 0.0f));
        addView(textView, x5.d(-2, -2.0f, 8388611, 4.0f, 0.0f, 4.0f, 0.0f));
        addView(textView2, x5.d(-2, -2.0f, 8388613, 4.0f, 0.0f, 4.0f, 0.0f));
        addView(imageView, x5.d(18, 18.0f, 8388661, 0.0f, 2.0f, 0.0f, 0.0f));
        addView(radialProgressView, x5.d(18, 18.0f, 8388661, 0.0f, 2.0f, 0.0f, 0.0f));
        b();
    }

    public static String a(String str) {
        if (str.length() > 0) {
            return Character.toUpperCase(str.charAt(0)) + str.substring(1);
        }
        return str;
    }

    public void b() {
        int i10 = j6.f18969j5;
        f6 f6Var = this.J;
        this.d.setTextColor(j6.v0(i10, f6Var));
        this.e.setTextColor(j6.v0(i10, f6Var));
        int i11 = j6.gj;
        this.f13614f.setColorFilter(j6.v0(i11, f6Var));
        this.h.setProgressColor(j6.v0(i11, f6Var));
        this.H = getContext().getResources().getDrawable(R.drawable.stats_tooltip).mutate();
        int dp = AndroidUtilities.dp(4.0f);
        this.I = j6.i0(dp, dp, dp, dp, j6.v0(j6.f18933h5, f6Var), j6.v0(j6.f18952i6, f6Var), -16777216);
        pq pqVar = new pq(this.H, this.I, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        pqVar.f27113w = true;
        setBackground(pqVar);
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
        this.f13614f.animate().setDuration(80L).alpha(1.0f).start();
        if (radialProgressView.getVisibility() == 0) {
            radialProgressView.animate().setDuration(80L).alpha(0.0f).setListener(new ai.b(this, 24)).start();
        }
    }

    public void setSize(int i10) {
        LinearLayout linearLayout = this.f13612b;
        linearLayout.removeAllViews();
        this.f13613c = new ni.f[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            ni.f[] fVarArr = this.f13613c;
            ?? obj = new Object();
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            obj.d = linearLayout2;
            linearLayout2.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
            if (this.E) {
                TextView textView = new TextView(getContext());
                obj.f15269c = textView;
                linearLayout2.addView(textView);
                textView.getLayoutParams().width = AndroidUtilities.dp(36.0f);
                textView.setVisibility(8);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setTextSize(1, 13.0f);
            }
            TextView textView2 = new TextView(getContext());
            obj.f15268b = textView2;
            linearLayout2.addView(textView2, x5.k(0.0f, 0.0f, 20.0f, 0.0f, -2, -2));
            w5 w5Var = new w5(getContext());
            obj.f15267a = w5Var;
            linearLayout2.addView(w5Var, x5.n(-1, -2));
            textView2.setGravity(8388611);
            w5Var.setGravity(8388613);
            w5Var.setTypeface(AndroidUtilities.bold());
            w5Var.setTextSize(1, 13.0f);
            textView2.setTextSize(1, 13.0f);
            fVarArr[i11] = obj;
            linearLayout.addView((LinearLayout) this.f13613c[i11].d);
        }
    }

    public void setUseWeek(boolean z10) {
        this.f13619x = z10;
    }
}
