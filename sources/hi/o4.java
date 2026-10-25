package hi;

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
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.lb;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.wc;
import org.telegram.ui.un;
import org.telegram.ui.v21;
public final class o4 extends li implements NotificationCenter.NotificationCenterDelegate {
    public long E;
    public int F;
    public String G;
    public boolean H;
    public i4 I;
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
    public f4 U;
    public boolean V;
    public int W;
    public e3 f13180n;
    public ValueAnimator f13181r;
    public boolean f13182s;
    public long v;
    public long f13183w;
    public long f13184x;
    public int f13185y;

    @Override
    public final void B(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: hi.o4.B(int, int):void");
    }

    @Override
    public final void G(li liVar) {
        e3 e3Var = this.f13180n;
        CharSequence userName = UserObject.getUserName(MessagesController.getInstance(this.F).getUser(Long.valueOf(this.v)));
        try {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(AndroidUtilities.dp(20.0f));
            userName = Emoji.replaceEmoji(userName, textPaint.getFontMetricsInt(), false);
        } catch (Exception unused) {
        }
        ti tiVar = this.f30213b;
        tiVar.f33002a1.setTitle(userName);
        this.J.setSwipeOffsetY(0.0f);
        if (e3Var.getWebView() != null) {
            e3Var.getWebView().scrollTo(0, 0);
        }
        org.telegram.ui.ActionBar.r2 r2Var = tiVar.f33018f0;
        if (r2Var != null) {
            e3Var.setParentActivity(r2Var.getParentActivity());
        }
        this.K.setVisibility(0);
        if (!e3Var.R) {
            AndroidUtilities.updateImageViewImageAnimated(tiVar.f33002a1.getBackButton(), R.drawable.ic_close_white);
        }
    }

    @Override
    public final void H() {
        if (this.f13180n.N) {
            O();
        }
        this.J.setSwipeOffsetAnimationDisallowed(false);
        AndroidUtilities.runOnUIThread(new f4(this, 0));
    }

    @Override
    public final void J() {
        d3 d3Var = this.J;
        d3Var.e(d3Var.getTopActionBarOffsetY() + (-d3Var.getOffsetY()));
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
            alertDialog$Builder.f22366a.R = str;
            alertDialog$Builder.f22366a.T = LocaleController.getString(R.string.BotWebViewChangesMayNotBeSaved);
            alertDialog$Builder.k(LocaleController.getString(R.string.BotWebViewCloseAnyway), new h4(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22366a;
            e2Var.show();
            f7.V((TextView) e2Var.d(-1), y6.f23596q7, this.f30212a);
            return false;
        }
        this.f30213b.dismiss();
        return true;
    }

    public final void O() {
        ti tiVar = this.f30213b;
        org.telegram.ui.ActionBar.r2 r2Var = tiVar.f33018f0;
        if ((r2Var instanceof un) && ((un) r2Var).f44292j1.Q() > AndroidUtilities.dp(20.0f)) {
            AndroidUtilities.hideKeyboard(tiVar.f33018f0.getFragmentView());
            AndroidUtilities.runOnUIThread(new f4(this, 1), 250L);
            return;
        }
        tiVar.getWindow().setSoftInputMode(20);
        setFocusable(true);
        tiVar.setFocusable(true);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        e3 e3Var = this.f13180n;
        if (i10 == NotificationCenter.webViewResultSent) {
            if (this.f13184x == ((Long) objArr[0]).longValue()) {
                e3Var.h();
                this.H = true;
                this.f30213b.dismiss();
            }
        } else if (i10 == NotificationCenter.didSetNewTheme) {
            e3Var.f45167n.b(y6.w0(y6.f23425h5, this.f30212a), 153);
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

    public org.telegram.ui.web.a1 getWebViewContainer() {
        return this.f13180n;
    }

    @Override
    public final int i() {
        return 1;
    }

    @Override
    public final boolean j() {
        if (this.f13180n.C()) {
            return true;
        }
        N();
        return true;
    }

    @Override
    public final void o() {
        NotificationCenter.getInstance(this.F).removeObserver(this, NotificationCenter.webViewResultSent);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewTheme);
        org.telegram.ui.ActionBar.z l4 = this.f30213b.f33002a1.l();
        org.telegram.ui.ActionBar.w0 w0Var = this.K;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = w0Var.f23174b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        l4.removeView(w0Var);
        this.f13180n.h();
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
    public final boolean r() {
        N();
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f13182s) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void s() {
        ti tiVar = this.f30213b;
        tiVar.setFocusable(false);
        tiVar.getWindow().setSoftInputMode(48);
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
        this.f13180n.setDelegate(g0Var);
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
        this.f30213b.getSheetContainer().invalidate();
    }

    @Override
    public final void t() {
        this.K.setVisibility(8);
        this.P = false;
        e3 e3Var = this.f13180n;
        boolean z10 = e3Var.R;
        ti tiVar = this.f30213b;
        if (!z10) {
            AndroidUtilities.updateImageViewImageAnimated(tiVar.f33002a1.getBackButton(), R.drawable.ic_ab_back);
        }
        tiVar.f33002a1.setBackground(null);
        if (e3Var.T) {
            e3Var.h();
            this.H = true;
        }
    }

    @Override
    public final void v(int i10) {
        i4 i4Var = this.I;
        e3 e3Var = this.f13180n;
        if (i10 == -1) {
            if (!e3Var.C()) {
                N();
                return;
            }
            return;
        }
        int i11 = R.id.menu_open_bot;
        ti tiVar = this.f30213b;
        if (i10 == i11) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", this.v);
            tiVar.f33018f0.presentFragment(new un(bundle));
            tiVar.dismiss();
            return;
        }
        int i12 = 0;
        if (i10 == R.id.menu_reload_page) {
            if (e3Var.getWebView() != null) {
                e3Var.getWebView().animate().cancel();
                e3Var.getWebView().animate().alpha(0.0f).start();
            }
            i4Var.setLoadProgress(0.0f);
            i4Var.setAlpha(1.0f);
            i4Var.setVisibility(0);
            e3Var.setBotUser(MessagesController.getInstance(this.F).getUser(Long.valueOf(this.v)));
            e3Var.s(this.F, this.v);
            NotificationCenter.getInstance(e3Var.M).doOnIdle(new org.telegram.ui.web.t(e3Var, 2));
        } else if (i10 == R.id.menu_delete_bot) {
            ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(this.F).getAttachMenuBots().bots;
            int size = arrayList.size();
            while (i12 < size) {
                TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList.get(i12);
                i12++;
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                if (tL_attachMenuBot2.bot_id == this.v) {
                    tiVar.B1(tL_attachMenuBot2, MessagesController.getInstance(this.F).getUser(Long.valueOf(this.v)));
                    return;
                }
            }
        } else if (i10 == R.id.menu_settings) {
            e3Var.getClass();
            e3Var.P = System.currentTimeMillis();
            e3Var.y("settings_button_pressed", null);
        } else if (i10 == R.id.menu_add_to_home_screen_bot) {
            MediaDataController.getInstance(this.F).installShortcut(this.v, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT);
        } else if (i10 == R.id.menu_tos_bot) {
            qf.d.r(getContext(), LocaleController.getString(R.string.BotWebViewToSLink));
        } else if (i10 == R.id.menu_report_bot) {
            int i13 = this.F;
            Context context = getContext();
            wc wcVar = new wc(lb.a(getContext()), this.f30212a);
            long j10 = this.v;
            int i14 = v21.f44574w;
            v21.N(i13, context, j10, false, false, new ArrayList(), wcVar, null, new byte[0], null, null);
        }
    }

    @Override
    public final void x() {
        this.O = false;
        this.J.setSwipeOffsetAnimationDisallowed(false);
        this.f13180n.setViewPortByMeasureSuppressed(false);
        requestLayout();
    }

    @Override
    public final void y(int i10, boolean z10) {
        boolean z11;
        e3 e3Var = this.f13180n;
        d3 d3Var = this.J;
        if (z10) {
            e3Var.setViewPortByMeasureSuppressed(true);
            float topActionBarOffsetY = d3Var.getTopActionBarOffsetY() + (-d3Var.getOffsetY());
            if (d3Var.getSwipeOffsetY() != topActionBarOffsetY) {
                d3Var.e(topActionBarOffsetY);
                z11 = true;
            } else {
                z11 = false;
            }
            int Q = this.f30213b.f33065u1.Q() + i10;
            setMeasuredDimension(getMeasuredWidth(), i10);
            this.O = true;
            d3Var.setSwipeOffsetAnimationDisallowed(true);
            if (!z11) {
                ValueAnimator valueAnimator = this.f13181r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f13181r = null;
                }
                if (e3Var.getWebView() != null) {
                    int scrollY = e3Var.getWebView().getScrollY();
                    int i11 = (Q - i10) + scrollY;
                    ValueAnimator duration = ValueAnimator.ofInt(scrollY, i11).setDuration(250L);
                    this.f13181r = duration;
                    duration.setInterpolator(mi.m.V);
                    this.f13181r.addUpdateListener(new g4(this, 1));
                    this.f13181r.addListener(new y2(this, i11, 1));
                    this.f13181r.start();
                }
            }
        }
    }
}
