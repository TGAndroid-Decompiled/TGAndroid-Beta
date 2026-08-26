package org.telegram.messenger.utils;

import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;

public abstract class PhotoUtilities {
    public static void applyPhotoToUser(TLRPC.Photo photo, TLRPC.User user, boolean z) {
        ArrayList<TLRPC.PhotoSize> arrayList = photo.sizes;
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList, 100);
        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(arrayList, 1000);
        user.flags |= 32;
        TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
        user.photo = tL_userProfilePhoto;
        tL_userProfilePhoto.personal = z;
        tL_userProfilePhoto.photo_id = photo.id;
        ArrayList<TLRPC.VideoSize> arrayList2 = photo.video_sizes;
        tL_userProfilePhoto.has_video = arrayList2 != null && arrayList2.size() > 0;
        if (closestPhotoSizeWithSize != null) {
            user.photo.photo_small = closestPhotoSizeWithSize.location;
        }
        if (closestPhotoSizeWithSize2 != null) {
            user.photo.photo_big = closestPhotoSizeWithSize2.location;
        }
    }

    public static void replacePhotoImagesInCache(int i, TLRPC.Photo photo, TLRPC.Photo photo2) {
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 100);
        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 1000);
        TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(photo2.sizes, 100);
        TLRPC.PhotoSize closestPhotoSizeWithSize4 = FileLoader.getClosestPhotoSizeWithSize(photo2.sizes, 1000);
        if (closestPhotoSizeWithSize3 != null && closestPhotoSizeWithSize != null) {
            FileLoader.getInstance(i).getPathToAttach(closestPhotoSizeWithSize, true).renameTo(FileLoader.getInstance(i).getPathToAttach(closestPhotoSizeWithSize3, true));
            StringBuilder sb = new StringBuilder();
            sb.append(closestPhotoSizeWithSize.location.volume_id);
            sb.append("_");
            String strM = Fragment$$ExternalSyntheticOutline0.m(closestPhotoSizeWithSize.location.local_id, "@50_50", sb);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(closestPhotoSizeWithSize3.location.volume_id);
            sb2.append("_");
            ImageLoader.getInstance().replaceImageInCache(strM, Fragment$$ExternalSyntheticOutline0.m(closestPhotoSizeWithSize3.location.local_id, "@50_50", sb2), ImageLocation.getForPhoto(closestPhotoSizeWithSize, photo), false);
        }
        if (closestPhotoSizeWithSize4 == null || closestPhotoSizeWithSize2 == null) {
            return;
        }
        FileLoader.getInstance(i).getPathToAttach(closestPhotoSizeWithSize2, true).renameTo(FileLoader.getInstance(i).getPathToAttach(closestPhotoSizeWithSize4, true));
        StringBuilder sb3 = new StringBuilder();
        sb3.append(closestPhotoSizeWithSize2.location.volume_id);
        sb3.append("_");
        String strM2 = Fragment$$ExternalSyntheticOutline0.m(closestPhotoSizeWithSize2.location.local_id, "@150_150", sb3);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(closestPhotoSizeWithSize4.location.volume_id);
        sb4.append("_");
        ImageLoader.getInstance().replaceImageInCache(strM2, Fragment$$ExternalSyntheticOutline0.m(closestPhotoSizeWithSize4.location.local_id, "@150_150", sb4), ImageLocation.getForPhoto(closestPhotoSizeWithSize2, photo), false);
    }
}
