package org.telegram.messenger;

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class am implements Runnable {
    public final int f14630a = 0;
    public final boolean f14631b;
    public final String f14632c;
    public final boolean d;
    public final Object e;
    public final Object f14633f;
    public final Object h;
    public final Object f14634n;
    public final Object f14635r;
    public final Object f14636s;

    public am(y7 y7Var, boolean z10, String str, boolean z11, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, d9 d9Var) {
        this.e = y7Var;
        this.f14631b = z10;
        this.f14632c = str;
        this.d = z11;
        this.f14633f = inputFile;
        this.h = inputEncryptedFile;
        this.f14634n = bArr;
        this.f14635r = bArr2;
        this.f14636s = d9Var;
    }

    @Override
    public final void run() {
        d9 d9Var;
        d9 d9Var2;
        switch (this.f14630a) {
            case 0:
                vp vpVar = (vp) this.e;
                org.telegram.ui.my myVar = (org.telegram.ui.ActionBar.k2) this.f14633f;
                gf.e eVar = (gf.e) this.h;
                boolean[] zArr = (boolean[]) this.f14634n;
                TLRPC.User user = (TLRPC.User) this.f14635r;
                String str = this.f14632c;
                boolean z10 = this.f14631b;
                boolean z11 = this.d;
                TL_bots.BotInfo[] botInfoArr = (TL_bots.BotInfo[]) this.f14636s;
                if (myVar == null) {
                    myVar = LaunchActivity.T();
                }
                if (myVar != null) {
                    if (eVar != null) {
                        eVar.b();
                    }
                    if (!zArr[0]) {
                        String E1 = vpVar.E1(user.restriction_reason);
                        if (!TextUtils.isEmpty(E1)) {
                            vp.O4(E1, myVar);
                            return;
                        } else if (user.bot_has_main_app) {
                            long j10 = user.f19942id;
                            if (myVar instanceof org.telegram.ui.un) {
                                j10 = ((org.telegram.ui.un) myVar).a();
                            } else if (myVar instanceof ProfileActivity) {
                                j10 = ((ProfileActivity) myVar).a();
                            }
                            if (myVar.getParentLayout() instanceof ActionBarLayout) {
                                myVar = ((ActionBarLayout) myVar.getParentLayout()).getSheetFragment();
                            }
                            i0.v1(myVar.getFragmentView());
                            xh.s3 b10 = xh.s3.b(vpVar.currentAccount, j10, user.f19942id, null, null, 4, 0, 0L, null, false, str, user, 0, z10, z11);
                            LaunchActivity launchActivity = LaunchActivity.I1;
                            if (launchActivity == null || launchActivity.O() == null || LaunchActivity.I1.O().m(b10) == null) {
                                xh.m2 m2Var = new xh.m2(myVar.getContext(), myVar.getResourceProvider());
                                m2Var.B(true);
                                m2Var.B0 = false;
                                m2Var.f53889l0 = myVar.getParentActivity();
                                m2Var.x(myVar, b10);
                                m2Var.show();
                                return;
                            }
                            return;
                        } else {
                            TL_bots.BotInfo botInfo = botInfoArr[0];
                            if (botInfo != null && (botInfo.menu_button instanceof TL_bots.TL_botMenuButton)) {
                                if (myVar.getParentLayout() instanceof ActionBarLayout) {
                                    myVar = ((ActionBarLayout) myVar.getParentLayout()).getSheetFragment();
                                }
                                TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botInfoArr[0].menu_button;
                                i0.v1(myVar.getFragmentView());
                                int i10 = vpVar.currentAccount;
                                long j11 = user.f19942id;
                                xh.s3 b11 = xh.s3.b(i10, j11, j11, tL_botMenuButton.text, tL_botMenuButton.url, 2, 0, 0L, null, false, str, user, 0, z10, z11);
                                LaunchActivity launchActivity2 = LaunchActivity.I1;
                                if (launchActivity2 == null || launchActivity2.O() == null || LaunchActivity.I1.O().m(b11) == null) {
                                    xh.m2 m2Var2 = new xh.m2(myVar.getContext(), myVar.getResourceProvider());
                                    m2Var2.B(false);
                                    m2Var2.B0 = true;
                                    m2Var2.f53889l0 = myVar.getParentActivity();
                                    m2Var2.x(myVar, b11);
                                    m2Var2.show();
                                    return;
                                }
                                return;
                            }
                            myVar.presentFragment(org.telegram.ui.un.ha(user.f19942id));
                            return;
                        }
                    }
                    return;
                }
                return;
            default:
                y7 y7Var = (y7) this.e;
                boolean z12 = this.f14631b;
                String str2 = this.f14632c;
                boolean z13 = this.d;
                TLRPC.InputFile inputFile = (TLRPC.InputFile) this.f14633f;
                TLRPC.InputEncryptedFile inputEncryptedFile = (TLRPC.InputEncryptedFile) this.h;
                byte[] bArr = (byte[]) this.f14634n;
                byte[] bArr2 = (byte[]) this.f14635r;
                d9 d9Var3 = (d9) this.f14636s;
                if (z12) {
                    y7Var.d.f14743n.remove(str2);
                } else {
                    y7Var.d.h.remove(str2);
                }
                if (z13) {
                    b8 b8Var = y7Var.d;
                    int i11 = b8Var.f14745s - 1;
                    b8Var.f14745s = i11;
                    if (i11 < 1 && (d9Var2 = (d9) b8Var.f14742f.poll()) != null) {
                        y7Var.d.f14745s++;
                        d9Var2.c();
                    }
                } else {
                    b8 b8Var2 = y7Var.d;
                    int i12 = b8Var2.f14744r - 1;
                    b8Var2.f14744r = i12;
                    if (i12 < 1 && (d9Var = (d9) b8Var2.e.poll()) != null) {
                        y7Var.d.f14744r++;
                        d9Var.c();
                    }
                }
                rb rbVar = y7Var.d.E;
                if (rbVar != null) {
                    Utilities.d.c(new pb(rbVar, rbVar.f17712a, str2, inputFile, inputEncryptedFile, bArr, bArr2, d9Var3.f15211t));
                    return;
                }
                return;
        }
    }

    public am(vp vpVar, org.telegram.ui.ActionBar.k2 k2Var, gf.e eVar, boolean[] zArr, TLRPC.User user, String str, boolean z10, boolean z11, TL_bots.BotInfo[] botInfoArr) {
        this.e = vpVar;
        this.f14633f = k2Var;
        this.h = eVar;
        this.f14634n = zArr;
        this.f14635r = user;
        this.f14632c = str;
        this.f14631b = z10;
        this.d = z11;
        this.f14636s = botInfoArr;
    }
}
