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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.js;
import org.telegram.ui.Components.r6;
import org.telegram.ui.Components.vq;
import org.telegram.ui.Components.y9;
import org.telegram.ui.eo;
import w7.w5;
public final class f extends FrameLayout {
    public final int f11215a;
    public final j9 f11216b;
    public final y9 f11217c;
    public final LinearLayout d;
    public final r6 f11218e;
    public final r6 f11219f;
    public final vq h;
    public final ImageView f11220n;
    public boolean f11221r;
    public long f11222s;
    public long v;
    public int f11223w;
    public String f11224x;
    public float f11225y;

    public f(Activity activity, c6 c6Var, eo eoVar) {
        super(activity);
        int i10;
        this.f11215a = eoVar.getCurrentAccount();
        this.f11221r = false;
        y9 y9Var = new y9(activity);
        this.f11217c = y9Var;
        TLRPC.User user = eoVar.getMessagesController().getUser(Long.valueOf(this.v));
        j9 j9Var = new j9((c6) null);
        this.f11216b = j9Var;
        j9Var.r(user);
        y9Var.setRoundRadius(AndroidUtilities.dp(16.0f));
        y9Var.e(user, j9Var);
        addView(y9Var, w5.a(32.0f, 10.0f, 0.0f, 10.0f, 0.0f, 32, 19));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        r6 r6Var = new r6(activity, false, false, false);
        this.f11218e = r6Var;
        r6Var.f30059n = false;
        r6Var.getDrawable().r(true, false);
        r6Var.setTypeface(AndroidUtilities.bold());
        r6Var.setTextSize(AndroidUtilities.dp(14.0f));
        r6Var.setText(UserObject.getUserName(user));
        r6Var.setTextColor(h6.w0(h6.G6, c6Var));
        r6Var.setEllipsizeByGradient(true);
        linearLayout.addView(r6Var, w5.k(0.0f, 0.0f, 0.0f, 1.0f, -1, 17));
        r6 r6Var2 = new r6(activity, false, false, false);
        this.f11219f = r6Var2;
        r6Var2.f30059n = false;
        r6Var2.getDrawable().r(true, false);
        r6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        r6Var2.setText(LocaleController.getString(R.string.BizBotStatusManages));
        r6Var2.setTextColor(h6.w0(h6.ge, c6Var));
        r6Var2.setEllipsizeByGradient(true);
        linearLayout.addView(r6Var2, w5.n(-1, 17));
        addView(linearLayout, w5.a(-2.0f, 52.0f, 0.0f, 49.0f, 0.0f, -2, 16));
        vq vqVar = new vq(activity);
        this.h = vqVar;
        vqVar.getDrawable().r(true, true);
        vqVar.b(0.75f, 350L, js.h);
        vqVar.setScaleProperty(0.6f);
        vqVar.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(14.0f);
        int i11 = h6.Oh;
        int w02 = h6.w0(i11, c6Var);
        int v = h6.v(h6.w0(i11, c6Var), h6.m1(0.12f, -1));
        vqVar.setBackgroundDrawable(h6.j0(dp, dp, dp, dp, w02, v, v));
        vqVar.setTextSize(AndroidUtilities.dp(14.0f));
        vqVar.setGravity(5);
        vqVar.setTextColor(h6.w0(h6.Sh, c6Var));
        vqVar.setPadding(AndroidUtilities.dp(13.0f), 0, AndroidUtilities.dp(13.0f), 0);
        vqVar.setOnClickListener(new ai.v0(this, 24));
        vqVar.setOnWidthUpdatedListener(new e(this, 0));
        if (this.f11221r) {
            i10 = R.string.BizBotStart;
        } else {
            i10 = R.string.BizBotStop;
        }
        vqVar.setText(LocaleController.getString(i10));
        addView(vqVar, w5.a(28.0f, 0.0f, 0.0f, 46.0f, 0.0f, 64, 21));
        ImageView imageView = new ImageView(activity);
        this.f11220n = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.msg_mini_customize);
        imageView.setBackground(h6.N(h6.w0(h6.f20651i6, c6Var), 0, 0));
        imageView.setColorFilter(new PorterDuffColorFilter(h6.w0(h6.f20568de, c6Var), PorterDuff.Mode.MULTIPLY));
        imageView.setOnClickListener(new ai.d0(this, eoVar, c6Var, 7));
        addView(imageView, w5.a(32.0f, 8.0f, 0.0f, 6.0f, 0.0f, 32, 21));
    }

    public final void a() {
        float f7 = this.f11225y;
        vq vqVar = this.h;
        float c10 = vqVar.getDrawable().c() + f7 + vqVar.getPaddingLeft() + vqVar.getPaddingRight() + AndroidUtilities.dp(12.0f);
        this.f11218e.setRightPadding(c10);
        this.f11219f.setRightPadding(c10);
    }

    public void setLeftMargin(float f7) {
        this.f11225y = f7;
        this.f11217c.setTranslationX(f7);
        this.d.setTranslationX(f7);
        a();
    }
}
