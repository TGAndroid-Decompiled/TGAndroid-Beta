package jf;

import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;
public abstract class k0 {
    public static void a(TLRPC.Photo photo, TLRPC.User user, boolean z10) {
        boolean z11;
        ArrayList<TLRPC.PhotoSize> arrayList = photo.sizes;
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList, 100);
        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(arrayList, 1000);
        user.flags |= 32;
        TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
        user.photo = tL_userProfilePhoto;
        tL_userProfilePhoto.personal = z10;
        tL_userProfilePhoto.photo_id = photo.f22416id;
        ArrayList<TLRPC.VideoSize> arrayList2 = photo.video_sizes;
        if (arrayList2 != null && arrayList2.size() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        tL_userProfilePhoto.has_video = z11;
        if (closestPhotoSizeWithSize != null) {
            user.photo.photo_small = closestPhotoSizeWithSize.location;
        }
        if (closestPhotoSizeWithSize2 != null) {
            user.photo.photo_big = closestPhotoSizeWithSize2.location;
        }
    }

    public static void b(int i10, TLRPC.Photo photo, TLRPC.Photo photo2) {
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 100);
        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 1000);
        TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(photo2.sizes, 100);
        TLRPC.PhotoSize closestPhotoSizeWithSize4 = FileLoader.getClosestPhotoSizeWithSize(photo2.sizes, 1000);
        if (closestPhotoSizeWithSize3 != null && closestPhotoSizeWithSize != null) {
            FileLoader.getInstance(i10).getPathToAttach(closestPhotoSizeWithSize, true).renameTo(FileLoader.getInstance(i10).getPathToAttach(closestPhotoSizeWithSize3, true));
            StringBuilder sb2 = new StringBuilder();
            sb2.append(closestPhotoSizeWithSize.location.volume_id);
            sb2.append("_");
            String l10 = a4.w.l(closestPhotoSizeWithSize.location.local_id, "@50_50", sb2);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(closestPhotoSizeWithSize3.location.volume_id);
            sb3.append("_");
            ImageLoader.getInstance().replaceImageInCache(l10, a4.w.l(closestPhotoSizeWithSize3.location.local_id, "@50_50", sb3), ImageLocation.getForPhoto(closestPhotoSizeWithSize, photo), false);
        }
        if (closestPhotoSizeWithSize4 != null && closestPhotoSizeWithSize2 != null) {
            FileLoader.getInstance(i10).getPathToAttach(closestPhotoSizeWithSize2, true).renameTo(FileLoader.getInstance(i10).getPathToAttach(closestPhotoSizeWithSize4, true));
            StringBuilder sb4 = new StringBuilder();
            sb4.append(closestPhotoSizeWithSize2.location.volume_id);
            sb4.append("_");
            String l11 = a4.w.l(closestPhotoSizeWithSize2.location.local_id, "@150_150", sb4);
            StringBuilder sb5 = new StringBuilder();
            sb5.append(closestPhotoSizeWithSize4.location.volume_id);
            sb5.append("_");
            ImageLoader.getInstance().replaceImageInCache(l11, a4.w.l(closestPhotoSizeWithSize4.location.local_id, "@150_150", sb5), ImageLocation.getForPhoto(closestPhotoSizeWithSize2, photo), false);
        }
    }
}
