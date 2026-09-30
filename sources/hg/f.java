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
import org.telegram.ui.Components.gq;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.w9;
import org.telegram.ui.wn;
import w7.y5;
public final class f extends FrameLayout {
    public final int f10260a;
    public final h9 f10261b;
    public final w9 f10262c;
    public final LinearLayout d;
    public final p6 e;
    public final p6 f10263f;
    public final gq h;
    public final ImageView f10264n;
    public boolean f10265r;
    public long f10266s;
    public long v;
    public int f10267w;
    public String f10268x;
    public float f10269y;

    public f(Activity activity, d6 d6Var, wn wnVar) {
        super(activity);
        int i10;
        this.f10260a = wnVar.getCurrentAccount();
        this.f10265r = false;
        w9 w9Var = new w9(activity);
        this.f10262c = w9Var;
        TLRPC.User user = wnVar.getMessagesController().getUser(Long.valueOf(this.v));
        h9 h9Var = new h9((d6) null);
        this.f10261b = h9Var;
        h9Var.r(user);
        w9Var.setRoundRadius(AndroidUtilities.dp(16.0f));
        w9Var.e(user, h9Var);
        addView(w9Var, y5.d(32, 32.0f, 19, 10.0f, 0.0f, 10.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        p6 p6Var = new p6(activity, false, false, false);
        this.e = p6Var;
        p6Var.f27252n = false;
        p6Var.getDrawable().o(true, false, false);
        p6Var.setTypeface(AndroidUtilities.bold());
        p6Var.setTextSize(AndroidUtilities.dp(14.0f));
        p6Var.setText(UserObject.getUserName(user));
        p6Var.setTextColor(h6.v0(h6.G6, d6Var));
        p6Var.setEllipsizeByGradient(true);
        linearLayout.addView(p6Var, y5.k(0.0f, 0.0f, 0.0f, 1.0f, -1, 17));
        p6 p6Var2 = new p6(activity, false, false, false);
        this.f10263f = p6Var2;
        p6Var2.f27252n = false;
        p6Var2.getDrawable().o(true, false, false);
        p6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        p6Var2.setText(LocaleController.getString(R.string.BizBotStatusManages));
        p6Var2.setTextColor(h6.v0(h6.f19136ge, d6Var));
        p6Var2.setEllipsizeByGradient(true);
        linearLayout.addView(p6Var2, y5.n(-1, 17));
        addView(linearLayout, y5.d(-2, -2.0f, 16, 52.0f, 0.0f, 49.0f, 0.0f));
        gq gqVar = new gq(activity);
        this.h = gqVar;
        gqVar.getDrawable().o(true, true, false);
        gqVar.b(0.75f, 350L, tr.h);
        gqVar.setScaleProperty(0.6f);
        gqVar.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(14.0f);
        int i11 = h6.Oh;
        int v02 = h6.v0(i11, d6Var);
        int v = h6.v(h6.v0(i11, d6Var), h6.l1(0.12f, -1));
        gqVar.setBackgroundDrawable(h6.i0(dp, dp, dp, dp, v02, v, v));
        gqVar.setTextSize(AndroidUtilities.dp(14.0f));
        gqVar.setGravity(5);
        gqVar.setTextColor(h6.v0(h6.Sh, d6Var));
        gqVar.setPadding(AndroidUtilities.dp(13.0f), 0, AndroidUtilities.dp(13.0f), 0);
        gqVar.setOnClickListener(new ai.v0(this, 24));
        gqVar.setOnWidthUpdatedListener(new e(this, 0));
        if (this.f10265r) {
            i10 = R.string.BizBotStart;
        } else {
            i10 = R.string.BizBotStop;
        }
        gqVar.setText(LocaleController.getString(i10));
        addView(gqVar, y5.d(64, 28.0f, 21, 0.0f, 0.0f, 46.0f, 0.0f));
        ImageView imageView = new ImageView(activity);
        this.f10264n = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.msg_mini_customize);
        imageView.setBackground(h6.M(h6.v0(h6.f19165i6, d6Var), 0, 0));
        imageView.setColorFilter(new PorterDuffColorFilter(h6.v0(h6.f19084de, d6Var), PorterDuff.Mode.MULTIPLY));
        imageView.setOnClickListener(new ai.d0(this, wnVar, d6Var, 7));
        addView(imageView, y5.d(32, 32.0f, 21, 8.0f, 0.0f, 6.0f, 0.0f));
    }

    public final void a() {
        float f7 = this.f10269y;
        gq gqVar = this.h;
        float d = gqVar.getDrawable().d() + f7 + gqVar.getPaddingLeft() + gqVar.getPaddingRight() + AndroidUtilities.dp(12.0f);
        this.e.setRightPadding(d);
        this.f10263f.setRightPadding(d);
    }

    public void setLeftMargin(float f7) {
        this.f10269y = f7;
        this.f10262c.setTranslationX(f7);
        this.d.setTranslationX(f7);
        a();
    }
}
