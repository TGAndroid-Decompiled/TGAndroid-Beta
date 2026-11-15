package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wh implements RequestDelegate {
    public final int f27350a;
    public final si f27351b;
    public final String f27352c;

    public wh(si siVar, String str, int i7) {
        this.f27350a = i7;
        this.f27351b = siVar;
        this.f27352c = str;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f27350a) {
            case 0:
                final si siVar = this.f27351b;
                final String str = this.f27352c;
                g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        char c10;
                        ArrayList arrayList;
                        ArrayList arrayList2;
                        switch (r4) {
                            case 0:
                                si siVar2 = siVar;
                                String str2 = str;
                                TLObject tLObject2 = tLObject;
                                HashMap hashMap = siVar2.L0;
                                ArrayList arrayList3 = (ArrayList) hashMap.get(str2);
                                if (arrayList3 != null) {
                                    for (int i7 = 0; i7 < arrayList3.size(); i7++) {
                                        if (tLObject2 != null) {
                                            ((s10) arrayList3.get(i7)).a(Boolean.TRUE, (TLRPC.TL_messages_stickerSet) tLObject2);
                                        } else {
                                            ((s10) arrayList3.get(i7)).a(Boolean.FALSE, null);
                                        }
                                    }
                                }
                                hashMap.remove(str2);
                                return;
                            default:
                                si siVar3 = siVar;
                                String str3 = str;
                                TLObject tLObject3 = tLObject;
                                ArrayList arrayList4 = (ArrayList) siVar3.f26462b0.get(str3);
                                if (tLObject3 != null) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject3;
                                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                                    if (stickerSet != null) {
                                        siVar3.J.k(tL_messages_stickerSet, stickerSet.f28078id);
                                        String str4 = tL_messages_stickerSet.set.short_name;
                                        if (str4 != null) {
                                            siVar3.O.put(str4.toLowerCase(), tL_messages_stickerSet);
                                        }
                                    }
                                    int size = arrayList4.size();
                                    int i10 = 0;
                                    while (i10 < size) {
                                        TLRPC.Message message = (TLRPC.Message) arrayList4.get(i10);
                                        TLRPC.Document G0 = gj.G0(message);
                                        int size2 = tL_messages_stickerSet.documents.size();
                                        int i11 = 0;
                                        while (true) {
                                            if (i11 < size2) {
                                                TLRPC.Document document = tL_messages_stickerSet.documents.get(i11);
                                                arrayList2 = arrayList4;
                                                if (document.f28057id == G0.f28057id && document.dc_id == G0.dc_id) {
                                                    message.stickerVerified = 1;
                                                } else {
                                                    i11++;
                                                    arrayList4 = arrayList2;
                                                }
                                            } else {
                                                arrayList2 = arrayList4;
                                            }
                                        }
                                        if (message.stickerVerified == 0) {
                                            message.stickerVerified = 2;
                                        }
                                        i10++;
                                        arrayList4 = arrayList2;
                                    }
                                    c10 = 0;
                                    arrayList = arrayList4;
                                } else {
                                    c10 = 0;
                                    int size3 = arrayList4.size();
                                    int i12 = 0;
                                    while (true) {
                                        arrayList = arrayList4;
                                        if (i12 < size3) {
                                            ((TLRPC.Message) arrayList.get(i12)).stickerVerified = 2;
                                            i12++;
                                        }
                                    }
                                }
                                ns notificationCenter = siVar3.getNotificationCenter();
                                Object[] objArr = new Object[1];
                                objArr[c10] = arrayList;
                                notificationCenter.k(105, objArr);
                                vr messagesStorage = siVar3.getMessagesStorage();
                                messagesStorage.getClass();
                                Utilities.d.c(new pp(messagesStorage, arrayList, 15));
                                return;
                        }
                    }
                });
                return;
            default:
                final si siVar2 = this.f27351b;
                final String str2 = this.f27352c;
                g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        char c10;
                        ArrayList arrayList;
                        ArrayList arrayList2;
                        switch (r4) {
                            case 0:
                                si siVar22 = siVar2;
                                String str22 = str2;
                                TLObject tLObject2 = tLObject;
                                HashMap hashMap = siVar22.L0;
                                ArrayList arrayList3 = (ArrayList) hashMap.get(str22);
                                if (arrayList3 != null) {
                                    for (int i7 = 0; i7 < arrayList3.size(); i7++) {
                                        if (tLObject2 != null) {
                                            ((s10) arrayList3.get(i7)).a(Boolean.TRUE, (TLRPC.TL_messages_stickerSet) tLObject2);
                                        } else {
                                            ((s10) arrayList3.get(i7)).a(Boolean.FALSE, null);
                                        }
                                    }
                                }
                                hashMap.remove(str22);
                                return;
                            default:
                                si siVar3 = siVar2;
                                String str3 = str2;
                                TLObject tLObject3 = tLObject;
                                ArrayList arrayList4 = (ArrayList) siVar3.f26462b0.get(str3);
                                if (tLObject3 != null) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject3;
                                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                                    if (stickerSet != null) {
                                        siVar3.J.k(tL_messages_stickerSet, stickerSet.f28078id);
                                        String str4 = tL_messages_stickerSet.set.short_name;
                                        if (str4 != null) {
                                            siVar3.O.put(str4.toLowerCase(), tL_messages_stickerSet);
                                        }
                                    }
                                    int size = arrayList4.size();
                                    int i10 = 0;
                                    while (i10 < size) {
                                        TLRPC.Message message = (TLRPC.Message) arrayList4.get(i10);
                                        TLRPC.Document G0 = gj.G0(message);
                                        int size2 = tL_messages_stickerSet.documents.size();
                                        int i11 = 0;
                                        while (true) {
                                            if (i11 < size2) {
                                                TLRPC.Document document = tL_messages_stickerSet.documents.get(i11);
                                                arrayList2 = arrayList4;
                                                if (document.f28057id == G0.f28057id && document.dc_id == G0.dc_id) {
                                                    message.stickerVerified = 1;
                                                } else {
                                                    i11++;
                                                    arrayList4 = arrayList2;
                                                }
                                            } else {
                                                arrayList2 = arrayList4;
                                            }
                                        }
                                        if (message.stickerVerified == 0) {
                                            message.stickerVerified = 2;
                                        }
                                        i10++;
                                        arrayList4 = arrayList2;
                                    }
                                    c10 = 0;
                                    arrayList = arrayList4;
                                } else {
                                    c10 = 0;
                                    int size3 = arrayList4.size();
                                    int i12 = 0;
                                    while (true) {
                                        arrayList = arrayList4;
                                        if (i12 < size3) {
                                            ((TLRPC.Message) arrayList.get(i12)).stickerVerified = 2;
                                            i12++;
                                        }
                                    }
                                }
                                ns notificationCenter = siVar3.getNotificationCenter();
                                Object[] objArr = new Object[1];
                                objArr[c10] = arrayList;
                                notificationCenter.k(105, objArr);
                                vr messagesStorage = siVar3.getMessagesStorage();
                                messagesStorage.getClass();
                                Utilities.d.c(new pp(messagesStorage, arrayList, 15));
                                return;
                        }
                    }
                });
                return;
        }
    }
}
