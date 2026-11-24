package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kp6 implements RequestDelegate {
    public final byte a;
    public final hq6 b;
    public final String c;

    public kp6(hq6 hq6Var, String str, byte b) {
        this.a = b;
        this.b = hq6Var;
        this.c = str;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        final String str = this.c;
        final hq6 hq6Var = this.b;
        switch (b) {
            case 0:
                gl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        char c;
                        ArrayList arrayList;
                        switch (r4) {
                            case 0:
                                hq6 hq6Var2 = hq6Var;
                                String str2 = str;
                                TLObject tLObject2 = tLObject;
                                HashMap hashMap = hq6Var2.L0;
                                ArrayList arrayList2 = (ArrayList) hashMap.get(str2);
                                if (arrayList2 != null) {
                                    for (int i = 0; i < arrayList2.size(); i++) {
                                        if (tLObject2 != null) {
                                            ((i8c) arrayList2.get(i)).a(Boolean.TRUE, (TLRPC.TL_messages_stickerSet) tLObject2);
                                        } else {
                                            ((i8c) arrayList2.get(i)).a(Boolean.FALSE, null);
                                        }
                                    }
                                }
                                hashMap.remove(str2);
                                return;
                            default:
                                hq6 hq6Var3 = hq6Var;
                                String str3 = str;
                                TLObject tLObject3 = tLObject;
                                ArrayList arrayList3 = (ArrayList) hq6Var3.b0.get(str3);
                                if (tLObject3 != null) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject3;
                                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                                    if (stickerSet != null) {
                                        hq6Var3.J.k(tL_messages_stickerSet, stickerSet.id);
                                        String str4 = tL_messages_stickerSet.set.short_name;
                                        if (str4 != null) {
                                            hq6Var3.O.put(str4.toLowerCase(), tL_messages_stickerSet);
                                        }
                                    }
                                    int size = arrayList3.size();
                                    int i2 = 0;
                                    while (i2 < size) {
                                        TLRPC.Message message = (TLRPC.Message) arrayList3.get(i2);
                                        TLRPC.Document G0 = k27.G0(message);
                                        int size2 = tL_messages_stickerSet.documents.size();
                                        int i3 = 0;
                                        while (true) {
                                            if (i3 < size2) {
                                                TLRPC.Document document = tL_messages_stickerSet.documents.get(i3);
                                                arrayList = arrayList3;
                                                if (document.id == G0.id && document.dc_id == G0.dc_id) {
                                                    message.stickerVerified = 1;
                                                } else {
                                                    i3++;
                                                    arrayList3 = arrayList;
                                                }
                                            } else {
                                                arrayList = arrayList3;
                                            }
                                        }
                                        if (message.stickerVerified == 0) {
                                            message.stickerVerified = 2;
                                        }
                                        i2++;
                                        arrayList3 = arrayList;
                                    }
                                    c = 0;
                                } else {
                                    c = 0;
                                    int size3 = arrayList3.size();
                                    int i4 = 0;
                                    while (true) {
                                        arrayList3 = arrayList3;
                                        if (i4 < size3) {
                                            ((TLRPC.Message) arrayList3.get(i4)).stickerVerified = 2;
                                            i4++;
                                        }
                                    }
                                }
                                kk7 notificationCenter = hq6Var3.getNotificationCenter();
                                Object[] objArr = new Object[1];
                                objArr[c] = arrayList3;
                                notificationCenter.k(105, objArr);
                                ad7 messagesStorage = hq6Var3.getMessagesStorage();
                                messagesStorage.getClass();
                                Utilities.d.c(new i41(messagesStorage, arrayList3, (byte) 20));
                                return;
                        }
                    }
                });
                return;
            default:
                gl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        char c;
                        ArrayList arrayList;
                        switch (r4) {
                            case 0:
                                hq6 hq6Var2 = hq6Var;
                                String str2 = str;
                                TLObject tLObject2 = tLObject;
                                HashMap hashMap = hq6Var2.L0;
                                ArrayList arrayList2 = (ArrayList) hashMap.get(str2);
                                if (arrayList2 != null) {
                                    for (int i = 0; i < arrayList2.size(); i++) {
                                        if (tLObject2 != null) {
                                            ((i8c) arrayList2.get(i)).a(Boolean.TRUE, (TLRPC.TL_messages_stickerSet) tLObject2);
                                        } else {
                                            ((i8c) arrayList2.get(i)).a(Boolean.FALSE, null);
                                        }
                                    }
                                }
                                hashMap.remove(str2);
                                return;
                            default:
                                hq6 hq6Var3 = hq6Var;
                                String str3 = str;
                                TLObject tLObject3 = tLObject;
                                ArrayList arrayList3 = (ArrayList) hq6Var3.b0.get(str3);
                                if (tLObject3 != null) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject3;
                                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                                    if (stickerSet != null) {
                                        hq6Var3.J.k(tL_messages_stickerSet, stickerSet.id);
                                        String str4 = tL_messages_stickerSet.set.short_name;
                                        if (str4 != null) {
                                            hq6Var3.O.put(str4.toLowerCase(), tL_messages_stickerSet);
                                        }
                                    }
                                    int size = arrayList3.size();
                                    int i2 = 0;
                                    while (i2 < size) {
                                        TLRPC.Message message = (TLRPC.Message) arrayList3.get(i2);
                                        TLRPC.Document G0 = k27.G0(message);
                                        int size2 = tL_messages_stickerSet.documents.size();
                                        int i3 = 0;
                                        while (true) {
                                            if (i3 < size2) {
                                                TLRPC.Document document = tL_messages_stickerSet.documents.get(i3);
                                                arrayList = arrayList3;
                                                if (document.id == G0.id && document.dc_id == G0.dc_id) {
                                                    message.stickerVerified = 1;
                                                } else {
                                                    i3++;
                                                    arrayList3 = arrayList;
                                                }
                                            } else {
                                                arrayList = arrayList3;
                                            }
                                        }
                                        if (message.stickerVerified == 0) {
                                            message.stickerVerified = 2;
                                        }
                                        i2++;
                                        arrayList3 = arrayList;
                                    }
                                    c = 0;
                                } else {
                                    c = 0;
                                    int size3 = arrayList3.size();
                                    int i4 = 0;
                                    while (true) {
                                        arrayList3 = arrayList3;
                                        if (i4 < size3) {
                                            ((TLRPC.Message) arrayList3.get(i4)).stickerVerified = 2;
                                            i4++;
                                        }
                                    }
                                }
                                kk7 notificationCenter = hq6Var3.getNotificationCenter();
                                Object[] objArr = new Object[1];
                                objArr[c] = arrayList3;
                                notificationCenter.k(105, objArr);
                                ad7 messagesStorage = hq6Var3.getMessagesStorage();
                                messagesStorage.getClass();
                                Utilities.d.c(new i41(messagesStorage, arrayList3, (byte) 20));
                                return;
                        }
                    }
                });
                return;
        }
    }
}
