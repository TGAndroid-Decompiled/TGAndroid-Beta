package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.p;
public final class aa7 implements Runnable {
    public final byte a;
    public final boolean b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public aa7(a6a a6aVar, TLRPC.TL_messages_editMessage tL_messages_editMessage, k47 k47Var, d dVar, boolean z) {
        this.a = (byte) 20;
        this.c = a6aVar;
        this.d = tL_messages_editMessage;
        this.f = k47Var;
        this.e = dVar;
        this.b = z;
    }

    private final void a() {
        TLRPC.FileLocation fileLocation;
        int i;
        int i2;
        TLRPC.VideoSize x;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
        TLObject tLObject = (TLObject) this.e;
        String str = (String) this.f;
        nk3 nk3Var = ((wj3) this.c).a;
        int i9 = 0;
        if (tL_error == null) {
            TLRPC.User W1 = nk3Var.getMessagesController().W1(Long.valueOf(nk3Var.getUserConfig().e()));
            if (W1 == null) {
                W1 = nk3Var.getUserConfig().f();
                if (W1 != null) {
                    nk3Var.getMessagesController().c4(W1, false, false);
                } else {
                    return;
                }
            } else {
                nk3Var.getUserConfig().v(W1);
            }
            TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
            ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
            TLRPC.PhotoSize w = bc4.w(arrayList, 150, false, null, false);
            TLRPC.PhotoSize w2 = bc4.w(arrayList, 800, false, null, false);
            if (tL_photos_photo.photo.video_sizes.isEmpty()) {
                x = null;
            } else {
                x = bc4.x(1000, tL_photos_photo.photo.video_sizes);
            }
            TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
            W1.photo = tL_userProfilePhoto;
            tL_userProfilePhoto.photo_id = tL_photos_photo.photo.id;
            if (w != null) {
                tL_userProfilePhoto.photo_small = w.location;
            }
            if (w2 != null) {
                tL_userProfilePhoto.photo_big = w2.location;
            }
            if (w != null && nk3Var.i4 != null) {
                i6 = ((d) nk3Var).currentAccount;
                bc4.G(i6);
                File J = bc4.J(w, null, true, true);
                i7 = ((d) nk3Var).currentAccount;
                bc4.G(i7);
                bc4.J(nk3Var.i4, null, true, true).renameTo(J);
                StringBuilder sb = new StringBuilder();
                sb.append(nk3Var.i4.volume_id);
                sb.append("_");
                String k = hg9.k(sb, nk3Var.i4.local_id, "@50_50");
                StringBuilder sb2 = new StringBuilder();
                sb2.append(w.location.volume_id);
                sb2.append("_");
                String k2 = hg9.k(sb2, w.location.local_id, "@50_50");
                fn5 z = fn5.z();
                i8 = ((d) nk3Var).currentAccount;
                z.O(k, k2, gn5.m(i8, 1, W1));
            }
            if (x != null && str != null) {
                i5 = ((d) nk3Var).currentAccount;
                bc4.G(i5);
                new File(str).renameTo(bc4.J(x, "mp4", true, true));
            } else if (w2 != null && nk3Var.j4 != null) {
                i3 = ((d) nk3Var).currentAccount;
                bc4.G(i3);
                File J2 = bc4.J(w2, null, true, true);
                i4 = ((d) nk3Var).currentAccount;
                bc4.G(i4);
                bc4.J(nk3Var.j4, null, true, true).renameTo(J2);
            }
            nk3Var.getMessagesController().T0(W1.id);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(W1);
            i9 = 0;
            nk3Var.getMessagesStorage().j1(arrayList2, null, false, true);
            TLRPC.UserFull X1 = nk3Var.getMessagesController().X1(nk3Var.getUserConfig().e());
            if (X1 != null) {
                X1.profile_photo = tL_photos_photo.photo;
                nk3Var.getMessagesStorage().g2(X1, false);
            }
            fileLocation = null;
        } else {
            fileLocation = null;
        }
        nk3Var.i4 = fileLocation;
        nk3Var.j4 = fileLocation;
        nm7 notificationCenter = nk3Var.getNotificationCenter();
        Object[] objArr = new Object[1];
        objArr[i9] = Integer.valueOf(oc7.s5);
        notificationCenter.k(2, objArr);
        nk3Var.getNotificationCenter().k(nm7.j0, new Object[i9]);
        nk3Var.getUserConfig().u(true);
        i = ((d) nk3Var).currentAccount;
        oc7.r1(i).p4(0L, "USERPIC_SETUP");
        nk3Var.q5();
        u31 u31Var = nk3Var.k4;
        if (u31Var != null) {
            l31 l31Var = (l31) u31Var.e;
            io ioVar = l31Var.d;
            if (this.b) {
                i2 = 2131742456;
            } else {
                i2 = 2131742458;
            }
            ioVar.c(jb6.M0(i2, null), true, true);
            l31Var.setProgress(1.0f);
            o21 button = l31Var.getButton();
            button.setScaleX(0.6f);
            button.setScaleY(0.6f);
            button.setAlpha(0.0f);
            button.setVisibility(0);
            wi8.t(button.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f), d53.h, 360L);
            u31 u31Var2 = nk3Var.k4;
            u31Var2.j = 5000;
            u31Var2.i(false);
            nk3Var.k4.i(true);
        }
    }

    private final void b() {
        m24 m24Var = (m24) this.c;
        String str = (String) this.d;
        String str2 = (String) this.e;
        TLObject tLObject = (TLObject) this.f;
        m24Var.a.remove(str2);
        e34 e34Var = m24Var.b;
        j24 j24Var = e34Var.k0;
        HashMap hashMap = e34Var.m0;
        boolean z = j24Var.w;
        boolean z2 = this.b;
        if (z && j24Var.x.equals(str)) {
            e34Var.k0.E(str, "", false, true, z2, str2, tLObject);
        } else if (z2 && (!(tLObject instanceof TLRPC.messages_BotResults) || ((TLRPC.messages_BotResults) tLObject).results.isEmpty())) {
            m24Var.a(str, false);
        } else if ((tLObject instanceof TLRPC.messages_BotResults) && !hashMap.containsKey(str2)) {
            hashMap.put(str2, (TLRPC.messages_BotResults) tLObject);
        }
    }

    private final void c() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aa7.c():void");
    }

    private final void d() {
        ((p) this.c).y0(this.b, (String) this.d, (String) this.e, (TL_account.updatePasswordSettings) this.f);
    }

    private final void e() {
        ((p) this.c).x0((TLRPC.TL_error) this.d, this.b, (TLObject) this.e, (String) this.f);
    }

    private final void f() {
        ph9.f((d) this.e, (Context) this.c, (ylb) this.d, (zg9) this.f, this.b);
    }

    private final void g() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aa7.g():void");
    }

    private final void h() {
        a6a a6aVar = (a6a) this.c;
        TLObject tLObject = (TLObject) this.e;
        m5a m5aVar = (m5a) this.f;
        a6aVar.h0(((TLRPC.Message) this.d).id, this.b);
        if (tLObject instanceof TLRPC.TL_messages_addPollAnswer) {
            TLRPC.PollAnswer pollAnswer = ((TLRPC.TL_messages_addPollAnswer) tLObject).answer;
            TLRPC.InputMedia inputMedia = pollAnswer.input_media;
            if (inputMedia instanceof TLRPC.TL_inputMediaPhoto) {
                pollAnswer.input_media = m5aVar.t;
            } else if (inputMedia instanceof TLRPC.TL_inputMediaDocument) {
                pollAnswer.input_media = m5aVar.t;
            }
        } else if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
            TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) tLObject;
            TLRPC.InputMedia inputMedia2 = tL_messages_sendMedia.media;
            if (inputMedia2 instanceof TLRPC.TL_inputMediaPhoto) {
                tL_messages_sendMedia.media = m5aVar.t;
            } else if (inputMedia2 instanceof TLRPC.TL_inputMediaDocument) {
                tL_messages_sendMedia.media = m5aVar.t;
            }
        } else if (tLObject instanceof TL_ephemeral.TL_sendMessage) {
            TLObject tLObject2 = m5aVar.c;
            if (tLObject2 instanceof TLRPC.TL_messages_sendMedia) {
                TLRPC.TL_messages_sendMedia tL_messages_sendMedia2 = (TLRPC.TL_messages_sendMedia) tLObject2;
                TLRPC.InputMedia inputMedia3 = tL_messages_sendMedia2.media;
                if (inputMedia3 instanceof TLRPC.TL_inputMediaPhoto) {
                    tL_messages_sendMedia2.media = m5aVar.t;
                } else if (inputMedia3 instanceof TLRPC.TL_inputMediaDocument) {
                    tL_messages_sendMedia2.media = m5aVar.t;
                }
            }
            TL_ephemeral.TL_sendMessage tL_sendMessage = (TL_ephemeral.TL_sendMessage) tLObject;
            TLRPC.InputMedia inputMedia4 = tL_sendMessage.media;
            if (inputMedia4 instanceof TLRPC.TL_inputMediaPhoto) {
                tL_sendMessage.media = m5aVar.t;
            } else if (inputMedia4 instanceof TLRPC.TL_inputMediaDocument) {
                tL_sendMessage.media = m5aVar.t;
            }
        } else if (tLObject instanceof TLRPC.TL_messages_editMessage) {
            TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) tLObject;
            TLRPC.InputMedia inputMedia5 = tL_messages_editMessage.media;
            if (inputMedia5 instanceof TLRPC.TL_inputMediaPhoto) {
                tL_messages_editMessage.media = m5aVar.t;
            } else if (inputMedia5 instanceof TLRPC.TL_inputMediaDocument) {
                tL_messages_editMessage.media = m5aVar.t;
            }
        }
        m5aVar.p = true;
        a6aVar.L(m5aVar, -1);
    }

    private final void i() {
        TLRPC.Message message;
        a6a a6aVar = (a6a) this.c;
        TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) this.d;
        k47 k47Var = (k47) this.f;
        int sendRequest = a6aVar.getConnectionsManager().sendRequest(tL_messages_editMessage, new bh2(a6aVar, this.b, k47Var, tL_messages_editMessage, (d) this.e, (byte) 4));
        if (k47Var != null && (message = k47Var.k) != null) {
            message.reqId = sendRequest;
        }
    }

    private final void j() {
        int i;
        byte b;
        TLRPC.Document document;
        double d;
        double d2;
        d dVar = (d) this.e;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.c;
        TLRPC.Document document2 = (TLRPC.Document) this.d;
        yv1 yv1Var = (yv1) this.f;
        File w = g6b.w(dVar.getCurrentAccount(), "webp");
        int o = gda.o();
        if (o != 0) {
            if (o != 2) {
                i = 2560;
            } else {
                i = 3840;
            }
        } else {
            i = 1280;
        }
        float f = i;
        double d3 = (f * 512.0f) / 512.0f;
        if (((float) Math.floor(d3)) > f) {
            f = (float) Math.floor(d3);
        }
        float f2 = f;
        Bitmap createBitmap = Bitmap.createBitmap(512, 512, Bitmap.Config.ARGB_8888);
        try {
            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w));
        } catch (Throwable th) {
            fc4.g(th, true);
        }
        createBitmap.recycle();
        ArrayList arrayList = new ArrayList();
        jo6 jo6Var = new jo6(0, w.getAbsolutePath(), 0, false, 0, 0);
        arrayList.add(jo6Var);
        pcc pccVar = new pcc();
        pccVar.a = (byte) 0;
        pccVar.C = tL_messages_stickerSet;
        bc4.G(z8c.t0);
        pccVar.j = bc4.J(document2, null, true, true).getAbsolutePath();
        pccVar.c = 0.0f;
        pccVar.d = 0.0f;
        pccVar.f = 1.0f;
        pccVar.g = 1.0f;
        int floor = (int) Math.floor(f2 * 0.5d);
        pccVar.q = floor;
        pccVar.r = floor;
        pccVar.v = 2.0f;
        pccVar.B = document2;
        if (k47.K2(document2, true) || k47.N4(document2)) {
            boolean K2 = k47.K2(document2, true);
            byte b2 = pccVar.b;
            if (K2) {
                b = 1;
            } else {
                b = 4;
            }
            pccVar.b = (byte) (b2 | b);
        }
        ArrayList arrayList2 = new ArrayList();
        jo6Var.p = arrayList2;
        arrayList2.add(pccVar);
        jo6Var.t = 3000L;
        if (k47.K2(document2, true)) {
            bc4.G(z8c.t0);
            File J = bc4.J(document2, null, true, true);
            if (J != null) {
                try {
                    RLottieNative a = RLottieNative.a(J.getAbsolutePath(), null, null, null, 0, null);
                    if (a != null) {
                        int[] iArr = a.a;
                        int i2 = iArr[0];
                        int i3 = iArr[1];
                        a.d();
                        d = 1000.0d;
                        d2 = i2 / i3;
                    } else {
                        d = 1000.0d;
                        d2 = 0.0d;
                    }
                    jo6Var.t = (long) (d2 * d);
                } catch (Exception e) {
                    fc4.g(e, true);
                }
            }
        } else if (k47.N4(document2)) {
            jo6Var.t = (long) (k47.H0(document2) * 1000.0d);
        }
        PhotoViewer.r0().T1(dVar.getParentActivity(), null, dVar.getResourceProvider());
        PhotoViewer.r0().o1(arrayList, 0, 11, false, new Object(), yv1Var);
        PhotoViewer r0 = PhotoViewer.r0();
        boolean z = this.b;
        if (z) {
            document = document2;
        } else {
            document = null;
        }
        r0.U(document2, document, true, null);
        hx2 e2 = hx2.e();
        if (!z) {
            tL_messages_stickerSet = null;
        }
        e2.T = tL_messages_stickerSet;
    }

    private final void k() {
        int i;
        v9b v9bVar = (v9b) this.c;
        Bitmap bitmap = (Bitmap) this.d;
        File file = (File) this.e;
        g6b g6bVar = (g6b) this.f;
        try {
            Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
            if (this.b) {
                i = 95;
            } else {
                i = 99;
            }
            bitmap.compress(compressFormat, i, new FileOutputStream(file));
        } catch (Exception e) {
            fc4.g(e, true);
        }
        gm.c3(new j2b(v9bVar, g6bVar, file, (byte) 9));
    }

    private final void l() {
        ((p5c) this.c).A0((TLObject) this.d, this.b, (String) this.e, (TL_account.passwordInputSettings) this.f);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aa7.run():void");
    }

    public aa7(Object obj, Object obj2, Object obj3, Object obj4, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = z;
    }

    public aa7(Object obj, Object obj2, Object obj3, boolean z, Object obj4, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z;
        this.f = obj4;
    }

    public aa7(Object obj, Object obj2, boolean z, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
        this.e = obj3;
        this.f = obj4;
    }

    public aa7(Object obj, boolean z, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.c = obj;
        this.b = z;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public aa7(TLRPC.payments_GiveawayInfo payments_giveawayinfo, boolean z, String str, long j, TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway, d dVar) {
        this.a = (byte) 3;
        this.c = payments_giveawayinfo;
        this.b = z;
        this.d = str;
        this.f = tL_messageMediaGiveaway;
        this.e = dVar;
    }

    public aa7(d dVar, Object obj, Object obj2, Object obj3, boolean z, byte b) {
        this.a = b;
        this.e = dVar;
        this.c = obj;
        this.d = obj2;
        this.f = obj3;
        this.b = z;
    }
}
