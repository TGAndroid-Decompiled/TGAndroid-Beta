package h3;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import gh.p5;
import hh.k5;
import hh.la;
import hh.oa;
import hh.u7;
import hh.v4;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import jh.a7;
import jh.b5;
import jh.c9;
import jh.i9;
import jh.w8;
import jh.x7;
import jh.x8;
import jh.y7;
import jh.z7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.o7;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.Components.x4;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.co0;
import org.telegram.ui.gy;
import org.telegram.ui.yw;

public final class x implements d5.k, x4, org.telegram.ui.ActionBar.a2, gf.p, ud.b, Utilities.Callback5, co0, t2.e, rk0, Utilities.Callback2Return, qk0, a7, c9, eh.o, r0.o {

    public final int f8236a;

    public final Object f8237b;

    public x(i3.a aVar, j4.p pVar, j4.x xVar, IOException iOException, boolean z10) {
        this.f8236a = 14;
        this.f8237b = xVar;
    }

    @Override
    public void I(int i10, int i11, boolean z10) {
        hh.t0 t0Var = (hh.t0) this.f8237b;
        if (z10) {
            long j10 = i10;
            if (t0Var.E != j10) {
                t0Var.E = j10;
                t0Var.f10042r.setText(hh.t0.p(j10));
            }
            t0Var.n(true);
        }
    }

    @Override
    public r0.m1 I0(View view, r0.m1 m1Var) {
        i9 i9Var = (i9) this.f8237b;
        i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) i9Var.v.getLayoutParams();
        marginLayoutParams.topMargin = i9Var.f13470c ? 0 : m1Var.d();
        marginLayoutParams.bottomMargin = i9Var.f13470c ? m1Var.f46619a.f(2).d : m1Var.a();
        marginLayoutParams.leftMargin = defaultWindowInsets.f10489a;
        marginLayoutParams.rightMargin = defaultWindowInsets.f10491c;
        w8 w8Var = i9Var.f13505s;
        if (w8Var != null) {
            w8Var.requestLayout();
        }
        x8 x8Var = i9Var.v;
        if (x8Var != null) {
            x8Var.requestLayout();
        }
        return r0.m1.f46618b;
    }

    @Override
    public boolean a(int i10, final View view) {
        boolean z10;
        dq dqVar;
        dq dqVar2;
        boolean z11;
        b70 b70Var;
        boolean z12;
        boolean z13;
        boolean z14;
        int i11;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        int i12;
        String string;
        Runnable runnable;
        b70 b70Var2;
        boolean z19;
        boolean z20;
        switch (this.f8236a) {
            case 19:
                final yw ywVar = (yw) this.f8237b;
                if (ywVar.J == 0.0f && ywVar.f13785j0 == 0.0f) {
                    final long j10 = ((jh.o) view).A;
                    gy gyVar = ywVar.K0;
                    MediaDataController.getInstance(((org.telegram.ui.ActionBar.n2) gyVar).currentAccount).loadHints(true);
                    b70 b70VarH = b70.H(gyVar, view);
                    b70VarH.f26998z.set(0, AndroidUtilities.dp(8.0f), 0, 0);
                    b70VarH.W(g6.c0(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), gyVar.getThemedColor(g6.f23053d6)));
                    b70VarH.a0(0.0f, AndroidUtilities.dp(8.0f));
                    gyVar.H0 = b70VarH;
                    if (!UserObject.isService(j10)) {
                        try {
                            view.performHapticFeedback(0);
                            break;
                        } catch (Exception unused) {
                        }
                        if (j10 != UserConfig.getInstance(((org.telegram.ui.ActionBar.n2) gyVar).currentAccount).getClientUserId()) {
                            final TLRPC.User user = gyVar.getMessagesController().getUser(Long.valueOf(j10));
                            TLRPC.Chat chat = gyVar.getMessagesController().getChat(Long.valueOf(-j10));
                            final String sharedPrefKey = NotificationsController.getSharedPrefKey(j10, 0L);
                            boolean zC0 = NotificationsCustomSettingsActivity.c0(((org.telegram.ui.ActionBar.n2) gyVar).currentAccount, j10);
                            boolean zPremiumFeaturesBlocked = MessagesController.getInstance(((org.telegram.ui.ActionBar.n2) gyVar).currentAccount).premiumFeaturesBlocked();
                            boolean zIsPremium = UserConfig.getInstance(((org.telegram.ui.ActionBar.n2) gyVar).currentAccount).isPremium();
                            boolean zJ = MessagesController.getInstance(((org.telegram.ui.ActionBar.n2) gyVar).currentAccount).getStoriesController().J(j10);
                            boolean zF = MessagesController.getInstance(((org.telegram.ui.ActionBar.n2) gyVar).currentAccount).getStoriesController().F(j10);
                            if (zPremiumFeaturesBlocked || j10 <= 0 || zIsPremium) {
                                z10 = false;
                            } else {
                                z10 = false;
                                Drawable drawable = ywVar.getContext().getDrawable(R.drawable.msg_gallery_locked2);
                                if (drawable != null) {
                                    Drawable drawable2 = ywVar.getContext().getDrawable(R.drawable.msg_stealth_locked);
                                    if (drawable2 != null) {
                                        drawable2.setColorFilter(new PorterDuffColorFilter(gyVar.getThemedColor(g6.F8), PorterDuff.Mode.MULTIPLY));
                                    }
                                    drawable.setColorFilter(new PorterDuffColorFilter(i0.b.d(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
                                    dqVar = new dq(drawable2, drawable);
                                }
                                dqVar2 = dqVar;
                                if (j10 < r12 && gyVar.X3().j(j10)) {
                                    final int i13 = 4;
                                    gyVar.H0.b(R.drawable.msg_stories_add, null, LocaleController.getString(R.string.AddStory), g6.F8, g6.E8, new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (i13) {
                                                case 0:
                                                    ywVar.K0.presentFragment(rn.R9(j10));
                                                    break;
                                                case 1:
                                                    gy gyVar2 = ywVar.K0;
                                                    AndroidUtilities.runOnUIThread(new wv(gyVar2, j10, !gyVar2.e4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    gy gyVar3 = ywVar.K0;
                                                    AndroidUtilities.runOnUIThread(new wv(gyVar3, j10, !gyVar3.e4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    gy gyVar4 = ywVar.K0;
                                                    MediaDataController mediaDataController = MediaDataController.getInstance(((org.telegram.ui.ActionBar.n2) gyVar4).currentAccount);
                                                    long j11 = j10;
                                                    mediaDataController.removePeer(j11);
                                                    gyVar4.getMessagesController().getStoriesController().i0(j11, true, false);
                                                    break;
                                                case 4:
                                                    ywVar.K0.A0.j(j10);
                                                    break;
                                                case 5:
                                                    ywVar.K0.presentFragment(rn.R9(j10));
                                                    break;
                                                default:
                                                    ywVar.K0.presentFragment(ProfileActivity.m4(j10));
                                                    break;
                                            }
                                        }
                                    });
                                }
                                if (user == null && !user.contact && MediaDataController.getInstance(((org.telegram.ui.ActionBar.n2) gyVar).currentAccount).containsTopPeer(j10)) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                b70Var = gyVar.H0;
                                if (j10 > r12) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                final int i14 = 5;
                                b70Var.l(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (i14) {
                                            case 0:
                                                ywVar.K0.presentFragment(rn.R9(j10));
                                                break;
                                            case 1:
                                                gy gyVar2 = ywVar.K0;
                                                AndroidUtilities.runOnUIThread(new wv(gyVar2, j10, !gyVar2.e4(), 0), 200L);
                                                break;
                                            case 2:
                                                gy gyVar3 = ywVar.K0;
                                                AndroidUtilities.runOnUIThread(new wv(gyVar3, j10, !gyVar3.e4(), 0), 200L);
                                                break;
                                            case 3:
                                                gy gyVar4 = ywVar.K0;
                                                MediaDataController mediaDataController = MediaDataController.getInstance(((org.telegram.ui.ActionBar.n2) gyVar4).currentAccount);
                                                long j11 = j10;
                                                mediaDataController.removePeer(j11);
                                                gyVar4.getMessagesController().getStoriesController().i0(j11, true, false);
                                                break;
                                            case 4:
                                                ywVar.K0.A0.j(j10);
                                                break;
                                            case 5:
                                                ywVar.K0.presentFragment(rn.R9(j10));
                                                break;
                                            default:
                                                ywVar.K0.presentFragment(ProfileActivity.m4(j10));
                                                break;
                                        }
                                    }
                                }, z12);
                                if (j10 > r12) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                final int i15 = 6;
                                b70Var.l(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (i15) {
                                            case 0:
                                                ywVar.K0.presentFragment(rn.R9(j10));
                                                break;
                                            case 1:
                                                gy gyVar2 = ywVar.K0;
                                                AndroidUtilities.runOnUIThread(new wv(gyVar2, j10, !gyVar2.e4(), 0), 200L);
                                                break;
                                            case 2:
                                                gy gyVar3 = ywVar.K0;
                                                AndroidUtilities.runOnUIThread(new wv(gyVar3, j10, !gyVar3.e4(), 0), 200L);
                                                break;
                                            case 3:
                                                gy gyVar4 = ywVar.K0;
                                                MediaDataController mediaDataController = MediaDataController.getInstance(((org.telegram.ui.ActionBar.n2) gyVar4).currentAccount);
                                                long j11 = j10;
                                                mediaDataController.removePeer(j11);
                                                gyVar4.getMessagesController().getStoriesController().i0(j11, true, false);
                                                break;
                                            case 4:
                                                ywVar.K0.A0.j(j10);
                                                break;
                                            case 5:
                                                ywVar.K0.presentFragment(rn.R9(j10));
                                                break;
                                            default:
                                                ywVar.K0.presentFragment(ProfileActivity.m4(j10));
                                                break;
                                        }
                                    }
                                }, z13);
                                if (j10 < r12) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                int i16 = R.drawable.msg_channel;
                                if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                                    i11 = R.string.OpenChannel2;
                                } else {
                                    i11 = R.string.OpenGroup2;
                                }
                                final int i17 = 0;
                                b70Var.l(i16, LocaleController.getString(i11), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (i17) {
                                            case 0:
                                                ywVar.K0.presentFragment(rn.R9(j10));
                                                break;
                                            case 1:
                                                gy gyVar2 = ywVar.K0;
                                                AndroidUtilities.runOnUIThread(new wv(gyVar2, j10, !gyVar2.e4(), 0), 200L);
                                                break;
                                            case 2:
                                                gy gyVar3 = ywVar.K0;
                                                AndroidUtilities.runOnUIThread(new wv(gyVar3, j10, !gyVar3.e4(), 0), 200L);
                                                break;
                                            case 3:
                                                gy gyVar4 = ywVar.K0;
                                                MediaDataController mediaDataController = MediaDataController.getInstance(((org.telegram.ui.ActionBar.n2) gyVar4).currentAccount);
                                                long j11 = j10;
                                                mediaDataController.removePeer(j11);
                                                gyVar4.getMessagesController().getStoriesController().i0(j11, true, false);
                                                break;
                                            case 4:
                                                ywVar.K0.A0.j(j10);
                                                break;
                                            case 5:
                                                ywVar.K0.presentFragment(rn.R9(j10));
                                                break;
                                            default:
                                                ywVar.K0.presentFragment(ProfileActivity.m4(j10));
                                                break;
                                        }
                                    }
                                }, z14);
                                if (zC0 || j10 <= r12) {
                                    z15 = false;
                                } else {
                                    z15 = true;
                                }
                                final int i18 = 0;
                                b70Var.l(R.drawable.msg_mute, LocaleController.getString(R.string.NotificationsStoryMute2), new Runnable() {
                                    @Override
                                    public final void run() {
                                        String strTrim;
                                        int i19 = i18;
                                        TLRPC.User user2 = user;
                                        long j11 = j10;
                                        String str = sharedPrefKey;
                                        yw ywVar2 = ywVar;
                                        switch (i19) {
                                            case 0:
                                                gy gyVar2 = ywVar2.K0;
                                                MessagesController.getNotificationsSettings(((org.telegram.ui.ActionBar.n2) gyVar2).currentAccount).edit().putBoolean("stories_" + str, false).apply();
                                                gyVar2.getNotificationsController().updateServerNotificationsSettings(j11, 0L);
                                                strTrim = user2 != null ? user2.first_name.trim() : "";
                                                int iIndexOf = strTrim.indexOf(" ");
                                                if (iIndexOf > 0) {
                                                    strTrim = strTrim.substring(0, iIndexOf);
                                                }
                                                org.telegram.ui.Components.mc.a0(gyVar2).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, strTrim)), null, null).j();
                                                break;
                                            default:
                                                gy gyVar3 = ywVar2.K0;
                                                MessagesController.getNotificationsSettings(((org.telegram.ui.ActionBar.n2) gyVar3).currentAccount).edit().putBoolean("stories_" + str, true).apply();
                                                gyVar3.getNotificationsController().updateServerNotificationsSettings(j11, 0L);
                                                strTrim = user2 != null ? user2.first_name.trim() : "";
                                                int iIndexOf2 = strTrim.indexOf(" ");
                                                if (iIndexOf2 > 0) {
                                                    strTrim = strTrim.substring(0, iIndexOf2);
                                                }
                                                org.telegram.ui.Components.mc.a0(gyVar3).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, strTrim)), null, null).j();
                                                break;
                                        }
                                    }
                                }, z15);
                                b70Var.E();
                                if (!zC0 || j10 <= r12) {
                                    z16 = false;
                                } else {
                                    z16 = true;
                                }
                                final int i19 = 1;
                                b70Var.l(R.drawable.msg_unmute, LocaleController.getString(R.string.NotificationsStoryUnmute2), new Runnable() {
                                    @Override
                                    public final void run() {
                                        String strTrim;
                                        int i110 = i19;
                                        TLRPC.User user2 = user;
                                        long j11 = j10;
                                        String str = sharedPrefKey;
                                        yw ywVar2 = ywVar;
                                        switch (i110) {
                                            case 0:
                                                gy gyVar2 = ywVar2.K0;
                                                MessagesController.getNotificationsSettings(((org.telegram.ui.ActionBar.n2) gyVar2).currentAccount).edit().putBoolean("stories_" + str, false).apply();
                                                gyVar2.getNotificationsController().updateServerNotificationsSettings(j11, 0L);
                                                strTrim = user2 != null ? user2.first_name.trim() : "";
                                                int iIndexOf = strTrim.indexOf(" ");
                                                if (iIndexOf > 0) {
                                                    strTrim = strTrim.substring(0, iIndexOf);
                                                }
                                                org.telegram.ui.Components.mc.a0(gyVar2).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, strTrim)), null, null).j();
                                                break;
                                            default:
                                                gy gyVar3 = ywVar2.K0;
                                                MessagesController.getNotificationsSettings(((org.telegram.ui.ActionBar.n2) gyVar3).currentAccount).edit().putBoolean("stories_" + str, true).apply();
                                                gyVar3.getNotificationsController().updateServerNotificationsSettings(j11, 0L);
                                                strTrim = user2 != null ? user2.first_name.trim() : "";
                                                int iIndexOf2 = strTrim.indexOf(" ");
                                                if (iIndexOf2 > 0) {
                                                    strTrim = strTrim.substring(0, iIndexOf2);
                                                }
                                                org.telegram.ui.Components.mc.a0(gyVar3).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, strTrim)), null, null).j();
                                                break;
                                        }
                                    }
                                }, z16);
                                b70Var.E();
                                if (zPremiumFeaturesBlocked && j10 > r12 && zIsPremium && zJ && !zF) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                final int i20 = 0;
                                b70Var.l(R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.ViewAnonymously), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (i20) {
                                            case 0:
                                                yw ywVar2 = ywVar;
                                                gy gyVar2 = ywVar2.K0;
                                                TL_stories.TL_storiesStealthMode tL_storiesStealthMode = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().B;
                                                View view2 = view;
                                                if (tL_storiesStealthMode == null || ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) gyVar2).currentAccount).getCurrentTime() >= tL_storiesStealthMode.active_until_date) {
                                                    jh.o5 o5Var = new jh.o5(ywVar2.getContext(), 0.0f, 1, ((org.telegram.ui.ActionBar.n2) gyVar2).resourceProvider);
                                                    o5Var.f13750e = new xw(ywVar2, view2, 1);
                                                    gyVar2.showDialog(o5Var);
                                                } else if (view2 instanceof jh.o) {
                                                    gyVar2.A0.i((jh.o) view2, false);
                                                }
                                                break;
                                            default:
                                                yw ywVar3 = ywVar;
                                                Context context = ywVar3.getContext();
                                                gy gyVar3 = ywVar3.K0;
                                                jh.o5 o5Var2 = new jh.o5(context, 0.0f, 1, ((org.telegram.ui.ActionBar.n2) gyVar3).resourceProvider);
                                                o5Var2.f13750e = new xw(ywVar3, view, 0);
                                                gyVar3.showDialog(o5Var2);
                                                break;
                                        }
                                    }
                                }, z17);
                                b70Var.E();
                                if (!zPremiumFeaturesBlocked || j10 <= r12 || zIsPremium || !zJ || zF) {
                                    z18 = false;
                                } else {
                                    z18 = true;
                                }
                                i12 = R.drawable.msg_stories_stealth2;
                                string = LocaleController.getString(R.string.ViewAnonymously);
                                final int i21 = 1;
                                runnable = new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (i21) {
                                            case 0:
                                                yw ywVar2 = ywVar;
                                                gy gyVar2 = ywVar2.K0;
                                                TL_stories.TL_storiesStealthMode tL_storiesStealthMode = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().B;
                                                View view2 = view;
                                                if (tL_storiesStealthMode == null || ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) gyVar2).currentAccount).getCurrentTime() >= tL_storiesStealthMode.active_until_date) {
                                                    jh.o5 o5Var = new jh.o5(ywVar2.getContext(), 0.0f, 1, ((org.telegram.ui.ActionBar.n2) gyVar2).resourceProvider);
                                                    o5Var.f13750e = new xw(ywVar2, view2, 1);
                                                    gyVar2.showDialog(o5Var);
                                                } else if (view2 instanceof jh.o) {
                                                    gyVar2.A0.i((jh.o) view2, false);
                                                }
                                                break;
                                            default:
                                                yw ywVar3 = ywVar;
                                                Context context = ywVar3.getContext();
                                                gy gyVar3 = ywVar3.K0;
                                                jh.o5 o5Var2 = new jh.o5(context, 0.0f, 1, ((org.telegram.ui.ActionBar.n2) gyVar3).resourceProvider);
                                                o5Var2.f13750e = new xw(ywVar3, view, 0);
                                                gyVar3.showDialog(o5Var2);
                                                break;
                                        }
                                    }
                                };
                                if (z18) {
                                    b70Var.b(i12, dqVar2, string, g6.F8, g6.E8, runnable);
                                    b70Var2 = b70Var;
                                } else {
                                    b70Var2 = b70Var;
                                }
                                b70Var2.E();
                                if (!z11 || gyVar.e4()) {
                                    z19 = false;
                                } else {
                                    z19 = true;
                                }
                                final int i22 = 1;
                                b70Var2.l(R.drawable.msg_archive, LocaleController.getString(R.string.ArchivePeerStories), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (i22) {
                                            case 0:
                                                ywVar.K0.presentFragment(rn.R9(j10));
                                                break;
                                            case 1:
                                                gy gyVar2 = ywVar.K0;
                                                AndroidUtilities.runOnUIThread(new wv(gyVar2, j10, !gyVar2.e4(), 0), 200L);
                                                break;
                                            case 2:
                                                gy gyVar3 = ywVar.K0;
                                                AndroidUtilities.runOnUIThread(new wv(gyVar3, j10, !gyVar3.e4(), 0), 200L);
                                                break;
                                            case 3:
                                                gy gyVar4 = ywVar.K0;
                                                MediaDataController mediaDataController = MediaDataController.getInstance(((org.telegram.ui.ActionBar.n2) gyVar4).currentAccount);
                                                long j11 = j10;
                                                mediaDataController.removePeer(j11);
                                                gyVar4.getMessagesController().getStoriesController().i0(j11, true, false);
                                                break;
                                            case 4:
                                                ywVar.K0.A0.j(j10);
                                                break;
                                            case 5:
                                                ywVar.K0.presentFragment(rn.R9(j10));
                                                break;
                                            default:
                                                ywVar.K0.presentFragment(ProfileActivity.m4(j10));
                                                break;
                                        }
                                    }
                                }, z19);
                                b70Var2.E();
                                if (z11 && gyVar.e4()) {
                                    z20 = true;
                                } else {
                                    z20 = false;
                                }
                                final int i23 = 2;
                                b70Var2.l(R.drawable.msg_unarchive, LocaleController.getString(R.string.UnarchiveStories), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (i23) {
                                            case 0:
                                                ywVar.K0.presentFragment(rn.R9(j10));
                                                break;
                                            case 1:
                                                gy gyVar2 = ywVar.K0;
                                                AndroidUtilities.runOnUIThread(new wv(gyVar2, j10, !gyVar2.e4(), 0), 200L);
                                                break;
                                            case 2:
                                                gy gyVar3 = ywVar.K0;
                                                AndroidUtilities.runOnUIThread(new wv(gyVar3, j10, !gyVar3.e4(), 0), 200L);
                                                break;
                                            case 3:
                                                gy gyVar4 = ywVar.K0;
                                                MediaDataController mediaDataController = MediaDataController.getInstance(((org.telegram.ui.ActionBar.n2) gyVar4).currentAccount);
                                                long j11 = j10;
                                                mediaDataController.removePeer(j11);
                                                gyVar4.getMessagesController().getStoriesController().i0(j11, true, false);
                                                break;
                                            case 4:
                                                ywVar.K0.A0.j(j10);
                                                break;
                                            case 5:
                                                ywVar.K0.presentFragment(rn.R9(j10));
                                                break;
                                            default:
                                                ywVar.K0.presentFragment(ProfileActivity.m4(j10));
                                                break;
                                        }
                                    }
                                }, z20);
                                b70Var2.E();
                                final int i24 = 3;
                                b70Var2.l(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesRemoveFromRecent), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (i24) {
                                            case 0:
                                                ywVar.K0.presentFragment(rn.R9(j10));
                                                break;
                                            case 1:
                                                gy gyVar2 = ywVar.K0;
                                                AndroidUtilities.runOnUIThread(new wv(gyVar2, j10, !gyVar2.e4(), 0), 200L);
                                                break;
                                            case 2:
                                                gy gyVar3 = ywVar.K0;
                                                AndroidUtilities.runOnUIThread(new wv(gyVar3, j10, !gyVar3.e4(), 0), 200L);
                                                break;
                                            case 3:
                                                gy gyVar4 = ywVar.K0;
                                                MediaDataController mediaDataController = MediaDataController.getInstance(((org.telegram.ui.ActionBar.n2) gyVar4).currentAccount);
                                                long j11 = j10;
                                                mediaDataController.removePeer(j11);
                                                gyVar4.getMessagesController().getStoriesController().i0(j11, true, false);
                                                break;
                                            case 4:
                                                ywVar.K0.A0.j(j10);
                                                break;
                                            case 5:
                                                ywVar.K0.presentFragment(rn.R9(j10));
                                                break;
                                            default:
                                                ywVar.K0.presentFragment(ProfileActivity.m4(j10));
                                                break;
                                        }
                                    }
                                }, z11);
                            }
                            dqVar = null;
                            dqVar2 = dqVar;
                            if (j10 < r12) {
                                final int i110 = 4;
                                gyVar.H0.b(R.drawable.msg_stories_add, null, LocaleController.getString(R.string.AddStory), g6.F8, g6.E8, new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (i110) {
                                            case 0:
                                                ywVar.K0.presentFragment(rn.R9(j10));
                                                break;
                                            case 1:
                                                gy gyVar2 = ywVar.K0;
                                                AndroidUtilities.runOnUIThread(new wv(gyVar2, j10, !gyVar2.e4(), 0), 200L);
                                                break;
                                            case 2:
                                                gy gyVar3 = ywVar.K0;
                                                AndroidUtilities.runOnUIThread(new wv(gyVar3, j10, !gyVar3.e4(), 0), 200L);
                                                break;
                                            case 3:
                                                gy gyVar4 = ywVar.K0;
                                                MediaDataController mediaDataController = MediaDataController.getInstance(((org.telegram.ui.ActionBar.n2) gyVar4).currentAccount);
                                                long j11 = j10;
                                                mediaDataController.removePeer(j11);
                                                gyVar4.getMessagesController().getStoriesController().i0(j11, true, false);
                                                break;
                                            case 4:
                                                ywVar.K0.A0.j(j10);
                                                break;
                                            case 5:
                                                ywVar.K0.presentFragment(rn.R9(j10));
                                                break;
                                            default:
                                                ywVar.K0.presentFragment(ProfileActivity.m4(j10));
                                                break;
                                        }
                                    }
                                });
                            }
                            if (user == null) {
                                z11 = false;
                            } else {
                                z11 = false;
                            }
                            b70Var = gyVar.H0;
                            if (j10 > r12) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            final int i111 = 5;
                            b70Var.l(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (i111) {
                                        case 0:
                                            ywVar.K0.presentFragment(rn.R9(j10));
                                            break;
                                        case 1:
                                            gy gyVar2 = ywVar.K0;
                                            AndroidUtilities.runOnUIThread(new wv(gyVar2, j10, !gyVar2.e4(), 0), 200L);
                                            break;
                                        case 2:
                                            gy gyVar3 = ywVar.K0;
                                            AndroidUtilities.runOnUIThread(new wv(gyVar3, j10, !gyVar3.e4(), 0), 200L);
                                            break;
                                        case 3:
                                            gy gyVar4 = ywVar.K0;
                                            MediaDataController mediaDataController = MediaDataController.getInstance(((org.telegram.ui.ActionBar.n2) gyVar4).currentAccount);
                                            long j11 = j10;
                                            mediaDataController.removePeer(j11);
                                            gyVar4.getMessagesController().getStoriesController().i0(j11, true, false);
                                            break;
                                        case 4:
                                            ywVar.K0.A0.j(j10);
                                            break;
                                        case 5:
                                            ywVar.K0.presentFragment(rn.R9(j10));
                                            break;
                                        default:
                                            ywVar.K0.presentFragment(ProfileActivity.m4(j10));
                                            break;
                                    }
                                }
                            }, z12);
                            if (j10 > r12) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            final int i112 = 6;
                            b70Var.l(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (i112) {
                                        case 0:
                                            ywVar.K0.presentFragment(rn.R9(j10));
                                            break;
                                        case 1:
                                            gy gyVar2 = ywVar.K0;
                                            AndroidUtilities.runOnUIThread(new wv(gyVar2, j10, !gyVar2.e4(), 0), 200L);
                                            break;
                                        case 2:
                                            gy gyVar3 = ywVar.K0;
                                            AndroidUtilities.runOnUIThread(new wv(gyVar3, j10, !gyVar3.e4(), 0), 200L);
                                            break;
                                        case 3:
                                            gy gyVar4 = ywVar.K0;
                                            MediaDataController mediaDataController = MediaDataController.getInstance(((org.telegram.ui.ActionBar.n2) gyVar4).currentAccount);
                                            long j11 = j10;
                                            mediaDataController.removePeer(j11);
                                            gyVar4.getMessagesController().getStoriesController().i0(j11, true, false);
                                            break;
                                        case 4:
                                            ywVar.K0.A0.j(j10);
                                            break;
                                        case 5:
                                            ywVar.K0.presentFragment(rn.R9(j10));
                                            break;
                                        default:
                                            ywVar.K0.presentFragment(ProfileActivity.m4(j10));
                                            break;
                                    }
                                }
                            }, z13);
                            if (j10 < r12) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            int i113 = R.drawable.msg_channel;
                            if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                                i11 = R.string.OpenChannel2;
                            } else {
                                i11 = R.string.OpenGroup2;
                            }
                            final int i114 = 0;
                            b70Var.l(i113, LocaleController.getString(i11), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (i114) {
                                        case 0:
                                            ywVar.K0.presentFragment(rn.R9(j10));
                                            break;
                                        case 1:
                                            gy gyVar2 = ywVar.K0;
                                            AndroidUtilities.runOnUIThread(new wv(gyVar2, j10, !gyVar2.e4(), 0), 200L);
                                            break;
                                        case 2:
                                            gy gyVar3 = ywVar.K0;
                                            AndroidUtilities.runOnUIThread(new wv(gyVar3, j10, !gyVar3.e4(), 0), 200L);
                                            break;
                                        case 3:
                                            gy gyVar4 = ywVar.K0;
                                            MediaDataController mediaDataController = MediaDataController.getInstance(((org.telegram.ui.ActionBar.n2) gyVar4).currentAccount);
                                            long j11 = j10;
                                            mediaDataController.removePeer(j11);
                                            gyVar4.getMessagesController().getStoriesController().i0(j11, true, false);
                                            break;
                                        case 4:
                                            ywVar.K0.A0.j(j10);
                                            break;
                                        case 5:
                                            ywVar.K0.presentFragment(rn.R9(j10));
                                            break;
                                        default:
                                            ywVar.K0.presentFragment(ProfileActivity.m4(j10));
                                            break;
                                    }
                                }
                            }, z14);
                            if (zC0) {
                                z15 = false;
                            } else {
                                z15 = false;
                            }
                            final int i115 = 0;
                            b70Var.l(R.drawable.msg_mute, LocaleController.getString(R.string.NotificationsStoryMute2), new Runnable() {
                                @Override
                                public final void run() {
                                    String strTrim;
                                    int i116 = i115;
                                    TLRPC.User user2 = user;
                                    long j11 = j10;
                                    String str = sharedPrefKey;
                                    yw ywVar2 = ywVar;
                                    switch (i116) {
                                        case 0:
                                            gy gyVar2 = ywVar2.K0;
                                            MessagesController.getNotificationsSettings(((org.telegram.ui.ActionBar.n2) gyVar2).currentAccount).edit().putBoolean("stories_" + str, false).apply();
                                            gyVar2.getNotificationsController().updateServerNotificationsSettings(j11, 0L);
                                            strTrim = user2 != null ? user2.first_name.trim() : "";
                                            int iIndexOf = strTrim.indexOf(" ");
                                            if (iIndexOf > 0) {
                                                strTrim = strTrim.substring(0, iIndexOf);
                                            }
                                            org.telegram.ui.Components.mc.a0(gyVar2).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, strTrim)), null, null).j();
                                            break;
                                        default:
                                            gy gyVar3 = ywVar2.K0;
                                            MessagesController.getNotificationsSettings(((org.telegram.ui.ActionBar.n2) gyVar3).currentAccount).edit().putBoolean("stories_" + str, true).apply();
                                            gyVar3.getNotificationsController().updateServerNotificationsSettings(j11, 0L);
                                            strTrim = user2 != null ? user2.first_name.trim() : "";
                                            int iIndexOf2 = strTrim.indexOf(" ");
                                            if (iIndexOf2 > 0) {
                                                strTrim = strTrim.substring(0, iIndexOf2);
                                            }
                                            org.telegram.ui.Components.mc.a0(gyVar3).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, strTrim)), null, null).j();
                                            break;
                                    }
                                }
                            }, z15);
                            b70Var.E();
                            if (zC0) {
                                z16 = false;
                            } else {
                                z16 = false;
                            }
                            final int i116 = 1;
                            b70Var.l(R.drawable.msg_unmute, LocaleController.getString(R.string.NotificationsStoryUnmute2), new Runnable() {
                                @Override
                                public final void run() {
                                    String strTrim;
                                    int i117 = i116;
                                    TLRPC.User user2 = user;
                                    long j11 = j10;
                                    String str = sharedPrefKey;
                                    yw ywVar2 = ywVar;
                                    switch (i117) {
                                        case 0:
                                            gy gyVar2 = ywVar2.K0;
                                            MessagesController.getNotificationsSettings(((org.telegram.ui.ActionBar.n2) gyVar2).currentAccount).edit().putBoolean("stories_" + str, false).apply();
                                            gyVar2.getNotificationsController().updateServerNotificationsSettings(j11, 0L);
                                            strTrim = user2 != null ? user2.first_name.trim() : "";
                                            int iIndexOf = strTrim.indexOf(" ");
                                            if (iIndexOf > 0) {
                                                strTrim = strTrim.substring(0, iIndexOf);
                                            }
                                            org.telegram.ui.Components.mc.a0(gyVar2).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, strTrim)), null, null).j();
                                            break;
                                        default:
                                            gy gyVar3 = ywVar2.K0;
                                            MessagesController.getNotificationsSettings(((org.telegram.ui.ActionBar.n2) gyVar3).currentAccount).edit().putBoolean("stories_" + str, true).apply();
                                            gyVar3.getNotificationsController().updateServerNotificationsSettings(j11, 0L);
                                            strTrim = user2 != null ? user2.first_name.trim() : "";
                                            int iIndexOf2 = strTrim.indexOf(" ");
                                            if (iIndexOf2 > 0) {
                                                strTrim = strTrim.substring(0, iIndexOf2);
                                            }
                                            org.telegram.ui.Components.mc.a0(gyVar3).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, strTrim)), null, null).j();
                                            break;
                                    }
                                }
                            }, z16);
                            b70Var.E();
                            if (zPremiumFeaturesBlocked) {
                                z17 = false;
                            } else {
                                z17 = false;
                            }
                            final int i25 = 0;
                            b70Var.l(R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.ViewAnonymously), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (i25) {
                                        case 0:
                                            yw ywVar2 = ywVar;
                                            gy gyVar2 = ywVar2.K0;
                                            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().B;
                                            View view2 = view;
                                            if (tL_storiesStealthMode == null || ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) gyVar2).currentAccount).getCurrentTime() >= tL_storiesStealthMode.active_until_date) {
                                                jh.o5 o5Var = new jh.o5(ywVar2.getContext(), 0.0f, 1, ((org.telegram.ui.ActionBar.n2) gyVar2).resourceProvider);
                                                o5Var.f13750e = new xw(ywVar2, view2, 1);
                                                gyVar2.showDialog(o5Var);
                                            } else if (view2 instanceof jh.o) {
                                                gyVar2.A0.i((jh.o) view2, false);
                                            }
                                            break;
                                        default:
                                            yw ywVar3 = ywVar;
                                            Context context = ywVar3.getContext();
                                            gy gyVar3 = ywVar3.K0;
                                            jh.o5 o5Var2 = new jh.o5(context, 0.0f, 1, ((org.telegram.ui.ActionBar.n2) gyVar3).resourceProvider);
                                            o5Var2.f13750e = new xw(ywVar3, view, 0);
                                            gyVar3.showDialog(o5Var2);
                                            break;
                                    }
                                }
                            }, z17);
                            b70Var.E();
                            if (zPremiumFeaturesBlocked) {
                                z18 = false;
                            } else {
                                z18 = false;
                            }
                            i12 = R.drawable.msg_stories_stealth2;
                            string = LocaleController.getString(R.string.ViewAnonymously);
                            final int i26 = 1;
                            runnable = new Runnable() {
                                @Override
                                public final void run() {
                                    switch (i26) {
                                        case 0:
                                            yw ywVar2 = ywVar;
                                            gy gyVar2 = ywVar2.K0;
                                            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().B;
                                            View view2 = view;
                                            if (tL_storiesStealthMode == null || ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) gyVar2).currentAccount).getCurrentTime() >= tL_storiesStealthMode.active_until_date) {
                                                jh.o5 o5Var = new jh.o5(ywVar2.getContext(), 0.0f, 1, ((org.telegram.ui.ActionBar.n2) gyVar2).resourceProvider);
                                                o5Var.f13750e = new xw(ywVar2, view2, 1);
                                                gyVar2.showDialog(o5Var);
                                            } else if (view2 instanceof jh.o) {
                                                gyVar2.A0.i((jh.o) view2, false);
                                            }
                                            break;
                                        default:
                                            yw ywVar3 = ywVar;
                                            Context context = ywVar3.getContext();
                                            gy gyVar3 = ywVar3.K0;
                                            jh.o5 o5Var2 = new jh.o5(context, 0.0f, 1, ((org.telegram.ui.ActionBar.n2) gyVar3).resourceProvider);
                                            o5Var2.f13750e = new xw(ywVar3, view, 0);
                                            gyVar3.showDialog(o5Var2);
                                            break;
                                    }
                                }
                            };
                            if (z18) {
                                b70Var2 = b70Var;
                            } else {
                                b70Var.b(i12, dqVar2, string, g6.F8, g6.E8, runnable);
                                b70Var2 = b70Var;
                            }
                            b70Var2.E();
                            if (z11) {
                                z19 = false;
                            } else {
                                z19 = false;
                            }
                            final int i27 = 1;
                            b70Var2.l(R.drawable.msg_archive, LocaleController.getString(R.string.ArchivePeerStories), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (i27) {
                                        case 0:
                                            ywVar.K0.presentFragment(rn.R9(j10));
                                            break;
                                        case 1:
                                            gy gyVar2 = ywVar.K0;
                                            AndroidUtilities.runOnUIThread(new wv(gyVar2, j10, !gyVar2.e4(), 0), 200L);
                                            break;
                                        case 2:
                                            gy gyVar3 = ywVar.K0;
                                            AndroidUtilities.runOnUIThread(new wv(gyVar3, j10, !gyVar3.e4(), 0), 200L);
                                            break;
                                        case 3:
                                            gy gyVar4 = ywVar.K0;
                                            MediaDataController mediaDataController = MediaDataController.getInstance(((org.telegram.ui.ActionBar.n2) gyVar4).currentAccount);
                                            long j11 = j10;
                                            mediaDataController.removePeer(j11);
                                            gyVar4.getMessagesController().getStoriesController().i0(j11, true, false);
                                            break;
                                        case 4:
                                            ywVar.K0.A0.j(j10);
                                            break;
                                        case 5:
                                            ywVar.K0.presentFragment(rn.R9(j10));
                                            break;
                                        default:
                                            ywVar.K0.presentFragment(ProfileActivity.m4(j10));
                                            break;
                                    }
                                }
                            }, z19);
                            b70Var2.E();
                            if (z11) {
                                z20 = false;
                            } else {
                                z20 = false;
                            }
                            final int i28 = 2;
                            b70Var2.l(R.drawable.msg_unarchive, LocaleController.getString(R.string.UnarchiveStories), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (i28) {
                                        case 0:
                                            ywVar.K0.presentFragment(rn.R9(j10));
                                            break;
                                        case 1:
                                            gy gyVar2 = ywVar.K0;
                                            AndroidUtilities.runOnUIThread(new wv(gyVar2, j10, !gyVar2.e4(), 0), 200L);
                                            break;
                                        case 2:
                                            gy gyVar3 = ywVar.K0;
                                            AndroidUtilities.runOnUIThread(new wv(gyVar3, j10, !gyVar3.e4(), 0), 200L);
                                            break;
                                        case 3:
                                            gy gyVar4 = ywVar.K0;
                                            MediaDataController mediaDataController = MediaDataController.getInstance(((org.telegram.ui.ActionBar.n2) gyVar4).currentAccount);
                                            long j11 = j10;
                                            mediaDataController.removePeer(j11);
                                            gyVar4.getMessagesController().getStoriesController().i0(j11, true, false);
                                            break;
                                        case 4:
                                            ywVar.K0.A0.j(j10);
                                            break;
                                        case 5:
                                            ywVar.K0.presentFragment(rn.R9(j10));
                                            break;
                                        default:
                                            ywVar.K0.presentFragment(ProfileActivity.m4(j10));
                                            break;
                                    }
                                }
                            }, z20);
                            b70Var2.E();
                            final int i29 = 3;
                            b70Var2.l(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesRemoveFromRecent), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (i29) {
                                        case 0:
                                            ywVar.K0.presentFragment(rn.R9(j10));
                                            break;
                                        case 1:
                                            gy gyVar2 = ywVar.K0;
                                            AndroidUtilities.runOnUIThread(new wv(gyVar2, j10, !gyVar2.e4(), 0), 200L);
                                            break;
                                        case 2:
                                            gy gyVar3 = ywVar.K0;
                                            AndroidUtilities.runOnUIThread(new wv(gyVar3, j10, !gyVar3.e4(), 0), 200L);
                                            break;
                                        case 3:
                                            gy gyVar4 = ywVar.K0;
                                            MediaDataController mediaDataController = MediaDataController.getInstance(((org.telegram.ui.ActionBar.n2) gyVar4).currentAccount);
                                            long j11 = j10;
                                            mediaDataController.removePeer(j11);
                                            gyVar4.getMessagesController().getStoriesController().i0(j11, true, false);
                                            break;
                                        case 4:
                                            ywVar.K0.A0.j(j10);
                                            break;
                                        case 5:
                                            ywVar.K0.presentFragment(rn.R9(j10));
                                            break;
                                        default:
                                            ywVar.K0.presentFragment(ProfileActivity.m4(j10));
                                            break;
                                    }
                                }
                            }, z11);
                        } else if (gyVar.K3) {
                            b70 b70Var3 = gyVar.H0;
                            int i30 = R.drawable.msg_stories_add;
                            String string2 = LocaleController.getString(R.string.AddStory);
                            int i31 = g6.F8;
                            int i32 = g6.E8;
                            final int i33 = 0;
                            b70Var3.b(i30, null, string2, i31, i32, new Runnable() {
                                @Override
                                public final void run() {
                                    switch (i33) {
                                        case 0:
                                            ywVar.K0.A0.j(0L);
                                            break;
                                        case 1:
                                            Bundle bundle = new Bundle();
                                            gy gyVar2 = ywVar.K0;
                                            bundle.putLong("dialog_id", UserConfig.getInstance(((org.telegram.ui.ActionBar.n2) gyVar2).currentAccount).getClientUserId());
                                            bundle.putInt("type", 1);
                                            bundle.putInt("start_from", 9);
                                            gyVar2.presentFragment(new org.telegram.ui.Components.o90(bundle, null));
                                            break;
                                        default:
                                            Bundle bundle2 = new Bundle();
                                            gy gyVar3 = ywVar.K0;
                                            bundle2.putLong("dialog_id", UserConfig.getInstance(((org.telegram.ui.ActionBar.n2) gyVar3).currentAccount).getClientUserId());
                                            bundle2.putInt("type", 1);
                                            gyVar3.presentFragment(new org.telegram.ui.Components.o90(bundle2, null));
                                            break;
                                    }
                                }
                            });
                            final int i34 = 1;
                            gyVar.H0.b(R.drawable.msg_stories_archive, null, LocaleController.getString(R.string.ArchivedStories), i31, i32, new Runnable() {
                                @Override
                                public final void run() {
                                    switch (i34) {
                                        case 0:
                                            ywVar.K0.A0.j(0L);
                                            break;
                                        case 1:
                                            Bundle bundle = new Bundle();
                                            gy gyVar2 = ywVar.K0;
                                            bundle.putLong("dialog_id", UserConfig.getInstance(((org.telegram.ui.ActionBar.n2) gyVar2).currentAccount).getClientUserId());
                                            bundle.putInt("type", 1);
                                            bundle.putInt("start_from", 9);
                                            gyVar2.presentFragment(new org.telegram.ui.Components.o90(bundle, null));
                                            break;
                                        default:
                                            Bundle bundle2 = new Bundle();
                                            gy gyVar3 = ywVar.K0;
                                            bundle2.putLong("dialog_id", UserConfig.getInstance(((org.telegram.ui.ActionBar.n2) gyVar3).currentAccount).getClientUserId());
                                            bundle2.putInt("type", 1);
                                            gyVar3.presentFragment(new org.telegram.ui.Components.o90(bundle2, null));
                                            break;
                                    }
                                }
                            });
                            final int i35 = 2;
                            gyVar.H0.b(R.drawable.msg_stories_saved, null, LocaleController.getString(R.string.SavedStories), i31, i32, new Runnable() {
                                @Override
                                public final void run() {
                                    switch (i35) {
                                        case 0:
                                            ywVar.K0.A0.j(0L);
                                            break;
                                        case 1:
                                            Bundle bundle = new Bundle();
                                            gy gyVar2 = ywVar.K0;
                                            bundle.putLong("dialog_id", UserConfig.getInstance(((org.telegram.ui.ActionBar.n2) gyVar2).currentAccount).getClientUserId());
                                            bundle.putInt("type", 1);
                                            bundle.putInt("start_from", 9);
                                            gyVar2.presentFragment(new org.telegram.ui.Components.o90(bundle, null));
                                            break;
                                        default:
                                            Bundle bundle2 = new Bundle();
                                            gy gyVar3 = ywVar.K0;
                                            bundle2.putLong("dialog_id", UserConfig.getInstance(((org.telegram.ui.ActionBar.n2) gyVar3).currentAccount).getClientUserId());
                                            bundle2.putInt("type", 1);
                                            gyVar3.presentFragment(new org.telegram.ui.Components.o90(bundle2, null));
                                            break;
                                    }
                                }
                            });
                            z10 = false;
                        } else {
                            yw ywVar2 = gyVar.A0;
                            if (ywVar2 != null) {
                                ywVar2.n();
                            }
                        }
                        b70 b70Var4 = gyVar.H0;
                        b70Var4.f26974i = 3;
                        b70Var4.a0(AndroidUtilities.dp(-8.0f), AndroidUtilities.dp(-10.0f));
                        b70Var4.Z();
                        return z10;
                    }
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                }
                return false;
            default:
                vq0 vq0Var = ((kh.r) this.f8237b).S;
                if (vq0Var.C.f29163y1 || !(view instanceof o7)) {
                    return false;
                }
                MessageObject messageObject = ((o7) view).getMessageObject();
                if (vq0Var.c(messageObject)) {
                    vq0Var.g(messageObject);
                } else {
                    vq0Var.e(messageObject);
                }
                return true;
        }
    }

    @Override
    public Object apply(Object obj) {
        ((ae.b) this.f8237b).getClass();
        String strH = ia.g0.f11013b.h((ia.f0) obj);
        kotlin.jvm.internal.j.d(strH, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
        Log.d("EventGDTLogger", "Session Event: ".concat(strH));
        byte[] bytes = strH.getBytes(gd.a.f6839a);
        kotlin.jvm.internal.j.d(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @Override
    public void b(int i10) {
        switch (this.f8236a) {
            case 10:
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f8237b;
                if (i10 == 1) {
                    callback2.run(Boolean.TRUE, null);
                } else if (i10 != 3) {
                    callback2.run(Boolean.FALSE, null);
                }
                break;
            case 11:
                cg.u0 u0Var = (cg.u0) this.f8237b;
                if (i10 == 1) {
                    u0Var.run(Boolean.TRUE, null);
                } else if (i10 != 3) {
                    u0Var.run(Boolean.FALSE, null);
                }
                break;
            default:
                p5 p5Var = (p5) this.f8237b;
                if (i10 == 1) {
                    p5Var.run(Boolean.TRUE, null);
                } else if (i10 != 3) {
                    p5Var.run(Boolean.FALSE, null);
                }
                break;
        }
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        long j10;
        int i11;
        int i12;
        int i13;
        jh.g2 g2Var = (jh.g2) this.f8237b;
        hh.f1 f1Var = g2Var.f14012c;
        ArrayList arrayList = g2Var.f14017r;
        jh.t0 t0Var = ((jh.r0) view).f13883f;
        int i14 = g2Var.J;
        int currentTime = ConnectionsManager.getInstance(i14).getCurrentTime();
        HashSet hashSet = new HashSet();
        int i15 = 0;
        int i16 = 0;
        while (true) {
            if (i16 >= t0Var.f13989f.size()) {
                break;
            }
            jh.s0 s0Var = (jh.s0) t0Var.f13989f.get(i16);
            long j11 = s0Var.f13934g;
            if (j11 > 0 && currentTime - s0Var.d <= jh.s.b(i14, (int) j11, 0)) {
                hashSet.add(Integer.valueOf(s0Var.f13929a));
            }
            i16++;
        }
        jh.d1 d1Var = g2Var.L;
        long j12 = d1Var != null ? d1Var.j() : 0L;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            if (i17 >= arrayList.size()) {
                j10 = j12;
                i11 = -1;
                break;
            }
            jh.s0 s0Var2 = (jh.s0) arrayList.get(i17);
            if (s0Var2.f13930b || !s0Var2.f13932e || s0Var2.f13934g >= j12) {
                if (hashSet.contains(Integer.valueOf(s0Var2.f13929a))) {
                    j10 = j12;
                    if (g2Var.f14019w != t0Var.f13986b || (i13 = g2Var.f14020x) == 0 || s0Var2.f13929a < i13) {
                        i11 = s0Var2.f13929a;
                        break;
                    }
                } else {
                    j10 = j12;
                }
                i18++;
            } else {
                j10 = j12;
            }
            i17++;
            j12 = j10;
        }
        if (i11 < 0) {
            int i19 = 0;
            while (true) {
                if (i15 >= arrayList.size()) {
                    i18 = i19;
                    i12 = -1;
                    break;
                }
                jh.s0 s0Var3 = (jh.s0) arrayList.get(i15);
                if (s0Var3.f13930b || !s0Var3.f13932e || s0Var3.f13934g >= j10) {
                    if (hashSet.contains(Integer.valueOf(s0Var3.f13929a))) {
                        i12 = s0Var3.f13929a;
                        i18 = i19;
                        break;
                    }
                    i19++;
                }
                i15++;
            }
        } else {
            i12 = i11;
        }
        if (i12 < 0) {
            return;
        }
        g2Var.f14019w = t0Var.f13986b;
        g2Var.f14020x = i12;
        g2Var.f14021y = true;
        f2.v0 itemAnimator = f1Var.getItemAnimator();
        f1Var.setItemAnimator(null);
        g2Var.d.i1(i18, f1Var.getHeight() / 2, true);
        g2Var.f14014e.m(i18);
        f1Var.setItemAnimator(itemAnimator);
    }

    @Override
    public void d(float f10, Canvas canvas, RectF rectF, boolean z10) {
        Path path = (Path) this.f8237b;
        if (z10) {
            return;
        }
        path.rewind();
        float fPow = (float) Math.pow(f10, 2.0d);
        path.addCircle((rectF.right + AndroidUtilities.dp(7.0f)) - (AndroidUtilities.dp(14.0f) * fPow), (rectF.bottom + AndroidUtilities.dp(7.0f)) - (AndroidUtilities.dp(14.0f) * fPow), AndroidUtilities.dp(11.0f), Path.Direction.CW);
        canvas.clipPath(path, Region.Op.DIFFERENCE);
    }

    @Override
    public void e(boolean z10) {
        b5 b5Var = (b5) this.f8237b;
        if (b5Var != null) {
            b5Var.c();
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f8236a) {
            case 6:
                ((Utilities.Callback) this.f8237b).run(b2Var.g(i10, true, true));
                break;
            default:
                ((Runnable) this.f8237b).run();
                break;
        }
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public void g(long j10) {
        ((v4) this.f8237b).h();
    }

    @Override
    public void i(eh.k kVar, float f10, float f11) {
        y7 y7Var = (y7) this.f8237b;
        z7 z7Var = y7Var.v;
        if (z7Var.f14201x) {
            return;
        }
        kVar.f5525q = new x7(y7Var, 2);
        float fSqrt = (float) Math.sqrt(Math.pow(z7Var.getHeight(), 2.0d) + Math.pow(z7Var.getWidth(), 2.0d));
        ArrayList arrayList = y7Var.f14162i;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((eh.k) obj).j(f10, f11, fSqrt, false);
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f8236a) {
            case 0:
                ((a2) obj).onAudioAttributesChanged((j3.e) this.f8237b);
                break;
            case 1:
                ((a2) obj).onCues((r4.d) this.f8237b);
                break;
            case 2:
                ((a2) obj).onMediaMetadataChanged(((h0) this.f8237b).f7870a.O);
                break;
            case 3:
                ((a2) obj).onMetadata((z3.c) this.f8237b);
                break;
            case 4:
                ((a2) obj).onDeviceInfoChanged((m) this.f8237b);
                break;
            case 14:
                ((i3.b) obj).b((j4.x) this.f8237b);
                break;
            case 15:
                ((i3.b) obj).a((v1) this.f8237b);
                break;
            default:
                ((i3.b) obj).h((k3.f) this.f8237b);
                break;
        }
    }

    @Override
    public void o(int i10, float f10, float f11, ud.c cVar) {
        View view = ((k5) this.f8237b).f9582b;
        if (view instanceof org.telegram.ui.Cells.v0) {
            ((org.telegram.ui.Cells.v0) view).K();
        } else {
            view.invalidate();
        }
    }

    @Override
    public Object run(Object obj, Object obj2) {
        switch (this.f8236a) {
            case 20:
                return jh.u0.a((jh.u0) this.f8237b, (Long) obj2);
            default:
                vq0 vq0Var = (vq0) this.f8237b;
                if (((Integer) obj).intValue() != -1) {
                    return Boolean.FALSE;
                }
                new kh.u(vq0Var.f15229a, LocaleController.getString(R.string.ProfileBotPreviewLanguageChoose), new ag.n0(vq0Var, 23)).show();
                return Boolean.TRUE;
        }
    }

    public x(i3.a aVar, Object obj, int i10) {
        this.f8236a = i10;
        this.f8237b = obj;
    }

    public x(Object obj, int i10) {
        this.f8236a = i10;
        this.f8237b = obj;
    }

    @Override
    public void mo18run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f8236a) {
            case 9:
                u7.b((u7) this.f8237b, (ArrayList) obj, (Integer) obj2, (Long) obj3, (ArrayList) obj4, (ArrayList) obj5);
                break;
            default:
                la laVar = (la) this.f8237b;
                n41 n41Var = (n41) obj;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                laVar.getClass();
                if (n41Var.G instanceof TL_stars.StarsTransaction) {
                    oa.h1(laVar.getContext(), false, 0L, laVar.f9690c, (TL_stars.StarsTransaction) n41Var.G, laVar.f9689b);
                }
                break;
        }
    }

    @Override
    public void A(float f10, int i10) {
    }

    @Override
    public void c0(View view, float f10, float f11) {
    }
}
