package ei;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.text.TextPaint;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.lb;
import org.telegram.ui.Components.oi;
import org.telegram.ui.Components.wi;
import org.telegram.ui.Components.xc;
import org.telegram.ui.t31;
import org.telegram.ui.wn;
public final class q4 extends oi implements NotificationCenter.NotificationCenterDelegate {
    public long E;
    public int F;
    public String G;
    public boolean H;
    public k4 I;
    public a3 J;
    public org.telegram.ui.ActionBar.u0 K;
    public org.telegram.ui.ActionBar.e1 L;
    public org.telegram.ui.ActionBar.e1 M;
    public int N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public int R;
    public boolean S;
    public boolean T;
    public g4 U;
    public boolean V;
    public int W;
    public j4 f8552n;
    public ValueAnimator f8553r;
    public boolean f8554s;
    public long v;
    public long f8555w;
    public long f8556x;
    public int f8557y;

    @Override
    public final void E(oi oiVar) {
        j4 j4Var = this.f8552n;
        CharSequence userName = UserObject.getUserName(MessagesController.getInstance(this.F).getUser(Long.valueOf(this.v)));
        try {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(AndroidUtilities.dp(20.0f));
            userName = Emoji.replaceEmoji(userName, textPaint.getFontMetricsInt(), false);
        } catch (Exception unused) {
        }
        wi wiVar = this.f27087b;
        wiVar.X0.setTitle(userName);
        this.J.setSwipeOffsetY(0.0f);
        if (j4Var.getWebView() != null) {
            j4Var.getWebView().scrollTo(0, 0);
        }
        org.telegram.ui.ActionBar.m2 m2Var = wiVar.f30005f0;
        if (m2Var != null) {
            j4Var.setParentActivity(m2Var.getParentActivity());
        }
        this.K.setVisibility(0);
        if (!j4Var.R) {
            AndroidUtilities.updateImageViewImageAnimated(wiVar.X0.getBackButton(), R.drawable.ic_close_white);
        }
    }

    @Override
    public final void F() {
        if (this.f8552n.N) {
            L();
        }
        this.J.setSwipeOffsetAnimationDisallowed(false);
        AndroidUtilities.runOnUIThread(new g4(this, 0));
    }

    @Override
    public final void G() {
        a3 a3Var = this.J;
        a3Var.e(a3Var.getTopActionBarOffsetY() + (-a3Var.getOffsetY()));
    }

    public final boolean K() {
        String str;
        if (this.S) {
            TLRPC.User user = MessagesController.getInstance(this.F).getUser(Long.valueOf(this.v));
            if (user != null) {
                str = ContactsController.formatName(user.first_name, user.last_name);
            } else {
                str = null;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
            alertDialog$Builder.f18661a.R = str;
            alertDialog$Builder.f18661a.T = LocaleController.getString(R.string.BotWebViewChangesMayNotBeSaved);
            alertDialog$Builder.k(LocaleController.getString(R.string.BotWebViewCloseAnyway), new i4(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18661a;
            a2Var.show();
            ((TextView) a2Var.d(-1)).setTextColor(h6.v0(h6.f19298q7, this.f27086a));
            return false;
        }
        this.f27087b.dismiss();
        return true;
    }

    public final void L() {
        wi wiVar = this.f27087b;
        org.telegram.ui.ActionBar.m2 m2Var = wiVar.f30005f0;
        if ((m2Var instanceof wn) && ((wn) m2Var).X0.R() > AndroidUtilities.dp(20.0f)) {
            AndroidUtilities.hideKeyboard(wiVar.f30005f0.getFragmentView());
            AndroidUtilities.runOnUIThread(new g4(this, 1), 250L);
            return;
        }
        wiVar.getWindow().setSoftInputMode(20);
        setFocusable(true);
        wiVar.setFocusable(true);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        j4 j4Var = this.f8552n;
        if (i10 == NotificationCenter.webViewResultSent) {
            if (this.f8556x == ((Long) objArr[0]).longValue()) {
                j4Var.i();
                this.H = true;
                this.f27087b.dismiss();
            }
        } else if (i10 == NotificationCenter.didSetNewTheme) {
            j4Var.f39013n.b(h6.v0(h6.f19129h5, this.f27086a), 153);
        }
    }

    @Override
    public final boolean e() {
        return this.V;
    }

    @Override
    public final boolean f() {
        return this.Q;
    }

    @Override
    public int getButtonsHideOffset() {
        return AndroidUtilities.dp(12.0f) + ((int) this.J.getTopActionBarOffsetY());
    }

    @Override
    public int getCurrentItemTop() {
        a3 a3Var = this.J;
        return (int) (a3Var.getOffsetY() + a3Var.getSwipeOffsetY());
    }

    @Override
    public int getCustomActionBarBackground() {
        return this.W;
    }

    @Override
    public int getCustomBackground() {
        return this.R;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return (int) this.J.getOffsetY();
    }

    public String getStartCommand() {
        return this.G;
    }

    public org.telegram.ui.web.b1 getWebViewContainer() {
        return this.f8552n;
    }

    @Override
    public final int h() {
        return 1;
    }

    @Override
    public final boolean i() {
        if (this.f8552n.D()) {
            return true;
        }
        K();
        return true;
    }

    @Override
    public final void m() {
        NotificationCenter.getInstance(this.F).removeObserver(this, NotificationCenter.webViewResultSent);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewTheme);
        org.telegram.ui.ActionBar.y n10 = this.f27087b.X0.n();
        org.telegram.ui.ActionBar.u0 u0Var = this.K;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = u0Var.f19788b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        n10.removeView(u0Var);
        this.f8552n.i();
        this.T = true;
        AndroidUtilities.cancelRunOnUIThread(this.U);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (this.O) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override
    public final boolean p() {
        K();
        return false;
    }

    @Override
    public final void q() {
        wi wiVar = this.f27087b;
        wiVar.setFocusable(false);
        wiVar.getWindow().setSoftInputMode(48);
    }

    @Override
    public final void r() {
        this.K.setVisibility(8);
        this.P = false;
        j4 j4Var = this.f8552n;
        boolean z10 = j4Var.R;
        wi wiVar = this.f27087b;
        if (!z10) {
            AndroidUtilities.updateImageViewImageAnimated(wiVar.X0.getBackButton(), R.drawable.ic_ab_back);
        }
        wiVar.X0.setBackground(null);
        if (j4Var.T) {
            j4Var.i();
            this.H = true;
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f8554s) {
            return;
        }
        super.requestLayout();
    }

    public void setAllowSwipes(boolean z10) {
        this.J.setAllowSwipes(z10);
    }

    public void setCustomActionBarBackground(int i10) {
        this.V = true;
        this.W = i10;
    }

    public void setCustomBackground(int i10) {
        this.R = i10;
        this.Q = true;
    }

    public void setDelegate(org.telegram.ui.web.g0 g0Var) {
        this.f8552n.setDelegate(g0Var);
    }

    public void setMeasureOffsetY(int i10) {
        this.N = i10;
        this.J.requestLayout();
    }

    public void setNeedCloseConfirmation(boolean z10) {
        this.S = z10;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f27087b.getSheetContainer().invalidate();
    }

    @Override
    public final void t(int i10) {
        k4 k4Var = this.I;
        j4 j4Var = this.f8552n;
        if (i10 == -1) {
            if (!j4Var.D()) {
                K();
                return;
            }
            return;
        }
        int i11 = R.id.menu_open_bot;
        wi wiVar = this.f27087b;
        if (i10 == i11) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", this.v);
            wiVar.f30005f0.presentFragment(new wn(bundle));
            wiVar.dismiss();
            return;
        }
        int i12 = 0;
        if (i10 == R.id.menu_reload_page) {
            if (j4Var.getWebView() != null) {
                j4Var.getWebView().animate().cancel();
                j4Var.getWebView().animate().alpha(0.0f).start();
            }
            k4Var.setLoadProgress(0.0f);
            k4Var.setAlpha(1.0f);
            k4Var.setVisibility(0);
            j4Var.setBotUser(MessagesController.getInstance(this.F).getUser(Long.valueOf(this.v)));
            j4Var.t(this.F, this.v);
            NotificationCenter.getInstance(j4Var.M).doOnIdle(new org.telegram.ui.web.s(j4Var, 2));
        } else if (i10 == R.id.menu_delete_bot) {
            ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(this.F).getAttachMenuBots().bots;
            int size = arrayList.size();
            while (i12 < size) {
                TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList.get(i12);
                i12++;
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                if (tL_attachMenuBot2.bot_id == this.v) {
                    wiVar.w1(tL_attachMenuBot2, MessagesController.getInstance(this.F).getUser(Long.valueOf(this.v)));
                    return;
                }
            }
        } else if (i10 == R.id.menu_settings) {
            j4Var.getClass();
            j4Var.P = System.currentTimeMillis();
            j4Var.z("settings_button_pressed", null);
        } else if (i10 == R.id.menu_add_to_home_screen_bot) {
            MediaDataController.getInstance(this.F).installShortcut(this.v, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT);
        } else if (i10 == R.id.menu_tos_bot) {
            nf.f.s(getContext(), LocaleController.getString(R.string.BotWebViewToSLink));
        } else if (i10 == R.id.menu_report_bot) {
            int i13 = this.F;
            Context context = getContext();
            xc xcVar = new xc(lb.a(getContext()), this.f27086a);
            long j3 = this.v;
            int i14 = t31.v;
            t31.K(i13, context, j3, false, false, new ArrayList(), xcVar, null, new byte[0], null, null);
        }
    }

    @Override
    public final void v() {
        this.O = false;
        this.J.setSwipeOffsetAnimationDisallowed(false);
        this.f8552n.setViewPortByMeasureSuppressed(false);
        requestLayout();
    }

    @Override
    public final void w(int i10, boolean z10) {
        boolean z11;
        j4 j4Var = this.f8552n;
        a3 a3Var = this.J;
        if (z10) {
            j4Var.setViewPortByMeasureSuppressed(true);
            float topActionBarOffsetY = a3Var.getTopActionBarOffsetY() + (-a3Var.getOffsetY());
            if (a3Var.getSwipeOffsetY() != topActionBarOffsetY) {
                a3Var.e(topActionBarOffsetY);
                z11 = true;
            } else {
                z11 = false;
            }
            int R = this.f27087b.f30042r1.R() + i10;
            setMeasuredDimension(getMeasuredWidth(), i10);
            this.O = true;
            a3Var.setSwipeOffsetAnimationDisallowed(true);
            if (!z11) {
                ValueAnimator valueAnimator = this.f8553r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f8553r = null;
                }
                if (j4Var.getWebView() != null) {
                    int scrollY = j4Var.getWebView().getScrollY();
                    int i11 = (R - i10) + scrollY;
                    ValueAnimator duration = ValueAnimator.ofInt(scrollY, i11).setDuration(250L);
                    this.f8553r = duration;
                    duration.setInterpolator(ji.n.V);
                    this.f8553r.addUpdateListener(new h4(this, 1));
                    this.f8553r.addListener(new v2(this, i11, 1));
                    this.f8553r.start();
                }
            }
        }
    }

    @Override
    public final void y(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: ei.q4.y(int, int):void");
    }
}
