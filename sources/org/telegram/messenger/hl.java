package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hl implements Runnable {
    public final int f24503a = 0;
    public final np f24504b;
    public final TLObject f24505c;
    public final long d;

    public hl(np npVar, long j3, TLObject tLObject) {
        this.f24504b = npVar;
        this.d = j3;
        this.f24505c = tLObject;
    }

    @Override
    public final void run() {
        int i7 = this.f24503a;
        long j3 = this.d;
        TLObject tLObject = this.f24505c;
        np npVar = this.f24504b;
        switch (i7) {
            case 0:
                npVar.f25970u0.l(j3);
                if (tLObject != null) {
                    TLRPC.TL_messages_peerSettings tL_messages_peerSettings = (TLRPC.TL_messages_peerSettings) tLObject;
                    TLRPC.PeerSettings peerSettings = tL_messages_peerSettings.settings;
                    npVar.f4(tL_messages_peerSettings.users, false);
                    npVar.Z3(tL_messages_peerSettings.chats, false);
                    npVar.D4(j3, peerSettings);
                    return;
                }
                return;
            default:
                TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                TLRPC.User c22 = npVar.c2(Long.valueOf(npVar.getUserConfig().e()));
                if (c22 == null) {
                    c22 = npVar.getUserConfig().f();
                    npVar.e4(c22, false, false);
                } else {
                    npVar.getUserConfig().w(c22);
                }
                if (c22 != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(c22);
                    npVar.getMessagesStorage().m1(arrayList, null, false, true);
                    if (tL_photos_photo.photo instanceof TLRPC.TL_photo) {
                        TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                        c22.photo = tL_userProfilePhoto;
                        tL_userProfilePhoto.has_video = !tL_photos_photo.photo.video_sizes.isEmpty();
                        TLRPC.UserProfilePhoto userProfilePhoto = c22.photo;
                        TLRPC.Photo photo = tL_photos_photo.photo;
                        userProfilePhoto.photo_id = photo.f28458id;
                        userProfilePhoto.photo_small = w7.w(photo.sizes, 150, false, null, false).location;
                        c22.photo.photo_big = w7.w(tL_photos_photo.photo.sizes, 800, false, null, false).location;
                        c22.photo.dc_id = tL_photos_photo.photo.dc_id;
                    } else {
                        c22.photo = new TLRPC.TL_userProfilePhotoEmpty();
                    }
                    TLRPC.UserFull d2 = npVar.d2(j3);
                    if (d2 != null) {
                        d2.profile_photo = tL_photos_photo.photo;
                        npVar.getMessagesStorage().j2(d2, false);
                    }
                    npVar.getUserConfig().f().photo = c22.photo;
                    npVar.e4(c22, false, false);
                    npVar.getNotificationCenter().k(46, new Object[0]);
                    npVar.getNotificationCenter().k(2, Integer.valueOf(np.I8));
                    npVar.getNotificationCenter().k(2, 2);
                    npVar.getUserConfig().v(true);
                    return;
                }
                return;
        }
    }

    public hl(np npVar, TLObject tLObject, long j3) {
        this.f24504b = npVar;
        this.f24505c = tLObject;
        this.d = j3;
    }
}
