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
    public final int f3192a;
    public final Object f3193b;
    public final Object f3194c;

    public j0(int i10, Object obj, Object obj2) {
        this.f3192a = i10;
        this.f3193b = obj;
        this.f3194c = obj2;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3) {
        di.mb mbVar;
        String str;
        switch (this.f3192a) {
            case 0:
                h3 h3Var = (h3) this.f3193b;
                e1 e1Var = (e1) this.f3194c;
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj3;
                int i10 = h3Var.N;
                if (((Boolean) obj2).booleanValue()) {
                    TL_phone.deleteGroupCallParticipantMessages deletegroupcallparticipantmessages = new TL_phone.deleteGroupCallParticipantMessages();
                    deletegroupcallparticipantmessages.call = h3Var.O;
                    deletegroupcallparticipantmessages.participant = MessagesController.getInstance(i10).getInputPeer(e1Var.f2972c);
                    deletegroupcallparticipantmessages.report_spam = bool.booleanValue();
                    ConnectionsManager.getInstance(i10).sendRequest(deletegroupcallparticipantmessages, null);
                    long j10 = e1Var.f2972c;
                    ArrayList arrayList = h3Var.f3062r;
                    ArrayList arrayList2 = h3Var.f3063s;
                    int i11 = 0;
                    boolean z10 = false;
                    while (i11 < arrayList.size()) {
                        if (((e1) arrayList.get(i11)).f2972c == j10) {
                            e1 e1Var2 = (e1) arrayList.get(i11);
                            int i12 = 0;
                            while (true) {
                                if (i12 < arrayList2.size()) {
                                    if (((f1) arrayList2.get(i12)).f3010f.contains(e1Var2)) {
                                        ((f1) arrayList2.get(i12)).f3010f.remove(e1Var2);
                                        if (((f1) arrayList2.get(i12)).f3010f.isEmpty()) {
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
                        h3Var.f3061n.N(true);
                        h3Var.t();
                    }
                } else {
                    TL_phone.deleteGroupCallMessages deletegroupcallmessages = new TL_phone.deleteGroupCallMessages();
                    deletegroupcallmessages.call = h3Var.O;
                    deletegroupcallmessages.messages.add(Integer.valueOf(e1Var.f2970a));
                    ConnectionsManager.getInstance(i10).sendRequest(deletegroupcallmessages, null);
                    h3Var.c(e1Var.f2970a);
                }
                if (bool2.booleanValue()) {
                    if (h3Var.M >= 0) {
                        MessagesController.getInstance(i10).blockPeer(h3Var.M);
                        return;
                    } else {
                        MessagesController.getInstance(i10).deleteParticipantFromChat(-h3Var.M, MessagesController.getInstance(i10).getInputPeer(e1Var.f2972c), false, true);
                        return;
                    }
                }
                return;
            case 1:
                di.ac acVar = (di.ac) this.f3193b;
                di.p pVar = (di.p) this.f3194c;
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
                    k8Var.f7202o0 = file;
                    k8Var.f7204p0 = str2;
                    k8Var.f7206q0 = l4.longValue();
                    di.k8 k8Var2 = kcVar.K1;
                    k8Var2.f7210s0 = 0.0f;
                    k8Var2.f7212t0 = 1.0f;
                    k8Var2.f7208r0 = 0L;
                    k8Var2.f7214u0 = 1.0f;
                    kcVar.t();
                    if (kcVar.X0 != null && (mbVar = kcVar.f7302v1) != null) {
                        rg.d2 l02 = mbVar.l0(kcVar.K1.f7204p0, true);
                        acVar.setHasRoundVideo(true);
                        kcVar.X0.s(kcVar.K1, l02, true);
                        AndroidUtilities.cancelRunOnUIThread(pVar.h);
                        pVar.f7459a.destroy(true, null);
                        l02.setDraw(false);
                        pVar.post(new di.x6(5, pVar, l02));
                        return;
                    }
                    pVar.a(false);
                    return;
                }
                return;
            case 2:
                fi.r rVar = (fi.r) this.f3193b;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f3194c;
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
                            str3 = !TextUtils.isEmpty(rVar.f9507g) ? new String(vVar.f1219b.doFinal(Utilities.hexToBytes(rVar.f9507g)), StandardCharsets.UTF_8) : rVar.f9507g;
                        } else if (!TextUtils.isEmpty(rVar.f9507g)) {
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
                org.telegram.ui.Wallet.j0 j0Var = (org.telegram.ui.Wallet.j0) this.f3193b;
                org.telegram.ui.Wallet.g7 g7Var = (org.telegram.ui.Wallet.g7) this.f3194c;
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) obj3;
                if (tL_error != null) {
                    String str4 = tL_error.text;
                    String str5 = "NULL_ERROR";
                    if (str4 == null) {
                        str4 = "NULL_ERROR";
                    }
                    org.telegram.ui.Wallet.j0.i("failed to disable backup: ".concat(str4));
                    String str6 = tL_error.text;
                    if (str6 != null) {
                        str5 = str6;
                    }
                    g7Var.run(str5);
                    return;
                }
                j0Var.g0(walletState);
                g7Var.run(null);
                return;
            case 4:
                final org.telegram.ui.Wallet.j0 j0Var2 = (org.telegram.ui.Wallet.j0) this.f3193b;
                Utilities.Callback2 callback22 = (Utilities.Callback2) this.f3194c;
                TL_wallet.secretPhraseParts secretphraseparts = (TL_wallet.secretPhraseParts) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP2 = (TLRPC.InputCheckPasswordSRP) obj3;
                if (secretphraseparts == null) {
                    String str7 = "NULL_ERROR";
                    org.telegram.ui.Wallet.j0.i("getSecretPhrase: no secret parts: ".concat((tL_error2 == null || (r5 = tL_error2.text) == null) ? "NULL_ERROR" : "NULL_ERROR"));
                    if (tL_error2 != null && (str = tL_error2.text) != null) {
                        str7 = str;
                    }
                    callback22.run(null, str7);
                    return;
                }
                final org.telegram.ui.Wallet.d dVar = new org.telegram.ui.Wallet.d(callback22, 3);
                ArrayList<Integer> arrayList3 = secretphraseparts.dcs;
                if (arrayList3.size() <= 0) {
                    org.telegram.ui.Wallet.j0.i("getSecretPhrase: no secret parts, zero dcs");
                    dVar.run(null, "WALLET_SECRET_PARTS_EMPTY");
                    return;
                }
                final org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(org.telegram.ui.Wallet.j0.u(), 3, null);
                a2Var.q(500L);
                final long key_generate_temporary_private_key = ConferenceCall.key_generate_temporary_private_key();
                byte[] key_to_public_key = ConferenceCall.key_to_public_key(key_generate_temporary_private_key);
                final boolean[] zArr = new boolean[arrayList3.size()];
                final TL_wallet.encryptedSecretPhrasePart[] encryptedsecretphrasepartArr = new TL_wallet.encryptedSecretPhrasePart[arrayList3.size()];
                final TLRPC.TL_error[] tL_errorArr = new TLRPC.TL_error[arrayList3.size()];
                for (final int i13 = 0; i13 < arrayList3.size(); i13++) {
                    final int intValue = arrayList3.get(i13).intValue();
                    org.telegram.ui.Wallet.j0.E("getSecretPhrase: requesting " + i13 + " part from dc" + intValue);
                    TL_wallet.fetchEncryptedSecretPhrasePart fetchencryptedsecretphrasepart = new TL_wallet.fetchEncryptedSecretPhrasePart();
                    fetchencryptedsecretphrasepart.token = secretphraseparts.token;
                    fetchencryptedsecretphrasepart.public_key = key_to_public_key;
                    ConnectionsManager.getInstance(j0Var2.f33319a).sendRequestTyped(fetchencryptedsecretphrasepart, new Object(), new Utilities.Callback2() {
                        @Override
                        public final void run(Object obj4, Object obj5) {
                            j0 j0Var3 = j0.this;
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
                            j0.E("getSecretPhrase: received " + i14 + " part from dc" + i15);
                            for (int i16 = 0; i16 < zArr2.length; i16++) {
                                if (!zArr2[i16]) {
                                    z11 = false;
                                }
                            }
                            if (!z11) {
                                return;
                            }
                            j0.E("getSecretPhrase: received all parts");
                            i iVar = new i((Object) j0Var3, (Object) a2Var2, (Object) dVar2, 6);
                            for (int i17 = 0; i17 < encryptedsecretphrasepartArr2.length; i17++) {
                                TL_wallet.encryptedSecretPhrasePart encryptedsecretphrasepart = encryptedsecretphrasepartArr2[i17];
                                if (encryptedsecretphrasepart == null) {
                                    TLRPC.TL_error tL_error3 = tL_errorArr2[i17];
                                    StringBuilder k10 = i2.d.k(i17, "getSecretPhrase: part ", ": ");
                                    String str8 = tL_error3.text;
                                    String str9 = "NULL_ERROR";
                                    if (str8 == null) {
                                        str8 = "NULL_ERROR";
                                    }
                                    k10.append(str8);
                                    j0.i(k10.toString());
                                    String str10 = tL_error3.text;
                                    if (str10 != null) {
                                        str9 = str10;
                                    }
                                    iVar.run(null, str9);
                                    return;
                                } else if (encryptedsecretphrasepart.data.length < 33) {
                                    StringBuilder k11 = i2.d.k(i17, "getSecretPhrase: part ", " length < 33 (len=");
                                    k11.append(encryptedsecretphrasepartArr2[i17].data.length);
                                    k11.append(")");
                                    j0.i(k11.toString());
                                    iVar.run(null, "WALLET_PART_" + i17 + "_INVALID");
                                    return;
                                }
                            }
                            Utilities.stageQueue.postRunnable(new bi.b8(j0Var3, encryptedsecretphrasepartArr2, j11, iVar, 16));
                        }
                    }, intValue, 0);
                }
                return;
            default:
                org.telegram.ui.Wallet.j0 j0Var3 = (org.telegram.ui.Wallet.j0) this.f3193b;
                org.telegram.ui.Wallet.y6 y6Var = (org.telegram.ui.Wallet.y6) this.f3194c;
                TL_wallet.WalletState walletState2 = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP3 = (TLRPC.InputCheckPasswordSRP) obj3;
                if (tL_error3 != null) {
                    String str8 = tL_error3.text;
                    if (str8 == null) {
                        str8 = "NULL_ERROR";
                    }
                    y6Var.run(str8);
                    return;
                }
                j0Var3.g0(walletState2);
                j0Var3.O();
                y6Var.run(null);
                return;
        }
    }
}
