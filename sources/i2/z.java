package i2;

import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.View;
import ci.f4;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.vl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.wm;
import org.telegram.ui.bo;
import org.telegram.ui.em;
import org.telegram.ui.nm;
import org.telegram.ui.nn;
import org.telegram.ui.qy;
import org.telegram.ui.sy;
import org.telegram.ui.ty;
import org.telegram.ui.uy;
public final class z implements Runnable {
    public final int f10923a;
    public final int f10924b;
    public final int f10925c;
    public final Object d;
    public final Object e;

    public z(int i10, int i11, String str, String str2) {
        this.f10923a = 1;
        this.f10924b = i10;
        this.d = str;
        this.e = str2;
        this.f10925c = i11;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        float f7;
        int i13;
        switch (this.f10923a) {
            case 0:
                e0 e0Var = ((b0) this.d).f10623a;
                Surface surface = new Surface((SurfaceTexture) this.e);
                e0Var.t1(surface);
                e0Var.S = surface;
                e0Var.m1(this.f10924b, this.f10925c);
                return;
            case 1:
                ConnectionsManager.lambda$onIntegrityCheckClassic$27(this.f10924b, (String) this.d, (String) this.e, this.f10925c);
                return;
            case 2:
                ((bo) this.d).didReceivedNotification(this.f10924b, this.f10925c, (Object[]) this.e);
                return;
            case 3:
                em emVar = (em) this.d;
                emVar.getClass();
                MessageObject messageObject = ((org.telegram.ui.Cells.w0) this.e).getMessageObject();
                nm nmVar = emVar.f33375a;
                bo boVar = nmVar.Q;
                int id2 = messageObject.getId();
                if (messageObject.getDialogId() == nmVar.Q.L6) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                boVar.Xa(this.f10924b, id2, true, i10, true, 0, Integer.valueOf(this.f10925c), null, null);
                return;
            case 4:
                t1 t1Var = (t1) this.e;
                bo boVar2 = ((nn) this.d).f36017a;
                if (boVar2.A1 != null) {
                    int[] iArr = new int[2];
                    t1Var.getLocationInWindow(iArr);
                    f4 f4Var = boVar2.A1;
                    f4Var.setTranslationY(vl.D(520.0f, iArr[1] - f4Var.getTop(), this.f10924b));
                    boVar2.A1.m(0.0f, (-AndroidUtilities.dp(16.0f)) + iArr[0] + this.f10925c);
                    boVar2.A1.u();
                    return;
                }
                return;
            default:
                final sy syVar = (sy) this.d;
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.e;
                ty tyVar = syVar.f37507g;
                uy uyVar = syVar.h;
                ArrayList arrayList = uyVar.R1;
                if (arrayList != null) {
                    arrayList.remove(dialog);
                    int i14 = dialog.pinnedNum;
                    uyVar.W0 = null;
                    tyVar.f37752a.invalidate();
                    int N0 = tyVar.f37754c.N0();
                    if (N0 == this.f10924b - 1) {
                        tyVar.f37754c.m(N0).requestLayout();
                    }
                    boolean z10 = false;
                    if (uyVar.getMessagesController().isPromoDialog(dialog.f18113id, false)) {
                        uyVar.getMessagesController().hidePromoDialog();
                        tyVar.f37760x.D();
                        tyVar.q(true);
                        return;
                    }
                    MessagesController messagesController = uyVar.getMessagesController();
                    long j3 = dialog.f18113id;
                    if (uyVar.V2 == 0) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    int addDialogToFolder = messagesController.addDialogToFolder(j3, i11, -1, 0L);
                    int i15 = this.f10925c;
                    if (addDialogToFolder != 2 || i15 != 0) {
                        tyVar.f37760x.D();
                        tyVar.q(true);
                    }
                    if (uyVar.V2 == 0) {
                        if (addDialogToFolder == 2) {
                            if (SharedConfig.archiveHidden) {
                                SharedConfig.toggleArchiveHidden();
                            }
                            tyVar.f37760x.D();
                            if (i15 == 0) {
                                uyVar.A4(true, true);
                                tyVar.q(true);
                                uyVar.o3();
                            } else {
                                tyVar.q(true);
                                if (!SharedConfig.archiveHidden && tyVar.f37754c.L0() == 0) {
                                    uyVar.f38224e2 = true;
                                    qy qyVar = tyVar.f37752a;
                                    if (SharedConfig.useThreeLinesLayout) {
                                        f7 = 76.0f;
                                    } else {
                                        f7 = 70.0f;
                                    }
                                    qyVar.v0(0, -AndroidUtilities.dp(f7), null);
                                }
                            }
                            i13 = ((n2) uyVar).currentAccount;
                            uyVar.R1.add(0, (TLRPC.Dialog) uyVar.R3(i13, tyVar.f37758s, uyVar.V2, false).get(0));
                            tyVar.q(true);
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            syVar.h.A4(false, true);
                                            return;
                                        default:
                                            syVar.h.A4(false, true);
                                            return;
                                    }
                                }
                            }, 300L);
                        } else if (addDialogToFolder == 1) {
                            s4.c1 K = tyVar.f37752a.K(0);
                            if (K != null) {
                                View view = K.f42671a;
                                if (view instanceof r2) {
                                    r2 r2Var = (r2) view;
                                    if (r2Var.a2.f23864n == 2) {
                                        r2Var.f20663b2 = true;
                                        r2Var.f20668c2 = 0.0f;
                                        i6.f19140u1.T(0.0f, true);
                                        i6.f19140u1.start();
                                        r2Var.invalidate();
                                    }
                                }
                            }
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            syVar.h.A4(false, true);
                                            return;
                                        default:
                                            syVar.h.A4(false, true);
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
                        UndoView Y3 = uyVar.Y3();
                        if (Y3 != null) {
                            long j10 = dialog.f18113id;
                            if (z10) {
                                i12 = 2;
                            } else {
                                i12 = 3;
                            }
                            Y3.l(j10, i12, null, new wm(syVar, dialog, i14, 26));
                        }
                    }
                    if (uyVar.V2 != 0 && uyVar.R1.isEmpty()) {
                        tyVar.f37752a.setEmptyView(null);
                        tyVar.f37759w.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public z(Object obj, Object obj2, int i10, int i11, int i12) {
        this.f10923a = i12;
        this.d = obj;
        this.e = obj2;
        this.f10924b = i10;
        this.f10925c = i11;
    }

    public z(bo boVar, int i10, int i11, Object[] objArr) {
        this.f10923a = 2;
        this.d = boVar;
        this.f10924b = i10;
        this.f10925c = i11;
        this.e = objArr;
    }
}
