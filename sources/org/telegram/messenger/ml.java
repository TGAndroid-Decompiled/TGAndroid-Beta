package org.telegram.messenger;

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class ml implements Runnable {
    public final int f24219a = 0;
    public final boolean f24220b;
    public final String f24221c;
    public final boolean d;
    public final Object f24222e;
    public final Object f24223f;
    public final Object h;
    public final Object f24224n;
    public final Object f24225r;
    public final Object f24226s;

    public ml(t7 t7Var, boolean z10, String str, boolean z11, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, y8 y8Var) {
        this.f24222e = t7Var;
        this.f24220b = z10;
        this.f24221c = str;
        this.d = z11;
        this.f24223f = inputFile;
        this.h = inputEncryptedFile;
        this.f24224n = bArr;
        this.f24225r = bArr2;
        this.f24226s = y8Var;
    }

    @Override
    public final void run() {
        y8 y8Var;
        y8 y8Var2;
        switch (this.f24219a) {
            case 0:
                hp hpVar = (hp) this.f24222e;
                org.telegram.ui.gx gxVar = (org.telegram.ui.ActionBar.d2) this.f24223f;
                sf.b bVar = (sf.b) this.h;
                boolean[] zArr = (boolean[]) this.f24224n;
                TLRPC.User user = (TLRPC.User) this.f24225r;
                String str = this.f24221c;
                boolean z10 = this.f24220b;
                boolean z11 = this.d;
                TL_bots.BotInfo[] botInfoArr = (TL_bots.BotInfo[]) this.f24226s;
                if (gxVar == null) {
                    gxVar = LaunchActivity.T();
                }
                if (gxVar != null) {
                    if (bVar != null) {
                        bVar.b();
                    }
                    if (!zArr[0]) {
                        String F1 = hpVar.F1(user.restriction_reason);
                        if (!TextUtils.isEmpty(F1)) {
                            hp.R4(F1, gxVar);
                            return;
                        } else if (user.bot_has_main_app) {
                            long j10 = user.f27150id;
                            if (gxVar instanceof org.telegram.ui.wm) {
                                j10 = ((org.telegram.ui.wm) gxVar).a();
                            } else if (gxVar instanceof ProfileActivity) {
                                j10 = ((ProfileActivity) gxVar).a();
                            }
                            if (gxVar.getParentLayout() instanceof ActionBarLayout) {
                                gxVar = ((ActionBarLayout) gxVar.getParentLayout()).getSheetFragment();
                            }
                            g0.v1(gxVar.getFragmentView());
                            ii.q4 b10 = ii.q4.b(hpVar.currentAccount, j10, user.f27150id, null, null, 4, 0, 0L, null, false, str, user, 0, z10, z11);
                            LaunchActivity launchActivity = LaunchActivity.K1;
                            if (launchActivity == null || launchActivity.O() == null || LaunchActivity.K1.O().k(b10) == null) {
                                ii.a3 a3Var = new ii.a3(gxVar.getContext(), gxVar.getResourceProvider());
                                a3Var.B(true);
                                a3Var.C0 = false;
                                a3Var.m0 = gxVar.getParentActivity();
                                a3Var.x(gxVar, b10);
                                a3Var.show();
                                return;
                            }
                            return;
                        } else {
                            TL_bots.BotInfo botInfo = botInfoArr[0];
                            if (botInfo != null && (botInfo.menu_button instanceof TL_bots.TL_botMenuButton)) {
                                if (gxVar.getParentLayout() instanceof ActionBarLayout) {
                                    gxVar = ((ActionBarLayout) gxVar.getParentLayout()).getSheetFragment();
                                }
                                TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botInfoArr[0].menu_button;
                                g0.v1(gxVar.getFragmentView());
                                int i3 = hpVar.currentAccount;
                                long j11 = user.f27150id;
                                ii.q4 b11 = ii.q4.b(i3, j11, j11, tL_botMenuButton.text, tL_botMenuButton.url, 2, 0, 0L, null, false, str, user, 0, z10, z11);
                                LaunchActivity launchActivity2 = LaunchActivity.K1;
                                if (launchActivity2 == null || launchActivity2.O() == null || LaunchActivity.K1.O().k(b11) == null) {
                                    ii.a3 a3Var2 = new ii.a3(gxVar.getContext(), gxVar.getResourceProvider());
                                    a3Var2.B(false);
                                    a3Var2.C0 = true;
                                    a3Var2.m0 = gxVar.getParentActivity();
                                    a3Var2.x(gxVar, b11);
                                    a3Var2.show();
                                    return;
                                }
                                return;
                            }
                            gxVar.presentFragment(org.telegram.ui.wm.ra(user.f27150id));
                            return;
                        }
                    }
                    return;
                }
                return;
            default:
                t7 t7Var = (t7) this.f24222e;
                boolean z12 = this.f24220b;
                String str2 = this.f24221c;
                boolean z13 = this.d;
                TLRPC.InputFile inputFile = (TLRPC.InputFile) this.f24223f;
                TLRPC.InputEncryptedFile inputEncryptedFile = (TLRPC.InputEncryptedFile) this.h;
                byte[] bArr = (byte[]) this.f24224n;
                byte[] bArr2 = (byte[]) this.f24225r;
                y8 y8Var3 = (y8) this.f24226s;
                if (z12) {
                    t7Var.d.f26171n.remove(str2);
                } else {
                    t7Var.d.h.remove(str2);
                }
                if (z13) {
                    w7 w7Var = t7Var.d;
                    int i10 = w7Var.f26173s - 1;
                    w7Var.f26173s = i10;
                    if (i10 < 1 && (y8Var2 = (y8) w7Var.f26170f.poll()) != null) {
                        t7Var.d.f26173s++;
                        y8Var2.c();
                    }
                } else {
                    w7 w7Var2 = t7Var.d;
                    int i11 = w7Var2.f26172r - 1;
                    w7Var2.f26172r = i11;
                    if (i11 < 1 && (y8Var = (y8) w7Var2.f26169e.poll()) != null) {
                        t7Var.d.f26172r++;
                        y8Var.c();
                    }
                }
                jb jbVar = t7Var.d.F;
                if (jbVar != null) {
                    Utilities.d.c(new ii.z0(jbVar, jbVar.f23658a, str2, inputFile, inputEncryptedFile, bArr, bArr2, y8Var3.f26551t));
                    return;
                }
                return;
        }
    }

    public ml(hp hpVar, org.telegram.ui.ActionBar.d2 d2Var, sf.b bVar, boolean[] zArr, TLRPC.User user, String str, boolean z10, boolean z11, TL_bots.BotInfo[] botInfoArr) {
        this.f24222e = hpVar;
        this.f24223f = d2Var;
        this.h = bVar;
        this.f24224n = zArr;
        this.f24225r = user;
        this.f24221c = str;
        this.f24220b = z10;
        this.d = z11;
        this.f24226s = botInfoArr;
    }
}
