package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.TextureView;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.PhotoViewer;
public final class p97 implements Runnable {
    public final byte a;
    public final Object b;
    public final long c;
    public final Object d;
    public final Object e;

    public p97(g35 g35Var, y25 y25Var, qac qacVar, long j) {
        this.a = (byte) 10;
        this.b = g35Var;
        this.e = y25Var;
        this.d = qacVar;
        this.c = j;
    }

    private final void a() {
        oc7 oc7Var = (oc7) this.b;
        TLObject tLObject = (TLObject) this.d;
        q16 q16Var = (q16) this.e;
        long j = this.c;
        if (tLObject != null) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            oc7Var.d4(groupcall.users, false);
            oc7Var.X3(groupcall.chats, false);
            qd2 qd2Var = new qd2();
            qd2Var.v(oc7Var.getAccountInstance(), j, groupcall);
            oc7Var.d1.k(qd2Var, groupcall.call.id);
            oc7Var.e1.k(qd2Var, j);
            oc7Var.getNotificationCenter().k(nm7.w2, Long.valueOf(j), Long.valueOf(groupcall.call.id), Boolean.FALSE);
            if (q16Var != null) {
                q16Var.run();
            }
        }
        oc7Var.m1.remove(Long.valueOf(j));
    }

    private final void b() {
        oc7 oc7Var = (oc7) this.b;
        String str = (String) this.d;
        Runnable runnable = (Runnable) this.e;
        TLRPC.Chat L0 = oc7Var.L0(Long.valueOf(this.c));
        if (L0.usernames != null) {
            for (int i = 0; i < L0.usernames.size(); i++) {
                TLRPC.TL_username tL_username = L0.usernames.get(i);
                if (tL_username != null && tL_username.editable) {
                    tL_username.username = str;
                    break;
                }
            }
        }
        ArrayList<TLRPC.TL_username> arrayList = L0.usernames;
        if (arrayList != null && arrayList.size() < 1) {
            L0.username = str;
        } else {
            if (L0.usernames == null) {
                L0.usernames = new ArrayList<>();
            }
            TLRPC.TL_username tL_username2 = new TLRPC.TL_username();
            tL_username2.username = str;
            tL_username2.active = true;
            tL_username2.editable = true;
            L0.usernames.add(0, tL_username2);
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(L0);
        oc7Var.getMessagesStorage().j1(null, arrayList2, true, true);
        oc7Var.getNotificationCenter().k(2, 8192);
        runnable.run();
    }

    private final void c() {
        oc7 oc7Var = (oc7) this.b;
        ArrayList arrayList = (ArrayList) this.d;
        ArrayList arrayList2 = (ArrayList) this.e;
        SparseArray sparseArray = oc7Var.V;
        vh6 vh6Var = oc7Var.H1;
        long j = this.c;
        ArrayList arrayList3 = (ArrayList) vh6Var.f(j);
        if (arrayList3 != null) {
            arrayList3.removeAll(arrayList);
            if (arrayList3.isEmpty()) {
                vh6Var.l(j);
            }
        }
        ArrayList arrayList4 = (ArrayList) oc7Var.S.f(j);
        if (arrayList4 != null) {
            for (int i = 0; i < arrayList4.size(); i++) {
                k47 k47Var = (k47) arrayList4.get(i);
                int i2 = 0;
                while (true) {
                    if (i2 < arrayList2.size()) {
                        k47 k47Var2 = (k47) arrayList2.get(i2);
                        if (k47Var.e1() == k47Var2.e1()) {
                            arrayList4.set(i, k47Var2);
                            if (k47Var2.k.peer_id.channel_id == 0) {
                                k47 k47Var3 = (k47) sparseArray.get(k47Var2.e1());
                                sparseArray.remove(k47Var2.e1());
                                if (k47Var3 != null) {
                                    sparseArray.put(k47Var3.e1(), k47Var3);
                                }
                            }
                            oc7Var.getNotificationCenter().k(nm7.r, new Object[0]);
                        } else {
                            i2++;
                        }
                    }
                }
            }
        }
        oc7Var.getNotificationCenter().k(nm7.m0, Long.valueOf(j), arrayList2);
    }

    private final void d() {
        long j = this.c;
        ((cf7) this.b).getMessagesController().H((TLRPC.TL_dialog) this.d, (TLRPC.InputPeer) this.e, j);
    }

    private final void e() {
        long j;
        boolean z;
        cf7 cf7Var = (cf7) this.b;
        TLRPC.TL_messageReactions tL_messageReactions = (TLRPC.TL_messageReactions) this.d;
        TLRPC.TL_messageReactions tL_messageReactions2 = (TLRPC.TL_messageReactions) this.e;
        vh6 vh6Var = new vh6();
        vh6 vh6Var2 = new vh6();
        if (tL_messageReactions.results != null && tL_messageReactions.reactions_as_tags) {
            for (int i = 0; i < tL_messageReactions.results.size(); i++) {
                k39 d = k39.d(tL_messageReactions.results.get(i).reaction);
                vh6Var.k(d, d.h);
            }
        }
        if (tL_messageReactions2 != null && tL_messageReactions2.results != null && tL_messageReactions2.reactions_as_tags) {
            for (int i2 = 0; i2 < tL_messageReactions2.results.size(); i2++) {
                k39 d2 = k39.d(tL_messageReactions2.results.get(i2).reaction);
                vh6Var2.k(d2, d2.h);
            }
        }
        int i3 = 0;
        boolean z2 = false;
        while (true) {
            int m = vh6Var.m();
            j = this.c;
            if (i3 >= m) {
                break;
            }
            long j2 = vh6Var.j(i3);
            k39 k39Var = (k39) vh6Var.n(i3);
            if (!vh6Var2.d(j2)) {
                if (!cf7Var.getMessagesController().A5(j, k39Var, false) && !z2) {
                    z2 = false;
                } else {
                    z2 = true;
                }
            }
            i3++;
        }
        for (int i4 = 0; i4 < vh6Var2.m(); i4++) {
            long j3 = vh6Var2.j(i4);
            k39 k39Var2 = (k39) vh6Var2.n(i4);
            if (!vh6Var.d(j3)) {
                if (!cf7Var.getMessagesController().A5(j, k39Var2, true) && !z2) {
                    z = false;
                } else {
                    z = true;
                }
                z2 = z;
            }
        }
        if (z2) {
            if (j != 0) {
                cf7Var.getMessagesController().y5(0L);
            }
            cf7Var.getMessagesController().y5(j);
        }
    }

    private final void f() {
        cf7 cf7Var = (cf7) this.b;
        cf7Var.getFileLoader().g((ArrayList) this.d);
        cf7Var.getMessagesController().p3((ArrayList) this.e, this.c);
    }

    private final void g() {
        ((TLRPC.User[]) this.d)[0] = ((cf7) this.b).g0(this.c);
        ((CountDownLatch) this.e).countDown();
    }

    private final void h() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p97.h():void");
    }

    private final void i() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p97.i():void");
    }

    private final void j() {
        ((TLRPC.Chat[]) this.d)[0] = ((cf7) this.b).N(this.c);
        ((CountDownLatch) this.e).countDown();
    }

    private final void k() {
        cf7 cf7Var = (cf7) this.b;
        long j = this.c;
        ArrayList arrayList = (ArrayList) this.d;
        CountDownLatch countDownLatch = (CountDownLatch) this.e;
        try {
            try {
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                cf7Var.T(String.valueOf(j), arrayList3, arrayList2);
                if (!arrayList3.isEmpty() && !arrayList2.isEmpty()) {
                    ArrayList arrayList4 = new ArrayList();
                    cf7Var.k0(arrayList2, arrayList4, false);
                    if (!arrayList4.isEmpty()) {
                        arrayList.add((TLObject) arrayList3.get(0));
                        arrayList.add((TLObject) arrayList4.get(0));
                    }
                }
            } catch (Exception e) {
                cf7Var.n(e, true);
            }
        } finally {
            countDownLatch.countDown();
        }
    }

    private final void l() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p97.l():void");
    }

    private final void m() {
        PhotoViewer photoViewer = (PhotoViewer) this.b;
        String str = (String) this.d;
        jo6 jo6Var = (jo6) this.e;
        Drawable[] drawableArr = PhotoViewer.d9;
        long j = this.c;
        s2c s2cVar = new s2c(photoViewer, str, jo6Var, j);
        if (photoViewer.E2) {
            Bitmap createBitmap = Bitmap.createBitmap(photoViewer.D2.getWidth(), photoViewer.D2.getHeight(), Bitmap.Config.ARGB_8888);
            gm.z0(photoViewer.D2, createBitmap, new a18(s2cVar, createBitmap, (byte) 8));
            return;
        }
        TextureView textureView = photoViewer.C2;
        Bitmap bitmap = textureView.getBitmap(textureView.getWidth(), photoViewer.C2.getHeight());
        if (bitmap == null) {
            s2cVar.a(a6a.r(jo6Var.I, j, null, true));
        } else {
            s2cVar.a(bitmap);
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p97.run():void");
    }

    public p97(Object obj, long j, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = j;
        this.d = obj2;
        this.e = obj3;
    }

    public p97(Object obj, Object obj2, long j, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.c = j;
        this.e = obj3;
    }

    public p97(Object obj, Object obj2, Object obj3, long j, byte b) {
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.c = j;
    }

    public p97(TLObject tLObject, oc7 oc7Var, long j, dt5 dt5Var) {
        this.a = (byte) 12;
        this.d = tLObject;
        this.b = oc7Var;
        this.c = j;
        this.e = dt5Var;
    }
}
