package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class tk implements q20 {
    public final int f18068a = 0;
    public final vp f18069b;
    public final Object f18070c;
    public final int d;
    public final Object e;
    public final Object f18071f;
    public final Object f18072g;

    public tk(vp vpVar, gf.e eVar, org.telegram.ui.ActionBar.x1[] x1VarArr, org.telegram.ui.ActionBar.k2 k2Var, boolean[] zArr, int i10) {
        this.f18069b = vpVar;
        this.e = eVar;
        this.f18071f = x1VarArr;
        this.f18072g = k2Var;
        this.f18070c = zArr;
        this.d = i10;
    }

    @Override
    public final void a(Object obj) {
        int i10 = this.f18068a;
        Object obj2 = this.f18070c;
        Object obj3 = this.f18072g;
        int i11 = this.d;
        Object obj4 = this.f18071f;
        Object obj5 = this.e;
        vp vpVar = this.f18069b;
        switch (i10) {
            case 0:
                gf.e eVar = (gf.e) obj5;
                org.telegram.ui.ActionBar.x1[] x1VarArr = (org.telegram.ui.ActionBar.x1[]) obj4;
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) obj3;
                boolean[] zArr = (boolean[]) obj2;
                Long l4 = (Long) obj;
                try {
                    if (eVar != null) {
                        eVar.b();
                    } else {
                        x1VarArr[0].dismiss();
                    }
                } catch (Exception unused) {
                }
                x1VarArr[0] = null;
                k2Var.setVisibleDialog(null);
                if (!zArr[0]) {
                    if (l4 != null) {
                        if (l4.longValue() < 0) {
                            vpVar.w3(null, vpVar.L0(Long.valueOf(-l4.longValue())), k2Var, 1);
                            return;
                        } else {
                            vpVar.w3(vpVar.Z1(l4), null, k2Var, i11);
                            return;
                        }
                    } else if (k2Var.getParentActivity() != null) {
                        try {
                            if (k2Var instanceof org.telegram.ui.un) {
                                ((org.telegram.ui.un) k2Var).Jb();
                            }
                            org.telegram.ui.Components.cc.a0(k2Var).t(cd.L0(2131748150, null), null).j();
                            return;
                        } catch (Exception e) {
                            f8.g(e, true);
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
                am amVar = (am) obj3;
                TL_bots.BotInfo botInfo = (TL_bots.BotInfo) obj;
                if (!zArr2[0]) {
                    botInfoArr[0] = botInfo;
                    if (botInfo == null) {
                        TLRPC.UserFull a2 = vpVar.a2(user.f19942id);
                        if (a2 == null) {
                            if (!zArr2[0]) {
                                vpVar.U2(user, i11, true, new g3(zArr2, botInfoArr, amVar, 5));
                                return;
                            }
                            return;
                        }
                        botInfoArr[0] = a2.bot_info;
                        amVar.run();
                        return;
                    }
                    amVar.run();
                    return;
                }
                return;
            default:
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) obj5;
                int[] iArr = (int[]) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                Runnable runnable = (Runnable) obj2;
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers2 = (TLRPC.TL_messages_invitedUsers) obj;
                vpVar.getClass();
                if (tL_messages_invitedUsers2 != null) {
                    tL_messages_invitedUsers.missing_invitees.addAll(tL_messages_invitedUsers2.missing_invitees);
                }
                int i12 = iArr[0] + 1;
                iArr[0] = i12;
                if (i12 >= i11) {
                    if (!tL_messages_invitedUsers.missing_invitees.isEmpty()) {
                        i0.g3(new mg(vpVar, chat, tL_messages_invitedUsers, 2));
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

    public tk(vp vpVar, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i10, TLRPC.Chat chat, Runnable runnable) {
        this.f18069b = vpVar;
        this.e = tL_messages_invitedUsers;
        this.f18071f = iArr;
        this.d = i10;
        this.f18072g = chat;
        this.f18070c = runnable;
    }

    public tk(vp vpVar, boolean[] zArr, TL_bots.BotInfo[] botInfoArr, TLRPC.User user, int i10, am amVar) {
        this.f18069b = vpVar;
        this.f18070c = zArr;
        this.e = botInfoArr;
        this.f18071f = user;
        this.d = i10;
        this.f18072g = amVar;
    }
}
