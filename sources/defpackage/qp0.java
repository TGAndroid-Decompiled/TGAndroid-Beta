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
public final class qp0 implements lac {
    public final byte a;
    public final Object b;
    public final Object c;

    public qp0(Object obj, Object obj2, byte b) {
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
        z8b z8bVar;
        long j3 = 0;
        String str2 = "NULL_ERROR";
        boolean z2 = true;
        String str3 = null;
        switch (this.a) {
            case 0:
                up0 up0Var = (up0) this.b;
                jac jacVar = (jac) this.c;
                Boolean bool = (Boolean) obj;
                fk0 fk0Var = (fk0) obj2;
                gk0 gk0Var = (gk0) obj3;
                up0Var.getClass();
                if (fk0Var != null) {
                    try {
                        if (Build.VERSION.SDK_INT >= 30) {
                            gk0Var = up0Var.g(true);
                        }
                        String str4 = up0Var.g;
                        if (gk0Var != null) {
                            str3 = !TextUtils.isEmpty(str4) ? new String(gk0Var.b.doFinal(Utilities.v(up0Var.g)), StandardCharsets.UTF_8) : up0Var.g;
                        } else if (!TextUtils.isEmpty(str4)) {
                            throw new RuntimeException("No cryptoObject found");
                        }
                    } catch (Exception e) {
                        fc4.g(e, true);
                        bool = Boolean.FALSE;
                    }
                }
                jacVar.a(bool, str3);
                return;
            case 1:
                ba2 ba2Var = (ba2) this.b;
                View view = (View) this.c;
                ba2Var.getClass();
                ba2Var.F0 = ((Boolean) obj).booleanValue();
                ba2Var.H0 = ((Boolean) obj2).booleanValue();
                ba2Var.I0 = ((Boolean) obj3).booleanValue();
                kc0 kc0Var = ba2Var.e;
                if (ba2Var.F0) {
                    f = 16.0f;
                } else {
                    f = 32.0f;
                }
                int L = gm.L(f);
                if (kc0Var.getRoundRadius()[0] != L) {
                    ValueAnimator valueAnimator = kc0Var.y;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator ofInt = ValueAnimator.ofInt(kc0Var.getRoundRadius()[0], L);
                    kc0Var.y = ofInt;
                    ofInt.addUpdateListener(new af0(kc0Var, (byte) 0));
                    kc0Var.y.setDuration(200L);
                    kc0Var.y.start();
                }
                ((xib) view).setChecked(ba2Var.F0);
                ba2Var.u0(false, true);
                if (!ba2Var.O0) {
                    TLRPC.Chat chat = ba2Var.x0;
                    if (chat.forum != ba2Var.F0 || chat.forum_tabs != ba2Var.H0 || chat.forum_sidebar != ba2Var.I0) {
                        if (!sd2.T(chat) && ba2Var.F0) {
                            Context parentActivity = ba2Var.getParentActivity();
                            if (parentActivity == null) {
                                parentActivity = LaunchActivity.H1;
                            }
                            if (parentActivity == null) {
                                parentActivity = a.b;
                            }
                            if (parentActivity != null) {
                                he heVar = new he(3, null, parentActivity);
                                ba2Var.O0 = true;
                                heVar.q(250L);
                                ba2Var.getMessagesController().P(ba2Var.getParentActivity(), ba2Var.w0, ba2Var, new x92(ba2Var, heVar, (byte) 0), null);
                                return;
                            }
                            return;
                        }
                        TLRPC.Chat chat2 = ba2Var.x0;
                        if (chat2.forum_tabs != ba2Var.H0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (chat2.forum_sidebar == ba2Var.I0) {
                            z2 = false;
                        }
                        ba2Var.getMessagesController().i5(ba2Var.w0, ba2Var.F0, ba2Var.H0, ba2Var.I0);
                        TLRPC.Chat chat3 = ba2Var.x0;
                        chat3.forum = ba2Var.F0;
                        chat3.forum_tabs = ba2Var.H0;
                        chat3.forum_sidebar = ba2Var.I0;
                        if (z || z2) {
                            ba2Var.v0(z);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 2:
                final c cVar = (c) this.b;
                jac jacVar2 = (jac) this.c;
                TL_wallet.secretPhraseParts secretphraseparts = (TL_wallet.secretPhraseParts) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) obj3;
                if (secretphraseparts == null) {
                    c.m("getSecretPhrase: no secret parts: ".concat((tL_error == null || (r1 = tL_error.text) == null) ? "NULL_ERROR" : "NULL_ERROR"));
                    if (tL_error != null && (str = tL_error.text) != null) {
                        str2 = str;
                    }
                    jacVar2.a(null, str2);
                    return;
                }
                final f25 f25Var = new f25(jacVar2, (byte) 0);
                ArrayList<Integer> arrayList = secretphraseparts.dcs;
                if (arrayList.size() <= 0) {
                    c.m("getSecretPhrase: no secret parts, zero dcs");
                    f25Var.a(null, "WALLET_SECRET_PARTS_EMPTY");
                    return;
                }
                final he heVar2 = new he(3, null, c.B());
                heVar2.q(500L);
                final long key_generate_temporary_private_key = ConferenceCall.key_generate_temporary_private_key();
                byte[] key_to_public_key = ConferenceCall.key_to_public_key(key_generate_temporary_private_key);
                final boolean[] zArr = new boolean[arrayList.size()];
                final TL_wallet.encryptedSecretPhrasePart[] encryptedsecretphrasepartArr = new TL_wallet.encryptedSecretPhrasePart[arrayList.size()];
                final TLRPC.TL_error[] tL_errorArr = new TLRPC.TL_error[arrayList.size()];
                for (final int i = 0; i < arrayList.size(); i++) {
                    final int intValue = arrayList.get(i).intValue();
                    c.O("getSecretPhrase: requesting " + i + " part from dc" + intValue);
                    TL_wallet.fetchEncryptedSecretPhrasePart fetchencryptedsecretphrasepart = new TL_wallet.fetchEncryptedSecretPhrasePart();
                    fetchencryptedsecretphrasepart.token = secretphraseparts.token;
                    fetchencryptedsecretphrasepart.public_key = key_to_public_key;
                    ConnectionsManager.getInstance(cVar.a).sendRequestTyped(fetchencryptedsecretphrasepart, new kc((byte) 0), new jac() {
                        @Override
                        public final void a(Object obj4, Object obj5) {
                            c cVar2 = c.this;
                            boolean[] zArr2 = zArr;
                            int i2 = i;
                            TL_wallet.encryptedSecretPhrasePart[] encryptedsecretphrasepartArr2 = encryptedsecretphrasepartArr;
                            TLRPC.TL_error[] tL_errorArr2 = tL_errorArr;
                            int i3 = intValue;
                            long j4 = key_generate_temporary_private_key;
                            f25 f25Var2 = f25Var;
                            he heVar3 = heVar2;
                            boolean z3 = true;
                            zArr2[i2] = true;
                            encryptedsecretphrasepartArr2[i2] = (TL_wallet.encryptedSecretPhrasePart) obj4;
                            tL_errorArr2[i2] = (TLRPC.TL_error) obj5;
                            c.O("getSecretPhrase: received " + i2 + " part from dc" + i3);
                            for (int i4 = 0; i4 < zArr2.length; i4++) {
                                if (!zArr2[i4]) {
                                    z3 = false;
                                }
                            }
                            if (!z3) {
                                return;
                            }
                            c.O("getSecretPhrase: received all parts");
                            p pVar = new p(cVar2, heVar3, f25Var2, (byte) 19);
                            for (int i5 = 0; i5 < encryptedsecretphrasepartArr2.length; i5++) {
                                TL_wallet.encryptedSecretPhrasePart encryptedsecretphrasepart = encryptedsecretphrasepartArr2[i5];
                                if (encryptedsecretphrasepart == null) {
                                    TLRPC.TL_error tL_error2 = tL_errorArr2[i5];
                                    StringBuilder l = hg9.l(i5, "getSecretPhrase: part ", ": ");
                                    String str5 = tL_error2.text;
                                    String str6 = "NULL_ERROR";
                                    if (str5 == null) {
                                        str5 = "NULL_ERROR";
                                    }
                                    l.append(str5);
                                    c.m(l.toString());
                                    String str7 = tL_error2.text;
                                    if (str7 != null) {
                                        str6 = str7;
                                    }
                                    pVar.a(null, str6);
                                    return;
                                } else if (encryptedsecretphrasepart.data.length < 33) {
                                    StringBuilder l2 = hg9.l(i5, "getSecretPhrase: part ", " length < 33 (len=");
                                    l2.append(encryptedsecretphrasepartArr2[i5].data.length);
                                    l2.append(")");
                                    c.m(l2.toString());
                                    pVar.a(null, "WALLET_PART_" + i5 + "_INVALID");
                                    return;
                                }
                            }
                            Utilities.d.c(new p97(cVar2, encryptedsecretphrasepartArr2, j4, pVar, (byte) 8));
                        }
                    }, intValue, 0);
                }
                return;
            case 3:
                c cVar2 = (c) this.b;
                sqc sqcVar = (sqc) this.c;
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
                    sqcVar.a(str2);
                    return;
                }
                cVar2.w0(walletState);
                sqcVar.a(null);
                return;
            case 4:
                c cVar3 = (c) this.b;
                ts9 ts9Var = (ts9) this.c;
                TL_wallet.WalletState walletState2 = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP3 = (TLRPC.InputCheckPasswordSRP) obj3;
                if (tL_error3 != null) {
                    String str7 = tL_error3.text;
                    if (str7 != null) {
                        str2 = str7;
                    }
                    ts9Var.a(str2);
                    return;
                }
                cVar3.w0(walletState2);
                cVar3.Y();
                ts9Var.a(null);
                return;
            case 5:
                n38 n38Var = (n38) this.b;
                i96 i96Var = (i96) this.c;
                Boolean bool2 = (Boolean) obj;
                Boolean bool3 = (Boolean) obj3;
                int i2 = n38Var.O;
                if (((Boolean) obj2).booleanValue()) {
                    TL_phone.deleteGroupCallParticipantMessages deletegroupcallparticipantmessages = new TL_phone.deleteGroupCallParticipantMessages();
                    deletegroupcallparticipantmessages.call = n38Var.P;
                    deletegroupcallparticipantmessages.participant = oc7.r1(i2).i1(i96Var.c);
                    deletegroupcallparticipantmessages.report_spam = bool2.booleanValue();
                    ConnectionsManager.getInstance(i2).sendRequest(deletegroupcallparticipantmessages, null);
                    long j4 = i96Var.c;
                    ArrayList arrayList2 = n38Var.r;
                    ArrayList arrayList3 = n38Var.s;
                    int i3 = 0;
                    boolean z3 = false;
                    while (i3 < arrayList2.size()) {
                        if (((i96) arrayList2.get(i3)).c == j4) {
                            i96 i96Var2 = (i96) arrayList2.get(i3);
                            j2 = j3;
                            int i4 = 0;
                            while (true) {
                                if (i4 < arrayList3.size()) {
                                    if (((j96) arrayList3.get(i4)).f.contains(i96Var2)) {
                                        ((j96) arrayList3.get(i4)).f.remove(i96Var2);
                                        if (((j96) arrayList3.get(i4)).f.isEmpty()) {
                                            arrayList3.remove(i4);
                                            z3 = true;
                                        } else {
                                            n38Var.l();
                                        }
                                    } else {
                                        i4++;
                                    }
                                }
                            }
                            arrayList2.remove(i3);
                            n38Var.e.O(true);
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
                        Collections.sort(arrayList3, new x03(n38Var, (byte) 27));
                        n38Var.n.O(true);
                        n38Var.s();
                    }
                } else {
                    j = 0;
                    TL_phone.deleteGroupCallMessages deletegroupcallmessages = new TL_phone.deleteGroupCallMessages();
                    deletegroupcallmessages.call = n38Var.P;
                    deletegroupcallmessages.messages.add(Integer.valueOf(i96Var.a));
                    ConnectionsManager.getInstance(i2).sendRequest(deletegroupcallmessages, null);
                    n38Var.b(i96Var.a);
                }
                if (bool3.booleanValue()) {
                    if (n38Var.N >= j) {
                        oc7.r1(i2).t(n38Var.N);
                        return;
                    } else {
                        oc7.r1(i2).a0(-n38Var.N, oc7.r1(i2).i1(i96Var.c), true, null);
                        return;
                    }
                }
                return;
            default:
                l9b l9bVar = (l9b) this.b;
                wc1 wc1Var = (wc1) this.c;
                File file = (File) obj;
                String str8 = (String) obj2;
                Long l = (Long) obj3;
                v9b v9bVar = l9bVar.S1;
                k9b k9bVar = v9bVar.Y0;
                if (k9bVar != null) {
                    k9bVar.P = false;
                    k9bVar.b();
                    k9b k9bVar2 = v9bVar.Y0;
                    k9bVar2.m(0L);
                    lqb lqbVar = k9bVar2.G;
                    if (lqbVar != null) {
                        lqbVar.setProgress(0L);
                    }
                }
                g6b g6bVar = v9bVar.L1;
                if (g6bVar != null) {
                    g6bVar.o0 = file;
                    g6bVar.p0 = str8;
                    g6bVar.q0 = l.longValue();
                    g6b g6bVar2 = v9bVar.L1;
                    g6bVar2.s0 = 0.0f;
                    g6bVar2.t0 = 1.0f;
                    g6bVar2.r0 = 0L;
                    g6bVar2.u0 = 1.0f;
                    v9bVar.s();
                    if (v9bVar.Y0 != null && (z8bVar = v9bVar.w1) != null) {
                        ao9 j0 = z8bVar.j0(v9bVar.L1.p0, true);
                        l9bVar.setHasRoundVideo(true);
                        v9bVar.Y0.s(v9bVar.L1, j0, true);
                        gm.r(wc1Var.h);
                        wc1Var.a.destroy(true, null);
                        j0.setDraw(false);
                        wc1Var.post(new il9(wc1Var, j0, (byte) 5));
                        return;
                    }
                    wc1Var.a(false);
                    return;
                }
                return;
        }
    }
}
