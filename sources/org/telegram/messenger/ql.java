package org.telegram.messenger;

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class ql implements Runnable {
    public final int f26417a = 0;
    public final boolean f26418b;
    public final String f26419c;
    public final boolean d;
    public final Object f26420e;
    public final Object f26421f;
    public final Object h;
    public final Object f26422n;
    public final Object f26423r;
    public final Object f26424s;

    public ql(t7 t7Var, boolean z10, String str, boolean z11, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, y8 y8Var) {
        this.f26420e = t7Var;
        this.f26418b = z10;
        this.f26419c = str;
        this.d = z11;
        this.f26421f = inputFile;
        this.h = inputEncryptedFile;
        this.f26422n = bArr;
        this.f26423r = bArr2;
        this.f26424s = y8Var;
    }

    @Override
    public final void run() {
        y8 y8Var;
        y8 y8Var2;
        switch (this.f26417a) {
            case 0:
                mp mpVar = (mp) this.f26420e;
                org.telegram.ui.ox oxVar = (org.telegram.ui.ActionBar.h2) this.f26421f;
                vf.b bVar = (vf.b) this.h;
                boolean[] zArr = (boolean[]) this.f26422n;
                TLRPC.User user = (TLRPC.User) this.f26423r;
                String str = this.f26419c;
                boolean z10 = this.f26418b;
                boolean z11 = this.d;
                TL_bots.BotInfo[] botInfoArr = (TL_bots.BotInfo[]) this.f26424s;
                if (oxVar == null) {
                    oxVar = LaunchActivity.T();
                }
                if (oxVar != null) {
                    if (bVar != null) {
                        bVar.b();
                    }
                    if (!zArr[0]) {
                        String H1 = mpVar.H1(user.restriction_reason);
                        if (!TextUtils.isEmpty(H1)) {
                            mp.d5(H1, oxVar);
                            return;
                        } else if (user.bot_has_main_app) {
                            long j3 = user.f28554id;
                            if (oxVar instanceof org.telegram.ui.bn) {
                                j3 = ((org.telegram.ui.bn) oxVar).a();
                            } else if (oxVar instanceof ProfileActivity) {
                                j3 = ((ProfileActivity) oxVar).a();
                            }
                            if (oxVar.getParentLayout() instanceof ActionBarLayout) {
                                oxVar = ((ActionBarLayout) oxVar.getParentLayout()).getSheetFragment();
                            }
                            g0.v1(oxVar.getFragmentView());
                            ki.f4 b10 = ki.f4.b(mpVar.currentAccount, j3, user.f28554id, null, null, 4, 0, 0L, null, false, str, user, 0, z10, z11);
                            LaunchActivity launchActivity = LaunchActivity.H1;
                            if (launchActivity == null || launchActivity.N() == null || LaunchActivity.H1.N().k(b10) == null) {
                                ki.t2 t2Var = new ki.t2(oxVar.getContext(), oxVar.getResourceProvider());
                                t2Var.B(true);
                                t2Var.C0 = false;
                                t2Var.m0 = oxVar.getParentActivity();
                                t2Var.x(oxVar, b10);
                                t2Var.show();
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
                                int i7 = mpVar.currentAccount;
                                long j10 = user.f28554id;
                                ki.f4 b11 = ki.f4.b(i7, j10, j10, tL_botMenuButton.text, tL_botMenuButton.url, 2, 0, 0L, null, false, str, user, 0, z10, z11);
                                LaunchActivity launchActivity2 = LaunchActivity.H1;
                                if (launchActivity2 == null || launchActivity2.N() == null || LaunchActivity.H1.N().k(b11) == null) {
                                    ki.t2 t2Var2 = new ki.t2(oxVar.getContext(), oxVar.getResourceProvider());
                                    t2Var2.B(false);
                                    t2Var2.C0 = true;
                                    t2Var2.m0 = oxVar.getParentActivity();
                                    t2Var2.x(oxVar, b11);
                                    t2Var2.show();
                                    return;
                                }
                                return;
                            }
                            oxVar.presentFragment(org.telegram.ui.bn.ua(user.f28554id));
                            return;
                        }
                    }
                    return;
                }
                return;
            default:
                t7 t7Var = (t7) this.f26420e;
                boolean z12 = this.f26418b;
                String str2 = this.f26419c;
                boolean z13 = this.d;
                TLRPC.InputFile inputFile = (TLRPC.InputFile) this.f26421f;
                TLRPC.InputEncryptedFile inputEncryptedFile = (TLRPC.InputEncryptedFile) this.h;
                byte[] bArr = (byte[]) this.f26422n;
                byte[] bArr2 = (byte[]) this.f26423r;
                y8 y8Var3 = (y8) this.f26424s;
                if (z12) {
                    t7Var.d.f27654n.remove(str2);
                } else {
                    t7Var.d.h.remove(str2);
                }
                if (z13) {
                    w7 w7Var = t7Var.d;
                    int i10 = w7Var.f27656s - 1;
                    w7Var.f27656s = i10;
                    if (i10 < 1 && (y8Var2 = (y8) w7Var.f27653f.poll()) != null) {
                        t7Var.d.f27656s++;
                        y8Var2.c();
                    }
                } else {
                    w7 w7Var2 = t7Var.d;
                    int i11 = w7Var2.f27655r - 1;
                    w7Var2.f27655r = i11;
                    if (i11 < 1 && (y8Var = (y8) w7Var2.f27652e.poll()) != null) {
                        t7Var.d.f27655r++;
                        y8Var.c();
                    }
                }
                ob obVar = t7Var.d.F;
                if (obVar != null) {
                    Utilities.d.c(new ii.i(obVar, obVar.f26050a, str2, inputFile, inputEncryptedFile, bArr, bArr2, y8Var3.f28103t));
                    return;
                }
                return;
        }
    }

    public ql(mp mpVar, org.telegram.ui.ActionBar.h2 h2Var, vf.b bVar, boolean[] zArr, TLRPC.User user, String str, boolean z10, boolean z11, TL_bots.BotInfo[] botInfoArr) {
        this.f26420e = mpVar;
        this.f26421f = h2Var;
        this.h = bVar;
        this.f26422n = zArr;
        this.f26423r = user;
        this.f26419c = str;
        this.f26418b = z10;
        this.d = z11;
        this.f26424s = botInfoArr;
    }
}
