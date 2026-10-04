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
import org.telegram.messenger.bi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.s2;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.zm;
import org.telegram.ui.am;
import org.telegram.ui.jm;
import org.telegram.ui.kn;
import org.telegram.ui.qy;
import org.telegram.ui.sy;
import org.telegram.ui.ty;
import org.telegram.ui.uy;
import org.telegram.ui.yn;
public final class a0 implements Runnable {
    public final int f11553a;
    public final int f11554b;
    public final int f11555c;
    public final Object d;
    public final Object f11556e;

    public a0(int i10, int i11, String str, String str2) {
        this.f11553a = 1;
        this.f11554b = i10;
        this.d = str;
        this.f11556e = str2;
        this.f11555c = i11;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        float f7;
        int i13;
        switch (this.f11553a) {
            case 0:
                f0 f0Var = ((c0) this.d).f11570a;
                Surface surface = new Surface((SurfaceTexture) this.f11556e);
                f0Var.t1(surface);
                f0Var.S = surface;
                f0Var.m1(this.f11554b, this.f11555c);
                return;
            case 1:
                ConnectionsManager.lambda$onIntegrityCheckClassic$27(this.f11554b, (String) this.d, (String) this.f11556e, this.f11555c);
                return;
            case 2:
                ((yn) this.d).didReceivedNotification(this.f11554b, this.f11555c, (Object[]) this.f11556e);
                return;
            case 3:
                am amVar = (am) this.d;
                amVar.getClass();
                MessageObject messageObject = ((org.telegram.ui.Cells.w0) this.f11556e).getMessageObject();
                jm jmVar = amVar.f34867a;
                yn ynVar = jmVar.Q;
                int id2 = messageObject.getId();
                if (messageObject.getDialogId() == jmVar.Q.J6) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                ynVar.Wa(this.f11554b, id2, true, i10, true, 0, Integer.valueOf(this.f11555c), null, null);
                return;
            case 4:
                u1 u1Var = (u1) this.f11556e;
                yn ynVar2 = ((kn) this.d).f38008a;
                if (ynVar2.f43573y1 != null) {
                    int[] iArr = new int[2];
                    u1Var.getLocationInWindow(iArr);
                    e4 e4Var = ynVar2.f43573y1;
                    e4Var.setTranslationY(bi.D(520.0f, iArr[1] - e4Var.getTop(), this.f11554b));
                    ynVar2.f43573y1.m(0.0f, (-AndroidUtilities.dp(16.0f)) + iArr[0] + this.f11555c);
                    ynVar2.f43573y1.u();
                    return;
                }
                return;
            default:
                final sy syVar = (sy) this.d;
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.f11556e;
                ty tyVar = syVar.f40638g;
                uy uyVar = syVar.h;
                ArrayList arrayList = uyVar.R1;
                if (arrayList != null) {
                    arrayList.remove(dialog);
                    int i14 = dialog.pinnedNum;
                    uyVar.W0 = null;
                    tyVar.f40990a.invalidate();
                    int N0 = tyVar.f40992c.N0();
                    if (N0 == this.f11554b - 1) {
                        tyVar.f40992c.m(N0).requestLayout();
                    }
                    boolean z10 = false;
                    if (uyVar.getMessagesController().isPromoDialog(dialog.f20046id, false)) {
                        uyVar.getMessagesController().hidePromoDialog();
                        tyVar.f40999x.D();
                        tyVar.q(true);
                        return;
                    }
                    MessagesController messagesController = uyVar.getMessagesController();
                    long j3 = dialog.f20046id;
                    if (uyVar.V2 == 0) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    int addDialogToFolder = messagesController.addDialogToFolder(j3, i11, -1, 0L);
                    int i15 = this.f11555c;
                    if (addDialogToFolder != 2 || i15 != 0) {
                        tyVar.f40999x.D();
                        tyVar.q(true);
                    }
                    if (uyVar.V2 == 0) {
                        if (addDialogToFolder == 2) {
                            if (SharedConfig.archiveHidden) {
                                SharedConfig.toggleArchiveHidden();
                            }
                            tyVar.f40999x.D();
                            if (i15 == 0) {
                                uyVar.J4(true, true);
                                tyVar.q(true);
                                uyVar.x3();
                            } else {
                                tyVar.q(true);
                                if (!SharedConfig.archiveHidden && tyVar.f40992c.L0() == 0) {
                                    uyVar.f41402e2 = true;
                                    qy qyVar = tyVar.f40990a;
                                    if (SharedConfig.useThreeLinesLayout) {
                                        f7 = 76.0f;
                                    } else {
                                        f7 = 70.0f;
                                    }
                                    qyVar.w0(0, -AndroidUtilities.dp(f7), null);
                                }
                            }
                            i13 = ((n2) uyVar).currentAccount;
                            uyVar.R1.add(0, (TLRPC.Dialog) uyVar.a4(i13, tyVar.f40997s, uyVar.V2, false).get(0));
                            tyVar.q(true);
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            syVar.h.J4(false, true);
                                            return;
                                        default:
                                            syVar.h.J4(false, true);
                                            return;
                                    }
                                }
                            }, 300L);
                        } else if (addDialogToFolder == 1) {
                            s4.c1 K = tyVar.f40990a.K(0);
                            if (K != null) {
                                View view = K.f46531a;
                                if (view instanceof s2) {
                                    s2 s2Var = (s2) view;
                                    if (s2Var.a2.f27060n == 2) {
                                        s2Var.f22780b2 = true;
                                        s2Var.f22785c2 = 0.0f;
                                        i6.f21134u1.T(0.0f, true);
                                        i6.f21134u1.start();
                                        s2Var.invalidate();
                                    }
                                }
                            }
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            syVar.h.J4(false, true);
                                            return;
                                        default:
                                            syVar.h.J4(false, true);
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
                        UndoView h42 = uyVar.h4();
                        if (h42 != null) {
                            long j10 = dialog.f20046id;
                            if (z10) {
                                i12 = 2;
                            } else {
                                i12 = 3;
                            }
                            h42.l(j10, i12, null, new zm(syVar, dialog, i14, 26));
                        }
                    }
                    if (uyVar.V2 != 0 && uyVar.R1.isEmpty()) {
                        tyVar.f40990a.setEmptyView(null);
                        tyVar.f40998w.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public a0(Object obj, Object obj2, int i10, int i11, int i12) {
        this.f11553a = i12;
        this.d = obj;
        this.f11556e = obj2;
        this.f11554b = i10;
        this.f11555c = i11;
    }

    public a0(yn ynVar, int i10, int i11, Object[] objArr) {
        this.f11553a = 2;
        this.d = ynVar;
        this.f11554b = i10;
        this.f11555c = i11;
        this.f11556e = objArr;
    }
}
