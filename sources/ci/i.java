package ci;

import ai.c0;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import bi.x4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.wa;
import org.telegram.ui.Components.wr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.eo;
import org.telegram.ui.ok;
import w7.a6;
import xh.v5;
public final class i extends ab implements NotificationCenter.NotificationCenterDelegate {
    public final yf.a X;
    public final h Y;
    public final FrameLayout Z;
    public Runnable f4709a0;
    public j61 f4710b0;

    public i(Context context, f6 f6Var, yf.a aVar, boolean z10, Runnable runnable) {
        super(context, null, false, false, f6Var);
        this.v = 0.2f;
        this.f4709a0 = runnable;
        fixNavigationBar();
        vl0 vl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        vl0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new ai.g(this, 6));
        s4.j jVar = new s4.j();
        jVar.f41645m = false;
        jVar.C = false;
        jVar.o(wr.h);
        jVar.n(350L);
        this.d.setItemAnimator(jVar);
        setBackgroundColor(j6.v0(j6.f17998h5, f6Var));
        this.X = aVar;
        h hVar = new h(context, 0, f6Var);
        this.Y = hVar;
        ((TextView) hVar.f4707b).setText(LocaleController.formatString(R.string.TonNeededTitle, yf.a.i(aVar.f46927b - v5.y(this.currentAccount, true).s().f46927b, yf.b.f46929b).d()));
        TextView textView = (TextView) hVar.f4708c;
        textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.FragmentAddFunds)));
        textView.setMaxWidth(x4.a(textView.getText(), textView.getPaint()));
        this.e.setTitle(y());
        FrameLayout frameLayout = new FrameLayout(context);
        this.Z = frameLayout;
        bi.d dVar = new bi.d(getContext(), getResourcesProvider(), true);
        frameLayout.addView(dVar, a6.t(-1, 48, 17, 20, 10, 20, 20));
        if (!z10 && !j.B0()) {
            dVar.g(LocaleController.getString(R.string.Close), false, true);
            dVar.setOnClickListener(new View.OnClickListener(this) {
                public final i f4705b;

                {
                    this.f4705b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            nf.f.u(this.f4705b.getContext(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            return;
                        default:
                            this.f4705b.dismiss();
                            return;
                    }
                }
            });
        } else {
            dVar.g(LocaleController.getString(R.string.TopUpViaFragment), false, true);
            dVar.setOnClickListener(new View.OnClickListener(this) {
                public final i f4705b;

                {
                    this.f4705b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            nf.f.u(this.f4705b.getContext(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            return;
                        default:
                            this.f4705b.dismiss();
                            return;
                    }
                }
            });
        }
        j61 j61Var = this.f4710b0;
        if (j61Var != null) {
            j61Var.N(false);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Runnable runnable;
        if (i10 == NotificationCenter.starOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) {
            j61 j61Var = this.f4710b0;
            if (j61Var != null) {
                j61Var.N(true);
            }
            yf.a s10 = v5.y(this.currentAccount, true).s();
            int i12 = R.string.TonNeededTitle;
            yf.a aVar = this.X;
            ((TextView) this.Y.f4707b).setText(LocaleController.formatString(i12, yf.a.i(aVar.f46927b - s10.f46927b, yf.b.f46929b).d()));
            wa waVar = this.e;
            if (waVar != null) {
                waVar.setTitle(y());
            }
            if (s10.f46927b >= aVar.f46927b && (runnable = this.f4709a0) != null) {
                runnable.run();
                this.f4709a0 = null;
                dismiss();
            }
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        h hVar = this.Y;
        if (hVar != null) {
            ((rg.f) hVar.d).setPaused(true);
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
        if (v5.y(this.currentAccount, true).s().f46927b >= this.X.f46927b) {
            Runnable runnable = this.f4709a0;
            if (runnable != null) {
                runnable.run();
                this.f4709a0 = null;
                return;
            }
            return;
        }
        p2 R = LaunchActivity.R();
        if (R instanceof eo) {
            eo eoVar = (eo) R;
            if (eoVar.x9() && (okVar = eoVar.Y) != null) {
                okVar.P();
            }
        }
        super.show();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override
    public final ul0 v(vl0 vl0Var) {
        j61 j61Var = new j61(this.d, getContext(), this.currentAccount, 0, true, new c0(this, 11), this.resourcesProvider);
        this.f4710b0 = j61Var;
        return j61Var;
    }

    @Override
    public final CharSequence y() {
        h hVar = this.Y;
        if (hVar == null) {
            return null;
        }
        return ((TextView) hVar.f4707b).getText();
    }
}
