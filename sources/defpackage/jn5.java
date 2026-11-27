package defpackage;

import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jn5 {
    public int a;
    public byte[] b;
    public byte[] c;
    public byte[] d;
    public long e;
    public TLRPC.TL_fileLocationToBeDeprecated f;
    public String g;
    public oy9 h;
    public TLRPC.Document i;
    public long j;
    public TLRPC.PhotoSize k;
    public TLRPC.Photo l;
    public byte m;
    public TLRPC.InputPeer n;
    public TLRPC.InputStickerSet o;
    public byte p;
    public int q;
    public long r;
    public long s;
    public long t;
    public String u;
    public jxc v;

    public static jn5 a(int i, TLRPC.Chat chat) {
        TLRPC.ChatPhoto chatPhoto;
        TLRPC.FileLocation fileLocation;
        TLRPC.InputPeer tL_inputPeerChat;
        if (chat != null && (chatPhoto = chat.photo) != null) {
            if (i == 2) {
                if (chatPhoto.stripped_thumb != null) {
                    ?? obj = new Object();
                    TLRPC.TL_photoStrippedSize tL_photoStrippedSize = new TLRPC.TL_photoStrippedSize();
                    obj.k = tL_photoStrippedSize;
                    tL_photoStrippedSize.type = "s";
                    tL_photoStrippedSize.bytes = chat.photo.stripped_thumb;
                    return obj;
                }
                return null;
            }
            if (i == 0) {
                fileLocation = chatPhoto.photo_big;
            } else {
                fileLocation = chatPhoto.photo_small;
            }
            TLRPC.FileLocation fileLocation2 = fileLocation;
            if (fileLocation2 != null) {
                if (xc2.T(chat)) {
                    if (chat.access_hash != 0) {
                        tL_inputPeerChat = new TLRPC.TL_inputPeerChannel();
                        tL_inputPeerChat.channel_id = chat.id;
                        tL_inputPeerChat.access_hash = chat.access_hash;
                    } else {
                        return null;
                    }
                } else {
                    tL_inputPeerChat = new TLRPC.TL_inputPeerChat();
                    tL_inputPeerChat.chat_id = chat.id;
                }
                TLRPC.InputPeer inputPeer = tL_inputPeerChat;
                int i2 = chat.photo.dc_id;
                if (i2 == 0) {
                    i2 = fileLocation2.dc_id;
                }
                jn5 h = h(fileLocation2, 0, null, null, inputPeer, i, i2, null, null);
                h.s = chat.photo.photo_id;
                return h;
            }
            return null;
        }
        return null;
    }

    public static jn5 b(TLRPC.Document document) {
        if (document == null) {
            return null;
        }
        ?? obj = new Object();
        obj.i = document;
        obj.c = document.key;
        obj.d = document.iv;
        obj.r = document.size;
        return obj;
    }

    public static jn5 c(TLRPC.PhotoSize photoSize, TLRPC.Document document) {
        if (!(photoSize instanceof TLRPC.TL_photoStrippedSize) && !(photoSize instanceof TLRPC.TL_photoPathSize)) {
            if (photoSize != null && document != null) {
                return h(photoSize.location, photoSize.size, null, document, null, 1, document.dc_id, null, photoSize.type);
            }
            return null;
        }
        ?? obj = new Object();
        obj.k = photoSize;
        return obj;
    }

    public static jn5 d(TLRPC.VideoSize videoSize, TLRPC.Document document) {
        if (videoSize != null && document != null) {
            jn5 h = h(videoSize.location, videoSize.size, null, document, null, 1, document.dc_id, null, videoSize.type);
            if ("f".equals(videoSize.type)) {
                h.p = (byte) 1;
                return h;
            }
            h.p = (byte) 2;
            return h;
        }
        return null;
    }

    public static jn5 e(TLRPC.FileLocation fileLocation) {
        if (fileLocation == null) {
            return null;
        }
        ?? obj = new Object();
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = new TLRPC.TL_fileLocationToBeDeprecated();
        obj.f = tL_fileLocationToBeDeprecated;
        tL_fileLocationToBeDeprecated.local_id = fileLocation.local_id;
        tL_fileLocationToBeDeprecated.volume_id = fileLocation.volume_id;
        tL_fileLocationToBeDeprecated.secret = fileLocation.secret;
        tL_fileLocationToBeDeprecated.dc_id = fileLocation.dc_id;
        return obj;
    }

    public static jn5 f(TLRPC.PhotoSize photoSize, TLObject tLObject) {
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
        obj.k = photoSize;
        return obj;
    }

    public static jn5 g(String str) {
        if (str == null) {
            return null;
        }
        ?? obj = new Object();
        obj.g = str;
        return obj;
    }

    public static jn5 h(TLRPC.FileLocation fileLocation, int i, TLRPC.Photo photo, TLRPC.Document document, TLRPC.InputPeer inputPeer, int i2, int i3, TLRPC.InputStickerSet inputStickerSet, String str) {
        if (fileLocation != null) {
            if (photo != null || inputPeer != null || inputStickerSet != null || document != null) {
                ?? obj = new Object();
                obj.a = i3;
                obj.l = photo;
                obj.r = i;
                obj.n = inputPeer;
                obj.m = i2;
                obj.o = inputStickerSet;
                if (fileLocation instanceof TLRPC.TL_fileLocationToBeDeprecated) {
                    obj.f = (TLRPC.TL_fileLocationToBeDeprecated) fileLocation;
                    if (photo != null) {
                        obj.b = photo.file_reference;
                        obj.e = photo.access_hash;
                        obj.s = photo.id;
                        obj.u = str;
                        return obj;
                    }
                    if (document != null) {
                        obj.b = document.file_reference;
                        obj.e = document.access_hash;
                        obj.t = document.id;
                        obj.u = str;
                    }
                    return obj;
                }
                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = new TLRPC.TL_fileLocationToBeDeprecated();
                obj.f = tL_fileLocationToBeDeprecated;
                tL_fileLocationToBeDeprecated.local_id = fileLocation.local_id;
                tL_fileLocationToBeDeprecated.volume_id = fileLocation.volume_id;
                tL_fileLocationToBeDeprecated.secret = fileLocation.secret;
                obj.a = fileLocation.dc_id;
                obj.b = fileLocation.file_reference;
                obj.c = fileLocation.key;
                obj.d = fileLocation.iv;
                obj.e = fileLocation.secret;
                return obj;
            }
            return null;
        }
        return null;
    }

    public static jn5 i(TLRPC.PhotoSize photoSize, TLRPC.Photo photo) {
        if (!(photoSize instanceof TLRPC.TL_photoStrippedSize) && !(photoSize instanceof TLRPC.TL_photoPathSize)) {
            if (photoSize != null && photo != null) {
                int i = photo.dc_id;
                if (i == 0) {
                    i = photoSize.location.dc_id;
                }
                return h(photoSize.location, photoSize.size, photo, null, null, 1, i, null, photoSize.type);
            }
            return null;
        }
        ?? obj = new Object();
        obj.k = photoSize;
        return obj;
    }

    public static jn5 j(TLRPC.VideoSize videoSize, TLRPC.Photo photo) {
        if (videoSize != null && photo != null) {
            jn5 h = h(videoSize.location, videoSize.size, photo, null, null, 1, photo.dc_id, null, videoSize.type);
            h.p = (byte) 2;
            if ((videoSize.flags & 1) != 0) {
                h.j = (int) (videoSize.video_start_ts * 1000.0d);
            }
            return h;
        }
        return null;
    }

    public static jn5 k(TLRPC.PhotoSize photoSize, TLRPC.Document document, int i) {
        TLRPC.InputStickerSet inputStickerSet;
        if (!(photoSize instanceof TLRPC.TL_photoStrippedSize) && !(photoSize instanceof TLRPC.TL_photoPathSize)) {
            if (photoSize != null && document != null) {
                Pattern pattern = ls6.U1;
                int i2 = 0;
                while (true) {
                    if (i2 >= document.attributes.size()) {
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i2);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                        TLRPC.InputStickerSet inputStickerSet2 = documentAttribute.stickerset;
                        if (!(inputStickerSet2 instanceof TLRPC.TL_inputStickerSetEmpty)) {
                            inputStickerSet = inputStickerSet2;
                        }
                    } else {
                        i2++;
                    }
                }
                inputStickerSet = null;
                if (inputStickerSet != null) {
                    jn5 h = h(photoSize.location, photoSize.size, null, null, null, 1, document.dc_id, inputStickerSet, photoSize.type);
                    if (photoSize.type.equalsIgnoreCase("a")) {
                        h.p = (byte) 1;
                    } else if (photoSize.type.equalsIgnoreCase("v")) {
                        h.p = (byte) 2;
                    }
                    h.q = i;
                    return h;
                }
            }
            return null;
        }
        ?? obj = new Object();
        obj.k = photoSize;
        return obj;
    }

    public static defpackage.jn5 l(int r11, int r12, org.telegram.tgnet.TLRPC.User r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jn5.l(int, int, org.telegram.tgnet.TLRPC$User):jn5");
    }

    public static jn5 m(int i, int i2, TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            return l(i, i2, (TLRPC.User) tLObject);
        }
        if (tLObject instanceof TLRPC.Chat) {
            return a(i2, (TLRPC.Chat) tLObject);
        }
        return null;
    }

    public static jn5 n(TLRPC.User user) {
        return m(yac.t0, 2, user);
    }

    public static jn5 o(String str) {
        if (str == null) {
            return null;
        }
        ?? obj = new Object();
        obj.g = str;
        obj.p = (byte) 2;
        return obj;
    }

    public static jn5 p(jxc jxcVar) {
        if (jxcVar == null) {
            return null;
        }
        ?? obj = new Object();
        if (jxcVar.f) {
            obj.g = jxcVar.a;
            return obj;
        }
        obj.v = jxcVar;
        obj.r = jxcVar.d;
        return obj;
    }

    public static java.lang.String s(java.lang.Object r4, java.lang.Object r5, java.lang.Object r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jn5.s(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.String");
    }

    public final String q(Object obj, Object obj2, boolean z) {
        int i;
        if (this.h != null) {
            return this.h.b.dc_id + "_" + this.h.b.id;
        }
        TLRPC.PhotoSize photoSize = this.k;
        if (!(photoSize instanceof TLRPC.TL_photoStrippedSize) && !(photoSize instanceof TLRPC.TL_photoPathSize)) {
            if (this.f != null) {
                return this.f.volume_id + "_" + this.f.local_id;
            }
            jxc jxcVar = this.v;
            if (jxcVar != null) {
                return Utilities.a(jxcVar.a);
            }
            TLRPC.Document document = this.i;
            if (document != null) {
                if (!z && (document instanceof kp3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.i.dc_id);
                    sb.append("_");
                    sb.append(this.i.id);
                    sb.append("_");
                    TLRPC.ThemeSettings themeSettings = ((kp3) document).a;
                    sb.append(aob.q0(themeSettings));
                    sb.append("_");
                    sb.append(themeSettings.accent_color);
                    sb.append("_");
                    int i2 = 0;
                    if (themeSettings.message_colors.size() > 1) {
                        i = themeSettings.message_colors.get(1).intValue();
                    } else {
                        i = 0;
                    }
                    sb.append(i);
                    sb.append("_");
                    if (themeSettings.message_colors.size() > 0) {
                        i2 = themeSettings.message_colors.get(0).intValue();
                    }
                    sb.append(i2);
                    return sb.toString();
                } else if (document.id != 0 && document.dc_id != 0) {
                    return this.i.dc_id + "_" + this.i.id;
                } else {
                    return null;
                }
            }
            String str = this.g;
            if (str != null) {
                return Utilities.a(str);
            }
            return null;
        } else if (photoSize.bytes.length > 0) {
            if (obj2 != 0) {
                this = obj2;
            }
            return s(obj, this, photoSize);
        } else {
            return null;
        }
    }

    public final long r() {
        int i;
        TLRPC.PhotoSize photoSize = this.k;
        if (photoSize != null) {
            i = photoSize.size;
        } else {
            oy9 oy9Var = this.h;
            if (oy9Var != null) {
                TLRPC.TL_secureFile tL_secureFile = oy9Var.b;
                if (tL_secureFile != null) {
                    return tL_secureFile.size;
                }
            } else {
                TLRPC.Document document = this.i;
                if (document != null) {
                    return document.size;
                }
                jxc jxcVar = this.v;
                if (jxcVar != null) {
                    i = jxcVar.d;
                }
            }
            return this.r;
        }
        return i;
    }
}
