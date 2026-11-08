package ai;

import android.content.Context;
import android.os.SystemClock;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.h7;
import c8.ha;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.messenger.k5;
import org.telegram.messenger.m5;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.s9;
import org.telegram.messenger.v10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.xa;
import org.telegram.ui.Wallet.e2;
public final class v0 implements v10 {
    public final int f1655a = 1;
    public final int f1656b;
    public final long f1657c;
    public final Object d;
    public final Object f1658e;
    public final Object f1659f;

    public v0(int i7, long j3, TLRPC.Photo photo, Context context, di.b bVar) {
        this.f1656b = i7;
        this.f1657c = j3;
        this.d = photo;
        this.f1658e = context;
        this.f1659f = bVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7;
        int i10;
        TLObject M0;
        int i11;
        TLObject M02;
        int i12;
        int i13;
        int i14 = this.f1655a;
        long j3 = this.f1657c;
        int i15 = this.f1656b;
        Object obj3 = this.f1659f;
        Object obj4 = this.f1658e;
        Object obj5 = this.d;
        switch (i14) {
            case 0:
                y0 y0Var = (y0) obj5;
                x0 x0Var = (x0) obj3;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (y0Var.f1698x == ((int[]) obj4)[0]) {
                    y0Var.f1698x = 0;
                }
                if (x0Var != null && y0.h(i15).get(j3) == x0Var) {
                    if (tL_error == null) {
                        x0Var.f1683b = SystemClock.elapsedRealtime();
                    } else {
                        y0.h(i15).remove(j3);
                    }
                }
                if (tL_error != null) {
                    a8.d("QrShare: setShareTheme " + tL_error.text);
                    if (!y0Var.E) {
                        l1 l1Var = y0Var.f1690b;
                        l1Var.getClass();
                        l1Var.d1(2131232436, id.M0(2131751106, null), null);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                TLRPC.Photo photo = (TLRPC.Photo) obj5;
                Context context = (Context) obj4;
                di.b bVar = (di.b) obj3;
                Integer num = (Integer) obj;
                String str = (String) obj2;
                TL_account.reportProfilePhoto reportprofilephoto = new TL_account.reportProfilePhoto();
                reportprofilephoto.peer = qp.s1(i15).j1(j3);
                TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                tL_inputPhoto.f26975id = photo.f26980id;
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
                ConnectionsManager.getInstance(i15).sendRequest(reportprofilephoto, null);
                new hc(xa.a(context), bVar).E(bVar).j();
                return;
            case 2:
                e2 e2Var = (e2) obj5;
                c20 c20Var = (c20) obj4;
                JSONObject jSONObject = (JSONObject) obj3;
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (tL_error2 == null && (bool2 instanceof TLRPC.TL_boolTrue)) {
                    boolean optBoolean = jSONObject.optBoolean("disconnect");
                    long j10 = this.f1657c;
                    int i16 = this.f1656b;
                    if (optBoolean) {
                        TL_wallet.tonConnectCloseSession tonconnectclosesession = new TL_wallet.tonConnectCloseSession();
                        tonconnectclosesession.session_id = j10;
                        e2Var.f42431f.sendRequestTyped(tonconnectclosesession, new d3.b(1), new org.telegram.ui.Wallet.o1(e2Var, c20Var, j10, i16, 1));
                        return;
                    }
                    e2Var.e(i16, j10, c20Var);
                    return;
                }
                c20Var.a(e2.z(tL_error2, "submitResponse"));
                return;
            default:
                Context context2 = (Context) obj5;
                f6 f6Var = (f6) obj4;
                Runnable runnable = (Runnable) obj3;
                s9 s9Var = (s9) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                if (s9Var != null) {
                    int i17 = this.f1656b;
                    p10.i(i17);
                    long o4 = m5.o(s9Var.f25437e.peer);
                    long j11 = this.f1657c;
                    if (j11 != o4 && j11 != 0 && o4 != 0) {
                        bi.d0 d0Var = new bi.d0(context2, i17, s9Var, j11, runnable);
                        if (i10 >= 0) {
                            M0 = qp.s1(i17).a2(Long.valueOf(o4));
                        } else {
                            M0 = qp.s1(i17).M0(Long.valueOf(-o4));
                        }
                        if (i7 >= 0) {
                            M02 = qp.s1(i17).a2(Long.valueOf(j11));
                            i11 = 0;
                        } else {
                            i11 = 0;
                            M02 = qp.s1(i17).M0(Long.valueOf(-j11));
                        }
                        LinearLayout f10 = k5.f(context2, 1);
                        f10.addView(new h7(context2, M0, M02), ha.t(-1, -2, 48, 0, -4, 0, 0));
                        TextView textView = new TextView(context2);
                        qs.i(textView);
                        textView.setText(id.M0(2131750306, null));
                        int i18 = k6.f27960j5;
                        k5.n(textView, i18, f6Var, 1, 20.0f);
                        if (id.f23157a0) {
                            i12 = 5;
                        } else {
                            i12 = 3;
                        }
                        textView.setGravity(i12);
                        if (id.f23157a0) {
                            i13 = 5;
                        } else {
                            i13 = 3;
                        }
                        f10.addView(textView, ha.d(-2, -2.0f, i13 | 48, 24.0f, 19.0f, 24.0f, 2.0f));
                        TextView textView2 = new TextView(context2);
                        r6.V(textView2, i18, f6Var);
                        textView2.setTextSize(1, 16.0f);
                        String t6 = m5.t(o4);
                        String t10 = m5.t(j11);
                        Object[] objArr = new Object[2];
                        objArr[i11] = t6;
                        objArr[1] = t10;
                        k5.r(null, null, 2131750305, objArr, textView2);
                        f10.addView(textView2, ha.t(-1, -2, 48, 24, 4, 24, 4));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(i11, context2, f6Var);
                        alertDialog$Builder.o(f10);
                        alertDialog$Builder.k(id.M0(2131751771, null), new u5.e(d0Var, 13));
                        alertDialog$Builder.h(id.M0(2131752589, null), null);
                        alertDialog$Builder.f27296a.show();
                        return;
                    } else if (s9Var.f25437e.bid_date > 0 && !s9Var.f()) {
                        zh.l lVar = new zh.l(context2, f6Var, null, s9Var);
                        lVar.f60424f2 = runnable;
                        lVar.show();
                        return;
                    } else {
                        new zh.u(context2, f6Var, j11, s9Var.d, runnable).show();
                        return;
                    }
                }
                return;
        }
    }

    public v0(y0 y0Var, int[] iArr, x0 x0Var, int i7, long j3) {
        this.d = y0Var;
        this.f1658e = iArr;
        this.f1659f = x0Var;
        this.f1656b = i7;
        this.f1657c = j3;
    }

    public v0(Context context, f6 f6Var, int i7, long j3, Runnable runnable) {
        this.d = context;
        this.f1658e = f6Var;
        this.f1656b = i7;
        this.f1657c = j3;
        this.f1659f = runnable;
    }

    public v0(e2 e2Var, c20 c20Var, JSONObject jSONObject, long j3, int i7) {
        this.d = e2Var;
        this.f1658e = c20Var;
        this.f1659f = jSONObject;
        this.f1657c = j3;
        this.f1656b = i7;
    }
}
