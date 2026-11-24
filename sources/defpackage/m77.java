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
public final class m77 implements Runnable {
    public final byte a;
    public final Object b;
    public final long c;
    public final Object d;
    public final Object e;

    public m77(g15 g15Var, y05 y05Var, p8c p8cVar, long j) {
        this.a = (byte) 10;
        this.b = g15Var;
        this.e = y05Var;
        this.d = p8cVar;
        this.c = j;
    }

    private final void a() {
        na7 na7Var = (na7) this.b;
        TLObject tLObject = (TLObject) this.d;
        qz5 qz5Var = (qz5) this.e;
        long j = this.c;
        if (tLObject != null) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            na7Var.b4(groupcall.users, false);
            na7Var.V3(groupcall.chats, false);
            fc2 fc2Var = new fc2();
            fc2Var.v(na7Var.getAccountInstance(), j, groupcall);
            na7Var.d1.k(fc2Var, groupcall.call.id);
            na7Var.e1.k(fc2Var, j);
            na7Var.getNotificationCenter().k(kk7.v2, Long.valueOf(j), Long.valueOf(groupcall.call.id), Boolean.FALSE);
            if (qz5Var != null) {
                qz5Var.run();
            }
        }
        na7Var.m1.remove(Long.valueOf(j));
    }

    private final void b() {
        na7 na7Var = (na7) this.b;
        String str = (String) this.d;
        Runnable runnable = (Runnable) this.e;
        TLRPC.Chat K0 = na7Var.K0(Long.valueOf(this.c));
        if (K0.usernames != null) {
            for (int i = 0; i < K0.usernames.size(); i++) {
                TLRPC.TL_username tL_username = K0.usernames.get(i);
                if (tL_username != null && tL_username.editable) {
                    tL_username.username = str;
                    break;
                }
            }
        }
        ArrayList<TLRPC.TL_username> arrayList = K0.usernames;
        if (arrayList != null && arrayList.size() < 1) {
            K0.username = str;
        } else {
            if (K0.usernames == null) {
                K0.usernames = new ArrayList<>();
            }
            TLRPC.TL_username tL_username2 = new TLRPC.TL_username();
            tL_username2.username = str;
            tL_username2.active = true;
            tL_username2.editable = true;
            K0.usernames.add(0, tL_username2);
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(K0);
        na7Var.getMessagesStorage().j1(null, arrayList2, true, true);
        na7Var.getNotificationCenter().k(2, 8192);
        runnable.run();
    }

    private final void c() {
        na7 na7Var = (na7) this.b;
        ArrayList arrayList = (ArrayList) this.d;
        ArrayList arrayList2 = (ArrayList) this.e;
        SparseArray sparseArray = na7Var.V;
        vf6 vf6Var = na7Var.H1;
        long j = this.c;
        ArrayList arrayList3 = (ArrayList) vf6Var.f(j);
        if (arrayList3 != null) {
            arrayList3.removeAll(arrayList);
            if (arrayList3.isEmpty()) {
                vf6Var.l(j);
            }
        }
        ArrayList arrayList4 = (ArrayList) na7Var.S.f(j);
        if (arrayList4 != null) {
            for (int i = 0; i < arrayList4.size(); i++) {
                k27 k27Var = (k27) arrayList4.get(i);
                int i2 = 0;
                while (true) {
                    if (i2 < arrayList2.size()) {
                        k27 k27Var2 = (k27) arrayList2.get(i2);
                        if (k27Var.e1() == k27Var2.e1()) {
                            arrayList4.set(i, k27Var2);
                            if (k27Var2.k.peer_id.channel_id == 0) {
                                k27 k27Var3 = (k27) sparseArray.get(k27Var2.e1());
                                sparseArray.remove(k27Var2.e1());
                                if (k27Var3 != null) {
                                    sparseArray.put(k27Var3.e1(), k27Var3);
                                }
                            }
                            na7Var.getNotificationCenter().k(kk7.r, new Object[0]);
                        } else {
                            i2++;
                        }
                    }
                }
            }
        }
        na7Var.getNotificationCenter().k(kk7.l0, Long.valueOf(j), arrayList2);
    }

    private final void d() {
        long j = this.c;
        ((ad7) this.b).getMessagesController().H((TLRPC.TL_dialog) this.d, (TLRPC.InputPeer) this.e, j);
    }

    private final void e() {
        long j;
        boolean z;
        ad7 ad7Var = (ad7) this.b;
        TLRPC.TL_messageReactions tL_messageReactions = (TLRPC.TL_messageReactions) this.d;
        TLRPC.TL_messageReactions tL_messageReactions2 = (TLRPC.TL_messageReactions) this.e;
        vf6 vf6Var = new vf6();
        vf6 vf6Var2 = new vf6();
        if (tL_messageReactions.results != null && tL_messageReactions.reactions_as_tags) {
            for (int i = 0; i < tL_messageReactions.results.size(); i++) {
                h19 d = h19.d(tL_messageReactions.results.get(i).reaction);
                vf6Var.k(d, d.h);
            }
        }
        if (tL_messageReactions2 != null && tL_messageReactions2.results != null && tL_messageReactions2.reactions_as_tags) {
            for (int i2 = 0; i2 < tL_messageReactions2.results.size(); i2++) {
                h19 d2 = h19.d(tL_messageReactions2.results.get(i2).reaction);
                vf6Var2.k(d2, d2.h);
            }
        }
        int i3 = 0;
        boolean z2 = false;
        while (true) {
            int m = vf6Var.m();
            j = this.c;
            if (i3 >= m) {
                break;
            }
            long j2 = vf6Var.j(i3);
            h19 h19Var = (h19) vf6Var.n(i3);
            if (!vf6Var2.d(j2)) {
                if (!ad7Var.getMessagesController().y5(j, h19Var, false) && !z2) {
                    z2 = false;
                } else {
                    z2 = true;
                }
            }
            i3++;
        }
        for (int i4 = 0; i4 < vf6Var2.m(); i4++) {
            long j3 = vf6Var2.j(i4);
            h19 h19Var2 = (h19) vf6Var2.n(i4);
            if (!vf6Var.d(j3)) {
                if (!ad7Var.getMessagesController().y5(j, h19Var2, true) && !z2) {
                    z = false;
                } else {
                    z = true;
                }
                z2 = z;
            }
        }
        if (z2) {
            if (j != 0) {
                ad7Var.getMessagesController().w5(0L);
            }
            ad7Var.getMessagesController().w5(j);
        }
    }

    private final void f() {
        ad7 ad7Var = (ad7) this.b;
        ad7Var.getFileLoader().g((ArrayList) this.d);
        ad7Var.getMessagesController().n3((ArrayList) this.e, this.c);
    }

    private final void g() {
        ((TLRPC.User[]) this.d)[0] = ((ad7) this.b).g0(this.c);
        ((CountDownLatch) this.e).countDown();
    }

    private final void h() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m77.h():void");
    }

    private final void i() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m77.i():void");
    }

    private final void j() {
        ((TLRPC.Chat[]) this.d)[0] = ((ad7) this.b).N(this.c);
        ((CountDownLatch) this.e).countDown();
    }

    private final void k() {
        ad7 ad7Var = (ad7) this.b;
        long j = this.c;
        ArrayList arrayList = (ArrayList) this.d;
        CountDownLatch countDownLatch = (CountDownLatch) this.e;
        try {
            try {
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ad7Var.T(String.valueOf(j), arrayList3, arrayList2);
                if (!arrayList3.isEmpty() && !arrayList2.isEmpty()) {
                    ArrayList arrayList4 = new ArrayList();
                    ad7Var.k0(arrayList2, arrayList4, false);
                    if (!arrayList4.isEmpty()) {
                        arrayList.add((TLObject) arrayList3.get(0));
                        arrayList.add((TLObject) arrayList4.get(0));
                    }
                }
            } catch (Exception e) {
                ad7Var.n(e, true);
            }
        } finally {
            countDownLatch.countDown();
        }
    }

    private final void l() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m77.l():void");
    }

    private final void m() {
        PhotoViewer photoViewer = (PhotoViewer) this.b;
        String str = (String) this.d;
        jm6 jm6Var = (jm6) this.e;
        Drawable[] drawableArr = PhotoViewer.d9;
        long j = this.c;
        s0c s0cVar = new s0c(photoViewer, str, jm6Var, j);
        if (photoViewer.E2) {
            Bitmap createBitmap = Bitmap.createBitmap(photoViewer.D2.getWidth(), photoViewer.D2.getHeight(), Bitmap.Config.ARGB_8888);
            gl.z0(photoViewer.D2, createBitmap, new h18(s0cVar, createBitmap, (byte) 7));
            return;
        }
        TextureView textureView = photoViewer.C2;
        Bitmap bitmap = textureView.getBitmap(textureView.getWidth(), photoViewer.C2.getHeight());
        if (bitmap == null) {
            s0cVar.a(z3a.r(jm6Var.I, j, null, true));
        } else {
            s0cVar.a(bitmap);
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m77.run():void");
    }

    public m77(Object obj, long j, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = j;
        this.d = obj2;
        this.e = obj3;
    }

    public m77(Object obj, Object obj2, long j, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.c = j;
        this.e = obj3;
    }

    public m77(Object obj, Object obj2, Object obj3, long j, byte b) {
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.c = j;
    }

    public m77(TLObject tLObject, na7 na7Var, long j, sx5 sx5Var) {
        this.a = (byte) 12;
        this.d = tLObject;
        this.b = na7Var;
        this.c = j;
        this.e = sx5Var;
    }
}
