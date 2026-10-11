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
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.r6;
import org.telegram.ui.Components.tq;
import org.telegram.ui.Components.y9;
import org.telegram.ui.zn;
import w7.x5;
public final class f extends FrameLayout {
    public final int f11216a;
    public final j9 f11217b;
    public final y9 f11218c;
    public final LinearLayout d;
    public final r6 f11219e;
    public final r6 f11220f;
    public final tq h;
    public final ImageView f11221n;
    public boolean f11222r;
    public long f11223s;
    public long v;
    public int f11224w;
    public String f11225x;
    public float f11226y;

    public f(Activity activity, d6 d6Var, zn znVar) {
        super(activity);
        int i10;
        this.f11216a = znVar.getCurrentAccount();
        this.f11222r = false;
        y9 y9Var = new y9(activity);
        this.f11218c = y9Var;
        TLRPC.User user = znVar.getMessagesController().getUser(Long.valueOf(this.v));
        j9 j9Var = new j9((d6) null);
        this.f11217b = j9Var;
        j9Var.r(user);
        y9Var.setRoundRadius(AndroidUtilities.dp(16.0f));
        y9Var.e(user, j9Var);
        addView(y9Var, x5.a(32.0f, 10.0f, 0.0f, 10.0f, 0.0f, 32, 19));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        r6 r6Var = new r6(activity, false, false, false);
        this.f11219e = r6Var;
        r6Var.f30433n = false;
        r6Var.getDrawable().r(true, false);
        r6Var.setTypeface(AndroidUtilities.bold());
        r6Var.setTextSize(AndroidUtilities.dp(14.0f));
        r6Var.setText(UserObject.getUserName(user));
        r6Var.setTextColor(h6.w0(h6.G6, d6Var));
        r6Var.setEllipsizeByGradient(true);
        linearLayout.addView(r6Var, x5.k(0.0f, 0.0f, 0.0f, 1.0f, -1, 17));
        r6 r6Var2 = new r6(activity, false, false, false);
        this.f11220f = r6Var2;
        r6Var2.f30433n = false;
        r6Var2.getDrawable().r(true, false);
        r6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        r6Var2.setText(LocaleController.getString(R.string.BizBotStatusManages));
        r6Var2.setTextColor(h6.w0(h6.ge, d6Var));
        r6Var2.setEllipsizeByGradient(true);
        linearLayout.addView(r6Var2, x5.n(-1, 17));
        addView(linearLayout, x5.a(-2.0f, 52.0f, 0.0f, 49.0f, 0.0f, -2, 16));
        tq tqVar = new tq(activity);
        this.h = tqVar;
        tqVar.getDrawable().r(true, true);
        tqVar.b(0.75f, 350L, is.h);
        tqVar.setScaleProperty(0.6f);
        tqVar.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(14.0f);
        int i11 = h6.Oh;
        int w02 = h6.w0(i11, d6Var);
        int v = h6.v(h6.w0(i11, d6Var), h6.m1(0.12f, -1));
        tqVar.setBackgroundDrawable(h6.j0(dp, dp, dp, dp, w02, v, v));
        tqVar.setTextSize(AndroidUtilities.dp(14.0f));
        tqVar.setGravity(5);
        tqVar.setTextColor(h6.w0(h6.Sh, d6Var));
        tqVar.setPadding(AndroidUtilities.dp(13.0f), 0, AndroidUtilities.dp(13.0f), 0);
        tqVar.setOnClickListener(new ai.v0(this, 24));
        tqVar.setOnWidthUpdatedListener(new e(this, 0));
        if (this.f11222r) {
            i10 = R.string.BizBotStart;
        } else {
            i10 = R.string.BizBotStop;
        }
        tqVar.setText(LocaleController.getString(i10));
        addView(tqVar, x5.a(28.0f, 0.0f, 0.0f, 46.0f, 0.0f, 64, 21));
        ImageView imageView = new ImageView(activity);
        this.f11221n = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.msg_mini_customize);
        imageView.setBackground(h6.N(h6.w0(h6.f20913i6, d6Var), 0, 0));
        imageView.setColorFilter(new PorterDuffColorFilter(h6.w0(h6.f20830de, d6Var), PorterDuff.Mode.MULTIPLY));
        imageView.setOnClickListener(new ai.d0(this, znVar, d6Var, 7));
        addView(imageView, x5.a(32.0f, 8.0f, 0.0f, 6.0f, 0.0f, 32, 21));
    }

    public final void a() {
        float f7 = this.f11226y;
        tq tqVar = this.h;
        float c10 = tqVar.getDrawable().c() + f7 + tqVar.getPaddingLeft() + tqVar.getPaddingRight() + AndroidUtilities.dp(12.0f);
        this.f11219e.setRightPadding(c10);
        this.f11220f.setRightPadding(c10);
    }

    public void setLeftMargin(float f7) {
        this.f11226y = f7;
        this.f11218c.setTranslationX(f7);
        this.d.setTranslationX(f7);
        a();
    }
}
