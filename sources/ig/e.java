package ig;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.u9;
import org.telegram.ui.Components.zr;
import org.telegram.ui.sn;
import w7.z5;
public final class e extends FrameLayout {
    public final int f12897a;
    public final f9 f12898b;
    public final u9 f12899c;
    public final LinearLayout d;
    public final o6 e;
    public final o6 f12900f;
    public final lq h;
    public final ImageView f12901n;
    public boolean f12902r;
    public long f12903s;
    public long v;
    public int f12904w;
    public String f12905x;
    public float f12906y;

    public e(Activity activity, g6 g6Var, sn snVar) {
        super(activity);
        int i10;
        this.f12897a = snVar.getCurrentAccount();
        this.f12902r = false;
        u9 u9Var = new u9(activity);
        this.f12899c = u9Var;
        TLRPC.User user = snVar.getMessagesController().getUser(Long.valueOf(this.v));
        f9 f9Var = new f9((g6) null);
        this.f12898b = f9Var;
        f9Var.r(user);
        u9Var.setRoundRadius(AndroidUtilities.dp(16.0f));
        u9Var.e(user, f9Var);
        addView(u9Var, z5.d(32, 32.0f, 19, 10.0f, 0.0f, 10.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        o6 o6Var = new o6(activity, false, false, false);
        this.e = o6Var;
        o6Var.f29157n = false;
        o6Var.getDrawable().r(true, false);
        o6Var.setTypeface(AndroidUtilities.bold());
        o6Var.setTextSize(AndroidUtilities.dp(14.0f));
        o6Var.setText(UserObject.getUserName(user));
        r6.a0(o6Var, k6.G6, g6Var);
        o6Var.setEllipsizeByGradient(true);
        linearLayout.addView(o6Var, z5.k(0.0f, 0.0f, 0.0f, 1.0f, -1, 17));
        o6 o6Var2 = new o6(activity, false, false, false);
        this.f12900f = o6Var2;
        o6Var2.f29157n = false;
        o6Var2.getDrawable().r(true, false);
        o6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        o6Var2.setText(LocaleController.getString(R.string.BizBotStatusManages));
        r6.a0(o6Var2, k6.f21245ge, g6Var);
        o6Var2.setEllipsizeByGradient(true);
        linearLayout.addView(o6Var2, z5.n(-1, 17));
        addView(linearLayout, z5.d(-2, -2.0f, 16, 52.0f, 0.0f, 49.0f, 0.0f));
        lq lqVar = new lq(activity);
        this.h = lqVar;
        lqVar.getDrawable().r(true, true);
        lqVar.b(0.75f, 350L, zr.h);
        lqVar.setScaleProperty(0.6f);
        lqVar.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(14.0f);
        int i11 = k6.Oh;
        int w02 = k6.w0(i11, g6Var);
        int v = k6.v(k6.w0(i11, g6Var), k6.o1(0.12f, -1));
        org.telegram.ui.Cells.y j02 = k6.j0(dp, dp, dp, dp, w02, v, v);
        n6 O = r6.O(i11);
        lqVar.setBackground(j02);
        r6.k(lqVar, j02, O, null, g6Var);
        lqVar.setTextSize(AndroidUtilities.dp(14.0f));
        lqVar.setGravity(5);
        r6.a0(lqVar, k6.Sh, g6Var);
        lqVar.setPadding(AndroidUtilities.dp(13.0f), 0, AndroidUtilities.dp(13.0f), 0);
        lqVar.setOnClickListener(new hg.r0(this, 5));
        lqVar.setOnWidthUpdatedListener(new d(this, 0));
        if (this.f12902r) {
            i10 = R.string.BizBotStart;
        } else {
            i10 = R.string.BizBotStop;
        }
        lqVar.setText(LocaleController.getString(i10));
        addView(lqVar, z5.d(64, 28.0f, 21, 0.0f, 0.0f, 46.0f, 0.0f));
        ImageView imageView = new ImageView(activity);
        this.f12901n = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.msg_mini_customize);
        int i12 = k6.f21273i6;
        org.telegram.ui.Cells.y N = k6.N(k6.w0(i12, g6Var), 0, 0);
        n6 O2 = r6.O(i12);
        imageView.setBackground(N);
        r6.k(imageView, N, null, O2, g6Var);
        r6.t(imageView, k6.f21190de, g6Var, PorterDuff.Mode.MULTIPLY);
        imageView.setOnClickListener(new ai.v0(this, snVar, g6Var, 10));
        addView(imageView, z5.d(32, 32.0f, 21, 8.0f, 0.0f, 6.0f, 0.0f));
    }

    public final void a() {
        float f7 = this.f12906y;
        lq lqVar = this.h;
        float c10 = lqVar.getDrawable().c() + f7 + lqVar.getPaddingLeft() + lqVar.getPaddingRight() + AndroidUtilities.dp(12.0f);
        this.e.setRightPadding(c10);
        this.f12900f.setRightPadding(c10);
    }

    public void setLeftMargin(float f7) {
        this.f12906y = f7;
        this.f12899c.setTranslationX(f7);
        this.d.setTranslationX(f7);
        a();
    }
}
