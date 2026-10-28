package hi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AgentController;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.wh;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_agent;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.wc;
import org.telegram.ui.dy0;
public final class q extends org.telegram.ui.Wallet.j2 implements NotificationCenter.NotificationCenterDelegate {
    public final AgentController f13208b0;
    public final dy0 f13209c0;
    public final boolean f13210d0;
    public final p f13211e0;
    public final s71 f13212f0;
    public final s71 f13213g0;
    public final FrameLayout f13214h0;
    public final FrameLayout f13215i0;
    public final FrameLayout f13216j0;
    public final TextView f13217k0;
    public final org.telegram.ui.Cells.g3 f13218l0;
    public final TextView m0;
    public final FrameLayout f13219n0;
    public final fi.d f13220o0;
    public TL_agent.agentProvider f13221p0;
    public boolean f13222q0;

    public q(android.app.Activity r25, int r26, org.telegram.ui.dy0 r27, org.telegram.ui.ActionBar.u6 r28) {
        throw new UnsupportedOperationException("Method not decompiled: hi.q.<init>(android.app.Activity, int, org.telegram.ui.dy0, org.telegram.ui.ActionBar.u6):void");
    }

    public static void Q(q qVar, String str, TLRPC.TL_error tL_error) {
        org.telegram.ui.Cells.g3 g3Var = qVar.f13218l0;
        qVar.f13222q0 = false;
        fi.d dVar = qVar.f13220o0;
        dVar.setLoading(false);
        TL_agent.agentProvider agentprovider = qVar.f13221p0;
        if (agentprovider != null) {
            dVar.i(LocaleController.formatString(R.string.AgentConnectProvider, agentprovider.title), true, true);
        }
        qVar.V();
        if (tL_error == null) {
            AndroidUtilities.hideKeyboard(g3Var.d);
            qVar.dismiss();
            dy0 dy0Var = qVar.f13209c0;
            if (dy0Var != null) {
                dy0Var.run(str);
            }
        } else if ("AGENT_KEY_INVALID".equals(tL_error.text)) {
            qVar.U(true);
            AndroidUtilities.shakeViewSpring(g3Var, -6.0f);
        } else if ("AGENT_PROVIDER_UNAVAILABLE".equals(tL_error.text)) {
            wh.n(R.string.AgentProviderUnavailable, new wc(qVar.getContainer(), qVar.resourcesProvider), null);
        } else if ("AGENT_NOT_AVAILABLE".equals(tL_error.text)) {
            wh.n(R.string.AgentNotAvailable, new wc(qVar.getContainer(), qVar.resourcesProvider), null);
        } else {
            new wc(qVar.getContainer(), qVar.resourcesProvider).g0(tL_error, false);
        }
    }

    public final void R() {
        if (this.f13221p0 != null && !this.f13222q0) {
            String trim = this.f13218l0.getText().toString().trim();
            if (!TextUtils.isEmpty(trim)) {
                this.f13222q0 = true;
                String string = LocaleController.getString(R.string.AgentConnecting);
                fi.d dVar = this.f13220o0;
                dVar.i(string, true, true);
                dVar.setLoading(true);
                V();
                String str = this.f13221p0.f22238id;
                this.f13208b0.connect(str, trim, new ai.n1(16, this, str));
            }
        }
    }

    public final FrameLayout S(Context context, String str, l lVar) {
        float f7;
        int i10;
        FrameLayout frameLayout = new FrameLayout(context);
        if (lVar != null) {
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.ic_ab_back);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(y6.G6), PorterDuff.Mode.SRC_IN));
            imageView.setBackground(y6.g0(getThemedColor(y6.f23449i6), 1, -1));
            imageView.setOnClickListener(lVar);
            kb1.b(imageView);
            if (LocaleController.isRTL) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            frameLayout.addView(imageView, kb1.h(48, 48.0f, i10 | 16, 6.0f, 0.0f, 6.0f, 0.0f));
        }
        TextView g7 = org.telegram.messenger.t.g(context, 1, 20.0f);
        g7.setTypeface(AndroidUtilities.bold());
        g7.setTextColor(getThemedColor(y6.G6));
        g7.setSingleLine();
        g7.setEllipsize(TextUtils.TruncateAt.END);
        g7.setText(str);
        if (lVar != null) {
            f7 = 60.0f;
        } else {
            f7 = 22.0f;
        }
        frameLayout.addView(g7, kb1.h(-1, -2.0f, 23, f7, 0.0f, 22.0f, 0.0f));
        frameLayout.setMinimumHeight(AndroidUtilities.dp(56.0f));
        return frameLayout;
    }

    public final s71 T(Context context, Utilities.Callback2 callback2, e1.c cVar) {
        s71 s71Var = new s71(context, this.currentAccount, 0, true, callback2, cVar, null, this.resourcesProvider);
        s71Var.f32504g3.f29878r = false;
        s71Var.u1();
        s71Var.setNestedScrollingEnabled(false);
        s71Var.setOverScrollMode(2);
        s71Var.setItemAnimator(null);
        return s71Var;
    }

    public final void U(boolean z10) {
        float f7;
        ViewPropertyAnimator animate = this.f13217k0.animate();
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        wh.p(animate, f7, 220L);
    }

    public final void V() {
        boolean z10;
        if (!this.f13222q0 && !TextUtils.isEmpty(this.f13218l0.getText().toString().trim())) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f13220o0.setEnabled(z10);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.agentSettingsUpdated) {
            this.f13212f0.f32504g3.O(false);
        }
    }

    @Override
    public final void dismiss() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.agentSettingsUpdated);
        AndroidUtilities.hideKeyboard(this.f13218l0.d);
        super.dismiss();
    }

    @Override
    public final void onBackPressed() {
        p pVar = this.f13211e0;
        if (pVar.f13186b == 1 && !this.f13210d0) {
            if (this.f13222q0) {
                return;
            }
            AndroidUtilities.hideKeyboard(this.f13218l0.d);
            pVar.b(0, true);
            return;
        }
        super.onBackPressed();
    }

    @Override
    public final void show() {
        super.show();
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.agentSettingsUpdated);
    }
}
