package bi;

import android.content.Context;
import android.graphics.RectF;
import android.os.SystemClock;
import java.io.Serializable;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.tr;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.fc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bn;
import org.telegram.ui.m60;
public final class w3 implements Runnable {
    public final int f4172a;
    public final int f4173b;
    public final long f4174c;
    public final Object d;
    public final Object f4175e;

    public w3(int i7, int i10, long j3, Object obj, Object obj2) {
        this.f4172a = i10;
        this.d = obj;
        this.f4175e = obj2;
        this.f4173b = i7;
        this.f4174c = j3;
    }

    @Override
    public final void run() {
        int i7 = this.f4172a;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        boolean z10 = false;
        long j3 = this.f4174c;
        int i10 = this.f4173b;
        Object obj = this.f4175e;
        Object obj2 = this.d;
        switch (i7) {
            case 0:
                ((boolean[]) obj2)[0] = true;
                l4.f3802b.add(Long.valueOf(j3));
                l4.j(j3, 60000L);
                l4.d.put(l4.a(i10, j3), Long.valueOf(SystemClock.elapsedRealtime() + 600000));
                l4.c();
                fc Q = l4.h().Q(2131623990, 36, gd.a0(null, null, 2131749569, (String) obj));
                Q.f35101t = true;
                Q.j();
                return;
            case 1:
                ArrayList arrayList = (ArrayList) obj;
                SQLiteDatabase sQLiteDatabase = ((tr) obj2).f27151b;
                try {
                    try {
                        sQLiteDatabase.executeFast("DELETE FROM star_gifts2").stepThis().dispose();
                        if (arrayList != null) {
                            sQLitePreparedStatement = sQLiteDatabase.executeFast("REPLACE INTO star_gifts2 VALUES(?, ?, ?, ?, ?)");
                            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList.get(i11);
                                sQLitePreparedStatement.requery();
                                sQLitePreparedStatement.bindLong(1, starGift.f28721id);
                                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(starGift.getObjectSize());
                                starGift.serializeToStream(nativeByteBuffer);
                                sQLitePreparedStatement.bindByteBuffer(2, nativeByteBuffer);
                                sQLitePreparedStatement.bindLong(3, i10);
                                sQLitePreparedStatement.bindLong(4, j3);
                                sQLitePreparedStatement.bindInteger(5, i11);
                                sQLitePreparedStatement.step();
                                nativeByteBuffer.reuse();
                            }
                        }
                        if (sQLitePreparedStatement == null) {
                            return;
                        }
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        if (sQLitePreparedStatement == null) {
                            return;
                        }
                    }
                    sQLitePreparedStatement.dispose();
                    return;
                } catch (Throwable th2) {
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                    throw th2;
                }
            case 2:
                ((hi.e) obj2).setLoading(false);
                org.telegram.ui.ActionBar.w2 w2Var = ((org.telegram.ui.ActionBar.w2[]) obj)[0];
                if (w2Var != null) {
                    w2Var.dismiss();
                }
                di.y8.y(i10, false).Q();
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(bn.ua(j3));
                    return;
                }
                return;
            case 3:
                org.telegram.ui.g4 g4Var = (org.telegram.ui.g4) obj2;
                TLObject tLObject = (TLObject) obj;
                if (g4Var.I0 != 0) {
                    g4Var.I0 = 0;
                    g4Var.Z(false);
                    if (tLObject != null) {
                        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                        mp.u1(i10).f4(tL_contacts_resolvedPeer.users, false);
                        tr.a0(i10).m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
                        if (!tL_contacts_resolvedPeer.users.isEmpty()) {
                            g4Var.N(j3, tL_contacts_resolvedPeer.users.get(0));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 4:
                org.telegram.ui.n6 n6Var = (org.telegram.ui.n6) obj2;
                long currentTimeMillis = System.currentTimeMillis();
                Float valueOf = Float.valueOf(((int[]) obj)[0] / i10);
                if (currentTimeMillis - j3 > 250) {
                    z10 = true;
                }
                n6Var.a(valueOf, Boolean.valueOf(z10));
                return;
            case 5:
                RectF rectF = ProfileActivity.Z6;
                ((ProfileActivity) obj2).getMessagesController().R1().b(i10, j3, (ArrayList) obj);
                return;
            case 6:
                rc.u uVar = (rc.u) obj;
                org.telegram.ui.Wallet.j1 j1Var = ((org.telegram.ui.Wallet.i1) obj2).f44460c;
                if (!j1Var.c(uVar, i10)) {
                    j1Var.d("closing stale connected websocket; attempt=" + i10);
                    uVar.c();
                    return;
                }
                j1Var.d("websocket connected after " + (SystemClock.elapsedRealtime() - j3) + " ms");
                org.telegram.ui.Wallet.g1 g1Var = j1Var.f44511o;
                try {
                    JSONArray put = new JSONArray().put(j1Var.f44500b);
                    StringBuilder sb2 = new StringBuilder("wallet-");
                    int i12 = j1Var.f44504g + 1;
                    j1Var.f44504g = i12;
                    sb2.append(i12);
                    j1Var.f44503f = sb2.toString();
                    JSONObject put2 = new JSONObject().put("operation", "subscribe").put("id", j1Var.f44503f).put("types", new JSONArray().put("transactions").put("account_state_change")).put("include_address_book", true).put("addresses", put).put("min_finality", "pending");
                    org.telegram.messenger.g0.r(g1Var);
                    org.telegram.messenger.g0.h3(g1Var, 30000L);
                    j1Var.g(put2.toString());
                    return;
                } catch (JSONException unused) {
                    j1Var.f("could not encode subscription");
                    return;
                }
            case 7:
                org.telegram.ui.Wallet.m2 m2Var = (org.telegram.ui.Wallet.m2) obj2;
                m2Var.getClass();
                TL_wallet.tonConnectGetPending tonconnectgetpending = new TL_wallet.tonConnectGetPending();
                long j10 = this.f4174c;
                tonconnectgetpending.session_id = Long.valueOf(j10);
                m2Var.f44652f.sendRequestTyped(tonconnectgetpending, new d3.b(1), new org.telegram.ui.Wallet.x1(m2Var, (m60) obj, j10, this.f4173b, 0));
                return;
            default:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, (Context) obj2, (org.telegram.ui.ActionBar.i6) obj);
                String N0 = gd.N0(2131742821, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                t1Var.S = N0;
                t1Var.U = org.telegram.messenger.g0.V2(gd.V(null, null, 2131742819, org.telegram.ui.Wallet.v0.D(i10).r(j3, true)));
                org.telegram.messenger.f3.m(null, 2131742811, alertDialog$Builder, null);
                return;
        }
    }

    public w3(Object obj, long j3, int i7, Serializable serializable, int i10) {
        this.f4172a = i10;
        this.d = obj;
        this.f4174c = j3;
        this.f4173b = i7;
        this.f4175e = serializable;
    }

    public w3(org.telegram.ui.Wallet.m2 m2Var, long j3, m60 m60Var, int i7) {
        this.f4172a = 7;
        this.d = m2Var;
        this.f4174c = j3;
        this.f4175e = m60Var;
        this.f4173b = i7;
    }
}
