package mg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import m.g3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.ar;
import org.telegram.ui.Components.kb1;
public class e extends FrameLayout {
    public boolean E;
    public boolean F;
    public boolean G;
    public Drawable H;
    public y I;
    public final u6 J;
    public final g3 K;
    public DecimalFormat L;
    public boolean f18454a;
    public final LinearLayout f18455b;
    public ti.e[] f18456c;
    public final TextView d;
    public final TextView e;
    public final ImageView f18457f;
    public final RadialProgressView h;
    public final SimpleDateFormat f18458n;
    public final SimpleDateFormat f18459r;
    public final SimpleDateFormat f18460s;
    public final SimpleDateFormat v;
    public final SimpleDateFormat f18461w;
    public boolean f18462x;
    public boolean f18463y;

    public e(Context context, u6 u6Var) {
        super(context);
        this.f18458n = new SimpleDateFormat("E, ");
        this.f18459r = new SimpleDateFormat("MMM dd");
        this.f18460s = new SimpleDateFormat("d MMM yyyy");
        this.v = new SimpleDateFormat("d MMM");
        this.f18461w = new SimpleDateFormat(" HH:mm");
        this.G = true;
        this.K = new g3(this, 1);
        this.J = u6Var;
        setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f18455b = linearLayout;
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
        this.f18457f = imageView;
        imageView.setImageResource(R.drawable.ic_chevron_right_black_18dp);
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.h = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(12.0f));
        radialProgressView.setStrokeWidth(AndroidUtilities.dp(0.5f));
        radialProgressView.setVisibility(8);
        addView(linearLayout, kb1.h(-2, -2.0f, 0, 0.0f, 22.0f, 0.0f, 0.0f));
        addView(textView, kb1.h(-2, -2.0f, 8388611, 4.0f, 0.0f, 4.0f, 0.0f));
        addView(textView2, kb1.h(-2, -2.0f, 8388613, 4.0f, 0.0f, 4.0f, 0.0f));
        addView(imageView, kb1.h(18, 18.0f, 8388661, 0.0f, 2.0f, 0.0f, 0.0f));
        addView(radialProgressView, kb1.h(18, 18.0f, 8388661, 0.0f, 2.0f, 0.0f, 0.0f));
        b();
    }

    public static String a(String str) {
        if (str.length() > 0) {
            return Character.toUpperCase(str.charAt(0)) + str.substring(1);
        }
        return str;
    }

    public void b() {
        int i10 = y6.f23465j5;
        TextView textView = this.d;
        u6 u6Var = this.J;
        f7.V(textView, i10, u6Var);
        f7.V(this.e, i10, u6Var);
        int i11 = y6.gj;
        f7.t(this.f18457f, i11, u6Var, PorterDuff.Mode.SRC_ATOP);
        this.h.setProgressColor(y6.w0(i11, u6Var));
        this.H = getContext().getResources().getDrawable(R.drawable.stats_tooltip).mutate();
        int dp = AndroidUtilities.dp(4.0f);
        this.I = y6.j0(dp, dp, dp, dp, y6.w0(y6.f23428h5, u6Var), y6.w0(y6.f23449i6, u6Var), -16777216);
        ar arVar = new ar(this.H, this.I, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        arVar.f26646w = true;
        setBackground(arVar);
    }

    public final void c(int r22, long r23, java.util.ArrayList r25, boolean r26, int r27, float r28) {
        throw new UnsupportedOperationException("Method not decompiled: mg.e.c(int, long, java.util.ArrayList, boolean, int, float):void");
    }

    public final void d(boolean z10, boolean z11) {
        g3 g3Var = this.K;
        if (z10) {
            AndroidUtilities.runOnUIThread(g3Var, 300L);
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(g3Var);
        RadialProgressView radialProgressView = this.h;
        if (z11) {
            radialProgressView.setVisibility(8);
            return;
        }
        this.f18457f.animate().setDuration(80L).alpha(1.0f).start();
        if (radialProgressView.getVisibility() == 0) {
            radialProgressView.animate().setDuration(80L).alpha(0.0f).setListener(new kg.e(this, 2)).start();
        }
    }

    public void setSize(int i10) {
        LinearLayout linearLayout = this.f18455b;
        linearLayout.removeAllViews();
        this.f18456c = new ti.e[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.f18456c[i11] = new ti.e(this);
            linearLayout.addView((LinearLayout) this.f18456c[i11].e);
        }
    }

    public void setUseWeek(boolean z10) {
        this.f18462x = z10;
    }
}
