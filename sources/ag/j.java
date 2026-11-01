package ag;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.dd;
import org.telegram.messenger.i20;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.w6;
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.r8;
import org.telegram.ui.Components.tp;
import org.telegram.ui.un;
import w7.b6;
public final class j extends FrameLayout {
    public float D;
    public final int f570a;
    public final r8 f571b;
    public final g9 f572c;
    public final LinearLayout d;
    public final f6 e;
    public final f6 f573f;
    public final tp h;
    public final ImageView f574n;
    public boolean f575r;
    public long f576s;
    public long f577w;
    public int f578x;
    public String f579y;

    public j(Activity activity, p6 p6Var, un unVar) {
        super(activity);
        int i10;
        this.f570a = unVar.getCurrentAccount();
        this.f575r = false;
        g9 g9Var = new g9(activity);
        this.f572c = g9Var;
        TLRPC.User Z1 = unVar.getMessagesController().Z1(Long.valueOf(this.f577w));
        r8 r8Var = new r8((p6) null);
        this.f571b = r8Var;
        r8Var.r(Z1);
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(16.0f));
        g9Var.e(Z1, r8Var);
        addView(g9Var, b6.d(32, 32.0f, 19, 10.0f, 0.0f, 10.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        f6 f6Var = new f6(activity, false, false, false);
        this.e = f6Var;
        f6Var.f26084n = false;
        f6Var.getDrawable().r(true, false);
        f6Var.setTypeface(org.telegram.messenger.i0.o());
        f6Var.setTextSize(org.telegram.messenger.i0.L(14.0f));
        f6Var.setText(i20.p(Z1));
        a7.Z(f6Var, t6.G6, p6Var);
        f6Var.setEllipsizeByGradient(true);
        linearLayout.addView(f6Var, b6.k(0.0f, 0.0f, 0.0f, 1.0f, -1, 17));
        f6 f6Var2 = new f6(activity, false, false, false);
        this.f573f = f6Var2;
        f6Var2.f26084n = false;
        f6Var2.getDrawable().r(true, false);
        f6Var2.setTextSize(org.telegram.messenger.i0.L(13.0f));
        f6Var2.setText(dd.L0(2131753700, null));
        a7.Z(f6Var2, t6.Ue, p6Var);
        f6Var2.setEllipsizeByGradient(true);
        linearLayout.addView(f6Var2, b6.o(-1, 17));
        addView(linearLayout, b6.d(-2, -2.0f, 16, 52.0f, 0.0f, 49.0f, 0.0f));
        tp tpVar = new tp(activity);
        this.h = tpVar;
        tpVar.getDrawable().r(true, true);
        tpVar.b(0.75f, 350L, gr.h);
        tpVar.setScaleProperty(0.6f);
        tpVar.setTypeface(org.telegram.messenger.i0.o());
        int L = org.telegram.messenger.i0.L(14.0f);
        int i11 = t6.Ci;
        int w02 = t6.w0(i11, p6Var);
        int w9 = t6.w(t6.w0(i11, p6Var), t6.r1(0.12f, -1));
        org.telegram.ui.Cells.y k02 = t6.k0(L, L, L, L, w02, w9, w9);
        w6 N = a7.N(i11);
        tpVar.setBackground(k02);
        a7.k(tpVar, k02, N, null, p6Var);
        tpVar.setTextSize(org.telegram.messenger.i0.L(14.0f));
        tpVar.setGravity(5);
        a7.Z(tpVar, t6.Gi, p6Var);
        tpVar.setPadding(org.telegram.messenger.i0.L(13.0f), 0, org.telegram.messenger.i0.L(13.0f), 0);
        tpVar.setOnClickListener(new g(this, 0));
        tpVar.setOnWidthUpdatedListener(new h(this, 0));
        if (this.f575r) {
            i10 = 2131753701;
        } else {
            i10 = 2131753698;
        }
        tpVar.setText(dd.L0(i10, null));
        addView(tpVar, b6.d(64, 28.0f, 21, 0.0f, 0.0f, 46.0f, 0.0f));
        ImageView imageView = new ImageView(activity);
        this.f574n = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232236);
        int i12 = t6.f21021i6;
        org.telegram.ui.Cells.y O = t6.O(t6.w0(i12, p6Var), 0, 0);
        w6 N2 = a7.N(i12);
        imageView.setBackground(O);
        a7.k(imageView, O, null, N2, p6Var);
        a7.t(imageView, t6.Re, p6Var, PorterDuff.Mode.MULTIPLY);
        imageView.setOnClickListener(new i(this, unVar, p6Var, 0));
        addView(imageView, b6.d(32, 32.0f, 21, 8.0f, 0.0f, 6.0f, 0.0f));
    }

    public final void a() {
        float f7 = this.D;
        tp tpVar = this.h;
        float c10 = tpVar.getDrawable().c() + f7 + tpVar.getPaddingLeft() + tpVar.getPaddingRight() + org.telegram.messenger.i0.L(12.0f);
        this.e.setRightPadding(c10);
        this.f573f.setRightPadding(c10);
    }

    public void setLeftMargin(float f7) {
        this.D = f7;
        this.f572c.setTranslationX(f7);
        this.d.setTranslationX(f7);
        a();
    }
}
