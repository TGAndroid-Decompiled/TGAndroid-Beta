package org.telegram.messenger;

import java.util.regex.Pattern;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ac {
    public int f21484a;
    public byte[] f21485b;
    public byte[] f21486c;
    public byte[] d;
    public long f21487e;
    public TLRPC.TL_fileLocationToBeDeprecated f21488f;
    public String f21489g;
    public wv h;
    public TLRPC.Document f21490i;
    public long f21491j;
    public TLRPC.PhotoSize f21492k;
    public TLRPC.Photo f21493l;
    public int f21494m;
    public TLRPC.InputPeer f21495n;
    public TLRPC.InputStickerSet f21496o;
    public int f21497p;
    public int f21498q;
    public long f21499r;
    public long f21500s;
    public long f21501t;
    public String f21502u;
    public e20 v;

    public static ac a(int i3, TLRPC.Chat chat) {
        TLRPC.ChatPhoto chatPhoto;
        TLRPC.FileLocation fileLocation;
        TLRPC.InputPeer tL_inputPeerChat;
        if (chat != null && (chatPhoto = chat.photo) != null) {
            if (i3 == 2) {
                if (chatPhoto.stripped_thumb != null) {
                    ?? obj = new Object();
                    TLRPC.TL_photoStrippedSize tL_photoStrippedSize = new TLRPC.TL_photoStrippedSize();
                    obj.f21492k = tL_photoStrippedSize;
                    tL_photoStrippedSize.type = "s";
                    tL_photoStrippedSize.bytes = chat.photo.stripped_thumb;
                    return obj;
                }
                return null;
            }
            if (i3 == 0) {
                fileLocation = chatPhoto.photo_big;
            } else {
                fileLocation = chatPhoto.photo_small;
            }
            TLRPC.FileLocation fileLocation2 = fileLocation;
            if (fileLocation2 != null) {
                if (t3.T(chat)) {
                    if (chat.access_hash != 0) {
                        tL_inputPeerChat = new TLRPC.TL_inputPeerChannel();
                        tL_inputPeerChat.channel_id = chat.f27001id;
                        tL_inputPeerChat.access_hash = chat.access_hash;
                    } else {
                        return null;
                    }
                } else {
                    tL_inputPeerChat = new TLRPC.TL_inputPeerChat();
                    tL_inputPeerChat.chat_id = chat.f27001id;
                }
                TLRPC.InputPeer inputPeer = tL_inputPeerChat;
                int i10 = chat.photo.dc_id;
                if (i10 == 0) {
                    i10 = fileLocation2.dc_id;
                }
                ac h = h(fileLocation2, 0, null, null, inputPeer, i3, i10, null, null);
                h.f21500s = chat.photo.photo_id;
                return h;
            }
            return null;
        }
        return null;
    }

    public static ac b(TLRPC.Document document) {
        if (document == null) {
            return null;
        }
        ?? obj = new Object();
        obj.f21490i = document;
        obj.f21486c = document.key;
        obj.d = document.iv;
        obj.f21499r = document.size;
        return obj;
    }

    public static ac c(TLRPC.PhotoSize photoSize, TLRPC.Document document) {
        if (!(photoSize instanceof TLRPC.TL_photoStrippedSize) && !(photoSize instanceof TLRPC.TL_photoPathSize)) {
            if (photoSize != null && document != null) {
                return h(photoSize.location, photoSize.size, null, document, null, 1, document.dc_id, null, photoSize.type);
            }
            return null;
        }
        ?? obj = new Object();
        obj.f21492k = photoSize;
        return obj;
    }

    public static ac d(TLRPC.VideoSize videoSize, TLRPC.Document document) {
        if (videoSize != null && document != null) {
            ac h = h(videoSize.location, videoSize.size, null, document, null, 1, document.dc_id, null, videoSize.type);
            if ("f".equals(videoSize.type)) {
                h.f21497p = 1;
                return h;
            }
            h.f21497p = 2;
            return h;
        }
        return null;
    }

    public static ac e(TLRPC.FileLocation fileLocation) {
        if (fileLocation == null) {
            return null;
        }
        ?? obj = new Object();
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = new TLRPC.TL_fileLocationToBeDeprecated();
        obj.f21488f = tL_fileLocationToBeDeprecated;
        tL_fileLocationToBeDeprecated.local_id = fileLocation.local_id;
        tL_fileLocationToBeDeprecated.volume_id = fileLocation.volume_id;
        tL_fileLocationToBeDeprecated.secret = fileLocation.secret;
        tL_fileLocationToBeDeprecated.dc_id = fileLocation.dc_id;
        return obj;
    }

    public static ac f(TLRPC.PhotoSize photoSize, TLObject tLObject) {
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
        obj.f21492k = photoSize;
        return obj;
    }

    public static ac g(String str) {
        if (str == null) {
            return null;
        }
        ?? obj = new Object();
        obj.f21489g = str;
        return obj;
    }

    public static ac h(TLRPC.FileLocation fileLocation, int i3, TLRPC.Photo photo, TLRPC.Document document, TLRPC.InputPeer inputPeer, int i10, int i11, TLRPC.InputStickerSet inputStickerSet, String str) {
        if (fileLocation != null) {
            if (photo != null || inputPeer != null || inputStickerSet != null || document != null) {
                ?? obj = new Object();
                obj.f21484a = i11;
                obj.f21493l = photo;
                obj.f21499r = i3;
                obj.f21495n = inputPeer;
                obj.f21494m = i10;
                obj.f21496o = inputStickerSet;
                if (fileLocation instanceof TLRPC.TL_fileLocationToBeDeprecated) {
                    obj.f21488f = (TLRPC.TL_fileLocationToBeDeprecated) fileLocation;
                    if (photo != null) {
                        obj.f21485b = photo.file_reference;
                        obj.f21487e = photo.access_hash;
                        obj.f21500s = photo.f27025id;
                        obj.f21502u = str;
                        return obj;
                    }
                    if (document != null) {
                        obj.f21485b = document.file_reference;
                        obj.f21487e = document.access_hash;
                        obj.f21501t = document.f27007id;
                        obj.f21502u = str;
                    }
                    return obj;
                }
                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = new TLRPC.TL_fileLocationToBeDeprecated();
                obj.f21488f = tL_fileLocationToBeDeprecated;
                tL_fileLocationToBeDeprecated.local_id = fileLocation.local_id;
                tL_fileLocationToBeDeprecated.volume_id = fileLocation.volume_id;
                tL_fileLocationToBeDeprecated.secret = fileLocation.secret;
                obj.f21484a = fileLocation.dc_id;
                obj.f21485b = fileLocation.file_reference;
                obj.f21486c = fileLocation.key;
                obj.d = fileLocation.iv;
                obj.f21487e = fileLocation.secret;
                return obj;
            }
            return null;
        }
        return null;
    }

    public static ac i(TLRPC.PhotoSize photoSize, TLRPC.Photo photo) {
        if (!(photoSize instanceof TLRPC.TL_photoStrippedSize) && !(photoSize instanceof TLRPC.TL_photoPathSize)) {
            if (photoSize != null && photo != null) {
                int i3 = photo.dc_id;
                if (i3 == 0) {
                    i3 = photoSize.location.dc_id;
                }
                return h(photoSize.location, photoSize.size, photo, null, null, 1, i3, null, photoSize.type);
            }
            return null;
        }
        ?? obj = new Object();
        obj.f21492k = photoSize;
        return obj;
    }

    public static ac j(TLRPC.VideoSize videoSize, TLRPC.Photo photo) {
        if (videoSize != null && photo != null) {
            ac h = h(videoSize.location, videoSize.size, photo, null, null, 1, photo.dc_id, null, videoSize.type);
            h.f21497p = 2;
            if ((videoSize.flags & 1) != 0) {
                h.f21491j = (int) (videoSize.video_start_ts * 1000.0d);
            }
            return h;
        }
        return null;
    }

    public static ac k(TLRPC.PhotoSize photoSize, TLRPC.Document document, int i3) {
        TLRPC.InputStickerSet inputStickerSet;
        if (!(photoSize instanceof TLRPC.TL_photoStrippedSize) && !(photoSize instanceof TLRPC.TL_photoPathSize)) {
            if (photoSize == null || document == null) {
                return null;
            }
            Pattern pattern = li.S1;
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
            ac h = h(photoSize.location, photoSize.size, null, null, null, 1, document.dc_id, inputStickerSet, photoSize.type);
            if (photoSize.type.equalsIgnoreCase("a")) {
                h.f21497p = 1;
            } else if (photoSize.type.equalsIgnoreCase("v")) {
                h.f21497p = 2;
            }
            h.f21498q = i3;
            return h;
        }
        ?? obj = new Object();
        obj.f21492k = photoSize;
        return obj;
    }

    public static org.telegram.messenger.ac l(int r11, int r12, org.telegram.tgnet.TLRPC.User r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ac.l(int, int, org.telegram.tgnet.TLRPC$User):org.telegram.messenger.ac");
    }

    public static ac m(int i3, int i10, TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            return l(i3, i10, (TLRPC.User) tLObject);
        }
        if (tLObject instanceof TLRPC.Chat) {
            return a(i10, (TLRPC.Chat) tLObject);
        }
        return null;
    }

    public static ac n(TLRPC.User user) {
        return m(h10.f22829t0, 2, user);
    }

    public static ac o(String str) {
        if (str == null) {
            return null;
        }
        ?? obj = new Object();
        obj.f21489g = str;
        obj.f21497p = 2;
        return obj;
    }

    public static ac p(e20 e20Var) {
        if (e20Var == null) {
            return null;
        }
        ?? obj = new Object();
        if (e20Var.f22298f) {
            obj.f21489g = e20Var.f22294a;
            return obj;
        }
        obj.v = e20Var;
        obj.f21499r = e20Var.d;
        return obj;
    }

    public static java.lang.String s(java.lang.Object r4, java.lang.Object r5, java.lang.Object r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ac.s(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.String");
    }

    public final String q(Object obj, ac acVar, boolean z10) {
        int i3;
        if (this.h != null) {
            return this.h.f26263b.dc_id + "_" + this.h.f26263b.f27138id;
        }
        TLRPC.PhotoSize photoSize = this.f21492k;
        if (!(photoSize instanceof TLRPC.TL_photoStrippedSize) && !(photoSize instanceof TLRPC.TL_photoPathSize)) {
            if (this.f21488f != null) {
                return this.f21488f.volume_id + "_" + this.f21488f.local_id;
            }
            e20 e20Var = this.v;
            if (e20Var != null) {
                return Utilities.a(e20Var.f22294a);
            }
            TLRPC.Document document = this.f21490i;
            if (document != null) {
                if (!z10 && (document instanceof s5)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.f21490i.dc_id);
                    sb2.append("_");
                    sb2.append(this.f21490i.f27007id);
                    sb2.append("_");
                    TLRPC.ThemeSettings themeSettings = ((s5) document).f25276a;
                    sb2.append(org.telegram.ui.ActionBar.k6.r0(themeSettings));
                    sb2.append("_");
                    sb2.append(themeSettings.accent_color);
                    sb2.append("_");
                    int i10 = 0;
                    if (themeSettings.message_colors.size() > 1) {
                        i3 = themeSettings.message_colors.get(1).intValue();
                    } else {
                        i3 = 0;
                    }
                    sb2.append(i3);
                    sb2.append("_");
                    if (themeSettings.message_colors.size() > 0) {
                        i10 = themeSettings.message_colors.get(0).intValue();
                    }
                    sb2.append(i10);
                    return sb2.toString();
                } else if (document.f27007id != 0 && document.dc_id != 0) {
                    return this.f21490i.dc_id + "_" + this.f21490i.f27007id;
                } else {
                    return null;
                }
            }
            String str = this.f21489g;
            if (str != null) {
                return Utilities.a(str);
            }
            return null;
        } else if (photoSize.bytes.length > 0) {
            if (acVar == null) {
                acVar = this;
            }
            return s(obj, acVar, photoSize);
        } else {
            return null;
        }
    }

    public final long r() {
        int i3;
        TLRPC.PhotoSize photoSize = this.f21492k;
        if (photoSize != null) {
            i3 = photoSize.size;
        } else {
            wv wvVar = this.h;
            if (wvVar != null) {
                TLRPC.TL_secureFile tL_secureFile = wvVar.f26263b;
                if (tL_secureFile != null) {
                    return tL_secureFile.size;
                }
            } else {
                TLRPC.Document document = this.f21490i;
                if (document != null) {
                    return document.size;
                }
                e20 e20Var = this.v;
                if (e20Var != null) {
                    i3 = e20Var.d;
                }
            }
            return this.f21499r;
        }
        return i3;
    }
}
