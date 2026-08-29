package oh;

import ag.v;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import bg.o;
import dg.i;
import f2.l;
import i7.f6;
import jh.s7;
import nh.t3;
import nh.t4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.ua;
import org.telegram.ui.Components.xa;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.dk;
import org.telegram.ui.tn;
public final class f extends xa implements NotificationCenter.NotificationCenterDelegate {
    public final kf.a T;
    public final v U;
    public final FrameLayout V;
    public Runnable W;
    public k51 X;

    public f(Context context, c6 c6Var, kf.a aVar, boolean z10, Runnable runnable) {
        super(context, null, false, false, false, 1, c6Var);
        this.v = 0.2f;
        this.W = runnable;
        fixNavigationBar();
        jl0 jl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        jl0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new o(this, 18));
        l lVar = new l();
        lVar.f6463m = false;
        lVar.C = false;
        lVar.o(jr.h);
        lVar.n(350L);
        this.d.setItemAnimator(lVar);
        setBackgroundColor(g6.v0(g6.f23133h5, c6Var));
        this.T = aVar;
        v vVar = new v(context, 3, c6Var);
        this.U = vVar;
        ((TextView) vVar.f681c).setText(LocaleController.formatString(R.string.TonNeededTitle, kf.a.i(aVar.f13634b - s7.y(this.currentAccount, true).s().f13634b, kf.b.f13636b).d()));
        TextView textView = (TextView) vVar.d;
        textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.FragmentAddFunds)));
        textView.setMaxWidth(t3.a(textView.getText(), textView.getPaint()));
        this.f34660e.setTitle(y());
        FrameLayout frameLayout = new FrameLayout(context);
        this.V = frameLayout;
        nh.d dVar = new nh.d(getContext(), getResourcesProvider(), true);
        frameLayout.addView(dVar, f6.t(-1, 48, 17, 20, 10, 20, 20));
        if (!z10 && !g.B0()) {
            dVar.g(LocaleController.getString(R.string.Close), false, true);
            dVar.setOnClickListener(new View.OnClickListener(this) {
                public final f f19573b;

                {
                    this.f19573b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            ye.d.u(this.f19573b.getContext(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            return;
                        default:
                            this.f19573b.dismiss();
                            return;
                    }
                }
            });
        } else {
            dVar.g(LocaleController.getString(R.string.TopUpViaFragment), false, true);
            dVar.setOnClickListener(new View.OnClickListener(this) {
                public final f f19573b;

                {
                    this.f19573b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            ye.d.u(this.f19573b.getContext(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            return;
                        default:
                            this.f19573b.dismiss();
                            return;
                    }
                }
            });
        }
        k51 k51Var = this.X;
        if (k51Var != null) {
            k51Var.N(false);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Runnable runnable;
        if (i10 == NotificationCenter.starOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) {
            k51 k51Var = this.X;
            if (k51Var != null) {
                k51Var.N(true);
            }
            kf.a s10 = s7.y(this.currentAccount, true).s();
            int i12 = R.string.TonNeededTitle;
            kf.a aVar = this.T;
            ((TextView) this.U.f681c).setText(LocaleController.formatString(i12, kf.a.i(aVar.f13634b - s10.f13634b, kf.b.f13636b).d()));
            ua uaVar = this.f34660e;
            if (uaVar != null) {
                uaVar.setTitle(y());
            }
            if (s10.f13634b >= aVar.f13634b && (runnable = this.W) != null) {
                runnable.run();
                this.W = null;
                dismiss();
            }
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        v vVar = this.U;
        if (vVar != null) {
            ((i) vVar.f680b).setPaused(true);
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
        dk dkVar;
        if (s7.y(this.currentAccount, true).s().f13634b >= this.T.f13634b) {
            Runnable runnable = this.W;
            if (runnable != null) {
                runnable.run();
                this.W = null;
                return;
            }
            return;
        }
        o2 R = LaunchActivity.R();
        if (R instanceof tn) {
            tn tnVar = (tn) R;
            if (tnVar.x9() && (dkVar = tnVar.U) != null) {
                dkVar.P();
            }
        }
        super.show();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override
    public final il0 v(jl0 jl0Var) {
        k51 k51Var = new k51(this.d, getContext(), this.currentAccount, 0, true, new t4(this, 5), this.resourcesProvider);
        this.X = k51Var;
        return k51Var;
    }

    @Override
    public final CharSequence y() {
        v vVar = this.U;
        if (vVar == null) {
            return null;
        }
        return ((TextView) vVar.f681c).getText();
    }
}
