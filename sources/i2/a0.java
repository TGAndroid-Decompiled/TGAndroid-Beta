package i2;

import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.View;
import di.f4;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.wl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.co;
import org.telegram.ui.dm;
import org.telegram.ui.fm;
import org.telegram.ui.om;
import org.telegram.ui.on;
import org.telegram.ui.qy;
import org.telegram.ui.sy;
import org.telegram.ui.ty;
import org.telegram.ui.uy;
public final class a0 implements Runnable {
    public final int f11478a;
    public final int f11479b;
    public final int f11480c;
    public final Object d;
    public final Object f11481e;

    public a0(int i10, int i11, String str, String str2) {
        this.f11478a = 1;
        this.f11479b = i10;
        this.d = str;
        this.f11481e = str2;
        this.f11480c = i11;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        float f7;
        int i13;
        switch (this.f11478a) {
            case 0:
                f0 f0Var = ((c0) this.d).f11497a;
                Surface surface = new Surface((SurfaceTexture) this.f11481e);
                f0Var.t1(surface);
                f0Var.S = surface;
                f0Var.m1(this.f11479b, this.f11480c);
                return;
            case 1:
                ConnectionsManager.lambda$onIntegrityCheckClassic$27(this.f11479b, (String) this.d, (String) this.f11481e, this.f11480c);
                return;
            case 2:
                ((co) this.d).didReceivedNotification(this.f11479b, this.f11480c, (Object[]) this.f11481e);
                return;
            case 3:
                fm fmVar = (fm) this.d;
                fmVar.getClass();
                MessageObject messageObject = ((org.telegram.ui.Cells.w0) this.f11481e).getMessageObject();
                om omVar = fmVar.f36459a;
                co coVar = omVar.Q;
                int id2 = messageObject.getId();
                if (messageObject.getDialogId() == omVar.Q.L6) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                coVar.Xa(this.f11479b, id2, true, i10, true, 0, Integer.valueOf(this.f11480c), null, null);
                return;
            case 4:
                t1 t1Var = (t1) this.f11481e;
                co coVar2 = ((on) this.d).f39310a;
                if (coVar2.A1 != null) {
                    int[] iArr = new int[2];
                    t1Var.getLocationInWindow(iArr);
                    f4 f4Var = coVar2.A1;
                    f4Var.setTranslationY(wl.D(520.0f, iArr[1] - f4Var.getTop(), this.f11479b));
                    coVar2.A1.m(0.0f, (-AndroidUtilities.dp(16.0f)) + iArr[0] + this.f11480c);
                    coVar2.A1.u();
                    return;
                }
                return;
            default:
                final sy syVar = (sy) this.d;
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.f11481e;
                ty tyVar = syVar.f40597g;
                uy uyVar = syVar.h;
                ArrayList arrayList = uyVar.R1;
                if (arrayList != null) {
                    arrayList.remove(dialog);
                    int i14 = dialog.pinnedNum;
                    uyVar.W0 = null;
                    tyVar.f40885a.invalidate();
                    int N0 = tyVar.f40887c.N0();
                    if (N0 == this.f11479b - 1) {
                        tyVar.f40887c.m(N0).requestLayout();
                    }
                    boolean z10 = false;
                    if (uyVar.getMessagesController().isPromoDialog(dialog.f19900id, false)) {
                        uyVar.getMessagesController().hidePromoDialog();
                        tyVar.f40894x.D();
                        tyVar.q(true);
                        return;
                    }
                    MessagesController messagesController = uyVar.getMessagesController();
                    long j3 = dialog.f19900id;
                    if (uyVar.V2 == 0) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    int addDialogToFolder = messagesController.addDialogToFolder(j3, i11, -1, 0L);
                    int i15 = this.f11480c;
                    if (addDialogToFolder != 2 || i15 != 0) {
                        tyVar.f40894x.D();
                        tyVar.q(true);
                    }
                    if (uyVar.V2 == 0) {
                        if (addDialogToFolder == 2) {
                            if (SharedConfig.archiveHidden) {
                                SharedConfig.toggleArchiveHidden();
                            }
                            tyVar.f40894x.D();
                            if (i15 == 0) {
                                uyVar.A4(true, true);
                                tyVar.q(true);
                                uyVar.o3();
                            } else {
                                tyVar.q(true);
                                if (!SharedConfig.archiveHidden && tyVar.f40887c.L0() == 0) {
                                    uyVar.f41288e2 = true;
                                    qy qyVar = tyVar.f40885a;
                                    if (SharedConfig.useThreeLinesLayout) {
                                        f7 = 76.0f;
                                    } else {
                                        f7 = 70.0f;
                                    }
                                    qyVar.v0(0, -AndroidUtilities.dp(f7), null);
                                }
                            }
                            i13 = ((n2) uyVar).currentAccount;
                            uyVar.R1.add(0, (TLRPC.Dialog) uyVar.R3(i13, tyVar.f40892s, uyVar.V2, false).get(0));
                            tyVar.q(true);
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            syVar.h.A4(false, true);
                                            return;
                                        default:
                                            syVar.h.A4(false, true);
                                            return;
                                    }
                                }
                            }, 300L);
                        } else if (addDialogToFolder == 1) {
                            s4.c1 K = tyVar.f40885a.K(0);
                            if (K != null) {
                                View view = K.f45766a;
                                if (view instanceof r2) {
                                    r2 r2Var = (r2) view;
                                    if (r2Var.a2.f27063n == 2) {
                                        r2Var.f22567b2 = true;
                                        r2Var.f22572c2 = 0.0f;
                                        j6.f20994u1.Q(0.0f, true);
                                        j6.f20994u1.start();
                                        r2Var.invalidate();
                                    }
                                }
                            }
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            syVar.h.A4(false, true);
                                            return;
                                        default:
                                            syVar.h.A4(false, true);
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
                        UndoView Y3 = uyVar.Y3();
                        if (Y3 != null) {
                            long j10 = dialog.f19900id;
                            if (z10) {
                                i12 = 2;
                            } else {
                                i12 = 3;
                            }
                            Y3.l(j10, i12, null, new dm(syVar, dialog, i14, 27));
                        }
                    }
                    if (uyVar.V2 != 0 && uyVar.R1.isEmpty()) {
                        tyVar.f40885a.setEmptyView(null);
                        tyVar.f40893w.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public a0(Object obj, Object obj2, int i10, int i11, int i12) {
        this.f11478a = i12;
        this.d = obj;
        this.f11481e = obj2;
        this.f11479b = i10;
        this.f11480c = i11;
    }

    public a0(co coVar, int i10, int i11, Object[] objArr) {
        this.f11478a = 2;
        this.d = coVar;
        this.f11479b = i10;
        this.f11480c = i11;
        this.f11481e = objArr;
    }
}
