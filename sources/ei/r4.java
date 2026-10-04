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
import org.telegram.ui.Components.mb;
import org.telegram.ui.Components.pi;
import org.telegram.ui.Components.xi;
import org.telegram.ui.Components.yc;
import org.telegram.ui.v31;
import org.telegram.ui.yn;
public final class r4 extends pi implements NotificationCenter.NotificationCenterDelegate {
    public long E;
    public int F;
    public String G;
    public boolean H;
    public l4 I;
    public b3 J;
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
    public h4 U;
    public boolean V;
    public int W;
    public k4 f9307n;
    public ValueAnimator f9308r;
    public boolean f9309s;
    public long v;
    public long f9310w;
    public long f9311x;
    public int f9312y;

    @Override
    public final void C(pi piVar) {
        k4 k4Var = this.f9307n;
        CharSequence userName = UserObject.getUserName(MessagesController.getInstance(this.F).getUser(Long.valueOf(this.v)));
        try {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(AndroidUtilities.dp(20.0f));
            userName = Emoji.replaceEmoji(userName, textPaint.getFontMetricsInt(), false);
        } catch (Exception unused) {
        }
        xi xiVar = this.f29648b;
        xiVar.X0.setTitle(userName);
        this.J.setSwipeOffsetY(0.0f);
        if (k4Var.getWebView() != null) {
            k4Var.getWebView().scrollTo(0, 0);
        }
        org.telegram.ui.ActionBar.n2 n2Var = xiVar.f32819f0;
        if (n2Var != null) {
            k4Var.setParentActivity(n2Var.getParentActivity());
        }
        this.K.setVisibility(0);
        if (!k4Var.R) {
            AndroidUtilities.updateImageViewImageAnimated(xiVar.X0.getBackButton(), R.drawable.ic_close_white);
        }
    }

    @Override
    public final void D() {
        if (this.f9307n.N) {
            J();
        }
        this.J.setSwipeOffsetAnimationDisallowed(false);
        AndroidUtilities.runOnUIThread(new h4(this, 0));
    }

    @Override
    public final void E() {
        b3 b3Var = this.J;
        b3Var.e(b3Var.getTopActionBarOffsetY() + (-b3Var.getOffsetY()));
    }

    public final boolean I() {
        String str;
        if (this.S) {
            TLRPC.User user = MessagesController.getInstance(this.F).getUser(Long.valueOf(this.v));
            if (user != null) {
                str = ContactsController.formatName(user.first_name, user.last_name);
            } else {
                str = null;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
            alertDialog$Builder.f20372a.R = str;
            alertDialog$Builder.f20372a.T = LocaleController.getString(R.string.BotWebViewChangesMayNotBeSaved);
            alertDialog$Builder.k(LocaleController.getString(R.string.BotWebViewCloseAnyway), new j4(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20372a;
            b2Var.show();
            ((TextView) b2Var.d(-1)).setTextColor(i6.v0(i6.f21063q7, this.f29647a));
            return false;
        }
        this.f29648b.dismiss();
        return true;
    }

    public final void J() {
        xi xiVar = this.f29648b;
        org.telegram.ui.ActionBar.n2 n2Var = xiVar.f32819f0;
        if ((n2Var instanceof yn) && ((yn) n2Var).V0.R() > AndroidUtilities.dp(20.0f)) {
            AndroidUtilities.hideKeyboard(xiVar.f32819f0.getFragmentView());
            AndroidUtilities.runOnUIThread(new h4(this, 1), 250L);
            return;
        }
        xiVar.getWindow().setSoftInputMode(20);
        setFocusable(true);
        xiVar.setFocusable(true);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        k4 k4Var = this.f9307n;
        if (i10 == NotificationCenter.webViewResultSent) {
            if (this.f9311x == ((Long) objArr[0]).longValue()) {
                k4Var.i();
                this.H = true;
                this.f29648b.dismiss();
            }
        } else if (i10 == NotificationCenter.didSetNewTheme) {
            k4Var.f42143n.b(i6.v0(i6.f20894h5, this.f29647a), 153);
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
        b3 b3Var = this.J;
        return (int) (b3Var.getOffsetY() + b3Var.getSwipeOffsetY());
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
        return this.f9307n;
    }

    @Override
    public final int h() {
        return 1;
    }

    @Override
    public final boolean i() {
        if (this.f9307n.D()) {
            return true;
        }
        I();
        return true;
    }

    @Override
    public final void m() {
        NotificationCenter.getInstance(this.F).removeObserver(this, NotificationCenter.webViewResultSent);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewTheme);
        org.telegram.ui.ActionBar.z n10 = this.f29648b.X0.n();
        org.telegram.ui.ActionBar.v0 v0Var = this.K;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = v0Var.f21575b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        n10.removeView(v0Var);
        this.f9307n.i();
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
        I();
        return false;
    }

    @Override
    public final void q() {
        xi xiVar = this.f29648b;
        xiVar.setFocusable(false);
        xiVar.getWindow().setSoftInputMode(48);
    }

    @Override
    public final void r() {
        this.K.setVisibility(8);
        this.P = false;
        k4 k4Var = this.f9307n;
        boolean z10 = k4Var.R;
        xi xiVar = this.f29648b;
        if (!z10) {
            AndroidUtilities.updateImageViewImageAnimated(xiVar.X0.getBackButton(), R.drawable.ic_ab_back);
        }
        xiVar.X0.setBackground(null);
        if (k4Var.T) {
            k4Var.i();
            this.H = true;
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f9309s) {
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
        this.f9307n.setDelegate(h0Var);
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
        this.f29648b.getSheetContainer().invalidate();
    }

    @Override
    public final void t(int i10) {
        l4 l4Var = this.I;
        k4 k4Var = this.f9307n;
        if (i10 == -1) {
            if (!k4Var.D()) {
                I();
                return;
            }
            return;
        }
        int i11 = R.id.menu_open_bot;
        xi xiVar = this.f29648b;
        if (i10 == i11) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", this.v);
            xiVar.f32819f0.presentFragment(new yn(bundle));
            xiVar.dismiss();
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
            NotificationCenter.getInstance(k4Var.M).doOnIdle(new org.telegram.ui.web.s(k4Var, 2));
        } else if (i10 == R.id.menu_delete_bot) {
            ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(this.F).getAttachMenuBots().bots;
            int size = arrayList.size();
            while (i12 < size) {
                TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList.get(i12);
                i12++;
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                if (tL_attachMenuBot2.bot_id == this.v) {
                    xiVar.v1(tL_attachMenuBot2, MessagesController.getInstance(this.F).getUser(Long.valueOf(this.v)));
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
            nf.f.s(getContext(), LocaleController.getString(R.string.BotWebViewToSLink));
        } else if (i10 == R.id.menu_report_bot) {
            int i13 = this.F;
            Context context = getContext();
            yc ycVar = new yc(mb.a(getContext()), this.f29647a);
            long j3 = this.v;
            int i14 = v31.v;
            v31.I(i13, context, j3, false, false, new ArrayList(), ycVar, null, new byte[0], null, null);
        }
    }

    @Override
    public final void v() {
        this.O = false;
        this.J.setSwipeOffsetAnimationDisallowed(false);
        this.f9307n.setViewPortByMeasureSuppressed(false);
        requestLayout();
    }

    @Override
    public final void w(int i10, boolean z10) {
        boolean z11;
        k4 k4Var = this.f9307n;
        b3 b3Var = this.J;
        if (z10) {
            k4Var.setViewPortByMeasureSuppressed(true);
            float topActionBarOffsetY = b3Var.getTopActionBarOffsetY() + (-b3Var.getOffsetY());
            if (b3Var.getSwipeOffsetY() != topActionBarOffsetY) {
                b3Var.e(topActionBarOffsetY);
                z11 = true;
            } else {
                z11 = false;
            }
            int R = this.f29648b.f32856r1.R() + i10;
            setMeasuredDimension(getMeasuredWidth(), i10);
            this.O = true;
            b3Var.setSwipeOffsetAnimationDisallowed(true);
            if (!z11) {
                ValueAnimator valueAnimator = this.f9308r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f9308r = null;
                }
                if (k4Var.getWebView() != null) {
                    int scrollY = k4Var.getWebView().getScrollY();
                    int i11 = (R - i10) + scrollY;
                    ValueAnimator duration = ValueAnimator.ofInt(scrollY, i11).setDuration(250L);
                    this.f9308r = duration;
                    duration.setInterpolator(ji.n.V);
                    this.f9308r.addUpdateListener(new i4(this, 1));
                    this.f9308r.addListener(new w2(this, i11, 1));
                    this.f9308r.start();
                }
            }
        }
    }

    @Override
    public final void y(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: ei.r4.y(int, int):void");
    }
}
