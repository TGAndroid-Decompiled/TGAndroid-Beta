package fi;

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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.lb;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.yc;
import org.telegram.ui.co;
import org.telegram.ui.e41;
public final class r4 extends ni implements NotificationCenter.NotificationCenterDelegate {
    public long E;
    public int F;
    public String G;
    public boolean H;
    public l4 I;
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
    public k4 f9930n;
    public ValueAnimator f9931r;
    public boolean f9932s;
    public long v;
    public long f9933w;
    public long f9934x;
    public int f9935y;

    @Override
    public final void D(ni niVar) {
        k4 k4Var = this.f9930n;
        CharSequence userName = UserObject.getUserName(MessagesController.getInstance(this.F).getUser(Long.valueOf(this.v)));
        try {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(AndroidUtilities.dp(20.0f));
            userName = Emoji.replaceEmoji(userName, textPaint.getFontMetricsInt(), false);
        } catch (Exception unused) {
        }
        vi viVar = this.f28753b;
        viVar.X0.setTitle(userName);
        this.J.setSwipeOffsetY(0.0f);
        if (k4Var.getWebView() != null) {
            k4Var.getWebView().scrollTo(0, 0);
        }
        org.telegram.ui.ActionBar.n2 n2Var = viVar.f31279f0;
        if (n2Var != null) {
            k4Var.setParentActivity(n2Var.getParentActivity());
        }
        this.K.setVisibility(0);
        if (!k4Var.R) {
            AndroidUtilities.updateImageViewImageAnimated(viVar.X0.getBackButton(), R.drawable.ic_close_white);
        }
    }

    @Override
    public final void F() {
        if (this.f9930n.N) {
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
            alertDialog$Builder.f20198a.R = str;
            alertDialog$Builder.f20198a.T = LocaleController.getString(R.string.BotWebViewChangesMayNotBeSaved);
            alertDialog$Builder.k(LocaleController.getString(R.string.BotWebViewCloseAnyway), new i4(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20198a;
            b2Var.show();
            ((TextView) b2Var.d(-1)).setTextColor(j6.v0(j6.f20898q7, this.f28752a));
            return false;
        }
        this.f28753b.dismiss();
        return true;
    }

    public final void L() {
        vi viVar = this.f28753b;
        org.telegram.ui.ActionBar.n2 n2Var = viVar.f31279f0;
        if ((n2Var instanceof co) && ((co) n2Var).X0.R() > AndroidUtilities.dp(20.0f)) {
            AndroidUtilities.hideKeyboard(viVar.f31279f0.getFragmentView());
            AndroidUtilities.runOnUIThread(new g4(this, 1), 250L);
            return;
        }
        viVar.getWindow().setSoftInputMode(20);
        setFocusable(true);
        viVar.setFocusable(true);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        k4 k4Var = this.f9930n;
        if (i10 == NotificationCenter.webViewResultSent) {
            if (this.f9934x == ((Long) objArr[0]).longValue()) {
                k4Var.i();
                this.H = true;
                this.f28753b.dismiss();
            }
        } else if (i10 == NotificationCenter.didSetNewTheme) {
            k4Var.f42052n.b(j6.v0(j6.f20734h5, this.f28752a), 153);
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

    public org.telegram.ui.web.d1 getWebViewContainer() {
        return this.f9930n;
    }

    @Override
    public final int h() {
        return 1;
    }

    @Override
    public final boolean i() {
        if (this.f9930n.D()) {
            return true;
        }
        K();
        return true;
    }

    @Override
    public final void m() {
        NotificationCenter.getInstance(this.F).removeObserver(this, NotificationCenter.webViewResultSent);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewTheme);
        org.telegram.ui.ActionBar.z n10 = this.f28753b.X0.n();
        org.telegram.ui.ActionBar.v0 v0Var = this.K;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = v0Var.f21378b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        n10.removeView(v0Var);
        this.f9930n.i();
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
        vi viVar = this.f28753b;
        viVar.setFocusable(false);
        viVar.getWindow().setSoftInputMode(48);
    }

    @Override
    public final void r() {
        this.K.setVisibility(8);
        this.P = false;
        k4 k4Var = this.f9930n;
        boolean z10 = k4Var.R;
        vi viVar = this.f28753b;
        if (!z10) {
            AndroidUtilities.updateImageViewImageAnimated(viVar.X0.getBackButton(), R.drawable.ic_ab_back);
        }
        viVar.X0.setBackground(null);
        if (k4Var.T) {
            k4Var.i();
            this.H = true;
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f9932s) {
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

    public void setDelegate(org.telegram.ui.web.i0 i0Var) {
        this.f9930n.setDelegate(i0Var);
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
        this.f28753b.getSheetContainer().invalidate();
    }

    @Override
    public final void t(int i10) {
        l4 l4Var = this.I;
        k4 k4Var = this.f9930n;
        if (i10 == -1) {
            if (!k4Var.D()) {
                K();
                return;
            }
            return;
        }
        int i11 = R.id.menu_open_bot;
        vi viVar = this.f28753b;
        if (i10 == i11) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", this.v);
            viVar.f31279f0.presentFragment(new co(bundle));
            viVar.dismiss();
            return;
        }
        int i12 = 0;
        if (i10 == R.id.menu_reload_page) {
            if (k4Var.getWebView() != null) {
                k4Var.getWebView().animate().cancel();
                k4Var.getWebView().animate().alpha(0.0f).start();
            }
            l4Var.setLoadProgress(0.0f);
            l4Var.setAlpha(1.0f);
            l4Var.setVisibility(0);
            k4Var.setBotUser(MessagesController.getInstance(this.F).getUser(Long.valueOf(this.v)));
            k4Var.t(this.F, this.v);
            NotificationCenter.getInstance(k4Var.M).doOnIdle(new org.telegram.ui.web.u(k4Var, 2));
        } else if (i10 == R.id.menu_delete_bot) {
            ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(this.F).getAttachMenuBots().bots;
            int size = arrayList.size();
            while (i12 < size) {
                TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList.get(i12);
                i12++;
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                if (tL_attachMenuBot2.bot_id == this.v) {
                    viVar.w1(tL_attachMenuBot2, MessagesController.getInstance(this.F).getUser(Long.valueOf(this.v)));
                    return;
                }
            }
        } else if (i10 == R.id.menu_settings) {
            k4Var.getClass();
            k4Var.P = System.currentTimeMillis();
            k4Var.z("settings_button_pressed", null);
        } else if (i10 == R.id.menu_add_to_home_screen_bot) {
            MediaDataController.getInstance(this.F).installShortcut(this.v, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT);
        } else if (i10 == R.id.menu_tos_bot) {
            of.f.s(getContext(), LocaleController.getString(R.string.BotWebViewToSLink));
        } else if (i10 == R.id.menu_report_bot) {
            int i13 = this.F;
            Context context = getContext();
            yc ycVar = new yc(lb.a(getContext()), this.f28752a);
            long j3 = this.v;
            int i14 = e41.v;
            e41.K(i13, context, j3, false, false, new ArrayList(), ycVar, null, new byte[0], null, null);
        }
    }

    @Override
    public final void v() {
        this.O = false;
        this.J.setSwipeOffsetAnimationDisallowed(false);
        this.f9930n.setViewPortByMeasureSuppressed(false);
        requestLayout();
    }

    @Override
    public final void w(int i10, boolean z10) {
        boolean z11;
        k4 k4Var = this.f9930n;
        a3 a3Var = this.J;
        if (z10) {
            k4Var.setViewPortByMeasureSuppressed(true);
            float topActionBarOffsetY = a3Var.getTopActionBarOffsetY() + (-a3Var.getOffsetY());
            if (a3Var.getSwipeOffsetY() != topActionBarOffsetY) {
                a3Var.e(topActionBarOffsetY);
                z11 = true;
            } else {
                z11 = false;
            }
            int R = this.f28753b.f31316r1.R() + i10;
            setMeasuredDimension(getMeasuredWidth(), i10);
            this.O = true;
            a3Var.setSwipeOffsetAnimationDisallowed(true);
            if (!z11) {
                ValueAnimator valueAnimator = this.f9931r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f9931r = null;
                }
                if (k4Var.getWebView() != null) {
                    int scrollY = k4Var.getWebView().getScrollY();
                    int i11 = (R - i10) + scrollY;
                    ValueAnimator duration = ValueAnimator.ofInt(scrollY, i11).setDuration(250L);
                    this.f9931r = duration;
                    duration.setInterpolator(ki.o.V);
                    this.f9931r.addUpdateListener(new h4(this, 1));
                    this.f9931r.addListener(new v2(this, i11, 1));
                    this.f9931r.start();
                }
            }
        }
    }

    @Override
    public final void y(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: fi.r4.y(int, int):void");
    }
}
