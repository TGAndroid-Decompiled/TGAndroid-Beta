package af;

import android.animation.ValueAnimator;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.util.StateSet;
import d4.t;
import dg.e1;
import dg.e2;
import eg.j;
import eg.o3;
import hg.v1;
import j3.c0;
import j3.f0;
import java.util.ArrayList;
import java.util.Collections;
import mh.p;
import mh.t7;
import oh.t6;
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
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.f5;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.e0;
import org.telegram.ui.Cells.k1;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Cells.z;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.bd;
import org.telegram.ui.Components.eg;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.h8;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.l1;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.u1;
import org.telegram.ui.Components.uf;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.fe;
import org.telegram.ui.h;
import org.telegram.ui.jn;
import org.telegram.ui.mt0;
import org.telegram.ui.ns0;
import org.telegram.ui.pm;
import org.telegram.ui.s4;
import org.telegram.ui.vi;
import org.telegram.ui.wi;
import org.telegram.ui.xi;
import org.telegram.ui.xn;
import qh.e3;
public final class b implements Runnable {
    public final int f169a;
    public final int f170b;
    public final Object f171c;

    public b(int i10, Object obj, int i11) {
        this.f169a = i11;
        this.f170b = i10;
        this.f171c = obj;
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
        int i14 = this.f169a;
        int i15 = 2;
        int i16 = 1;
        boolean z4 = false;
        final int i17 = this.f170b;
        Object obj = this.f171c;
        switch (i14) {
            case 0:
                d2[] d2VarArr = (d2[]) obj;
                d2 d2Var = d2VarArr[0];
                if (d2Var != null) {
                    try {
                        d2Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                            @Override
                            public final void onCancel(DialogInterface dialogInterface) {
                                ConnectionsManager.getInstance(UserConfig.selectedAccount).cancelRequest(i17, true);
                            }
                        });
                        d2VarArr[0].show();
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 1:
                ((bh.b) obj).v0(i17, 0, null);
                return;
            case 2:
                j jVar = (j) obj;
                jVar.I = i17;
                jVar.H = true;
                try {
                    jVar.performHapticFeedback(3, 2);
                } catch (Exception unused2) {
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
                duration.setInterpolator(pr.f30168f);
                jVar.M.addUpdateListener(new eg.f(jVar, 5));
                jVar.M.addListener(new eg.g(jVar, 2));
                jVar.M.start();
                return;
            case 3:
                mt0 mt0Var = (mt0) obj;
                e2 e2Var = mt0Var.H1;
                mt0Var.s0(e2Var, null);
                e1.e(i17).j(e2Var.f4526c);
                return;
            case 4:
                o3 o3Var = (o3) obj;
                o3Var.getClass();
                NotificationCenter.getInstance(i17).lambda$postNotificationNameOnUIThread$1(NotificationCenter.customStickerCreated, Boolean.FALSE);
                o3Var.h();
                return;
            case 5:
                g90 g90Var = ((v1) obj).f7631e;
                try {
                    if (g90Var.getLayout().getLineForOffset(i17) == 0) {
                        g90Var.getEditableText().insert(i17, "\n");
                        return;
                    }
                    return;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
            case 6:
                j3.d dVar2 = ((j3.c) obj).f8999b;
                if (i17 != -3 && i17 != -2) {
                    if (i17 != -1) {
                        if (i17 != 1) {
                            e2.c.q(i17, "Unknown focus change type: ", "AudioFocusManager");
                            return;
                        }
                        dVar2.c(1);
                        c0 c0Var = dVar2.f9021c;
                        if (c0Var != null) {
                            f0 f0Var = c0Var.f9000a;
                            f0Var.g0(1, 1, f0Var.j());
                            return;
                        }
                        return;
                    }
                    c0 c0Var2 = dVar2.f9021c;
                    if (c0Var2 != null) {
                        f0 f0Var2 = c0Var2.f9000a;
                        boolean j10 = f0Var2.j();
                        if (!j10) {
                            i15 = 1;
                        }
                        f0Var2.g0(-1, i15, j10);
                    }
                    dVar2.a();
                    return;
                } else if (i17 != -2 && ((dVar = dVar2.d) == null || dVar.f11494a != 1)) {
                    dVar2.c(3);
                    return;
                } else {
                    c0 c0Var3 = dVar2.f9021c;
                    if (c0Var3 != null) {
                        f0 f0Var3 = c0Var3.f9000a;
                        boolean j11 = f0Var3.j();
                        if (j11) {
                            i16 = 2;
                        }
                        f0Var3.g0(0, i16, j11);
                    }
                    dVar2.c(2);
                    return;
                }
            case 7:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(i17).clientUserId);
                ((f5) obj).getLastFragment().presentFragment(new ProfileActivity(bundle, null));
                return;
            case 8:
                g.s(((p) obj).getParentActivity(), LocaleController.getString(i17));
                return;
            case 9:
                ConnectionsManager.getInstance(((t7) obj).f14830a).cancelRequest(i17, true);
                return;
            case 10:
                ng.f fVar = (ng.f) obj;
                if (fVar.f16062b) {
                    Utilities.Callback callback = fVar.d;
                    if (callback != null) {
                        if (i17 < 300) {
                            z4 = true;
                        }
                        callback.run(Boolean.valueOf(z4));
                        try {
                            fVar.f16061a.performHapticFeedback(3);
                        } catch (Exception unused3) {
                        }
                    }
                    fVar.f16063c = true;
                    int max = Math.max(50, i17 - 100);
                    AndroidUtilities.runOnUIThread(new b(fVar, max, 10), max);
                    return;
                }
                return;
            case 11:
                t6 t6Var = (t6) obj;
                ArrayList arrayList = t6Var.f17777g;
                t6Var.v(arrayList);
                t tVar = t6Var.J;
                Collections.sort(arrayList, tVar);
                ArrayList arrayList2 = t6Var.h;
                t6Var.v(arrayList2);
                Collections.sort(arrayList2, tVar);
                NotificationCenter.getInstance(i17).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                return;
            case 12:
                ConnectionsManager.lambda$onUpdateConfig$21(i17, (TLRPC.TL_config) obj);
                return;
            case 13:
                MessagesController.getInstance(i17).loadFullChat(((TLRPC.Chat) obj).f20845id, 0, true);
                return;
            case 14:
                ((s4) ((h) obj).f37188b).V(i17, true);
                return;
            case 15:
                t1 t1Var = (t1) obj;
                int i18 = t1Var.f24035s7;
                if (i17 == i18) {
                    e0 e0Var = (e0) t1Var.f23934l7.get(i18);
                    if (e0Var != null) {
                        z zVar = e0Var.f22716s;
                        if (zVar != null) {
                            zVar.setState(StateSet.NOTHING);
                        }
                        e0Var.b(false);
                        if (!t1Var.f24075v7.scheduled) {
                            if (e0Var.f22707j != null) {
                                t1Var.k();
                            } else if (e0Var.f22706i != null) {
                                t1Var.k();
                                k1 k1Var = t1Var.Gc;
                                if (k1Var != null) {
                                    k1Var.O1(t1Var, e0Var.f22706i);
                                }
                            }
                        }
                    }
                    t1Var.f24035s7 = -1;
                    t1Var.a3();
                    return;
                }
                return;
            case 16:
                ((fe) obj).f36782f.c(i17);
                return;
            case 17:
                ((xi) obj).f43057a.j(this.f170b, 0, true, 0, true, 0);
                return;
            case 18:
                xn xnVar = ((vi) obj).f42149g;
                if (xnVar.f43338tb == i17) {
                    xnVar.Ma();
                    return;
                }
                return;
            case 19:
                xn xnVar2 = ((wi) obj).f42783g;
                if (xnVar2.f43338tb == i17) {
                    xnVar2.Ma();
                    return;
                }
                return;
            case 20:
                xn xnVar3 = ((vi) obj).f42149g;
                if (xnVar3.f43338tb == i17) {
                    xnVar3.Ma();
                    return;
                }
                return;
            case 21:
                xn xnVar4 = ((wi) obj).f42783g;
                if (xnVar4.f43338tb == i17) {
                    xnVar4.Ma();
                    return;
                }
                return;
            case 22:
                xn xnVar5 = ((wi) obj).f42783g;
                if (xnVar5.f43338tb == i17) {
                    xnVar5.Ma();
                    return;
                }
                return;
            case 23:
                xn xnVar6 = ((pm) obj).G0;
                xnVar6.f43367w0.h1(i17, xnVar6.f43357v4);
                return;
            case 24:
                i10 = ((p2) ((jn) obj).f38085a).currentAccount;
                ConnectionsManager.getInstance(i10).cancelRequest(i17, true);
                return;
            case 25:
                NotificationCenter.getInstance(i17).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                AndroidUtilities.runOnUIThread(new u1((MessagesStorage.BooleanCallback) obj, 1), 250L);
                return;
            case 26:
                g90 g90Var2 = (g90) obj;
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
                g90Var2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new l1(privacyRules, 0)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
                return;
            case 27:
                ((h8) obj).b(i17);
                return;
            case 28:
                bd bdVar = (bd) obj;
                e3 e3Var = bdVar.f25578a1;
                if (bdVar.Y0 != i17) {
                    bdVar.setTimer(i17);
                    Utilities.Callback callback2 = bdVar.f25591o1;
                    if (callback2 != null) {
                        callback2.run(Integer.valueOf(i17));
                    }
                    float f10 = 1.0f;
                    if (i17 == 0) {
                        if (bdVar.f25590n1) {
                            i13 = R.string.TimerPeriodVideoKeep;
                        } else {
                            i13 = R.string.TimerPeriodPhotoKeep;
                        }
                        charSequence = LocaleController.getString(i13);
                        e3Var.h = bdVar.getMeasuredWidth();
                        e3Var.p(false);
                        e3Var.k(13.0f, 4.0f, 10.0f, 4.0f);
                        e3Var.f45262b0 = AndroidUtilities.dp(0);
                        e3Var.f45260a0 = -AndroidUtilities.dp(1.0f);
                    } else if (i17 == Integer.MAX_VALUE) {
                        if (bdVar.f25590n1) {
                            i11 = R.string.TimerPeriodVideoSetOnce;
                        } else {
                            i11 = R.string.TimerPeriodPhotoSetOnce;
                        }
                        charSequence = LocaleController.getString(i11);
                        e3Var.h = bdVar.getMeasuredWidth();
                        e3Var.p(false);
                        e3Var.k(13.0f, 4.0f, 10.0f, 4.0f);
                        e3Var.f45262b0 = AndroidUtilities.dp(0);
                        e3Var.f45260a0 = -AndroidUtilities.dp(1.0f);
                    } else if (i17 > 0) {
                        if (bdVar.f25590n1) {
                            str = "TimerPeriodVideoSetSeconds";
                        } else {
                            str = "TimerPeriodPhotoSetSeconds";
                        }
                        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, i17, new Object[0]));
                        e3Var.p(true);
                        e3Var.h = e3.a(replaceTags, e3Var.getTextPaint());
                        e3Var.k(12.0f, 7.0f, 11.0f, 7.0f);
                        e3Var.f45262b0 = AndroidUtilities.dp(2);
                        e3Var.f45260a0 = 0.0f;
                        charSequence = replaceTags;
                    } else {
                        return;
                    }
                    float dp = (-Math.min(AndroidUtilities.dp(34.0f), bdVar.getEditTextHeight())) - AndroidUtilities.dp(14.0f);
                    if (bdVar instanceof ns0) {
                        f10 = -1.0f;
                    }
                    e3Var.setTranslationY(dp * f10);
                    e3Var.s(charSequence);
                    if (i17 > 0) {
                        i12 = R.raw.fire_on;
                    } else {
                        i12 = R.raw.fire_off;
                    }
                    hj0 hj0Var = new hj0(i12, AndroidUtilities.dp(34.0f), AndroidUtilities.dp(34.0f));
                    hj0Var.start();
                    e3Var.j(hj0Var);
                    e3Var.u();
                    bdVar.l1 = false;
                    AndroidUtilities.cancelRunOnUIThread(bdVar.f25589m1);
                    bdVar.invalidate();
                    return;
                }
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                if (i17 == 0) {
                    chatActivityEnterView.f24697w2 = 0;
                }
                chatActivityEnterView.S0 = null;
                uf ufVar = chatActivityEnterView.R0;
                if (ufVar != null) {
                    if (chatActivityEnterView.Z4 == null) {
                        ufVar.setTranslationY(0.0f);
                    }
                    chatActivityEnterView.R0.setVisibility(8);
                    chatActivityEnterView.f24629j1.removeView(chatActivityEnterView.R0);
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
        }
    }

    public b(Object obj, int i10, int i11) {
        this.f169a = i11;
        this.f171c = obj;
        this.f170b = i10;
    }
}
