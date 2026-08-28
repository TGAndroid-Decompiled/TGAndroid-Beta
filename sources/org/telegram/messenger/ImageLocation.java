package org.telegram.messenger;

import org.telegram.messenger.DocumentObject;
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
    public org.telegram.ui.web.c2 instantFile;
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

    public static ImageLocation getForChat(TLRPC.Chat chat, int i9) {
        return getForChat(UserConfig.selectedAccount, chat, i9);
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

    public static ImageLocation getForInstantFile(org.telegram.ui.web.c2 c2Var) {
        if (c2Var == null) {
            return null;
        }
        ImageLocation imageLocation = new ImageLocation();
        imageLocation.instantFile = c2Var;
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
        } else if (photoSize == null || photo == null) {
            return null;
        } else {
            int i9 = photo.dc_id;
            if (i9 == 0) {
                i9 = photoSize.location.dc_id;
            }
            return getForPhoto(photoSize.location, photoSize.size, photo, null, null, 1, i9, null, photoSize.type);
        }
    }

    public static ImageLocation getForSecureDocument(SecureDocument secureDocument) {
        if (secureDocument == null) {
            return null;
        }
        ImageLocation imageLocation = new ImageLocation();
        imageLocation.secureDocument = secureDocument;
        return imageLocation;
    }

    public static ImageLocation getForSticker(TLRPC.PhotoSize photoSize, TLRPC.Document document, int i9) {
        TLRPC.InputStickerSet inputStickerSet;
        if (!(photoSize instanceof TLRPC.TL_photoStrippedSize) && !(photoSize instanceof TLRPC.TL_photoPathSize)) {
            if (photoSize == null || document == null || (inputStickerSet = MediaDataController.getInputStickerSet(document)) == null) {
                return null;
            }
            ImageLocation forPhoto = getForPhoto(photoSize.location, photoSize.size, null, null, null, 1, document.dc_id, inputStickerSet, photoSize.type);
            if (photoSize.type.equalsIgnoreCase("a")) {
                forPhoto.imageType = 1;
            } else if (photoSize.type.equalsIgnoreCase("v")) {
                forPhoto.imageType = 2;
            }
            forPhoto.thumbVersion = i9;
            return forPhoto;
        }
        ImageLocation imageLocation = new ImageLocation();
        imageLocation.photoSize = photoSize;
        return imageLocation;
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

    public static ImageLocation getForUser(TLRPC.User user, int i9) {
        return getForUser(UserConfig.selectedAccount, user, i9);
    }

    public static ImageLocation getForUserOrChat(TLObject tLObject, int i9) {
        return getForUserOrChat(UserConfig.selectedAccount, tLObject, i9);
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
        String simpleName;
        String strippedKeyInternal = getStrippedKeyInternal(obj, obj2, obj3);
        if (BuildVars.LOGS_ENABLED && (obj instanceof MessageObject) && (message = ((MessageObject) obj).messageOwner) != null && message.rich_message != null) {
            StringBuilder t10 = aa.d.t("[richmedia] strippedKey=", strippedKeyInternal, " fullObject=");
            String str = "null";
            if (obj2 == null) {
                simpleName = "null";
            } else {
                simpleName = obj2.getClass().getSimpleName();
            }
            t10.append(simpleName);
            t10.append(" stripped=");
            if (obj3 != null) {
                str = obj3.getClass().getSimpleName();
            }
            j3.r0.x(str, t10);
        }
        return strippedKeyInternal;
    }

    private static java.lang.String getStrippedKeyInternal(java.lang.Object r4, java.lang.Object r5, java.lang.Object r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ImageLocation.getStrippedKeyInternal(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.String");
    }

    public String getKey(Object obj, Object obj2, boolean z10) {
        int i9;
        if (this.secureDocument != null) {
            return this.secureDocument.secureFile.dc_id + "_" + this.secureDocument.secureFile.f22515id;
        }
        TLRPC.PhotoSize photoSize = this.photoSize;
        if (!(photoSize instanceof TLRPC.TL_photoStrippedSize) && !(photoSize instanceof TLRPC.TL_photoPathSize)) {
            if (this.location != null) {
                return this.location.volume_id + "_" + this.location.local_id;
            }
            WebFile webFile = this.webFile;
            if (webFile != null) {
                return Utilities.MD5(webFile.url);
            }
            org.telegram.ui.web.c2 c2Var = this.instantFile;
            if (c2Var != null) {
                return Utilities.MD5(c2Var.f43826b);
            }
            TLRPC.Document document = this.document;
            if (document != null) {
                if (!z10 && (document instanceof DocumentObject.ThemeDocument)) {
                    DocumentObject.ThemeDocument themeDocument = (DocumentObject.ThemeDocument) document;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.document.dc_id);
                    sb2.append("_");
                    sb2.append(this.document.f22386id);
                    sb2.append("_");
                    sb2.append(org.telegram.ui.ActionBar.f6.q0(themeDocument.themeSettings));
                    sb2.append("_");
                    sb2.append(themeDocument.themeSettings.accent_color);
                    sb2.append("_");
                    int i10 = 0;
                    if (themeDocument.themeSettings.message_colors.size() > 1) {
                        i9 = themeDocument.themeSettings.message_colors.get(1).intValue();
                    } else {
                        i9 = 0;
                    }
                    sb2.append(i9);
                    sb2.append("_");
                    if (themeDocument.themeSettings.message_colors.size() > 0) {
                        i10 = themeDocument.themeSettings.message_colors.get(0).intValue();
                    }
                    sb2.append(i10);
                    return sb2.toString();
                } else if (document.f22386id != 0 && document.dc_id != 0) {
                    return this.document.dc_id + "_" + this.document.f22386id;
                } else {
                    return null;
                }
            }
            String str = this.path;
            if (str != null) {
                return Utilities.MD5(str);
            }
            return null;
        } else if (photoSize.bytes.length > 0) {
            if (obj2 == null) {
                obj2 = this;
            }
            return getStrippedKey(obj, obj2, photoSize);
        } else {
            return null;
        }
    }

    public long getSize() {
        int i9;
        TLRPC.PhotoSize photoSize = this.photoSize;
        if (photoSize != null) {
            i9 = photoSize.size;
        } else {
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
                    i9 = webFile.size;
                }
            }
            return this.currentSize;
        }
        return i9;
    }

    public boolean isEncrypted() {
        if (this.key != null) {
            return true;
        }
        return false;
    }

    public static ImageLocation getForChat(int i9, TLRPC.Chat chat, int i10) {
        TLRPC.ChatPhoto chatPhoto;
        TLRPC.InputPeer tL_inputPeerChat;
        if (chat == null || (chatPhoto = chat.photo) == null) {
            return null;
        }
        if (i10 == 2) {
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
        TLRPC.FileLocation fileLocation = i10 == 0 ? chatPhoto.photo_big : chatPhoto.photo_small;
        if (fileLocation == null) {
            return null;
        }
        if (ChatObject.isChannel(chat)) {
            if (chat.access_hash == 0) {
                return null;
            }
            tL_inputPeerChat = new TLRPC.TL_inputPeerChannel();
            tL_inputPeerChat.channel_id = chat.f22380id;
            tL_inputPeerChat.access_hash = chat.access_hash;
        } else {
            tL_inputPeerChat = new TLRPC.TL_inputPeerChat();
            tL_inputPeerChat.chat_id = chat.f22380id;
        }
        TLRPC.InputPeer inputPeer = tL_inputPeerChat;
        int i11 = chat.photo.dc_id;
        if (i11 == 0) {
            i11 = fileLocation.dc_id;
        }
        ImageLocation forPhoto = getForPhoto(fileLocation, 0, null, null, inputPeer, i10, i11, null, null);
        forPhoto.photoId = chat.photo.photo_id;
        return forPhoto;
    }

    public static org.telegram.messenger.ImageLocation getForUser(int r11, org.telegram.tgnet.TLRPC.User r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ImageLocation.getForUser(int, org.telegram.tgnet.TLRPC$User, int):org.telegram.messenger.ImageLocation");
    }

    public static ImageLocation getForUserOrChat(int i9, TLObject tLObject, int i10) {
        if (tLObject instanceof TLRPC.User) {
            return getForUser(i9, (TLRPC.User) tLObject, i10);
        }
        if (tLObject instanceof TLRPC.Chat) {
            return getForChat(i9, (TLRPC.Chat) tLObject, i10);
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
        } else if (photoSize == null || document == null) {
            return null;
        } else {
            return getForPhoto(photoSize.location, photoSize.size, null, document, null, 1, document.dc_id, null, photoSize.type);
        }
    }

    private static ImageLocation getForPhoto(TLRPC.FileLocation fileLocation, int i9, TLRPC.Photo photo, TLRPC.Document document, TLRPC.InputPeer inputPeer, int i10, int i11, TLRPC.InputStickerSet inputStickerSet, String str) {
        if (fileLocation != null) {
            if (photo == null && inputPeer == null && inputStickerSet == null && document == null) {
                return null;
            }
            ImageLocation imageLocation = new ImageLocation();
            imageLocation.dc_id = i11;
            imageLocation.photo = photo;
            imageLocation.currentSize = i9;
            imageLocation.photoPeer = inputPeer;
            imageLocation.photoPeerType = i10;
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
        return null;
    }
}
