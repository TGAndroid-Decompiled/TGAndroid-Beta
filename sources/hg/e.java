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
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.v9;
import org.telegram.ui.zn;
import w7.y5;
public final class e extends FrameLayout {
    public final int f10257a;
    public final g9 f10258b;
    public final v9 f10259c;
    public final LinearLayout d;
    public final o6 e;
    public final o6 f10260f;
    public final dq h;
    public final ImageView f10261n;
    public boolean f10262r;
    public long f10263s;
    public long v;
    public int f10264w;
    public String f10265x;
    public float f10266y;

    public e(Activity activity, f6 f6Var, zn znVar) {
        super(activity);
        int i10;
        this.f10257a = znVar.getCurrentAccount();
        this.f10262r = false;
        v9 v9Var = new v9(activity);
        this.f10259c = v9Var;
        TLRPC.User user = znVar.getMessagesController().getUser(Long.valueOf(this.v));
        g9 g9Var = new g9((f6) null);
        this.f10258b = g9Var;
        g9Var.r(user);
        v9Var.setRoundRadius(AndroidUtilities.dp(16.0f));
        v9Var.e(user, g9Var);
        addView(v9Var, y5.d(32, 32.0f, 19, 10.0f, 0.0f, 10.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        o6 o6Var = new o6(activity, false, false, false);
        this.e = o6Var;
        o6Var.f26820n = false;
        o6Var.getDrawable().o(true, false, false);
        o6Var.setTypeface(AndroidUtilities.bold());
        o6Var.setTextSize(AndroidUtilities.dp(14.0f));
        o6Var.setText(UserObject.getUserName(user));
        o6Var.setTextColor(j6.v0(j6.G6, f6Var));
        o6Var.setEllipsizeByGradient(true);
        linearLayout.addView(o6Var, y5.k(0.0f, 0.0f, 0.0f, 1.0f, -1, 17));
        o6 o6Var2 = new o6(activity, false, false, false);
        this.f10260f = o6Var2;
        o6Var2.f26820n = false;
        o6Var2.getDrawable().o(true, false, false);
        o6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        o6Var2.setText(LocaleController.getString(R.string.BizBotStatusManages));
        o6Var2.setTextColor(j6.v0(j6.f19155ge, f6Var));
        o6Var2.setEllipsizeByGradient(true);
        linearLayout.addView(o6Var2, y5.n(-1, 17));
        addView(linearLayout, y5.d(-2, -2.0f, 16, 52.0f, 0.0f, 49.0f, 0.0f));
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
        if (this.f10262r) {
            i10 = R.string.BizBotStart;
        } else {
            i10 = R.string.BizBotStop;
        }
        dqVar.setText(LocaleController.getString(i10));
        addView(dqVar, y5.d(64, 28.0f, 21, 0.0f, 0.0f, 46.0f, 0.0f));
        ImageView imageView = new ImageView(activity);
        this.f10261n = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.msg_mini_customize);
        imageView.setBackground(j6.M(j6.v0(j6.f19184i6, f6Var), 0, 0));
        imageView.setColorFilter(new PorterDuffColorFilter(j6.v0(j6.f19102de, f6Var), PorterDuff.Mode.MULTIPLY));
        imageView.setOnClickListener(new ai.d0(this, znVar, f6Var, 7));
        addView(imageView, y5.d(32, 32.0f, 21, 8.0f, 0.0f, 6.0f, 0.0f));
    }

    public final void a() {
        float f7 = this.f10266y;
        dq dqVar = this.h;
        float d = dqVar.getDrawable().d() + f7 + dqVar.getPaddingLeft() + dqVar.getPaddingRight() + AndroidUtilities.dp(12.0f);
        this.e.setRightPadding(d);
        this.f10260f.setRightPadding(d);
    }

    public void setLeftMargin(float f7) {
        this.f10266y = f7;
        this.f10259c.setTranslationX(f7);
        this.d.setTranslationX(f7);
        a();
    }
}
