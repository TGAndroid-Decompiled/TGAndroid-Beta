package org.telegram.messenger;

import android.app.Activity;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.fv0;
import org.telegram.ui.Components.gv0;
import org.telegram.ui.Components.hv0;
import org.telegram.ui.aq0;

public final class r1 implements Runnable {

    public final int f21394a = 3;

    public final int f21395b;

    public final Object f21396c;
    public final boolean d;

    public final Object f21397e;

    public final Object f21398f;
    public final Object h;

    public r1(Activity activity, int i10, TLRPC.InputGroupCall inputGroupCall, boolean z10, TLRPC.GroupCall groupCall, HashSet hashSet) {
        this.f21397e = activity;
        this.f21395b = i10;
        this.f21396c = inputGroupCall;
        this.d = z10;
        this.f21398f = groupCall;
        this.h = hashSet;
    }

    @Override
    public final void run() throws Throwable {
        int i10;
        TLRPC.Document document;
        String res;
        RLottieNative rLottieNativeB;
        char c10;
        char c11;
        int size;
        int i11;
        boolean z10;
        TLRPC.messages_BotResults messages_botresults;
        int size2;
        int i12;
        boolean z11;
        TLRPC.BotInlineResult botInlineResult;
        boolean z12;
        MediaController.SearchImage searchImage;
        int i13;
        TLRPC.WebDocument webDocument;
        TLRPC.WebDocument webDocument2;
        int i14;
        TLRPC.DocumentAttribute documentAttribute;
        TLRPC.Photo photo;
        TLRPC.Photo photo2;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        String absolutePath;
        FileOutputStream fileOutputStream;
        InputStream inputStreamOpenInputStream;
        String extensionFromMimeType;
        final String str;
        int i15;
        final int i16;
        int i17;
        final int i18;
        int iCeil;
        int iIntValue;
        final int iIntValue2;
        final int i19;
        final int i20;
        switch (this.f21394a) {
            case 0:
                ((ContactsController) this.f21397e).lambda$processLoadedContacts$36(this.f21395b, (ArrayList) this.f21396c, (ArrayList) this.f21398f, (a0.h) this.h, this.d);
                return;
            case 1:
                ((SendMessagesHelper) this.f21397e).lambda$performSendMessageRequestMulti$65((TLObject) this.f21398f, this.f21395b, (SendMessagesHelper.DelayedMessage) this.h, (ArrayList) this.f21396c, this.d);
                return;
            case 2:
                hv0 hv0Var = (hv0) this.f21397e;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.f21396c;
                MessageObject messageObject = (MessageObject) this.f21398f;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.h;
                RLottieNative[] rLottieNativeArr = hv0Var.f29167b1;
                RLottieNative[] rLottieNativeArr2 = hv0Var.f29170e1;
                int[] iArr = hv0Var.f31312e;
                if (hv0Var.S0) {
                    AndroidUtilities.runOnUIThread(new fv0(hv0Var, 0));
                    return;
                }
                boolean z13 = false;
                int i21 = 0;
                while (true) {
                    int length = rLottieNativeArr2.length + 2;
                    int i22 = this.f21395b;
                    if (i21 >= length) {
                        if (z13) {
                            AndroidUtilities.runOnUIThread(new fv0(hv0Var, 1));
                            return;
                        } else {
                            AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.j0(hv0Var, this.d, i22, s1Var));
                            return;
                        }
                    }
                    if (i21 <= 2) {
                        if (rLottieNativeArr2[i21] == null) {
                            if (i21 == 0) {
                                int i23 = hv0Var.X0;
                                if (i23 == 1) {
                                    i10 = 5;
                                } else if (i23 == 2) {
                                    i10 = 6;
                                } else if (i23 == 3) {
                                    i10 = 7;
                                } else {
                                    i10 = i23 == 4 ? 4 : 3;
                                }
                            } else if (i21 == 1) {
                                int i24 = hv0Var.Y0;
                                if (i24 == 1) {
                                    i10 = 11;
                                } else if (i24 == 2) {
                                    i10 = 12;
                                } else if (i24 == 3) {
                                    i10 = 13;
                                } else {
                                    i10 = i24 == 4 ? 10 : 9;
                                }
                            } else {
                                int i25 = hv0Var.Z0;
                                if (i25 == 1) {
                                    i10 = 17;
                                } else if (i25 == 2) {
                                    i10 = 18;
                                } else if (i25 == 3) {
                                    i10 = 19;
                                } else {
                                    i10 = i25 == 4 ? 16 : 15;
                                }
                            }
                            document = tL_messages_stickerSet.documents.get(i10);
                            res = AndroidUtilities.readRes(FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document, true), 0);
                            if (TextUtils.isEmpty(res)) {
                                AndroidUtilities.runOnUIThread(new gv0(document, i22, messageObject, s1Var, tL_messages_stickerSet, 0));
                                z13 = true;
                            } else {
                                rLottieNativeB = RLottieNative.b(res, "dice", iArr, null, null);
                                if (i21 <= 2) {
                                    rLottieNativeArr2[i21] = rLottieNativeB;
                                    hv0Var.f29171f1[i21] = iArr[0];
                                } else {
                                    if (i21 == 3) {
                                        c10 = 0;
                                    } else {
                                        c10 = 4;
                                    }
                                    rLottieNativeArr[c10] = rLottieNativeB;
                                    int[] iArr2 = hv0Var.f29168c1;
                                    if (i21 == 3) {
                                        c11 = 0;
                                    } else {
                                        c11 = 4;
                                    }
                                    iArr2[c11] = iArr[0];
                                }
                            }
                        }
                        i21++;
                    } else {
                        if (rLottieNativeArr[i21] == null) {
                            i10 = i21 == 3 ? 1 : 2;
                            document = tL_messages_stickerSet.documents.get(i10);
                            res = AndroidUtilities.readRes(FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document, true), 0);
                            if (TextUtils.isEmpty(res)) {
                                AndroidUtilities.runOnUIThread(new gv0(document, i22, messageObject, s1Var, tL_messages_stickerSet, 0));
                                z13 = true;
                            } else {
                                rLottieNativeB = RLottieNative.b(res, "dice", iArr, null, null);
                                if (i21 <= 2) {
                                    rLottieNativeArr2[i21] = rLottieNativeB;
                                    hv0Var.f29171f1[i21] = iArr[0];
                                } else {
                                    if (i21 == 3) {
                                        c10 = 0;
                                    } else {
                                        c10 = 4;
                                    }
                                    rLottieNativeArr[c10] = rLottieNativeB;
                                    int[] iArr3 = hv0Var.f29168c1;
                                    if (i21 == 3) {
                                        c11 = 0;
                                    } else {
                                        c11 = 4;
                                    }
                                    iArr3[c11] = iArr[0];
                                }
                            }
                        }
                        i21++;
                    }
                    i21++;
                }
                break;
            case 3:
                Activity activity = (Activity) this.f21397e;
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) this.f21396c;
                TLRPC.GroupCall groupCall = (TLRPC.GroupCall) this.f21398f;
                HashSet hashSet = (HashSet) this.h;
                org.telegram.ui.Components.voip.e2.f33548a = 0L;
                org.telegram.ui.Components.voip.e2.h(activity, this.f21395b, inputGroupCall, this.d, groupCall, hashSet);
                return;
            case 4:
                aq0 aq0Var = (aq0) this.f21397e;
                String str2 = (String) this.f21396c;
                TLObject tLObject = (TLObject) this.f21398f;
                TLRPC.User user = (TLRPC.User) this.h;
                HashMap map = aq0Var.h;
                ArrayList arrayList = aq0Var.f36605f;
                ArrayList arrayList2 = aq0Var.f36613n;
                int size3 = arrayList2.size();
                for (int i26 = 0; i26 < size3; i26++) {
                    if (((String) arrayList2.get(i26)).equalsIgnoreCase(str2)) {
                        arrayList2.remove(i26);
                        arrayList2.add(0, str2);
                        while (arrayList2.size() > 20) {
                            a9.p.s(1, arrayList2);
                        }
                        aq0Var.c0();
                        if (this.f21395b != aq0Var.f36625y) {
                            return;
                        }
                        size = arrayList.size();
                        if (tLObject != null) {
                            messages_botresults = (TLRPC.messages_BotResults) tLObject;
                            aq0Var.f36623w = messages_botresults.next_offset;
                            size2 = messages_botresults.results.size();
                            i11 = 0;
                            for (i12 = 0; i12 < size2; i12++) {
                                botInlineResult = messages_botresults.results.get(i12);
                                z12 = this.d;
                                if ((z12 || "photo".equals(botInlineResult.type)) && ((!z12 || "gif".equals(botInlineResult.type)) && !map.containsKey(botInlineResult.f22378id))) {
                                    searchImage = new MediaController.SearchImage();
                                    if (!z12 && botInlineResult.document != null) {
                                        for (int i27 = 0; i27 < botInlineResult.document.attributes.size(); i27++) {
                                            TLRPC.DocumentAttribute documentAttribute2 = botInlineResult.document.attributes.get(i27);
                                            if ((documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute2 instanceof TLRPC.TL_documentAttributeVideo)) {
                                                searchImage.width = documentAttribute2.f22387w;
                                                searchImage.height = documentAttribute2.h;
                                                searchImage.document = botInlineResult.document;
                                                searchImage.size = 0;
                                                photo2 = botInlineResult.photo;
                                                if (photo2 != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo2.sizes, aq0Var.N, true)) != null) {
                                                    botInlineResult.document.thumbs.add(closestPhotoSizeWithSize);
                                                    botInlineResult.document.flags |= 1;
                                                }
                                            }
                                        }
                                        searchImage.document = botInlineResult.document;
                                        searchImage.size = 0;
                                        photo2 = botInlineResult.photo;
                                        if (photo2 != null) {
                                            botInlineResult.document.thumbs.add(closestPhotoSizeWithSize);
                                            botInlineResult.document.flags |= 1;
                                        }
                                    } else if (z12 && (photo = botInlineResult.photo) != null) {
                                        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
                                        TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(botInlineResult.photo.sizes, 320);
                                        if (closestPhotoSizeWithSize2 != null) {
                                            searchImage.width = closestPhotoSizeWithSize2.f22405w;
                                            searchImage.height = closestPhotoSizeWithSize2.h;
                                            searchImage.photoSize = closestPhotoSizeWithSize2;
                                            searchImage.photo = botInlineResult.photo;
                                            searchImage.size = closestPhotoSizeWithSize2.size;
                                            searchImage.thumbPhotoSize = closestPhotoSizeWithSize3;
                                        }
                                    } else if (botInlineResult.content != null) {
                                        for (i13 = 0; i13 < botInlineResult.content.attributes.size(); i13++) {
                                            documentAttribute = botInlineResult.content.attributes.get(i13);
                                            if (documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) {
                                                searchImage.width = documentAttribute.f22387w;
                                                searchImage.height = documentAttribute.h;
                                                webDocument = botInlineResult.thumb;
                                                if (webDocument != null) {
                                                    searchImage.thumbUrl = webDocument.url;
                                                } else {
                                                    searchImage.thumbUrl = null;
                                                }
                                                webDocument2 = botInlineResult.content;
                                                searchImage.imageUrl = webDocument2.url;
                                                if (z12) {
                                                    i14 = 0;
                                                } else {
                                                    i14 = webDocument2.size;
                                                }
                                                searchImage.size = i14;
                                            }
                                        }
                                        webDocument = botInlineResult.thumb;
                                        if (webDocument != null) {
                                            searchImage.thumbUrl = webDocument.url;
                                        } else {
                                            searchImage.thumbUrl = null;
                                        }
                                        webDocument2 = botInlineResult.content;
                                        searchImage.imageUrl = webDocument2.url;
                                        if (z12) {
                                            i14 = 0;
                                        } else {
                                            i14 = webDocument2.size;
                                        }
                                        searchImage.size = i14;
                                    }
                                    searchImage.f19616id = botInlineResult.f22378id;
                                    searchImage.type = z12 ? 1 : 0;
                                    searchImage.inlineResult = botInlineResult;
                                    HashMap<String, String> map2 = new HashMap<>();
                                    searchImage.params = map2;
                                    map2.put("id", botInlineResult.f22378id);
                                    searchImage.params.put("query_id", "" + messages_botresults.query_id);
                                    searchImage.params.put("bot_name", UserObject.getPublicUsername(user));
                                    arrayList.add(searchImage);
                                    map.put(searchImage.f19616id, searchImage);
                                    i11++;
                                }
                            }
                            if (size != arrayList.size() || aq0Var.f36623w == null) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            aq0Var.f36620s = z11;
                        } else {
                            i11 = 0;
                        }
                        aq0Var.f36618r = false;
                        if (i11 != 0) {
                            if (aq0Var.f36620s) {
                                z10 = true;
                                aq0Var.H.u(arrayList.size() - 1);
                            }
                            if (arrayList.size() <= 0) {
                                aq0Var.J.e(false, z10);
                                return;
                            }
                            return;
                        }
                        aq0Var.H.s(size, i11);
                        z10 = true;
                        if (arrayList.size() <= 0) {
                            aq0Var.J.e(false, z10);
                            return;
                        }
                        return;
                    }
                }
                arrayList2.add(0, str2);
                while (arrayList2.size() > 20) {
                    a9.p.s(1, arrayList2);
                }
                aq0Var.c0();
                if (this.f21395b != aq0Var.f36625y) {
                    return;
                }
                size = arrayList.size();
                if (tLObject != null) {
                    messages_botresults = (TLRPC.messages_BotResults) tLObject;
                    aq0Var.f36623w = messages_botresults.next_offset;
                    size2 = messages_botresults.results.size();
                    i11 = 0;
                    while (i12 < size2) {
                        botInlineResult = messages_botresults.results.get(i12);
                        z12 = this.d;
                        if (z12) {
                            searchImage = new MediaController.SearchImage();
                            if (!z12) {
                                if (z12) {
                                    if (botInlineResult.content != null) {
                                        while (i13 < botInlineResult.content.attributes.size()) {
                                            documentAttribute = botInlineResult.content.attributes.get(i13);
                                            if (documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) {
                                                searchImage.width = documentAttribute.f22387w;
                                                searchImage.height = documentAttribute.h;
                                                webDocument = botInlineResult.thumb;
                                                if (webDocument != null) {
                                                    searchImage.thumbUrl = webDocument.url;
                                                } else {
                                                    searchImage.thumbUrl = null;
                                                }
                                                webDocument2 = botInlineResult.content;
                                                searchImage.imageUrl = webDocument2.url;
                                                if (z12) {
                                                    i14 = 0;
                                                } else {
                                                    i14 = webDocument2.size;
                                                }
                                                searchImage.size = i14;
                                                searchImage.f19616id = botInlineResult.f22378id;
                                                searchImage.type = z12 ? 1 : 0;
                                                searchImage.inlineResult = botInlineResult;
                                                HashMap<String, String> map3 = new HashMap<>();
                                                searchImage.params = map3;
                                                map3.put("id", botInlineResult.f22378id);
                                                searchImage.params.put("query_id", "" + messages_botresults.query_id);
                                                searchImage.params.put("bot_name", UserObject.getPublicUsername(user));
                                                arrayList.add(searchImage);
                                                map.put(searchImage.f19616id, searchImage);
                                                i11++;
                                            }
                                        }
                                        webDocument = botInlineResult.thumb;
                                        if (webDocument != null) {
                                            searchImage.thumbUrl = webDocument.url;
                                        } else {
                                            searchImage.thumbUrl = null;
                                        }
                                        webDocument2 = botInlineResult.content;
                                        searchImage.imageUrl = webDocument2.url;
                                        if (z12) {
                                            i14 = 0;
                                        } else {
                                            i14 = webDocument2.size;
                                        }
                                        searchImage.size = i14;
                                        searchImage.f19616id = botInlineResult.f22378id;
                                        searchImage.type = z12 ? 1 : 0;
                                        searchImage.inlineResult = botInlineResult;
                                        HashMap<String, String> map4 = new HashMap<>();
                                        searchImage.params = map4;
                                        map4.put("id", botInlineResult.f22378id);
                                        searchImage.params.put("query_id", "" + messages_botresults.query_id);
                                        searchImage.params.put("bot_name", UserObject.getPublicUsername(user));
                                        arrayList.add(searchImage);
                                        map.put(searchImage.f19616id, searchImage);
                                        i11++;
                                    }
                                } else if (botInlineResult.content != null) {
                                    while (i13 < botInlineResult.content.attributes.size()) {
                                        documentAttribute = botInlineResult.content.attributes.get(i13);
                                        if (documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) {
                                            searchImage.width = documentAttribute.f22387w;
                                            searchImage.height = documentAttribute.h;
                                            webDocument = botInlineResult.thumb;
                                            if (webDocument != null) {
                                                searchImage.thumbUrl = webDocument.url;
                                            } else {
                                                searchImage.thumbUrl = null;
                                            }
                                            webDocument2 = botInlineResult.content;
                                            searchImage.imageUrl = webDocument2.url;
                                            if (z12) {
                                                i14 = 0;
                                            } else {
                                                i14 = webDocument2.size;
                                            }
                                            searchImage.size = i14;
                                            searchImage.f19616id = botInlineResult.f22378id;
                                            searchImage.type = z12 ? 1 : 0;
                                            searchImage.inlineResult = botInlineResult;
                                            HashMap<String, String> map5 = new HashMap<>();
                                            searchImage.params = map5;
                                            map5.put("id", botInlineResult.f22378id);
                                            searchImage.params.put("query_id", "" + messages_botresults.query_id);
                                            searchImage.params.put("bot_name", UserObject.getPublicUsername(user));
                                            arrayList.add(searchImage);
                                            map.put(searchImage.f19616id, searchImage);
                                            i11++;
                                        }
                                    }
                                    webDocument = botInlineResult.thumb;
                                    if (webDocument != null) {
                                        searchImage.thumbUrl = webDocument.url;
                                    } else {
                                        searchImage.thumbUrl = null;
                                    }
                                    webDocument2 = botInlineResult.content;
                                    searchImage.imageUrl = webDocument2.url;
                                    if (z12) {
                                        i14 = 0;
                                    } else {
                                        i14 = webDocument2.size;
                                    }
                                    searchImage.size = i14;
                                    searchImage.f19616id = botInlineResult.f22378id;
                                    searchImage.type = z12 ? 1 : 0;
                                    searchImage.inlineResult = botInlineResult;
                                    HashMap<String, String> map6 = new HashMap<>();
                                    searchImage.params = map6;
                                    map6.put("id", botInlineResult.f22378id);
                                    searchImage.params.put("query_id", "" + messages_botresults.query_id);
                                    searchImage.params.put("bot_name", UserObject.getPublicUsername(user));
                                    arrayList.add(searchImage);
                                    map.put(searchImage.f19616id, searchImage);
                                    i11++;
                                }
                            } else if (z12) {
                                if (botInlineResult.content != null) {
                                    while (i13 < botInlineResult.content.attributes.size()) {
                                        documentAttribute = botInlineResult.content.attributes.get(i13);
                                        if (documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) {
                                            searchImage.width = documentAttribute.f22387w;
                                            searchImage.height = documentAttribute.h;
                                            webDocument = botInlineResult.thumb;
                                            if (webDocument != null) {
                                                searchImage.thumbUrl = webDocument.url;
                                            } else {
                                                searchImage.thumbUrl = null;
                                            }
                                            webDocument2 = botInlineResult.content;
                                            searchImage.imageUrl = webDocument2.url;
                                            if (z12) {
                                                i14 = 0;
                                            } else {
                                                i14 = webDocument2.size;
                                            }
                                            searchImage.size = i14;
                                            searchImage.f19616id = botInlineResult.f22378id;
                                            searchImage.type = z12 ? 1 : 0;
                                            searchImage.inlineResult = botInlineResult;
                                            HashMap<String, String> map7 = new HashMap<>();
                                            searchImage.params = map7;
                                            map7.put("id", botInlineResult.f22378id);
                                            searchImage.params.put("query_id", "" + messages_botresults.query_id);
                                            searchImage.params.put("bot_name", UserObject.getPublicUsername(user));
                                            arrayList.add(searchImage);
                                            map.put(searchImage.f19616id, searchImage);
                                            i11++;
                                        }
                                    }
                                    webDocument = botInlineResult.thumb;
                                    if (webDocument != null) {
                                        searchImage.thumbUrl = webDocument.url;
                                    } else {
                                        searchImage.thumbUrl = null;
                                    }
                                    webDocument2 = botInlineResult.content;
                                    searchImage.imageUrl = webDocument2.url;
                                    if (z12) {
                                        i14 = 0;
                                    } else {
                                        i14 = webDocument2.size;
                                    }
                                    searchImage.size = i14;
                                    searchImage.f19616id = botInlineResult.f22378id;
                                    searchImage.type = z12 ? 1 : 0;
                                    searchImage.inlineResult = botInlineResult;
                                    HashMap<String, String> map8 = new HashMap<>();
                                    searchImage.params = map8;
                                    map8.put("id", botInlineResult.f22378id);
                                    searchImage.params.put("query_id", "" + messages_botresults.query_id);
                                    searchImage.params.put("bot_name", UserObject.getPublicUsername(user));
                                    arrayList.add(searchImage);
                                    map.put(searchImage.f19616id, searchImage);
                                    i11++;
                                }
                            } else if (botInlineResult.content != null) {
                                while (i13 < botInlineResult.content.attributes.size()) {
                                    documentAttribute = botInlineResult.content.attributes.get(i13);
                                    if (documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) {
                                        searchImage.width = documentAttribute.f22387w;
                                        searchImage.height = documentAttribute.h;
                                        webDocument = botInlineResult.thumb;
                                        if (webDocument != null) {
                                            searchImage.thumbUrl = webDocument.url;
                                        } else {
                                            searchImage.thumbUrl = null;
                                        }
                                        webDocument2 = botInlineResult.content;
                                        searchImage.imageUrl = webDocument2.url;
                                        if (z12) {
                                            i14 = 0;
                                        } else {
                                            i14 = webDocument2.size;
                                        }
                                        searchImage.size = i14;
                                        searchImage.f19616id = botInlineResult.f22378id;
                                        searchImage.type = z12 ? 1 : 0;
                                        searchImage.inlineResult = botInlineResult;
                                        HashMap<String, String> map9 = new HashMap<>();
                                        searchImage.params = map9;
                                        map9.put("id", botInlineResult.f22378id);
                                        searchImage.params.put("query_id", "" + messages_botresults.query_id);
                                        searchImage.params.put("bot_name", UserObject.getPublicUsername(user));
                                        arrayList.add(searchImage);
                                        map.put(searchImage.f19616id, searchImage);
                                        i11++;
                                    }
                                }
                                webDocument = botInlineResult.thumb;
                                if (webDocument != null) {
                                    searchImage.thumbUrl = webDocument.url;
                                } else {
                                    searchImage.thumbUrl = null;
                                }
                                webDocument2 = botInlineResult.content;
                                searchImage.imageUrl = webDocument2.url;
                                if (z12) {
                                    i14 = 0;
                                } else {
                                    i14 = webDocument2.size;
                                }
                                searchImage.size = i14;
                                searchImage.f19616id = botInlineResult.f22378id;
                                searchImage.type = z12 ? 1 : 0;
                                searchImage.inlineResult = botInlineResult;
                                HashMap<String, String> map10 = new HashMap<>();
                                searchImage.params = map10;
                                map10.put("id", botInlineResult.f22378id);
                                searchImage.params.put("query_id", "" + messages_botresults.query_id);
                                searchImage.params.put("bot_name", UserObject.getPublicUsername(user));
                                arrayList.add(searchImage);
                                map.put(searchImage.f19616id, searchImage);
                                i11++;
                            }
                        } else {
                            searchImage = new MediaController.SearchImage();
                            if (!z12) {
                                if (z12) {
                                    if (botInlineResult.content != null) {
                                        while (i13 < botInlineResult.content.attributes.size()) {
                                            documentAttribute = botInlineResult.content.attributes.get(i13);
                                            if (documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) {
                                                searchImage.width = documentAttribute.f22387w;
                                                searchImage.height = documentAttribute.h;
                                                webDocument = botInlineResult.thumb;
                                                if (webDocument != null) {
                                                    searchImage.thumbUrl = webDocument.url;
                                                } else {
                                                    searchImage.thumbUrl = null;
                                                }
                                                webDocument2 = botInlineResult.content;
                                                searchImage.imageUrl = webDocument2.url;
                                                if (z12) {
                                                    i14 = 0;
                                                } else {
                                                    i14 = webDocument2.size;
                                                }
                                                searchImage.size = i14;
                                                searchImage.f19616id = botInlineResult.f22378id;
                                                searchImage.type = z12 ? 1 : 0;
                                                searchImage.inlineResult = botInlineResult;
                                                HashMap<String, String> map11 = new HashMap<>();
                                                searchImage.params = map11;
                                                map11.put("id", botInlineResult.f22378id);
                                                searchImage.params.put("query_id", "" + messages_botresults.query_id);
                                                searchImage.params.put("bot_name", UserObject.getPublicUsername(user));
                                                arrayList.add(searchImage);
                                                map.put(searchImage.f19616id, searchImage);
                                                i11++;
                                            }
                                        }
                                        webDocument = botInlineResult.thumb;
                                        if (webDocument != null) {
                                            searchImage.thumbUrl = webDocument.url;
                                        } else {
                                            searchImage.thumbUrl = null;
                                        }
                                        webDocument2 = botInlineResult.content;
                                        searchImage.imageUrl = webDocument2.url;
                                        if (z12) {
                                            i14 = 0;
                                        } else {
                                            i14 = webDocument2.size;
                                        }
                                        searchImage.size = i14;
                                        searchImage.f19616id = botInlineResult.f22378id;
                                        searchImage.type = z12 ? 1 : 0;
                                        searchImage.inlineResult = botInlineResult;
                                        HashMap<String, String> map12 = new HashMap<>();
                                        searchImage.params = map12;
                                        map12.put("id", botInlineResult.f22378id);
                                        searchImage.params.put("query_id", "" + messages_botresults.query_id);
                                        searchImage.params.put("bot_name", UserObject.getPublicUsername(user));
                                        arrayList.add(searchImage);
                                        map.put(searchImage.f19616id, searchImage);
                                        i11++;
                                    }
                                } else if (botInlineResult.content != null) {
                                    while (i13 < botInlineResult.content.attributes.size()) {
                                        documentAttribute = botInlineResult.content.attributes.get(i13);
                                        if (documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) {
                                            searchImage.width = documentAttribute.f22387w;
                                            searchImage.height = documentAttribute.h;
                                            webDocument = botInlineResult.thumb;
                                            if (webDocument != null) {
                                                searchImage.thumbUrl = webDocument.url;
                                            } else {
                                                searchImage.thumbUrl = null;
                                            }
                                            webDocument2 = botInlineResult.content;
                                            searchImage.imageUrl = webDocument2.url;
                                            if (z12) {
                                                i14 = 0;
                                            } else {
                                                i14 = webDocument2.size;
                                            }
                                            searchImage.size = i14;
                                            searchImage.f19616id = botInlineResult.f22378id;
                                            searchImage.type = z12 ? 1 : 0;
                                            searchImage.inlineResult = botInlineResult;
                                            HashMap<String, String> map13 = new HashMap<>();
                                            searchImage.params = map13;
                                            map13.put("id", botInlineResult.f22378id);
                                            searchImage.params.put("query_id", "" + messages_botresults.query_id);
                                            searchImage.params.put("bot_name", UserObject.getPublicUsername(user));
                                            arrayList.add(searchImage);
                                            map.put(searchImage.f19616id, searchImage);
                                            i11++;
                                        }
                                    }
                                    webDocument = botInlineResult.thumb;
                                    if (webDocument != null) {
                                        searchImage.thumbUrl = webDocument.url;
                                    } else {
                                        searchImage.thumbUrl = null;
                                    }
                                    webDocument2 = botInlineResult.content;
                                    searchImage.imageUrl = webDocument2.url;
                                    if (z12) {
                                        i14 = 0;
                                    } else {
                                        i14 = webDocument2.size;
                                    }
                                    searchImage.size = i14;
                                    searchImage.f19616id = botInlineResult.f22378id;
                                    searchImage.type = z12 ? 1 : 0;
                                    searchImage.inlineResult = botInlineResult;
                                    HashMap<String, String> map14 = new HashMap<>();
                                    searchImage.params = map14;
                                    map14.put("id", botInlineResult.f22378id);
                                    searchImage.params.put("query_id", "" + messages_botresults.query_id);
                                    searchImage.params.put("bot_name", UserObject.getPublicUsername(user));
                                    arrayList.add(searchImage);
                                    map.put(searchImage.f19616id, searchImage);
                                    i11++;
                                }
                            } else if (z12) {
                                if (botInlineResult.content != null) {
                                    while (i13 < botInlineResult.content.attributes.size()) {
                                        documentAttribute = botInlineResult.content.attributes.get(i13);
                                        if (documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) {
                                            searchImage.width = documentAttribute.f22387w;
                                            searchImage.height = documentAttribute.h;
                                            webDocument = botInlineResult.thumb;
                                            if (webDocument != null) {
                                                searchImage.thumbUrl = webDocument.url;
                                            } else {
                                                searchImage.thumbUrl = null;
                                            }
                                            webDocument2 = botInlineResult.content;
                                            searchImage.imageUrl = webDocument2.url;
                                            if (z12) {
                                                i14 = 0;
                                            } else {
                                                i14 = webDocument2.size;
                                            }
                                            searchImage.size = i14;
                                            searchImage.f19616id = botInlineResult.f22378id;
                                            searchImage.type = z12 ? 1 : 0;
                                            searchImage.inlineResult = botInlineResult;
                                            HashMap<String, String> map15 = new HashMap<>();
                                            searchImage.params = map15;
                                            map15.put("id", botInlineResult.f22378id);
                                            searchImage.params.put("query_id", "" + messages_botresults.query_id);
                                            searchImage.params.put("bot_name", UserObject.getPublicUsername(user));
                                            arrayList.add(searchImage);
                                            map.put(searchImage.f19616id, searchImage);
                                            i11++;
                                        }
                                    }
                                    webDocument = botInlineResult.thumb;
                                    if (webDocument != null) {
                                        searchImage.thumbUrl = webDocument.url;
                                    } else {
                                        searchImage.thumbUrl = null;
                                    }
                                    webDocument2 = botInlineResult.content;
                                    searchImage.imageUrl = webDocument2.url;
                                    if (z12) {
                                        i14 = 0;
                                    } else {
                                        i14 = webDocument2.size;
                                    }
                                    searchImage.size = i14;
                                    searchImage.f19616id = botInlineResult.f22378id;
                                    searchImage.type = z12 ? 1 : 0;
                                    searchImage.inlineResult = botInlineResult;
                                    HashMap<String, String> map16 = new HashMap<>();
                                    searchImage.params = map16;
                                    map16.put("id", botInlineResult.f22378id);
                                    searchImage.params.put("query_id", "" + messages_botresults.query_id);
                                    searchImage.params.put("bot_name", UserObject.getPublicUsername(user));
                                    arrayList.add(searchImage);
                                    map.put(searchImage.f19616id, searchImage);
                                    i11++;
                                }
                            } else if (botInlineResult.content != null) {
                                while (i13 < botInlineResult.content.attributes.size()) {
                                    documentAttribute = botInlineResult.content.attributes.get(i13);
                                    if (documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) {
                                        searchImage.width = documentAttribute.f22387w;
                                        searchImage.height = documentAttribute.h;
                                        webDocument = botInlineResult.thumb;
                                        if (webDocument != null) {
                                            searchImage.thumbUrl = webDocument.url;
                                        } else {
                                            searchImage.thumbUrl = null;
                                        }
                                        webDocument2 = botInlineResult.content;
                                        searchImage.imageUrl = webDocument2.url;
                                        if (z12) {
                                            i14 = 0;
                                        } else {
                                            i14 = webDocument2.size;
                                        }
                                        searchImage.size = i14;
                                        searchImage.f19616id = botInlineResult.f22378id;
                                        searchImage.type = z12 ? 1 : 0;
                                        searchImage.inlineResult = botInlineResult;
                                        HashMap<String, String> map17 = new HashMap<>();
                                        searchImage.params = map17;
                                        map17.put("id", botInlineResult.f22378id);
                                        searchImage.params.put("query_id", "" + messages_botresults.query_id);
                                        searchImage.params.put("bot_name", UserObject.getPublicUsername(user));
                                        arrayList.add(searchImage);
                                        map.put(searchImage.f19616id, searchImage);
                                        i11++;
                                    }
                                }
                                webDocument = botInlineResult.thumb;
                                if (webDocument != null) {
                                    searchImage.thumbUrl = webDocument.url;
                                } else {
                                    searchImage.thumbUrl = null;
                                }
                                webDocument2 = botInlineResult.content;
                                searchImage.imageUrl = webDocument2.url;
                                if (z12) {
                                    i14 = 0;
                                } else {
                                    i14 = webDocument2.size;
                                }
                                searchImage.size = i14;
                                searchImage.f19616id = botInlineResult.f22378id;
                                searchImage.type = z12 ? 1 : 0;
                                searchImage.inlineResult = botInlineResult;
                                HashMap<String, String> map18 = new HashMap<>();
                                searchImage.params = map18;
                                map18.put("id", botInlineResult.f22378id);
                                searchImage.params.put("query_id", "" + messages_botresults.query_id);
                                searchImage.params.put("bot_name", UserObject.getPublicUsername(user));
                                arrayList.add(searchImage);
                                map.put(searchImage.f19616id, searchImage);
                                i11++;
                            }
                        }
                    }
                    if (size != arrayList.size()) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                    aq0Var.f36620s = z11;
                } else {
                    i11 = 0;
                }
                aq0Var.f36618r = false;
                if (i11 != 0) {
                    if (aq0Var.f36620s) {
                        z10 = true;
                        aq0Var.H.u(arrayList.size() - 1);
                    }
                    if (arrayList.size() <= 0) {
                        aq0Var.J.e(false, z10);
                        return;
                    }
                    return;
                }
                aq0Var.H.s(size, i11);
                z10 = true;
                if (arrayList.size() <= 0) {
                    aq0Var.J.e(false, z10);
                    return;
                }
                return;
            default:
                final rh.p3 p3Var = (rh.p3) this.f21397e;
                Uri uri = (Uri) this.f21396c;
                String str3 = (String) this.f21398f;
                final rh.a aVar = (rh.a) this.h;
                InputStream inputStream = null;
                mediaMetadataRetriever = null;
                MediaMetadataRetriever mediaMetadataRetriever = null;
                try {
                    absolutePath = AndroidUtilities.getPath(uri);
                    break;
                } catch (Exception e9) {
                    FileLog.e(e9);
                    absolutePath = null;
                }
                final boolean z14 = this.d;
                final int i28 = this.f21395b;
                if (absolutePath == null || !com.google.android.recaptcha.internal.a.v(absolutePath)) {
                    Context context = p3Var.getContext();
                    try {
                        if (context == null) {
                            absolutePath = null;
                        } else {
                            try {
                                inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                                if (inputStreamOpenInputStream == null) {
                                    if (inputStreamOpenInputStream != null) {
                                        inputStreamOpenInputStream.close();
                                    }
                                    absolutePath = null;
                                    break;
                                } else {
                                    if (str3 != null) {
                                        try {
                                            extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(str3);
                                        } catch (Exception e10) {
                                            e = e10;
                                            fileOutputStream = null;
                                            FileLog.e(e);
                                            if (inputStreamOpenInputStream != null) {
                                                try {
                                                    inputStreamOpenInputStream.close();
                                                    break;
                                                } catch (Exception unused) {
                                                }
                                            }
                                            if (fileOutputStream != null) {
                                                fileOutputStream.close();
                                            }
                                            absolutePath = null;
                                            str = absolutePath;
                                            if (str == null) {
                                                return;
                                            } else {
                                                return;
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            fileOutputStream = null;
                                            inputStream = inputStreamOpenInputStream;
                                            if (inputStream != null) {
                                                try {
                                                    inputStream.close();
                                                    break;
                                                } catch (Exception unused2) {
                                                }
                                            }
                                            if (fileOutputStream == null) {
                                                throw th;
                                            }
                                            try {
                                                fileOutputStream.close();
                                                throw th;
                                            } catch (Exception unused3) {
                                                throw th;
                                            }
                                        }
                                    } else {
                                        extensionFromMimeType = null;
                                    }
                                    if (TextUtils.isEmpty(extensionFromMimeType)) {
                                        extensionFromMimeType = z14 ? "mp4" : "jpg";
                                    }
                                    File file = new File(FileLoader.getDirectory(4), "rich_external_" + (-i28) + "_" + SharedConfig.getLastLocalId() + "." + extensionFromMimeType);
                                    fileOutputStream = new FileOutputStream(file);
                                    try {
                                        try {
                                            AndroidUtilities.copyFile(inputStreamOpenInputStream, fileOutputStream);
                                            absolutePath = file.getAbsolutePath();
                                            try {
                                                inputStreamOpenInputStream.close();
                                                break;
                                            } catch (Exception unused4) {
                                            }
                                            try {
                                                fileOutputStream.close();
                                                break;
                                            } catch (Exception unused5) {
                                            }
                                        } catch (Exception e11) {
                                            e = e11;
                                            FileLog.e(e);
                                            if (inputStreamOpenInputStream != null) {
                                                inputStreamOpenInputStream.close();
                                            }
                                            if (fileOutputStream != null) {
                                                fileOutputStream.close();
                                            }
                                            absolutePath = null;
                                            str = absolutePath;
                                            if (str == null) {
                                                return;
                                            } else {
                                                return;
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        inputStream = inputStreamOpenInputStream;
                                        if (inputStream != null) {
                                            inputStream.close();
                                            break;
                                        }
                                        if (fileOutputStream == null) {
                                            throw th;
                                        }
                                        fileOutputStream.close();
                                        throw th;
                                    }
                                }
                            } catch (Exception e12) {
                                e = e12;
                                inputStreamOpenInputStream = null;
                                fileOutputStream = null;
                            } catch (Throwable th3) {
                                th = th3;
                                fileOutputStream = null;
                                if (inputStream != null) {
                                    inputStream.close();
                                    break;
                                }
                                if (fileOutputStream == null) {
                                    throw th;
                                }
                                fileOutputStream.close();
                                throw th;
                            }
                        }
                    } catch (Exception unused6) {
                    }
                }
                str = absolutePath;
                if (str == null && com.google.android.recaptcha.internal.a.v(str)) {
                    if (z14) {
                        try {
                            try {
                                MediaMetadataRetriever mediaMetadataRetriever2 = new MediaMetadataRetriever();
                                try {
                                    try {
                                        mediaMetadataRetriever2.setDataSource(str);
                                        String strExtractMetadata = mediaMetadataRetriever2.extractMetadata(18);
                                        String strExtractMetadata2 = mediaMetadataRetriever2.extractMetadata(19);
                                        String strExtractMetadata3 = mediaMetadataRetriever2.extractMetadata(9);
                                        i16 = strExtractMetadata != null ? Integer.parseInt(strExtractMetadata) : 0;
                                        if (strExtractMetadata2 != null) {
                                            try {
                                                i17 = Integer.parseInt(strExtractMetadata2);
                                            } catch (Exception e13) {
                                                e = e13;
                                                mediaMetadataRetriever = mediaMetadataRetriever2;
                                                i15 = 0;
                                                FileLog.e(e);
                                                if (mediaMetadataRetriever != null) {
                                                    try {
                                                        mediaMetadataRetriever.release();
                                                        break;
                                                    } catch (Exception unused7) {
                                                    }
                                                }
                                                i17 = i15;
                                                i18 = 0;
                                                if (!z14) {
                                                    try {
                                                        BitmapFactory.Options options = new BitmapFactory.Options();
                                                        options.inJustDecodeBounds = true;
                                                        BitmapFactory.decodeFile(str, options);
                                                        i16 = options.outWidth;
                                                        i17 = options.outHeight;
                                                    } catch (Exception e14) {
                                                        FileLog.e(e14);
                                                    }
                                                    try {
                                                        Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(str);
                                                        iIntValue = ((Integer) imageOrientation.first).intValue();
                                                        try {
                                                            iIntValue2 = ((Integer) imageOrientation.second).intValue();
                                                        } catch (Exception e15) {
                                                            e = e15;
                                                            FileLog.e(e);
                                                            iIntValue2 = 0;
                                                        }
                                                    } catch (Exception e16) {
                                                        e = e16;
                                                        iIntValue = 0;
                                                    }
                                                    i19 = iIntValue;
                                                    i20 = i17;
                                                    break;
                                                } else {
                                                    i20 = i17;
                                                    i16 = i16;
                                                    i19 = 0;
                                                    iIntValue2 = 0;
                                                }
                                                AndroidUtilities.runOnUIThread(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        p3 p3Var2 = p3Var;
                                                        p3Var2.getClass();
                                                        boolean z15 = z14;
                                                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, i28, 0L, str, z15 ? i18 : 0, z15, i16, i20, 0L);
                                                        photoEntry.setOrientation(i19, iIntValue2);
                                                        a aVar2 = aVar;
                                                        if (aVar2 == null || !p3.D3(aVar2.f47028b)) {
                                                            p3Var2.f2(photoEntry);
                                                        } else {
                                                            p3Var2.T1(aVar2, photoEntry);
                                                        }
                                                    }
                                                });
                                                return;
                                            }
                                        } else {
                                            i17 = 0;
                                        }
                                        if (strExtractMetadata3 != null) {
                                            try {
                                                iCeil = (int) Math.ceil(Long.parseLong(strExtractMetadata3) / 1000.0d);
                                            } catch (Exception e17) {
                                                e = e17;
                                                i15 = i17;
                                                mediaMetadataRetriever = mediaMetadataRetriever2;
                                                FileLog.e(e);
                                                if (mediaMetadataRetriever != null) {
                                                    mediaMetadataRetriever.release();
                                                }
                                                i17 = i15;
                                                i18 = 0;
                                            }
                                        } else {
                                            iCeil = 0;
                                        }
                                        try {
                                            mediaMetadataRetriever2.release();
                                            break;
                                        } catch (Exception unused8) {
                                        }
                                        i18 = iCeil;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        mediaMetadataRetriever = mediaMetadataRetriever2;
                                        if (mediaMetadataRetriever != null) {
                                            try {
                                                mediaMetadataRetriever.release();
                                                break;
                                            } catch (Exception unused9) {
                                            }
                                        }
                                        throw th;
                                    }
                                } catch (Exception e18) {
                                    e = e18;
                                    mediaMetadataRetriever = mediaMetadataRetriever2;
                                    i15 = 0;
                                    i16 = 0;
                                    FileLog.e(e);
                                    if (mediaMetadataRetriever != null) {
                                        mediaMetadataRetriever.release();
                                        break;
                                    }
                                    i17 = i15;
                                    i18 = 0;
                                    if (!z14) {
                                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                                        options2.inJustDecodeBounds = true;
                                        BitmapFactory.decodeFile(str, options2);
                                        i16 = options2.outWidth;
                                        i17 = options2.outHeight;
                                        Pair<Integer, Integer> imageOrientation2 = AndroidUtilities.getImageOrientation(str);
                                        iIntValue = ((Integer) imageOrientation2.first).intValue();
                                        iIntValue2 = ((Integer) imageOrientation2.second).intValue();
                                        i19 = iIntValue;
                                        i20 = i17;
                                    } else {
                                        i20 = i17;
                                        i16 = i16;
                                        i19 = 0;
                                        iIntValue2 = 0;
                                    }
                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                        @Override
                                        public final void run() {
                                            p3 p3Var2 = p3Var;
                                            p3Var2.getClass();
                                            boolean z15 = z14;
                                            MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, i28, 0L, str, z15 ? i18 : 0, z15, i16, i20, 0L);
                                            photoEntry.setOrientation(i19, iIntValue2);
                                            a aVar2 = aVar;
                                            if (aVar2 == null || !p3.D3(aVar2.f47028b)) {
                                                p3Var2.f2(photoEntry);
                                            } else {
                                                p3Var2.T1(aVar2, photoEntry);
                                            }
                                        }
                                    });
                                    return;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                            }
                        } catch (Exception e19) {
                            e = e19;
                        }
                        break;
                    } else {
                        i17 = 0;
                        i18 = 0;
                        i16 = 0;
                    }
                    if (!z14) {
                        BitmapFactory.Options options3 = new BitmapFactory.Options();
                        options3.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(str, options3);
                        i16 = options3.outWidth;
                        i17 = options3.outHeight;
                        Pair<Integer, Integer> imageOrientation3 = AndroidUtilities.getImageOrientation(str);
                        iIntValue = ((Integer) imageOrientation3.first).intValue();
                        iIntValue2 = ((Integer) imageOrientation3.second).intValue();
                        i19 = iIntValue;
                        i20 = i17;
                    } else {
                        i20 = i17;
                        i16 = i16;
                        i19 = 0;
                        iIntValue2 = 0;
                    }
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            p3 p3Var2 = p3Var;
                            p3Var2.getClass();
                            boolean z15 = z14;
                            MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, i28, 0L, str, z15 ? i18 : 0, z15, i16, i20, 0L);
                            photoEntry.setOrientation(i19, iIntValue2);
                            a aVar2 = aVar;
                            if (aVar2 == null || !p3.D3(aVar2.f47028b)) {
                                p3Var2.f2(photoEntry);
                            } else {
                                p3Var2.T1(aVar2, photoEntry);
                            }
                        }
                    });
                    return;
                }
                return;
        }
    }

    public r1(ContactsController contactsController, int i10, ArrayList arrayList, ArrayList arrayList2, a0.h hVar, boolean z10) {
        this.f21397e = contactsController;
        this.f21395b = i10;
        this.f21396c = arrayList;
        this.f21398f = arrayList2;
        this.h = hVar;
        this.d = z10;
    }

    public r1(SendMessagesHelper sendMessagesHelper, TLObject tLObject, int i10, SendMessagesHelper.DelayedMessage delayedMessage, ArrayList arrayList, boolean z10) {
        this.f21397e = sendMessagesHelper;
        this.f21398f = tLObject;
        this.f21395b = i10;
        this.h = delayedMessage;
        this.f21396c = arrayList;
        this.d = z10;
    }

    public r1(hv0 hv0Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10, MessageObject messageObject, org.telegram.ui.Cells.s1 s1Var, boolean z10) {
        this.f21397e = hv0Var;
        this.f21396c = tL_messages_stickerSet;
        this.f21395b = i10;
        this.f21398f = messageObject;
        this.h = s1Var;
        this.d = z10;
    }

    public r1(aq0 aq0Var, String str, int i10, TLObject tLObject, boolean z10, TLRPC.User user) {
        this.f21397e = aq0Var;
        this.f21396c = str;
        this.f21395b = i10;
        this.f21398f = tLObject;
        this.d = z10;
        this.h = user;
    }

    public r1(rh.p3 p3Var, Uri uri, boolean z10, String str, int i10, rh.a aVar) {
        this.f21397e = p3Var;
        this.f21396c = uri;
        this.d = z10;
        this.f21398f = str;
        this.f21395b = i10;
        this.h = aVar;
    }
}
