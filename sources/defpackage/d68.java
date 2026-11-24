package defpackage;

import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public abstract class d68 {
    public static void a(TLRPC.Photo photo, TLRPC.User user, boolean z) {
        ArrayList<TLRPC.PhotoSize> arrayList = photo.sizes;
        boolean z2 = false;
        TLRPC.PhotoSize w = ba4.w(arrayList, 100, false, null, false);
        TLRPC.PhotoSize w2 = ba4.w(arrayList, 1000, false, null, false);
        user.flags |= 32;
        TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
        user.photo = tL_userProfilePhoto;
        tL_userProfilePhoto.personal = z;
        tL_userProfilePhoto.photo_id = photo.id;
        ArrayList<TLRPC.VideoSize> arrayList2 = photo.video_sizes;
        if (arrayList2 != null && arrayList2.size() > 0) {
            z2 = true;
        }
        tL_userProfilePhoto.has_video = z2;
        if (w != null) {
            user.photo.photo_small = w.location;
        }
        if (w2 != null) {
            user.photo.photo_big = w2.location;
        }
    }

    public static void b(int i, TLRPC.Photo photo, TLRPC.Photo photo2) {
        TLRPC.PhotoSize w = ba4.w(photo.sizes, 100, false, null, false);
        TLRPC.PhotoSize w2 = ba4.w(photo.sizes, 1000, false, null, false);
        TLRPC.PhotoSize w3 = ba4.w(photo2.sizes, 100, false, null, false);
        TLRPC.PhotoSize w4 = ba4.w(photo2.sizes, 1000, false, null, false);
        if (w3 != null && w != null) {
            ba4.G(i);
            File J = ba4.J(w3, null, true, true);
            ba4.G(i);
            ba4.J(w, null, true, true).renameTo(J);
            StringBuilder sb = new StringBuilder();
            sb.append(w.location.volume_id);
            sb.append("_");
            String l = de9.l(sb, w.location.local_id, "@50_50");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(w3.location.volume_id);
            sb2.append("_");
            fl5.z().O(l, de9.l(sb2, w3.location.local_id, "@50_50"), gl5.i(w, photo));
        }
        if (w4 != null && w2 != null) {
            ba4.G(i);
            File J2 = ba4.J(w4, null, true, true);
            ba4.G(i);
            ba4.J(w2, null, true, true).renameTo(J2);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(w2.location.volume_id);
            sb3.append("_");
            String l2 = de9.l(sb3, w2.location.local_id, "@150_150");
            StringBuilder sb4 = new StringBuilder();
            sb4.append(w4.location.volume_id);
            sb4.append("_");
            fl5.z().O(l2, de9.l(sb4, w4.location.local_id, "@150_150"), gl5.i(w2, photo));
        }
    }
}
