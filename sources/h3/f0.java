package h3;

import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.View;
import java.util.ArrayList;
import lh.w3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.rl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.km;
import org.telegram.ui.dm;
import org.telegram.ui.dn;
import org.telegram.ui.ey;
import org.telegram.ui.fy;
import org.telegram.ui.gy;
import org.telegram.ui.rn;
import org.telegram.ui.ul;

public final class f0 implements Runnable {

    public final int f7820a;

    public final int f7821b;

    public final int f7822c;
    public final Object d;

    public final Object f7823e;

    public f0(int i10, int i11, String str, String str2) {
        this.f7820a = 1;
        this.f7821b = i10;
        this.d = str;
        this.f7823e = str2;
        this.f7822c = i11;
    }

    @Override
    public final void run() {
        switch (this.f7820a) {
            case 0:
                h0 h0Var = (h0) this.d;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.f7823e;
                k0 k0Var = h0Var.f7870a;
                Surface surface = new Surface(surfaceTexture);
                k0Var.g0(surface);
                k0Var.S = surface;
                k0Var.a0(this.f7821b, this.f7822c);
                break;
            case 1:
                ConnectionsManager.lambda$onIntegrityCheckClassic$27(this.f7821b, (String) this.d, (String) this.f7823e, this.f7822c);
                break;
            case 2:
                ((rn) this.d).didReceivedNotification(this.f7821b, this.f7822c, (Object[]) this.f7823e);
                break;
            case 3:
                ul ulVar = (ul) this.d;
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) this.f7823e;
                ulVar.getClass();
                MessageObject messageObject = v0Var.getMessageObject();
                dm dmVar = ulVar.f43247a;
                dmVar.M.Xa(this.f7821b, messageObject.getId(), true, messageObject.getDialogId() == dmVar.M.H6 ? 1 : 0, true, 0, Integer.valueOf(this.f7822c), null, null);
                break;
            case 4:
                dn dnVar = (dn) this.d;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.f7823e;
                rn rnVar = dnVar.f37446a;
                if (rnVar.f42253w1 != null) {
                    int[] iArr = new int[2];
                    s1Var.getLocationInWindow(iArr);
                    w3 w3Var = rnVar.f42253w1;
                    w3Var.setTranslationY(rl.C(520.0f, iArr[1] - w3Var.getTop(), this.f7821b));
                    rnVar.f42253w1.n(0.0f, (-AndroidUtilities.dp(16.0f)) + iArr[0] + this.f7822c);
                    rnVar.f42253w1.v();
                    break;
                }
                break;
            default:
                final ey eyVar = (ey) this.d;
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.f7823e;
                fy fyVar = eyVar.f37878g;
                gy gyVar = eyVar.h;
                ArrayList arrayList = gyVar.N1;
                if (arrayList != null) {
                    arrayList.remove(dialog);
                    int i10 = dialog.pinnedNum;
                    gyVar.S0 = null;
                    fyVar.f38225a.invalidate();
                    int iN0 = fyVar.f38227c.N0();
                    if (iN0 == this.f7821b - 1) {
                        fyVar.f38227c.m(iN0).requestLayout();
                    }
                    if (!gyVar.getMessagesController().isPromoDialog(dialog.f22384id, false)) {
                        int iAddDialogToFolder = gyVar.getMessagesController().addDialogToFolder(dialog.f22384id, gyVar.R2 == 0 ? 1 : 0, -1, 0L);
                        int i11 = this.f7822c;
                        if (iAddDialogToFolder != 2 || i11 != 0) {
                            fyVar.f38234x.D();
                            fyVar.q(true);
                        }
                        if (gyVar.R2 == 0) {
                            if (iAddDialogToFolder == 2) {
                                if (SharedConfig.archiveHidden) {
                                    SharedConfig.toggleArchiveHidden();
                                }
                                fyVar.f38234x.D();
                                if (i11 == 0) {
                                    gyVar.A4(true, true);
                                    fyVar.q(true);
                                    gyVar.o3();
                                } else {
                                    fyVar.q(true);
                                    if (!SharedConfig.archiveHidden && fyVar.f38227c.L0() == 0) {
                                        gyVar.a2 = true;
                                        fyVar.f38225a.v0(0, -AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 76.0f : 70.0f), null);
                                    }
                                }
                                gyVar.N1.add(0, (TLRPC.Dialog) gyVar.R3(((org.telegram.ui.ActionBar.n2) gyVar).currentAccount, fyVar.f38232s, gyVar.R2, false).get(0));
                                fyVar.q(true);
                                final int i12 = 0;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (i12) {
                                            case 0:
                                                eyVar.h.A4(false, true);
                                                break;
                                            default:
                                                eyVar.h.A4(false, true);
                                                break;
                                        }
                                    }
                                }, 300L);
                            } else if (iAddDialogToFolder == 1) {
                                f2.o1 o1VarK = fyVar.f38225a.K(0);
                                if (o1VarK != null) {
                                    View view = o1VarK.f5789a;
                                    if (view instanceof org.telegram.ui.Cells.p2) {
                                        org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) view;
                                        if (p2Var.W1.f34856n == 2) {
                                            p2Var.X1 = true;
                                            p2Var.Y1 = 0.0f;
                                            g6.f23352u1.Q(0.0f, true);
                                            g6.f23352u1.start();
                                            p2Var.invalidate();
                                        }
                                    }
                                }
                                final int i13 = 1;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (i13) {
                                            case 0:
                                                eyVar.h.A4(false, true);
                                                break;
                                            default:
                                                eyVar.h.A4(false, true);
                                                break;
                                        }
                                    }
                                }, 300L);
                            }
                            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                            boolean z10 = globalMainSettings.getBoolean("archivehint_l", false) || SharedConfig.archiveHidden;
                            if (!z10) {
                                globalMainSettings.edit().putBoolean("archivehint_l", true).commit();
                            }
                            UndoView undoViewY3 = gyVar.Y3();
                            if (undoViewY3 != null) {
                                undoViewY3.l(dialog.f22384id, z10 ? 2 : 3, null, new km(eyVar, dialog, i10, 26));
                            }
                        }
                        if (gyVar.R2 != 0 && gyVar.N1.isEmpty()) {
                            fyVar.f38225a.setEmptyView(null);
                            fyVar.f38233w.setVisibility(4);
                            break;
                        }
                    } else {
                        gyVar.getMessagesController().hidePromoDialog();
                        fyVar.f38234x.D();
                        fyVar.q(true);
                        break;
                    }
                }
                break;
        }
    }

    public f0(Object obj, Object obj2, int i10, int i11, int i12) {
        this.f7820a = i12;
        this.d = obj;
        this.f7823e = obj2;
        this.f7821b = i10;
        this.f7822c = i11;
    }

    public f0(rn rnVar, int i10, int i11, Object[] objArr) {
        this.f7820a = 2;
        this.d = rnVar;
        this.f7821b = i10;
        this.f7822c = i11;
        this.f7823e = objArr;
    }
}
