package kg;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import c8.ja;
import hi.p5;
import org.telegram.messenger.hd;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.t8;
import org.telegram.ui.Components.up;
import org.telegram.ui.an;
public final class e extends FrameLayout {
    public float E;
    public final int f17903a;
    public final t8 f17904b;
    public final i9 f17905c;
    public final LinearLayout d;
    public final h6 f17906e;
    public final h6 f17907f;
    public final up h;
    public final ImageView f17908n;
    public boolean f17909r;
    public long f17910s;
    public long f17911w;
    public int f17912x;
    public String f17913y;

    public e(Activity activity, e6 e6Var, an anVar) {
        super(activity);
        int i7;
        this.f17903a = anVar.getCurrentAccount();
        this.f17909r = false;
        i9 i9Var = new i9(activity);
        this.f17905c = i9Var;
        TLRPC.User a22 = anVar.getMessagesController().a2(Long.valueOf(this.f17911w));
        t8 t8Var = new t8((e6) null);
        this.f17904b = t8Var;
        t8Var.r(a22);
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(16.0f));
        i9Var.f(a22, t8Var);
        addView(i9Var, ja.d(32, 32.0f, 19, 10.0f, 0.0f, 10.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        h6 h6Var = new h6(activity, false, false, false);
        this.f17906e = h6Var;
        h6Var.f35178n = false;
        h6Var.getDrawable().r(true, false);
        h6Var.setTypeface(org.telegram.messenger.g0.o());
        h6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        h6Var.setText(q10.p(a22));
        q6.Y(h6Var, j6.G6, e6Var);
        h6Var.setEllipsizeByGradient(true);
        linearLayout.addView(h6Var, ja.k(0.0f, 0.0f, 0.0f, 1.0f, -1, 17));
        h6 h6Var2 = new h6(activity, false, false, false);
        this.f17907f = h6Var2;
        h6Var2.f35178n = false;
        h6Var2.getDrawable().r(true, false);
        h6Var2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        h6Var2.setText(hd.M0(2131753700, null));
        q6.Y(h6Var2, j6.Xe, e6Var);
        h6Var2.setEllipsizeByGradient(true);
        linearLayout.addView(h6Var2, ja.o(-1, 17));
        addView(linearLayout, ja.d(-2, -2.0f, 16, 52.0f, 0.0f, 49.0f, 0.0f));
        up upVar = new up(activity);
        this.h = upVar;
        upVar.getDrawable().r(true, true);
        upVar.b(0.75f, 350L, er.h);
        upVar.setScaleProperty(0.6f);
        upVar.setTypeface(org.telegram.messenger.g0.o());
        int L = org.telegram.messenger.g0.L(14.0f);
        int i10 = j6.Fi;
        int w02 = j6.w0(i10, e6Var);
        int w10 = j6.w(j6.w0(i10, e6Var), j6.r1(0.12f, -1));
        org.telegram.ui.Cells.y k02 = j6.k0(L, L, L, L, w02, w10, w10);
        m6 M = q6.M(i10);
        upVar.setBackground(k02);
        q6.j(upVar, k02, M, null, e6Var);
        upVar.setTextSize(org.telegram.messenger.g0.L(14.0f));
        upVar.setGravity(5);
        q6.Y(upVar, j6.Ji, e6Var);
        upVar.setPadding(org.telegram.messenger.g0.L(13.0f), 0, org.telegram.messenger.g0.L(13.0f), 0);
        upVar.setOnClickListener(new p5(this, 6));
        upVar.setOnWidthUpdatedListener(new d(this, 0));
        if (this.f17909r) {
            i7 = 2131753701;
        } else {
            i7 = 2131753698;
        }
        upVar.setText(hd.M0(i7, null));
        addView(upVar, ja.d(64, 28.0f, 21, 0.0f, 0.0f, 46.0f, 0.0f));
        ImageView imageView = new ImageView(activity);
        this.f17908n = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232238);
        int i11 = j6.f28941i6;
        org.telegram.ui.Cells.y O = j6.O(j6.w0(i11, e6Var), 0, 0);
        m6 M2 = q6.M(i11);
        imageView.setBackground(O);
        q6.j(imageView, O, null, M2, e6Var);
        q6.s(imageView, j6.Ue, e6Var, PorterDuff.Mode.MULTIPLY);
        imageView.setOnClickListener(new ah.g(this, anVar, e6Var, 16));
        addView(imageView, ja.d(32, 32.0f, 21, 8.0f, 0.0f, 6.0f, 0.0f));
    }

    public final void a() {
        float f10 = this.E;
        up upVar = this.h;
        float c10 = upVar.getDrawable().c() + f10 + upVar.getPaddingLeft() + upVar.getPaddingRight() + org.telegram.messenger.g0.L(12.0f);
        this.f17906e.setRightPadding(c10);
        this.f17907f.setRightPadding(c10);
    }

    public void setLeftMargin(float f10) {
        this.E = f10;
        this.f17905c.setTranslationX(f10);
        this.d.setTranslationX(f10);
        a();
    }
}
