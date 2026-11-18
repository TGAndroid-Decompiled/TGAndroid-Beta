package bi;

import android.content.Context;
import android.os.SystemClock;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ma;
import org.json.JSONObject;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.q10;
import org.telegram.messenger.q9;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.lc;
public final class z implements q10 {
    public final int f4256a = 2;
    public final int f4257b;
    public final long f4258c;
    public final Object d;
    public final Object f4259e;
    public final Object f4260f;

    public z(int i7, long j3, TLRPC.Photo photo, Context context, fi.b bVar) {
        this.f4257b = i7;
        this.f4258c = j3;
        this.f4259e = photo;
        this.d = context;
        this.f4260f = bVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7;
        int i10;
        int i11;
        TLObject O0;
        int i12;
        TLObject O02;
        int i13;
        int i14;
        int i15 = this.f4256a;
        long j3 = this.f4258c;
        int i16 = this.f4257b;
        Object obj3 = this.f4260f;
        Object obj4 = this.f4259e;
        Object obj5 = this.d;
        switch (i15) {
            case 0:
                Context context = (Context) obj5;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj4;
                Runnable runnable = (Runnable) obj3;
                q9 q9Var = (q9) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (q9Var != null) {
                    int i17 = this.f4257b;
                    j10.i(i17);
                    long o4 = org.telegram.messenger.n5.o(q9Var.f26371e.peer);
                    long j10 = this.f4258c;
                    if (j10 != o4 && j10 != 0 && o4 != 0) {
                        e0 e0Var = new e0(context, i17, q9Var, j10, runnable);
                        if (i10 >= 0) {
                            O0 = mp.u1(i17).c2(Long.valueOf(o4));
                            i11 = 0;
                        } else {
                            i11 = 0;
                            O0 = mp.u1(i17).O0(Long.valueOf(-o4));
                        }
                        if (i7 >= 0) {
                            O02 = mp.u1(i17).c2(Long.valueOf(j10));
                            i12 = i11;
                        } else {
                            i12 = i11;
                            O02 = mp.u1(i17).O0(Long.valueOf(-j10));
                        }
                        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
                        g10.addView(new di.c6(context, O0, O02), ma.t(-1, -2, 48, 0, -4, 0, 0));
                        TextView textView = new TextView(context);
                        ks.i(textView);
                        textView.setText(gd.M0(2131750289, null));
                        int i18 = org.telegram.ui.ActionBar.n6.f29502j5;
                        org.telegram.messenger.f3.l(textView, i18, i6Var, 1, 20.0f);
                        if (gd.f24213a0) {
                            i13 = 5;
                        } else {
                            i13 = 3;
                        }
                        textView.setGravity(i13);
                        if (gd.f24213a0) {
                            i14 = 5;
                        } else {
                            i14 = 3;
                        }
                        g10.addView(textView, ma.d(-2, -2.0f, i14 | 48, 24.0f, 19.0f, 24.0f, 2.0f));
                        TextView textView2 = new TextView(context);
                        org.telegram.ui.ActionBar.u6.U(textView2, i18, i6Var);
                        textView2.setTextSize(1, 16.0f);
                        String t6 = org.telegram.messenger.n5.t(o4);
                        String t10 = org.telegram.messenger.n5.t(j10);
                        Object[] objArr = new Object[2];
                        objArr[i12] = t6;
                        objArr[1] = t10;
                        org.telegram.messenger.f3.q(null, null, 2131750288, objArr, textView2);
                        g10.addView(textView2, ma.t(-1, -2, 48, 24, 4, 24, 4));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(i12, context, i6Var);
                        alertDialog$Builder.o(g10);
                        alertDialog$Builder.k(gd.M0(2131751760, null), new a1.c(e0Var, 12));
                        alertDialog$Builder.h(gd.M0(2131752578, null), null);
                        alertDialog$Builder.f28744a.show();
                        return;
                    } else if (q9Var.f26371e.bid_date > 0 && !q9Var.f()) {
                        y yVar = new y(context, i6Var, null, q9Var);
                        yVar.f4201j2 = runnable;
                        yVar.show();
                        return;
                    } else {
                        new m0(context, i6Var, j10, q9Var.d, runnable).show();
                        return;
                    }
                }
                return;
            case 1:
                ci.o0 o0Var = (ci.o0) obj5;
                ci.n0 n0Var = (ci.n0) obj3;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (o0Var.f5737x == ((int[]) obj4)[0]) {
                    o0Var.f5737x = 0;
                }
                if (n0Var != null && ci.o0.h(i16).get(j3) == n0Var) {
                    if (tL_error2 == null) {
                        n0Var.f5724b = SystemClock.elapsedRealtime();
                    } else {
                        ci.o0.h(i16).remove(j3);
                    }
                }
                if (tL_error2 != null) {
                    org.telegram.messenger.a8.d("QrShare: setShareTheme " + tL_error2.text);
                    if (!o0Var.F) {
                        ci.z0 z0Var = o0Var.f5729b;
                        z0Var.getClass();
                        z0Var.d1(2131232438, gd.M0(2131751094, null), null);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                TLRPC.Photo photo = (TLRPC.Photo) obj4;
                Context context2 = (Context) obj5;
                fi.b bVar = (fi.b) obj3;
                Integer num = (Integer) obj;
                String str = (String) obj2;
                TL_account.reportProfilePhoto reportprofilephoto = new TL_account.reportProfilePhoto();
                reportprofilephoto.peer = mp.u1(i16).l1(j3);
                TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                tL_inputPhoto.f28422id = photo.f28427id;
                tL_inputPhoto.file_reference = photo.file_reference;
                tL_inputPhoto.access_hash = photo.access_hash;
                reportprofilephoto.photo_id = tL_inputPhoto;
                reportprofilephoto.message = "";
                if (num.intValue() == 0) {
                    reportprofilephoto.reason = new TLRPC.TL_inputReportReasonSpam();
                } else if (num.intValue() == 1) {
                    reportprofilephoto.reason = new TLRPC.TL_inputReportReasonViolence();
                } else if (num.intValue() == 2) {
                    reportprofilephoto.reason = new TLRPC.TL_inputReportReasonChildAbuse();
                } else if (num.intValue() == 5) {
                    reportprofilephoto.reason = new TLRPC.TL_inputReportReasonPornography();
                } else if (num.intValue() == 3) {
                    reportprofilephoto.reason = new TLRPC.TL_inputReportReasonIllegalDrugs();
                } else if (num.intValue() == 4) {
                    reportprofilephoto.reason = new TLRPC.TL_inputReportReasonPersonalDetails();
                }
                ConnectionsManager.getInstance(i16).sendRequest(reportprofilephoto, null);
                new lc(cb.a(context2), bVar).E(bVar).j();
                return;
            default:
                org.telegram.ui.Wallet.l2 l2Var = (org.telegram.ui.Wallet.l2) obj5;
                x10 x10Var = (x10) obj4;
                JSONObject jSONObject = (JSONObject) obj3;
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                if (tL_error3 == null && (bool2 instanceof TLRPC.TL_boolTrue)) {
                    boolean optBoolean = jSONObject.optBoolean("disconnect");
                    long j11 = this.f4258c;
                    int i19 = this.f4257b;
                    if (optBoolean) {
                        TL_wallet.tonConnectCloseSession tonconnectclosesession = new TL_wallet.tonConnectCloseSession();
                        tonconnectclosesession.session_id = j11;
                        l2Var.f44483f.sendRequestTyped(tonconnectclosesession, new d3.b(1), new org.telegram.ui.Wallet.w1(l2Var, x10Var, j11, i19, 1));
                        return;
                    }
                    l2Var.e(i19, j11, x10Var);
                    return;
                }
                x10Var.a(org.telegram.ui.Wallet.l2.z(tL_error3, "submitResponse"));
                return;
        }
    }

    public z(Context context, org.telegram.ui.ActionBar.i6 i6Var, int i7, long j3, Runnable runnable) {
        this.d = context;
        this.f4259e = i6Var;
        this.f4257b = i7;
        this.f4258c = j3;
        this.f4260f = runnable;
    }

    public z(ci.o0 o0Var, int[] iArr, ci.n0 n0Var, int i7, long j3) {
        this.d = o0Var;
        this.f4259e = iArr;
        this.f4260f = n0Var;
        this.f4257b = i7;
        this.f4258c = j3;
    }

    public z(org.telegram.ui.Wallet.l2 l2Var, x10 x10Var, JSONObject jSONObject, long j3, int i7) {
        this.d = l2Var;
        this.f4259e = x10Var;
        this.f4260f = jSONObject;
        this.f4258c = j3;
        this.f4257b = i7;
    }
}
