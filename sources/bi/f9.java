package bi;

import android.content.Context;
import android.graphics.RectF;
import android.os.SystemClock;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.qp;
import org.telegram.messenger.yr;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.an;
import org.telegram.ui.l60;
public final class f9 implements Runnable {
    public final int f3881a;
    public final int f3882b;
    public final long f3883c;
    public final Object d;
    public final Object f3884e;

    public f9(int i7, int i10, long j3, Object obj, Object obj2) {
        this.f3881a = i10;
        this.d = obj;
        this.f3884e = obj2;
        this.f3882b = i7;
        this.f3883c = j3;
    }

    @Override
    public final void run() {
        int i7 = this.f3881a;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        boolean z9 = false;
        long j3 = this.f3883c;
        int i10 = this.f3882b;
        Object obj = this.f3884e;
        Object obj2 = this.d;
        switch (i7) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                SQLiteDatabase sQLiteDatabase = ((yr) obj2).f26690b;
                try {
                    try {
                        sQLiteDatabase.executeFast("DELETE FROM star_gifts2").stepThis().dispose();
                        if (arrayList != null) {
                            sQLitePreparedStatement = sQLiteDatabase.executeFast("REPLACE INTO star_gifts2 VALUES(?, ?, ?, ?, ?)");
                            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList.get(i11);
                                sQLitePreparedStatement.requery();
                                sQLitePreparedStatement.bindLong(1, starGift.f27181id);
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
            case 1:
                ((fi.d) obj2).setLoading(false);
                org.telegram.ui.ActionBar.v2 v2Var = ((org.telegram.ui.ActionBar.v2[]) obj)[0];
                if (v2Var != null) {
                    v2Var.dismiss();
                }
                ea.y(i10, false).R();
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(an.ra(j3));
                    return;
                }
                return;
            case 2:
                org.telegram.ui.g4 g4Var = (org.telegram.ui.g4) obj2;
                TLObject tLObject = (TLObject) obj;
                if (g4Var.H0 != 0) {
                    g4Var.H0 = 0;
                    g4Var.Z(false);
                    if (tLObject != null) {
                        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                        qp.s1(i10).Y3(tL_contacts_resolvedPeer.users, false);
                        yr.a0(i10).m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
                        if (!tL_contacts_resolvedPeer.users.isEmpty()) {
                            g4Var.N(j3, tL_contacts_resolvedPeer.users.get(0));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 3:
                org.telegram.ui.n6 n6Var = (org.telegram.ui.n6) obj2;
                long currentTimeMillis = System.currentTimeMillis();
                Float valueOf = Float.valueOf(((int[]) obj)[0] / i10);
                if (currentTimeMillis - j3 > 250) {
                    z9 = true;
                }
                n6Var.a(valueOf, Boolean.valueOf(z9));
                return;
            case 4:
                RectF rectF = ProfileActivity.S6;
                ((ProfileActivity) obj2).getMessagesController().P1().b(i10, j3, (ArrayList) obj);
                return;
            case 5:
                rc.u uVar = (rc.u) obj;
                org.telegram.ui.Wallet.a1 a1Var = ((org.telegram.ui.Wallet.z0) obj2).f43410c;
                if (!a1Var.c(uVar, i10)) {
                    a1Var.d("closing stale connected websocket; attempt=" + i10);
                    uVar.c();
                    return;
                }
                a1Var.d("websocket connected after " + (SystemClock.elapsedRealtime() - j3) + " ms");
                org.telegram.ui.Wallet.x0 x0Var = a1Var.f42094o;
                try {
                    JSONArray put = new JSONArray().put(a1Var.f42083b);
                    StringBuilder sb2 = new StringBuilder("wallet-");
                    int i12 = a1Var.f42087g + 1;
                    a1Var.f42087g = i12;
                    sb2.append(i12);
                    a1Var.f42086f = sb2.toString();
                    JSONObject put2 = new JSONObject().put("operation", "subscribe").put("id", a1Var.f42086f).put("types", new JSONArray().put("transactions").put("account_state_change")).put("include_address_book", true).put("addresses", put).put("min_finality", "pending");
                    org.telegram.messenger.g0.r(x0Var);
                    org.telegram.messenger.g0.i3(x0Var, 30000L);
                    a1Var.g(put2.toString());
                    return;
                } catch (JSONException unused) {
                    a1Var.f("could not encode subscription");
                    return;
                }
            case 6:
                org.telegram.ui.Wallet.f2 f2Var = (org.telegram.ui.Wallet.f2) obj2;
                f2Var.getClass();
                TL_wallet.tonConnectGetPending tonconnectgetpending = new TL_wallet.tonConnectGetPending();
                long j10 = this.f3883c;
                tonconnectgetpending.session_id = Long.valueOf(j10);
                f2Var.f42464f.sendRequestTyped(tonconnectgetpending, new d3.b(1), new org.telegram.ui.Wallet.p1(f2Var, (l60) obj, j10, this.f3882b, 0));
                return;
            default:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, (Context) obj2, (org.telegram.ui.ActionBar.f6) obj);
                String M0 = org.telegram.messenger.hd.M0(2131743074, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
                u1Var.R = M0;
                u1Var.T = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.V(null, null, 2131743072, org.telegram.ui.Wallet.n0.x(i10).m(j3, true)));
                jg.g.C(null, 2131743064, alertDialog$Builder, null);
                return;
        }
    }

    public f9(ProfileActivity profileActivity, long j3, int i7, ArrayList arrayList) {
        this.f3881a = 4;
        this.d = profileActivity;
        this.f3883c = j3;
        this.f3882b = i7;
        this.f3884e = arrayList;
    }

    public f9(org.telegram.ui.Wallet.f2 f2Var, long j3, l60 l60Var, int i7) {
        this.f3881a = 6;
        this.d = f2Var;
        this.f3883c = j3;
        this.f3884e = l60Var;
        this.f3882b = i7;
    }
}
