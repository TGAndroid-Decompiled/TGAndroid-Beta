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
import org.telegram.messenger.nk;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.y31;
import org.telegram.ui.ay;
import org.telegram.ui.cn;
import org.telegram.ui.cy;
import org.telegram.ui.dm;
import org.telegram.ui.qn;
import org.telegram.ui.ul;
import org.telegram.ui.xx;
import org.telegram.ui.zx;
public final class a0 implements Runnable {
    public final int f12308a;
    public final int f12309b;
    public final int f12310c;
    public final Object d;
    public final Object e;

    public a0(int i10, int i11, String str, String str2) {
        this.f12308a = 1;
        this.f12309b = i10;
        this.d = str;
        this.e = str2;
        this.f12310c = i11;
    }

    @Override
    public final void run() {
        int i10;
        int[] iArr;
        x3 x3Var;
        int i11;
        float f7;
        int i12;
        switch (this.f12308a) {
            case 0:
                i0 i0Var = ((c0) this.d).f12325a;
                Surface surface = new Surface((SurfaceTexture) this.e);
                i0Var.x1(surface);
                i0Var.U = surface;
                i0Var.q1(this.f12309b, this.f12310c);
                return;
            case 1:
                ConnectionsManager.lambda$onIntegrityCheckClassic$27(this.f12309b, (String) this.d, (String) this.e, this.f12310c);
                return;
            case 2:
                ((qn) this.d).didReceivedNotification(this.f12309b, this.f12310c, (Object[]) this.e);
                return;
            case 3:
                ul ulVar = (ul) this.d;
                ulVar.getClass();
                MessageObject messageObject = ((org.telegram.ui.Cells.w0) this.e).getMessageObject();
                dm dmVar = ulVar.f42015a;
                qn qnVar = dmVar.Q;
                int id2 = messageObject.getId();
                if (messageObject.getDialogId() == dmVar.Q.L6) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                qnVar.bb(this.f12309b, id2, true, i10, true, 0, Integer.valueOf(this.f12310c), null, null);
                return;
            case 4:
                u1 u1Var = (u1) this.e;
                qn qnVar2 = ((cn) this.d).f36015a;
                if (qnVar2.A1 != null) {
                    u1Var.getLocationInWindow(new int[2]);
                    qnVar2.A1.setTranslationY(nk.D(520.0f, iArr[1] - x3Var.getTop(), this.f12309b));
                    qnVar2.A1.m(0.0f, (-AndroidUtilities.dp(16.0f)) + iArr[0] + this.f12310c);
                    qnVar2.A1.u();
                    return;
                }
                return;
            default:
                final zx zxVar = (zx) this.d;
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.e;
                ay ayVar = zxVar.f43824g;
                cy cyVar = zxVar.h;
                ArrayList arrayList = cyVar.R1;
                if (arrayList != null) {
                    arrayList.remove(dialog);
                    int i13 = dialog.pinnedNum;
                    cyVar.W0 = null;
                    ayVar.f35447a.invalidate();
                    int N0 = ayVar.f35449c.N0();
                    if (N0 == this.f12309b - 1) {
                        ayVar.f35449c.m(N0).requestLayout();
                    }
                    boolean z10 = false;
                    if (cyVar.getMessagesController().isPromoDialog(dialog.f20284id, false)) {
                        cyVar.getMessagesController().hidePromoDialog();
                        ayVar.f35455x.D();
                        ayVar.q(true);
                        return;
                    }
                    MessagesController messagesController = cyVar.getMessagesController();
                    long j10 = dialog.f20284id;
                    if (cyVar.W2 == 0) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    int addDialogToFolder = messagesController.addDialogToFolder(j10, i11, -1, 0L);
                    int i14 = this.f12310c;
                    int i15 = 2;
                    if (addDialogToFolder != 2 || i14 != 0) {
                        ayVar.f35455x.D();
                        ayVar.q(true);
                    }
                    if (cyVar.W2 == 0) {
                        if (addDialogToFolder == 2) {
                            if (SharedConfig.archiveHidden) {
                                SharedConfig.toggleArchiveHidden();
                            }
                            ayVar.f35455x.D();
                            if (i14 == 0) {
                                cyVar.y4(true, true);
                                ayVar.q(true);
                                cyVar.m3();
                            } else {
                                ayVar.q(true);
                                if (!SharedConfig.archiveHidden && ayVar.f35449c.L0() == 0) {
                                    cyVar.f36098e2 = true;
                                    xx xxVar = ayVar.f35447a;
                                    if (SharedConfig.useThreeLinesLayout) {
                                        f7 = 76.0f;
                                    } else {
                                        f7 = 70.0f;
                                    }
                                    xxVar.v0(0, -AndroidUtilities.dp(f7), null);
                                }
                            }
                            i12 = ((n2) cyVar).currentAccount;
                            cyVar.R1.add(0, (TLRPC.Dialog) cyVar.P3(i12, ayVar.f35453s, cyVar.W2, false).get(0));
                            ayVar.q(true);
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            zxVar.h.y4(false, true);
                                            return;
                                        default:
                                            zxVar.h.y4(false, true);
                                            return;
                                    }
                                }
                            }, 300L);
                        } else if (addDialogToFolder == 1) {
                            s4.b1 K = ayVar.f35447a.K(0);
                            if (K != null) {
                                View view = K.f45921a;
                                if (view instanceof r2) {
                                    r2 r2Var = (r2) view;
                                    if (r2Var.a2.f26824n == 2) {
                                        r2Var.f22815b2 = true;
                                        r2Var.f22820c2 = 0.0f;
                                        h6.f21305u1.T(0.0f, true);
                                        h6.f21305u1.start();
                                        r2Var.invalidate();
                                    }
                                }
                            }
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            zxVar.h.y4(false, true);
                                            return;
                                        default:
                                            zxVar.h.y4(false, true);
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
                        UndoView W3 = cyVar.W3();
                        if (W3 != null) {
                            long j11 = dialog.f20284id;
                            if (!z10) {
                                i15 = 3;
                            }
                            W3.l(j11, i15, null, new y31(zxVar, dialog, i13, 2));
                        }
                    }
                    if (cyVar.W2 != 0 && cyVar.R1.isEmpty()) {
                        ayVar.f35447a.setEmptyView(null);
                        ayVar.f35454w.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public a0(Object obj, Object obj2, int i10, int i11, int i12) {
        this.f12308a = i12;
        this.d = obj;
        this.e = obj2;
        this.f12309b = i10;
        this.f12310c = i11;
    }

    public a0(qn qnVar, int i10, int i11, Object[] objArr) {
        this.f12308a = 2;
        this.d = qnVar;
        this.f12309b = i10;
        this.f12310c = i11;
        this.e = objArr;
    }
}
