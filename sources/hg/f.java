package hg;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.w9;
import org.telegram.ui.wn;
import w7.y5;
public final class f extends FrameLayout {
    public final int f10246a;
    public final h9 f10247b;
    public final w9 f10248c;
    public final LinearLayout d;
    public final p6 e;
    public final p6 f10249f;
    public final eq h;
    public final ImageView f10250n;
    public boolean f10251r;
    public long f10252s;
    public long v;
    public int f10253w;
    public String f10254x;
    public float f10255y;

    public f(Activity activity, d6 d6Var, wn wnVar) {
        super(activity);
        int i10;
        this.f10246a = wnVar.getCurrentAccount();
        this.f10251r = false;
        w9 w9Var = new w9(activity);
        this.f10248c = w9Var;
        TLRPC.User user = wnVar.getMessagesController().getUser(Long.valueOf(this.v));
        h9 h9Var = new h9((d6) null);
        this.f10247b = h9Var;
        h9Var.r(user);
        w9Var.setRoundRadius(AndroidUtilities.dp(16.0f));
        w9Var.e(user, h9Var);
        addView(w9Var, y5.d(32, 32.0f, 19, 10.0f, 0.0f, 10.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        p6 p6Var = new p6(activity, false, false, false);
        this.e = p6Var;
        p6Var.f27262n = false;
        p6Var.getDrawable().o(true, false, false);
        p6Var.setTypeface(AndroidUtilities.bold());
        p6Var.setTextSize(AndroidUtilities.dp(14.0f));
        p6Var.setText(UserObject.getUserName(user));
        p6Var.setTextColor(h6.v0(h6.G6, d6Var));
        p6Var.setEllipsizeByGradient(true);
        linearLayout.addView(p6Var, y5.k(0.0f, 0.0f, 0.0f, 1.0f, -1, 17));
        p6 p6Var2 = new p6(activity, false, false, false);
        this.f10249f = p6Var2;
        p6Var2.f27262n = false;
        p6Var2.getDrawable().o(true, false, false);
        p6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        p6Var2.setText(LocaleController.getString(R.string.BizBotStatusManages));
        p6Var2.setTextColor(h6.v0(h6.f19105ge, d6Var));
        p6Var2.setEllipsizeByGradient(true);
        linearLayout.addView(p6Var2, y5.n(-1, 17));
        addView(linearLayout, y5.d(-2, -2.0f, 16, 52.0f, 0.0f, 49.0f, 0.0f));
        eq eqVar = new eq(activity);
        this.h = eqVar;
        eqVar.getDrawable().o(true, true, false);
        eqVar.b(0.75f, 350L, rr.h);
        eqVar.setScaleProperty(0.6f);
        eqVar.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(14.0f);
        int i11 = h6.Oh;
        int v02 = h6.v0(i11, d6Var);
        int v = h6.v(h6.v0(i11, d6Var), h6.l1(0.12f, -1));
        eqVar.setBackgroundDrawable(h6.i0(dp, dp, dp, dp, v02, v, v));
        eqVar.setTextSize(AndroidUtilities.dp(14.0f));
        eqVar.setGravity(5);
        eqVar.setTextColor(h6.v0(h6.Sh, d6Var));
        eqVar.setPadding(AndroidUtilities.dp(13.0f), 0, AndroidUtilities.dp(13.0f), 0);
        eqVar.setOnClickListener(new ai.v0(this, 24));
        eqVar.setOnWidthUpdatedListener(new e(this, 0));
        if (this.f10251r) {
            i10 = R.string.BizBotStart;
        } else {
            i10 = R.string.BizBotStop;
        }
        eqVar.setText(LocaleController.getString(i10));
        addView(eqVar, y5.d(64, 28.0f, 21, 0.0f, 0.0f, 46.0f, 0.0f));
        ImageView imageView = new ImageView(activity);
        this.f10250n = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.msg_mini_customize);
        imageView.setBackground(h6.M(h6.v0(h6.f19134i6, d6Var), 0, 0));
        imageView.setColorFilter(new PorterDuffColorFilter(h6.v0(h6.f19053de, d6Var), PorterDuff.Mode.MULTIPLY));
        imageView.setOnClickListener(new ai.d0(this, wnVar, d6Var, 7));
        addView(imageView, y5.d(32, 32.0f, 21, 8.0f, 0.0f, 6.0f, 0.0f));
    }

    public final void a() {
        float f7 = this.f10255y;
        eq eqVar = this.h;
        float d = eqVar.getDrawable().d() + f7 + eqVar.getPaddingLeft() + eqVar.getPaddingRight() + AndroidUtilities.dp(12.0f);
        this.e.setRightPadding(d);
        this.f10249f.setRightPadding(d);
    }

    public void setLeftMargin(float f7) {
        this.f10255y = f7;
        this.f10248c.setTranslationX(f7);
        this.d.setTranslationX(f7);
        a();
    }
}
