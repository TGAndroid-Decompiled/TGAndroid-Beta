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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.q6;
import org.telegram.ui.Components.x9;
import org.telegram.ui.co;
import w7.x5;
public final class e extends FrameLayout {
    public final int f12030a;
    public final i9 f12031b;
    public final x9 f12032c;
    public final LinearLayout d;
    public final q6 f12033e;
    public final q6 f12034f;
    public final cq h;
    public final ImageView f12035n;
    public boolean f12036r;
    public long f12037s;
    public long v;
    public int f12038w;
    public String f12039x;
    public float f12040y;

    public e(Activity activity, f6 f6Var, co coVar) {
        super(activity);
        int i10;
        this.f12030a = coVar.getCurrentAccount();
        this.f12036r = false;
        x9 x9Var = new x9(activity);
        this.f12032c = x9Var;
        TLRPC.User user = coVar.getMessagesController().getUser(Long.valueOf(this.v));
        i9 i9Var = new i9((f6) null);
        this.f12031b = i9Var;
        i9Var.r(user);
        x9Var.setRoundRadius(AndroidUtilities.dp(16.0f));
        x9Var.e(user, i9Var);
        addView(x9Var, x5.d(32, 32.0f, 19, 10.0f, 0.0f, 10.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        q6 q6Var = new q6(activity, false, false, false);
        this.f12033e = q6Var;
        q6Var.f29600n = false;
        q6Var.getDrawable().o(true, false, false);
        q6Var.setTypeface(AndroidUtilities.bold());
        q6Var.setTextSize(AndroidUtilities.dp(14.0f));
        q6Var.setText(UserObject.getUserName(user));
        q6Var.setTextColor(j6.v0(j6.G6, f6Var));
        q6Var.setEllipsizeByGradient(true);
        linearLayout.addView(q6Var, x5.k(0.0f, 0.0f, 0.0f, 1.0f, -1, 17));
        q6 q6Var2 = new q6(activity, false, false, false);
        this.f12034f = q6Var2;
        q6Var2.f29600n = false;
        q6Var2.getDrawable().o(true, false, false);
        q6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        q6Var2.setText(LocaleController.getString(R.string.BizBotStatusManages));
        q6Var2.setTextColor(j6.v0(j6.f20724ge, f6Var));
        q6Var2.setEllipsizeByGradient(true);
        linearLayout.addView(q6Var2, x5.n(-1, 17));
        addView(linearLayout, x5.d(-2, -2.0f, 16, 52.0f, 0.0f, 49.0f, 0.0f));
        cq cqVar = new cq(activity);
        this.h = cqVar;
        cqVar.getDrawable().o(true, true, false);
        cqVar.b(0.75f, 350L, pr.h);
        cqVar.setScaleProperty(0.6f);
        cqVar.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(14.0f);
        int i11 = j6.Oh;
        int v02 = j6.v0(i11, f6Var);
        int v = j6.v(j6.v0(i11, f6Var), j6.l1(0.12f, -1));
        cqVar.setBackgroundDrawable(j6.i0(dp, dp, dp, dp, v02, v, v));
        cqVar.setTextSize(AndroidUtilities.dp(14.0f));
        cqVar.setGravity(5);
        cqVar.setTextColor(j6.v0(j6.Sh, f6Var));
        cqVar.setPadding(AndroidUtilities.dp(13.0f), 0, AndroidUtilities.dp(13.0f), 0);
        cqVar.setOnClickListener(new ah.h0(this, 25));
        cqVar.setOnWidthUpdatedListener(new d(this, 0));
        if (this.f12036r) {
            i10 = R.string.BizBotStart;
        } else {
            i10 = R.string.BizBotStop;
        }
        cqVar.setText(LocaleController.getString(i10));
        addView(cqVar, x5.d(64, 28.0f, 21, 0.0f, 0.0f, 46.0f, 0.0f));
        ImageView imageView = new ImageView(activity);
        this.f12035n = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.msg_mini_customize);
        imageView.setBackground(j6.M(j6.v0(j6.f20753i6, f6Var), 0, 0));
        imageView.setColorFilter(new PorterDuffColorFilter(j6.v0(j6.f20671de, f6Var), PorterDuff.Mode.MULTIPLY));
        imageView.setOnClickListener(new bi.x(this, coVar, f6Var, 7));
        addView(imageView, x5.d(32, 32.0f, 21, 8.0f, 0.0f, 6.0f, 0.0f));
    }

    public final void a() {
        float f7 = this.f12040y;
        cq cqVar = this.h;
        float d = cqVar.getDrawable().d() + f7 + cqVar.getPaddingLeft() + cqVar.getPaddingRight() + AndroidUtilities.dp(12.0f);
        this.f12033e.setRightPadding(d);
        this.f12034f.setRightPadding(d);
    }

    public void setLeftMargin(float f7) {
        this.f12040y = f7;
        this.f12032c.setTranslationX(f7);
        this.d.setTranslationX(f7);
        a();
    }
}
