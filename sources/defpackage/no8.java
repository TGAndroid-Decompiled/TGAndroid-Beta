package defpackage;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.SessionsActivity;
public final class no8 implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public no8(a6a a6aVar, m5a m5aVar, File file, k47 k47Var) {
        this.a = (byte) 15;
        this.b = a6aVar;
        this.c = m5aVar;
        this.e = file;
        this.d = k47Var;
    }

    private final void a() {
        wsa wsaVar = (wsa) this.b;
        TLObject tLObject = (TLObject) this.c;
        hw9 hw9Var = (hw9) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
        if (tLObject instanceof TLRPC.TL_messages_chatFull) {
            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject;
            oc7.r1(wsaVar.a).d4(tL_messages_chatFull.users, false);
            oc7.r1(wsaVar.a).X3(tL_messages_chatFull.chats, false);
            oc7.r1(wsaVar.a).W3(tL_messages_chatFull.full_chat);
            if (!tL_messages_chatFull.full_chat.stargifts_available) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wsaVar.J0, wsaVar.getContext());
                String M0 = jb6.M0(2131750195, null);
                he heVar = alertDialog$Builder.a;
                heVar.S = M0;
                heVar.U = jb6.M0(2131750196, null);
                b10.t(null, 2131747564, alertDialog$Builder, null);
                return;
            }
            hw9Var.run();
            return;
        }
        u31 Z = wsaVar.j().Z(tL_error);
        Z.u = true;
        Z.j();
    }

    private final void b() {
        wsa wsaVar = (wsa) this.b;
        ArrayList arrayList = (ArrayList) this.d;
        TL_stars.StarGift starGift = (TL_stars.StarGift) this.e;
        wsaVar.j3 = true;
        wsaVar.l2((k47) this.c, null);
        wsaVar.z2(0, true, null);
        uj4 uj4Var = wsaVar.V1;
        if (uj4Var != null) {
            uj4Var.c(true);
        }
        jva.v(wsaVar.a, false).L();
        ava D = jva.v(wsaVar.a, false).D(z8c.h(wsaVar.a).e(), false);
        if (D != null) {
            D.l(arrayList, starGift);
        }
    }

    private final void c() {
        wsa wsaVar = (wsa) this.b;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
        TLObject tLObject = (TLObject) this.d;
        TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) this.e;
        if (tL_error == null && (tLObject instanceof TLRPC.Updates)) {
            wsaVar.m2 = true;
            wsaVar.q3 = null;
            wsaVar.c1(inputSavedStarGift, (TLRPC.Updates) tLObject, new npa(wsaVar, (byte) 14));
            Utilities.d.c(new e6a(wsaVar, tLObject, (byte) 19));
            return;
        }
        wsaVar.j().g0(tL_error, false);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.no8.run():void");
    }

    public no8(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public no8(SessionsActivity sessionsActivity, he heVar, TLRPC.TL_error tL_error, TLObject tLObject, byte b) {
        this.a = b;
        this.c = sessionsActivity;
        this.b = heVar;
        this.d = tL_error;
        this.e = tLObject;
    }
}
