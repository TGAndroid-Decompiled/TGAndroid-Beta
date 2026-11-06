package kg;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import c8.ha;
import org.telegram.messenger.hd;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.w8;
import org.telegram.ui.Components.xq;
import org.telegram.ui.an;
public final class e extends FrameLayout {
    public float D;
    public final int f17341a;
    public final w8 f17342b;
    public final l9 f17343c;
    public final LinearLayout d;
    public final j6 f17344e;
    public final j6 f17345f;
    public final mp h;
    public final ImageView f17346n;
    public boolean f17347r;
    public long f17348s;
    public long f17349w;
    public int f17350x;
    public String f17351y;

    public e(Activity activity, f6 f6Var, an anVar) {
        super(activity);
        int i7;
        this.f17341a = anVar.getCurrentAccount();
        this.f17347r = false;
        l9 l9Var = new l9(activity);
        this.f17343c = l9Var;
        TLRPC.User a22 = anVar.getMessagesController().a2(Long.valueOf(this.f17349w));
        w8 w8Var = new w8((f6) null);
        this.f17342b = w8Var;
        w8Var.r(a22);
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(16.0f));
        l9Var.e(a22, w8Var);
        addView(l9Var, ha.d(32, 32.0f, 19, 10.0f, 0.0f, 10.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        j6 j6Var = new j6(activity, false, false, false);
        this.f17344e = j6Var;
        j6Var.f34893n = false;
        j6Var.getDrawable().r(true, false);
        j6Var.setTypeface(org.telegram.messenger.g0.o());
        j6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        j6Var.setText(t10.p(a22));
        r6.Z(j6Var, k6.G6, f6Var);
        j6Var.setEllipsizeByGradient(true);
        linearLayout.addView(j6Var, ha.k(0.0f, 0.0f, 0.0f, 1.0f, -1, 17));
        j6 j6Var2 = new j6(activity, false, false, false);
        this.f17345f = j6Var2;
        j6Var2.f34893n = false;
        j6Var2.getDrawable().r(true, false);
        j6Var2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        j6Var2.setText(hd.M0(2131753700, null));
        r6.Z(j6Var2, k6.Ue, f6Var);
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
        int i10 = k6.Ci;
        int w02 = k6.w0(i10, f6Var);
        int w10 = k6.w(k6.w0(i10, f6Var), k6.r1(0.12f, -1));
        org.telegram.ui.Cells.y k02 = k6.k0(L, L, L, L, w02, w10, w10);
        n6 N = r6.N(i10);
        mpVar.setBackground(k02);
        r6.k(mpVar, k02, N, null, f6Var);
        mpVar.setTextSize(org.telegram.messenger.g0.L(14.0f));
        mpVar.setGravity(5);
        r6.Z(mpVar, k6.Gi, f6Var);
        mpVar.setPadding(org.telegram.messenger.g0.L(13.0f), 0, org.telegram.messenger.g0.L(13.0f), 0);
        mpVar.setOnClickListener(new ii.g(this, 7));
        mpVar.setOnWidthUpdatedListener(new d(this, 0));
        if (this.f17347r) {
            i7 = 2131753701;
        } else {
            i7 = 2131753698;
        }
        mpVar.setText(hd.M0(i7, null));
        addView(mpVar, ha.d(64, 28.0f, 21, 0.0f, 0.0f, 46.0f, 0.0f));
        ImageView imageView = new ImageView(activity);
        this.f17346n = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232237);
        int i11 = k6.f27940i6;
        org.telegram.ui.Cells.y O = k6.O(k6.w0(i11, f6Var), 0, 0);
        n6 N2 = r6.N(i11);
        imageView.setBackground(O);
        r6.k(imageView, O, null, N2, f6Var);
        r6.t(imageView, k6.Re, f6Var, PorterDuff.Mode.MULTIPLY);
        imageView.setOnClickListener(new ah.g(this, anVar, f6Var, 11));
        addView(imageView, ha.d(32, 32.0f, 21, 8.0f, 0.0f, 6.0f, 0.0f));
    }

    public final void a() {
        float f10 = this.D;
        mp mpVar = this.h;
        float c10 = mpVar.getDrawable().c() + f10 + mpVar.getPaddingLeft() + mpVar.getPaddingRight() + org.telegram.messenger.g0.L(12.0f);
        this.f17344e.setRightPadding(c10);
        this.f17345f.setRightPadding(c10);
    }

    public void setLeftMargin(float f10) {
        this.D = f10;
        this.f17343c.setTranslationX(f10);
        this.d.setTranslationX(f10);
        a();
    }
}
