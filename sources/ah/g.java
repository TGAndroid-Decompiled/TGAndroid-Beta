package ah;

import ai.ha;
import ai.u5;
import android.os.Looper;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.StateSet;
import ci.h7;
import ci.u7;
import ei.a8;
import ei.n2;
import ei.vb;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import ki.o3;
import ki.t3;
import ki.w3;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.de;
import org.telegram.ui.dn;
import org.telegram.ui.km;
import org.telegram.ui.qi;
import org.telegram.ui.ri;
import org.telegram.ui.sn;
import org.telegram.ui.u4;
import org.telegram.ui.zi;
import v7.u6;
public final class g implements Runnable {
    public final int f736a;
    public final int f737b;
    public final Object f738c;

    public g(int i10, Object obj, int i11) {
        this.f736a = i11;
        this.f737b = i10;
        this.f738c = obj;
    }

    @Override
    public final void run() {
        boolean z10;
        ArrayList<TLRPC.MessageEntity> arrayList;
        ArrayList<TLRPC.MessageEntity> arrayList2;
        boolean z11;
        int i10;
        int i11;
        int i12 = this.f736a;
        boolean z12 = false;
        int i13 = this.f737b;
        Object obj = this.f738c;
        switch (i12) {
            case 0:
                i iVar = (i) obj;
                if (iVar.f777b) {
                    Utilities.Callback callback = iVar.d;
                    if (callback != null) {
                        if (i13 < 300) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        callback.run(Boolean.valueOf(z10));
                        try {
                            iVar.f776a.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    iVar.f778c = true;
                    int max = Math.max(50, i13 - 100);
                    AndroidUtilities.runOnUIThread(new g(iVar, max, 0), max);
                    return;
                }
                return;
            case 1:
                pf.d.r(((ai.x) obj).getParentActivity(), LocaleController.getString(i13));
                return;
            case 2:
                ConnectionsManager.getInstance(((ha) obj).f1413a).cancelRequest(i13, true);
                return;
            case 3:
                ((c2.g) obj).f4508b.onAudioFocusChange(i13);
                return;
            case 4:
                h7 h7Var = (h7) obj;
                ArrayList arrayList3 = h7Var.f5403g;
                h7Var.v(arrayList3);
                u5 u5Var = h7Var.J;
                Collections.sort(arrayList3, u5Var);
                ArrayList arrayList4 = h7Var.h;
                h7Var.v(arrayList4);
                Collections.sort(arrayList4, u5Var);
                NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                return;
            case 5:
                ((ei.o) obj).run(Integer.valueOf(i13));
                return;
            case 6:
                ((Utilities.Callback) obj).run(Integer.valueOf(i13));
                return;
            case 7:
                ((n2) obj).r0(i13);
                return;
            case 8:
                MessagesController.getInstance(i13).putUsers((ArrayList) obj, true);
                return;
            case 9:
                vb vbVar = (vb) obj;
                int i14 = vbVar.f9971c;
                vbVar.l();
                vbVar.X1 = false;
                File file = vbVar.K1.O0;
                if (file != null) {
                    file.delete();
                    vbVar.K1.O0 = null;
                }
                vbVar.V(vbVar.K1, true);
                CharSequence[] charSequenceArr = {vbVar.f9973c1.getText()};
                if (MessagesController.getInstance(i14).storyEntitiesAllowed()) {
                    arrayList = MediaDataController.getInstance(i14).getEntities(charSequenceArr, true);
                } else {
                    arrayList = new ArrayList<>();
                }
                CharSequence[] charSequenceArr2 = {vbVar.K1.C0};
                if (MessagesController.getInstance(i14).storyEntitiesAllowed()) {
                    arrayList2 = MediaDataController.getInstance(i14).getEntities(charSequenceArr2, true);
                } else {
                    arrayList2 = new ArrayList<>();
                }
                a8 a8Var = vbVar.K1;
                if (TextUtils.equals(a8Var.C0, charSequenceArr[0]) && MediaDataController.entitiesEqual(arrayList, arrayList2)) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                a8Var.f8725k = z11;
                vbVar.K1.C0 = new SpannableString(vbVar.f9973c1.getText());
                vbVar.y();
                vbVar.x();
                a8 a8Var2 = vbVar.K1;
                if (a8Var2 != null && a8Var2.K) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                vbVar.O1 = i10;
                vbVar.K1 = (a8) vbVar.H1.get(i13);
                vbVar.N(0, 1);
                vbVar.M(0, 1);
                vbVar.f9976d1.f9376b.Z2.N(false);
                vbVar.f9973c1.setText(vbVar.K1.C0);
                return;
            case 10:
                ((hg.h0) obj).m(i13);
                return;
            case 11:
                j2.e eVar = ((i2.q0) obj).M;
                j2.a l4 = eVar.l();
                eVar.q(l4, 1034, new ih.l(l4, i13, 16, (char) 0));
                return;
            case 12:
                try {
                    SQLiteDatabase database = ((MessagesStorage) obj).getDatabase();
                    database.executeFast("DELETE FROM business_replies WHERE topic_id = " + i13).stepThis().dispose();
                    database.executeFast("DELETE FROM quick_replies_messages WHERE topic_id = " + i13).stepThis().dispose();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 13:
                ih.g gVar = (ih.g) obj;
                gVar.getClass();
                try {
                    gVar.f13178a.scrollBy(0, i13);
                    return;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    return;
                }
            case 14:
                String str = e2.m0.f8259a;
                e2.c cVar = ((i2.b0) ((k2.v) ((qf.b) obj).f44864c)).f12353a.C;
                i2.v vVar = new i2.v(i13, 2);
                cVar.getClass();
                if (Looper.myLooper() == ((e2.i0) cVar.f8211c).f8244a.getLooper()) {
                    z12 = true;
                }
                u6.p(z12);
                cVar.f8209a++;
                cVar.i(new u7(16, cVar, vVar));
                Integer num = (Integer) cVar.e;
                cVar.n(Integer.valueOf(i13));
                return;
            case 15:
                ki.d0 d0Var = (ki.d0) obj;
                ki.g0 g0Var = d0Var.f15252f;
                if (d0Var.f15251c && g0Var.E != null && g0Var.f15157a != null) {
                    d0Var.d = true;
                    d0Var.f15249a.setPressed(false);
                    try {
                        d0Var.performHapticFeedback(0);
                    } catch (Exception unused2) {
                    }
                    ki.e0 e0Var = g0Var.E;
                    ki.a aVar = g0Var.f15157a;
                    w3 w3Var = ((o3) e0Var).f15483a;
                    w3Var.u3(false);
                    w3Var.f15656i3.n(new t3(w3Var, aVar, i13), d0Var);
                    return;
                }
                return;
            case 16:
                ((oh.a) obj).v0(i13, 0, null);
                return;
            case 17:
                ConnectionsManager.lambda$onUpdateConfig$21(i13, (TLRPC.TL_config) obj);
                return;
            case 18:
                MessagesController.getInstance(i13).loadFullChat(((TLRPC.Chat) obj).f20344id, 0, true);
                return;
            case 19:
                ((u4) ((org.telegram.ui.f) obj).f37153b).V(i13, true);
                return;
            case 20:
                t1 t1Var = (t1) obj;
                int i15 = t1Var.f23614v7;
                if (i13 == i15) {
                    org.telegram.ui.Cells.d0 d0Var2 = (org.telegram.ui.Cells.d0) t1Var.f23515o7.get(i15);
                    if (d0Var2 != null) {
                        org.telegram.ui.Cells.y yVar = d0Var2.f22249s;
                        if (yVar != null) {
                            yVar.setState(StateSet.NOTHING);
                        }
                        d0Var2.b(false);
                        if (!t1Var.f23660y7.scheduled) {
                            if (d0Var2.f22240j != null) {
                                t1Var.j();
                            } else if (d0Var2.f22239i != null) {
                                t1Var.j();
                                org.telegram.ui.Cells.k1 k1Var = t1Var.Jc;
                                if (k1Var != null) {
                                    k1Var.A1(t1Var, d0Var2.f22239i);
                                }
                            }
                        }
                    }
                    t1Var.f23614v7 = -1;
                    t1Var.Z2();
                    return;
                }
                return;
            case 21:
                ((de) obj).f36606f.c(i13);
                return;
            case 22:
                sn snVar = ((qi) obj).f40842g;
                if (snVar.Jb == i13) {
                    snVar.Qa();
                    return;
                }
                return;
            case 23:
                sn snVar2 = ((ri) obj).f41168g;
                if (snVar2.Jb == i13) {
                    snVar2.Qa();
                    return;
                }
                return;
            case 24:
                ((zi) obj).f44113a.j(this.f737b, 0, true, 0, true, 0);
                return;
            case 25:
                sn snVar3 = ((qi) obj).f40842g;
                if (snVar3.Jb == i13) {
                    snVar3.Qa();
                    return;
                }
                return;
            case 26:
                sn snVar4 = ((ri) obj).f41168g;
                if (snVar4.Jb == i13) {
                    snVar4.Qa();
                    return;
                }
                return;
            case 27:
                sn snVar5 = ((ri) obj).f41168g;
                if (snVar5.Jb == i13) {
                    snVar5.Qa();
                    return;
                }
                return;
            case 28:
                sn snVar6 = ((km) obj).J0;
                snVar6.f41759z0.h1(i13, snVar6.K4);
                return;
            default:
                i11 = ((o2) ((dn) obj).f36651a).currentAccount;
                ConnectionsManager.getInstance(i11).cancelRequest(i13, true);
                return;
        }
    }

    public g(Object obj, int i10, int i11) {
        this.f736a = i11;
        this.f738c = obj;
        this.f737b = i10;
    }
}
