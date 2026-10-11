package di;

import ai.d1;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import bi.v;
import ci.d4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.sm0;
import org.telegram.ui.Components.za;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.e6;
import org.telegram.ui.ok;
import org.telegram.ui.zn;
import s4.j;
import w7.x5;
import yh.n5;
public final class h extends db implements NotificationCenter.NotificationCenterDelegate {
    public final zf.a X;
    public final d1 Y;
    public final FrameLayout Z;
    public Runnable f8381a0;
    public e71 f8382b0;

    public h(Context context, d6 d6Var, zf.a aVar, boolean z10, Runnable runnable) {
        super(context, null, false, false, d6Var);
        this.v = 0.2f;
        this.f8381a0 = runnable;
        fixNavigationBar();
        sm0 sm0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        sm0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new ai.g(this, 7));
        j jVar = new j();
        jVar.f47788m = false;
        jVar.C = false;
        jVar.o(is.h);
        jVar.n(350L);
        this.d.setItemAnimator(jVar);
        setBackgroundColor(h6.w0(h6.f20857h5, d6Var));
        this.X = aVar;
        d1 d1Var = new d1(context, 1, d6Var);
        this.Y = d1Var;
        ((TextView) d1Var.f805c).setText(LocaleController.formatString(R.string.TonNeededTitle, zf.a.i(aVar.f54529b - n5.y(this.currentAccount, true).s().f54529b, zf.b.f54531b).d()));
        TextView textView = (TextView) d1Var.d;
        textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.FragmentAddFunds)));
        textView.setMaxWidth(d4.a(textView.getText(), textView.getPaint()));
        this.f25521e.setTitle(B());
        FrameLayout frameLayout = new FrameLayout(context);
        this.Z = frameLayout;
        ci.d dVar = new ci.d(getContext(), getResourcesProvider(), true);
        frameLayout.addView(dVar, x5.t(-1, 48, 17, 20, 10, 20, 20));
        if (!z10 && !i.C0()) {
            dVar.g(LocaleController.getString(R.string.Close), false, true);
            dVar.setOnClickListener(new View.OnClickListener(this) {
                public final h f8380b;

                {
                    this.f8380b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            of.f.u(this.f8380b.getContext(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            return;
                        default:
                            this.f8380b.dismiss();
                            return;
                    }
                }
            });
        } else {
            dVar.g(LocaleController.getString(R.string.TopUpViaFragment), false, true);
            dVar.setOnClickListener(new View.OnClickListener(this) {
                public final h f8380b;

                {
                    this.f8380b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            of.f.u(this.f8380b.getContext(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            return;
                        default:
                            this.f8380b.dismiss();
                            return;
                    }
                }
            });
        }
        e71 e71Var = this.f8382b0;
        if (e71Var != null) {
            e71Var.N(false);
        }
    }

    @Override
    public final CharSequence B() {
        d1 d1Var = this.Y;
        if (d1Var == null) {
            return null;
        }
        return ((TextView) d1Var.f805c).getText();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Runnable runnable;
        if (i10 == NotificationCenter.starOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) {
            e71 e71Var = this.f8382b0;
            if (e71Var != null) {
                e71Var.N(true);
            }
            zf.a s10 = n5.y(this.currentAccount, true).s();
            int i12 = R.string.TonNeededTitle;
            zf.a aVar = this.X;
            ((TextView) this.Y.f805c).setText(LocaleController.formatString(i12, zf.a.i(aVar.f54529b - s10.f54529b, zf.b.f54531b).d()));
            za zaVar = this.f25521e;
            if (zaVar != null) {
                zaVar.setTitle(B());
            }
            if (s10.f54529b >= aVar.f54529b && (runnable = this.f8381a0) != null) {
                runnable.run();
                this.f8381a0 = null;
                dismiss();
            }
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        d1 d1Var = this.Y;
        if (d1Var != null) {
            ((e6) d1Var.f804b).setPaused(true);
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
        ok okVar;
        if (n5.y(this.currentAccount, true).s().f54529b >= this.X.f54529b) {
            Runnable runnable = this.f8381a0;
            if (runnable != null) {
                runnable.run();
                this.f8381a0 = null;
                return;
            }
            return;
        }
        m2 R = LaunchActivity.R();
        if (R instanceof zn) {
            zn znVar = (zn) R;
            if (znVar.C9() && (okVar = znVar.Y) != null) {
                okVar.N();
            }
        }
        super.show();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override
    public final rm0 x(sm0 sm0Var) {
        e71 e71Var = new e71(this.d, getContext(), this.currentAccount, 0, true, new v(this, 11), this.resourcesProvider);
        this.f8382b0 = e71Var;
        return e71Var;
    }
}
