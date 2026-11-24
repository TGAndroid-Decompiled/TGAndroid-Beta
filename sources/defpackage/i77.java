package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.o;
public final class i77 implements Runnable {
    public final byte a;
    public final int b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public i77(int i, Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    private final void a() {
        boolean z;
        boolean z2;
        LaunchActivity launchActivity = (LaunchActivity) this.c;
        TLObject tLObject = (TLObject) this.d;
        Uri uri = (Uri) this.e;
        int i = this.b;
        he heVar = (he) this.f;
        String str = LaunchActivity.C1;
        if (!launchActivity.isFinishing()) {
            if (tLObject != null && launchActivity.p0 != null) {
                TLRPC.TL_messages_historyImportParsed tL_messages_historyImportParsed = (TLRPC.TL_messages_historyImportParsed) tLObject;
                Bundle l = ts2.l("onlySelect", true);
                l.putString("importTitle", tL_messages_historyImportParsed.title);
                l.putBoolean("allowSwitchAccount", true);
                if (tL_messages_historyImportParsed.pm) {
                    l.putInt("dialogsType", 12);
                } else if (tL_messages_historyImportParsed.group) {
                    l.putInt("dialogsType", 11);
                } else {
                    String uri2 = uri.toString();
                    Iterator it = oc7.r1(i).l4.F3.f.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (uri2.contains((String) it.next())) {
                                l.putInt("dialogsType", 12);
                                z = true;
                                break;
                            }
                        } else {
                            z = false;
                            break;
                        }
                    }
                    if (!z) {
                        Iterator it2 = oc7.r1(i).l4.E3.f.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            } else if (uri2.contains((String) it2.next())) {
                                l.putInt("dialogsType", 11);
                                z = true;
                                break;
                            }
                        }
                        if (!z) {
                            l.putInt("dialogsType", 13);
                        }
                    }
                }
                if (SecretMediaViewer.e() && SecretMediaViewer.d().s) {
                    SecretMediaViewer.d().c(false, false);
                } else if (PhotoViewer.C0() && PhotoViewer.r0().V0()) {
                    PhotoViewer.r0().A(false, true);
                } else if (o.F() && o.u().W) {
                    o.u().l(false, true);
                }
                v9b.v();
                g95 g95Var = g95.s5;
                if (g95Var != null) {
                    g95Var.dismiss();
                }
                pp9 pp9Var = pp9.Q0;
                if (pp9Var != null) {
                    pp9Var.dismiss();
                }
                if (gm.O1()) {
                    launchActivity.p0.W(true, true);
                    launchActivity.r0.W(true, true);
                }
                nk3 nk3Var = new nk3(l);
                nk3Var.E2 = launchActivity;
                if (!gm.O1() ? !(launchActivity.p0.getFragmentStack().size() <= 1 || !(launchActivity.p0.getFragmentStack().get(launchActivity.p0.getFragmentStack().size() - 1) instanceof bj6)) : !(launchActivity.q0.getFragmentStack().isEmpty() || !(launchActivity.q0.getFragmentStack().get(launchActivity.q0.getFragmentStack().size() - 1) instanceof bj6))) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                ((ActionBarLayout) launchActivity.N()).U(nk3Var, z2, false);
            } else {
                ArrayList arrayList = launchActivity.X;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    launchActivity.X = arrayList;
                }
                arrayList.add(0, launchActivity.Y);
                launchActivity.Y = null;
                launchActivity.j0(true);
            }
            try {
                heVar.dismiss();
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
    }

    private final void b() {
        LaunchActivity launchActivity = (LaunchActivity) this.c;
        k16 k16Var = (k16) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
        TLRPC.Updates updates = (TLRPC.Updates) this.f;
        String str = LaunchActivity.C1;
        ArrayList arrayList = launchActivity.e0;
        if (!launchActivity.isFinishing()) {
            try {
                k16Var.run();
            } catch (Exception e) {
                fc4.g(e, true);
            }
            if (tL_error == null) {
                if (launchActivity.p0 != null && updates != null && !updates.chats.isEmpty()) {
                    TLRPC.Chat chat = updates.chats.get(0);
                    chat.left = false;
                    chat.kicked = false;
                    int i = this.b;
                    oc7.r1(i).d4(updates.users, false);
                    oc7.r1(i).X3(updates.chats, false);
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", chat.id);
                    if (arrayList.isEmpty() || oc7.r1(i).A(bundle, (d) b10.f(1, arrayList), null, null)) {
                        yv1 yv1Var = new yv1(bundle);
                        nm7.f(i).k(nm7.s, new Object[0]);
                        ((ActionBarLayout) launchActivity.N()).U(yv1Var, false, true);
                        return;
                    }
                    return;
                }
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
            String M0 = jb6.M0(2131689472, null);
            he heVar = alertDialog$Builder.a;
            heVar.S = M0;
            if (tL_error.text.startsWith("FLOOD_WAIT")) {
                heVar.U = jb6.M0(2131750619, null);
            } else if (tL_error.text.equals("USERS_TOO_MUCH")) {
                heVar.U = jb6.M0(2131748833, null);
            } else {
                heVar.U = jb6.M0(2131748832, null);
            }
            alertDialog$Builder.j(jb6.M0(2131747564, null), null);
            launchActivity.F0(alertDialog$Builder);
        }
    }

    private final void c() {
        c41 b0;
        ArrayList<TLRPC.User> arrayList;
        ArrayList<TLRPC.Chat> arrayList2;
        TLObject tLObject = (TLObject) this.d;
        String str = (String) this.e;
        k16 k16Var = (k16) this.f;
        String str2 = LaunchActivity.C1;
        d dVar = (d) b10.f(1, ((LaunchActivity) this.c).e0);
        try {
            if (tLObject instanceof TL_chatlists.chatlist_ChatlistInvite) {
                TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = (TL_chatlists.chatlist_ChatlistInvite) tLObject;
                boolean z = chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite;
                if (z) {
                    TL_chatlists.TL_chatlists_chatlistInvite tL_chatlists_chatlistInvite = (TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite;
                    arrayList2 = tL_chatlists_chatlistInvite.chats;
                    arrayList = tL_chatlists_chatlistInvite.users;
                } else if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) {
                    TL_chatlists.TL_chatlists_chatlistInviteAlready tL_chatlists_chatlistInviteAlready = (TL_chatlists.TL_chatlists_chatlistInviteAlready) chatlist_chatlistinvite;
                    arrayList2 = tL_chatlists_chatlistInviteAlready.chats;
                    arrayList = tL_chatlists_chatlistInviteAlready.users;
                } else {
                    arrayList = null;
                    arrayList2 = null;
                }
                int i = this.b;
                int i2 = 0;
                oc7.r1(i).X3(arrayList2, false);
                oc7.r1(i).d4(arrayList, false);
                if (z && ((TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite).peers.isEmpty()) {
                    b0 = c41.b0(dVar);
                } else {
                    ?? mz0Var = new mz0(dVar, false);
                    mz0Var.T1 = -1;
                    mz0Var.X1 = "";
                    mz0Var.Y1 = new ArrayList();
                    mz0Var.a2 = "";
                    mz0Var.c2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    mz0Var.d2 = arrayList3;
                    mz0Var.u2 = -1;
                    mz0Var.x2 = -5;
                    mz0Var.S1 = str;
                    mz0Var.U1 = chatlist_chatlistinvite;
                    arrayList3.clear();
                    if (z) {
                        TL_chatlists.TL_chatlists_chatlistInvite tL_chatlists_chatlistInvite2 = (TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite;
                        TLRPC.TL_textWithEntities tL_textWithEntities = tL_chatlists_chatlistInvite2.title;
                        mz0Var.X1 = tL_textWithEntities.text;
                        mz0Var.Y1 = tL_textWithEntities.entities;
                        mz0Var.Z1 = tL_chatlists_chatlistInvite2.title_noanimate;
                        mz0Var.b2 = tL_chatlists_chatlistInvite2.peers;
                    } else if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) {
                        TL_chatlists.TL_chatlists_chatlistInviteAlready tL_chatlists_chatlistInviteAlready2 = (TL_chatlists.TL_chatlists_chatlistInviteAlready) chatlist_chatlistinvite;
                        mz0Var.b2 = tL_chatlists_chatlistInviteAlready2.missing_peers;
                        mz0Var.e2 = tL_chatlists_chatlistInviteAlready2.already_peers;
                        mz0Var.T1 = tL_chatlists_chatlistInviteAlready2.filter_id;
                        ArrayList arrayList4 = dVar.getMessagesController().G0;
                        if (arrayList4 != null) {
                            while (true) {
                                if (i2 >= arrayList4.size()) {
                                    break;
                                }
                                ub7 ub7Var = (ub7) arrayList4.get(i2);
                                if (ub7Var.a == mz0Var.T1) {
                                    mz0Var.X1 = ub7Var.b;
                                    mz0Var.Y1 = ub7Var.c;
                                    mz0Var.Z1 = ub7Var.n;
                                    break;
                                }
                                i2++;
                            }
                        }
                    }
                    mz0Var.a1();
                    dVar.showDialog(mz0Var);
                    k16Var.run();
                    return;
                }
            } else {
                b0 = c41.b0(dVar);
            }
            k16Var.run();
            return;
        } catch (Exception e) {
            fc4.g(e, true);
            return;
        }
        mlb.y(null, 2131747943, b0, null);
    }

    private final void d() {
        ((a66) this.c).v((String) this.d, this.b + 1, (String) this.e, (String) this.f);
    }

    private final void e() {
        wg6 wg6Var = (wg6) this.c;
        String str = (String) this.d;
        String str2 = (String) this.e;
        String str3 = (String) this.f;
        ArrayList arrayList = new ArrayList();
        ?? obj = new Object();
        obj.b = "inapp";
        obj.a = str;
        arrayList.add(obj.a());
        fc4.b("LoginBilling querying \"" + str + "\" product");
        cj0.h().o(arrayList, new gh(wg6Var, str, str2, str3, this.b));
    }

    private final void f() {
        Pair pair = (Pair) this.d;
        ((b07) this.c).b.i.O(((Integer) pair.first).intValue(), (rz6) pair.second, (ea6) this.e, (ft6) this.f, this.b);
    }

    private final void g() {
        ((View) this.d).removeOnAttachStateChangeListener((gm7) this.e);
        ((nm7) this.c).n((fm7) this.f, this.b);
    }

    private final void h() {
        ut9 ut9Var = (ut9) this.c;
        ArrayList arrayList = (ArrayList) this.d;
        ArrayList arrayList2 = (ArrayList) this.e;
        ArrayList arrayList3 = (ArrayList) this.f;
        if (this.b == ut9Var.F) {
            ut9Var.d = arrayList;
            ut9Var.e = arrayList2;
            ut9Var.I = arrayList3;
            ut9Var.f.f(arrayList, null);
            ut9Var.E = false;
            ut9Var.f();
            ut9Var.F();
        }
    }

    private final void i() {
        boolean[] zArr = (boolean[]) this.d;
        qac qacVar = (qac) this.e;
        TL_account.updateEmojiStatus updateemojistatus = (TL_account.updateEmojiStatus) this.f;
        if (!(((TLObject) this.c) instanceof TLRPC.TL_boolTrue)) {
            if (!zArr[0]) {
                zArr[0] = true;
                qacVar.a("SERVER_ERROR");
                return;
            }
            return;
        }
        int i = this.b;
        TLRPC.User f = z8c.h(i).f();
        if (f != null) {
            f.emoji_status = updateemojistatus.emoji_status;
            nm7.f(i).k(nm7.q5, f);
            oc7.r1(i).r5(f.id, f.emoji_status);
        }
        if (!zArr[0]) {
            zArr[0] = true;
            qacVar.a(null);
        }
    }

    private final void j() {
        int i;
        int i2;
        sla slaVar = (sla) this.c;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
        k47 k47Var = (k47) this.e;
        rc2 rc2Var = (rc2) this.f;
        int[] iArr = slaVar.e;
        RLottieNative[] rLottieNativeArr = slaVar.g1;
        if (slaVar.X0) {
            gm.c3(new qla(slaVar, (byte) 2));
            return;
        }
        boolean z = false;
        int i3 = 0;
        while (true) {
            int length = rLottieNativeArr.length;
            i = this.b;
            if (i3 >= length) {
                break;
            }
            if (rLottieNativeArr[i3] == null) {
                if (i3 == 0) {
                    i2 = 1;
                } else if (i3 == 1) {
                    i2 = 8;
                } else if (i3 == 2) {
                    i2 = 14;
                } else if (i3 == 3) {
                    i2 = 20;
                } else {
                    i2 = 2;
                }
                if (i2 < tL_messages_stickerSet.documents.size()) {
                    TLRPC.Document document = tL_messages_stickerSet.documents.get(i2);
                    bc4.G(z8c.t0);
                    String v2 = gm.v2(bc4.J(document, null, true, true), 0);
                    if (TextUtils.isEmpty(v2)) {
                        gm.c3(new rla(document, i, k47Var, rc2Var, tL_messages_stickerSet, (byte) 1));
                        z = true;
                    } else {
                        rLottieNativeArr[i3] = RLottieNative.b(v2, iArr, null, null);
                        slaVar.h1[i3] = iArr[0];
                    }
                }
            }
            i3++;
        }
        if (z) {
            gm.c3(new qla(slaVar, (byte) 3));
        } else {
            gm.c3(new v99(slaVar, i, rc2Var, (byte) 10));
        }
    }

    private final void k() {
        TLObject tLObject = (TLObject) this.e;
        String str = (String) this.f;
        ((b61) this.c).setLoading(false);
        my0 my0Var = ((my0[]) this.d)[0];
        if (my0Var != null) {
            my0Var.dismiss();
        }
        jva.v(this.b, false).O();
        d S = LaunchActivity.S();
        if (S != null) {
            c41.b0(S).V(Collections.singletonList(tLObject), jb6.M0(2131744668, null), gm.S2(jb6.a0(null, null, 2131744667, str)), null).k(false);
        }
    }

    private final void l() {
        int i;
        int i2;
        n1b n1bVar = (n1b) this.c;
        int i3 = this.b;
        List list = (List) this.d;
        ArrayList arrayList = (ArrayList) this.e;
        t88 t88Var = (t88) this.f;
        if (n1bVar.J != null && !n1bVar.E) {
            Matrix matrix = new Matrix();
            matrix.postScale(1.0f / n1bVar.J.getWidth(), 1.0f / n1bVar.J.getHeight());
            matrix.postTranslate(-0.5f, -0.5f);
            matrix.postRotate(i3);
            matrix.postTranslate(0.5f, 0.5f);
            int i4 = (i3 / 90) % 2;
            Bitmap bitmap = n1bVar.J;
            if (i4 != 0) {
                matrix.postScale(bitmap.getHeight(), n1bVar.J.getWidth());
            } else {
                matrix.postScale(bitmap.getWidth(), n1bVar.J.getHeight());
            }
            if (list.isEmpty()) {
                k1b k1bVar = new k1b(n1bVar);
                k1bVar.h.set(0.0f, 0.0f, n1bVar.J.getWidth(), n1bVar.J.getHeight());
                k1bVar.i.set(k1bVar.h);
                matrix.mapRect(k1bVar.i);
                k1bVar.c = i3;
                Bitmap d = n1bVar.d(0, 0, n1bVar.J, false);
                k1bVar.d = d;
                if (d == null) {
                    fc4.g(new RuntimeException("createSmoothEdgesSegmentedImage failed on empty image"), true);
                    return;
                }
                k1bVar.f = k1bVar.c();
                n1b.c(k1bVar, n1bVar.U, n1bVar.V);
                n1bVar.P = k1bVar.j;
                n1bVar.Q = k1bVar.k;
                arrayList.add(k1bVar);
                gm.c3(new hza(n1bVar, arrayList, t88Var, k1bVar, (byte) 2));
                n1bVar.F = k1bVar;
                n1bVar.E = true;
                n1bVar.y = false;
                return;
            }
            for (int i5 = 0; i5 < list.size(); i5++) {
                m1b m1bVar = (m1b) list.get(i5);
                k1b k1bVar2 = new k1b(n1bVar);
                k1bVar2.h.set(m1bVar.b, m1bVar.c, i + m1bVar.d, i2 + m1bVar.e);
                k1bVar2.i.set(k1bVar2.h);
                matrix.mapRect(k1bVar2.i);
                k1bVar2.c = i3;
                Bitmap d2 = n1bVar.d(m1bVar.b, m1bVar.c, m1bVar.a, false);
                k1bVar2.d = d2;
                if (d2 != null) {
                    k1bVar2.f = k1bVar2.c();
                    n1b.c(k1bVar2, n1bVar.U, n1bVar.V);
                    n1bVar.P = k1bVar2.j;
                    n1bVar.Q = k1bVar2.k;
                    arrayList.add(k1bVar2);
                }
            }
            n1bVar.F = null;
            n1bVar.E = true;
            n1bVar.y = false;
            gm.c3(new uva(n1bVar, arrayList, (byte) 3));
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i77.run():void");
    }

    public i77(Object obj, int i, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public i77(Object obj, Object obj2, int i, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
        this.e = obj3;
        this.f = obj4;
    }

    public i77(Object obj, Object obj2, Object obj3, int i, Object obj4, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i;
        this.f = obj4;
    }

    public i77(Object obj, Object obj2, Object obj3, Object obj4, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = i;
    }
}
