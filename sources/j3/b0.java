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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.ey;
import org.telegram.ui.bm;
import org.telegram.ui.jm;
import org.telegram.ui.jn;
import org.telegram.ui.ky;
import org.telegram.ui.my;
import org.telegram.ui.ny;
import org.telegram.ui.oy;
import org.telegram.ui.xn;
import ph.f3;
public final class b0 implements Runnable {
    public final int f8426a;
    public final int f8427b;
    public final int f8428c;
    public final Object d;
    public final Object e;

    public b0(int i10, int i11, String str, String str2) {
        this.f8426a = 1;
        this.f8427b = i10;
        this.d = str;
        this.e = str2;
        this.f8428c = i11;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        float f10;
        int i13;
        switch (this.f8426a) {
            case 0:
                f0 f0Var = ((c0) this.d).f8441a;
                Surface surface = new Surface((SurfaceTexture) this.e);
                f0Var.Z(surface);
                f0Var.Q = surface;
                f0Var.T(this.f8427b, this.f8428c);
                return;
            case 1:
                ConnectionsManager.lambda$onIntegrityCheckClassic$27(this.f8427b, (String) this.d, (String) this.e, this.f8428c);
                return;
            case 2:
                ((xn) this.d).didReceivedNotification(this.f8427b, this.f8428c, (Object[]) this.e);
                return;
            case 3:
                bm bmVar = (bm) this.d;
                bmVar.getClass();
                MessageObject messageObject = ((org.telegram.ui.Cells.v0) this.e).getMessageObject();
                jm jmVar = bmVar.f32984a;
                xn xnVar = jmVar.N;
                int id2 = messageObject.getId();
                if (messageObject.getDialogId() == jmVar.N.I6) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                xnVar.Xa(this.f8427b, id2, true, i10, true, 0, Integer.valueOf(this.f8428c), null, null);
                return;
            case 4:
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.e;
                xn xnVar2 = ((jn) this.d).f35381a;
                if (xnVar2.f40235x1 != null) {
                    int[] iArr = new int[2];
                    t1Var.getLocationInWindow(iArr);
                    f3 f3Var = xnVar2.f40235x1;
                    f3Var.setTranslationY(org.telegram.ui.b.C(520.0f, iArr[1] - f3Var.getTop(), this.f8427b));
                    xnVar2.f40235x1.n(0.0f, (-AndroidUtilities.dp(16.0f)) + iArr[0] + this.f8428c);
                    xnVar2.f40235x1.v();
                    return;
                }
                return;
            default:
                final my myVar = (my) this.d;
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.e;
                ny nyVar = myVar.f36411g;
                oy oyVar = myVar.h;
                ArrayList arrayList = oyVar.O1;
                if (arrayList != null) {
                    arrayList.remove(dialog);
                    int i14 = dialog.pinnedNum;
                    oyVar.T0 = null;
                    nyVar.f36741a.invalidate();
                    int N0 = nyVar.f36743c.N0();
                    if (N0 == this.f8427b - 1) {
                        nyVar.f36743c.m(N0).requestLayout();
                    }
                    boolean z4 = false;
                    if (oyVar.getMessagesController().isPromoDialog(dialog.f19188id, false)) {
                        oyVar.getMessagesController().hidePromoDialog();
                        nyVar.f36749x.D();
                        nyVar.q(true);
                        return;
                    }
                    MessagesController messagesController = oyVar.getMessagesController();
                    long j10 = dialog.f19188id;
                    if (oyVar.S2 == 0) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    int addDialogToFolder = messagesController.addDialogToFolder(j10, i11, -1, 0L);
                    int i15 = this.f8428c;
                    if (addDialogToFolder != 2 || i15 != 0) {
                        nyVar.f36749x.D();
                        nyVar.q(true);
                    }
                    if (oyVar.S2 == 0) {
                        if (addDialogToFolder == 2) {
                            if (SharedConfig.archiveHidden) {
                                SharedConfig.toggleArchiveHidden();
                            }
                            nyVar.f36749x.D();
                            if (i15 == 0) {
                                oyVar.A4(true, true);
                                nyVar.q(true);
                                oyVar.o3();
                            } else {
                                nyVar.q(true);
                                if (!SharedConfig.archiveHidden && nyVar.f36743c.L0() == 0) {
                                    oyVar.f37011b2 = true;
                                    ky kyVar = nyVar.f36741a;
                                    if (SharedConfig.useThreeLinesLayout) {
                                        f10 = 76.0f;
                                    } else {
                                        f10 = 70.0f;
                                    }
                                    kyVar.v0(0, -AndroidUtilities.dp(f10), null);
                                }
                            }
                            i13 = ((org.telegram.ui.ActionBar.p2) oyVar).currentAccount;
                            oyVar.O1.add(0, (TLRPC.Dialog) oyVar.R3(i13, nyVar.f36747s, oyVar.S2, false).get(0));
                            nyVar.q(true);
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            myVar.h.A4(false, true);
                                            return;
                                        default:
                                            myVar.h.A4(false, true);
                                            return;
                                    }
                                }
                            }, 300L);
                        } else if (addDialogToFolder == 1) {
                            f2.l1 K = nyVar.f36741a.K(0);
                            if (K != null) {
                                View view = K.f5785a;
                                if (view instanceof r2) {
                                    r2 r2Var = (r2) view;
                                    if (r2Var.X1.f31274n == 2) {
                                        r2Var.Y1 = true;
                                        r2Var.Z1 = 0.0f;
                                        j6.f20202u1.Q(0.0f, true);
                                        j6.f20202u1.start();
                                        r2Var.invalidate();
                                    }
                                }
                            }
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            myVar.h.A4(false, true);
                                            return;
                                        default:
                                            myVar.h.A4(false, true);
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
                        UndoView Y3 = oyVar.Y3();
                        if (Y3 != null) {
                            long j11 = dialog.f19188id;
                            if (z4) {
                                i12 = 2;
                            } else {
                                i12 = 3;
                            }
                            Y3.l(j11, i12, null, new ey(myVar, dialog, i14, 24));
                        }
                    }
                    if (oyVar.S2 != 0 && oyVar.O1.isEmpty()) {
                        nyVar.f36741a.setEmptyView(null);
                        nyVar.f36748w.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public b0(Object obj, Object obj2, int i10, int i11, int i12) {
        this.f8426a = i12;
        this.d = obj;
        this.e = obj2;
        this.f8427b = i10;
        this.f8428c = i11;
    }

    public b0(xn xnVar, int i10, int i11, Object[] objArr) {
        this.f8426a = 2;
        this.d = xnVar;
        this.f8427b = i10;
        this.f8428c = i11;
        this.e = objArr;
    }
}
