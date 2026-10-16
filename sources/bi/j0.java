package bi;

import android.os.Build;
import android.text.TextUtils;
import di.kc;
import di.uc;
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
public final class j0 implements Utilities.Callback3 {
    public final int f3196a;
    public final Object f3197b;
    public final Object f3198c;

    public j0(int i10, Object obj, Object obj2) {
        this.f3196a = i10;
        this.f3197b = obj;
        this.f3198c = obj2;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3) {
        di.mb mbVar;
        String str;
        switch (this.f3196a) {
            case 0:
                h3 h3Var = (h3) this.f3197b;
                e1 e1Var = (e1) this.f3198c;
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj3;
                int i10 = h3Var.N;
                if (((Boolean) obj2).booleanValue()) {
                    TL_phone.deleteGroupCallParticipantMessages deletegroupcallparticipantmessages = new TL_phone.deleteGroupCallParticipantMessages();
                    deletegroupcallparticipantmessages.call = h3Var.O;
                    deletegroupcallparticipantmessages.participant = MessagesController.getInstance(i10).getInputPeer(e1Var.f2976c);
                    deletegroupcallparticipantmessages.report_spam = bool.booleanValue();
                    ConnectionsManager.getInstance(i10).sendRequest(deletegroupcallparticipantmessages, null);
                    long j10 = e1Var.f2976c;
                    ArrayList arrayList = h3Var.f3066r;
                    ArrayList arrayList2 = h3Var.f3067s;
                    int i11 = 0;
                    boolean z10 = false;
                    while (i11 < arrayList.size()) {
                        if (((e1) arrayList.get(i11)).f2976c == j10) {
                            e1 e1Var2 = (e1) arrayList.get(i11);
                            int i12 = 0;
                            while (true) {
                                if (i12 < arrayList2.size()) {
                                    if (((f1) arrayList2.get(i12)).f3014f.contains(e1Var2)) {
                                        ((f1) arrayList2.get(i12)).f3014f.remove(e1Var2);
                                        if (((f1) arrayList2.get(i12)).f3014f.isEmpty()) {
                                            arrayList2.remove(i12);
                                            z10 = true;
                                        } else {
                                            h3Var.m();
                                        }
                                    } else {
                                        i12++;
                                    }
                                }
                            }
                            arrayList.remove(i11);
                            h3Var.e.N(true);
                            i11--;
                        }
                        i11++;
                    }
                    if (z10) {
                        ConnectionsManager.getInstance(i10).getCurrentTime();
                        Collections.sort(arrayList2, new a4.d(h3Var, 7));
                        h3Var.f3065n.N(true);
                        h3Var.t();
                    }
                } else {
                    TL_phone.deleteGroupCallMessages deletegroupcallmessages = new TL_phone.deleteGroupCallMessages();
                    deletegroupcallmessages.call = h3Var.O;
                    deletegroupcallmessages.messages.add(Integer.valueOf(e1Var.f2974a));
                    ConnectionsManager.getInstance(i10).sendRequest(deletegroupcallmessages, null);
                    h3Var.c(e1Var.f2974a);
                }
                if (bool2.booleanValue()) {
                    if (h3Var.M >= 0) {
                        MessagesController.getInstance(i10).blockPeer(h3Var.M);
                        return;
                    } else {
                        MessagesController.getInstance(i10).deleteParticipantFromChat(-h3Var.M, MessagesController.getInstance(i10).getInputPeer(e1Var.f2976c), false, true);
                        return;
                    }
                }
                return;
            case 1:
                di.ac acVar = (di.ac) this.f3197b;
                di.p pVar = (di.p) this.f3198c;
                File file = (File) obj;
                String str2 = (String) obj2;
                Long l4 = (Long) obj3;
                kc kcVar = acVar.S1;
                di.yb ybVar = kcVar.X0;
                if (ybVar != null) {
                    ybVar.O = false;
                    ybVar.c();
                    di.yb ybVar2 = kcVar.X0;
                    ybVar2.m(0L);
                    uc ucVar = ybVar2.F;
                    if (ucVar != null) {
                        ucVar.setProgress(0L);
                    }
                }
                di.k8 k8Var = kcVar.K1;
                if (k8Var != null) {
                    k8Var.f7205o0 = file;
                    k8Var.f7207p0 = str2;
                    k8Var.f7209q0 = l4.longValue();
                    di.k8 k8Var2 = kcVar.K1;
                    k8Var2.f7213s0 = 0.0f;
                    k8Var2.f7215t0 = 1.0f;
                    k8Var2.f7211r0 = 0L;
                    k8Var2.f7217u0 = 1.0f;
                    kcVar.t();
                    if (kcVar.X0 != null && (mbVar = kcVar.f7305v1) != null) {
                        rg.d2 l02 = mbVar.l0(kcVar.K1.f7207p0, true);
                        acVar.setHasRoundVideo(true);
                        kcVar.X0.s(kcVar.K1, l02, true);
                        AndroidUtilities.cancelRunOnUIThread(pVar.h);
                        pVar.f7462a.destroy(true, null);
                        l02.setDraw(false);
                        pVar.post(new di.y6(5, pVar, l02));
                        return;
                    }
                    pVar.a(false);
                    return;
                }
                return;
            case 2:
                fi.r rVar = (fi.r) this.f3197b;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f3198c;
                Boolean bool3 = (Boolean) obj;
                androidx.biometric.u uVar = (androidx.biometric.u) obj2;
                androidx.biometric.v vVar = (androidx.biometric.v) obj3;
                rVar.getClass();
                String str3 = null;
                if (uVar != null) {
                    try {
                        if (Build.VERSION.SDK_INT >= 30) {
                            vVar = rVar.i(true);
                        }
                        if (vVar != null) {
                            str3 = !TextUtils.isEmpty(rVar.f9510g) ? new String(vVar.f1223b.doFinal(Utilities.hexToBytes(rVar.f9510g)), StandardCharsets.UTF_8) : rVar.f9510g;
                        } else if (!TextUtils.isEmpty(rVar.f9510g)) {
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
                org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) this.f3197b;
                org.telegram.ui.Wallet.h7 h7Var = (org.telegram.ui.Wallet.h7) this.f3198c;
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) obj3;
                if (tL_error != null) {
                    String str4 = tL_error.text;
                    String str5 = "NULL_ERROR";
                    if (str4 == null) {
                        str4 = "NULL_ERROR";
                    }
                    org.telegram.ui.Wallet.k0.i("failed to disable backup: ".concat(str4));
                    String str6 = tL_error.text;
                    if (str6 != null) {
                        str5 = str6;
                    }
                    h7Var.run(str5);
                    return;
                }
                k0Var.g0(walletState);
                h7Var.run(null);
                return;
            case 4:
                final org.telegram.ui.Wallet.k0 k0Var2 = (org.telegram.ui.Wallet.k0) this.f3197b;
                Utilities.Callback2 callback22 = (Utilities.Callback2) this.f3198c;
                TL_wallet.secretPhraseParts secretphraseparts = (TL_wallet.secretPhraseParts) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP2 = (TLRPC.InputCheckPasswordSRP) obj3;
                if (secretphraseparts == null) {
                    String str7 = "NULL_ERROR";
                    org.telegram.ui.Wallet.k0.i("getSecretPhrase: no secret parts: ".concat((tL_error2 == null || (r5 = tL_error2.text) == null) ? "NULL_ERROR" : "NULL_ERROR"));
                    if (tL_error2 != null && (str = tL_error2.text) != null) {
                        str7 = str;
                    }
                    callback22.run(null, str7);
                    return;
                }
                final org.telegram.ui.Wallet.d dVar = new org.telegram.ui.Wallet.d(callback22, 3);
                ArrayList<Integer> arrayList3 = secretphraseparts.dcs;
                if (arrayList3.size() <= 0) {
                    org.telegram.ui.Wallet.k0.i("getSecretPhrase: no secret parts, zero dcs");
                    dVar.run(null, "WALLET_SECRET_PARTS_EMPTY");
                    return;
                }
                final org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(org.telegram.ui.Wallet.k0.u(), 3, null);
                a2Var.q(500L);
                final long key_generate_temporary_private_key = ConferenceCall.key_generate_temporary_private_key();
                byte[] key_to_public_key = ConferenceCall.key_to_public_key(key_generate_temporary_private_key);
                final boolean[] zArr = new boolean[arrayList3.size()];
                final TL_wallet.encryptedSecretPhrasePart[] encryptedsecretphrasepartArr = new TL_wallet.encryptedSecretPhrasePart[arrayList3.size()];
                final TLRPC.TL_error[] tL_errorArr = new TLRPC.TL_error[arrayList3.size()];
                for (final int i13 = 0; i13 < arrayList3.size(); i13++) {
                    final int intValue = arrayList3.get(i13).intValue();
                    org.telegram.ui.Wallet.k0.E("getSecretPhrase: requesting " + i13 + " part from dc" + intValue);
                    TL_wallet.fetchEncryptedSecretPhrasePart fetchencryptedsecretphrasepart = new TL_wallet.fetchEncryptedSecretPhrasePart();
                    fetchencryptedsecretphrasepart.token = secretphraseparts.token;
                    fetchencryptedsecretphrasepart.public_key = key_to_public_key;
                    ConnectionsManager.getInstance(k0Var2.f33092a).sendRequestTyped(fetchencryptedsecretphrasepart, new Object(), new Utilities.Callback2() {
                        @Override
                        public final void run(Object obj4, Object obj5) {
                            k0 k0Var3 = k0.this;
                            boolean[] zArr2 = zArr;
                            int i14 = i13;
                            TL_wallet.encryptedSecretPhrasePart[] encryptedsecretphrasepartArr2 = encryptedsecretphrasepartArr;
                            TLRPC.TL_error[] tL_errorArr2 = tL_errorArr;
                            int i15 = intValue;
                            long j11 = key_generate_temporary_private_key;
                            d dVar2 = dVar;
                            org.telegram.ui.ActionBar.a2 a2Var2 = a2Var;
                            boolean z11 = true;
                            zArr2[i14] = true;
                            encryptedsecretphrasepartArr2[i14] = (TL_wallet.encryptedSecretPhrasePart) obj4;
                            tL_errorArr2[i14] = (TLRPC.TL_error) obj5;
                            k0.E("getSecretPhrase: received " + i14 + " part from dc" + i15);
                            for (int i16 = 0; i16 < zArr2.length; i16++) {
                                if (!zArr2[i16]) {
                                    z11 = false;
                                }
                            }
                            if (!z11) {
                                return;
                            }
                            k0.E("getSecretPhrase: received all parts");
                            j jVar = new j((Object) k0Var3, (Object) a2Var2, (Object) dVar2, 6);
                            for (int i17 = 0; i17 < encryptedsecretphrasepartArr2.length; i17++) {
                                TL_wallet.encryptedSecretPhrasePart encryptedsecretphrasepart = encryptedsecretphrasepartArr2[i17];
                                if (encryptedsecretphrasepart == null) {
                                    TLRPC.TL_error tL_error3 = tL_errorArr2[i17];
                                    StringBuilder l10 = i2.d.l(i17, "getSecretPhrase: part ", ": ");
                                    String str8 = tL_error3.text;
                                    String str9 = "NULL_ERROR";
                                    if (str8 == null) {
                                        str8 = "NULL_ERROR";
                                    }
                                    l10.append(str8);
                                    k0.i(l10.toString());
                                    String str10 = tL_error3.text;
                                    if (str10 != null) {
                                        str9 = str10;
                                    }
                                    jVar.run(null, str9);
                                    return;
                                } else if (encryptedsecretphrasepart.data.length < 33) {
                                    StringBuilder l11 = i2.d.l(i17, "getSecretPhrase: part ", " length < 33 (len=");
                                    l11.append(encryptedsecretphrasepartArr2[i17].data.length);
                                    l11.append(")");
                                    k0.i(l11.toString());
                                    jVar.run(null, "WALLET_PART_" + i17 + "_INVALID");
                                    return;
                                }
                            }
                            Utilities.stageQueue.postRunnable(new bi.b8(k0Var3, encryptedsecretphrasepartArr2, j11, jVar, 16));
                        }
                    }, intValue, 0);
                }
                return;
            default:
                org.telegram.ui.Wallet.k0 k0Var3 = (org.telegram.ui.Wallet.k0) this.f3197b;
                org.telegram.ui.Wallet.z6 z6Var = (org.telegram.ui.Wallet.z6) this.f3198c;
                TL_wallet.WalletState walletState2 = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP3 = (TLRPC.InputCheckPasswordSRP) obj3;
                if (tL_error3 != null) {
                    String str8 = tL_error3.text;
                    if (str8 == null) {
                        str8 = "NULL_ERROR";
                    }
                    z6Var.run(str8);
                    return;
                }
                k0Var3.g0(walletState2);
                k0Var3.O();
                z6Var.run(null);
                return;
        }
    }
}
