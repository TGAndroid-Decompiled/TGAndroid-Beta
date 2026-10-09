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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.ob;
import org.telegram.ui.Components.qi;
import org.telegram.ui.Components.yi;
import org.telegram.ui.c41;
import org.telegram.ui.zn;
public final class p4 extends qi implements NotificationCenter.NotificationCenterDelegate {
    public long E;
    public int F;
    public String G;
    public boolean H;
    public j4 I;
    public a3 J;
    public org.telegram.ui.ActionBar.v0 K;
    public org.telegram.ui.ActionBar.f1 L;
    public org.telegram.ui.ActionBar.f1 M;
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
    public b3 f9292n;
    public ValueAnimator f9293r;
    public boolean f9294s;
    public long v;
    public long f9295w;
    public long f9296x;
    public int f9297y;

    @Override
    public final void C(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: ei.p4.C(int, int):void");
    }

    @Override
    public final void G(qi qiVar) {
        b3 b3Var = this.f9292n;
        CharSequence userName = UserObject.getUserName(MessagesController.getInstance(this.F).getUser(Long.valueOf(this.v)));
        try {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(AndroidUtilities.dp(20.0f));
            userName = Emoji.replaceEmoji(userName, textPaint.getFontMetricsInt(), false);
        } catch (Exception unused) {
        }
        yi yiVar = this.f30173b;
        yiVar.f33211a1.setTitle(userName);
        this.J.setSwipeOffsetY(0.0f);
        if (b3Var.getWebView() != null) {
            b3Var.getWebView().scrollTo(0, 0);
        }
        org.telegram.ui.ActionBar.n2 n2Var = yiVar.f33228f0;
        if (n2Var != null) {
            b3Var.setParentActivity(n2Var.getParentActivity());
        }
        this.K.setVisibility(0);
        if (!b3Var.R) {
            AndroidUtilities.updateImageViewImageAnimated(yiVar.f33211a1.getBackButton(), R.drawable.ic_close_white);
        }
    }

    @Override
    public final void I() {
        if (this.f9292n.N) {
            O();
        }
        this.J.setSwipeOffsetAnimationDisallowed(false);
        AndroidUtilities.runOnUIThread(new g4(this, 0));
    }

    @Override
    public final void J() {
        a3 a3Var = this.J;
        a3Var.e(a3Var.getTopActionBarOffsetY() + (-a3Var.getOffsetY()));
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
            alertDialog$Builder.f20374a.R = str;
            alertDialog$Builder.f20374a.T = LocaleController.getString(R.string.BotWebViewChangesMayNotBeSaved);
            alertDialog$Builder.k(LocaleController.getString(R.string.BotWebViewCloseAnyway), new i4(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20374a;
            b2Var.show();
            ((TextView) b2Var.d(-1)).setTextColor(i6.w0(i6.f21037q7, this.f30172a));
            return false;
        }
        this.f30173b.dismiss();
        return true;
    }

    public final void O() {
        yi yiVar = this.f30173b;
        org.telegram.ui.ActionBar.n2 n2Var = yiVar.f33228f0;
        if ((n2Var instanceof zn) && ((zn) n2Var).X0.R() > AndroidUtilities.dp(20.0f)) {
            AndroidUtilities.hideKeyboard(yiVar.f33228f0.getFragmentView());
            AndroidUtilities.runOnUIThread(new g4(this, 1), 250L);
            return;
        }
        yiVar.getWindow().setSoftInputMode(20);
        setFocusable(true);
        yiVar.setFocusable(true);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        b3 b3Var = this.f9292n;
        if (i10 == NotificationCenter.webViewResultSent) {
            if (this.f9296x == ((Long) objArr[0]).longValue()) {
                b3Var.h();
                this.H = true;
                this.f30173b.dismiss();
            }
        } else if (i10 == NotificationCenter.didSetNewTheme) {
            b3Var.f43254n.b(i6.w0(i6.f20868h5, this.f30172a), 153);
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
        return this.f9292n;
    }

    @Override
    public final int i() {
        return 1;
    }

    @Override
    public final boolean j() {
        if (this.f9292n.C()) {
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
        org.telegram.ui.ActionBar.z o9 = this.f30173b.f33211a1.o();
        org.telegram.ui.ActionBar.v0 v0Var = this.K;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = v0Var.f21579b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        o9.removeView(v0Var);
        this.f9292n.h();
        this.T = true;
        AndroidUtilities.cancelRunOnUIThread(this.U);
    }

    @Override
    public final void requestLayout() {
        if (this.f9294s) {
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

    public void setDelegate(org.telegram.ui.web.g0 g0Var) {
        this.f9292n.setDelegate(g0Var);
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
        this.f30173b.getSheetContainer().invalidate();
    }

    @Override
    public final void t() {
        yi yiVar = this.f30173b;
        yiVar.setFocusable(false);
        yiVar.getWindow().setSoftInputMode(48);
    }

    @Override
    public final void u() {
        this.K.setVisibility(8);
        this.P = false;
        b3 b3Var = this.f9292n;
        boolean z10 = b3Var.R;
        yi yiVar = this.f30173b;
        if (!z10) {
            AndroidUtilities.updateImageViewImageAnimated(yiVar.f33211a1.getBackButton(), R.drawable.ic_ab_back);
        }
        yiVar.f33211a1.setBackground(null);
        if (b3Var.T) {
            b3Var.h();
            this.H = true;
        }
    }

    @Override
    public final void w(int i10) {
        j4 j4Var = this.I;
        b3 b3Var = this.f9292n;
        if (i10 == -1) {
            if (!b3Var.C()) {
                N();
                return;
            }
            return;
        }
        int i11 = R.id.menu_open_bot;
        yi yiVar = this.f30173b;
        if (i10 == i11) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", this.v);
            yiVar.f33228f0.presentFragment(new zn(bundle));
            yiVar.dismiss();
            return;
        }
        int i12 = 0;
        if (i10 == R.id.menu_reload_page) {
            if (b3Var.getWebView() != null) {
                b3Var.getWebView().animate().cancel();
                b3Var.getWebView().animate().alpha(0.0f).start();
            }
            j4Var.setLoadProgress(0.0f);
            j4Var.setAlpha(1.0f);
            j4Var.setVisibility(0);
            b3Var.setBotUser(MessagesController.getInstance(this.F).getUser(Long.valueOf(this.v)));
            b3Var.s(this.F, this.v);
            NotificationCenter.getInstance(b3Var.M).doOnIdle(new org.telegram.ui.web.s(b3Var, 2));
        } else if (i10 == R.id.menu_delete_bot) {
            ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(this.F).getAttachMenuBots().bots;
            int size = arrayList.size();
            while (i12 < size) {
                TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList.get(i12);
                i12++;
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                if (tL_attachMenuBot2.bot_id == this.v) {
                    yiVar.z1(tL_attachMenuBot2, MessagesController.getInstance(this.F).getUser(Long.valueOf(this.v)));
                    return;
                }
            }
        } else if (i10 == R.id.menu_settings) {
            b3Var.getClass();
            b3Var.P = System.currentTimeMillis();
            b3Var.y("settings_button_pressed", null);
        } else if (i10 == R.id.menu_add_to_home_screen_bot) {
            MediaDataController.getInstance(this.F).installShortcut(this.v, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT);
        } else if (i10 == R.id.menu_tos_bot) {
            of.f.s(getContext(), LocaleController.getString(R.string.BotWebViewToSLink));
        } else if (i10 == R.id.menu_report_bot) {
            int i13 = this.F;
            Context context = getContext();
            ad adVar = new ad(ob.a(getContext()), this.f30172a);
            long j3 = this.v;
            int i14 = c41.v;
            c41.L(i13, context, j3, false, false, new ArrayList(), adVar, null, new byte[0], null, null);
        }
    }

    @Override
    public final void y() {
        this.O = false;
        this.J.setSwipeOffsetAnimationDisallowed(false);
        this.f9292n.setViewPortByMeasureSuppressed(false);
        requestLayout();
    }

    @Override
    public final void z(int i10, boolean z10) {
        boolean z11;
        b3 b3Var = this.f9292n;
        a3 a3Var = this.J;
        if (z10) {
            b3Var.setViewPortByMeasureSuppressed(true);
            float topActionBarOffsetY = a3Var.getTopActionBarOffsetY() + (-a3Var.getOffsetY());
            if (a3Var.getSwipeOffsetY() != topActionBarOffsetY) {
                a3Var.e(topActionBarOffsetY);
                z11 = true;
            } else {
                z11 = false;
            }
            int R = this.f30173b.f33275u1.R() + i10;
            setMeasuredDimension(getMeasuredWidth(), i10);
            this.O = true;
            a3Var.setSwipeOffsetAnimationDisallowed(true);
            if (!z11) {
                ValueAnimator valueAnimator = this.f9293r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f9293r = null;
                }
                if (b3Var.getWebView() != null) {
                    int scrollY = b3Var.getWebView().getScrollY();
                    int i11 = (R - i10) + scrollY;
                    ValueAnimator duration = ValueAnimator.ofInt(scrollY, i11).setDuration(250L);
                    this.f9293r = duration;
                    duration.setInterpolator(ji.n.V);
                    this.f9293r.addUpdateListener(new h4(this, 1));
                    this.f9293r.addListener(new v2(this, i11, 1));
                    this.f9293r.start();
                }
            }
        }
    }
}
