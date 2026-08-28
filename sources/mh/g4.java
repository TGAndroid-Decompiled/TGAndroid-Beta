package mh;

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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.oc;
import org.telegram.ui.qn;
import org.telegram.ui.y21;
public final class g4 extends ci implements NotificationCenter.NotificationCenterDelegate {
    public long A;
    public int B;
    public String C;
    public boolean D;
    public a4 E;
    public t2 F;
    public org.telegram.ui.ActionBar.w0 G;
    public org.telegram.ui.ActionBar.g1 H;
    public org.telegram.ui.ActionBar.g1 I;
    public int J;
    public boolean K;
    public boolean L;
    public boolean M;
    public int N;
    public boolean O;
    public boolean P;
    public w3 Q;
    public boolean R;
    public int S;
    public z3 f17861n;
    public ValueAnimator f17862r;
    public boolean f17863s;
    public long v;
    public long f17864w;
    public long f17865x;
    public int f17866y;

    @Override
    public final void D(ci ciVar) {
        z3 z3Var = this.f17861n;
        CharSequence userName = UserObject.getUserName(MessagesController.getInstance(this.B).getUser(Long.valueOf(this.v)));
        try {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(AndroidUtilities.dp(20.0f));
            userName = Emoji.replaceEmoji(userName, textPaint.getFontMetricsInt(), false);
        } catch (Exception unused) {
        }
        ki kiVar = this.f27493b;
        kiVar.T0.setTitle(userName);
        this.F.setSwipeOffsetY(0.0f);
        if (z3Var.getWebView() != null) {
            z3Var.getWebView().scrollTo(0, 0);
        }
        org.telegram.ui.ActionBar.o2 o2Var = kiVar.f30099b0;
        if (o2Var != null) {
            z3Var.setParentActivity(o2Var.getParentActivity());
        }
        this.G.setVisibility(0);
        if (!z3Var.N) {
            AndroidUtilities.updateImageViewImageAnimated(kiVar.T0.getBackButton(), R.drawable.ic_close_white);
        }
    }

    @Override
    public final void E() {
        if (this.f17861n.J) {
            K();
        }
        this.F.setSwipeOffsetAnimationDisallowed(false);
        AndroidUtilities.runOnUIThread(new w3(this, 0));
    }

    @Override
    public final void F() {
        t2 t2Var = this.F;
        t2Var.e(t2Var.getTopActionBarOffsetY() + (-t2Var.getOffsetY()));
    }

    public final boolean J() {
        String str;
        if (this.O) {
            TLRPC.User user = MessagesController.getInstance(this.B).getUser(Long.valueOf(this.v));
            if (user != null) {
                str = ContactsController.formatName(user.first_name, user.last_name);
            } else {
                str = null;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
            alertDialog$Builder.f22702a.N = str;
            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.BotWebViewChangesMayNotBeSaved);
            alertDialog$Builder.k(LocaleController.getString(R.string.BotWebViewCloseAnyway), new y3(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
            c2Var.show();
            ((TextView) c2Var.d(-1)).setTextColor(f6.v0(f6.f23230q7, this.f27492a));
            return false;
        }
        this.f27493b.dismiss();
        return true;
    }

    public final void K() {
        ki kiVar = this.f27493b;
        org.telegram.ui.ActionBar.o2 o2Var = kiVar.f30099b0;
        if ((o2Var instanceof qn) && ((qn) o2Var).T0.R() > AndroidUtilities.dp(20.0f)) {
            AndroidUtilities.hideKeyboard(kiVar.f30099b0.getFragmentView());
            AndroidUtilities.runOnUIThread(new w3(this, 1), 250L);
            return;
        }
        kiVar.getWindow().setSoftInputMode(20);
        setFocusable(true);
        kiVar.setFocusable(true);
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        z3 z3Var = this.f17861n;
        if (i9 == NotificationCenter.webViewResultSent) {
            if (this.f17865x == ((Long) objArr[0]).longValue()) {
                z3Var.h();
                this.D = true;
                this.f27493b.dismiss();
            }
        } else if (i9 == NotificationCenter.didSetNewTheme) {
            z3Var.f44087n.b(f6.v0(f6.f23072h5, this.f27492a), 153);
        }
    }

    @Override
    public final boolean e() {
        return this.R;
    }

    @Override
    public final boolean f() {
        return this.M;
    }

    @Override
    public int getButtonsHideOffset() {
        return AndroidUtilities.dp(12.0f) + ((int) this.F.getTopActionBarOffsetY());
    }

    @Override
    public int getCurrentItemTop() {
        t2 t2Var = this.F;
        return (int) (t2Var.getOffsetY() + t2Var.getSwipeOffsetY());
    }

    @Override
    public int getCustomActionBarBackground() {
        return this.S;
    }

    @Override
    public int getCustomBackground() {
        return this.N;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return (int) this.F.getOffsetY();
    }

    public String getStartCommand() {
        return this.C;
    }

    public org.telegram.ui.web.y0 getWebViewContainer() {
        return this.f17861n;
    }

    @Override
    public final int h() {
        return 1;
    }

    @Override
    public final boolean i() {
        if (this.f17861n.z()) {
            return true;
        }
        J();
        return true;
    }

    @Override
    public final void m() {
        NotificationCenter.getInstance(this.B).removeObserver(this, NotificationCenter.webViewResultSent);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewTheme);
        org.telegram.ui.ActionBar.z n10 = this.f27493b.T0.n();
        org.telegram.ui.ActionBar.w0 w0Var = this.G;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = w0Var.f23901b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        n10.removeView(w0Var);
        this.f17861n.h();
        this.P = true;
        AndroidUtilities.cancelRunOnUIThread(this.Q);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        if (this.K) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
        } else {
            super.onMeasure(i9, i10);
        }
    }

    @Override
    public final boolean p() {
        J();
        return false;
    }

    @Override
    public final void q() {
        ki kiVar = this.f27493b;
        kiVar.setFocusable(false);
        kiVar.getWindow().setSoftInputMode(48);
    }

    @Override
    public final void r() {
        this.G.setVisibility(8);
        this.L = false;
        z3 z3Var = this.f17861n;
        boolean z10 = z3Var.N;
        ki kiVar = this.f27493b;
        if (!z10) {
            AndroidUtilities.updateImageViewImageAnimated(kiVar.T0.getBackButton(), R.drawable.ic_ab_back);
        }
        kiVar.T0.setBackground(null);
        if (z3Var.P) {
            z3Var.h();
            this.D = true;
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f17863s) {
            return;
        }
        super.requestLayout();
    }

    public void setAllowSwipes(boolean z10) {
        this.F.setAllowSwipes(z10);
    }

    public void setCustomActionBarBackground(int i9) {
        this.R = true;
        this.S = i9;
    }

    public void setCustomBackground(int i9) {
        this.N = i9;
        this.M = true;
    }

    public void setDelegate(org.telegram.ui.web.e0 e0Var) {
        this.f17861n.setDelegate(e0Var);
    }

    public void setMeasureOffsetY(int i9) {
        this.J = i9;
        this.F.requestLayout();
    }

    public void setNeedCloseConfirmation(boolean z10) {
        this.O = z10;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f27493b.getSheetContainer().invalidate();
    }

    @Override
    public final void t(int i9) {
        a4 a4Var = this.E;
        z3 z3Var = this.f17861n;
        if (i9 == -1) {
            if (!z3Var.z()) {
                J();
                return;
            }
            return;
        }
        int i10 = R.id.menu_open_bot;
        ki kiVar = this.f27493b;
        if (i9 == i10) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", this.v);
            kiVar.f30099b0.presentFragment(new qn(bundle));
            kiVar.dismiss();
            return;
        }
        int i11 = 0;
        if (i9 == R.id.menu_reload_page) {
            if (z3Var.getWebView() != null) {
                z3Var.getWebView().animate().cancel();
                z3Var.getWebView().animate().alpha(0.0f).start();
            }
            a4Var.setLoadProgress(0.0f);
            a4Var.setAlpha(1.0f);
            a4Var.setVisibility(0);
            z3Var.setBotUser(MessagesController.getInstance(this.B).getUser(Long.valueOf(this.v)));
            z3Var.q(this.B, this.v);
            NotificationCenter.getInstance(z3Var.I).doOnIdle(new org.telegram.ui.web.t(z3Var, 2));
        } else if (i9 == R.id.menu_delete_bot) {
            ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(this.B).getAttachMenuBots().bots;
            int size = arrayList.size();
            while (i11 < size) {
                TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList.get(i11);
                i11++;
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                if (tL_attachMenuBot2.bot_id == this.v) {
                    kiVar.w1(tL_attachMenuBot2, MessagesController.getInstance(this.B).getUser(Long.valueOf(this.v)));
                    return;
                }
            }
        } else if (i9 == R.id.menu_settings) {
            z3Var.getClass();
            z3Var.L = System.currentTimeMillis();
            z3Var.v("settings_button_pressed", null);
        } else if (i9 == R.id.menu_add_to_home_screen_bot) {
            MediaDataController.getInstance(this.B).installShortcut(this.v, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT);
        } else if (i9 == R.id.menu_tos_bot) {
            ve.e.s(getContext(), LocaleController.getString(R.string.BotWebViewToSLink));
        } else if (i9 == R.id.menu_report_bot) {
            int i12 = this.B;
            Context context = getContext();
            oc ocVar = new oc(cb.a(getContext()), this.f27492a);
            long j10 = this.v;
            int i13 = y21.v;
            y21.J(i12, context, j10, false, false, new ArrayList(), ocVar, null, new byte[0], null, null);
        }
    }

    @Override
    public final void v() {
        this.K = false;
        this.F.setSwipeOffsetAnimationDisallowed(false);
        this.f17861n.setViewPortByMeasureSuppressed(false);
        requestLayout();
    }

    @Override
    public final void w(int i9, boolean z10) {
        boolean z11;
        z3 z3Var = this.f17861n;
        t2 t2Var = this.F;
        if (z10) {
            z3Var.setViewPortByMeasureSuppressed(true);
            float topActionBarOffsetY = t2Var.getTopActionBarOffsetY() + (-t2Var.getOffsetY());
            if (t2Var.getSwipeOffsetY() != topActionBarOffsetY) {
                t2Var.e(topActionBarOffsetY);
                z11 = true;
            } else {
                z11 = false;
            }
            int R = this.f27493b.f30138n1.R() + i9;
            setMeasuredDimension(getMeasuredWidth(), i9);
            this.K = true;
            t2Var.setSwipeOffsetAnimationDisallowed(true);
            if (!z11) {
                ValueAnimator valueAnimator = this.f17862r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f17862r = null;
                }
                if (z3Var.getWebView() != null) {
                    int scrollY = z3Var.getWebView().getScrollY();
                    int i10 = (R - i9) + scrollY;
                    ValueAnimator duration = ValueAnimator.ofInt(scrollY, i10).setDuration(250L);
                    this.f17862r = duration;
                    duration.setInterpolator(rh.m.V);
                    this.f17862r.addUpdateListener(new x3(this, 1));
                    this.f17862r.addListener(new o2(this, i10, 1));
                    this.f17862r.start();
                }
            }
        }
    }

    @Override
    public final void y(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: mh.g4.y(int, int):void");
    }
}
