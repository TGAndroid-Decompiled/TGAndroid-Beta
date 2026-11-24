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
public final class qo0 implements k8c {
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
        x6b x6bVar;
        long j3 = 0;
        String str2 = "NULL_ERROR";
        boolean z2 = true;
        String str3 = null;
        switch (this.a) {
            case 0:
                uo0 uo0Var = (uo0) this.b;
                i8c i8cVar = (i8c) this.c;
                Boolean bool = (Boolean) obj;
                fj0 fj0Var = (fj0) obj2;
                gj0 gj0Var = (gj0) obj3;
                uo0Var.getClass();
                if (fj0Var != null) {
                    try {
                        if (Build.VERSION.SDK_INT >= 30) {
                            gj0Var = uo0Var.g(true);
                        }
                        String str4 = uo0Var.g;
                        if (gj0Var != null) {
                            str3 = !TextUtils.isEmpty(str4) ? new String(gj0Var.b.doFinal(Utilities.v(uo0Var.g)), StandardCharsets.UTF_8) : uo0Var.g;
                        } else if (!TextUtils.isEmpty(str4)) {
                            throw new RuntimeException("No cryptoObject found");
                        }
                    } catch (Exception e) {
                        fa4.g(e, true);
                        bool = Boolean.FALSE;
                    }
                }
                i8cVar.a(bool, str3);
                return;
            case 1:
                p82 p82Var = (p82) this.b;
                View view = (View) this.c;
                p82Var.getClass();
                p82Var.F0 = ((Boolean) obj).booleanValue();
                p82Var.H0 = ((Boolean) obj2).booleanValue();
                p82Var.I0 = ((Boolean) obj3).booleanValue();
                kb0 kb0Var = p82Var.e;
                if (p82Var.F0) {
                    f = 16.0f;
                } else {
                    f = 32.0f;
                }
                int L = gl.L(f);
                if (kb0Var.getRoundRadius()[0] != L) {
                    ValueAnimator valueAnimator = kb0Var.y;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator ofInt = ValueAnimator.ofInt(kb0Var.getRoundRadius()[0], L);
                    kb0Var.y = ofInt;
                    ofInt.addUpdateListener(new ae0(kb0Var, (byte) 0));
                    kb0Var.y.setDuration(200L);
                    kb0Var.y.start();
                }
                ((wgb) view).setChecked(p82Var.F0);
                p82Var.t0(false, true);
                if (!p82Var.O0) {
                    TLRPC.Chat chat = p82Var.x0;
                    if (chat.forum != p82Var.F0 || chat.forum_tabs != p82Var.H0 || chat.forum_sidebar != p82Var.I0) {
                        if (!hc2.T(chat) && p82Var.F0) {
                            Context parentActivity = p82Var.getParentActivity();
                            if (parentActivity == null) {
                                parentActivity = LaunchActivity.H1;
                            }
                            if (parentActivity == null) {
                                parentActivity = a.b;
                            }
                            if (parentActivity != null) {
                                hd hdVar = new hd(3, null, parentActivity);
                                p82Var.O0 = true;
                                hdVar.q(250L);
                                p82Var.getMessagesController().P(p82Var.getParentActivity(), p82Var.w0, p82Var, new q31(p82Var, hdVar, (byte) 29), null);
                                return;
                            }
                            return;
                        }
                        TLRPC.Chat chat2 = p82Var.x0;
                        if (chat2.forum_tabs != p82Var.H0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (chat2.forum_sidebar == p82Var.I0) {
                            z2 = false;
                        }
                        p82Var.getMessagesController().f5(p82Var.w0, p82Var.F0, p82Var.H0, p82Var.I0);
                        TLRPC.Chat chat3 = p82Var.x0;
                        chat3.forum = p82Var.F0;
                        chat3.forum_tabs = p82Var.H0;
                        chat3.forum_sidebar = p82Var.I0;
                        if (z || z2) {
                            p82Var.u0(z);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 2:
                final c cVar = (c) this.b;
                i8c i8cVar2 = (i8c) this.c;
                TL_wallet.secretPhraseParts secretphraseparts = (TL_wallet.secretPhraseParts) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) obj3;
                if (secretphraseparts == null) {
                    c.m("getSecretPhrase: no secret parts: ".concat((tL_error == null || (r1 = tL_error.text) == null) ? "NULL_ERROR" : "NULL_ERROR"));
                    if (tL_error != null && (str = tL_error.text) != null) {
                        str2 = str;
                    }
                    i8cVar2.a(null, str2);
                    return;
                }
                final f05 f05Var = new f05(i8cVar2, (byte) 0);
                ArrayList<Integer> arrayList = secretphraseparts.dcs;
                if (arrayList.size() <= 0) {
                    c.m("getSecretPhrase: no secret parts, zero dcs");
                    f05Var.a(null, "WALLET_SECRET_PARTS_EMPTY");
                    return;
                }
                final hd hdVar2 = new hd(3, null, c.B());
                hdVar2.q(500L);
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
                    ConnectionsManager.getInstance(cVar.a).sendRequestTyped(fetchencryptedsecretphrasepart, new hc((byte) 0), new i8c() {
                        @Override
                        public final void a(Object obj4, Object obj5) {
                            c cVar2 = c.this;
                            boolean[] zArr2 = zArr;
                            int i2 = i;
                            TL_wallet.encryptedSecretPhrasePart[] encryptedsecretphrasepartArr2 = encryptedsecretphrasepartArr;
                            TLRPC.TL_error[] tL_errorArr2 = tL_errorArr;
                            int i3 = intValue;
                            long j4 = key_generate_temporary_private_key;
                            f05 f05Var2 = f05Var;
                            hd hdVar3 = hdVar2;
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
                            p pVar = new p(cVar2, hdVar3, f05Var2, (byte) 19);
                            for (int i5 = 0; i5 < encryptedsecretphrasepartArr2.length; i5++) {
                                TL_wallet.encryptedSecretPhrasePart encryptedsecretphrasepart = encryptedsecretphrasepartArr2[i5];
                                if (encryptedsecretphrasepart == null) {
                                    TLRPC.TL_error tL_error2 = tL_errorArr2[i5];
                                    StringBuilder m = de9.m(i5, "getSecretPhrase: part ", ": ");
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
                                    StringBuilder m2 = de9.m(i5, "getSecretPhrase: part ", " length < 33 (len=");
                                    m2.append(encryptedsecretphrasepartArr2[i5].data.length);
                                    m2.append(")");
                                    c.m(m2.toString());
                                    pVar.a(null, "WALLET_PART_" + i5 + "_INVALID");
                                    return;
                                }
                            }
                            Utilities.d.c(new m77(cVar2, encryptedsecretphrasepartArr2, j4, pVar, (byte) 8));
                        }
                    }, intValue, 0);
                }
                return;
            case 3:
                c cVar2 = (c) this.b;
                qoc qocVar = (qoc) this.c;
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
                    qocVar.a(str2);
                    return;
                }
                cVar2.w0(walletState);
                qocVar.a(null);
                return;
            case 4:
                c cVar3 = (c) this.b;
                nu9 nu9Var = (nu9) this.c;
                TL_wallet.WalletState walletState2 = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP3 = (TLRPC.InputCheckPasswordSRP) obj3;
                if (tL_error3 != null) {
                    String str7 = tL_error3.text;
                    if (str7 != null) {
                        str2 = str7;
                    }
                    nu9Var.a(str2);
                    return;
                }
                cVar3.w0(walletState2);
                cVar3.Y();
                nu9Var.a(null);
                return;
            case 5:
                l18 l18Var = (l18) this.b;
                i76 i76Var = (i76) this.c;
                Boolean bool2 = (Boolean) obj;
                Boolean bool3 = (Boolean) obj3;
                int i2 = l18Var.O;
                if (((Boolean) obj2).booleanValue()) {
                    TL_phone.deleteGroupCallParticipantMessages deletegroupcallparticipantmessages = new TL_phone.deleteGroupCallParticipantMessages();
                    deletegroupcallparticipantmessages.call = l18Var.P;
                    deletegroupcallparticipantmessages.participant = na7.q1(i2).h1(i76Var.c);
                    deletegroupcallparticipantmessages.report_spam = bool2.booleanValue();
                    ConnectionsManager.getInstance(i2).sendRequest(deletegroupcallparticipantmessages, null);
                    long j4 = i76Var.c;
                    ArrayList arrayList2 = l18Var.r;
                    ArrayList arrayList3 = l18Var.s;
                    int i3 = 0;
                    boolean z3 = false;
                    while (i3 < arrayList2.size()) {
                        if (((i76) arrayList2.get(i3)).c == j4) {
                            i76 i76Var2 = (i76) arrayList2.get(i3);
                            j2 = j3;
                            int i4 = 0;
                            while (true) {
                                if (i4 < arrayList3.size()) {
                                    if (((j76) arrayList3.get(i4)).f.contains(i76Var2)) {
                                        ((j76) arrayList3.get(i4)).f.remove(i76Var2);
                                        if (((j76) arrayList3.get(i4)).f.isEmpty()) {
                                            arrayList3.remove(i4);
                                            z3 = true;
                                        } else {
                                            l18Var.l();
                                        }
                                    } else {
                                        i4++;
                                    }
                                }
                            }
                            arrayList2.remove(i3);
                            l18Var.e.O(true);
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
                        Collections.sort(arrayList3, new mz2(l18Var, (byte) 26));
                        l18Var.n.O(true);
                        l18Var.s();
                    }
                } else {
                    j = 0;
                    TL_phone.deleteGroupCallMessages deletegroupcallmessages = new TL_phone.deleteGroupCallMessages();
                    deletegroupcallmessages.call = l18Var.P;
                    deletegroupcallmessages.messages.add(Integer.valueOf(i76Var.a));
                    ConnectionsManager.getInstance(i2).sendRequest(deletegroupcallmessages, null);
                    l18Var.b(i76Var.a);
                }
                if (bool3.booleanValue()) {
                    if (l18Var.N >= j) {
                        na7.q1(i2).t(l18Var.N);
                        return;
                    } else {
                        na7.q1(i2).a0(-l18Var.N, na7.q1(i2).h1(i76Var.c), true, null);
                        return;
                    }
                }
                return;
            default:
                j7b j7bVar = (j7b) this.b;
                pb1 pb1Var = (pb1) this.c;
                File file = (File) obj;
                String str8 = (String) obj2;
                Long l = (Long) obj3;
                t7b t7bVar = j7bVar.S1;
                i7b i7bVar = t7bVar.Y0;
                if (i7bVar != null) {
                    i7bVar.P = false;
                    i7bVar.b();
                    i7b i7bVar2 = t7bVar.Y0;
                    i7bVar2.m(0L);
                    kob kobVar = i7bVar2.G;
                    if (kobVar != null) {
                        kobVar.setProgress(0L);
                    }
                }
                f4b f4bVar = t7bVar.L1;
                if (f4bVar != null) {
                    f4bVar.o0 = file;
                    f4bVar.p0 = str8;
                    f4bVar.q0 = l.longValue();
                    f4b f4bVar2 = t7bVar.L1;
                    f4bVar2.s0 = 0.0f;
                    f4bVar2.t0 = 1.0f;
                    f4bVar2.r0 = 0L;
                    f4bVar2.u0 = 1.0f;
                    t7bVar.s();
                    if (t7bVar.Y0 != null && (x6bVar = t7bVar.w1) != null) {
                        am9 j0 = x6bVar.j0(t7bVar.L1.p0, true);
                        j7bVar.setHasRoundVideo(true);
                        t7bVar.Y0.s(t7bVar.L1, j0, true);
                        gl.r(pb1Var.h);
                        pb1Var.a.destroy(true, null);
                        j0.setDraw(false);
                        pb1Var.post(new tj9(pb1Var, j0, (byte) 3));
                        return;
                    }
                    pb1Var.a(false);
                    return;
                }
                return;
        }
    }
}
