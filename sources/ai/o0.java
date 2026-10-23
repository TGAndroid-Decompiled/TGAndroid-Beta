package ai;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.u61;
public final class o0 extends org.telegram.ui.Components.bb {
    public l0 X;
    public final LinearLayout Y;

    public o0(Context context) {
        super(context, null, false, false, null);
        this.v = 0.1f;
        fixNavigationBar();
        jm0 jm0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        jm0Var.setPadding(i10, 0, i10, 0);
        LinearLayout linearLayout = new LinearLayout(context);
        this.Y = linearLayout;
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        kc kcVar = new kc(context, 70, 0);
        frameLayout.addView(kcVar, w7.z5.c(-1.0f, -1));
        tg.n nVar = new tg.n(context, 1, 2);
        tg.g gVar = nVar.f47112b;
        gVar.f47096z = org.telegram.ui.ActionBar.h6.fk;
        gVar.A = org.telegram.ui.ActionBar.h6.gk;
        gVar.b();
        nVar.setStarParticlesView(kcVar);
        frameLayout.addView(nVar, w7.z5.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        nVar.setPaused(false);
        linearLayout.addView(frameLayout, w7.z5.c(150.0f, -1));
        TextView textView = new TextView(context);
        com.google.android.gms.internal.play_billing.k3.m(20.0f, 1, textView);
        int i11 = org.telegram.ui.ActionBar.h6.f21100j5;
        org.telegram.ui.Cells.c1.q(i11, this.resourcesProvider, textView, 17);
        textView.setText(LocaleController.getString(R.string.ExplainStarsTitle));
        TextView i12 = com.google.android.gms.internal.play_billing.k3.i(linearLayout, textView, w7.z5.t(-2, -2, 1, 0, 2, 0, 0), context);
        i12.setTextSize(1, 14.0f);
        org.telegram.ui.Cells.c1.q(i11, this.resourcesProvider, i12, 17);
        i12.setText(LocaleController.getString(R.string.ExplainStarsTitle2));
        linearLayout.addView(i12, w7.z5.t(-1, -2, 1, 16, 9, 16, 18));
        FrameLayout frameLayout2 = new FrameLayout(context);
        ei.d dVar = new ei.d(context, this.resourcesProvider, true);
        dVar.g(LocaleController.getString(R.string.ExplainStarsButton), false, true);
        dVar.setOnClickListener(new ah.g0(this, 1));
        frameLayout2.addView(dVar, w7.z5.d(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        int i13 = this.backgroundPaddingLeft;
        frameLayout2.setPadding(i13, 0, i13, 0);
        frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21065h5, false));
        this.containerView.addView(frameLayout2, w7.z5.e(-1, -2, 87));
        this.X.N(false);
    }

    @Override
    public final CharSequence A() {
        return LocaleController.getString(R.string.ExplainStarsTitle);
    }

    @Override
    public final im0 x(jm0 jm0Var) {
        ?? u61Var = new u61(jm0Var, getContext(), this.currentAccount, 0, true, new q(this, 1), this.resourcesProvider);
        this.X = u61Var;
        return u61Var;
    }
}
