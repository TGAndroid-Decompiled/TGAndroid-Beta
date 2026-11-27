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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.o;
public final class l77 implements Runnable {
    public final byte a;
    public final int b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public l77(int i, Object obj, Object obj2, Object obj3, Object obj4, byte b) {
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
        id idVar = (id) this.f;
        String str = LaunchActivity.C1;
        if (!launchActivity.isFinishing()) {
            if (tLObject != null && launchActivity.p0 != null) {
                TLRPC.TL_messages_historyImportParsed tL_messages_historyImportParsed = (TLRPC.TL_messages_historyImportParsed) tLObject;
                Bundle l = bs2.l("onlySelect", true);
                l.putString("importTitle", tL_messages_historyImportParsed.title);
                l.putBoolean("allowSwitchAccount", true);
                if (tL_messages_historyImportParsed.pm) {
                    l.putInt("dialogsType", 12);
                } else if (tL_messages_historyImportParsed.group) {
                    l.putInt("dialogsType", 11);
                } else {
                    String uri2 = uri.toString();
                    Iterator it = uc7.s1(i).k4.N3.f.iterator();
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
                        Iterator it2 = uc7.s1(i).k4.M3.f.iterator();
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
                } else if (PhotoViewer.C0() && PhotoViewer.q0().V0()) {
                    PhotoViewer.q0().A(false, true);
                } else if (o.F() && o.u().W) {
                    o.u().l(false, true);
                }
                rbb.v();
                j95 j95Var = j95.s5;
                if (j95Var != null) {
                    j95Var.dismiss();
                }
                er9 er9Var = er9.Q0;
                if (er9Var != null) {
                    er9Var.dismiss();
                }
                if (hl.O1()) {
                    launchActivity.p0.W(true, true);
                    launchActivity.r0.W(true, true);
                }
                uj3 uj3Var = new uj3(l);
                uj3Var.E2 = launchActivity;
                if (!hl.O1() ? !(launchActivity.p0.getFragmentStack().size() <= 1 || !(launchActivity.p0.getFragmentStack().get(launchActivity.p0.getFragmentStack().size() - 1) instanceof fj6)) : !(launchActivity.q0.getFragmentStack().isEmpty() || !(launchActivity.q0.getFragmentStack().get(launchActivity.q0.getFragmentStack().size() - 1) instanceof fj6))) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                ((ActionBarLayout) launchActivity.N()).U(uj3Var, z2, false);
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
                idVar.dismiss();
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
    }

    private final void b() {
        LaunchActivity launchActivity = (LaunchActivity) this.c;
        tg5 tg5Var = (tg5) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
        TLRPC.Updates updates = (TLRPC.Updates) this.f;
        String str = LaunchActivity.C1;
        ArrayList arrayList = launchActivity.e0;
        if (!launchActivity.isFinishing()) {
            try {
                tg5Var.run();
            } catch (Exception e) {
                cc4.g(e, true);
            }
            if (tL_error == null) {
                if (launchActivity.p0 != null && updates != null && !updates.chats.isEmpty()) {
                    TLRPC.Chat chat = updates.chats.get(0);
                    chat.left = false;
                    chat.kicked = false;
                    int i = this.b;
                    uc7.s1(i).j4(updates.users, false);
                    uc7.s1(i).c4(updates.chats, false);
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", chat.id);
                    if (arrayList.isEmpty() || uc7.s1(i).C(bundle, (e) c00.g(1, arrayList), null, null)) {
                        zu1 zu1Var = new zu1(bundle);
                        jn7.f(i).k(jn7.s, new Object[0]);
                        ((ActionBarLayout) launchActivity.N()).U(zu1Var, false, true);
                        return;
                    }
                    return;
                }
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
            String M0 = ob6.M0(2131689472, null);
            id idVar = alertDialog$Builder.a;
            idVar.S = M0;
            if (tL_error.text.startsWith("FLOOD_WAIT")) {
                idVar.U = ob6.M0(2131750647, null);
            } else if (tL_error.text.equals("USERS_TOO_MUCH")) {
                idVar.U = ob6.M0(2131748830, null);
            } else {
                idVar.U = ob6.M0(2131748829, null);
            }
            alertDialog$Builder.j(ob6.M0(2131747558, null), null);
            launchActivity.F0(alertDialog$Builder);
        }
    }

    private final void c() {
        d31 b0;
        ArrayList<TLRPC.User> arrayList;
        ArrayList<TLRPC.Chat> arrayList2;
        TLObject tLObject = (TLObject) this.d;
        String str = (String) this.e;
        tg5 tg5Var = (tg5) this.f;
        String str2 = LaunchActivity.C1;
        e eVar = (e) c00.g(1, ((LaunchActivity) this.c).e0);
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
                uc7.s1(i).c4(arrayList2, false);
                uc7.s1(i).j4(arrayList, false);
                if (z && ((TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite).peers.isEmpty()) {
                    b0 = d31.b0(eVar);
                } else {
                    ?? ny0Var = new ny0(eVar, false);
                    ny0Var.T1 = -1;
                    ny0Var.X1 = "";
                    ny0Var.Y1 = new ArrayList();
                    ny0Var.a2 = "";
                    ny0Var.c2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    ny0Var.d2 = arrayList3;
                    ny0Var.u2 = -1;
                    ny0Var.x2 = -5;
                    ny0Var.S1 = str;
                    ny0Var.U1 = chatlist_chatlistinvite;
                    arrayList3.clear();
                    if (z) {
                        TL_chatlists.TL_chatlists_chatlistInvite tL_chatlists_chatlistInvite2 = (TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite;
                        TLRPC.TL_textWithEntities tL_textWithEntities = tL_chatlists_chatlistInvite2.title;
                        ny0Var.X1 = tL_textWithEntities.text;
                        ny0Var.Y1 = tL_textWithEntities.entities;
                        ny0Var.Z1 = tL_chatlists_chatlistInvite2.title_noanimate;
                        ny0Var.b2 = tL_chatlists_chatlistInvite2.peers;
                    } else if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) {
                        TL_chatlists.TL_chatlists_chatlistInviteAlready tL_chatlists_chatlistInviteAlready2 = (TL_chatlists.TL_chatlists_chatlistInviteAlready) chatlist_chatlistinvite;
                        ny0Var.b2 = tL_chatlists_chatlistInviteAlready2.missing_peers;
                        ny0Var.e2 = tL_chatlists_chatlistInviteAlready2.already_peers;
                        ny0Var.T1 = tL_chatlists_chatlistInviteAlready2.filter_id;
                        ArrayList arrayList4 = eVar.getMessagesController().G0;
                        if (arrayList4 != null) {
                            while (true) {
                                if (i2 >= arrayList4.size()) {
                                    break;
                                }
                                ac7 ac7Var = (ac7) arrayList4.get(i2);
                                if (ac7Var.a == ny0Var.T1) {
                                    ny0Var.X1 = ac7Var.b;
                                    ny0Var.Y1 = ac7Var.c;
                                    ny0Var.Z1 = ac7Var.n;
                                    break;
                                }
                                i2++;
                            }
                        }
                    }
                    ny0Var.b1();
                    eVar.showDialog(ny0Var);
                    tg5Var.run();
                    return;
                }
            } else {
                b0 = d31.b0(eVar);
            }
            tg5Var.run();
            return;
        } catch (Exception e) {
            cc4.g(e, true);
            return;
        }
        xnb.x(null, 2131747940, b0, null);
    }

    private final void d() {
        ((e66) this.c).v((String) this.d, this.b + 1, (String) this.e, (String) this.f);
    }

    private final void e() {
        zg6 zg6Var = (zg6) this.c;
        String str = (String) this.d;
        String str2 = (String) this.e;
        String str3 = (String) this.f;
        ArrayList arrayList = new ArrayList();
        ?? obj = new Object();
        obj.b = "inapp";
        obj.a = str;
        arrayList.add(obj.a());
        cc4.b("LoginBilling querying \"" + str + "\" product");
        di0.h().o(arrayList, new eg(zg6Var, str, str2, str3, this.b));
    }

    private final void f() {
        Pair pair = (Pair) this.d;
        ((f07) this.c).b.i.O(((Integer) pair.first).intValue(), (vz6) pair.second, (ja6) this.e, (jt6) this.f, this.b);
    }

    private final void g() {
        ((View) this.d).removeOnAttachStateChangeListener((cn7) this.e);
        ((jn7) this.c).n((bn7) this.f, this.b);
    }

    private final void h() {
        lv9 lv9Var = (lv9) this.c;
        ArrayList arrayList = (ArrayList) this.d;
        ArrayList arrayList2 = (ArrayList) this.e;
        ArrayList arrayList3 = (ArrayList) this.f;
        if (this.b == lv9Var.F) {
            lv9Var.d = arrayList;
            lv9Var.e = arrayList2;
            lv9Var.I = arrayList3;
            lv9Var.f.f(arrayList, null);
            lv9Var.E = false;
            lv9Var.f();
            lv9Var.F();
        }
    }

    private final void i() {
        boolean[] zArr = (boolean[]) this.d;
        pcc pccVar = (pcc) this.e;
        TL_account.updateEmojiStatus updateemojistatus = (TL_account.updateEmojiStatus) this.f;
        if (!(((TLObject) this.c) instanceof TLRPC.TL_boolTrue)) {
            if (!zArr[0]) {
                zArr[0] = true;
                pccVar.a("SERVER_ERROR");
                return;
            }
            return;
        }
        int i = this.b;
        TLRPC.User f = yac.h(i).f();
        if (f != null) {
            f.emoji_status = updateemojistatus.emoji_status;
            jn7.f(i).k(jn7.p5, f);
            uc7.s1(i).x5(f.id, f.emoji_status);
        }
        if (!zArr[0]) {
            zArr[0] = true;
            pccVar.a(null);
        }
    }

    private final void j() {
        int i;
        int i2;
        lna lnaVar = (lna) this.c;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
        r47 r47Var = (r47) this.e;
        wb2 wb2Var = (wb2) this.f;
        int[] iArr = lnaVar.e;
        RLottieNative[] rLottieNativeArr = lnaVar.g1;
        if (lnaVar.X0) {
            hl.c3(new jna(lnaVar, (byte) 2));
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
                    xb4.G(yac.t0);
                    String v2 = hl.v2(xb4.J(document, null, true, true), 0);
                    if (TextUtils.isEmpty(v2)) {
                        hl.c3(new kna(document, i, r47Var, wb2Var, tL_messages_stickerSet, (byte) 1));
                        z = true;
                    } else {
                        rLottieNativeArr[i3] = RLottieNative.b(v2, iArr, null, null);
                        lnaVar.h1[i3] = iArr[0];
                    }
                }
            }
            i3++;
        }
        if (z) {
            hl.c3(new jna(lnaVar, (byte) 3));
        } else {
            hl.c3(new a39(lnaVar, i, wb2Var, (byte) 11));
        }
    }

    private final void k() {
        TLObject tLObject = (TLObject) this.e;
        String str = (String) this.f;
        ((c51) this.c).setLoading(false);
        nx0 nx0Var = ((nx0[]) this.d)[0];
        if (nx0Var != null) {
            nx0Var.dismiss();
        }
        jxa.v(this.b, false).P();
        e S = LaunchActivity.S();
        if (S != null) {
            d31.b0(S).V(Collections.singletonList(tLObject), ob6.M0(2131744636, null), hl.S2(ob6.a0(null, null, 2131744635, str)), null).k(false);
        }
    }

    private final void l() {
        int i;
        int i2;
        k3b k3bVar = (k3b) this.c;
        int i3 = this.b;
        List list = (List) this.d;
        ArrayList arrayList = (ArrayList) this.e;
        ea8 ea8Var = (ea8) this.f;
        if (k3bVar.J != null && !k3bVar.E) {
            Matrix matrix = new Matrix();
            matrix.postScale(1.0f / k3bVar.J.getWidth(), 1.0f / k3bVar.J.getHeight());
            matrix.postTranslate(-0.5f, -0.5f);
            matrix.postRotate(i3);
            matrix.postTranslate(0.5f, 0.5f);
            int i4 = (i3 / 90) % 2;
            Bitmap bitmap = k3bVar.J;
            if (i4 != 0) {
                matrix.postScale(bitmap.getHeight(), k3bVar.J.getWidth());
            } else {
                matrix.postScale(bitmap.getWidth(), k3bVar.J.getHeight());
            }
            if (list.isEmpty()) {
                h3b h3bVar = new h3b(k3bVar);
                h3bVar.h.set(0.0f, 0.0f, k3bVar.J.getWidth(), k3bVar.J.getHeight());
                h3bVar.i.set(h3bVar.h);
                matrix.mapRect(h3bVar.i);
                h3bVar.c = i3;
                Bitmap d = k3bVar.d(0, 0, k3bVar.J, false);
                h3bVar.d = d;
                if (d == null) {
                    cc4.g(new RuntimeException("createSmoothEdgesSegmentedImage failed on empty image"), true);
                    return;
                }
                h3bVar.f = h3bVar.c();
                k3b.c(h3bVar, k3bVar.U, k3bVar.V);
                k3bVar.P = h3bVar.j;
                k3bVar.Q = h3bVar.k;
                arrayList.add(h3bVar);
                hl.c3(new kta((Object) k3bVar, arrayList, (Object) ea8Var, (Object) h3bVar, (byte) 4));
                k3bVar.F = h3bVar;
                k3bVar.E = true;
                k3bVar.y = false;
                return;
            }
            for (int i5 = 0; i5 < list.size(); i5++) {
                j3b j3bVar = (j3b) list.get(i5);
                h3b h3bVar2 = new h3b(k3bVar);
                h3bVar2.h.set(j3bVar.b, j3bVar.c, i + j3bVar.d, i2 + j3bVar.e);
                h3bVar2.i.set(h3bVar2.h);
                matrix.mapRect(h3bVar2.i);
                h3bVar2.c = i3;
                Bitmap d2 = k3bVar.d(j3bVar.b, j3bVar.c, j3bVar.a, false);
                h3bVar2.d = d2;
                if (d2 != null) {
                    h3bVar2.f = h3bVar2.c();
                    k3b.c(h3bVar2, k3bVar.U, k3bVar.V);
                    k3bVar.P = h3bVar2.j;
                    k3bVar.Q = h3bVar2.k;
                    arrayList.add(h3bVar2);
                }
            }
            k3bVar.F = null;
            k3bVar.E = true;
            k3bVar.y = false;
            hl.c3(new ida(k3bVar, arrayList, (byte) 28));
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l77.run():void");
    }

    public l77(Object obj, int i, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public l77(Object obj, Object obj2, int i, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
        this.e = obj3;
        this.f = obj4;
    }

    public l77(Object obj, Object obj2, Object obj3, int i, Object obj4, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i;
        this.f = obj4;
    }

    public l77(Object obj, Object obj2, Object obj3, Object obj4, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = i;
    }
}
