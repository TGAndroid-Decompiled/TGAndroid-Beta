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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.w9;
import org.telegram.ui.xn;
import w7.y5;
public final class e extends FrameLayout {
    public final int f10244a;
    public final h9 f10245b;
    public final w9 f10246c;
    public final LinearLayout d;
    public final p6 e;
    public final p6 f10247f;
    public final fq h;
    public final ImageView f10248n;
    public boolean f10249r;
    public long f10250s;
    public long v;
    public int f10251w;
    public String f10252x;
    public float f10253y;

    public e(Activity activity, e6 e6Var, xn xnVar) {
        super(activity);
        int i10;
        this.f10244a = xnVar.getCurrentAccount();
        this.f10249r = false;
        w9 w9Var = new w9(activity);
        this.f10246c = w9Var;
        TLRPC.User user = xnVar.getMessagesController().getUser(Long.valueOf(this.v));
        h9 h9Var = new h9((e6) null);
        this.f10245b = h9Var;
        h9Var.r(user);
        w9Var.setRoundRadius(AndroidUtilities.dp(16.0f));
        w9Var.e(user, h9Var);
        addView(w9Var, y5.d(32, 32.0f, 19, 10.0f, 0.0f, 10.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        p6 p6Var = new p6(activity, false, false, false);
        this.e = p6Var;
        p6Var.f27291n = false;
        p6Var.getDrawable().o(true, false, false);
        p6Var.setTypeface(AndroidUtilities.bold());
        p6Var.setTextSize(AndroidUtilities.dp(14.0f));
        p6Var.setText(UserObject.getUserName(user));
        p6Var.setTextColor(i6.v0(i6.G6, e6Var));
        p6Var.setEllipsizeByGradient(true);
        linearLayout.addView(p6Var, y5.k(0.0f, 0.0f, 0.0f, 1.0f, -1, 17));
        p6 p6Var2 = new p6(activity, false, false, false);
        this.f10247f = p6Var2;
        p6Var2.f27291n = false;
        p6Var2.getDrawable().o(true, false, false);
        p6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        p6Var2.setText(LocaleController.getString(R.string.BizBotStatusManages));
        p6Var2.setTextColor(i6.v0(i6.f19118ge, e6Var));
        p6Var2.setEllipsizeByGradient(true);
        linearLayout.addView(p6Var2, y5.n(-1, 17));
        addView(linearLayout, y5.d(-2, -2.0f, 16, 52.0f, 0.0f, 49.0f, 0.0f));
        fq fqVar = new fq(activity);
        this.h = fqVar;
        fqVar.getDrawable().o(true, true, false);
        fqVar.b(0.75f, 350L, sr.h);
        fqVar.setScaleProperty(0.6f);
        fqVar.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(14.0f);
        int i11 = i6.Oh;
        int v02 = i6.v0(i11, e6Var);
        int v = i6.v(i6.v0(i11, e6Var), i6.l1(0.12f, -1));
        fqVar.setBackgroundDrawable(i6.i0(dp, dp, dp, dp, v02, v, v));
        fqVar.setTextSize(AndroidUtilities.dp(14.0f));
        fqVar.setGravity(5);
        fqVar.setTextColor(i6.v0(i6.Sh, e6Var));
        fqVar.setPadding(AndroidUtilities.dp(13.0f), 0, AndroidUtilities.dp(13.0f), 0);
        fqVar.setOnClickListener(new ai.v0(this, 24));
        fqVar.setOnWidthUpdatedListener(new d(this, 0));
        if (this.f10249r) {
            i10 = R.string.BizBotStart;
        } else {
            i10 = R.string.BizBotStop;
        }
        fqVar.setText(LocaleController.getString(i10));
        addView(fqVar, y5.d(64, 28.0f, 21, 0.0f, 0.0f, 46.0f, 0.0f));
        ImageView imageView = new ImageView(activity);
        this.f10248n = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.msg_mini_customize);
        imageView.setBackground(i6.M(i6.v0(i6.f19147i6, e6Var), 0, 0));
        imageView.setColorFilter(new PorterDuffColorFilter(i6.v0(i6.f19065de, e6Var), PorterDuff.Mode.MULTIPLY));
        imageView.setOnClickListener(new ai.d0(this, xnVar, e6Var, 7));
        addView(imageView, y5.d(32, 32.0f, 21, 8.0f, 0.0f, 6.0f, 0.0f));
    }

    public final void a() {
        float f7 = this.f10253y;
        fq fqVar = this.h;
        float d = fqVar.getDrawable().d() + f7 + fqVar.getPaddingLeft() + fqVar.getPaddingRight() + AndroidUtilities.dp(12.0f);
        this.e.setRightPadding(d);
        this.f10247f.setRightPadding(d);
    }

    public void setLeftMargin(float f7) {
        this.f10253y = f7;
        this.f10246c.setTranslationX(f7);
        this.d.setTranslationX(f7);
        a();
    }
}
