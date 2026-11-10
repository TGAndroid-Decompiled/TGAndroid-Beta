package kg;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import c8.ha;
import org.telegram.messenger.id;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.v8;
import org.telegram.ui.Components.wq;
import org.telegram.ui.cn;
public final class e extends FrameLayout {
    public float D;
    public final int f17344a;
    public final v8 f17345b;
    public final k9 f17346c;
    public final LinearLayout d;
    public final i6 f17347e;
    public final i6 f17348f;
    public final mp h;
    public final ImageView f17349n;
    public boolean f17350r;
    public long f17351s;
    public long f17352w;
    public int f17353x;
    public String f17354y;

    public e(Activity activity, h6 h6Var, cn cnVar) {
        super(activity);
        int i7;
        this.f17344a = cnVar.getCurrentAccount();
        this.f17350r = false;
        k9 k9Var = new k9(activity);
        this.f17346c = k9Var;
        TLRPC.User a22 = cnVar.getMessagesController().a2(Long.valueOf(this.f17352w));
        v8 v8Var = new v8((h6) null);
        this.f17345b = v8Var;
        v8Var.r(a22);
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(16.0f));
        k9Var.e(a22, v8Var);
        addView(k9Var, ha.d(32, 32.0f, 19, 10.0f, 0.0f, 10.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        i6 i6Var = new i6(activity, false, false, false);
        this.f17347e = i6Var;
        i6Var.f34546n = false;
        i6Var.getDrawable().r(true, false);
        i6Var.setTypeface(org.telegram.messenger.g0.o());
        i6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        i6Var.setText(t10.p(a22));
        t6.Y(i6Var, m6.G6, h6Var);
        i6Var.setEllipsizeByGradient(true);
        linearLayout.addView(i6Var, ha.k(0.0f, 0.0f, 0.0f, 1.0f, -1, 17));
        i6 i6Var2 = new i6(activity, false, false, false);
        this.f17348f = i6Var2;
        i6Var2.f34546n = false;
        i6Var2.getDrawable().r(true, false);
        i6Var2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        i6Var2.setText(id.M0(2131753700, null));
        t6.Y(i6Var2, m6.Ue, h6Var);
        i6Var2.setEllipsizeByGradient(true);
        linearLayout.addView(i6Var2, ha.o(-1, 17));
        addView(linearLayout, ha.d(-2, -2.0f, 16, 52.0f, 0.0f, 49.0f, 0.0f));
        mp mpVar = new mp(activity);
        this.h = mpVar;
        mpVar.getDrawable().r(true, true);
        mpVar.b(0.75f, 350L, wq.h);
        mpVar.setScaleProperty(0.6f);
        mpVar.setTypeface(org.telegram.messenger.g0.o());
        int L = org.telegram.messenger.g0.L(14.0f);
        int i10 = m6.Ci;
        int w02 = m6.w0(i10, h6Var);
        int w10 = m6.w(m6.w0(i10, h6Var), m6.r1(0.12f, -1));
        org.telegram.ui.Cells.y k02 = m6.k0(L, L, L, L, w02, w10, w10);
        p6 M = t6.M(i10);
        mpVar.setBackground(k02);
        t6.j(mpVar, k02, M, null, h6Var);
        mpVar.setTextSize(org.telegram.messenger.g0.L(14.0f));
        mpVar.setGravity(5);
        t6.Y(mpVar, m6.Gi, h6Var);
        mpVar.setPadding(org.telegram.messenger.g0.L(13.0f), 0, org.telegram.messenger.g0.L(13.0f), 0);
        mpVar.setOnClickListener(new ii.g(this, 7));
        mpVar.setOnWidthUpdatedListener(new d(this, 0));
        if (this.f17350r) {
            i7 = 2131753701;
        } else {
            i7 = 2131753698;
        }
        mpVar.setText(id.M0(i7, null));
        addView(mpVar, ha.d(64, 28.0f, 21, 0.0f, 0.0f, 46.0f, 0.0f));
        ImageView imageView = new ImageView(activity);
        this.f17349n = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232237);
        int i11 = m6.f27982i6;
        org.telegram.ui.Cells.y O = m6.O(m6.w0(i11, h6Var), 0, 0);
        p6 M2 = t6.M(i11);
        imageView.setBackground(O);
        t6.j(imageView, O, null, M2, h6Var);
        t6.s(imageView, m6.Re, h6Var, PorterDuff.Mode.MULTIPLY);
        imageView.setOnClickListener(new ah.g(this, cnVar, h6Var, 11));
        addView(imageView, ha.d(32, 32.0f, 21, 8.0f, 0.0f, 6.0f, 0.0f));
    }

    public final void a() {
        float f10 = this.D;
        mp mpVar = this.h;
        float c10 = mpVar.getDrawable().c() + f10 + mpVar.getPaddingLeft() + mpVar.getPaddingRight() + org.telegram.messenger.g0.L(12.0f);
        this.f17347e.setRightPadding(c10);
        this.f17348f.setRightPadding(c10);
    }

    public void setLeftMargin(float f10) {
        this.D = f10;
        this.f17346c.setTranslationX(f10);
        this.d.setTranslationX(f10);
        a();
    }
}
