package i2;

import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.View;
import fi.v3;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.p2;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.cy;
import org.telegram.ui.d3;
import org.telegram.ui.dy;
import org.telegram.ui.ey;
import org.telegram.ui.fx;
import org.telegram.ui.hm;
import org.telegram.ui.hn;
import org.telegram.ui.wn;
import org.telegram.ui.yl;
import org.telegram.ui.zx;
public final class b0 implements Runnable {
    public final int f13499a;
    public final int f13500b;
    public final int f13501c;
    public final Object d;
    public final Object e;

    public b0(int i10, int i11, String str, String str2) {
        this.f13499a = 1;
        this.f13500b = i10;
        this.d = str;
        this.e = str2;
        this.f13501c = i11;
    }

    @Override
    public final void run() {
        int i10;
        int[] iArr;
        v3 v3Var;
        int i11;
        float f7;
        int i12;
        switch (this.f13499a) {
            case 0:
                j0 j0Var = ((d0) this.d).f13508a;
                Surface surface = new Surface((SurfaceTexture) this.e);
                j0Var.x1(surface);
                j0Var.U = surface;
                j0Var.q1(this.f13500b, this.f13501c);
                return;
            case 1:
                ConnectionsManager.lambda$onIntegrityCheckClassic$27(this.f13500b, (String) this.d, (String) this.e, this.f13501c);
                return;
            case 2:
                ((wn) this.d).didReceivedNotification(this.f13500b, this.f13501c, (Object[]) this.e);
                return;
            case 3:
                yl ylVar = (yl) this.d;
                ylVar.getClass();
                MessageObject messageObject = ((org.telegram.ui.Cells.v0) this.e).getMessageObject();
                hm hmVar = ylVar.f46046a;
                wn wnVar = hmVar.Q;
                int id2 = messageObject.getId();
                if (messageObject.getDialogId() == hmVar.Q.f45065b7) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                wnVar.kb(this.f13500b, id2, true, i10, true, 0, Integer.valueOf(this.f13501c), null, null);
                return;
            case 4:
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.e;
                wn wnVar2 = ((hn) this.d).f39938a;
                if (wnVar2.M1 != null) {
                    s1Var.getLocationInWindow(new int[2]);
                    wnVar2.M1.setTranslationY(d3.w(520.0f, iArr[1] - v3Var.getTop(), this.f13500b));
                    wnVar2.M1.m(0.0f, (-AndroidUtilities.dp(16.0f)) + iArr[0] + this.f13501c);
                    wnVar2.M1.u();
                    return;
                }
                return;
            default:
                final cy cyVar = (cy) this.d;
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.e;
                dy dyVar = cyVar.f38471g;
                ey eyVar = cyVar.h;
                ArrayList arrayList = eyVar.R1;
                if (arrayList != null) {
                    arrayList.remove(dialog);
                    int i13 = dialog.pinnedNum;
                    eyVar.W0 = null;
                    dyVar.f38702a.invalidate();
                    int N0 = dyVar.f38704c.N0();
                    if (N0 == this.f13500b - 1) {
                        dyVar.f38704c.m(N0).requestLayout();
                    }
                    boolean z10 = false;
                    if (eyVar.getMessagesController().isPromoDialog(dialog.f22032id, false)) {
                        eyVar.getMessagesController().hidePromoDialog();
                        dyVar.f38710x.D();
                        dyVar.q(true);
                        return;
                    }
                    MessagesController messagesController = eyVar.getMessagesController();
                    long j10 = dialog.f22032id;
                    if (eyVar.W2 == 0) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    int addDialogToFolder = messagesController.addDialogToFolder(j10, i11, -1, 0L);
                    int i14 = this.f13501c;
                    int i15 = 2;
                    if (addDialogToFolder != 2 || i14 != 0) {
                        dyVar.f38710x.D();
                        dyVar.q(true);
                    }
                    if (eyVar.W2 == 0) {
                        if (addDialogToFolder == 2) {
                            if (SharedConfig.archiveHidden) {
                                SharedConfig.toggleArchiveHidden();
                            }
                            dyVar.f38710x.D();
                            if (i14 == 0) {
                                eyVar.I4(true, true);
                                dyVar.q(true);
                                eyVar.w3();
                            } else {
                                dyVar.q(true);
                                if (!SharedConfig.archiveHidden && dyVar.f38704c.L0() == 0) {
                                    eyVar.f39000e2 = true;
                                    zx zxVar = dyVar.f38702a;
                                    if (SharedConfig.useThreeLinesLayout) {
                                        f7 = 76.0f;
                                    } else {
                                        f7 = 70.0f;
                                    }
                                    zxVar.w0(0, -AndroidUtilities.dp(f7), null);
                                }
                            }
                            i12 = ((r2) eyVar).currentAccount;
                            eyVar.R1.add(0, (TLRPC.Dialog) eyVar.Z3(i12, dyVar.f38708s, eyVar.W2, false).get(0));
                            dyVar.q(true);
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            cyVar.h.I4(false, true);
                                            return;
                                        default:
                                            cyVar.h.I4(false, true);
                                            return;
                                    }
                                }
                            }, 300L);
                        } else if (addDialogToFolder == 1) {
                            s4.e1 K = dyVar.f38702a.K(0);
                            if (K != null) {
                                View view = K.f47773a;
                                if (view instanceof p2) {
                                    p2 p2Var = (p2) view;
                                    if (p2Var.a2.f29556n == 2) {
                                        p2Var.f24637b2 = true;
                                        p2Var.f24642c2 = 0.0f;
                                        y6.f23669u1.T(0.0f, true);
                                        y6.f23669u1.start();
                                        p2Var.invalidate();
                                    }
                                }
                            }
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            cyVar.h.I4(false, true);
                                            return;
                                        default:
                                            cyVar.h.I4(false, true);
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
                        UndoView g42 = eyVar.g4();
                        if (g42 != null) {
                            long j11 = dialog.f22032id;
                            if (!z10) {
                                i15 = 3;
                            }
                            g42.l(j11, i15, null, new fx(cyVar, dialog, i13, 1));
                        }
                    }
                    if (eyVar.W2 != 0 && eyVar.R1.isEmpty()) {
                        dyVar.f38702a.setEmptyView(null);
                        dyVar.f38709w.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public b0(Object obj, Object obj2, int i10, int i11, int i12) {
        this.f13499a = i12;
        this.d = obj;
        this.e = obj2;
        this.f13500b = i10;
        this.f13501c = i11;
    }

    public b0(wn wnVar, int i10, int i11, Object[] objArr) {
        this.f13499a = 2;
        this.d = wnVar;
        this.f13500b = i10;
        this.f13501c = i11;
        this.e = objArr;
    }
}
