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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.q6;
import org.telegram.ui.Components.w9;
import org.telegram.ui.sn;
import w7.z5;
public final class e extends FrameLayout {
    public final int f12877a;
    public final h9 f12878b;
    public final w9 f12879c;
    public final LinearLayout d;
    public final q6 e;
    public final q6 f12880f;
    public final nq h;
    public final ImageView f12881n;
    public boolean f12882r;
    public long f12883s;
    public long v;
    public int f12884w;
    public String f12885x;
    public float f12886y;

    public e(Activity activity, d6 d6Var, sn snVar) {
        super(activity);
        int i10;
        this.f12877a = snVar.getCurrentAccount();
        this.f12882r = false;
        w9 w9Var = new w9(activity);
        this.f12879c = w9Var;
        TLRPC.User user = snVar.getMessagesController().getUser(Long.valueOf(this.v));
        h9 h9Var = new h9((d6) null);
        this.f12878b = h9Var;
        h9Var.r(user);
        w9Var.setRoundRadius(AndroidUtilities.dp(16.0f));
        w9Var.e(user, h9Var);
        addView(w9Var, z5.a(32.0f, 10.0f, 0.0f, 10.0f, 0.0f, 32, 19));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        q6 q6Var = new q6(activity, false, false, false);
        this.e = q6Var;
        q6Var.f29580n = false;
        q6Var.getDrawable().r(true, false);
        q6Var.setTypeface(AndroidUtilities.bold());
        q6Var.setTextSize(AndroidUtilities.dp(14.0f));
        q6Var.setText(UserObject.getUserName(user));
        q6Var.setTextColor(h6.w0(h6.G6, d6Var));
        q6Var.setEllipsizeByGradient(true);
        linearLayout.addView(q6Var, z5.k(0.0f, 0.0f, 0.0f, 1.0f, -1, 17));
        q6 q6Var2 = new q6(activity, false, false, false);
        this.f12880f = q6Var2;
        q6Var2.f29580n = false;
        q6Var2.getDrawable().r(true, false);
        q6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        q6Var2.setText(LocaleController.getString(R.string.BizBotStatusManages));
        q6Var2.setTextColor(h6.w0(h6.f21047ge, d6Var));
        q6Var2.setEllipsizeByGradient(true);
        linearLayout.addView(q6Var2, z5.n(-1, 17));
        addView(linearLayout, z5.a(-2.0f, 52.0f, 0.0f, 49.0f, 0.0f, -2, 16));
        nq nqVar = new nq(activity);
        this.h = nqVar;
        nqVar.getDrawable().r(true, true);
        nqVar.b(0.75f, 350L, bs.h);
        nqVar.setScaleProperty(0.6f);
        nqVar.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(14.0f);
        int i11 = h6.Oh;
        int w02 = h6.w0(i11, d6Var);
        int v = h6.v(h6.w0(i11, d6Var), h6.m1(0.12f, -1));
        nqVar.setBackgroundDrawable(h6.j0(dp, dp, dp, dp, w02, v, v));
        nqVar.setTextSize(AndroidUtilities.dp(14.0f));
        nqVar.setGravity(5);
        nqVar.setTextColor(h6.w0(h6.Sh, d6Var));
        nqVar.setPadding(AndroidUtilities.dp(13.0f), 0, AndroidUtilities.dp(13.0f), 0);
        nqVar.setOnClickListener(new hg.r0(this, 5));
        nqVar.setOnWidthUpdatedListener(new d(this, 0));
        if (this.f12882r) {
            i10 = R.string.BizBotStart;
        } else {
            i10 = R.string.BizBotStop;
        }
        nqVar.setText(LocaleController.getString(i10));
        addView(nqVar, z5.a(28.0f, 0.0f, 0.0f, 46.0f, 0.0f, 64, 21));
        ImageView imageView = new ImageView(activity);
        this.f12881n = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.msg_mini_customize);
        imageView.setBackground(h6.N(h6.w0(h6.f21075i6, d6Var), 0, 0));
        imageView.setColorFilter(new PorterDuffColorFilter(h6.w0(h6.f20992de, d6Var), PorterDuff.Mode.MULTIPLY));
        imageView.setOnClickListener(new ai.v0(this, snVar, d6Var, 10));
        addView(imageView, z5.a(32.0f, 8.0f, 0.0f, 6.0f, 0.0f, 32, 21));
    }

    public final void a() {
        float f7 = this.f12886y;
        nq nqVar = this.h;
        float c10 = nqVar.getDrawable().c() + f7 + nqVar.getPaddingLeft() + nqVar.getPaddingRight() + AndroidUtilities.dp(12.0f);
        this.e.setRightPadding(c10);
        this.f12880f.setRightPadding(c10);
    }

    public void setLeftMargin(float f7) {
        this.f12886y = f7;
        this.f12879c.setTranslationX(f7);
        this.d.setTranslationX(f7);
        a();
    }
}
