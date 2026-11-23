package bi;

import android.widget.ImageView;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.r10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.lc;
import org.telegram.ui.ad;
import org.telegram.ui.bn;
import org.telegram.ui.ka;
import org.telegram.ui.la;
import org.telegram.ui.mm;
import org.telegram.ui.qc;
import org.telegram.ui.rn;
import org.telegram.ui.vb;
import org.telegram.ui.z9;
public final class s1 implements Runnable {
    public final int f4039a;
    public final Object f4040b;
    public final Object f4041c;
    public final Object d;
    public final Object f4042e;
    public final Object f4043f;

    public s1(f9 f9Var, TLObject tLObject, TLRPC.TL_inputStorePaymentGiftPremium tL_inputStorePaymentGiftPremium, TLRPC.TL_error tL_error, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
        this.f4039a = 1;
        this.d = f9Var;
        this.f4040b = tLObject;
        this.f4042e = tL_inputStorePaymentGiftPremium;
        this.f4041c = tL_error;
        this.f4043f = tL_payments_canPurchaseStore;
    }

    private final void a() {
        la laVar = (la) this.d;
        String str = (String) this.f4042e;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f4041c;
        TLObject tLObject = (TLObject) this.f4040b;
        TL_account.checkUsername checkusername = (TL_account.checkUsername) this.f4043f;
        laVar.f49510e = 0;
        String str2 = laVar.f49511f;
        if (str2 != null && str2.equals(str)) {
            if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                org.telegram.ui.Cells.c2 c2Var = laVar.H;
                if (c2Var != null) {
                    c2Var.setText(hd.a0("UsernameAvailable", null, 2131743424, str));
                    org.telegram.ui.Cells.c2 c2Var2 = laVar.H;
                    int i7 = org.telegram.ui.ActionBar.m6.f29701w6;
                    c2Var2.setTag(Integer.valueOf(i7));
                    org.telegram.ui.ActionBar.t6.U(laVar.H, i7, null);
                    ka kaVar = laVar.G;
                    if (kaVar != null) {
                        ka.a(kaVar);
                    }
                }
            } else if (laVar.H != null) {
                if (tL_error != null && "USERNAME_INVALID".equals(tL_error.text) && checkusername.username.length() == 4) {
                    laVar.H.setText(hd.N0(2131743411, null));
                    org.telegram.ui.Cells.c2 c2Var3 = laVar.H;
                    int i10 = org.telegram.ui.ActionBar.m6.f29568p7;
                    c2Var3.setTag(Integer.valueOf(i10));
                    org.telegram.ui.ActionBar.t6.U(laVar.H, i10, null);
                } else if (tL_error != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text)) {
                    if (checkusername.username.length() == 4) {
                        laVar.H.setText(hd.N0(2131743410, null));
                    } else {
                        laVar.H.setText(hd.N0(2131743414, null));
                    }
                    org.telegram.ui.Cells.c2 c2Var4 = laVar.H;
                    int i11 = org.telegram.ui.ActionBar.m6.F6;
                    c2Var4.setTag(Integer.valueOf(i11));
                    org.telegram.ui.ActionBar.t6.U(laVar.H, i11, null);
                } else {
                    laVar.H.setText(hd.N0(2131743415, null));
                    org.telegram.ui.Cells.c2 c2Var5 = laVar.H;
                    int i12 = org.telegram.ui.ActionBar.m6.f29568p7;
                    c2Var5.setTag(Integer.valueOf(i12));
                    org.telegram.ui.ActionBar.t6.U(laVar.H, i12, null);
                }
                ka kaVar2 = laVar.G;
                if (kaVar2 != null) {
                    ka.a(kaVar2);
                }
            }
        }
    }

    private final void b() {
        int i7;
        int i10;
        qc qcVar = (qc) this.d;
        boolean[] zArr = (boolean[]) this.f4040b;
        int[] iArr = (int[]) this.f4042e;
        int[] iArr2 = (int[]) this.f4043f;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f4041c;
        if (!zArr[0] && (i7 = iArr[0]) < iArr2[0]) {
            if (tL_error != null) {
                zArr[0] = true;
                if ("BOOSTS_REQUIRED".equals(tL_error.text)) {
                    qcVar.getMessagesController().I0().b(qcVar.f51140a, qcVar.f51144c, new vb(qcVar, 1));
                    return;
                }
                qcVar.Q.setLoading(false);
                lc.b0(qcVar).Q(2131624012, 36, hd.a0(null, null, 2131743635, tL_error.text)).j();
                return;
            }
            int i11 = i7 + 1;
            iArr[0] = i11;
            if (i11 == iArr2[0]) {
                qcVar.finishFragment();
                org.telegram.ui.ActionBar.g2 g2Var = qcVar.m0;
                if (g2Var != null) {
                    if (g2Var instanceof rn) {
                        ((rn) g2Var).t0();
                    }
                    lc b02 = lc.b0(qcVar.m0);
                    if (qcVar.d) {
                        i10 = 2131749305;
                    } else {
                        i10 = 2131752447;
                    }
                    org.telegram.messenger.f3.n(null, i10, b02, 2131623990, 36);
                    qcVar.m0 = null;
                }
                qcVar.Q.setLoading(false);
            }
        }
    }

    private final void c() {
        ad adVar = (ad) this.d;
        String str = (String) this.f4042e;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f4041c;
        TLObject tLObject = (TLObject) this.f4040b;
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = (TLRPC.TL_channels_checkUsername) this.f4043f;
        adVar.Y = 0;
        String str2 = adVar.Z;
        if (str2 != null && str2.equals(str)) {
            if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                adVar.W.setText(hd.a0("LinkAvailable", null, 2131748731, str));
                org.telegram.ui.Cells.c2 c2Var = adVar.W;
                int i7 = org.telegram.ui.ActionBar.m6.f29701w6;
                c2Var.setTag(Integer.valueOf(i7));
                org.telegram.ui.ActionBar.t6.U(adVar.W, i7, null);
                adVar.f45545b0 = true;
                return;
            }
            if (tL_error != null && "USERNAME_INVALID".equals(tL_error.text) && tL_channels_checkUsername.username.length() == 4) {
                adVar.W.setText(hd.N0(2131743411, null));
                org.telegram.ui.ActionBar.t6.U(adVar.W, org.telegram.ui.ActionBar.m6.f29568p7, null);
            } else if (tL_error != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text)) {
                if (tL_channels_checkUsername.username.length() == 4) {
                    adVar.W.setText(hd.N0(2131743410, null));
                } else {
                    adVar.W.setText(hd.N0(2131743414, null));
                }
                org.telegram.ui.ActionBar.t6.U(adVar.W, org.telegram.ui.ActionBar.m6.F6, null);
            } else if (tL_error != null && "CHANNELS_ADMIN_PUBLIC_TOO_MUCH".equals(tL_error.text)) {
                org.telegram.ui.ActionBar.t6.U(adVar.W, org.telegram.ui.ActionBar.m6.f29568p7, null);
                adVar.f45558l0 = false;
                adVar.l0();
            } else {
                org.telegram.ui.ActionBar.t6.U(adVar.W, org.telegram.ui.ActionBar.m6.f29568p7, null);
                adVar.W.setText(hd.N0(2131748719, null));
            }
            adVar.f45545b0 = false;
        }
    }

    private final void d() {
        bn bnVar = (bn) this.d;
        boolean[] zArr = (boolean[]) this.f4040b;
        boolean[] zArr2 = (boolean[]) this.f4042e;
        ImageView imageView = (ImageView) this.f4043f;
        ImageView imageView2 = (ImageView) this.f4041c;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        long[] jArr = {-1};
        org.telegram.messenger.camera.i iVar = new org.telegram.messenger.camera.i(jArr, zArr2, imageView, imageView2, 11);
        TLRPC.TL_messages_rateTranscribedAudio tL_messages_rateTranscribedAudio = new TLRPC.TL_messages_rateTranscribedAudio();
        tL_messages_rateTranscribedAudio.msg_id = bnVar.f46181v5.e1();
        tL_messages_rateTranscribedAudio.peer = bnVar.getMessagesController().o1(bnVar.f46181v5.f24177k.peer_id);
        tL_messages_rateTranscribedAudio.transcription_id = bnVar.f46181v5.f24177k.voiceTranscriptionId;
        tL_messages_rateTranscribedAudio.good = zArr2[0];
        bnVar.getConnectionsManager().sendRequest(tL_messages_rateTranscribedAudio, new z9(bnVar, iVar, jArr, 4));
        org.telegram.messenger.g0.h3(iVar, 150L);
    }

    private final void f() {
        mm mmVar = (mm) this.d;
        org.telegram.ui.ActionBar.t1[] t1VarArr = (org.telegram.ui.ActionBar.t1[]) this.f4042e;
        gj gjVar = (gj) this.f4043f;
        org.telegram.ui.q5 q5Var = (org.telegram.ui.q5) this.f4041c;
        bn bnVar = mmVar.f49910a;
        if (((TLRPC.Message) this.f4040b).suggested_post.schedule_date == 0) {
            t1VarArr[0].setOnDismissListener(null);
            org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) org.telegram.ui.Components.c5.Q(bnVar.getParentActivity(), 0L, new oi.e0(17, mmVar, gjVar), bnVar.getResourceProvider(), 1).f15680b;
            w2Var.show();
            w2Var.setOnDismissListener(q5Var);
            return;
        }
        bnVar.getMessagesController().v(gjVar.f24177k.f28419id, 0, org.telegram.messenger.n5.o(gjVar.f24177k.peer_id), null, false);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: bi.s1.run():void");
    }

    public s1(di.y8 y8Var, TLRPC.TL_error tL_error, r10 r10Var, TLObject tLObject, TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars, int i7) {
        this.f4039a = i7;
        this.d = y8Var;
        this.f4041c = tL_error;
        this.f4042e = r10Var;
        this.f4040b = tLObject;
        this.f4043f = tL_inputInvoiceStars;
    }

    public s1(fi.z3 z3Var, Runnable runnable, TLRPC.TL_error tL_error, TL_stories.StoryItem storyItem, hi.o8 o8Var) {
        this.f4039a = 11;
        this.d = z3Var;
        this.f4040b = runnable;
        this.f4041c = tL_error;
        this.f4042e = storyItem;
        this.f4043f = o8Var;
    }

    public s1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.f4039a = i7;
        this.d = obj;
        this.f4040b = obj2;
        this.f4042e = obj3;
        this.f4043f = obj4;
        this.f4041c = obj5;
    }

    public s1(Object obj, Object obj2, TLObject tLObject, Object obj3, Object obj4, int i7) {
        this.f4039a = i7;
        this.d = obj;
        this.f4042e = obj2;
        this.f4040b = tLObject;
        this.f4043f = obj3;
        this.f4041c = obj4;
    }

    public s1(org.telegram.ui.ActionBar.g2 g2Var, String str, TLRPC.TL_error tL_error, TLObject tLObject, TLObject tLObject2, int i7) {
        this.f4039a = i7;
        this.d = g2Var;
        this.f4042e = str;
        this.f4041c = tL_error;
        this.f4040b = tLObject;
        this.f4043f = tLObject2;
    }
}
