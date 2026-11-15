package org.telegram.messenger;

import java.util.regex.Pattern;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gc {
    public int f23713a;
    public byte[] f23714b;
    public byte[] f23715c;
    public byte[] d;
    public long f23716e;
    public TLRPC.TL_fileLocationToBeDeprecated f23717f;
    public String f23718g;
    public cw h;
    public TLRPC.Document f23719i;
    public long f23720j;
    public TLRPC.PhotoSize f23721k;
    public TLRPC.Photo f23722l;
    public int f23723m;
    public TLRPC.InputPeer f23724n;
    public TLRPC.InputStickerSet f23725o;
    public int f23726p;
    public int f23727q;
    public long f23728r;
    public long f23729s;
    public long f23730t;
    public String f23731u;
    public k20 v;

    public static gc a(int i7, TLRPC.Chat chat) {
        TLRPC.ChatPhoto chatPhoto;
        TLRPC.FileLocation fileLocation;
        TLRPC.InputPeer tL_inputPeerChat;
        if (chat != null && (chatPhoto = chat.photo) != null) {
            if (i7 == 2) {
                if (chatPhoto.stripped_thumb != null) {
                    ?? obj = new Object();
                    TLRPC.TL_photoStrippedSize tL_photoStrippedSize = new TLRPC.TL_photoStrippedSize();
                    obj.f23721k = tL_photoStrippedSize;
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
                if (t3.T(chat)) {
                    if (chat.access_hash != 0) {
                        tL_inputPeerChat = new TLRPC.TL_inputPeerChannel();
                        tL_inputPeerChat.channel_id = chat.f28051id;
                        tL_inputPeerChat.access_hash = chat.access_hash;
                    } else {
                        return null;
                    }
                } else {
                    tL_inputPeerChat = new TLRPC.TL_inputPeerChat();
                    tL_inputPeerChat.chat_id = chat.f28051id;
                }
                TLRPC.InputPeer inputPeer = tL_inputPeerChat;
                int i10 = chat.photo.dc_id;
                if (i10 == 0) {
                    i10 = fileLocation2.dc_id;
                }
                gc h = h(fileLocation2, 0, null, null, inputPeer, i7, i10, null, null);
                h.f23729s = chat.photo.photo_id;
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
        obj.f23719i = document;
        obj.f23715c = document.key;
        obj.d = document.iv;
        obj.f23728r = document.size;
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
        obj.f23721k = photoSize;
        return obj;
    }

    public static gc d(TLRPC.VideoSize videoSize, TLRPC.Document document) {
        if (videoSize != null && document != null) {
            gc h = h(videoSize.location, videoSize.size, null, document, null, 1, document.dc_id, null, videoSize.type);
            if ("f".equals(videoSize.type)) {
                h.f23726p = 1;
                return h;
            }
            h.f23726p = 2;
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
        obj.f23717f = tL_fileLocationToBeDeprecated;
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
        obj.f23721k = photoSize;
        return obj;
    }

    public static gc g(String str) {
        if (str == null) {
            return null;
        }
        ?? obj = new Object();
        obj.f23718g = str;
        return obj;
    }

    public static gc h(TLRPC.FileLocation fileLocation, int i7, TLRPC.Photo photo, TLRPC.Document document, TLRPC.InputPeer inputPeer, int i10, int i11, TLRPC.InputStickerSet inputStickerSet, String str) {
        if (fileLocation != null) {
            if (photo != null || inputPeer != null || inputStickerSet != null || document != null) {
                ?? obj = new Object();
                obj.f23713a = i11;
                obj.f23722l = photo;
                obj.f23728r = i7;
                obj.f23724n = inputPeer;
                obj.f23723m = i10;
                obj.f23725o = inputStickerSet;
                if (fileLocation instanceof TLRPC.TL_fileLocationToBeDeprecated) {
                    obj.f23717f = (TLRPC.TL_fileLocationToBeDeprecated) fileLocation;
                    if (photo != null) {
                        obj.f23714b = photo.file_reference;
                        obj.f23716e = photo.access_hash;
                        obj.f23729s = photo.f28075id;
                        obj.f23731u = str;
                        return obj;
                    }
                    if (document != null) {
                        obj.f23714b = document.file_reference;
                        obj.f23716e = document.access_hash;
                        obj.f23730t = document.f28057id;
                        obj.f23731u = str;
                    }
                    return obj;
                }
                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = new TLRPC.TL_fileLocationToBeDeprecated();
                obj.f23717f = tL_fileLocationToBeDeprecated;
                tL_fileLocationToBeDeprecated.local_id = fileLocation.local_id;
                tL_fileLocationToBeDeprecated.volume_id = fileLocation.volume_id;
                tL_fileLocationToBeDeprecated.secret = fileLocation.secret;
                obj.f23713a = fileLocation.dc_id;
                obj.f23714b = fileLocation.file_reference;
                obj.f23715c = fileLocation.key;
                obj.d = fileLocation.iv;
                obj.f23716e = fileLocation.secret;
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
        obj.f23721k = photoSize;
        return obj;
    }

    public static gc j(TLRPC.VideoSize videoSize, TLRPC.Photo photo) {
        if (videoSize != null && photo != null) {
            gc h = h(videoSize.location, videoSize.size, photo, null, null, 1, photo.dc_id, null, videoSize.type);
            h.f23726p = 2;
            if ((videoSize.flags & 1) != 0) {
                h.f23720j = (int) (videoSize.video_start_ts * 1000.0d);
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
            Pattern pattern = si.S1;
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
                h.f23726p = 1;
            } else if (photoSize.type.equalsIgnoreCase("v")) {
                h.f23726p = 2;
            }
            h.f23727q = i7;
            return h;
        }
        ?? obj = new Object();
        obj.f23721k = photoSize;
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
        return m(m10.f24940t0, 2, user);
    }

    public static gc o(String str) {
        if (str == null) {
            return null;
        }
        ?? obj = new Object();
        obj.f23718g = str;
        obj.f23726p = 2;
        return obj;
    }

    public static gc p(k20 k20Var) {
        if (k20Var == null) {
            return null;
        }
        ?? obj = new Object();
        if (k20Var.f24637f) {
            obj.f23718g = k20Var.f24633a;
            return obj;
        }
        obj.v = k20Var;
        obj.f23728r = k20Var.d;
        return obj;
    }

    public static java.lang.String s(java.lang.Object r4, java.lang.Object r5, java.lang.Object r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.gc.s(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.String");
    }

    public final String q(Object obj, gc gcVar, boolean z10) {
        int i7;
        if (this.h != null) {
            return this.h.f22959b.dc_id + "_" + this.h.f22959b.f28188id;
        }
        TLRPC.PhotoSize photoSize = this.f23721k;
        if (!(photoSize instanceof TLRPC.TL_photoStrippedSize) && !(photoSize instanceof TLRPC.TL_photoPathSize)) {
            if (this.f23717f != null) {
                return this.f23717f.volume_id + "_" + this.f23717f.local_id;
            }
            k20 k20Var = this.v;
            if (k20Var != null) {
                return Utilities.a(k20Var.f24633a);
            }
            TLRPC.Document document = this.f23719i;
            if (document != null) {
                if (!z10 && (document instanceof s5)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.f23719i.dc_id);
                    sb2.append("_");
                    sb2.append(this.f23719i.f28057id);
                    sb2.append("_");
                    TLRPC.ThemeSettings themeSettings = ((s5) document).f26409a;
                    sb2.append(org.telegram.ui.ActionBar.j6.r0(themeSettings));
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
                } else if (document.f28057id != 0 && document.dc_id != 0) {
                    return this.f23719i.dc_id + "_" + this.f23719i.f28057id;
                } else {
                    return null;
                }
            }
            String str = this.f23718g;
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
        TLRPC.PhotoSize photoSize = this.f23721k;
        if (photoSize != null) {
            i7 = photoSize.size;
        } else {
            cw cwVar = this.h;
            if (cwVar != null) {
                TLRPC.TL_secureFile tL_secureFile = cwVar.f22959b;
                if (tL_secureFile != null) {
                    return tL_secureFile.size;
                }
            } else {
                TLRPC.Document document = this.f23719i;
                if (document != null) {
                    return document.size;
                }
                k20 k20Var = this.v;
                if (k20Var != null) {
                    i7 = k20Var.d;
                }
            }
            return this.f23728r;
        }
        return i7;
    }
}
