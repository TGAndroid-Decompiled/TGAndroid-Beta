package ig;

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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.qq;
import org.telegram.ui.Components.s6;
import org.telegram.ui.Components.z9;
import org.telegram.ui.fo;
import w7.a6;
public final class e extends FrameLayout {
    public final int f11469a;
    public final k9 f11470b;
    public final z9 f11471c;
    public final LinearLayout d;
    public final s6 e;
    public final s6 f11472f;
    public final qq h;
    public final ImageView f11473n;
    public boolean f11474r;
    public long f11475s;
    public long v;
    public int f11476w;
    public String f11477x;
    public float f11478y;

    public e(Activity activity, c6 c6Var, fo foVar) {
        super(activity);
        int i10;
        this.f11469a = foVar.getCurrentAccount();
        this.f11474r = false;
        z9 z9Var = new z9(activity);
        this.f11471c = z9Var;
        TLRPC.User user = foVar.getMessagesController().getUser(Long.valueOf(this.v));
        k9 k9Var = new k9((c6) null);
        this.f11470b = k9Var;
        k9Var.r(user);
        z9Var.setRoundRadius(AndroidUtilities.dp(16.0f));
        z9Var.e(user, k9Var);
        addView(z9Var, a6.a(32.0f, 10.0f, 0.0f, 10.0f, 0.0f, 32, 19));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        s6 s6Var = new s6(activity, false, false, false);
        this.e = s6Var;
        s6Var.f29047n = false;
        s6Var.getDrawable().r(true, false);
        s6Var.setTypeface(AndroidUtilities.bold());
        s6Var.setTextSize(AndroidUtilities.dp(14.0f));
        s6Var.setText(UserObject.getUserName(user));
        s6Var.setTextColor(g6.w0(g6.G6, c6Var));
        s6Var.setEllipsizeByGradient(true);
        linearLayout.addView(s6Var, a6.k(0.0f, 0.0f, 0.0f, 1.0f, -1, 17));
        s6 s6Var2 = new s6(activity, false, false, false);
        this.f11472f = s6Var2;
        s6Var2.f29047n = false;
        s6Var2.getDrawable().r(true, false);
        s6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        s6Var2.setText(LocaleController.getString(R.string.BizBotStatusManages));
        s6Var2.setTextColor(g6.w0(g6.f19962ge, c6Var));
        s6Var2.setEllipsizeByGradient(true);
        linearLayout.addView(s6Var2, a6.n(-1, 17));
        addView(linearLayout, a6.a(-2.0f, 52.0f, 0.0f, 49.0f, 0.0f, -2, 16));
        qq qqVar = new qq(activity);
        this.h = qqVar;
        qqVar.getDrawable().r(true, true);
        qqVar.b(0.75f, 350L, es.h);
        qqVar.setScaleProperty(0.6f);
        qqVar.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(14.0f);
        int i11 = g6.Oh;
        int w02 = g6.w0(i11, c6Var);
        int v = g6.v(g6.w0(i11, c6Var), g6.m1(0.12f, -1));
        qqVar.setBackgroundDrawable(g6.j0(dp, dp, dp, dp, w02, v, v));
        qqVar.setTextSize(AndroidUtilities.dp(14.0f));
        qqVar.setGravity(5);
        qqVar.setTextColor(g6.w0(g6.Sh, c6Var));
        qqVar.setPadding(AndroidUtilities.dp(13.0f), 0, AndroidUtilities.dp(13.0f), 0);
        qqVar.setOnClickListener(new ah.g0(this, 25));
        qqVar.setOnWidthUpdatedListener(new d(this, 0));
        if (this.f11474r) {
            i10 = R.string.BizBotStart;
        } else {
            i10 = R.string.BizBotStop;
        }
        qqVar.setText(LocaleController.getString(i10));
        addView(qqVar, a6.a(28.0f, 0.0f, 0.0f, 46.0f, 0.0f, 64, 21));
        ImageView imageView = new ImageView(activity);
        this.f11473n = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.msg_mini_customize);
        imageView.setBackground(g6.N(g6.w0(g6.f19990i6, c6Var), 0, 0));
        imageView.setColorFilter(new PorterDuffColorFilter(g6.w0(g6.f19907de, c6Var), PorterDuff.Mode.MULTIPLY));
        imageView.setOnClickListener(new bi.x(this, foVar, c6Var, 7));
        addView(imageView, a6.a(32.0f, 8.0f, 0.0f, 6.0f, 0.0f, 32, 21));
    }

    public final void a() {
        float f7 = this.f11478y;
        qq qqVar = this.h;
        float c10 = qqVar.getDrawable().c() + f7 + qqVar.getPaddingLeft() + qqVar.getPaddingRight() + AndroidUtilities.dp(12.0f);
        this.e.setRightPadding(c10);
        this.f11472f.setRightPadding(c10);
    }

    public void setLeftMargin(float f7) {
        this.f11478y = f7;
        this.f11471c.setTranslationX(f7);
        this.d.setTranslationX(f7);
        a();
    }
}
