package gi;

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
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.lb;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.xc;
import org.telegram.ui.s21;
import org.telegram.ui.sn;
public final class f4 extends li implements NotificationCenter.NotificationCenterDelegate {
    public long E;
    public int F;
    public String G;
    public boolean H;
    public z3 I;
    public u2 J;
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
    public w3 U;
    public boolean V;
    public int W;
    public v2 f11230n;
    public ValueAnimator f11231r;
    public boolean f11232s;
    public long v;
    public long f11233w;
    public long f11234x;
    public int f11235y;

    @Override
    public final void B(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: gi.f4.B(int, int):void");
    }

    @Override
    public final void F(li liVar) {
        v2 v2Var = this.f11230n;
        CharSequence userName = UserObject.getUserName(MessagesController.getInstance(this.F).getUser(Long.valueOf(this.v)));
        try {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(AndroidUtilities.dp(20.0f));
            userName = Emoji.replaceEmoji(userName, textPaint.getFontMetricsInt(), false);
        } catch (Exception unused) {
        }
        ti tiVar = this.f28366b;
        tiVar.f30714a1.setTitle(userName);
        this.J.setSwipeOffsetY(0.0f);
        if (v2Var.getWebView() != null) {
            v2Var.getWebView().scrollTo(0, 0);
        }
        org.telegram.ui.ActionBar.o2 o2Var = tiVar.f30730f0;
        if (o2Var != null) {
            v2Var.setParentActivity(o2Var.getParentActivity());
        }
        this.K.setVisibility(0);
        if (!v2Var.R) {
            AndroidUtilities.updateImageViewImageAnimated(tiVar.f30714a1.getBackButton(), R.drawable.ic_close_white);
        }
    }

    @Override
    public final void I() {
        if (this.f11230n.N) {
            O();
        }
        this.J.setSwipeOffsetAnimationDisallowed(false);
        AndroidUtilities.runOnUIThread(new w3(this, 0));
    }

    @Override
    public final void J() {
        u2 u2Var = this.J;
        u2Var.e(u2Var.getTopActionBarOffsetY() + (-u2Var.getOffsetY()));
    }

    public final boolean N() {
        String str;
        if (this.S) {
            TLRPC.User user = MessagesController.getInstance(this.F).getUser(Long.valueOf(this.v));
            if (user != null) {
                str = ContactsController.formatName(user.first_name, user.last_name);
            } else {
                str = null;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
            alertDialog$Builder.f20678a.R = str;
            alertDialog$Builder.f20678a.T = LocaleController.getString(R.string.BotWebViewChangesMayNotBeSaved);
            alertDialog$Builder.k(LocaleController.getString(R.string.BotWebViewCloseAnyway), new y3(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
            c2Var.show();
            r6.W((TextView) c2Var.d(-1), k6.f21421q7, this.f28365a);
            return false;
        }
        this.f28366b.dismiss();
        return true;
    }

    public final void O() {
        ti tiVar = this.f28366b;
        org.telegram.ui.ActionBar.o2 o2Var = tiVar.f30730f0;
        if ((o2Var instanceof sn) && ((sn) o2Var).f41561j1.Q() > AndroidUtilities.dp(20.0f)) {
            AndroidUtilities.hideKeyboard(tiVar.f30730f0.getFragmentView());
            AndroidUtilities.runOnUIThread(new w3(this, 1), 250L);
            return;
        }
        tiVar.getWindow().setSoftInputMode(20);
        setFocusable(true);
        tiVar.setFocusable(true);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        v2 v2Var = this.f11230n;
        if (i10 == NotificationCenter.webViewResultSent) {
            if (this.f11234x == ((Long) objArr[0]).longValue()) {
                v2Var.h();
                this.H = true;
                this.f28366b.dismiss();
            }
        } else if (i10 == NotificationCenter.didSetNewTheme) {
            v2Var.f43059n.b(k6.w0(k6.f21254h5, this.f28365a), 153);
        }
    }

    @Override
    public final boolean f() {
        return this.V;
    }

    @Override
    public final boolean g() {
        return this.Q;
    }

    @Override
    public int getButtonsHideOffset() {
        return AndroidUtilities.dp(12.0f) + ((int) this.J.getTopActionBarOffsetY());
    }

    @Override
    public int getCurrentItemTop() {
        u2 u2Var = this.J;
        return (int) (u2Var.getOffsetY() + u2Var.getSwipeOffsetY());
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
        return this.f11230n;
    }

    @Override
    public final int i() {
        return 1;
    }

    @Override
    public final boolean j() {
        if (this.f11230n.C()) {
            return true;
        }
        N();
        return true;
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
    public final void p() {
        NotificationCenter.getInstance(this.F).removeObserver(this, NotificationCenter.webViewResultSent);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewTheme);
        org.telegram.ui.ActionBar.y m10 = this.f28366b.f30714a1.m();
        org.telegram.ui.ActionBar.u0 u0Var = this.K;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = u0Var.f21874b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        m10.removeView(u0Var);
        this.f11230n.h();
        this.T = true;
        AndroidUtilities.cancelRunOnUIThread(this.U);
    }

    @Override
    public final void requestLayout() {
        if (this.f11232s) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final boolean s() {
        N();
        return false;
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

    public void setDelegate(org.telegram.ui.web.h0 h0Var) {
        this.f11230n.setDelegate(h0Var);
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
        this.f28366b.getSheetContainer().invalidate();
    }

    @Override
    public final void t() {
        ti tiVar = this.f28366b;
        tiVar.setFocusable(false);
        tiVar.getWindow().setSoftInputMode(48);
    }

    @Override
    public final void u() {
        this.K.setVisibility(8);
        this.P = false;
        v2 v2Var = this.f11230n;
        boolean z10 = v2Var.R;
        ti tiVar = this.f28366b;
        if (!z10) {
            AndroidUtilities.updateImageViewImageAnimated(tiVar.f30714a1.getBackButton(), R.drawable.ic_ab_back);
        }
        tiVar.f30714a1.setBackground(null);
        if (v2Var.T) {
            v2Var.h();
            this.H = true;
        }
    }

    @Override
    public final void w(int i10) {
        z3 z3Var = this.I;
        v2 v2Var = this.f11230n;
        if (i10 == -1) {
            if (!v2Var.C()) {
                N();
                return;
            }
            return;
        }
        int i11 = R.id.menu_open_bot;
        ti tiVar = this.f28366b;
        if (i10 == i11) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", this.v);
            tiVar.f30730f0.presentFragment(new sn(bundle));
            tiVar.dismiss();
            return;
        }
        int i12 = 0;
        if (i10 == R.id.menu_reload_page) {
            if (v2Var.getWebView() != null) {
                v2Var.getWebView().animate().cancel();
                v2Var.getWebView().animate().alpha(0.0f).start();
            }
            z3Var.setLoadProgress(0.0f);
            z3Var.setAlpha(1.0f);
            z3Var.setVisibility(0);
            v2Var.setBotUser(MessagesController.getInstance(this.F).getUser(Long.valueOf(this.v)));
            v2Var.s(this.F, this.v);
            NotificationCenter.getInstance(v2Var.M).doOnIdle(new org.telegram.ui.web.t(v2Var, 2));
        } else if (i10 == R.id.menu_delete_bot) {
            ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(this.F).getAttachMenuBots().bots;
            int size = arrayList.size();
            while (i12 < size) {
                TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList.get(i12);
                i12++;
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                if (tL_attachMenuBot2.bot_id == this.v) {
                    tiVar.C1(tL_attachMenuBot2, MessagesController.getInstance(this.F).getUser(Long.valueOf(this.v)));
                    return;
                }
            }
        } else if (i10 == R.id.menu_settings) {
            v2Var.getClass();
            v2Var.P = System.currentTimeMillis();
            v2Var.y("settings_button_pressed", null);
        } else if (i10 == R.id.menu_add_to_home_screen_bot) {
            MediaDataController.getInstance(this.F).installShortcut(this.v, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT);
        } else if (i10 == R.id.menu_tos_bot) {
            pf.d.r(getContext(), LocaleController.getString(R.string.BotWebViewToSLink));
        } else if (i10 == R.id.menu_report_bot) {
            int i13 = this.F;
            Context context = getContext();
            xc xcVar = new xc(lb.a(getContext()), this.f28365a);
            long j10 = this.v;
            int i14 = s21.f41291w;
            s21.N(i13, context, j10, false, false, new ArrayList(), xcVar, null, new byte[0], null, null);
        }
    }

    @Override
    public final void y() {
        this.O = false;
        this.J.setSwipeOffsetAnimationDisallowed(false);
        this.f11230n.setViewPortByMeasureSuppressed(false);
        requestLayout();
    }

    @Override
    public final void z(int i10, boolean z10) {
        boolean z11;
        v2 v2Var = this.f11230n;
        u2 u2Var = this.J;
        if (z10) {
            v2Var.setViewPortByMeasureSuppressed(true);
            float topActionBarOffsetY = u2Var.getTopActionBarOffsetY() + (-u2Var.getOffsetY());
            if (u2Var.getSwipeOffsetY() != topActionBarOffsetY) {
                u2Var.e(topActionBarOffsetY);
                z11 = true;
            } else {
                z11 = false;
            }
            int Q = this.f28366b.f30777u1.Q() + i10;
            setMeasuredDimension(getMeasuredWidth(), i10);
            this.O = true;
            u2Var.setSwipeOffsetAnimationDisallowed(true);
            if (!z11) {
                ValueAnimator valueAnimator = this.f11231r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f11231r = null;
                }
                if (v2Var.getWebView() != null) {
                    int scrollY = v2Var.getWebView().getScrollY();
                    int i11 = (Q - i10) + scrollY;
                    ValueAnimator duration = ValueAnimator.ofInt(scrollY, i11).setDuration(250L);
                    this.f11231r = duration;
                    duration.setInterpolator(li.m.V);
                    this.f11231r.addUpdateListener(new x3(this, 1));
                    this.f11231r.addListener(new p2(this, i11, 1));
                    this.f11231r.start();
                }
            }
        }
    }
}
