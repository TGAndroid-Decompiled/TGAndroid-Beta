package ei;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import gi.fb;
import gi.ja;
import gi.la;
import gi.va;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hp;
import org.telegram.messenger.n10;
import org.telegram.messenger.p10;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.e51;
import org.telegram.ui.ln;
public final class d0 implements p10 {
    public final int f10186a;
    public final Object f10187b;
    public final Object f10188c;

    public d0(int i3, Object obj, Object obj2) {
        this.f10186a = i3;
        this.f10187b = obj;
        this.f10188c = obj2;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3) {
        gi.x9 x9Var;
        float f10;
        boolean z10;
        String str;
        switch (this.f10186a) {
            case 0:
                k2 k2Var = (k2) this.f10187b;
                u0 u0Var = (u0) this.f10188c;
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj3;
                int i3 = k2Var.O;
                if (((Boolean) obj2).booleanValue()) {
                    TL_phone.deleteGroupCallParticipantMessages deletegroupcallparticipantmessages = new TL_phone.deleteGroupCallParticipantMessages();
                    deletegroupcallparticipantmessages.call = k2Var.P;
                    deletegroupcallparticipantmessages.participant = hp.s1(i3).j1(u0Var.f11071c);
                    deletegroupcallparticipantmessages.report_spam = bool.booleanValue();
                    ConnectionsManager.getInstance(i3).sendRequest(deletegroupcallparticipantmessages, null);
                    long j10 = u0Var.f11071c;
                    ArrayList arrayList = k2Var.f11160r;
                    ArrayList arrayList2 = k2Var.f11161s;
                    int i10 = 0;
                    boolean z11 = false;
                    while (i10 < arrayList.size()) {
                        if (((u0) arrayList.get(i10)).f11071c == j10) {
                            u0 u0Var2 = (u0) arrayList.get(i10);
                            int i11 = 0;
                            while (true) {
                                if (i11 < arrayList2.size()) {
                                    if (((v0) arrayList2.get(i11)).f11109f.contains(u0Var2)) {
                                        ((v0) arrayList2.get(i11)).f11109f.remove(u0Var2);
                                        if (((v0) arrayList2.get(i11)).f11109f.isEmpty()) {
                                            arrayList2.remove(i11);
                                            z11 = true;
                                        } else {
                                            k2Var.m();
                                        }
                                    } else {
                                        i11++;
                                    }
                                }
                            }
                            arrayList.remove(i10);
                            k2Var.f11153e.O(true);
                            i10--;
                        }
                        i10++;
                    }
                    if (z11) {
                        ConnectionsManager.getInstance(i3).getCurrentTime();
                        Collections.sort(arrayList2, new a3.u(k2Var, 12));
                        k2Var.f11159n.O(true);
                        k2Var.t();
                    }
                } else {
                    TL_phone.deleteGroupCallMessages deletegroupcallmessages = new TL_phone.deleteGroupCallMessages();
                    deletegroupcallmessages.call = k2Var.P;
                    deletegroupcallmessages.messages.add(Integer.valueOf(u0Var.f11069a));
                    ConnectionsManager.getInstance(i3).sendRequest(deletegroupcallmessages, null);
                    k2Var.c(u0Var.f11069a);
                }
                if (bool2.booleanValue()) {
                    if (k2Var.N >= 0) {
                        hp.s1(i3).w(k2Var.N);
                        return;
                    } else {
                        hp.s1(i3).e0(-k2Var.N, hp.s1(i3).j1(u0Var.f11071c), true, null);
                        return;
                    }
                }
                return;
            case 1:
                la laVar = (la) this.f10187b;
                gi.p pVar = (gi.p) this.f10188c;
                File file = (File) obj;
                String str2 = (String) obj2;
                Long l10 = (Long) obj3;
                va vaVar = laVar.S1;
                ja jaVar = vaVar.Y0;
                if (jaVar != null) {
                    jaVar.P = false;
                    jaVar.c();
                    ja jaVar2 = vaVar.Y0;
                    jaVar2.m(0L);
                    fb fbVar = jaVar2.G;
                    if (fbVar != null) {
                        fbVar.setProgress(0L);
                    }
                }
                gi.f7 f7Var = vaVar.L1;
                if (f7Var != null) {
                    f7Var.f12733o0 = file;
                    f7Var.f12735p0 = str2;
                    f7Var.f12737q0 = l10.longValue();
                    gi.f7 f7Var2 = vaVar.L1;
                    f7Var2.f12741s0 = 0.0f;
                    f7Var2.f12743t0 = 1.0f;
                    f7Var2.f12739r0 = 0L;
                    f7Var2.f12745u0 = 1.0f;
                    vaVar.t();
                    if (vaVar.Y0 != null && (x9Var = vaVar.f13770w1) != null) {
                        ug.r1 j02 = x9Var.j0(vaVar.L1.f12735p0, true);
                        laVar.setHasRoundVideo(true);
                        vaVar.Y0.s(vaVar.L1, j02, true);
                        org.telegram.messenger.g0.r(pVar.h);
                        pVar.f13243a.destroy(true, null);
                        j02.setDraw(false);
                        pVar.post(new g2.c(18, pVar, j02));
                        return;
                    }
                    pVar.a(false);
                    return;
                }
                return;
            case 2:
                ii.r rVar = (ii.r) this.f10187b;
                n10 n10Var = (n10) this.f10188c;
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
                            str3 = !TextUtils.isEmpty(rVar.f15187g) ? new String(vVar.f1447b.doFinal(Utilities.v(rVar.f15187g)), StandardCharsets.UTF_8) : rVar.f15187g;
                        } else if (!TextUtils.isEmpty(rVar.f15187g)) {
                            throw new RuntimeException("No cryptoObject found");
                        }
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        bool3 = Boolean.FALSE;
                    }
                }
                n10Var.a(bool3, str3);
                return;
            case 3:
                ln lnVar = (ln) this.f10187b;
                View view = (View) this.f10188c;
                lnVar.F0 = ((Boolean) obj).booleanValue();
                lnVar.H0 = ((Boolean) obj2).booleanValue();
                lnVar.I0 = ((Boolean) obj3).booleanValue();
                d4 d4Var = lnVar.f47371e;
                if (lnVar.F0) {
                    f10 = 16.0f;
                } else {
                    f10 = 32.0f;
                }
                int L = org.telegram.messenger.g0.L(f10);
                boolean z12 = false;
                if (d4Var.getRoundRadius()[0] != L) {
                    ValueAnimator valueAnimator = d4Var.f35352y;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator ofInt = ValueAnimator.ofInt(d4Var.getRoundRadius()[0], L);
                    d4Var.f35352y = ofInt;
                    ofInt.addUpdateListener(new n4(d4Var, 8));
                    d4Var.f35352y.setDuration(200L);
                    d4Var.f35352y.start();
                }
                ((org.telegram.ui.Cells.l8) view).setChecked(lnVar.F0);
                lnVar.u0(false, true);
                if (!lnVar.O0) {
                    TLRPC.Chat chat = lnVar.f47396x0;
                    if (chat.forum != lnVar.F0 || chat.forum_tabs != lnVar.H0 || chat.forum_sidebar != lnVar.I0) {
                        if (!org.telegram.messenger.t3.T(chat) && lnVar.F0) {
                            Context parentActivity = lnVar.getParentActivity();
                            if (parentActivity == null) {
                                parentActivity = LaunchActivity.K1;
                            }
                            if (parentActivity == null) {
                                parentActivity = org.telegram.messenger.t0.f25457b;
                            }
                            if (parentActivity != null) {
                                org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, parentActivity, null);
                                lnVar.O0 = true;
                                s1Var.r(250L);
                                lnVar.getMessagesController().T(lnVar.getParentActivity(), lnVar.f47394w0, lnVar, new mi.d4(27, lnVar, s1Var), null);
                                return;
                            }
                            return;
                        }
                        TLRPC.Chat chat2 = lnVar.f47396x0;
                        if (chat2.forum_tabs != lnVar.H0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (chat2.forum_sidebar != lnVar.I0) {
                            z12 = true;
                        }
                        lnVar.getMessagesController().a5(lnVar.f47394w0, lnVar.F0, lnVar.H0, lnVar.I0);
                        TLRPC.Chat chat3 = lnVar.f47396x0;
                        chat3.forum = lnVar.F0;
                        chat3.forum_tabs = lnVar.H0;
                        chat3.forum_sidebar = lnVar.I0;
                        if (z10 || z12) {
                            lnVar.v0(z10);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 4:
                final org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) this.f10187b;
                n10 n10Var2 = (n10) this.f10188c;
                TL_wallet.secretPhraseParts secretphraseparts = (TL_wallet.secretPhraseParts) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) obj3;
                if (secretphraseparts == null) {
                    String str4 = "NULL_ERROR";
                    org.telegram.ui.Wallet.k0.j("getSecretPhrase: no secret parts: ".concat((tL_error == null || (r5 = tL_error.text) == null) ? "NULL_ERROR" : "NULL_ERROR"));
                    if (tL_error != null && (str = tL_error.text) != null) {
                        str4 = str;
                    }
                    n10Var2.a(null, str4);
                    return;
                }
                final org.telegram.ui.Wallet.d dVar = new org.telegram.ui.Wallet.d(n10Var2, 2);
                ArrayList<Integer> arrayList3 = secretphraseparts.dcs;
                if (arrayList3.size() <= 0) {
                    org.telegram.ui.Wallet.k0.j("getSecretPhrase: no secret parts, zero dcs");
                    dVar.a(null, "WALLET_SECRET_PARTS_EMPTY");
                    return;
                }
                final org.telegram.ui.ActionBar.s1 s1Var2 = new org.telegram.ui.ActionBar.s1(3, org.telegram.ui.Wallet.k0.w(), null);
                s1Var2.r(500L);
                final long key_generate_temporary_private_key = ConferenceCall.key_generate_temporary_private_key();
                byte[] key_to_public_key = ConferenceCall.key_to_public_key(key_generate_temporary_private_key);
                final boolean[] zArr = new boolean[arrayList3.size()];
                final TL_wallet.encryptedSecretPhrasePart[] encryptedsecretphrasepartArr = new TL_wallet.encryptedSecretPhrasePart[arrayList3.size()];
                final TLRPC.TL_error[] tL_errorArr = new TLRPC.TL_error[arrayList3.size()];
                final int i12 = 0;
                while (i12 < arrayList3.size()) {
                    final int intValue = arrayList3.get(i12).intValue();
                    org.telegram.ui.Wallet.k0.H("getSecretPhrase: requesting " + i12 + " part from dc" + intValue);
                    TL_wallet.fetchEncryptedSecretPhrasePart fetchencryptedsecretphrasepart = new TL_wallet.fetchEncryptedSecretPhrasePart();
                    fetchencryptedsecretphrasepart.token = secretphraseparts.token;
                    fetchencryptedsecretphrasepart.public_key = key_to_public_key;
                    ConnectionsManager.getInstance(k0Var.f42718a).sendRequestTyped(fetchencryptedsecretphrasepart, new c3.b(1), new n10() {
                        @Override
                        public final void a(Object obj4, Object obj5) {
                            k0 k0Var2 = k0.this;
                            boolean[] zArr2 = zArr;
                            int i13 = i12;
                            TL_wallet.encryptedSecretPhrasePart[] encryptedsecretphrasepartArr2 = encryptedsecretphrasepartArr;
                            TLRPC.TL_error[] tL_errorArr2 = tL_errorArr;
                            int i14 = intValue;
                            long j11 = key_generate_temporary_private_key;
                            d dVar2 = dVar;
                            org.telegram.ui.ActionBar.s1 s1Var3 = s1Var2;
                            boolean z13 = true;
                            zArr2[i13] = true;
                            encryptedsecretphrasepartArr2[i13] = (TL_wallet.encryptedSecretPhrasePart) obj4;
                            tL_errorArr2[i13] = (TLRPC.TL_error) obj5;
                            k0.H("getSecretPhrase: received " + i13 + " part from dc" + i14);
                            for (int i15 = 0; i15 < zArr2.length; i15++) {
                                if (!zArr2[i15]) {
                                    z13 = false;
                                }
                            }
                            if (!z13) {
                                return;
                            }
                            k0.H("getSecretPhrase: received all parts");
                            j jVar = new j((Object) k0Var2, (Object) s1Var3, (Object) dVar2, 3);
                            for (int i16 = 0; i16 < encryptedsecretphrasepartArr2.length; i16++) {
                                TL_wallet.encryptedSecretPhrasePart encryptedsecretphrasepart = encryptedsecretphrasepartArr2[i16];
                                if (encryptedsecretphrasepart == null) {
                                    TLRPC.TL_error tL_error2 = tL_errorArr2[i16];
                                    StringBuilder m10 = k2.p1.m(i16, "getSecretPhrase: part ", ": ");
                                    String str5 = tL_error2.text;
                                    String str6 = "NULL_ERROR";
                                    if (str5 == null) {
                                        str5 = "NULL_ERROR";
                                    }
                                    m10.append(str5);
                                    k0.j(m10.toString());
                                    String str7 = tL_error2.text;
                                    if (str7 != null) {
                                        str6 = str7;
                                    }
                                    jVar.a(null, str6);
                                    return;
                                } else if (encryptedsecretphrasepart.data.length < 33) {
                                    StringBuilder m11 = k2.p1.m(i16, "getSecretPhrase: part ", " length < 33 (len=");
                                    m11.append(encryptedsecretphrasepartArr2[i16].data.length);
                                    m11.append(")");
                                    k0.j(m11.toString());
                                    jVar.a(null, "WALLET_PART_" + i16 + "_INVALID");
                                    return;
                                }
                            }
                            Utilities.d.c(new ci.l2(k0Var2, encryptedsecretphrasepartArr2, j11, jVar, 24));
                        }
                    }, intValue, 0);
                    i12++;
                    arrayList3 = arrayList3;
                }
                return;
            case 5:
                org.telegram.ui.Wallet.k0 k0Var2 = (org.telegram.ui.Wallet.k0) this.f10187b;
                e51 e51Var = (e51) this.f10188c;
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP2 = (TLRPC.InputCheckPasswordSRP) obj3;
                if (tL_error2 != null) {
                    String str5 = tL_error2.text;
                    if (str5 == null) {
                        str5 = "NULL_ERROR";
                    }
                    e51Var.a(str5);
                    return;
                }
                k0Var2.l0(walletState);
                k0Var2.R();
                e51Var.a(null);
                return;
            default:
                org.telegram.ui.Wallet.k0 k0Var3 = (org.telegram.ui.Wallet.k0) this.f10187b;
                org.telegram.ui.Wallet.j8 j8Var = (org.telegram.ui.Wallet.j8) this.f10188c;
                TL_wallet.WalletState walletState2 = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP3 = (TLRPC.InputCheckPasswordSRP) obj3;
                if (tL_error3 != null) {
                    String str6 = tL_error3.text;
                    String str7 = "NULL_ERROR";
                    if (str6 == null) {
                        str6 = "NULL_ERROR";
                    }
                    org.telegram.ui.Wallet.k0.j("failed to disable backup: ".concat(str6));
                    String str8 = tL_error3.text;
                    if (str8 != null) {
                        str7 = str8;
                    }
                    j8Var.a(str7);
                    return;
                }
                k0Var3.l0(walletState2);
                j8Var.a(null);
                return;
        }
    }
}
