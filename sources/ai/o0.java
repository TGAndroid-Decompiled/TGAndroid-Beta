package ai;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.tl;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.km0;
import org.telegram.ui.Components.lm0;
public final class o0 extends org.telegram.ui.Components.za {
    public l0 X;
    public final LinearLayout Y;

    public o0(Context context) {
        super(context, null, false, false, null);
        this.v = 0.1f;
        fixNavigationBar();
        lm0 lm0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        lm0Var.setPadding(i10, 0, i10, 0);
        LinearLayout linearLayout = new LinearLayout(context);
        this.Y = linearLayout;
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        lc lcVar = new lc(context, 70, 0);
        frameLayout.addView(lcVar, w7.z5.c(-1.0f, -1));
        tg.n nVar = new tg.n(context, 1, 2);
        tg.g gVar = nVar.f47546b;
        gVar.f47530z = org.telegram.ui.ActionBar.k6.fk;
        gVar.A = org.telegram.ui.ActionBar.k6.gk;
        gVar.b();
        nVar.setStarParticlesView(lcVar);
        frameLayout.addView(nVar, w7.z5.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        nVar.setPaused(false);
        linearLayout.addView(frameLayout, w7.z5.c(150.0f, -1));
        TextView textView = new TextView(context);
        com.google.android.gms.internal.play_billing.k3.m(20.0f, 1, textView);
        int i11 = org.telegram.ui.ActionBar.k6.f21290j5;
        org.telegram.ui.ActionBar.r6.W(textView, i11, this.resourcesProvider);
        textView.setGravity(17);
        textView.setText(LocaleController.getString(R.string.ExplainStarsTitle));
        TextView f7 = tl.f(linearLayout, textView, w7.z5.t(-2, -2, 1, 0, 2, 0, 0), context);
        f7.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.W(f7, i11, this.resourcesProvider);
        f7.setGravity(17);
        f7.setText(LocaleController.getString(R.string.ExplainStarsTitle2));
        linearLayout.addView(f7, w7.z5.t(-1, -2, 1, 16, 9, 16, 18));
        FrameLayout frameLayout2 = new FrameLayout(context);
        ei.d dVar = new ei.d(context, this.resourcesProvider, true);
        dVar.i(LocaleController.getString(R.string.ExplainStarsButton), false, true);
        dVar.setOnClickListener(new ah.g0(this, 1));
        frameLayout2.addView(dVar, w7.z5.d(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        int i12 = this.backgroundPaddingLeft;
        frameLayout2.setPadding(i12, 0, i12, 0);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21255h5, frameLayout2, null);
        this.containerView.addView(frameLayout2, w7.z5.e(-1, -2, 87));
        this.X.N(false);
    }

    @Override
    public final km0 w(lm0 lm0Var) {
        ?? a71Var = new a71(lm0Var, getContext(), this.currentAccount, 0, true, new q(this, 1), this.resourcesProvider);
        this.X = a71Var;
        return a71Var;
    }

    @Override
    public final CharSequence z() {
        return LocaleController.getString(R.string.ExplainStarsTitle);
    }
}
