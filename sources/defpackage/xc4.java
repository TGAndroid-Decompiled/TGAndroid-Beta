package defpackage;

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
public final class xc4 extends rf0 {
    public static volatile xc4[] s = new xc4[4];
    public final HashMap a;
    public final HashMap b;
    public final HashMap c;
    public final HashMap d;
    public long e;
    public final ArrayList f;
    public final ArrayList h;
    public final ArrayList n;
    public final ArrayList r;

    public xc4(int i) {
        super(i);
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = SystemClock.elapsedRealtime();
        this.f = new ArrayList();
        this.h = new ArrayList();
        this.n = new ArrayList();
        this.r = new ArrayList();
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
                if (document.id == inputFileLocation.id) {
                    return document.file_reference;
                }
            } else {
                int size = document.thumbs.size();
                for (int i = 0; i < size; i++) {
                    TLRPC.PhotoSize photoSize = document.thumbs.get(i);
                    if (photoSize != null && (inputFileLocation instanceof TLRPC.TL_inputFileLocation)) {
                        bArr = f(photoSize.location, inputFileLocation, zArr);
                    } else {
                        bArr = null;
                    }
                    if (zArr != null && zArr[0]) {
                        TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation = new TLRPC.TL_inputDocumentFileLocation();
                        inputFileLocationArr[0] = tL_inputDocumentFileLocation;
                        tL_inputDocumentFileLocation.id = document.id;
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
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    byte[] e = e((TLRPC.Document) arrayList.get(i2), null, inputFileLocation, zArr, inputFileLocationArr);
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
                if (photo.id == inputFileLocation.id) {
                    return photo.file_reference;
                }
            } else if (inputFileLocation instanceof TLRPC.TL_inputFileLocation) {
                int size = photo.sizes.size();
                for (int i = 0; i < size; i++) {
                    TLRPC.PhotoSize photoSize = photo.sizes.get(i);
                    if (photoSize != null) {
                        bArr = f(photoSize.location, inputFileLocation, zArr);
                    } else {
                        bArr = null;
                    }
                    if (zArr != null && zArr[0]) {
                        TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation = new TLRPC.TL_inputPhotoFileLocation();
                        inputFileLocationArr[0] = tL_inputPhotoFileLocation;
                        tL_inputPhotoFileLocation.id = photo.id;
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
        byte[] g = g(webPage.photo, inputFileLocation, zArr, inputFileLocationArr);
        if (g != null) {
            return g;
        }
        if (!webPage.attributes.isEmpty()) {
            int size = webPage.attributes.size();
            for (int i = 0; i < size; i++) {
                TLRPC.WebPageAttribute webPageAttribute = webPage.attributes.get(i);
                if (webPageAttribute instanceof TLRPC.TL_webPageAttributeTheme) {
                    TLRPC.TL_webPageAttributeTheme tL_webPageAttributeTheme = (TLRPC.TL_webPageAttributeTheme) webPageAttribute;
                    int size2 = tL_webPageAttributeTheme.documents.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        byte[] e2 = e(tL_webPageAttributeTheme.documents.get(i2), null, inputFileLocation, zArr, inputFileLocationArr);
                        if (e2 != null) {
                            return e2;
                        }
                    }
                    continue;
                }
            }
        }
        TL_iv.Page page = webPage.cached_page;
        if (page != null) {
            int size3 = page.documents.size();
            int i3 = 0;
            while (true) {
                TL_iv.Page page2 = webPage.cached_page;
                if (i3 < size3) {
                    byte[] e3 = e(page2.documents.get(i3), null, inputFileLocation, zArr, inputFileLocationArr);
                    if (e3 != null) {
                        return e3;
                    }
                    i3++;
                } else {
                    int size4 = page2.photos.size();
                    for (int i4 = 0; i4 < size4; i4++) {
                        byte[] g2 = g(webPage.cached_page.photos.get(i4), inputFileLocation, zArr, inputFileLocationArr);
                        if (g2 != null) {
                            return g2;
                        }
                    }
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
        byte[] j = j(tL_messageMediaPoll.attached_media, inputFileLocation, zArr, inputFileLocationArr);
        if (j == null && (pollResults = tL_messageMediaPoll.results) != null && (messageMedia = pollResults.solution_media) != null) {
            j = j(messageMedia, inputFileLocation, zArr, inputFileLocationArr);
        }
        if (j == null && (arrayList = tL_messageMediaPoll.poll.answers) != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                TLRPC.PollAnswer pollAnswer = arrayList.get(i);
                i++;
                j = j(pollAnswer.media, inputFileLocation, zArr, inputFileLocationArr);
                if (j != null) {
                    break;
                }
            }
        }
        return j;
    }

    public static byte[] l(TL_iv.RichMessage richMessage, TLRPC.InputFileLocation inputFileLocation, boolean[] zArr, TLRPC.InputFileLocation[] inputFileLocationArr) {
        if (richMessage == null) {
            return null;
        }
        ArrayList<TLRPC.Photo> arrayList = richMessage.photos;
        int size = arrayList.size();
        int i = 0;
        byte[] bArr = null;
        int i2 = 0;
        while (i2 < size) {
            TLRPC.Photo photo = arrayList.get(i2);
            i2++;
            bArr = g(photo, inputFileLocation, zArr, inputFileLocationArr);
            if (bArr != null) {
                return bArr;
            }
        }
        ArrayList<TLRPC.Document> arrayList2 = richMessage.documents;
        int size2 = arrayList2.size();
        while (i < size2) {
            TLRPC.Document document = arrayList2.get(i);
            i++;
            bArr = e(document, null, inputFileLocation, zArr, inputFileLocationArr);
            if (bArr != null) {
                break;
            }
        }
        return bArr;
    }

    public static xc4 n(int i) {
        xc4 xc4Var;
        xc4 xc4Var2 = s[i];
        if (xc4Var2 == null) {
            synchronized (xc4.class) {
                xc4Var = s[i];
                if (xc4Var == null) {
                    xc4[] xc4VarArr = s;
                    xc4 xc4Var3 = new xc4(i);
                    xc4VarArr[i] = xc4Var3;
                    xc4Var = xc4Var3;
                }
            }
            return xc4Var;
        }
        return xc4Var2;
    }

    public static String o(Object obj) {
        TLRPC.Message message;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        if (obj instanceof n5b) {
            n5b n5bVar = (n5b) obj;
            if (n5bVar.a == null) {
                cc4.b("failed request reference can't find list in botpreview");
                return null;
            }
            TLRPC.MessageMedia messageMedia = n5bVar.media;
            if (messageMedia.document != null) {
                return "botstory_doc_" + n5bVar.media.document.id;
            } else if (messageMedia.photo != null) {
                return "botstory_photo_" + n5bVar.media.photo.id;
            } else {
                return "botstory_" + n5bVar.id;
            }
        }
        long j = 0;
        if (obj instanceof TL_stories.StoryItem) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
            if (storyItem.dialogId == 0) {
                cc4.b("failed request reference can't find dialogId");
                return null;
            }
            return "story_" + storyItem.dialogId + "_" + storyItem.id;
        } else if (obj instanceof TLRPC.TL_help_premiumPromo) {
            return "premium_promo";
        } else {
            if (obj instanceof TLRPC.TL_availableReaction) {
                return "available_reaction_" + ((TLRPC.TL_availableReaction) obj).reaction;
            } else if (obj instanceof TL_bots.BotInfo) {
                return "bot_info_" + ((TL_bots.BotInfo) obj).user_id;
            } else if (obj instanceof TLRPC.TL_attachMenuBot) {
                return qu6.n(((TLRPC.TL_attachMenuBot) obj).bot_id, "attach_menu_bot_");
            } else {
                if (obj instanceof r47) {
                    r47 r47Var = (r47) obj;
                    long v0 = r47.v0(r47Var.k);
                    if (r47Var.D == 29 && (message = r47Var.k) != null && (messageFwdHeader = message.fwd_from) != null && (peer = messageFwdHeader.from_id) != null) {
                        v0 = wf3.n(peer);
                    }
                    return "message" + r47Var.L1() + "_" + v0 + "_" + r47Var.r1 + "_" + r47.I1(r47Var.k);
                } else if (obj instanceof TLRPC.Message) {
                    TLRPC.Message message2 = (TLRPC.Message) obj;
                    TLRPC.Peer peer2 = message2.peer_id;
                    if (peer2 != null) {
                        j = peer2.channel_id;
                    }
                    return "message" + message2.id + "_" + j + "_" + message2.from_scheduled;
                } else if (obj instanceof TLRPC.WebPage) {
                    return "webpage" + ((TLRPC.WebPage) obj).id;
                } else if (obj instanceof TLRPC.User) {
                    return "user" + ((TLRPC.User) obj).id;
                } else if (obj instanceof TLRPC.Chat) {
                    return "chat" + ((TLRPC.Chat) obj).id;
                } else if (obj instanceof String) {
                    return "str".concat((String) obj);
                } else {
                    if (obj instanceof TLRPC.TL_messages_stickerSet) {
                        return "set" + ((TLRPC.TL_messages_stickerSet) obj).set.id;
                    } else if (obj instanceof TLRPC.StickerSetCovered) {
                        return "set" + ((TLRPC.StickerSetCovered) obj).set.id;
                    } else if (obj instanceof TLRPC.InputStickerSet) {
                        return "set" + ((TLRPC.InputStickerSet) obj).id;
                    } else if (obj instanceof TLRPC.TL_wallPaper) {
                        return "wallpaper" + ((TLRPC.TL_wallPaper) obj).id;
                    } else if (obj instanceof TLRPC.TL_theme) {
                        return "theme" + ((TLRPC.TL_theme) obj).id;
                    } else if (obj == null) {
                        return null;
                    } else {
                        return String.valueOf(obj);
                    }
                }
            }
        }
    }

    public static Pair p(Object[] objArr, Object obj) {
        boolean z;
        Object obj2 = objArr[0];
        if ((obj2 instanceof TLRPC.TL_messages_sendMultiMedia) || (((z = obj2 instanceof TLRPC.TL_messages_sendMedia)) && (((TLRPC.TL_messages_sendMedia) obj2).media instanceof TLRPC.TL_inputMediaPaidMedia) && (obj instanceof ArrayList))) {
            return null;
        }
        if (z && (((TLRPC.TL_messages_sendMedia) obj2).media instanceof TLRPC.TL_inputMediaPoll) && (obj instanceof ArrayList)) {
            return null;
        }
        boolean z2 = obj2 instanceof TL_ephemeral.TL_sendMessage;
        if (z2 && (((TL_ephemeral.TL_sendMessage) obj2).media instanceof TLRPC.TL_inputMediaPaidMedia) && (obj instanceof ArrayList)) {
            return null;
        }
        if (z2 && (((TL_ephemeral.TL_sendMessage) obj2).media instanceof TLRPC.TL_inputMediaPoll) && (obj instanceof ArrayList)) {
            return null;
        }
        if (obj2 instanceof n5b) {
            n5b n5bVar = (n5b) obj2;
            TLRPC.MessageMedia messageMedia = n5bVar.media;
            if (messageMedia.document != null) {
                TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation = new TLRPC.TL_inputDocumentFileLocation();
                tL_inputDocumentFileLocation.id = n5bVar.media.document.id;
                return new Pair(tL_inputDocumentFileLocation, "botstory_doc_" + n5bVar.media.document.id);
            } else if (messageMedia.photo != null) {
                TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation = new TLRPC.TL_inputPhotoFileLocation();
                tL_inputPhotoFileLocation.id = n5bVar.media.photo.id;
                return new Pair(tL_inputPhotoFileLocation, "botstory_photo_" + n5bVar.media.photo.id);
            } else {
                TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation2 = new TLRPC.TL_inputDocumentFileLocation();
                return new Pair(tL_inputDocumentFileLocation2, "botstory_" + n5bVar.id);
            }
        } else if (obj2 instanceof TL_stories.TL_storyItem) {
            TL_stories.TL_storyItem tL_storyItem = (TL_stories.TL_storyItem) obj2;
            TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation3 = new TLRPC.TL_inputDocumentFileLocation();
            tL_inputDocumentFileLocation3.id = tL_storyItem.media.document.id;
            return new Pair(tL_inputDocumentFileLocation3, "story_" + tL_storyItem.id);
        } else {
            if (obj2 instanceof TLRPC.TL_inputSingleMedia) {
                TLRPC.InputMedia inputMedia = ((TLRPC.TL_inputSingleMedia) obj2).media;
                if (inputMedia instanceof TLRPC.TL_inputMediaDocument) {
                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument = (TLRPC.TL_inputMediaDocument) inputMedia;
                    TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation4 = new TLRPC.TL_inputDocumentFileLocation();
                    tL_inputDocumentFileLocation4.id = tL_inputMediaDocument.id.id;
                    return new Pair(tL_inputDocumentFileLocation4, "file_" + tL_inputMediaDocument.id.id);
                } else if (inputMedia instanceof TLRPC.TL_inputMediaPhoto) {
                    TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto = (TLRPC.TL_inputMediaPhoto) inputMedia;
                    TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation2 = new TLRPC.TL_inputPhotoFileLocation();
                    tL_inputPhotoFileLocation2.id = tL_inputMediaPhoto.id.id;
                    return new Pair(tL_inputPhotoFileLocation2, "photo_" + tL_inputMediaPhoto.id.id);
                }
            } else if (obj2 instanceof TLRPC.TL_inputMediaDocument) {
                TLRPC.TL_inputMediaDocument tL_inputMediaDocument2 = (TLRPC.TL_inputMediaDocument) obj2;
                TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation5 = new TLRPC.TL_inputDocumentFileLocation();
                tL_inputDocumentFileLocation5.id = tL_inputMediaDocument2.id.id;
                return new Pair(tL_inputDocumentFileLocation5, "file_" + tL_inputMediaDocument2.id.id);
            } else if (obj2 instanceof TLRPC.TL_inputMediaPhoto) {
                TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto2 = (TLRPC.TL_inputMediaPhoto) obj2;
                TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation3 = new TLRPC.TL_inputPhotoFileLocation();
                tL_inputPhotoFileLocation3.id = tL_inputMediaPhoto2.id.id;
                return new Pair(tL_inputPhotoFileLocation3, "photo_" + tL_inputMediaPhoto2.id.id);
            } else if (z) {
                TLRPC.InputMedia inputMedia2 = ((TLRPC.TL_messages_sendMedia) obj2).media;
                if (inputMedia2 instanceof TLRPC.TL_inputMediaDocument) {
                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument3 = (TLRPC.TL_inputMediaDocument) inputMedia2;
                    TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation6 = new TLRPC.TL_inputDocumentFileLocation();
                    tL_inputDocumentFileLocation6.id = tL_inputMediaDocument3.id.id;
                    return new Pair(tL_inputDocumentFileLocation6, "file_" + tL_inputMediaDocument3.id.id);
                } else if (inputMedia2 instanceof TLRPC.TL_inputMediaPhoto) {
                    TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto3 = (TLRPC.TL_inputMediaPhoto) inputMedia2;
                    TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation4 = new TLRPC.TL_inputPhotoFileLocation();
                    tL_inputPhotoFileLocation4.id = tL_inputMediaPhoto3.id.id;
                    return new Pair(tL_inputPhotoFileLocation4, "photo_" + tL_inputMediaPhoto3.id.id);
                } else if (inputMedia2 instanceof TLRPC.TL_inputMediaPaidMedia) {
                    TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia = (TLRPC.TL_inputMediaPaidMedia) inputMedia2;
                    if (!(obj instanceof ArrayList) && tL_inputMediaPaidMedia.extended_media.size() == 1) {
                        TLRPC.InputMedia inputMedia3 = tL_inputMediaPaidMedia.extended_media.get(0);
                        if (inputMedia3 instanceof TLRPC.TL_inputMediaDocument) {
                            TLRPC.TL_inputMediaDocument tL_inputMediaDocument4 = (TLRPC.TL_inputMediaDocument) inputMedia3;
                            TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation7 = new TLRPC.TL_inputDocumentFileLocation();
                            tL_inputDocumentFileLocation7.id = tL_inputMediaDocument4.id.id;
                            return new Pair(tL_inputDocumentFileLocation7, "file_" + tL_inputMediaDocument4.id.id);
                        } else if (inputMedia3 instanceof TLRPC.TL_inputMediaPhoto) {
                            TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto4 = (TLRPC.TL_inputMediaPhoto) inputMedia3;
                            TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation5 = new TLRPC.TL_inputPhotoFileLocation();
                            tL_inputPhotoFileLocation5.id = tL_inputMediaPhoto4.id.id;
                            return new Pair(tL_inputPhotoFileLocation5, "photo_" + tL_inputMediaPhoto4.id.id);
                        }
                    }
                }
            } else if (z2) {
                TLRPC.InputMedia inputMedia4 = ((TL_ephemeral.TL_sendMessage) obj2).media;
                if (inputMedia4 instanceof TLRPC.TL_inputMediaDocument) {
                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument5 = (TLRPC.TL_inputMediaDocument) inputMedia4;
                    TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation8 = new TLRPC.TL_inputDocumentFileLocation();
                    tL_inputDocumentFileLocation8.id = tL_inputMediaDocument5.id.id;
                    return new Pair(tL_inputDocumentFileLocation8, "file_" + tL_inputMediaDocument5.id.id);
                } else if (inputMedia4 instanceof TLRPC.TL_inputMediaPhoto) {
                    TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto5 = (TLRPC.TL_inputMediaPhoto) inputMedia4;
                    TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation6 = new TLRPC.TL_inputPhotoFileLocation();
                    tL_inputPhotoFileLocation6.id = tL_inputMediaPhoto5.id.id;
                    return new Pair(tL_inputPhotoFileLocation6, "photo_" + tL_inputMediaPhoto5.id.id);
                } else if (inputMedia4 instanceof TLRPC.TL_inputMediaPaidMedia) {
                    TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia2 = (TLRPC.TL_inputMediaPaidMedia) inputMedia4;
                    if (!(obj instanceof ArrayList) && tL_inputMediaPaidMedia2.extended_media.size() == 1) {
                        TLRPC.InputMedia inputMedia5 = tL_inputMediaPaidMedia2.extended_media.get(0);
                        if (inputMedia5 instanceof TLRPC.TL_inputMediaDocument) {
                            TLRPC.TL_inputMediaDocument tL_inputMediaDocument6 = (TLRPC.TL_inputMediaDocument) inputMedia5;
                            TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation9 = new TLRPC.TL_inputDocumentFileLocation();
                            tL_inputDocumentFileLocation9.id = tL_inputMediaDocument6.id.id;
                            return new Pair(tL_inputDocumentFileLocation9, "file_" + tL_inputMediaDocument6.id.id);
                        } else if (inputMedia5 instanceof TLRPC.TL_inputMediaPhoto) {
                            TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto6 = (TLRPC.TL_inputMediaPhoto) inputMedia5;
                            TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation7 = new TLRPC.TL_inputPhotoFileLocation();
                            tL_inputPhotoFileLocation7.id = tL_inputMediaPhoto6.id.id;
                            return new Pair(tL_inputPhotoFileLocation7, "photo_" + tL_inputMediaPhoto6.id.id);
                        }
                    }
                }
            } else if (obj2 instanceof TLRPC.TL_messages_editMessage) {
                TLRPC.InputMedia inputMedia6 = ((TLRPC.TL_messages_editMessage) obj2).media;
                if (inputMedia6 instanceof TLRPC.TL_inputMediaDocument) {
                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument7 = (TLRPC.TL_inputMediaDocument) inputMedia6;
                    TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation10 = new TLRPC.TL_inputDocumentFileLocation();
                    tL_inputDocumentFileLocation10.id = tL_inputMediaDocument7.id.id;
                    return new Pair(tL_inputDocumentFileLocation10, "file_" + tL_inputMediaDocument7.id.id);
                } else if (inputMedia6 instanceof TLRPC.TL_inputMediaPhoto) {
                    TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto7 = (TLRPC.TL_inputMediaPhoto) inputMedia6;
                    TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation8 = new TLRPC.TL_inputPhotoFileLocation();
                    tL_inputPhotoFileLocation8.id = tL_inputMediaPhoto7.id.id;
                    return new Pair(tL_inputPhotoFileLocation8, "photo_" + tL_inputMediaPhoto7.id.id);
                }
            } else if (obj2 instanceof TLRPC.InputPhoto) {
                TLRPC.InputPhoto inputPhoto = (TLRPC.InputPhoto) obj2;
                TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation9 = new TLRPC.TL_inputPhotoFileLocation();
                tL_inputPhotoFileLocation9.id = inputPhoto.id;
                return new Pair(tL_inputPhotoFileLocation9, "photo_" + inputPhoto.id);
            } else if (obj2 instanceof TLRPC.InputDocument) {
                TLRPC.InputDocument inputDocument = (TLRPC.InputDocument) obj2;
                TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation11 = new TLRPC.TL_inputDocumentFileLocation();
                tL_inputDocumentFileLocation11.id = inputDocument.id;
                return new Pair(tL_inputDocumentFileLocation11, "file_" + inputDocument.id);
            } else if (obj2 instanceof TLRPC.TL_messages_addPollAnswer) {
                TLRPC.InputMedia inputMedia7 = ((TLRPC.TL_messages_addPollAnswer) obj2).answer.input_media;
                if (inputMedia7 instanceof TLRPC.TL_inputMediaDocument) {
                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument8 = (TLRPC.TL_inputMediaDocument) inputMedia7;
                    TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation12 = new TLRPC.TL_inputDocumentFileLocation();
                    tL_inputDocumentFileLocation12.id = tL_inputMediaDocument8.id.id;
                    return new Pair(tL_inputDocumentFileLocation12, "file_" + tL_inputMediaDocument8.id.id);
                } else if (inputMedia7 instanceof TLRPC.TL_inputMediaPhoto) {
                    TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto8 = (TLRPC.TL_inputMediaPhoto) inputMedia7;
                    TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation10 = new TLRPC.TL_inputPhotoFileLocation();
                    tL_inputPhotoFileLocation10.id = tL_inputMediaPhoto8.id.id;
                    return new Pair(tL_inputPhotoFileLocation10, "photo_" + tL_inputMediaPhoto8.id.id);
                }
            } else if (obj2 instanceof TLRPC.TL_messages_saveGif) {
                TLRPC.TL_messages_saveGif tL_messages_saveGif = (TLRPC.TL_messages_saveGif) obj2;
                TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation13 = new TLRPC.TL_inputDocumentFileLocation();
                tL_inputDocumentFileLocation13.id = tL_messages_saveGif.id.id;
                return new Pair(tL_inputDocumentFileLocation13, "file_" + tL_messages_saveGif.id.id);
            } else if (obj2 instanceof TLRPC.TL_messages_saveRecentSticker) {
                TLRPC.TL_messages_saveRecentSticker tL_messages_saveRecentSticker = (TLRPC.TL_messages_saveRecentSticker) obj2;
                TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation14 = new TLRPC.TL_inputDocumentFileLocation();
                tL_inputDocumentFileLocation14.id = tL_messages_saveRecentSticker.id.id;
                return new Pair(tL_inputDocumentFileLocation14, "file_" + tL_messages_saveRecentSticker.id.id);
            } else if (obj2 instanceof TLRPC.TL_stickers_addStickerToSet) {
                TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = (TLRPC.TL_stickers_addStickerToSet) obj2;
                TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation15 = new TLRPC.TL_inputDocumentFileLocation();
                tL_inputDocumentFileLocation15.id = tL_stickers_addStickerToSet.sticker.document.id;
                return new Pair(tL_inputDocumentFileLocation15, "file_" + tL_stickers_addStickerToSet.sticker.document.id);
            } else if (obj2 instanceof TLRPC.TL_messages_faveSticker) {
                TLRPC.TL_messages_faveSticker tL_messages_faveSticker = (TLRPC.TL_messages_faveSticker) obj2;
                TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation16 = new TLRPC.TL_inputDocumentFileLocation();
                tL_inputDocumentFileLocation16.id = tL_messages_faveSticker.id.id;
                return new Pair(tL_inputDocumentFileLocation16, "file_" + tL_messages_faveSticker.id.id);
            } else if (obj2 instanceof TLRPC.TL_messages_getAttachedStickers) {
                TLRPC.InputStickeredMedia inputStickeredMedia = ((TLRPC.TL_messages_getAttachedStickers) obj2).media;
                if (inputStickeredMedia instanceof TLRPC.TL_inputStickeredMediaDocument) {
                    TLRPC.TL_inputStickeredMediaDocument tL_inputStickeredMediaDocument = (TLRPC.TL_inputStickeredMediaDocument) inputStickeredMedia;
                    TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation17 = new TLRPC.TL_inputDocumentFileLocation();
                    tL_inputDocumentFileLocation17.id = tL_inputStickeredMediaDocument.id.id;
                    return new Pair(tL_inputDocumentFileLocation17, "file_" + tL_inputStickeredMediaDocument.id.id);
                } else if (inputStickeredMedia instanceof TLRPC.TL_inputStickeredMediaPhoto) {
                    TLRPC.TL_inputStickeredMediaPhoto tL_inputStickeredMediaPhoto = (TLRPC.TL_inputStickeredMediaPhoto) inputStickeredMedia;
                    TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation11 = new TLRPC.TL_inputPhotoFileLocation();
                    tL_inputPhotoFileLocation11.id = tL_inputStickeredMediaPhoto.id.id;
                    return new Pair(tL_inputPhotoFileLocation11, "photo_" + tL_inputStickeredMediaPhoto.id.id);
                }
            } else if (obj2 instanceof TLRPC.TL_inputFileLocation) {
                TLRPC.TL_inputFileLocation tL_inputFileLocation = (TLRPC.TL_inputFileLocation) obj2;
                return new Pair(tL_inputFileLocation, "loc_" + tL_inputFileLocation.local_id + "_" + tL_inputFileLocation.volume_id);
            } else if (obj2 instanceof TLRPC.TL_inputDocumentFileLocation) {
                TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation18 = (TLRPC.TL_inputDocumentFileLocation) obj2;
                return new Pair(tL_inputDocumentFileLocation18, "file_" + tL_inputDocumentFileLocation18.id);
            } else if (obj2 instanceof TLRPC.TL_inputPhotoFileLocation) {
                TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation12 = (TLRPC.TL_inputPhotoFileLocation) obj2;
                return new Pair(tL_inputPhotoFileLocation12, "photo_" + tL_inputPhotoFileLocation12.id);
            } else if (obj2 instanceof TLRPC.TL_inputPeerPhotoFileLocation) {
                TLRPC.TL_inputPeerPhotoFileLocation tL_inputPeerPhotoFileLocation = (TLRPC.TL_inputPeerPhotoFileLocation) obj2;
                return new Pair(tL_inputPeerPhotoFileLocation, "avatar_" + tL_inputPeerPhotoFileLocation.id);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xc4.w(byte[], org.telegram.tgnet.TLRPC$InputFileLocation, org.telegram.tgnet.TLRPC$InputFileLocation, java.lang.Object[]):boolean");
    }

    public final void a(ArrayList arrayList, TLObject tLObject, TLRPC.TL_error tL_error) {
        boolean z;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            wc4 wc4Var = (wc4) arrayList.get(i);
            String str = wc4Var.a;
            String str2 = wc4Var.b;
            if (i == size - 1) {
                z = true;
            } else {
                z = false;
            }
            s(str, str2, tLObject, tL_error, z, false);
        }
        arrayList.clear();
    }

    public final uc4 b(String str) {
        HashMap hashMap = this.c;
        uc4 uc4Var = (uc4) hashMap.get(str);
        if (uc4Var != null && Math.abs(System.currentTimeMillis() - uc4Var.b) >= 60000) {
            hashMap.remove(str);
            return null;
        }
        return uc4Var;
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
                byte[] f = f(chatPhoto.photo_small, inputFileLocation, zArr);
                if (q(null, chat, false, inputFileLocation, inputFileLocationArr, zArr)) {
                    return new byte[0];
                }
                if (f == null) {
                    byte[] f2 = f(chat.photo.photo_big, inputFileLocation, zArr);
                    if (q(null, chat, true, inputFileLocation, inputFileLocationArr, zArr)) {
                        return new byte[0];
                    }
                    return f2;
                }
                return f;
            }
            return null;
        }
        return null;
    }

    public final byte[] h(TLRPC.User user, TLRPC.InputFileLocation inputFileLocation, boolean[] zArr, TLRPC.InputFileLocation[] inputFileLocationArr) {
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        if (userProfilePhoto != null && (inputFileLocation instanceof TLRPC.TL_inputFileLocation)) {
            byte[] f = f(userProfilePhoto.photo_small, inputFileLocation, zArr);
            if (q(user, null, false, inputFileLocation, inputFileLocationArr, zArr)) {
                return new byte[0];
            }
            if (f == null) {
                byte[] f2 = f(user.photo.photo_big, inputFileLocation, zArr);
                if (q(user, null, true, inputFileLocation, inputFileLocationArr, zArr)) {
                    return new byte[0];
                }
                return f2;
            }
            return f;
        }
        return null;
    }

    public final android.util.Pair m(org.telegram.tgnet.TLRPC.InputFileLocation r18, java.lang.String r19, org.telegram.tgnet.TLObject r20, java.lang.Object... r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xc4.m(org.telegram.tgnet.TLRPC$InputFileLocation, java.lang.String, org.telegram.tgnet.TLObject, java.lang.Object[]):android.util.Pair");
    }

    public final boolean q(TLRPC.User user, TLRPC.Chat chat, boolean z, TLRPC.InputFileLocation inputFileLocation, TLRPC.InputFileLocation[] inputFileLocationArr, boolean[] zArr) {
        TLRPC.InputPeer tL_inputPeerChat;
        TLRPC.InputPeer inputPeer;
        if (zArr == null || !zArr[0]) {
            return false;
        }
        TLRPC.TL_inputPeerPhotoFileLocation tL_inputPeerPhotoFileLocation = new TLRPC.TL_inputPeerPhotoFileLocation();
        long j = inputFileLocation.volume_id;
        tL_inputPeerPhotoFileLocation.id = j;
        tL_inputPeerPhotoFileLocation.volume_id = j;
        tL_inputPeerPhotoFileLocation.local_id = inputFileLocation.local_id;
        tL_inputPeerPhotoFileLocation.big = z;
        if (user != null) {
            if (user.access_hash == 0 && user.fromMessageId != 0 && user.fromMessageDialogId != 0) {
                inputPeer = new TLRPC.TL_inputPeerUserFromMessage();
                inputPeer.user_id = user.id;
                inputPeer.peer = getMessagesController().j1(user.fromMessageDialogId);
                inputPeer.msg_id = user.fromMessageId;
                tL_inputPeerPhotoFileLocation.photo_id = user.photo.photo_id;
            } else {
                inputPeer = new TLRPC.TL_inputPeerUser();
                inputPeer.user_id = user.id;
                inputPeer.access_hash = user.access_hash;
                tL_inputPeerPhotoFileLocation.photo_id = user.photo.photo_id;
            }
        } else {
            if (xc2.T(chat)) {
                if (chat.access_hash == 0 && chat.fromMessageDialogId != 0 && chat.fromMessageId != 0) {
                    TLRPC.TL_inputPeerChannelFromMessage tL_inputPeerChannelFromMessage = new TLRPC.TL_inputPeerChannelFromMessage();
                    tL_inputPeerChannelFromMessage.channel_id = chat.id;
                    tL_inputPeerChannelFromMessage.peer = getMessagesController().j1(chat.fromMessageDialogId);
                    tL_inputPeerChannelFromMessage.msg_id = chat.fromMessageId;
                    tL_inputPeerChat = tL_inputPeerChannelFromMessage;
                } else {
                    tL_inputPeerChat = new TLRPC.TL_inputPeerChannel();
                    tL_inputPeerChat.channel_id = chat.id;
                    tL_inputPeerChat.access_hash = chat.access_hash;
                }
            } else {
                tL_inputPeerChat = new TLRPC.TL_inputPeerChat();
                tL_inputPeerChat.chat_id = chat.id;
            }
            tL_inputPeerPhotoFileLocation.photo_id = chat.photo.photo_id;
            inputPeer = tL_inputPeerChat;
        }
        tL_inputPeerPhotoFileLocation.peer = inputPeer;
        inputFileLocationArr[0] = tL_inputPeerPhotoFileLocation;
        return true;
    }

    public final boolean s(java.lang.String r32, java.lang.String r33, org.telegram.tgnet.TLObject r34, org.telegram.tgnet.TLRPC.TL_error r35, boolean r36, boolean r37) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xc4.s(java.lang.String, java.lang.String, org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error, boolean, boolean):boolean");
    }

    public final boolean t(final defpackage.vc4 r12, byte[] r13, org.telegram.tgnet.TLRPC.InputFileLocation r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xc4.t(vc4, byte[], org.telegram.tgnet.TLRPC$InputFileLocation, boolean):boolean");
    }

    public final void u(java.lang.Object[] r25, java.lang.Object r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xc4.u(java.lang.Object[], java.lang.Object):void");
    }

    public final void v(final java.lang.Object[] r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xc4.v(java.lang.Object[]):void");
    }
}
