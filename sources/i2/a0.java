package i2;

import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.View;
import ci.e4;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.ok;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Cells.s2;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.zm;
import org.telegram.ui.am;
import org.telegram.ui.in;
import org.telegram.ui.jm;
import org.telegram.ui.my;
import org.telegram.ui.oy;
import org.telegram.ui.py;
import org.telegram.ui.qy;
import org.telegram.ui.wn;
public final class a0 implements Runnable {
    public final int f10615a;
    public final int f10616b;
    public final int f10617c;
    public final Object d;
    public final Object e;

    public a0(int i10, int i11, String str, String str2) {
        this.f10615a = 1;
        this.f10616b = i10;
        this.d = str;
        this.e = str2;
        this.f10617c = i11;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        float f7;
        int i13;
        switch (this.f10615a) {
            case 0:
                f0 f0Var = ((c0) this.d).f10630a;
                Surface surface = new Surface((SurfaceTexture) this.e);
                f0Var.t1(surface);
                f0Var.S = surface;
                f0Var.m1(this.f10616b, this.f10617c);
                return;
            case 1:
                ConnectionsManager.lambda$onIntegrityCheckClassic$27(this.f10616b, (String) this.d, (String) this.e, this.f10617c);
                return;
            case 2:
                ((wn) this.d).didReceivedNotification(this.f10616b, this.f10617c, (Object[]) this.e);
                return;
            case 3:
                am amVar = (am) this.d;
                amVar.getClass();
                MessageObject messageObject = ((org.telegram.ui.Cells.w0) this.e).getMessageObject();
                jm jmVar = amVar.f32271a;
                wn wnVar = jmVar.Q;
                int id2 = messageObject.getId();
                if (messageObject.getDialogId() == jmVar.Q.L6) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                wnVar.Xa(this.f10616b, id2, true, i10, true, 0, Integer.valueOf(this.f10617c), null, null);
                return;
            case 4:
                u1 u1Var = (u1) this.e;
                wn wnVar2 = ((in) this.d).f34642a;
                if (wnVar2.A1 != null) {
                    int[] iArr = new int[2];
                    u1Var.getLocationInWindow(iArr);
                    e4 e4Var = wnVar2.A1;
                    e4Var.setTranslationY(ok.D(520.0f, iArr[1] - e4Var.getTop(), this.f10616b));
                    wnVar2.A1.m(0.0f, (-AndroidUtilities.dp(16.0f)) + iArr[0] + this.f10617c);
                    wnVar2.A1.u();
                    return;
                }
                return;
            default:
                final oy oyVar = (oy) this.d;
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.e;
                py pyVar = oyVar.f36467g;
                qy qyVar = oyVar.h;
                ArrayList arrayList = qyVar.R1;
                if (arrayList != null) {
                    arrayList.remove(dialog);
                    int i14 = dialog.pinnedNum;
                    qyVar.W0 = null;
                    pyVar.f36794a.invalidate();
                    int N0 = pyVar.f36796c.N0();
                    if (N0 == this.f10616b - 1) {
                        pyVar.f36796c.m(N0).requestLayout();
                    }
                    boolean z10 = false;
                    if (qyVar.getMessagesController().isPromoDialog(dialog.f18356id, false)) {
                        qyVar.getMessagesController().hidePromoDialog();
                        pyVar.f36802x.D();
                        pyVar.q(true);
                        return;
                    }
                    MessagesController messagesController = qyVar.getMessagesController();
                    long j3 = dialog.f18356id;
                    if (qyVar.V2 == 0) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    int addDialogToFolder = messagesController.addDialogToFolder(j3, i11, -1, 0L);
                    int i15 = this.f10617c;
                    if (addDialogToFolder != 2 || i15 != 0) {
                        pyVar.f36802x.D();
                        pyVar.q(true);
                    }
                    if (qyVar.V2 == 0) {
                        if (addDialogToFolder == 2) {
                            if (SharedConfig.archiveHidden) {
                                SharedConfig.toggleArchiveHidden();
                            }
                            pyVar.f36802x.D();
                            if (i15 == 0) {
                                qyVar.A4(true, true);
                                pyVar.q(true);
                                qyVar.o3();
                            } else {
                                pyVar.q(true);
                                if (!SharedConfig.archiveHidden && pyVar.f36796c.L0() == 0) {
                                    qyVar.f37136e2 = true;
                                    my myVar = pyVar.f36794a;
                                    if (SharedConfig.useThreeLinesLayout) {
                                        f7 = 76.0f;
                                    } else {
                                        f7 = 70.0f;
                                    }
                                    myVar.w0(0, -AndroidUtilities.dp(f7), null);
                                }
                            }
                            i13 = ((m2) qyVar).currentAccount;
                            qyVar.R1.add(0, (TLRPC.Dialog) qyVar.R3(i13, pyVar.f36800s, qyVar.V2, false).get(0));
                            pyVar.q(true);
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            oyVar.h.A4(false, true);
                                            return;
                                        default:
                                            oyVar.h.A4(false, true);
                                            return;
                                    }
                                }
                            }, 300L);
                        } else if (addDialogToFolder == 1) {
                            s4.c1 K = pyVar.f36794a.K(0);
                            if (K != null) {
                                View view = K.f43068a;
                                if (view instanceof s2) {
                                    s2 s2Var = (s2) view;
                                    if (s2Var.a2.f24782n == 2) {
                                        s2Var.f20946b2 = true;
                                        s2Var.f20951c2 = 0.0f;
                                        h6.f19384u1.T(0.0f, true);
                                        h6.f19384u1.start();
                                        s2Var.invalidate();
                                    }
                                }
                            }
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            oyVar.h.A4(false, true);
                                            return;
                                        default:
                                            oyVar.h.A4(false, true);
                                            return;
                                    }
                                }
                            }, 300L);
                        }
                        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                        z10 = (globalMainSettings.getBoolean("archivehint_l", false) || SharedConfig.archiveHidden) ? true : true;
                        if (!z10) {
                            globalMainSettings.edit().putBoolean("archivehint_l", true).commit();
                        }
                        UndoView Y3 = qyVar.Y3();
                        if (Y3 != null) {
                            long j10 = dialog.f18356id;
                            if (z10) {
                                i12 = 2;
                            } else {
                                i12 = 3;
                            }
                            Y3.l(j10, i12, null, new zm(oyVar, dialog, i14, 26));
                        }
                    }
                    if (qyVar.V2 != 0 && qyVar.R1.isEmpty()) {
                        pyVar.f36794a.setEmptyView(null);
                        pyVar.f36801w.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public a0(Object obj, Object obj2, int i10, int i11, int i12) {
        this.f10615a = i12;
        this.d = obj;
        this.e = obj2;
        this.f10616b = i10;
        this.f10617c = i11;
    }

    public a0(wn wnVar, int i10, int i11, Object[] objArr) {
        this.f10615a = 2;
        this.d = wnVar;
        this.f10616b = i10;
        this.f10617c = i11;
        this.e = objArr;
    }
}
