package hh;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.Components.zk0;

public final class g0 extends org.telegram.ui.Components.qa {
    public d0 T;
    public final LinearLayout U;

    public g0(Context context) {
        super(context, null, false, false, false, 1, null);
        this.v = 0.1f;
        fixNavigationBar();
        zk0 zk0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        zk0Var.setPadding(i10, 0, i10, 0);
        LinearLayout linearLayout = new LinearLayout(context);
        this.U = linearLayout;
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        m9 m9Var = new m9(context, 70, 0);
        frameLayout.addView(m9Var, h7.z5.c(-1.0f, -1));
        bg.i iVar = new bg.i(context, 1, 2);
        bg.a aVar = iVar.f2129b;
        aVar.f2107w = org.telegram.ui.ActionBar.g6.fk;
        aVar.f2108x = org.telegram.ui.ActionBar.g6.gk;
        aVar.b();
        iVar.setStarParticlesView(m9Var);
        frameLayout.addView(iVar, h7.z5.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        iVar.setPaused(false);
        linearLayout.addView(frameLayout, h7.z5.c(150.0f, -1));
        TextView textView = new TextView(context);
        org.telegram.ui.Cells.pa.m(20.0f, 1, textView);
        int i11 = org.telegram.ui.ActionBar.g6.f23161j5;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, this.resourcesProvider));
        textView.setGravity(17);
        textView.setText(LocaleController.getString(R.string.ExplainStarsTitle));
        TextView textViewI = org.telegram.ui.Cells.pa.i(linearLayout, textView, h7.z5.t(-2, -2, 1, 0, 2, 0, 0), context);
        textViewI.setTextSize(1, 14.0f);
        textViewI.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, this.resourcesProvider));
        textViewI.setGravity(17);
        textViewI.setText(LocaleController.getString(R.string.ExplainStarsTitle2));
        linearLayout.addView(textViewI, h7.z5.t(-1, -2, 1, 16, 9, 16, 18));
        FrameLayout frameLayout2 = new FrameLayout(context);
        lh.d dVar = new lh.d(context, this.resourcesProvider, true);
        dVar.g(LocaleController.getString(R.string.ExplainStarsButton), false, true);
        dVar.setOnClickListener(new ag.w0(this, 10));
        frameLayout2.addView(dVar, h7.z5.d(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        int i12 = this.backgroundPaddingLeft;
        frameLayout2.setPadding(i12, 0, i12, 0);
        frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23124h5, false));
        this.containerView.addView(frameLayout2, h7.z5.e(-1, -2, 87));
        this.T.N(false);
    }

    @Override
    public final yk0 w(zk0 zk0Var) {
        d0 d0Var = new d0(zk0Var, getContext(), this.currentAccount, 0, true, new ch.c(this, 14), this.resourcesProvider);
        this.T = d0Var;
        return d0Var;
    }

    @Override
    public final CharSequence z() {
        return LocaleController.getString(R.string.ExplainStarsTitle);
    }
}
