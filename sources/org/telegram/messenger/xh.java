package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xh implements RequestDelegate {
    public final int f19254a;
    public final ui f19255b;
    public final String f19256c;

    public xh(ui uiVar, String str, int i10) {
        this.f19254a = i10;
        this.f19255b = uiVar;
        this.f19256c = str;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19254a) {
            case 0:
                final ui uiVar = this.f19255b;
                final String str = this.f19256c;
                i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        char c10;
                        ArrayList arrayList;
                        ArrayList arrayList2;
                        switch (r4) {
                            case 0:
                                ui uiVar2 = uiVar;
                                String str2 = str;
                                TLObject tLObject2 = tLObject;
                                HashMap hashMap = uiVar2.K0;
                                ArrayList arrayList3 = (ArrayList) hashMap.get(str2);
                                if (arrayList3 != null) {
                                    for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                                        if (tLObject2 != null) {
                                            ((j20) arrayList3.get(i10)).a(Boolean.TRUE, (TLRPC.TL_messages_stickerSet) tLObject2);
                                        } else {
                                            ((j20) arrayList3.get(i10)).a(Boolean.FALSE, null);
                                        }
                                    }
                                }
                                hashMap.remove(str2);
                                return;
                            default:
                                ui uiVar3 = uiVar;
                                String str3 = str;
                                TLObject tLObject3 = tLObject;
                                ArrayList arrayList4 = (ArrayList) uiVar3.f18305a0.get(str3);
                                if (tLObject3 != null) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject3;
                                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                                    if (stickerSet != null) {
                                        uiVar3.I.k(tL_messages_stickerSet, stickerSet.f19820id);
                                        String str4 = tL_messages_stickerSet.set.short_name;
                                        if (str4 != null) {
                                            uiVar3.N.put(str4.toLowerCase(), tL_messages_stickerSet);
                                        }
                                    }
                                    int size = arrayList4.size();
                                    int i11 = 0;
                                    while (i11 < size) {
                                        TLRPC.Message message = (TLRPC.Message) arrayList4.get(i11);
                                        TLRPC.Document G0 = jj.G0(message);
                                        int size2 = tL_messages_stickerSet.documents.size();
                                        int i12 = 0;
                                        while (true) {
                                            if (i12 < size2) {
                                                TLRPC.Document document = tL_messages_stickerSet.documents.get(i12);
                                                arrayList2 = arrayList4;
                                                if (document.f19799id == G0.f19799id && document.dc_id == G0.dc_id) {
                                                    message.stickerVerified = 1;
                                                } else {
                                                    i12++;
                                                    arrayList4 = arrayList2;
                                                }
                                            } else {
                                                arrayList2 = arrayList4;
                                            }
                                        }
                                        if (message.stickerVerified == 0) {
                                            message.stickerVerified = 2;
                                        }
                                        i11++;
                                        arrayList4 = arrayList2;
                                    }
                                    c10 = 0;
                                    arrayList = arrayList4;
                                } else {
                                    c10 = 0;
                                    int size3 = arrayList4.size();
                                    int i13 = 0;
                                    while (true) {
                                        arrayList = arrayList4;
                                        if (i13 < size3) {
                                            ((TLRPC.Message) arrayList.get(i13)).stickerVerified = 2;
                                            i13++;
                                        }
                                    }
                                }
                                zs notificationCenter = uiVar3.getNotificationCenter();
                                Object[] objArr = new Object[1];
                                objArr[c10] = arrayList;
                                notificationCenter.k(105, objArr);
                                hs messagesStorage = uiVar3.getMessagesStorage();
                                messagesStorage.getClass();
                                Utilities.d.c(new xp(messagesStorage, arrayList, 15));
                                return;
                        }
                    }
                });
                return;
            default:
                final ui uiVar2 = this.f19255b;
                final String str2 = this.f19256c;
                i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        char c10;
                        ArrayList arrayList;
                        ArrayList arrayList2;
                        switch (r4) {
                            case 0:
                                ui uiVar22 = uiVar2;
                                String str22 = str2;
                                TLObject tLObject2 = tLObject;
                                HashMap hashMap = uiVar22.K0;
                                ArrayList arrayList3 = (ArrayList) hashMap.get(str22);
                                if (arrayList3 != null) {
                                    for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                                        if (tLObject2 != null) {
                                            ((j20) arrayList3.get(i10)).a(Boolean.TRUE, (TLRPC.TL_messages_stickerSet) tLObject2);
                                        } else {
                                            ((j20) arrayList3.get(i10)).a(Boolean.FALSE, null);
                                        }
                                    }
                                }
                                hashMap.remove(str22);
                                return;
                            default:
                                ui uiVar3 = uiVar2;
                                String str3 = str2;
                                TLObject tLObject3 = tLObject;
                                ArrayList arrayList4 = (ArrayList) uiVar3.f18305a0.get(str3);
                                if (tLObject3 != null) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject3;
                                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                                    if (stickerSet != null) {
                                        uiVar3.I.k(tL_messages_stickerSet, stickerSet.f19820id);
                                        String str4 = tL_messages_stickerSet.set.short_name;
                                        if (str4 != null) {
                                            uiVar3.N.put(str4.toLowerCase(), tL_messages_stickerSet);
                                        }
                                    }
                                    int size = arrayList4.size();
                                    int i11 = 0;
                                    while (i11 < size) {
                                        TLRPC.Message message = (TLRPC.Message) arrayList4.get(i11);
                                        TLRPC.Document G0 = jj.G0(message);
                                        int size2 = tL_messages_stickerSet.documents.size();
                                        int i12 = 0;
                                        while (true) {
                                            if (i12 < size2) {
                                                TLRPC.Document document = tL_messages_stickerSet.documents.get(i12);
                                                arrayList2 = arrayList4;
                                                if (document.f19799id == G0.f19799id && document.dc_id == G0.dc_id) {
                                                    message.stickerVerified = 1;
                                                } else {
                                                    i12++;
                                                    arrayList4 = arrayList2;
                                                }
                                            } else {
                                                arrayList2 = arrayList4;
                                            }
                                        }
                                        if (message.stickerVerified == 0) {
                                            message.stickerVerified = 2;
                                        }
                                        i11++;
                                        arrayList4 = arrayList2;
                                    }
                                    c10 = 0;
                                    arrayList = arrayList4;
                                } else {
                                    c10 = 0;
                                    int size3 = arrayList4.size();
                                    int i13 = 0;
                                    while (true) {
                                        arrayList = arrayList4;
                                        if (i13 < size3) {
                                            ((TLRPC.Message) arrayList.get(i13)).stickerVerified = 2;
                                            i13++;
                                        }
                                    }
                                }
                                zs notificationCenter = uiVar3.getNotificationCenter();
                                Object[] objArr = new Object[1];
                                objArr[c10] = arrayList;
                                notificationCenter.k(105, objArr);
                                hs messagesStorage = uiVar3.getMessagesStorage();
                                messagesStorage.getClass();
                                Utilities.d.c(new xp(messagesStorage, arrayList, 15));
                                return;
                        }
                    }
                });
                return;
        }
    }
}
