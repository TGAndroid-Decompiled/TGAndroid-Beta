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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.u9;
import org.telegram.ui.bo;
import w7.x5;
public final class e extends FrameLayout {
    public final int f10251a;
    public final f9 f10252b;
    public final u9 f10253c;
    public final LinearLayout d;
    public final n6 e;
    public final n6 f10254f;
    public final dq h;
    public final ImageView f10255n;
    public boolean f10256r;
    public long f10257s;
    public long v;
    public int f10258w;
    public String f10259x;
    public float f10260y;

    public e(Activity activity, e6 e6Var, bo boVar) {
        super(activity);
        int i10;
        this.f10251a = boVar.getCurrentAccount();
        this.f10256r = false;
        u9 u9Var = new u9(activity);
        this.f10253c = u9Var;
        TLRPC.User user = boVar.getMessagesController().getUser(Long.valueOf(this.v));
        f9 f9Var = new f9((e6) null);
        this.f10252b = f9Var;
        f9Var.r(user);
        u9Var.setRoundRadius(AndroidUtilities.dp(16.0f));
        u9Var.e(user, f9Var);
        addView(u9Var, x5.d(32, 32.0f, 19, 10.0f, 0.0f, 10.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        n6 n6Var = new n6(activity, false, false, false);
        this.e = n6Var;
        n6Var.f26332n = false;
        n6Var.getDrawable().o(true, false, false);
        n6Var.setTypeface(AndroidUtilities.bold());
        n6Var.setTextSize(AndroidUtilities.dp(14.0f));
        n6Var.setText(UserObject.getUserName(user));
        n6Var.setTextColor(i6.v0(i6.G6, e6Var));
        n6Var.setEllipsizeByGradient(true);
        linearLayout.addView(n6Var, x5.k(0.0f, 0.0f, 0.0f, 1.0f, -1, 17));
        n6 n6Var2 = new n6(activity, false, false, false);
        this.f10254f = n6Var2;
        n6Var2.f26332n = false;
        n6Var2.getDrawable().o(true, false, false);
        n6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        n6Var2.setText(LocaleController.getString(R.string.BizBotStatusManages));
        n6Var2.setTextColor(i6.v0(i6.f18897ge, e6Var));
        n6Var2.setEllipsizeByGradient(true);
        linearLayout.addView(n6Var2, x5.n(-1, 17));
        addView(linearLayout, x5.d(-2, -2.0f, 16, 52.0f, 0.0f, 49.0f, 0.0f));
        dq dqVar = new dq(activity);
        this.h = dqVar;
        dqVar.getDrawable().o(true, true, false);
        dqVar.b(0.75f, 350L, qr.h);
        dqVar.setScaleProperty(0.6f);
        dqVar.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(14.0f);
        int i11 = i6.Oh;
        int v02 = i6.v0(i11, e6Var);
        int v = i6.v(i6.v0(i11, e6Var), i6.l1(0.12f, -1));
        dqVar.setBackgroundDrawable(i6.i0(dp, dp, dp, dp, v02, v, v));
        dqVar.setTextSize(AndroidUtilities.dp(14.0f));
        dqVar.setGravity(5);
        dqVar.setTextColor(i6.v0(i6.Sh, e6Var));
        dqVar.setPadding(AndroidUtilities.dp(13.0f), 0, AndroidUtilities.dp(13.0f), 0);
        dqVar.setOnClickListener(new ai.v0(this, 24));
        dqVar.setOnWidthUpdatedListener(new d(this, 0));
        if (this.f10256r) {
            i10 = R.string.BizBotStart;
        } else {
            i10 = R.string.BizBotStop;
        }
        dqVar.setText(LocaleController.getString(i10));
        addView(dqVar, x5.d(64, 28.0f, 21, 0.0f, 0.0f, 46.0f, 0.0f));
        ImageView imageView = new ImageView(activity);
        this.f10255n = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.msg_mini_customize);
        imageView.setBackground(i6.M(i6.v0(i6.f18926i6, e6Var), 0, 0));
        imageView.setColorFilter(new PorterDuffColorFilter(i6.v0(i6.f18844de, e6Var), PorterDuff.Mode.MULTIPLY));
        imageView.setOnClickListener(new ai.d0(this, boVar, e6Var, 7));
        addView(imageView, x5.d(32, 32.0f, 21, 8.0f, 0.0f, 6.0f, 0.0f));
    }

    public final void a() {
        float f7 = this.f10260y;
        dq dqVar = this.h;
        float d = dqVar.getDrawable().d() + f7 + dqVar.getPaddingLeft() + dqVar.getPaddingRight() + AndroidUtilities.dp(12.0f);
        this.e.setRightPadding(d);
        this.f10254f.setRightPadding(d);
    }

    public void setLeftMargin(float f7) {
        this.f10260y = f7;
        this.f10253c.setTranslationX(f7);
        this.d.setTranslationX(f7);
        a();
    }
}
