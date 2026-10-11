package ai;

import android.content.DialogInterface;
import android.os.Looper;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.StateSet;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.SQLite.SQLiteDatabase;
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
import org.telegram.ui.Components.fa0;
import org.telegram.ui.aj;
import org.telegram.ui.ee;
import org.telegram.ui.ij;
import org.telegram.ui.ln;
import org.telegram.ui.sm;
import org.telegram.ui.zi;
import org.telegram.ui.zn;
public final class p8 implements Runnable {
    public final int f1576a;
    public final int f1577b;
    public final Object f1578c;

    public p8(int i10, Object obj, int i11) {
        this.f1576a = i11;
        this.f1577b = i10;
        this.f1578c = obj;
    }

    @Override
    public final void run() {
        ArrayList<TLRPC.MessageEntity> arrayList;
        ArrayList<TLRPC.MessageEntity> arrayList2;
        boolean z10;
        int i10;
        int i11;
        int i12 = this.f1576a;
        boolean z11 = false;
        final int i13 = this.f1577b;
        Object obj = this.f1578c;
        switch (i12) {
            case 0:
                m9 m9Var = (m9) obj;
                ArrayList arrayList3 = m9Var.f1411g;
                m9Var.v(arrayList3);
                f8 f8Var = m9Var.J;
                Collections.sort(arrayList3, f8Var);
                ArrayList arrayList4 = m9Var.h;
                m9Var.v(arrayList4);
                Collections.sort(arrayList4, f8Var);
                NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                return;
            case 1:
                ((c2.b) obj).f3997b.onAudioFocusChange(i13);
                return;
            case 2:
                ((ci.o) obj).run(Integer.valueOf(i13));
                return;
            case 3:
                ((Utilities.Callback) obj).run(Integer.valueOf(i13));
                return;
            case 4:
                ((ci.r2) obj).q0(i13);
                return;
            case 5:
                MessagesController.getInstance(i13).putUsers((ArrayList) obj, true);
                return;
            case 6:
                ci.lc lcVar = (ci.lc) obj;
                int i14 = lcVar.f5464c;
                lcVar.l();
                lcVar.X1 = false;
                File file = lcVar.K1.O0;
                if (file != null) {
                    file.delete();
                    lcVar.K1.O0 = null;
                }
                lcVar.V(lcVar.K1, true);
                CharSequence[] charSequenceArr = {lcVar.f5466c1.getText()};
                if (MessagesController.getInstance(i14).storyEntitiesAllowed()) {
                    arrayList = MediaDataController.getInstance(i14).getEntities(charSequenceArr, true);
                } else {
                    arrayList = new ArrayList<>();
                }
                CharSequence[] charSequenceArr2 = {lcVar.K1.C0};
                if (MessagesController.getInstance(i14).storyEntitiesAllowed()) {
                    arrayList2 = MediaDataController.getInstance(i14).getEntities(charSequenceArr2, true);
                } else {
                    arrayList2 = new ArrayList<>();
                }
                ci.l8 l8Var = lcVar.K1;
                if (TextUtils.equals(l8Var.C0, charSequenceArr[0]) && MediaDataController.entitiesEqual(arrayList, arrayList2)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                l8Var.f5416k = z10;
                lcVar.K1.C0 = new SpannableString(lcVar.f5466c1.getText());
                lcVar.y();
                lcVar.x();
                ci.l8 l8Var2 = lcVar.K1;
                if (l8Var2 != null && l8Var2.K) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                lcVar.O1 = i10;
                lcVar.K1 = (ci.l8) lcVar.H1.get(i13);
                lcVar.N(0, 1);
                lcVar.M(0, 1);
                lcVar.f5469d1.f5941b.W2.N(false);
                lcVar.f5466c1.setText(lcVar.K1.C0);
                return;
            case 7:
                ((gg.h0) obj).m(i13);
                return;
            case 8:
                try {
                    SQLiteDatabase database = ((MessagesStorage) obj).getDatabase();
                    database.executeFast("DELETE FROM business_replies WHERE topic_id = " + i13).stepThis().dispose();
                    database.executeFast("DELETE FROM quick_replies_messages WHERE topic_id = " + i13).stepThis().dispose();
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 9:
                hh.g gVar = (hh.g) obj;
                gVar.getClass();
                try {
                    gVar.f11510a.scrollBy(0, i13);
                    return;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    return;
                }
            case 10:
                ii.e0 e0Var = (ii.e0) obj;
                ii.h0 h0Var = e0Var.f12355f;
                if (e0Var.f12353c && h0Var.E != null && h0Var.f12250a != null) {
                    e0Var.d = true;
                    e0Var.f12351a.setPressed(false);
                    try {
                        e0Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    ii.f0 f0Var = h0Var.E;
                    ii.a aVar = h0Var.f12250a;
                    ii.x3 x3Var = ((ii.p3) f0Var).f12623a;
                    x3Var.p3(false);
                    x3Var.f12808f3.N(new ii.u3(x3Var, aVar, i13), e0Var);
                    return;
                }
                return;
            case 11:
                String str = e2.d0.f8531a;
                e2.c cVar = ((i2.c0) ((k2.j) ((n4.x) obj).f16659c)).f11619a.E;
                i2.w wVar = new i2.w(i13, 2);
                cVar.getClass();
                if (Looper.myLooper() == ((e2.z) cVar.f8527c).f8592a.getLooper()) {
                    z11 = true;
                }
                e2.d.g(z11);
                cVar.f8525a++;
                cVar.i(new ci.y8(11, cVar, wVar));
                Integer num = (Integer) cVar.f8528e;
                cVar.n(Integer.valueOf(i13));
                return;
            case 12:
                ((nh.a) obj).v0(i13, 0, null);
                return;
            case 13:
                org.telegram.ui.ActionBar.a2[] a2VarArr = (org.telegram.ui.ActionBar.a2[]) obj;
                org.telegram.ui.ActionBar.a2 a2Var = a2VarArr[0];
                if (a2Var != null) {
                    try {
                        a2Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                            @Override
                            public final void onCancel(DialogInterface dialogInterface) {
                                ConnectionsManager.getInstance(UserConfig.selectedAccount).cancelRequest(i13, true);
                            }
                        });
                        a2VarArr[0].show();
                    } catch (Exception unused2) {
                        return;
                    }
                }
                return;
            case 14:
                ConnectionsManager.lambda$onUpdateConfig$21(i13, (TLRPC.TL_config) obj);
                return;
            case 15:
                MessagesController.getInstance(i13).loadFullChat(((TLRPC.Chat) obj).f20032id, 0, true);
                return;
            case 16:
                ((org.telegram.ui.o4) ((org.telegram.ui.g) obj).f37816b).V(i13, true);
                return;
            case 17:
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) obj;
                int i15 = u1Var.f23405v7;
                if (i13 == i15) {
                    org.telegram.ui.Cells.e0 e0Var2 = (org.telegram.ui.Cells.e0) u1Var.f23304o7.get(i15);
                    if (e0Var2 != null) {
                        org.telegram.ui.Cells.z zVar = e0Var2.f22006s;
                        if (zVar != null) {
                            zVar.setState(StateSet.NOTHING);
                        }
                        e0Var2.b(false);
                        if (!u1Var.f23450y7.scheduled) {
                            if (e0Var2.f21997j != null) {
                                u1Var.k();
                            } else if (e0Var2.f21996i != null) {
                                u1Var.k();
                                org.telegram.ui.Cells.l1 l1Var = u1Var.Jc;
                                if (l1Var != null) {
                                    l1Var.N1(u1Var, e0Var2.f21996i);
                                }
                            }
                        }
                    }
                    u1Var.f23405v7 = -1;
                    u1Var.a3();
                    return;
                }
                return;
            case 18:
                ((ee) obj).f37277f.c(i13);
                return;
            case 19:
                zn znVar = ((zi) obj).f44675g;
                if (znVar.f44986wb == i13) {
                    znVar.Qa();
                    return;
                }
                return;
            case 20:
                zn znVar2 = ((aj) obj).f36102g;
                if (znVar2.f44986wb == i13) {
                    znVar2.Qa();
                    return;
                }
                return;
            case 21:
                ((ij) obj).f38697a.F(this.f1577b, 0, 0, 0, true, true);
                return;
            case 22:
                zn znVar3 = ((zi) obj).f44675g;
                if (znVar3.f44986wb == i13) {
                    znVar3.Qa();
                    return;
                }
                return;
            case 23:
                zn znVar4 = ((aj) obj).f36102g;
                if (znVar4.f44986wb == i13) {
                    znVar4.Qa();
                    return;
                }
                return;
            case 24:
                zn znVar5 = ((aj) obj).f36102g;
                if (znVar5.f44986wb == i13) {
                    znVar5.Qa();
                    return;
                }
                return;
            case 25:
                zn znVar6 = ((sm) obj).J0;
                znVar6.f45013z0.h1(i13, znVar6.f45005y4);
                return;
            case 26:
                i11 = ((org.telegram.ui.ActionBar.m2) ((ln) obj).f39701a).currentAccount;
                ConnectionsManager.getInstance(i11).cancelRequest(i13, true);
                return;
            case 27:
                NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.u1((MessagesStorage.BooleanCallback) obj, 1), 250L);
                return;
            case 28:
                fa0 fa0Var = (fa0) obj;
                ArrayList<TLRPC.PrivacyRule> privacyRules = ContactsController.getInstance(i13).getPrivacyRules(11);
                String string = LocaleController.getString(R.string.EditProfileBirthdayInfoContacts);
                if (privacyRules != null && !privacyRules.isEmpty()) {
                    int i16 = 0;
                    while (true) {
                        if (i16 < privacyRules.size()) {
                            if (privacyRules.get(i16) instanceof TLRPC.TL_privacyValueAllowContacts) {
                                string = LocaleController.getString(R.string.EditProfileBirthdayInfoContacts);
                            } else {
                                if ((privacyRules.get(i16) instanceof TLRPC.TL_privacyValueAllowAll) || (privacyRules.get(i16) instanceof TLRPC.TL_privacyValueDisallowAll)) {
                                    string = LocaleController.getString(R.string.EditProfileBirthdayInfo);
                                }
                                i16++;
                            }
                        }
                    }
                }
                fa0Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new org.telegram.ui.Components.n1(privacyRules, 0)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
                return;
            default:
                ((org.telegram.ui.Components.q8) obj).b(i13);
                return;
        }
    }

    public p8(Object obj, int i10, int i11) {
        this.f1576a = i11;
        this.f1578c = obj;
        this.f1577b = i10;
    }
}
