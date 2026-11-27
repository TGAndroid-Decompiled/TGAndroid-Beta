package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.c;
public final class qo0 implements kcc {
    public final byte a;
    public final Object b;
    public final Object c;

    public qo0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3) {
        float f;
        boolean z;
        String str;
        long j;
        long j2;
        vab vabVar;
        long j3 = 0;
        String str2 = "NULL_ERROR";
        boolean z2 = true;
        String str3 = null;
        switch (this.a) {
            case 0:
                uo0 uo0Var = (uo0) this.b;
                icc iccVar = (icc) this.c;
                Boolean bool = (Boolean) obj;
                gj0 gj0Var = (gj0) obj2;
                hj0 hj0Var = (hj0) obj3;
                uo0Var.getClass();
                if (gj0Var != null) {
                    try {
                        if (Build.VERSION.SDK_INT >= 30) {
                            hj0Var = uo0Var.g(true);
                        }
                        String str4 = uo0Var.g;
                        if (hj0Var != null) {
                            str3 = !TextUtils.isEmpty(str4) ? new String(hj0Var.b.doFinal(Utilities.v(uo0Var.g)), StandardCharsets.UTF_8) : uo0Var.g;
                        } else if (!TextUtils.isEmpty(str4)) {
                            throw new RuntimeException("No cryptoObject found");
                        }
                    } catch (Exception e) {
                        cc4.g(e, true);
                        bool = Boolean.FALSE;
                    }
                }
                iccVar.a(bool, str3);
                return;
            case 1:
                g92 g92Var = (g92) this.b;
                View view = (View) this.c;
                g92Var.getClass();
                g92Var.F0 = ((Boolean) obj).booleanValue();
                g92Var.H0 = ((Boolean) obj2).booleanValue();
                g92Var.I0 = ((Boolean) obj3).booleanValue();
                mb0 mb0Var = g92Var.e;
                if (g92Var.F0) {
                    f = 16.0f;
                } else {
                    f = 32.0f;
                }
                int L = hl.L(f);
                if (mb0Var.getRoundRadius()[0] != L) {
                    ValueAnimator valueAnimator = mb0Var.y;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator ofInt = ValueAnimator.ofInt(mb0Var.getRoundRadius()[0], L);
                    mb0Var.y = ofInt;
                    ofInt.addUpdateListener(new ce0(mb0Var, (byte) 0));
                    mb0Var.y.setDuration(200L);
                    mb0Var.y.start();
                }
                ((skb) view).setChecked(g92Var.F0);
                g92Var.t0(false, true);
                if (!g92Var.O0) {
                    TLRPC.Chat chat = g92Var.x0;
                    if (chat.forum != g92Var.F0 || chat.forum_tabs != g92Var.H0 || chat.forum_sidebar != g92Var.I0) {
                        if (!xc2.T(chat) && g92Var.F0) {
                            Context parentActivity = g92Var.getParentActivity();
                            if (parentActivity == null) {
                                parentActivity = LaunchActivity.H1;
                            }
                            if (parentActivity == null) {
                                parentActivity = a.b;
                            }
                            if (parentActivity != null) {
                                id idVar = new id(3, null, parentActivity);
                                g92Var.O0 = true;
                                idVar.q(250L);
                                g92Var.getMessagesController().R(g92Var.getParentActivity(), g92Var.w0, g92Var, new q72(g92Var, idVar, (byte) 1), null);
                                return;
                            }
                            return;
                        }
                        TLRPC.Chat chat2 = g92Var.x0;
                        if (chat2.forum_tabs != g92Var.H0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (chat2.forum_sidebar == g92Var.I0) {
                            z2 = false;
                        }
                        g92Var.getMessagesController().o5(g92Var.w0, g92Var.F0, g92Var.H0, g92Var.I0);
                        TLRPC.Chat chat3 = g92Var.x0;
                        chat3.forum = g92Var.F0;
                        chat3.forum_tabs = g92Var.H0;
                        chat3.forum_sidebar = g92Var.I0;
                        if (z || z2) {
                            g92Var.u0(z);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 2:
                final c cVar = (c) this.b;
                icc iccVar2 = (icc) this.c;
                TL_wallet.secretPhraseParts secretphraseparts = (TL_wallet.secretPhraseParts) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) obj3;
                if (secretphraseparts == null) {
                    c.m("getSecretPhrase: no secret parts: ".concat((tL_error == null || (r1 = tL_error.text) == null) ? "NULL_ERROR" : "NULL_ERROR"));
                    if (tL_error != null && (str = tL_error.text) != null) {
                        str2 = str;
                    }
                    iccVar2.a(null, str2);
                    return;
                }
                final j25 j25Var = new j25(iccVar2, (byte) 0);
                ArrayList<Integer> arrayList = secretphraseparts.dcs;
                if (arrayList.size() <= 0) {
                    c.m("getSecretPhrase: no secret parts, zero dcs");
                    j25Var.a(null, "WALLET_SECRET_PARTS_EMPTY");
                    return;
                }
                final id idVar2 = new id(3, null, c.B());
                idVar2.q(500L);
                final long key_generate_temporary_private_key = ConferenceCall.key_generate_temporary_private_key();
                byte[] key_to_public_key = ConferenceCall.key_to_public_key(key_generate_temporary_private_key);
                final boolean[] zArr = new boolean[arrayList.size()];
                final TL_wallet.encryptedSecretPhrasePart[] encryptedsecretphrasepartArr = new TL_wallet.encryptedSecretPhrasePart[arrayList.size()];
                final TLRPC.TL_error[] tL_errorArr = new TLRPC.TL_error[arrayList.size()];
                for (final int i = 0; i < arrayList.size(); i++) {
                    final int intValue = arrayList.get(i).intValue();
                    c.P("getSecretPhrase: requesting " + i + " part from dc" + intValue);
                    TL_wallet.fetchEncryptedSecretPhrasePart fetchencryptedsecretphrasepart = new TL_wallet.fetchEncryptedSecretPhrasePart();
                    fetchencryptedsecretphrasepart.token = secretphraseparts.token;
                    fetchencryptedsecretphrasepart.public_key = key_to_public_key;
                    ConnectionsManager.getInstance(cVar.a).sendRequestTyped(fetchencryptedsecretphrasepart, new ic((byte) 0), new icc() {
                        @Override
                        public final void a(Object obj4, Object obj5) {
                            c cVar2 = c.this;
                            boolean[] zArr2 = zArr;
                            int i2 = i;
                            TL_wallet.encryptedSecretPhrasePart[] encryptedsecretphrasepartArr2 = encryptedsecretphrasepartArr;
                            TLRPC.TL_error[] tL_errorArr2 = tL_errorArr;
                            int i3 = intValue;
                            long j4 = key_generate_temporary_private_key;
                            j25 j25Var2 = j25Var;
                            id idVar3 = idVar2;
                            boolean z3 = true;
                            zArr2[i2] = true;
                            encryptedsecretphrasepartArr2[i2] = (TL_wallet.encryptedSecretPhrasePart) obj4;
                            tL_errorArr2[i2] = (TLRPC.TL_error) obj5;
                            c.P("getSecretPhrase: received " + i2 + " part from dc" + i3);
                            for (int i4 = 0; i4 < zArr2.length; i4++) {
                                if (!zArr2[i4]) {
                                    z3 = false;
                                }
                            }
                            if (!z3) {
                                return;
                            }
                            c.P("getSecretPhrase: received all parts");
                            p pVar = new p(cVar2, idVar3, j25Var2, (byte) 19);
                            for (int i5 = 0; i5 < encryptedsecretphrasepartArr2.length; i5++) {
                                TL_wallet.encryptedSecretPhrasePart encryptedsecretphrasepart = encryptedsecretphrasepartArr2[i5];
                                if (encryptedsecretphrasepart == null) {
                                    TLRPC.TL_error tL_error2 = tL_errorArr2[i5];
                                    StringBuilder m = uh9.m(i5, "getSecretPhrase: part ", ": ");
                                    String str5 = tL_error2.text;
                                    String str6 = "NULL_ERROR";
                                    if (str5 == null) {
                                        str5 = "NULL_ERROR";
                                    }
                                    m.append(str5);
                                    c.m(m.toString());
                                    String str7 = tL_error2.text;
                                    if (str7 != null) {
                                        str6 = str7;
                                    }
                                    pVar.a(null, str6);
                                    return;
                                } else if (encryptedsecretphrasepart.data.length < 33) {
                                    StringBuilder m2 = uh9.m(i5, "getSecretPhrase: part ", " length < 33 (len=");
                                    m2.append(encryptedsecretphrasepartArr2[i5].data.length);
                                    m2.append(")");
                                    c.m(m2.toString());
                                    pVar.a(null, "WALLET_PART_" + i5 + "_INVALID");
                                    return;
                                }
                            }
                            Utilities.d.c(new ba7(cVar2, encryptedsecretphrasepartArr2, j4, pVar, (byte) 8));
                        }
                    }, intValue, 0);
                }
                return;
            case 3:
                c cVar2 = (c) this.b;
                dtc dtcVar = (dtc) this.c;
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP2 = (TLRPC.InputCheckPasswordSRP) obj3;
                if (tL_error2 != null) {
                    String str5 = tL_error2.text;
                    if (str5 == null) {
                        str5 = "NULL_ERROR";
                    }
                    c.m("failed to disable backup: ".concat(str5));
                    String str6 = tL_error2.text;
                    if (str6 != null) {
                        str2 = str6;
                    }
                    dtcVar.a(str2);
                    return;
                }
                cVar2.z0(walletState);
                dtcVar.a(null);
                return;
            case 4:
                c cVar3 = (c) this.b;
                ku9 ku9Var = (ku9) this.c;
                TL_wallet.WalletState walletState2 = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP3 = (TLRPC.InputCheckPasswordSRP) obj3;
                if (tL_error3 != null) {
                    String str7 = tL_error3.text;
                    if (str7 != null) {
                        str2 = str7;
                    }
                    ku9Var.a(str2);
                    return;
                }
                cVar3.z0(walletState2);
                cVar3.Z();
                ku9Var.a(null);
                return;
            case 5:
                b58 b58Var = (b58) this.b;
                m96 m96Var = (m96) this.c;
                Boolean bool2 = (Boolean) obj;
                Boolean bool3 = (Boolean) obj3;
                int i2 = b58Var.O;
                if (((Boolean) obj2).booleanValue()) {
                    TL_phone.deleteGroupCallParticipantMessages deletegroupcallparticipantmessages = new TL_phone.deleteGroupCallParticipantMessages();
                    deletegroupcallparticipantmessages.call = b58Var.P;
                    deletegroupcallparticipantmessages.participant = uc7.s1(i2).j1(m96Var.c);
                    deletegroupcallparticipantmessages.report_spam = bool2.booleanValue();
                    ConnectionsManager.getInstance(i2).sendRequest(deletegroupcallparticipantmessages, null);
                    long j4 = m96Var.c;
                    ArrayList arrayList2 = b58Var.r;
                    ArrayList arrayList3 = b58Var.s;
                    int i3 = 0;
                    boolean z3 = false;
                    while (i3 < arrayList2.size()) {
                        if (((m96) arrayList2.get(i3)).c == j4) {
                            m96 m96Var2 = (m96) arrayList2.get(i3);
                            j2 = j3;
                            int i4 = 0;
                            while (true) {
                                if (i4 < arrayList3.size()) {
                                    if (((n96) arrayList3.get(i4)).f.contains(m96Var2)) {
                                        ((n96) arrayList3.get(i4)).f.remove(m96Var2);
                                        if (((n96) arrayList3.get(i4)).f.isEmpty()) {
                                            arrayList3.remove(i4);
                                            z3 = true;
                                        } else {
                                            b58Var.l();
                                        }
                                    } else {
                                        i4++;
                                    }
                                }
                            }
                            arrayList2.remove(i3);
                            b58Var.e.O(true);
                            i3--;
                        } else {
                            j2 = j3;
                        }
                        i3++;
                        j3 = j2;
                    }
                    j = j3;
                    if (z3) {
                        ConnectionsManager.getInstance(i2).getCurrentTime();
                        Collections.sort(arrayList3, new f03(b58Var, (byte) 25));
                        b58Var.n.O(true);
                        b58Var.s();
                    }
                } else {
                    j = 0;
                    TL_phone.deleteGroupCallMessages deletegroupcallmessages = new TL_phone.deleteGroupCallMessages();
                    deletegroupcallmessages.call = b58Var.P;
                    deletegroupcallmessages.messages.add(Integer.valueOf(m96Var.a));
                    ConnectionsManager.getInstance(i2).sendRequest(deletegroupcallmessages, null);
                    b58Var.b(m96Var.a);
                }
                if (bool3.booleanValue()) {
                    if (b58Var.N >= j) {
                        uc7.s1(i2).u(b58Var.N);
                        return;
                    } else {
                        uc7.s1(i2).c0(-b58Var.N, uc7.s1(i2).j1(m96Var.c), true, null);
                        return;
                    }
                }
                return;
            default:
                hbb hbbVar = (hbb) this.b;
                xb1 xb1Var = (xb1) this.c;
                File file = (File) obj;
                String str8 = (String) obj2;
                Long l = (Long) obj3;
                rbb rbbVar = hbbVar.S1;
                gbb gbbVar = rbbVar.Y0;
                if (gbbVar != null) {
                    gbbVar.P = false;
                    gbbVar.b();
                    gbb gbbVar2 = rbbVar.Y0;
                    gbbVar2.m(0L);
                    ksb ksbVar = gbbVar2.G;
                    if (ksbVar != null) {
                        ksbVar.setProgress(0L);
                    }
                }
                c8b c8bVar = rbbVar.L1;
                if (c8bVar != null) {
                    c8bVar.o0 = file;
                    c8bVar.p0 = str8;
                    c8bVar.q0 = l.longValue();
                    c8b c8bVar2 = rbbVar.L1;
                    c8bVar2.s0 = 0.0f;
                    c8bVar2.t0 = 1.0f;
                    c8bVar2.r0 = 0L;
                    c8bVar2.u0 = 1.0f;
                    rbbVar.s();
                    if (rbbVar.Y0 != null && (vabVar = rbbVar.w1) != null) {
                        pp9 j0 = vabVar.j0(rbbVar.L1.p0, true);
                        hbbVar.setHasRoundVideo(true);
                        rbbVar.Y0.s(rbbVar.L1, j0, true);
                        hl.r(xb1Var.h);
                        xb1Var.a.destroy(true, null);
                        j0.setDraw(false);
                        xb1Var.post(new en9(xb1Var, j0, (byte) 2));
                        return;
                    }
                    xb1Var.a(false);
                    return;
                }
                return;
        }
    }
}
