package org.telegram.messenger;

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class rl implements Runnable {
    public final int f26626a = 0;
    public final boolean f26627b;
    public final String f26628c;
    public final boolean d;
    public final Object f26629e;
    public final Object f26630f;
    public final Object h;
    public final Object f26631n;
    public final Object f26632r;
    public final Object f26633s;

    public rl(t7 t7Var, boolean z10, String str, boolean z11, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, y8 y8Var) {
        this.f26629e = t7Var;
        this.f26627b = z10;
        this.f26628c = str;
        this.d = z11;
        this.f26630f = inputFile;
        this.h = inputEncryptedFile;
        this.f26631n = bArr;
        this.f26632r = bArr2;
        this.f26633s = y8Var;
    }

    @Override
    public final void run() {
        y8 y8Var;
        y8 y8Var2;
        switch (this.f26626a) {
            case 0:
                np npVar = (np) this.f26629e;
                org.telegram.ui.ox oxVar = (org.telegram.ui.ActionBar.g2) this.f26630f;
                vf.b bVar = (vf.b) this.h;
                boolean[] zArr = (boolean[]) this.f26631n;
                TLRPC.User user = (TLRPC.User) this.f26632r;
                String str = this.f26628c;
                boolean z10 = this.f26627b;
                boolean z11 = this.d;
                TL_bots.BotInfo[] botInfoArr = (TL_bots.BotInfo[]) this.f26633s;
                if (oxVar == null) {
                    oxVar = LaunchActivity.T();
                }
                if (oxVar != null) {
                    if (bVar != null) {
                        bVar.b();
                    }
                    if (!zArr[0]) {
                        String H1 = npVar.H1(user.restriction_reason);
                        if (!TextUtils.isEmpty(H1)) {
                            np.d5(H1, oxVar);
                            return;
                        } else if (user.bot_has_main_app) {
                            long j3 = user.f28583id;
                            if (oxVar instanceof org.telegram.ui.bn) {
                                j3 = ((org.telegram.ui.bn) oxVar).a();
                            } else if (oxVar instanceof ProfileActivity) {
                                j3 = ((ProfileActivity) oxVar).a();
                            }
                            if (oxVar.getParentLayout() instanceof ActionBarLayout) {
                                oxVar = ((ActionBarLayout) oxVar.getParentLayout()).getSheetFragment();
                            }
                            g0.v1(oxVar.getFragmentView());
                            ki.e4 b10 = ki.e4.b(npVar.currentAccount, j3, user.f28583id, null, null, 4, 0, 0L, null, false, str, user, 0, z10, z11);
                            LaunchActivity launchActivity = LaunchActivity.H1;
                            if (launchActivity == null || launchActivity.N() == null || LaunchActivity.H1.N().k(b10) == null) {
                                ki.s2 s2Var = new ki.s2(oxVar.getContext(), oxVar.getResourceProvider());
                                s2Var.B(true);
                                s2Var.C0 = false;
                                s2Var.m0 = oxVar.getParentActivity();
                                s2Var.x(oxVar, b10);
                                s2Var.show();
                                return;
                            }
                            return;
                        } else {
                            TL_bots.BotInfo botInfo = botInfoArr[0];
                            if (botInfo != null && (botInfo.menu_button instanceof TL_bots.TL_botMenuButton)) {
                                if (oxVar.getParentLayout() instanceof ActionBarLayout) {
                                    oxVar = ((ActionBarLayout) oxVar.getParentLayout()).getSheetFragment();
                                }
                                TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botInfoArr[0].menu_button;
                                g0.v1(oxVar.getFragmentView());
                                int i7 = npVar.currentAccount;
                                long j10 = user.f28583id;
                                ki.e4 b11 = ki.e4.b(i7, j10, j10, tL_botMenuButton.text, tL_botMenuButton.url, 2, 0, 0L, null, false, str, user, 0, z10, z11);
                                LaunchActivity launchActivity2 = LaunchActivity.H1;
                                if (launchActivity2 == null || launchActivity2.N() == null || LaunchActivity.H1.N().k(b11) == null) {
                                    ki.s2 s2Var2 = new ki.s2(oxVar.getContext(), oxVar.getResourceProvider());
                                    s2Var2.B(false);
                                    s2Var2.C0 = true;
                                    s2Var2.m0 = oxVar.getParentActivity();
                                    s2Var2.x(oxVar, b11);
                                    s2Var2.show();
                                    return;
                                }
                                return;
                            }
                            oxVar.presentFragment(org.telegram.ui.bn.ua(user.f28583id));
                            return;
                        }
                    }
                    return;
                }
                return;
            default:
                t7 t7Var = (t7) this.f26629e;
                boolean z12 = this.f26627b;
                String str2 = this.f26628c;
                boolean z13 = this.d;
                TLRPC.InputFile inputFile = (TLRPC.InputFile) this.f26630f;
                TLRPC.InputEncryptedFile inputEncryptedFile = (TLRPC.InputEncryptedFile) this.h;
                byte[] bArr = (byte[]) this.f26631n;
                byte[] bArr2 = (byte[]) this.f26632r;
                y8 y8Var3 = (y8) this.f26633s;
                if (z12) {
                    t7Var.d.f27698n.remove(str2);
                } else {
                    t7Var.d.h.remove(str2);
                }
                if (z13) {
                    w7 w7Var = t7Var.d;
                    int i10 = w7Var.f27700s - 1;
                    w7Var.f27700s = i10;
                    if (i10 < 1 && (y8Var2 = (y8) w7Var.f27697f.poll()) != null) {
                        t7Var.d.f27700s++;
                        y8Var2.c();
                    }
                } else {
                    w7 w7Var2 = t7Var.d;
                    int i11 = w7Var2.f27699r - 1;
                    w7Var2.f27699r = i11;
                    if (i11 < 1 && (y8Var = (y8) w7Var2.f27696e.poll()) != null) {
                        t7Var.d.f27699r++;
                        y8Var.c();
                    }
                }
                pb pbVar = t7Var.d.F;
                if (pbVar != null) {
                    Utilities.d.c(new ii.i(pbVar, pbVar.f26294a, str2, inputFile, inputEncryptedFile, bArr, bArr2, y8Var3.f28036t));
                    return;
                }
                return;
        }
    }

    public rl(np npVar, org.telegram.ui.ActionBar.g2 g2Var, vf.b bVar, boolean[] zArr, TLRPC.User user, String str, boolean z10, boolean z11, TL_bots.BotInfo[] botInfoArr) {
        this.f26629e = npVar;
        this.f26630f = g2Var;
        this.h = bVar;
        this.f26631n = zArr;
        this.f26632r = user;
        this.f26628c = str;
        this.f26627b = z10;
        this.d = z11;
        this.f26633s = botInfoArr;
    }
}
