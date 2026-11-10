package org.telegram.messenger;

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class wl implements Runnable {
    public final int f26337a = 0;
    public final boolean f26338b;
    public final String f26339c;
    public final boolean d;
    public final Object f26340e;
    public final Object f26341f;
    public final Object h;
    public final Object f26342n;
    public final Object f26343r;
    public final Object f26344s;

    public wl(t7 t7Var, boolean z9, String str, boolean z10, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, y8 y8Var) {
        this.f26340e = t7Var;
        this.f26338b = z9;
        this.f26339c = str;
        this.d = z10;
        this.f26341f = inputFile;
        this.h = inputEncryptedFile;
        this.f26342n = bArr;
        this.f26343r = bArr2;
        this.f26344s = y8Var;
    }

    @Override
    public final void run() {
        y8 y8Var;
        y8 y8Var2;
        switch (this.f26337a) {
            case 0:
                qp qpVar = (qp) this.f26340e;
                org.telegram.ui.mx mxVar = (org.telegram.ui.ActionBar.f2) this.f26341f;
                vf.b bVar = (vf.b) this.h;
                boolean[] zArr = (boolean[]) this.f26342n;
                TLRPC.User user = (TLRPC.User) this.f26343r;
                String str = this.f26339c;
                boolean z9 = this.f26338b;
                boolean z10 = this.d;
                TL_bots.BotInfo[] botInfoArr = (TL_bots.BotInfo[]) this.f26344s;
                if (mxVar == null) {
                    mxVar = LaunchActivity.T();
                }
                if (mxVar != null) {
                    if (bVar != null) {
                        bVar.b();
                    }
                    if (!zArr[0]) {
                        String F1 = qpVar.F1(user.restriction_reason);
                        if (!TextUtils.isEmpty(F1)) {
                            qp.R4(F1, mxVar);
                            return;
                        } else if (user.bot_has_main_app) {
                            long j3 = user.f27109id;
                            if (mxVar instanceof org.telegram.ui.cn) {
                                j3 = ((org.telegram.ui.cn) mxVar).a();
                            } else if (mxVar instanceof ProfileActivity) {
                                j3 = ((ProfileActivity) mxVar).a();
                            }
                            if (mxVar.getParentLayout() instanceof ActionBarLayout) {
                                mxVar = ((ActionBarLayout) mxVar.getParentLayout()).getSheetFragment();
                            }
                            g0.v1(mxVar.getFragmentView());
                            hi.q4 b10 = hi.q4.b(qpVar.currentAccount, j3, user.f27109id, null, null, 4, 0, 0L, null, false, str, user, 0, z9, z10);
                            LaunchActivity launchActivity = LaunchActivity.G1;
                            if (launchActivity == null || launchActivity.O() == null || LaunchActivity.G1.O().k(b10) == null) {
                                hi.a3 a3Var = new hi.a3(mxVar.getContext(), mxVar.getResourceProvider());
                                a3Var.B(true);
                                a3Var.B0 = false;
                                a3Var.f14528l0 = mxVar.getParentActivity();
                                a3Var.x(mxVar, b10);
                                a3Var.show();
                                return;
                            }
                            return;
                        } else {
                            TL_bots.BotInfo botInfo = botInfoArr[0];
                            if (botInfo != null && (botInfo.menu_button instanceof TL_bots.TL_botMenuButton)) {
                                if (mxVar.getParentLayout() instanceof ActionBarLayout) {
                                    mxVar = ((ActionBarLayout) mxVar.getParentLayout()).getSheetFragment();
                                }
                                TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botInfoArr[0].menu_button;
                                g0.v1(mxVar.getFragmentView());
                                int i7 = qpVar.currentAccount;
                                long j10 = user.f27109id;
                                hi.q4 b11 = hi.q4.b(i7, j10, j10, tL_botMenuButton.text, tL_botMenuButton.url, 2, 0, 0L, null, false, str, user, 0, z9, z10);
                                LaunchActivity launchActivity2 = LaunchActivity.G1;
                                if (launchActivity2 == null || launchActivity2.O() == null || LaunchActivity.G1.O().k(b11) == null) {
                                    hi.a3 a3Var2 = new hi.a3(mxVar.getContext(), mxVar.getResourceProvider());
                                    a3Var2.B(false);
                                    a3Var2.B0 = true;
                                    a3Var2.f14528l0 = mxVar.getParentActivity();
                                    a3Var2.x(mxVar, b11);
                                    a3Var2.show();
                                    return;
                                }
                                return;
                            }
                            mxVar.presentFragment(org.telegram.ui.cn.ta(user.f27109id));
                            return;
                        }
                    }
                    return;
                }
                return;
            default:
                t7 t7Var = (t7) this.f26340e;
                boolean z11 = this.f26338b;
                String str2 = this.f26339c;
                boolean z12 = this.d;
                TLRPC.InputFile inputFile = (TLRPC.InputFile) this.f26341f;
                TLRPC.InputEncryptedFile inputEncryptedFile = (TLRPC.InputEncryptedFile) this.h;
                byte[] bArr = (byte[]) this.f26342n;
                byte[] bArr2 = (byte[]) this.f26343r;
                y8 y8Var3 = (y8) this.f26344s;
                if (z11) {
                    t7Var.d.f26272n.remove(str2);
                } else {
                    t7Var.d.h.remove(str2);
                }
                if (z12) {
                    w7 w7Var = t7Var.d;
                    int i10 = w7Var.f26274s - 1;
                    w7Var.f26274s = i10;
                    if (i10 < 1 && (y8Var2 = (y8) w7Var.f26271f.poll()) != null) {
                        t7Var.d.f26274s++;
                        y8Var2.c();
                    }
                } else {
                    w7 w7Var2 = t7Var.d;
                    int i11 = w7Var2.f26273r - 1;
                    w7Var2.f26273r = i11;
                    if (i11 < 1 && (y8Var = (y8) w7Var2.f26270e.poll()) != null) {
                        t7Var.d.f26273r++;
                        y8Var.c();
                    }
                }
                qb qbVar = t7Var.d.E;
                if (qbVar != null) {
                    Utilities.d.c(new hi.y0(qbVar, qbVar.f24690a, str2, inputFile, inputEncryptedFile, bArr, bArr2, y8Var3.f26620t));
                    return;
                }
                return;
        }
    }

    public wl(qp qpVar, org.telegram.ui.ActionBar.f2 f2Var, vf.b bVar, boolean[] zArr, TLRPC.User user, String str, boolean z9, boolean z10, TL_bots.BotInfo[] botInfoArr) {
        this.f26340e = qpVar;
        this.f26341f = f2Var;
        this.h = bVar;
        this.f26342n = zArr;
        this.f26343r = user;
        this.f26339c = str;
        this.f26338b = z9;
        this.d = z10;
        this.f26344s = botInfoArr;
    }
}
