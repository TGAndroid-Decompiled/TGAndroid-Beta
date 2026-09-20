package di;

import ai.d1;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import bi.v;
import ci.f4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.wa;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.lk;
import org.telegram.ui.zn;
import s4.j;
import w7.y5;
import yh.u5;
public final class h extends ab implements NotificationCenter.NotificationCenterDelegate {
    public final zf.a X;
    public final d1 Y;
    public final FrameLayout Z;
    public Runnable f7757a0;
    public k61 f7758b0;

    public h(Context context, f6 f6Var, zf.a aVar, boolean z10, Runnable runnable) {
        super(context, null, false, false, f6Var);
        this.v = 0.2f;
        this.f7757a0 = runnable;
        fixNavigationBar();
        vl0 vl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        vl0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new ai.g(this, 7));
        j jVar = new j();
        jVar.f43009m = false;
        jVar.C = false;
        jVar.o(qr.h);
        jVar.n(350L);
        this.d.setItemAnimator(jVar);
        setBackgroundColor(j6.v0(j6.f19165h5, f6Var));
        this.X = aVar;
        d1 d1Var = new d1(context, 1, f6Var);
        this.Y = d1Var;
        ((TextView) d1Var.f687c).setText(LocaleController.formatString(R.string.TonNeededTitle, zf.a.i(aVar.f49253b - u5.y(this.currentAccount, true).s().f49253b, zf.b.f49255b).d()));
        TextView textView = (TextView) d1Var.d;
        textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.FragmentAddFunds)));
        textView.setMaxWidth(f4.a(textView.getText(), textView.getPaint()));
        this.e.setTitle(y());
        FrameLayout frameLayout = new FrameLayout(context);
        this.Z = frameLayout;
        ci.d dVar = new ci.d(getContext(), getResourcesProvider(), true);
        frameLayout.addView(dVar, y5.t(-1, 48, 17, 20, 10, 20, 20));
        if (!z10 && !i.B0()) {
            dVar.g(LocaleController.getString(R.string.Close), false, true);
            dVar.setOnClickListener(new View.OnClickListener(this) {
                public final h f7756b;

                {
                    this.f7756b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            nf.f.u(this.f7756b.getContext(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            return;
                        default:
                            this.f7756b.dismiss();
                            return;
                    }
                }
            });
        } else {
            dVar.g(LocaleController.getString(R.string.TopUpViaFragment), false, true);
            dVar.setOnClickListener(new View.OnClickListener(this) {
                public final h f7756b;

                {
                    this.f7756b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            nf.f.u(this.f7756b.getContext(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            return;
                        default:
                            this.f7756b.dismiss();
                            return;
                    }
                }
            });
        }
        k61 k61Var = this.f7758b0;
        if (k61Var != null) {
            k61Var.N(false);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Runnable runnable;
        if (i10 == NotificationCenter.starOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) {
            k61 k61Var = this.f7758b0;
            if (k61Var != null) {
                k61Var.N(true);
            }
            zf.a s10 = u5.y(this.currentAccount, true).s();
            int i12 = R.string.TonNeededTitle;
            zf.a aVar = this.X;
            ((TextView) this.Y.f687c).setText(LocaleController.formatString(i12, zf.a.i(aVar.f49253b - s10.f49253b, zf.b.f49255b).d()));
            wa waVar = this.e;
            if (waVar != null) {
                waVar.setTitle(y());
            }
            if (s10.f49253b >= aVar.f49253b && (runnable = this.f7757a0) != null) {
                runnable.run();
                this.f7757a0 = null;
                dismiss();
            }
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        d1 d1Var = this.Y;
        if (d1Var != null) {
            ((sg.e) d1Var.f686b).setPaused(true);
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
        lk lkVar;
        if (u5.y(this.currentAccount, true).s().f49253b >= this.X.f49253b) {
            Runnable runnable = this.f7757a0;
            if (runnable != null) {
                runnable.run();
                this.f7757a0 = null;
                return;
            }
            return;
        }
        n2 R = LaunchActivity.R();
        if (R instanceof zn) {
            zn znVar = (zn) R;
            if (znVar.x9() && (lkVar = znVar.Y) != null) {
                lkVar.P();
            }
        }
        super.show();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override
    public final ul0 v(vl0 vl0Var) {
        k61 k61Var = new k61(this.d, getContext(), this.currentAccount, 0, true, new v(this, 11), this.resourcesProvider);
        this.f7758b0 = k61Var;
        return k61Var;
    }

    @Override
    public final CharSequence y() {
        d1 d1Var = this.Y;
        if (d1Var == null) {
            return null;
        }
        return ((TextView) d1Var.f687c).getText();
    }
}
