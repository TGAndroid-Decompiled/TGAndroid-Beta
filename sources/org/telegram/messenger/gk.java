package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class gk implements x10 {
    public final int f24266a = 2;
    public final mp f24267b;
    public final Object f24268c;
    public final int d;
    public final Object f24269e;
    public final Object f24270f;
    public final Object f24271g;

    public gk(mp mpVar, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i7, TLRPC.Chat chat, Runnable runnable) {
        this.f24267b = mpVar;
        this.f24269e = tL_messages_invitedUsers;
        this.f24270f = iArr;
        this.d = i7;
        this.f24271g = chat;
        this.f24268c = runnable;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f24266a;
        Object obj2 = this.f24268c;
        Object obj3 = this.f24271g;
        int i10 = this.d;
        Object obj4 = this.f24270f;
        Object obj5 = this.f24269e;
        mp mpVar = this.f24267b;
        switch (i7) {
            case 0:
                vf.b bVar = (vf.b) obj5;
                org.telegram.ui.ActionBar.u1[] u1VarArr = (org.telegram.ui.ActionBar.u1[]) obj4;
                org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) obj3;
                boolean[] zArr = (boolean[]) obj2;
                Long l10 = (Long) obj;
                try {
                    if (bVar != null) {
                        bVar.b();
                    } else {
                        u1VarArr[0].dismiss();
                    }
                } catch (Exception unused) {
                }
                u1VarArr[0] = null;
                h2Var.setVisibleDialog(null);
                if (!zArr[0]) {
                    if (l10 != null) {
                        if (l10.longValue() < 0) {
                            mpVar.G3(null, mpVar.O0(Long.valueOf(-l10.longValue())), h2Var, 1);
                            return;
                        } else {
                            mpVar.G3(mpVar.c2(l10), null, h2Var, i10);
                            return;
                        }
                    } else if (h2Var.getParentActivity() != null) {
                        try {
                            if (h2Var instanceof org.telegram.ui.bn) {
                                ((org.telegram.ui.bn) h2Var).Xb();
                            }
                            org.telegram.ui.Components.lc.b0(h2Var).t(gd.M0(2131747942, null), null).j();
                            return;
                        } catch (Exception e10) {
                            a8.g(e10, true);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                boolean[] zArr2 = (boolean[]) obj2;
                TL_bots.BotInfo[] botInfoArr = (TL_bots.BotInfo[]) obj5;
                TLRPC.User user = (TLRPC.User) obj4;
                ql qlVar = (ql) obj3;
                TL_bots.BotInfo botInfo = (TL_bots.BotInfo) obj;
                if (!zArr2[0]) {
                    botInfoArr[0] = botInfo;
                    if (botInfo == null) {
                        TLRPC.UserFull d2 = mpVar.d2(user.f28552id);
                        if (d2 == null) {
                            if (!zArr2[0]) {
                                mpVar.c3(user, i10, true, new e3(zArr2, botInfoArr, qlVar, 5));
                                return;
                            }
                            return;
                        }
                        botInfoArr[0] = d2.bot_info;
                        qlVar.run();
                        return;
                    }
                    qlVar.run();
                    return;
                }
                return;
            default:
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) obj5;
                int[] iArr = (int[]) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                Runnable runnable = (Runnable) obj2;
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers2 = (TLRPC.TL_messages_invitedUsers) obj;
                mpVar.getClass();
                if (tL_messages_invitedUsers2 != null) {
                    tL_messages_invitedUsers.missing_invitees.addAll(tL_messages_invitedUsers2.missing_invitees);
                }
                int i11 = iArr[0] + 1;
                iArr[0] = i11;
                if (i11 >= i10) {
                    if (!tL_messages_invitedUsers.missing_invitees.isEmpty()) {
                        g0.g3(new yf(mpVar, chat, tL_messages_invitedUsers, 2));
                    }
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public gk(mp mpVar, vf.b bVar, org.telegram.ui.ActionBar.u1[] u1VarArr, org.telegram.ui.ActionBar.h2 h2Var, boolean[] zArr, int i7) {
        this.f24267b = mpVar;
        this.f24269e = bVar;
        this.f24270f = u1VarArr;
        this.f24271g = h2Var;
        this.f24268c = zArr;
        this.d = i7;
    }

    public gk(mp mpVar, boolean[] zArr, TL_bots.BotInfo[] botInfoArr, TLRPC.User user, int i7, ql qlVar) {
        this.f24267b = mpVar;
        this.f24268c = zArr;
        this.f24269e = botInfoArr;
        this.f24270f = user;
        this.d = i7;
        this.f24271g = qlVar;
    }
}
