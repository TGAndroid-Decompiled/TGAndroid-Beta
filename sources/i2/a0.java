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
import org.telegram.messenger.am;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Cells.s2;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.bl;
import org.telegram.ui.eo;
import org.telegram.ui.hm;
import org.telegram.ui.pn;
import org.telegram.ui.qm;
import org.telegram.ui.ry;
import org.telegram.ui.ty;
import org.telegram.ui.uy;
import org.telegram.ui.vy;
public final class a0 implements Runnable {
    public final int f11601a;
    public final int f11602b;
    public final int f11603c;
    public final Object d;
    public final Object f11604e;

    public a0(int i10, int i11, String str, String str2) {
        this.f11601a = 1;
        this.f11602b = i10;
        this.d = str;
        this.f11604e = str2;
        this.f11603c = i11;
    }

    @Override
    public final void run() {
        int i10;
        int[] iArr;
        d4 d4Var;
        int i11;
        float f7;
        int i12;
        switch (this.f11601a) {
            case 0:
                f0 f0Var = ((c0) this.d).f11618a;
                Surface surface = new Surface((SurfaceTexture) this.f11604e);
                f0Var.v1(surface);
                f0Var.S = surface;
                f0Var.o1(this.f11602b, this.f11603c);
                return;
            case 1:
                ConnectionsManager.lambda$onIntegrityCheckClassic$27(this.f11602b, (String) this.d, (String) this.f11604e, this.f11603c);
                return;
            case 2:
                ((eo) this.d).didReceivedNotification(this.f11602b, this.f11603c, (Object[]) this.f11604e);
                return;
            case 3:
                hm hmVar = (hm) this.d;
                hmVar.getClass();
                MessageObject messageObject = ((org.telegram.ui.Cells.w0) this.f11604e).getMessageObject();
                qm qmVar = hmVar.f38467a;
                eo eoVar = qmVar.Q;
                int id2 = messageObject.getId();
                if (messageObject.getDialogId() == qmVar.Q.L6) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                eoVar.bb(this.f11602b, id2, true, i10, true, 0, Integer.valueOf(this.f11603c), null, null);
                return;
            case 4:
                u1 u1Var = (u1) this.f11604e;
                eo eoVar2 = ((pn) this.d).f40998a;
                if (eoVar2.A1 != null) {
                    u1Var.getLocationInWindow(new int[2]);
                    eoVar2.A1.setTranslationY(am.D(520.0f, iArr[1] - d4Var.getTop(), this.f11602b));
                    eoVar2.A1.m(0.0f, (-AndroidUtilities.dp(16.0f)) + iArr[0] + this.f11603c);
                    eoVar2.A1.u();
                    return;
                }
                return;
            default:
                final ty tyVar = (ty) this.d;
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.f11604e;
                uy uyVar = tyVar.f42314g;
                vy vyVar = tyVar.h;
                ArrayList arrayList = vyVar.R1;
                if (arrayList != null) {
                    arrayList.remove(dialog);
                    int i13 = dialog.pinnedNum;
                    vyVar.W0 = null;
                    uyVar.f42611a.invalidate();
                    int N0 = uyVar.f42613c.N0();
                    if (N0 == this.f11602b - 1) {
                        uyVar.f42613c.m(N0).requestLayout();
                    }
                    boolean z10 = false;
                    if (vyVar.getMessagesController().isPromoDialog(dialog.f19806id, false)) {
                        vyVar.getMessagesController().hidePromoDialog();
                        uyVar.f42620x.D();
                        uyVar.q(true);
                        return;
                    }
                    MessagesController messagesController = vyVar.getMessagesController();
                    long j3 = dialog.f19806id;
                    if (vyVar.V2 == 0) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    int addDialogToFolder = messagesController.addDialogToFolder(j3, i11, -1, 0L);
                    int i14 = this.f11603c;
                    int i15 = 2;
                    if (addDialogToFolder != 2 || i14 != 0) {
                        uyVar.f42620x.D();
                        uyVar.q(true);
                    }
                    if (vyVar.V2 == 0) {
                        if (addDialogToFolder == 2) {
                            if (SharedConfig.archiveHidden) {
                                SharedConfig.toggleArchiveHidden();
                            }
                            uyVar.f42620x.D();
                            if (i14 == 0) {
                                vyVar.x4(true, true);
                                uyVar.q(true);
                                vyVar.l3();
                            } else {
                                uyVar.q(true);
                                if (!SharedConfig.archiveHidden && uyVar.f42613c.L0() == 0) {
                                    vyVar.f42905e2 = true;
                                    ry ryVar = uyVar.f42611a;
                                    if (SharedConfig.useThreeLinesLayout) {
                                        f7 = 76.0f;
                                    } else {
                                        f7 = 70.0f;
                                    }
                                    ryVar.v0(0, -AndroidUtilities.dp(f7), null);
                                }
                            }
                            i12 = ((m2) vyVar).currentAccount;
                            vyVar.R1.add(0, (TLRPC.Dialog) vyVar.O3(i12, uyVar.f42618s, vyVar.V2, false).get(0));
                            uyVar.q(true);
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            tyVar.h.x4(false, true);
                                            return;
                                        default:
                                            tyVar.h.x4(false, true);
                                            return;
                                    }
                                }
                            }, 300L);
                        } else if (addDialogToFolder == 1) {
                            s4.d1 K = uyVar.f42611a.K(0);
                            if (K != null) {
                                View view = K.f47889a;
                                if (view instanceof s2) {
                                    s2 s2Var = (s2) view;
                                    if (s2Var.a2.f27407n == 2) {
                                        s2Var.f22535b2 = true;
                                        s2Var.f22540c2 = 0.0f;
                                        h6.f20869u1.T(0.0f, true);
                                        h6.f20869u1.start();
                                        s2Var.invalidate();
                                    }
                                }
                            }
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            tyVar.h.x4(false, true);
                                            return;
                                        default:
                                            tyVar.h.x4(false, true);
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
                        UndoView V3 = vyVar.V3();
                        if (V3 != null) {
                            long j10 = dialog.f19806id;
                            if (!z10) {
                                i15 = 3;
                            }
                            V3.l(j10, i15, null, new bl(tyVar, dialog, i13, 27));
                        }
                    }
                    if (vyVar.V2 != 0 && vyVar.R1.isEmpty()) {
                        uyVar.f42611a.setEmptyView(null);
                        uyVar.f42619w.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public a0(Object obj, Object obj2, int i10, int i11, int i12) {
        this.f11601a = i12;
        this.d = obj;
        this.f11604e = obj2;
        this.f11602b = i10;
        this.f11603c = i11;
    }

    public a0(eo eoVar, int i10, int i11, Object[] objArr) {
        this.f11601a = 2;
        this.d = eoVar;
        this.f11602b = i10;
        this.f11603c = i11;
        this.f11604e = objArr;
    }
}
