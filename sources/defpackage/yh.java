package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.json.JSONObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class yh implements jac {
    public final byte a = 0;
    public final Object b;
    public final int c;
    public final long d;
    public final Object e;
    public final Object f;

    public yh(int i, long j, r63 r63Var, Context context, TLRPC.Photo photo) {
        this.c = i;
        this.d = j;
        this.e = photo;
        this.b = context;
        this.f = r63Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i;
        int i2;
        TLObject L0;
        TLObject L02;
        int i3;
        int i4;
        byte b = this.a;
        long j = this.d;
        int i5 = this.c;
        Object obj3 = this.f;
        Object obj4 = this.b;
        Object obj5 = this.e;
        switch (b) {
            case 0:
                TLRPC.Photo photo = (TLRPC.Photo) obj5;
                Context context = (Context) obj4;
                r63 r63Var = (r63) obj3;
                Integer num = (Integer) obj;
                String str = (String) obj2;
                TL_account.reportProfilePhoto reportprofilephoto = new TL_account.reportProfilePhoto();
                reportprofilephoto.peer = oc7.r1(i5).i1(j);
                TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                tL_inputPhoto.id = photo.id;
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
                ConnectionsManager.getInstance(i5).sendRequest(reportprofilephoto, null);
                new c41(n21.a(context), r63Var).E(r63Var).j();
                return;
            case 1:
                Context context2 = (Context) obj4;
                ylb ylbVar = (ylb) obj5;
                bx4 bx4Var = (bx4) obj3;
                hv4 hv4Var = (hv4) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (hv4Var != null) {
                    int i6 = this.c;
                    z8c.h(i6);
                    long n = pg3.n(hv4Var.e.peer);
                    long j2 = this.d;
                    if (j2 != n && j2 != 0 && n != 0) {
                        wz wzVar = new wz(context2, i6, hv4Var, j2, bx4Var);
                        if (i2 >= 0) {
                            L0 = oc7.r1(i6).W1(Long.valueOf(n));
                        } else {
                            L0 = oc7.r1(i6).L0(Long.valueOf(-n));
                        }
                        if (i >= 0) {
                            L02 = oc7.r1(i6).W1(Long.valueOf(j2));
                        } else {
                            L02 = oc7.r1(i6).L0(Long.valueOf(-j2));
                        }
                        LinearLayout i7 = hg9.i(context2, 1);
                        i7.addView(new vsa(context2, L0, L02), qoe.t(-1, -2, 48, 0, -4, 0, 0));
                        TextView textView = new TextView(context2);
                        nm7.i(textView);
                        textView.setText(jb6.M0(2131750238, null));
                        int i8 = cmb.i5;
                        td4.x(textView, i8, ylbVar, 1, 20.0f);
                        if (jb6.a0) {
                            i3 = 5;
                        } else {
                            i3 = 3;
                        }
                        textView.setGravity(i3);
                        if (jb6.a0) {
                            i4 = 5;
                        } else {
                            i4 = 3;
                        }
                        i7.addView(textView, qoe.d(-2, -2.0f, i4 | 48, 24.0f, 19.0f, 24.0f, 2.0f));
                        TextView textView2 = new TextView(context2);
                        anb.X(textView2, i8, ylbVar);
                        textView2.setTextSize(1, 16.0f);
                        hg9.q(null, null, 2131750237, new Object[]{pg3.s(n), pg3.s(j2)}, textView2);
                        i7.addView(textView2, qoe.t(-1, -2, 48, 24, 4, 24, 4));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, context2);
                        alertDialog$Builder.n(i7);
                        alertDialog$Builder.j(jb6.M0(2131751708, null), new l0(wzVar, (byte) 24));
                        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                        alertDialog$Builder.a.show();
                        return;
                    } else if (hv4Var.e.bid_date > 0 && !hv4Var.f()) {
                        tz tzVar = new tz(context2, ylbVar, null, hv4Var);
                        tzVar.i2 = bx4Var;
                        tzVar.show();
                        return;
                    } else {
                        new e00(context2, ylbVar, j2, hv4Var.d, bx4Var).show();
                        return;
                    }
                }
                return;
            case 2:
                w45 w45Var = (w45) obj5;
                qac qacVar = (qac) obj4;
                JSONObject jSONObject = (JSONObject) obj3;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (tL_error2 == null && (bool instanceof TLRPC.TL_boolTrue)) {
                    boolean optBoolean = jSONObject.optBoolean("disconnect");
                    long j3 = this.d;
                    int i9 = this.c;
                    if (optBoolean) {
                        TL_wallet.tonConnectCloseSession tonconnectclosesession = new TL_wallet.tonConnectCloseSession();
                        tonconnectclosesession.session_id = j3;
                        w45Var.f.sendRequestTyped(tonconnectclosesession, new kc((byte) 0), new g45(w45Var, qacVar, j3, i9, (byte) 1));
                        return;
                    }
                    w45Var.d(i9, j3, qacVar);
                    return;
                }
                qacVar.a(w45.z(tL_error2, "submitResponse"));
                return;
            default:
                my8 my8Var = (my8) obj5;
                ly8 ly8Var = (ly8) obj3;
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                if (my8Var.x == ((int[]) obj4)[0]) {
                    my8Var.x = 0;
                }
                if (ly8Var != null && my8.h(i5).get(j) == ly8Var) {
                    if (tL_error3 == null) {
                        ly8Var.b = SystemClock.elapsedRealtime();
                    } else {
                        my8.h(i5).remove(j);
                    }
                }
                if (tL_error3 != null) {
                    fc4.d("QrShare: setShareTheme " + tL_error3.text);
                    if (!my8Var.F) {
                        wy8 wy8Var = my8Var.b;
                        wy8Var.getClass();
                        wy8Var.d1(2131232442, jb6.M0(2131751042, null), null);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public yh(w45 w45Var, qac qacVar, JSONObject jSONObject, long j, int i) {
        this.e = w45Var;
        this.b = qacVar;
        this.f = jSONObject;
        this.d = j;
        this.c = i;
    }

    public yh(my8 my8Var, int[] iArr, ly8 ly8Var, int i, long j) {
        this.e = my8Var;
        this.b = iArr;
        this.f = ly8Var;
        this.c = i;
        this.d = j;
    }

    public yh(Context context, ylb ylbVar, int i, long j, bx4 bx4Var) {
        this.b = context;
        this.e = ylbVar;
        this.c = i;
        this.d = j;
        this.f = bx4Var;
    }
}
