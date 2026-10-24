package lg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.firebase.messaging.r;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.wq;
import w7.z5;
public class e extends FrameLayout {
    public boolean E;
    public boolean F;
    public boolean G;
    public Drawable H;
    public y I;
    public final g6 J;
    public final androidx.activity.i K;
    public DecimalFormat L;
    public boolean f16106a;
    public final LinearLayout f16107b;
    public r[] f16108c;
    public final TextView d;
    public final TextView e;
    public final ImageView f16109f;
    public final RadialProgressView h;
    public final SimpleDateFormat f16110n;
    public final SimpleDateFormat f16111r;
    public final SimpleDateFormat f16112s;
    public final SimpleDateFormat v;
    public final SimpleDateFormat f16113w;
    public boolean f16114x;
    public boolean f16115y;

    public e(Context context, g6 g6Var) {
        super(context);
        this.f16110n = new SimpleDateFormat("E, ");
        this.f16111r = new SimpleDateFormat("MMM dd");
        this.f16112s = new SimpleDateFormat("d MMM yyyy");
        this.v = new SimpleDateFormat("d MMM");
        this.f16113w = new SimpleDateFormat(" HH:mm");
        this.G = true;
        this.K = new androidx.activity.i(this, 25);
        this.J = g6Var;
        setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f16107b = linearLayout;
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
        this.f16109f = imageView;
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
        int i10 = k6.f21290j5;
        TextView textView = this.d;
        g6 g6Var = this.J;
        r6.W(textView, i10, g6Var);
        r6.W(this.e, i10, g6Var);
        int i11 = k6.gj;
        r6.t(this.f16109f, i11, g6Var, PorterDuff.Mode.SRC_ATOP);
        this.h.setProgressColor(k6.w0(i11, g6Var));
        this.H = getContext().getResources().getDrawable(R.drawable.stats_tooltip).mutate();
        int dp = AndroidUtilities.dp(4.0f);
        this.I = k6.j0(dp, dp, dp, dp, k6.w0(k6.f21255h5, g6Var), k6.w0(k6.f21273i6, g6Var), -16777216);
        wq wqVar = new wq(this.H, this.I, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        wqVar.f32329w = true;
        setBackground(wqVar);
    }

    public final void c(int r22, long r23, java.util.ArrayList r25, boolean r26, int r27, float r28) {
        throw new UnsupportedOperationException("Method not decompiled: lg.e.c(int, long, java.util.ArrayList, boolean, int, float):void");
    }

    public final void d(boolean z10, boolean z11) {
        androidx.activity.i iVar = this.K;
        if (z10) {
            AndroidUtilities.runOnUIThread(iVar, 300L);
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(iVar);
        RadialProgressView radialProgressView = this.h;
        if (z11) {
            radialProgressView.setVisibility(8);
            return;
        }
        this.f16109f.animate().setDuration(80L).alpha(1.0f).start();
        if (radialProgressView.getVisibility() == 0) {
            radialProgressView.animate().setDuration(80L).alpha(0.0f).setListener(new ah.b(this, 29)).start();
        }
    }

    public void setSize(int i10) {
        LinearLayout linearLayout = this.f16107b;
        linearLayout.removeAllViews();
        this.f16108c = new r[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.f16108c[i11] = new r(this);
            linearLayout.addView((LinearLayout) this.f16108c[i11].e);
        }
    }

    public void setUseWeek(boolean z10) {
        this.f16114x = z10;
    }
}
