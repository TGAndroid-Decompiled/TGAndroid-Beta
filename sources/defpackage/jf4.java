package defpackage;

import android.animation.ValueAnimator;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.c;
public final class jf4 implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public jf4(c cVar, WalletEngine2.ImportedWalletProof importedWalletProof, Exception exc, i8c i8cVar) {
        this.a = (byte) 8;
        this.b = importedWalletProof;
        this.c = exc;
        this.d = i8cVar;
    }

    @Override
    public final void run() {
        int[] iArr;
        File file;
        int i;
        String str;
        boolean z;
        boolean z2;
        boolean z3;
        htc htcVar;
        Pair pair = null;
        byte[] bArr = null;
        r5 = null;
        r5 = null;
        r5 = null;
        int[] iArr2 = null;
        Bitmap decodeFile = null;
        switch (this.a) {
            case 0:
                hd hdVar = (hd) this.c;
                t97 t97Var = (t97) this.d;
                FiltersSetupActivity filtersSetupActivity = ((kf4) this.b).e;
                if (hdVar != null) {
                    try {
                        hdVar.dismiss();
                    } catch (Exception e) {
                        fa4.g(e, true);
                    }
                }
                filtersSetupActivity.getMessagesController().j4(t97Var);
                ad7 messagesStorage = filtersSetupActivity.getMessagesStorage();
                messagesStorage.a.c(new t67(messagesStorage, t97Var, (byte) 21));
                return;
            case 1:
                ll4 ll4Var = (ll4) this.b;
                ll4Var.u2 = -1;
                m21 I = u21.b0((d) this.c).I(2131624052, k96.a0(null, null, 2131750646, ll4Var.X1), k96.G(((ArrayList) this.d).size(), "FolderLinkDeletedSubtitle", new Object[0]));
                I.j = 5000;
                I.j();
                ll4Var.v2 = true;
                ll4Var.dismiss();
                ll4Var.r1.getMessagesController().g2(ll4Var.T1);
                return;
            case 2:
                ll4 ll4Var2 = (ll4) this.b;
                ll4Var2.u2 = ll4Var2.r1.getConnectionsManager().sendRequest((TLObject) this.c, new rv3(ll4Var2, (Pair) this.d, (byte) 5));
                return;
            case 3:
                or4 or4Var = (or4) this.b;
                Object obj = this.c;
                String str2 = (String) this.d;
                float f = or4Var.L;
                if (obj != null) {
                    int min = (int) Math.min(gl.q.x / 3.0f, gl.L(330.0f));
                    if (obj instanceof jm6) {
                        jm6 jm6Var = (jm6) obj;
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        or4Var.c(jm6Var, options);
                        f4b.B(options, min);
                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                        options.inDither = true;
                        options.inJustDecodeBounds = false;
                        Bitmap c = or4Var.c(jm6Var, options);
                        if (c != null && c.getHeight() / c.getWidth() < f) {
                            if (jm6Var.T == 0 && jm6Var.U == 0 && !c.isRecycled()) {
                                iArr2 = kee.b(c, true);
                                jm6Var.T = iArr2[0];
                                jm6Var.U = iArr2[1];
                            } else {
                                int i2 = jm6Var.T;
                                if (i2 != 0 && (i = jm6Var.U) != 0) {
                                    iArr2 = new int[]{i2, i};
                                }
                            }
                        }
                        iArr = iArr2;
                        decodeFile = c;
                    } else if ((obj instanceof f4b) && (file = ((f4b) obj).O0) != null) {
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        options2.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(file.getPath(), options2);
                        f4b.B(options2, min);
                        options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                        options2.inDither = true;
                        options2.inJustDecodeBounds = false;
                        decodeFile = BitmapFactory.decodeFile(file.getPath(), options2);
                        iArr = null;
                    } else {
                        iArr = null;
                    }
                    pair = new Pair(decodeFile, iArr);
                }
                gl.d3(new jf4(or4Var, str2, pair, (byte) 4));
                return;
            case 4:
                or4 or4Var2 = (or4) this.b;
                String str3 = (String) this.c;
                Pair pair2 = (Pair) this.d;
                Bitmap bitmap = (Bitmap) pair2.first;
                int[] iArr3 = (int[]) pair2.second;
                if (bitmap != null) {
                    if (str3 != null) {
                        or4.g0.put(str3, bitmap);
                        HashMap hashMap = or4.f0;
                        Integer num = (Integer) hashMap.get(str3);
                        if (num != null) {
                            hashMap.put(str3, Integer.valueOf(num.intValue() + 1));
                        } else {
                            hashMap.put(str3, 1);
                        }
                    }
                    if (!TextUtils.equals(str3, or4Var2.S)) {
                        or4.d(str3);
                        return;
                    }
                    or4Var2.a = bitmap;
                    ?? r0 = or4Var2.d;
                    if (iArr3 == null) {
                        r0.setShader(null);
                        or4Var2.e = null;
                    } else {
                        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, iArr3, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                        or4Var2.e = linearGradient;
                        r0.setShader(linearGradient);
                    }
                    or4Var2.h();
                    or4Var2.invalidate();
                    return;
                }
                return;
            case 5:
                rr4 rr4Var = (rr4) this.b;
                TLObject tLObject = (TLObject) this.c;
                na7 na7Var = (na7) this.d;
                rr4Var.r = true;
                rr4Var.d = false;
                if (tLObject instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                    na7Var.a4(tL_contacts_resolvedPeer.users, false);
                    na7Var.U3(tL_contacts_resolvedPeer.chats, false);
                    ad7.Y(rr4Var.x.a).j1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                    rr4Var.E();
                    return;
                }
                return;
            case 6:
                xu4 xu4Var = (xu4) this.b;
                TLObject tLObject2 = (TLObject) this.d;
                if (TextUtils.equals(xu4Var.k2, (String) this.c)) {
                    xu4Var.l2 = -1;
                    xu4Var.f2.clear();
                    xu4Var.g2.clear();
                    if (tLObject2 instanceof TLRPC.TL_contacts_found) {
                        TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject2;
                        na7 q1 = na7.q1(xu4Var.a);
                        q1.a4(tL_contacts_found.users, false);
                        q1.U3(tL_contacts_found.chats, false);
                        HashSet hashSet = new HashSet();
                        xu4Var.Y0(tL_contacts_found.my_results, hashSet);
                        xu4Var.Y0(tL_contacts_found.results, hashSet);
                    }
                    xu4Var.i2.O(true);
                    return;
                }
                return;
            case 7:
                c cVar = (c) this.b;
                r05 r05Var = (r05) this.d;
                if (cVar.Q.get((String) this.c) == r05Var) {
                    r05Var.e = true;
                    ArrayList arrayList = r05Var.f;
                    cVar.v0(r05Var);
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj2 = arrayList.get(i3);
                        i3++;
                        ((p8c) obj2).a(r05Var);
                    }
                    arrayList.clear();
                    cVar.S();
                    return;
                }
                return;
            case 8:
                WalletEngine2.ImportedWalletProof importedWalletProof = (WalletEngine2.ImportedWalletProof) this.b;
                Exception exc = (Exception) this.c;
                i8c i8cVar = (i8c) this.d;
                if (importedWalletProof == null) {
                    StringBuilder sb = new StringBuilder("failed to prove: ");
                    String str4 = "PROOF_ERROR";
                    if (exc == null || exc.getMessage() == null) {
                        str = "PROOF_ERROR";
                    } else {
                        str = exc.getMessage();
                    }
                    sb.append(str);
                    c.n(sb.toString(), exc);
                    if (exc != null && exc.getMessage() != null) {
                        str4 = exc.getMessage();
                    }
                    i8cVar.a(null, str4);
                    return;
                }
                c.O("proof done");
                i8cVar.a(importedWalletProof, null);
                return;
            case 9:
                ((r25) this.b).f = false;
                ((hj3) this.c).a((String) this.d);
                return;
            case 10:
                ((ae2) this.b).a((TL_wallet.inputTonConnectOauthSession) this.c, (String) this.d);
                return;
            case 11:
                s25 s25Var = (s25) this.c;
                u41 u41Var = (u41) this.d;
                if (!((zh3) this.b).canScrollVertically(1)) {
                    s25Var.p = true;
                }
                if (s25Var.p && !s25Var.m && !s25Var.n) {
                    z = true;
                } else {
                    z = false;
                }
                u41Var.setEnabled(z);
                return;
            case 12:
                w25 w25Var = (w25) this.b;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.c;
                w25Var.getClass();
                w52 w52Var = new w52((p8c) this.d, (byte) 2);
                if (tonconnectsession != null && tonconnectsession.dapp_client_id != null && tonconnectsession.client_id != null && tonconnectsession.nonce != null) {
                    if (!w25Var.c.add(Long.valueOf(tonconnectsession.id))) {
                        w52Var.a("A TON Connect operation is already in progress");
                        return;
                    }
                    ht htVar = new ht(w25Var, tonconnectsession, w52Var, (byte) 22);
                    if (tonconnectsession.closed) {
                        htVar.a(null);
                        return;
                    } else {
                        w25Var.b.x0(new jf4(w25Var, htVar, tonconnectsession, (byte) 13));
                        return;
                    }
                }
                w52Var.a("Missing TON Connect session data");
                return;
            case 13:
                w25 w25Var2 = (w25) this.b;
                ht htVar2 = (ht) this.c;
                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) this.d;
                c cVar2 = w25Var2.b;
                String x = cVar2.x();
                byte[] D = cVar2.D();
                if (D != null) {
                    bArr = (byte[]) D.clone();
                }
                byte[] bArr2 = bArr;
                if (x != null && bArr2 != null) {
                    cVar2.E(true, false, false, new jl1(w25Var2, htVar2, tonconnectsession2, x, bArr2, (byte) 5));
                    return;
                } else {
                    htVar2.a("Wallet is not ready");
                    return;
                }
            case 14:
                w25 w25Var3 = (w25) this.b;
                r25 r25Var = (r25) this.c;
                w25Var3.getClass();
                hj3 hj3Var = new hj3((f25) this.d, (byte) 14);
                TL_wallet.tonConnectSession tonconnectsession3 = r25Var.e;
                if (!tonconnectsession3.closed && !tonconnectsession3.closing && tonconnectsession3.manifest_error == null && tonconnectsession3.manifest != null) {
                    if (r25Var.f) {
                        hj3Var.a("A TON Connect operation is already in progress");
                        return;
                    }
                    r25Var.f = true;
                    w25Var3.b.x0(new hn1(w25Var3, r25Var, hj3Var, tonconnectsession3, (byte) 27));
                    return;
                }
                hj3Var.a("The dApp manifest is unavailable or the session is closed");
                return;
            case 15:
                boolean[] zArr = (boolean[]) this.c;
                h35 h35Var = (h35) this.d;
                k35.a.remove((qt) this.b);
                if (!zArr[0]) {
                    zArr[0] = true;
                    u21.c0(k96.M0(2131742696, null));
                    h35Var.a();
                    return;
                }
                return;
            case 16:
                j35 j35Var = (j35) this.b;
                u41 u41Var2 = (u41) this.c;
                u41 u41Var3 = (u41) this.d;
                boolean a = j35Var.a();
                if (!a && !j35Var.d) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                u41Var2.setEnabled(z2);
                if (!a && !j35Var.d) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                u41Var3.setEnabled(z3);
                return;
            case 17:
                o35 o35Var = (o35) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                if (tL_error != null) {
                    o35Var.a.b(false);
                    u21.e0(tL_error);
                    return;
                } else if (tLObject3 instanceof TLRPC.TL_boolFalse) {
                    o35Var.a.b(false);
                    yjb.x(null, 2131743640, u21.b0(o35Var), null);
                    return;
                } else {
                    o35Var.finishFragment();
                    return;
                }
            case 18:
                l95 l95Var = (l95) this.b;
                h85 h85Var = (h85) this.c;
                h85 h85Var2 = (h85) this.d;
                ValueAnimator valueAnimator = l95Var.O0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                h85Var.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f).setListener(new j95(l95Var, h85Var, (byte) 3)).setDuration(100L).start();
                if (h85Var2 != null) {
                    h85Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).setListener(new f85(h85Var2, (byte) 3)).start();
                    return;
                }
                return;
            case 19:
                oa5 oa5Var = (oa5) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                ArrayList arrayList3 = (ArrayList) this.d;
                qa5 qa5Var = oa5Var.J;
                zr9 zr9Var = oa5Var.f;
                if (oa5Var.n) {
                    oa5Var.h = null;
                    oa5Var.d = arrayList2;
                    oa5Var.e = arrayList3;
                    zr9Var.f(arrayList2, null);
                    qa5Var.t0(oa5Var.I);
                    oa5Var.f();
                    if (oa5Var.n && !zr9Var.e() && oa5Var.b() == 0) {
                        qa5Var.s.e(false, true);
                        return;
                    }
                    return;
                }
                return;
            case 20:
                cm0 cm0Var = (cm0) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                String str5 = (String) this.d;
                ArrayList arrayList5 = new ArrayList();
                for (int i4 = 0; i4 < arrayList4.size(); i4++) {
                    e01 e01Var = (e01) arrayList4.get(i4);
                    if (cm0.n(e01Var.c, str5) || ((htcVar = e01Var.d) != null && (cm0.n(htcVar.c, str5) || cm0.n(e01Var.d.d, str5)))) {
                        arrayList5.add(e01Var);
                    }
                }
                gl.d3(new hb5(cm0Var, arrayList5, (byte) 2));
                return;
            case 21:
                String str6 = (String) this.c;
                l94 l94Var = (l94) this.d;
                fl5 fl5Var = ((pk5) this.b).b;
                HashMap hashMap2 = fl5Var.h;
                ?? r4 = fl5Var.i;
                tk5 tk5Var = (tk5) hashMap2.remove(str6);
                if (tk5Var != null) {
                    ArrayList arrayList6 = tk5Var.v;
                    fl5Var.g.remove(str6);
                    ArrayList arrayList7 = new ArrayList();
                    for (int i5 = 0; i5 < arrayList6.size(); i5++) {
                        String str7 = (String) tk5Var.x.get(i5);
                        String str8 = (String) tk5Var.y.get(i5);
                        int intValue = ((Integer) tk5Var.z.get(i5)).intValue();
                        ImageReceiver imageReceiver = (ImageReceiver) arrayList6.get(i5);
                        int intValue2 = ((Integer) tk5Var.w.get(i5)).intValue();
                        tk5 tk5Var2 = (tk5) r4.get(str7);
                        if (tk5Var2 == null) {
                            tk5Var2 = new tk5(fl5Var);
                            tk5Var2.a = tk5Var.a;
                            tk5Var2.h = tk5Var.h;
                            tk5Var2.o = tk5Var.o;
                            tk5Var2.p = l94Var.e();
                            tk5Var2.j = tk5Var.j;
                            tk5Var2.c = tk5Var.c;
                            tk5Var2.d = str7;
                            tk5Var2.i = tk5Var.i;
                            tk5Var2.m = intValue;
                            tk5Var2.g = tk5Var.g;
                            tk5Var2.r = tk5Var.r;
                            tk5Var2.u = new uk5(fl5Var, tk5Var2);
                            tk5Var2.f = str8;
                            tk5Var2.l = tk5Var.l;
                            tk5Var2.n = tk5Var.n;
                            r4.put(str7, tk5Var2);
                            fl5Var.j.add(fl5.j(str7));
                            arrayList7.add(tk5Var2.u);
                        }
                        tk5Var2.a(imageReceiver, str7, str8, intValue, intValue2);
                    }
                    for (int i6 = 0; i6 < arrayList7.size(); i6++) {
                        uk5 uk5Var = (uk5) arrayList7.get(i6);
                        tk5 tk5Var3 = uk5Var.c;
                        if (tk5Var3.m == 1) {
                            fl5Var.q.c(uk5Var);
                        } else {
                            yv2 yv2Var = fl5Var.p;
                            boolean z4 = tk5Var3.a;
                            if (!z4) {
                                yv2Var.getClass();
                                uk5Var = new go3(z4 ? 1 : 0, uk5Var);
                            }
                            ((fo3) yv2Var.b).execute(uk5Var);
                        }
                    }
                    return;
                }
                return;
            case 22:
                ((uk5) this.b).c.c((Drawable) this.c, (String) this.d);
                return;
            case 23:
                wp5 wp5Var = (wp5) this.b;
                TLRPC.TL_langPackString tL_langPackString = (TLRPC.TL_langPackString) this.c;
                String str9 = (String) this.d;
                if (!wp5Var.N) {
                    wp5Var.f.setText(tL_langPackString.value);
                    na7.c1().edit().putString("language_showed2", str9.toLowerCase()).apply();
                    return;
                }
                return;
            case 24:
                dq5 dq5Var = (dq5) this.b;
                ArrayList arrayList8 = (ArrayList) this.c;
                ArrayList arrayList9 = (ArrayList) this.d;
                if (dq5Var.h) {
                    dq5Var.d = arrayList8;
                    dq5Var.e = arrayList9;
                    dq5Var.f();
                    dq5Var.n.r.e(false, true);
                    return;
                }
                return;
            case 25:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", ((TLRPC.User) this.c).id);
                ((d) this.d).presentFragment(new ProfileActivity(bundle, null));
                ((zq5) this.b).f2 = true;
                return;
            case 26:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                uq5 uq5Var = ((tq5) this.b).a;
                if (tL_error2 == null) {
                    boolean z5 = tLObject4 instanceof TLRPC.TL_messages_exportedChatInviteReplaced;
                    zq5 zq5Var = uq5Var.c;
                    if (z5) {
                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject4;
                        TLRPC.ChatFull chatFull = zq5Var.n1;
                        if (chatFull != null) {
                            chatFull.exported_invite = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                        }
                        if (zq5Var.d2 != null) {
                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull.exported_invite;
                            return;
                        }
                        return;
                    }
                    TLRPC.ChatFull chatFull2 = zq5Var.n1;
                    if (chatFull2 != null) {
                        int i7 = chatFull2.invitesCount - 1;
                        chatFull2.invitesCount = i7;
                        if (i7 < 0) {
                            chatFull2.invitesCount = 0;
                        }
                        ad7.Y(zq5Var.a).t1(zq5Var.n1.invitesCount, zq5Var.a2);
                    }
                    cf1 cf1Var = zq5Var.d2;
                    if (cf1Var != null) {
                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = zq5Var.l1;
                        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                        nf1 nf1Var = cf1Var.a;
                        ArrayList arrayList10 = nf1Var.p0;
                        int size2 = arrayList10.size();
                        tL_chatInviteExported2.revoked = true;
                        TLRPC.TL_channelAdminLogEventActionExportedInviteRevoke tL_channelAdminLogEventActionExportedInviteRevoke = new TLRPC.TL_channelAdminLogEventActionExportedInviteRevoke();
                        tL_channelAdminLogEventActionExportedInviteRevoke.invite = tL_chatInviteExported2;
                        tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteRevoke;
                        tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                        tL_channelAdminLogEvent.user_id = y6c.h(nf1Var.getAccountInstance().a).n;
                        if (new k27(nf1.E0(nf1Var), tL_channelAdminLogEvent, nf1Var.o0, nf1Var.n0, nf1Var.f, nf1Var.U, true).U >= 0) {
                            nf1Var.N0();
                            int size3 = arrayList10.size() - size2;
                            if (size3 > 0) {
                                nf1Var.D0.N = true;
                                kf1 kf1Var = nf1Var.F;
                                kf1Var.p(kf1Var.h, size3);
                                nf1Var.X0();
                            }
                            nf1Var.z0.remove(tL_chatInviteExported2.link);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 27:
                jr5 jr5Var = (jr5) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                TLObject tLObject5 = (TLObject) this.d;
                if (tL_error3 == null) {
                    jr5Var.t2 = (TLRPC.TL_chatInviteExported) tLObject5;
                    TLRPC.ChatFull L0 = na7.q1(jr5Var.a).L0(jr5Var.p2);
                    if (L0 != null) {
                        L0.exported_invite = jr5Var.t2;
                    }
                    if (jr5Var.t2.link != null) {
                        ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", jr5Var.t2.link));
                        u21.j(jr5Var.k2).j();
                        jr5Var.dismiss();
                    } else {
                        return;
                    }
                }
                jr5Var.s2 = false;
                return;
            case 28:
                fr5 fr5Var = (fr5) this.b;
                ArrayList arrayList11 = (ArrayList) this.c;
                fr5Var.h = null;
                fr5Var.c = arrayList11;
                fr5Var.d = (ArrayList) this.d;
                zr9 zr9Var2 = fr5Var.e;
                zr9Var2.f(arrayList11, null);
                jr5 jr5Var2 = fr5Var.n;
                jr5Var2.J0(fr5Var.f - 1);
                fr5Var.f();
                if (!zr9Var2.e() && fr5Var.b() <= 2) {
                    jr5Var2.t1.e(false, true);
                    return;
                }
                return;
            default:
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.b;
                mu1 mu1Var = (mu1) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                String str10 = LaunchActivity.C1;
                if (tL_error4 != null) {
                    u21.b0(mu1Var).g0(tL_error4, false);
                    return;
                } else if (user != null && !l7c.C(user)) {
                    b00.u(k96.a0(null, null, 2131747992, l7c.k(user, true)), u21.b0(mu1Var), 2131623990, 36);
                    return;
                } else {
                    return;
                }
        }
    }

    public jf4(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
