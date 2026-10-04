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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.gq;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.w9;
import org.telegram.ui.yn;
import w7.z5;
public final class e extends FrameLayout {
    public final int f11153a;
    public final h9 f11154b;
    public final w9 f11155c;
    public final LinearLayout d;
    public final p6 f11156e;
    public final p6 f11157f;
    public final gq h;
    public final ImageView f11158n;
    public boolean f11159r;
    public long f11160s;
    public long v;
    public int f11161w;
    public String f11162x;
    public float f11163y;

    public e(Activity activity, d6 d6Var, yn ynVar) {
        super(activity);
        int i10;
        this.f11153a = ynVar.getCurrentAccount();
        this.f11159r = false;
        w9 w9Var = new w9(activity);
        this.f11155c = w9Var;
        TLRPC.User user = ynVar.getMessagesController().getUser(Long.valueOf(this.v));
        h9 h9Var = new h9((d6) null);
        this.f11154b = h9Var;
        h9Var.r(user);
        w9Var.setRoundRadius(AndroidUtilities.dp(16.0f));
        w9Var.e(user, h9Var);
        addView(w9Var, z5.d(32, 32.0f, 19, 10.0f, 0.0f, 10.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        p6 p6Var = new p6(activity, false, false, false);
        this.f11156e = p6Var;
        p6Var.f29520n = false;
        p6Var.getDrawable().o(true, false, false);
        p6Var.setTypeface(AndroidUtilities.bold());
        p6Var.setTextSize(AndroidUtilities.dp(14.0f));
        p6Var.setText(UserObject.getUserName(user));
        p6Var.setTextColor(i6.v0(i6.G6, d6Var));
        p6Var.setEllipsizeByGradient(true);
        linearLayout.addView(p6Var, z5.k(0.0f, 0.0f, 0.0f, 1.0f, -1, 17));
        p6 p6Var2 = new p6(activity, false, false, false);
        this.f11157f = p6Var2;
        p6Var2.f29520n = false;
        p6Var2.getDrawable().o(true, false, false);
        p6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        p6Var2.setText(LocaleController.getString(R.string.BizBotStatusManages));
        p6Var2.setTextColor(i6.v0(i6.f20880ge, d6Var));
        p6Var2.setEllipsizeByGradient(true);
        linearLayout.addView(p6Var2, z5.n(-1, 17));
        addView(linearLayout, z5.d(-2, -2.0f, 16, 52.0f, 0.0f, 49.0f, 0.0f));
        gq gqVar = new gq(activity);
        this.h = gqVar;
        gqVar.getDrawable().o(true, true, false);
        gqVar.b(0.75f, 350L, tr.h);
        gqVar.setScaleProperty(0.6f);
        gqVar.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(14.0f);
        int i11 = i6.Oh;
        int v02 = i6.v0(i11, d6Var);
        int v = i6.v(i6.v0(i11, d6Var), i6.l1(0.12f, -1));
        gqVar.setBackgroundDrawable(i6.i0(dp, dp, dp, dp, v02, v, v));
        gqVar.setTextSize(AndroidUtilities.dp(14.0f));
        gqVar.setGravity(5);
        gqVar.setTextColor(i6.v0(i6.Sh, d6Var));
        gqVar.setPadding(AndroidUtilities.dp(13.0f), 0, AndroidUtilities.dp(13.0f), 0);
        gqVar.setOnClickListener(new ai.v0(this, 24));
        gqVar.setOnWidthUpdatedListener(new d(this, 0));
        if (this.f11159r) {
            i10 = R.string.BizBotStart;
        } else {
            i10 = R.string.BizBotStop;
        }
        gqVar.setText(LocaleController.getString(i10));
        addView(gqVar, z5.d(64, 28.0f, 21, 0.0f, 0.0f, 46.0f, 0.0f));
        ImageView imageView = new ImageView(activity);
        this.f11158n = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.msg_mini_customize);
        imageView.setBackground(i6.M(i6.v0(i6.f20909i6, d6Var), 0, 0));
        imageView.setColorFilter(new PorterDuffColorFilter(i6.v0(i6.f20826de, d6Var), PorterDuff.Mode.MULTIPLY));
        imageView.setOnClickListener(new ai.d0(this, ynVar, d6Var, 7));
        addView(imageView, z5.d(32, 32.0f, 21, 8.0f, 0.0f, 6.0f, 0.0f));
    }

    public final void a() {
        float f7 = this.f11163y;
        gq gqVar = this.h;
        float d = gqVar.getDrawable().d() + f7 + gqVar.getPaddingLeft() + gqVar.getPaddingRight() + AndroidUtilities.dp(12.0f);
        this.f11156e.setRightPadding(d);
        this.f11157f.setRightPadding(d);
    }

    public void setLeftMargin(float f7) {
        this.f11163y = f7;
        this.f11155c.setTranslationX(f7);
        this.d.setTranslationX(f7);
        a();
    }
}
