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
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.q6;
import org.telegram.ui.Components.w9;
import org.telegram.ui.sn;
import w7.z5;
public final class e extends FrameLayout {
    public final int f12897a;
    public final h9 f12898b;
    public final w9 f12899c;
    public final LinearLayout d;
    public final q6 e;
    public final q6 f12900f;
    public final nq h;
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
        w9 w9Var = new w9(activity);
        this.f12899c = w9Var;
        TLRPC.User user = snVar.getMessagesController().getUser(Long.valueOf(this.v));
        h9 h9Var = new h9((g6) null);
        this.f12898b = h9Var;
        h9Var.r(user);
        w9Var.setRoundRadius(AndroidUtilities.dp(16.0f));
        w9Var.e(user, h9Var);
        addView(w9Var, z5.d(32, 32.0f, 19, 10.0f, 0.0f, 10.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        q6 q6Var = new q6(activity, false, false, false);
        this.e = q6Var;
        q6Var.f29776n = false;
        q6Var.getDrawable().r(true, false);
        q6Var.setTypeface(AndroidUtilities.bold());
        q6Var.setTextSize(AndroidUtilities.dp(14.0f));
        q6Var.setText(UserObject.getUserName(user));
        r6.a0(q6Var, k6.G6, g6Var);
        q6Var.setEllipsizeByGradient(true);
        linearLayout.addView(q6Var, z5.k(0.0f, 0.0f, 0.0f, 1.0f, -1, 17));
        q6 q6Var2 = new q6(activity, false, false, false);
        this.f12900f = q6Var2;
        q6Var2.f29776n = false;
        q6Var2.getDrawable().r(true, false);
        q6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        q6Var2.setText(LocaleController.getString(R.string.BizBotStatusManages));
        r6.a0(q6Var2, k6.f21244ge, g6Var);
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
        int i11 = k6.Oh;
        int w02 = k6.w0(i11, g6Var);
        int v = k6.v(k6.w0(i11, g6Var), k6.o1(0.12f, -1));
        org.telegram.ui.Cells.y j02 = k6.j0(dp, dp, dp, dp, w02, v, v);
        n6 O = r6.O(i11);
        nqVar.setBackground(j02);
        r6.k(nqVar, j02, O, null, g6Var);
        nqVar.setTextSize(AndroidUtilities.dp(14.0f));
        nqVar.setGravity(5);
        r6.a0(nqVar, k6.Sh, g6Var);
        nqVar.setPadding(AndroidUtilities.dp(13.0f), 0, AndroidUtilities.dp(13.0f), 0);
        nqVar.setOnClickListener(new hg.r0(this, 5));
        nqVar.setOnWidthUpdatedListener(new d(this, 0));
        if (this.f12902r) {
            i10 = R.string.BizBotStart;
        } else {
            i10 = R.string.BizBotStop;
        }
        nqVar.setText(LocaleController.getString(i10));
        addView(nqVar, z5.d(64, 28.0f, 21, 0.0f, 0.0f, 46.0f, 0.0f));
        ImageView imageView = new ImageView(activity);
        this.f12901n = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.msg_mini_customize);
        int i12 = k6.f21272i6;
        org.telegram.ui.Cells.y N = k6.N(k6.w0(i12, g6Var), 0, 0);
        n6 O2 = r6.O(i12);
        imageView.setBackground(N);
        r6.k(imageView, N, null, O2, g6Var);
        r6.t(imageView, k6.f21189de, g6Var, PorterDuff.Mode.MULTIPLY);
        imageView.setOnClickListener(new ai.v0(this, snVar, g6Var, 10));
        addView(imageView, z5.d(32, 32.0f, 21, 8.0f, 0.0f, 6.0f, 0.0f));
    }

    public final void a() {
        float f7 = this.f12906y;
        nq nqVar = this.h;
        float c10 = nqVar.getDrawable().c() + f7 + nqVar.getPaddingLeft() + nqVar.getPaddingRight() + AndroidUtilities.dp(12.0f);
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
