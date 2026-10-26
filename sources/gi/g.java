package gi;

import ai.k;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import bi.ca;
import bi.mc;
import fi.v3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.xa;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.l6;
import org.telegram.ui.hk;
import org.telegram.ui.un;
import s4.l;
public final class g extends bb implements NotificationCenter.NotificationCenterDelegate {
    public final bg.a X;
    public final mc Y;
    public final FrameLayout Z;
    public Runnable f12500a0;
    public int f12501b0;
    public j71 f12502c0;

    public g(Context context, u6 u6Var, bg.a aVar, boolean z10, Runnable runnable) {
        super(context, null, false, false, u6Var);
        this.v = 0.2f;
        this.f12500a0 = runnable;
        fixNavigationBar();
        mm0 mm0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new k(this, 12));
        l lVar = new l();
        lVar.f47763m = false;
        lVar.C = false;
        lVar.o(ds.h);
        lVar.n(350L);
        this.d.setItemAnimator(lVar);
        setBackgroundColor(y6.w0(y6.f23427h5, u6Var));
        this.X = aVar;
        mc mcVar = new mc(context, 2, u6Var);
        this.Y = mcVar;
        ((TextView) mcVar.f5112c).setText(LocaleController.formatString(R.string.TonNeededTitle, bg.a.i(aVar.f3979b - ca.y(this.currentAccount, true).s().f3979b, bg.b.f3981b).d()));
        TextView textView = (TextView) mcVar.d;
        textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.FragmentAddFunds)));
        textView.setMaxWidth(v3.a(textView.getText(), textView.getPaint()));
        this.e.setTitle(y());
        FrameLayout frameLayout = new FrameLayout(context);
        this.Z = frameLayout;
        fi.d dVar = new fi.d(getContext(), getResourcesProvider(), true);
        frameLayout.addView(dVar, gb1.x(-1, 48, 17, 20, 10, 20, 20));
        if (!z10 && !h.z0()) {
            dVar.i(LocaleController.getString(R.string.Close), false, true);
            dVar.setOnClickListener(new View.OnClickListener(this) {
                public final g f12499b;

                {
                    this.f12499b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            qf.d.t(this.f12499b.getContext(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            return;
                        default:
                            this.f12499b.dismiss();
                            return;
                    }
                }
            });
        } else {
            dVar.i(LocaleController.getString(R.string.TopUpViaFragment), false, true);
            dVar.setOnClickListener(new View.OnClickListener(this) {
                public final g f12499b;

                {
                    this.f12499b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            qf.d.t(this.f12499b.getContext(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            return;
                        default:
                            this.f12499b.dismiss();
                            return;
                    }
                }
            });
        }
        j71 j71Var = this.f12502c0;
        if (j71Var != null) {
            j71Var.O(false);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Runnable runnable;
        if (i10 == NotificationCenter.starOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) {
            j71 j71Var = this.f12502c0;
            if (j71Var != null) {
                j71Var.O(true);
            }
            bg.a s10 = ca.y(this.currentAccount, true).s();
            int i12 = R.string.TonNeededTitle;
            bg.a aVar = this.X;
            ((TextView) this.Y.f5112c).setText(LocaleController.formatString(i12, bg.a.i(aVar.f3979b - s10.f3979b, bg.b.f3981b).d()));
            xa xaVar = this.e;
            if (xaVar != null) {
                xaVar.setTitle(y());
            }
            if (s10.f3979b >= aVar.f3979b && (runnable = this.f12500a0) != null) {
                runnable.run();
                this.f12500a0 = null;
                dismiss();
            }
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        mc mcVar = this.Y;
        if (mcVar != null) {
            ((l6) mcVar.f5111b).setPaused(true);
        }
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            int w02 = y6.w0(y6.f23427h5, this.resourcesProvider);
            if (w02 != this.f12501b0) {
                this.f12501b0 = w02;
                setBackgroundColor(w02);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void show() {
        hk hkVar;
        if (ca.y(this.currentAccount, true).s().f3979b >= this.X.f3979b) {
            Runnable runnable = this.f12500a0;
            if (runnable != null) {
                runnable.run();
                this.f12500a0 = null;
                return;
            }
            return;
        }
        r2 R = LaunchActivity.R();
        if (R instanceof un) {
            un unVar = (un) R;
            if (unVar.F9() && (hkVar = unVar.Y) != null) {
                hkVar.M();
            }
        }
        super.show();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override
    public final lm0 v(mm0 mm0Var) {
        j71 j71Var = new j71(this.d, getContext(), this.currentAccount, 0, true, new ai.e(this, 25), this.resourcesProvider);
        this.f12502c0 = j71Var;
        return j71Var;
    }

    @Override
    public final CharSequence y() {
        mc mcVar = this.Y;
        if (mcVar == null) {
            return null;
        }
        return ((TextView) mcVar.f5112c).getText();
    }
}
