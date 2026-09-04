package ei;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import bi.v0;
import ci.u;
import di.f4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.xa;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.co;
import org.telegram.ui.mk;
import s4.j;
import w7.x5;
import zh.s5;
public final class h extends bb implements NotificationCenter.NotificationCenterDelegate {
    public final zf.a X;
    public final v0 Y;
    public final FrameLayout Z;
    public Runnable f9129a0;
    public v51 f9130b0;

    public h(Context context, f6 f6Var, zf.a aVar, boolean z10, Runnable runnable) {
        super(context, null, false, false, f6Var);
        this.v = 0.2f;
        this.f9129a0 = runnable;
        fixNavigationBar();
        ll0 ll0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        ll0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new bi.d(this, 7));
        j jVar = new j();
        jVar.f45777m = false;
        jVar.C = false;
        jVar.o(pr.h);
        jVar.n(350L);
        this.d.setItemAnimator(jVar);
        setBackgroundColor(j6.v0(j6.f20734h5, f6Var));
        this.X = aVar;
        v0 v0Var = new v0(context, 1, f6Var);
        this.Y = v0Var;
        ((TextView) v0Var.f3884c).setText(LocaleController.formatString(R.string.TonNeededTitle, zf.a.i(aVar.f51623b - s5.y(this.currentAccount, true).s().f51623b, zf.b.f51625b).d()));
        TextView textView = (TextView) v0Var.d;
        textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.FragmentAddFunds)));
        textView.setMaxWidth(f4.a(textView.getText(), textView.getPaint()));
        this.f24647e.setTitle(y());
        FrameLayout frameLayout = new FrameLayout(context);
        this.Z = frameLayout;
        di.d dVar = new di.d(getContext(), getResourcesProvider(), true);
        frameLayout.addView(dVar, x5.t(-1, 48, 17, 20, 10, 20, 20));
        if (!z10 && !i.B0()) {
            dVar.g(LocaleController.getString(R.string.Close), false, true);
            dVar.setOnClickListener(new View.OnClickListener(this) {
                public final h f9128b;

                {
                    this.f9128b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            of.f.u(this.f9128b.getContext(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            return;
                        default:
                            this.f9128b.dismiss();
                            return;
                    }
                }
            });
        } else {
            dVar.g(LocaleController.getString(R.string.TopUpViaFragment), false, true);
            dVar.setOnClickListener(new View.OnClickListener(this) {
                public final h f9128b;

                {
                    this.f9128b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            of.f.u(this.f9128b.getContext(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            return;
                        default:
                            this.f9128b.dismiss();
                            return;
                    }
                }
            });
        }
        v51 v51Var = this.f9130b0;
        if (v51Var != null) {
            v51Var.N(false);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Runnable runnable;
        if (i10 == NotificationCenter.starOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) {
            v51 v51Var = this.f9130b0;
            if (v51Var != null) {
                v51Var.N(true);
            }
            zf.a s10 = s5.y(this.currentAccount, true).s();
            int i12 = R.string.TonNeededTitle;
            zf.a aVar = this.X;
            ((TextView) this.Y.f3884c).setText(LocaleController.formatString(i12, zf.a.i(aVar.f51623b - s10.f51623b, zf.b.f51625b).d()));
            xa xaVar = this.f24647e;
            if (xaVar != null) {
                xaVar.setTitle(y());
            }
            if (s10.f51623b >= aVar.f51623b && (runnable = this.f9129a0) != null) {
                runnable.run();
                this.f9129a0 = null;
                dismiss();
            }
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        v0 v0Var = this.Y;
        if (v0Var != null) {
            ((tg.e) v0Var.f3883b).setPaused(true);
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
        mk mkVar;
        if (s5.y(this.currentAccount, true).s().f51623b >= this.X.f51623b) {
            Runnable runnable = this.f9129a0;
            if (runnable != null) {
                runnable.run();
                this.f9129a0 = null;
                return;
            }
            return;
        }
        n2 R = LaunchActivity.R();
        if (R instanceof co) {
            co coVar = (co) R;
            if (coVar.x9() && (mkVar = coVar.Y) != null) {
                mkVar.P();
            }
        }
        super.show();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override
    public final kl0 v(ll0 ll0Var) {
        v51 v51Var = new v51(this.d, getContext(), this.currentAccount, 0, true, new u(this, 11), this.resourcesProvider);
        this.f9130b0 = v51Var;
        return v51Var;
    }

    @Override
    public final CharSequence y() {
        v0 v0Var = this.Y;
        if (v0Var == null) {
            return null;
        }
        return ((TextView) v0Var.f3884c).getText();
    }
}
