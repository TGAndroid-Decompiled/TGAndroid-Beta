package org.telegram.messenger;

import java.util.regex.Pattern;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fc {
    public int f23892a;
    public byte[] f23893b;
    public byte[] f23894c;
    public byte[] d;
    public long f23895e;
    public TLRPC.TL_fileLocationToBeDeprecated f23896f;
    public String f23897g;
    public yv h;
    public TLRPC.Document f23898i;
    public long f23899j;
    public TLRPC.PhotoSize f23900k;
    public TLRPC.Photo f23901l;
    public int f23902m;
    public TLRPC.InputPeer f23903n;
    public TLRPC.InputStickerSet f23904o;
    public int f23905p;
    public int f23906q;
    public long f23907r;
    public long f23908s;
    public long f23909t;
    public String f23910u;
    public h20 v;

    public static fc a(int i7, TLRPC.Chat chat) {
        TLRPC.ChatPhoto chatPhoto;
        TLRPC.FileLocation fileLocation;
        TLRPC.InputPeer tL_inputPeerChat;
        if (chat != null && (chatPhoto = chat.photo) != null) {
            if (i7 == 2) {
                if (chatPhoto.stripped_thumb != null) {
                    ?? obj = new Object();
                    TLRPC.TL_photoStrippedSize tL_photoStrippedSize = new TLRPC.TL_photoStrippedSize();
                    obj.f23900k = tL_photoStrippedSize;
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
                        tL_inputPeerChat.channel_id = chat.f28431id;
                        tL_inputPeerChat.access_hash = chat.access_hash;
                    } else {
                        return null;
                    }
                } else {
                    tL_inputPeerChat = new TLRPC.TL_inputPeerChat();
                    tL_inputPeerChat.chat_id = chat.f28431id;
                }
                TLRPC.InputPeer inputPeer = tL_inputPeerChat;
                int i10 = chat.photo.dc_id;
                if (i10 == 0) {
                    i10 = fileLocation2.dc_id;
                }
                fc h = h(fileLocation2, 0, null, null, inputPeer, i7, i10, null, null);
                h.f23908s = chat.photo.photo_id;
                return h;
            }
            return null;
        }
        return null;
    }

    public static fc b(TLRPC.Document document) {
        if (document == null) {
            return null;
        }
        ?? obj = new Object();
        obj.f23898i = document;
        obj.f23894c = document.key;
        obj.d = document.iv;
        obj.f23907r = document.size;
        return obj;
    }

    public static fc c(TLRPC.PhotoSize photoSize, TLRPC.Document document) {
        if (!(photoSize instanceof TLRPC.TL_photoStrippedSize) && !(photoSize instanceof TLRPC.TL_photoPathSize)) {
            if (photoSize != null && document != null) {
                return h(photoSize.location, photoSize.size, null, document, null, 1, document.dc_id, null, photoSize.type);
            }
            return null;
        }
        ?? obj = new Object();
        obj.f23900k = photoSize;
        return obj;
    }

    public static fc d(TLRPC.VideoSize videoSize, TLRPC.Document document) {
        if (videoSize != null && document != null) {
            fc h = h(videoSize.location, videoSize.size, null, document, null, 1, document.dc_id, null, videoSize.type);
            if ("f".equals(videoSize.type)) {
                h.f23905p = 1;
                return h;
            }
            h.f23905p = 2;
            return h;
        }
        return null;
    }

    public static fc e(TLRPC.FileLocation fileLocation) {
        if (fileLocation == null) {
            return null;
        }
        ?? obj = new Object();
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = new TLRPC.TL_fileLocationToBeDeprecated();
        obj.f23896f = tL_fileLocationToBeDeprecated;
        tL_fileLocationToBeDeprecated.local_id = fileLocation.local_id;
        tL_fileLocationToBeDeprecated.volume_id = fileLocation.volume_id;
        tL_fileLocationToBeDeprecated.secret = fileLocation.secret;
        tL_fileLocationToBeDeprecated.dc_id = fileLocation.dc_id;
        return obj;
    }

    public static fc f(TLRPC.PhotoSize photoSize, TLObject tLObject) {
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
        obj.f23900k = photoSize;
        return obj;
    }

    public static fc g(String str) {
        if (str == null) {
            return null;
        }
        ?? obj = new Object();
        obj.f23897g = str;
        return obj;
    }

    public static fc h(TLRPC.FileLocation fileLocation, int i7, TLRPC.Photo photo, TLRPC.Document document, TLRPC.InputPeer inputPeer, int i10, int i11, TLRPC.InputStickerSet inputStickerSet, String str) {
        if (fileLocation != null) {
            if (photo != null || inputPeer != null || inputStickerSet != null || document != null) {
                ?? obj = new Object();
                obj.f23892a = i11;
                obj.f23901l = photo;
                obj.f23907r = i7;
                obj.f23903n = inputPeer;
                obj.f23902m = i10;
                obj.f23904o = inputStickerSet;
                if (fileLocation instanceof TLRPC.TL_fileLocationToBeDeprecated) {
                    obj.f23896f = (TLRPC.TL_fileLocationToBeDeprecated) fileLocation;
                    if (photo != null) {
                        obj.f23893b = photo.file_reference;
                        obj.f23895e = photo.access_hash;
                        obj.f23908s = photo.f28455id;
                        obj.f23910u = str;
                        return obj;
                    }
                    if (document != null) {
                        obj.f23893b = document.file_reference;
                        obj.f23895e = document.access_hash;
                        obj.f23909t = document.f28437id;
                        obj.f23910u = str;
                    }
                    return obj;
                }
                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = new TLRPC.TL_fileLocationToBeDeprecated();
                obj.f23896f = tL_fileLocationToBeDeprecated;
                tL_fileLocationToBeDeprecated.local_id = fileLocation.local_id;
                tL_fileLocationToBeDeprecated.volume_id = fileLocation.volume_id;
                tL_fileLocationToBeDeprecated.secret = fileLocation.secret;
                obj.f23892a = fileLocation.dc_id;
                obj.f23893b = fileLocation.file_reference;
                obj.f23894c = fileLocation.key;
                obj.d = fileLocation.iv;
                obj.f23895e = fileLocation.secret;
                return obj;
            }
            return null;
        }
        return null;
    }

    public static fc i(TLRPC.PhotoSize photoSize, TLRPC.Photo photo) {
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
        obj.f23900k = photoSize;
        return obj;
    }

    public static fc j(TLRPC.VideoSize videoSize, TLRPC.Photo photo) {
        if (videoSize != null && photo != null) {
            fc h = h(videoSize.location, videoSize.size, photo, null, null, 1, photo.dc_id, null, videoSize.type);
            h.f23905p = 2;
            if ((videoSize.flags & 1) != 0) {
                h.f23899j = (int) (videoSize.video_start_ts * 1000.0d);
            }
            return h;
        }
        return null;
    }

    public static fc k(TLRPC.PhotoSize photoSize, TLRPC.Document document, int i7) {
        TLRPC.InputStickerSet inputStickerSet;
        if (!(photoSize instanceof TLRPC.TL_photoStrippedSize) && !(photoSize instanceof TLRPC.TL_photoPathSize)) {
            if (photoSize == null || document == null) {
                return null;
            }
            Pattern pattern = ri.U1;
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
            fc h = h(photoSize.location, photoSize.size, null, null, null, 1, document.dc_id, inputStickerSet, photoSize.type);
            if (photoSize.type.equalsIgnoreCase("a")) {
                h.f23905p = 1;
            } else if (photoSize.type.equalsIgnoreCase("v")) {
                h.f23905p = 2;
            }
            h.f23906q = i7;
            return h;
        }
        ?? obj = new Object();
        obj.f23900k = photoSize;
        return obj;
    }

    public static org.telegram.messenger.fc l(int r11, int r12, org.telegram.tgnet.TLRPC.User r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.fc.l(int, int, org.telegram.tgnet.TLRPC$User):org.telegram.messenger.fc");
    }

    public static fc m(int i7, int i10, TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            return l(i7, i10, (TLRPC.User) tLObject);
        }
        if (tLObject instanceof TLRPC.Chat) {
            return a(i10, (TLRPC.Chat) tLObject);
        }
        return null;
    }

    public static fc n(TLRPC.User user) {
        return m(j10.f24798t0, 2, user);
    }

    public static fc o(String str) {
        if (str == null) {
            return null;
        }
        ?? obj = new Object();
        obj.f23897g = str;
        obj.f23905p = 2;
        return obj;
    }

    public static fc p(h20 h20Var) {
        if (h20Var == null) {
            return null;
        }
        ?? obj = new Object();
        if (h20Var.f24405f) {
            obj.f23897g = h20Var.f24401a;
            return obj;
        }
        obj.v = h20Var;
        obj.f23907r = h20Var.d;
        return obj;
    }

    public static java.lang.String s(java.lang.Object r4, java.lang.Object r5, java.lang.Object r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.fc.s(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.String");
    }

    public final String q(Object obj, fc fcVar, boolean z10) {
        int i7;
        if (this.h != null) {
            return this.h.f28216b.dc_id + "_" + this.h.f28216b.f28568id;
        }
        TLRPC.PhotoSize photoSize = this.f23900k;
        if (!(photoSize instanceof TLRPC.TL_photoStrippedSize) && !(photoSize instanceof TLRPC.TL_photoPathSize)) {
            if (this.f23896f != null) {
                return this.f23896f.volume_id + "_" + this.f23896f.local_id;
            }
            h20 h20Var = this.v;
            if (h20Var != null) {
                return Utilities.a(h20Var.f24401a);
            }
            TLRPC.Document document = this.f23898i;
            if (document != null) {
                if (!z10 && (document instanceof t5)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.f23898i.dc_id);
                    sb2.append("_");
                    sb2.append(this.f23898i.f28437id);
                    sb2.append("_");
                    TLRPC.ThemeSettings themeSettings = ((t5) document).f26988a;
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
                } else if (document.f28437id != 0 && document.dc_id != 0) {
                    return this.f23898i.dc_id + "_" + this.f23898i.f28437id;
                } else {
                    return null;
                }
            }
            String str = this.f23897g;
            if (str != null) {
                return Utilities.a(str);
            }
            return null;
        } else if (photoSize.bytes.length > 0) {
            if (fcVar == null) {
                fcVar = this;
            }
            return s(obj, fcVar, photoSize);
        } else {
            return null;
        }
    }

    public final long r() {
        int i7;
        TLRPC.PhotoSize photoSize = this.f23900k;
        if (photoSize != null) {
            i7 = photoSize.size;
        } else {
            yv yvVar = this.h;
            if (yvVar != null) {
                TLRPC.TL_secureFile tL_secureFile = yvVar.f28216b;
                if (tL_secureFile != null) {
                    return tL_secureFile.size;
                }
            } else {
                TLRPC.Document document = this.f23898i;
                if (document != null) {
                    return document.size;
                }
                h20 h20Var = this.v;
                if (h20Var != null) {
                    i7 = h20Var.d;
                }
            }
            return this.f23907r;
        }
        return i7;
    }
}
