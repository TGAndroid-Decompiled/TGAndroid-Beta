package org.telegram.messenger;

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class wl implements Runnable {
    public final int f26327a = 0;
    public final boolean f26328b;
    public final String f26329c;
    public final boolean d;
    public final Object f26330e;
    public final Object f26331f;
    public final Object h;
    public final Object f26332n;
    public final Object f26333r;
    public final Object f26334s;

    public wl(t7 t7Var, boolean z9, String str, boolean z10, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, y8 y8Var) {
        this.f26330e = t7Var;
        this.f26328b = z9;
        this.f26329c = str;
        this.d = z10;
        this.f26331f = inputFile;
        this.h = inputEncryptedFile;
        this.f26332n = bArr;
        this.f26333r = bArr2;
        this.f26334s = y8Var;
    }

    @Override
    public final void run() {
        y8 y8Var;
        y8 y8Var2;
        switch (this.f26327a) {
            case 0:
                qp qpVar = (qp) this.f26330e;
                org.telegram.ui.jx jxVar = (org.telegram.ui.ActionBar.f2) this.f26331f;
                vf.b bVar = (vf.b) this.h;
                boolean[] zArr = (boolean[]) this.f26332n;
                TLRPC.User user = (TLRPC.User) this.f26333r;
                String str = this.f26329c;
                boolean z9 = this.f26328b;
                boolean z10 = this.d;
                TL_bots.BotInfo[] botInfoArr = (TL_bots.BotInfo[]) this.f26334s;
                if (jxVar == null) {
                    jxVar = LaunchActivity.T();
                }
                if (jxVar != null) {
                    if (bVar != null) {
                        bVar.b();
                    }
                    if (!zArr[0]) {
                        String F1 = qpVar.F1(user.restriction_reason);
                        if (!TextUtils.isEmpty(F1)) {
                            qp.R4(F1, jxVar);
                            return;
                        } else if (user.bot_has_main_app) {
                            long j3 = user.f27102id;
                            if (jxVar instanceof org.telegram.ui.an) {
                                j3 = ((org.telegram.ui.an) jxVar).a();
                            } else if (jxVar instanceof ProfileActivity) {
                                j3 = ((ProfileActivity) jxVar).a();
                            }
                            if (jxVar.getParentLayout() instanceof ActionBarLayout) {
                                jxVar = ((ActionBarLayout) jxVar.getParentLayout()).getSheetFragment();
                            }
                            g0.v1(jxVar.getFragmentView());
                            hi.q4 b10 = hi.q4.b(qpVar.currentAccount, j3, user.f27102id, null, null, 4, 0, 0L, null, false, str, user, 0, z9, z10);
                            LaunchActivity launchActivity = LaunchActivity.G1;
                            if (launchActivity == null || launchActivity.O() == null || LaunchActivity.G1.O().k(b10) == null) {
                                hi.a3 a3Var = new hi.a3(jxVar.getContext(), jxVar.getResourceProvider());
                                a3Var.B(true);
                                a3Var.B0 = false;
                                a3Var.f14526l0 = jxVar.getParentActivity();
                                a3Var.x(jxVar, b10);
                                a3Var.show();
                                return;
                            }
                            return;
                        } else {
                            TL_bots.BotInfo botInfo = botInfoArr[0];
                            if (botInfo != null && (botInfo.menu_button instanceof TL_bots.TL_botMenuButton)) {
                                if (jxVar.getParentLayout() instanceof ActionBarLayout) {
                                    jxVar = ((ActionBarLayout) jxVar.getParentLayout()).getSheetFragment();
                                }
                                TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botInfoArr[0].menu_button;
                                g0.v1(jxVar.getFragmentView());
                                int i7 = qpVar.currentAccount;
                                long j10 = user.f27102id;
                                hi.q4 b11 = hi.q4.b(i7, j10, j10, tL_botMenuButton.text, tL_botMenuButton.url, 2, 0, 0L, null, false, str, user, 0, z9, z10);
                                LaunchActivity launchActivity2 = LaunchActivity.G1;
                                if (launchActivity2 == null || launchActivity2.O() == null || LaunchActivity.G1.O().k(b11) == null) {
                                    hi.a3 a3Var2 = new hi.a3(jxVar.getContext(), jxVar.getResourceProvider());
                                    a3Var2.B(false);
                                    a3Var2.B0 = true;
                                    a3Var2.f14526l0 = jxVar.getParentActivity();
                                    a3Var2.x(jxVar, b11);
                                    a3Var2.show();
                                    return;
                                }
                                return;
                            }
                            jxVar.presentFragment(org.telegram.ui.an.ra(user.f27102id));
                            return;
                        }
                    }
                    return;
                }
                return;
            default:
                t7 t7Var = (t7) this.f26330e;
                boolean z11 = this.f26328b;
                String str2 = this.f26329c;
                boolean z12 = this.d;
                TLRPC.InputFile inputFile = (TLRPC.InputFile) this.f26331f;
                TLRPC.InputEncryptedFile inputEncryptedFile = (TLRPC.InputEncryptedFile) this.h;
                byte[] bArr = (byte[]) this.f26332n;
                byte[] bArr2 = (byte[]) this.f26333r;
                y8 y8Var3 = (y8) this.f26334s;
                if (z11) {
                    t7Var.d.f26265n.remove(str2);
                } else {
                    t7Var.d.h.remove(str2);
                }
                if (z12) {
                    w7 w7Var = t7Var.d;
                    int i10 = w7Var.f26267s - 1;
                    w7Var.f26267s = i10;
                    if (i10 < 1 && (y8Var2 = (y8) w7Var.f26264f.poll()) != null) {
                        t7Var.d.f26267s++;
                        y8Var2.c();
                    }
                } else {
                    w7 w7Var2 = t7Var.d;
                    int i11 = w7Var2.f26266r - 1;
                    w7Var2.f26266r = i11;
                    if (i11 < 1 && (y8Var = (y8) w7Var2.f26263e.poll()) != null) {
                        t7Var.d.f26266r++;
                        y8Var.c();
                    }
                }
                qb qbVar = t7Var.d.E;
                if (qbVar != null) {
                    Utilities.d.c(new hi.y0(qbVar, qbVar.f24683a, str2, inputFile, inputEncryptedFile, bArr, bArr2, y8Var3.f26607t));
                    return;
                }
                return;
        }
    }

    public wl(qp qpVar, org.telegram.ui.ActionBar.f2 f2Var, vf.b bVar, boolean[] zArr, TLRPC.User user, String str, boolean z9, boolean z10, TL_bots.BotInfo[] botInfoArr) {
        this.f26330e = qpVar;
        this.f26331f = f2Var;
        this.h = bVar;
        this.f26332n = zArr;
        this.f26333r = user;
        this.f26329c = str;
        this.f26328b = z9;
        this.d = z10;
        this.f26334s = botInfoArr;
    }
}
