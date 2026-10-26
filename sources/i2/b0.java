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
import org.telegram.ui.ay;
import org.telegram.ui.cy;
import org.telegram.ui.d3;
import org.telegram.ui.fm;
import org.telegram.ui.fn;
import org.telegram.ui.un;
import org.telegram.ui.wl;
import org.telegram.ui.wx;
import org.telegram.ui.yx;
import org.telegram.ui.zx;
public final class b0 implements Runnable {
    public final int f13500a;
    public final int f13501b;
    public final int f13502c;
    public final Object d;
    public final Object e;

    public b0(int i10, int i11, String str, String str2) {
        this.f13500a = 1;
        this.f13501b = i10;
        this.d = str;
        this.e = str2;
        this.f13502c = i11;
    }

    @Override
    public final void run() {
        int i10;
        int[] iArr;
        v3 v3Var;
        int i11;
        float f7;
        int i12;
        switch (this.f13500a) {
            case 0:
                j0 j0Var = ((d0) this.d).f13509a;
                Surface surface = new Surface((SurfaceTexture) this.e);
                j0Var.x1(surface);
                j0Var.U = surface;
                j0Var.q1(this.f13501b, this.f13502c);
                return;
            case 1:
                ConnectionsManager.lambda$onIntegrityCheckClassic$27(this.f13501b, (String) this.d, (String) this.e, this.f13502c);
                return;
            case 2:
                ((un) this.d).didReceivedNotification(this.f13501b, this.f13502c, (Object[]) this.e);
                return;
            case 3:
                wl wlVar = (wl) this.d;
                wlVar.getClass();
                MessageObject messageObject = ((org.telegram.ui.Cells.v0) this.e).getMessageObject();
                fm fmVar = wlVar.f45518a;
                un unVar = fmVar.Q;
                int id2 = messageObject.getId();
                if (messageObject.getDialogId() == fmVar.Q.X6) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                unVar.gb(this.f13501b, id2, true, i10, true, 0, Integer.valueOf(this.f13502c), null, null);
                return;
            case 4:
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.e;
                un unVar2 = ((fn) this.d).f39423a;
                if (unVar2.M1 != null) {
                    s1Var.getLocationInWindow(new int[2]);
                    unVar2.M1.setTranslationY(d3.w(520.0f, iArr[1] - v3Var.getTop(), this.f13501b));
                    unVar2.M1.m(0.0f, (-AndroidUtilities.dp(16.0f)) + iArr[0] + this.f13502c);
                    unVar2.M1.u();
                    return;
                }
                return;
            default:
                final zx zxVar = (zx) this.d;
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.e;
                ay ayVar = zxVar.f46382g;
                cy cyVar = zxVar.h;
                ArrayList arrayList = cyVar.R1;
                if (arrayList != null) {
                    arrayList.remove(dialog);
                    int i13 = dialog.pinnedNum;
                    cyVar.W0 = null;
                    ayVar.f37913a.invalidate();
                    int N0 = ayVar.f37915c.N0();
                    if (N0 == this.f13501b - 1) {
                        ayVar.f37915c.m(N0).requestLayout();
                    }
                    boolean z10 = false;
                    if (cyVar.getMessagesController().isPromoDialog(dialog.f22031id, false)) {
                        cyVar.getMessagesController().hidePromoDialog();
                        ayVar.f37921x.D();
                        ayVar.q(true);
                        return;
                    }
                    MessagesController messagesController = cyVar.getMessagesController();
                    long j10 = dialog.f22031id;
                    if (cyVar.W2 == 0) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    int addDialogToFolder = messagesController.addDialogToFolder(j10, i11, -1, 0L);
                    int i14 = this.f13502c;
                    int i15 = 2;
                    if (addDialogToFolder != 2 || i14 != 0) {
                        ayVar.f37921x.D();
                        ayVar.q(true);
                    }
                    if (cyVar.W2 == 0) {
                        if (addDialogToFolder == 2) {
                            if (SharedConfig.archiveHidden) {
                                SharedConfig.toggleArchiveHidden();
                            }
                            ayVar.f37921x.D();
                            if (i14 == 0) {
                                cyVar.I4(true, true);
                                ayVar.q(true);
                                cyVar.w3();
                            } else {
                                ayVar.q(true);
                                if (!SharedConfig.archiveHidden && ayVar.f37915c.L0() == 0) {
                                    cyVar.f38588e2 = true;
                                    wx wxVar = ayVar.f37913a;
                                    if (SharedConfig.useThreeLinesLayout) {
                                        f7 = 76.0f;
                                    } else {
                                        f7 = 70.0f;
                                    }
                                    wxVar.w0(0, -AndroidUtilities.dp(f7), null);
                                }
                            }
                            i12 = ((r2) cyVar).currentAccount;
                            cyVar.R1.add(0, (TLRPC.Dialog) cyVar.Z3(i12, ayVar.f37919s, cyVar.W2, false).get(0));
                            ayVar.q(true);
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            zxVar.h.I4(false, true);
                                            return;
                                        default:
                                            zxVar.h.I4(false, true);
                                            return;
                                    }
                                }
                            }, 300L);
                        } else if (addDialogToFolder == 1) {
                            s4.e1 K = ayVar.f37913a.K(0);
                            if (K != null) {
                                View view = K.f47738a;
                                if (view instanceof p2) {
                                    p2 p2Var = (p2) view;
                                    if (p2Var.a2.f29540n == 2) {
                                        p2Var.f24635b2 = true;
                                        p2Var.f24640c2 = 0.0f;
                                        y6.f23668u1.T(0.0f, true);
                                        y6.f23668u1.start();
                                        p2Var.invalidate();
                                    }
                                }
                            }
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            zxVar.h.I4(false, true);
                                            return;
                                        default:
                                            zxVar.h.I4(false, true);
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
                        UndoView g42 = cyVar.g4();
                        if (g42 != null) {
                            long j11 = dialog.f22031id;
                            if (!z10) {
                                i15 = 3;
                            }
                            g42.l(j11, i15, null, new yx(zxVar, dialog, i13, 0));
                        }
                    }
                    if (cyVar.W2 != 0 && cyVar.R1.isEmpty()) {
                        ayVar.f37913a.setEmptyView(null);
                        ayVar.f37920w.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public b0(Object obj, Object obj2, int i10, int i11, int i12) {
        this.f13500a = i12;
        this.d = obj;
        this.e = obj2;
        this.f13501b = i10;
        this.f13502c = i11;
    }

    public b0(un unVar, int i10, int i11, Object[] objArr) {
        this.f13500a = 2;
        this.d = unVar;
        this.f13501b = i10;
        this.f13502c = i11;
        this.e = objArr;
    }
}
