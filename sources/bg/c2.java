package bg;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.StateSet;
import gh.v7;
import ih.v6;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import kh.a8;
import kh.wb;
import kh.x3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.h8;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ae;
import org.telegram.ui.cn;
import org.telegram.ui.im;
import org.telegram.ui.ni;
import org.telegram.ui.oi;
import org.telegram.ui.p4;
import org.telegram.ui.pi;
import org.telegram.ui.qn;
import org.telegram.ui.zr0;
public final class c2 implements Runnable {
    public final int f1719a;
    public final int f1720b;
    public final Object f1721c;

    public c2(int i9, Object obj, int i10) {
        this.f1719a = i10;
        this.f1720b = i9;
        this.f1721c = obj;
    }

    @Override
    public final void run() {
        j3.e eVar;
        ArrayList<TLRPC.MessageEntity> arrayList;
        ArrayList<TLRPC.MessageEntity> arrayList2;
        boolean z10;
        int i9;
        int i10;
        String str;
        CharSequence charSequence;
        int i11;
        int i12;
        int i13;
        int i14 = this.f1719a;
        int i15 = 2;
        boolean z11 = false;
        int i16 = 1;
        int i17 = this.f1720b;
        Object obj = this.f1721c;
        switch (i14) {
            case 0:
                l80 l80Var = ((f2) obj).f1761e;
                try {
                    if (l80Var.getLayout().getLineForOffset(i17) == 0) {
                        l80Var.getEditableText().insert(i17, "\n");
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 1:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(i17).clientUserId);
                ((b5) obj).getLastFragment().presentFragment(new ProfileActivity(bundle, null));
                return;
            case 2:
                ve.e.s(((gh.r) obj).getParentActivity(), LocaleController.getString(i17));
                return;
            case 3:
                ConnectionsManager.getInstance(((v7) obj).f9045a).cancelRequest(i17, true);
                return;
            case 4:
                h3.d dVar = ((h3.c) obj).f9359b;
                if (i17 != -3 && i17 != -2) {
                    if (i17 != -1) {
                        if (i17 != 1) {
                            e2.c.t(i17, "Unknown focus change type: ", "AudioFocusManager");
                            return;
                        }
                        dVar.c(1);
                        h3.h0 h0Var = dVar.f9369c;
                        if (h0Var != null) {
                            h3.k0 k0Var = h0Var.f9440a;
                            k0Var.n0(1, 1, k0Var.h());
                            return;
                        }
                        return;
                    }
                    h3.h0 h0Var2 = dVar.f9369c;
                    if (h0Var2 != null) {
                        h3.k0 k0Var2 = h0Var2.f9440a;
                        boolean h = k0Var2.h();
                        if (!h) {
                            i15 = 1;
                        }
                        k0Var2.n0(-1, i15, h);
                    }
                    dVar.a();
                    return;
                } else if (i17 != -2 && ((eVar = dVar.d) == null || eVar.f13225a != 1)) {
                    dVar.c(3);
                    return;
                } else {
                    h3.h0 h0Var3 = dVar.f9369c;
                    if (h0Var3 != null) {
                        h3.k0 k0Var3 = h0Var3.f9440a;
                        boolean h10 = k0Var3.h();
                        if (h10) {
                            i16 = 2;
                        }
                        k0Var3.n0(0, i16, h10);
                    }
                    dVar.c(2);
                    return;
                }
            case 5:
                hg.f fVar = (hg.f) obj;
                if (fVar.f10599b) {
                    Utilities.Callback callback = fVar.d;
                    if (callback != null) {
                        if (i17 < 300) {
                            z11 = true;
                        }
                        callback.run(Boolean.valueOf(z11));
                        try {
                            fVar.f10598a.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    fVar.f10600c = true;
                    int max = Math.max(50, i17 - 100);
                    AndroidUtilities.runOnUIThread(new c2(fVar, max, 5), max);
                    return;
                }
                return;
            case 6:
                v6 v6Var = (v6) obj;
                ArrayList arrayList3 = v6Var.f12241g;
                v6Var.v(arrayList3);
                l0 l0Var = v6Var.J;
                Collections.sort(arrayList3, l0Var);
                ArrayList arrayList4 = v6Var.h;
                v6Var.v(arrayList4);
                Collections.sort(arrayList4, l0Var);
                NotificationCenter.getInstance(i17).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                return;
            case 7:
                ((kh.o) obj).run(Integer.valueOf(i17));
                return;
            case 8:
                ((Utilities.Callback) obj).run(Integer.valueOf(i17));
                return;
            case 9:
                ((kh.n2) obj).o0(i17);
                return;
            case 10:
                MessagesController.getInstance(i17).putUsers((ArrayList) obj, true);
                return;
            case 11:
                wb wbVar = (wb) obj;
                int i18 = wbVar.f16253c;
                wbVar.m();
                wbVar.T1 = false;
                File file = wbVar.G1.O0;
                if (file != null) {
                    file.delete();
                    wbVar.G1.O0 = null;
                }
                wbVar.W(wbVar.G1, true);
                CharSequence[] charSequenceArr = {wbVar.Y0.getText()};
                if (MessagesController.getInstance(i18).storyEntitiesAllowed()) {
                    arrayList = MediaDataController.getInstance(i18).getEntities(charSequenceArr, true);
                } else {
                    arrayList = new ArrayList<>();
                }
                CharSequence[] charSequenceArr2 = {wbVar.G1.C0};
                if (MessagesController.getInstance(i18).storyEntitiesAllowed()) {
                    arrayList2 = MediaDataController.getInstance(i18).getEntities(charSequenceArr2, true);
                } else {
                    arrayList2 = new ArrayList<>();
                }
                a8 a8Var = wbVar.G1;
                if (TextUtils.equals(a8Var.C0, charSequenceArr[0]) && MediaDataController.entitiesEqual(arrayList, arrayList2)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                a8Var.f14924k = z10;
                wbVar.G1.C0 = new SpannableString(wbVar.Y0.getText());
                wbVar.z();
                wbVar.y();
                a8 a8Var2 = wbVar.G1;
                if (a8Var2 != null && a8Var2.K) {
                    i9 = 1;
                } else {
                    i9 = 0;
                }
                wbVar.K1 = i9;
                wbVar.G1 = (a8) wbVar.D1.get(i17);
                wbVar.O(0, 1);
                wbVar.N(0, 1);
                wbVar.Z0.f15689b.U2.N(false);
                wbVar.Y0.setText(wbVar.G1.C0);
                return;
            case 12:
                ((of.f0) obj).m(i17);
                return;
            case 13:
                ConnectionsManager.lambda$onUpdateConfig$21(i17, (TLRPC.TL_config) obj);
                return;
            case 14:
                MessagesController.getInstance(i17).loadFullChat(((TLRPC.Chat) obj).f22380id, 0, true);
                return;
            case 15:
                ((p4) ((org.telegram.ui.g) obj).f38388b).U(i17, true);
                return;
            case 16:
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) obj;
                int i19 = t1Var.f25547r7;
                if (i17 == i19) {
                    org.telegram.ui.Cells.e0 e0Var = (org.telegram.ui.Cells.e0) t1Var.f25451k7.get(i19);
                    if (e0Var != null) {
                        org.telegram.ui.Cells.z zVar = e0Var.f24265s;
                        if (zVar != null) {
                            zVar.setState(StateSet.NOTHING);
                        }
                        e0Var.b(false);
                        if (!t1Var.f25593u7.scheduled) {
                            if (e0Var.f24256j != null) {
                                t1Var.k();
                            } else if (e0Var.f24255i != null) {
                                t1Var.k();
                                org.telegram.ui.Cells.k1 k1Var = t1Var.Fc;
                                if (k1Var != null) {
                                    k1Var.y1(t1Var, e0Var.f24255i);
                                }
                            }
                        }
                    }
                    t1Var.f25547r7 = -1;
                    t1Var.a3();
                    return;
                }
                return;
            case 17:
                ((ae) obj).f36464f.c(i17);
                return;
            case 18:
                ((pi) obj).f41542a.j(this.f1720b, 0, true, 0, true, 0);
                return;
            case 19:
                qn qnVar = ((ni) obj).f40744g;
                if (qnVar.f42075sb == i17) {
                    qnVar.Ma();
                    return;
                }
                return;
            case 20:
                qn qnVar2 = ((oi) obj).f41170g;
                if (qnVar2.f42075sb == i17) {
                    qnVar2.Ma();
                    return;
                }
                return;
            case 21:
                qn qnVar3 = ((ni) obj).f40744g;
                if (qnVar3.f42075sb == i17) {
                    qnVar3.Ma();
                    return;
                }
                return;
            case 22:
                qn qnVar4 = ((oi) obj).f41170g;
                if (qnVar4.f42075sb == i17) {
                    qnVar4.Ma();
                    return;
                }
                return;
            case 23:
                qn qnVar5 = ((oi) obj).f41170g;
                if (qnVar5.f42075sb == i17) {
                    qnVar5.Ma();
                    return;
                }
                return;
            case 24:
                qn qnVar6 = ((im) obj).F0;
                qnVar6.f42103v0.h1(i17, qnVar6.f42094u4);
                return;
            case 25:
                i10 = ((org.telegram.ui.ActionBar.o2) ((cn) obj).f37236a).currentAccount;
                ConnectionsManager.getInstance(i10).cancelRequest(i17, true);
                return;
            case 26:
                NotificationCenter.getInstance(i17).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.s1((MessagesStorage.BooleanCallback) obj, 1), 250L);
                return;
            case 27:
                l80 l80Var2 = (l80) obj;
                ArrayList<TLRPC.PrivacyRule> privacyRules = ContactsController.getInstance(i17).getPrivacyRules(11);
                String string = LocaleController.getString(R.string.EditProfileBirthdayInfoContacts);
                if (privacyRules != null && !privacyRules.isEmpty()) {
                    int i20 = 0;
                    while (true) {
                        if (i20 < privacyRules.size()) {
                            if (privacyRules.get(i20) instanceof TLRPC.TL_privacyValueAllowContacts) {
                                string = LocaleController.getString(R.string.EditProfileBirthdayInfoContacts);
                            } else {
                                if ((privacyRules.get(i20) instanceof TLRPC.TL_privacyValueAllowAll) || (privacyRules.get(i20) instanceof TLRPC.TL_privacyValueDisallowAll)) {
                                    string = LocaleController.getString(R.string.EditProfileBirthdayInfo);
                                }
                                i20++;
                            }
                        }
                    }
                }
                l80Var2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new org.telegram.ui.Components.l1(privacyRules, 0)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
                return;
            case 28:
                ((h8) obj).b(i17);
                return;
            default:
                ad adVar = (ad) obj;
                x3 x3Var = adVar.Z0;
                if (adVar.X0 != i17) {
                    adVar.setTimer(i17);
                    Utilities.Callback callback2 = adVar.f26772n1;
                    if (callback2 != null) {
                        callback2.run(Integer.valueOf(i17));
                    }
                    float f10 = 1.0f;
                    if (i17 == 0) {
                        if (adVar.f26771m1) {
                            i13 = R.string.TimerPeriodVideoKeep;
                        } else {
                            i13 = R.string.TimerPeriodPhotoKeep;
                        }
                        charSequence = LocaleController.getString(i13);
                        x3Var.h = adVar.getMeasuredWidth();
                        x3Var.q(false);
                        x3Var.l(13.0f, 4.0f, 10.0f, 4.0f);
                        x3Var.f16341a0 = AndroidUtilities.dp(0);
                        x3Var.W = -AndroidUtilities.dp(1.0f);
                    } else if (i17 == Integer.MAX_VALUE) {
                        if (adVar.f26771m1) {
                            i11 = R.string.TimerPeriodVideoSetOnce;
                        } else {
                            i11 = R.string.TimerPeriodPhotoSetOnce;
                        }
                        charSequence = LocaleController.getString(i11);
                        x3Var.h = adVar.getMeasuredWidth();
                        x3Var.q(false);
                        x3Var.l(13.0f, 4.0f, 10.0f, 4.0f);
                        x3Var.f16341a0 = AndroidUtilities.dp(0);
                        x3Var.W = -AndroidUtilities.dp(1.0f);
                    } else if (i17 > 0) {
                        if (adVar.f26771m1) {
                            str = "TimerPeriodVideoSetSeconds";
                        } else {
                            str = "TimerPeriodPhotoSetSeconds";
                        }
                        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, i17, new Object[0]));
                        x3Var.q(true);
                        x3Var.h = x3.a(replaceTags, x3Var.getTextPaint());
                        x3Var.l(12.0f, 7.0f, 11.0f, 7.0f);
                        x3Var.f16341a0 = AndroidUtilities.dp(2);
                        x3Var.W = 0.0f;
                        charSequence = replaceTags;
                    } else {
                        return;
                    }
                    float dp = (-Math.min(AndroidUtilities.dp(34.0f), adVar.getEditTextHeight())) - AndroidUtilities.dp(14.0f);
                    if (adVar instanceof zr0) {
                        f10 = -1.0f;
                    }
                    x3Var.setTranslationY(dp * f10);
                    x3Var.t(charSequence);
                    if (i17 > 0) {
                        i12 = R.raw.fire_on;
                    } else {
                        i12 = R.raw.fire_off;
                    }
                    mi0 mi0Var = new mi0(i12, AndroidUtilities.dp(34.0f), j3.r0.l(i12, ""), AndroidUtilities.dp(34.0f));
                    mi0Var.start();
                    x3Var.k(mi0Var);
                    x3Var.v();
                    adVar.f26770k1 = false;
                    AndroidUtilities.cancelRunOnUIThread(adVar.l1);
                    adVar.invalidate();
                    return;
                }
                return;
        }
    }

    public c2(Object obj, int i9, int i10) {
        this.f1719a = i10;
        this.f1721c = obj;
        this.f1720b = i9;
    }
}
