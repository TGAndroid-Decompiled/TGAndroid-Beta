package i2;

import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.View;
import ei.x3;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.tl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.q2;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.b41;
import org.telegram.ui.cy;
import org.telegram.ui.dn;
import org.telegram.ui.dy;
import org.telegram.ui.em;
import org.telegram.ui.ey;
import org.telegram.ui.sn;
import org.telegram.ui.vl;
import org.telegram.ui.zx;
public final class z implements Runnable {
    public final int f12671a;
    public final int f12672b;
    public final int f12673c;
    public final Object d;
    public final Object e;

    public z(int i10, int i11, String str, String str2) {
        this.f12671a = 1;
        this.f12672b = i10;
        this.d = str;
        this.e = str2;
        this.f12673c = i11;
    }

    @Override
    public final void run() {
        int i10;
        int[] iArr;
        x3 x3Var;
        int i11;
        float f7;
        int i12;
        switch (this.f12671a) {
            case 0:
                h0 h0Var = ((b0) this.d).f12353a;
                Surface surface = new Surface((SurfaceTexture) this.e);
                h0Var.x1(surface);
                h0Var.U = surface;
                h0Var.q1(this.f12672b, this.f12673c);
                return;
            case 1:
                ConnectionsManager.lambda$onIntegrityCheckClassic$27(this.f12672b, (String) this.d, (String) this.e, this.f12673c);
                return;
            case 2:
                ((sn) this.d).didReceivedNotification(this.f12672b, this.f12673c, (Object[]) this.e);
                return;
            case 3:
                vl vlVar = (vl) this.d;
                vlVar.getClass();
                MessageObject messageObject = ((org.telegram.ui.Cells.v0) this.e).getMessageObject();
                em emVar = vlVar.f42759a;
                sn snVar = emVar.Q;
                int id2 = messageObject.getId();
                if (messageObject.getDialogId() == emVar.Q.X6) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                snVar.bb(this.f12672b, id2, true, i10, true, 0, Integer.valueOf(this.f12673c), null, null);
                return;
            case 4:
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.e;
                sn snVar2 = ((dn) this.d).f36651a;
                if (snVar2.M1 != null) {
                    t1Var.getLocationInWindow(new int[2]);
                    snVar2.M1.setTranslationY(tl.D(520.0f, iArr[1] - x3Var.getTop(), this.f12672b));
                    snVar2.M1.m(0.0f, (-AndroidUtilities.dp(16.0f)) + iArr[0] + this.f12673c);
                    snVar2.M1.u();
                    return;
                }
                return;
            default:
                final cy cyVar = (cy) this.d;
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.e;
                dy dyVar = cyVar.f36422g;
                ey eyVar = cyVar.h;
                ArrayList arrayList = eyVar.R1;
                if (arrayList != null) {
                    arrayList.remove(dialog);
                    int i13 = dialog.pinnedNum;
                    eyVar.W0 = null;
                    dyVar.f36737a.invalidate();
                    int N0 = dyVar.f36739c.N0();
                    if (N0 == this.f12672b - 1) {
                        dyVar.f36739c.m(N0).requestLayout();
                    }
                    boolean z10 = false;
                    if (eyVar.getMessagesController().isPromoDialog(dialog.f20348id, false)) {
                        eyVar.getMessagesController().hidePromoDialog();
                        dyVar.f36745x.D();
                        dyVar.q(true);
                        return;
                    }
                    MessagesController messagesController = eyVar.getMessagesController();
                    long j10 = dialog.f20348id;
                    if (eyVar.W2 == 0) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    int addDialogToFolder = messagesController.addDialogToFolder(j10, i11, -1, 0L);
                    int i14 = this.f12673c;
                    int i15 = 2;
                    if (addDialogToFolder != 2 || i14 != 0) {
                        dyVar.f36745x.D();
                        dyVar.q(true);
                    }
                    if (eyVar.W2 == 0) {
                        if (addDialogToFolder == 2) {
                            if (SharedConfig.archiveHidden) {
                                SharedConfig.toggleArchiveHidden();
                            }
                            dyVar.f36745x.D();
                            if (i14 == 0) {
                                eyVar.y4(true, true);
                                dyVar.q(true);
                                eyVar.m3();
                            } else {
                                dyVar.q(true);
                                if (!SharedConfig.archiveHidden && dyVar.f36739c.L0() == 0) {
                                    eyVar.f37036e2 = true;
                                    zx zxVar = dyVar.f36737a;
                                    if (SharedConfig.useThreeLinesLayout) {
                                        f7 = 76.0f;
                                    } else {
                                        f7 = 70.0f;
                                    }
                                    zxVar.v0(0, -AndroidUtilities.dp(f7), null);
                                }
                            }
                            i12 = ((o2) eyVar).currentAccount;
                            eyVar.R1.add(0, (TLRPC.Dialog) eyVar.P3(i12, dyVar.f36743s, eyVar.W2, false).get(0));
                            dyVar.q(true);
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            cyVar.h.y4(false, true);
                                            return;
                                        default:
                                            cyVar.h.y4(false, true);
                                            return;
                                    }
                                }
                            }, 300L);
                        } else if (addDialogToFolder == 1) {
                            s4.b1 K = dyVar.f36737a.K(0);
                            if (K != null) {
                                View view = K.f46342a;
                                if (view instanceof q2) {
                                    q2 q2Var = (q2) view;
                                    if (q2Var.a2.f26243n == 2) {
                                        q2Var.f22925b2 = true;
                                        q2Var.f22930c2 = 0.0f;
                                        k6.f21495u1.T(0.0f, true);
                                        k6.f21495u1.start();
                                        q2Var.invalidate();
                                    }
                                }
                            }
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            cyVar.h.y4(false, true);
                                            return;
                                        default:
                                            cyVar.h.y4(false, true);
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
                        UndoView W3 = eyVar.W3();
                        if (W3 != null) {
                            long j11 = dialog.f20348id;
                            if (!z10) {
                                i15 = 3;
                            }
                            W3.l(j11, i15, null, new b41(cyVar, dialog, i13, 2));
                        }
                    }
                    if (eyVar.W2 != 0 && eyVar.R1.isEmpty()) {
                        dyVar.f36737a.setEmptyView(null);
                        dyVar.f36744w.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public z(Object obj, Object obj2, int i10, int i11, int i12) {
        this.f12671a = i12;
        this.d = obj;
        this.e = obj2;
        this.f12672b = i10;
        this.f12673c = i11;
    }

    public z(sn snVar, int i10, int i11, Object[] objArr) {
        this.f12671a = 2;
        this.d = snVar;
        this.f12672b = i10;
        this.f12673c = i11;
        this.e = objArr;
    }
}
