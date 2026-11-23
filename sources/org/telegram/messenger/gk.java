package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class gk implements w10 {
    public final int f24367a = 2;
    public final mp f24368b;
    public final Object f24369c;
    public final int d;
    public final Object f24370e;
    public final Object f24371f;
    public final Object f24372g;

    public gk(mp mpVar, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i7, TLRPC.Chat chat, Runnable runnable) {
        this.f24368b = mpVar;
        this.f24370e = tL_messages_invitedUsers;
        this.f24371f = iArr;
        this.d = i7;
        this.f24372g = chat;
        this.f24369c = runnable;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f24367a;
        Object obj2 = this.f24369c;
        Object obj3 = this.f24372g;
        int i10 = this.d;
        Object obj4 = this.f24371f;
        Object obj5 = this.f24370e;
        mp mpVar = this.f24368b;
        switch (i7) {
            case 0:
                vf.b bVar = (vf.b) obj5;
                org.telegram.ui.ActionBar.t1[] t1VarArr = (org.telegram.ui.ActionBar.t1[]) obj4;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) obj3;
                boolean[] zArr = (boolean[]) obj2;
                Long l10 = (Long) obj;
                try {
                    if (bVar != null) {
                        bVar.b();
                    } else {
                        t1VarArr[0].dismiss();
                    }
                } catch (Exception unused) {
                }
                t1VarArr[0] = null;
                g2Var.setVisibleDialog(null);
                if (!zArr[0]) {
                    if (l10 != null) {
                        if (l10.longValue() < 0) {
                            mpVar.G3(null, mpVar.O0(Long.valueOf(-l10.longValue())), g2Var, 1);
                            return;
                        } else {
                            mpVar.G3(mpVar.c2(l10), null, g2Var, i10);
                            return;
                        }
                    } else if (g2Var.getParentActivity() != null) {
                        try {
                            if (g2Var instanceof org.telegram.ui.bn) {
                                ((org.telegram.ui.bn) g2Var).Xb();
                            }
                            org.telegram.ui.Components.kc.b0(g2Var).t(gd.N0(2131747941, null), null).j();
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
                        TLRPC.UserFull d2 = mpVar.d2(user.f28641id);
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

    public gk(mp mpVar, vf.b bVar, org.telegram.ui.ActionBar.t1[] t1VarArr, org.telegram.ui.ActionBar.g2 g2Var, boolean[] zArr, int i7) {
        this.f24368b = mpVar;
        this.f24370e = bVar;
        this.f24371f = t1VarArr;
        this.f24372g = g2Var;
        this.f24369c = zArr;
        this.d = i7;
    }

    public gk(mp mpVar, boolean[] zArr, TL_bots.BotInfo[] botInfoArr, TLRPC.User user, int i7, ql qlVar) {
        this.f24368b = mpVar;
        this.f24369c = zArr;
        this.f24370e = botInfoArr;
        this.f24371f = user;
        this.d = i7;
        this.f24372g = qlVar;
    }
}
