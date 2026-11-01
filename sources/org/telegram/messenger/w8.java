package org.telegram.messenger;

import android.os.SystemClock;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;
public final class w8 extends f1 {
    public static volatile w8[] f19002s = new w8[4];
    public final HashMap f19003a;
    public final HashMap f19004b;
    public final HashMap f19005c;
    public final HashMap d;
    public long e;
    public final ArrayList f19006f;
    public final ArrayList h;
    public final ArrayList f19007n;
    public final ArrayList f19008r;

    public w8(int i10) {
        super(i10);
        this.f19003a = new HashMap();
        this.f19004b = new HashMap();
        this.f19005c = new HashMap();
        this.d = new HashMap();
        this.e = SystemClock.elapsedRealtime();
        this.f19006f = new ArrayList();
        this.h = new ArrayList();
        this.f19007n = new ArrayList();
        this.f19008r = new ArrayList();
    }

    public static int c(String str) {
        if (str != null && str.startsWith("FILE_REFERENCE_") && str.endsWith("_EXPIRED")) {
            try {
                return Integer.parseInt(str.substring(15, str.length() - 8));
            } catch (Exception unused) {
            }
        }
        return -1;
    }

    public static byte[] e(TLRPC.Document document, ArrayList arrayList, TLRPC.InputFileLocation inputFileLocation, boolean[] zArr, TLRPC.InputFileLocation[] inputFileLocationArr) {
        byte[] bArr;
        if (document != null && inputFileLocation != null) {
            if (inputFileLocation instanceof TLRPC.TL_inputDocumentFileLocation) {
                if (document.f19800id == inputFileLocation.f19809id) {
                    return document.file_reference;
                }
            } else {
                int size = document.thumbs.size();
                for (int i10 = 0; i10 < size; i10++) {
                    TLRPC.PhotoSize photoSize = document.thumbs.get(i10);
                    if (photoSize != null && (inputFileLocation instanceof TLRPC.TL_inputFileLocation)) {
                        bArr = f(photoSize.location, inputFileLocation, zArr);
                    } else {
                        bArr = null;
                    }
                    if (zArr != null && zArr[0]) {
                        TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation = new TLRPC.TL_inputDocumentFileLocation();
                        inputFileLocationArr[0] = tL_inputDocumentFileLocation;
                        tL_inputDocumentFileLocation.f19809id = document.f19800id;
                        tL_inputDocumentFileLocation.volume_id = inputFileLocation.volume_id;
                        tL_inputDocumentFileLocation.local_id = inputFileLocation.local_id;
                        tL_inputDocumentFileLocation.access_hash = document.access_hash;
                        byte[] bArr2 = document.file_reference;
                        tL_inputDocumentFileLocation.file_reference = bArr2;
                        tL_inputDocumentFileLocation.thumb_size = photoSize.type;
                        return bArr2;
                    } else if (bArr != null) {
                        return bArr;
                    }
                }
            }
            if (arrayList != null) {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    byte[] e = e((TLRPC.Document) arrayList.get(i11), null, inputFileLocation, zArr, inputFileLocationArr);
                    if (e != null) {
                        return e;
                    }
                }
            }
        }
        return null;
    }

    public static byte[] f(TLRPC.FileLocation fileLocation, TLRPC.InputFileLocation inputFileLocation, boolean[] zArr) {
        if (fileLocation != null && (inputFileLocation instanceof TLRPC.TL_inputFileLocation) && fileLocation.local_id == inputFileLocation.local_id && fileLocation.volume_id == inputFileLocation.volume_id) {
            byte[] bArr = fileLocation.file_reference;
            if (bArr == null && zArr != null) {
                zArr[0] = true;
            }
            return bArr;
        }
        return null;
    }

    public static byte[] g(TLRPC.Photo photo, TLRPC.InputFileLocation inputFileLocation, boolean[] zArr, TLRPC.InputFileLocation[] inputFileLocationArr) {
        byte[] bArr;
        if (photo != null) {
            if (inputFileLocation instanceof TLRPC.TL_inputPhotoFileLocation) {
                if (photo.f19818id == inputFileLocation.f19809id) {
                    return photo.file_reference;
                }
            } else if (inputFileLocation instanceof TLRPC.TL_inputFileLocation) {
                int size = photo.sizes.size();
                for (int i10 = 0; i10 < size; i10++) {
                    TLRPC.PhotoSize photoSize = photo.sizes.get(i10);
                    if (photoSize != null) {
                        bArr = f(photoSize.location, inputFileLocation, zArr);
                    } else {
                        bArr = null;
                    }
                    if (zArr != null && zArr[0]) {
                        TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation = new TLRPC.TL_inputPhotoFileLocation();
                        inputFileLocationArr[0] = tL_inputPhotoFileLocation;
                        tL_inputPhotoFileLocation.f19809id = photo.f19818id;
                        tL_inputPhotoFileLocation.volume_id = inputFileLocation.volume_id;
                        tL_inputPhotoFileLocation.local_id = inputFileLocation.local_id;
                        tL_inputPhotoFileLocation.access_hash = photo.access_hash;
                        byte[] bArr2 = photo.file_reference;
                        tL_inputPhotoFileLocation.file_reference = bArr2;
                        tL_inputPhotoFileLocation.thumb_size = photoSize.type;
                        return bArr2;
                    } else if (bArr != null) {
                        return bArr;
                    }
                }
            }
        }
        return null;
    }

    public static byte[] i(TLRPC.WebPage webPage, TLRPC.InputFileLocation inputFileLocation, boolean[] zArr, TLRPC.InputFileLocation[] inputFileLocationArr) {
        byte[] e = e(webPage.document, null, inputFileLocation, zArr, inputFileLocationArr);
        if (e != null) {
            return e;
        }
        byte[] g10 = g(webPage.photo, inputFileLocation, zArr, inputFileLocationArr);
        if (g10 != null) {
            return g10;
        }
        if (!webPage.attributes.isEmpty()) {
            int size = webPage.attributes.size();
            for (int i10 = 0; i10 < size; i10++) {
                TLRPC.WebPageAttribute webPageAttribute = webPage.attributes.get(i10);
                if (webPageAttribute instanceof TLRPC.TL_webPageAttributeTheme) {
                    TLRPC.TL_webPageAttributeTheme tL_webPageAttributeTheme = (TLRPC.TL_webPageAttributeTheme) webPageAttribute;
                    int size2 = tL_webPageAttributeTheme.documents.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        byte[] e7 = e(tL_webPageAttributeTheme.documents.get(i11), null, inputFileLocation, zArr, inputFileLocationArr);
                        if (e7 != null) {
                            return e7;
                        }
                    }
                    continue;
                }
            }
        }
        TL_iv.Page page = webPage.cached_page;
        if (page != null) {
            int size3 = page.documents.size();
            for (int i12 = 0; i12 < size3; i12++) {
                byte[] e10 = e(webPage.cached_page.documents.get(i12), null, inputFileLocation, zArr, inputFileLocationArr);
                if (e10 != null) {
                    return e10;
                }
            }
            int size4 = webPage.cached_page.photos.size();
            for (int i13 = 0; i13 < size4; i13++) {
                byte[] g11 = g(webPage.cached_page.photos.get(i13), inputFileLocation, zArr, inputFileLocationArr);
                if (g11 != null) {
                    return g11;
                }
            }
        }
        return null;
    }

    public static byte[] j(TLRPC.MessageMedia messageMedia, TLRPC.InputFileLocation inputFileLocation, boolean[] zArr, TLRPC.InputFileLocation[] inputFileLocationArr) {
        TLRPC.Photo photo;
        byte[] bArr = null;
        if (messageMedia == null) {
            return null;
        }
        TLRPC.Document document = messageMedia.document;
        if (document != null) {
            bArr = e(document, messageMedia.alt_documents, inputFileLocation, zArr, inputFileLocationArr);
        } else {
            TLRPC.TL_game tL_game = messageMedia.game;
            if (tL_game != null) {
                bArr = e(tL_game.document, null, inputFileLocation, zArr, inputFileLocationArr);
                if (bArr == null) {
                    bArr = g(messageMedia.game.photo, inputFileLocation, zArr, inputFileLocationArr);
                }
            } else {
                TLRPC.Photo photo2 = messageMedia.photo;
                if (photo2 != null) {
                    bArr = g(photo2, inputFileLocation, zArr, inputFileLocationArr);
                } else {
                    TLRPC.WebPage webPage = messageMedia.webpage;
                    if (webPage != null) {
                        bArr = i(webPage, inputFileLocation, zArr, inputFileLocationArr);
                    }
                }
            }
        }
        if (bArr == null && (photo = messageMedia.video_cover) != null) {
            return g(photo, inputFileLocation, zArr, inputFileLocationArr);
        }
        return bArr;
    }

    public static byte[] k(TLRPC.TL_messageMediaPoll tL_messageMediaPoll, TLRPC.InputFileLocation inputFileLocation, boolean[] zArr, TLRPC.InputFileLocation[] inputFileLocationArr) {
        ArrayList<TLRPC.PollAnswer> arrayList;
        TLRPC.PollResults pollResults;
        TLRPC.MessageMedia messageMedia;
        if (tL_messageMediaPoll == null) {
            return null;
        }
        byte[] j10 = j(tL_messageMediaPoll.attached_media, inputFileLocation, zArr, inputFileLocationArr);
        if (j10 == null && (pollResults = tL_messageMediaPoll.results) != null && (messageMedia = pollResults.solution_media) != null) {
            j10 = j(messageMedia, inputFileLocation, zArr, inputFileLocationArr);
        }
        if (j10 == null && (arrayList = tL_messageMediaPoll.poll.answers) != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                TLRPC.PollAnswer pollAnswer = arrayList.get(i10);
                i10++;
                j10 = j(pollAnswer.media, inputFileLocation, zArr, inputFileLocationArr);
                if (j10 != null) {
                    break;
                }
            }
        }
        return j10;
    }

    public static byte[] l(TL_iv.RichMessage richMessage, TLRPC.InputFileLocation inputFileLocation, boolean[] zArr, TLRPC.InputFileLocation[] inputFileLocationArr) {
        if (richMessage == null) {
            return null;
        }
        ArrayList<TLRPC.Photo> arrayList = richMessage.photos;
        int size = arrayList.size();
        int i10 = 0;
        byte[] bArr = null;
        int i11 = 0;
        while (i11 < size) {
            TLRPC.Photo photo = arrayList.get(i11);
            i11++;
            bArr = g(photo, inputFileLocation, zArr, inputFileLocationArr);
            if (bArr != null) {
                return bArr;
            }
        }
        ArrayList<TLRPC.Document> arrayList2 = richMessage.documents;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            TLRPC.Document document = arrayList2.get(i10);
            i10++;
            bArr = e(document, null, inputFileLocation, zArr, inputFileLocationArr);
            if (bArr != null) {
                break;
            }
        }
        return bArr;
    }

    public static w8 n(int i10) {
        w8 w8Var;
        w8 w8Var2 = f19002s[i10];
        if (w8Var2 == null) {
            synchronized (w8.class) {
                try {
                    w8Var = f19002s[i10];
                    if (w8Var == null) {
                        w8[] w8VarArr = f19002s;
                        w8 w8Var3 = new w8(i10);
                        w8VarArr[i10] = w8Var3;
                        w8Var = w8Var3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return w8Var;
        }
        return w8Var2;
    }

    public static String o(Object obj) {
        TLRPC.Message message;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        if (obj instanceof th.p4) {
            th.p4 p4Var = (th.p4) obj;
            if (p4Var.f49382a == null) {
                f8.b("failed request reference can't find list in botpreview");
                return null;
            }
            TLRPC.MessageMedia messageMedia = p4Var.media;
            if (messageMedia.document != null) {
                return "botstory_doc_" + p4Var.media.document.f19800id;
            } else if (messageMedia.photo != null) {
                return "botstory_photo_" + p4Var.media.photo.f19818id;
            } else {
                return "botstory_" + p4Var.f20032id;
            }
        }
        long j10 = 0;
        if (obj instanceof TL_stories.StoryItem) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
            if (storyItem.dialogId == 0) {
                f8.b("failed request reference can't find dialogId");
                return null;
            }
            return "story_" + storyItem.dialogId + "_" + storyItem.f20032id;
        } else if (obj instanceof TLRPC.TL_help_premiumPromo) {
            return "premium_promo";
        } else {
            if (obj instanceof TLRPC.TL_availableReaction) {
                return "available_reaction_" + ((TLRPC.TL_availableReaction) obj).reaction;
            } else if (obj instanceof TL_bots.BotInfo) {
                return "bot_info_" + ((TL_bots.BotInfo) obj).user_id;
            } else if (obj instanceof TLRPC.TL_attachMenuBot) {
                return a1.g.l(((TLRPC.TL_attachMenuBot) obj).bot_id, "attach_menu_bot_");
            } else {
                if (obj instanceof kj) {
                    kj kjVar = (kj) obj;
                    long v02 = kj.v0(kjVar.f16690k);
                    if (kjVar.D == 29 && (message = kjVar.f16690k) != null && (messageFwdHeader = message.fwd_from) != null && (peer = messageFwdHeader.from_id) != null) {
                        v02 = o5.o(peer);
                    }
                    return "message" + kjVar.M1() + "_" + v02 + "_" + kjVar.f16710p1 + "_" + kj.J1(kjVar.f16690k);
                } else if (obj instanceof TLRPC.Message) {
                    TLRPC.Message message2 = (TLRPC.Message) obj;
                    TLRPC.Peer peer2 = message2.peer_id;
                    if (peer2 != null) {
                        j10 = peer2.channel_id;
                    }
                    return "message" + message2.f19815id + "_" + j10 + "_" + message2.from_scheduled;
                } else if (obj instanceof TLRPC.WebPage) {
                    return "webpage" + ((TLRPC.WebPage) obj).f19949id;
                } else if (obj instanceof TLRPC.User) {
                    return "user" + ((TLRPC.User) obj).f19943id;
                } else if (obj instanceof TLRPC.Chat) {
                    return "chat" + ((TLRPC.Chat) obj).f19794id;
                } else if (obj instanceof String) {
                    return "str".concat((String) obj);
                } else {
                    if (obj instanceof TLRPC.TL_messages_stickerSet) {
                        return "set" + ((TLRPC.TL_messages_stickerSet) obj).set.f19821id;
                    } else if (obj instanceof TLRPC.StickerSetCovered) {
                        return "set" + ((TLRPC.StickerSetCovered) obj).set.f19821id;
                    } else if (obj instanceof TLRPC.InputStickerSet) {
                        return "set" + ((TLRPC.InputStickerSet) obj).f19814id;
                    } else if (obj instanceof TLRPC.TL_wallPaper) {
                        return "wallpaper" + ((TLRPC.TL_wallPaper) obj).f19948id;
                    } else if (obj instanceof TLRPC.TL_theme) {
                        return "theme" + ((TLRPC.TL_theme) obj).f19933id;
                    } else if (obj == null) {
                        return null;
                    } else {
                        return "" + obj;
                    }
                }
            }
        }
    }

    public static Pair p(Object[] objArr, Object obj) {
        boolean z10;
        Object obj2 = objArr[0];
        if ((obj2 instanceof TLRPC.TL_messages_sendMultiMedia) || (((z10 = obj2 instanceof TLRPC.TL_messages_sendMedia)) && (((TLRPC.TL_messages_sendMedia) obj2).media instanceof TLRPC.TL_inputMediaPaidMedia) && (obj instanceof ArrayList))) {
            return null;
        }
        if (z10 && (((TLRPC.TL_messages_sendMedia) obj2).media instanceof TLRPC.TL_inputMediaPoll) && (obj instanceof ArrayList)) {
            return null;
        }
        boolean z11 = obj2 instanceof TL_ephemeral.TL_sendMessage;
        if (z11 && (((TL_ephemeral.TL_sendMessage) obj2).media instanceof TLRPC.TL_inputMediaPaidMedia) && (obj instanceof ArrayList)) {
            return null;
        }
        if (z11 && (((TL_ephemeral.TL_sendMessage) obj2).media instanceof TLRPC.TL_inputMediaPoll) && (obj instanceof ArrayList)) {
            return null;
        }
        if (obj2 instanceof th.p4) {
            th.p4 p4Var = (th.p4) obj2;
            TLRPC.MessageMedia messageMedia = p4Var.media;
            if (messageMedia.document != null) {
                TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation = new TLRPC.TL_inputDocumentFileLocation();
                tL_inputDocumentFileLocation.f19809id = p4Var.media.document.f19800id;
                return new Pair(tL_inputDocumentFileLocation, "botstory_doc_" + p4Var.media.document.f19800id);
            } else if (messageMedia.photo != null) {
                TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation = new TLRPC.TL_inputPhotoFileLocation();
                tL_inputPhotoFileLocation.f19809id = p4Var.media.photo.f19818id;
                return new Pair(tL_inputPhotoFileLocation, "botstory_photo_" + p4Var.media.photo.f19818id);
            } else {
                TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation2 = new TLRPC.TL_inputDocumentFileLocation();
                return new Pair(tL_inputDocumentFileLocation2, "botstory_" + p4Var.f20032id);
            }
        } else if (obj2 instanceof TL_stories.TL_storyItem) {
            TL_stories.TL_storyItem tL_storyItem = (TL_stories.TL_storyItem) obj2;
            TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation3 = new TLRPC.TL_inputDocumentFileLocation();
            tL_inputDocumentFileLocation3.f19809id = tL_storyItem.media.document.f19800id;
            return new Pair(tL_inputDocumentFileLocation3, "story_" + tL_storyItem.f20032id);
        } else {
            if (obj2 instanceof TLRPC.TL_inputSingleMedia) {
                TLRPC.InputMedia inputMedia = ((TLRPC.TL_inputSingleMedia) obj2).media;
                if (inputMedia instanceof TLRPC.TL_inputMediaDocument) {
                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument = (TLRPC.TL_inputMediaDocument) inputMedia;
                    TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation4 = new TLRPC.TL_inputDocumentFileLocation();
                    tL_inputDocumentFileLocation4.f19809id = tL_inputMediaDocument.f19855id.f19806id;
                    return new Pair(tL_inputDocumentFileLocation4, "file_" + tL_inputMediaDocument.f19855id.f19806id);
                } else if (inputMedia instanceof TLRPC.TL_inputMediaPhoto) {
                    TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto = (TLRPC.TL_inputMediaPhoto) inputMedia;
                    TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation2 = new TLRPC.TL_inputPhotoFileLocation();
                    tL_inputPhotoFileLocation2.f19809id = tL_inputMediaPhoto.f19857id.f19813id;
                    return new Pair(tL_inputPhotoFileLocation2, "photo_" + tL_inputMediaPhoto.f19857id.f19813id);
                }
            } else if (obj2 instanceof TLRPC.TL_inputMediaDocument) {
                TLRPC.TL_inputMediaDocument tL_inputMediaDocument2 = (TLRPC.TL_inputMediaDocument) obj2;
                TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation5 = new TLRPC.TL_inputDocumentFileLocation();
                tL_inputDocumentFileLocation5.f19809id = tL_inputMediaDocument2.f19855id.f19806id;
                return new Pair(tL_inputDocumentFileLocation5, "file_" + tL_inputMediaDocument2.f19855id.f19806id);
            } else if (obj2 instanceof TLRPC.TL_inputMediaPhoto) {
                TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto2 = (TLRPC.TL_inputMediaPhoto) obj2;
                TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation3 = new TLRPC.TL_inputPhotoFileLocation();
                tL_inputPhotoFileLocation3.f19809id = tL_inputMediaPhoto2.f19857id.f19813id;
                return new Pair(tL_inputPhotoFileLocation3, "photo_" + tL_inputMediaPhoto2.f19857id.f19813id);
            } else if (z10) {
                TLRPC.InputMedia inputMedia2 = ((TLRPC.TL_messages_sendMedia) obj2).media;
                if (inputMedia2 instanceof TLRPC.TL_inputMediaDocument) {
                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument3 = (TLRPC.TL_inputMediaDocument) inputMedia2;
                    TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation6 = new TLRPC.TL_inputDocumentFileLocation();
                    tL_inputDocumentFileLocation6.f19809id = tL_inputMediaDocument3.f19855id.f19806id;
                    return new Pair(tL_inputDocumentFileLocation6, "file_" + tL_inputMediaDocument3.f19855id.f19806id);
                } else if (inputMedia2 instanceof TLRPC.TL_inputMediaPhoto) {
                    TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto3 = (TLRPC.TL_inputMediaPhoto) inputMedia2;
                    TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation4 = new TLRPC.TL_inputPhotoFileLocation();
                    tL_inputPhotoFileLocation4.f19809id = tL_inputMediaPhoto3.f19857id.f19813id;
                    return new Pair(tL_inputPhotoFileLocation4, "photo_" + tL_inputMediaPhoto3.f19857id.f19813id);
                } else if (inputMedia2 instanceof TLRPC.TL_inputMediaPaidMedia) {
                    TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia = (TLRPC.TL_inputMediaPaidMedia) inputMedia2;
                    if (!(obj instanceof ArrayList) && tL_inputMediaPaidMedia.extended_media.size() == 1) {
                        TLRPC.InputMedia inputMedia3 = tL_inputMediaPaidMedia.extended_media.get(0);
                        if (inputMedia3 instanceof TLRPC.TL_inputMediaDocument) {
                            TLRPC.TL_inputMediaDocument tL_inputMediaDocument4 = (TLRPC.TL_inputMediaDocument) inputMedia3;
                            TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation7 = new TLRPC.TL_inputDocumentFileLocation();
                            tL_inputDocumentFileLocation7.f19809id = tL_inputMediaDocument4.f19855id.f19806id;
                            return new Pair(tL_inputDocumentFileLocation7, "file_" + tL_inputMediaDocument4.f19855id.f19806id);
                        } else if (inputMedia3 instanceof TLRPC.TL_inputMediaPhoto) {
                            TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto4 = (TLRPC.TL_inputMediaPhoto) inputMedia3;
                            TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation5 = new TLRPC.TL_inputPhotoFileLocation();
                            tL_inputPhotoFileLocation5.f19809id = tL_inputMediaPhoto4.f19857id.f19813id;
                            return new Pair(tL_inputPhotoFileLocation5, "photo_" + tL_inputMediaPhoto4.f19857id.f19813id);
                        }
                    }
                }
            } else if (z11) {
                TLRPC.InputMedia inputMedia4 = ((TL_ephemeral.TL_sendMessage) obj2).media;
                if (inputMedia4 instanceof TLRPC.TL_inputMediaDocument) {
                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument5 = (TLRPC.TL_inputMediaDocument) inputMedia4;
                    TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation8 = new TLRPC.TL_inputDocumentFileLocation();
                    tL_inputDocumentFileLocation8.f19809id = tL_inputMediaDocument5.f19855id.f19806id;
                    return new Pair(tL_inputDocumentFileLocation8, "file_" + tL_inputMediaDocument5.f19855id.f19806id);
                } else if (inputMedia4 instanceof TLRPC.TL_inputMediaPhoto) {
                    TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto5 = (TLRPC.TL_inputMediaPhoto) inputMedia4;
                    TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation6 = new TLRPC.TL_inputPhotoFileLocation();
                    tL_inputPhotoFileLocation6.f19809id = tL_inputMediaPhoto5.f19857id.f19813id;
                    return new Pair(tL_inputPhotoFileLocation6, "photo_" + tL_inputMediaPhoto5.f19857id.f19813id);
                } else if (inputMedia4 instanceof TLRPC.TL_inputMediaPaidMedia) {
                    TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia2 = (TLRPC.TL_inputMediaPaidMedia) inputMedia4;
                    if (!(obj instanceof ArrayList) && tL_inputMediaPaidMedia2.extended_media.size() == 1) {
                        TLRPC.InputMedia inputMedia5 = tL_inputMediaPaidMedia2.extended_media.get(0);
                        if (inputMedia5 instanceof TLRPC.TL_inputMediaDocument) {
                            TLRPC.TL_inputMediaDocument tL_inputMediaDocument6 = (TLRPC.TL_inputMediaDocument) inputMedia5;
                            TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation9 = new TLRPC.TL_inputDocumentFileLocation();
                            tL_inputDocumentFileLocation9.f19809id = tL_inputMediaDocument6.f19855id.f19806id;
                            return new Pair(tL_inputDocumentFileLocation9, "file_" + tL_inputMediaDocument6.f19855id.f19806id);
                        } else if (inputMedia5 instanceof TLRPC.TL_inputMediaPhoto) {
                            TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto6 = (TLRPC.TL_inputMediaPhoto) inputMedia5;
                            TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation7 = new TLRPC.TL_inputPhotoFileLocation();
                            tL_inputPhotoFileLocation7.f19809id = tL_inputMediaPhoto6.f19857id.f19813id;
                            return new Pair(tL_inputPhotoFileLocation7, "photo_" + tL_inputMediaPhoto6.f19857id.f19813id);
                        }
                    }
                }
            } else if (obj2 instanceof TLRPC.TL_messages_editMessage) {
                TLRPC.InputMedia inputMedia6 = ((TLRPC.TL_messages_editMessage) obj2).media;
                if (inputMedia6 instanceof TLRPC.TL_inputMediaDocument) {
                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument7 = (TLRPC.TL_inputMediaDocument) inputMedia6;
                    TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation10 = new TLRPC.TL_inputDocumentFileLocation();
                    tL_inputDocumentFileLocation10.f19809id = tL_inputMediaDocument7.f19855id.f19806id;
                    return new Pair(tL_inputDocumentFileLocation10, "file_" + tL_inputMediaDocument7.f19855id.f19806id);
                } else if (inputMedia6 instanceof TLRPC.TL_inputMediaPhoto) {
                    TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto7 = (TLRPC.TL_inputMediaPhoto) inputMedia6;
                    TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation8 = new TLRPC.TL_inputPhotoFileLocation();
                    tL_inputPhotoFileLocation8.f19809id = tL_inputMediaPhoto7.f19857id.f19813id;
                    return new Pair(tL_inputPhotoFileLocation8, "photo_" + tL_inputMediaPhoto7.f19857id.f19813id);
                }
            } else if (obj2 instanceof TLRPC.InputPhoto) {
                TLRPC.InputPhoto inputPhoto = (TLRPC.InputPhoto) obj2;
                TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation9 = new TLRPC.TL_inputPhotoFileLocation();
                tL_inputPhotoFileLocation9.f19809id = inputPhoto.f19813id;
                return new Pair(tL_inputPhotoFileLocation9, "photo_" + inputPhoto.f19813id);
            } else if (obj2 instanceof TLRPC.InputDocument) {
                TLRPC.InputDocument inputDocument = (TLRPC.InputDocument) obj2;
                TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation11 = new TLRPC.TL_inputDocumentFileLocation();
                tL_inputDocumentFileLocation11.f19809id = inputDocument.f19806id;
                return new Pair(tL_inputDocumentFileLocation11, "file_" + inputDocument.f19806id);
            } else if (obj2 instanceof TLRPC.TL_messages_addPollAnswer) {
                TLRPC.InputMedia inputMedia7 = ((TLRPC.TL_messages_addPollAnswer) obj2).answer.input_media;
                if (inputMedia7 instanceof TLRPC.TL_inputMediaDocument) {
                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument8 = (TLRPC.TL_inputMediaDocument) inputMedia7;
                    TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation12 = new TLRPC.TL_inputDocumentFileLocation();
                    tL_inputDocumentFileLocation12.f19809id = tL_inputMediaDocument8.f19855id.f19806id;
                    return new Pair(tL_inputDocumentFileLocation12, "file_" + tL_inputMediaDocument8.f19855id.f19806id);
                } else if (inputMedia7 instanceof TLRPC.TL_inputMediaPhoto) {
                    TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto8 = (TLRPC.TL_inputMediaPhoto) inputMedia7;
                    TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation10 = new TLRPC.TL_inputPhotoFileLocation();
                    tL_inputPhotoFileLocation10.f19809id = tL_inputMediaPhoto8.f19857id.f19813id;
                    return new Pair(tL_inputPhotoFileLocation10, "photo_" + tL_inputMediaPhoto8.f19857id.f19813id);
                }
            } else if (obj2 instanceof TLRPC.TL_messages_saveGif) {
                TLRPC.TL_messages_saveGif tL_messages_saveGif = (TLRPC.TL_messages_saveGif) obj2;
                TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation13 = new TLRPC.TL_inputDocumentFileLocation();
                tL_inputDocumentFileLocation13.f19809id = tL_messages_saveGif.f19903id.f19806id;
                return new Pair(tL_inputDocumentFileLocation13, "file_" + tL_messages_saveGif.f19903id.f19806id);
            } else if (obj2 instanceof TLRPC.TL_messages_saveRecentSticker) {
                TLRPC.TL_messages_saveRecentSticker tL_messages_saveRecentSticker = (TLRPC.TL_messages_saveRecentSticker) obj2;
                TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation14 = new TLRPC.TL_inputDocumentFileLocation();
                tL_inputDocumentFileLocation14.f19809id = tL_messages_saveRecentSticker.f19904id.f19806id;
                return new Pair(tL_inputDocumentFileLocation14, "file_" + tL_messages_saveRecentSticker.f19904id.f19806id);
            } else if (obj2 instanceof TLRPC.TL_stickers_addStickerToSet) {
                TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = (TLRPC.TL_stickers_addStickerToSet) obj2;
                TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation15 = new TLRPC.TL_inputDocumentFileLocation();
                tL_inputDocumentFileLocation15.f19809id = tL_stickers_addStickerToSet.sticker.document.f19806id;
                return new Pair(tL_inputDocumentFileLocation15, "file_" + tL_stickers_addStickerToSet.sticker.document.f19806id);
            } else if (obj2 instanceof TLRPC.TL_messages_faveSticker) {
                TLRPC.TL_messages_faveSticker tL_messages_faveSticker = (TLRPC.TL_messages_faveSticker) obj2;
                TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation16 = new TLRPC.TL_inputDocumentFileLocation();
                tL_inputDocumentFileLocation16.f19809id = tL_messages_faveSticker.f19880id.f19806id;
                return new Pair(tL_inputDocumentFileLocation16, "file_" + tL_messages_faveSticker.f19880id.f19806id);
            } else if (obj2 instanceof TLRPC.TL_messages_getAttachedStickers) {
                TLRPC.InputStickeredMedia inputStickeredMedia = ((TLRPC.TL_messages_getAttachedStickers) obj2).media;
                if (inputStickeredMedia instanceof TLRPC.TL_inputStickeredMediaDocument) {
                    TLRPC.TL_inputStickeredMediaDocument tL_inputStickeredMediaDocument = (TLRPC.TL_inputStickeredMediaDocument) inputStickeredMedia;
                    TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation17 = new TLRPC.TL_inputDocumentFileLocation();
                    tL_inputDocumentFileLocation17.f19809id = tL_inputStickeredMediaDocument.f19863id.f19806id;
                    return new Pair(tL_inputDocumentFileLocation17, "file_" + tL_inputStickeredMediaDocument.f19863id.f19806id);
                } else if (inputStickeredMedia instanceof TLRPC.TL_inputStickeredMediaPhoto) {
                    TLRPC.TL_inputStickeredMediaPhoto tL_inputStickeredMediaPhoto = (TLRPC.TL_inputStickeredMediaPhoto) inputStickeredMedia;
                    TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation11 = new TLRPC.TL_inputPhotoFileLocation();
                    tL_inputPhotoFileLocation11.f19809id = tL_inputStickeredMediaPhoto.f19864id.f19813id;
                    return new Pair(tL_inputPhotoFileLocation11, "photo_" + tL_inputStickeredMediaPhoto.f19864id.f19813id);
                }
            } else if (obj2 instanceof TLRPC.TL_inputFileLocation) {
                TLRPC.TL_inputFileLocation tL_inputFileLocation = (TLRPC.TL_inputFileLocation) obj2;
                return new Pair(tL_inputFileLocation, "loc_" + tL_inputFileLocation.local_id + "_" + tL_inputFileLocation.volume_id);
            } else if (obj2 instanceof TLRPC.TL_inputDocumentFileLocation) {
                TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation18 = (TLRPC.TL_inputDocumentFileLocation) obj2;
                return new Pair(tL_inputDocumentFileLocation18, "file_" + tL_inputDocumentFileLocation18.f19809id);
            } else if (obj2 instanceof TLRPC.TL_inputPhotoFileLocation) {
                TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation12 = (TLRPC.TL_inputPhotoFileLocation) obj2;
                return new Pair(tL_inputPhotoFileLocation12, "photo_" + tL_inputPhotoFileLocation12.f19809id);
            } else if (obj2 instanceof TLRPC.TL_inputPeerPhotoFileLocation) {
                TLRPC.TL_inputPeerPhotoFileLocation tL_inputPeerPhotoFileLocation = (TLRPC.TL_inputPeerPhotoFileLocation) obj2;
                return new Pair(tL_inputPeerPhotoFileLocation, "avatar_" + tL_inputPeerPhotoFileLocation.f19809id);
            }
            return null;
        }
    }

    public static boolean r(String str) {
        if (!"FILEREF_EXPIRED".equals(str) && !"FILE_REFERENCE_EXPIRED".equals(str) && !"FILE_REFERENCE_EMPTY".equals(str)) {
            if (str == null || !str.startsWith("FILE_REFERENCE_")) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static boolean w(byte[] r6, org.telegram.tgnet.TLRPC.InputFileLocation r7, org.telegram.tgnet.TLRPC.InputFileLocation r8, java.lang.Object... r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.w8.w(byte[], org.telegram.tgnet.TLRPC$InputFileLocation, org.telegram.tgnet.TLRPC$InputFileLocation, java.lang.Object[]):boolean");
    }

    public final void a(ArrayList arrayList, TLObject tLObject, TLRPC.TL_error tL_error) {
        boolean z10;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            v8 v8Var = (v8) arrayList.get(i10);
            String str = v8Var.f18596a;
            String str2 = v8Var.f18597b;
            if (i10 == size - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            s(str, str2, tLObject, tL_error, z10, false);
        }
        arrayList.clear();
    }

    public final t8 b(String str) {
        HashMap hashMap = this.f19005c;
        t8 t8Var = (t8) hashMap.get(str);
        if (t8Var != null && Math.abs(System.currentTimeMillis() - t8Var.f18233b) >= 60000) {
            hashMap.remove(str);
            return null;
        }
        return t8Var;
    }

    public final byte[] d(TLRPC.Chat chat, TLRPC.InputFileLocation inputFileLocation, boolean[] zArr, TLRPC.InputFileLocation[] inputFileLocationArr) {
        TLRPC.ChatPhoto chatPhoto;
        if (chat != null && (chatPhoto = chat.photo) != null) {
            if ((inputFileLocation instanceof TLRPC.TL_inputFileLocation) || (inputFileLocation instanceof TLRPC.TL_inputPeerPhotoFileLocation)) {
                if (inputFileLocation instanceof TLRPC.TL_inputPeerPhotoFileLocation) {
                    zArr[0] = true;
                    if (q(null, chat, false, inputFileLocation, inputFileLocationArr, zArr)) {
                        return new byte[0];
                    }
                    return null;
                }
                byte[] f7 = f(chatPhoto.photo_small, inputFileLocation, zArr);
                if (q(null, chat, false, inputFileLocation, inputFileLocationArr, zArr)) {
                    return new byte[0];
                }
                if (f7 == null) {
                    byte[] f10 = f(chat.photo.photo_big, inputFileLocation, zArr);
                    if (q(null, chat, true, inputFileLocation, inputFileLocationArr, zArr)) {
                        return new byte[0];
                    }
                    return f10;
                }
                return f7;
            }
            return null;
        }
        return null;
    }

    public final byte[] h(TLRPC.User user, TLRPC.InputFileLocation inputFileLocation, boolean[] zArr, TLRPC.InputFileLocation[] inputFileLocationArr) {
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        if (userProfilePhoto != null && (inputFileLocation instanceof TLRPC.TL_inputFileLocation)) {
            byte[] f7 = f(userProfilePhoto.photo_small, inputFileLocation, zArr);
            if (q(user, null, false, inputFileLocation, inputFileLocationArr, zArr)) {
                return new byte[0];
            }
            if (f7 == null) {
                byte[] f10 = f(user.photo.photo_big, inputFileLocation, zArr);
                if (q(user, null, true, inputFileLocation, inputFileLocationArr, zArr)) {
                    return new byte[0];
                }
                return f10;
            }
            return f7;
        }
        return null;
    }

    public final android.util.Pair m(org.telegram.tgnet.TLRPC.InputFileLocation r18, java.lang.String r19, org.telegram.tgnet.TLObject r20, java.lang.Object... r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.w8.m(org.telegram.tgnet.TLRPC$InputFileLocation, java.lang.String, org.telegram.tgnet.TLObject, java.lang.Object[]):android.util.Pair");
    }

    public final boolean q(TLRPC.User user, TLRPC.Chat chat, boolean z10, TLRPC.InputFileLocation inputFileLocation, TLRPC.InputFileLocation[] inputFileLocationArr, boolean[] zArr) {
        TLRPC.InputPeer tL_inputPeerChat;
        TLRPC.InputPeer inputPeer;
        if (zArr == null || !zArr[0]) {
            return false;
        }
        TLRPC.TL_inputPeerPhotoFileLocation tL_inputPeerPhotoFileLocation = new TLRPC.TL_inputPeerPhotoFileLocation();
        long j10 = inputFileLocation.volume_id;
        tL_inputPeerPhotoFileLocation.f19809id = j10;
        tL_inputPeerPhotoFileLocation.volume_id = j10;
        tL_inputPeerPhotoFileLocation.local_id = inputFileLocation.local_id;
        tL_inputPeerPhotoFileLocation.big = z10;
        if (user != null) {
            if (user.access_hash == 0 && user.fromMessageId != 0 && user.fromMessageDialogId != 0) {
                inputPeer = new TLRPC.TL_inputPeerUserFromMessage();
                inputPeer.user_id = user.f19943id;
                inputPeer.peer = getMessagesController().i1(user.fromMessageDialogId);
                inputPeer.msg_id = user.fromMessageId;
                tL_inputPeerPhotoFileLocation.photo_id = user.photo.photo_id;
            } else {
                inputPeer = new TLRPC.TL_inputPeerUser();
                inputPeer.user_id = user.f19943id;
                inputPeer.access_hash = user.access_hash;
                tL_inputPeerPhotoFileLocation.photo_id = user.photo.photo_id;
            }
        } else {
            if (w3.T(chat)) {
                if (chat.access_hash == 0 && chat.fromMessageDialogId != 0 && chat.fromMessageId != 0) {
                    tL_inputPeerChat = new TLRPC.TL_inputPeerChannelFromMessage();
                    tL_inputPeerChat.channel_id = chat.f19794id;
                    tL_inputPeerChat.peer = getMessagesController().i1(chat.fromMessageDialogId);
                    tL_inputPeerChat.msg_id = chat.fromMessageId;
                } else {
                    tL_inputPeerChat = new TLRPC.TL_inputPeerChannel();
                    tL_inputPeerChat.channel_id = chat.f19794id;
                    tL_inputPeerChat.access_hash = chat.access_hash;
                }
            } else {
                tL_inputPeerChat = new TLRPC.TL_inputPeerChat();
                tL_inputPeerChat.chat_id = chat.f19794id;
            }
            tL_inputPeerPhotoFileLocation.photo_id = chat.photo.photo_id;
            inputPeer = tL_inputPeerChat;
        }
        tL_inputPeerPhotoFileLocation.peer = inputPeer;
        inputFileLocationArr[0] = tL_inputPeerPhotoFileLocation;
        return true;
    }

    public final boolean s(java.lang.String r32, java.lang.String r33, org.telegram.tgnet.TLObject r34, org.telegram.tgnet.TLRPC.TL_error r35, boolean r36, boolean r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.w8.s(java.lang.String, java.lang.String, org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error, boolean, boolean):boolean");
    }

    public final boolean t(final org.telegram.messenger.u8 r12, byte[] r13, org.telegram.tgnet.TLRPC.InputFileLocation r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.w8.t(org.telegram.messenger.u8, byte[], org.telegram.tgnet.TLRPC$InputFileLocation, boolean):boolean");
    }

    public final void u(java.lang.Object[] r23, java.lang.Object r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.w8.u(java.lang.Object[], java.lang.Object):void");
    }

    public final void v(final java.lang.Object[] r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.w8.v(java.lang.Object[]):void");
    }
}
