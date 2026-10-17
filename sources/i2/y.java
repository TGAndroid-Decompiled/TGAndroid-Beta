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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.w31;
import org.telegram.ui.cy;
import org.telegram.ui.dy;
import org.telegram.ui.en;
import org.telegram.ui.ey;
import org.telegram.ui.fm;
import org.telegram.ui.sn;
import org.telegram.ui.wl;
import org.telegram.ui.zx;
public final class y implements Runnable {
    public final int f12640a;
    public final int f12641b;
    public final int f12642c;
    public final Object d;
    public final Object e;

    public y(int i10, int i11, String str, String str2) {
        this.f12640a = 1;
        this.f12641b = i10;
        this.d = str;
        this.e = str2;
        this.f12642c = i11;
    }

    @Override
    public final void run() {
        int i10;
        int[] iArr;
        x3 x3Var;
        int i11;
        float f7;
        int i12;
        switch (this.f12640a) {
            case 0:
                g0 g0Var = ((a0) this.d).f12309a;
                Surface surface = new Surface((SurfaceTexture) this.e);
                g0Var.x1(surface);
                g0Var.U = surface;
                g0Var.q1(this.f12641b, this.f12642c);
                return;
            case 1:
                ConnectionsManager.lambda$onIntegrityCheckClassic$27(this.f12641b, (String) this.d, (String) this.e, this.f12642c);
                return;
            case 2:
                ((sn) this.d).didReceivedNotification(this.f12641b, this.f12642c, (Object[]) this.e);
                return;
            case 3:
                wl wlVar = (wl) this.d;
                wlVar.getClass();
                MessageObject messageObject = ((org.telegram.ui.Cells.x0) this.e).getMessageObject();
                fm fmVar = wlVar.f42889a;
                sn snVar = fmVar.Q;
                int id2 = messageObject.getId();
                if (messageObject.getDialogId() == fmVar.Q.L6) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                snVar.bb(this.f12641b, id2, true, i10, true, 0, Integer.valueOf(this.f12642c), null, null);
                return;
            case 4:
                u1 u1Var = (u1) this.e;
                sn snVar2 = ((en) this.d).f36569a;
                if (snVar2.A1 != null) {
                    u1Var.getLocationInWindow(new int[2]);
                    snVar2.A1.setTranslationY(org.telegram.ui.Cells.t0.e(520.0f, iArr[1] - x3Var.getTop(), this.f12641b));
                    snVar2.A1.m(0.0f, (-AndroidUtilities.dp(16.0f)) + iArr[0] + this.f12642c);
                    snVar2.A1.u();
                    return;
                }
                return;
            default:
                final cy cyVar = (cy) this.d;
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.e;
                dy dyVar = cyVar.f36005g;
                ey eyVar = cyVar.h;
                ArrayList arrayList = eyVar.R1;
                if (arrayList != null) {
                    arrayList.remove(dialog);
                    int i13 = dialog.pinnedNum;
                    eyVar.W0 = null;
                    dyVar.f36333a.invalidate();
                    int N0 = dyVar.f36335c.N0();
                    if (N0 == this.f12641b - 1) {
                        dyVar.f36335c.m(N0).requestLayout();
                    }
                    boolean z10 = false;
                    if (eyVar.getMessagesController().isPromoDialog(dialog.f20276id, false)) {
                        eyVar.getMessagesController().hidePromoDialog();
                        dyVar.f36341x.D();
                        dyVar.q(true);
                        return;
                    }
                    MessagesController messagesController = eyVar.getMessagesController();
                    long j10 = dialog.f20276id;
                    if (eyVar.W2 == 0) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    int addDialogToFolder = messagesController.addDialogToFolder(j10, i11, -1, 0L);
                    int i14 = this.f12642c;
                    int i15 = 2;
                    if (addDialogToFolder != 2 || i14 != 0) {
                        dyVar.f36341x.D();
                        dyVar.q(true);
                    }
                    if (eyVar.W2 == 0) {
                        if (addDialogToFolder == 2) {
                            if (SharedConfig.archiveHidden) {
                                SharedConfig.toggleArchiveHidden();
                            }
                            dyVar.f36341x.D();
                            if (i14 == 0) {
                                eyVar.y4(true, true);
                                dyVar.q(true);
                                eyVar.m3();
                            } else {
                                dyVar.q(true);
                                if (!SharedConfig.archiveHidden && dyVar.f36335c.L0() == 0) {
                                    eyVar.f36632e2 = true;
                                    zx zxVar = dyVar.f36333a;
                                    if (SharedConfig.useThreeLinesLayout) {
                                        f7 = 76.0f;
                                    } else {
                                        f7 = 70.0f;
                                    }
                                    zxVar.v0(0, -AndroidUtilities.dp(f7), null);
                                }
                            }
                            i12 = ((n2) eyVar).currentAccount;
                            eyVar.R1.add(0, (TLRPC.Dialog) eyVar.P3(i12, dyVar.f36339s, eyVar.W2, false).get(0));
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
                            s4.b1 K = dyVar.f36333a.K(0);
                            if (K != null) {
                                View view = K.f45938a;
                                if (view instanceof r2) {
                                    r2 r2Var = (r2) view;
                                    if (r2Var.a2.f26820n == 2) {
                                        r2Var.f22810b2 = true;
                                        r2Var.f22815c2 = 0.0f;
                                        h6.f21297u1.T(0.0f, true);
                                        h6.f21297u1.start();
                                        r2Var.invalidate();
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
                            long j11 = dialog.f20276id;
                            if (!z10) {
                                i15 = 3;
                            }
                            W3.l(j11, i15, null, new w31(cyVar, dialog, i13, 2));
                        }
                    }
                    if (eyVar.W2 != 0 && eyVar.R1.isEmpty()) {
                        dyVar.f36333a.setEmptyView(null);
                        dyVar.f36340w.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public y(Object obj, Object obj2, int i10, int i11, int i12) {
        this.f12640a = i12;
        this.d = obj;
        this.e = obj2;
        this.f12641b = i10;
        this.f12642c = i11;
    }

    public y(sn snVar, int i10, int i11, Object[] objArr) {
        this.f12640a = 2;
        this.d = snVar;
        this.f12641b = i10;
        this.f12642c = i11;
        this.e = objArr;
    }
}
