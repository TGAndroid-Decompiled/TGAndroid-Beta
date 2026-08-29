package jh;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.th;
public final class f0 extends org.telegram.ui.Components.xa {
    public c0 T;
    public final LinearLayout U;

    public f0(Context context) {
        super(context, null, false, false, false, 1, null);
        this.v = 0.1f;
        fixNavigationBar();
        jl0 jl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        jl0Var.setPadding(i10, 0, i10, 0);
        LinearLayout linearLayout = new LinearLayout(context);
        this.U = linearLayout;
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        i9 i9Var = new i9(context, 70, 0);
        frameLayout.addView(i9Var, i7.f6.c(-1.0f, -1));
        dg.i iVar = new dg.i(context, 1, 2);
        dg.a aVar = iVar.f5590b;
        aVar.f5568w = org.telegram.ui.ActionBar.g6.fk;
        aVar.f5569x = org.telegram.ui.ActionBar.g6.gk;
        aVar.b();
        iVar.setStarParticlesView(i9Var);
        frameLayout.addView(iVar, i7.f6.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        iVar.setPaused(false);
        linearLayout.addView(frameLayout, i7.f6.c(150.0f, -1));
        TextView textView = new TextView(context);
        th.n(20.0f, 1, textView);
        int i11 = org.telegram.ui.ActionBar.g6.f23169j5;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, this.resourcesProvider));
        textView.setGravity(17);
        textView.setText(LocaleController.getString(R.string.ExplainStarsTitle));
        TextView i12 = th.i(linearLayout, textView, i7.f6.t(-2, -2, 1, 0, 2, 0, 0), context);
        i12.setTextSize(1, 14.0f);
        i12.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, this.resourcesProvider));
        i12.setGravity(17);
        i12.setText(LocaleController.getString(R.string.ExplainStarsTitle2));
        linearLayout.addView(i12, i7.f6.t(-1, -2, 1, 16, 9, 16, 18));
        FrameLayout frameLayout2 = new FrameLayout(context);
        nh.d dVar = new nh.d(context, this.resourcesProvider, true);
        dVar.g(LocaleController.getString(R.string.ExplainStarsButton), false, true);
        dVar.setOnClickListener(new ag.o(this, 14));
        frameLayout2.addView(dVar, i7.f6.d(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        int i13 = this.backgroundPaddingLeft;
        frameLayout2.setPadding(i13, 0, i13, 0);
        frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23133h5, false));
        this.containerView.addView(frameLayout2, i7.f6.e(-1, -2, 87));
        this.T.N(false);
    }

    @Override
    public final il0 v(jl0 jl0Var) {
        ?? k51Var = new k51(jl0Var, getContext(), this.currentAccount, 0, true, new bg.t1(this, 15), this.resourcesProvider);
        this.T = k51Var;
        return k51Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.ExplainStarsTitle);
    }
}
