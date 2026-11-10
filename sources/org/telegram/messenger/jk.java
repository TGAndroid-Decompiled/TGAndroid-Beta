package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class jk implements c20 {
    public final int f23574a = 2;
    public final qp f23575b;
    public final Object f23576c;
    public final int d;
    public final Object f23577e;
    public final Object f23578f;
    public final Object f23579g;

    public jk(qp qpVar, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i7, TLRPC.Chat chat, Runnable runnable) {
        this.f23575b = qpVar;
        this.f23577e = tL_messages_invitedUsers;
        this.f23578f = iArr;
        this.d = i7;
        this.f23579g = chat;
        this.f23576c = runnable;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f23574a;
        Object obj2 = this.f23576c;
        Object obj3 = this.f23579g;
        int i10 = this.d;
        Object obj4 = this.f23578f;
        Object obj5 = this.f23577e;
        qp qpVar = this.f23575b;
        switch (i7) {
            case 0:
                vf.b bVar = (vf.b) obj5;
                org.telegram.ui.ActionBar.u1[] u1VarArr = (org.telegram.ui.ActionBar.u1[]) obj4;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) obj3;
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
                f2Var.setVisibleDialog(null);
                if (!zArr[0]) {
                    if (l10 != null) {
                        if (l10.longValue() < 0) {
                            qpVar.z3(null, qpVar.M0(Long.valueOf(-l10.longValue())), f2Var, 1);
                            return;
                        } else {
                            qpVar.z3(qpVar.a2(l10), null, f2Var, i10);
                            return;
                        }
                    } else if (f2Var.getParentActivity() != null) {
                        try {
                            if (f2Var instanceof org.telegram.ui.cn) {
                                ((org.telegram.ui.cn) f2Var).Wb();
                            }
                            org.telegram.ui.Components.gc.a0(f2Var).t(id.M0(2131748134, null), null).j();
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
                wl wlVar = (wl) obj3;
                TL_bots.BotInfo botInfo = (TL_bots.BotInfo) obj;
                if (!zArr2[0]) {
                    botInfoArr[0] = botInfo;
                    if (botInfo == null) {
                        TLRPC.UserFull b22 = qpVar.b2(user.f27109id);
                        if (b22 == null) {
                            if (!zArr2[0]) {
                                qpVar.W2(user, i10, true, new d3(zArr2, botInfoArr, wlVar, 5));
                                return;
                            }
                            return;
                        }
                        botInfoArr[0] = b22.bot_info;
                        wlVar.run();
                        return;
                    }
                    wlVar.run();
                    return;
                }
                return;
            default:
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) obj5;
                int[] iArr = (int[]) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                Runnable runnable = (Runnable) obj2;
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers2 = (TLRPC.TL_messages_invitedUsers) obj;
                qpVar.getClass();
                if (tL_messages_invitedUsers2 != null) {
                    tL_messages_invitedUsers.missing_invitees.addAll(tL_messages_invitedUsers2.missing_invitees);
                }
                int i11 = iArr[0] + 1;
                iArr[0] = i11;
                if (i11 >= i10) {
                    if (!tL_messages_invitedUsers.missing_invitees.isEmpty()) {
                        g0.h3(new ng(qpVar, chat, tL_messages_invitedUsers, 2));
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

    public jk(qp qpVar, vf.b bVar, org.telegram.ui.ActionBar.u1[] u1VarArr, org.telegram.ui.ActionBar.f2 f2Var, boolean[] zArr, int i7) {
        this.f23575b = qpVar;
        this.f23577e = bVar;
        this.f23578f = u1VarArr;
        this.f23579g = f2Var;
        this.f23576c = zArr;
        this.d = i7;
    }

    public jk(qp qpVar, boolean[] zArr, TL_bots.BotInfo[] botInfoArr, TLRPC.User user, int i7, wl wlVar) {
        this.f23575b = qpVar;
        this.f23576c = zArr;
        this.f23577e = botInfoArr;
        this.f23578f = user;
        this.d = i7;
        this.f23579g = wlVar;
    }
}
