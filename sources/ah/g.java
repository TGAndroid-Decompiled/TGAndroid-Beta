package ah;

import android.os.Looper;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.StateSet;
import bi.q7;
import bi.x8;
import di.k8;
import di.kc;
import di.r2;
import di.x6;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import ji.p3;
import ji.u3;
import ji.x3;
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
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.n1;
import org.telegram.ui.dj;
import org.telegram.ui.ej;
import org.telegram.ui.fo;
import org.telegram.ui.le;
import org.telegram.ui.mj;
import org.telegram.ui.qn;
import org.telegram.ui.u4;
import org.telegram.ui.xm;
import v7.u6;
public final class g implements Runnable {
    public final int f731a;
    public final int f732b;
    public final Object f733c;

    public g(int i10, Object obj, int i11) {
        this.f731a = i11;
        this.f732b = i10;
        this.f733c = obj;
    }

    @Override
    public final void run() {
        boolean z10;
        ArrayList<TLRPC.MessageEntity> arrayList;
        ArrayList<TLRPC.MessageEntity> arrayList2;
        boolean z11;
        int i10;
        int i11;
        int i12 = this.f731a;
        boolean z12 = false;
        int i13 = this.f732b;
        Object obj = this.f733c;
        switch (i12) {
            case 0:
                i iVar = (i) obj;
                if (iVar.f772b) {
                    Utilities.Callback callback = iVar.d;
                    if (callback != null) {
                        if (i13 < 300) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        callback.run(Boolean.valueOf(z10));
                        try {
                            iVar.f771a.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    iVar.f773c = true;
                    int max = Math.max(50, i13 - 100);
                    AndroidUtilities.runOnUIThread(new g(iVar, max, 0), max);
                    return;
                }
                return;
            case 1:
                x8 x8Var = (x8) obj;
                ArrayList arrayList3 = x8Var.f3966g;
                x8Var.v(arrayList3);
                q7 q7Var = x8Var.J;
                Collections.sort(arrayList3, q7Var);
                ArrayList arrayList4 = x8Var.h;
                x8Var.v(arrayList4);
                Collections.sort(arrayList4, q7Var);
                NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                return;
            case 2:
                ((c2.g) obj).f4133b.onAudioFocusChange(i13);
                return;
            case 3:
                ((di.o) obj).run(Integer.valueOf(i13));
                return;
            case 4:
                ((Utilities.Callback) obj).run(Integer.valueOf(i13));
                return;
            case 5:
                ((r2) obj).q0(i13);
                return;
            case 6:
                MessagesController.getInstance(i13).putUsers((ArrayList) obj, true);
                return;
            case 7:
                kc kcVar = (kc) obj;
                int i14 = kcVar.f7241c;
                kcVar.l();
                kcVar.X1 = false;
                File file = kcVar.K1.O0;
                if (file != null) {
                    file.delete();
                    kcVar.K1.O0 = null;
                }
                kcVar.V(kcVar.K1, true);
                CharSequence[] charSequenceArr = {kcVar.f7243c1.getText()};
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
                k8 k8Var = kcVar.K1;
                if (TextUtils.equals(k8Var.C0, charSequenceArr[0]) && MediaDataController.entitiesEqual(arrayList, arrayList2)) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                k8Var.f7194k = z11;
                kcVar.K1.C0 = new SpannableString(kcVar.f7243c1.getText());
                kcVar.y();
                kcVar.x();
                k8 k8Var2 = kcVar.K1;
                if (k8Var2 != null && k8Var2.K) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                kcVar.O1 = i10;
                kcVar.K1 = (k8) kcVar.H1.get(i13);
                kcVar.N(0, 1);
                kcVar.M(0, 1);
                kcVar.f7246d1.f7753b.W2.N(false);
                kcVar.f7243c1.setText(kcVar.K1.C0);
                return;
            case 8:
                ((hg.h0) obj).m(i13);
                return;
            case 9:
                j2.f fVar = ((i2.r0) obj).M;
                j2.a l4 = fVar.l();
                fVar.q(l4, 1034, new j2.c(l4, i13, 10, (char) 0));
                return;
            case 10:
                try {
                    SQLiteDatabase database = ((MessagesStorage) obj).getDatabase();
                    database.executeFast("DELETE FROM business_replies WHERE topic_id = " + i13).stepThis().dispose();
                    database.executeFast("DELETE FROM quick_replies_messages WHERE topic_id = " + i13).stepThis().dispose();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 11:
                ih.g gVar = (ih.g) obj;
                gVar.getClass();
                try {
                    gVar.f11748a.scrollBy(0, i13);
                    return;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    return;
                }
            case 12:
                ji.d0 d0Var = (ji.d0) obj;
                ji.g0 g0Var = d0Var.f13194f;
                if (d0Var.f13193c && g0Var.E != null && g0Var.f13119a != null) {
                    d0Var.d = true;
                    d0Var.f13191a.setPressed(false);
                    try {
                        d0Var.performHapticFeedback(0);
                    } catch (Exception unused2) {
                    }
                    ji.e0 e0Var = g0Var.E;
                    ji.a aVar = g0Var.f13119a;
                    x3 x3Var = ((p3) e0Var).f13464a;
                    x3Var.p3(false);
                    x3Var.f13627f3.h(new u3(x3Var, aVar, i13), d0Var);
                    return;
                }
                return;
            case 13:
                String str = e2.m0.f8372a;
                e2.c cVar = ((i2.b0) ((k2.u) ((qf.b) obj).f43356c)).f10925a.C;
                i2.v vVar = new i2.v(i13, 2);
                cVar.getClass();
                if (Looper.myLooper() == ((e2.i0) cVar.f8324c).f8357a.getLooper()) {
                    z12 = true;
                }
                u6.p(z12);
                cVar.f8322a++;
                cVar.i(new x6(19, cVar, vVar));
                Integer num = (Integer) cVar.e;
                cVar.n(Integer.valueOf(i13));
                return;
            case 14:
                ((oh.a) obj).v0(i13, 0, null);
                return;
            case 15:
                ConnectionsManager.lambda$onUpdateConfig$21(i13, (TLRPC.TL_config) obj);
                return;
            case 16:
                MessagesController.getInstance(i13).loadFullChat(((TLRPC.Chat) obj).f19216id, 0, true);
                return;
            case 17:
                ((u4) ((org.telegram.ui.g) obj).f36263b).V(i13, true);
                return;
            case 18:
                u1 u1Var = (u1) obj;
                int i15 = u1Var.f22442v7;
                if (i13 == i15) {
                    org.telegram.ui.Cells.f0 f0Var = (org.telegram.ui.Cells.f0) u1Var.f22343o7.get(i15);
                    if (f0Var != null) {
                        org.telegram.ui.Cells.z zVar = f0Var.f21144s;
                        if (zVar != null) {
                            zVar.setState(StateSet.NOTHING);
                        }
                        f0Var.b(false);
                        if (!u1Var.f22488y7.scheduled) {
                            if (f0Var.f21135j != null) {
                                u1Var.k();
                            } else if (f0Var.f21134i != null) {
                                u1Var.k();
                                org.telegram.ui.Cells.l1 l1Var = u1Var.Jc;
                                if (l1Var != null) {
                                    l1Var.A1(u1Var, f0Var.f21134i);
                                }
                            }
                        }
                    }
                    u1Var.f22442v7 = -1;
                    u1Var.a3();
                    return;
                }
                return;
            case 19:
                ((le) obj).f37929f.c(i13);
                return;
            case 20:
                fo foVar = ((dj) obj).f35272g;
                if (foVar.f36157wb == i13) {
                    foVar.Qa();
                    return;
                }
                return;
            case 21:
                fo foVar2 = ((ej) obj).f35619g;
                if (foVar2.f36157wb == i13) {
                    foVar2.Qa();
                    return;
                }
                return;
            case 22:
                ((mj) obj).f38277a.j(this.f732b, 0, true, 0, true, 0);
                return;
            case 23:
                fo foVar3 = ((dj) obj).f35272g;
                if (foVar3.f36157wb == i13) {
                    foVar3.Qa();
                    return;
                }
                return;
            case 24:
                fo foVar4 = ((ej) obj).f35619g;
                if (foVar4.f36157wb == i13) {
                    foVar4.Qa();
                    return;
                }
                return;
            case 25:
                fo foVar5 = ((ej) obj).f35619g;
                if (foVar5.f36157wb == i13) {
                    foVar5.Qa();
                    return;
                }
                return;
            case 26:
                fo foVar6 = ((xm) obj).J0;
                foVar6.f36185z0.h1(i13, foVar6.f36177y4);
                return;
            case 27:
                i11 = ((m2) ((qn) obj).f39497a).currentAccount;
                ConnectionsManager.getInstance(i11).cancelRequest(i13, true);
                return;
            case 28:
                NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.u1((MessagesStorage.BooleanCallback) obj, 1), 250L);
                return;
            default:
                da0 da0Var = (da0) obj;
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
                da0Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new n1(privacyRules, 0)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
                return;
        }
    }

    public g(Object obj, int i10, int i11) {
        this.f731a = i11;
        this.f733c = obj;
        this.f732b = i10;
    }
}
