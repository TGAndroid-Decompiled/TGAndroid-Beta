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
public final class ba7 implements Runnable {
    public final byte a;
    public final Object b;
    public final long c;
    public final Object d;
    public final Object e;

    public ba7(k35 k35Var, c35 c35Var, pcc pccVar, long j) {
        this.a = (byte) 10;
        this.b = k35Var;
        this.e = c35Var;
        this.d = pccVar;
        this.c = j;
    }

    private final void a() {
        uc7 uc7Var = (uc7) this.b;
        TLObject tLObject = (TLObject) this.d;
        t16 t16Var = (t16) this.e;
        long j = this.c;
        if (tLObject != null) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            uc7Var.j4(groupcall.users, false);
            uc7Var.c4(groupcall.chats, false);
            vc2 vc2Var = new vc2();
            vc2Var.v(uc7Var.getAccountInstance(), j, groupcall);
            uc7Var.d1.k(groupcall.call.id, vc2Var);
            uc7Var.e1.k(j, vc2Var);
            uc7Var.getNotificationCenter().k(jn7.w2, Long.valueOf(j), Long.valueOf(groupcall.call.id), Boolean.FALSE);
            if (t16Var != null) {
                t16Var.run();
            }
        }
        uc7Var.m1.remove(Long.valueOf(j));
    }

    private final void b() {
        uc7 uc7Var = (uc7) this.b;
        String str = (String) this.d;
        Runnable runnable = (Runnable) this.e;
        TLRPC.Chat M0 = uc7Var.M0(Long.valueOf(this.c));
        if (M0.usernames != null) {
            for (int i = 0; i < M0.usernames.size(); i++) {
                TLRPC.TL_username tL_username = M0.usernames.get(i);
                if (tL_username != null && tL_username.editable) {
                    tL_username.username = str;
                    break;
                }
            }
        }
        ArrayList<TLRPC.TL_username> arrayList = M0.usernames;
        if (arrayList != null && arrayList.size() < 1) {
            M0.username = str;
        } else {
            if (M0.usernames == null) {
                M0.usernames = new ArrayList<>();
            }
            TLRPC.TL_username tL_username2 = new TLRPC.TL_username();
            tL_username2.username = str;
            tL_username2.active = true;
            tL_username2.editable = true;
            M0.usernames.add(0, tL_username2);
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(M0);
        uc7Var.getMessagesStorage().j1(null, arrayList2, true, true);
        uc7Var.getNotificationCenter().k(2, 8192);
        runnable.run();
    }

    private final void c() {
        uc7 uc7Var = (uc7) this.b;
        ArrayList arrayList = (ArrayList) this.d;
        ArrayList arrayList2 = (ArrayList) this.e;
        SparseArray sparseArray = uc7Var.V;
        zh6 zh6Var = uc7Var.H1;
        long j = this.c;
        ArrayList arrayList3 = (ArrayList) zh6Var.f(j);
        if (arrayList3 != null) {
            arrayList3.removeAll(arrayList);
            if (arrayList3.isEmpty()) {
                zh6Var.l(j);
            }
        }
        ArrayList arrayList4 = (ArrayList) uc7Var.S.f(j);
        if (arrayList4 != null) {
            for (int i = 0; i < arrayList4.size(); i++) {
                r47 r47Var = (r47) arrayList4.get(i);
                int i2 = 0;
                while (true) {
                    if (i2 < arrayList2.size()) {
                        r47 r47Var2 = (r47) arrayList2.get(i2);
                        if (r47Var.e1() == r47Var2.e1()) {
                            arrayList4.set(i, r47Var2);
                            if (r47Var2.k.peer_id.channel_id == 0) {
                                r47 r47Var3 = (r47) sparseArray.get(r47Var2.e1());
                                sparseArray.remove(r47Var2.e1());
                                if (r47Var3 != null) {
                                    sparseArray.put(r47Var3.e1(), r47Var3);
                                }
                            }
                            uc7Var.getNotificationCenter().k(jn7.r, new Object[0]);
                        } else {
                            i2++;
                        }
                    }
                }
            }
        }
        uc7Var.getNotificationCenter().k(jn7.m0, Long.valueOf(j), arrayList2);
    }

    private final void d() {
        long j = this.c;
        ((jf7) this.b).getMessagesController().J((TLRPC.TL_dialog) this.d, (TLRPC.InputPeer) this.e, j);
    }

    private final void e() {
        long j;
        boolean z;
        jf7 jf7Var = (jf7) this.b;
        TLRPC.TL_messageReactions tL_messageReactions = (TLRPC.TL_messageReactions) this.d;
        TLRPC.TL_messageReactions tL_messageReactions2 = (TLRPC.TL_messageReactions) this.e;
        zh6 zh6Var = new zh6();
        zh6 zh6Var2 = new zh6();
        if (tL_messageReactions.results != null && tL_messageReactions.reactions_as_tags) {
            for (int i = 0; i < tL_messageReactions.results.size(); i++) {
                w49 d = w49.d(tL_messageReactions.results.get(i).reaction);
                zh6Var.k(d.h, d);
            }
        }
        if (tL_messageReactions2 != null && tL_messageReactions2.results != null && tL_messageReactions2.reactions_as_tags) {
            for (int i2 = 0; i2 < tL_messageReactions2.results.size(); i2++) {
                w49 d2 = w49.d(tL_messageReactions2.results.get(i2).reaction);
                zh6Var2.k(d2.h, d2);
            }
        }
        int i3 = 0;
        boolean z2 = false;
        while (true) {
            int m = zh6Var.m();
            j = this.c;
            if (i3 >= m) {
                break;
            }
            long j2 = zh6Var.j(i3);
            w49 w49Var = (w49) zh6Var.n(i3);
            if (!zh6Var2.d(j2)) {
                if (!jf7Var.getMessagesController().G5(j, w49Var, false) && !z2) {
                    z2 = false;
                } else {
                    z2 = true;
                }
            }
            i3++;
        }
        for (int i4 = 0; i4 < zh6Var2.m(); i4++) {
            long j3 = zh6Var2.j(i4);
            w49 w49Var2 = (w49) zh6Var2.n(i4);
            if (!zh6Var.d(j3)) {
                if (!jf7Var.getMessagesController().G5(j, w49Var2, true) && !z2) {
                    z = false;
                } else {
                    z = true;
                }
                z2 = z;
            }
        }
        if (z2) {
            if (j != 0) {
                jf7Var.getMessagesController().E5(0L);
            }
            jf7Var.getMessagesController().E5(j);
        }
    }

    private final void f() {
        ((TLRPC.User[]) this.d)[0] = ((jf7) this.b).g0(this.c);
        ((CountDownLatch) this.e).countDown();
    }

    private final void g() {
        jf7 jf7Var = (jf7) this.b;
        jf7Var.getFileLoader().g((ArrayList) this.d);
        jf7Var.getMessagesController().t3((ArrayList) this.e, this.c);
    }

    private final void h() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ba7.h():void");
    }

    private final void i() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ba7.i():void");
    }

    private final void j() {
        ((TLRPC.Chat[]) this.d)[0] = ((jf7) this.b).N(this.c);
        ((CountDownLatch) this.e).countDown();
    }

    private final void k() {
        jf7 jf7Var = (jf7) this.b;
        long j = this.c;
        ArrayList arrayList = (ArrayList) this.d;
        CountDownLatch countDownLatch = (CountDownLatch) this.e;
        try {
            try {
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                jf7Var.T(String.valueOf(j), arrayList3, arrayList2);
                if (!arrayList3.isEmpty() && !arrayList2.isEmpty()) {
                    ArrayList arrayList4 = new ArrayList();
                    jf7Var.k0(arrayList2, arrayList4, false);
                    if (!arrayList4.isEmpty()) {
                        arrayList.add((TLObject) arrayList3.get(0));
                        arrayList.add((TLObject) arrayList4.get(0));
                    }
                }
            } catch (Exception e) {
                jf7Var.n(e, true);
            }
        } finally {
            countDownLatch.countDown();
        }
    }

    private final void l() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ba7.l():void");
    }

    private final void m() {
        PhotoViewer photoViewer = (PhotoViewer) this.b;
        String str = (String) this.d;
        no6 no6Var = (no6) this.e;
        Drawable[] drawableArr = PhotoViewer.d9;
        long j = this.c;
        r4c r4cVar = new r4c(photoViewer, str, no6Var, j);
        if (photoViewer.E2) {
            Bitmap createBitmap = Bitmap.createBitmap(photoViewer.D2.getWidth(), photoViewer.D2.getHeight(), Bitmap.Config.ARGB_8888);
            hl.z0(photoViewer.D2, createBitmap, new h68(r4cVar, createBitmap, (byte) 4));
            return;
        }
        TextureView textureView = photoViewer.C2;
        Bitmap bitmap = textureView.getBitmap(textureView.getWidth(), photoViewer.C2.getHeight());
        if (bitmap == null) {
            r4cVar.a(r7a.r(no6Var.I, j, null, true));
        } else {
            r4cVar.a(bitmap);
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ba7.run():void");
    }

    public ba7(Object obj, long j, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = j;
        this.d = obj2;
        this.e = obj3;
    }

    public ba7(Object obj, Object obj2, long j, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.c = j;
        this.e = obj3;
    }

    public ba7(Object obj, Object obj2, Object obj3, long j, byte b) {
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.c = j;
    }

    public ba7(TLObject tLObject, uc7 uc7Var, long j, ls5 ls5Var) {
        this.a = (byte) 12;
        this.d = tLObject;
        this.b = uc7Var;
        this.c = j;
        this.e = ls5Var;
    }
}
