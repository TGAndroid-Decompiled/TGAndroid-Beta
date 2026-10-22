package fi;

import ai.ga;
import ai.q;
import ai.uc;
import ai.wa;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import ei.x3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.xa;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.m6;
import org.telegram.ui.fk;
import org.telegram.ui.qn;
import s4.k;
import w7.z5;
public final class f extends bb implements NotificationCenter.NotificationCenterDelegate {
    public final ag.a X;
    public final uc Y;
    public final FrameLayout Z;
    public Runnable f10607a0;
    public u61 f10608b0;

    public f(Context context, d6 d6Var, ag.a aVar, boolean z10, Runnable runnable) {
        super(context, null, false, false, d6Var);
        this.v = 0.2f;
        this.f10607a0 = runnable;
        fixNavigationBar();
        jm0 jm0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        jm0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new wa(this, 11));
        k kVar = new k();
        kVar.f45954m = false;
        kVar.C = false;
        kVar.o(bs.h);
        kVar.n(350L);
        this.d.setItemAnimator(kVar);
        setBackgroundColor(h6.w0(h6.f21064h5, d6Var));
        this.X = aVar;
        uc ucVar = new uc(context, 2, d6Var);
        this.Y = ucVar;
        ((TextView) ucVar.f2278c).setText(LocaleController.formatString(R.string.TonNeededTitle, ag.a.i(aVar.f632b - ga.y(this.currentAccount, true).s().f632b, ag.b.f634b).d()));
        TextView textView = (TextView) ucVar.d;
        textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.FragmentAddFunds)));
        textView.setMaxWidth(x3.a(textView.getText(), textView.getPaint()));
        this.e.setTitle(A());
        FrameLayout frameLayout = new FrameLayout(context);
        this.Z = frameLayout;
        ei.d dVar = new ei.d(getContext(), getResourcesProvider(), true);
        frameLayout.addView(dVar, z5.t(-1, 48, 17, 20, 10, 20, 20));
        if (!z10 && !g.C0()) {
            dVar.g(LocaleController.getString(R.string.Close), false, true);
            dVar.setOnClickListener(new View.OnClickListener(this) {
                public final f f10606b;

                {
                    this.f10606b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            pf.d.t(this.f10606b.getContext(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            return;
                        default:
                            this.f10606b.dismiss();
                            return;
                    }
                }
            });
        } else {
            dVar.g(LocaleController.getString(R.string.TopUpViaFragment), false, true);
            dVar.setOnClickListener(new View.OnClickListener(this) {
                public final f f10606b;

                {
                    this.f10606b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            pf.d.t(this.f10606b.getContext(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            return;
                        default:
                            this.f10606b.dismiss();
                            return;
                    }
                }
            });
        }
        u61 u61Var = this.f10608b0;
        if (u61Var != null) {
            u61Var.N(false);
        }
    }

    @Override
    public final CharSequence A() {
        uc ucVar = this.Y;
        if (ucVar == null) {
            return null;
        }
        return ((TextView) ucVar.f2278c).getText();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Runnable runnable;
        if (i10 == NotificationCenter.starOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) {
            u61 u61Var = this.f10608b0;
            if (u61Var != null) {
                u61Var.N(true);
            }
            ag.a s10 = ga.y(this.currentAccount, true).s();
            int i12 = R.string.TonNeededTitle;
            ag.a aVar = this.X;
            ((TextView) this.Y.f2278c).setText(LocaleController.formatString(i12, ag.a.i(aVar.f632b - s10.f632b, ag.b.f634b).d()));
            xa xaVar = this.e;
            if (xaVar != null) {
                xaVar.setTitle(A());
            }
            if (s10.f632b >= aVar.f632b && (runnable = this.f10607a0) != null) {
                runnable.run();
                this.f10607a0 = null;
                dismiss();
            }
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        uc ucVar = this.Y;
        if (ucVar != null) {
            ((m6) ucVar.f2277b).setPaused(true);
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
        fk fkVar;
        if (ga.y(this.currentAccount, true).s().f632b >= this.X.f632b) {
            Runnable runnable = this.f10607a0;
            if (runnable != null) {
                runnable.run();
                this.f10607a0 = null;
                return;
            }
            return;
        }
        n2 R = LaunchActivity.R();
        if (R instanceof qn) {
            qn qnVar = (qn) R;
            if (qnVar.C9() && (fkVar = qnVar.Y) != null) {
                fkVar.N();
            }
        }
        super.show();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override
    public final im0 x(jm0 jm0Var) {
        u61 u61Var = new u61(this.d, getContext(), this.currentAccount, 0, true, new q(this, 22), this.resourcesProvider);
        this.f10608b0 = u61Var;
        return u61Var;
    }
}
