package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
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
public final class i57 implements Runnable {
    public final byte a;
    public final int b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public i57(int i, Object obj, Object obj2, Object obj3, Object obj4, byte b) {
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
        hd hdVar = (hd) this.f;
        String str = LaunchActivity.C1;
        if (!launchActivity.isFinishing()) {
            if (tLObject != null && launchActivity.p0 != null) {
                TLRPC.TL_messages_historyImportParsed tL_messages_historyImportParsed = (TLRPC.TL_messages_historyImportParsed) tLObject;
                Bundle l = ir2.l("onlySelect", true);
                l.putString("importTitle", tL_messages_historyImportParsed.title);
                l.putBoolean("allowSwitchAccount", true);
                if (tL_messages_historyImportParsed.pm) {
                    l.putInt("dialogsType", 12);
                } else if (tL_messages_historyImportParsed.group) {
                    l.putInt("dialogsType", 11);
                } else {
                    String uri2 = uri.toString();
                    Iterator it = na7.q1(i).k4.F3.f.iterator();
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
                        Iterator it2 = na7.q1(i).k4.E3.f.iterator();
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
                } else if (PhotoViewer.C0() && PhotoViewer.r0().U0()) {
                    PhotoViewer.r0().B(false, true);
                } else if (o.F() && o.u().W) {
                    o.u().l(false, true);
                }
                t7b.v();
                h75 h75Var = h75.s5;
                if (h75Var != null) {
                    h75Var.dismiss();
                }
                on9 on9Var = on9.Q0;
                if (on9Var != null) {
                    on9Var.dismiss();
                }
                if (gl.O1()) {
                    launchActivity.p0.W(true, true);
                    launchActivity.r0.W(true, true);
                }
                cj3 cj3Var = new cj3(l);
                cj3Var.E2 = launchActivity;
                if (!gl.O1() ? !(launchActivity.p0.getFragmentStack().size() <= 1 || !(launchActivity.p0.getFragmentStack().get(launchActivity.p0.getFragmentStack().size() - 1) instanceof ah6)) : !(launchActivity.q0.getFragmentStack().isEmpty() || !(launchActivity.q0.getFragmentStack().get(launchActivity.q0.getFragmentStack().size() - 1) instanceof ah6))) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                ((ActionBarLayout) launchActivity.N()).U(cj3Var, z2, false);
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
                hdVar.dismiss();
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
    }

    private final void b() {
        LaunchActivity launchActivity = (LaunchActivity) this.c;
        kz5 kz5Var = (kz5) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
        TLRPC.Updates updates = (TLRPC.Updates) this.f;
        String str = LaunchActivity.C1;
        ArrayList arrayList = launchActivity.e0;
        if (!launchActivity.isFinishing()) {
            try {
                kz5Var.run();
            } catch (Exception e) {
                fa4.g(e, true);
            }
            if (tL_error == null) {
                if (launchActivity.p0 != null && updates != null && !updates.chats.isEmpty()) {
                    TLRPC.Chat chat = updates.chats.get(0);
                    chat.left = false;
                    chat.kicked = false;
                    int i = this.b;
                    na7.q1(i).a4(updates.users, false);
                    na7.q1(i).U3(updates.chats, false);
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", chat.id);
                    if (arrayList.isEmpty() || na7.q1(i).A(bundle, (d) b00.f(1, arrayList), null, null)) {
                        mu1 mu1Var = new mu1(bundle);
                        kk7.f(i).k(kk7.s, new Object[0]);
                        ((ActionBarLayout) launchActivity.N()).U(mu1Var, false, true);
                        return;
                    }
                    return;
                }
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
            String M0 = k96.M0(2131689472, null);
            hd hdVar = alertDialog$Builder.a;
            hdVar.S = M0;
            if (tL_error.text.startsWith("FLOOD_WAIT")) {
                hdVar.U = k96.M0(2131750670, null);
            } else if (tL_error.text.equals("USERS_TOO_MUCH")) {
                hdVar.U = k96.M0(2131748884, null);
            } else {
                hdVar.U = k96.M0(2131748883, null);
            }
            alertDialog$Builder.j(k96.M0(2131747638, null), null);
            launchActivity.F0(alertDialog$Builder);
        }
    }

    private final void c() {
        u21 b0;
        ArrayList<TLRPC.User> arrayList;
        ArrayList<TLRPC.Chat> arrayList2;
        TLObject tLObject = (TLObject) this.d;
        String str = (String) this.e;
        kz5 kz5Var = (kz5) this.f;
        String str2 = LaunchActivity.C1;
        d dVar = (d) b00.f(1, ((LaunchActivity) this.c).e0);
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
                na7.q1(i).U3(arrayList2, false);
                na7.q1(i).a4(arrayList, false);
                if (z && ((TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite).peers.isEmpty()) {
                    b0 = u21.b0(dVar);
                } else {
                    ?? fy0Var = new fy0(dVar, false);
                    fy0Var.T1 = -1;
                    fy0Var.X1 = "";
                    fy0Var.Y1 = new ArrayList();
                    fy0Var.a2 = "";
                    fy0Var.c2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    fy0Var.d2 = arrayList3;
                    fy0Var.u2 = -1;
                    fy0Var.x2 = -5;
                    fy0Var.S1 = str;
                    fy0Var.U1 = chatlist_chatlistinvite;
                    arrayList3.clear();
                    if (z) {
                        TL_chatlists.TL_chatlists_chatlistInvite tL_chatlists_chatlistInvite2 = (TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite;
                        TLRPC.TL_textWithEntities tL_textWithEntities = tL_chatlists_chatlistInvite2.title;
                        fy0Var.X1 = tL_textWithEntities.text;
                        fy0Var.Y1 = tL_textWithEntities.entities;
                        fy0Var.Z1 = tL_chatlists_chatlistInvite2.title_noanimate;
                        fy0Var.b2 = tL_chatlists_chatlistInvite2.peers;
                    } else if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) {
                        TL_chatlists.TL_chatlists_chatlistInviteAlready tL_chatlists_chatlistInviteAlready2 = (TL_chatlists.TL_chatlists_chatlistInviteAlready) chatlist_chatlistinvite;
                        fy0Var.b2 = tL_chatlists_chatlistInviteAlready2.missing_peers;
                        fy0Var.e2 = tL_chatlists_chatlistInviteAlready2.already_peers;
                        fy0Var.T1 = tL_chatlists_chatlistInviteAlready2.filter_id;
                        ArrayList arrayList4 = dVar.getMessagesController().G0;
                        if (arrayList4 != null) {
                            while (true) {
                                if (i2 >= arrayList4.size()) {
                                    break;
                                }
                                t97 t97Var = (t97) arrayList4.get(i2);
                                if (t97Var.a == fy0Var.T1) {
                                    fy0Var.X1 = t97Var.b;
                                    fy0Var.Y1 = t97Var.c;
                                    fy0Var.Z1 = t97Var.n;
                                    break;
                                }
                                i2++;
                            }
                        }
                    }
                    fy0Var.a1();
                    dVar.showDialog(fy0Var);
                    kz5Var.run();
                    return;
                }
            } else {
                b0 = u21.b0(dVar);
            }
            kz5Var.run();
            return;
        } catch (Exception e) {
            fa4.g(e, true);
            return;
        }
        yjb.x(null, 2131748017, b0, null);
    }

    private final void d() {
        sr9 sr9Var = (sr9) this.c;
        ArrayList arrayList = (ArrayList) this.d;
        ArrayList arrayList2 = (ArrayList) this.e;
        ArrayList arrayList3 = (ArrayList) this.f;
        if (this.b == sr9Var.F) {
            sr9Var.d = arrayList;
            sr9Var.e = arrayList2;
            sr9Var.I = arrayList3;
            sr9Var.f.f(arrayList, null);
            sr9Var.E = false;
            sr9Var.f();
            sr9Var.F();
        }
    }

    private final void e() {
        boolean[] zArr = (boolean[]) this.d;
        p8c p8cVar = (p8c) this.e;
        TL_account.updateEmojiStatus updateemojistatus = (TL_account.updateEmojiStatus) this.f;
        if (!(((TLObject) this.c) instanceof TLRPC.TL_boolTrue)) {
            if (!zArr[0]) {
                zArr[0] = true;
                p8cVar.a("SERVER_ERROR");
                return;
            }
            return;
        }
        int i = this.b;
        TLRPC.User f = y6c.h(i).f();
        if (f != null) {
            f.emoji_status = updateemojistatus.emoji_status;
            kk7.f(i).k(kk7.o5, f);
            na7.q1(i).o5(f.id, f.emoji_status);
        }
        if (!zArr[0]) {
            zArr[0] = true;
            p8cVar.a(null);
        }
    }

    private final void f() {
        int i;
        int i2;
        rja rjaVar = (rja) this.c;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
        k27 k27Var = (k27) this.e;
        gb2 gb2Var = (gb2) this.f;
        int[] iArr = rjaVar.e;
        RLottieNative[] rLottieNativeArr = rjaVar.g1;
        if (rjaVar.X0) {
            gl.d3(new pja(rjaVar, (byte) 2));
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
                    ba4.G(y6c.t0);
                    String v2 = gl.v2(ba4.J(document, null, true, true), 0);
                    if (TextUtils.isEmpty(v2)) {
                        gl.d3(new qja(document, i, k27Var, gb2Var, tL_messages_stickerSet, (byte) 1));
                        z = true;
                    } else {
                        rLottieNativeArr[i3] = RLottieNative.b(v2, iArr, null, null);
                        rjaVar.h1[i3] = iArr[0];
                    }
                }
            }
            i3++;
        }
        if (z) {
            gl.d3(new pja(rjaVar, (byte) 3));
        } else {
            gl.d3(new t79(rjaVar, i, gb2Var, (byte) 10));
        }
    }

    private final void g() {
        TLObject tLObject = (TLObject) this.e;
        String str = (String) this.f;
        ((u41) this.c).setLoading(false);
        fx0 fx0Var = ((fx0[]) this.d)[0];
        if (fx0Var != null) {
            fx0Var.dismiss();
        }
        gta.v(this.b, false).O();
        d S = LaunchActivity.S();
        if (S != null) {
            u21.b0(S).V(Collections.singletonList(tLObject), k96.M0(2131744742, null), gl.T2(k96.a0(null, null, 2131744741, str)), null).k(false);
        }
    }

    private final void h() {
        int i;
        int i2;
        mza mzaVar = (mza) this.c;
        int i3 = this.b;
        List list = (List) this.d;
        ArrayList arrayList = (ArrayList) this.e;
        q68 q68Var = (q68) this.f;
        if (mzaVar.J != null && !mzaVar.E) {
            Matrix matrix = new Matrix();
            matrix.postScale(1.0f / mzaVar.J.getWidth(), 1.0f / mzaVar.J.getHeight());
            matrix.postTranslate(-0.5f, -0.5f);
            matrix.postRotate(i3);
            matrix.postTranslate(0.5f, 0.5f);
            int i4 = (i3 / 90) % 2;
            Bitmap bitmap = mzaVar.J;
            if (i4 != 0) {
                matrix.postScale(bitmap.getHeight(), mzaVar.J.getWidth());
            } else {
                matrix.postScale(bitmap.getWidth(), mzaVar.J.getHeight());
            }
            if (list.isEmpty()) {
                jza jzaVar = new jza(mzaVar);
                jzaVar.h.set(0.0f, 0.0f, mzaVar.J.getWidth(), mzaVar.J.getHeight());
                jzaVar.i.set(jzaVar.h);
                matrix.mapRect(jzaVar.i);
                jzaVar.c = i3;
                Bitmap d = mzaVar.d(0, 0, mzaVar.J, false);
                jzaVar.d = d;
                if (d == null) {
                    fa4.g(new RuntimeException("createSmoothEdgesSegmentedImage failed on empty image"), true);
                    return;
                }
                jzaVar.f = jzaVar.c();
                mza.c(jzaVar, mzaVar.U, mzaVar.V);
                mzaVar.P = jzaVar.j;
                mzaVar.Q = jzaVar.k;
                arrayList.add(jzaVar);
                gl.d3(new exa(mzaVar, arrayList, q68Var, jzaVar, (byte) 2));
                mzaVar.F = jzaVar;
                mzaVar.E = true;
                mzaVar.y = false;
                return;
            }
            for (int i5 = 0; i5 < list.size(); i5++) {
                lza lzaVar = (lza) list.get(i5);
                jza jzaVar2 = new jza(mzaVar);
                jzaVar2.h.set(lzaVar.b, lzaVar.c, i + lzaVar.d, i2 + lzaVar.e);
                jzaVar2.i.set(jzaVar2.h);
                matrix.mapRect(jzaVar2.i);
                jzaVar2.c = i3;
                Bitmap d2 = mzaVar.d(lzaVar.b, lzaVar.c, lzaVar.a, false);
                jzaVar2.d = d2;
                if (d2 != null) {
                    jzaVar2.f = jzaVar2.c();
                    mza.c(jzaVar2, mzaVar.U, mzaVar.V);
                    mzaVar.P = jzaVar2.j;
                    mzaVar.Q = jzaVar2.k;
                    arrayList.add(jzaVar2);
                }
            }
            mzaVar.F = null;
            mzaVar.E = true;
            mzaVar.y = false;
            gl.d3(new iya(mzaVar, arrayList, (byte) 1));
        }
    }

    private final void i() {
        hgb hgbVar = (hgb) this.c;
        ArrayList arrayList = (ArrayList) this.d;
        vf6 vf6Var = (vf6) this.e;
        vf6 vf6Var2 = (vf6) this.f;
        ArrayList arrayList2 = hgbVar.o;
        vf6 vf6Var3 = hgbVar.i;
        vf6 vf6Var4 = hgbVar.h;
        ArrayList arrayList3 = hgbVar.g;
        if (this.b == hgbVar.c) {
            arrayList3.clear();
            arrayList3.addAll(arrayList);
            vf6Var4.b();
            for (int i = 0; i < vf6Var.m(); i++) {
                vf6Var4.k((TLRPC.User) vf6Var.n(i), vf6Var.j(i));
            }
            vf6Var3.b();
            for (int i2 = 0; i2 < vf6Var2.m(); i2++) {
                vf6Var3.k((TLRPC.Chat) vf6Var2.n(i2), vf6Var2.j(i2));
            }
            hgbVar.e = true;
            hgbVar.f = false;
            if (hgbVar.d == 0 && !arrayList3.isEmpty()) {
                hgbVar.d = ((Long) arrayList3.get(0)).longValue();
            }
            ArrayList arrayList4 = new ArrayList(arrayList2);
            arrayList2.clear();
            for (int i3 = 0; i3 < arrayList4.size(); i3++) {
                fgb fgbVar = (fgb) arrayList4.get(i3);
                hgbVar.c(fgbVar.a, fgbVar.b);
            }
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i57.run():void");
    }

    public i57(Object obj, int i, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public i57(Object obj, Object obj2, int i, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
        this.e = obj3;
        this.f = obj4;
    }

    public i57(Object obj, Object obj2, Object obj3, int i, Object obj4, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i;
        this.f = obj4;
    }

    public i57(Object obj, Object obj2, Object obj3, Object obj4, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = i;
    }
}
