package org.telegram.messenger;

import java.util.regex.Pattern;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ic {
    public int f16097a;
    public byte[] f16098b;
    public byte[] f16099c;
    public byte[] d;
    public long e;
    public TLRPC.TL_fileLocationToBeDeprecated f16100f;
    public String f16101g;
    public pw h;
    public TLRPC.Document f16102i;
    public long f16103j;
    public TLRPC.PhotoSize f16104k;
    public TLRPC.Photo f16105l;
    public int f16106m;
    public TLRPC.InputPeer f16107n;
    public TLRPC.InputStickerSet f16108o;
    public int f16109p;
    public int f16110q;
    public long f16111r;
    public long f16112s;
    public long f16113t;
    public String f16114u;
    public b30 v;

    public static ic a(int i10, TLRPC.Chat chat) {
        TLRPC.ChatPhoto chatPhoto;
        TLRPC.FileLocation fileLocation;
        TLRPC.InputPeer tL_inputPeerChat;
        if (chat != null && (chatPhoto = chat.photo) != null) {
            if (i10 == 2) {
                if (chatPhoto.stripped_thumb != null) {
                    ?? obj = new Object();
                    TLRPC.TL_photoStrippedSize tL_photoStrippedSize = new TLRPC.TL_photoStrippedSize();
                    obj.f16104k = tL_photoStrippedSize;
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
                        tL_inputPeerChat.channel_id = chat.f19793id;
                        tL_inputPeerChat.access_hash = chat.access_hash;
                    } else {
                        return null;
                    }
                } else {
                    tL_inputPeerChat = new TLRPC.TL_inputPeerChat();
                    tL_inputPeerChat.chat_id = chat.f19793id;
                }
                TLRPC.InputPeer inputPeer = tL_inputPeerChat;
                int i11 = chat.photo.dc_id;
                if (i11 == 0) {
                    i11 = fileLocation2.dc_id;
                }
                ic h = h(fileLocation2, 0, null, null, inputPeer, i10, i11, null, null);
                h.f16112s = chat.photo.photo_id;
                return h;
            }
            return null;
        }
        return null;
    }

    public static ic b(TLRPC.Document document) {
        if (document == null) {
            return null;
        }
        ?? obj = new Object();
        obj.f16102i = document;
        obj.f16099c = document.key;
        obj.d = document.iv;
        obj.f16111r = document.size;
        return obj;
    }

    public static ic c(TLRPC.PhotoSize photoSize, TLRPC.Document document) {
        if (!(photoSize instanceof TLRPC.TL_photoStrippedSize) && !(photoSize instanceof TLRPC.TL_photoPathSize)) {
            if (photoSize != null && document != null) {
                return h(photoSize.location, photoSize.size, null, document, null, 1, document.dc_id, null, photoSize.type);
            }
            return null;
        }
        ?? obj = new Object();
        obj.f16104k = photoSize;
        return obj;
    }

    public static ic d(TLRPC.VideoSize videoSize, TLRPC.Document document) {
        if (videoSize != null && document != null) {
            ic h = h(videoSize.location, videoSize.size, null, document, null, 1, document.dc_id, null, videoSize.type);
            if ("f".equals(videoSize.type)) {
                h.f16109p = 1;
                return h;
            }
            h.f16109p = 2;
            return h;
        }
        return null;
    }

    public static ic e(TLRPC.FileLocation fileLocation) {
        if (fileLocation == null) {
            return null;
        }
        ?? obj = new Object();
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = new TLRPC.TL_fileLocationToBeDeprecated();
        obj.f16100f = tL_fileLocationToBeDeprecated;
        tL_fileLocationToBeDeprecated.local_id = fileLocation.local_id;
        tL_fileLocationToBeDeprecated.volume_id = fileLocation.volume_id;
        tL_fileLocationToBeDeprecated.secret = fileLocation.secret;
        tL_fileLocationToBeDeprecated.dc_id = fileLocation.dc_id;
        return obj;
    }

    public static ic f(TLRPC.PhotoSize photoSize, TLObject tLObject) {
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
        obj.f16104k = photoSize;
        return obj;
    }

    public static ic g(String str) {
        if (str == null) {
            return null;
        }
        ?? obj = new Object();
        obj.f16101g = str;
        return obj;
    }

    public static ic h(TLRPC.FileLocation fileLocation, int i10, TLRPC.Photo photo, TLRPC.Document document, TLRPC.InputPeer inputPeer, int i11, int i12, TLRPC.InputStickerSet inputStickerSet, String str) {
        if (fileLocation != null) {
            if (photo != null || inputPeer != null || inputStickerSet != null || document != null) {
                ?? obj = new Object();
                obj.f16097a = i12;
                obj.f16105l = photo;
                obj.f16111r = i10;
                obj.f16107n = inputPeer;
                obj.f16106m = i11;
                obj.f16108o = inputStickerSet;
                if (fileLocation instanceof TLRPC.TL_fileLocationToBeDeprecated) {
                    obj.f16100f = (TLRPC.TL_fileLocationToBeDeprecated) fileLocation;
                    if (photo != null) {
                        obj.f16098b = photo.file_reference;
                        obj.e = photo.access_hash;
                        obj.f16112s = photo.f19817id;
                        obj.f16114u = str;
                        return obj;
                    }
                    if (document != null) {
                        obj.f16098b = document.file_reference;
                        obj.e = document.access_hash;
                        obj.f16113t = document.f19799id;
                        obj.f16114u = str;
                    }
                    return obj;
                }
                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = new TLRPC.TL_fileLocationToBeDeprecated();
                obj.f16100f = tL_fileLocationToBeDeprecated;
                tL_fileLocationToBeDeprecated.local_id = fileLocation.local_id;
                tL_fileLocationToBeDeprecated.volume_id = fileLocation.volume_id;
                tL_fileLocationToBeDeprecated.secret = fileLocation.secret;
                obj.f16097a = fileLocation.dc_id;
                obj.f16098b = fileLocation.file_reference;
                obj.f16099c = fileLocation.key;
                obj.d = fileLocation.iv;
                obj.e = fileLocation.secret;
                return obj;
            }
            return null;
        }
        return null;
    }

    public static ic i(TLRPC.PhotoSize photoSize, TLRPC.Photo photo) {
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
        obj.f16104k = photoSize;
        return obj;
    }

    public static ic j(TLRPC.VideoSize videoSize, TLRPC.Photo photo) {
        if (videoSize != null && photo != null) {
            ic h = h(videoSize.location, videoSize.size, photo, null, null, 1, photo.dc_id, null, videoSize.type);
            h.f16109p = 2;
            if ((videoSize.flags & 1) != 0) {
                h.f16103j = (int) (videoSize.video_start_ts * 1000.0d);
            }
            return h;
        }
        return null;
    }

    public static ic k(TLRPC.PhotoSize photoSize, TLRPC.Document document, int i10) {
        TLRPC.InputStickerSet inputStickerSet;
        if (!(photoSize instanceof TLRPC.TL_photoStrippedSize) && !(photoSize instanceof TLRPC.TL_photoPathSize)) {
            if (photoSize == null || document == null) {
                return null;
            }
            Pattern pattern = ui.R1;
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
            ic h = h(photoSize.location, photoSize.size, null, null, null, 1, document.dc_id, inputStickerSet, photoSize.type);
            if (photoSize.type.equalsIgnoreCase("a")) {
                h.f16109p = 1;
            } else if (photoSize.type.equalsIgnoreCase("v")) {
                h.f16109p = 2;
            }
            h.f16110q = i10;
            return h;
        }
        ?? obj = new Object();
        obj.f16104k = photoSize;
        return obj;
    }

    public static org.telegram.messenger.ic l(int r11, int r12, org.telegram.tgnet.TLRPC.User r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ic.l(int, int, org.telegram.tgnet.TLRPC$User):org.telegram.messenger.ic");
    }

    public static ic m(int i10, int i11, TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            return l(i10, i11, (TLRPC.User) tLObject);
        }
        if (tLObject instanceof TLRPC.Chat) {
            return a(i11, (TLRPC.Chat) tLObject);
        }
        return null;
    }

    public static ic n(TLRPC.User user) {
        return m(d20.f15147s0, 2, user);
    }

    public static ic o(String str) {
        if (str == null) {
            return null;
        }
        ?? obj = new Object();
        obj.f16101g = str;
        obj.f16109p = 2;
        return obj;
    }

    public static ic p(b30 b30Var) {
        if (b30Var == null) {
            return null;
        }
        ?? obj = new Object();
        if (b30Var.f14718f) {
            obj.f16101g = b30Var.f14715a;
            return obj;
        }
        obj.v = b30Var;
        obj.f16111r = b30Var.d;
        return obj;
    }

    public static java.lang.String s(java.lang.Object r4, java.lang.Object r5, java.lang.Object r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ic.s(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.String");
    }

    public final String q(Object obj, ic icVar, boolean z10) {
        int i10;
        if (this.h != null) {
            return this.h.f17489b.dc_id + "_" + this.h.f17489b.f19930id;
        }
        TLRPC.PhotoSize photoSize = this.f16104k;
        if (!(photoSize instanceof TLRPC.TL_photoStrippedSize) && !(photoSize instanceof TLRPC.TL_photoPathSize)) {
            if (this.f16100f != null) {
                return this.f16100f.volume_id + "_" + this.f16100f.local_id;
            }
            b30 b30Var = this.v;
            if (b30Var != null) {
                return Utilities.a(b30Var.f14715a);
            }
            TLRPC.Document document = this.f16102i;
            if (document != null) {
                if (!z10 && (document instanceof u5)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.f16102i.dc_id);
                    sb2.append("_");
                    sb2.append(this.f16102i.f19799id);
                    sb2.append("_");
                    TLRPC.ThemeSettings themeSettings = ((u5) document).f18251a;
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
                } else if (document.f19799id != 0 && document.dc_id != 0) {
                    return this.f16102i.dc_id + "_" + this.f16102i.f19799id;
                } else {
                    return null;
                }
            }
            String str = this.f16101g;
            if (str != null) {
                return Utilities.a(str);
            }
            return null;
        } else if (photoSize.bytes.length > 0) {
            if (icVar == null) {
                icVar = this;
            }
            return s(obj, icVar, photoSize);
        } else {
            return null;
        }
    }

    public final long r() {
        int i10;
        TLRPC.PhotoSize photoSize = this.f16104k;
        if (photoSize != null) {
            i10 = photoSize.size;
        } else {
            pw pwVar = this.h;
            if (pwVar != null) {
                TLRPC.TL_secureFile tL_secureFile = pwVar.f17489b;
                if (tL_secureFile != null) {
                    return tL_secureFile.size;
                }
            } else {
                TLRPC.Document document = this.f16102i;
                if (document != null) {
                    return document.size;
                }
                b30 b30Var = this.v;
                if (b30Var != null) {
                    i10 = b30Var.d;
                }
            }
            return this.f16111r;
        }
        return i10;
    }
}
