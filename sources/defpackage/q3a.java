package defpackage;

import android.text.style.ClickableSpan;
import android.util.Base64;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
public final class q3a implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public q3a(vqa vqaVar, Runnable runnable, c01 c01Var, TwoStepVerificationActivity twoStepVerificationActivity) {
        this.a = (byte) 15;
        this.d = runnable;
        this.b = c01Var;
        this.c = twoStepVerificationActivity;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q3a.a():void");
    }

    @Override
    public final void run() {
        sca scaVar;
        boolean z;
        int i;
        long B1;
        ArrayList arrayList;
        d dVar;
        String str;
        int i2;
        byte b;
        TLRPC.Document document;
        boolean z2;
        String str2;
        Boolean bool;
        TLRPC.Message message;
        u21 Y;
        m21 K;
        boolean z3;
        boolean z4;
        long j;
        boolean z5;
        boolean z6;
        boolean z7;
        String str3;
        char c;
        int i3;
        boolean z8 = 0;
        switch (this.a) {
            case 0:
                TLObject tLObject = (TLObject) this.c;
                Runnable runnable = (Runnable) this.d;
                boolean z9 = tLObject instanceof TLRPC.TL_messageMediaDocument;
                s3a s3aVar = ((r3a) this.b).b;
                if (z9) {
                    TLRPC.TL_inputStickerSetItem tL_inputStickerSetItem = new TLRPC.TL_inputStickerSetItem();
                    s3aVar.f = tL_inputStickerSetItem;
                    tL_inputStickerSetItem.document = new TLRPC.TL_inputDocument();
                    TLRPC.TL_inputStickerSetItem tL_inputStickerSetItem2 = s3aVar.f;
                    TLRPC.InputDocument inputDocument = tL_inputStickerSetItem2.document;
                    TLRPC.Document document2 = ((TLRPC.TL_messageMediaDocument) tLObject).document;
                    inputDocument.id = document2.id;
                    inputDocument.access_hash = document2.access_hash;
                    inputDocument.file_reference = document2.file_reference;
                    String str4 = s3aVar.b;
                    if (str4 == null) {
                        str4 = "";
                    }
                    tL_inputStickerSetItem2.emoji = str4;
                    s3aVar.d = document2.mime_type;
                } else if (s3aVar.e) {
                    s3aVar.d = "application/x-bad-tgsticker";
                }
                runnable.run();
                return;
            case 1:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) this.d;
                SessionsActivity sessionsActivity = ((c7a) this.b).k0;
                if (tL_error == null) {
                    sessionsActivity.d.remove(tL_authorization);
                    sessionsActivity.e.remove(tL_authorization);
                    sessionsActivity.q0();
                    g7a g7aVar = sessionsActivity.a;
                    if (g7aVar != null) {
                        g7aVar.f();
                    }
                    sessionsActivity.o0(true);
                    return;
                }
                return;
            case 2:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                TLRPC.TL_authorization tL_authorization2 = (TLRPC.TL_authorization) this.d;
                SessionsActivity sessionsActivity2 = ((d7a) this.b).a;
                if (tL_error2 == null) {
                    sessionsActivity2.d.remove(tL_authorization2);
                    sessionsActivity2.e.remove(tL_authorization2);
                    sessionsActivity2.q0();
                    g7a g7aVar2 = sessionsActivity2.a;
                    if (g7aVar2 != null) {
                        g7aVar2.f();
                        return;
                    }
                    return;
                }
                return;
            case 3:
                f7a f7aVar = (f7a) this.b;
                String str5 = (String) this.c;
                u91 u91Var = (u91) this.d;
                try {
                    byte[] decode = Base64.decode(str5.substring(17).replaceAll("\\/", "_").replaceAll("\\+", "-"), 8);
                    TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
                    tL_auth_acceptLoginToken.token = decode;
                    f7aVar.c.getConnectionsManager().sendRequest(tL_auth_acceptLoginToken, new hj7(f7aVar, u91Var, (byte) 23));
                    return;
                } catch (Exception e) {
                    fa4.e("Failed to pass qr code auth", e);
                    gl.c3(new e7a(f7aVar, (byte) 1));
                    u91Var.run();
                    return;
                }
            case 4:
                nfa nfaVar = (nfa) this.b;
                ij.P(nfaVar.getContext(), null, nfaVar.I1, new aca(nfaVar, (TL_stories.StoryItem) this.c));
                ((cs5) this.d).u();
                return;
            case 5:
                nfa nfaVar2 = (nfa) this.b;
                String str6 = (String) this.c;
                d dVar2 = (d) this.d;
                dVar2.showDialog(new tda(nfaVar2.getContext(), str6, str6, nfaVar2.I1, dVar2));
                return;
            case 6:
                bea beaVar = (bea) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                TLObject tLObject2 = (TLObject) this.c;
                nfa nfaVar3 = beaVar.r;
                beaVar.n = 0;
                int b2 = beaVar.b();
                if (tL_error3 == null) {
                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject2;
                    nfaVar3.y1.getMessagesController().V3(messages_chats.chats, false);
                    if (!messages_chats.chats.isEmpty() && messages_chats.chats.size() == 100) {
                        z = false;
                    } else {
                        z = true;
                    }
                    beaVar.h = z;
                    beaVar.d.addAll(messages_chats.chats);
                } else {
                    beaVar.h = true;
                }
                int i4 = 0;
                while (true) {
                    iea[] ieaVarArr = nfaVar3.n0;
                    if (i4 < ieaVarArr.length) {
                        iea ieaVar = ieaVarArr[i4];
                        if (ieaVar.F == 6 && (scaVar = ieaVar.h) != null && (beaVar.f || b2 == 0)) {
                            nfaVar3.i(scaVar, 0, null);
                        }
                        i4++;
                    } else {
                        beaVar.e = false;
                        beaVar.f = true;
                        beaVar.f();
                        return;
                    }
                }
                break;
            case 7:
                gea geaVar = (gea) this.b;
                ArrayList arrayList2 = (ArrayList) this.d;
                d dVar3 = geaVar.s.y1;
                String lowerCase = ((String) this.c).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    gl.c3(new q3a(geaVar, new ArrayList(), new ArrayList(), (byte) 8));
                    return;
                }
                String S0 = k96.D0().S0(lowerCase, true, false);
                S0 = (lowerCase.equals(S0) || S0.length() == 0) ? null : null;
                if (S0 != null) {
                    i = 1;
                } else {
                    i = 0;
                }
                int i5 = i + 1;
                String[] strArr = new String[i5];
                strArr[0] = lowerCase;
                if (S0 != null) {
                    strArr[1] = S0;
                }
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int size = arrayList2.size();
                int i6 = 0;
                while (i6 < size) {
                    TLObject tLObject3 = (TLObject) arrayList2.get(i6);
                    if (tLObject3 instanceof TLRPC.ChatParticipant) {
                        B1 = ((TLRPC.ChatParticipant) tLObject3).user_id;
                    } else {
                        if (tLObject3 instanceof TLRPC.ChannelParticipant) {
                            B1 = k27.B1(((TLRPC.ChannelParticipant) tLObject3).peer);
                        }
                        arrayList = arrayList2;
                        dVar = dVar3;
                        i6++;
                        dVar3 = dVar;
                        z8 = 0;
                        arrayList2 = arrayList;
                    }
                    TLRPC.User V1 = dVar3.getMessagesController().V1(Long.valueOf(B1));
                    if (V1.id != dVar3.getUserConfig().e()) {
                        String lowerCase2 = l7c.r(V1).toLowerCase();
                        String S02 = k96.D0().S0(lowerCase2, true, z8);
                        if (lowerCase2.equals(S02)) {
                            S02 = null;
                        }
                        boolean z10 = z8;
                        for (int i7 = z8; i7 < i5; i7++) {
                            String str7 = strArr[i7];
                            arrayList = arrayList2;
                            if (!lowerCase2.startsWith(str7) && !de9.t(" ", str7, lowerCase2) && (S02 == null || (!S02.startsWith(str7) && !de9.t(" ", str7, S02)))) {
                                String p = l7c.p(V1);
                                if (p != null && p.startsWith(str7)) {
                                    z10 = 2;
                                }
                            } else {
                                z10 = 1;
                            }
                            if (z10 != 0) {
                                dVar = dVar3;
                                if (z10 == 1) {
                                    arrayList3.add(gl.r0(V1.first_name, V1.last_name, str7));
                                } else {
                                    arrayList3.add(gl.r0("@" + l7c.p(V1), null, "@" + str7));
                                }
                                arrayList4.add(tLObject3);
                                i6++;
                                dVar3 = dVar;
                                z8 = 0;
                                arrayList2 = arrayList;
                            } else {
                                arrayList2 = arrayList;
                            }
                        }
                    }
                    arrayList = arrayList2;
                    dVar = dVar3;
                    i6++;
                    dVar3 = dVar;
                    z8 = 0;
                    arrayList2 = arrayList;
                }
                gl.c3(new q3a(geaVar, arrayList3, arrayList4, (byte) 8));
                return;
            case 8:
                gea geaVar2 = (gea) this.b;
                ArrayList arrayList5 = (ArrayList) this.c;
                ArrayList arrayList6 = (ArrayList) this.d;
                nfa nfaVar4 = geaVar2.s;
                if (nfaVar4.Y0) {
                    geaVar2.d = arrayList5;
                    geaVar2.r--;
                    if (!hc2.T(geaVar2.n)) {
                        ArrayList arrayList7 = geaVar2.e.g;
                        arrayList7.clear();
                        arrayList7.addAll(arrayList6);
                    }
                    if (geaVar2.r == 0) {
                        int i8 = 0;
                        while (true) {
                            iea[] ieaVarArr2 = nfaVar4.n0;
                            if (i8 < ieaVarArr2.length) {
                                iea ieaVar2 = ieaVarArr2[i8];
                                if (ieaVar2.F == 7) {
                                    if (geaVar2.h == 0) {
                                        ieaVar2.w.e(false, true);
                                    } else {
                                        nfaVar4.i(ieaVar2.h, 0, null);
                                    }
                                }
                                i8++;
                            }
                        }
                    }
                    geaVar2.f();
                    return;
                }
                return;
            case 9:
                byte b3 = 4;
                kea keaVar = (kea) this.b;
                ArrayList arrayList8 = (ArrayList) this.d;
                keaVar.getClass();
                String lowerCase3 = ((String) this.c).trim().toLowerCase();
                if (lowerCase3.length() == 0) {
                    gl.c3(new t7a(keaVar, new ArrayList(), (byte) 7));
                    return;
                }
                String S03 = k96.D0().S0(lowerCase3, true, false);
                if (!lowerCase3.equals(S03) && S03.length() != 0) {
                    str = S03;
                } else {
                    str = null;
                }
                if (str != null) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                int i9 = i2 + 1;
                String[] strArr2 = new String[i9];
                strArr2[0] = lowerCase3;
                if (str != null) {
                    strArr2[1] = str;
                }
                ArrayList arrayList9 = new ArrayList();
                int i10 = 0;
                while (i10 < arrayList8.size()) {
                    k27 k27Var = (k27) arrayList8.get(i10);
                    int i11 = 0;
                    while (true) {
                        if (i11 < i9) {
                            String str8 = strArr2[i11];
                            String I0 = k27Var.I0();
                            if (I0 != null && I0.length() != 0) {
                                if (I0.toLowerCase().contains(str8)) {
                                    arrayList9.add(k27Var);
                                } else {
                                    b = b3;
                                    if (keaVar.r == b) {
                                        int i12 = k27Var.D;
                                        TLRPC.Message message2 = k27Var.k;
                                        if (i12 == 0) {
                                            document = k27.n1(message2).webpage.document;
                                        } else {
                                            document = k27.n1(message2).document;
                                        }
                                        int i13 = 0;
                                        while (true) {
                                            if (i13 < document.attributes.size()) {
                                                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i13);
                                                if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                                                    String str9 = documentAttribute.performer;
                                                    if (str9 != null) {
                                                        z2 = str9.toLowerCase().contains(str8);
                                                    } else {
                                                        z2 = false;
                                                    }
                                                    if (!z2 && (str2 = documentAttribute.title) != null) {
                                                        z2 = str2.toLowerCase().contains(str8);
                                                    }
                                                } else {
                                                    i13++;
                                                }
                                            } else {
                                                z2 = false;
                                            }
                                        }
                                        if (z2) {
                                            arrayList9.add(k27Var);
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            } else {
                                b = b3;
                            }
                            i11++;
                            b3 = b;
                        }
                    }
                    b = b3;
                    i10++;
                    b3 = b;
                }
                gl.c3(new t7a(keaVar, arrayList9, (byte) 7));
                return;
            case 10:
                wla wlaVar = (wla) this.b;
                m46 m46Var = (m46) this.c;
                ClickableSpan clickableSpan = (ClickableSpan) this.d;
                k46 k46Var = wlaVar.H;
                if (k46Var != null && wlaVar.I == m46Var) {
                    k46Var.a(clickableSpan);
                    wlaVar.I = null;
                    wlaVar.y.e(true);
                    return;
                }
                return;
            case 11:
                vqa vqaVar = (vqa) this.b;
                Long l = (Long) this.c;
                vqaVar.c2(l.longValue(), new f28(vqaVar, l, (xu4[]) this.d, (byte) 7));
                return;
            case 12:
                vqa vqaVar2 = (vqa) this.b;
                k27 k27Var2 = (k27) this.d;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) ((TLObject) this.c);
                na7.q1(vqaVar2.a).b4(messages_messages.users, false);
                na7.q1(vqaVar2.a).V3(messages_messages.chats, false);
                vqaVar2.H2 = true;
                vqaVar2.G2 = false;
                if (vqaVar2.k3 != null && (message = k27Var2.k) != null) {
                    TLRPC.MessageAction messageAction = message.action;
                    if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                        ((TLRPC.TL_messageActionStarGift) messageAction).saved = !bool.booleanValue();
                    } else if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                        ((TLRPC.TL_messageActionStarGiftUnique) messageAction).saved = !bool.booleanValue();
                    }
                }
                vqaVar2.l2(k27Var2, null);
                return;
            case 13:
                vqa vqaVar3 = (vqa) this.b;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.d;
                ((c01) this.c).c(false);
                tL_starGiftUnique.flags &= -17;
                tL_starGiftUnique.resale_ton_only = false;
                tL_starGiftUnique.resell_amount = null;
                vqaVar3.a2.setResellPrice(nj.j(0L, oj.a));
                eq8 eq8Var = vqaVar3.i3;
                if (eq8Var != null) {
                    eq8Var.run();
                }
                vqaVar3.j().Q(2131623990, 36, k96.a0(null, null, 2131750013, vqaVar3.s1())).j();
                return;
            case 14:
                ((c01) this.c).c(false);
                ((vqa) this.b).j().g0((TLRPC.TL_error) this.d, false);
                return;
            case 15:
                ((Runnable) this.d).run();
                ((c01) this.b).c(false);
                vqa.g2((TwoStepVerificationActivity) this.c);
                return;
            case 16:
                Runnable runnable2 = (Runnable) this.d;
                TLRPC.Document document3 = (TLRPC.Document) this.b;
                CharSequence charSequence = (CharSequence) this.c;
                d S = LaunchActivity.S();
                if (S != null) {
                    Y = u21.b0(S);
                } else {
                    Y = u21.Y();
                }
                if (runnable2 == null) {
                    if (document3 != null) {
                        K = Y.q(document3, charSequence);
                    } else {
                        K = Y.Q(2131623990, 36, charSequence);
                    }
                } else if (document3 != null) {
                    K = Y.r(document3, charSequence, k96.M0(2131749872, null), runnable2);
                } else {
                    K = Y.K(2131623990, charSequence, k96.M0(2131749872, null), runnable2);
                }
                K.t = true;
                K.j();
                return;
            case 17:
                ((vqa) this.b).K1((hd) this.c, (k27) this.d);
                return;
            case 18:
                vqa vqaVar4 = (vqa) this.b;
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) this.c;
                String str10 = (String) this.d;
                long j2 = tL_starGiftUnique2.gift_id;
                String str11 = tL_starGiftUnique2.title;
                String s1 = vqaVar4.s1();
                TLRPC.Document document4 = tL_starGiftUnique2.getDocument();
                String str12 = tL_starGiftUnique2.slug;
                hd hdVar = new hd(3, null, a.b);
                hdVar.q(500L);
                TL_stars.getUniqueStarGiftValueInfo getuniquestargiftvalueinfo = new TL_stars.getUniqueStarGiftValueInfo();
                getuniquestargiftvalueinfo.slug = str12;
                ConnectionsManager.getInstance(vqaVar4.a).sendRequest(getuniquestargiftvalueinfo, new p77(vqaVar4, hdVar, document4, str10, str11, s1, j2));
                return;
            case 19:
                TLObject tLObject4 = (TLObject) this.c;
                e eVar = (e) this.b;
                String str13 = (String) this.d;
                if (tLObject4 instanceof TL_stars.TL_payments_uniqueStarGift) {
                    TL_stars.StarGift starGift = ((TL_stars.TL_payments_uniqueStarGift) tLObject4).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        TL_stars.TL_starGiftUnique tL_starGiftUnique3 = (TL_stars.TL_starGiftUnique) starGift;
                        Long valueOf = Long.valueOf(tL_starGiftUnique3.gift_id);
                        String str14 = tL_starGiftUnique3.title;
                        if (str14 != null) {
                            str13 = str14;
                        }
                        eVar.a(valueOf, str13);
                        return;
                    }
                }
                eVar.a(0L, str13);
                return;
            case 20:
                gta gtaVar = (gta) this.b;
                TLObject tLObject5 = (TLObject) this.c;
                Runnable runnable3 = (Runnable) this.d;
                ArrayList arrayList10 = gtaVar.v;
                boolean[] zArr = gtaVar.r;
                boolean[] zArr2 = gtaVar.t;
                ArrayList[] arrayListArr = gtaVar.q;
                int i14 = gtaVar.a;
                boolean z11 = !gtaVar.e;
                gtaVar.c = System.currentTimeMillis();
                if (tLObject5 instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject5;
                    na7.q1(i14).b4(starsStatus.users, false);
                    na7.q1(i14).V3(starsStatus.chats, false);
                    if (arrayListArr[0].isEmpty() && !zArr2[0]) {
                        ArrayList<TL_stars.StarsTransaction> arrayList11 = starsStatus.history;
                        int size2 = arrayList11.size();
                        int i15 = 0;
                        while (i15 < size2) {
                            TL_stars.StarsTransaction starsTransaction = arrayList11.get(i15);
                            i15++;
                            TL_stars.StarsTransaction starsTransaction2 = starsTransaction;
                            arrayListArr[0].add(starsTransaction2);
                            if (starsTransaction2.amount.amount > 0) {
                                c = 1;
                            } else {
                                c = 2;
                            }
                            arrayListArr[c].add(starsTransaction2);
                        }
                        j = 0;
                        for (int i16 = 0; i16 < 3; i16++) {
                            if (arrayListArr[i16].isEmpty() && !zArr[i16]) {
                                z6 = false;
                            } else {
                                z6 = true;
                            }
                            zArr[i16] = z6;
                            boolean[] zArr3 = gtaVar.u;
                            if ((starsStatus.flags & 1) == 0) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            zArr3[i16] = z7;
                            if (z7) {
                                zArr2[i16] = false;
                            }
                            String[] strArr3 = gtaVar.s;
                            if (zArr3[i16]) {
                                str3 = null;
                            } else {
                                str3 = starsStatus.next_offset;
                            }
                            strArr3[i16] = str3;
                        }
                        z4 = true;
                    } else {
                        j = 0;
                        z4 = false;
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList10.addAll(starsStatus.subscriptions);
                        gtaVar.x = false;
                        gtaVar.w = starsStatus.subscriptions_next_offset;
                        if ((starsStatus.flags & 4) == 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        gtaVar.y = z5;
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    long j3 = gtaVar.f.amount;
                    TL_stars.StarsAmount starsAmount = starsStatus.balance;
                    if (j3 != starsAmount.amount) {
                        z11 = true;
                    }
                    gtaVar.f = starsAmount;
                    gtaVar.g = j;
                } else {
                    z3 = false;
                    z4 = false;
                }
                gtaVar.d = false;
                gtaVar.e = true;
                if (z11) {
                    kk7.f(i14).k(223, new Object[0]);
                }
                if (z4) {
                    kk7.f(i14).k(224, new Object[0]);
                }
                if (z3) {
                    kk7.f(i14).k(225, new Object[0]);
                }
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
            case 21:
                gta gtaVar2 = (gta) this.b;
                Runnable runnable4 = (Runnable) this.d;
                Iterator it = ((HashSet) this.c).iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    num.getClass();
                    gtaVar2.Q.remove(num);
                    gtaVar2.R.remove(num);
                }
                runnable4.run();
                return;
            case 22:
                ((boolean[]) this.b)[0] = false;
                gl.t1((EditTextBoldCursor) this.c);
                ((fx0[]) this.d)[0].dismiss();
                return;
            case 23:
                u0b u0bVar = (u0b) this.b;
                String str15 = (String) this.c;
                s3a s3aVar2 = (s3a) this.d;
                if (!u0bVar.J) {
                    u0bVar.T1.remove(str15);
                    if (!"application/x-tgsticker".equals(s3aVar2.d)) {
                        u0bVar.M0(s3aVar2);
                    } else {
                        s3aVar2.c = true;
                        int indexOf = u0bVar.S1.indexOf(s3aVar2);
                        if (indexOf >= 0) {
                            s49 K2 = u0bVar.m1.K(indexOf);
                            if (K2 != null) {
                                ((xya) K2.a).setSticker(s3aVar2);
                            }
                        } else {
                            u0bVar.n1.f();
                        }
                    }
                    if (u0bVar.T1.isEmpty()) {
                        u0bVar.T0();
                        return;
                    }
                    return;
                }
                return;
            case 24:
                u0b u0bVar2 = (u0b) this.b;
                ArrayList arrayList12 = (ArrayList) this.c;
                Boolean bool2 = (Boolean) this.d;
                u0bVar2.S1 = arrayList12;
                if (arrayList12.isEmpty()) {
                    u0bVar2.dismiss();
                    return;
                }
                u0bVar2.n1.f();
                if (bool2.booleanValue()) {
                    u0bVar2.T1 = new HashMap();
                    int size3 = u0bVar2.S1.size();
                    for (int i17 = 0; i17 < size3; i17++) {
                        s3a s3aVar3 = (s3a) u0bVar2.S1.get(i17);
                        u0bVar2.T1.put(s3aVar3.a, s3aVar3);
                        ba4.G(u0bVar2.a).h0(false, 67108864, s3aVar3.a, true);
                    }
                }
                u0bVar2.T0();
                return;
            case 25:
                u0b u0bVar3 = (u0b) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                TLObject tLObject6 = (TLObject) this.c;
                d dVar4 = u0bVar3.F1;
                TLRPC.StickerSet stickerSet = u0bVar3.M1.set;
                if (stickerSet.masks) {
                    i3 = 1;
                } else if (stickerSet.emojis) {
                    i3 = 5;
                } else {
                    i3 = 0;
                }
                try {
                    if (tL_error4 == null) {
                        if (u0bVar3.d2) {
                            m21.g(dVar4, new nza(u0bVar3.v1.getContext(), u0bVar3.M1, 1, 2, null, u0bVar3.J0), 1500).j();
                        }
                        if (tLObject6 instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                            hq6.d0(u0bVar3.a).C1(dVar4, true, i3, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject6);
                        }
                    } else {
                        Toast.makeText(u0bVar3.getContext(), k96.M0(2131751093, null), 0).show();
                    }
                } catch (Exception e2) {
                    fa4.g(e2, true);
                }
                hq6.d0(u0bVar3.a).b1(i3, false, true);
                return;
            case 26:
                u0b u0bVar4 = (u0b) this.b;
                String str16 = (String) this.c;
                TLRPC.TL_stickers_checkShortName tL_stickers_checkShortName = new TLRPC.TL_stickers_checkShortName();
                tL_stickers_checkShortName.short_name = str16;
                u0bVar4.j2 = ConnectionsManager.getInstance(u0bVar4.a).sendRequest(tL_stickers_checkShortName, new ck8(u0bVar4, str16, (TextView) this.d, (byte) 21), 2);
                return;
            case 27:
                a();
                return;
            case 28:
                b1b b1bVar = (b1b) this.b;
                TLRPC.TL_messages_foundStickerSets tL_messages_foundStickerSets = (TLRPC.TL_messages_foundStickerSets) this.d;
                String str17 = ((TLRPC.TL_messages_searchStickerSets) this.c).q;
                c1b c1bVar = b1bVar.a;
                String str18 = c1bVar.S;
                r1c r1cVar = c1bVar.e;
                if (str17.equals(str18)) {
                    b1bVar.a();
                    r1cVar.b.h.getProgressDrawable().e = false;
                    c1bVar.O = 0;
                    r1cVar.b(true);
                    c1bVar.F.addAll(tL_messages_foundStickerSets.sets);
                    c1bVar.f();
                    return;
                }
                return;
            default:
                g2b g2bVar = (g2b) this.b;
                TLObject tLObject7 = (TLObject) this.c;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.d;
                int i18 = g2bVar.a;
                g2bVar.R = true;
                if (tLObject7 instanceof TLRPC.TL_boolTrue) {
                    g2bVar.S = null;
                    kk7.f(i18).k(199, new Object[0]);
                    return;
                } else if (tLObject7 instanceof TL_stories.canSendStoryCount) {
                    g2bVar.S = new wx(1, ((TL_stories.canSendStoryCount) tLObject7).count_remains, -1L);
                    kk7.f(i18).k(199, new Object[0]);
                    return;
                } else {
                    g2bVar.m(tL_error5);
                    return;
                }
        }
    }

    public q3a(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public q3a(Object obj, TLRPC.TL_error tL_error, TLObject tLObject, byte b) {
        this.a = b;
        this.b = obj;
        this.d = tL_error;
        this.c = tLObject;
    }

    public q3a(Runnable runnable, TLRPC.Document document, CharSequence charSequence) {
        this.a = (byte) 16;
        this.d = runnable;
        this.b = document;
        this.c = charSequence;
    }

    public q3a(TLObject tLObject, e eVar, String str) {
        this.a = (byte) 19;
        this.c = tLObject;
        this.b = eVar;
        this.d = str;
    }
}
