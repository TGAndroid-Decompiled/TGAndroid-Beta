package org.telegram.messenger;

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class bm implements Runnable {
    public final int f14985a = 0;
    public final boolean f14986b;
    public final String f14987c;
    public final boolean d;
    public final Object e;
    public final Object f14988f;
    public final Object h;
    public final Object f14989n;
    public final Object f14990r;
    public final Object f14991s;

    public bm(y7 y7Var, boolean z10, String str, boolean z11, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, d9 d9Var) {
        this.e = y7Var;
        this.f14986b = z10;
        this.f14987c = str;
        this.d = z11;
        this.f14988f = inputFile;
        this.h = inputEncryptedFile;
        this.f14989n = bArr;
        this.f14990r = bArr2;
        this.f14991s = d9Var;
    }

    @Override
    public final void run() {
        d9 d9Var;
        d9 d9Var2;
        switch (this.f14985a) {
            case 0:
                wp wpVar = (wp) this.e;
                org.telegram.ui.ly lyVar = (org.telegram.ui.ActionBar.k2) this.f14988f;
                gf.e eVar = (gf.e) this.h;
                boolean[] zArr = (boolean[]) this.f14989n;
                TLRPC.User user = (TLRPC.User) this.f14990r;
                String str = this.f14987c;
                boolean z10 = this.f14986b;
                boolean z11 = this.d;
                TL_bots.BotInfo[] botInfoArr = (TL_bots.BotInfo[]) this.f14991s;
                if (lyVar == null) {
                    lyVar = LaunchActivity.T();
                }
                if (lyVar != null) {
                    if (eVar != null) {
                        eVar.b();
                    }
                    if (!zArr[0]) {
                        String E1 = wpVar.E1(user.restriction_reason);
                        if (!TextUtils.isEmpty(E1)) {
                            wp.O4(E1, lyVar);
                            return;
                        } else if (user.bot_has_main_app) {
                            long j10 = user.f19943id;
                            if (lyVar instanceof org.telegram.ui.un) {
                                j10 = ((org.telegram.ui.un) lyVar).a();
                            } else if (lyVar instanceof ProfileActivity) {
                                j10 = ((ProfileActivity) lyVar).a();
                            }
                            if (lyVar.getParentLayout() instanceof ActionBarLayout) {
                                lyVar = ((ActionBarLayout) lyVar.getParentLayout()).getSheetFragment();
                            }
                            i0.v1(lyVar.getFragmentView());
                            xh.t3 b10 = xh.t3.b(wpVar.currentAccount, j10, user.f19943id, null, null, 4, 0, 0L, null, false, str, user, 0, z10, z11);
                            LaunchActivity launchActivity = LaunchActivity.I1;
                            if (launchActivity == null || launchActivity.N() == null || LaunchActivity.I1.N().m(b10) == null) {
                                xh.m2 m2Var = new xh.m2(lyVar.getContext(), lyVar.getResourceProvider());
                                m2Var.B(true);
                                m2Var.B0 = false;
                                m2Var.f53906l0 = lyVar.getParentActivity();
                                m2Var.x(lyVar, b10);
                                m2Var.show();
                                return;
                            }
                            return;
                        } else {
                            TL_bots.BotInfo botInfo = botInfoArr[0];
                            if (botInfo != null && (botInfo.menu_button instanceof TL_bots.TL_botMenuButton)) {
                                if (lyVar.getParentLayout() instanceof ActionBarLayout) {
                                    lyVar = ((ActionBarLayout) lyVar.getParentLayout()).getSheetFragment();
                                }
                                TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botInfoArr[0].menu_button;
                                i0.v1(lyVar.getFragmentView());
                                int i10 = wpVar.currentAccount;
                                long j11 = user.f19943id;
                                xh.t3 b11 = xh.t3.b(i10, j11, j11, tL_botMenuButton.text, tL_botMenuButton.url, 2, 0, 0L, null, false, str, user, 0, z10, z11);
                                LaunchActivity launchActivity2 = LaunchActivity.I1;
                                if (launchActivity2 == null || launchActivity2.N() == null || LaunchActivity.I1.N().m(b11) == null) {
                                    xh.m2 m2Var2 = new xh.m2(lyVar.getContext(), lyVar.getResourceProvider());
                                    m2Var2.B(false);
                                    m2Var2.B0 = true;
                                    m2Var2.f53906l0 = lyVar.getParentActivity();
                                    m2Var2.x(lyVar, b11);
                                    m2Var2.show();
                                    return;
                                }
                                return;
                            }
                            lyVar.presentFragment(org.telegram.ui.un.ma(user.f19943id));
                            return;
                        }
                    }
                    return;
                }
                return;
            default:
                y7 y7Var = (y7) this.e;
                boolean z12 = this.f14986b;
                String str2 = this.f14987c;
                boolean z13 = this.d;
                TLRPC.InputFile inputFile = (TLRPC.InputFile) this.f14988f;
                TLRPC.InputEncryptedFile inputEncryptedFile = (TLRPC.InputEncryptedFile) this.h;
                byte[] bArr = (byte[]) this.f14989n;
                byte[] bArr2 = (byte[]) this.f14990r;
                d9 d9Var3 = (d9) this.f14991s;
                if (z12) {
                    y7Var.d.f14943n.remove(str2);
                } else {
                    y7Var.d.h.remove(str2);
                }
                if (z13) {
                    b8 b8Var = y7Var.d;
                    int i11 = b8Var.f14945s - 1;
                    b8Var.f14945s = i11;
                    if (i11 < 1 && (d9Var2 = (d9) b8Var.f14942f.poll()) != null) {
                        y7Var.d.f14945s++;
                        d9Var2.c();
                    }
                } else {
                    b8 b8Var2 = y7Var.d;
                    int i12 = b8Var2.f14944r - 1;
                    b8Var2.f14944r = i12;
                    if (i12 < 1 && (d9Var = (d9) b8Var2.e.poll()) != null) {
                        y7Var.d.f14944r++;
                        d9Var.c();
                    }
                }
                sb sbVar = y7Var.d.E;
                if (sbVar != null) {
                    Utilities.d.c(new qb(sbVar, sbVar.f18076a, str2, inputFile, inputEncryptedFile, bArr, bArr2, d9Var3.f15326t));
                    return;
                }
                return;
        }
    }

    public bm(wp wpVar, org.telegram.ui.ActionBar.k2 k2Var, gf.e eVar, boolean[] zArr, TLRPC.User user, String str, boolean z10, boolean z11, TL_bots.BotInfo[] botInfoArr) {
        this.e = wpVar;
        this.f14988f = k2Var;
        this.h = eVar;
        this.f14989n = zArr;
        this.f14990r = user;
        this.f14987c = str;
        this.f14986b = z10;
        this.d = z11;
        this.f14991s = botInfoArr;
    }
}
