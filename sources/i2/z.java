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
import org.telegram.messenger.rk;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.s2;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.wm;
import org.telegram.ui.cm;
import org.telegram.ui.lm;
import org.telegram.ui.ln;
import org.telegram.ui.qy;
import org.telegram.ui.sy;
import org.telegram.ui.ty;
import org.telegram.ui.uy;
import org.telegram.ui.zn;
public final class z implements Runnable {
    public final int f10925a;
    public final int f10926b;
    public final int f10927c;
    public final Object d;
    public final Object e;

    public z(int i10, int i11, String str, String str2) {
        this.f10925a = 1;
        this.f10926b = i10;
        this.d = str;
        this.e = str2;
        this.f10927c = i11;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        float f7;
        int i13;
        switch (this.f10925a) {
            case 0:
                e0 e0Var = ((b0) this.d).f10625a;
                Surface surface = new Surface((SurfaceTexture) this.e);
                e0Var.t1(surface);
                e0Var.S = surface;
                e0Var.m1(this.f10926b, this.f10927c);
                return;
            case 1:
                ConnectionsManager.lambda$onIntegrityCheckClassic$27(this.f10926b, (String) this.d, (String) this.e, this.f10927c);
                return;
            case 2:
                ((zn) this.d).didReceivedNotification(this.f10926b, this.f10927c, (Object[]) this.e);
                return;
            case 3:
                cm cmVar = (cm) this.d;
                cmVar.getClass();
                MessageObject messageObject = ((org.telegram.ui.Cells.w0) this.e).getMessageObject();
                lm lmVar = cmVar.f32788a;
                zn znVar = lmVar.Q;
                int id2 = messageObject.getId();
                if (messageObject.getDialogId() == lmVar.Q.L6) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                znVar.Xa(this.f10926b, id2, true, i10, true, 0, Integer.valueOf(this.f10927c), null, null);
                return;
            case 4:
                u1 u1Var = (u1) this.e;
                zn znVar2 = ((ln) this.d).f35482a;
                if (znVar2.A1 != null) {
                    int[] iArr = new int[2];
                    u1Var.getLocationInWindow(iArr);
                    f4 f4Var = znVar2.A1;
                    f4Var.setTranslationY(rk.D(520.0f, iArr[1] - f4Var.getTop(), this.f10926b));
                    znVar2.A1.m(0.0f, (-AndroidUtilities.dp(16.0f)) + iArr[0] + this.f10927c);
                    znVar2.A1.u();
                    return;
                }
                return;
            default:
                final sy syVar = (sy) this.d;
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.e;
                ty tyVar = syVar.f37569g;
                uy uyVar = syVar.h;
                ArrayList arrayList = uyVar.R1;
                if (arrayList != null) {
                    arrayList.remove(dialog);
                    int i14 = dialog.pinnedNum;
                    uyVar.W0 = null;
                    tyVar.f37904a.invalidate();
                    int N0 = tyVar.f37906c.N0();
                    if (N0 == this.f10926b - 1) {
                        tyVar.f37906c.m(N0).requestLayout();
                    }
                    boolean z10 = false;
                    if (uyVar.getMessagesController().isPromoDialog(dialog.f18332id, false)) {
                        uyVar.getMessagesController().hidePromoDialog();
                        tyVar.f37912x.D();
                        tyVar.q(true);
                        return;
                    }
                    MessagesController messagesController = uyVar.getMessagesController();
                    long j3 = dialog.f18332id;
                    if (uyVar.V2 == 0) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    int addDialogToFolder = messagesController.addDialogToFolder(j3, i11, -1, 0L);
                    int i15 = this.f10927c;
                    if (addDialogToFolder != 2 || i15 != 0) {
                        tyVar.f37912x.D();
                        tyVar.q(true);
                    }
                    if (uyVar.V2 == 0) {
                        if (addDialogToFolder == 2) {
                            if (SharedConfig.archiveHidden) {
                                SharedConfig.toggleArchiveHidden();
                            }
                            tyVar.f37912x.D();
                            if (i15 == 0) {
                                uyVar.A4(true, true);
                                tyVar.q(true);
                                uyVar.o3();
                            } else {
                                tyVar.q(true);
                                if (!SharedConfig.archiveHidden && tyVar.f37906c.L0() == 0) {
                                    uyVar.f38258e2 = true;
                                    qy qyVar = tyVar.f37904a;
                                    if (SharedConfig.useThreeLinesLayout) {
                                        f7 = 76.0f;
                                    } else {
                                        f7 = 70.0f;
                                    }
                                    qyVar.w0(0, -AndroidUtilities.dp(f7), null);
                                }
                            }
                            i13 = ((n2) uyVar).currentAccount;
                            uyVar.R1.add(0, (TLRPC.Dialog) uyVar.R3(i13, tyVar.f37910s, uyVar.V2, false).get(0));
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
                            s4.c1 L = tyVar.f37904a.L(0);
                            if (L != null) {
                                View view = L.f42974a;
                                if (view instanceof s2) {
                                    s2 s2Var = (s2) view;
                                    if (s2Var.a2.f24300n == 2) {
                                        s2Var.f20930b2 = true;
                                        s2Var.f20935c2 = 0.0f;
                                        j6.f19402u1.T(0.0f, true);
                                        j6.f19402u1.start();
                                        s2Var.invalidate();
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
                            long j10 = dialog.f18332id;
                            if (z10) {
                                i12 = 2;
                            } else {
                                i12 = 3;
                            }
                            Y3.l(j10, i12, null, new wm(syVar, dialog, i14, 26));
                        }
                    }
                    if (uyVar.V2 != 0 && uyVar.R1.isEmpty()) {
                        tyVar.f37904a.setEmptyView(null);
                        tyVar.f37911w.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public z(Object obj, Object obj2, int i10, int i11, int i12) {
        this.f10925a = i12;
        this.d = obj;
        this.e = obj2;
        this.f10926b = i10;
        this.f10927c = i11;
    }

    public z(zn znVar, int i10, int i11, Object[] objArr) {
        this.f10925a = 2;
        this.d = znVar;
        this.f10926b = i10;
        this.f10927c = i11;
        this.e = objArr;
    }
}
