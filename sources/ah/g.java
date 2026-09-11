package ah;

import android.content.DialogInterface;
import android.os.Looper;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.StateSet;
import bi.l7;
import bi.u8;
import di.b7;
import di.o8;
import di.pc;
import di.t2;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import ji.n3;
import ji.s3;
import ji.v3;
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
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.u1;
import org.telegram.ui.aj;
import org.telegram.ui.bj;
import org.telegram.ui.co;
import org.telegram.ui.fe;
import org.telegram.ui.on;
import org.telegram.ui.q4;
import org.telegram.ui.um;
import org.telegram.ui.zi;
public final class g implements Runnable {
    public final int f532a;
    public final int f533b;
    public final Object f534c;

    public g(int i10, Object obj, int i11) {
        this.f532a = i11;
        this.f533b = i10;
        this.f534c = obj;
    }

    @Override
    public final void run() {
        boolean z10;
        ArrayList<TLRPC.MessageEntity> arrayList;
        ArrayList<TLRPC.MessageEntity> arrayList2;
        boolean z11;
        int i10;
        int i11;
        int i12 = this.f532a;
        boolean z12 = false;
        final int i13 = this.f533b;
        Object obj = this.f534c;
        switch (i12) {
            case 0:
                i iVar = (i) obj;
                if (iVar.f584b) {
                    Utilities.Callback callback = iVar.d;
                    if (callback != null) {
                        if (i13 < 300) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        callback.run(Boolean.valueOf(z10));
                        try {
                            iVar.f583a.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    iVar.f585c = true;
                    int max = Math.max(50, i13 - 100);
                    AndroidUtilities.runOnUIThread(new g(iVar, max, 0), max);
                    return;
                }
                return;
            case 1:
                u8 u8Var = (u8) obj;
                ArrayList arrayList3 = u8Var.f3810g;
                u8Var.v(arrayList3);
                l7 l7Var = u8Var.J;
                Collections.sort(arrayList3, l7Var);
                ArrayList arrayList4 = u8Var.h;
                u8Var.v(arrayList4);
                Collections.sort(arrayList4, l7Var);
                NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                return;
            case 2:
                ((c2.b) obj).f4142b.onAudioFocusChange(i13);
                return;
            case 3:
                ((di.o) obj).run(Integer.valueOf(i13));
                return;
            case 4:
                ((Utilities.Callback) obj).run(Integer.valueOf(i13));
                return;
            case 5:
                ((t2) obj).p0(i13);
                return;
            case 6:
                MessagesController.getInstance(i13).putUsers((ArrayList) obj, true);
                return;
            case 7:
                pc pcVar = (pc) obj;
                int i14 = pcVar.f7848c;
                pcVar.m();
                pcVar.X1 = false;
                File file = pcVar.K1.O0;
                if (file != null) {
                    file.delete();
                    pcVar.K1.O0 = null;
                }
                pcVar.W(pcVar.K1, true);
                CharSequence[] charSequenceArr = {pcVar.f7850c1.getText()};
                if (MessagesController.getInstance(i14).storyEntitiesAllowed()) {
                    arrayList = MediaDataController.getInstance(i14).getEntities(charSequenceArr, true);
                } else {
                    arrayList = new ArrayList<>();
                }
                CharSequence[] charSequenceArr2 = {pcVar.K1.C0};
                if (MessagesController.getInstance(i14).storyEntitiesAllowed()) {
                    arrayList2 = MediaDataController.getInstance(i14).getEntities(charSequenceArr2, true);
                } else {
                    arrayList2 = new ArrayList<>();
                }
                o8 o8Var = pcVar.K1;
                if (TextUtils.equals(o8Var.C0, charSequenceArr[0]) && MediaDataController.entitiesEqual(arrayList, arrayList2)) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                o8Var.f7763k = z11;
                pcVar.K1.C0 = new SpannableString(pcVar.f7850c1.getText());
                pcVar.z();
                pcVar.y();
                o8 o8Var2 = pcVar.K1;
                if (o8Var2 != null && o8Var2.K) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                pcVar.O1 = i10;
                pcVar.K1 = (o8) pcVar.H1.get(i13);
                pcVar.O(0, 1);
                pcVar.N(0, 1);
                pcVar.f7853d1.f8234b.Y2.N(false);
                pcVar.f7850c1.setText(pcVar.K1.C0);
                return;
            case 8:
                ((hg.i0) obj).m(i13);
                return;
            case 9:
                try {
                    SQLiteDatabase database = ((MessagesStorage) obj).getDatabase();
                    database.executeFast("DELETE FROM business_replies WHERE topic_id = " + i13).stepThis().dispose();
                    database.executeFast("DELETE FROM quick_replies_messages WHERE topic_id = " + i13).stepThis().dispose();
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 10:
                ih.h hVar = (ih.h) obj;
                hVar.getClass();
                try {
                    hVar.f12340a.scrollBy(0, i13);
                    return;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    return;
                }
            case 11:
                ji.d0 d0Var = (ji.d0) obj;
                ji.g0 g0Var = d0Var.f13855f;
                if (d0Var.f13853c && g0Var.E != null && g0Var.f13749a != null) {
                    d0Var.d = true;
                    d0Var.f13851a.setPressed(false);
                    try {
                        d0Var.performHapticFeedback(0);
                    } catch (Exception unused2) {
                    }
                    ji.e0 e0Var = g0Var.E;
                    ji.a aVar = g0Var.f13749a;
                    v3 v3Var = ((n3) e0Var).f14078a;
                    v3Var.n3(false);
                    v3Var.f14249h3.b(new s3(v3Var, aVar, i13), d0Var);
                    return;
                }
                return;
            case 12:
                String str = e2.d0.f8737a;
                e2.c cVar = ((i2.c0) ((k2.j) ((n4.y) obj).f16497c)).f11471a.E;
                i2.w wVar = new i2.w(i13, 2);
                cVar.getClass();
                if (Looper.myLooper() == ((e2.z) cVar.f8733c).f8798a.getLooper()) {
                    z12 = true;
                }
                e2.d.g(z12);
                cVar.f8731a++;
                cVar.i(new b7(17, cVar, wVar));
                Integer num = (Integer) cVar.f8734e;
                cVar.n(Integer.valueOf(i13));
                return;
            case 13:
                b2[] b2VarArr = (b2[]) obj;
                b2 b2Var = b2VarArr[0];
                if (b2Var != null) {
                    try {
                        b2Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                            @Override
                            public final void onCancel(DialogInterface dialogInterface) {
                                ConnectionsManager.getInstance(UserConfig.selectedAccount).cancelRequest(i13, true);
                            }
                        });
                        b2VarArr[0].show();
                    } catch (Exception unused3) {
                        return;
                    }
                }
                return;
            case 14:
                ((oh.a) obj).v0(i13, 0, null);
                return;
            case 15:
                ConnectionsManager.lambda$onUpdateConfig$21(i13, (TLRPC.TL_config) obj);
                return;
            case 16:
                MessagesController.getInstance(i13).loadFullChat(((TLRPC.Chat) obj).f19869id, 0, true);
                return;
            case 17:
                ((q4) ((org.telegram.ui.g) obj).f36515b).V(i13, true);
                return;
            case 18:
                t1 t1Var = (t1) obj;
                int i15 = t1Var.f23161v7;
                if (i13 == i15) {
                    org.telegram.ui.Cells.e0 e0Var2 = (org.telegram.ui.Cells.e0) t1Var.f23058o7.get(i15);
                    if (e0Var2 != null) {
                        org.telegram.ui.Cells.z zVar = e0Var2.f21827s;
                        if (zVar != null) {
                            zVar.setState(StateSet.NOTHING);
                        }
                        e0Var2.b(false);
                        if (!t1Var.f23205y7.scheduled) {
                            if (e0Var2.f21818j != null) {
                                t1Var.k();
                            } else if (e0Var2.f21817i != null) {
                                t1Var.k();
                                org.telegram.ui.Cells.k1 k1Var = t1Var.Jc;
                                if (k1Var != null) {
                                    k1Var.A1(t1Var, e0Var2.f21817i);
                                }
                            }
                        }
                    }
                    t1Var.f23161v7 = -1;
                    t1Var.a3();
                    return;
                }
                return;
            case 19:
                ((fe) obj).f36383f.c(i13);
                return;
            case 20:
                ((bj) obj).f34822a.F(this.f533b, 0, 0, 0, true, true);
                return;
            case 21:
                co coVar = ((zi) obj).f43445g;
                if (coVar.f35471wb == i13) {
                    coVar.Ma();
                    return;
                }
                return;
            case 22:
                co coVar2 = ((aj) obj).f34461g;
                if (coVar2.f35471wb == i13) {
                    coVar2.Ma();
                    return;
                }
                return;
            case 23:
                co coVar3 = ((zi) obj).f43445g;
                if (coVar3.f35471wb == i13) {
                    coVar3.Ma();
                    return;
                }
                return;
            case 24:
                co coVar4 = ((aj) obj).f34461g;
                if (coVar4.f35471wb == i13) {
                    coVar4.Ma();
                    return;
                }
                return;
            case 25:
                co coVar5 = ((aj) obj).f34461g;
                if (coVar5.f35471wb == i13) {
                    coVar5.Ma();
                    return;
                }
                return;
            case 26:
                co coVar6 = ((um) obj).J0;
                coVar6.f35498z0.h1(i13, coVar6.f35489y4);
                return;
            case 27:
                i11 = ((n2) ((on) obj).f39283a).currentAccount;
                ConnectionsManager.getInstance(i11).cancelRequest(i13, true);
                return;
            case 28:
                NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                AndroidUtilities.runOnUIThread(new u1((MessagesStorage.BooleanCallback) obj, 1), 250L);
                return;
            default:
                d90 d90Var = (d90) obj;
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
                d90Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new org.telegram.ui.Components.n1(privacyRules, 0)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
                return;
        }
    }

    public g(Object obj, int i10, int i11) {
        this.f532a = i11;
        this.f534c = obj;
        this.f533b = i10;
    }
}
