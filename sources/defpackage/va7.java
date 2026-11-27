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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.p;
public final class va7 implements Runnable {
    public final byte a;
    public final boolean b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public va7(r7a r7aVar, TLRPC.TL_messages_editMessage tL_messages_editMessage, r47 r47Var, e eVar, boolean z) {
        this.a = (byte) 20;
        this.c = r7aVar;
        this.d = tL_messages_editMessage;
        this.f = r47Var;
        this.e = eVar;
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
        uj3 uj3Var = ((fj3) this.c).a;
        int i9 = 0;
        if (tL_error == null) {
            TLRPC.User X1 = uj3Var.getMessagesController().X1(Long.valueOf(uj3Var.getUserConfig().e()));
            if (X1 == null) {
                X1 = uj3Var.getUserConfig().f();
                if (X1 != null) {
                    uj3Var.getMessagesController().i4(X1, false, false);
                } else {
                    return;
                }
            } else {
                uj3Var.getUserConfig().v(X1);
            }
            TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
            ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
            TLRPC.PhotoSize w = xb4.w(arrayList, 150, false, null, false);
            TLRPC.PhotoSize w2 = xb4.w(arrayList, 800, false, null, false);
            if (tL_photos_photo.photo.video_sizes.isEmpty()) {
                x = null;
            } else {
                x = xb4.x(1000, tL_photos_photo.photo.video_sizes);
            }
            TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
            X1.photo = tL_userProfilePhoto;
            tL_userProfilePhoto.photo_id = tL_photos_photo.photo.id;
            if (w != null) {
                tL_userProfilePhoto.photo_small = w.location;
            }
            if (w2 != null) {
                tL_userProfilePhoto.photo_big = w2.location;
            }
            if (w != null && uj3Var.i4 != null) {
                i6 = ((e) uj3Var).currentAccount;
                xb4.G(i6);
                File J = xb4.J(w, null, true, true);
                i7 = ((e) uj3Var).currentAccount;
                xb4.G(i7);
                xb4.J(uj3Var.i4, null, true, true).renameTo(J);
                StringBuilder sb = new StringBuilder();
                sb.append(uj3Var.i4.volume_id);
                sb.append("_");
                String l = uh9.l(sb, uj3Var.i4.local_id, "@50_50");
                StringBuilder sb2 = new StringBuilder();
                sb2.append(w.location.volume_id);
                sb2.append("_");
                String l2 = uh9.l(sb2, w.location.local_id, "@50_50");
                in5 z = in5.z();
                i8 = ((e) uj3Var).currentAccount;
                z.O(l, l2, jn5.m(i8, 1, X1));
            }
            if (x != null && str != null) {
                i5 = ((e) uj3Var).currentAccount;
                xb4.G(i5);
                new File(str).renameTo(xb4.J(x, "mp4", true, true));
            } else if (w2 != null && uj3Var.j4 != null) {
                i3 = ((e) uj3Var).currentAccount;
                xb4.G(i3);
                File J2 = xb4.J(w2, null, true, true);
                i4 = ((e) uj3Var).currentAccount;
                xb4.G(i4);
                xb4.J(uj3Var.j4, null, true, true).renameTo(J2);
            }
            uj3Var.getMessagesController().U0(X1.id);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(X1);
            i9 = 0;
            uj3Var.getMessagesStorage().j1(arrayList2, null, false, true);
            TLRPC.UserFull Y1 = uj3Var.getMessagesController().Y1(uj3Var.getUserConfig().e());
            if (Y1 != null) {
                Y1.profile_photo = tL_photos_photo.photo;
                uj3Var.getMessagesStorage().g2(Y1, false);
            }
            fileLocation = null;
        } else {
            fileLocation = null;
        }
        uj3Var.i4 = fileLocation;
        uj3Var.j4 = fileLocation;
        jn7 notificationCenter = uj3Var.getNotificationCenter();
        Object[] objArr = new Object[1];
        objArr[i9] = Integer.valueOf(uc7.r5);
        notificationCenter.k(2, objArr);
        uj3Var.getNotificationCenter().k(jn7.j0, new Object[i9]);
        uj3Var.getUserConfig().u(true);
        i = ((e) uj3Var).currentAccount;
        uc7.s1(i).v4(0L, "USERPIC_SETUP");
        uj3Var.q5();
        v21 v21Var = uj3Var.k4;
        if (v21Var != null) {
            m21 m21Var = (m21) v21Var.e;
            in inVar = m21Var.d;
            if (this.b) {
                i2 = 2131742424;
            } else {
                i2 = 2131742426;
            }
            inVar.c(ob6.M0(i2, null), true, true);
            m21Var.setProgress(1.0f);
            p11 button = m21Var.getButton();
            button.setScaleX(0.6f);
            button.setScaleY(0.6f);
            button.setAlpha(0.0f);
            button.setVisibility(0);
            ik8.t(button.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f), k43.h, 360L);
            v21 v21Var2 = uj3Var.k4;
            v21Var2.j = 5000;
            v21Var2.i(false);
            uj3Var.k4.i(true);
        }
    }

    private final void b() {
        w14 w14Var = (w14) this.c;
        String str = (String) this.d;
        String str2 = (String) this.e;
        TLObject tLObject = (TLObject) this.f;
        w14Var.a.remove(str2);
        o24 o24Var = w14Var.b;
        t14 t14Var = o24Var.k0;
        HashMap hashMap = o24Var.m0;
        boolean z = t14Var.w;
        boolean z2 = this.b;
        if (z && t14Var.x.equals(str)) {
            o24Var.k0.E(str, "", false, true, z2, str2, tLObject);
        } else if (z2 && (!(tLObject instanceof TLRPC.messages_BotResults) || ((TLRPC.messages_BotResults) tLObject).results.isEmpty())) {
            w14Var.a(str, false);
        } else if ((tLObject instanceof TLRPC.messages_BotResults) && !hashMap.containsKey(str2)) {
            hashMap.put(str2, (TLRPC.messages_BotResults) tLObject);
        }
    }

    private final void c() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.va7.c():void");
    }

    private final void d() {
        ((p) this.c).y0(this.b, (String) this.d, (String) this.e, (TL_account.updatePasswordSettings) this.f);
    }

    private final void e() {
        ((p) this.c).x0((TLRPC.TL_error) this.d, this.b, (TLObject) this.e, (String) this.f);
    }

    private final void f() {
        cj9.f((e) this.e, (Context) this.c, (vnb) this.d, (mi9) this.f, this.b);
    }

    private final void g() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.va7.g():void");
    }

    private final void h() {
        r7a r7aVar = (r7a) this.c;
        TLObject tLObject = (TLObject) this.e;
        d7a d7aVar = (d7a) this.f;
        r7aVar.h0(((TLRPC.Message) this.d).id, this.b);
        if (tLObject instanceof TLRPC.TL_messages_addPollAnswer) {
            TLRPC.PollAnswer pollAnswer = ((TLRPC.TL_messages_addPollAnswer) tLObject).answer;
            TLRPC.InputMedia inputMedia = pollAnswer.input_media;
            if (inputMedia instanceof TLRPC.TL_inputMediaPhoto) {
                pollAnswer.input_media = d7aVar.t;
            } else if (inputMedia instanceof TLRPC.TL_inputMediaDocument) {
                pollAnswer.input_media = d7aVar.t;
            }
        } else if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
            TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) tLObject;
            TLRPC.InputMedia inputMedia2 = tL_messages_sendMedia.media;
            if (inputMedia2 instanceof TLRPC.TL_inputMediaPhoto) {
                tL_messages_sendMedia.media = d7aVar.t;
            } else if (inputMedia2 instanceof TLRPC.TL_inputMediaDocument) {
                tL_messages_sendMedia.media = d7aVar.t;
            }
        } else if (tLObject instanceof TL_ephemeral.TL_sendMessage) {
            TLObject tLObject2 = d7aVar.c;
            if (tLObject2 instanceof TLRPC.TL_messages_sendMedia) {
                TLRPC.TL_messages_sendMedia tL_messages_sendMedia2 = (TLRPC.TL_messages_sendMedia) tLObject2;
                TLRPC.InputMedia inputMedia3 = tL_messages_sendMedia2.media;
                if (inputMedia3 instanceof TLRPC.TL_inputMediaPhoto) {
                    tL_messages_sendMedia2.media = d7aVar.t;
                } else if (inputMedia3 instanceof TLRPC.TL_inputMediaDocument) {
                    tL_messages_sendMedia2.media = d7aVar.t;
                }
            }
            TL_ephemeral.TL_sendMessage tL_sendMessage = (TL_ephemeral.TL_sendMessage) tLObject;
            TLRPC.InputMedia inputMedia4 = tL_sendMessage.media;
            if (inputMedia4 instanceof TLRPC.TL_inputMediaPhoto) {
                tL_sendMessage.media = d7aVar.t;
            } else if (inputMedia4 instanceof TLRPC.TL_inputMediaDocument) {
                tL_sendMessage.media = d7aVar.t;
            }
        } else if (tLObject instanceof TLRPC.TL_messages_editMessage) {
            TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) tLObject;
            TLRPC.InputMedia inputMedia5 = tL_messages_editMessage.media;
            if (inputMedia5 instanceof TLRPC.TL_inputMediaPhoto) {
                tL_messages_editMessage.media = d7aVar.t;
            } else if (inputMedia5 instanceof TLRPC.TL_inputMediaDocument) {
                tL_messages_editMessage.media = d7aVar.t;
            }
        }
        d7aVar.p = true;
        r7aVar.L(d7aVar, -1);
    }

    private final void i() {
        TLRPC.Message message;
        r7a r7aVar = (r7a) this.c;
        TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) this.d;
        r47 r47Var = (r47) this.f;
        int sendRequest = r7aVar.getConnectionsManager().sendRequest(tL_messages_editMessage, new gg2(r7aVar, this.b, r47Var, tL_messages_editMessage, (e) this.e, (byte) 4));
        if (r47Var != null && (message = r47Var.k) != null) {
            message.reqId = sendRequest;
        }
    }

    private final void j() {
        int i;
        byte b;
        TLRPC.Document document;
        double d;
        double d2;
        e eVar = (e) this.e;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.c;
        TLRPC.Document document2 = (TLRPC.Document) this.d;
        zu1 zu1Var = (zu1) this.f;
        File w = c8b.w(eVar.getCurrentAccount(), "webp");
        int o = xea.o();
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
            cc4.g(th, true);
        }
        createBitmap.recycle();
        ArrayList arrayList = new ArrayList();
        no6 no6Var = new no6(0, w.getAbsolutePath(), 0, false, 0, 0);
        arrayList.add(no6Var);
        mec mecVar = new mec();
        mecVar.a = (byte) 0;
        mecVar.C = tL_messages_stickerSet;
        xb4.G(yac.t0);
        mecVar.j = xb4.J(document2, null, true, true).getAbsolutePath();
        mecVar.c = 0.0f;
        mecVar.d = 0.0f;
        mecVar.f = 1.0f;
        mecVar.g = 1.0f;
        int floor = (int) Math.floor(f2 * 0.5d);
        mecVar.q = floor;
        mecVar.r = floor;
        mecVar.v = 2.0f;
        mecVar.B = document2;
        if (r47.K2(document2, true) || r47.N4(document2)) {
            boolean K2 = r47.K2(document2, true);
            byte b2 = mecVar.b;
            if (K2) {
                b = 1;
            } else {
                b = 4;
            }
            mecVar.b = (byte) (b2 | b);
        }
        ArrayList arrayList2 = new ArrayList();
        no6Var.p = arrayList2;
        arrayList2.add(mecVar);
        no6Var.t = 3000L;
        if (r47.K2(document2, true)) {
            xb4.G(yac.t0);
            File J = xb4.J(document2, null, true, true);
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
                    no6Var.t = (long) (d2 * d);
                } catch (Exception e) {
                    cc4.g(e, true);
                }
            }
        } else if (r47.N4(document2)) {
            no6Var.t = (long) (r47.H0(document2) * 1000.0d);
        }
        PhotoViewer.q0().T1(eVar.getParentActivity(), null, eVar.getResourceProvider());
        PhotoViewer.q0().o1(arrayList, 0, 11, false, new Object(), zu1Var);
        PhotoViewer q0 = PhotoViewer.q0();
        boolean z = this.b;
        if (z) {
            document = document2;
        } else {
            document = null;
        }
        q0.U(document2, document, true, null);
        rw2 e2 = rw2.e();
        if (!z) {
            tL_messages_stickerSet = null;
        }
        e2.T = tL_messages_stickerSet;
    }

    private final void k() {
        int i;
        rbb rbbVar = (rbb) this.c;
        Bitmap bitmap = (Bitmap) this.d;
        File file = (File) this.e;
        c8b c8bVar = (c8b) this.f;
        try {
            Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
            if (this.b) {
                i = 95;
            } else {
                i = 99;
            }
            bitmap.compress(compressFormat, i, new FileOutputStream(file));
        } catch (Exception e) {
            cc4.g(e, true);
        }
        hl.c3(new pwa(rbbVar, c8bVar, file, (byte) 15));
    }

    private final void l() {
        ((o7c) this.c).A0((TLObject) this.d, this.b, (String) this.e, (TL_account.passwordInputSettings) this.f);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.va7.run():void");
    }

    public va7(Object obj, Object obj2, Object obj3, Object obj4, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = z;
    }

    public va7(Object obj, Object obj2, Object obj3, boolean z, Object obj4, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z;
        this.f = obj4;
    }

    public va7(Object obj, Object obj2, boolean z, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
        this.e = obj3;
        this.f = obj4;
    }

    public va7(Object obj, boolean z, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.c = obj;
        this.b = z;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public va7(TLRPC.payments_GiveawayInfo payments_giveawayinfo, boolean z, String str, long j, TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway, e eVar) {
        this.a = (byte) 3;
        this.c = payments_giveawayinfo;
        this.b = z;
        this.d = str;
        this.f = tL_messageMediaGiveaway;
        this.e = eVar;
    }

    public va7(e eVar, Object obj, Object obj2, Object obj3, boolean z, byte b) {
        this.a = b;
        this.e = eVar;
        this.c = obj;
        this.d = obj2;
        this.f = obj3;
        this.b = z;
    }
}
