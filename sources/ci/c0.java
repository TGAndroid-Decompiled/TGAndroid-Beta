package ci;

import android.os.Build;
import android.text.TextUtils;
import ei.gc;
import ei.jb;
import ei.lb;
import ei.vb;
import ei.xa;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_wallet;
public final class c0 implements Utilities.Callback3 {
    public final int f5263a;
    public final Object f5264b;
    public final Object f5265c;

    public c0(int i10, Object obj, Object obj2) {
        this.f5263a = i10;
        this.f5264b = obj;
        this.f5265c = obj2;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3) {
        xa xaVar;
        String str;
        switch (this.f5263a) {
            case 0:
                n2 n2Var = (n2) this.f5264b;
                v0 v0Var = (v0) this.f5265c;
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj3;
                int i10 = n2Var.N;
                if (((Boolean) obj2).booleanValue()) {
                    TL_phone.deleteGroupCallParticipantMessages deletegroupcallparticipantmessages = new TL_phone.deleteGroupCallParticipantMessages();
                    deletegroupcallparticipantmessages.call = n2Var.O;
                    deletegroupcallparticipantmessages.participant = MessagesController.getInstance(i10).getInputPeer(v0Var.f6068c);
                    deletegroupcallparticipantmessages.report_spam = bool.booleanValue();
                    ConnectionsManager.getInstance(i10).sendRequest(deletegroupcallparticipantmessages, null);
                    long j10 = v0Var.f6068c;
                    ArrayList arrayList = n2Var.f6143r;
                    ArrayList arrayList2 = n2Var.f6144s;
                    int i11 = 0;
                    boolean z10 = false;
                    while (i11 < arrayList.size()) {
                        if (((v0) arrayList.get(i11)).f6068c == j10) {
                            v0 v0Var2 = (v0) arrayList.get(i11);
                            int i12 = 0;
                            while (true) {
                                if (i12 < arrayList2.size()) {
                                    if (((w0) arrayList2.get(i12)).f6102f.contains(v0Var2)) {
                                        ((w0) arrayList2.get(i12)).f6102f.remove(v0Var2);
                                        if (((w0) arrayList2.get(i12)).f6102f.isEmpty()) {
                                            arrayList2.remove(i12);
                                            z10 = true;
                                        } else {
                                            n2Var.m();
                                        }
                                    } else {
                                        i12++;
                                    }
                                }
                            }
                            arrayList.remove(i11);
                            n2Var.e.N(true);
                            i11--;
                        }
                        i11++;
                    }
                    if (z10) {
                        ConnectionsManager.getInstance(i10).getCurrentTime();
                        Collections.sort(arrayList2, new a4.d(n2Var, 12));
                        n2Var.f6142n.N(true);
                        n2Var.t();
                    }
                } else {
                    TL_phone.deleteGroupCallMessages deletegroupcallmessages = new TL_phone.deleteGroupCallMessages();
                    deletegroupcallmessages.call = n2Var.O;
                    deletegroupcallmessages.messages.add(Integer.valueOf(v0Var.f6066a));
                    ConnectionsManager.getInstance(i10).sendRequest(deletegroupcallmessages, null);
                    n2Var.c(v0Var.f6066a);
                }
                if (bool2.booleanValue()) {
                    if (n2Var.M >= 0) {
                        MessagesController.getInstance(i10).blockPeer(n2Var.M);
                        return;
                    } else {
                        MessagesController.getInstance(i10).deleteParticipantFromChat(-n2Var.M, MessagesController.getInstance(i10).getInputPeer(v0Var.f6068c), false, true);
                        return;
                    }
                }
                return;
            case 1:
                lb lbVar = (lb) this.f5264b;
                ei.p pVar = (ei.p) this.f5265c;
                File file = (File) obj;
                String str2 = (String) obj2;
                Long l4 = (Long) obj3;
                vb vbVar = lbVar.S1;
                jb jbVar = vbVar.X0;
                if (jbVar != null) {
                    jbVar.O = false;
                    jbVar.c();
                    jb jbVar2 = vbVar.X0;
                    jbVar2.m(0L);
                    gc gcVar = jbVar2.F;
                    if (gcVar != null) {
                        gcVar.setProgress(0L);
                    }
                }
                ei.a8 a8Var = vbVar.K1;
                if (a8Var != null) {
                    a8Var.f8726o0 = file;
                    a8Var.f8728p0 = str2;
                    a8Var.f8730q0 = l4.longValue();
                    ei.a8 a8Var2 = vbVar.K1;
                    a8Var2.f8734s0 = 0.0f;
                    a8Var2.f8736t0 = 1.0f;
                    a8Var2.f8732r0 = 0L;
                    a8Var2.f8738u0 = 1.0f;
                    vbVar.t();
                    if (vbVar.X0 != null && (xaVar = vbVar.f10016v1) != null) {
                        rg.b2 l02 = xaVar.l0(vbVar.K1.f8728p0, true);
                        lbVar.setHasRoundVideo(true);
                        vbVar.X0.s(vbVar.K1, l02, true);
                        AndroidUtilities.cancelRunOnUIThread(pVar.h);
                        pVar.f8963a.destroy(true, null);
                        l02.setDraw(false);
                        pVar.post(new ei.p6(3, pVar, l02));
                        return;
                    }
                    pVar.a(false);
                    return;
                }
                return;
            case 2:
                gi.r rVar = (gi.r) this.f5264b;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f5265c;
                Boolean bool3 = (Boolean) obj;
                androidx.biometric.t tVar = (androidx.biometric.t) obj2;
                androidx.biometric.u uVar = (androidx.biometric.u) obj3;
                rVar.getClass();
                String str3 = null;
                if (tVar != null) {
                    try {
                        if (Build.VERSION.SDK_INT >= 30) {
                            uVar = rVar.i(true);
                        }
                        if (uVar != null) {
                            str3 = !TextUtils.isEmpty(rVar.f11415g) ? new String(uVar.f2840b.doFinal(Utilities.hexToBytes(rVar.f11415g)), StandardCharsets.UTF_8) : rVar.f11415g;
                        } else if (!TextUtils.isEmpty(rVar.f11415g)) {
                            throw new RuntimeException("No cryptoObject found");
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                        bool3 = Boolean.FALSE;
                    }
                }
                callback2.run(bool3, str3);
                return;
            case 3:
                org.telegram.ui.Wallet.m0 m0Var = (org.telegram.ui.Wallet.m0) this.f5264b;
                org.telegram.ui.Wallet.g8 g8Var = (org.telegram.ui.Wallet.g8) this.f5265c;
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) obj3;
                if (tL_error != null) {
                    String str4 = tL_error.text;
                    String str5 = "NULL_ERROR";
                    if (str4 == null) {
                        str4 = "NULL_ERROR";
                    }
                    org.telegram.ui.Wallet.m0.i("failed to disable backup: ".concat(str4));
                    String str6 = tL_error.text;
                    if (str6 != null) {
                        str5 = str6;
                    }
                    g8Var.run(str5);
                    return;
                }
                m0Var.i0(walletState);
                g8Var.run(null);
                return;
            case 4:
                final org.telegram.ui.Wallet.m0 m0Var2 = (org.telegram.ui.Wallet.m0) this.f5264b;
                Utilities.Callback2 callback22 = (Utilities.Callback2) this.f5265c;
                TL_wallet.secretPhraseParts secretphraseparts = (TL_wallet.secretPhraseParts) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP2 = (TLRPC.InputCheckPasswordSRP) obj3;
                if (secretphraseparts == null) {
                    String str7 = "NULL_ERROR";
                    org.telegram.ui.Wallet.m0.i("getSecretPhrase: no secret parts: ".concat((tL_error2 == null || (r5 = tL_error2.text) == null) ? "NULL_ERROR" : "NULL_ERROR"));
                    if (tL_error2 != null && (str = tL_error2.text) != null) {
                        str7 = str;
                    }
                    callback22.run(null, str7);
                    return;
                }
                final org.telegram.ui.Wallet.d dVar = new org.telegram.ui.Wallet.d(callback22, 2);
                ArrayList<Integer> arrayList3 = secretphraseparts.dcs;
                if (arrayList3.size() <= 0) {
                    org.telegram.ui.Wallet.m0.i("getSecretPhrase: no secret parts, zero dcs");
                    dVar.run(null, "WALLET_SECRET_PARTS_EMPTY");
                    return;
                }
                final org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(org.telegram.ui.Wallet.m0.v(), 3, null);
                b2Var.q(500L);
                final long key_generate_temporary_private_key = ConferenceCall.key_generate_temporary_private_key();
                byte[] key_to_public_key = ConferenceCall.key_to_public_key(key_generate_temporary_private_key);
                final boolean[] zArr = new boolean[arrayList3.size()];
                final TL_wallet.encryptedSecretPhrasePart[] encryptedsecretphrasepartArr = new TL_wallet.encryptedSecretPhrasePart[arrayList3.size()];
                final TLRPC.TL_error[] tL_errorArr = new TLRPC.TL_error[arrayList3.size()];
                for (final int i13 = 0; i13 < arrayList3.size(); i13++) {
                    final int intValue = arrayList3.get(i13).intValue();
                    org.telegram.ui.Wallet.m0.F("getSecretPhrase: requesting " + i13 + " part from dc" + intValue);
                    TL_wallet.fetchEncryptedSecretPhrasePart fetchencryptedsecretphrasepart = new TL_wallet.fetchEncryptedSecretPhrasePart();
                    fetchencryptedsecretphrasepart.token = secretphraseparts.token;
                    fetchencryptedsecretphrasepart.public_key = key_to_public_key;
                    ConnectionsManager.getInstance(m0Var2.f34551a).sendRequestTyped(fetchencryptedsecretphrasepart, new Object(), new Utilities.Callback2() {
                        @Override
                        public final void run(Object obj4, Object obj5) {
                            m0 m0Var3 = m0.this;
                            boolean[] zArr2 = zArr;
                            int i14 = i13;
                            TL_wallet.encryptedSecretPhrasePart[] encryptedsecretphrasepartArr2 = encryptedsecretphrasepartArr;
                            TLRPC.TL_error[] tL_errorArr2 = tL_errorArr;
                            int i15 = intValue;
                            long j11 = key_generate_temporary_private_key;
                            d dVar2 = dVar;
                            org.telegram.ui.ActionBar.b2 b2Var2 = b2Var;
                            boolean z11 = true;
                            zArr2[i14] = true;
                            encryptedsecretphrasepartArr2[i14] = (TL_wallet.encryptedSecretPhrasePart) obj4;
                            tL_errorArr2[i14] = (TLRPC.TL_error) obj5;
                            m0.F("getSecretPhrase: received " + i14 + " part from dc" + i15);
                            for (int i16 = 0; i16 < zArr2.length; i16++) {
                                if (!zArr2[i16]) {
                                    z11 = false;
                                }
                            }
                            if (!z11) {
                                return;
                            }
                            m0.F("getSecretPhrase: received all parts");
                            k kVar = new k((Object) m0Var3, (Object) b2Var2, (Object) dVar2, 6);
                            for (int i17 = 0; i17 < encryptedsecretphrasepartArr2.length; i17++) {
                                TL_wallet.encryptedSecretPhrasePart encryptedsecretphrasepart = encryptedsecretphrasepartArr2[i17];
                                if (encryptedsecretphrasepart == null) {
                                    TLRPC.TL_error tL_error3 = tL_errorArr2[i17];
                                    StringBuilder l10 = i0.a.l(i17, "getSecretPhrase: part ", ": ");
                                    String str8 = tL_error3.text;
                                    String str9 = "NULL_ERROR";
                                    if (str8 == null) {
                                        str8 = "NULL_ERROR";
                                    }
                                    l10.append(str8);
                                    m0.i(l10.toString());
                                    String str10 = tL_error3.text;
                                    if (str10 != null) {
                                        str9 = str10;
                                    }
                                    kVar.run(null, str9);
                                    return;
                                } else if (encryptedsecretphrasepart.data.length < 33) {
                                    StringBuilder l11 = i0.a.l(i17, "getSecretPhrase: part ", " length < 33 (len=");
                                    l11.append(encryptedsecretphrasepartArr2[i17].data.length);
                                    l11.append(")");
                                    m0.i(l11.toString());
                                    kVar.run(null, "WALLET_PART_" + i17 + "_INVALID");
                                    return;
                                }
                            }
                            Utilities.stageQueue.postRunnable(new ai.c3(m0Var3, encryptedsecretphrasepartArr2, j11, kVar, 24));
                        }
                    }, intValue, 0);
                }
                return;
            default:
                org.telegram.ui.Wallet.m0 m0Var3 = (org.telegram.ui.Wallet.m0) this.f5264b;
                org.telegram.ui.Wallet.x xVar = (org.telegram.ui.Wallet.x) this.f5265c;
                TL_wallet.WalletState walletState2 = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP3 = (TLRPC.InputCheckPasswordSRP) obj3;
                if (tL_error3 != null) {
                    String str8 = tL_error3.text;
                    if (str8 == null) {
                        str8 = "NULL_ERROR";
                    }
                    xVar.run(str8);
                    return;
                }
                m0Var3.i0(walletState2);
                m0Var3.P();
                xVar.run(null);
                return;
        }
    }
}
