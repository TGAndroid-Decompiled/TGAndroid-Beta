package cg;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.StateSet;
import hh.u7;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import jh.s6;
import lh.sb;
import lh.w3;
import lh.z7;
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
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ag;
import org.telegram.ui.Components.g8;
import org.telegram.ui.Components.oi0;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.qf;
import org.telegram.ui.Components.xc;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ae;
import org.telegram.ui.as0;
import org.telegram.ui.dn;
import org.telegram.ui.jm;
import org.telegram.ui.pi;
import org.telegram.ui.q4;
import org.telegram.ui.qi;
import org.telegram.ui.ri;
import org.telegram.ui.rn;

public final class w1 implements Runnable {

    public final int f2846a;

    public final int f2847b;

    public final Object f2848c;

    public w1(int i10, Object obj, int i11) {
        this.f2846a = i11;
        this.f2847b = i10;
        this.f2848c = obj;
    }

    @Override
    public final void run() {
        j3.e eVar;
        CharSequence string;
        int i10 = this.f2846a;
        int i11 = 1;
        Object[] objArr = 0;
        int i12 = this.f2847b;
        Object obj = this.f2848c;
        switch (i10) {
            case 0:
                p80 p80Var = ((y1) obj).f2867e;
                try {
                    if (p80Var.getLayout().getLineForOffset(i12) == 0) {
                        p80Var.getEditableText().insert(i12, "\n");
                    }
                } catch (Exception e9) {
                    FileLog.e(e9);
                    return;
                }
                break;
            case 1:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(i12).clientUserId);
                ((b5) obj).getLastFragment().presentFragment(new ProfileActivity(bundle, null));
                break;
            case 2:
                h3.d dVar = ((h3.c) obj).f7794b;
                if (i12 == -3 || i12 == -2) {
                    if (i12 == -2 || ((eVar = dVar.d) != null && eVar.f12321a == 1)) {
                        h3.h0 h0Var = dVar.f7800c;
                        if (h0Var != null) {
                            h3.k0 k0Var = h0Var.f7870a;
                            boolean zH = k0Var.h();
                            k0Var.n0(0, zH ? 2 : 1, zH);
                        }
                        dVar.c(2);
                    } else {
                        dVar.c(3);
                    }
                } else if (i12 == -1) {
                    h3.h0 h0Var2 = dVar.f7800c;
                    if (h0Var2 != null) {
                        h3.k0 k0Var2 = h0Var2.f7870a;
                        boolean zH2 = k0Var2.h();
                        k0Var2.n0(-1, zH2 ? 2 : 1, zH2);
                    }
                    dVar.a();
                } else if (i12 != 1) {
                    com.google.android.recaptcha.internal.a.s(i12, "Unknown focus change type: ", "AudioFocusManager");
                } else {
                    dVar.c(1);
                    h3.h0 h0Var3 = dVar.f7800c;
                    if (h0Var3 != null) {
                        h3.k0 k0Var3 = h0Var3.f7870a;
                        k0Var3.n0(1, 1, k0Var3.h());
                    }
                }
                break;
            case 3:
                we.e.s(((hh.r) obj).getParentActivity(), LocaleController.getString(i12));
                break;
            case 4:
                ConnectionsManager.getInstance(((u7) obj).f10151a).cancelRequest(i12, true);
                break;
            case 5:
                ig.f fVar = (ig.f) obj;
                if (fVar.f11295b) {
                    Utilities.Callback callback = fVar.d;
                    if (callback != null) {
                        callback.run(Boolean.valueOf(i12 < 300));
                        try {
                            fVar.f11294a.performHapticFeedback(3);
                            break;
                        } catch (Exception unused) {
                        }
                    }
                    fVar.f11296c = true;
                    int iMax = Math.max(50, i12 - 100);
                    AndroidUtilities.runOnUIThread(new w1(fVar, iMax, 5), iMax);
                    break;
                }
                break;
            case 6:
                s6 s6Var = (s6) obj;
                ArrayList arrayList = s6Var.f13960g;
                s6Var.v(arrayList);
                ag.h hVar = s6Var.J;
                Collections.sort(arrayList, hVar);
                ArrayList arrayList2 = s6Var.h;
                s6Var.v(arrayList2);
                Collections.sort(arrayList2, hVar);
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                break;
            case 7:
                ((lh.o) obj).run(Integer.valueOf(i12));
                break;
            case 8:
                ((Utilities.Callback) obj).run(Integer.valueOf(i12));
                break;
            case 9:
                ((lh.l2) obj).p0(i12);
                break;
            case 10:
                MessagesController.getInstance(i12).putUsers((ArrayList) obj, true);
                break;
            case 11:
                sb sbVar = (sb) obj;
                int i13 = sbVar.f16749c;
                sbVar.m();
                sbVar.T1 = false;
                File file = sbVar.G1.O0;
                if (file != null) {
                    file.delete();
                    sbVar.G1.O0 = null;
                }
                sbVar.W(sbVar.G1, true);
                CharSequence[] charSequenceArr = {sbVar.Y0.getText()};
                ArrayList<TLRPC.MessageEntity> entities = MessagesController.getInstance(i13).storyEntitiesAllowed() ? MediaDataController.getInstance(i13).getEntities(charSequenceArr, true) : new ArrayList<>();
                ArrayList<TLRPC.MessageEntity> entities2 = MessagesController.getInstance(i13).storyEntitiesAllowed() ? MediaDataController.getInstance(i13).getEntities(new CharSequence[]{sbVar.G1.C0}, true) : new ArrayList<>();
                z7 z7Var = sbVar.G1;
                z7Var.f17216k = (TextUtils.equals(z7Var.C0, charSequenceArr[0]) && MediaDataController.entitiesEqual(entities, entities2)) ? false : true;
                sbVar.G1.C0 = new SpannableString(sbVar.Y0.getText());
                sbVar.z();
                sbVar.y();
                z7 z7Var2 = sbVar.G1;
                sbVar.K1 = (z7Var2 == null || !z7Var2.K) ? 0 : 1;
                sbVar.G1 = (z7) sbVar.D1.get(i12);
                sbVar.O(0, 1);
                sbVar.N(0, 1);
                sbVar.Z0.f16228b.U2.N(false);
                sbVar.Y0.setText(sbVar.G1.C0);
                break;
            case 12:
                ConnectionsManager.lambda$onUpdateConfig$21(i12, (TLRPC.TL_config) obj);
                break;
            case 13:
                MessagesController.getInstance(i12).loadFullChat(((TLRPC.Chat) obj).f22380id, 0, true);
                break;
            case 14:
                ((q4) ((org.telegram.ui.g) obj).f38248b).V(i12, true);
                break;
            case 15:
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) obj;
                int i14 = s1Var.f25500r7;
                if (i12 == i14) {
                    org.telegram.ui.Cells.e0 e0Var = (org.telegram.ui.Cells.e0) s1Var.f25405k7.get(i14);
                    if (e0Var != null) {
                        org.telegram.ui.Cells.z zVar = e0Var.f24247s;
                        if (zVar != null) {
                            zVar.setState(StateSet.NOTHING);
                        }
                        e0Var.b(false);
                        if (!s1Var.f25546u7.scheduled) {
                            if (e0Var.f24238j != null) {
                                s1Var.k();
                            } else if (e0Var.f24237i != null) {
                                s1Var.k();
                                org.telegram.ui.Cells.j1 j1Var = s1Var.Fc;
                                if (j1Var != null) {
                                    j1Var.y1(s1Var, e0Var.f24237i);
                                }
                            }
                        }
                    }
                    s1Var.f25500r7 = -1;
                    s1Var.Z2();
                }
                break;
            case 16:
                ((ae) obj).f36520f.c(i12);
                break;
            case 17:
                ((ri) obj).f41942a.j(this.f2847b, 0, true, 0, true, 0);
                break;
            case 18:
                rn rnVar = ((pi) obj).f41368g;
                if (rnVar.f42211sb == i12) {
                    rnVar.Ma();
                }
                break;
            case 19:
                rn rnVar2 = ((qi) obj).f41677g;
                if (rnVar2.f42211sb == i12) {
                    rnVar2.Ma();
                }
                break;
            case 20:
                rn rnVar3 = ((pi) obj).f41368g;
                if (rnVar3.f42211sb == i12) {
                    rnVar3.Ma();
                }
                break;
            case 21:
                rn rnVar4 = ((qi) obj).f41677g;
                if (rnVar4.f42211sb == i12) {
                    rnVar4.Ma();
                }
                break;
            case 22:
                rn rnVar5 = ((qi) obj).f41677g;
                if (rnVar5.f42211sb == i12) {
                    rnVar5.Ma();
                }
                break;
            case 23:
                rn rnVar6 = ((jm) obj).F0;
                rnVar6.f42239v0.h1(i12, rnVar6.f42230u4);
                break;
            case 24:
                ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) ((dn) obj).f37446a).currentAccount).cancelRequest(i12, true);
                break;
            case 25:
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.s1((MessagesStorage.BooleanCallback) obj, i11), 250L);
                break;
            case 26:
                p80 p80Var2 = (p80) obj;
                ArrayList<TLRPC.PrivacyRule> privacyRules = ContactsController.getInstance(i12).getPrivacyRules(11);
                String string2 = LocaleController.getString(R.string.EditProfileBirthdayInfoContacts);
                if (privacyRules != null && !privacyRules.isEmpty()) {
                    for (int i15 = 0; i15 < privacyRules.size(); i15++) {
                        if (privacyRules.get(i15) instanceof TLRPC.TL_privacyValueAllowContacts) {
                            string2 = LocaleController.getString(R.string.EditProfileBirthdayInfoContacts);
                        } else {
                            if ((privacyRules.get(i15) instanceof TLRPC.TL_privacyValueAllowAll) || (privacyRules.get(i15) instanceof TLRPC.TL_privacyValueDisallowAll)) {
                                string2 = LocaleController.getString(R.string.EditProfileBirthdayInfo);
                            }
                        }
                    }
                }
                p80Var2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string2, new org.telegram.ui.Components.l1(privacyRules, objArr == true ? 1 : 0)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
                break;
            case 27:
                ((g8) obj).b(i12);
                break;
            case 28:
                xc xcVar = (xc) obj;
                w3 w3Var = xcVar.Z0;
                if (xcVar.X0 != i12) {
                    xcVar.setTimer(i12);
                    Utilities.Callback callback2 = xcVar.f34598n1;
                    if (callback2 != null) {
                        callback2.run(Integer.valueOf(i12));
                    }
                    if (i12 == 0) {
                        string = LocaleController.getString(xcVar.f34597m1 ? R.string.TimerPeriodVideoKeep : R.string.TimerPeriodPhotoKeep);
                        w3Var.h = xcVar.getMeasuredWidth();
                        w3Var.q(false);
                        w3Var.l(13.0f, 4.0f, 10.0f, 4.0f);
                        w3Var.f16973a0 = AndroidUtilities.dp(0);
                        w3Var.W = -AndroidUtilities.dp(1.0f);
                    } else if (i12 == Integer.MAX_VALUE) {
                        string = LocaleController.getString(xcVar.f34597m1 ? R.string.TimerPeriodVideoSetOnce : R.string.TimerPeriodPhotoSetOnce);
                        w3Var.h = xcVar.getMeasuredWidth();
                        w3Var.q(false);
                        w3Var.l(13.0f, 4.0f, 10.0f, 4.0f);
                        w3Var.f16973a0 = AndroidUtilities.dp(0);
                        w3Var.W = -AndroidUtilities.dp(1.0f);
                    } else if (i12 > 0) {
                        SpannableStringBuilder spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString(xcVar.f34597m1 ? "TimerPeriodVideoSetSeconds" : "TimerPeriodPhotoSetSeconds", i12, new Object[0]));
                        w3Var.q(true);
                        w3Var.h = w3.a(spannableStringBuilderReplaceTags, w3Var.getTextPaint());
                        w3Var.l(12.0f, 7.0f, 11.0f, 7.0f);
                        w3Var.f16973a0 = AndroidUtilities.dp(2);
                        w3Var.W = 0.0f;
                        string = spannableStringBuilderReplaceTags;
                    }
                    w3Var.setTranslationY(((-Math.min(AndroidUtilities.dp(34.0f), xcVar.getEditTextHeight())) - AndroidUtilities.dp(14.0f)) * (xcVar instanceof as0 ? -1.0f : 1.0f));
                    w3Var.t(string);
                    int i16 = i12 > 0 ? R.raw.fire_on : R.raw.fire_off;
                    oi0 oi0Var = new oi0(i16, AndroidUtilities.dp(34.0f), i0.a.k(i16, ""), AndroidUtilities.dp(34.0f));
                    oi0Var.start();
                    w3Var.k(oi0Var);
                    w3Var.v();
                    xcVar.f34596k1 = false;
                    AndroidUtilities.cancelRunOnUIThread(xcVar.l1);
                    xcVar.invalidate();
                    break;
                }
                break;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                if (i12 == 0) {
                    chatActivityEnterView.f26190v2 = 0;
                }
                chatActivityEnterView.R0 = null;
                qf qfVar = chatActivityEnterView.Q0;
                if (qfVar != null) {
                    if (chatActivityEnterView.Y4 == null) {
                        qfVar.setTranslationY(0.0f);
                    }
                    chatActivityEnterView.Q0.setVisibility(8);
                    chatActivityEnterView.f26123i1.removeView(chatActivityEnterView.Q0);
                    if (chatActivityEnterView.B3) {
                        chatActivityEnterView.B3 = false;
                        chatActivityEnterView.Q0 = null;
                    }
                }
                ag agVar = chatActivityEnterView.U2;
                if (agVar != null) {
                    agVar.n(0.0f);
                }
                chatActivityEnterView.requestLayout();
                break;
        }
    }

    public w1(Object obj, int i10, int i11) {
        this.f2846a = i11;
        this.f2848c = obj;
        this.f2847b = i10;
    }
}
