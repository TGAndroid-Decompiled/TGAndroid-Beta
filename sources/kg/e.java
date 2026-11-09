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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.o6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.w8;
import org.telegram.ui.Components.xq;
import org.telegram.ui.cn;
public final class e extends FrameLayout {
    public float D;
    public final int f17344a;
    public final w8 f17345b;
    public final l9 f17346c;
    public final LinearLayout d;
    public final j6 f17347e;
    public final j6 f17348f;
    public final mp h;
    public final ImageView f17349n;
    public boolean f17350r;
    public long f17351s;
    public long f17352w;
    public int f17353x;
    public String f17354y;

    public e(Activity activity, g6 g6Var, cn cnVar) {
        super(activity);
        int i7;
        this.f17344a = cnVar.getCurrentAccount();
        this.f17350r = false;
        l9 l9Var = new l9(activity);
        this.f17346c = l9Var;
        TLRPC.User a22 = cnVar.getMessagesController().a2(Long.valueOf(this.f17352w));
        w8 w8Var = new w8((g6) null);
        this.f17345b = w8Var;
        w8Var.r(a22);
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(16.0f));
        l9Var.e(a22, w8Var);
        addView(l9Var, ha.d(32, 32.0f, 19, 10.0f, 0.0f, 10.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        j6 j6Var = new j6(activity, false, false, false);
        this.f17347e = j6Var;
        j6Var.f34937n = false;
        j6Var.getDrawable().r(true, false);
        j6Var.setTypeface(org.telegram.messenger.g0.o());
        j6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        j6Var.setText(t10.p(a22));
        s6.Y(j6Var, l6.G6, g6Var);
        j6Var.setEllipsizeByGradient(true);
        linearLayout.addView(j6Var, ha.k(0.0f, 0.0f, 0.0f, 1.0f, -1, 17));
        j6 j6Var2 = new j6(activity, false, false, false);
        this.f17348f = j6Var2;
        j6Var2.f34937n = false;
        j6Var2.getDrawable().r(true, false);
        j6Var2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        j6Var2.setText(id.M0(2131753700, null));
        s6.Y(j6Var2, l6.Ue, g6Var);
        j6Var2.setEllipsizeByGradient(true);
        linearLayout.addView(j6Var2, ha.o(-1, 17));
        addView(linearLayout, ha.d(-2, -2.0f, 16, 52.0f, 0.0f, 49.0f, 0.0f));
        mp mpVar = new mp(activity);
        this.h = mpVar;
        mpVar.getDrawable().r(true, true);
        mpVar.b(0.75f, 350L, xq.h);
        mpVar.setScaleProperty(0.6f);
        mpVar.setTypeface(org.telegram.messenger.g0.o());
        int L = org.telegram.messenger.g0.L(14.0f);
        int i10 = l6.Ci;
        int w02 = l6.w0(i10, g6Var);
        int w10 = l6.w(l6.w0(i10, g6Var), l6.r1(0.12f, -1));
        org.telegram.ui.Cells.y k02 = l6.k0(L, L, L, L, w02, w10, w10);
        o6 M = s6.M(i10);
        mpVar.setBackground(k02);
        s6.j(mpVar, k02, M, null, g6Var);
        mpVar.setTextSize(org.telegram.messenger.g0.L(14.0f));
        mpVar.setGravity(5);
        s6.Y(mpVar, l6.Gi, g6Var);
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
        int i11 = l6.f27957i6;
        org.telegram.ui.Cells.y O = l6.O(l6.w0(i11, g6Var), 0, 0);
        o6 M2 = s6.M(i11);
        imageView.setBackground(O);
        s6.j(imageView, O, null, M2, g6Var);
        s6.s(imageView, l6.Re, g6Var, PorterDuff.Mode.MULTIPLY);
        imageView.setOnClickListener(new ah.g(this, cnVar, g6Var, 11));
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
