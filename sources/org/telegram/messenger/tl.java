package org.telegram.messenger;

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class tl implements Runnable {
    public final int f26699a = 0;
    public final boolean f26700b;
    public final String f26701c;
    public final boolean d;
    public final Object f26702e;
    public final Object f26703f;
    public final Object h;
    public final Object f26704n;
    public final Object f26705r;
    public final Object f26706s;

    public tl(t7 t7Var, boolean z10, String str, boolean z11, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, y8 y8Var) {
        this.f26702e = t7Var;
        this.f26700b = z10;
        this.f26701c = str;
        this.d = z11;
        this.f26703f = inputFile;
        this.h = inputEncryptedFile;
        this.f26704n = bArr;
        this.f26705r = bArr2;
        this.f26706s = y8Var;
    }

    @Override
    public final void run() {
        y8 y8Var;
        y8 y8Var2;
        switch (this.f26699a) {
            case 0:
                np npVar = (np) this.f26702e;
                org.telegram.ui.kx kxVar = (org.telegram.ui.ActionBar.e2) this.f26703f;
                vf.b bVar = (vf.b) this.h;
                boolean[] zArr = (boolean[]) this.f26704n;
                TLRPC.User user = (TLRPC.User) this.f26705r;
                String str = this.f26701c;
                boolean z10 = this.f26700b;
                boolean z11 = this.d;
                TL_bots.BotInfo[] botInfoArr = (TL_bots.BotInfo[]) this.f26706s;
                if (kxVar == null) {
                    kxVar = LaunchActivity.T();
                }
                if (kxVar != null) {
                    if (bVar != null) {
                        bVar.b();
                    }
                    if (!zArr[0]) {
                        String F1 = npVar.F1(user.restriction_reason);
                        if (!TextUtils.isEmpty(F1)) {
                            np.S4(F1, kxVar);
                            return;
                        } else if (user.bot_has_main_app) {
                            long j3 = user.f28200id;
                            if (kxVar instanceof org.telegram.ui.an) {
                                j3 = ((org.telegram.ui.an) kxVar).a();
                            } else if (kxVar instanceof ProfileActivity) {
                                j3 = ((ProfileActivity) kxVar).a();
                            }
                            if (kxVar.getParentLayout() instanceof ActionBarLayout) {
                                kxVar = ((ActionBarLayout) kxVar.getParentLayout()).getSheetFragment();
                            }
                            g0.v1(kxVar.getFragmentView());
                            ki.k4 b10 = ki.k4.b(npVar.currentAccount, j3, user.f28200id, null, null, 4, 0, 0L, null, false, str, user, 0, z10, z11);
                            LaunchActivity launchActivity = LaunchActivity.H1;
                            if (launchActivity == null || launchActivity.N() == null || LaunchActivity.H1.N().k(b10) == null) {
                                ki.x2 x2Var = new ki.x2(kxVar.getContext(), kxVar.getResourceProvider());
                                x2Var.B(true);
                                x2Var.C0 = false;
                                x2Var.m0 = kxVar.getParentActivity();
                                x2Var.x(kxVar, b10);
                                x2Var.show();
                                return;
                            }
                            return;
                        } else {
                            TL_bots.BotInfo botInfo = botInfoArr[0];
                            if (botInfo != null && (botInfo.menu_button instanceof TL_bots.TL_botMenuButton)) {
                                if (kxVar.getParentLayout() instanceof ActionBarLayout) {
                                    kxVar = ((ActionBarLayout) kxVar.getParentLayout()).getSheetFragment();
                                }
                                TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botInfoArr[0].menu_button;
                                g0.v1(kxVar.getFragmentView());
                                int i7 = npVar.currentAccount;
                                long j10 = user.f28200id;
                                ki.k4 b11 = ki.k4.b(i7, j10, j10, tL_botMenuButton.text, tL_botMenuButton.url, 2, 0, 0L, null, false, str, user, 0, z10, z11);
                                LaunchActivity launchActivity2 = LaunchActivity.H1;
                                if (launchActivity2 == null || launchActivity2.N() == null || LaunchActivity.H1.N().k(b11) == null) {
                                    ki.x2 x2Var2 = new ki.x2(kxVar.getContext(), kxVar.getResourceProvider());
                                    x2Var2.B(false);
                                    x2Var2.C0 = true;
                                    x2Var2.m0 = kxVar.getParentActivity();
                                    x2Var2.x(kxVar, b11);
                                    x2Var2.show();
                                    return;
                                }
                                return;
                            }
                            kxVar.presentFragment(org.telegram.ui.an.ua(user.f28200id));
                            return;
                        }
                    }
                    return;
                }
                return;
            default:
                t7 t7Var = (t7) this.f26702e;
                boolean z12 = this.f26700b;
                String str2 = this.f26701c;
                boolean z13 = this.d;
                TLRPC.InputFile inputFile = (TLRPC.InputFile) this.f26703f;
                TLRPC.InputEncryptedFile inputEncryptedFile = (TLRPC.InputEncryptedFile) this.h;
                byte[] bArr = (byte[]) this.f26704n;
                byte[] bArr2 = (byte[]) this.f26705r;
                y8 y8Var3 = (y8) this.f26706s;
                if (z12) {
                    t7Var.d.f27311n.remove(str2);
                } else {
                    t7Var.d.h.remove(str2);
                }
                if (z13) {
                    w7 w7Var = t7Var.d;
                    int i10 = w7Var.f27313s - 1;
                    w7Var.f27313s = i10;
                    if (i10 < 1 && (y8Var2 = (y8) w7Var.f27310f.poll()) != null) {
                        t7Var.d.f27313s++;
                        y8Var2.c();
                    }
                } else {
                    w7 w7Var2 = t7Var.d;
                    int i11 = w7Var2.f27312r - 1;
                    w7Var2.f27312r = i11;
                    if (i11 < 1 && (y8Var = (y8) w7Var2.f27309e.poll()) != null) {
                        t7Var.d.f27312r++;
                        y8Var.c();
                    }
                }
                pb pbVar = t7Var.d.F;
                if (pbVar != null) {
                    Utilities.d.c(new ki.z0(pbVar, pbVar.f25920a, str2, inputFile, inputEncryptedFile, bArr, bArr2, y8Var3.f27687t));
                    return;
                }
                return;
        }
    }

    public tl(np npVar, org.telegram.ui.ActionBar.e2 e2Var, vf.b bVar, boolean[] zArr, TLRPC.User user, String str, boolean z10, boolean z11, TL_bots.BotInfo[] botInfoArr) {
        this.f26702e = npVar;
        this.f26703f = e2Var;
        this.h = bVar;
        this.f26704n = zArr;
        this.f26705r = user;
        this.f26701c = str;
        this.f26700b = z10;
        this.d = z11;
        this.f26706s = botInfoArr;
    }
}
