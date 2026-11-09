package org.telegram.messenger;

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class wl implements Runnable {
    public final int f26333a = 0;
    public final boolean f26334b;
    public final String f26335c;
    public final boolean d;
    public final Object f26336e;
    public final Object f26337f;
    public final Object h;
    public final Object f26338n;
    public final Object f26339r;
    public final Object f26340s;

    public wl(t7 t7Var, boolean z9, String str, boolean z10, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, y8 y8Var) {
        this.f26336e = t7Var;
        this.f26334b = z9;
        this.f26335c = str;
        this.d = z10;
        this.f26337f = inputFile;
        this.h = inputEncryptedFile;
        this.f26338n = bArr;
        this.f26339r = bArr2;
        this.f26340s = y8Var;
    }

    @Override
    public final void run() {
        y8 y8Var;
        y8 y8Var2;
        switch (this.f26333a) {
            case 0:
                qp qpVar = (qp) this.f26336e;
                org.telegram.ui.lx lxVar = (org.telegram.ui.ActionBar.f2) this.f26337f;
                vf.b bVar = (vf.b) this.h;
                boolean[] zArr = (boolean[]) this.f26338n;
                TLRPC.User user = (TLRPC.User) this.f26339r;
                String str = this.f26335c;
                boolean z9 = this.f26334b;
                boolean z10 = this.d;
                TL_bots.BotInfo[] botInfoArr = (TL_bots.BotInfo[]) this.f26340s;
                if (lxVar == null) {
                    lxVar = LaunchActivity.T();
                }
                if (lxVar != null) {
                    if (bVar != null) {
                        bVar.b();
                    }
                    if (!zArr[0]) {
                        String F1 = qpVar.F1(user.restriction_reason);
                        if (!TextUtils.isEmpty(F1)) {
                            qp.R4(F1, lxVar);
                            return;
                        } else if (user.bot_has_main_app) {
                            long j3 = user.f27105id;
                            if (lxVar instanceof org.telegram.ui.cn) {
                                j3 = ((org.telegram.ui.cn) lxVar).a();
                            } else if (lxVar instanceof ProfileActivity) {
                                j3 = ((ProfileActivity) lxVar).a();
                            }
                            if (lxVar.getParentLayout() instanceof ActionBarLayout) {
                                lxVar = ((ActionBarLayout) lxVar.getParentLayout()).getSheetFragment();
                            }
                            g0.v1(lxVar.getFragmentView());
                            hi.q4 b10 = hi.q4.b(qpVar.currentAccount, j3, user.f27105id, null, null, 4, 0, 0L, null, false, str, user, 0, z9, z10);
                            LaunchActivity launchActivity = LaunchActivity.G1;
                            if (launchActivity == null || launchActivity.O() == null || LaunchActivity.G1.O().k(b10) == null) {
                                hi.a3 a3Var = new hi.a3(lxVar.getContext(), lxVar.getResourceProvider());
                                a3Var.B(true);
                                a3Var.B0 = false;
                                a3Var.f14526l0 = lxVar.getParentActivity();
                                a3Var.x(lxVar, b10);
                                a3Var.show();
                                return;
                            }
                            return;
                        } else {
                            TL_bots.BotInfo botInfo = botInfoArr[0];
                            if (botInfo != null && (botInfo.menu_button instanceof TL_bots.TL_botMenuButton)) {
                                if (lxVar.getParentLayout() instanceof ActionBarLayout) {
                                    lxVar = ((ActionBarLayout) lxVar.getParentLayout()).getSheetFragment();
                                }
                                TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botInfoArr[0].menu_button;
                                g0.v1(lxVar.getFragmentView());
                                int i7 = qpVar.currentAccount;
                                long j10 = user.f27105id;
                                hi.q4 b11 = hi.q4.b(i7, j10, j10, tL_botMenuButton.text, tL_botMenuButton.url, 2, 0, 0L, null, false, str, user, 0, z9, z10);
                                LaunchActivity launchActivity2 = LaunchActivity.G1;
                                if (launchActivity2 == null || launchActivity2.O() == null || LaunchActivity.G1.O().k(b11) == null) {
                                    hi.a3 a3Var2 = new hi.a3(lxVar.getContext(), lxVar.getResourceProvider());
                                    a3Var2.B(false);
                                    a3Var2.B0 = true;
                                    a3Var2.f14526l0 = lxVar.getParentActivity();
                                    a3Var2.x(lxVar, b11);
                                    a3Var2.show();
                                    return;
                                }
                                return;
                            }
                            lxVar.presentFragment(org.telegram.ui.cn.ta(user.f27105id));
                            return;
                        }
                    }
                    return;
                }
                return;
            default:
                t7 t7Var = (t7) this.f26336e;
                boolean z11 = this.f26334b;
                String str2 = this.f26335c;
                boolean z12 = this.d;
                TLRPC.InputFile inputFile = (TLRPC.InputFile) this.f26337f;
                TLRPC.InputEncryptedFile inputEncryptedFile = (TLRPC.InputEncryptedFile) this.h;
                byte[] bArr = (byte[]) this.f26338n;
                byte[] bArr2 = (byte[]) this.f26339r;
                y8 y8Var3 = (y8) this.f26340s;
                if (z11) {
                    t7Var.d.f26268n.remove(str2);
                } else {
                    t7Var.d.h.remove(str2);
                }
                if (z12) {
                    w7 w7Var = t7Var.d;
                    int i10 = w7Var.f26270s - 1;
                    w7Var.f26270s = i10;
                    if (i10 < 1 && (y8Var2 = (y8) w7Var.f26267f.poll()) != null) {
                        t7Var.d.f26270s++;
                        y8Var2.c();
                    }
                } else {
                    w7 w7Var2 = t7Var.d;
                    int i11 = w7Var2.f26269r - 1;
                    w7Var2.f26269r = i11;
                    if (i11 < 1 && (y8Var = (y8) w7Var2.f26266e.poll()) != null) {
                        t7Var.d.f26269r++;
                        y8Var.c();
                    }
                }
                qb qbVar = t7Var.d.E;
                if (qbVar != null) {
                    Utilities.d.c(new hi.y0(qbVar, qbVar.f24686a, str2, inputFile, inputEncryptedFile, bArr, bArr2, y8Var3.f26616t));
                    return;
                }
                return;
        }
    }

    public wl(qp qpVar, org.telegram.ui.ActionBar.f2 f2Var, vf.b bVar, boolean[] zArr, TLRPC.User user, String str, boolean z9, boolean z10, TL_bots.BotInfo[] botInfoArr) {
        this.f26336e = qpVar;
        this.f26337f = f2Var;
        this.h = bVar;
        this.f26338n = zArr;
        this.f26339r = user;
        this.f26335c = str;
        this.f26334b = z9;
        this.d = z10;
        this.f26340s = botInfoArr;
    }
}
