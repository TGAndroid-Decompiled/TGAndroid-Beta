package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class am implements Runnable {
    public final int f14646a = 0;
    public final wp f14647b;
    public final TLObject f14648c;
    public final long d;

    public am(wp wpVar, long j10, TLObject tLObject) {
        this.f14647b = wpVar;
        this.d = j10;
        this.f14648c = tLObject;
    }

    @Override
    public final void run() {
        int i10 = this.f14646a;
        long j10 = this.d;
        TLObject tLObject = this.f14648c;
        wp wpVar = this.f14647b;
        switch (i10) {
            case 0:
                wpVar.f19246t0.l(j10);
                if (tLObject != null) {
                    TLRPC.TL_messages_peerSettings tL_messages_peerSettings = (TLRPC.TL_messages_peerSettings) tLObject;
                    TLRPC.PeerSettings peerSettings = tL_messages_peerSettings.settings;
                    wpVar.V3(tL_messages_peerSettings.users, false);
                    wpVar.P3(tL_messages_peerSettings.chats, false);
                    wpVar.r4(j10, peerSettings);
                    return;
                }
                return;
            default:
                TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                TLRPC.User Z1 = wpVar.Z1(Long.valueOf(wpVar.getUserConfig().e()));
                if (Z1 == null) {
                    Z1 = wpVar.getUserConfig().f();
                    wpVar.U3(Z1, false, false);
                } else {
                    wpVar.getUserConfig().w(Z1);
                }
                if (Z1 != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Z1);
                    wpVar.getMessagesStorage().m1(arrayList, null, false, true);
                    if (tL_photos_photo.photo instanceof TLRPC.TL_photo) {
                        TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                        Z1.photo = tL_userProfilePhoto;
                        tL_userProfilePhoto.has_video = !tL_photos_photo.photo.video_sizes.isEmpty();
                        TLRPC.UserProfilePhoto userProfilePhoto = Z1.photo;
                        TLRPC.Photo photo = tL_photos_photo.photo;
                        userProfilePhoto.photo_id = photo.f19818id;
                        userProfilePhoto.photo_small = b8.w(photo.sizes, 150, false, null, false).location;
                        Z1.photo.photo_big = b8.w(tL_photos_photo.photo.sizes, 800, false, null, false).location;
                        Z1.photo.dc_id = tL_photos_photo.photo.dc_id;
                    } else {
                        Z1.photo = new TLRPC.TL_userProfilePhotoEmpty();
                    }
                    TLRPC.UserFull a2 = wpVar.a2(j10);
                    if (a2 != null) {
                        a2.profile_photo = tL_photos_photo.photo;
                        wpVar.getMessagesStorage().j2(a2, false);
                    }
                    wpVar.getUserConfig().f().photo = Z1.photo;
                    wpVar.U3(Z1, false, false);
                    wpVar.getNotificationCenter().k(46, new Object[0]);
                    wpVar.getNotificationCenter().k(2, Integer.valueOf(wp.D8));
                    wpVar.getNotificationCenter().k(2, 2);
                    wpVar.getUserConfig().v(true);
                    return;
                }
                return;
        }
    }

    public am(wp wpVar, TLObject tLObject, long j10) {
        this.f14647b = wpVar;
        this.f14648c = tLObject;
        this.d = j10;
    }
}
