package ag;

import a8.yb;
import android.os.Bundle;
import android.os.Looper;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.StateSet;
import bi.ca;
import bi.p5;
import di.b4;
import di.h7;
import fi.l2;
import fi.sb;
import fi.w7;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import li.n3;
import li.s3;
import li.v3;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.Cells.j1;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.aj;
import org.telegram.ui.fe;
import org.telegram.ui.fn;
import org.telegram.ui.ge;
import org.telegram.ui.mm;
import org.telegram.ui.ri;
import org.telegram.ui.si;
import org.telegram.ui.t4;
import org.telegram.ui.un;
public final class r0 implements Runnable {
    public final int f1374a;
    public final int f1375b;
    public final Object f1376c;

    public r0(int i10, Object obj, int i11) {
        this.f1374a = i11;
        this.f1375b = i10;
        this.f1376c = obj;
    }

    @Override
    public final void run() {
        ArrayList<TLRPC.MessageEntity> arrayList;
        ArrayList<TLRPC.MessageEntity> arrayList2;
        boolean z10;
        int i10;
        int i11;
        int i12 = this.f1374a;
        boolean z11 = false;
        int i13 = this.f1375b;
        Object obj = this.f1376c;
        switch (i12) {
            case 0:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(i13).clientUserId);
                ((j5) obj).getLastFragment().presentFragment(new ProfileActivity(bundle, null));
                return;
            case 1:
                bh.h hVar = (bh.h) obj;
                if (hVar.f4035b) {
                    Utilities.Callback callback = hVar.d;
                    if (callback != null) {
                        if (i13 < 300) {
                            z11 = true;
                        }
                        callback.run(Boolean.valueOf(z11));
                        try {
                            hVar.f4034a.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    hVar.f4036c = true;
                    int max = Math.max(50, i13 - 100);
                    AndroidUtilities.runOnUIThread(new r0(hVar, max, 1), max);
                    return;
                }
                return;
            case 2:
                qf.d.r(((bi.y) obj).getParentActivity(), LocaleController.getString(i13));
                return;
            case 3:
                ConnectionsManager.getInstance(((ca) obj).f4441a).cancelRequest(i13, true);
                return;
            case 4:
                ((c2.g) obj).f5944b.onAudioFocusChange(i13);
                return;
            case 5:
                h7 h7Var = (h7) obj;
                ArrayList arrayList3 = h7Var.f8634g;
                h7Var.v(arrayList3);
                p5 p5Var = h7Var.J;
                Collections.sort(arrayList3, p5Var);
                ArrayList arrayList4 = h7Var.h;
                h7Var.v(arrayList4);
                Collections.sort(arrayList4, p5Var);
                NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                return;
            case 6:
                ((fi.o) obj).run(Integer.valueOf(i13));
                return;
            case 7:
                ((Utilities.Callback) obj).run(Integer.valueOf(i13));
                return;
            case 8:
                ((l2) obj).r0(i13);
                return;
            case 9:
                MessagesController.getInstance(i13).putUsers((ArrayList) obj, true);
                return;
            case 10:
                sb sbVar = (sb) obj;
                int i14 = sbVar.f11612c;
                sbVar.l();
                sbVar.X1 = false;
                File file = sbVar.K1.O0;
                if (file != null) {
                    file.delete();
                    sbVar.K1.O0 = null;
                }
                sbVar.V(sbVar.K1, true);
                CharSequence[] charSequenceArr = {sbVar.f11614c1.getText()};
                if (MessagesController.getInstance(i14).storyEntitiesAllowed()) {
                    arrayList = MediaDataController.getInstance(i14).getEntities(charSequenceArr, true);
                } else {
                    arrayList = new ArrayList<>();
                }
                CharSequence[] charSequenceArr2 = {sbVar.K1.C0};
                if (MessagesController.getInstance(i14).storyEntitiesAllowed()) {
                    arrayList2 = MediaDataController.getInstance(i14).getEntities(charSequenceArr2, true);
                } else {
                    arrayList2 = new ArrayList<>();
                }
                w7 w7Var = sbVar.K1;
                if (TextUtils.equals(w7Var.C0, charSequenceArr[0]) && MediaDataController.entitiesEqual(arrayList, arrayList2)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                w7Var.f11910k = z10;
                sbVar.K1.C0 = new SpannableString(sbVar.f11614c1.getText());
                sbVar.y();
                sbVar.x();
                w7 w7Var2 = sbVar.K1;
                if (w7Var2 != null && w7Var2.K) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                sbVar.O1 = i10;
                sbVar.K1 = (w7) sbVar.H1.get(i13);
                sbVar.N(0, 1);
                sbVar.M(0, 1);
                sbVar.f11617d1.f11107b.f32150g3.O(false);
                sbVar.f11614c1.setText(sbVar.K1.C0);
                return;
            case 11:
                j2.e eVar = ((i2.s0) obj).M;
                j2.a l4 = eVar.l();
                eVar.q(l4, 1034, new ig.g(l4, i13, 14, (char) 0));
                return;
            case 12:
                ((ig.i0) obj).m(i13);
                return;
            case 13:
                try {
                    SQLiteDatabase database = ((MessagesStorage) obj).getDatabase();
                    database.executeFast("DELETE FROM business_replies WHERE topic_id = " + i13).stepThis().dispose();
                    database.executeFast("DELETE FROM quick_replies_messages WHERE topic_id = " + i13).stepThis().dispose();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 14:
                jh.g gVar = (jh.g) obj;
                gVar.getClass();
                try {
                    gVar.f15953a.scrollBy(0, i13);
                    return;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    return;
                }
            case 15:
                String str = e2.n0.f9692a;
                e2.c cVar = ((i2.d0) ((k2.v) ((rf.b) obj).f47333c)).f13509a.C;
                i2.w wVar = new i2.w(i13, 2);
                cVar.getClass();
                if (Looper.myLooper() == ((e2.i0) cVar.f9639c).f9672a.getLooper()) {
                    z11 = true;
                }
                yb.p(z11);
                cVar.f9637a++;
                cVar.i(new b4(25, cVar, wVar));
                Integer num = (Integer) cVar.e;
                cVar.n(Integer.valueOf(i13));
                return;
            case 16:
                li.c0 c0Var = (li.c0) obj;
                li.f0 f0Var = c0Var.f17167f;
                if (c0Var.f17166c && f0Var.E != null && f0Var.f17653a != null) {
                    c0Var.d = true;
                    c0Var.f17164a.setPressed(false);
                    try {
                        c0Var.performHapticFeedback(0);
                    } catch (Exception unused2) {
                    }
                    li.d0 d0Var = f0Var.E;
                    li.a aVar = f0Var.f17653a;
                    v3 v3Var = ((n3) d0Var).f17380a;
                    v3Var.u3(false);
                    v3Var.f17557p3.B(new s3(v3Var, aVar, i13), c0Var);
                    return;
                }
                return;
            case 17:
                ConnectionsManager.lambda$onUpdateConfig$21(i13, (TLRPC.TL_config) obj);
                return;
            case 18:
                MessagesController.getInstance(i13).loadFullChat(((TLRPC.Chat) obj).f22027id, 0, true);
                return;
            case 19:
                ((t4) ((org.telegram.ui.f) obj).f39221b).W(i13, true);
                return;
            case 20:
                s1 s1Var = (s1) obj;
                int i15 = s1Var.f25318v7;
                if (i13 == i15) {
                    org.telegram.ui.Cells.d0 d0Var2 = (org.telegram.ui.Cells.d0) s1Var.f25218o7.get(i15);
                    if (d0Var2 != null) {
                        org.telegram.ui.Cells.y yVar = d0Var2.f23975s;
                        if (yVar != null) {
                            yVar.setState(StateSet.NOTHING);
                        }
                        d0Var2.b(false);
                        if (!s1Var.f25363y7.scheduled) {
                            if (d0Var2.f23966j != null) {
                                s1Var.j();
                            } else if (d0Var2.f23965i != null) {
                                s1Var.j();
                                j1 j1Var = s1Var.Jc;
                                if (j1Var != null) {
                                    j1Var.q1(s1Var, d0Var2.f23965i);
                                }
                            }
                        }
                    }
                    s1Var.f25318v7 = -1;
                    s1Var.a3();
                    return;
                }
                return;
            case 21:
                ge geVar = ((fe) obj).f39348f;
                geVar.getClass();
                geVar.c(i13);
                return;
            case 22:
                un unVar = ((ri) obj).f43169g;
                if (unVar.Sb == i13) {
                    unVar.Va();
                    return;
                }
                return;
            case 23:
                un unVar2 = ((si) obj).f43522g;
                if (unVar2.Sb == i13) {
                    unVar2.Va();
                    return;
                }
                return;
            case 24:
                ((aj) obj).f37813a.j(this.f1375b, 0, true, 0, true, 0);
                return;
            case 25:
                un unVar3 = ((ri) obj).f43169g;
                if (unVar3.Sb == i13) {
                    unVar3.Va();
                    return;
                }
                return;
            case 26:
                un unVar4 = ((si) obj).f43522g;
                if (unVar4.Sb == i13) {
                    unVar4.Va();
                    return;
                }
                return;
            case 27:
                un unVar5 = ((si) obj).f43522g;
                if (unVar5.Sb == i13) {
                    unVar5.Va();
                    return;
                }
                return;
            case 28:
                un unVar6 = ((mm) obj).B0;
                unVar6.f44493z0.h1(i13, unVar6.K4);
                return;
            default:
                i11 = ((r2) ((fn) obj).f39420a).currentAccount;
                ConnectionsManager.getInstance(i11).cancelRequest(i13, true);
                return;
        }
    }

    public r0(Object obj, int i10, int i11) {
        this.f1374a = i11;
        this.f1376c = obj;
        this.f1375b = i10;
    }
}
