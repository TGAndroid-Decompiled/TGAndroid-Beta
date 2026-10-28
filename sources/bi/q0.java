package bi;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.wh;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.nm0;
public final class q0 extends org.telegram.ui.Components.bb {
    public n0 X;
    public final LinearLayout Y;

    public q0(Context context) {
        super(context, null, false, false, null);
        this.v = 0.1f;
        fixNavigationBar();
        nm0 nm0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        nm0Var.setPadding(i10, 0, i10, 0);
        LinearLayout linearLayout = new LinearLayout(context);
        this.Y = linearLayout;
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        ec ecVar = new ec(context, 70, 0);
        frameLayout.addView(ecVar, kb1.g(-1.0f, -1));
        ug.n nVar = new ug.n(context, 1, 2);
        ug.g gVar = nVar.f49851b;
        gVar.f49835z = org.telegram.ui.ActionBar.y6.fk;
        gVar.A = org.telegram.ui.ActionBar.y6.gk;
        gVar.b();
        nVar.setStarParticlesView(ecVar);
        frameLayout.addView(nVar, kb1.h(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        nVar.setPaused(false);
        linearLayout.addView(frameLayout, kb1.g(150.0f, -1));
        TextView textView = new TextView(context);
        ic.a.o(20.0f, 1, textView);
        int i11 = org.telegram.ui.ActionBar.y6.f23465j5;
        org.telegram.ui.ActionBar.f7.V(textView, i11, this.resourcesProvider);
        textView.setGravity(17);
        textView.setText(LocaleController.getString(R.string.ExplainStarsTitle));
        TextView e = wh.e(linearLayout, textView, kb1.x(-2, -2, 1, 0, 2, 0, 0), context);
        e.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.f7.V(e, i11, this.resourcesProvider);
        e.setGravity(17);
        e.setText(LocaleController.getString(R.string.ExplainStarsTitle2));
        linearLayout.addView(e, kb1.x(-1, -2, 1, 16, 9, 16, 18));
        FrameLayout frameLayout2 = new FrameLayout(context);
        fi.d dVar = new fi.d(context, this.resourcesProvider, true);
        dVar.i(LocaleController.getString(R.string.ExplainStarsButton), false, true);
        dVar.setOnClickListener(new ai.s(this, 3));
        frameLayout2.addView(dVar, kb1.h(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        int i12 = this.backgroundPaddingLeft;
        frameLayout2.setPadding(i12, 0, i12, 0);
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23428h5, frameLayout2, null);
        this.containerView.addView(frameLayout2, kb1.i(-1, -2, 87));
        this.X.O(false);
    }

    @Override
    public final mm0 v(nm0 nm0Var) {
        ?? k71Var = new k71(nm0Var, getContext(), this.currentAccount, 0, true, new ai.e(this, 4), this.resourcesProvider);
        this.X = k71Var;
        return k71Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.ExplainStarsTitle);
    }
}
