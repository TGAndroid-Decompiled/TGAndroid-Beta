package bi;

import android.content.Context;
import android.os.SystemClock;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ja;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.r9;
import org.telegram.messenger.s10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ta;
public final class z implements s10 {
    public final int f4021a = 2;
    public final int f4022b;
    public final long f4023c;
    public final Object d;
    public final Object f4024e;
    public final Object f4025f;

    public z(int i7, long j3, TLRPC.Photo photo, Context context, fi.b bVar) {
        this.f4022b = i7;
        this.f4023c = j3;
        this.f4024e = photo;
        this.d = context;
        this.f4025f = bVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7;
        int i10;
        int i11;
        TLObject M0;
        int i12;
        TLObject M02;
        int i13;
        int i14;
        int i15 = this.f4021a;
        long j3 = this.f4023c;
        int i16 = this.f4022b;
        Object obj3 = this.f4025f;
        Object obj4 = this.f4024e;
        Object obj5 = this.d;
        switch (i15) {
            case 0:
                Context context = (Context) obj5;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj4;
                Runnable runnable = (Runnable) obj3;
                r9 r9Var = (r9) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (r9Var != null) {
                    int i17 = this.f4022b;
                    m10.i(i17);
                    long o4 = org.telegram.messenger.m5.o(r9Var.f26269e.peer);
                    long j10 = this.f4023c;
                    if (j10 != o4 && j10 != 0 && o4 != 0) {
                        e0 e0Var = new e0(context, i17, r9Var, j10, runnable);
                        if (i10 >= 0) {
                            M0 = np.s1(i17).a2(Long.valueOf(o4));
                            i11 = 0;
                        } else {
                            i11 = 0;
                            M0 = np.s1(i17).M0(Long.valueOf(-o4));
                        }
                        if (i7 >= 0) {
                            M02 = np.s1(i17).a2(Long.valueOf(j10));
                            i12 = i11;
                        } else {
                            i12 = i11;
                            M02 = np.s1(i17).M0(Long.valueOf(-j10));
                        }
                        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
                        f10.addView(new di.z5(context, M0, M02), ja.t(-1, -2, 48, 0, -4, 0, 0));
                        TextView textView = new TextView(context);
                        ns.i(textView);
                        textView.setText(hd.M0(2131750305, null));
                        int i18 = org.telegram.ui.ActionBar.j6.f28957j5;
                        org.telegram.messenger.k5.m(textView, i18, e6Var, 1, 20.0f);
                        if (hd.f24104a0) {
                            i13 = 5;
                        } else {
                            i13 = 3;
                        }
                        textView.setGravity(i13);
                        if (hd.f24104a0) {
                            i14 = 5;
                        } else {
                            i14 = 3;
                        }
                        f10.addView(textView, ja.d(-2, -2.0f, i14 | 48, 24.0f, 19.0f, 24.0f, 2.0f));
                        TextView textView2 = new TextView(context);
                        org.telegram.ui.ActionBar.q6.U(textView2, i18, e6Var);
                        textView2.setTextSize(1, 16.0f);
                        String t6 = org.telegram.messenger.m5.t(o4);
                        String t10 = org.telegram.messenger.m5.t(j10);
                        Object[] objArr = new Object[2];
                        objArr[i12] = t6;
                        objArr[1] = t10;
                        org.telegram.messenger.k5.q(null, null, 2131750304, objArr, textView2);
                        f10.addView(textView2, ja.t(-1, -2, 48, 24, 4, 24, 4));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(i12, context, e6Var);
                        alertDialog$Builder.o(f10);
                        alertDialog$Builder.k(hd.M0(2131751771, null), new a1.c(e0Var, 12));
                        alertDialog$Builder.h(hd.M0(2131752589, null), null);
                        alertDialog$Builder.f28392a.show();
                        return;
                    } else if (r9Var.f26269e.bid_date > 0 && !r9Var.f()) {
                        y yVar = new y(context, e6Var, null, r9Var);
                        yVar.f3996j2 = runnable;
                        yVar.show();
                        return;
                    } else {
                        new m0(context, e6Var, j10, r9Var.d, runnable).show();
                        return;
                    }
                }
                return;
            case 1:
                ci.n0 n0Var = (ci.n0) obj5;
                ci.m0 m0Var = (ci.m0) obj3;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (n0Var.f5451x == ((int[]) obj4)[0]) {
                    n0Var.f5451x = 0;
                }
                if (m0Var != null && ci.n0.h(i16).get(j3) == m0Var) {
                    if (tL_error2 == null) {
                        m0Var.f5438b = SystemClock.elapsedRealtime();
                    } else {
                        ci.n0.h(i16).remove(j3);
                    }
                }
                if (tL_error2 != null) {
                    a8.d("QrShare: setShareTheme " + tL_error2.text);
                    if (!n0Var.F) {
                        ci.z0 z0Var = n0Var.f5443b;
                        z0Var.getClass();
                        z0Var.d1(2131232437, hd.M0(2131751105, null), null);
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
                reportprofilephoto.peer = np.s1(i16).j1(j3);
                TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                tL_inputPhoto.f28070id = photo.f28075id;
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
                new cc(ta.a(context2), bVar).E(bVar).j();
                return;
            default:
                org.telegram.ui.Wallet.d2 d2Var = (org.telegram.ui.Wallet.d2) obj5;
                z10 z10Var = (z10) obj4;
                JSONObject jSONObject = (JSONObject) obj3;
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                if (tL_error3 == null && (bool2 instanceof TLRPC.TL_boolTrue)) {
                    boolean optBoolean = jSONObject.optBoolean("disconnect");
                    long j11 = this.f4023c;
                    int i19 = this.f4022b;
                    if (optBoolean) {
                        TL_wallet.tonConnectCloseSession tonconnectclosesession = new TL_wallet.tonConnectCloseSession();
                        tonconnectclosesession.session_id = j11;
                        d2Var.f43733f.sendRequestTyped(tonconnectclosesession, new d3.b(1), new org.telegram.ui.Wallet.n1(d2Var, z10Var, j11, i19, 1));
                        return;
                    }
                    d2Var.e(i19, j11, z10Var);
                    return;
                }
                z10Var.a(org.telegram.ui.Wallet.d2.z(tL_error3, "submitResponse"));
                return;
        }
    }

    public z(Context context, org.telegram.ui.ActionBar.e6 e6Var, int i7, long j3, Runnable runnable) {
        this.d = context;
        this.f4024e = e6Var;
        this.f4022b = i7;
        this.f4023c = j3;
        this.f4025f = runnable;
    }

    public z(ci.n0 n0Var, int[] iArr, ci.m0 m0Var, int i7, long j3) {
        this.d = n0Var;
        this.f4024e = iArr;
        this.f4025f = m0Var;
        this.f4022b = i7;
        this.f4023c = j3;
    }

    public z(org.telegram.ui.Wallet.d2 d2Var, z10 z10Var, JSONObject jSONObject, long j3, int i7) {
        this.d = d2Var;
        this.f4024e = z10Var;
        this.f4025f = jSONObject;
        this.f4023c = j3;
        this.f4022b = i7;
    }
}
