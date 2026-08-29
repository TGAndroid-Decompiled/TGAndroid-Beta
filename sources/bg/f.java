package bg;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.StateSet;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import jh.s7;
import lh.s6;
import nh.gb;
import nh.o7;
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
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.y80;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.fn;
import org.telegram.ui.km;
import org.telegram.ui.q4;
import org.telegram.ui.qi;
import org.telegram.ui.ri;
import org.telegram.ui.si;
import org.telegram.ui.tn;
import org.telegram.ui.ws0;
import org.telegram.ui.yd;
public final class f implements Runnable {
    public final int f2190a;
    public final int f2191b;
    public final Object f2192c;

    public f(int i10, Object obj, int i11) {
        this.f2190a = i11;
        this.f2191b = i10;
        this.f2192c = obj;
    }

    @Override
    public final void run() {
        l3.e eVar;
        ArrayList<TLRPC.MessageEntity> arrayList;
        ArrayList<TLRPC.MessageEntity> arrayList2;
        boolean z10;
        int i10;
        int i11;
        int i12 = this.f2190a;
        int i13 = 2;
        boolean z11 = false;
        int i14 = 1;
        int i15 = this.f2191b;
        Object obj = this.f2192c;
        switch (i12) {
            case 0:
                k kVar = (k) obj;
                kVar.H = i15;
                kVar.G = true;
                try {
                    kVar.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                ValueAnimator valueAnimator = kVar.L;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimator2 = kVar.M;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                kVar.L = duration;
                duration.setInterpolator(jr.f29800f);
                kVar.L.addUpdateListener(new g(kVar, 5));
                kVar.L.addListener(new h(kVar, 2));
                kVar.L.start();
                return;
            case 1:
                ws0 ws0Var = (ws0) obj;
                ag.k2 k2Var = ws0Var.G1;
                ws0Var.s0(k2Var, null);
                ag.h1.e(i15).j(k2Var.f573c);
                return;
            case 2:
                u3 u3Var = (u3) obj;
                u3Var.getClass();
                NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.customStickerCreated, Boolean.FALSE);
                u3Var.h();
                return;
            case 3:
                y80 y80Var = ((eg.w1) obj).f6161e;
                try {
                    if (y80Var.getLayout().getLineForOffset(i15) == 0) {
                        y80Var.getEditableText().insert(i15, "\n");
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 4:
                j3.d dVar = ((j3.c) obj).f10398b;
                if (i15 != -3 && i15 != -2) {
                    if (i15 != -1) {
                        if (i15 != 1) {
                            com.google.android.recaptcha.internal.a.s(i15, "Unknown focus change type: ", "AudioFocusManager");
                            return;
                        }
                        dVar.c(1);
                        j3.h0 h0Var = dVar.f10408c;
                        if (h0Var != null) {
                            j3.k0 k0Var = h0Var.f10477a;
                            k0Var.n0(1, 1, k0Var.h());
                            return;
                        }
                        return;
                    }
                    j3.h0 h0Var2 = dVar.f10408c;
                    if (h0Var2 != null) {
                        j3.k0 k0Var2 = h0Var2.f10477a;
                        boolean h = k0Var2.h();
                        if (!h) {
                            i13 = 1;
                        }
                        k0Var2.n0(-1, i13, h);
                    }
                    dVar.a();
                    return;
                } else if (i15 != -2 && ((eVar = dVar.d) == null || eVar.f14077a != 1)) {
                    dVar.c(3);
                    return;
                } else {
                    j3.h0 h0Var3 = dVar.f10408c;
                    if (h0Var3 != null) {
                        j3.k0 k0Var3 = h0Var3.f10477a;
                        boolean h10 = k0Var3.h();
                        if (h10) {
                            i14 = 2;
                        }
                        k0Var3.n0(0, i14, h10);
                    }
                    dVar.c(2);
                    return;
                }
            case 5:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(i15).clientUserId);
                ((b5) obj).getLastFragment().presentFragment(new ProfileActivity(bundle, null));
                return;
            case 6:
                ye.d.s(((jh.q) obj).getParentActivity(), LocaleController.getString(i15));
                return;
            case 7:
                ConnectionsManager.getInstance(((s7) obj).f12787a).cancelRequest(i15, true);
                return;
            case 8:
                kg.f fVar = (kg.f) obj;
                if (fVar.f13708b) {
                    Utilities.Callback callback = fVar.d;
                    if (callback != null) {
                        if (i15 < 300) {
                            z11 = true;
                        }
                        callback.run(Boolean.valueOf(z11));
                        try {
                            fVar.f13707a.performHapticFeedback(3);
                        } catch (Exception unused2) {
                        }
                    }
                    fVar.f13709c = true;
                    int max = Math.max(50, i15 - 100);
                    AndroidUtilities.runOnUIThread(new f(fVar, max, 8), max);
                    return;
                }
                return;
            case 9:
                s6 s6Var = (s6) obj;
                ArrayList arrayList3 = s6Var.f16223g;
                s6Var.v(arrayList3);
                a4.v vVar = s6Var.J;
                Collections.sort(arrayList3, vVar);
                ArrayList arrayList4 = s6Var.h;
                s6Var.v(arrayList4);
                Collections.sort(arrayList4, vVar);
                NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                return;
            case 10:
                ((nh.o) obj).run(Integer.valueOf(i15));
                return;
            case 11:
                ((Utilities.Callback) obj).run(Integer.valueOf(i15));
                return;
            case 12:
                ((nh.k2) obj).p0(i15);
                return;
            case 13:
                MessagesController.getInstance(i15).putUsers((ArrayList) obj, true);
                return;
            case 14:
                gb gbVar = (gb) obj;
                int i16 = gbVar.f17743c;
                gbVar.m();
                gbVar.T1 = false;
                File file = gbVar.G1.O0;
                if (file != null) {
                    file.delete();
                    gbVar.G1.O0 = null;
                }
                gbVar.W(gbVar.G1, true);
                CharSequence[] charSequenceArr = {gbVar.Y0.getText()};
                if (MessagesController.getInstance(i16).storyEntitiesAllowed()) {
                    arrayList = MediaDataController.getInstance(i16).getEntities(charSequenceArr, true);
                } else {
                    arrayList = new ArrayList<>();
                }
                CharSequence[] charSequenceArr2 = {gbVar.G1.C0};
                if (MessagesController.getInstance(i16).storyEntitiesAllowed()) {
                    arrayList2 = MediaDataController.getInstance(i16).getEntities(charSequenceArr2, true);
                } else {
                    arrayList2 = new ArrayList<>();
                }
                o7 o7Var = gbVar.G1;
                if (TextUtils.equals(o7Var.C0, charSequenceArr[0]) && MediaDataController.entitiesEqual(arrayList, arrayList2)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                o7Var.f18277k = z10;
                gbVar.G1.C0 = new SpannableString(gbVar.Y0.getText());
                gbVar.z();
                gbVar.y();
                o7 o7Var2 = gbVar.G1;
                if (o7Var2 != null && o7Var2.K) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                gbVar.K1 = i10;
                gbVar.G1 = (o7) gbVar.D1.get(i15);
                gbVar.O(0, 1);
                gbVar.N(0, 1);
                gbVar.Z0.f17694b.U2.N(false);
                gbVar.Y0.setText(gbVar.G1.C0);
                return;
            case 15:
                ConnectionsManager.lambda$onUpdateConfig$21(i15, (TLRPC.TL_config) obj);
                return;
            case 16:
                MessagesController.getInstance(i15).loadFullChat(((TLRPC.Chat) obj).f22392id, 0, true);
                return;
            case 17:
                ((q4) ((org.telegram.ui.h) obj).f38706b).V(i15, true);
                return;
            case 18:
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) obj;
                int i17 = s1Var.f25512r7;
                if (i15 == i17) {
                    org.telegram.ui.Cells.e0 e0Var = (org.telegram.ui.Cells.e0) s1Var.f25416k7.get(i17);
                    if (e0Var != null) {
                        org.telegram.ui.Cells.z zVar = e0Var.f24264s;
                        if (zVar != null) {
                            zVar.setState(StateSet.NOTHING);
                        }
                        e0Var.b(false);
                        if (!s1Var.f25556u7.scheduled) {
                            if (e0Var.f24255j != null) {
                                s1Var.k();
                            } else if (e0Var.f24254i != null) {
                                s1Var.k();
                                org.telegram.ui.Cells.j1 j1Var = s1Var.Fc;
                                if (j1Var != null) {
                                    j1Var.I1(s1Var, e0Var.f24254i);
                                }
                            }
                        }
                    }
                    s1Var.f25512r7 = -1;
                    s1Var.a3();
                    return;
                }
                return;
            case 19:
                ((yd) obj).f44844f.c(i15);
                return;
            case 20:
                ((si) obj).f42400a.j(this.f2191b, 0, true, 0, true, 0);
                return;
            case 21:
                tn tnVar = ((qi) obj).f41736g;
                if (tnVar.f42971sb == i15) {
                    tnVar.Ma();
                    return;
                }
                return;
            case 22:
                tn tnVar2 = ((ri) obj).f42119g;
                if (tnVar2.f42971sb == i15) {
                    tnVar2.Ma();
                    return;
                }
                return;
            case 23:
                tn tnVar3 = ((qi) obj).f41736g;
                if (tnVar3.f42971sb == i15) {
                    tnVar3.Ma();
                    return;
                }
                return;
            case 24:
                tn tnVar4 = ((ri) obj).f42119g;
                if (tnVar4.f42971sb == i15) {
                    tnVar4.Ma();
                    return;
                }
                return;
            case 25:
                tn tnVar5 = ((ri) obj).f42119g;
                if (tnVar5.f42971sb == i15) {
                    tnVar5.Ma();
                    return;
                }
                return;
            case 26:
                tn tnVar6 = ((km) obj).F0;
                tnVar6.f42999v0.h1(i15, tnVar6.f42990u4);
                return;
            case 27:
                i11 = ((org.telegram.ui.ActionBar.o2) ((fn) obj).f38212a).currentAccount;
                ConnectionsManager.getInstance(i11).cancelRequest(i15, true);
                return;
            case 28:
                NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.w1((MessagesStorage.BooleanCallback) obj, 1), 250L);
                return;
            default:
                y80 y80Var2 = (y80) obj;
                ArrayList<TLRPC.PrivacyRule> privacyRules = ContactsController.getInstance(i15).getPrivacyRules(11);
                String string = LocaleController.getString(R.string.EditProfileBirthdayInfoContacts);
                if (privacyRules != null && !privacyRules.isEmpty()) {
                    int i18 = 0;
                    while (true) {
                        if (i18 < privacyRules.size()) {
                            if (privacyRules.get(i18) instanceof TLRPC.TL_privacyValueAllowContacts) {
                                string = LocaleController.getString(R.string.EditProfileBirthdayInfoContacts);
                            } else {
                                if ((privacyRules.get(i18) instanceof TLRPC.TL_privacyValueAllowAll) || (privacyRules.get(i18) instanceof TLRPC.TL_privacyValueDisallowAll)) {
                                    string = LocaleController.getString(R.string.EditProfileBirthdayInfo);
                                }
                                i18++;
                            }
                        }
                    }
                }
                y80Var2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new org.telegram.ui.Components.o1(privacyRules, 0)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
                return;
        }
    }

    public f(Object obj, int i10, int i11) {
        this.f2190a = i11;
        this.f2192c = obj;
        this.f2191b = i10;
    }
}
