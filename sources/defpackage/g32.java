package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.e;
public final class g32 implements pcc {
    public final byte a;
    public final boolean b;
    public final int c;
    public final Object d;
    public final Object e;

    public g32(q5b q5bVar, boolean z, int i, List list) {
        this.a = (byte) 2;
        this.d = q5bVar;
        this.b = z;
        this.c = i;
        this.e = list;
    }

    @Override
    public final void a(Object obj) {
        long j;
        String str;
        k5 accountInstance;
        byte b = this.a;
        boolean z = this.b;
        int i = this.c;
        boolean z2 = true;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                ((u32) obj3).R.m((ArrayList) obj2, this.b, this.c, ((Long) obj).longValue());
                return;
            case 1:
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj2;
                Long l = (Long) obj;
                o68 o68Var = ((k58) obj3).a;
                TLRPC.User user = o68Var.N2.getAdapter().x0;
                if (user != null) {
                    j = user.id;
                } else {
                    j = 0;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("id", botInlineResult.id);
                hashMap.put("query_id", String.valueOf(botInlineResult.query_id));
                hashMap.put("bot", String.valueOf(j));
                TLRPC.User user2 = o68Var.N2.getAdapter().x0;
                if (user2 == null) {
                    str = "";
                } else {
                    str = user2.username;
                }
                hashMap.put("bot_name", str);
                e eVar = o68Var.t0.f;
                accountInstance = o68Var.getAccountInstance();
                long j2 = j;
                r7a.R(this.c, o68Var.l1, 0L, l.longValue(), accountInstance, null, null, null, null, hashMap, botInlineResult, o68Var.y1.a, eVar, this.b);
                o68Var.L1.setFieldText("");
                if (l.longValue() > 0) {
                    z2 = false;
                }
                o68Var.a0(z2);
                ls6.d0(o68Var.m2).w0(j2, false);
                return;
            case 2:
                q5b q5bVar = (q5b) obj3;
                List list = (List) obj2;
                Long l2 = (Long) obj;
                s5b s5bVar = q5bVar.q;
                TLObject c2 = uc7.s1(q5bVar.c).c2(q5bVar.D);
                q5bVar.G = false;
                if (c2 != null) {
                    q5bVar.q(i, list, z);
                    return;
                }
                q5bVar.J = 0;
                q5bVar.H = "";
                hl.r(s5bVar);
                hl.c3(s5bVar);
                return;
            default:
                final t8c t8cVar = (t8c) obj2;
                final i61 i61Var = new i61((boolean[]) obj3, i, (Runnable) obj, (byte) 7);
                if (z) {
                    u8c u8cVar = t8cVar.i;
                    if (t8cVar.a) {
                        TL_account.confirmBotConnection confirmbotconnection = new TL_account.confirmBotConnection();
                        confirmbotconnection.bot_id = uc7.s1(u8cVar.a).o1(t8cVar.c);
                        ConnectionsManager.getInstance(u8cVar.a).sendRequestTyped(confirmbotconnection, new ia7(t8cVar, i61Var, (byte) 16));
                        return;
                    }
                    TL_account.changeAuthorizationSettings changeauthorizationsettings = new TL_account.changeAuthorizationSettings();
                    changeauthorizationsettings.hash = t8cVar.b;
                    changeauthorizationsettings.confirmed = true;
                    ConnectionsManager.getInstance(u8cVar.a).sendRequest(changeauthorizationsettings, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (r3) {
                                case 0:
                                    t8c t8cVar2 = t8cVar;
                                    t8cVar2.getClass();
                                    hl.c3(new s8c(t8cVar2, tLObject, i61Var, tL_error));
                                    return;
                                case 1:
                                    t8c t8cVar3 = t8cVar;
                                    t8cVar3.getClass();
                                    hl.c3(new s8c(t8cVar3, i61Var, tLObject, tL_error, (byte) 2));
                                    return;
                                default:
                                    t8c t8cVar4 = t8cVar;
                                    t8cVar4.getClass();
                                    hl.c3(new s8c(t8cVar4, i61Var, tLObject, tL_error, (byte) 0));
                                    return;
                            }
                        }
                    });
                    return;
                }
                u8c u8cVar2 = t8cVar.i;
                if (t8cVar.a) {
                    TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
                    updateconnectedbot.deleted = true;
                    updateconnectedbot.bot = uc7.s1(u8cVar2.a).o1(t8cVar.c);
                    updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
                    ConnectionsManager.getInstance(u8cVar2.a).sendRequest(updateconnectedbot, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (r3) {
                                case 0:
                                    t8c t8cVar2 = t8cVar;
                                    t8cVar2.getClass();
                                    hl.c3(new s8c(t8cVar2, tLObject, i61Var, tL_error));
                                    return;
                                case 1:
                                    t8c t8cVar3 = t8cVar;
                                    t8cVar3.getClass();
                                    hl.c3(new s8c(t8cVar3, i61Var, tLObject, tL_error, (byte) 2));
                                    return;
                                default:
                                    t8c t8cVar4 = t8cVar;
                                    t8cVar4.getClass();
                                    hl.c3(new s8c(t8cVar4, i61Var, tLObject, tL_error, (byte) 0));
                                    return;
                            }
                        }
                    });
                    return;
                }
                TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
                resetauthorization.hash = t8cVar.b;
                ConnectionsManager.getInstance(u8cVar2.a).sendRequest(resetauthorization, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (r3) {
                            case 0:
                                t8c t8cVar2 = t8cVar;
                                t8cVar2.getClass();
                                hl.c3(new s8c(t8cVar2, tLObject, i61Var, tL_error));
                                return;
                            case 1:
                                t8c t8cVar3 = t8cVar;
                                t8cVar3.getClass();
                                hl.c3(new s8c(t8cVar3, i61Var, tLObject, tL_error, (byte) 2));
                                return;
                            default:
                                t8c t8cVar4 = t8cVar;
                                t8cVar4.getClass();
                                hl.c3(new s8c(t8cVar4, i61Var, tLObject, tL_error, (byte) 0));
                                return;
                        }
                    }
                });
                return;
        }
    }

    public g32(Object obj, int i, Object obj2, boolean z, byte b) {
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.b = z;
        this.c = i;
    }

    public g32(boolean[] zArr, int i, boolean z, t8c t8cVar) {
        this.a = (byte) 3;
        this.d = zArr;
        this.c = i;
        this.b = z;
        this.e = t8cVar;
    }
}
