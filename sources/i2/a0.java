package i2;

import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.View;
import ci.d4;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.ai;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Cells.s2;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.zk;
import org.telegram.ui.dm;
import org.telegram.ui.ln;
import org.telegram.ui.mm;
import org.telegram.ui.oy;
import org.telegram.ui.qy;
import org.telegram.ui.ry;
import org.telegram.ui.sy;
import org.telegram.ui.zn;
public final class a0 implements Runnable {
    public final int f11602a;
    public final int f11603b;
    public final int f11604c;
    public final Object d;
    public final Object f11605e;

    public a0(int i10, int i11, String str, String str2) {
        this.f11602a = 1;
        this.f11603b = i10;
        this.d = str;
        this.f11605e = str2;
        this.f11604c = i11;
    }

    @Override
    public final void run() {
        int i10;
        int[] iArr;
        d4 d4Var;
        int i11;
        float f7;
        int i12;
        switch (this.f11602a) {
            case 0:
                f0 f0Var = ((c0) this.d).f11619a;
                Surface surface = new Surface((SurfaceTexture) this.f11605e);
                f0Var.v1(surface);
                f0Var.S = surface;
                f0Var.o1(this.f11603b, this.f11604c);
                return;
            case 1:
                ConnectionsManager.lambda$onIntegrityCheckClassic$27(this.f11603b, (String) this.d, (String) this.f11605e, this.f11604c);
                return;
            case 2:
                ((zn) this.d).didReceivedNotification(this.f11603b, this.f11604c, (Object[]) this.f11605e);
                return;
            case 3:
                dm dmVar = (dm) this.d;
                dmVar.getClass();
                MessageObject messageObject = ((org.telegram.ui.Cells.w0) this.f11605e).getMessageObject();
                mm mmVar = dmVar.f37084a;
                zn znVar = mmVar.Q;
                int id2 = messageObject.getId();
                if (messageObject.getDialogId() == mmVar.Q.L6) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                znVar.bb(this.f11603b, id2, true, i10, true, 0, Integer.valueOf(this.f11604c), null, null);
                return;
            case 4:
                u1 u1Var = (u1) this.f11605e;
                zn znVar2 = ((ln) this.d).f39735a;
                if (znVar2.A1 != null) {
                    u1Var.getLocationInWindow(new int[2]);
                    znVar2.A1.setTranslationY(ai.D(520.0f, iArr[1] - d4Var.getTop(), this.f11603b));
                    znVar2.A1.m(0.0f, (-AndroidUtilities.dp(16.0f)) + iArr[0] + this.f11604c);
                    znVar2.A1.u();
                    return;
                }
                return;
            default:
                final qy qyVar = (qy) this.d;
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.f11605e;
                ry ryVar = qyVar.f41316g;
                sy syVar = qyVar.h;
                ArrayList arrayList = syVar.R1;
                if (arrayList != null) {
                    arrayList.remove(dialog);
                    int i13 = dialog.pinnedNum;
                    syVar.W0 = null;
                    ryVar.f41564a.invalidate();
                    int N0 = ryVar.f41566c.N0();
                    if (N0 == this.f11603b - 1) {
                        ryVar.f41566c.m(N0).requestLayout();
                    }
                    boolean z10 = false;
                    if (syVar.getMessagesController().isPromoDialog(dialog.f20072id, false)) {
                        syVar.getMessagesController().hidePromoDialog();
                        ryVar.f41573x.D();
                        ryVar.q(true);
                        return;
                    }
                    MessagesController messagesController = syVar.getMessagesController();
                    long j3 = dialog.f20072id;
                    if (syVar.V2 == 0) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    int addDialogToFolder = messagesController.addDialogToFolder(j3, i11, -1, 0L);
                    int i14 = this.f11604c;
                    int i15 = 2;
                    if (addDialogToFolder != 2 || i14 != 0) {
                        ryVar.f41573x.D();
                        ryVar.q(true);
                    }
                    if (syVar.V2 == 0) {
                        if (addDialogToFolder == 2) {
                            if (SharedConfig.archiveHidden) {
                                SharedConfig.toggleArchiveHidden();
                            }
                            ryVar.f41573x.D();
                            if (i14 == 0) {
                                syVar.x4(true, true);
                                ryVar.q(true);
                                syVar.l3();
                            } else {
                                ryVar.q(true);
                                if (!SharedConfig.archiveHidden && ryVar.f41566c.L0() == 0) {
                                    syVar.f41943e2 = true;
                                    oy oyVar = ryVar.f41564a;
                                    if (SharedConfig.useThreeLinesLayout) {
                                        f7 = 76.0f;
                                    } else {
                                        f7 = 70.0f;
                                    }
                                    oyVar.v0(0, -AndroidUtilities.dp(f7), null);
                                }
                            }
                            i12 = ((m2) syVar).currentAccount;
                            syVar.R1.add(0, (TLRPC.Dialog) syVar.O3(i12, ryVar.f41571s, syVar.V2, false).get(0));
                            ryVar.q(true);
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            qyVar.h.x4(false, true);
                                            return;
                                        default:
                                            qyVar.h.x4(false, true);
                                            return;
                                    }
                                }
                            }, 300L);
                        } else if (addDialogToFolder == 1) {
                            s4.d1 K = ryVar.f41564a.K(0);
                            if (K != null) {
                                View view = K.f47782a;
                                if (view instanceof s2) {
                                    s2 s2Var = (s2) view;
                                    if (s2Var.a2.f27664n == 2) {
                                        s2Var.f22800b2 = true;
                                        s2Var.f22805c2 = 0.0f;
                                        h6.f21131u1.T(0.0f, true);
                                        h6.f21131u1.start();
                                        s2Var.invalidate();
                                    }
                                }
                            }
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            qyVar.h.x4(false, true);
                                            return;
                                        default:
                                            qyVar.h.x4(false, true);
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
                        UndoView V3 = syVar.V3();
                        if (V3 != null) {
                            long j10 = dialog.f20072id;
                            if (!z10) {
                                i15 = 3;
                            }
                            V3.l(j10, i15, null, new zk(qyVar, dialog, i13, 27));
                        }
                    }
                    if (syVar.V2 != 0 && syVar.R1.isEmpty()) {
                        ryVar.f41564a.setEmptyView(null);
                        ryVar.f41572w.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public a0(Object obj, Object obj2, int i10, int i11, int i12) {
        this.f11602a = i12;
        this.d = obj;
        this.f11605e = obj2;
        this.f11603b = i10;
        this.f11604c = i11;
    }

    public a0(zn znVar, int i10, int i11, Object[] objArr) {
        this.f11602a = 2;
        this.d = znVar;
        this.f11603b = i10;
        this.f11604c = i11;
        this.f11605e = objArr;
    }
}
