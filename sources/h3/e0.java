package h3;

import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.View;
import java.util.ArrayList;
import kh.x3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.ll;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.ay;
import org.telegram.ui.bm;
import org.telegram.ui.cn;
import org.telegram.ui.cy;
import org.telegram.ui.dy;
import org.telegram.ui.qn;
import org.telegram.ui.rl;
import org.telegram.ui.tl;
import org.telegram.ui.yx;
public final class e0 implements Runnable {
    public final int f9380a;
    public final int f9381b;
    public final int f9382c;
    public final Object d;
    public final Object f9383e;

    public e0(int i9, int i10, String str, String str2) {
        this.f9380a = 1;
        this.f9381b = i9;
        this.d = str;
        this.f9383e = str2;
        this.f9382c = i10;
    }

    @Override
    public final void run() {
        int i9;
        int i10;
        int i11;
        float f10;
        int i12;
        switch (this.f9380a) {
            case 0:
                k0 k0Var = ((h0) this.d).f9440a;
                Surface surface = new Surface((SurfaceTexture) this.f9383e);
                k0Var.g0(surface);
                k0Var.S = surface;
                k0Var.a0(this.f9381b, this.f9382c);
                return;
            case 1:
                ConnectionsManager.lambda$onIntegrityCheckClassic$27(this.f9381b, (String) this.d, (String) this.f9383e, this.f9382c);
                return;
            case 2:
                ((qn) this.d).didReceivedNotification(this.f9381b, this.f9382c, (Object[]) this.f9383e);
                return;
            case 3:
                tl tlVar = (tl) this.d;
                tlVar.getClass();
                MessageObject messageObject = ((org.telegram.ui.Cells.w0) this.f9383e).getMessageObject();
                bm bmVar = tlVar.f43027a;
                qn qnVar = bmVar.M;
                int id2 = messageObject.getId();
                if (messageObject.getDialogId() == bmVar.M.H6) {
                    i9 = 1;
                } else {
                    i9 = 0;
                }
                qnVar.Xa(this.f9381b, id2, true, i9, true, 0, Integer.valueOf(this.f9382c), null, null);
                return;
            case 4:
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f9383e;
                qn qnVar2 = ((cn) this.d).f37236a;
                if (qnVar2.f42115w1 != null) {
                    int[] iArr = new int[2];
                    t1Var.getLocationInWindow(iArr);
                    x3 x3Var = qnVar2.f42115w1;
                    x3Var.setTranslationY(ll.D(520.0f, iArr[1] - x3Var.getTop(), this.f9381b));
                    qnVar2.f42115w1.n(0.0f, (-AndroidUtilities.dp(16.0f)) + iArr[0] + this.f9382c);
                    qnVar2.f42115w1.v();
                    return;
                }
                return;
            default:
                final ay ayVar = (ay) this.d;
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.f9383e;
                cy cyVar = ayVar.f36576g;
                dy dyVar = ayVar.h;
                ArrayList arrayList = dyVar.N1;
                if (arrayList != null) {
                    arrayList.remove(dialog);
                    int i13 = dialog.pinnedNum;
                    dyVar.S0 = null;
                    cyVar.f37350a.invalidate();
                    int N0 = cyVar.f37352c.N0();
                    if (N0 == this.f9381b - 1) {
                        cyVar.f37352c.m(N0).requestLayout();
                    }
                    boolean z10 = false;
                    if (dyVar.getMessagesController().isPromoDialog(dialog.f22384id, false)) {
                        dyVar.getMessagesController().hidePromoDialog();
                        cyVar.f37359x.D();
                        cyVar.q(true);
                        return;
                    }
                    MessagesController messagesController = dyVar.getMessagesController();
                    long j10 = dialog.f22384id;
                    if (dyVar.R2 == 0) {
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    int addDialogToFolder = messagesController.addDialogToFolder(j10, i10, -1, 0L);
                    int i14 = this.f9382c;
                    if (addDialogToFolder != 2 || i14 != 0) {
                        cyVar.f37359x.D();
                        cyVar.q(true);
                    }
                    if (dyVar.R2 == 0) {
                        if (addDialogToFolder == 2) {
                            if (SharedConfig.archiveHidden) {
                                SharedConfig.toggleArchiveHidden();
                            }
                            cyVar.f37359x.D();
                            if (i14 == 0) {
                                dyVar.A4(true, true);
                                cyVar.q(true);
                                dyVar.o3();
                            } else {
                                cyVar.q(true);
                                if (!SharedConfig.archiveHidden && cyVar.f37352c.L0() == 0) {
                                    dyVar.a2 = true;
                                    yx yxVar = cyVar.f37350a;
                                    if (SharedConfig.useThreeLinesLayout) {
                                        f10 = 76.0f;
                                    } else {
                                        f10 = 70.0f;
                                    }
                                    yxVar.v0(0, -AndroidUtilities.dp(f10), null);
                                }
                            }
                            i12 = ((org.telegram.ui.ActionBar.o2) dyVar).currentAccount;
                            dyVar.N1.add(0, (TLRPC.Dialog) dyVar.R3(i12, cyVar.f37357s, dyVar.R2, false).get(0));
                            cyVar.q(true);
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            ayVar.h.A4(false, true);
                                            return;
                                        default:
                                            ayVar.h.A4(false, true);
                                            return;
                                    }
                                }
                            }, 300L);
                        } else if (addDialogToFolder == 1) {
                            f2.q1 K = cyVar.f37350a.K(0);
                            if (K != null) {
                                View view = K.f5501a;
                                if (view instanceof org.telegram.ui.Cells.r2) {
                                    org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
                                    if (r2Var.W1.f35232n == 2) {
                                        r2Var.X1 = true;
                                        r2Var.Y1 = 0.0f;
                                        f6.f23298u1.Q(0.0f, true);
                                        f6.f23298u1.start();
                                        r2Var.invalidate();
                                    }
                                }
                            }
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            ayVar.h.A4(false, true);
                                            return;
                                        default:
                                            ayVar.h.A4(false, true);
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
                        UndoView Y3 = dyVar.Y3();
                        if (Y3 != null) {
                            long j11 = dialog.f22384id;
                            if (z10) {
                                i11 = 2;
                            } else {
                                i11 = 3;
                            }
                            Y3.l(j11, i11, null, new rl(ayVar, dialog, i13, 27));
                        }
                    }
                    if (dyVar.R2 != 0 && dyVar.N1.isEmpty()) {
                        cyVar.f37350a.setEmptyView(null);
                        cyVar.f37358w.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public e0(Object obj, Object obj2, int i9, int i10, int i11) {
        this.f9380a = i11;
        this.d = obj;
        this.f9383e = obj2;
        this.f9381b = i9;
        this.f9382c = i10;
    }

    public e0(qn qnVar, int i9, int i10, Object[] objArr) {
        this.f9380a = 2;
        this.d = qnVar;
        this.f9381b = i9;
        this.f9382c = i10;
        this.f9383e = objArr;
    }
}
