package i2;

import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.View;
import bi.x4;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.em;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.my;
import org.telegram.ui.eo;
import org.telegram.ui.gm;
import org.telegram.ui.pm;
import org.telegram.ui.pn;
import org.telegram.ui.sy;
import org.telegram.ui.uy;
import org.telegram.ui.vy;
import org.telegram.ui.wy;
public final class z implements Runnable {
    public final int f10405a;
    public final int f10406b;
    public final int f10407c;
    public final Object d;
    public final Object e;

    public z(int i10, int i11, String str, String str2) {
        this.f10405a = 1;
        this.f10406b = i10;
        this.d = str;
        this.e = str2;
        this.f10407c = i11;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        float f7;
        int i13;
        switch (this.f10405a) {
            case 0:
                e0 e0Var = ((b0) this.d).f10108a;
                Surface surface = new Surface((SurfaceTexture) this.e);
                e0Var.t1(surface);
                e0Var.S = surface;
                e0Var.m1(this.f10406b, this.f10407c);
                return;
            case 1:
                ConnectionsManager.lambda$onIntegrityCheckClassic$27(this.f10406b, (String) this.d, (String) this.e, this.f10407c);
                return;
            case 2:
                ((eo) this.d).didReceivedNotification(this.f10406b, this.f10407c, (Object[]) this.e);
                return;
            case 3:
                gm gmVar = (gm) this.d;
                gmVar.getClass();
                MessageObject messageObject = ((org.telegram.ui.Cells.w0) this.e).getMessageObject();
                pm pmVar = gmVar.f33136a;
                eo eoVar = pmVar.Q;
                int id2 = messageObject.getId();
                if (messageObject.getDialogId() == pmVar.Q.L6) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                eoVar.Xa(this.f10406b, id2, true, i10, true, 0, Integer.valueOf(this.f10407c), null, null);
                return;
            case 4:
                t1 t1Var = (t1) this.e;
                eo eoVar2 = ((pn) this.d).f35881a;
                if (eoVar2.A1 != null) {
                    int[] iArr = new int[2];
                    t1Var.getLocationInWindow(iArr);
                    x4 x4Var = eoVar2.A1;
                    x4Var.setTranslationY(em.D(520.0f, iArr[1] - x4Var.getTop(), this.f10406b));
                    eoVar2.A1.m(0.0f, (-AndroidUtilities.dp(16.0f)) + iArr[0] + this.f10407c);
                    eoVar2.A1.u();
                    return;
                }
                return;
            default:
                final uy uyVar = (uy) this.d;
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.e;
                vy vyVar = uyVar.f37361g;
                wy wyVar = uyVar.h;
                ArrayList arrayList = wyVar.R1;
                if (arrayList != null) {
                    arrayList.remove(dialog);
                    int i14 = dialog.pinnedNum;
                    wyVar.W0 = null;
                    vyVar.f37645a.invalidate();
                    int N0 = vyVar.f37647c.N0();
                    if (N0 == this.f10406b - 1) {
                        vyVar.f37647c.m(N0).requestLayout();
                    }
                    boolean z10 = false;
                    if (wyVar.getMessagesController().isPromoDialog(dialog.f17199id, false)) {
                        wyVar.getMessagesController().hidePromoDialog();
                        vyVar.f37653x.D();
                        vyVar.q(true);
                        return;
                    }
                    MessagesController messagesController = wyVar.getMessagesController();
                    long j3 = dialog.f17199id;
                    if (wyVar.V2 == 0) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    int addDialogToFolder = messagesController.addDialogToFolder(j3, i11, -1, 0L);
                    int i15 = this.f10407c;
                    if (addDialogToFolder != 2 || i15 != 0) {
                        vyVar.f37653x.D();
                        vyVar.q(true);
                    }
                    if (wyVar.V2 == 0) {
                        if (addDialogToFolder == 2) {
                            if (SharedConfig.archiveHidden) {
                                SharedConfig.toggleArchiveHidden();
                            }
                            vyVar.f37653x.D();
                            if (i15 == 0) {
                                wyVar.A4(true, true);
                                vyVar.q(true);
                                wyVar.o3();
                            } else {
                                vyVar.q(true);
                                if (!SharedConfig.archiveHidden && vyVar.f37647c.L0() == 0) {
                                    wyVar.f38433e2 = true;
                                    sy syVar = vyVar.f37645a;
                                    if (SharedConfig.useThreeLinesLayout) {
                                        f7 = 76.0f;
                                    } else {
                                        f7 = 70.0f;
                                    }
                                    syVar.v0(0, -AndroidUtilities.dp(f7), null);
                                }
                            }
                            i13 = ((p2) wyVar).currentAccount;
                            wyVar.R1.add(0, (TLRPC.Dialog) wyVar.R3(i13, vyVar.f37651s, wyVar.V2, false).get(0));
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
                            s4.c1 K = vyVar.f37645a.K(0);
                            if (K != null) {
                                View view = K.f41610a;
                                if (view instanceof r2) {
                                    r2 r2Var = (r2) view;
                                    if (r2Var.a2.f23284n == 2) {
                                        r2Var.f19759b2 = true;
                                        r2Var.f19764c2 = 0.0f;
                                        j6.f18231u1.S(0.0f, true);
                                        j6.f18231u1.start();
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
                            long j10 = dialog.f17199id;
                            if (z10) {
                                i12 = 2;
                            } else {
                                i12 = 3;
                            }
                            Y3.l(j10, i12, null, new my(uyVar, dialog, i14, 24));
                        }
                    }
                    if (wyVar.V2 != 0 && wyVar.R1.isEmpty()) {
                        vyVar.f37645a.setEmptyView(null);
                        vyVar.f37652w.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public z(Object obj, Object obj2, int i10, int i11, int i12) {
        this.f10405a = i12;
        this.d = obj;
        this.e = obj2;
        this.f10406b = i10;
        this.f10407c = i11;
    }

    public z(eo eoVar, int i10, int i11, Object[] objArr) {
        this.f10405a = 2;
        this.d = eoVar;
        this.f10406b = i10;
        this.f10407c = i11;
        this.e = objArr;
    }
}
