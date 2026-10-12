package i2;

import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.View;
import di.d4;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Cells.s2;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.fo;
import org.telegram.ui.gm;
import org.telegram.ui.im;
import org.telegram.ui.qn;
import org.telegram.ui.rm;
import org.telegram.ui.uy;
import org.telegram.ui.wy;
import org.telegram.ui.xy;
import org.telegram.ui.yy;
public final class z implements Runnable {
    public final int f11236a;
    public final int f11237b;
    public final int f11238c;
    public final Object d;
    public final Object e;

    public z(int i10, int i11, String str, String str2) {
        this.f11236a = 1;
        this.f11237b = i10;
        this.d = str;
        this.e = str2;
        this.f11238c = i11;
    }

    @Override
    public final void run() {
        int i10;
        int[] iArr;
        d4 d4Var;
        int i11;
        float f7;
        int i12;
        switch (this.f11236a) {
            case 0:
                h0 h0Var = ((b0) this.d).f10925a;
                Surface surface = new Surface((SurfaceTexture) this.e);
                h0Var.x1(surface);
                h0Var.U = surface;
                h0Var.q1(this.f11237b, this.f11238c);
                return;
            case 1:
                ConnectionsManager.lambda$onIntegrityCheckClassic$27(this.f11237b, (String) this.d, (String) this.e, this.f11238c);
                return;
            case 2:
                ((fo) this.d).didReceivedNotification(this.f11237b, this.f11238c, (Object[]) this.e);
                return;
            case 3:
                im imVar = (im) this.d;
                imVar.getClass();
                MessageObject messageObject = ((org.telegram.ui.Cells.x0) this.e).getMessageObject();
                rm rmVar = imVar.f37170a;
                fo foVar = rmVar.Q;
                int id2 = messageObject.getId();
                if (messageObject.getDialogId() == rmVar.Q.L6) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                foVar.bb(this.f11237b, id2, true, i10, true, 0, Integer.valueOf(this.f11238c), null, null);
                return;
            case 4:
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.e;
                fo foVar2 = ((qn) this.d).f39497a;
                if (foVar2.A1 != null) {
                    u1Var.getLocationInWindow(new int[2]);
                    foVar2.A1.setTranslationY(org.telegram.ui.Cells.d0.b(520.0f, iArr[1] - d4Var.getTop(), this.f11237b));
                    foVar2.A1.m(0.0f, (-AndroidUtilities.dp(16.0f)) + iArr[0] + this.f11238c);
                    foVar2.A1.u();
                    return;
                }
                return;
            default:
                final wy wyVar = (wy) this.d;
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.e;
                xy xyVar = wyVar.f41693g;
                yy yyVar = wyVar.h;
                ArrayList arrayList = yyVar.R1;
                if (arrayList != null) {
                    arrayList.remove(dialog);
                    int i13 = dialog.pinnedNum;
                    yyVar.W0 = null;
                    xyVar.f41980a.invalidate();
                    int N0 = xyVar.f41982c.N0();
                    if (N0 == this.f11237b - 1) {
                        xyVar.f41982c.m(N0).requestLayout();
                    }
                    boolean z10 = false;
                    if (yyVar.getMessagesController().isPromoDialog(dialog.f19220id, false)) {
                        yyVar.getMessagesController().hidePromoDialog();
                        xyVar.f41988x.D();
                        xyVar.q(true);
                        return;
                    }
                    MessagesController messagesController = yyVar.getMessagesController();
                    long j10 = dialog.f19220id;
                    if (yyVar.V2 == 0) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    int addDialogToFolder = messagesController.addDialogToFolder(j10, i11, -1, 0L);
                    int i14 = this.f11238c;
                    int i15 = 2;
                    if (addDialogToFolder != 2 || i14 != 0) {
                        xyVar.f41988x.D();
                        xyVar.q(true);
                    }
                    if (yyVar.V2 == 0) {
                        if (addDialogToFolder == 2) {
                            if (SharedConfig.archiveHidden) {
                                SharedConfig.toggleArchiveHidden();
                            }
                            xyVar.f41988x.D();
                            if (i14 == 0) {
                                yyVar.x4(true, true);
                                xyVar.q(true);
                                yyVar.l3();
                            } else {
                                xyVar.q(true);
                                if (!SharedConfig.archiveHidden && xyVar.f41982c.L0() == 0) {
                                    yyVar.f42327e2 = true;
                                    uy uyVar = xyVar.f41980a;
                                    if (SharedConfig.useThreeLinesLayout) {
                                        f7 = 76.0f;
                                    } else {
                                        f7 = 70.0f;
                                    }
                                    uyVar.v0(0, -AndroidUtilities.dp(f7), null);
                                }
                            }
                            i12 = ((m2) yyVar).currentAccount;
                            yyVar.R1.add(0, (TLRPC.Dialog) yyVar.O3(i12, xyVar.f41986s, yyVar.V2, false).get(0));
                            xyVar.q(true);
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            wyVar.h.x4(false, true);
                                            return;
                                        default:
                                            wyVar.h.x4(false, true);
                                            return;
                                    }
                                }
                            }, 300L);
                        } else if (addDialogToFolder == 1) {
                            s4.b1 K = xyVar.f41980a.K(0);
                            if (K != null) {
                                View view = K.f44838a;
                                if (view instanceof s2) {
                                    s2 s2Var = (s2) view;
                                    if (s2Var.a2.f26625n == 2) {
                                        s2Var.f21809b2 = true;
                                        s2Var.f21814c2 = 0.0f;
                                        g6.f20211u1.T(0.0f, true);
                                        g6.f20211u1.start();
                                        s2Var.invalidate();
                                    }
                                }
                            }
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            wyVar.h.x4(false, true);
                                            return;
                                        default:
                                            wyVar.h.x4(false, true);
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
                        UndoView V3 = yyVar.V3();
                        if (V3 != null) {
                            long j11 = dialog.f19220id;
                            if (!z10) {
                                i15 = 3;
                            }
                            V3.l(j11, i15, null, new gm(wyVar, dialog, i13, 28));
                        }
                    }
                    if (yyVar.V2 != 0 && yyVar.R1.isEmpty()) {
                        xyVar.f41980a.setEmptyView(null);
                        xyVar.f41987w.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public z(Object obj, Object obj2, int i10, int i11, int i12) {
        this.f11236a = i12;
        this.d = obj;
        this.e = obj2;
        this.f11237b = i10;
        this.f11238c = i11;
    }

    public z(fo foVar, int i10, int i11, Object[] objArr) {
        this.f11236a = 2;
        this.d = foVar;
        this.f11237b = i10;
        this.f11238c = i11;
        this.e = objArr;
    }
}
