package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class hk implements y10 {
    public final int f24497a = 2;
    public final np f24498b;
    public final Object f24499c;
    public final int d;
    public final Object f24500e;
    public final Object f24501f;
    public final Object f24502g;

    public hk(np npVar, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i7, TLRPC.Chat chat, Runnable runnable) {
        this.f24498b = npVar;
        this.f24500e = tL_messages_invitedUsers;
        this.f24501f = iArr;
        this.d = i7;
        this.f24502g = chat;
        this.f24499c = runnable;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f24497a;
        Object obj2 = this.f24499c;
        Object obj3 = this.f24502g;
        int i10 = this.d;
        Object obj4 = this.f24501f;
        Object obj5 = this.f24500e;
        np npVar = this.f24498b;
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
                            npVar.G3(null, npVar.O0(Long.valueOf(-l10.longValue())), g2Var, 1);
                            return;
                        } else {
                            npVar.G3(npVar.c2(l10), null, g2Var, i10);
                            return;
                        }
                    } else if (g2Var.getParentActivity() != null) {
                        try {
                            if (g2Var instanceof org.telegram.ui.bn) {
                                ((org.telegram.ui.bn) g2Var).Xb();
                            }
                            org.telegram.ui.Components.lc.b0(g2Var).t(hd.N0(2131747941, null), null).j();
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
                rl rlVar = (rl) obj3;
                TL_bots.BotInfo botInfo = (TL_bots.BotInfo) obj;
                if (!zArr2[0]) {
                    botInfoArr[0] = botInfo;
                    if (botInfo == null) {
                        TLRPC.UserFull d2 = npVar.d2(user.f28583id);
                        if (d2 == null) {
                            if (!zArr2[0]) {
                                npVar.c3(user, i10, true, new e3(zArr2, botInfoArr, rlVar, 5));
                                return;
                            }
                            return;
                        }
                        botInfoArr[0] = d2.bot_info;
                        rlVar.run();
                        return;
                    }
                    rlVar.run();
                    return;
                }
                return;
            default:
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) obj5;
                int[] iArr = (int[]) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                Runnable runnable = (Runnable) obj2;
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers2 = (TLRPC.TL_messages_invitedUsers) obj;
                npVar.getClass();
                if (tL_messages_invitedUsers2 != null) {
                    tL_messages_invitedUsers.missing_invitees.addAll(tL_messages_invitedUsers2.missing_invitees);
                }
                int i11 = iArr[0] + 1;
                iArr[0] = i11;
                if (i11 >= i10) {
                    if (!tL_messages_invitedUsers.missing_invitees.isEmpty()) {
                        g0.g3(new zf(npVar, chat, tL_messages_invitedUsers, 2));
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

    public hk(np npVar, vf.b bVar, org.telegram.ui.ActionBar.t1[] t1VarArr, org.telegram.ui.ActionBar.g2 g2Var, boolean[] zArr, int i7) {
        this.f24498b = npVar;
        this.f24500e = bVar;
        this.f24501f = t1VarArr;
        this.f24502g = g2Var;
        this.f24499c = zArr;
        this.d = i7;
    }

    public hk(np npVar, boolean[] zArr, TL_bots.BotInfo[] botInfoArr, TLRPC.User user, int i7, rl rlVar) {
        this.f24498b = npVar;
        this.f24499c = zArr;
        this.f24500e = botInfoArr;
        this.f24501f = user;
        this.d = i7;
        this.f24502g = rlVar;
    }
}
