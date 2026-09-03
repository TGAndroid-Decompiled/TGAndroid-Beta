package ah;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.util.StateSet;
import cg.f1;
import cg.f2;
import d4.t;
import dg.j;
import dg.q3;
import gg.v1;
import j3.c0;
import j3.f0;
import java.util.ArrayList;
import java.util.Collections;
import lh.q;
import lh.t7;
import nh.t6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e5;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.e0;
import org.telegram.ui.Cells.j1;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Cells.z;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.bd;
import org.telegram.ui.Components.eg;
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.h8;
import org.telegram.ui.Components.l1;
import org.telegram.ui.Components.mm;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.nm;
import org.telegram.ui.Components.u1;
import org.telegram.ui.Components.uf;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.h;
import org.telegram.ui.he;
import org.telegram.ui.ln;
import org.telegram.ui.mt0;
import org.telegram.ui.ns0;
import org.telegram.ui.rm;
import org.telegram.ui.u4;
import org.telegram.ui.xi;
import org.telegram.ui.yi;
import org.telegram.ui.zi;
import org.telegram.ui.zn;
import ph.f3;
public final class b implements Runnable {
    public final int f206a;
    public final int f207b;
    public final Object f208c;

    public b(int i10, Object obj, int i11) {
        this.f206a = i11;
        this.f207b = i10;
        this.f208c = obj;
    }

    @Override
    public final void run() {
        l3.d dVar;
        int i10;
        String str;
        CharSequence charSequence;
        int i11;
        int i12;
        int i13;
        int i14 = this.f206a;
        int i15 = 2;
        boolean z4 = false;
        int i16 = 1;
        int i17 = this.f207b;
        Object obj = this.f208c;
        switch (i14) {
            case 0:
                ((c) obj).v0(i17, 0, null);
                return;
            case 1:
                j jVar = (j) obj;
                jVar.I = i17;
                jVar.H = true;
                try {
                    jVar.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                ValueAnimator valueAnimator = jVar.M;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimator2 = jVar.N;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                jVar.M = duration;
                duration.setInterpolator(mr.f27122f);
                jVar.M.addUpdateListener(new dg.f(jVar, 5));
                jVar.M.addListener(new dg.g(jVar, 2));
                jVar.M.start();
                return;
            case 2:
                mt0 mt0Var = (mt0) obj;
                f2 f2Var = mt0Var.H1;
                mt0Var.s0(f2Var, null);
                f1.e(i17).j(f2Var.f2386c);
                return;
            case 3:
                q3 q3Var = (q3) obj;
                q3Var.getClass();
                NotificationCenter.getInstance(i17).lambda$postNotificationNameOnUIThread$1(NotificationCenter.customStickerCreated, Boolean.FALSE);
                q3Var.h();
                return;
            case 4:
                f90 f90Var = ((v1) obj).e;
                try {
                    if (f90Var.getLayout().getLineForOffset(i17) == 0) {
                        f90Var.getEditableText().insert(i17, "\n");
                        return;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 5:
                j3.d dVar2 = ((j3.c) obj).f8422b;
                if (i17 != -3 && i17 != -2) {
                    if (i17 != -1) {
                        if (i17 != 1) {
                            e2.c.q(i17, "Unknown focus change type: ", "AudioFocusManager");
                            return;
                        }
                        dVar2.c(1);
                        c0 c0Var = dVar2.f8442c;
                        if (c0Var != null) {
                            f0 f0Var = c0Var.f8423a;
                            f0Var.g0(1, 1, f0Var.j());
                            return;
                        }
                        return;
                    }
                    c0 c0Var2 = dVar2.f8442c;
                    if (c0Var2 != null) {
                        f0 f0Var2 = c0Var2.f8423a;
                        boolean j10 = f0Var2.j();
                        if (!j10) {
                            i15 = 1;
                        }
                        f0Var2.g0(-1, i15, j10);
                    }
                    dVar2.a();
                    return;
                } else if (i17 != -2 && ((dVar = dVar2.d) == null || dVar.f11243a != 1)) {
                    dVar2.c(3);
                    return;
                } else {
                    c0 c0Var3 = dVar2.f8442c;
                    if (c0Var3 != null) {
                        f0 f0Var3 = c0Var3.f8423a;
                        boolean j11 = f0Var3.j();
                        if (j11) {
                            i16 = 2;
                        }
                        f0Var3.g0(0, i16, j11);
                    }
                    dVar2.c(2);
                    return;
                }
            case 6:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(i17).clientUserId);
                ((e5) obj).getLastFragment().presentFragment(new ProfileActivity(bundle, null));
                return;
            case 7:
                ze.d.s(((q) obj).getParentActivity(), LocaleController.getString(i17));
                return;
            case 8:
                ConnectionsManager.getInstance(((t7) obj).f13133a).cancelRequest(i17, true);
                return;
            case 9:
                mg.f fVar = (mg.f) obj;
                if (fVar.f13985b) {
                    Utilities.Callback callback = fVar.d;
                    if (callback != null) {
                        if (i17 < 300) {
                            z4 = true;
                        }
                        callback.run(Boolean.valueOf(z4));
                        try {
                            fVar.f13984a.performHapticFeedback(3);
                        } catch (Exception unused2) {
                        }
                    }
                    fVar.f13986c = true;
                    int max = Math.max(50, i17 - 100);
                    AndroidUtilities.runOnUIThread(new b(fVar, max, 9), max);
                    return;
                }
                return;
            case 10:
                t6 t6Var = (t6) obj;
                ArrayList arrayList = t6Var.f15901g;
                t6Var.v(arrayList);
                t tVar = t6Var.J;
                Collections.sort(arrayList, tVar);
                ArrayList arrayList2 = t6Var.h;
                t6Var.v(arrayList2);
                Collections.sort(arrayList2, tVar);
                NotificationCenter.getInstance(i17).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                return;
            case 11:
                ConnectionsManager.lambda$onUpdateConfig$21(i17, (TLRPC.TL_config) obj);
                return;
            case 12:
                MessagesController.getInstance(i17).loadFullChat(((TLRPC.Chat) obj).f19159id, 0, true);
                return;
            case 13:
                ((u4) ((h) obj).f34532b).V(i17, true);
                return;
            case 14:
                s1 s1Var = (s1) obj;
                int i18 = s1Var.f22170s7;
                if (i17 == i18) {
                    e0 e0Var = (e0) s1Var.f22069l7.get(i18);
                    if (e0Var != null) {
                        z zVar = e0Var.f20976s;
                        if (zVar != null) {
                            zVar.setState(StateSet.NOTHING);
                        }
                        e0Var.b(false);
                        if (!s1Var.f22210v7.scheduled) {
                            if (e0Var.f20967j != null) {
                                s1Var.k();
                            } else if (e0Var.f20966i != null) {
                                s1Var.k();
                                j1 j1Var = s1Var.Gc;
                                if (j1Var != null) {
                                    j1Var.L1(s1Var, e0Var.f20966i);
                                }
                            }
                        }
                    }
                    s1Var.f22170s7 = -1;
                    s1Var.a3();
                    return;
                }
                return;
            case 15:
                ((he) obj).f34653f.c(i17);
                return;
            case 16:
                ((zi) obj).f40488a.j(this.f207b, 0, true, 0, true, 0);
                return;
            case 17:
                zn znVar = ((xi) obj).f39993g;
                if (znVar.f40757tb == i17) {
                    znVar.Ma();
                    return;
                }
                return;
            case 18:
                zn znVar2 = ((yi) obj).f40285g;
                if (znVar2.f40757tb == i17) {
                    znVar2.Ma();
                    return;
                }
                return;
            case 19:
                zn znVar3 = ((xi) obj).f39993g;
                if (znVar3.f40757tb == i17) {
                    znVar3.Ma();
                    return;
                }
                return;
            case 20:
                zn znVar4 = ((yi) obj).f40285g;
                if (znVar4.f40757tb == i17) {
                    znVar4.Ma();
                    return;
                }
                return;
            case 21:
                zn znVar5 = ((yi) obj).f40285g;
                if (znVar5.f40757tb == i17) {
                    znVar5.Ma();
                    return;
                }
                return;
            case 22:
                zn znVar6 = ((rm) obj).G0;
                znVar6.f40786w0.h1(i17, znVar6.f40776v4);
                return;
            case 23:
                i10 = ((p2) ((ln) obj).f35808a).currentAccount;
                ConnectionsManager.getInstance(i10).cancelRequest(i17, true);
                return;
            case 24:
                NotificationCenter.getInstance(i17).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                AndroidUtilities.runOnUIThread(new u1((MessagesStorage.BooleanCallback) obj, 1), 250L);
                return;
            case 25:
                f90 f90Var2 = (f90) obj;
                ArrayList<TLRPC.PrivacyRule> privacyRules = ContactsController.getInstance(i17).getPrivacyRules(11);
                String string = LocaleController.getString(R.string.EditProfileBirthdayInfoContacts);
                if (privacyRules != null && !privacyRules.isEmpty()) {
                    int i19 = 0;
                    while (true) {
                        if (i19 < privacyRules.size()) {
                            if (privacyRules.get(i19) instanceof TLRPC.TL_privacyValueAllowContacts) {
                                string = LocaleController.getString(R.string.EditProfileBirthdayInfoContacts);
                            } else {
                                if ((privacyRules.get(i19) instanceof TLRPC.TL_privacyValueAllowAll) || (privacyRules.get(i19) instanceof TLRPC.TL_privacyValueDisallowAll)) {
                                    string = LocaleController.getString(R.string.EditProfileBirthdayInfo);
                                }
                                i19++;
                            }
                        }
                    }
                }
                f90Var2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new l1(privacyRules, 0)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
                return;
            case 26:
                ((h8) obj).b(i17);
                return;
            case 27:
                bd bdVar = (bd) obj;
                f3 f3Var = bdVar.f23631a1;
                if (bdVar.Y0 != i17) {
                    bdVar.setTimer(i17);
                    Utilities.Callback callback2 = bdVar.f23644o1;
                    if (callback2 != null) {
                        callback2.run(Integer.valueOf(i17));
                    }
                    float f10 = 1.0f;
                    if (i17 == 0) {
                        if (bdVar.f23643n1) {
                            i13 = R.string.TimerPeriodVideoKeep;
                        } else {
                            i13 = R.string.TimerPeriodPhotoKeep;
                        }
                        charSequence = LocaleController.getString(i13);
                        f3Var.h = bdVar.getMeasuredWidth();
                        f3Var.p(false);
                        f3Var.k(13.0f, 4.0f, 10.0f, 4.0f);
                        f3Var.f41653b0 = AndroidUtilities.dp(0);
                        f3Var.f41651a0 = -AndroidUtilities.dp(1.0f);
                    } else if (i17 == Integer.MAX_VALUE) {
                        if (bdVar.f23643n1) {
                            i11 = R.string.TimerPeriodVideoSetOnce;
                        } else {
                            i11 = R.string.TimerPeriodPhotoSetOnce;
                        }
                        charSequence = LocaleController.getString(i11);
                        f3Var.h = bdVar.getMeasuredWidth();
                        f3Var.p(false);
                        f3Var.k(13.0f, 4.0f, 10.0f, 4.0f);
                        f3Var.f41653b0 = AndroidUtilities.dp(0);
                        f3Var.f41651a0 = -AndroidUtilities.dp(1.0f);
                    } else if (i17 > 0) {
                        if (bdVar.f23643n1) {
                            str = "TimerPeriodVideoSetSeconds";
                        } else {
                            str = "TimerPeriodPhotoSetSeconds";
                        }
                        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, i17, new Object[0]));
                        f3Var.p(true);
                        f3Var.h = f3.a(replaceTags, f3Var.getTextPaint());
                        f3Var.k(12.0f, 7.0f, 11.0f, 7.0f);
                        f3Var.f41653b0 = AndroidUtilities.dp(2);
                        f3Var.f41651a0 = 0.0f;
                        charSequence = replaceTags;
                    } else {
                        return;
                    }
                    float dp = (-Math.min(AndroidUtilities.dp(34.0f), bdVar.getEditTextHeight())) - AndroidUtilities.dp(14.0f);
                    if (bdVar instanceof ns0) {
                        f10 = -1.0f;
                    }
                    f3Var.setTranslationY(dp * f10);
                    f3Var.s(charSequence);
                    if (i17 > 0) {
                        i12 = R.raw.fire_on;
                    } else {
                        i12 = R.raw.fire_off;
                    }
                    gj0 gj0Var = new gj0(i12, AndroidUtilities.dp(34.0f), AndroidUtilities.dp(34.0f));
                    gj0Var.start();
                    f3Var.j(gj0Var);
                    f3Var.u();
                    bdVar.l1 = false;
                    AndroidUtilities.cancelRunOnUIThread(bdVar.f23642m1);
                    bdVar.invalidate();
                    return;
                }
                return;
            case 28:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                if (i17 == 0) {
                    chatActivityEnterView.f22828w2 = 0;
                }
                chatActivityEnterView.S0 = null;
                uf ufVar = chatActivityEnterView.R0;
                if (ufVar != null) {
                    if (chatActivityEnterView.Z4 == null) {
                        ufVar.setTranslationY(0.0f);
                    }
                    chatActivityEnterView.R0.setVisibility(8);
                    chatActivityEnterView.f22760j1.removeView(chatActivityEnterView.R0);
                    if (chatActivityEnterView.C3) {
                        chatActivityEnterView.C3 = false;
                        chatActivityEnterView.R0 = null;
                    }
                }
                eg egVar = chatActivityEnterView.V2;
                if (egVar != null) {
                    egVar.x(0.0f);
                }
                chatActivityEnterView.requestLayout();
                return;
            default:
                mm mmVar = (mm) obj;
                nm nmVar = mmVar.M;
                if (i17 == mmVar.L && nmVar.f27301w.isShown()) {
                    nmVar.f27301w.e(1, true);
                    return;
                }
                return;
        }
    }

    public b(Object obj, int i10, int i11) {
        this.f206a = i11;
        this.f208c = obj;
        this.f207b = i10;
    }
}
