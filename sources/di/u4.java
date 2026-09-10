package di;

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
import org.telegram.ui.Components.kb;
import org.telegram.ui.Components.qi;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.yi;
import org.telegram.ui.eo;
import org.telegram.ui.h41;
public final class u4 extends qi implements NotificationCenter.NotificationCenterDelegate {
    public long E;
    public int F;
    public String G;
    public boolean H;
    public o4 I;
    public d3 J;
    public org.telegram.ui.ActionBar.w0 K;
    public org.telegram.ui.ActionBar.g1 L;
    public org.telegram.ui.ActionBar.g1 M;
    public int N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public int R;
    public boolean S;
    public boolean T;
    public j4 U;
    public boolean V;
    public int W;
    public n4 f6947n;
    public ValueAnimator f6948r;
    public boolean f6949s;
    public long v;
    public long f6950w;
    public long f6951x;
    public int f6952y;

    @Override
    public final void D(qi qiVar) {
        n4 n4Var = this.f6947n;
        CharSequence userName = UserObject.getUserName(MessagesController.getInstance(this.F).getUser(Long.valueOf(this.v)));
        try {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(AndroidUtilities.dp(20.0f));
            userName = Emoji.replaceEmoji(userName, textPaint.getFontMetricsInt(), false);
        } catch (Exception unused) {
        }
        yi yiVar = this.f26422b;
        yiVar.X0.setTitle(userName);
        this.J.setSwipeOffsetY(0.0f);
        if (n4Var.getWebView() != null) {
            n4Var.getWebView().scrollTo(0, 0);
        }
        org.telegram.ui.ActionBar.p2 p2Var = yiVar.f29366f0;
        if (p2Var != null) {
            n4Var.setParentActivity(p2Var.getParentActivity());
        }
        this.K.setVisibility(0);
        if (!n4Var.R) {
            AndroidUtilities.updateImageViewImageAnimated(yiVar.X0.getBackButton(), R.drawable.ic_close_white);
        }
    }

    @Override
    public final void E() {
        if (this.f6947n.N) {
            L();
        }
        this.J.setSwipeOffsetAnimationDisallowed(false);
        AndroidUtilities.runOnUIThread(new j4(this, 0));
    }

    @Override
    public final void F() {
        d3 d3Var = this.J;
        d3Var.e(d3Var.getTopActionBarOffsetY() + (-d3Var.getOffsetY()));
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
            alertDialog$Builder.f17528a.R = str;
            alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.BotWebViewChangesMayNotBeSaved);
            alertDialog$Builder.k(LocaleController.getString(R.string.BotWebViewCloseAnyway), new m4(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
            d2Var.show();
            ((TextView) d2Var.d(-1)).setTextColor(j6.v0(j6.f18162q7, this.f26421a));
            return false;
        }
        this.f26422b.dismiss();
        return true;
    }

    public final void L() {
        yi yiVar = this.f26422b;
        org.telegram.ui.ActionBar.p2 p2Var = yiVar.f29366f0;
        if ((p2Var instanceof eo) && ((eo) p2Var).X0.R() > AndroidUtilities.dp(20.0f)) {
            AndroidUtilities.hideKeyboard(yiVar.f29366f0.getFragmentView());
            AndroidUtilities.runOnUIThread(new j4(this, 1), 250L);
            return;
        }
        yiVar.getWindow().setSoftInputMode(20);
        setFocusable(true);
        yiVar.setFocusable(true);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        n4 n4Var = this.f6947n;
        if (i10 == NotificationCenter.webViewResultSent) {
            if (this.f6951x == ((Long) objArr[0]).longValue()) {
                n4Var.i();
                this.H = true;
                this.f26422b.dismiss();
            }
        } else if (i10 == NotificationCenter.didSetNewTheme) {
            n4Var.f37892n.b(j6.v0(j6.f17998h5, this.f26421a), 153);
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
        d3 d3Var = this.J;
        return (int) (d3Var.getOffsetY() + d3Var.getSwipeOffsetY());
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

    public org.telegram.ui.web.c1 getWebViewContainer() {
        return this.f6947n;
    }

    @Override
    public final int h() {
        return 1;
    }

    @Override
    public final boolean i() {
        if (this.f6947n.D()) {
            return true;
        }
        K();
        return true;
    }

    @Override
    public final void m() {
        NotificationCenter.getInstance(this.F).removeObserver(this, NotificationCenter.webViewResultSent);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewTheme);
        org.telegram.ui.ActionBar.z n10 = this.f26422b.X0.n();
        org.telegram.ui.ActionBar.w0 w0Var = this.K;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = w0Var.f18686b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        n10.removeView(w0Var);
        this.f6947n.i();
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
        yi yiVar = this.f26422b;
        yiVar.setFocusable(false);
        yiVar.getWindow().setSoftInputMode(48);
    }

    @Override
    public final void r() {
        this.K.setVisibility(8);
        this.P = false;
        n4 n4Var = this.f6947n;
        boolean z10 = n4Var.R;
        yi yiVar = this.f26422b;
        if (!z10) {
            AndroidUtilities.updateImageViewImageAnimated(yiVar.X0.getBackButton(), R.drawable.ic_ab_back);
        }
        yiVar.X0.setBackground(null);
        if (n4Var.T) {
            n4Var.i();
            this.H = true;
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f6949s) {
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

    public void setDelegate(org.telegram.ui.web.h0 h0Var) {
        this.f6947n.setDelegate(h0Var);
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
        this.f26422b.getSheetContainer().invalidate();
    }

    @Override
    public final void t(int i10) {
        o4 o4Var = this.I;
        n4 n4Var = this.f6947n;
        if (i10 == -1) {
            if (!n4Var.D()) {
                K();
                return;
            }
            return;
        }
        int i11 = R.id.menu_open_bot;
        yi yiVar = this.f26422b;
        if (i10 == i11) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", this.v);
            yiVar.f29366f0.presentFragment(new eo(bundle));
            yiVar.dismiss();
            return;
        }
        int i12 = 0;
        if (i10 == R.id.menu_reload_page) {
            if (n4Var.getWebView() != null) {
                n4Var.getWebView().animate().cancel();
                n4Var.getWebView().animate().alpha(0.0f).start();
            }
            o4Var.setLoadProgress(0.0f);
            o4Var.setAlpha(1.0f);
            o4Var.setVisibility(0);
            n4Var.setBotUser(MessagesController.getInstance(this.F).getUser(Long.valueOf(this.v)));
            n4Var.t(this.F, this.v);
            NotificationCenter.getInstance(n4Var.M).doOnIdle(new org.telegram.ui.web.t(n4Var, 2));
        } else if (i10 == R.id.menu_delete_bot) {
            ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(this.F).getAttachMenuBots().bots;
            int size = arrayList.size();
            while (i12 < size) {
                TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList.get(i12);
                i12++;
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                if (tL_attachMenuBot2.bot_id == this.v) {
                    yiVar.w1(tL_attachMenuBot2, MessagesController.getInstance(this.F).getUser(Long.valueOf(this.v)));
                    return;
                }
            }
        } else if (i10 == R.id.menu_settings) {
            n4Var.getClass();
            n4Var.P = System.currentTimeMillis();
            n4Var.y("settings_button_pressed", null);
        } else if (i10 == R.id.menu_add_to_home_screen_bot) {
            MediaDataController.getInstance(this.F).installShortcut(this.v, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT);
        } else if (i10 == R.id.menu_tos_bot) {
            nf.f.s(getContext(), LocaleController.getString(R.string.BotWebViewToSLink));
        } else if (i10 == R.id.menu_report_bot) {
            int i13 = this.F;
            Context context = getContext();
            wc wcVar = new wc(kb.a(getContext()), this.f26421a);
            long j3 = this.v;
            int i14 = h41.v;
            h41.K(i13, context, j3, false, false, new ArrayList(), wcVar, null, new byte[0], null, null);
        }
    }

    @Override
    public final void v() {
        this.O = false;
        this.J.setSwipeOffsetAnimationDisallowed(false);
        this.f6947n.setViewPortByMeasureSuppressed(false);
        requestLayout();
    }

    @Override
    public final void w(int i10, boolean z10) {
        boolean z11;
        n4 n4Var = this.f6947n;
        d3 d3Var = this.J;
        if (z10) {
            n4Var.setViewPortByMeasureSuppressed(true);
            float topActionBarOffsetY = d3Var.getTopActionBarOffsetY() + (-d3Var.getOffsetY());
            if (d3Var.getSwipeOffsetY() != topActionBarOffsetY) {
                d3Var.e(topActionBarOffsetY);
                z11 = true;
            } else {
                z11 = false;
            }
            int R = this.f26422b.f29403r1.R() + i10;
            setMeasuredDimension(getMeasuredWidth(), i10);
            this.O = true;
            d3Var.setSwipeOffsetAnimationDisallowed(true);
            if (!z11) {
                ValueAnimator valueAnimator = this.f6948r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f6948r = null;
                }
                if (n4Var.getWebView() != null) {
                    int scrollY = n4Var.getWebView().getScrollY();
                    int i11 = (R - i10) + scrollY;
                    ValueAnimator duration = ValueAnimator.ofInt(scrollY, i11).setDuration(250L);
                    this.f6948r = duration;
                    duration.setInterpolator(ii.n.V);
                    this.f6948r.addUpdateListener(new l4(this, 1));
                    this.f6948r.addListener(new y2(this, i11, 1));
                    this.f6948r.start();
                }
            }
        }
    }

    @Override
    public final void y(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: di.u4.y(int, int):void");
    }
}
