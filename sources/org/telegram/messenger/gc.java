package org.telegram.messenger;

import java.util.regex.Pattern;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gc {
    public int f24112a;
    public byte[] f24113b;
    public byte[] f24114c;
    public byte[] d;
    public long f24115e;
    public TLRPC.TL_fileLocationToBeDeprecated f24116f;
    public String f24117g;
    public zv h;
    public TLRPC.Document f24118i;
    public long f24119j;
    public TLRPC.PhotoSize f24120k;
    public TLRPC.Photo f24121l;
    public int f24122m;
    public TLRPC.InputPeer f24123n;
    public TLRPC.InputStickerSet f24124o;
    public int f24125p;
    public int f24126q;
    public long f24127r;
    public long f24128s;
    public long f24129t;
    public String f24130u;
    public i20 v;

    public static gc a(int i7, TLRPC.Chat chat) {
        TLRPC.ChatPhoto chatPhoto;
        TLRPC.FileLocation fileLocation;
        TLRPC.InputPeer tL_inputPeerChat;
        if (chat != null && (chatPhoto = chat.photo) != null) {
            if (i7 == 2) {
                if (chatPhoto.stripped_thumb != null) {
                    ?? obj = new Object();
                    TLRPC.TL_photoStrippedSize tL_photoStrippedSize = new TLRPC.TL_photoStrippedSize();
                    obj.f24120k = tL_photoStrippedSize;
                    tL_photoStrippedSize.type = "s";
                    tL_photoStrippedSize.bytes = chat.photo.stripped_thumb;
                    return obj;
                }
                return null;
            }
            if (i7 == 0) {
                fileLocation = chatPhoto.photo_big;
            } else {
                fileLocation = chatPhoto.photo_small;
            }
            TLRPC.FileLocation fileLocation2 = fileLocation;
            if (fileLocation2 != null) {
                if (v3.T(chat)) {
                    if (chat.access_hash != 0) {
                        tL_inputPeerChat = new TLRPC.TL_inputPeerChannel();
                        tL_inputPeerChat.channel_id = chat.f28434id;
                        tL_inputPeerChat.access_hash = chat.access_hash;
                    } else {
                        return null;
                    }
                } else {
                    tL_inputPeerChat = new TLRPC.TL_inputPeerChat();
                    tL_inputPeerChat.chat_id = chat.f28434id;
                }
                TLRPC.InputPeer inputPeer = tL_inputPeerChat;
                int i10 = chat.photo.dc_id;
                if (i10 == 0) {
                    i10 = fileLocation2.dc_id;
                }
                gc h = h(fileLocation2, 0, null, null, inputPeer, i7, i10, null, null);
                h.f24128s = chat.photo.photo_id;
                return h;
            }
            return null;
        }
        return null;
    }

    public static gc b(TLRPC.Document document) {
        if (document == null) {
            return null;
        }
        ?? obj = new Object();
        obj.f24118i = document;
        obj.f24114c = document.key;
        obj.d = document.iv;
        obj.f24127r = document.size;
        return obj;
    }

    public static gc c(TLRPC.PhotoSize photoSize, TLRPC.Document document) {
        if (!(photoSize instanceof TLRPC.TL_photoStrippedSize) && !(photoSize instanceof TLRPC.TL_photoPathSize)) {
            if (photoSize != null && document != null) {
                return h(photoSize.location, photoSize.size, null, document, null, 1, document.dc_id, null, photoSize.type);
            }
            return null;
        }
        ?? obj = new Object();
        obj.f24120k = photoSize;
        return obj;
    }

    public static gc d(TLRPC.VideoSize videoSize, TLRPC.Document document) {
        if (videoSize != null && document != null) {
            gc h = h(videoSize.location, videoSize.size, null, document, null, 1, document.dc_id, null, videoSize.type);
            if ("f".equals(videoSize.type)) {
                h.f24125p = 1;
                return h;
            }
            h.f24125p = 2;
            return h;
        }
        return null;
    }

    public static gc e(TLRPC.FileLocation fileLocation) {
        if (fileLocation == null) {
            return null;
        }
        ?? obj = new Object();
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = new TLRPC.TL_fileLocationToBeDeprecated();
        obj.f24116f = tL_fileLocationToBeDeprecated;
        tL_fileLocationToBeDeprecated.local_id = fileLocation.local_id;
        tL_fileLocationToBeDeprecated.volume_id = fileLocation.volume_id;
        tL_fileLocationToBeDeprecated.secret = fileLocation.secret;
        tL_fileLocationToBeDeprecated.dc_id = fileLocation.dc_id;
        return obj;
    }

    public static gc f(TLRPC.PhotoSize photoSize, TLObject tLObject) {
        if (tLObject instanceof TLRPC.Photo) {
            return i(photoSize, (TLRPC.Photo) tLObject);
        }
        if (tLObject instanceof TLRPC.Document) {
            return c(photoSize, (TLRPC.Document) tLObject);
        }
        if (!(tLObject instanceof TLRPC.Message)) {
            return null;
        }
        if (!(photoSize instanceof TLRPC.TL_photoStrippedSize) && !(photoSize instanceof TLRPC.TL_photoPathSize)) {
            return null;
        }
        ?? obj = new Object();
        obj.f24120k = photoSize;
        return obj;
    }

    public static gc g(String str) {
        if (str == null) {
            return null;
        }
        ?? obj = new Object();
        obj.f24117g = str;
        return obj;
    }

    public static gc h(TLRPC.FileLocation fileLocation, int i7, TLRPC.Photo photo, TLRPC.Document document, TLRPC.InputPeer inputPeer, int i10, int i11, TLRPC.InputStickerSet inputStickerSet, String str) {
        if (fileLocation != null) {
            if (photo != null || inputPeer != null || inputStickerSet != null || document != null) {
                ?? obj = new Object();
                obj.f24112a = i11;
                obj.f24121l = photo;
                obj.f24127r = i7;
                obj.f24123n = inputPeer;
                obj.f24122m = i10;
                obj.f24124o = inputStickerSet;
                if (fileLocation instanceof TLRPC.TL_fileLocationToBeDeprecated) {
                    obj.f24116f = (TLRPC.TL_fileLocationToBeDeprecated) fileLocation;
                    if (photo != null) {
                        obj.f24113b = photo.file_reference;
                        obj.f24115e = photo.access_hash;
                        obj.f24128s = photo.f28458id;
                        obj.f24130u = str;
                        return obj;
                    }
                    if (document != null) {
                        obj.f24113b = document.file_reference;
                        obj.f24115e = document.access_hash;
                        obj.f24129t = document.f28440id;
                        obj.f24130u = str;
                    }
                    return obj;
                }
                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = new TLRPC.TL_fileLocationToBeDeprecated();
                obj.f24116f = tL_fileLocationToBeDeprecated;
                tL_fileLocationToBeDeprecated.local_id = fileLocation.local_id;
                tL_fileLocationToBeDeprecated.volume_id = fileLocation.volume_id;
                tL_fileLocationToBeDeprecated.secret = fileLocation.secret;
                obj.f24112a = fileLocation.dc_id;
                obj.f24113b = fileLocation.file_reference;
                obj.f24114c = fileLocation.key;
                obj.d = fileLocation.iv;
                obj.f24115e = fileLocation.secret;
                return obj;
            }
            return null;
        }
        return null;
    }

    public static gc i(TLRPC.PhotoSize photoSize, TLRPC.Photo photo) {
        if (!(photoSize instanceof TLRPC.TL_photoStrippedSize) && !(photoSize instanceof TLRPC.TL_photoPathSize)) {
            if (photoSize != null && photo != null) {
                int i7 = photo.dc_id;
                if (i7 == 0) {
                    i7 = photoSize.location.dc_id;
                }
                return h(photoSize.location, photoSize.size, photo, null, null, 1, i7, null, photoSize.type);
            }
            return null;
        }
        ?? obj = new Object();
        obj.f24120k = photoSize;
        return obj;
    }

    public static gc j(TLRPC.VideoSize videoSize, TLRPC.Photo photo) {
        if (videoSize != null && photo != null) {
            gc h = h(videoSize.location, videoSize.size, photo, null, null, 1, photo.dc_id, null, videoSize.type);
            h.f24125p = 2;
            if ((videoSize.flags & 1) != 0) {
                h.f24119j = (int) (videoSize.video_start_ts * 1000.0d);
            }
            return h;
        }
        return null;
    }

    public static gc k(TLRPC.PhotoSize photoSize, TLRPC.Document document, int i7) {
        TLRPC.InputStickerSet inputStickerSet;
        if (!(photoSize instanceof TLRPC.TL_photoStrippedSize) && !(photoSize instanceof TLRPC.TL_photoPathSize)) {
            if (photoSize == null || document == null) {
                return null;
            }
            Pattern pattern = si.U1;
            int i10 = 0;
            while (true) {
                if (i10 >= document.attributes.size()) {
                    break;
                }
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                    TLRPC.InputStickerSet inputStickerSet2 = documentAttribute.stickerset;
                    if (!(inputStickerSet2 instanceof TLRPC.TL_inputStickerSetEmpty)) {
                        inputStickerSet = inputStickerSet2;
                    }
                } else {
                    i10++;
                }
            }
            inputStickerSet = null;
            if (inputStickerSet == null) {
                return null;
            }
            gc h = h(photoSize.location, photoSize.size, null, null, null, 1, document.dc_id, inputStickerSet, photoSize.type);
            if (photoSize.type.equalsIgnoreCase("a")) {
                h.f24125p = 1;
            } else if (photoSize.type.equalsIgnoreCase("v")) {
                h.f24125p = 2;
            }
            h.f24126q = i7;
            return h;
        }
        ?? obj = new Object();
        obj.f24120k = photoSize;
        return obj;
    }

    public static org.telegram.messenger.gc l(int r11, int r12, org.telegram.tgnet.TLRPC.User r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.gc.l(int, int, org.telegram.tgnet.TLRPC$User):org.telegram.messenger.gc");
    }

    public static gc m(int i7, int i10, TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            return l(i7, i10, (TLRPC.User) tLObject);
        }
        if (tLObject instanceof TLRPC.Chat) {
            return a(i10, (TLRPC.Chat) tLObject);
        }
        return null;
    }

    public static gc n(TLRPC.User user) {
        return m(k10.f24968t0, 2, user);
    }

    public static gc o(String str) {
        if (str == null) {
            return null;
        }
        ?? obj = new Object();
        obj.f24117g = str;
        obj.f24125p = 2;
        return obj;
    }

    public static gc p(i20 i20Var) {
        if (i20Var == null) {
            return null;
        }
        ?? obj = new Object();
        if (i20Var.f24582f) {
            obj.f24117g = i20Var.f24578a;
            return obj;
        }
        obj.v = i20Var;
        obj.f24127r = i20Var.d;
        return obj;
    }

    public static java.lang.String s(java.lang.Object r4, java.lang.Object r5, java.lang.Object r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.gc.s(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.String");
    }

    public final String q(Object obj, gc gcVar, boolean z10) {
        int i7;
        if (this.h != null) {
            return this.h.f28384b.dc_id + "_" + this.h.f28384b.f28571id;
        }
        TLRPC.PhotoSize photoSize = this.f24120k;
        if (!(photoSize instanceof TLRPC.TL_photoStrippedSize) && !(photoSize instanceof TLRPC.TL_photoPathSize)) {
            if (this.f24116f != null) {
                return this.f24116f.volume_id + "_" + this.f24116f.local_id;
            }
            i20 i20Var = this.v;
            if (i20Var != null) {
                return Utilities.a(i20Var.f24578a);
            }
            TLRPC.Document document = this.f24118i;
            if (document != null) {
                if (!z10 && (document instanceof t5)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.f24118i.dc_id);
                    sb2.append("_");
                    sb2.append(this.f24118i.f28440id);
                    sb2.append("_");
                    TLRPC.ThemeSettings themeSettings = ((t5) document).f26975a;
                    sb2.append(org.telegram.ui.ActionBar.m6.r0(themeSettings));
                    sb2.append("_");
                    sb2.append(themeSettings.accent_color);
                    sb2.append("_");
                    int i10 = 0;
                    if (themeSettings.message_colors.size() > 1) {
                        i7 = themeSettings.message_colors.get(1).intValue();
                    } else {
                        i7 = 0;
                    }
                    sb2.append(i7);
                    sb2.append("_");
                    if (themeSettings.message_colors.size() > 0) {
                        i10 = themeSettings.message_colors.get(0).intValue();
                    }
                    sb2.append(i10);
                    return sb2.toString();
                } else if (document.f28440id != 0 && document.dc_id != 0) {
                    return this.f24118i.dc_id + "_" + this.f24118i.f28440id;
                } else {
                    return null;
                }
            }
            String str = this.f24117g;
            if (str != null) {
                return Utilities.a(str);
            }
            return null;
        } else if (photoSize.bytes.length > 0) {
            if (gcVar == null) {
                gcVar = this;
            }
            return s(obj, gcVar, photoSize);
        } else {
            return null;
        }
    }

    public final long r() {
        int i7;
        TLRPC.PhotoSize photoSize = this.f24120k;
        if (photoSize != null) {
            i7 = photoSize.size;
        } else {
            zv zvVar = this.h;
            if (zvVar != null) {
                TLRPC.TL_secureFile tL_secureFile = zvVar.f28384b;
                if (tL_secureFile != null) {
                    return tL_secureFile.size;
                }
            } else {
                TLRPC.Document document = this.f24118i;
                if (document != null) {
                    return document.size;
                }
                i20 i20Var = this.v;
                if (i20Var != null) {
                    i7 = i20Var.d;
                }
            }
            return this.f24127r;
        }
        return i7;
    }
}
