package di;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import fi.fb;
import fi.ja;
import fi.la;
import fi.va;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.qp;
import org.telegram.messenger.v10;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.pn;
public final class b0 implements x10 {
    public final int f8831a;
    public final Object f8832b;
    public final Object f8833c;

    public b0(int i7, Object obj, Object obj2) {
        this.f8831a = i7;
        this.f8832b = obj;
        this.f8833c = obj2;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3) {
        fi.x9 x9Var;
        float f10;
        boolean z9;
        String str;
        switch (this.f8831a) {
            case 0:
                g2 g2Var = (g2) this.f8832b;
                s0 s0Var = (s0) this.f8833c;
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj3;
                int i7 = g2Var.N;
                if (((Boolean) obj2).booleanValue()) {
                    TL_phone.deleteGroupCallParticipantMessages deletegroupcallparticipantmessages = new TL_phone.deleteGroupCallParticipantMessages();
                    deletegroupcallparticipantmessages.call = g2Var.O;
                    deletegroupcallparticipantmessages.participant = qp.s1(i7).j1(s0Var.f9738c);
                    deletegroupcallparticipantmessages.report_spam = bool.booleanValue();
                    ConnectionsManager.getInstance(i7).sendRequest(deletegroupcallparticipantmessages, null);
                    long j3 = s0Var.f9738c;
                    ArrayList arrayList = g2Var.f9822r;
                    ArrayList arrayList2 = g2Var.f9823s;
                    int i10 = 0;
                    boolean z10 = false;
                    while (i10 < arrayList.size()) {
                        if (((s0) arrayList.get(i10)).f9738c == j3) {
                            s0 s0Var2 = (s0) arrayList.get(i10);
                            int i11 = 0;
                            while (true) {
                                if (i11 < arrayList2.size()) {
                                    if (((t0) arrayList2.get(i11)).f9777f.contains(s0Var2)) {
                                        ((t0) arrayList2.get(i11)).f9777f.remove(s0Var2);
                                        if (((t0) arrayList2.get(i11)).f9777f.isEmpty()) {
                                            arrayList2.remove(i11);
                                            z10 = true;
                                        } else {
                                            g2Var.m();
                                        }
                                    } else {
                                        i11++;
                                    }
                                }
                            }
                            arrayList.remove(i10);
                            g2Var.f9816e.O(true);
                            i10--;
                        }
                        i10++;
                    }
                    if (z10) {
                        ConnectionsManager.getInstance(i7).getCurrentTime();
                        Collections.sort(arrayList2, new a3.c(g2Var, 22));
                        g2Var.f9821n.O(true);
                        g2Var.t();
                    }
                } else {
                    TL_phone.deleteGroupCallMessages deletegroupcallmessages = new TL_phone.deleteGroupCallMessages();
                    deletegroupcallmessages.call = g2Var.O;
                    deletegroupcallmessages.messages.add(Integer.valueOf(s0Var.f9736a));
                    ConnectionsManager.getInstance(i7).sendRequest(deletegroupcallmessages, null);
                    g2Var.c(s0Var.f9736a);
                }
                if (bool2.booleanValue()) {
                    if (g2Var.M >= 0) {
                        qp.s1(i7).w(g2Var.M);
                        return;
                    } else {
                        qp.s1(i7).e0(-g2Var.M, qp.s1(i7).j1(s0Var.f9738c), true, null);
                        return;
                    }
                }
                return;
            case 1:
                la laVar = (la) this.f8832b;
                fi.p pVar = (fi.p) this.f8833c;
                File file = (File) obj;
                String str2 = (String) obj2;
                Long l10 = (Long) obj3;
                va vaVar = laVar.R1;
                ja jaVar = vaVar.X0;
                if (jaVar != null) {
                    jaVar.O = false;
                    jaVar.c();
                    ja jaVar2 = vaVar.X0;
                    jaVar2.m(0L);
                    fb fbVar = jaVar2.F;
                    if (fbVar != null) {
                        fbVar.setProgress(0L);
                    }
                }
                fi.e7 e7Var = vaVar.K1;
                if (e7Var != null) {
                    e7Var.f11907o0 = file;
                    e7Var.f11909p0 = str2;
                    e7Var.f11911q0 = l10.longValue();
                    fi.e7 e7Var2 = vaVar.K1;
                    e7Var2.f11915s0 = 0.0f;
                    e7Var2.f11917t0 = 1.0f;
                    e7Var2.f11913r0 = 0L;
                    e7Var2.f11919u0 = 1.0f;
                    vaVar.t();
                    if (vaVar.X0 != null && (x9Var = vaVar.f13002v1) != null) {
                        tg.r1 j02 = x9Var.j0(vaVar.K1.f11909p0, true);
                        laVar.setHasRoundVideo(true);
                        vaVar.X0.s(vaVar.K1, j02, true);
                        org.telegram.messenger.g0.r(pVar.h);
                        pVar.f12326a.destroy(true, null);
                        j02.setDraw(false);
                        pVar.post(new f2.h(12, pVar, j02));
                        return;
                    }
                    pVar.a(false);
                    return;
                }
                return;
            case 2:
                hi.p pVar2 = (hi.p) this.f8832b;
                v10 v10Var = (v10) this.f8833c;
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
                            str3 = !TextUtils.isEmpty(pVar2.f14850g) ? new String(vVar.f2024b.doFinal(Utilities.v(pVar2.f14850g)), StandardCharsets.UTF_8) : pVar2.f14850g;
                        } else if (!TextUtils.isEmpty(pVar2.f14850g)) {
                            throw new RuntimeException("No cryptoObject found");
                        }
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        bool3 = Boolean.FALSE;
                    }
                }
                v10Var.a(bool3, str3);
                return;
            case 3:
                pn pnVar = (pn) this.f8832b;
                View view = (View) this.f8833c;
                pnVar.E0 = ((Boolean) obj).booleanValue();
                pnVar.G0 = ((Boolean) obj2).booleanValue();
                pnVar.H0 = ((Boolean) obj3).booleanValue();
                c4 c4Var = pnVar.f48869e;
                if (pnVar.E0) {
                    f10 = 16.0f;
                } else {
                    f10 = 32.0f;
                }
                int L = org.telegram.messenger.g0.L(f10);
                boolean z11 = false;
                if (c4Var.getRoundRadius()[0] != L) {
                    ValueAnimator valueAnimator = c4Var.f35567y;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator ofInt = ValueAnimator.ofInt(c4Var.getRoundRadius()[0], L);
                    c4Var.f35567y = ofInt;
                    ofInt.addUpdateListener(new m4(c4Var, 8));
                    c4Var.f35567y.setDuration(200L);
                    c4Var.f35567y.start();
                }
                ((org.telegram.ui.Cells.m8) view).setChecked(pnVar.E0);
                pnVar.u0(false, true);
                if (!pnVar.N0) {
                    TLRPC.Chat chat = pnVar.f48892w0;
                    if (chat.forum != pnVar.E0 || chat.forum_tabs != pnVar.G0 || chat.forum_sidebar != pnVar.H0) {
                        if (!org.telegram.messenger.t3.T(chat) && pnVar.E0) {
                            Context parentActivity = pnVar.getParentActivity();
                            if (parentActivity == null) {
                                parentActivity = LaunchActivity.G1;
                            }
                            if (parentActivity == null) {
                                parentActivity = org.telegram.messenger.t0.f25555b;
                            }
                            if (parentActivity != null) {
                                org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, parentActivity, null);
                                pnVar.N0 = true;
                                u1Var.r(250L);
                                pnVar.getMessagesController().T(pnVar.getParentActivity(), pnVar.f48890v0, pnVar, new ni.c(17, pnVar, u1Var), null);
                                return;
                            }
                            return;
                        }
                        TLRPC.Chat chat2 = pnVar.f48892w0;
                        if (chat2.forum_tabs != pnVar.G0) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if (chat2.forum_sidebar != pnVar.H0) {
                            z11 = true;
                        }
                        pnVar.getMessagesController().a5(pnVar.f48890v0, pnVar.E0, pnVar.G0, pnVar.H0);
                        TLRPC.Chat chat3 = pnVar.f48892w0;
                        chat3.forum = pnVar.E0;
                        chat3.forum_tabs = pnVar.G0;
                        chat3.forum_sidebar = pnVar.H0;
                        if (z9 || z11) {
                            pnVar.v0(z9);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 4:
                final org.telegram.ui.Wallet.n0 n0Var = (org.telegram.ui.Wallet.n0) this.f8832b;
                v10 v10Var2 = (v10) this.f8833c;
                TL_wallet.secretPhraseParts secretphraseparts = (TL_wallet.secretPhraseParts) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) obj3;
                if (secretphraseparts == null) {
                    String str4 = "NULL_ERROR";
                    org.telegram.ui.Wallet.n0.j("getSecretPhrase: no secret parts: ".concat((tL_error == null || (r5 = tL_error.text) == null) ? "NULL_ERROR" : "NULL_ERROR"));
                    if (tL_error != null && (str = tL_error.text) != null) {
                        str4 = str;
                    }
                    v10Var2.a(null, str4);
                    return;
                }
                final org.telegram.ui.Wallet.d dVar = new org.telegram.ui.Wallet.d(v10Var2, 2);
                ArrayList<Integer> arrayList3 = secretphraseparts.dcs;
                if (arrayList3.size() <= 0) {
                    org.telegram.ui.Wallet.n0.j("getSecretPhrase: no secret parts, zero dcs");
                    dVar.a(null, "WALLET_SECRET_PARTS_EMPTY");
                    return;
                }
                final org.telegram.ui.ActionBar.u1 u1Var2 = new org.telegram.ui.ActionBar.u1(3, org.telegram.ui.Wallet.n0.w(), null);
                u1Var2.r(500L);
                final long key_generate_temporary_private_key = ConferenceCall.key_generate_temporary_private_key();
                byte[] key_to_public_key = ConferenceCall.key_to_public_key(key_generate_temporary_private_key);
                final boolean[] zArr = new boolean[arrayList3.size()];
                final TL_wallet.encryptedSecretPhrasePart[] encryptedsecretphrasepartArr = new TL_wallet.encryptedSecretPhrasePart[arrayList3.size()];
                final TLRPC.TL_error[] tL_errorArr = new TLRPC.TL_error[arrayList3.size()];
                final int i12 = 0;
                while (i12 < arrayList3.size()) {
                    final int intValue = arrayList3.get(i12).intValue();
                    org.telegram.ui.Wallet.n0.H("getSecretPhrase: requesting " + i12 + " part from dc" + intValue);
                    TL_wallet.fetchEncryptedSecretPhrasePart fetchencryptedsecretphrasepart = new TL_wallet.fetchEncryptedSecretPhrasePart();
                    fetchencryptedsecretphrasepart.token = secretphraseparts.token;
                    fetchencryptedsecretphrasepart.public_key = key_to_public_key;
                    ConnectionsManager.getInstance(n0Var.f42768a).sendRequestTyped(fetchencryptedsecretphrasepart, new d3.b(1), new v10() {
                        @Override
                        public final void a(Object obj4, Object obj5) {
                            n0 n0Var2 = n0.this;
                            boolean[] zArr2 = zArr;
                            int i13 = i12;
                            TL_wallet.encryptedSecretPhrasePart[] encryptedsecretphrasepartArr2 = encryptedsecretphrasepartArr;
                            TLRPC.TL_error[] tL_errorArr2 = tL_errorArr;
                            int i14 = intValue;
                            long j10 = key_generate_temporary_private_key;
                            d dVar2 = dVar;
                            org.telegram.ui.ActionBar.u1 u1Var3 = u1Var2;
                            boolean z12 = true;
                            zArr2[i13] = true;
                            encryptedsecretphrasepartArr2[i13] = (TL_wallet.encryptedSecretPhrasePart) obj4;
                            tL_errorArr2[i13] = (TLRPC.TL_error) obj5;
                            n0.H("getSecretPhrase: received " + i13 + " part from dc" + i14);
                            for (int i15 = 0; i15 < zArr2.length; i15++) {
                                if (!zArr2[i15]) {
                                    z12 = false;
                                }
                            }
                            if (!z12) {
                                return;
                            }
                            n0.H("getSecretPhrase: received all parts");
                            j jVar = new j((Object) n0Var2, (Object) u1Var3, (Object) dVar2, 3);
                            for (int i16 = 0; i16 < encryptedsecretphrasepartArr2.length; i16++) {
                                TL_wallet.encryptedSecretPhrasePart encryptedsecretphrasepart = encryptedsecretphrasepartArr2[i16];
                                if (encryptedsecretphrasepart == null) {
                                    TLRPC.TL_error tL_error2 = tL_errorArr2[i16];
                                    StringBuilder n10 = jg.g.n(i16, "getSecretPhrase: part ", ": ");
                                    String str5 = tL_error2.text;
                                    String str6 = "NULL_ERROR";
                                    if (str5 == null) {
                                        str5 = "NULL_ERROR";
                                    }
                                    n10.append(str5);
                                    n0.j(n10.toString());
                                    String str7 = tL_error2.text;
                                    if (str7 != null) {
                                        str6 = str7;
                                    }
                                    jVar.a(null, str6);
                                    return;
                                } else if (encryptedsecretphrasepart.data.length < 33) {
                                    StringBuilder n11 = jg.g.n(i16, "getSecretPhrase: part ", " length < 33 (len=");
                                    n11.append(encryptedsecretphrasepartArr2[i16].data.length);
                                    n11.append(")");
                                    n0.j(n11.toString());
                                    jVar.a(null, "WALLET_PART_" + i16 + "_INVALID");
                                    return;
                                }
                            }
                            Utilities.d.c(new bi.w2(n0Var2, encryptedsecretphrasepartArr2, j10, jVar, 24));
                        }
                    }, intValue, 0);
                    i12++;
                    arrayList3 = arrayList3;
                }
                return;
            case 5:
                org.telegram.ui.Wallet.n0 n0Var2 = (org.telegram.ui.Wallet.n0) this.f8832b;
                org.telegram.ui.Wallet.t tVar = (org.telegram.ui.Wallet.t) this.f8833c;
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP2 = (TLRPC.InputCheckPasswordSRP) obj3;
                if (tL_error2 != null) {
                    String str5 = tL_error2.text;
                    if (str5 == null) {
                        str5 = "NULL_ERROR";
                    }
                    tVar.a(str5);
                    return;
                }
                n0Var2.l0(walletState);
                n0Var2.R();
                tVar.a(null);
                return;
            default:
                org.telegram.ui.Wallet.n0 n0Var3 = (org.telegram.ui.Wallet.n0) this.f8832b;
                org.telegram.ui.Wallet.k8 k8Var = (org.telegram.ui.Wallet.k8) this.f8833c;
                TL_wallet.WalletState walletState2 = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP3 = (TLRPC.InputCheckPasswordSRP) obj3;
                if (tL_error3 != null) {
                    String str6 = tL_error3.text;
                    String str7 = "NULL_ERROR";
                    if (str6 == null) {
                        str6 = "NULL_ERROR";
                    }
                    org.telegram.ui.Wallet.n0.j("failed to disable backup: ".concat(str6));
                    String str8 = tL_error3.text;
                    if (str8 != null) {
                        str7 = str8;
                    }
                    k8Var.a(str7);
                    return;
                }
                n0Var3.l0(walletState2);
                k8Var.a(null);
                return;
        }
    }
}
