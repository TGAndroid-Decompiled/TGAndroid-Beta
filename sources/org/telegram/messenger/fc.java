package org.telegram.messenger;

import java.util.regex.Pattern;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fc {
    public int f23867a;
    public byte[] f23868b;
    public byte[] f23869c;
    public byte[] d;
    public long f23870e;
    public TLRPC.TL_fileLocationToBeDeprecated f23871f;
    public String f23872g;
    public yv h;
    public TLRPC.Document f23873i;
    public long f23874j;
    public TLRPC.PhotoSize f23875k;
    public TLRPC.Photo f23876l;
    public int f23877m;
    public TLRPC.InputPeer f23878n;
    public TLRPC.InputStickerSet f23879o;
    public int f23880p;
    public int f23881q;
    public long f23882r;
    public long f23883s;
    public long f23884t;
    public String f23885u;
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
                    obj.f23875k = tL_photoStrippedSize;
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
                        tL_inputPeerChat.channel_id = chat.f28405id;
                        tL_inputPeerChat.access_hash = chat.access_hash;
                    } else {
                        return null;
                    }
                } else {
                    tL_inputPeerChat = new TLRPC.TL_inputPeerChat();
                    tL_inputPeerChat.chat_id = chat.f28405id;
                }
                TLRPC.InputPeer inputPeer = tL_inputPeerChat;
                int i10 = chat.photo.dc_id;
                if (i10 == 0) {
                    i10 = fileLocation2.dc_id;
                }
                fc h = h(fileLocation2, 0, null, null, inputPeer, i7, i10, null, null);
                h.f23883s = chat.photo.photo_id;
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
        obj.f23873i = document;
        obj.f23869c = document.key;
        obj.d = document.iv;
        obj.f23882r = document.size;
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
        obj.f23875k = photoSize;
        return obj;
    }

    public static fc d(TLRPC.VideoSize videoSize, TLRPC.Document document) {
        if (videoSize != null && document != null) {
            fc h = h(videoSize.location, videoSize.size, null, document, null, 1, document.dc_id, null, videoSize.type);
            if ("f".equals(videoSize.type)) {
                h.f23880p = 1;
                return h;
            }
            h.f23880p = 2;
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
        obj.f23871f = tL_fileLocationToBeDeprecated;
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
        obj.f23875k = photoSize;
        return obj;
    }

    public static fc g(String str) {
        if (str == null) {
            return null;
        }
        ?? obj = new Object();
        obj.f23872g = str;
        return obj;
    }

    public static fc h(TLRPC.FileLocation fileLocation, int i7, TLRPC.Photo photo, TLRPC.Document document, TLRPC.InputPeer inputPeer, int i10, int i11, TLRPC.InputStickerSet inputStickerSet, String str) {
        if (fileLocation != null) {
            if (photo != null || inputPeer != null || inputStickerSet != null || document != null) {
                ?? obj = new Object();
                obj.f23867a = i11;
                obj.f23876l = photo;
                obj.f23882r = i7;
                obj.f23878n = inputPeer;
                obj.f23877m = i10;
                obj.f23879o = inputStickerSet;
                if (fileLocation instanceof TLRPC.TL_fileLocationToBeDeprecated) {
                    obj.f23871f = (TLRPC.TL_fileLocationToBeDeprecated) fileLocation;
                    if (photo != null) {
                        obj.f23868b = photo.file_reference;
                        obj.f23870e = photo.access_hash;
                        obj.f23883s = photo.f28429id;
                        obj.f23885u = str;
                        return obj;
                    }
                    if (document != null) {
                        obj.f23868b = document.file_reference;
                        obj.f23870e = document.access_hash;
                        obj.f23884t = document.f28411id;
                        obj.f23885u = str;
                    }
                    return obj;
                }
                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = new TLRPC.TL_fileLocationToBeDeprecated();
                obj.f23871f = tL_fileLocationToBeDeprecated;
                tL_fileLocationToBeDeprecated.local_id = fileLocation.local_id;
                tL_fileLocationToBeDeprecated.volume_id = fileLocation.volume_id;
                tL_fileLocationToBeDeprecated.secret = fileLocation.secret;
                obj.f23867a = fileLocation.dc_id;
                obj.f23868b = fileLocation.file_reference;
                obj.f23869c = fileLocation.key;
                obj.d = fileLocation.iv;
                obj.f23870e = fileLocation.secret;
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
        obj.f23875k = photoSize;
        return obj;
    }

    public static fc j(TLRPC.VideoSize videoSize, TLRPC.Photo photo) {
        if (videoSize != null && photo != null) {
            fc h = h(videoSize.location, videoSize.size, photo, null, null, 1, photo.dc_id, null, videoSize.type);
            h.f23880p = 2;
            if ((videoSize.flags & 1) != 0) {
                h.f23874j = (int) (videoSize.video_start_ts * 1000.0d);
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
                h.f23880p = 1;
            } else if (photoSize.type.equalsIgnoreCase("v")) {
                h.f23880p = 2;
            }
            h.f23881q = i7;
            return h;
        }
        ?? obj = new Object();
        obj.f23875k = photoSize;
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
        return m(j10.f24773t0, 2, user);
    }

    public static fc o(String str) {
        if (str == null) {
            return null;
        }
        ?? obj = new Object();
        obj.f23872g = str;
        obj.f23880p = 2;
        return obj;
    }

    public static fc p(h20 h20Var) {
        if (h20Var == null) {
            return null;
        }
        ?? obj = new Object();
        if (h20Var.f24380f) {
            obj.f23872g = h20Var.f24376a;
            return obj;
        }
        obj.v = h20Var;
        obj.f23882r = h20Var.d;
        return obj;
    }

    public static java.lang.String s(java.lang.Object r4, java.lang.Object r5, java.lang.Object r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.fc.s(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.String");
    }

    public final String q(Object obj, fc fcVar, boolean z10) {
        int i7;
        if (this.h != null) {
            return this.h.f28190b.dc_id + "_" + this.h.f28190b.f28542id;
        }
        TLRPC.PhotoSize photoSize = this.f23875k;
        if (!(photoSize instanceof TLRPC.TL_photoStrippedSize) && !(photoSize instanceof TLRPC.TL_photoPathSize)) {
            if (this.f23871f != null) {
                return this.f23871f.volume_id + "_" + this.f23871f.local_id;
            }
            h20 h20Var = this.v;
            if (h20Var != null) {
                return Utilities.a(h20Var.f24376a);
            }
            TLRPC.Document document = this.f23873i;
            if (document != null) {
                if (!z10 && (document instanceof t5)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.f23873i.dc_id);
                    sb2.append("_");
                    sb2.append(this.f23873i.f28411id);
                    sb2.append("_");
                    TLRPC.ThemeSettings themeSettings = ((t5) document).f26962a;
                    sb2.append(org.telegram.ui.ActionBar.n6.r0(themeSettings));
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
                } else if (document.f28411id != 0 && document.dc_id != 0) {
                    return this.f23873i.dc_id + "_" + this.f23873i.f28411id;
                } else {
                    return null;
                }
            }
            String str = this.f23872g;
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
        TLRPC.PhotoSize photoSize = this.f23875k;
        if (photoSize != null) {
            i7 = photoSize.size;
        } else {
            yv yvVar = this.h;
            if (yvVar != null) {
                TLRPC.TL_secureFile tL_secureFile = yvVar.f28190b;
                if (tL_secureFile != null) {
                    return tL_secureFile.size;
                }
            } else {
                TLRPC.Document document = this.f23873i;
                if (document != null) {
                    return document.size;
                }
                h20 h20Var = this.v;
                if (h20Var != null) {
                    i7 = h20Var.d;
                }
            }
            return this.f23882r;
        }
        return i7;
    }
}
