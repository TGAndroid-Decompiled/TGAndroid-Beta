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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.z;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.oq;
import w7.x5;
public class e extends FrameLayout {
    public boolean E;
    public boolean F;
    public boolean G;
    public Drawable H;
    public z I;
    public final f6 J;
    public final androidx.activity.i K;
    public DecimalFormat L;
    public boolean f15426a;
    public final LinearLayout f15427b;
    public s[] f15428c;
    public final TextView d;
    public final TextView f15429e;
    public final ImageView f15430f;
    public final RadialProgressView h;
    public final SimpleDateFormat f15431n;
    public final SimpleDateFormat f15432r;
    public final SimpleDateFormat f15433s;
    public final SimpleDateFormat v;
    public final SimpleDateFormat f15434w;
    public boolean f15435x;
    public boolean f15436y;

    public e(Context context, f6 f6Var) {
        super(context);
        this.f15431n = new SimpleDateFormat("E, ");
        this.f15432r = new SimpleDateFormat("MMM dd");
        this.f15433s = new SimpleDateFormat("d MMM yyyy");
        this.v = new SimpleDateFormat("d MMM");
        this.f15434w = new SimpleDateFormat(" HH:mm");
        this.G = true;
        this.K = new androidx.activity.i(this, 23);
        this.J = f6Var;
        setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f15427b = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        TextView textView2 = new TextView(context);
        this.f15429e = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        ImageView imageView = new ImageView(context);
        this.f15430f = imageView;
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
        int i10 = j6.f20770j5;
        f6 f6Var = this.J;
        this.d.setTextColor(j6.v0(i10, f6Var));
        this.f15429e.setTextColor(j6.v0(i10, f6Var));
        int i11 = j6.gj;
        this.f15430f.setColorFilter(j6.v0(i11, f6Var));
        this.h.setProgressColor(j6.v0(i11, f6Var));
        this.H = getContext().getResources().getDrawable(R.drawable.stats_tooltip).mutate();
        int dp = AndroidUtilities.dp(4.0f);
        this.I = j6.i0(dp, dp, dp, dp, j6.v0(j6.f20734h5, f6Var), j6.v0(j6.f20753i6, f6Var), -16777216);
        oq oqVar = new oq(this.H, this.I, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        oqVar.f29167w = true;
        setBackground(oqVar);
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
        this.f15430f.animate().setDuration(80L).alpha(1.0f).start();
        if (radialProgressView.getVisibility() == 0) {
            radialProgressView.animate().setDuration(80L).alpha(0.0f).setListener(new ah.b(this, 27)).start();
        }
    }

    public void setSize(int i10) {
        LinearLayout linearLayout = this.f15427b;
        linearLayout.removeAllViews();
        this.f15428c = new s[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.f15428c[i11] = new s(this);
            linearLayout.addView((LinearLayout) this.f15428c[i11].f6393e);
        }
    }

    public void setUseWeek(boolean z10) {
        this.f15435x = z10;
    }
}
