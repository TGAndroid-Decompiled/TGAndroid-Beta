package ai;

import android.content.DialogInterface;
import android.os.Looper;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.StateSet;
import android.view.TextureView;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.a60;
import org.telegram.ui.aj;
import org.telegram.ui.fe;
import org.telegram.ui.ln;
import org.telegram.ui.rm;
import org.telegram.ui.yi;
import org.telegram.ui.zi;
import org.telegram.ui.zn;
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
                    w3Var.f11714h3.J(new ii.t3(w3Var, aVar, i13), e0Var);
                    return;
                }
                return;
            case 11:
                String str = e2.d0.f7887a;
                e2.c cVar = ((i2.b0) ((k2.j) ((n4.y) obj).f15180c)).f10624a.E;
                i2.v vVar = new i2.v(i13, 2);
                cVar.getClass();
                if (Looper.myLooper() == ((e2.z) cVar.f7884c).f7942a.getLooper()) {
                    z11 = true;
                }
                e2.d.g(z11);
                cVar.f7882a++;
                cVar.i(new ci.b9(11, cVar, vVar));
                Integer num = (Integer) cVar.e;
                cVar.n(Integer.valueOf(i13));
                return;
            case 12:
                ((ki.g) obj).r(i13);
                return;
            case 13:
                ki.h0 h0Var2 = (ki.h0) ((k2.u) obj).f13383b;
                h0Var2.G++;
                h0Var2.f13718q = true;
                h0Var2.f13713l.b("camera switch started: target=".concat(hg.k0.z(i13)));
                TextureView textureView = ((a60) h0Var2.f13707c.f13859a).v;
                textureView.animate().cancel();
                textureView.animate().rotationY(90.0f).setDuration(120L).start();
                h0Var2.m();
                return;
            case 14:
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
            case 15:
                ((nh.a) obj).w0(i13, 0, null);
                return;
            case 16:
                ConnectionsManager.lambda$onUpdateConfig$21(i13, (TLRPC.TL_config) obj);
                return;
            case 17:
                MessagesController.getInstance(i13).loadFullChat(((TLRPC.Chat) obj).f18296id, 0, true);
                return;
            case 18:
                ((org.telegram.ui.p4) ((org.telegram.ui.g) obj).f33660b).V(i13, true);
                return;
            case 19:
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) obj;
                int i15 = u1Var.f21528v7;
                if (i13 == i15) {
                    org.telegram.ui.Cells.e0 e0Var2 = (org.telegram.ui.Cells.e0) u1Var.f21425o7.get(i15);
                    if (e0Var2 != null) {
                        org.telegram.ui.Cells.z zVar = e0Var2.f20181s;
                        if (zVar != null) {
                            zVar.setState(StateSet.NOTHING);
                        }
                        e0Var2.b(false);
                        if (!u1Var.f21572y7.scheduled) {
                            if (e0Var2.f20172j != null) {
                                u1Var.k();
                            } else if (e0Var2.f20171i != null) {
                                u1Var.k();
                                org.telegram.ui.Cells.l1 l1Var = u1Var.Jc;
                                if (l1Var != null) {
                                    l1Var.H1(u1Var, e0Var2.f20171i);
                                }
                            }
                        }
                    }
                    u1Var.f21528v7 = -1;
                    u1Var.a3();
                    return;
                }
                return;
            case 20:
                ((fe) obj).f33520f.c(i13);
                return;
            case 21:
                ((aj) obj).f32081a.F(this.f1302b, 0, 0, 0, true, true);
                return;
            case 22:
                zn znVar = ((yi) obj).f39834g;
                if (znVar.f40472vb == i13) {
                    znVar.Ma();
                    return;
                }
                return;
            case 23:
                zn znVar2 = ((zi) obj).f40178g;
                if (znVar2.f40472vb == i13) {
                    znVar2.Ma();
                    return;
                }
                return;
            case 24:
                zn znVar3 = ((yi) obj).f39834g;
                if (znVar3.f40472vb == i13) {
                    znVar3.Ma();
                    return;
                }
                return;
            case 25:
                zn znVar4 = ((zi) obj).f40178g;
                if (znVar4.f40472vb == i13) {
                    znVar4.Ma();
                    return;
                }
                return;
            case 26:
                zn znVar5 = ((zi) obj).f40178g;
                if (znVar5.f40472vb == i13) {
                    znVar5.Ma();
                    return;
                }
                return;
            case 27:
                zn znVar6 = ((rm) obj).J0;
                znVar6.f40513z0.h1(i13, znVar6.f40504y4);
                return;
            case 28:
                i11 = ((org.telegram.ui.ActionBar.n2) ((ln) obj).f35408a).currentAccount;
                ConnectionsManager.getInstance(i11).cancelRequest(i13, true);
                return;
            default:
                NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.t1((MessagesStorage.BooleanCallback) obj, 1), 250L);
                return;
        }
    }

    public n8(Object obj, int i10, int i11) {
        this.f1301a = i11;
        this.f1303c = obj;
        this.f1302b = i10;
    }
}
