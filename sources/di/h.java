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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.eb;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.d6;
import org.telegram.ui.ok;
import org.telegram.ui.zn;
import s4.j;
import w7.x5;
import yh.m5;
public final class h extends eb implements NotificationCenter.NotificationCenterDelegate {
    public final zf.a X;
    public final d1 Y;
    public final FrameLayout Z;
    public Runnable f8382a0;
    public d71 f8383b0;

    public h(Context context, e6 e6Var, zf.a aVar, boolean z10, Runnable runnable) {
        super(context, null, false, false, e6Var);
        this.v = 0.2f;
        this.f8382a0 = runnable;
        fixNavigationBar();
        rm0 rm0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        rm0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new ai.g(this, 7));
        j jVar = new j();
        jVar.f47742m = false;
        jVar.C = false;
        jVar.o(is.h);
        jVar.n(350L);
        this.d.setItemAnimator(jVar);
        setBackgroundColor(i6.w0(i6.f20872h5, e6Var));
        this.X = aVar;
        d1 d1Var = new d1(context, 1, e6Var);
        this.Y = d1Var;
        ((TextView) d1Var.f805c).setText(LocaleController.formatString(R.string.TonNeededTitle, zf.a.i(aVar.f54486b - m5.y(this.currentAccount, true).s().f54486b, zf.b.f54488b).d()));
        TextView textView = (TextView) d1Var.d;
        textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.FragmentAddFunds)));
        textView.setMaxWidth(d4.a(textView.getText(), textView.getPaint()));
        this.f25983e.setTitle(B());
        FrameLayout frameLayout = new FrameLayout(context);
        this.Z = frameLayout;
        ci.d dVar = new ci.d(getContext(), getResourcesProvider(), true);
        frameLayout.addView(dVar, x5.t(-1, 48, 17, 20, 10, 20, 20));
        if (!z10 && !i.C0()) {
            dVar.g(LocaleController.getString(R.string.Close), false, true);
            dVar.setOnClickListener(new View.OnClickListener(this) {
                public final h f8381b;

                {
                    this.f8381b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            of.f.u(this.f8381b.getContext(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            return;
                        default:
                            this.f8381b.dismiss();
                            return;
                    }
                }
            });
        } else {
            dVar.g(LocaleController.getString(R.string.TopUpViaFragment), false, true);
            dVar.setOnClickListener(new View.OnClickListener(this) {
                public final h f8381b;

                {
                    this.f8381b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            of.f.u(this.f8381b.getContext(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            return;
                        default:
                            this.f8381b.dismiss();
                            return;
                    }
                }
            });
        }
        d71 d71Var = this.f8383b0;
        if (d71Var != null) {
            d71Var.N(false);
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
            d71 d71Var = this.f8383b0;
            if (d71Var != null) {
                d71Var.N(true);
            }
            zf.a s10 = m5.y(this.currentAccount, true).s();
            int i12 = R.string.TonNeededTitle;
            zf.a aVar = this.X;
            ((TextView) this.Y.f805c).setText(LocaleController.formatString(i12, zf.a.i(aVar.f54486b - s10.f54486b, zf.b.f54488b).d()));
            ab abVar = this.f25983e;
            if (abVar != null) {
                abVar.setTitle(B());
            }
            if (s10.f54486b >= aVar.f54486b && (runnable = this.f8382a0) != null) {
                runnable.run();
                this.f8382a0 = null;
                dismiss();
            }
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        d1 d1Var = this.Y;
        if (d1Var != null) {
            ((d6) d1Var.f804b).setPaused(true);
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
        if (m5.y(this.currentAccount, true).s().f54486b >= this.X.f54486b) {
            Runnable runnable = this.f8382a0;
            if (runnable != null) {
                runnable.run();
                this.f8382a0 = null;
                return;
            }
            return;
        }
        n2 R = LaunchActivity.R();
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
    public final qm0 x(rm0 rm0Var) {
        d71 d71Var = new d71(this.d, getContext(), this.currentAccount, 0, true, new v(this, 11), this.resourcesProvider);
        this.f8383b0 = d71Var;
        return d71Var;
    }
}
