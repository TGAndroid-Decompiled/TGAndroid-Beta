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
public final class z77 implements Runnable {
    public final byte a;
    public final boolean b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public z77(z3a z3aVar, TLRPC.TL_messages_editMessage tL_messages_editMessage, k27 k27Var, d dVar, boolean z) {
        this.a = (byte) 20;
        this.c = z3aVar;
        this.d = tL_messages_editMessage;
        this.f = k27Var;
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
        cj3 cj3Var = ((mi3) this.c).a;
        int i9 = 0;
        if (tL_error == null) {
            TLRPC.User V1 = cj3Var.getMessagesController().V1(Long.valueOf(cj3Var.getUserConfig().e()));
            if (V1 == null) {
                V1 = cj3Var.getUserConfig().f();
                if (V1 != null) {
                    cj3Var.getMessagesController().a4(V1, false, false);
                } else {
                    return;
                }
            } else {
                cj3Var.getUserConfig().v(V1);
            }
            TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
            ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
            TLRPC.PhotoSize w = ba4.w(arrayList, 150, false, null, false);
            TLRPC.PhotoSize w2 = ba4.w(arrayList, 800, false, null, false);
            if (tL_photos_photo.photo.video_sizes.isEmpty()) {
                x = null;
            } else {
                x = ba4.x(1000, tL_photos_photo.photo.video_sizes);
            }
            TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
            V1.photo = tL_userProfilePhoto;
            tL_userProfilePhoto.photo_id = tL_photos_photo.photo.id;
            if (w != null) {
                tL_userProfilePhoto.photo_small = w.location;
            }
            if (w2 != null) {
                tL_userProfilePhoto.photo_big = w2.location;
            }
            if (w != null && cj3Var.g4 != null) {
                i6 = ((d) cj3Var).currentAccount;
                ba4.G(i6);
                File J = ba4.J(w, null, true, true);
                i7 = ((d) cj3Var).currentAccount;
                ba4.G(i7);
                ba4.J(cj3Var.g4, null, true, true).renameTo(J);
                StringBuilder sb = new StringBuilder();
                sb.append(cj3Var.g4.volume_id);
                sb.append("_");
                String l = de9.l(sb, cj3Var.g4.local_id, "@50_50");
                StringBuilder sb2 = new StringBuilder();
                sb2.append(w.location.volume_id);
                sb2.append("_");
                String l2 = de9.l(sb2, w.location.local_id, "@50_50");
                fl5 z = fl5.z();
                i8 = ((d) cj3Var).currentAccount;
                z.O(l, l2, gl5.m(i8, 1, V1));
            }
            if (x != null && str != null) {
                i5 = ((d) cj3Var).currentAccount;
                ba4.G(i5);
                new File(str).renameTo(ba4.J(x, "mp4", true, true));
            } else if (w2 != null && cj3Var.h4 != null) {
                i3 = ((d) cj3Var).currentAccount;
                ba4.G(i3);
                File J2 = ba4.J(w2, null, true, true);
                i4 = ((d) cj3Var).currentAccount;
                ba4.G(i4);
                ba4.J(cj3Var.h4, null, true, true).renameTo(J2);
            }
            cj3Var.getMessagesController().S0(V1.id);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(V1);
            i9 = 0;
            cj3Var.getMessagesStorage().j1(arrayList2, null, false, true);
            TLRPC.UserFull W1 = cj3Var.getMessagesController().W1(cj3Var.getUserConfig().e());
            if (W1 != null) {
                W1.profile_photo = tL_photos_photo.photo;
                cj3Var.getMessagesStorage().g2(W1, false);
            }
            fileLocation = null;
        } else {
            fileLocation = null;
        }
        cj3Var.g4 = fileLocation;
        cj3Var.h4 = fileLocation;
        kk7 notificationCenter = cj3Var.getNotificationCenter();
        Object[] objArr = new Object[1];
        objArr[i9] = Integer.valueOf(na7.q5);
        notificationCenter.k(2, objArr);
        cj3Var.getNotificationCenter().k(kk7.i0, new Object[i9]);
        cj3Var.getUserConfig().u(true);
        i = ((d) cj3Var).currentAccount;
        na7.q1(i).n4(0L, "USERPIC_SETUP");
        cj3Var.m5();
        m21 m21Var = cj3Var.i4;
        if (m21Var != null) {
            d21 d21Var = (d21) m21Var.e;
            hn hnVar = d21Var.d;
            if (this.b) {
                i2 = 2131742530;
            } else {
                i2 = 2131742532;
            }
            hnVar.c(k96.M0(i2, null), true, true);
            d21Var.setProgress(1.0f);
            g11 button = d21Var.getButton();
            button.setScaleX(0.6f);
            button.setScaleY(0.6f);
            button.setAlpha(0.0f);
            button.setVisibility(0);
            ug8.t(button.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f), s33.h, 360L);
            m21 m21Var2 = cj3Var.i4;
            m21Var2.j = 5000;
            m21Var2.i(false);
            cj3Var.i4.i(true);
        }
    }

    private final void b() {
        b14 b14Var = (b14) this.c;
        String str = (String) this.d;
        String str2 = (String) this.e;
        TLObject tLObject = (TLObject) this.f;
        b14Var.a.remove(str2);
        t14 t14Var = b14Var.b;
        y04 y04Var = t14Var.k0;
        HashMap hashMap = t14Var.m0;
        boolean z = y04Var.w;
        boolean z2 = this.b;
        if (z && y04Var.x.equals(str)) {
            t14Var.k0.E(str, "", false, true, z2, str2, tLObject);
        } else if (z2 && (!(tLObject instanceof TLRPC.messages_BotResults) || ((TLRPC.messages_BotResults) tLObject).results.isEmpty())) {
            b14Var.a(str, false);
        } else if ((tLObject instanceof TLRPC.messages_BotResults) && !hashMap.containsKey(str2)) {
            hashMap.put(str2, (TLRPC.messages_BotResults) tLObject);
        }
    }

    private final void c() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z77.c():void");
    }

    private final void d() {
        ((p) this.c).x0(this.b, (String) this.d, (String) this.e, (TL_account.updatePasswordSettings) this.f);
    }

    private final void e() {
        ((p) this.c).w0((TLRPC.TL_error) this.d, this.b, (TLObject) this.e, (String) this.f);
    }

    private final void f() {
        lf9.f((d) this.e, (Context) this.c, (wjb) this.d, (ve9) this.f, this.b);
    }

    private final void g() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z77.g():void");
    }

    private final void h() {
        z3a z3aVar = (z3a) this.c;
        TLObject tLObject = (TLObject) this.e;
        k3a k3aVar = (k3a) this.f;
        z3aVar.h0(((TLRPC.Message) this.d).id, this.b);
        if (tLObject instanceof TLRPC.TL_messages_addPollAnswer) {
            TLRPC.PollAnswer pollAnswer = ((TLRPC.TL_messages_addPollAnswer) tLObject).answer;
            TLRPC.InputMedia inputMedia = pollAnswer.input_media;
            if (inputMedia instanceof TLRPC.TL_inputMediaPhoto) {
                pollAnswer.input_media = k3aVar.t;
            } else if (inputMedia instanceof TLRPC.TL_inputMediaDocument) {
                pollAnswer.input_media = k3aVar.t;
            }
        } else if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
            TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) tLObject;
            TLRPC.InputMedia inputMedia2 = tL_messages_sendMedia.media;
            if (inputMedia2 instanceof TLRPC.TL_inputMediaPhoto) {
                tL_messages_sendMedia.media = k3aVar.t;
            } else if (inputMedia2 instanceof TLRPC.TL_inputMediaDocument) {
                tL_messages_sendMedia.media = k3aVar.t;
            }
        } else if (tLObject instanceof TL_ephemeral.TL_sendMessage) {
            TLObject tLObject2 = k3aVar.c;
            if (tLObject2 instanceof TLRPC.TL_messages_sendMedia) {
                TLRPC.TL_messages_sendMedia tL_messages_sendMedia2 = (TLRPC.TL_messages_sendMedia) tLObject2;
                TLRPC.InputMedia inputMedia3 = tL_messages_sendMedia2.media;
                if (inputMedia3 instanceof TLRPC.TL_inputMediaPhoto) {
                    tL_messages_sendMedia2.media = k3aVar.t;
                } else if (inputMedia3 instanceof TLRPC.TL_inputMediaDocument) {
                    tL_messages_sendMedia2.media = k3aVar.t;
                }
            }
            TL_ephemeral.TL_sendMessage tL_sendMessage = (TL_ephemeral.TL_sendMessage) tLObject;
            TLRPC.InputMedia inputMedia4 = tL_sendMessage.media;
            if (inputMedia4 instanceof TLRPC.TL_inputMediaPhoto) {
                tL_sendMessage.media = k3aVar.t;
            } else if (inputMedia4 instanceof TLRPC.TL_inputMediaDocument) {
                tL_sendMessage.media = k3aVar.t;
            }
        } else if (tLObject instanceof TLRPC.TL_messages_editMessage) {
            TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) tLObject;
            TLRPC.InputMedia inputMedia5 = tL_messages_editMessage.media;
            if (inputMedia5 instanceof TLRPC.TL_inputMediaPhoto) {
                tL_messages_editMessage.media = k3aVar.t;
            } else if (inputMedia5 instanceof TLRPC.TL_inputMediaDocument) {
                tL_messages_editMessage.media = k3aVar.t;
            }
        }
        k3aVar.p = true;
        z3aVar.L(k3aVar, -1);
    }

    private final void i() {
        TLRPC.Message message;
        z3a z3aVar = (z3a) this.c;
        TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) this.d;
        k27 k27Var = (k27) this.f;
        int sendRequest = z3aVar.getConnectionsManager().sendRequest(tL_messages_editMessage, new pf2(z3aVar, this.b, k27Var, tL_messages_editMessage, (d) this.e, (byte) 4));
        if (k27Var != null && (message = k27Var.k) != null) {
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
        mu1 mu1Var = (mu1) this.f;
        File w = f4b.w(dVar.getCurrentAccount(), "webp");
        int o = gba.o();
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
            fa4.g(th, true);
        }
        createBitmap.recycle();
        ArrayList arrayList = new ArrayList();
        jm6 jm6Var = new jm6(0, w.getAbsolutePath(), 0, false, 0, 0);
        arrayList.add(jm6Var);
        mac macVar = new mac();
        macVar.a = (byte) 0;
        macVar.C = tL_messages_stickerSet;
        ba4.G(y6c.t0);
        macVar.j = ba4.J(document2, null, true, true).getAbsolutePath();
        macVar.c = 0.0f;
        macVar.d = 0.0f;
        macVar.f = 1.0f;
        macVar.g = 1.0f;
        int floor = (int) Math.floor(f2 * 0.5d);
        macVar.q = floor;
        macVar.r = floor;
        macVar.v = 2.0f;
        macVar.B = document2;
        if (k27.K2(document2, true) || k27.N4(document2)) {
            boolean K2 = k27.K2(document2, true);
            byte b2 = macVar.b;
            if (K2) {
                b = 1;
            } else {
                b = 4;
            }
            macVar.b = (byte) (b2 | b);
        }
        ArrayList arrayList2 = new ArrayList();
        jm6Var.p = arrayList2;
        arrayList2.add(macVar);
        jm6Var.t = 3000L;
        if (k27.K2(document2, true)) {
            ba4.G(y6c.t0);
            File J = ba4.J(document2, null, true, true);
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
                    jm6Var.t = (long) (d2 * d);
                } catch (Exception e) {
                    fa4.g(e, true);
                }
            }
        } else if (k27.N4(document2)) {
            jm6Var.t = (long) (k27.H0(document2) * 1000.0d);
        }
        PhotoViewer.r0().T1(dVar.getParentActivity(), null, dVar.getResourceProvider());
        PhotoViewer.r0().o1(arrayList, 0, 11, false, new Object(), mu1Var);
        PhotoViewer r0 = PhotoViewer.r0();
        boolean z = this.b;
        if (z) {
            document = document2;
        } else {
            document = null;
        }
        r0.V(document2, document, true, null);
        xv2 e2 = xv2.e();
        if (!z) {
            tL_messages_stickerSet = null;
        }
        e2.T = tL_messages_stickerSet;
    }

    private final void k() {
        int i;
        t7b t7bVar = (t7b) this.c;
        Bitmap bitmap = (Bitmap) this.d;
        File file = (File) this.e;
        f4b f4bVar = (f4b) this.f;
        try {
            Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
            if (this.b) {
                i = 95;
            } else {
                i = 99;
            }
            bitmap.compress(compressFormat, i, new FileOutputStream(file));
        } catch (Exception e) {
            fa4.g(e, true);
        }
        gl.c3(new r1b(t7bVar, f4bVar, file, (byte) 6));
    }

    private final void l() {
        ((p3c) this.c).z0((TLObject) this.d, this.b, (String) this.e, (TL_account.passwordInputSettings) this.f);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z77.run():void");
    }

    public z77(Object obj, Object obj2, Object obj3, Object obj4, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = z;
    }

    public z77(Object obj, Object obj2, Object obj3, boolean z, Object obj4, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z;
        this.f = obj4;
    }

    public z77(Object obj, Object obj2, boolean z, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
        this.e = obj3;
        this.f = obj4;
    }

    public z77(Object obj, boolean z, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.c = obj;
        this.b = z;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public z77(TLRPC.payments_GiveawayInfo payments_giveawayinfo, boolean z, String str, long j, TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway, d dVar) {
        this.a = (byte) 3;
        this.c = payments_giveawayinfo;
        this.b = z;
        this.d = str;
        this.f = tL_messageMediaGiveaway;
        this.e = dVar;
    }

    public z77(d dVar, Object obj, Object obj2, Object obj3, boolean z, byte b) {
        this.a = b;
        this.e = dVar;
        this.c = obj;
        this.d = obj2;
        this.f = obj3;
        this.b = z;
    }
}
