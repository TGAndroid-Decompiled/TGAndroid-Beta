package ai;

import android.view.View;
import android.widget.ImageView;
import di.v8;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.s10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.m5;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.t4;
import org.telegram.ui.ad;
import org.telegram.ui.an;
import org.telegram.ui.gb;
import org.telegram.ui.ka;
import org.telegram.ui.la;
import org.telegram.ui.lm;
import org.telegram.ui.q5;
import org.telegram.ui.qc;
import org.telegram.ui.z9;
public final class b implements Runnable {
    public final int f1122a;
    public final Object f1123b;
    public final Object f1124c;
    public final Object d;
    public final Object f1125e;
    public final Object f1126f;

    public b(v8 v8Var, boolean[] zArr, String str, TLRPC.ChatInvite chatInvite, s10 s10Var) {
        this.f1122a = 4;
        this.f1124c = v8Var;
        this.f1123b = zArr;
        this.d = str;
        this.f1125e = chatInvite;
        this.f1126f = s10Var;
    }

    private final void a() {
        la laVar = (la) this.f1123b;
        String str = (String) this.f1124c;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
        TLObject tLObject = (TLObject) this.f1125e;
        TL_account.checkUsername checkusername = (TL_account.checkUsername) this.f1126f;
        laVar.f48913e = 0;
        String str2 = laVar.f48914f;
        if (str2 != null && str2.equals(str)) {
            if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                org.telegram.ui.Cells.b2 b2Var = laVar.H;
                if (b2Var != null) {
                    b2Var.setText(hd.a0("UsernameAvailable", null, 2131743667, str));
                    org.telegram.ui.Cells.b2 b2Var2 = laVar.H;
                    int i7 = j6.f29203w6;
                    b2Var2.setTag(Integer.valueOf(i7));
                    q6.U(laVar.H, i7, null);
                    ka kaVar = laVar.G;
                    if (kaVar != null) {
                        ka.a(kaVar);
                    }
                }
            } else if (laVar.H != null) {
                if (tL_error != null && "USERNAME_INVALID".equals(tL_error.text) && checkusername.username.length() == 4) {
                    laVar.H.setText(hd.M0(2131743654, null));
                    org.telegram.ui.Cells.b2 b2Var3 = laVar.H;
                    int i10 = j6.f29070p7;
                    b2Var3.setTag(Integer.valueOf(i10));
                    q6.U(laVar.H, i10, null);
                } else if (tL_error != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text)) {
                    if (checkusername.username.length() == 4) {
                        laVar.H.setText(hd.M0(2131743653, null));
                    } else {
                        laVar.H.setText(hd.M0(2131743657, null));
                    }
                    org.telegram.ui.Cells.b2 b2Var4 = laVar.H;
                    int i11 = j6.F6;
                    b2Var4.setTag(Integer.valueOf(i11));
                    q6.U(laVar.H, i11, null);
                } else {
                    laVar.H.setText(hd.M0(2131743658, null));
                    org.telegram.ui.Cells.b2 b2Var5 = laVar.H;
                    int i12 = j6.f29070p7;
                    b2Var5.setTag(Integer.valueOf(i12));
                    q6.U(laVar.H, i12, null);
                }
                ka kaVar2 = laVar.G;
                if (kaVar2 != null) {
                    ka.a(kaVar2);
                }
            }
        }
    }

    private final void b() {
        ad adVar = (ad) this.f1123b;
        String str = (String) this.f1124c;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
        TLObject tLObject = (TLObject) this.f1125e;
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = (TLRPC.TL_channels_checkUsername) this.f1126f;
        adVar.Y = 0;
        String str2 = adVar.Z;
        if (str2 != null && str2.equals(str)) {
            if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                adVar.W.setText(hd.a0("LinkAvailable", null, 2131748924, str));
                org.telegram.ui.Cells.b2 b2Var = adVar.W;
                int i7 = j6.f29203w6;
                b2Var.setTag(Integer.valueOf(i7));
                q6.U(adVar.W, i7, null);
                adVar.f44998b0 = true;
                return;
            }
            if (tL_error != null && "USERNAME_INVALID".equals(tL_error.text) && tL_channels_checkUsername.username.length() == 4) {
                adVar.W.setText(hd.M0(2131743654, null));
                q6.U(adVar.W, j6.f29070p7, null);
            } else if (tL_error != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text)) {
                if (tL_channels_checkUsername.username.length() == 4) {
                    adVar.W.setText(hd.M0(2131743653, null));
                } else {
                    adVar.W.setText(hd.M0(2131743657, null));
                }
                q6.U(adVar.W, j6.F6, null);
            } else if (tL_error != null && "CHANNELS_ADMIN_PUBLIC_TOO_MUCH".equals(tL_error.text)) {
                q6.U(adVar.W, j6.f29070p7, null);
                adVar.f45011l0 = false;
                adVar.l0();
            } else {
                q6.U(adVar.W, j6.f29070p7, null);
                adVar.W.setText(hd.M0(2131748912, null));
            }
            adVar.f44998b0 = false;
        }
    }

    private final void c() {
        an anVar = (an) this.d;
        boolean[] zArr = (boolean[]) this.f1123b;
        boolean[] zArr2 = (boolean[]) this.f1124c;
        ImageView imageView = (ImageView) this.f1125e;
        ImageView imageView2 = (ImageView) this.f1126f;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        long[] jArr = {-1};
        m5 m5Var = new m5(jArr, zArr2, imageView, imageView2, 7);
        TLRPC.TL_messages_rateTranscribedAudio tL_messages_rateTranscribedAudio = new TLRPC.TL_messages_rateTranscribedAudio();
        tL_messages_rateTranscribedAudio.msg_id = anVar.f45382u5.e1();
        tL_messages_rateTranscribedAudio.peer = anVar.getMessagesController().m1(anVar.f45382u5.f23817k.peer_id);
        tL_messages_rateTranscribedAudio.transcription_id = anVar.f45382u5.f23817k.voiceTranscriptionId;
        tL_messages_rateTranscribedAudio.good = zArr2[0];
        anVar.getConnectionsManager().sendRequest(tL_messages_rateTranscribedAudio, new z9(anVar, m5Var, jArr, 4));
        org.telegram.messenger.g0.i3(m5Var, 150L);
    }

    private final void d() {
        an.w0((an) this.f1124c, (View) this.d, (boolean[]) this.f1123b, (org.telegram.ui.ActionBar.g1) this.f1125e, (View) this.f1126f);
    }

    private final void f() {
        lm lmVar = (lm) this.f1123b;
        org.telegram.ui.ActionBar.t1[] t1VarArr = (org.telegram.ui.ActionBar.t1[]) this.d;
        gj gjVar = (gj) this.f1125e;
        q5 q5Var = (q5) this.f1126f;
        an anVar = lmVar.f49005a;
        if (((TLRPC.Message) this.f1124c).suggested_post.schedule_date == 0) {
            t1VarArr[0].setOnDismissListener(null);
            org.telegram.ui.ActionBar.u2 u2Var = (org.telegram.ui.ActionBar.u2) t4.Q(anVar.getParentActivity(), 0L, new m2.d(19, lmVar, gjVar), anVar.getResourceProvider(), 1).f25804b;
            u2Var.show();
            u2Var.setOnDismissListener(q5Var);
            return;
        }
        anVar.getMessagesController().v(gjVar.f23817k.f28072id, 0, org.telegram.messenger.m5.o(gjVar.f23817k.peer_id), null, false);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.b.run():void");
    }

    public b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.f1122a = i7;
        this.f1123b = obj;
        this.f1124c = obj2;
        this.d = obj3;
        this.f1125e = obj4;
        this.f1126f = obj5;
    }

    public b(gb gbVar, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite, boolean[] zArr, org.telegram.ui.ActionBar.t1 t1Var) {
        this.f1122a = 23;
        this.f1124c = gbVar;
        this.d = tL_chatInviteExported;
        this.f1125e = tL_messages_exportedChatInvite;
        this.f1123b = zArr;
        this.f1126f = t1Var;
    }

    public b(qc qcVar, boolean[] zArr, int[] iArr, int[] iArr2, TLRPC.TL_error tL_error) {
        this.f1122a = 24;
        this.f1124c = qcVar;
        this.f1123b = zArr;
        this.f1125e = iArr;
        this.d = iArr2;
        this.f1126f = tL_error;
    }

    public b(an anVar, View view, boolean[] zArr, org.telegram.ui.ActionBar.g1 g1Var, View view2) {
        this.f1122a = 27;
        this.f1124c = anVar;
        this.d = view;
        this.f1123b = zArr;
        this.f1125e = g1Var;
        this.f1126f = view2;
    }

    public b(an anVar, boolean[] zArr, boolean[] zArr2, ImageView imageView, ImageView imageView2) {
        this.f1122a = 26;
        this.d = anVar;
        this.f1123b = zArr;
        this.f1124c = zArr2;
        this.f1125e = imageView;
        this.f1126f = imageView2;
    }

    public b(boolean[] zArr, boolean[] zArr2, int[] iArr, boolean[] zArr3, a1.e eVar) {
        this.f1122a = 0;
        this.f1123b = zArr;
        this.f1124c = zArr2;
        this.f1125e = iArr;
        this.d = zArr3;
        this.f1126f = eVar;
    }
}
