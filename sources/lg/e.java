package lg;

import android.content.Context;
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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.z;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.zq;
import w7.z5;
public class e extends FrameLayout {
    public boolean E;
    public boolean F;
    public boolean G;
    public Drawable H;
    public z I;
    public final d6 J;
    public final androidx.activity.i K;
    public DecimalFormat L;
    public boolean f16045a;
    public final LinearLayout f16046b;
    public r[] f16047c;
    public final TextView d;
    public final TextView e;
    public final ImageView f16048f;
    public final RadialProgressView h;
    public final SimpleDateFormat f16049n;
    public final SimpleDateFormat f16050r;
    public final SimpleDateFormat f16051s;
    public final SimpleDateFormat v;
    public final SimpleDateFormat f16052w;
    public boolean f16053x;
    public boolean f16054y;

    public e(Context context, d6 d6Var) {
        super(context);
        this.f16049n = new SimpleDateFormat("E, ");
        this.f16050r = new SimpleDateFormat("MMM dd");
        this.f16051s = new SimpleDateFormat("d MMM yyyy");
        this.v = new SimpleDateFormat("d MMM");
        this.f16052w = new SimpleDateFormat(" HH:mm");
        this.G = true;
        this.K = new androidx.activity.i(this, 23);
        this.J = d6Var;
        setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f16046b = linearLayout;
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
        this.f16048f = imageView;
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
        int i10 = h6.f21095j5;
        d6 d6Var = this.J;
        this.d.setTextColor(h6.w0(i10, d6Var));
        this.e.setTextColor(h6.w0(i10, d6Var));
        int i11 = h6.gj;
        this.f16048f.setColorFilter(h6.w0(i11, d6Var));
        this.h.setProgressColor(h6.w0(i11, d6Var));
        this.H = getContext().getResources().getDrawable(R.drawable.stats_tooltip).mutate();
        int dp = AndroidUtilities.dp(4.0f);
        this.I = h6.j0(dp, dp, dp, dp, h6.w0(h6.f21060h5, d6Var), h6.w0(h6.f21078i6, d6Var), -16777216);
        zq zqVar = new zq(this.H, this.I, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        zqVar.f33023w = true;
        setBackground(zqVar);
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
        this.f16048f.animate().setDuration(80L).alpha(1.0f).start();
        if (radialProgressView.getVisibility() == 0) {
            radialProgressView.animate().setDuration(80L).alpha(0.0f).setListener(new ah.b(this, 29)).start();
        }
    }

    public void setSize(int i10) {
        LinearLayout linearLayout = this.f16046b;
        linearLayout.removeAllViews();
        this.f16047c = new r[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.f16047c[i11] = new r(this);
            linearLayout.addView((LinearLayout) this.f16047c[i11].e);
        }
    }

    public void setUseWeek(boolean z10) {
        this.f16053x = z10;
    }
}
