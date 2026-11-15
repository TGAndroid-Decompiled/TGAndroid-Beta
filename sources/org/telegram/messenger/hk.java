package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class hk implements z10 {
    public final int f24163a = 2;
    public final np f24164b;
    public final Object f24165c;
    public final int d;
    public final Object f24166e;
    public final Object f24167f;
    public final Object f24168g;

    public hk(np npVar, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i7, TLRPC.Chat chat, Runnable runnable) {
        this.f24164b = npVar;
        this.f24166e = tL_messages_invitedUsers;
        this.f24167f = iArr;
        this.d = i7;
        this.f24168g = chat;
        this.f24165c = runnable;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f24163a;
        Object obj2 = this.f24165c;
        Object obj3 = this.f24168g;
        int i10 = this.d;
        Object obj4 = this.f24167f;
        Object obj5 = this.f24166e;
        np npVar = this.f24164b;
        switch (i7) {
            case 0:
                vf.b bVar = (vf.b) obj5;
                org.telegram.ui.ActionBar.t1[] t1VarArr = (org.telegram.ui.ActionBar.t1[]) obj4;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) obj3;
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
                e2Var.setVisibleDialog(null);
                if (!zArr[0]) {
                    if (l10 != null) {
                        if (l10.longValue() < 0) {
                            npVar.z3(null, npVar.M0(Long.valueOf(-l10.longValue())), e2Var, 1);
                            return;
                        } else {
                            npVar.z3(npVar.a2(l10), null, e2Var, i10);
                            return;
                        }
                    } else if (e2Var.getParentActivity() != null) {
                        try {
                            if (e2Var instanceof org.telegram.ui.an) {
                                ((org.telegram.ui.an) e2Var).Xb();
                            }
                            org.telegram.ui.Components.cc.a0(e2Var).t(hd.M0(2131748134, null), null).j();
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
                tl tlVar = (tl) obj3;
                TL_bots.BotInfo botInfo = (TL_bots.BotInfo) obj;
                if (!zArr2[0]) {
                    botInfoArr[0] = botInfo;
                    if (botInfo == null) {
                        TLRPC.UserFull b22 = npVar.b2(user.f28200id);
                        if (b22 == null) {
                            if (!zArr2[0]) {
                                npVar.W2(user, i10, true, new d3(zArr2, botInfoArr, tlVar, 5));
                                return;
                            }
                            return;
                        }
                        botInfoArr[0] = b22.bot_info;
                        tlVar.run();
                        return;
                    }
                    tlVar.run();
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
                        g0.h3(new mg(npVar, chat, tL_messages_invitedUsers, 2));
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

    public hk(np npVar, vf.b bVar, org.telegram.ui.ActionBar.t1[] t1VarArr, org.telegram.ui.ActionBar.e2 e2Var, boolean[] zArr, int i7) {
        this.f24164b = npVar;
        this.f24166e = bVar;
        this.f24167f = t1VarArr;
        this.f24168g = e2Var;
        this.f24165c = zArr;
        this.d = i7;
    }

    public hk(np npVar, boolean[] zArr, TL_bots.BotInfo[] botInfoArr, TLRPC.User user, int i7, tl tlVar) {
        this.f24164b = npVar;
        this.f24165c = zArr;
        this.f24166e = botInfoArr;
        this.f24167f = user;
        this.d = i7;
        this.f24168g = tlVar;
    }
}
