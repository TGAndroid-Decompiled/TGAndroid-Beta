package bg;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.gc;
import org.telegram.messenger.hc;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
public abstract class n0 {
    public static void a(TLRPC.Photo photo, TLRPC.User user, boolean z9) {
        ArrayList<TLRPC.PhotoSize> arrayList = photo.sizes;
        boolean z10 = false;
        TLRPC.PhotoSize w10 = w7.w(arrayList, 100, false, null, false);
        TLRPC.PhotoSize w11 = w7.w(arrayList, 1000, false, null, false);
        user.flags |= 32;
        TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
        user.photo = tL_userProfilePhoto;
        tL_userProfilePhoto.personal = z9;
        tL_userProfilePhoto.photo_id = photo.f26980id;
        ArrayList<TLRPC.VideoSize> arrayList2 = photo.video_sizes;
        if (arrayList2 != null && arrayList2.size() > 0) {
            z10 = true;
        }
        tL_userProfilePhoto.has_video = z10;
        if (w10 != null) {
            user.photo.photo_small = w10.location;
        }
        if (w11 != null) {
            user.photo.photo_big = w11.location;
        }
    }

    public static void b(int i7, TLRPC.Photo photo, TLRPC.Photo photo2) {
        TLRPC.PhotoSize w10 = w7.w(photo.sizes, 100, false, null, false);
        TLRPC.PhotoSize w11 = w7.w(photo.sizes, 1000, false, null, false);
        TLRPC.PhotoSize w12 = w7.w(photo2.sizes, 100, false, null, false);
        TLRPC.PhotoSize w13 = w7.w(photo2.sizes, 1000, false, null, false);
        if (w12 != null && w10 != null) {
            w7.G(i7);
            File J = w7.J(w12, null, true, true);
            w7.G(i7);
            w7.J(w10, null, true, true).renameTo(J);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(w10.location.volume_id);
            sb2.append("_");
            String n10 = a8.p0.n(w10.location.local_id, "@50_50", sb2);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(w12.location.volume_id);
            sb3.append("_");
            gc.D().S(n10, a8.p0.n(w12.location.local_id, "@50_50", sb3), hc.i(w10, photo));
        }
        if (w13 != null && w11 != null) {
            w7.G(i7);
            File J2 = w7.J(w13, null, true, true);
            w7.G(i7);
            w7.J(w11, null, true, true).renameTo(J2);
            StringBuilder sb4 = new StringBuilder();
            sb4.append(w11.location.volume_id);
            sb4.append("_");
            String n11 = a8.p0.n(w11.location.local_id, "@150_150", sb4);
            StringBuilder sb5 = new StringBuilder();
            sb5.append(w13.location.volume_id);
            sb5.append("_");
            gc.D().S(n11, a8.p0.n(w13.location.local_id, "@150_150", sb5), hc.i(w11, photo));
        }
    }
}
