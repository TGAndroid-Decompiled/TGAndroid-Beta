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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.u9;
import org.telegram.ui.bo;
import w7.x5;
public final class e extends FrameLayout {
    public final int f10256a;
    public final f9 f10257b;
    public final u9 f10258c;
    public final LinearLayout d;
    public final n6 e;
    public final n6 f10259f;
    public final dq h;
    public final ImageView f10260n;
    public boolean f10261r;
    public long f10262s;
    public long v;
    public int f10263w;
    public String f10264x;
    public float f10265y;

    public e(Activity activity, f6 f6Var, bo boVar) {
        super(activity);
        int i10;
        this.f10256a = boVar.getCurrentAccount();
        this.f10261r = false;
        u9 u9Var = new u9(activity);
        this.f10258c = u9Var;
        TLRPC.User user = boVar.getMessagesController().getUser(Long.valueOf(this.v));
        f9 f9Var = new f9((f6) null);
        this.f10257b = f9Var;
        f9Var.r(user);
        u9Var.setRoundRadius(AndroidUtilities.dp(16.0f));
        u9Var.e(user, f9Var);
        addView(u9Var, x5.d(32, 32.0f, 19, 10.0f, 0.0f, 10.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        n6 n6Var = new n6(activity, false, false, false);
        this.e = n6Var;
        n6Var.f26348n = false;
        n6Var.getDrawable().o(true, false, false);
        n6Var.setTypeface(AndroidUtilities.bold());
        n6Var.setTextSize(AndroidUtilities.dp(14.0f));
        n6Var.setText(UserObject.getUserName(user));
        n6Var.setTextColor(j6.v0(j6.G6, f6Var));
        n6Var.setEllipsizeByGradient(true);
        linearLayout.addView(n6Var, x5.k(0.0f, 0.0f, 0.0f, 1.0f, -1, 17));
        n6 n6Var2 = new n6(activity, false, false, false);
        this.f10259f = n6Var2;
        n6Var2.f26348n = false;
        n6Var2.getDrawable().o(true, false, false);
        n6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        n6Var2.setText(LocaleController.getString(R.string.BizBotStatusManages));
        n6Var2.setTextColor(j6.v0(j6.f18924ge, f6Var));
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
        int i11 = j6.Oh;
        int v02 = j6.v0(i11, f6Var);
        int v = j6.v(j6.v0(i11, f6Var), j6.l1(0.12f, -1));
        dqVar.setBackgroundDrawable(j6.i0(dp, dp, dp, dp, v02, v, v));
        dqVar.setTextSize(AndroidUtilities.dp(14.0f));
        dqVar.setGravity(5);
        dqVar.setTextColor(j6.v0(j6.Sh, f6Var));
        dqVar.setPadding(AndroidUtilities.dp(13.0f), 0, AndroidUtilities.dp(13.0f), 0);
        dqVar.setOnClickListener(new ai.v0(this, 24));
        dqVar.setOnWidthUpdatedListener(new d(this, 0));
        if (this.f10261r) {
            i10 = R.string.BizBotStart;
        } else {
            i10 = R.string.BizBotStop;
        }
        dqVar.setText(LocaleController.getString(i10));
        addView(dqVar, x5.d(64, 28.0f, 21, 0.0f, 0.0f, 46.0f, 0.0f));
        ImageView imageView = new ImageView(activity);
        this.f10260n = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.msg_mini_customize);
        imageView.setBackground(j6.M(j6.v0(j6.f18953i6, f6Var), 0, 0));
        imageView.setColorFilter(new PorterDuffColorFilter(j6.v0(j6.f18871de, f6Var), PorterDuff.Mode.MULTIPLY));
        imageView.setOnClickListener(new ai.d0(this, boVar, f6Var, 7));
        addView(imageView, x5.d(32, 32.0f, 21, 8.0f, 0.0f, 6.0f, 0.0f));
    }

    public final void a() {
        float f7 = this.f10265y;
        dq dqVar = this.h;
        float d = dqVar.getDrawable().d() + f7 + dqVar.getPaddingLeft() + dqVar.getPaddingRight() + AndroidUtilities.dp(12.0f);
        this.e.setRightPadding(d);
        this.f10259f.setRightPadding(d);
    }

    public void setLeftMargin(float f7) {
        this.f10265y = f7;
        this.f10258c.setTranslationX(f7);
        this.d.setTranslationX(f7);
        a();
    }
}
