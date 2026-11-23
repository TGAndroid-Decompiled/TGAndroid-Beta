package org.telegram.messenger;

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class ql implements Runnable {
    public final int f26527a = 0;
    public final boolean f26528b;
    public final String f26529c;
    public final boolean d;
    public final Object f26530e;
    public final Object f26531f;
    public final Object h;
    public final Object f26532n;
    public final Object f26533r;
    public final Object f26534s;

    public ql(t7 t7Var, boolean z10, String str, boolean z11, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, x8 x8Var) {
        this.f26530e = t7Var;
        this.f26528b = z10;
        this.f26529c = str;
        this.d = z11;
        this.f26531f = inputFile;
        this.h = inputEncryptedFile;
        this.f26532n = bArr;
        this.f26533r = bArr2;
        this.f26534s = x8Var;
    }

    @Override
    public final void run() {
        x8 x8Var;
        x8 x8Var2;
        switch (this.f26527a) {
            case 0:
                mp mpVar = (mp) this.f26530e;
                org.telegram.ui.nx nxVar = (org.telegram.ui.ActionBar.g2) this.f26531f;
                vf.b bVar = (vf.b) this.h;
                boolean[] zArr = (boolean[]) this.f26532n;
                TLRPC.User user = (TLRPC.User) this.f26533r;
                String str = this.f26529c;
                boolean z10 = this.f26528b;
                boolean z11 = this.d;
                TL_bots.BotInfo[] botInfoArr = (TL_bots.BotInfo[]) this.f26534s;
                if (nxVar == null) {
                    nxVar = LaunchActivity.T();
                }
                if (nxVar != null) {
                    if (bVar != null) {
                        bVar.b();
                    }
                    if (!zArr[0]) {
                        String H1 = mpVar.H1(user.restriction_reason);
                        if (!TextUtils.isEmpty(H1)) {
                            mp.d5(H1, nxVar);
                            return;
                        } else if (user.bot_has_main_app) {
                            long j3 = user.f28641id;
                            if (nxVar instanceof org.telegram.ui.bn) {
                                j3 = ((org.telegram.ui.bn) nxVar).a();
                            } else if (nxVar instanceof ProfileActivity) {
                                j3 = ((ProfileActivity) nxVar).a();
                            }
                            if (nxVar.getParentLayout() instanceof ActionBarLayout) {
                                nxVar = ((ActionBarLayout) nxVar.getParentLayout()).getSheetFragment();
                            }
                            g0.v1(nxVar.getFragmentView());
                            ki.f4 b10 = ki.f4.b(mpVar.currentAccount, j3, user.f28641id, null, null, 4, 0, 0L, null, false, str, user, 0, z10, z11);
                            LaunchActivity launchActivity = LaunchActivity.H1;
                            if (launchActivity == null || launchActivity.N() == null || LaunchActivity.H1.N().k(b10) == null) {
                                ki.t2 t2Var = new ki.t2(nxVar.getContext(), nxVar.getResourceProvider());
                                t2Var.B(true);
                                t2Var.C0 = false;
                                t2Var.m0 = nxVar.getParentActivity();
                                t2Var.x(nxVar, b10);
                                t2Var.show();
                                return;
                            }
                            return;
                        } else {
                            TL_bots.BotInfo botInfo = botInfoArr[0];
                            if (botInfo != null && (botInfo.menu_button instanceof TL_bots.TL_botMenuButton)) {
                                if (nxVar.getParentLayout() instanceof ActionBarLayout) {
                                    nxVar = ((ActionBarLayout) nxVar.getParentLayout()).getSheetFragment();
                                }
                                TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botInfoArr[0].menu_button;
                                g0.v1(nxVar.getFragmentView());
                                int i7 = mpVar.currentAccount;
                                long j10 = user.f28641id;
                                ki.f4 b11 = ki.f4.b(i7, j10, j10, tL_botMenuButton.text, tL_botMenuButton.url, 2, 0, 0L, null, false, str, user, 0, z10, z11);
                                LaunchActivity launchActivity2 = LaunchActivity.H1;
                                if (launchActivity2 == null || launchActivity2.N() == null || LaunchActivity.H1.N().k(b11) == null) {
                                    ki.t2 t2Var2 = new ki.t2(nxVar.getContext(), nxVar.getResourceProvider());
                                    t2Var2.B(false);
                                    t2Var2.C0 = true;
                                    t2Var2.m0 = nxVar.getParentActivity();
                                    t2Var2.x(nxVar, b11);
                                    t2Var2.show();
                                    return;
                                }
                                return;
                            }
                            nxVar.presentFragment(org.telegram.ui.bn.ua(user.f28641id));
                            return;
                        }
                    }
                    return;
                }
                return;
            default:
                t7 t7Var = (t7) this.f26530e;
                boolean z12 = this.f26528b;
                String str2 = this.f26529c;
                boolean z13 = this.d;
                TLRPC.InputFile inputFile = (TLRPC.InputFile) this.f26531f;
                TLRPC.InputEncryptedFile inputEncryptedFile = (TLRPC.InputEncryptedFile) this.h;
                byte[] bArr = (byte[]) this.f26532n;
                byte[] bArr2 = (byte[]) this.f26533r;
                x8 x8Var3 = (x8) this.f26534s;
                if (z12) {
                    t7Var.d.f27747n.remove(str2);
                } else {
                    t7Var.d.h.remove(str2);
                }
                if (z13) {
                    w7 w7Var = t7Var.d;
                    int i10 = w7Var.f27749s - 1;
                    w7Var.f27749s = i10;
                    if (i10 < 1 && (x8Var2 = (x8) w7Var.f27746f.poll()) != null) {
                        t7Var.d.f27749s++;
                        x8Var2.c();
                    }
                } else {
                    w7 w7Var2 = t7Var.d;
                    int i11 = w7Var2.f27748r - 1;
                    w7Var2.f27748r = i11;
                    if (i11 < 1 && (x8Var = (x8) w7Var2.f27745e.poll()) != null) {
                        t7Var.d.f27748r++;
                        x8Var.c();
                    }
                }
                ob obVar = t7Var.d.F;
                if (obVar != null) {
                    Utilities.d.c(new ii.i(obVar, obVar.f26145a, str2, inputFile, inputEncryptedFile, bArr, bArr2, x8Var3.f27940t));
                    return;
                }
                return;
        }
    }

    public ql(mp mpVar, org.telegram.ui.ActionBar.g2 g2Var, vf.b bVar, boolean[] zArr, TLRPC.User user, String str, boolean z10, boolean z11, TL_bots.BotInfo[] botInfoArr) {
        this.f26530e = mpVar;
        this.f26531f = g2Var;
        this.h = bVar;
        this.f26532n = zArr;
        this.f26533r = user;
        this.f26529c = str;
        this.f26528b = z10;
        this.d = z11;
        this.f26534s = botInfoArr;
    }
}
