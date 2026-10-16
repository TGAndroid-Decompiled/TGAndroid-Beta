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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.nb;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.zc;
import org.telegram.ui.fo;
import org.telegram.ui.i41;
public final class q4 extends ni implements NotificationCenter.NotificationCenterDelegate {
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
    public h4 U;
    public boolean V;
    public int W;
    public b3 f9498n;
    public ValueAnimator f9499r;
    public boolean f9500s;
    public long v;
    public long f9501w;
    public long f9502x;
    public int f9503y;

    @Override
    public final void C(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: fi.q4.C(int, int):void");
    }

    @Override
    public final void G(ni niVar) {
        b3 b3Var = this.f9498n;
        CharSequence userName = UserObject.getUserName(MessagesController.getInstance(this.F).getUser(Long.valueOf(this.v)));
        try {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(AndroidUtilities.dp(20.0f));
            userName = Emoji.replaceEmoji(userName, textPaint.getFontMetricsInt(), false);
        } catch (Exception unused) {
        }
        vi viVar = this.f27360b;
        viVar.f29656a1.setTitle(userName);
        this.J.setSwipeOffsetY(0.0f);
        if (b3Var.getWebView() != null) {
            b3Var.getWebView().scrollTo(0, 0);
        }
        org.telegram.ui.ActionBar.m2 m2Var = viVar.f29672f0;
        if (m2Var != null) {
            b3Var.setParentActivity(m2Var.getParentActivity());
        }
        this.K.setVisibility(0);
        if (!b3Var.R) {
            AndroidUtilities.updateImageViewImageAnimated(viVar.f29656a1.getBackButton(), R.drawable.ic_close_white);
        }
    }

    @Override
    public final void I() {
        if (this.f9498n.N) {
            O();
        }
        this.J.setSwipeOffsetAnimationDisallowed(false);
        AndroidUtilities.runOnUIThread(new h4(this, 0));
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
            alertDialog$Builder.f19248a.R = str;
            alertDialog$Builder.f19248a.T = LocaleController.getString(R.string.BotWebViewChangesMayNotBeSaved);
            alertDialog$Builder.k(LocaleController.getString(R.string.BotWebViewCloseAnyway), new j4(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
            a2Var.show();
            ((TextView) a2Var.d(-1)).setTextColor(g6.w0(g6.f19839q7, this.f27359a));
            return false;
        }
        this.f27360b.dismiss();
        return true;
    }

    public final void O() {
        vi viVar = this.f27360b;
        org.telegram.ui.ActionBar.m2 m2Var = viVar.f29672f0;
        if ((m2Var instanceof fo) && ((fo) m2Var).X0.R() > AndroidUtilities.dp(20.0f)) {
            AndroidUtilities.hideKeyboard(viVar.f29672f0.getFragmentView());
            AndroidUtilities.runOnUIThread(new h4(this, 1), 250L);
            return;
        }
        viVar.getWindow().setSoftInputMode(20);
        setFocusable(true);
        viVar.setFocusable(true);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        b3 b3Var = this.f9498n;
        if (i10 == NotificationCenter.webViewResultSent) {
            if (this.f9502x == ((Long) objArr[0]).longValue()) {
                b3Var.h();
                this.H = true;
                this.f27360b.dismiss();
            }
        } else if (i10 == NotificationCenter.didSetNewTheme) {
            b3Var.f40997n.b(g6.w0(g6.f19672h5, this.f27359a), 153);
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

    public org.telegram.ui.web.c1 getWebViewContainer() {
        return this.f9498n;
    }

    @Override
    public final int i() {
        return 1;
    }

    @Override
    public final boolean j() {
        if (this.f9498n.C()) {
            return true;
        }
        N();
        return true;
    }

    @Override
    public final void o() {
        NotificationCenter.getInstance(this.F).removeObserver(this, NotificationCenter.webViewResultSent);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewTheme);
        org.telegram.ui.ActionBar.y n10 = this.f27360b.f29656a1.n();
        org.telegram.ui.ActionBar.u0 u0Var = this.K;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = u0Var.f20375b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        n10.removeView(u0Var);
        this.f9498n.h();
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
    public final void requestLayout() {
        if (this.f9500s) {
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
        this.f9498n.setDelegate(h0Var);
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
        this.f27360b.getSheetContainer().invalidate();
    }

    @Override
    public final void t() {
        vi viVar = this.f27360b;
        viVar.setFocusable(false);
        viVar.getWindow().setSoftInputMode(48);
    }

    @Override
    public final void u() {
        this.K.setVisibility(8);
        this.P = false;
        b3 b3Var = this.f9498n;
        boolean z10 = b3Var.R;
        vi viVar = this.f27360b;
        if (!z10) {
            AndroidUtilities.updateImageViewImageAnimated(viVar.f29656a1.getBackButton(), R.drawable.ic_ab_back);
        }
        viVar.f29656a1.setBackground(null);
        if (b3Var.T) {
            b3Var.h();
            this.H = true;
        }
    }

    @Override
    public final void w(int i10) {
        k4 k4Var = this.I;
        b3 b3Var = this.f9498n;
        if (i10 == -1) {
            if (!b3Var.C()) {
                N();
                return;
            }
            return;
        }
        int i11 = R.id.menu_open_bot;
        vi viVar = this.f27360b;
        if (i10 == i11) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", this.v);
            viVar.f29672f0.presentFragment(new fo(bundle));
            viVar.dismiss();
            return;
        }
        int i12 = 0;
        if (i10 == R.id.menu_reload_page) {
            if (b3Var.getWebView() != null) {
                b3Var.getWebView().animate().cancel();
                b3Var.getWebView().animate().alpha(0.0f).start();
            }
            k4Var.setLoadProgress(0.0f);
            k4Var.setAlpha(1.0f);
            k4Var.setVisibility(0);
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
                    viVar.z1(tL_attachMenuBot2, MessagesController.getInstance(this.F).getUser(Long.valueOf(this.v)));
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
            pf.d.r(getContext(), LocaleController.getString(R.string.BotWebViewToSLink));
        } else if (i10 == R.id.menu_report_bot) {
            int i13 = this.F;
            Context context = getContext();
            zc zcVar = new zc(nb.a(getContext()), this.f27359a);
            long j10 = this.v;
            int i14 = i41.v;
            i41.L(i13, context, j10, false, false, new ArrayList(), zcVar, null, new byte[0], null, null);
        }
    }

    @Override
    public final void y() {
        this.O = false;
        this.J.setSwipeOffsetAnimationDisallowed(false);
        this.f9498n.setViewPortByMeasureSuppressed(false);
        requestLayout();
    }

    @Override
    public final void z(int i10, boolean z10) {
        boolean z11;
        b3 b3Var = this.f9498n;
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
            int R = this.f27360b.f29719u1.R() + i10;
            setMeasuredDimension(getMeasuredWidth(), i10);
            this.O = true;
            a3Var.setSwipeOffsetAnimationDisallowed(true);
            if (!z11) {
                ValueAnimator valueAnimator = this.f9499r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f9499r = null;
                }
                if (b3Var.getWebView() != null) {
                    int scrollY = b3Var.getWebView().getScrollY();
                    int i11 = (R - i10) + scrollY;
                    ValueAnimator duration = ValueAnimator.ofInt(scrollY, i11).setDuration(250L);
                    this.f9499r = duration;
                    duration.setInterpolator(ki.n.V);
                    this.f9499r.addUpdateListener(new i4(this, 1));
                    this.f9499r.addListener(new v2(this, i11, 1));
                    this.f9499r.start();
                }
            }
        }
    }
}
