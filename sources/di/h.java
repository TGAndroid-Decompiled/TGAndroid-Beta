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
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.ya;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.jk;
import org.telegram.ui.wn;
import s4.j;
import w7.y5;
import yh.s5;
public final class h extends cb implements NotificationCenter.NotificationCenterDelegate {
    public final zf.a X;
    public final d1 Y;
    public final FrameLayout Z;
    public Runnable f7751a0;
    public m61 f7752b0;

    public h(Context context, d6 d6Var, zf.a aVar, boolean z10, Runnable runnable) {
        super(context, null, false, false, d6Var);
        this.v = 0.2f;
        this.f7751a0 = runnable;
        fixNavigationBar();
        zl0 zl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        zl0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new ai.g(this, 7));
        j jVar = new j();
        jVar.f43103m = false;
        jVar.C = false;
        jVar.o(tr.h);
        jVar.n(350L);
        this.d.setItemAnimator(jVar);
        setBackgroundColor(h6.v0(h6.f19146h5, d6Var));
        this.X = aVar;
        d1 d1Var = new d1(context, 1, d6Var);
        this.Y = d1Var;
        ((TextView) d1Var.f693c).setText(LocaleController.formatString(R.string.TonNeededTitle, zf.a.i(aVar.f49334b - s5.y(this.currentAccount, true).s().f49334b, zf.b.f49336b).d()));
        TextView textView = (TextView) d1Var.d;
        textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.FragmentAddFunds)));
        textView.setMaxWidth(e4.a(textView.getText(), textView.getPaint()));
        this.e.setTitle(y());
        FrameLayout frameLayout = new FrameLayout(context);
        this.Z = frameLayout;
        ci.d dVar = new ci.d(getContext(), getResourcesProvider(), true);
        frameLayout.addView(dVar, y5.t(-1, 48, 17, 20, 10, 20, 20));
        if (!z10 && !i.B0()) {
            dVar.g(LocaleController.getString(R.string.Close), false, true);
            dVar.setOnClickListener(new View.OnClickListener(this) {
                public final h f7750b;

                {
                    this.f7750b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            nf.f.u(this.f7750b.getContext(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            return;
                        default:
                            this.f7750b.dismiss();
                            return;
                    }
                }
            });
        } else {
            dVar.g(LocaleController.getString(R.string.TopUpViaFragment), false, true);
            dVar.setOnClickListener(new View.OnClickListener(this) {
                public final h f7750b;

                {
                    this.f7750b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            nf.f.u(this.f7750b.getContext(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            return;
                        default:
                            this.f7750b.dismiss();
                            return;
                    }
                }
            });
        }
        m61 m61Var = this.f7752b0;
        if (m61Var != null) {
            m61Var.N(false);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Runnable runnable;
        if (i10 == NotificationCenter.starOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) {
            m61 m61Var = this.f7752b0;
            if (m61Var != null) {
                m61Var.N(true);
            }
            zf.a s10 = s5.y(this.currentAccount, true).s();
            int i12 = R.string.TonNeededTitle;
            zf.a aVar = this.X;
            ((TextView) this.Y.f693c).setText(LocaleController.formatString(i12, zf.a.i(aVar.f49334b - s10.f49334b, zf.b.f49336b).d()));
            ya yaVar = this.e;
            if (yaVar != null) {
                yaVar.setTitle(y());
            }
            if (s10.f49334b >= aVar.f49334b && (runnable = this.f7751a0) != null) {
                runnable.run();
                this.f7751a0 = null;
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
        if (s5.y(this.currentAccount, true).s().f49334b >= this.X.f49334b) {
            Runnable runnable = this.f7751a0;
            if (runnable != null) {
                runnable.run();
                this.f7751a0 = null;
                return;
            }
            return;
        }
        m2 R = LaunchActivity.R();
        if (R instanceof wn) {
            wn wnVar = (wn) R;
            if (wnVar.x9() && (jkVar = wnVar.Y) != null) {
                jkVar.P();
            }
        }
        super.show();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override
    public final yl0 v(zl0 zl0Var) {
        m61 m61Var = new m61(this.d, getContext(), this.currentAccount, 0, true, new v(this, 11), this.resourcesProvider);
        this.f7752b0 = m61Var;
        return m61Var;
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
