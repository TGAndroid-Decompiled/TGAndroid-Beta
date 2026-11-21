package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gl implements Runnable {
    public final int f24300a = 0;
    public final mp f24301b;
    public final TLObject f24302c;
    public final long d;

    public gl(mp mpVar, long j3, TLObject tLObject) {
        this.f24301b = mpVar;
        this.d = j3;
        this.f24302c = tLObject;
    }

    @Override
    public final void run() {
        int i7 = this.f24300a;
        long j3 = this.d;
        TLObject tLObject = this.f24302c;
        mp mpVar = this.f24301b;
        switch (i7) {
            case 0:
                mpVar.f25799u0.l(j3);
                if (tLObject != null) {
                    TLRPC.TL_messages_peerSettings tL_messages_peerSettings = (TLRPC.TL_messages_peerSettings) tLObject;
                    TLRPC.PeerSettings peerSettings = tL_messages_peerSettings.settings;
                    mpVar.f4(tL_messages_peerSettings.users, false);
                    mpVar.Z3(tL_messages_peerSettings.chats, false);
                    mpVar.D4(j3, peerSettings);
                    return;
                }
                return;
            default:
                TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                TLRPC.User c22 = mpVar.c2(Long.valueOf(mpVar.getUserConfig().e()));
                if (c22 == null) {
                    c22 = mpVar.getUserConfig().f();
                    mpVar.e4(c22, false, false);
                } else {
                    mpVar.getUserConfig().w(c22);
                }
                if (c22 != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(c22);
                    mpVar.getMessagesStorage().m1(arrayList, null, false, true);
                    if (tL_photos_photo.photo instanceof TLRPC.TL_photo) {
                        TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                        c22.photo = tL_userProfilePhoto;
                        tL_userProfilePhoto.has_video = !tL_photos_photo.photo.video_sizes.isEmpty();
                        TLRPC.UserProfilePhoto userProfilePhoto = c22.photo;
                        TLRPC.Photo photo = tL_photos_photo.photo;
                        userProfilePhoto.photo_id = photo.f28455id;
                        userProfilePhoto.photo_small = w7.w(photo.sizes, 150, false, null, false).location;
                        c22.photo.photo_big = w7.w(tL_photos_photo.photo.sizes, 800, false, null, false).location;
                        c22.photo.dc_id = tL_photos_photo.photo.dc_id;
                    } else {
                        c22.photo = new TLRPC.TL_userProfilePhotoEmpty();
                    }
                    TLRPC.UserFull d2 = mpVar.d2(j3);
                    if (d2 != null) {
                        d2.profile_photo = tL_photos_photo.photo;
                        mpVar.getMessagesStorage().j2(d2, false);
                    }
                    mpVar.getUserConfig().f().photo = c22.photo;
                    mpVar.e4(c22, false, false);
                    mpVar.getNotificationCenter().k(46, new Object[0]);
                    mpVar.getNotificationCenter().k(2, Integer.valueOf(mp.I8));
                    mpVar.getNotificationCenter().k(2, 2);
                    mpVar.getUserConfig().v(true);
                    return;
                }
                return;
        }
    }

    public gl(mp mpVar, TLObject tLObject, long j3) {
        this.f24301b = mpVar;
        this.f24302c = tLObject;
        this.d = j3;
    }
}
