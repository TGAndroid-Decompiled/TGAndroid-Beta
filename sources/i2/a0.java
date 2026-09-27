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
import org.telegram.messenger.qk;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.s2;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.ym;
import org.telegram.ui.bm;
import org.telegram.ui.jn;
import org.telegram.ui.km;
import org.telegram.ui.py;
import org.telegram.ui.ry;
import org.telegram.ui.sy;
import org.telegram.ui.ty;
import org.telegram.ui.xn;
public final class a0 implements Runnable {
    public final int f10604a;
    public final int f10605b;
    public final int f10606c;
    public final Object d;
    public final Object e;

    public a0(int i10, int i11, String str, String str2) {
        this.f10604a = 1;
        this.f10605b = i10;
        this.d = str;
        this.e = str2;
        this.f10606c = i11;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        float f7;
        int i13;
        switch (this.f10604a) {
            case 0:
                f0 f0Var = ((c0) this.d).f10619a;
                Surface surface = new Surface((SurfaceTexture) this.e);
                f0Var.t1(surface);
                f0Var.S = surface;
                f0Var.m1(this.f10605b, this.f10606c);
                return;
            case 1:
                ConnectionsManager.lambda$onIntegrityCheckClassic$27(this.f10605b, (String) this.d, (String) this.e, this.f10606c);
                return;
            case 2:
                ((xn) this.d).didReceivedNotification(this.f10605b, this.f10606c, (Object[]) this.e);
                return;
            case 3:
                bm bmVar = (bm) this.d;
                bmVar.getClass();
                MessageObject messageObject = ((org.telegram.ui.Cells.w0) this.e).getMessageObject();
                km kmVar = bmVar.f32390a;
                xn xnVar = kmVar.Q;
                int id2 = messageObject.getId();
                if (messageObject.getDialogId() == kmVar.Q.L6) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                xnVar.Xa(this.f10605b, id2, true, i10, true, 0, Integer.valueOf(this.f10606c), null, null);
                return;
            case 4:
                u1 u1Var = (u1) this.e;
                xn xnVar2 = ((jn) this.d).f34766a;
                if (xnVar2.A1 != null) {
                    int[] iArr = new int[2];
                    u1Var.getLocationInWindow(iArr);
                    e4 e4Var = xnVar2.A1;
                    e4Var.setTranslationY(qk.D(520.0f, iArr[1] - e4Var.getTop(), this.f10605b));
                    xnVar2.A1.m(0.0f, (-AndroidUtilities.dp(16.0f)) + iArr[0] + this.f10606c);
                    xnVar2.A1.u();
                    return;
                }
                return;
            default:
                final ry ryVar = (ry) this.d;
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.e;
                sy syVar = ryVar.f37247g;
                ty tyVar = ryVar.h;
                ArrayList arrayList = tyVar.R1;
                if (arrayList != null) {
                    arrayList.remove(dialog);
                    int i14 = dialog.pinnedNum;
                    tyVar.W0 = null;
                    syVar.f37593a.invalidate();
                    int N0 = syVar.f37595c.N0();
                    if (N0 == this.f10605b - 1) {
                        syVar.f37595c.m(N0).requestLayout();
                    }
                    boolean z10 = false;
                    if (tyVar.getMessagesController().isPromoDialog(dialog.f18333id, false)) {
                        tyVar.getMessagesController().hidePromoDialog();
                        syVar.f37601x.D();
                        syVar.q(true);
                        return;
                    }
                    MessagesController messagesController = tyVar.getMessagesController();
                    long j3 = dialog.f18333id;
                    if (tyVar.V2 == 0) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    int addDialogToFolder = messagesController.addDialogToFolder(j3, i11, -1, 0L);
                    int i15 = this.f10606c;
                    if (addDialogToFolder != 2 || i15 != 0) {
                        syVar.f37601x.D();
                        syVar.q(true);
                    }
                    if (tyVar.V2 == 0) {
                        if (addDialogToFolder == 2) {
                            if (SharedConfig.archiveHidden) {
                                SharedConfig.toggleArchiveHidden();
                            }
                            syVar.f37601x.D();
                            if (i15 == 0) {
                                tyVar.J4(true, true);
                                syVar.q(true);
                                tyVar.x3();
                            } else {
                                syVar.q(true);
                                if (!SharedConfig.archiveHidden && syVar.f37595c.L0() == 0) {
                                    tyVar.f37978e2 = true;
                                    py pyVar = syVar.f37593a;
                                    if (SharedConfig.useThreeLinesLayout) {
                                        f7 = 76.0f;
                                    } else {
                                        f7 = 70.0f;
                                    }
                                    pyVar.w0(0, -AndroidUtilities.dp(f7), null);
                                }
                            }
                            i13 = ((o2) tyVar).currentAccount;
                            tyVar.R1.add(0, (TLRPC.Dialog) tyVar.a4(i13, syVar.f37599s, tyVar.V2, false).get(0));
                            syVar.q(true);
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            ryVar.h.J4(false, true);
                                            return;
                                        default:
                                            ryVar.h.J4(false, true);
                                            return;
                                    }
                                }
                            }, 300L);
                        } else if (addDialogToFolder == 1) {
                            s4.c1 L = syVar.f37593a.L(0);
                            if (L != null) {
                                View view = L.f43005a;
                                if (view instanceof s2) {
                                    s2 s2Var = (s2) view;
                                    if (s2Var.a2.f24765n == 2) {
                                        s2Var.f20929b2 = true;
                                        s2Var.f20934c2 = 0.0f;
                                        i6.f19367u1.T(0.0f, true);
                                        i6.f19367u1.start();
                                        s2Var.invalidate();
                                    }
                                }
                            }
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            ryVar.h.J4(false, true);
                                            return;
                                        default:
                                            ryVar.h.J4(false, true);
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
                        UndoView h42 = tyVar.h4();
                        if (h42 != null) {
                            long j10 = dialog.f18333id;
                            if (z10) {
                                i12 = 2;
                            } else {
                                i12 = 3;
                            }
                            h42.l(j10, i12, null, new ym(ryVar, dialog, i14, 26));
                        }
                    }
                    if (tyVar.V2 != 0 && tyVar.R1.isEmpty()) {
                        syVar.f37593a.setEmptyView(null);
                        syVar.f37600w.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public a0(Object obj, Object obj2, int i10, int i11, int i12) {
        this.f10604a = i12;
        this.d = obj;
        this.e = obj2;
        this.f10605b = i10;
        this.f10606c = i11;
    }

    public a0(xn xnVar, int i10, int i11, Object[] objArr) {
        this.f10604a = 2;
        this.d = xnVar;
        this.f10605b = i10;
        this.f10606c = i11;
        this.e = objArr;
    }
}
