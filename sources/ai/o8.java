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
import org.telegram.ui.Components.o90;
import org.telegram.ui.ee;
import org.telegram.ui.in;
import org.telegram.ui.pm;
import org.telegram.ui.wi;
import org.telegram.ui.wn;
import org.telegram.ui.xi;
import org.telegram.ui.yi;
public final class o8 implements Runnable {
    public final int f1354a;
    public final int f1355b;
    public final Object f1356c;

    public o8(int i10, Object obj, int i11) {
        this.f1354a = i11;
        this.f1355b = i10;
        this.f1356c = obj;
    }

    @Override
    public final void run() {
        ArrayList<TLRPC.MessageEntity> arrayList;
        ArrayList<TLRPC.MessageEntity> arrayList2;
        boolean z10;
        int i10;
        int i11;
        int i12 = this.f1354a;
        boolean z11 = false;
        final int i13 = this.f1355b;
        Object obj = this.f1356c;
        switch (i12) {
            case 0:
                l9 l9Var = (l9) obj;
                ArrayList arrayList3 = l9Var.f1196g;
                l9Var.v(arrayList3);
                e8 e8Var = l9Var.J;
                Collections.sort(arrayList3, e8Var);
                ArrayList arrayList4 = l9Var.h;
                l9Var.v(arrayList4);
                Collections.sort(arrayList4, e8Var);
                NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                return;
            case 1:
                ((c2.b) obj).f3652b.onAudioFocusChange(i13);
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
                ci.lc lcVar = (ci.lc) obj;
                int i14 = lcVar.f5033c;
                lcVar.m();
                lcVar.X1 = false;
                File file = lcVar.K1.O0;
                if (file != null) {
                    file.delete();
                    lcVar.K1.O0 = null;
                }
                lcVar.W(lcVar.K1, true);
                CharSequence[] charSequenceArr = {lcVar.f5035c1.getText()};
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
                l8Var.f4986k = z10;
                lcVar.K1.C0 = new SpannableString(lcVar.f5035c1.getText());
                lcVar.z();
                lcVar.y();
                ci.l8 l8Var2 = lcVar.K1;
                if (l8Var2 != null && l8Var2.K) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                lcVar.O1 = i10;
                lcVar.K1 = (ci.l8) lcVar.H1.get(i13);
                lcVar.O(0, 1);
                lcVar.N(0, 1);
                lcVar.f5038d1.f5535b.Y2.N(false);
                lcVar.f5035c1.setText(lcVar.K1.C0);
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
                    hVar.f10517a.scrollBy(0, i13);
                    return;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    return;
                }
            case 10:
                ii.e0 e0Var = (ii.e0) obj;
                ii.h0 h0Var = e0Var.f11305f;
                if (e0Var.f11304c && h0Var.E != null && h0Var.f11207a != null) {
                    e0Var.d = true;
                    e0Var.f11302a.setPressed(false);
                    try {
                        e0Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    ii.f0 f0Var = h0Var.E;
                    ii.a aVar = h0Var.f11207a;
                    ii.x3 x3Var = ((ii.p3) f0Var).f11548a;
                    x3Var.o3(false);
                    x3Var.f11728h3.J(new ii.u3(x3Var, aVar, i13), e0Var);
                    return;
                }
                return;
            case 11:
                String str = e2.d0.f7870a;
                e2.c cVar = ((i2.c0) ((k2.j) ((n4.y) obj).f15223c)).f10616a.E;
                i2.w wVar = new i2.w(i13, 2);
                cVar.getClass();
                if (Looper.myLooper() == ((e2.z) cVar.f7867c).f7925a.getLooper()) {
                    z11 = true;
                }
                e2.d.g(z11);
                cVar.f7865a++;
                cVar.i(new ci.y8(11, cVar, wVar));
                Integer num = (Integer) cVar.e;
                cVar.n(Integer.valueOf(i13));
                return;
            case 12:
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
            case 13:
                ((nh.a) obj).v0(i13, 0, null);
                return;
            case 14:
                ConnectionsManager.lambda$onUpdateConfig$21(i13, (TLRPC.TL_config) obj);
                return;
            case 15:
                MessagesController.getInstance(i13).loadFullChat(((TLRPC.Chat) obj).f18335id, 0, true);
                return;
            case 16:
                ((org.telegram.ui.p4) ((org.telegram.ui.g) obj).f33785b).V(i13, true);
                return;
            case 17:
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) obj;
                int i15 = u1Var.f21563v7;
                if (i13 == i15) {
                    org.telegram.ui.Cells.e0 e0Var2 = (org.telegram.ui.Cells.e0) u1Var.f21460o7.get(i15);
                    if (e0Var2 != null) {
                        org.telegram.ui.Cells.z zVar = e0Var2.f20217s;
                        if (zVar != null) {
                            zVar.setState(StateSet.NOTHING);
                        }
                        e0Var2.b(false);
                        if (!u1Var.f21607y7.scheduled) {
                            if (e0Var2.f20208j != null) {
                                u1Var.k();
                            } else if (e0Var2.f20207i != null) {
                                u1Var.k();
                                org.telegram.ui.Cells.l1 l1Var = u1Var.Jc;
                                if (l1Var != null) {
                                    l1Var.H1(u1Var, e0Var2.f20207i);
                                }
                            }
                        }
                    }
                    u1Var.f21563v7 = -1;
                    u1Var.a3();
                    return;
                }
                return;
            case 18:
                ((ee) obj).f33382f.c(i13);
                return;
            case 19:
                ((yi) obj).f40162a.F(this.f1355b, 0, 0, 0, true, true);
                return;
            case 20:
                wn wnVar = ((wi) obj).f39371g;
                if (wnVar.f39678vb == i13) {
                    wnVar.Ma();
                    return;
                }
                return;
            case 21:
                wn wnVar2 = ((xi) obj).f39931g;
                if (wnVar2.f39678vb == i13) {
                    wnVar2.Ma();
                    return;
                }
                return;
            case 22:
                wn wnVar3 = ((wi) obj).f39371g;
                if (wnVar3.f39678vb == i13) {
                    wnVar3.Ma();
                    return;
                }
                return;
            case 23:
                wn wnVar4 = ((xi) obj).f39931g;
                if (wnVar4.f39678vb == i13) {
                    wnVar4.Ma();
                    return;
                }
                return;
            case 24:
                wn wnVar5 = ((xi) obj).f39931g;
                if (wnVar5.f39678vb == i13) {
                    wnVar5.Ma();
                    return;
                }
                return;
            case 25:
                wn wnVar6 = ((pm) obj).J0;
                wnVar6.f39719z0.h1(i13, wnVar6.f39710y4);
                return;
            case 26:
                i11 = ((org.telegram.ui.ActionBar.m2) ((in) obj).f34556a).currentAccount;
                ConnectionsManager.getInstance(i11).cancelRequest(i13, true);
                return;
            case 27:
                NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.t1((MessagesStorage.BooleanCallback) obj, 1), 250L);
                return;
            case 28:
                o90 o90Var = (o90) obj;
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
                o90Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new org.telegram.ui.Components.m1(privacyRules, 0)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
                return;
            default:
                ((org.telegram.ui.Components.o8) obj).b(i13);
                return;
        }
    }

    public o8(Object obj, int i10, int i11) {
        this.f1354a = i11;
        this.f1356c = obj;
        this.f1355b = i10;
    }
}
