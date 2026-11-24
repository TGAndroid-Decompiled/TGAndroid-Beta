package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.d;
public final class p22 implements p8c {
    public final byte a;
    public final boolean b;
    public final int c;
    public final Object d;
    public final Object e;

    public p22(t1b t1bVar, boolean z, int i, List list) {
        this.a = (byte) 2;
        this.d = t1bVar;
        this.b = z;
        this.c = i;
        this.e = list;
    }

    @Override
    public final void a(Object obj) {
        long j;
        String str;
        j5 accountInstance;
        byte b = this.a;
        boolean z = this.b;
        int i = this.c;
        boolean z2 = true;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                ((d32) obj3).R.m((ArrayList) obj2, this.b, this.c, ((Long) obj).longValue());
                return;
            case 1:
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj2;
                Long l = (Long) obj;
                y28 y28Var = ((t18) obj3).a;
                TLRPC.User user = y28Var.T2.getAdapter().x0;
                if (user != null) {
                    j = user.id;
                } else {
                    j = 0;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("id", botInlineResult.id);
                hashMap.put("query_id", String.valueOf(botInlineResult.query_id));
                hashMap.put("bot", String.valueOf(j));
                TLRPC.User user2 = y28Var.T2.getAdapter().x0;
                if (user2 == null) {
                    str = "";
                } else {
                    str = user2.username;
                }
                hashMap.put("bot_name", str);
                d dVar = y28Var.z0.f;
                accountInstance = y28Var.getAccountInstance();
                long j2 = j;
                z3a.R(this.c, y28Var.r1, 0L, l.longValue(), accountInstance, null, null, null, null, hashMap, botInlineResult, y28Var.E1.a, dVar, this.b);
                y28Var.R1.setFieldText("");
                if (l.longValue() > 0) {
                    z2 = false;
                }
                y28Var.a0(z2);
                hq6.d0(y28Var.s2).w0(j2, false);
                return;
            case 2:
                t1b t1bVar = (t1b) obj3;
                List list = (List) obj2;
                Long l2 = (Long) obj;
                v1b v1bVar = t1bVar.q;
                TLObject a2 = na7.q1(t1bVar.c).a2(t1bVar.D);
                t1bVar.G = false;
                if (a2 != null) {
                    t1bVar.q(i, list, z);
                    return;
                }
                t1bVar.J = 0;
                t1bVar.H = "";
                gl.r(v1bVar);
                gl.c3(v1bVar);
                return;
            default:
                final u4c u4cVar = (u4c) obj2;
                final a61 a61Var = new a61((boolean[]) obj3, i, (Runnable) obj, (byte) 7);
                if (z) {
                    v4c v4cVar = u4cVar.i;
                    if (u4cVar.a) {
                        TL_account.confirmBotConnection confirmbotconnection = new TL_account.confirmBotConnection();
                        confirmbotconnection.bot_id = na7.q1(v4cVar.a).m1(u4cVar.c);
                        ConnectionsManager.getInstance(v4cVar.a).sendRequestTyped(confirmbotconnection, new w77(u4cVar, a61Var, (byte) 16));
                        return;
                    }
                    TL_account.changeAuthorizationSettings changeauthorizationsettings = new TL_account.changeAuthorizationSettings();
                    changeauthorizationsettings.hash = u4cVar.b;
                    changeauthorizationsettings.confirmed = true;
                    ConnectionsManager.getInstance(v4cVar.a).sendRequest(changeauthorizationsettings, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (r3) {
                                case 0:
                                    u4c u4cVar2 = u4cVar;
                                    u4cVar2.getClass();
                                    gl.c3(new t4c(u4cVar2, tLObject, a61Var, tL_error));
                                    return;
                                case 1:
                                    u4c u4cVar3 = u4cVar;
                                    u4cVar3.getClass();
                                    gl.c3(new t4c(u4cVar3, a61Var, tLObject, tL_error, (byte) 2));
                                    return;
                                default:
                                    u4c u4cVar4 = u4cVar;
                                    u4cVar4.getClass();
                                    gl.c3(new t4c(u4cVar4, a61Var, tLObject, tL_error, (byte) 0));
                                    return;
                            }
                        }
                    });
                    return;
                }
                v4c v4cVar2 = u4cVar.i;
                if (u4cVar.a) {
                    TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
                    updateconnectedbot.deleted = true;
                    updateconnectedbot.bot = na7.q1(v4cVar2.a).m1(u4cVar.c);
                    updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
                    ConnectionsManager.getInstance(v4cVar2.a).sendRequest(updateconnectedbot, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (r3) {
                                case 0:
                                    u4c u4cVar2 = u4cVar;
                                    u4cVar2.getClass();
                                    gl.c3(new t4c(u4cVar2, tLObject, a61Var, tL_error));
                                    return;
                                case 1:
                                    u4c u4cVar3 = u4cVar;
                                    u4cVar3.getClass();
                                    gl.c3(new t4c(u4cVar3, a61Var, tLObject, tL_error, (byte) 2));
                                    return;
                                default:
                                    u4c u4cVar4 = u4cVar;
                                    u4cVar4.getClass();
                                    gl.c3(new t4c(u4cVar4, a61Var, tLObject, tL_error, (byte) 0));
                                    return;
                            }
                        }
                    });
                    return;
                }
                TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
                resetauthorization.hash = u4cVar.b;
                ConnectionsManager.getInstance(v4cVar2.a).sendRequest(resetauthorization, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (r3) {
                            case 0:
                                u4c u4cVar2 = u4cVar;
                                u4cVar2.getClass();
                                gl.c3(new t4c(u4cVar2, tLObject, a61Var, tL_error));
                                return;
                            case 1:
                                u4c u4cVar3 = u4cVar;
                                u4cVar3.getClass();
                                gl.c3(new t4c(u4cVar3, a61Var, tLObject, tL_error, (byte) 2));
                                return;
                            default:
                                u4c u4cVar4 = u4cVar;
                                u4cVar4.getClass();
                                gl.c3(new t4c(u4cVar4, a61Var, tLObject, tL_error, (byte) 0));
                                return;
                        }
                    }
                });
                return;
        }
    }

    public p22(Object obj, int i, Object obj2, boolean z, byte b) {
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.b = z;
        this.c = i;
    }

    public p22(boolean[] zArr, int i, boolean z, u4c u4cVar) {
        this.a = (byte) 3;
        this.d = zArr;
        this.c = i;
        this.b = z;
        this.e = u4cVar;
    }
}
