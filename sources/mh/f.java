package mh;

import ag.p0;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import bg.i;
import f2.l;
import h7.z5;
import hh.u7;
import hh.w9;
import lh.a8;
import lh.w3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.na;
import org.telegram.ui.Components.qa;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ck;
import org.telegram.ui.rn;

public final class f extends qa implements NotificationCenter.NotificationCenterDelegate {
    public final hf.a T;
    public final w9 U;
    public final FrameLayout V;
    public Runnable W;
    public b51 X;

    public f(Context context, c6 c6Var, hf.a aVar, boolean z10, Runnable runnable) {
        super(context, null, false, false, false, 1, c6Var);
        this.v = 0.2f;
        this.W = runnable;
        fixNavigationBar();
        zk0 zk0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        final int i11 = 0;
        zk0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new p0(this, 16));
        l lVar = new l();
        lVar.f5819m = false;
        lVar.C = false;
        lVar.o(er.h);
        lVar.n(350L);
        this.d.setItemAnimator(lVar);
        setBackgroundColor(g6.v0(g6.f23124h5, c6Var));
        this.T = aVar;
        w9 w9Var = new w9(context, 2, c6Var);
        this.U = w9Var;
        final int i12 = 1;
        ((TextView) w9Var.f10306c).setText(LocaleController.formatString(R.string.TonNeededTitle, hf.a.i(aVar.f8920b - u7.y(this.currentAccount, true).s().f8920b, hf.b.f8922b).d()));
        TextView textView = (TextView) w9Var.d;
        textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.FragmentAddFunds)));
        textView.setMaxWidth(w3.a(textView.getText(), textView.getPaint()));
        this.f31853e.setTitle(z());
        FrameLayout frameLayout = new FrameLayout(context);
        this.V = frameLayout;
        lh.d dVar = new lh.d(getContext(), getResourcesProvider(), true);
        frameLayout.addView(dVar, z5.t(-1, 48, 17, 20, 10, 20, 20));
        if (z10 || g.B0()) {
            dVar.g(LocaleController.getString(R.string.TopUpViaFragment), false, true);
            dVar.setOnClickListener(new View.OnClickListener(this) {

                public final f f18063b;

                {
                    this.f18063b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            we.e.u(this.f18063b.getContext(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            break;
                        default:
                            this.f18063b.dismiss();
                            break;
                    }
                }
            });
        } else {
            dVar.g(LocaleController.getString(R.string.Close), false, true);
            dVar.setOnClickListener(new View.OnClickListener(this) {

                public final f f18063b;

                {
                    this.f18063b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i12) {
                        case 0:
                            we.e.u(this.f18063b.getContext(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            break;
                        default:
                            this.f18063b.dismiss();
                            break;
                    }
                }
            });
        }
        b51 b51Var = this.X;
        if (b51Var != null) {
            b51Var.N(false);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Runnable runnable;
        if (i10 == NotificationCenter.starOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) {
            b51 b51Var = this.X;
            if (b51Var != null) {
                b51Var.N(true);
            }
            hf.a aVarS = u7.y(this.currentAccount, true).s();
            TextView textView = (TextView) this.U.f10306c;
            int i12 = R.string.TonNeededTitle;
            hf.a aVar = this.T;
            textView.setText(LocaleController.formatString(i12, hf.a.i(aVar.f8920b - aVarS.f8920b, hf.b.f8922b).d()));
            na naVar = this.f31853e;
            if (naVar != null) {
                naVar.setTitle(z());
            }
            if (aVarS.f8920b < aVar.f8920b || (runnable = this.W) == null) {
                return;
            }
            runnable.run();
            this.W = null;
            dismiss();
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        w9 w9Var = this.U;
        if (w9Var != null) {
            ((i) w9Var.f10305b).setPaused(true);
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
        ck ckVar;
        if (u7.y(this.currentAccount, true).s().f8920b >= this.T.f8920b) {
            Runnable runnable = this.W;
            if (runnable != null) {
                runnable.run();
                this.W = null;
                return;
            }
            return;
        }
        n2 n2VarR = LaunchActivity.R();
        if (n2VarR instanceof rn) {
            rn rnVar = (rn) n2VarR;
            if (rnVar.x9() && (ckVar = rnVar.U) != null) {
                ckVar.P();
            }
        }
        super.show();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override
    public final yk0 w(zk0 zk0Var) {
        b51 b51Var = new b51(this.d, getContext(), this.currentAccount, 0, true, new a8(this, 4), this.resourcesProvider);
        this.X = b51Var;
        return b51Var;
    }

    @Override
    public final CharSequence z() {
        w9 w9Var = this.U;
        if (w9Var == null) {
            return null;
        }
        return ((TextView) w9Var.f10306c).getText();
    }
}
