package lh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import eh.j;
import f2.n;
import g7.e6;
import gh.v7;
import gh.x9;
import kh.b8;
import kh.x3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.pa;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ak;
import org.telegram.ui.qn;
public final class f extends sa implements NotificationCenter.NotificationCenterDelegate {
    public final gf.a T;
    public final x9 U;
    public final FrameLayout V;
    public Runnable W;
    public z41 X;

    public f(Context context, b6 b6Var, gf.a aVar, boolean z10, Runnable runnable) {
        super(context, null, false, false, false, 1, b6Var);
        this.v = 0.2f;
        this.W = runnable;
        fixNavigationBar();
        wk0 wk0Var = this.d;
        int i9 = this.backgroundPaddingLeft;
        wk0Var.setPadding(i9, 0, i9, 0);
        this.d.setOnItemClickListener(new j(this, 14));
        n nVar = new n();
        nVar.f5532m = false;
        nVar.C = false;
        nVar.o(gr.h);
        nVar.n(350L);
        this.d.setItemAnimator(nVar);
        setBackgroundColor(f6.v0(f6.f23072h5, b6Var));
        this.T = aVar;
        x9 x9Var = new x9(context, 2, b6Var);
        this.U = x9Var;
        ((TextView) x9Var.f9187c).setText(LocaleController.formatString(R.string.TonNeededTitle, gf.a.i(aVar.f7748b - v7.y(this.currentAccount, true).s().f7748b, gf.b.f7750b).d()));
        TextView textView = (TextView) x9Var.d;
        textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.FragmentAddFunds)));
        textView.setMaxWidth(x3.a(textView.getText(), textView.getPaint()));
        this.f32408e.setTitle(y());
        FrameLayout frameLayout = new FrameLayout(context);
        this.V = frameLayout;
        kh.d dVar = new kh.d(getContext(), getResourcesProvider(), true);
        frameLayout.addView(dVar, e6.t(-1, 48, 17, 20, 10, 20, 20));
        if (!z10 && !g.A0()) {
            dVar.g(LocaleController.getString(R.string.Close), false, true);
            dVar.setOnClickListener(new View.OnClickListener(this) {
                public final f f16879b;

                {
                    this.f16879b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            ve.e.u(this.f16879b.getContext(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            return;
                        default:
                            this.f16879b.dismiss();
                            return;
                    }
                }
            });
        } else {
            dVar.g(LocaleController.getString(R.string.TopUpViaFragment), false, true);
            dVar.setOnClickListener(new View.OnClickListener(this) {
                public final f f16879b;

                {
                    this.f16879b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            ve.e.u(this.f16879b.getContext(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            return;
                        default:
                            this.f16879b.dismiss();
                            return;
                    }
                }
            });
        }
        z41 z41Var = this.X;
        if (z41Var != null) {
            z41Var.N(false);
        }
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        Runnable runnable;
        if (i9 == NotificationCenter.starOptionsLoaded || i9 == NotificationCenter.starBalanceUpdated) {
            z41 z41Var = this.X;
            if (z41Var != null) {
                z41Var.N(true);
            }
            gf.a s10 = v7.y(this.currentAccount, true).s();
            int i11 = R.string.TonNeededTitle;
            gf.a aVar = this.T;
            ((TextView) this.U.f9187c).setText(LocaleController.formatString(i11, gf.a.i(aVar.f7748b - s10.f7748b, gf.b.f7750b).d()));
            pa paVar = this.f32408e;
            if (paVar != null) {
                paVar.setTitle(y());
            }
            if (s10.f7748b >= aVar.f7748b && (runnable = this.W) != null) {
                runnable.run();
                this.W = null;
                dismiss();
            }
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        x9 x9Var = this.U;
        if (x9Var != null) {
            ((ag.j) x9Var.f9186b).setPaused(true);
        }
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override
    public final void show() {
        ak akVar;
        if (v7.y(this.currentAccount, true).s().f7748b >= this.T.f7748b) {
            Runnable runnable = this.W;
            if (runnable != null) {
                runnable.run();
                this.W = null;
                return;
            }
            return;
        }
        o2 R = LaunchActivity.R();
        if (R instanceof qn) {
            qn qnVar = (qn) R;
            if (qnVar.x9() && (akVar = qnVar.U) != null) {
                akVar.O();
            }
        }
        super.show();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override
    public final vk0 v(wk0 wk0Var) {
        z41 z41Var = new z41(this.d, getContext(), this.currentAccount, 0, true, new b8(this, 4), this.resourcesProvider);
        this.X = z41Var;
        return z41Var;
    }

    @Override
    public final CharSequence y() {
        x9 x9Var = this.U;
        if (x9Var == null) {
            return null;
        }
        return ((TextView) x9Var.f9187c).getText();
    }
}
