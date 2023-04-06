package org.telegram.messenger.utils;

import android.os.Bundle;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$FileLocation;
import org.telegram.tgnet.TLRPC$InputFile;
import org.telegram.tgnet.TLRPC$Photo;
import org.telegram.tgnet.TLRPC$PhotoSize;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_photo;
import org.telegram.tgnet.TLRPC$TL_photos_photo;
import org.telegram.tgnet.TLRPC$TL_photos_uploadProfilePhoto;
import org.telegram.tgnet.TLRPC$TL_userProfilePhoto;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.TLRPC$UserFull;
import org.telegram.tgnet.TLRPC$VideoSize;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ImageUpdater;
import org.telegram.ui.ProfileActivity;
public class PhotoUtilities {
    public static void applyPhotoToUser(TLRPC$Photo tLRPC$Photo, TLRPC$User tLRPC$User, boolean z) {
        ArrayList<TLRPC$PhotoSize> arrayList = tLRPC$Photo.sizes;
        TLRPC$PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList, 100);
        TLRPC$PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(arrayList, 1000);
        tLRPC$User.flags |= 32;
        TLRPC$TL_userProfilePhoto tLRPC$TL_userProfilePhoto = new TLRPC$TL_userProfilePhoto();
        tLRPC$User.photo = tLRPC$TL_userProfilePhoto;
        tLRPC$TL_userProfilePhoto.personal = z;
        tLRPC$TL_userProfilePhoto.photo_id = tLRPC$Photo.id;
        ArrayList<TLRPC$VideoSize> arrayList2 = tLRPC$Photo.video_sizes;
        tLRPC$TL_userProfilePhoto.has_video = arrayList2 != null && arrayList2.size() > 0;
        if (closestPhotoSizeWithSize != null) {
            tLRPC$User.photo.photo_small = closestPhotoSizeWithSize.location;
        }
        if (closestPhotoSizeWithSize2 != null) {
            tLRPC$User.photo.photo_big = closestPhotoSizeWithSize2.location;
        }
    }

    public static void setImageAsAvatar(MediaController.PhotoEntry photoEntry, BaseFragment baseFragment, final Runnable runnable) {
        final INavigationLayout parentLayout = baseFragment.getParentLayout();
        final int currentAccount = baseFragment.getCurrentAccount();
        final ImageUpdater imageUpdater = new ImageUpdater(true, 0, true);
        imageUpdater.parentFragment = baseFragment;
        imageUpdater.processEntry(photoEntry);
        imageUpdater.setDelegate(new ImageUpdater.ImageUpdaterDelegate() {
            @Override
            public boolean canFinishFragment() {
                return ImageUpdater.ImageUpdaterDelegate.CC.$default$canFinishFragment(this);
            }

            @Override
            public void didStartUpload(boolean z) {
                ImageUpdater.ImageUpdaterDelegate.CC.$default$didStartUpload(this, z);
            }

            @Override
            public void didUploadFailed() {
                ImageUpdater.ImageUpdaterDelegate.CC.$default$didUploadFailed(this);
            }

            @Override
            public final void didUploadPhoto(TLRPC$InputFile tLRPC$InputFile, TLRPC$InputFile tLRPC$InputFile2, double d, String str, TLRPC$PhotoSize tLRPC$PhotoSize, TLRPC$PhotoSize tLRPC$PhotoSize2, boolean z, TLRPC$VideoSize tLRPC$VideoSize) {
                PhotoUtilities.lambda$setImageAsAvatar$4(currentAccount, runnable, parentLayout, imageUpdater, tLRPC$InputFile, tLRPC$InputFile2, d, str, tLRPC$PhotoSize, tLRPC$PhotoSize2, z, tLRPC$VideoSize);
            }

            @Override
            public String getInitialSearchString() {
                return ImageUpdater.ImageUpdaterDelegate.CC.$default$getInitialSearchString(this);
            }

            @Override
            public void onUploadProgressChanged(float f) {
                ImageUpdater.ImageUpdaterDelegate.CC.$default$onUploadProgressChanged(this, f);
            }
        });
    }

    public static void lambda$setImageAsAvatar$4(final int i, final Runnable runnable, final INavigationLayout iNavigationLayout, final ImageUpdater imageUpdater, final TLRPC$InputFile tLRPC$InputFile, final TLRPC$InputFile tLRPC$InputFile2, final double d, String str, final TLRPC$PhotoSize tLRPC$PhotoSize, final TLRPC$PhotoSize tLRPC$PhotoSize2, boolean z, final TLRPC$VideoSize tLRPC$VideoSize) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                PhotoUtilities.lambda$setImageAsAvatar$3(TLRPC$InputFile.this, tLRPC$InputFile2, d, tLRPC$VideoSize, i, tLRPC$PhotoSize2, tLRPC$PhotoSize, runnable, iNavigationLayout, imageUpdater);
            }
        });
    }

    public static void lambda$setImageAsAvatar$3(TLRPC$InputFile tLRPC$InputFile, TLRPC$InputFile tLRPC$InputFile2, double d, TLRPC$VideoSize tLRPC$VideoSize, final int i, final TLRPC$PhotoSize tLRPC$PhotoSize, final TLRPC$PhotoSize tLRPC$PhotoSize2, final Runnable runnable, final INavigationLayout iNavigationLayout, ImageUpdater imageUpdater) {
        TLRPC$TL_photos_uploadProfilePhoto tLRPC$TL_photos_uploadProfilePhoto = new TLRPC$TL_photos_uploadProfilePhoto();
        if (tLRPC$InputFile != null) {
            tLRPC$TL_photos_uploadProfilePhoto.file = tLRPC$InputFile;
            tLRPC$TL_photos_uploadProfilePhoto.flags |= 1;
        }
        if (tLRPC$InputFile2 != null) {
            tLRPC$TL_photos_uploadProfilePhoto.video = tLRPC$InputFile2;
            int i2 = tLRPC$TL_photos_uploadProfilePhoto.flags | 2;
            tLRPC$TL_photos_uploadProfilePhoto.flags = i2;
            tLRPC$TL_photos_uploadProfilePhoto.video_start_ts = d;
            tLRPC$TL_photos_uploadProfilePhoto.flags = i2 | 4;
        }
        if (tLRPC$VideoSize != null) {
            tLRPC$TL_photos_uploadProfilePhoto.video_emoji_markup = tLRPC$VideoSize;
            tLRPC$TL_photos_uploadProfilePhoto.flags |= 16;
        }
        ConnectionsManager.getInstance(i).sendRequest(tLRPC$TL_photos_uploadProfilePhoto, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                PhotoUtilities.lambda$setImageAsAvatar$2(i, tLRPC$PhotoSize, tLRPC$PhotoSize2, runnable, iNavigationLayout, tLObject, tLRPC$TL_error);
            }
        });
        imageUpdater.onPause();
    }

    public static void lambda$setImageAsAvatar$2(final int i, final TLRPC$PhotoSize tLRPC$PhotoSize, final TLRPC$PhotoSize tLRPC$PhotoSize2, final Runnable runnable, final INavigationLayout iNavigationLayout, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                PhotoUtilities.lambda$setImageAsAvatar$1(TLObject.this, i, tLRPC$PhotoSize, tLRPC$PhotoSize2, runnable, iNavigationLayout);
            }
        });
    }

    public static void lambda$setImageAsAvatar$1(TLObject tLObject, final int i, TLRPC$PhotoSize tLRPC$PhotoSize, TLRPC$PhotoSize tLRPC$PhotoSize2, Runnable runnable, final INavigationLayout iNavigationLayout) {
        if (tLObject instanceof TLRPC$TL_photos_photo) {
            TLRPC$TL_photos_photo tLRPC$TL_photos_photo = (TLRPC$TL_photos_photo) tLObject;
            MessagesController.getInstance(i).putUsers(tLRPC$TL_photos_photo.users, false);
            TLRPC$User user = MessagesController.getInstance(i).getUser(Long.valueOf(UserConfig.getInstance(i).clientUserId));
            TLRPC$Photo tLRPC$Photo = tLRPC$TL_photos_photo.photo;
            if (!(tLRPC$Photo instanceof TLRPC$TL_photo) || user == null) {
                return;
            }
            TLRPC$PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(tLRPC$Photo.sizes, 100);
            TLRPC$PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(tLRPC$TL_photos_photo.photo.sizes, 1000);
            if (closestPhotoSizeWithSize != null && tLRPC$PhotoSize != null && tLRPC$PhotoSize.location != null) {
                FileLoader.getInstance(i).getPathToAttach(tLRPC$PhotoSize.location, true).renameTo(FileLoader.getInstance(i).getPathToAttach(closestPhotoSizeWithSize, true));
                ImageLoader.getInstance().replaceImageInCache(tLRPC$PhotoSize.location.volume_id + "_" + tLRPC$PhotoSize.location.local_id + "@50_50", closestPhotoSizeWithSize.location.volume_id + "_" + closestPhotoSizeWithSize.location.local_id + "@50_50", ImageLocation.getForUser(user, 1), false);
            }
            if (closestPhotoSizeWithSize2 != null && tLRPC$PhotoSize2 != null && tLRPC$PhotoSize2.location != null) {
                FileLoader.getInstance(i).getPathToAttach(tLRPC$PhotoSize2.location, true).renameTo(FileLoader.getInstance(i).getPathToAttach(closestPhotoSizeWithSize2, true));
            }
            applyPhotoToUser(tLRPC$TL_photos_photo.photo, user, false);
            UserConfig.getInstance(i).setCurrentUser(user);
            UserConfig.getInstance(i).saveConfig(true);
            if (runnable != null) {
                runnable.run();
            }
            BulletinFactory.of(iNavigationLayout.getLastFragment()).createUsersBulletin(Collections.singletonList(user), AndroidUtilities.replaceTags(LocaleController.getString("ApplyAvatarHintTitle", R.string.ApplyAvatarHintTitle)), AndroidUtilities.replaceSingleTag(LocaleController.getString("ApplyAvatarHint", R.string.ApplyAvatarHint), new Runnable() {
                @Override
                public final void run() {
                    PhotoUtilities.lambda$setImageAsAvatar$0(i, iNavigationLayout);
                }
            })).show();
        }
    }

    public static void lambda$setImageAsAvatar$0(int i, INavigationLayout iNavigationLayout) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", UserConfig.getInstance(i).clientUserId);
        iNavigationLayout.getLastFragment().presentFragment(new ProfileActivity(bundle));
    }

    public static void replacePhotoImagesInCache(int i, TLRPC$Photo tLRPC$Photo, TLRPC$Photo tLRPC$Photo2) {
        TLRPC$PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(tLRPC$Photo.sizes, 100);
        TLRPC$PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(tLRPC$Photo.sizes, 1000);
        TLRPC$PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(tLRPC$Photo2.sizes, 100);
        TLRPC$PhotoSize closestPhotoSizeWithSize4 = FileLoader.getClosestPhotoSizeWithSize(tLRPC$Photo2.sizes, 1000);
        if (closestPhotoSizeWithSize3 != null && closestPhotoSizeWithSize != null) {
            FileLoader.getInstance(i).getPathToAttach(closestPhotoSizeWithSize, true).renameTo(FileLoader.getInstance(i).getPathToAttach(closestPhotoSizeWithSize3, true));
            ImageLoader.getInstance().replaceImageInCache(closestPhotoSizeWithSize.location.volume_id + "_" + closestPhotoSizeWithSize.location.local_id + "@50_50", closestPhotoSizeWithSize3.location.volume_id + "_" + closestPhotoSizeWithSize3.location.local_id + "@50_50", ImageLocation.getForPhoto(closestPhotoSizeWithSize, tLRPC$Photo), false);
        }
        if (closestPhotoSizeWithSize4 == null || closestPhotoSizeWithSize2 == null) {
            return;
        }
        FileLoader.getInstance(i).getPathToAttach(closestPhotoSizeWithSize2, true).renameTo(FileLoader.getInstance(i).getPathToAttach(closestPhotoSizeWithSize4, true));
        ImageLoader.getInstance().replaceImageInCache(closestPhotoSizeWithSize2.location.volume_id + "_" + closestPhotoSizeWithSize2.location.local_id + "@150_150", closestPhotoSizeWithSize4.location.volume_id + "_" + closestPhotoSizeWithSize4.location.local_id + "@150_150", ImageLocation.getForPhoto(closestPhotoSizeWithSize2, tLRPC$Photo), false);
    }

    public static void applyPhotoToUser(TLRPC$PhotoSize tLRPC$PhotoSize, TLRPC$PhotoSize tLRPC$PhotoSize2, boolean z, TLRPC$User tLRPC$User, boolean z2) {
        tLRPC$User.flags |= 32;
        TLRPC$TL_userProfilePhoto tLRPC$TL_userProfilePhoto = new TLRPC$TL_userProfilePhoto();
        tLRPC$User.photo = tLRPC$TL_userProfilePhoto;
        tLRPC$TL_userProfilePhoto.personal = z2;
        tLRPC$TL_userProfilePhoto.photo_id = 0L;
        tLRPC$TL_userProfilePhoto.has_video = z;
        if (tLRPC$PhotoSize != null) {
            tLRPC$TL_userProfilePhoto.photo_small = tLRPC$PhotoSize.location;
        }
        if (tLRPC$PhotoSize2 != null) {
            tLRPC$TL_userProfilePhoto.photo_big = tLRPC$PhotoSize2.location;
        }
    }

    public static void showAvatartConstructorForUpdateUserPhoto(final ChatActivity chatActivity, TLRPC$VideoSize tLRPC$VideoSize) {
        ImageUpdater imageUpdater = new ImageUpdater(true, 0, true);
        imageUpdater.parentFragment = chatActivity;
        imageUpdater.showAvatarConstructor(tLRPC$VideoSize);
        final TLRPC$FileLocation[] tLRPC$FileLocationArr = new TLRPC$FileLocation[1];
        final TLRPC$FileLocation[] tLRPC$FileLocationArr2 = new TLRPC$FileLocation[1];
        final long clientUserId = chatActivity.getUserConfig().getClientUserId();
        imageUpdater.setDelegate(new ImageUpdater.ImageUpdaterDelegate() {
            @Override
            public boolean canFinishFragment() {
                return ImageUpdater.ImageUpdaterDelegate.CC.$default$canFinishFragment(this);
            }

            @Override
            public void didStartUpload(boolean z) {
                ImageUpdater.ImageUpdaterDelegate.CC.$default$didStartUpload(this, z);
            }

            @Override
            public void didUploadFailed() {
                ImageUpdater.ImageUpdaterDelegate.CC.$default$didUploadFailed(this);
            }

            @Override
            public final void didUploadPhoto(TLRPC$InputFile tLRPC$InputFile, TLRPC$InputFile tLRPC$InputFile2, double d, String str, TLRPC$PhotoSize tLRPC$PhotoSize, TLRPC$PhotoSize tLRPC$PhotoSize2, boolean z, TLRPC$VideoSize tLRPC$VideoSize2) {
                PhotoUtilities.lambda$showAvatartConstructorForUpdateUserPhoto$8(ChatActivity.this, tLRPC$FileLocationArr, tLRPC$FileLocationArr2, clientUserId, tLRPC$InputFile, tLRPC$InputFile2, d, str, tLRPC$PhotoSize, tLRPC$PhotoSize2, z, tLRPC$VideoSize2);
            }

            @Override
            public String getInitialSearchString() {
                return ImageUpdater.ImageUpdaterDelegate.CC.$default$getInitialSearchString(this);
            }

            @Override
            public void onUploadProgressChanged(float f) {
                ImageUpdater.ImageUpdaterDelegate.CC.$default$onUploadProgressChanged(this, f);
            }
        });
    }

    public static void lambda$showAvatartConstructorForUpdateUserPhoto$7(final ChatActivity chatActivity, final TLRPC$FileLocation[] tLRPC$FileLocationArr, final String str, final TLRPC$FileLocation[] tLRPC$FileLocationArr2, final long j, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                PhotoUtilities.lambda$showAvatartConstructorForUpdateUserPhoto$6(TLRPC$TL_error.this, chatActivity, tLObject, tLRPC$FileLocationArr, str, tLRPC$FileLocationArr2, j);
            }
        });
    }

    public static void lambda$showAvatartConstructorForUpdateUserPhoto$6(TLRPC$TL_error tLRPC$TL_error, final ChatActivity chatActivity, TLObject tLObject, TLRPC$FileLocation[] tLRPC$FileLocationArr, String str, TLRPC$FileLocation[] tLRPC$FileLocationArr2, final long j) {
        if (tLRPC$TL_error == null) {
            TLRPC$User user = chatActivity.getMessagesController().getUser(Long.valueOf(chatActivity.getUserConfig().getClientUserId()));
            TLRPC$TL_photos_photo tLRPC$TL_photos_photo = (TLRPC$TL_photos_photo) tLObject;
            ArrayList<TLRPC$PhotoSize> arrayList = tLRPC$TL_photos_photo.photo.sizes;
            TLRPC$PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList, ImageReceiver.DEFAULT_CROSSFADE_DURATION);
            TLRPC$PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(arrayList, 800);
            TLRPC$VideoSize closestVideoSizeWithSize = tLRPC$TL_photos_photo.photo.video_sizes.isEmpty() ? null : FileLoader.getClosestVideoSizeWithSize(tLRPC$TL_photos_photo.photo.video_sizes, 1000);
            TLRPC$TL_userProfilePhoto tLRPC$TL_userProfilePhoto = new TLRPC$TL_userProfilePhoto();
            user.photo = tLRPC$TL_userProfilePhoto;
            tLRPC$TL_userProfilePhoto.photo_id = tLRPC$TL_photos_photo.photo.id;
            if (closestPhotoSizeWithSize != null) {
                tLRPC$TL_userProfilePhoto.photo_small = closestPhotoSizeWithSize.location;
            }
            if (closestPhotoSizeWithSize2 != null) {
                tLRPC$TL_userProfilePhoto.photo_big = closestPhotoSizeWithSize2.location;
            }
            if (closestPhotoSizeWithSize != null && tLRPC$FileLocationArr[0] != null) {
                FileLoader.getInstance(chatActivity.getCurrentAccount()).getPathToAttach(tLRPC$FileLocationArr[0], true).renameTo(FileLoader.getInstance(chatActivity.getCurrentAccount()).getPathToAttach(closestPhotoSizeWithSize, true));
                ImageLoader.getInstance().replaceImageInCache(tLRPC$FileLocationArr[0].volume_id + "_" + tLRPC$FileLocationArr[0].local_id + "@50_50", closestPhotoSizeWithSize.location.volume_id + "_" + closestPhotoSizeWithSize.location.local_id + "@50_50", ImageLocation.getForUserOrChat(user, 1), false);
            }
            if (closestVideoSizeWithSize != null && str != null) {
                new File(str).renameTo(FileLoader.getInstance(chatActivity.getCurrentAccount()).getPathToAttach(closestVideoSizeWithSize, "mp4", true));
            } else if (closestPhotoSizeWithSize2 != null && tLRPC$FileLocationArr2[0] != null) {
                FileLoader.getInstance(chatActivity.getCurrentAccount()).getPathToAttach(tLRPC$FileLocationArr2[0], true).renameTo(FileLoader.getInstance(chatActivity.getCurrentAccount()).getPathToAttach(closestPhotoSizeWithSize2, true));
            }
            chatActivity.getMessagesStorage().addDialogPhoto(user.id, tLRPC$TL_photos_photo.photo);
            ArrayList<TLRPC$User> arrayList2 = new ArrayList<>();
            arrayList2.add(user);
            chatActivity.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
            TLRPC$UserFull userFull = chatActivity.getMessagesController().getUserFull(j);
            userFull.profile_photo = tLRPC$TL_photos_photo.photo;
            chatActivity.getMessagesStorage().updateUserInfo(userFull, false);
            BulletinFactory.of(chatActivity).createUsersBulletin(Collections.singletonList(user), AndroidUtilities.replaceTags(LocaleController.getString("ApplyAvatarHintTitle", R.string.ApplyAvatarHintTitle)), AndroidUtilities.replaceSingleTag(LocaleController.getString("ApplyAvatarHint", R.string.ApplyAvatarHint), new Runnable() {
                @Override
                public final void run() {
                    PhotoUtilities.lambda$showAvatartConstructorForUpdateUserPhoto$5(j, chatActivity);
                }
            })).show();
        }
    }

    public static void lambda$showAvatartConstructorForUpdateUserPhoto$5(long j, ChatActivity chatActivity) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", j);
        chatActivity.presentFragment(new ProfileActivity(bundle));
    }

    public static void lambda$showAvatartConstructorForUpdateUserPhoto$8(final ChatActivity chatActivity, final TLRPC$FileLocation[] tLRPC$FileLocationArr, final TLRPC$FileLocation[] tLRPC$FileLocationArr2, final long j, TLRPC$InputFile tLRPC$InputFile, TLRPC$InputFile tLRPC$InputFile2, double d, final String str, TLRPC$PhotoSize tLRPC$PhotoSize, TLRPC$PhotoSize tLRPC$PhotoSize2, boolean z, TLRPC$VideoSize tLRPC$VideoSize) {
        if (tLRPC$InputFile != null || tLRPC$InputFile2 != null || tLRPC$VideoSize != null) {
            TLRPC$TL_photos_uploadProfilePhoto tLRPC$TL_photos_uploadProfilePhoto = new TLRPC$TL_photos_uploadProfilePhoto();
            if (tLRPC$InputFile != null) {
                tLRPC$TL_photos_uploadProfilePhoto.file = tLRPC$InputFile;
                tLRPC$TL_photos_uploadProfilePhoto.flags |= 1;
            }
            if (tLRPC$InputFile2 != null) {
                tLRPC$TL_photos_uploadProfilePhoto.video = tLRPC$InputFile2;
                int i = tLRPC$TL_photos_uploadProfilePhoto.flags | 2;
                tLRPC$TL_photos_uploadProfilePhoto.flags = i;
                tLRPC$TL_photos_uploadProfilePhoto.video_start_ts = d;
                tLRPC$TL_photos_uploadProfilePhoto.flags = i | 4;
            }
            if (tLRPC$VideoSize != null) {
                tLRPC$TL_photos_uploadProfilePhoto.video_emoji_markup = tLRPC$VideoSize;
                tLRPC$TL_photos_uploadProfilePhoto.flags |= 16;
            }
            chatActivity.getConnectionsManager().sendRequest(tLRPC$TL_photos_uploadProfilePhoto, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    PhotoUtilities.lambda$showAvatartConstructorForUpdateUserPhoto$7(ChatActivity.this, tLRPC$FileLocationArr, str, tLRPC$FileLocationArr2, j, tLObject, tLRPC$TL_error);
                }
            });
            return;
        }
        tLRPC$FileLocationArr[0] = tLRPC$PhotoSize2.location;
        tLRPC$FileLocationArr2[0] = tLRPC$PhotoSize.location;
    }
}
