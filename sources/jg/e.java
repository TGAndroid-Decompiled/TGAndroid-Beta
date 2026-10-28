package jg;

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
import org.telegram.ui.ActionBar.b7;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.s6;
import org.telegram.ui.Components.y9;
import org.telegram.ui.wn;
public final class e extends FrameLayout {
    public final int f15678a;
    public final j9 f15679b;
    public final y9 f15680c;
    public final LinearLayout d;
    public final s6 e;
    public final s6 f15681f;
    public final pq h;
    public final ImageView f15682n;
    public boolean f15683r;
    public long f15684s;
    public long v;
    public int f15685w;
    public String f15686x;
    public float f15687y;

    public e(Activity activity, u6 u6Var, wn wnVar) {
        super(activity);
        int i10;
        this.f15678a = wnVar.getCurrentAccount();
        this.f15683r = false;
        y9 y9Var = new y9(activity);
        this.f15680c = y9Var;
        TLRPC.User user = wnVar.getMessagesController().getUser(Long.valueOf(this.v));
        j9 j9Var = new j9((u6) null);
        this.f15679b = j9Var;
        j9Var.r(user);
        y9Var.setRoundRadius(AndroidUtilities.dp(16.0f));
        y9Var.f(user, j9Var);
        addView(y9Var, kb1.h(32, 32.0f, 19, 10.0f, 0.0f, 10.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        s6 s6Var = new s6(activity, false, false, false);
        this.e = s6Var;
        s6Var.f32492n = false;
        s6Var.getDrawable().r(true, false);
        s6Var.setTypeface(AndroidUtilities.bold());
        s6Var.setTextSize(AndroidUtilities.dp(14.0f));
        s6Var.setText(UserObject.getUserName(user));
        f7.Z(s6Var, y6.G6, u6Var);
        s6Var.setEllipsizeByGradient(true);
        linearLayout.addView(s6Var, kb1.o(0.0f, 0.0f, 0.0f, 1.0f, -1, 17));
        s6 s6Var2 = new s6(activity, false, false, false);
        this.f15681f = s6Var2;
        s6Var2.f32492n = false;
        s6Var2.getDrawable().r(true, false);
        s6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        s6Var2.setText(LocaleController.getString(R.string.BizBotStatusManages));
        f7.Z(s6Var2, y6.f23419ge, u6Var);
        s6Var2.setEllipsizeByGradient(true);
        linearLayout.addView(s6Var2, kb1.r(-1, 17));
        addView(linearLayout, kb1.h(-2, -2.0f, 16, 52.0f, 0.0f, 49.0f, 0.0f));
        pq pqVar = new pq(activity);
        this.h = pqVar;
        pqVar.getDrawable().r(true, true);
        pqVar.b(0.75f, 350L, ds.h);
        pqVar.setScaleProperty(0.6f);
        pqVar.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(14.0f);
        int i11 = y6.Oh;
        int w02 = y6.w0(i11, u6Var);
        int v = y6.v(y6.w0(i11, u6Var), y6.o1(0.12f, -1));
        org.telegram.ui.Cells.y j02 = y6.j0(dp, dp, dp, dp, w02, v, v);
        b7 N = f7.N(i11);
        pqVar.setBackground(j02);
        f7.k(pqVar, j02, N, null, u6Var);
        pqVar.setTextSize(AndroidUtilities.dp(14.0f));
        pqVar.setGravity(5);
        f7.Z(pqVar, y6.Sh, u6Var);
        pqVar.setPadding(AndroidUtilities.dp(13.0f), 0, AndroidUtilities.dp(13.0f), 0);
        pqVar.setOnClickListener(new ig.d0(this, 6));
        pqVar.setOnWidthUpdatedListener(new d(this, 0));
        if (this.f15683r) {
            i10 = R.string.BizBotStart;
        } else {
            i10 = R.string.BizBotStop;
        }
        pqVar.setText(LocaleController.getString(i10));
        addView(pqVar, kb1.h(64, 28.0f, 21, 0.0f, 0.0f, 46.0f, 0.0f));
        ImageView imageView = new ImageView(activity);
        this.f15682n = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.msg_mini_customize);
        int i12 = y6.f23449i6;
        org.telegram.ui.Cells.y N2 = y6.N(y6.w0(i12, u6Var), 0, 0);
        b7 N3 = f7.N(i12);
        imageView.setBackground(N2);
        f7.k(imageView, N2, null, N3, u6Var);
        f7.t(imageView, y6.f23365de, u6Var, PorterDuff.Mode.MULTIPLY);
        imageView.setOnClickListener(new bi.w0(this, wnVar, u6Var, 10));
        addView(imageView, kb1.h(32, 32.0f, 21, 8.0f, 0.0f, 6.0f, 0.0f));
    }

    public final void a() {
        float f7 = this.f15687y;
        pq pqVar = this.h;
        float c10 = pqVar.getDrawable().c() + f7 + pqVar.getPaddingLeft() + pqVar.getPaddingRight() + AndroidUtilities.dp(12.0f);
        this.e.setRightPadding(c10);
        this.f15681f.setRightPadding(c10);
    }

    public void setLeftMargin(float f7) {
        this.f15687y = f7;
        this.f15680c.setTranslationX(f7);
        this.d.setTranslationX(f7);
        a();
    }
}
