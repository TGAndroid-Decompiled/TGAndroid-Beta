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
import org.telegram.ui.Components.c90;
import org.telegram.ui.aj;
import org.telegram.ui.bj;
import org.telegram.ui.bo;
import org.telegram.ui.cj;
import org.telegram.ui.ge;
import org.telegram.ui.nn;
import org.telegram.ui.tm;
public final class n8 implements Runnable {
    public final int f1301a;
    public final int f1302b;
    public final Object f1303c;

    public n8(int i10, Object obj, int i11) {
        this.f1301a = i11;
        this.f1302b = i10;
        this.f1303c = obj;
    }

    @Override
    public final void run() {
        ArrayList<TLRPC.MessageEntity> arrayList;
        ArrayList<TLRPC.MessageEntity> arrayList2;
        boolean z10;
        int i10;
        int i11;
        int i12 = this.f1301a;
        boolean z11 = false;
        final int i13 = this.f1302b;
        Object obj = this.f1303c;
        switch (i12) {
            case 0:
                l9 l9Var = (l9) obj;
                ArrayList arrayList3 = l9Var.f1197g;
                l9Var.v(arrayList3);
                c8 c8Var = l9Var.J;
                Collections.sort(arrayList3, c8Var);
                ArrayList arrayList4 = l9Var.h;
                l9Var.v(arrayList4);
                Collections.sort(arrayList4, c8Var);
                NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                return;
            case 1:
                ((c2.b) obj).f3660b.onAudioFocusChange(i13);
                return;
            case 2:
                ((ci.o) obj).run(Integer.valueOf(i13));
                return;
            case 3:
                ((Utilities.Callback) obj).run(Integer.valueOf(i13));
                return;
            case 4:
                ((ci.t2) obj).p0(i13);
                return;
            case 5:
                MessagesController.getInstance(i13).putUsers((ArrayList) obj, true);
                return;
            case 6:
                ci.oc ocVar = (ci.oc) obj;
                int i14 = ocVar.f5211c;
                ocVar.m();
                ocVar.X1 = false;
                File file = ocVar.K1.O0;
                if (file != null) {
                    file.delete();
                    ocVar.K1.O0 = null;
                }
                ocVar.W(ocVar.K1, true);
                CharSequence[] charSequenceArr = {ocVar.f5213c1.getText()};
                if (MessagesController.getInstance(i14).storyEntitiesAllowed()) {
                    arrayList = MediaDataController.getInstance(i14).getEntities(charSequenceArr, true);
                } else {
                    arrayList = new ArrayList<>();
                }
                CharSequence[] charSequenceArr2 = {ocVar.K1.C0};
                if (MessagesController.getInstance(i14).storyEntitiesAllowed()) {
                    arrayList2 = MediaDataController.getInstance(i14).getEntities(charSequenceArr2, true);
                } else {
                    arrayList2 = new ArrayList<>();
                }
                ci.o8 o8Var = ocVar.K1;
                if (TextUtils.equals(o8Var.C0, charSequenceArr[0]) && MediaDataController.entitiesEqual(arrayList, arrayList2)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                o8Var.f5164k = z10;
                ocVar.K1.C0 = new SpannableString(ocVar.f5213c1.getText());
                ocVar.z();
                ocVar.y();
                ci.o8 o8Var2 = ocVar.K1;
                if (o8Var2 != null && o8Var2.K) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                ocVar.O1 = i10;
                ocVar.K1 = (ci.o8) ocVar.H1.get(i13);
                ocVar.O(0, 1);
                ocVar.N(0, 1);
                ocVar.f5216d1.f5611b.Y2.N(false);
                ocVar.f5213c1.setText(ocVar.K1.C0);
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
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 9:
                hh.h hVar = (hh.h) obj;
                hVar.getClass();
                try {
                    hVar.f10534a.scrollBy(0, i13);
                    return;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    return;
                }
            case 10:
                ii.e0 e0Var = (ii.e0) obj;
                ii.h0 h0Var = e0Var.f11352f;
                if (e0Var.f11351c && h0Var.E != null && h0Var.f11220a != null) {
                    e0Var.d = true;
                    e0Var.f11349a.setPressed(false);
                    try {
                        e0Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    ii.f0 f0Var = h0Var.E;
                    ii.a aVar = h0Var.f11220a;
                    ii.w3 w3Var = ((ii.o3) f0Var).f11535a;
                    w3Var.p3(false);
                    w3Var.f11714h3.H(new ii.t3(w3Var, aVar, i13), e0Var);
                    return;
                }
                return;
            case 11:
                String str = e2.d0.f7888a;
                e2.c cVar = ((i2.b0) ((k2.j) ((n4.y) obj).f15005c)).f10624a.E;
                i2.v vVar = new i2.v(i13, 2);
                cVar.getClass();
                if (Looper.myLooper() == ((e2.z) cVar.f7885c).f7943a.getLooper()) {
                    z11 = true;
                }
                e2.d.g(z11);
                cVar.f7883a++;
                cVar.i(new ci.b9(11, cVar, vVar));
                Integer num = (Integer) cVar.e;
                cVar.n(Integer.valueOf(i13));
                return;
            case 12:
                org.telegram.ui.ActionBar.c2[] c2VarArr = (org.telegram.ui.ActionBar.c2[]) obj;
                org.telegram.ui.ActionBar.c2 c2Var = c2VarArr[0];
                if (c2Var != null) {
                    try {
                        c2Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                            @Override
                            public final void onCancel(DialogInterface dialogInterface) {
                                ConnectionsManager.getInstance(UserConfig.selectedAccount).cancelRequest(i13, true);
                            }
                        });
                        c2VarArr[0].show();
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
                MessagesController.getInstance(i13).loadFullChat(((TLRPC.Chat) obj).f18121id, 0, true);
                return;
            case 16:
                ((org.telegram.ui.p4) ((org.telegram.ui.g) obj).f33810b).V(i13, true);
                return;
            case 17:
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) obj;
                int i15 = t1Var.f21289v7;
                if (i13 == i15) {
                    org.telegram.ui.Cells.e0 e0Var2 = (org.telegram.ui.Cells.e0) t1Var.f21186o7.get(i15);
                    if (e0Var2 != null) {
                        org.telegram.ui.Cells.z zVar = e0Var2.f20010s;
                        if (zVar != null) {
                            zVar.setState(StateSet.NOTHING);
                        }
                        e0Var2.b(false);
                        if (!t1Var.f21333y7.scheduled) {
                            if (e0Var2.f20001j != null) {
                                t1Var.k();
                            } else if (e0Var2.f20000i != null) {
                                t1Var.k();
                                org.telegram.ui.Cells.k1 k1Var = t1Var.Jc;
                                if (k1Var != null) {
                                    k1Var.H1(t1Var, e0Var2.f20000i);
                                }
                            }
                        }
                    }
                    t1Var.f21289v7 = -1;
                    t1Var.a3();
                    return;
                }
                return;
            case 18:
                ((ge) obj).f33961f.c(i13);
                return;
            case 19:
                ((cj) obj).f32823a.F(this.f1302b, 0, 0, 0, true, true);
                return;
            case 20:
                bo boVar = ((aj) obj).f31910g;
                if (boVar.f32490vb == i13) {
                    boVar.Ma();
                    return;
                }
                return;
            case 21:
                bo boVar2 = ((bj) obj).f32194g;
                if (boVar2.f32490vb == i13) {
                    boVar2.Ma();
                    return;
                }
                return;
            case 22:
                bo boVar3 = ((aj) obj).f31910g;
                if (boVar3.f32490vb == i13) {
                    boVar3.Ma();
                    return;
                }
                return;
            case 23:
                bo boVar4 = ((bj) obj).f32194g;
                if (boVar4.f32490vb == i13) {
                    boVar4.Ma();
                    return;
                }
                return;
            case 24:
                bo boVar5 = ((bj) obj).f32194g;
                if (boVar5.f32490vb == i13) {
                    boVar5.Ma();
                    return;
                }
                return;
            case 25:
                bo boVar6 = ((tm) obj).J0;
                boVar6.f32531z0.h1(i13, boVar6.f32522y4);
                return;
            case 26:
                i11 = ((org.telegram.ui.ActionBar.o2) ((nn) obj).f36139a).currentAccount;
                ConnectionsManager.getInstance(i11).cancelRequest(i13, true);
                return;
            case 27:
                NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.t1((MessagesStorage.BooleanCallback) obj, 1), 250L);
                return;
            case 28:
                c90 c90Var = (c90) obj;
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
                c90Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new org.telegram.ui.Components.m1(privacyRules, 0)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
                return;
            default:
                ((org.telegram.ui.Components.m8) obj).b(i13);
                return;
        }
    }

    public n8(Object obj, int i10, int i11) {
        this.f1301a = i11;
        this.f1303c = obj;
        this.f1302b = i10;
    }
}
