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
    public org.telegram.ui.web.g2 instantFile;
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

    public static ImageLocation getForInstantFile(org.telegram.ui.web.g2 g2Var) {
        if (g2Var == null) {
            return null;
        }
        ImageLocation imageLocation = new ImageLocation();
        imageLocation.instantFile = g2Var;
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
            int i10 = photo.dc_id;
            if (i10 == 0) {
                i10 = photoSize.location.dc_id;
            }
            return getForPhoto(photoSize.location, photoSize.size, photo, null, null, 1, i10, null, photoSize.type);
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

    public static ImageLocation getForSticker(TLRPC.PhotoSize photoSize, TLRPC.Document document, int i10) {
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
            forPhoto.thumbVersion = i10;
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
            tL_inputStickerSetShortName.f19179id = stickerSet.f19186id;
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
        String simpleName;
        String strippedKeyInternal = getStrippedKeyInternal(obj, obj2, obj3);
        if (BuildVars.LOGS_ENABLED && (obj instanceof MessageObject) && (message = ((MessageObject) obj).messageOwner) != null && message.rich_message != null) {
            StringBuilder t6 = android.support.v4.media.a.t("[richmedia] strippedKey=", strippedKeyInternal, " fullObject=");
            String str = "null";
            if (obj2 == null) {
                simpleName = "null";
            } else {
                simpleName = obj2.getClass().getSimpleName();
            }
            t6.append(simpleName);
            t6.append(" stripped=");
            if (obj3 != null) {
                str = obj3.getClass().getSimpleName();
            }
            org.telegram.ui.ai.v(str, t6);
        }
        return strippedKeyInternal;
    }

    private static java.lang.String getStrippedKeyInternal(java.lang.Object r4, java.lang.Object r5, java.lang.Object r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ImageLocation.getStrippedKeyInternal(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.String");
    }

    public String getKey(Object obj, Object obj2, boolean z4) {
        int i10;
        if (this.secureDocument != null) {
            return this.secureDocument.secureFile.dc_id + "_" + this.secureDocument.secureFile.f19294id;
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
            org.telegram.ui.web.g2 g2Var = this.instantFile;
            if (g2Var != null) {
                return Utilities.MD5(g2Var.f39455b);
            }
            TLRPC.Document document = this.document;
            if (document != null) {
                if (!z4 && (document instanceof DocumentObject.ThemeDocument)) {
                    DocumentObject.ThemeDocument themeDocument = (DocumentObject.ThemeDocument) document;
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.document.dc_id);
                    sb.append("_");
                    sb.append(this.document.f19165id);
                    sb.append("_");
                    sb.append(org.telegram.ui.ActionBar.j6.q0(themeDocument.themeSettings));
                    sb.append("_");
                    sb.append(themeDocument.themeSettings.accent_color);
                    sb.append("_");
                    int i11 = 0;
                    if (themeDocument.themeSettings.message_colors.size() > 1) {
                        i10 = themeDocument.themeSettings.message_colors.get(1).intValue();
                    } else {
                        i10 = 0;
                    }
                    sb.append(i10);
                    sb.append("_");
                    if (themeDocument.themeSettings.message_colors.size() > 0) {
                        i11 = themeDocument.themeSettings.message_colors.get(0).intValue();
                    }
                    sb.append(i11);
                    return sb.toString();
                } else if (document.f19165id != 0 && document.dc_id != 0) {
                    return this.document.dc_id + "_" + this.document.f19165id;
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
        int i10;
        TLRPC.PhotoSize photoSize = this.photoSize;
        if (photoSize != null) {
            i10 = photoSize.size;
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
                    i10 = webFile.size;
                }
            }
            return this.currentSize;
        }
        return i10;
    }

    public boolean isEncrypted() {
        if (this.key != null) {
            return true;
        }
        return false;
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
        if (ChatObject.isChannel(chat)) {
            if (chat.access_hash == 0) {
                return null;
            }
            tL_inputPeerChat = new TLRPC.TL_inputPeerChannel();
            tL_inputPeerChat.channel_id = chat.f19159id;
            tL_inputPeerChat.access_hash = chat.access_hash;
        } else {
            tL_inputPeerChat = new TLRPC.TL_inputPeerChat();
            tL_inputPeerChat.chat_id = chat.f19159id;
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

    public static org.telegram.messenger.ImageLocation getForUser(int r11, org.telegram.tgnet.TLRPC.User r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ImageLocation.getForUser(int, org.telegram.tgnet.TLRPC$User, int):org.telegram.messenger.ImageLocation");
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
        } else if (photoSize == null || document == null) {
            return null;
        } else {
            return getForPhoto(photoSize.location, photoSize.size, null, document, null, 1, document.dc_id, null, photoSize.type);
        }
    }

    private static ImageLocation getForPhoto(TLRPC.FileLocation fileLocation, int i10, TLRPC.Photo photo, TLRPC.Document document, TLRPC.InputPeer inputPeer, int i11, int i12, TLRPC.InputStickerSet inputStickerSet, String str) {
        if (fileLocation != null) {
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
                    imageLocation.photoId = photo.f19183id;
                    imageLocation.thumbSize = str;
                    return imageLocation;
                }
                if (document != null) {
                    imageLocation.file_reference = document.file_reference;
                    imageLocation.access_hash = document.access_hash;
                    imageLocation.documentId = document.f19165id;
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
