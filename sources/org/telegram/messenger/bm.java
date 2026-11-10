package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bm implements Runnable {
    public final int f21709a = 0;
    public final qp f21710b;
    public final TLObject f21711c;
    public final long d;

    public bm(qp qpVar, long j3, TLObject tLObject) {
        this.f21710b = qpVar;
        this.d = j3;
        this.f21711c = tLObject;
    }

    @Override
    public final void run() {
        int i7 = this.f21709a;
        long j3 = this.d;
        TLObject tLObject = this.f21711c;
        qp qpVar = this.f21710b;
        switch (i7) {
            case 0:
                qpVar.f24902t0.l(j3);
                if (tLObject != null) {
                    TLRPC.TL_messages_peerSettings tL_messages_peerSettings = (TLRPC.TL_messages_peerSettings) tLObject;
                    TLRPC.PeerSettings peerSettings = tL_messages_peerSettings.settings;
                    qpVar.Y3(tL_messages_peerSettings.users, false);
                    qpVar.S3(tL_messages_peerSettings.chats, false);
                    qpVar.u4(j3, peerSettings);
                    return;
                }
                return;
            default:
                TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                TLRPC.User a22 = qpVar.a2(Long.valueOf(qpVar.getUserConfig().e()));
                if (a22 == null) {
                    a22 = qpVar.getUserConfig().f();
                    qpVar.X3(a22, false, false);
                } else {
                    qpVar.getUserConfig().w(a22);
                }
                if (a22 != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(a22);
                    qpVar.getMessagesStorage().m1(arrayList, null, false, true);
                    if (tL_photos_photo.photo instanceof TLRPC.TL_photo) {
                        TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                        a22.photo = tL_userProfilePhoto;
                        tL_userProfilePhoto.has_video = !tL_photos_photo.photo.video_sizes.isEmpty();
                        TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                        TLRPC.Photo photo = tL_photos_photo.photo;
                        userProfilePhoto.photo_id = photo.f26984id;
                        userProfilePhoto.photo_small = w7.w(photo.sizes, 150, false, null, false).location;
                        a22.photo.photo_big = w7.w(tL_photos_photo.photo.sizes, 800, false, null, false).location;
                        a22.photo.dc_id = tL_photos_photo.photo.dc_id;
                    } else {
                        a22.photo = new TLRPC.TL_userProfilePhotoEmpty();
                    }
                    TLRPC.UserFull b22 = qpVar.b2(j3);
                    if (b22 != null) {
                        b22.profile_photo = tL_photos_photo.photo;
                        qpVar.getMessagesStorage().j2(b22, false);
                    }
                    qpVar.getUserConfig().f().photo = a22.photo;
                    qpVar.X3(a22, false, false);
                    qpVar.getNotificationCenter().k(46, new Object[0]);
                    qpVar.getNotificationCenter().k(2, Integer.valueOf(qp.C8));
                    qpVar.getNotificationCenter().k(2, 2);
                    qpVar.getUserConfig().v(true);
                    return;
                }
                return;
        }
    }

    public bm(qp qpVar, TLObject tLObject, long j3) {
        this.f21710b = qpVar;
        this.f21711c = tLObject;
        this.d = j3;
    }
}
