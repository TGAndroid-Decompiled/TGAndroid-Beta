package gh;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;
public final class g0 extends org.telegram.ui.Components.sa {
    public d0 T;
    public final LinearLayout U;

    public g0(Context context) {
        super(context, null, false, false, false, 1, null);
        this.v = 0.1f;
        fixNavigationBar();
        wk0 wk0Var = this.d;
        int i9 = this.backgroundPaddingLeft;
        wk0Var.setPadding(i9, 0, i9, 0);
        LinearLayout linearLayout = new LinearLayout(context);
        this.U = linearLayout;
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        n9 n9Var = new n9(context, 70, 0);
        frameLayout.addView(n9Var, g7.e6.c(-1.0f, -1));
        ag.j jVar = new ag.j(context, 1, 2);
        ag.a aVar = jVar.f205b;
        aVar.f181w = org.telegram.ui.ActionBar.f6.fk;
        aVar.f182x = org.telegram.ui.ActionBar.f6.gk;
        aVar.b();
        jVar.setStarParticlesView(n9Var);
        frameLayout.addView(jVar, g7.e6.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        jVar.setPaused(false);
        linearLayout.addView(frameLayout, g7.e6.c(150.0f, -1));
        TextView textView = new TextView(context);
        j3.r0.u(20.0f, 1, textView);
        int i10 = org.telegram.ui.ActionBar.f6.f23108j5;
        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(i10, this.resourcesProvider));
        textView.setGravity(17);
        textView.setText(LocaleController.getString(R.string.ExplainStarsTitle));
        TextView h = j3.r0.h(linearLayout, textView, g7.e6.t(-2, -2, 1, 0, 2, 0, 0), context);
        h.setTextSize(1, 14.0f);
        h.setTextColor(org.telegram.ui.ActionBar.f6.v0(i10, this.resourcesProvider));
        h.setGravity(17);
        h.setText(LocaleController.getString(R.string.ExplainStarsTitle2));
        linearLayout.addView(h, g7.e6.t(-1, -2, 1, 16, 9, 16, 18));
        FrameLayout frameLayout2 = new FrameLayout(context);
        kh.d dVar = new kh.d(context, this.resourcesProvider, true);
        dVar.g(LocaleController.getString(R.string.ExplainStarsButton), false, true);
        dVar.setOnClickListener(new androidx.mediarouter.app.c(this, 8));
        frameLayout2.addView(dVar, g7.e6.d(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        int i11 = this.backgroundPaddingLeft;
        frameLayout2.setPadding(i11, 0, i11, 0);
        frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23072h5, false));
        this.containerView.addView(frameLayout2, g7.e6.e(-1, -2, 87));
        this.T.N(false);
    }

    @Override
    public final vk0 v(wk0 wk0Var) {
        ?? z41Var = new z41(wk0Var, getContext(), this.currentAccount, 0, true, new bh.c(this, 14), this.resourcesProvider);
        this.T = z41Var;
        return z41Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.ExplainStarsTitle);
    }
}
