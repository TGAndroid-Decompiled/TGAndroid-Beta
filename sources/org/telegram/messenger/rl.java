package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rl implements Runnable {
    public final int f25180a = 0;
    public final hp f25181b;
    public final TLObject f25182c;
    public final long d;

    public rl(hp hpVar, long j10, TLObject tLObject) {
        this.f25181b = hpVar;
        this.d = j10;
        this.f25182c = tLObject;
    }

    @Override
    public final void run() {
        int i3 = this.f25180a;
        long j10 = this.d;
        TLObject tLObject = this.f25182c;
        hp hpVar = this.f25181b;
        switch (i3) {
            case 0:
                hpVar.f23131u0.l(j10);
                if (tLObject != null) {
                    TLRPC.TL_messages_peerSettings tL_messages_peerSettings = (TLRPC.TL_messages_peerSettings) tLObject;
                    TLRPC.PeerSettings peerSettings = tL_messages_peerSettings.settings;
                    hpVar.Y3(tL_messages_peerSettings.users, false);
                    hpVar.S3(tL_messages_peerSettings.chats, false);
                    hpVar.u4(j10, peerSettings);
                    return;
                }
                return;
            default:
                TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                TLRPC.User a22 = hpVar.a2(Long.valueOf(hpVar.getUserConfig().e()));
                if (a22 == null) {
                    a22 = hpVar.getUserConfig().f();
                    hpVar.X3(a22, false, false);
                } else {
                    hpVar.getUserConfig().w(a22);
                }
                if (a22 != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(a22);
                    hpVar.getMessagesStorage().m1(arrayList, null, false, true);
                    if (tL_photos_photo.photo instanceof TLRPC.TL_photo) {
                        TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                        a22.photo = tL_userProfilePhoto;
                        tL_userProfilePhoto.has_video = !tL_photos_photo.photo.video_sizes.isEmpty();
                        TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                        TLRPC.Photo photo = tL_photos_photo.photo;
                        userProfilePhoto.photo_id = photo.f27025id;
                        userProfilePhoto.photo_small = w7.w(photo.sizes, 150, false, null, false).location;
                        a22.photo.photo_big = w7.w(tL_photos_photo.photo.sizes, 800, false, null, false).location;
                        a22.photo.dc_id = tL_photos_photo.photo.dc_id;
                    } else {
                        a22.photo = new TLRPC.TL_userProfilePhotoEmpty();
                    }
                    TLRPC.UserFull b22 = hpVar.b2(j10);
                    if (b22 != null) {
                        b22.profile_photo = tL_photos_photo.photo;
                        hpVar.getMessagesStorage().j2(b22, false);
                    }
                    hpVar.getUserConfig().f().photo = a22.photo;
                    hpVar.X3(a22, false, false);
                    hpVar.getNotificationCenter().k(46, new Object[0]);
                    hpVar.getNotificationCenter().k(2, Integer.valueOf(hp.C8));
                    hpVar.getNotificationCenter().k(2, 2);
                    hpVar.getUserConfig().v(true);
                    return;
                }
                return;
        }
    }

    public rl(hp hpVar, TLObject tLObject, long j10) {
        this.f25181b = hpVar;
        this.f25182c = tLObject;
        this.d = j10;
    }
}
