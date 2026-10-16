package lg;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.firebase.messaging.s;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.z;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.cr;
import w7.z5;
public class e extends FrameLayout {
    public boolean E;
    public boolean F;
    public boolean G;
    public Drawable H;
    public z I;
    public final c6 J;
    public final androidx.activity.i K;
    public DecimalFormat L;
    public boolean f14700a;
    public final LinearLayout f14701b;
    public s[] f14702c;
    public final TextView d;
    public final TextView e;
    public final ImageView f14703f;
    public final RadialProgressView h;
    public final SimpleDateFormat f14704n;
    public final SimpleDateFormat f14705r;
    public final SimpleDateFormat f14706s;
    public final SimpleDateFormat v;
    public final SimpleDateFormat f14707w;
    public boolean f14708x;
    public boolean f14709y;

    public e(Context context, c6 c6Var) {
        super(context);
        this.f14704n = new SimpleDateFormat("E, ");
        this.f14705r = new SimpleDateFormat("MMM dd");
        this.f14706s = new SimpleDateFormat("d MMM yyyy");
        this.v = new SimpleDateFormat("d MMM");
        this.f14707w = new SimpleDateFormat(" HH:mm");
        this.G = true;
        this.K = new androidx.activity.i(this, 23);
        this.J = c6Var;
        setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f14701b = linearLayout;
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
        this.f14703f = imageView;
        imageView.setImageResource(R.drawable.ic_chevron_right_black_18dp);
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.h = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(12.0f));
        radialProgressView.setStrokeWidth(AndroidUtilities.dp(0.5f));
        radialProgressView.setVisibility(8);
        addView(linearLayout, z5.a(-2.0f, 0.0f, 22.0f, 0.0f, 0.0f, -2, 0));
        addView(textView, z5.a(-2.0f, 4.0f, 0.0f, 4.0f, 0.0f, -2, 8388611));
        addView(textView2, z5.a(-2.0f, 4.0f, 0.0f, 4.0f, 0.0f, -2, 8388613));
        addView(imageView, z5.a(18.0f, 0.0f, 2.0f, 0.0f, 0.0f, 18, 8388661));
        addView(radialProgressView, z5.a(18.0f, 0.0f, 2.0f, 0.0f, 0.0f, 18, 8388661));
        b();
    }

    public static String a(String str) {
        if (str.length() > 0) {
            return Character.toUpperCase(str.charAt(0)) + str.substring(1);
        }
        return str;
    }

    public void b() {
        int i10 = g6.f19707j5;
        c6 c6Var = this.J;
        this.d.setTextColor(g6.w0(i10, c6Var));
        this.e.setTextColor(g6.w0(i10, c6Var));
        int i11 = g6.gj;
        this.f14703f.setColorFilter(g6.w0(i11, c6Var));
        this.h.setProgressColor(g6.w0(i11, c6Var));
        this.H = getContext().getResources().getDrawable(R.drawable.stats_tooltip).mutate();
        int dp = AndroidUtilities.dp(4.0f);
        this.I = g6.j0(dp, dp, dp, dp, g6.w0(g6.f19672h5, c6Var), g6.w0(g6.f19690i6, c6Var), -16777216);
        cr crVar = new cr(this.H, this.I, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        crVar.f23883w = true;
        setBackground(crVar);
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
        this.f14703f.animate().setDuration(80L).alpha(1.0f).start();
        if (radialProgressView.getVisibility() == 0) {
            radialProgressView.animate().setDuration(80L).alpha(0.0f).setListener(new ah.b(this, 27)).start();
        }
    }

    public void setSize(int i10) {
        LinearLayout linearLayout = this.f14701b;
        linearLayout.removeAllViews();
        this.f14702c = new s[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.f14702c[i11] = new s(this);
            linearLayout.addView((LinearLayout) this.f14702c[i11].e);
        }
    }

    public void setUseWeek(boolean z10) {
        this.f14708x = z10;
    }
}
