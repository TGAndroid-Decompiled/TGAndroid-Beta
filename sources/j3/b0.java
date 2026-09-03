package j3;

import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.gy;
import org.telegram.ui.bm;
import org.telegram.ui.jm;
import org.telegram.ui.jn;
import org.telegram.ui.ly;
import org.telegram.ui.ny;
import org.telegram.ui.oy;
import org.telegram.ui.py;
import org.telegram.ui.xn;
import qh.e3;
public final class b0 implements Runnable {
    public final int f8983a;
    public final int f8984b;
    public final int f8985c;
    public final Object d;
    public final Object f8986e;

    public b0(int i10, int i11, String str, String str2) {
        this.f8983a = 1;
        this.f8984b = i10;
        this.d = str;
        this.f8986e = str2;
        this.f8985c = i11;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        float f10;
        int i13;
        switch (this.f8983a) {
            case 0:
                f0 f0Var = ((c0) this.d).f9000a;
                Surface surface = new Surface((SurfaceTexture) this.f8986e);
                f0Var.Z(surface);
                f0Var.Q = surface;
                f0Var.T(this.f8984b, this.f8985c);
                return;
            case 1:
                ConnectionsManager.lambda$onIntegrityCheckClassic$27(this.f8984b, (String) this.d, (String) this.f8986e, this.f8985c);
                return;
            case 2:
                ((xn) this.d).didReceivedNotification(this.f8984b, this.f8985c, (Object[]) this.f8986e);
                return;
            case 3:
                bm bmVar = (bm) this.d;
                bmVar.getClass();
                MessageObject messageObject = ((org.telegram.ui.Cells.v0) this.f8986e).getMessageObject();
                jm jmVar = bmVar.f35565a;
                xn xnVar = jmVar.N;
                int id2 = messageObject.getId();
                if (messageObject.getDialogId() == jmVar.N.I6) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                xnVar.Xa(this.f8984b, id2, true, i10, true, 0, Integer.valueOf(this.f8985c), null, null);
                return;
            case 4:
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f8986e;
                xn xnVar2 = ((jn) this.d).f38085a;
                if (xnVar2.f43382x1 != null) {
                    int[] iArr = new int[2];
                    t1Var.getLocationInWindow(iArr);
                    e3 e3Var = xnVar2.f43382x1;
                    e3Var.setTranslationY(org.telegram.ui.b.C(520.0f, iArr[1] - e3Var.getTop(), this.f8984b));
                    xnVar2.f43382x1.m(0.0f, (-AndroidUtilities.dp(16.0f)) + iArr[0] + this.f8985c);
                    xnVar2.f43382x1.u();
                    return;
                }
                return;
            default:
                final ny nyVar = (ny) this.d;
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.f8986e;
                oy oyVar = nyVar.f39479g;
                py pyVar = nyVar.h;
                ArrayList arrayList = pyVar.O1;
                if (arrayList != null) {
                    arrayList.remove(dialog);
                    int i14 = dialog.pinnedNum;
                    pyVar.T0 = null;
                    oyVar.f39822a.invalidate();
                    int N0 = oyVar.f39824c.N0();
                    if (N0 == this.f8984b - 1) {
                        oyVar.f39824c.m(N0).requestLayout();
                    }
                    boolean z4 = false;
                    if (pyVar.getMessagesController().isPromoDialog(dialog.f20849id, false)) {
                        pyVar.getMessagesController().hidePromoDialog();
                        oyVar.f39831x.D();
                        oyVar.q(true);
                        return;
                    }
                    MessagesController messagesController = pyVar.getMessagesController();
                    long j10 = dialog.f20849id;
                    if (pyVar.S2 == 0) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    int addDialogToFolder = messagesController.addDialogToFolder(j10, i11, -1, 0L);
                    int i15 = this.f8985c;
                    if (addDialogToFolder != 2 || i15 != 0) {
                        oyVar.f39831x.D();
                        oyVar.q(true);
                    }
                    if (pyVar.S2 == 0) {
                        if (addDialogToFolder == 2) {
                            if (SharedConfig.archiveHidden) {
                                SharedConfig.toggleArchiveHidden();
                            }
                            oyVar.f39831x.D();
                            if (i15 == 0) {
                                pyVar.A4(true, true);
                                oyVar.q(true);
                                pyVar.o3();
                            } else {
                                oyVar.q(true);
                                if (!SharedConfig.archiveHidden && oyVar.f39824c.L0() == 0) {
                                    pyVar.f40157b2 = true;
                                    ly lyVar = oyVar.f39822a;
                                    if (SharedConfig.useThreeLinesLayout) {
                                        f10 = 76.0f;
                                    } else {
                                        f10 = 70.0f;
                                    }
                                    lyVar.v0(0, -AndroidUtilities.dp(f10), null);
                                }
                            }
                            i13 = ((org.telegram.ui.ActionBar.p2) pyVar).currentAccount;
                            pyVar.O1.add(0, (TLRPC.Dialog) pyVar.R3(i13, oyVar.f39829s, pyVar.S2, false).get(0));
                            oyVar.q(true);
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            nyVar.h.A4(false, true);
                                            return;
                                        default:
                                            nyVar.h.A4(false, true);
                                            return;
                                    }
                                }
                            }, 300L);
                        } else if (addDialogToFolder == 1) {
                            f2.m1 K = oyVar.f39822a.K(0);
                            if (K != null) {
                                View view = K.f5875a;
                                if (view instanceof r2) {
                                    r2 r2Var = (r2) view;
                                    if (r2Var.X1.f33845n == 2) {
                                        r2Var.Y1 = true;
                                        r2Var.Z1 = 0.0f;
                                        k6.f21958u1.Q(0.0f, true);
                                        k6.f21958u1.start();
                                        r2Var.invalidate();
                                    }
                                }
                            }
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            nyVar.h.A4(false, true);
                                            return;
                                        default:
                                            nyVar.h.A4(false, true);
                                            return;
                                    }
                                }
                            }, 300L);
                        }
                        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                        z4 = (globalMainSettings.getBoolean("archivehint_l", false) || SharedConfig.archiveHidden) ? true : true;
                        if (!z4) {
                            globalMainSettings.edit().putBoolean("archivehint_l", true).commit();
                        }
                        UndoView Y3 = pyVar.Y3();
                        if (Y3 != null) {
                            long j11 = dialog.f20849id;
                            if (z4) {
                                i12 = 2;
                            } else {
                                i12 = 3;
                            }
                            Y3.l(j11, i12, null, new gy(nyVar, dialog, i14, 24));
                        }
                    }
                    if (pyVar.S2 != 0 && pyVar.O1.isEmpty()) {
                        oyVar.f39822a.setEmptyView(null);
                        oyVar.f39830w.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public b0(Object obj, Object obj2, int i10, int i11, int i12) {
        this.f8983a = i12;
        this.d = obj;
        this.f8986e = obj2;
        this.f8984b = i10;
        this.f8985c = i11;
    }

    public b0(xn xnVar, int i10, int i11, Object[] objArr) {
        this.f8983a = 2;
        this.d = xnVar;
        this.f8984b = i10;
        this.f8985c = i11;
        this.f8986e = objArr;
    }
}
