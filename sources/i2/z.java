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
import org.telegram.messenger.wl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.wm;
import org.telegram.ui.bo;
import org.telegram.ui.em;
import org.telegram.ui.nm;
import org.telegram.ui.nn;
import org.telegram.ui.sy;
import org.telegram.ui.uy;
import org.telegram.ui.vy;
import org.telegram.ui.wy;
public final class z implements Runnable {
    public final int f10924a;
    public final int f10925b;
    public final int f10926c;
    public final Object d;
    public final Object e;

    public z(int i10, int i11, String str, String str2) {
        this.f10924a = 1;
        this.f10925b = i10;
        this.d = str;
        this.e = str2;
        this.f10926c = i11;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        float f7;
        int i13;
        switch (this.f10924a) {
            case 0:
                e0 e0Var = ((b0) this.d).f10624a;
                Surface surface = new Surface((SurfaceTexture) this.e);
                e0Var.t1(surface);
                e0Var.S = surface;
                e0Var.m1(this.f10925b, this.f10926c);
                return;
            case 1:
                ConnectionsManager.lambda$onIntegrityCheckClassic$27(this.f10925b, (String) this.d, (String) this.e, this.f10926c);
                return;
            case 2:
                ((bo) this.d).didReceivedNotification(this.f10925b, this.f10926c, (Object[]) this.e);
                return;
            case 3:
                em emVar = (em) this.d;
                emVar.getClass();
                MessageObject messageObject = ((org.telegram.ui.Cells.w0) this.e).getMessageObject();
                nm nmVar = emVar.f33445a;
                bo boVar = nmVar.Q;
                int id2 = messageObject.getId();
                if (messageObject.getDialogId() == nmVar.Q.L6) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                boVar.Xa(this.f10925b, id2, true, i10, true, 0, Integer.valueOf(this.f10926c), null, null);
                return;
            case 4:
                t1 t1Var = (t1) this.e;
                bo boVar2 = ((nn) this.d).f36139a;
                if (boVar2.A1 != null) {
                    int[] iArr = new int[2];
                    t1Var.getLocationInWindow(iArr);
                    f4 f4Var = boVar2.A1;
                    f4Var.setTranslationY(wl.D(520.0f, iArr[1] - f4Var.getTop(), this.f10925b));
                    boVar2.A1.m(0.0f, (-AndroidUtilities.dp(16.0f)) + iArr[0] + this.f10926c);
                    boVar2.A1.u();
                    return;
                }
                return;
            default:
                final uy uyVar = (uy) this.d;
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.e;
                vy vyVar = uyVar.f38247g;
                wy wyVar = uyVar.h;
                ArrayList arrayList = wyVar.R1;
                if (arrayList != null) {
                    arrayList.remove(dialog);
                    int i14 = dialog.pinnedNum;
                    wyVar.W0 = null;
                    vyVar.f38527a.invalidate();
                    int N0 = vyVar.f38529c.N0();
                    if (N0 == this.f10925b - 1) {
                        vyVar.f38529c.m(N0).requestLayout();
                    }
                    boolean z10 = false;
                    if (wyVar.getMessagesController().isPromoDialog(dialog.f18125id, false)) {
                        wyVar.getMessagesController().hidePromoDialog();
                        vyVar.f38535x.D();
                        vyVar.q(true);
                        return;
                    }
                    MessagesController messagesController = wyVar.getMessagesController();
                    long j3 = dialog.f18125id;
                    if (wyVar.V2 == 0) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    int addDialogToFolder = messagesController.addDialogToFolder(j3, i11, -1, 0L);
                    int i15 = this.f10926c;
                    if (addDialogToFolder != 2 || i15 != 0) {
                        vyVar.f38535x.D();
                        vyVar.q(true);
                    }
                    if (wyVar.V2 == 0) {
                        if (addDialogToFolder == 2) {
                            if (SharedConfig.archiveHidden) {
                                SharedConfig.toggleArchiveHidden();
                            }
                            vyVar.f38535x.D();
                            if (i15 == 0) {
                                wyVar.A4(true, true);
                                vyVar.q(true);
                                wyVar.o3();
                            } else {
                                vyVar.q(true);
                                if (!SharedConfig.archiveHidden && vyVar.f38529c.L0() == 0) {
                                    wyVar.f39223e2 = true;
                                    sy syVar = vyVar.f38527a;
                                    if (SharedConfig.useThreeLinesLayout) {
                                        f7 = 76.0f;
                                    } else {
                                        f7 = 70.0f;
                                    }
                                    syVar.w0(0, -AndroidUtilities.dp(f7), null);
                                }
                            }
                            i13 = ((o2) wyVar).currentAccount;
                            wyVar.R1.add(0, (TLRPC.Dialog) wyVar.R3(i13, vyVar.f38533s, wyVar.V2, false).get(0));
                            vyVar.q(true);
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            uyVar.h.A4(false, true);
                                            return;
                                        default:
                                            uyVar.h.A4(false, true);
                                            return;
                                    }
                                }
                            }, 300L);
                        } else if (addDialogToFolder == 1) {
                            s4.c1 L = vyVar.f38527a.L(0);
                            if (L != null) {
                                View view = L.f42702a;
                                if (view instanceof r2) {
                                    r2 r2Var = (r2) view;
                                    if (r2Var.a2.f23837n == 2) {
                                        r2Var.f20676b2 = true;
                                        r2Var.f20681c2 = 0.0f;
                                        j6.f19170u1.T(0.0f, true);
                                        j6.f19170u1.start();
                                        r2Var.invalidate();
                                    }
                                }
                            }
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            uyVar.h.A4(false, true);
                                            return;
                                        default:
                                            uyVar.h.A4(false, true);
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
                        UndoView Y3 = wyVar.Y3();
                        if (Y3 != null) {
                            long j10 = dialog.f18125id;
                            if (z10) {
                                i12 = 2;
                            } else {
                                i12 = 3;
                            }
                            Y3.l(j10, i12, null, new wm(uyVar, dialog, i14, 26));
                        }
                    }
                    if (wyVar.V2 != 0 && wyVar.R1.isEmpty()) {
                        vyVar.f38527a.setEmptyView(null);
                        vyVar.f38534w.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public z(Object obj, Object obj2, int i10, int i11, int i12) {
        this.f10924a = i12;
        this.d = obj;
        this.e = obj2;
        this.f10925b = i10;
        this.f10926c = i11;
    }

    public z(bo boVar, int i10, int i11, Object[] objArr) {
        this.f10924a = 2;
        this.d = boVar;
        this.f10925b = i10;
        this.f10926c = i11;
        this.e = objArr;
    }
}
