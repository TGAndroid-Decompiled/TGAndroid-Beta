package fi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import hi.db;
import hi.ha;
import hi.ja;
import hi.ta;
import hi.v9;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.np;
import org.telegram.messenger.r10;
import org.telegram.messenger.t10;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.p51;
import org.telegram.ui.rn;
public final class b0 implements t10 {
    public final int f11753a;
    public final Object f11754b;
    public final Object f11755c;

    public b0(int i7, Object obj, Object obj2) {
        this.f11753a = i7;
        this.f11754b = obj;
        this.f11755c = obj2;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3) {
        v9 v9Var;
        float f10;
        boolean z10;
        String str;
        switch (this.f11753a) {
            case 0:
                a2 a2Var = (a2) this.f11754b;
                r0 r0Var = (r0) this.f11755c;
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj3;
                int i7 = a2Var.O;
                if (((Boolean) obj2).booleanValue()) {
                    TL_phone.deleteGroupCallParticipantMessages deletegroupcallparticipantmessages = new TL_phone.deleteGroupCallParticipantMessages();
                    deletegroupcallparticipantmessages.call = a2Var.P;
                    deletegroupcallparticipantmessages.participant = np.u1(i7).l1(r0Var.f12480c);
                    deletegroupcallparticipantmessages.report_spam = bool.booleanValue();
                    ConnectionsManager.getInstance(i7).sendRequest(deletegroupcallparticipantmessages, null);
                    long j3 = r0Var.f12480c;
                    ArrayList arrayList = a2Var.f12563r;
                    ArrayList arrayList2 = a2Var.f12564s;
                    int i10 = 0;
                    boolean z11 = false;
                    while (i10 < arrayList.size()) {
                        if (((r0) arrayList.get(i10)).f12480c == j3) {
                            r0 r0Var2 = (r0) arrayList.get(i10);
                            int i11 = 0;
                            while (true) {
                                if (i11 < arrayList2.size()) {
                                    if (((s0) arrayList2.get(i11)).f12510f.contains(r0Var2)) {
                                        ((s0) arrayList2.get(i11)).f12510f.remove(r0Var2);
                                        if (((s0) arrayList2.get(i11)).f12510f.isEmpty()) {
                                            arrayList2.remove(i11);
                                            z11 = true;
                                        } else {
                                            a2Var.m();
                                        }
                                    } else {
                                        i11++;
                                    }
                                }
                            }
                            arrayList.remove(i10);
                            a2Var.f12556e.O(true);
                            i10--;
                        }
                        i10++;
                    }
                    if (z11) {
                        ConnectionsManager.getInstance(i7).getCurrentTime();
                        Collections.sort(arrayList2, new a3.c(a2Var, 22));
                        a2Var.f12562n.O(true);
                        a2Var.t();
                    }
                } else {
                    TL_phone.deleteGroupCallMessages deletegroupcallmessages = new TL_phone.deleteGroupCallMessages();
                    deletegroupcallmessages.call = a2Var.P;
                    deletegroupcallmessages.messages.add(Integer.valueOf(r0Var.f12478a));
                    ConnectionsManager.getInstance(i7).sendRequest(deletegroupcallmessages, null);
                    a2Var.c(r0Var.f12478a);
                }
                if (bool2.booleanValue()) {
                    if (a2Var.N >= 0) {
                        np.u1(i7).w(a2Var.N);
                        return;
                    } else {
                        np.u1(i7).e0(-a2Var.N, np.u1(i7).l1(r0Var.f12480c), true, null);
                        return;
                    }
                }
                return;
            case 1:
                ja jaVar = (ja) this.f11754b;
                hi.p pVar = (hi.p) this.f11755c;
                File file = (File) obj;
                String str2 = (String) obj2;
                Long l10 = (Long) obj3;
                ta taVar = jaVar.S1;
                ha haVar = taVar.Y0;
                if (haVar != null) {
                    haVar.P = false;
                    haVar.c();
                    ha haVar2 = taVar.Y0;
                    haVar2.m(0L);
                    db dbVar = haVar2.G;
                    if (dbVar != null) {
                        dbVar.setProgress(0L);
                    }
                }
                hi.d7 d7Var = taVar.L1;
                if (d7Var != null) {
                    d7Var.f14393o0 = file;
                    d7Var.f14395p0 = str2;
                    d7Var.f14397q0 = l10.longValue();
                    hi.d7 d7Var2 = taVar.L1;
                    d7Var2.f14401s0 = 0.0f;
                    d7Var2.f14403t0 = 1.0f;
                    d7Var2.f14399r0 = 0L;
                    d7Var2.f14405u0 = 1.0f;
                    taVar.t();
                    if (taVar.Y0 != null && (v9Var = taVar.f15459w1) != null) {
                        tg.t1 j02 = v9Var.j0(taVar.L1.f14395p0, true);
                        jaVar.setHasRoundVideo(true);
                        taVar.Y0.s(taVar.L1, j02, true);
                        org.telegram.messenger.g0.r(pVar.h);
                        pVar.f14767a.destroy(true, null);
                        j02.setDraw(false);
                        pVar.post(new hi.q1(9, pVar, j02));
                        return;
                    }
                    pVar.a(false);
                    return;
                }
                return;
            case 2:
                ki.p pVar2 = (ki.p) this.f11754b;
                r10 r10Var = (r10) this.f11755c;
                Boolean bool3 = (Boolean) obj;
                androidx.biometric.u uVar = (androidx.biometric.u) obj2;
                androidx.biometric.v vVar = (androidx.biometric.v) obj3;
                pVar2.getClass();
                String str3 = null;
                if (uVar != null) {
                    try {
                        if (Build.VERSION.SDK_INT >= 30) {
                            vVar = pVar2.i(true);
                        }
                        if (vVar != null) {
                            str3 = !TextUtils.isEmpty(pVar2.f18817g) ? new String(vVar.f1937b.doFinal(Utilities.v(pVar2.f18817g)), StandardCharsets.UTF_8) : pVar2.f18817g;
                        } else if (!TextUtils.isEmpty(pVar2.f18817g)) {
                            throw new RuntimeException("No cryptoObject found");
                        }
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        bool3 = Boolean.FALSE;
                    }
                }
                r10Var.a(bool3, str3);
                return;
            case 3:
                rn rnVar = (rn) this.f11754b;
                View view = (View) this.f11755c;
                rnVar.F0 = ((Boolean) obj).booleanValue();
                rnVar.H0 = ((Boolean) obj2).booleanValue();
                rnVar.I0 = ((Boolean) obj3).booleanValue();
                t3 t3Var = rnVar.f51682e;
                if (rnVar.F0) {
                    f10 = 16.0f;
                } else {
                    f10 = 32.0f;
                }
                int L = org.telegram.messenger.g0.L(f10);
                boolean z12 = false;
                if (t3Var.getRoundRadius()[0] != L) {
                    ValueAnimator valueAnimator = t3Var.f38799y;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator ofInt = ValueAnimator.ofInt(t3Var.getRoundRadius()[0], L);
                    t3Var.f38799y = ofInt;
                    ofInt.addUpdateListener(new d4(t3Var, 8));
                    t3Var.f38799y.setDuration(200L);
                    t3Var.f38799y.start();
                }
                ((org.telegram.ui.Cells.n8) view).setChecked(rnVar.F0);
                rnVar.u0(false, true);
                if (!rnVar.O0) {
                    TLRPC.Chat chat = rnVar.f51707x0;
                    if (chat.forum != rnVar.F0 || chat.forum_tabs != rnVar.H0 || chat.forum_sidebar != rnVar.I0) {
                        if (!org.telegram.messenger.v3.T(chat) && rnVar.F0) {
                            Context parentActivity = rnVar.getParentActivity();
                            if (parentActivity == null) {
                                parentActivity = LaunchActivity.H1;
                            }
                            if (parentActivity == null) {
                                parentActivity = org.telegram.messenger.t0.f26895b;
                            }
                            if (parentActivity != null) {
                                org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, parentActivity, null);
                                rnVar.O0 = true;
                                t1Var.r(250L);
                                rnVar.getMessagesController().T(rnVar.getParentActivity(), rnVar.f51705w0, rnVar, new oi.e0(19, rnVar, t1Var), null);
                                return;
                            }
                            return;
                        }
                        TLRPC.Chat chat2 = rnVar.f51707x0;
                        if (chat2.forum_tabs != rnVar.H0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (chat2.forum_sidebar != rnVar.I0) {
                            z12 = true;
                        }
                        rnVar.getMessagesController().m5(rnVar.f51705w0, rnVar.F0, rnVar.H0, rnVar.I0);
                        TLRPC.Chat chat3 = rnVar.f51707x0;
                        chat3.forum = rnVar.F0;
                        chat3.forum_tabs = rnVar.H0;
                        chat3.forum_sidebar = rnVar.I0;
                        if (z10 || z12) {
                            rnVar.v0(z10);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 4:
                final org.telegram.ui.Wallet.u0 u0Var = (org.telegram.ui.Wallet.u0) this.f11754b;
                r10 r10Var2 = (r10) this.f11755c;
                TL_wallet.secretPhraseParts secretphraseparts = (TL_wallet.secretPhraseParts) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) obj3;
                if (secretphraseparts == null) {
                    String str4 = "NULL_ERROR";
                    org.telegram.ui.Wallet.u0.n("getSecretPhrase: no secret parts: ".concat((tL_error == null || (r5 = tL_error.text) == null) ? "NULL_ERROR" : "NULL_ERROR"));
                    if (tL_error != null && (str = tL_error.text) != null) {
                        str4 = str;
                    }
                    r10Var2.a(null, str4);
                    return;
                }
                final org.telegram.ui.Wallet.e eVar = new org.telegram.ui.Wallet.e(r10Var2, 2);
                ArrayList<Integer> arrayList3 = secretphraseparts.dcs;
                if (arrayList3.size() <= 0) {
                    org.telegram.ui.Wallet.u0.n("getSecretPhrase: no secret parts, zero dcs");
                    eVar.a(null, "WALLET_SECRET_PARTS_EMPTY");
                    return;
                }
                final org.telegram.ui.ActionBar.t1 t1Var2 = new org.telegram.ui.ActionBar.t1(3, org.telegram.ui.Wallet.u0.C(), null);
                t1Var2.r(500L);
                final long key_generate_temporary_private_key = ConferenceCall.key_generate_temporary_private_key();
                byte[] key_to_public_key = ConferenceCall.key_to_public_key(key_generate_temporary_private_key);
                final boolean[] zArr = new boolean[arrayList3.size()];
                final TL_wallet.encryptedSecretPhrasePart[] encryptedsecretphrasepartArr = new TL_wallet.encryptedSecretPhrasePart[arrayList3.size()];
                final TLRPC.TL_error[] tL_errorArr = new TLRPC.TL_error[arrayList3.size()];
                final int i12 = 0;
                while (i12 < arrayList3.size()) {
                    final int intValue = arrayList3.get(i12).intValue();
                    org.telegram.ui.Wallet.u0.P("getSecretPhrase: requesting " + i12 + " part from dc" + intValue);
                    TL_wallet.fetchEncryptedSecretPhrasePart fetchencryptedsecretphrasepart = new TL_wallet.fetchEncryptedSecretPhrasePart();
                    fetchencryptedsecretphrasepart.token = secretphraseparts.token;
                    fetchencryptedsecretphrasepart.public_key = key_to_public_key;
                    ConnectionsManager.getInstance(u0Var.f45093a).sendRequestTyped(fetchencryptedsecretphrasepart, new d3.b(1), new r10() {
                        @Override
                        public final void a(Object obj4, Object obj5) {
                            u0 u0Var2 = u0.this;
                            boolean[] zArr2 = zArr;
                            int i13 = i12;
                            TL_wallet.encryptedSecretPhrasePart[] encryptedsecretphrasepartArr2 = encryptedsecretphrasepartArr;
                            TLRPC.TL_error[] tL_errorArr2 = tL_errorArr;
                            int i14 = intValue;
                            long j10 = key_generate_temporary_private_key;
                            e eVar2 = eVar;
                            org.telegram.ui.ActionBar.t1 t1Var3 = t1Var2;
                            boolean z13 = true;
                            zArr2[i13] = true;
                            encryptedsecretphrasepartArr2[i13] = (TL_wallet.encryptedSecretPhrasePart) obj4;
                            tL_errorArr2[i13] = (TLRPC.TL_error) obj5;
                            u0.P("getSecretPhrase: received " + i13 + " part from dc" + i14);
                            for (int i15 = 0; i15 < zArr2.length; i15++) {
                                if (!zArr2[i15]) {
                                    z13 = false;
                                }
                            }
                            if (!z13) {
                                return;
                            }
                            u0.P("getSecretPhrase: received all parts");
                            j jVar = new j((Object) u0Var2, (Object) t1Var3, (Object) eVar2, 7);
                            for (int i16 = 0; i16 < encryptedsecretphrasepartArr2.length; i16++) {
                                TL_wallet.encryptedSecretPhrasePart encryptedsecretphrasepart = encryptedsecretphrasepartArr2[i16];
                                if (encryptedsecretphrasepart == null) {
                                    TLRPC.TL_error tL_error2 = tL_errorArr2[i16];
                                    StringBuilder m10 = i5.c.m(i16, "getSecretPhrase: part ", ": ");
                                    String str5 = tL_error2.text;
                                    String str6 = "NULL_ERROR";
                                    if (str5 == null) {
                                        str5 = "NULL_ERROR";
                                    }
                                    m10.append(str5);
                                    u0.n(m10.toString());
                                    String str7 = tL_error2.text;
                                    if (str7 != null) {
                                        str6 = str7;
                                    }
                                    jVar.a(null, str6);
                                    return;
                                } else if (encryptedsecretphrasepart.data.length < 33) {
                                    StringBuilder m11 = i5.c.m(i16, "getSecretPhrase: part ", " length < 33 (len=");
                                    m11.append(encryptedsecretphrasepartArr2[i16].data.length);
                                    m11.append(")");
                                    u0.n(m11.toString());
                                    jVar.a(null, "WALLET_PART_" + i16 + "_INVALID");
                                    return;
                                }
                            }
                            Utilities.d.c(new di.i2(u0Var2, encryptedsecretphrasepartArr2, j10, jVar, 23));
                        }
                    }, intValue, 0);
                    i12++;
                    arrayList3 = arrayList3;
                }
                return;
            case 5:
                org.telegram.ui.Wallet.u0 u0Var2 = (org.telegram.ui.Wallet.u0) this.f11754b;
                org.telegram.ui.Wallet.z8 z8Var = (org.telegram.ui.Wallet.z8) this.f11755c;
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP2 = (TLRPC.InputCheckPasswordSRP) obj3;
                if (tL_error2 != null) {
                    String str5 = tL_error2.text;
                    String str6 = "NULL_ERROR";
                    if (str5 == null) {
                        str5 = "NULL_ERROR";
                    }
                    org.telegram.ui.Wallet.u0.n("failed to disable backup: ".concat(str5));
                    String str7 = tL_error2.text;
                    if (str7 != null) {
                        str6 = str7;
                    }
                    z8Var.a(str6);
                    return;
                }
                u0Var2.w0(walletState);
                z8Var.a(null);
                return;
            default:
                org.telegram.ui.Wallet.u0 u0Var3 = (org.telegram.ui.Wallet.u0) this.f11754b;
                p51 p51Var = (p51) this.f11755c;
                TL_wallet.WalletState walletState2 = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP3 = (TLRPC.InputCheckPasswordSRP) obj3;
                if (tL_error3 != null) {
                    String str8 = tL_error3.text;
                    if (str8 == null) {
                        str8 = "NULL_ERROR";
                    }
                    p51Var.a(str8);
                    return;
                }
                u0Var3.w0(walletState2);
                u0Var3.Z();
                p51Var.a(null);
                return;
        }
    }
}
