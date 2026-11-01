package org.telegram.messenger;

import java.util.regex.Pattern;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jc {
    public int f16432a;
    public byte[] f16433b;
    public byte[] f16434c;
    public byte[] d;
    public long e;
    public TLRPC.TL_fileLocationToBeDeprecated f16435f;
    public String f16436g;
    public qw h;
    public TLRPC.Document f16437i;
    public long f16438j;
    public TLRPC.PhotoSize f16439k;
    public TLRPC.Photo f16440l;
    public int f16441m;
    public TLRPC.InputPeer f16442n;
    public TLRPC.InputStickerSet f16443o;
    public int f16444p;
    public int f16445q;
    public long f16446r;
    public long f16447s;
    public long f16448t;
    public String f16449u;
    public c30 v;

    public static jc a(int i10, TLRPC.Chat chat) {
        TLRPC.ChatPhoto chatPhoto;
        TLRPC.FileLocation fileLocation;
        TLRPC.InputPeer tL_inputPeerChat;
        if (chat != null && (chatPhoto = chat.photo) != null) {
            if (i10 == 2) {
                if (chatPhoto.stripped_thumb != null) {
                    ?? obj = new Object();
                    TLRPC.TL_photoStrippedSize tL_photoStrippedSize = new TLRPC.TL_photoStrippedSize();
                    obj.f16439k = tL_photoStrippedSize;
                    tL_photoStrippedSize.type = "s";
                    tL_photoStrippedSize.bytes = chat.photo.stripped_thumb;
                    return obj;
                }
                return null;
            }
            if (i10 == 0) {
                fileLocation = chatPhoto.photo_big;
            } else {
                fileLocation = chatPhoto.photo_small;
            }
            TLRPC.FileLocation fileLocation2 = fileLocation;
            if (fileLocation2 != null) {
                if (w3.T(chat)) {
                    if (chat.access_hash != 0) {
                        tL_inputPeerChat = new TLRPC.TL_inputPeerChannel();
                        tL_inputPeerChat.channel_id = chat.f19794id;
                        tL_inputPeerChat.access_hash = chat.access_hash;
                    } else {
                        return null;
                    }
                } else {
                    tL_inputPeerChat = new TLRPC.TL_inputPeerChat();
                    tL_inputPeerChat.chat_id = chat.f19794id;
                }
                TLRPC.InputPeer inputPeer = tL_inputPeerChat;
                int i11 = chat.photo.dc_id;
                if (i11 == 0) {
                    i11 = fileLocation2.dc_id;
                }
                jc h = h(fileLocation2, 0, null, null, inputPeer, i10, i11, null, null);
                h.f16447s = chat.photo.photo_id;
                return h;
            }
            return null;
        }
        return null;
    }

    public static jc b(TLRPC.Document document) {
        if (document == null) {
            return null;
        }
        ?? obj = new Object();
        obj.f16437i = document;
        obj.f16434c = document.key;
        obj.d = document.iv;
        obj.f16446r = document.size;
        return obj;
    }

    public static jc c(TLRPC.PhotoSize photoSize, TLRPC.Document document) {
        if (!(photoSize instanceof TLRPC.TL_photoStrippedSize) && !(photoSize instanceof TLRPC.TL_photoPathSize)) {
            if (photoSize != null && document != null) {
                return h(photoSize.location, photoSize.size, null, document, null, 1, document.dc_id, null, photoSize.type);
            }
            return null;
        }
        ?? obj = new Object();
        obj.f16439k = photoSize;
        return obj;
    }

    public static jc d(TLRPC.VideoSize videoSize, TLRPC.Document document) {
        if (videoSize != null && document != null) {
            jc h = h(videoSize.location, videoSize.size, null, document, null, 1, document.dc_id, null, videoSize.type);
            if ("f".equals(videoSize.type)) {
                h.f16444p = 1;
                return h;
            }
            h.f16444p = 2;
            return h;
        }
        return null;
    }

    public static jc e(TLRPC.FileLocation fileLocation) {
        if (fileLocation == null) {
            return null;
        }
        ?? obj = new Object();
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = new TLRPC.TL_fileLocationToBeDeprecated();
        obj.f16435f = tL_fileLocationToBeDeprecated;
        tL_fileLocationToBeDeprecated.local_id = fileLocation.local_id;
        tL_fileLocationToBeDeprecated.volume_id = fileLocation.volume_id;
        tL_fileLocationToBeDeprecated.secret = fileLocation.secret;
        tL_fileLocationToBeDeprecated.dc_id = fileLocation.dc_id;
        return obj;
    }

    public static jc f(TLRPC.PhotoSize photoSize, TLObject tLObject) {
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
        obj.f16439k = photoSize;
        return obj;
    }

    public static jc g(String str) {
        if (str == null) {
            return null;
        }
        ?? obj = new Object();
        obj.f16436g = str;
        return obj;
    }

    public static jc h(TLRPC.FileLocation fileLocation, int i10, TLRPC.Photo photo, TLRPC.Document document, TLRPC.InputPeer inputPeer, int i11, int i12, TLRPC.InputStickerSet inputStickerSet, String str) {
        if (fileLocation != null) {
            if (photo != null || inputPeer != null || inputStickerSet != null || document != null) {
                ?? obj = new Object();
                obj.f16432a = i12;
                obj.f16440l = photo;
                obj.f16446r = i10;
                obj.f16442n = inputPeer;
                obj.f16441m = i11;
                obj.f16443o = inputStickerSet;
                if (fileLocation instanceof TLRPC.TL_fileLocationToBeDeprecated) {
                    obj.f16435f = (TLRPC.TL_fileLocationToBeDeprecated) fileLocation;
                    if (photo != null) {
                        obj.f16433b = photo.file_reference;
                        obj.e = photo.access_hash;
                        obj.f16447s = photo.f19818id;
                        obj.f16449u = str;
                        return obj;
                    }
                    if (document != null) {
                        obj.f16433b = document.file_reference;
                        obj.e = document.access_hash;
                        obj.f16448t = document.f19800id;
                        obj.f16449u = str;
                    }
                    return obj;
                }
                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = new TLRPC.TL_fileLocationToBeDeprecated();
                obj.f16435f = tL_fileLocationToBeDeprecated;
                tL_fileLocationToBeDeprecated.local_id = fileLocation.local_id;
                tL_fileLocationToBeDeprecated.volume_id = fileLocation.volume_id;
                tL_fileLocationToBeDeprecated.secret = fileLocation.secret;
                obj.f16432a = fileLocation.dc_id;
                obj.f16433b = fileLocation.file_reference;
                obj.f16434c = fileLocation.key;
                obj.d = fileLocation.iv;
                obj.e = fileLocation.secret;
                return obj;
            }
            return null;
        }
        return null;
    }

    public static jc i(TLRPC.PhotoSize photoSize, TLRPC.Photo photo) {
        if (!(photoSize instanceof TLRPC.TL_photoStrippedSize) && !(photoSize instanceof TLRPC.TL_photoPathSize)) {
            if (photoSize != null && photo != null) {
                int i10 = photo.dc_id;
                if (i10 == 0) {
                    i10 = photoSize.location.dc_id;
                }
                return h(photoSize.location, photoSize.size, photo, null, null, 1, i10, null, photoSize.type);
            }
            return null;
        }
        ?? obj = new Object();
        obj.f16439k = photoSize;
        return obj;
    }

    public static jc j(TLRPC.VideoSize videoSize, TLRPC.Photo photo) {
        if (videoSize != null && photo != null) {
            jc h = h(videoSize.location, videoSize.size, photo, null, null, 1, photo.dc_id, null, videoSize.type);
            h.f16444p = 2;
            if ((videoSize.flags & 1) != 0) {
                h.f16438j = (int) (videoSize.video_start_ts * 1000.0d);
            }
            return h;
        }
        return null;
    }

    public static jc k(TLRPC.PhotoSize photoSize, TLRPC.Document document, int i10) {
        TLRPC.InputStickerSet inputStickerSet;
        if (!(photoSize instanceof TLRPC.TL_photoStrippedSize) && !(photoSize instanceof TLRPC.TL_photoPathSize)) {
            if (photoSize == null || document == null) {
                return null;
            }
            Pattern pattern = vi.R1;
            int i11 = 0;
            while (true) {
                if (i11 >= document.attributes.size()) {
                    break;
                }
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i11);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                    TLRPC.InputStickerSet inputStickerSet2 = documentAttribute.stickerset;
                    if (!(inputStickerSet2 instanceof TLRPC.TL_inputStickerSetEmpty)) {
                        inputStickerSet = inputStickerSet2;
                    }
                } else {
                    i11++;
                }
            }
            inputStickerSet = null;
            if (inputStickerSet == null) {
                return null;
            }
            jc h = h(photoSize.location, photoSize.size, null, null, null, 1, document.dc_id, inputStickerSet, photoSize.type);
            if (photoSize.type.equalsIgnoreCase("a")) {
                h.f16444p = 1;
            } else if (photoSize.type.equalsIgnoreCase("v")) {
                h.f16444p = 2;
            }
            h.f16445q = i10;
            return h;
        }
        ?? obj = new Object();
        obj.f16439k = photoSize;
        return obj;
    }

    public static org.telegram.messenger.jc l(int r11, int r12, org.telegram.tgnet.TLRPC.User r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.jc.l(int, int, org.telegram.tgnet.TLRPC$User):org.telegram.messenger.jc");
    }

    public static jc m(int i10, int i11, TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            return l(i10, i11, (TLRPC.User) tLObject);
        }
        if (tLObject instanceof TLRPC.Chat) {
            return a(i11, (TLRPC.Chat) tLObject);
        }
        return null;
    }

    public static jc n(TLRPC.User user) {
        return m(e20.f15506s0, 2, user);
    }

    public static jc o(String str) {
        if (str == null) {
            return null;
        }
        ?? obj = new Object();
        obj.f16436g = str;
        obj.f16444p = 2;
        return obj;
    }

    public static jc p(c30 c30Var) {
        if (c30Var == null) {
            return null;
        }
        ?? obj = new Object();
        if (c30Var.f15065f) {
            obj.f16436g = c30Var.f15062a;
            return obj;
        }
        obj.v = c30Var;
        obj.f16446r = c30Var.d;
        return obj;
    }

    public static java.lang.String s(java.lang.Object r4, java.lang.Object r5, java.lang.Object r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.jc.s(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.String");
    }

    public final String q(Object obj, jc jcVar, boolean z10) {
        int i10;
        if (this.h != null) {
            return this.h.f17824b.dc_id + "_" + this.h.f17824b.f19931id;
        }
        TLRPC.PhotoSize photoSize = this.f16439k;
        if (!(photoSize instanceof TLRPC.TL_photoStrippedSize) && !(photoSize instanceof TLRPC.TL_photoPathSize)) {
            if (this.f16435f != null) {
                return this.f16435f.volume_id + "_" + this.f16435f.local_id;
            }
            c30 c30Var = this.v;
            if (c30Var != null) {
                return Utilities.a(c30Var.f15062a);
            }
            TLRPC.Document document = this.f16437i;
            if (document != null) {
                if (!z10 && (document instanceof u5)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.f16437i.dc_id);
                    sb2.append("_");
                    sb2.append(this.f16437i.f19800id);
                    sb2.append("_");
                    TLRPC.ThemeSettings themeSettings = ((u5) document).f18384a;
                    sb2.append(org.telegram.ui.ActionBar.t6.r0(themeSettings));
                    sb2.append("_");
                    sb2.append(themeSettings.accent_color);
                    sb2.append("_");
                    int i11 = 0;
                    if (themeSettings.message_colors.size() > 1) {
                        i10 = themeSettings.message_colors.get(1).intValue();
                    } else {
                        i10 = 0;
                    }
                    sb2.append(i10);
                    sb2.append("_");
                    if (themeSettings.message_colors.size() > 0) {
                        i11 = themeSettings.message_colors.get(0).intValue();
                    }
                    sb2.append(i11);
                    return sb2.toString();
                } else if (document.f19800id != 0 && document.dc_id != 0) {
                    return this.f16437i.dc_id + "_" + this.f16437i.f19800id;
                } else {
                    return null;
                }
            }
            String str = this.f16436g;
            if (str != null) {
                return Utilities.a(str);
            }
            return null;
        } else if (photoSize.bytes.length > 0) {
            if (jcVar == null) {
                jcVar = this;
            }
            return s(obj, jcVar, photoSize);
        } else {
            return null;
        }
    }

    public final long r() {
        int i10;
        TLRPC.PhotoSize photoSize = this.f16439k;
        if (photoSize != null) {
            i10 = photoSize.size;
        } else {
            qw qwVar = this.h;
            if (qwVar != null) {
                TLRPC.TL_secureFile tL_secureFile = qwVar.f17824b;
                if (tL_secureFile != null) {
                    return tL_secureFile.size;
                }
            } else {
                TLRPC.Document document = this.f16437i;
                if (document != null) {
                    return document.size;
                }
                c30 c30Var = this.v;
                if (c30Var != null) {
                    i10 = c30Var.d;
                }
            }
            return this.f16446r;
        }
        return i10;
    }
}
