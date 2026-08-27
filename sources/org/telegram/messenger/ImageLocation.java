package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public class ImageLocation {
    public static final int TYPE_BIG = 0;
    public static final int TYPE_SMALL = 1;
    public static final int TYPE_STRIPPED = 2;
    public static final int TYPE_VIDEO_BIG = 4;
    public static final int TYPE_VIDEO_SMALL = 3;
    public long access_hash;
    public long currentSize;
    public int dc_id;
    public TLRPC.Document document;
    public long documentId;
    public byte[] file_reference;
    public int imageType;
    public org.telegram.ui.web.d2 instantFile;
    public byte[] iv;
    public byte[] key;
    public TLRPC.TL_fileLocationToBeDeprecated location;
    public String path;
    public TLRPC.Photo photo;
    public long photoId;
    public TLRPC.InputPeer photoPeer;
    public int photoPeerType;
    public TLRPC.PhotoSize photoSize;
    public SecureDocument secureDocument;
    public TLRPC.InputStickerSet stickerSet;
    public String thumbSize;
    public int thumbVersion;
    public long videoSeekTo;
    public WebFile webFile;

    public static ImageLocation getForChat(TLRPC.Chat chat, int i10) {
        return getForChat(UserConfig.selectedAccount, chat, i10);
    }

    public static ImageLocation getForDocument(TLRPC.Document document) {
        if (document == null) {
            return null;
        }
        ImageLocation imageLocation = new ImageLocation();
        imageLocation.document = document;
        imageLocation.key = document.key;
        imageLocation.iv = document.iv;
        imageLocation.currentSize = document.size;
        return imageLocation;
    }

    public static ImageLocation getForInstantFile(org.telegram.ui.web.d2 d2Var) {
        if (d2Var == null) {
            return null;
        }
        ImageLocation imageLocation = new ImageLocation();
        imageLocation.instantFile = d2Var;
        return imageLocation;
    }

    public static ImageLocation getForLocal(TLRPC.FileLocation fileLocation) {
        if (fileLocation == null) {
            return null;
        }
        ImageLocation imageLocation = new ImageLocation();
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = new TLRPC.TL_fileLocationToBeDeprecated();
        imageLocation.location = tL_fileLocationToBeDeprecated;
        tL_fileLocationToBeDeprecated.local_id = fileLocation.local_id;
        tL_fileLocationToBeDeprecated.volume_id = fileLocation.volume_id;
        tL_fileLocationToBeDeprecated.secret = fileLocation.secret;
        tL_fileLocationToBeDeprecated.dc_id = fileLocation.dc_id;
        return imageLocation;
    }

    public static ImageLocation getForMessage(TLRPC.PhotoSize photoSize, TLRPC.Message message) {
        if (!(photoSize instanceof TLRPC.TL_photoStrippedSize) && !(photoSize instanceof TLRPC.TL_photoPathSize)) {
            return null;
        }
        ImageLocation imageLocation = new ImageLocation();
        imageLocation.photoSize = photoSize;
        return imageLocation;
    }

    public static ImageLocation getForObject(TLRPC.PhotoSize photoSize, TLObject tLObject) {
        if (tLObject instanceof TLRPC.Photo) {
            return getForPhoto(photoSize, (TLRPC.Photo) tLObject);
        }
        if (tLObject instanceof TLRPC.Document) {
            return getForDocument(photoSize, (TLRPC.Document) tLObject);
        }
        if (tLObject instanceof TLRPC.Message) {
            return getForMessage(photoSize, (TLRPC.Message) tLObject);
        }
        return null;
    }

    public static ImageLocation getForPath(String str) {
        if (str == null) {
            return null;
        }
        ImageLocation imageLocation = new ImageLocation();
        imageLocation.path = str;
        return imageLocation;
    }

    public static ImageLocation getForPhoto(TLRPC.PhotoSize photoSize, TLRPC.Photo photo) {
        if ((photoSize instanceof TLRPC.TL_photoStrippedSize) || (photoSize instanceof TLRPC.TL_photoPathSize)) {
            ImageLocation imageLocation = new ImageLocation();
            imageLocation.photoSize = photoSize;
            return imageLocation;
        }
        if (photoSize == null || photo == null) {
            return null;
        }
        int i10 = photo.dc_id;
        if (i10 == 0) {
            i10 = photoSize.location.dc_id;
        }
        return getForPhoto(photoSize.location, photoSize.size, photo, null, null, 1, i10, null, photoSize.type);
    }

    public static ImageLocation getForSecureDocument(SecureDocument secureDocument) {
        if (secureDocument == null) {
            return null;
        }
        ImageLocation imageLocation = new ImageLocation();
        imageLocation.secureDocument = secureDocument;
        return imageLocation;
    }

    public static ImageLocation getForSticker(TLRPC.PhotoSize photoSize, TLRPC.Document document, int i10) {
        TLRPC.InputStickerSet inputStickerSet;
        if ((photoSize instanceof TLRPC.TL_photoStrippedSize) || (photoSize instanceof TLRPC.TL_photoPathSize)) {
            ImageLocation imageLocation = new ImageLocation();
            imageLocation.photoSize = photoSize;
            return imageLocation;
        }
        if (photoSize == null || document == null || (inputStickerSet = MediaDataController.getInputStickerSet(document)) == null) {
            return null;
        }
        ImageLocation forPhoto = getForPhoto(photoSize.location, photoSize.size, null, null, null, 1, document.dc_id, inputStickerSet, photoSize.type);
        if (photoSize.type.equalsIgnoreCase("a")) {
            forPhoto.imageType = 1;
        } else if (photoSize.type.equalsIgnoreCase("v")) {
            forPhoto.imageType = 2;
        }
        forPhoto.thumbVersion = i10;
        return forPhoto;
    }

    public static ImageLocation getForStickerSet(TLRPC.StickerSet stickerSet) {
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        TLRPC.InputStickerSet tL_inputStickerSetShortName;
        if (stickerSet == null || (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(stickerSet.thumbs, 90)) == null) {
            return null;
        }
        if (stickerSet.access_hash != 0) {
            tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetID();
            tL_inputStickerSetShortName.f22400id = stickerSet.f22407id;
            tL_inputStickerSetShortName.access_hash = stickerSet.access_hash;
        } else {
            tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName.short_name = stickerSet.short_name;
        }
        TLRPC.InputStickerSet inputStickerSet = tL_inputStickerSetShortName;
        TLRPC.FileLocation fileLocation = closestPhotoSizeWithSize.location;
        return getForPhoto(fileLocation, closestPhotoSizeWithSize.size, null, null, null, 1, fileLocation.dc_id, inputStickerSet, closestPhotoSizeWithSize.type);
    }

    public static ImageLocation getForUser(TLRPC.User user, int i10) {
        return getForUser(UserConfig.selectedAccount, user, i10);
    }

    public static ImageLocation getForUserOrChat(TLObject tLObject, int i10) {
        return getForUserOrChat(UserConfig.selectedAccount, tLObject, i10);
    }

    public static ImageLocation getForVideoPath(String str) {
        if (str == null) {
            return null;
        }
        ImageLocation imageLocation = new ImageLocation();
        imageLocation.path = str;
        imageLocation.imageType = 2;
        return imageLocation;
    }

    public static ImageLocation getForWebFile(WebFile webFile) {
        if (webFile == null) {
            return null;
        }
        ImageLocation imageLocation = new ImageLocation();
        if (webFile.noproxy) {
            imageLocation.path = webFile.url;
            return imageLocation;
        }
        imageLocation.webFile = webFile;
        imageLocation.currentSize = webFile.size;
        return imageLocation;
    }

    public static String getStrippedKey(Object obj, Object obj2, Object obj3) {
        TLRPC.Message message;
        String strippedKeyInternal = getStrippedKeyInternal(obj, obj2, obj3);
        if (BuildVars.LOGS_ENABLED && (obj instanceof MessageObject) && (message = ((MessageObject) obj).messageOwner) != null && message.rich_message != null) {
            StringBuilder sbR = a9.p.r("[richmedia] strippedKey=", strippedKeyInternal, " fullObject=");
            sbR.append(obj2 == null ? "null" : obj2.getClass().getSimpleName());
            sbR.append(" stripped=");
            org.telegram.ui.Cells.pa.v(obj3 != null ? obj3.getClass().getSimpleName() : "null", sbR);
        }
        return strippedKeyInternal;
    }

    private static String getStrippedKeyInternal(Object obj, Object obj2, Object obj3) {
        TLRPC.PhotoSize photoSize;
        ImageLocation imageLocation;
        Object obj4;
        TLRPC.Photo photo;
        TLRPC.Message message;
        if (obj instanceof TLRPC.WebPage) {
            if (obj2 instanceof ImageLocation) {
                imageLocation = (ImageLocation) obj2;
                obj4 = imageLocation.document;
                if (obj4 != null && (obj4 = imageLocation.photoSize) == null) {
                    photo = imageLocation.photo;
                    if (photo != null) {
                        obj2 = photo;
                    }
                } else {
                    obj2 = obj4;
                }
            }
            if (obj2 == null) {
                return "stripped" + FileRefController.getKeyForParentObject(obj) + "_" + obj3;
            }
            if (obj2 instanceof TLRPC.Document) {
                return "stripped" + FileRefController.getKeyForParentObject(obj) + "_" + ((TLRPC.Document) obj2).f22386id;
            }
            if (obj2 instanceof TLRPC.Photo) {
                return "stripped" + FileRefController.getKeyForParentObject(obj) + "_" + ((TLRPC.Photo) obj2).f22404id;
            }
            if (obj2 instanceof TLRPC.PhotoSize) {
                photoSize = (TLRPC.PhotoSize) obj2;
                if (photoSize.location != null) {
                    return "stripped" + FileRefController.getKeyForParentObject(obj);
                }
                return "stripped" + FileRefController.getKeyForParentObject(obj) + "_" + photoSize.location.local_id + "_" + photoSize.location.volume_id;
            }
            if (obj2 instanceof TLRPC.FileLocation) {
                TLRPC.FileLocation fileLocation = (TLRPC.FileLocation) obj2;
                return "stripped" + FileRefController.getKeyForParentObject(obj) + "_" + fileLocation.local_id + "_" + fileLocation.volume_id;
            }
        } else if (obj instanceof MessageObject) {
            MessageObject messageObject = (MessageObject) obj;
            if (messageObject.type == 29 || ((message = messageObject.messageOwner) != null && message.rich_message != null)) {
                if (obj2 instanceof ImageLocation) {
                    imageLocation = (ImageLocation) obj2;
                    obj4 = imageLocation.document;
                    if (obj4 != null) {
                        obj2 = obj4;
                    } else {
                        photo = imageLocation.photo;
                        if (photo != null) {
                            obj2 = photo;
                        }
                    }
                }
                if (obj2 == null) {
                    return "stripped" + FileRefController.getKeyForParentObject(obj) + "_" + obj3;
                }
                if (obj2 instanceof TLRPC.Document) {
                    return "stripped" + FileRefController.getKeyForParentObject(obj) + "_" + ((TLRPC.Document) obj2).f22386id;
                }
                if (obj2 instanceof TLRPC.Photo) {
                    return "stripped" + FileRefController.getKeyForParentObject(obj) + "_" + ((TLRPC.Photo) obj2).f22404id;
                }
                if (obj2 instanceof TLRPC.PhotoSize) {
                    photoSize = (TLRPC.PhotoSize) obj2;
                    if (photoSize.location != null) {
                        return "stripped" + FileRefController.getKeyForParentObject(obj);
                    }
                    return "stripped" + FileRefController.getKeyForParentObject(obj) + "_" + photoSize.location.local_id + "_" + photoSize.location.volume_id;
                }
                if (obj2 instanceof TLRPC.FileLocation) {
                    TLRPC.FileLocation fileLocation2 = (TLRPC.FileLocation) obj2;
                    return "stripped" + FileRefController.getKeyForParentObject(obj) + "_" + fileLocation2.local_id + "_" + fileLocation2.volume_id;
                }
            }
        }
        return "stripped" + FileRefController.getKeyForParentObject(obj);
    }

    public String getKey(Object obj, Object obj2, boolean z10) {
        if (this.secureDocument != null) {
            return this.secureDocument.secureFile.dc_id + "_" + this.secureDocument.secureFile.f22515id;
        }
        TLRPC.PhotoSize photoSize = this.photoSize;
        if ((photoSize instanceof TLRPC.TL_photoStrippedSize) || (photoSize instanceof TLRPC.TL_photoPathSize)) {
            if (photoSize.bytes.length <= 0) {
                return null;
            }
            if (obj2 == null) {
                obj2 = this;
            }
            return getStrippedKey(obj, obj2, photoSize);
        }
        if (this.location != null) {
            return this.location.volume_id + "_" + this.location.local_id;
        }
        WebFile webFile = this.webFile;
        if (webFile != null) {
            return Utilities.MD5(webFile.url);
        }
        org.telegram.ui.web.d2 d2Var = this.instantFile;
        if (d2Var != null) {
            return Utilities.MD5(d2Var.f43813b);
        }
        TLRPC.Document document = this.document;
        if (document == null) {
            String str = this.path;
            if (str != null) {
                return Utilities.MD5(str);
            }
            return null;
        }
        if (z10 || !(document instanceof DocumentObject.ThemeDocument)) {
            if (document.f22386id == 0 || document.dc_id == 0) {
                return null;
            }
            return this.document.dc_id + "_" + this.document.f22386id;
        }
        DocumentObject.ThemeDocument themeDocument = (DocumentObject.ThemeDocument) document;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.document.dc_id);
        sb2.append("_");
        sb2.append(this.document.f22386id);
        sb2.append("_");
        sb2.append(org.telegram.ui.ActionBar.g6.q0(themeDocument.themeSettings));
        sb2.append("_");
        sb2.append(themeDocument.themeSettings.accent_color);
        sb2.append("_");
        sb2.append(themeDocument.themeSettings.message_colors.size() > 1 ? themeDocument.themeSettings.message_colors.get(1).intValue() : 0);
        sb2.append("_");
        sb2.append(themeDocument.themeSettings.message_colors.size() > 0 ? themeDocument.themeSettings.message_colors.get(0).intValue() : 0);
        return sb2.toString();
    }

    public long getSize() {
        int i10;
        TLRPC.PhotoSize photoSize = this.photoSize;
        if (photoSize == null) {
            SecureDocument secureDocument = this.secureDocument;
            if (secureDocument != null) {
                TLRPC.TL_secureFile tL_secureFile = secureDocument.secureFile;
                if (tL_secureFile != null) {
                    return tL_secureFile.size;
                }
            } else {
                TLRPC.Document document = this.document;
                if (document != null) {
                    return document.size;
                }
                WebFile webFile = this.webFile;
                if (webFile != null) {
                    i10 = webFile.size;
                }
            }
            return this.currentSize;
        }
        i10 = photoSize.size;
        return i10;
    }

    public boolean isEncrypted() {
        return this.key != null;
    }

    public static ImageLocation getForChat(int i10, TLRPC.Chat chat, int i11) {
        TLRPC.ChatPhoto chatPhoto;
        TLRPC.InputPeer tL_inputPeerChat;
        if (chat == null || (chatPhoto = chat.photo) == null) {
            return null;
        }
        if (i11 == 2) {
            if (chatPhoto.stripped_thumb == null) {
                return null;
            }
            ImageLocation imageLocation = new ImageLocation();
            TLRPC.TL_photoStrippedSize tL_photoStrippedSize = new TLRPC.TL_photoStrippedSize();
            imageLocation.photoSize = tL_photoStrippedSize;
            tL_photoStrippedSize.type = "s";
            tL_photoStrippedSize.bytes = chat.photo.stripped_thumb;
            return imageLocation;
        }
        TLRPC.FileLocation fileLocation = i11 == 0 ? chatPhoto.photo_big : chatPhoto.photo_small;
        if (fileLocation == null) {
            return null;
        }
        if (!ChatObject.isChannel(chat)) {
            tL_inputPeerChat = new TLRPC.TL_inputPeerChat();
            tL_inputPeerChat.chat_id = chat.f22380id;
        } else {
            if (chat.access_hash == 0) {
                return null;
            }
            tL_inputPeerChat = new TLRPC.TL_inputPeerChannel();
            tL_inputPeerChat.channel_id = chat.f22380id;
            tL_inputPeerChat.access_hash = chat.access_hash;
        }
        TLRPC.InputPeer inputPeer = tL_inputPeerChat;
        int i12 = chat.photo.dc_id;
        if (i12 == 0) {
            i12 = fileLocation.dc_id;
        }
        ImageLocation forPhoto = getForPhoto(fileLocation, 0, null, null, inputPeer, i11, i12, null, null);
        forPhoto.photoId = chat.photo.photo_id;
        return forPhoto;
    }

    public static ImageLocation getForUser(int i10, TLRPC.User user, int i11) {
        TLRPC.UserProfilePhoto userProfilePhoto;
        TLRPC.Photo photo;
        ArrayList<TLRPC.VideoSize> arrayList;
        ArrayList<TLRPC.VideoSize> arrayList2;
        ArrayList<TLRPC.VideoSize> arrayList3;
        TLRPC.Photo photo2;
        ArrayList<TLRPC.VideoSize> arrayList4;
        TLRPC.InputPeer tL_inputPeerUser;
        if (user != null && (userProfilePhoto = user.photo) != null) {
            if (i11 != 4 && i11 != 3) {
                if (i11 == 2) {
                    if (userProfilePhoto.stripped_thumb == null) {
                        return null;
                    }
                    ImageLocation imageLocation = new ImageLocation();
                    TLRPC.TL_photoStrippedSize tL_photoStrippedSize = new TLRPC.TL_photoStrippedSize();
                    imageLocation.photoSize = tL_photoStrippedSize;
                    tL_photoStrippedSize.type = "s";
                    tL_photoStrippedSize.bytes = user.photo.stripped_thumb;
                    return imageLocation;
                }
                TLRPC.FileLocation fileLocation = i11 == 0 ? userProfilePhoto.photo_big : userProfilePhoto.photo_small;
                if (fileLocation == null) {
                    return null;
                }
                if (user.access_hash != 0) {
                    tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
                    tL_inputPeerUser.user_id = user.f22527id;
                    tL_inputPeerUser.access_hash = user.access_hash;
                } else {
                    if (user.fromMessageDialogId == 0 || user.fromMessageId == 0) {
                        return null;
                    }
                    tL_inputPeerUser = new TLRPC.TL_inputPeerUserFromMessage();
                    tL_inputPeerUser.user_id = user.f22527id;
                    tL_inputPeerUser.peer = MessagesController.getInstance(i10).getInputPeer(user.fromMessageDialogId);
                    tL_inputPeerUser.msg_id = user.fromMessageId;
                }
                TLRPC.InputPeer inputPeer = tL_inputPeerUser;
                int i12 = user.photo.dc_id;
                if (i12 == 0) {
                    i12 = fileLocation.dc_id;
                }
                ImageLocation forPhoto = getForPhoto(fileLocation, 0, null, null, inputPeer, i11, i12, null, null);
                forPhoto.photoId = user.photo.photo_id;
                return forPhoto;
            }
            if (MessagesController.getInstance(i10).isPremiumUser(user) && user.photo.has_video) {
                TLRPC.UserFull userFull = MessagesController.getInstance(i10).getUserFull(user.f22527id);
                if (userFull == null) {
                    photo = null;
                } else if (!user.photo.personal || (photo2 = userFull.personal_photo) == null || (arrayList4 = photo2.video_sizes) == null || arrayList4.isEmpty()) {
                    TLRPC.Photo photo3 = userFull.profile_photo;
                    if (photo3 == null || photo3.f22404id != user.photo.photo_id || (arrayList3 = photo3.video_sizes) == null || arrayList3.isEmpty()) {
                        TLRPC.Photo photo4 = userFull.fallback_photo;
                        if (photo4 == null || photo4.f22404id != user.photo.photo_id || (arrayList2 = photo4.video_sizes) == null || arrayList2.isEmpty()) {
                            TLRPC.Photo photo5 = userFull.profile_photo;
                            if (photo5 == null || (arrayList = photo5.video_sizes) == null || arrayList.isEmpty()) {
                                photo = null;
                            } else {
                                photo = userFull.profile_photo;
                            }
                        } else {
                            photo = userFull.fallback_photo;
                        }
                    } else {
                        photo = userFull.profile_photo;
                    }
                } else {
                    photo = userFull.personal_photo;
                }
                if (photo != null) {
                    if (i11 == 4) {
                        return getForPhoto(FileLoader.getClosestVideoSizeWithSize(photo.video_sizes, 1000), photo);
                    }
                    TLRPC.VideoSize closestVideoSizeWithSize = FileLoader.getClosestVideoSizeWithSize(photo.video_sizes, 100);
                    for (int i13 = 0; i13 < photo.video_sizes.size(); i13++) {
                        if ("p".equals(photo.video_sizes.get(i13).type)) {
                            closestVideoSizeWithSize = photo.video_sizes.get(i13);
                            break;
                        }
                    }
                    return getForPhoto(closestVideoSizeWithSize, photo);
                }
            }
        }
        return null;
    }

    public static ImageLocation getForUserOrChat(int i10, TLObject tLObject, int i11) {
        if (tLObject instanceof TLRPC.User) {
            return getForUser(i10, (TLRPC.User) tLObject, i11);
        }
        if (tLObject instanceof TLRPC.Chat) {
            return getForChat(i10, (TLRPC.Chat) tLObject, i11);
        }
        return null;
    }

    public static ImageLocation getForDocument(TLRPC.VideoSize videoSize, TLRPC.Document document) {
        if (videoSize == null || document == null) {
            return null;
        }
        ImageLocation forPhoto = getForPhoto(videoSize.location, videoSize.size, null, document, null, 1, document.dc_id, null, videoSize.type);
        if ("f".equals(videoSize.type)) {
            forPhoto.imageType = 1;
            return forPhoto;
        }
        forPhoto.imageType = 2;
        return forPhoto;
    }

    public static ImageLocation getForPhoto(TLRPC.VideoSize videoSize, TLRPC.Photo photo) {
        if (videoSize == null || photo == null) {
            return null;
        }
        ImageLocation forPhoto = getForPhoto(videoSize.location, videoSize.size, photo, null, null, 1, photo.dc_id, null, videoSize.type);
        forPhoto.imageType = 2;
        if ((videoSize.flags & 1) != 0) {
            forPhoto.videoSeekTo = (int) (videoSize.video_start_ts * 1000.0d);
        }
        return forPhoto;
    }

    public static ImageLocation getForDocument(TLRPC.PhotoSize photoSize, TLRPC.Document document) {
        if ((photoSize instanceof TLRPC.TL_photoStrippedSize) || (photoSize instanceof TLRPC.TL_photoPathSize)) {
            ImageLocation imageLocation = new ImageLocation();
            imageLocation.photoSize = photoSize;
            return imageLocation;
        }
        if (photoSize == null || document == null) {
            return null;
        }
        return getForPhoto(photoSize.location, photoSize.size, null, document, null, 1, document.dc_id, null, photoSize.type);
    }

    private static ImageLocation getForPhoto(TLRPC.FileLocation fileLocation, int i10, TLRPC.Photo photo, TLRPC.Document document, TLRPC.InputPeer inputPeer, int i11, int i12, TLRPC.InputStickerSet inputStickerSet, String str) {
        if (fileLocation == null) {
            return null;
        }
        if (photo == null && inputPeer == null && inputStickerSet == null && document == null) {
            return null;
        }
        ImageLocation imageLocation = new ImageLocation();
        imageLocation.dc_id = i12;
        imageLocation.photo = photo;
        imageLocation.currentSize = i10;
        imageLocation.photoPeer = inputPeer;
        imageLocation.photoPeerType = i11;
        imageLocation.stickerSet = inputStickerSet;
        if (fileLocation instanceof TLRPC.TL_fileLocationToBeDeprecated) {
            imageLocation.location = (TLRPC.TL_fileLocationToBeDeprecated) fileLocation;
            if (photo != null) {
                imageLocation.file_reference = photo.file_reference;
                imageLocation.access_hash = photo.access_hash;
                imageLocation.photoId = photo.f22404id;
                imageLocation.thumbSize = str;
                return imageLocation;
            }
            if (document != null) {
                imageLocation.file_reference = document.file_reference;
                imageLocation.access_hash = document.access_hash;
                imageLocation.documentId = document.f22386id;
                imageLocation.thumbSize = str;
            }
            return imageLocation;
        }
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = new TLRPC.TL_fileLocationToBeDeprecated();
        imageLocation.location = tL_fileLocationToBeDeprecated;
        tL_fileLocationToBeDeprecated.local_id = fileLocation.local_id;
        tL_fileLocationToBeDeprecated.volume_id = fileLocation.volume_id;
        tL_fileLocationToBeDeprecated.secret = fileLocation.secret;
        imageLocation.dc_id = fileLocation.dc_id;
        imageLocation.file_reference = fileLocation.file_reference;
        imageLocation.key = fileLocation.key;
        imageLocation.iv = fileLocation.iv;
        imageLocation.access_hash = fileLocation.secret;
        return imageLocation;
    }
}
