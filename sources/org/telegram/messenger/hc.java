package org.telegram.messenger;

import java.util.regex.Pattern;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hc {
    public int f22852a;
    public byte[] f22853b;
    public byte[] f22854c;
    public byte[] d;
    public long f22855e;
    public TLRPC.TL_fileLocationToBeDeprecated f22856f;
    public String f22857g;
    public ew h;
    public TLRPC.Document f22858i;
    public long f22859j;
    public TLRPC.PhotoSize f22860k;
    public TLRPC.Photo f22861l;
    public int f22862m;
    public TLRPC.InputPeer f22863n;
    public TLRPC.InputStickerSet f22864o;
    public int f22865p;
    public int f22866q;
    public long f22867r;
    public long f22868s;
    public long f22869t;
    public String f22870u;
    public m20 v;

    public static hc a(int i7, TLRPC.Chat chat) {
        TLRPC.ChatPhoto chatPhoto;
        TLRPC.FileLocation fileLocation;
        TLRPC.InputPeer tL_inputPeerChat;
        if (chat != null && (chatPhoto = chat.photo) != null) {
            if (i7 == 2) {
                if (chatPhoto.stripped_thumb != null) {
                    ?? obj = new Object();
                    TLRPC.TL_photoStrippedSize tL_photoStrippedSize = new TLRPC.TL_photoStrippedSize();
                    obj.f22860k = tL_photoStrippedSize;
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
                        tL_inputPeerChat.channel_id = chat.f26952id;
                        tL_inputPeerChat.access_hash = chat.access_hash;
                    } else {
                        return null;
                    }
                } else {
                    tL_inputPeerChat = new TLRPC.TL_inputPeerChat();
                    tL_inputPeerChat.chat_id = chat.f26952id;
                }
                TLRPC.InputPeer inputPeer = tL_inputPeerChat;
                int i10 = chat.photo.dc_id;
                if (i10 == 0) {
                    i10 = fileLocation2.dc_id;
                }
                hc h = h(fileLocation2, 0, null, null, inputPeer, i7, i10, null, null);
                h.f22868s = chat.photo.photo_id;
                return h;
            }
            return null;
        }
        return null;
    }

    public static hc b(TLRPC.Document document) {
        if (document == null) {
            return null;
        }
        ?? obj = new Object();
        obj.f22858i = document;
        obj.f22854c = document.key;
        obj.d = document.iv;
        obj.f22867r = document.size;
        return obj;
    }

    public static hc c(TLRPC.PhotoSize photoSize, TLRPC.Document document) {
        if (!(photoSize instanceof TLRPC.TL_photoStrippedSize) && !(photoSize instanceof TLRPC.TL_photoPathSize)) {
            if (photoSize != null && document != null) {
                return h(photoSize.location, photoSize.size, null, document, null, 1, document.dc_id, null, photoSize.type);
            }
            return null;
        }
        ?? obj = new Object();
        obj.f22860k = photoSize;
        return obj;
    }

    public static hc d(TLRPC.VideoSize videoSize, TLRPC.Document document) {
        if (videoSize != null && document != null) {
            hc h = h(videoSize.location, videoSize.size, null, document, null, 1, document.dc_id, null, videoSize.type);
            if ("f".equals(videoSize.type)) {
                h.f22865p = 1;
                return h;
            }
            h.f22865p = 2;
            return h;
        }
        return null;
    }

    public static hc e(TLRPC.FileLocation fileLocation) {
        if (fileLocation == null) {
            return null;
        }
        ?? obj = new Object();
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = new TLRPC.TL_fileLocationToBeDeprecated();
        obj.f22856f = tL_fileLocationToBeDeprecated;
        tL_fileLocationToBeDeprecated.local_id = fileLocation.local_id;
        tL_fileLocationToBeDeprecated.volume_id = fileLocation.volume_id;
        tL_fileLocationToBeDeprecated.secret = fileLocation.secret;
        tL_fileLocationToBeDeprecated.dc_id = fileLocation.dc_id;
        return obj;
    }

    public static hc f(TLRPC.PhotoSize photoSize, TLObject tLObject) {
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
        obj.f22860k = photoSize;
        return obj;
    }

    public static hc g(String str) {
        if (str == null) {
            return null;
        }
        ?? obj = new Object();
        obj.f22857g = str;
        return obj;
    }

    public static hc h(TLRPC.FileLocation fileLocation, int i7, TLRPC.Photo photo, TLRPC.Document document, TLRPC.InputPeer inputPeer, int i10, int i11, TLRPC.InputStickerSet inputStickerSet, String str) {
        if (fileLocation != null) {
            if (photo != null || inputPeer != null || inputStickerSet != null || document != null) {
                ?? obj = new Object();
                obj.f22852a = i11;
                obj.f22861l = photo;
                obj.f22867r = i7;
                obj.f22863n = inputPeer;
                obj.f22862m = i10;
                obj.f22864o = inputStickerSet;
                if (fileLocation instanceof TLRPC.TL_fileLocationToBeDeprecated) {
                    obj.f22856f = (TLRPC.TL_fileLocationToBeDeprecated) fileLocation;
                    if (photo != null) {
                        obj.f22853b = photo.file_reference;
                        obj.f22855e = photo.access_hash;
                        obj.f22868s = photo.f26976id;
                        obj.f22870u = str;
                        return obj;
                    }
                    if (document != null) {
                        obj.f22853b = document.file_reference;
                        obj.f22855e = document.access_hash;
                        obj.f22869t = document.f26958id;
                        obj.f22870u = str;
                    }
                    return obj;
                }
                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = new TLRPC.TL_fileLocationToBeDeprecated();
                obj.f22856f = tL_fileLocationToBeDeprecated;
                tL_fileLocationToBeDeprecated.local_id = fileLocation.local_id;
                tL_fileLocationToBeDeprecated.volume_id = fileLocation.volume_id;
                tL_fileLocationToBeDeprecated.secret = fileLocation.secret;
                obj.f22852a = fileLocation.dc_id;
                obj.f22853b = fileLocation.file_reference;
                obj.f22854c = fileLocation.key;
                obj.d = fileLocation.iv;
                obj.f22855e = fileLocation.secret;
                return obj;
            }
            return null;
        }
        return null;
    }

    public static hc i(TLRPC.PhotoSize photoSize, TLRPC.Photo photo) {
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
        obj.f22860k = photoSize;
        return obj;
    }

    public static hc j(TLRPC.VideoSize videoSize, TLRPC.Photo photo) {
        if (videoSize != null && photo != null) {
            hc h = h(videoSize.location, videoSize.size, photo, null, null, 1, photo.dc_id, null, videoSize.type);
            h.f22865p = 2;
            if ((videoSize.flags & 1) != 0) {
                h.f22859j = (int) (videoSize.video_start_ts * 1000.0d);
            }
            return h;
        }
        return null;
    }

    public static hc k(TLRPC.PhotoSize photoSize, TLRPC.Document document, int i7) {
        TLRPC.InputStickerSet inputStickerSet;
        if (!(photoSize instanceof TLRPC.TL_photoStrippedSize) && !(photoSize instanceof TLRPC.TL_photoPathSize)) {
            if (photoSize == null || document == null) {
                return null;
            }
            Pattern pattern = ui.R1;
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
            hc h = h(photoSize.location, photoSize.size, null, null, null, 1, document.dc_id, inputStickerSet, photoSize.type);
            if (photoSize.type.equalsIgnoreCase("a")) {
                h.f22865p = 1;
            } else if (photoSize.type.equalsIgnoreCase("v")) {
                h.f22865p = 2;
            }
            h.f22866q = i7;
            return h;
        }
        ?? obj = new Object();
        obj.f22860k = photoSize;
        return obj;
    }

    public static org.telegram.messenger.hc l(int r11, int r12, org.telegram.tgnet.TLRPC.User r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.hc.l(int, int, org.telegram.tgnet.TLRPC$User):org.telegram.messenger.hc");
    }

    public static hc m(int i7, int i10, TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            return l(i7, i10, (TLRPC.User) tLObject);
        }
        if (tLObject instanceof TLRPC.Chat) {
            return a(i10, (TLRPC.Chat) tLObject);
        }
        return null;
    }

    public static hc n(TLRPC.User user) {
        return m(p10.f24459s0, 2, user);
    }

    public static hc o(String str) {
        if (str == null) {
            return null;
        }
        ?? obj = new Object();
        obj.f22857g = str;
        obj.f22865p = 2;
        return obj;
    }

    public static hc p(m20 m20Var) {
        if (m20Var == null) {
            return null;
        }
        ?? obj = new Object();
        if (m20Var.f23969f) {
            obj.f22857g = m20Var.f23965a;
            return obj;
        }
        obj.v = m20Var;
        obj.f22867r = m20Var.d;
        return obj;
    }

    public static java.lang.String s(java.lang.Object r4, java.lang.Object r5, java.lang.Object r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.hc.s(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.String");
    }

    public final String q(Object obj, hc hcVar, boolean z9) {
        int i7;
        if (this.h != null) {
            return this.h.f22259b.dc_id + "_" + this.h.f22259b.f27089id;
        }
        TLRPC.PhotoSize photoSize = this.f22860k;
        if (!(photoSize instanceof TLRPC.TL_photoStrippedSize) && !(photoSize instanceof TLRPC.TL_photoPathSize)) {
            if (this.f22856f != null) {
                return this.f22856f.volume_id + "_" + this.f22856f.local_id;
            }
            m20 m20Var = this.v;
            if (m20Var != null) {
                return Utilities.a(m20Var.f23965a);
            }
            TLRPC.Document document = this.f22858i;
            if (document != null) {
                if (!z9 && (document instanceof s5)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.f22858i.dc_id);
                    sb2.append("_");
                    sb2.append(this.f22858i.f26958id);
                    sb2.append("_");
                    TLRPC.ThemeSettings themeSettings = ((s5) document).f25411a;
                    sb2.append(org.telegram.ui.ActionBar.k6.r0(themeSettings));
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
                } else if (document.f26958id != 0 && document.dc_id != 0) {
                    return this.f22858i.dc_id + "_" + this.f22858i.f26958id;
                } else {
                    return null;
                }
            }
            String str = this.f22857g;
            if (str != null) {
                return Utilities.a(str);
            }
            return null;
        } else if (photoSize.bytes.length > 0) {
            if (hcVar == null) {
                hcVar = this;
            }
            return s(obj, hcVar, photoSize);
        } else {
            return null;
        }
    }

    public final long r() {
        int i7;
        TLRPC.PhotoSize photoSize = this.f22860k;
        if (photoSize != null) {
            i7 = photoSize.size;
        } else {
            ew ewVar = this.h;
            if (ewVar != null) {
                TLRPC.TL_secureFile tL_secureFile = ewVar.f22259b;
                if (tL_secureFile != null) {
                    return tL_secureFile.size;
                }
            } else {
                TLRPC.Document document = this.f22858i;
                if (document != null) {
                    return document.size;
                }
                m20 m20Var = this.v;
                if (m20Var != null) {
                    i7 = m20Var.d;
                }
            }
            return this.f22867r;
        }
        return i7;
    }
}
