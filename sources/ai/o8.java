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
import org.telegram.ui.Components.q90;
import org.telegram.ui.he;
import org.telegram.ui.ie;
import org.telegram.ui.kn;
import org.telegram.ui.qm;
import org.telegram.ui.xi;
import org.telegram.ui.yi;
import org.telegram.ui.yn;
import org.telegram.ui.zi;
public final class o8 implements Runnable {
    public final int f1465a;
    public final int f1466b;
    public final Object f1467c;

    public o8(int i10, Object obj, int i11) {
        this.f1465a = i11;
        this.f1466b = i10;
        this.f1467c = obj;
    }

    @Override
    public final void run() {
        ArrayList<TLRPC.MessageEntity> arrayList;
        ArrayList<TLRPC.MessageEntity> arrayList2;
        boolean z10;
        int i10;
        int i11;
        int i12 = this.f1465a;
        boolean z11 = false;
        final int i13 = this.f1466b;
        Object obj = this.f1467c;
        switch (i12) {
            case 0:
                l9 l9Var = (l9) obj;
                ArrayList arrayList3 = l9Var.f1295g;
                l9Var.v(arrayList3);
                e8 e8Var = l9Var.J;
                Collections.sort(arrayList3, e8Var);
                ArrayList arrayList4 = l9Var.h;
                l9Var.v(arrayList4);
                Collections.sort(arrayList4, e8Var);
                NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                return;
            case 1:
                ((c2.b) obj).f3947b.onAudioFocusChange(i13);
                return;
            case 2:
                ((ci.o) obj).run(Integer.valueOf(i13));
                return;
            case 3:
                ((Utilities.Callback) obj).run(Integer.valueOf(i13));
                return;
            case 4:
                ((ci.s2) obj).p0(i13);
                return;
            case 5:
                MessagesController.getInstance(i13).putUsers((ArrayList) obj, true);
                return;
            case 6:
                ci.kc kcVar = (ci.kc) obj;
                int i14 = kcVar.f5380c;
                kcVar.m();
                kcVar.X1 = false;
                File file = kcVar.K1.O0;
                if (file != null) {
                    file.delete();
                    kcVar.K1.O0 = null;
                }
                kcVar.W(kcVar.K1, true);
                CharSequence[] charSequenceArr = {kcVar.f5382c1.getText()};
                if (MessagesController.getInstance(i14).storyEntitiesAllowed()) {
                    arrayList = MediaDataController.getInstance(i14).getEntities(charSequenceArr, true);
                } else {
                    arrayList = new ArrayList<>();
                }
                CharSequence[] charSequenceArr2 = {kcVar.K1.C0};
                if (MessagesController.getInstance(i14).storyEntitiesAllowed()) {
                    arrayList2 = MediaDataController.getInstance(i14).getEntities(charSequenceArr2, true);
                } else {
                    arrayList2 = new ArrayList<>();
                }
                ci.k8 k8Var = kcVar.K1;
                if (TextUtils.equals(k8Var.C0, charSequenceArr[0]) && MediaDataController.entitiesEqual(arrayList, arrayList2)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                k8Var.f5332k = z10;
                kcVar.K1.C0 = new SpannableString(kcVar.f5382c1.getText());
                kcVar.z();
                kcVar.y();
                ci.k8 k8Var2 = kcVar.K1;
                if (k8Var2 != null && k8Var2.K) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                kcVar.O1 = i10;
                kcVar.K1 = (ci.k8) kcVar.H1.get(i13);
                kcVar.O(0, 1);
                kcVar.N(0, 1);
                kcVar.f5385d1.f5963b.f25245f3.N(false);
                kcVar.f5382c1.setText(kcVar.K1.C0);
                return;
            case 7:
                ((gg.i0) obj).m(i13);
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
                hh.h hVar = (hh.h) obj;
                hVar.getClass();
                try {
                    hVar.f11462a.scrollBy(0, i13);
                    return;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    return;
                }
            case 10:
                ii.e0 e0Var = (ii.e0) obj;
                ii.h0 h0Var = e0Var.f12310f;
                if (e0Var.f12308c && h0Var.E != null && h0Var.f12203a != null) {
                    e0Var.d = true;
                    e0Var.f12306a.setPressed(false);
                    try {
                        e0Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    ii.f0 f0Var = h0Var.E;
                    ii.a aVar = h0Var.f12203a;
                    ii.x3 x3Var = ((ii.p3) f0Var).f12576a;
                    x3Var.q3(false);
                    x3Var.f12769o3.o0(new ii.u3(x3Var, aVar, i13), e0Var);
                    return;
                }
                return;
            case 11:
                String str = e2.d0.f8537a;
                e2.c cVar = ((i2.c0) ((k2.k) ((n4.y) obj).f16641c)).f11569a.E;
                i2.w wVar = new i2.w(i13, 2);
                cVar.getClass();
                if (Looper.myLooper() == ((e2.z) cVar.f8533c).f8598a.getLooper()) {
                    z11 = true;
                }
                e2.d.g(z11);
                cVar.f8531a++;
                cVar.i(new ci.x8(11, cVar, wVar));
                Integer num = (Integer) cVar.f8534e;
                cVar.n(Integer.valueOf(i13));
                return;
            case 12:
                org.telegram.ui.ActionBar.b2[] b2VarArr = (org.telegram.ui.ActionBar.b2[]) obj;
                org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
                if (b2Var != null) {
                    try {
                        b2Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                            @Override
                            public final void onCancel(DialogInterface dialogInterface) {
                                ConnectionsManager.getInstance(UserConfig.selectedAccount).cancelRequest(i13, true);
                            }
                        });
                        b2VarArr[0].show();
                    } catch (Exception unused2) {
                        return;
                    }
                }
                return;
            case 13:
                ((nh.a) obj).w0(i13, 0, null);
                return;
            case 14:
                ConnectionsManager.lambda$onUpdateConfig$21(i13, (TLRPC.TL_config) obj);
                return;
            case 15:
                MessagesController.getInstance(i13).loadFullChat(((TLRPC.Chat) obj).f20038id, 0, true);
                return;
            case 16:
                ((org.telegram.ui.q4) ((org.telegram.ui.g) obj).f36451b).T(i13, true);
                return;
            case 17:
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) obj;
                int i15 = u1Var.f23426v7;
                if (i13 == i15) {
                    org.telegram.ui.Cells.e0 e0Var2 = (org.telegram.ui.Cells.e0) u1Var.f23323o7.get(i15);
                    if (e0Var2 != null) {
                        org.telegram.ui.Cells.z zVar = e0Var2.f22008s;
                        if (zVar != null) {
                            zVar.setState(StateSet.NOTHING);
                        }
                        e0Var2.b(false);
                        if (!u1Var.f23470y7.scheduled) {
                            if (e0Var2.f21999j != null) {
                                u1Var.k();
                            } else if (e0Var2.f21998i != null) {
                                u1Var.k();
                                org.telegram.ui.Cells.l1 l1Var = u1Var.Jc;
                                if (l1Var != null) {
                                    l1Var.H1(u1Var, e0Var2.f21998i);
                                }
                            }
                        }
                    }
                    u1Var.f23426v7 = -1;
                    u1Var.a3();
                    return;
                }
                return;
            case 18:
                ie ieVar = ((he) obj).f37052f;
                ieVar.getClass();
                ieVar.c(i13);
                return;
            case 19:
                ((zi) obj).f43791a.D(this.f1466b, 0, 0, 0, true, true);
                return;
            case 20:
                yn ynVar = ((xi) obj).f42894g;
                if (ynVar.f43511tb == i13) {
                    ynVar.La();
                    return;
                }
                return;
            case 21:
                yn ynVar2 = ((yi) obj).f43231g;
                if (ynVar2.f43511tb == i13) {
                    ynVar2.La();
                    return;
                }
                return;
            case 22:
                yn ynVar3 = ((xi) obj).f42894g;
                if (ynVar3.f43511tb == i13) {
                    ynVar3.La();
                    return;
                }
                return;
            case 23:
                yn ynVar4 = ((yi) obj).f43231g;
                if (ynVar4.f43511tb == i13) {
                    ynVar4.La();
                    return;
                }
                return;
            case 24:
                yn ynVar5 = ((yi) obj).f43231g;
                if (ynVar5.f43511tb == i13) {
                    ynVar5.La();
                    return;
                }
                return;
            case 25:
                yn ynVar6 = ((qm) obj).M0;
                ynVar6.f43552x0.h1(i13, ynVar6.f43543w4);
                return;
            case 26:
                i11 = ((org.telegram.ui.ActionBar.n2) ((kn) obj).f38003a).currentAccount;
                ConnectionsManager.getInstance(i11).cancelRequest(i13, true);
                return;
            case 27:
                NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.t1((MessagesStorage.BooleanCallback) obj, 1), 250L);
                return;
            case 28:
                q90 q90Var = (q90) obj;
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
                q90Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new org.telegram.ui.Components.m1(privacyRules, 0)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
                return;
            default:
                ((org.telegram.ui.Components.o8) obj).b(i13);
                return;
        }
    }

    public o8(Object obj, int i10, int i11) {
        this.f1465a = i11;
        this.f1467c = obj;
        this.f1466b = i10;
    }
}
