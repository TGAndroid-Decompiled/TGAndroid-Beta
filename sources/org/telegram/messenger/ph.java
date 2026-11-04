package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ph implements RequestDelegate {
    public final int f24748a;
    public final li f24749b;
    public final String f24750c;

    public ph(li liVar, String str, int i3) {
        this.f24748a = i3;
        this.f24749b = liVar;
        this.f24750c = str;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f24748a) {
            case 0:
                final li liVar = this.f24749b;
                final String str = this.f24750c;
                g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        char c2;
                        ArrayList arrayList;
                        ArrayList arrayList2;
                        switch (r4) {
                            case 0:
                                li liVar2 = liVar;
                                String str2 = str;
                                TLObject tLObject2 = tLObject;
                                HashMap hashMap = liVar2.L0;
                                ArrayList arrayList3 = (ArrayList) hashMap.get(str2);
                                if (arrayList3 != null) {
                                    for (int i3 = 0; i3 < arrayList3.size(); i3++) {
                                        if (tLObject2 != null) {
                                            ((n10) arrayList3.get(i3)).a(Boolean.TRUE, (TLRPC.TL_messages_stickerSet) tLObject2);
                                        } else {
                                            ((n10) arrayList3.get(i3)).a(Boolean.FALSE, null);
                                        }
                                    }
                                }
                                hashMap.remove(str2);
                                return;
                            default:
                                li liVar3 = liVar;
                                String str3 = str;
                                TLObject tLObject3 = tLObject;
                                ArrayList arrayList4 = (ArrayList) liVar3.f24012b0.get(str3);
                                if (tLObject3 != null) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject3;
                                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                                    if (stickerSet != null) {
                                        liVar3.J.k(tL_messages_stickerSet, stickerSet.f27028id);
                                        String str4 = tL_messages_stickerSet.set.short_name;
                                        if (str4 != null) {
                                            liVar3.O.put(str4.toLowerCase(), tL_messages_stickerSet);
                                        }
                                    }
                                    int size = arrayList4.size();
                                    int i10 = 0;
                                    while (i10 < size) {
                                        TLRPC.Message message = (TLRPC.Message) arrayList4.get(i10);
                                        TLRPC.Document G0 = zi.G0(message);
                                        int size2 = tL_messages_stickerSet.documents.size();
                                        int i11 = 0;
                                        while (true) {
                                            if (i11 < size2) {
                                                TLRPC.Document document = tL_messages_stickerSet.documents.get(i11);
                                                arrayList2 = arrayList4;
                                                if (document.f27007id == G0.f27007id && document.dc_id == G0.dc_id) {
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
                                    c2 = 0;
                                    arrayList = arrayList4;
                                } else {
                                    c2 = 0;
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
                                hs notificationCenter = liVar3.getNotificationCenter();
                                Object[] objArr = new Object[1];
                                objArr[c2] = arrayList;
                                notificationCenter.k(105, objArr);
                                qr messagesStorage = liVar3.getMessagesStorage();
                                messagesStorage.getClass();
                                Utilities.d.c(new jp(messagesStorage, arrayList, 15));
                                return;
                        }
                    }
                });
                return;
            default:
                final li liVar2 = this.f24749b;
                final String str2 = this.f24750c;
                g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        char c2;
                        ArrayList arrayList;
                        ArrayList arrayList2;
                        switch (r4) {
                            case 0:
                                li liVar22 = liVar2;
                                String str22 = str2;
                                TLObject tLObject2 = tLObject;
                                HashMap hashMap = liVar22.L0;
                                ArrayList arrayList3 = (ArrayList) hashMap.get(str22);
                                if (arrayList3 != null) {
                                    for (int i3 = 0; i3 < arrayList3.size(); i3++) {
                                        if (tLObject2 != null) {
                                            ((n10) arrayList3.get(i3)).a(Boolean.TRUE, (TLRPC.TL_messages_stickerSet) tLObject2);
                                        } else {
                                            ((n10) arrayList3.get(i3)).a(Boolean.FALSE, null);
                                        }
                                    }
                                }
                                hashMap.remove(str22);
                                return;
                            default:
                                li liVar3 = liVar2;
                                String str3 = str2;
                                TLObject tLObject3 = tLObject;
                                ArrayList arrayList4 = (ArrayList) liVar3.f24012b0.get(str3);
                                if (tLObject3 != null) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject3;
                                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                                    if (stickerSet != null) {
                                        liVar3.J.k(tL_messages_stickerSet, stickerSet.f27028id);
                                        String str4 = tL_messages_stickerSet.set.short_name;
                                        if (str4 != null) {
                                            liVar3.O.put(str4.toLowerCase(), tL_messages_stickerSet);
                                        }
                                    }
                                    int size = arrayList4.size();
                                    int i10 = 0;
                                    while (i10 < size) {
                                        TLRPC.Message message = (TLRPC.Message) arrayList4.get(i10);
                                        TLRPC.Document G0 = zi.G0(message);
                                        int size2 = tL_messages_stickerSet.documents.size();
                                        int i11 = 0;
                                        while (true) {
                                            if (i11 < size2) {
                                                TLRPC.Document document = tL_messages_stickerSet.documents.get(i11);
                                                arrayList2 = arrayList4;
                                                if (document.f27007id == G0.f27007id && document.dc_id == G0.dc_id) {
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
                                    c2 = 0;
                                    arrayList = arrayList4;
                                } else {
                                    c2 = 0;
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
                                hs notificationCenter = liVar3.getNotificationCenter();
                                Object[] objArr = new Object[1];
                                objArr[c2] = arrayList;
                                notificationCenter.k(105, objArr);
                                qr messagesStorage = liVar3.getMessagesStorage();
                                messagesStorage.getClass();
                                Utilities.d.c(new jp(messagesStorage, arrayList, 15));
                                return;
                        }
                    }
                });
                return;
        }
    }
}
