package i2;

import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.View;
import ci.d4;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.bi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.s2;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.zk;
import org.telegram.ui.dm;
import org.telegram.ui.ln;
import org.telegram.ui.mm;
import org.telegram.ui.py;
import org.telegram.ui.ry;
import org.telegram.ui.sy;
import org.telegram.ui.ty;
import org.telegram.ui.zn;
public final class a0 implements Runnable {
    public final int f11603a;
    public final int f11604b;
    public final int f11605c;
    public final Object d;
    public final Object f11606e;

    public a0(int i10, int i11, String str, String str2) {
        this.f11603a = 1;
        this.f11604b = i10;
        this.d = str;
        this.f11606e = str2;
        this.f11605c = i11;
    }

    @Override
    public final void run() {
        int i10;
        int[] iArr;
        d4 d4Var;
        int i11;
        float f7;
        int i12;
        switch (this.f11603a) {
            case 0:
                f0 f0Var = ((c0) this.d).f11620a;
                Surface surface = new Surface((SurfaceTexture) this.f11606e);
                f0Var.v1(surface);
                f0Var.S = surface;
                f0Var.o1(this.f11604b, this.f11605c);
                return;
            case 1:
                ConnectionsManager.lambda$onIntegrityCheckClassic$27(this.f11604b, (String) this.d, (String) this.f11606e, this.f11605c);
                return;
            case 2:
                ((zn) this.d).didReceivedNotification(this.f11604b, this.f11605c, (Object[]) this.f11606e);
                return;
            case 3:
                dm dmVar = (dm) this.d;
                dmVar.getClass();
                MessageObject messageObject = ((org.telegram.ui.Cells.w0) this.f11606e).getMessageObject();
                mm mmVar = dmVar.f37094a;
                zn znVar = mmVar.Q;
                int id2 = messageObject.getId();
                if (messageObject.getDialogId() == mmVar.Q.L6) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                znVar.bb(this.f11604b, id2, true, i10, true, 0, Integer.valueOf(this.f11605c), null, null);
                return;
            case 4:
                u1 u1Var = (u1) this.f11606e;
                zn znVar2 = ((ln) this.d).f39680a;
                if (znVar2.A1 != null) {
                    u1Var.getLocationInWindow(new int[2]);
                    znVar2.A1.setTranslationY(bi.D(520.0f, iArr[1] - d4Var.getTop(), this.f11604b));
                    znVar2.A1.m(0.0f, (-AndroidUtilities.dp(16.0f)) + iArr[0] + this.f11605c);
                    znVar2.A1.u();
                    return;
                }
                return;
            default:
                final ry ryVar = (ry) this.d;
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.f11606e;
                sy syVar = ryVar.f41585g;
                ty tyVar = ryVar.h;
                ArrayList arrayList = tyVar.R1;
                if (arrayList != null) {
                    arrayList.remove(dialog);
                    int i13 = dialog.pinnedNum;
                    tyVar.W0 = null;
                    syVar.f41834a.invalidate();
                    int N0 = syVar.f41836c.N0();
                    if (N0 == this.f11604b - 1) {
                        syVar.f41836c.m(N0).requestLayout();
                    }
                    boolean z10 = false;
                    if (tyVar.getMessagesController().isPromoDialog(dialog.f20046id, false)) {
                        tyVar.getMessagesController().hidePromoDialog();
                        syVar.f41843x.D();
                        syVar.q(true);
                        return;
                    }
                    MessagesController messagesController = tyVar.getMessagesController();
                    long j3 = dialog.f20046id;
                    if (tyVar.V2 == 0) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    int addDialogToFolder = messagesController.addDialogToFolder(j3, i11, -1, 0L);
                    int i14 = this.f11605c;
                    int i15 = 2;
                    if (addDialogToFolder != 2 || i14 != 0) {
                        syVar.f41843x.D();
                        syVar.q(true);
                    }
                    if (tyVar.V2 == 0) {
                        if (addDialogToFolder == 2) {
                            if (SharedConfig.archiveHidden) {
                                SharedConfig.toggleArchiveHidden();
                            }
                            syVar.f41843x.D();
                            if (i14 == 0) {
                                tyVar.x4(true, true);
                                syVar.q(true);
                                tyVar.l3();
                            } else {
                                syVar.q(true);
                                if (!SharedConfig.archiveHidden && syVar.f41836c.L0() == 0) {
                                    tyVar.f42220e2 = true;
                                    py pyVar = syVar.f41834a;
                                    if (SharedConfig.useThreeLinesLayout) {
                                        f7 = 76.0f;
                                    } else {
                                        f7 = 70.0f;
                                    }
                                    pyVar.v0(0, -AndroidUtilities.dp(f7), null);
                                }
                            }
                            i12 = ((n2) tyVar).currentAccount;
                            tyVar.R1.add(0, (TLRPC.Dialog) tyVar.O3(i12, syVar.f41841s, tyVar.V2, false).get(0));
                            syVar.q(true);
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            ryVar.h.x4(false, true);
                                            return;
                                        default:
                                            ryVar.h.x4(false, true);
                                            return;
                                    }
                                }
                            }, 300L);
                        } else if (addDialogToFolder == 1) {
                            s4.d1 K = syVar.f41834a.K(0);
                            if (K != null) {
                                View view = K.f47702a;
                                if (view instanceof s2) {
                                    s2 s2Var = (s2) view;
                                    if (s2Var.a2.f27606n == 2) {
                                        s2Var.f22776b2 = true;
                                        s2Var.f22781c2 = 0.0f;
                                        i6.f21109u1.T(0.0f, true);
                                        i6.f21109u1.start();
                                        s2Var.invalidate();
                                    }
                                }
                            }
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            ryVar.h.x4(false, true);
                                            return;
                                        default:
                                            ryVar.h.x4(false, true);
                                            return;
                                    }
                                }
                            }, 300L);
                        }
                        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                        if (globalMainSettings.getBoolean("archivehint_l", false) || SharedConfig.archiveHidden) {
                            z10 = true;
                        }
                        if (!z10) {
                            globalMainSettings.edit().putBoolean("archivehint_l", true).commit();
                        }
                        UndoView V3 = tyVar.V3();
                        if (V3 != null) {
                            long j10 = dialog.f20046id;
                            if (!z10) {
                                i15 = 3;
                            }
                            V3.l(j10, i15, null, new zk(ryVar, dialog, i13, 27));
                        }
                    }
                    if (tyVar.V2 != 0 && tyVar.R1.isEmpty()) {
                        syVar.f41834a.setEmptyView(null);
                        syVar.f41842w.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public a0(Object obj, Object obj2, int i10, int i11, int i12) {
        this.f11603a = i12;
        this.d = obj;
        this.f11606e = obj2;
        this.f11604b = i10;
        this.f11605c = i11;
    }

    public a0(zn znVar, int i10, int i11, Object[] objArr) {
        this.f11603a = 2;
        this.d = znVar;
        this.f11604b = i10;
        this.f11605c = i11;
        this.f11606e = objArr;
    }
}
