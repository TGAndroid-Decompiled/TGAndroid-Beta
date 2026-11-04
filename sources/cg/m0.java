package cg;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.ac;
import org.telegram.messenger.w7;
import org.telegram.messenger.zb;
import org.telegram.tgnet.TLRPC;
public abstract class m0 {
    public static void a(TLRPC.Photo photo, TLRPC.User user, boolean z10) {
        ArrayList<TLRPC.PhotoSize> arrayList = photo.sizes;
        boolean z11 = false;
        TLRPC.PhotoSize w10 = w7.w(arrayList, 100, false, null, false);
        TLRPC.PhotoSize w11 = w7.w(arrayList, 1000, false, null, false);
        user.flags |= 32;
        TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
        user.photo = tL_userProfilePhoto;
        tL_userProfilePhoto.personal = z10;
        tL_userProfilePhoto.photo_id = photo.f27025id;
        ArrayList<TLRPC.VideoSize> arrayList2 = photo.video_sizes;
        if (arrayList2 != null && arrayList2.size() > 0) {
            z11 = true;
        }
        tL_userProfilePhoto.has_video = z11;
        if (w10 != null) {
            user.photo.photo_small = w10.location;
        }
        if (w11 != null) {
            user.photo.photo_big = w11.location;
        }
    }

    public static void b(int i3, TLRPC.Photo photo, TLRPC.Photo photo2) {
        TLRPC.PhotoSize w10 = w7.w(photo.sizes, 100, false, null, false);
        TLRPC.PhotoSize w11 = w7.w(photo.sizes, 1000, false, null, false);
        TLRPC.PhotoSize w12 = w7.w(photo2.sizes, 100, false, null, false);
        TLRPC.PhotoSize w13 = w7.w(photo2.sizes, 1000, false, null, false);
        if (w12 != null && w10 != null) {
            w7.G(i3);
            File K = w7.K(w12, null, true, true);
            w7.G(i3);
            w7.K(w10, null, true, true).renameTo(K);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(w10.location.volume_id);
            sb2.append("_");
            String o10 = a1.g.o(w10.location.local_id, "@50_50", sb2);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(w12.location.volume_id);
            sb3.append("_");
            zb.D().S(o10, a1.g.o(w12.location.local_id, "@50_50", sb3), ac.i(w10, photo));
        }
        if (w13 != null && w11 != null) {
            w7.G(i3);
            File K2 = w7.K(w13, null, true, true);
            w7.G(i3);
            w7.K(w11, null, true, true).renameTo(K2);
            StringBuilder sb4 = new StringBuilder();
            sb4.append(w11.location.volume_id);
            sb4.append("_");
            String o11 = a1.g.o(w11.location.local_id, "@150_150", sb4);
            StringBuilder sb5 = new StringBuilder();
            sb5.append(w13.location.volume_id);
            sb5.append("_");
            zb.D().S(o11, a1.g.o(w13.location.local_id, "@150_150", sb5), ac.i(w11, photo));
        }
    }
}
