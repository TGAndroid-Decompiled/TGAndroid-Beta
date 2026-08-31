package mh;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.x51;
import org.telegram.ui.yh;
public final class e0 extends org.telegram.ui.Components.sa {
    public b0 U;
    public final LinearLayout V;

    public e0(Context context) {
        super(context, null, false, false, false, 1, null);
        this.v = 0.1f;
        fixNavigationBar();
        tl0 tl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        tl0Var.setPadding(i10, 0, i10, 0);
        LinearLayout linearLayout = new LinearLayout(context);
        this.V = linearLayout;
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        j9 j9Var = new j9(context, 70, 0);
        frameLayout.addView(j9Var, k7.c6.c(-1.0f, -1));
        gg.i iVar = new gg.i(context, 1, 2);
        gg.a aVar = iVar.f7087b;
        aVar.f7065w = org.telegram.ui.ActionBar.k6.fk;
        aVar.f7066x = org.telegram.ui.ActionBar.k6.gk;
        aVar.b();
        iVar.setStarParticlesView(j9Var);
        frameLayout.addView(iVar, k7.c6.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        iVar.setPaused(false);
        linearLayout.addView(frameLayout, k7.c6.c(150.0f, -1));
        TextView textView = new TextView(context);
        yh.p(20.0f, 1, textView);
        int i11 = org.telegram.ui.ActionBar.k6.f21766j5;
        textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(i11, this.resourcesProvider));
        textView.setGravity(17);
        textView.setText(LocaleController.getString(R.string.ExplainStarsTitle));
        TextView i12 = yh.i(linearLayout, textView, k7.c6.t(-2, -2, 1, 0, 2, 0, 0), context);
        i12.setTextSize(1, 14.0f);
        i12.setTextColor(org.telegram.ui.ActionBar.k6.v0(i11, this.resourcesProvider));
        i12.setGravity(17);
        i12.setText(LocaleController.getString(R.string.ExplainStarsTitle2));
        linearLayout.addView(i12, k7.c6.t(-1, -2, 1, 16, 9, 16, 18));
        FrameLayout frameLayout2 = new FrameLayout(context);
        qh.d dVar = new qh.d(context, this.resourcesProvider, true);
        dVar.g(LocaleController.getString(R.string.ExplainStarsButton), false, true);
        dVar.setOnClickListener(new androidx.mediarouter.app.c(this, 14));
        frameLayout2.addView(dVar, k7.c6.d(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        int i13 = this.backgroundPaddingLeft;
        frameLayout2.setPadding(i13, 0, i13, 0);
        frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21731h5, false));
        this.containerView.addView(frameLayout2, k7.c6.e(-1, -2, 87));
        this.U.N(false);
    }

    @Override
    public final sl0 v(tl0 tl0Var) {
        ?? x51Var = new x51(tl0Var, getContext(), this.currentAccount, 0, true, new eg.p1(this, 15), this.resourcesProvider);
        this.U = x51Var;
        return x51Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.ExplainStarsTitle);
    }
}
