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
import org.telegram.ui.qn;
import w7.z5;
public final class e extends FrameLayout {
    public final int f12867a;
    public final h9 f12868b;
    public final w9 f12869c;
    public final LinearLayout d;
    public final q6 e;
    public final q6 f12870f;
    public final nq h;
    public final ImageView f12871n;
    public boolean f12872r;
    public long f12873s;
    public long v;
    public int f12874w;
    public String f12875x;
    public float f12876y;

    public e(Activity activity, d6 d6Var, qn qnVar) {
        super(activity);
        int i10;
        this.f12867a = qnVar.getCurrentAccount();
        this.f12872r = false;
        w9 w9Var = new w9(activity);
        this.f12869c = w9Var;
        TLRPC.User user = qnVar.getMessagesController().getUser(Long.valueOf(this.v));
        h9 h9Var = new h9((d6) null);
        this.f12868b = h9Var;
        h9Var.r(user);
        w9Var.setRoundRadius(AndroidUtilities.dp(16.0f));
        w9Var.e(user, h9Var);
        addView(w9Var, z5.d(32, 32.0f, 19, 10.0f, 0.0f, 10.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        q6 q6Var = new q6(activity, false, false, false);
        this.e = q6Var;
        q6Var.f29481n = false;
        q6Var.getDrawable().r(true, false);
        q6Var.setTypeface(AndroidUtilities.bold());
        q6Var.setTextSize(AndroidUtilities.dp(14.0f));
        q6Var.setText(UserObject.getUserName(user));
        q6Var.setTextColor(h6.w0(h6.G6, d6Var));
        q6Var.setEllipsizeByGradient(true);
        linearLayout.addView(q6Var, z5.k(0.0f, 0.0f, 0.0f, 1.0f, -1, 17));
        q6 q6Var2 = new q6(activity, false, false, false);
        this.f12870f = q6Var2;
        q6Var2.f29481n = false;
        q6Var2.getDrawable().r(true, false);
        q6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        q6Var2.setText(LocaleController.getString(R.string.BizBotStatusManages));
        q6Var2.setTextColor(h6.w0(h6.f21051ge, d6Var));
        q6Var2.setEllipsizeByGradient(true);
        linearLayout.addView(q6Var2, z5.n(-1, 17));
        addView(linearLayout, z5.d(-2, -2.0f, 16, 52.0f, 0.0f, 49.0f, 0.0f));
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
        if (this.f12872r) {
            i10 = R.string.BizBotStart;
        } else {
            i10 = R.string.BizBotStop;
        }
        nqVar.setText(LocaleController.getString(i10));
        addView(nqVar, z5.d(64, 28.0f, 21, 0.0f, 0.0f, 46.0f, 0.0f));
        ImageView imageView = new ImageView(activity);
        this.f12871n = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.msg_mini_customize);
        imageView.setBackground(h6.N(h6.w0(h6.f21079i6, d6Var), 0, 0));
        imageView.setColorFilter(new PorterDuffColorFilter(h6.w0(h6.f20996de, d6Var), PorterDuff.Mode.MULTIPLY));
        imageView.setOnClickListener(new ai.v0(this, qnVar, d6Var, 10));
        addView(imageView, z5.d(32, 32.0f, 21, 8.0f, 0.0f, 6.0f, 0.0f));
    }

    public final void a() {
        float f7 = this.f12876y;
        nq nqVar = this.h;
        float c10 = nqVar.getDrawable().c() + f7 + nqVar.getPaddingLeft() + nqVar.getPaddingRight() + AndroidUtilities.dp(12.0f);
        this.e.setRightPadding(c10);
        this.f12870f.setRightPadding(c10);
    }

    public void setLeftMargin(float f7) {
        this.f12876y = f7;
        this.f12869c.setTranslationX(f7);
        this.d.setTranslationX(f7);
        a();
    }
}
