package ei;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import bi.v0;
import ci.u;
import di.d4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.za;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fo;
import org.telegram.ui.sk;
import s4.k;
import w7.z5;
import zh.n5;
public final class h extends db implements NotificationCenter.NotificationCenterDelegate {
    public final ag.a X;
    public final v0 Y;
    public final FrameLayout Z;
    public Runnable f8797a0;
    public a71 f8798b0;

    public h(Context context, c6 c6Var, ag.a aVar, boolean z10, Runnable runnable) {
        super(context, null, false, false, c6Var);
        this.v = 0.2f;
        this.f8797a0 = runnable;
        fixNavigationBar();
        mm0 mm0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new bi.d(this, 7));
        k kVar = new k();
        kVar.f44872m = false;
        kVar.C = false;
        kVar.o(es.h);
        kVar.n(350L);
        this.d.setItemAnimator(kVar);
        setBackgroundColor(g6.w0(g6.f19672h5, c6Var));
        this.X = aVar;
        v0 v0Var = new v0(context, 1, c6Var);
        this.Y = v0Var;
        ((TextView) v0Var.f3852c).setText(LocaleController.formatString(R.string.TonNeededTitle, ag.a.i(aVar.f632b - n5.y(this.currentAccount, true).s().f632b, ag.b.f634b).d()));
        TextView textView = (TextView) v0Var.d;
        textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.FragmentAddFunds)));
        textView.setMaxWidth(d4.a(textView.getText(), textView.getPaint()));
        this.e.setTitle(B());
        FrameLayout frameLayout = new FrameLayout(context);
        this.Z = frameLayout;
        di.d dVar = new di.d(getContext(), getResourcesProvider(), true);
        frameLayout.addView(dVar, z5.t(-1, 48, 17, 20, 10, 20, 20));
        if (!z10 && !i.C0()) {
            dVar.g(LocaleController.getString(R.string.Close), false, true);
            dVar.setOnClickListener(new View.OnClickListener(this) {
                public final h f8796b;

                {
                    this.f8796b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            pf.d.t(this.f8796b.getContext(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            return;
                        default:
                            this.f8796b.dismiss();
                            return;
                    }
                }
            });
        } else {
            dVar.g(LocaleController.getString(R.string.TopUpViaFragment), false, true);
            dVar.setOnClickListener(new View.OnClickListener(this) {
                public final h f8796b;

                {
                    this.f8796b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            pf.d.t(this.f8796b.getContext(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            return;
                        default:
                            this.f8796b.dismiss();
                            return;
                    }
                }
            });
        }
        a71 a71Var = this.f8798b0;
        if (a71Var != null) {
            a71Var.N(false);
        }
    }

    @Override
    public final CharSequence B() {
        v0 v0Var = this.Y;
        if (v0Var == null) {
            return null;
        }
        return ((TextView) v0Var.f3852c).getText();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Runnable runnable;
        if (i10 == NotificationCenter.starOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) {
            a71 a71Var = this.f8798b0;
            if (a71Var != null) {
                a71Var.N(true);
            }
            ag.a s10 = n5.y(this.currentAccount, true).s();
            int i12 = R.string.TonNeededTitle;
            ag.a aVar = this.X;
            ((TextView) this.Y.f3852c).setText(LocaleController.formatString(i12, ag.a.i(aVar.f632b - s10.f632b, ag.b.f634b).d()));
            za zaVar = this.e;
            if (zaVar != null) {
                zaVar.setTitle(B());
            }
            if (s10.f632b >= aVar.f632b && (runnable = this.f8797a0) != null) {
                runnable.run();
                this.f8797a0 = null;
                dismiss();
            }
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        v0 v0Var = this.Y;
        if (v0Var != null) {
            ((org.telegram.ui.Wallet.c6) v0Var.f3851b).setPaused(true);
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
        sk skVar;
        if (n5.y(this.currentAccount, true).s().f632b >= this.X.f632b) {
            Runnable runnable = this.f8797a0;
            if (runnable != null) {
                runnable.run();
                this.f8797a0 = null;
                return;
            }
            return;
        }
        m2 R = LaunchActivity.R();
        if (R instanceof fo) {
            fo foVar = (fo) R;
            if (foVar.C9() && (skVar = foVar.Y) != null) {
                skVar.N();
            }
        }
        super.show();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override
    public final lm0 x(mm0 mm0Var) {
        a71 a71Var = new a71(this.d, getContext(), this.currentAccount, 0, true, new u(this, 11), this.resourcesProvider);
        this.f8798b0 = a71Var;
        return a71Var;
    }
}
