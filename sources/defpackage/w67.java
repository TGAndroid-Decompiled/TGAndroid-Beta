package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class w67 implements Runnable {
    public final byte a = 0;
    public final na7 b;
    public final TLObject c;
    public final long d;

    public w67(na7 na7Var, long j, TLObject tLObject) {
        this.b = na7Var;
        this.d = j;
        this.c = tLObject;
    }

    @Override
    public final void run() {
        byte b = this.a;
        long j = this.d;
        TLObject tLObject = this.c;
        na7 na7Var = this.b;
        switch (b) {
            case 0:
                na7Var.k0.l(j);
                if (tLObject != null) {
                    TLRPC.TL_messages_peerSettings tL_messages_peerSettings = (TLRPC.TL_messages_peerSettings) tLObject;
                    TLRPC.PeerSettings peerSettings = tL_messages_peerSettings.settings;
                    na7Var.a4(tL_messages_peerSettings.users, false);
                    na7Var.U3(tL_messages_peerSettings.chats, false);
                    na7Var.w4(j, peerSettings);
                    return;
                }
                return;
            default:
                TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                TLRPC.User V1 = na7Var.V1(Long.valueOf(na7Var.getUserConfig().e()));
                if (V1 == null) {
                    V1 = na7Var.getUserConfig().f();
                    na7Var.Z3(V1, false, false);
                } else {
                    na7Var.getUserConfig().v(V1);
                }
                if (V1 != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(V1);
                    na7Var.getMessagesStorage().j1(arrayList, null, false, true);
                    if (tL_photos_photo.photo instanceof TLRPC.TL_photo) {
                        TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                        V1.photo = tL_userProfilePhoto;
                        tL_userProfilePhoto.has_video = !tL_photos_photo.photo.video_sizes.isEmpty();
                        TLRPC.UserProfilePhoto userProfilePhoto = V1.photo;
                        TLRPC.Photo photo = tL_photos_photo.photo;
                        userProfilePhoto.photo_id = photo.id;
                        userProfilePhoto.photo_small = ba4.w(photo.sizes, 150, false, null, false).location;
                        V1.photo.photo_big = ba4.w(tL_photos_photo.photo.sizes, 800, false, null, false).location;
                        V1.photo.dc_id = tL_photos_photo.photo.dc_id;
                    } else {
                        V1.photo = new TLRPC.TL_userProfilePhotoEmpty();
                    }
                    TLRPC.UserFull W1 = na7Var.W1(j);
                    if (W1 != null) {
                        W1.profile_photo = tL_photos_photo.photo;
                        na7Var.getMessagesStorage().g2(W1, false);
                    }
                    na7Var.getUserConfig().f().photo = V1.photo;
                    na7Var.Z3(V1, false, false);
                    na7Var.getNotificationCenter().k(46, new Object[0]);
                    kk7 notificationCenter = na7Var.getNotificationCenter();
                    int i = na7.q5;
                    notificationCenter.k(2, 1050111);
                    na7Var.getNotificationCenter().k(2, 2);
                    na7Var.getUserConfig().u(true);
                    return;
                }
                return;
        }
    }

    public w67(na7 na7Var, TLObject tLObject, long j) {
        this.b = na7Var;
        this.c = tLObject;
        this.d = j;
    }
}
