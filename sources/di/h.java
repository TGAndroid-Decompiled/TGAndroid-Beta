package di;

import ai.d1;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import bi.v;
import ci.e4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.xa;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.jk;
import org.telegram.ui.xn;
import s4.j;
import w7.x5;
import yh.t5;
public final class h extends bb implements NotificationCenter.NotificationCenterDelegate {
    public final zf.a X;
    public final d1 Y;
    public final FrameLayout Z;
    public Runnable f7740a0;
    public v51 f7741b0;

    public h(Context context, d6 d6Var, zf.a aVar, boolean z10, Runnable runnable) {
        super(context, null, false, false, d6Var);
        this.v = 0.2f;
        this.f7740a0 = runnable;
        fixNavigationBar();
        ml0 ml0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        ml0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new ai.g(this, 7));
        j jVar = new j();
        jVar.f42662m = false;
        jVar.C = false;
        jVar.o(rr.h);
        jVar.n(350L);
        this.d.setItemAnimator(jVar);
        setBackgroundColor(h6.v0(h6.f18859h5, d6Var));
        this.X = aVar;
        d1 d1Var = new d1(context, 1, d6Var);
        this.Y = d1Var;
        ((TextView) d1Var.f693c).setText(LocaleController.formatString(R.string.TonNeededTitle, zf.a.i(aVar.f48897b - t5.y(this.currentAccount, true).s().f48897b, zf.b.f48899b).d()));
        TextView textView = (TextView) d1Var.d;
        textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.FragmentAddFunds)));
        textView.setMaxWidth(e4.a(textView.getText(), textView.getPaint()));
        this.e.setTitle(y());
        FrameLayout frameLayout = new FrameLayout(context);
        this.Z = frameLayout;
        ci.d dVar = new ci.d(getContext(), getResourcesProvider(), true);
        frameLayout.addView(dVar, x5.t(-1, 48, 17, 20, 10, 20, 20));
        if (!z10 && !i.B0()) {
            dVar.g(LocaleController.getString(R.string.Close), false, true);
            dVar.setOnClickListener(new View.OnClickListener(this) {
                public final h f7739b;

                {
                    this.f7739b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            nf.f.u(this.f7739b.getContext(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            return;
                        default:
                            this.f7739b.dismiss();
                            return;
                    }
                }
            });
        } else {
            dVar.g(LocaleController.getString(R.string.TopUpViaFragment), false, true);
            dVar.setOnClickListener(new View.OnClickListener(this) {
                public final h f7739b;

                {
                    this.f7739b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            nf.f.u(this.f7739b.getContext(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            return;
                        default:
                            this.f7739b.dismiss();
                            return;
                    }
                }
            });
        }
        v51 v51Var = this.f7741b0;
        if (v51Var != null) {
            v51Var.N(false);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Runnable runnable;
        if (i10 == NotificationCenter.starOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) {
            v51 v51Var = this.f7741b0;
            if (v51Var != null) {
                v51Var.N(true);
            }
            zf.a s10 = t5.y(this.currentAccount, true).s();
            int i12 = R.string.TonNeededTitle;
            zf.a aVar = this.X;
            ((TextView) this.Y.f693c).setText(LocaleController.formatString(i12, zf.a.i(aVar.f48897b - s10.f48897b, zf.b.f48899b).d()));
            xa xaVar = this.e;
            if (xaVar != null) {
                xaVar.setTitle(y());
            }
            if (s10.f48897b >= aVar.f48897b && (runnable = this.f7740a0) != null) {
                runnable.run();
                this.f7740a0 = null;
                dismiss();
            }
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        d1 d1Var = this.Y;
        if (d1Var != null) {
            ((sg.e) d1Var.f692b).setPaused(true);
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
        jk jkVar;
        if (t5.y(this.currentAccount, true).s().f48897b >= this.X.f48897b) {
            Runnable runnable = this.f7740a0;
            if (runnable != null) {
                runnable.run();
                this.f7740a0 = null;
                return;
            }
            return;
        }
        n2 R = LaunchActivity.R();
        if (R instanceof xn) {
            xn xnVar = (xn) R;
            if (xnVar.x9() && (jkVar = xnVar.Y) != null) {
                jkVar.Q();
            }
        }
        super.show();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override
    public final ll0 v(ml0 ml0Var) {
        v51 v51Var = new v51(this.d, getContext(), this.currentAccount, 0, true, new v(this, 11), this.resourcesProvider);
        this.f7741b0 = v51Var;
        return v51Var;
    }

    @Override
    public final CharSequence y() {
        d1 d1Var = this.Y;
        if (d1Var == null) {
            return null;
        }
        return ((TextView) d1Var.f693c).getText();
    }
}
