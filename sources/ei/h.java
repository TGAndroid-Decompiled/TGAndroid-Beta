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
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.z61;
import org.telegram.ui.Components.za;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.b6;
import org.telegram.ui.fo;
import org.telegram.ui.sk;
import s4.k;
import w7.a6;
import zh.n5;
public final class h extends db implements NotificationCenter.NotificationCenterDelegate {
    public final ag.a X;
    public final v0 Y;
    public final FrameLayout Z;
    public Runnable f8794a0;
    public z61 f8795b0;

    public h(Context context, c6 c6Var, ag.a aVar, boolean z10, Runnable runnable) {
        super(context, null, false, false, c6Var);
        this.v = 0.2f;
        this.f8794a0 = runnable;
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
        setBackgroundColor(g6.w0(g6.f19972h5, c6Var));
        this.X = aVar;
        v0 v0Var = new v0(context, 1, c6Var);
        this.Y = v0Var;
        ((TextView) v0Var.f3848c).setText(LocaleController.formatString(R.string.TonNeededTitle, ag.a.i(aVar.f628b - n5.y(this.currentAccount, true).s().f628b, ag.b.f630b).d()));
        TextView textView = (TextView) v0Var.d;
        textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.FragmentAddFunds)));
        textView.setMaxWidth(d4.a(textView.getText(), textView.getPaint()));
        this.e.setTitle(A());
        FrameLayout frameLayout = new FrameLayout(context);
        this.Z = frameLayout;
        di.d dVar = new di.d(getContext(), getResourcesProvider(), true);
        frameLayout.addView(dVar, a6.t(-1, 48, 17, 20, 10, 20, 20));
        if (!z10 && !i.C0()) {
            dVar.g(LocaleController.getString(R.string.Close), false, true);
            dVar.setOnClickListener(new View.OnClickListener(this) {
                public final h f8793b;

                {
                    this.f8793b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            pf.d.u(this.f8793b.getContext(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            return;
                        default:
                            this.f8793b.dismiss();
                            return;
                    }
                }
            });
        } else {
            dVar.g(LocaleController.getString(R.string.TopUpViaFragment), false, true);
            dVar.setOnClickListener(new View.OnClickListener(this) {
                public final h f8793b;

                {
                    this.f8793b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            pf.d.u(this.f8793b.getContext(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            return;
                        default:
                            this.f8793b.dismiss();
                            return;
                    }
                }
            });
        }
        z61 z61Var = this.f8795b0;
        if (z61Var != null) {
            z61Var.N(false);
        }
    }

    @Override
    public final CharSequence A() {
        v0 v0Var = this.Y;
        if (v0Var == null) {
            return null;
        }
        return ((TextView) v0Var.f3848c).getText();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Runnable runnable;
        if (i10 == NotificationCenter.starOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) {
            z61 z61Var = this.f8795b0;
            if (z61Var != null) {
                z61Var.N(true);
            }
            ag.a s10 = n5.y(this.currentAccount, true).s();
            int i12 = R.string.TonNeededTitle;
            ag.a aVar = this.X;
            ((TextView) this.Y.f3848c).setText(LocaleController.formatString(i12, ag.a.i(aVar.f628b - s10.f628b, ag.b.f630b).d()));
            za zaVar = this.e;
            if (zaVar != null) {
                zaVar.setTitle(A());
            }
            if (s10.f628b >= aVar.f628b && (runnable = this.f8794a0) != null) {
                runnable.run();
                this.f8794a0 = null;
                dismiss();
            }
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        v0 v0Var = this.Y;
        if (v0Var != null) {
            ((b6) v0Var.f3847b).setPaused(true);
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
        if (n5.y(this.currentAccount, true).s().f628b >= this.X.f628b) {
            Runnable runnable = this.f8794a0;
            if (runnable != null) {
                runnable.run();
                this.f8794a0 = null;
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
        z61 z61Var = new z61(this.d, getContext(), this.currentAccount, 0, true, new u(this, 11), this.resourcesProvider);
        this.f8795b0 = z61Var;
        return z61Var;
    }
}
