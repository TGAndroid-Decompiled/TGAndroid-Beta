package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bq6 implements RequestDelegate {
    public final byte a;
    public final ls6 b;
    public final String c;

    public bq6(ls6 ls6Var, String str, byte b) {
        this.a = b;
        this.b = ls6Var;
        this.c = str;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        final String str = this.c;
        final ls6 ls6Var = this.b;
        switch (b) {
            case 0:
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        char c;
                        ArrayList arrayList;
                        switch (r4) {
                            case 0:
                                ls6 ls6Var2 = ls6Var;
                                String str2 = str;
                                TLObject tLObject2 = tLObject;
                                ArrayList arrayList2 = (ArrayList) ls6Var2.b0.get(str2);
                                if (tLObject2 != null) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                                    if (stickerSet != null) {
                                        ls6Var2.J.k(stickerSet.id, tL_messages_stickerSet);
                                        String str3 = tL_messages_stickerSet.set.short_name;
                                        if (str3 != null) {
                                            ls6Var2.O.put(str3.toLowerCase(), tL_messages_stickerSet);
                                        }
                                    }
                                    int size = arrayList2.size();
                                    int i = 0;
                                    while (i < size) {
                                        TLRPC.Message message = (TLRPC.Message) arrayList2.get(i);
                                        TLRPC.Document G0 = r47.G0(message);
                                        int size2 = tL_messages_stickerSet.documents.size();
                                        int i2 = 0;
                                        while (true) {
                                            if (i2 < size2) {
                                                TLRPC.Document document = tL_messages_stickerSet.documents.get(i2);
                                                arrayList = arrayList2;
                                                if (document.id == G0.id && document.dc_id == G0.dc_id) {
                                                    message.stickerVerified = 1;
                                                } else {
                                                    i2++;
                                                    arrayList2 = arrayList;
                                                }
                                            } else {
                                                arrayList = arrayList2;
                                            }
                                        }
                                        if (message.stickerVerified == 0) {
                                            message.stickerVerified = 2;
                                        }
                                        i++;
                                        arrayList2 = arrayList;
                                    }
                                    c = 0;
                                } else {
                                    c = 0;
                                    int size3 = arrayList2.size();
                                    int i3 = 0;
                                    while (true) {
                                        arrayList2 = arrayList2;
                                        if (i3 < size3) {
                                            ((TLRPC.Message) arrayList2.get(i3)).stickerVerified = 2;
                                            i3++;
                                        }
                                    }
                                }
                                jn7 notificationCenter = ls6Var2.getNotificationCenter();
                                Object[] objArr = new Object[1];
                                objArr[c] = arrayList2;
                                notificationCenter.k(106, objArr);
                                jf7 messagesStorage = ls6Var2.getMessagesStorage();
                                messagesStorage.getClass();
                                Utilities.d.c(new q41(messagesStorage, arrayList2, (byte) 17));
                                return;
                            default:
                                ls6 ls6Var3 = ls6Var;
                                String str4 = str;
                                TLObject tLObject3 = tLObject;
                                HashMap hashMap = ls6Var3.L0;
                                ArrayList arrayList3 = (ArrayList) hashMap.get(str4);
                                if (arrayList3 != null) {
                                    for (int i4 = 0; i4 < arrayList3.size(); i4++) {
                                        if (tLObject3 != null) {
                                            ((icc) arrayList3.get(i4)).a(Boolean.TRUE, (TLRPC.TL_messages_stickerSet) tLObject3);
                                        } else {
                                            ((icc) arrayList3.get(i4)).a(Boolean.FALSE, null);
                                        }
                                    }
                                }
                                hashMap.remove(str4);
                                return;
                        }
                    }
                });
                return;
            default:
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        char c;
                        ArrayList arrayList;
                        switch (r4) {
                            case 0:
                                ls6 ls6Var2 = ls6Var;
                                String str2 = str;
                                TLObject tLObject2 = tLObject;
                                ArrayList arrayList2 = (ArrayList) ls6Var2.b0.get(str2);
                                if (tLObject2 != null) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                                    if (stickerSet != null) {
                                        ls6Var2.J.k(stickerSet.id, tL_messages_stickerSet);
                                        String str3 = tL_messages_stickerSet.set.short_name;
                                        if (str3 != null) {
                                            ls6Var2.O.put(str3.toLowerCase(), tL_messages_stickerSet);
                                        }
                                    }
                                    int size = arrayList2.size();
                                    int i = 0;
                                    while (i < size) {
                                        TLRPC.Message message = (TLRPC.Message) arrayList2.get(i);
                                        TLRPC.Document G0 = r47.G0(message);
                                        int size2 = tL_messages_stickerSet.documents.size();
                                        int i2 = 0;
                                        while (true) {
                                            if (i2 < size2) {
                                                TLRPC.Document document = tL_messages_stickerSet.documents.get(i2);
                                                arrayList = arrayList2;
                                                if (document.id == G0.id && document.dc_id == G0.dc_id) {
                                                    message.stickerVerified = 1;
                                                } else {
                                                    i2++;
                                                    arrayList2 = arrayList;
                                                }
                                            } else {
                                                arrayList = arrayList2;
                                            }
                                        }
                                        if (message.stickerVerified == 0) {
                                            message.stickerVerified = 2;
                                        }
                                        i++;
                                        arrayList2 = arrayList;
                                    }
                                    c = 0;
                                } else {
                                    c = 0;
                                    int size3 = arrayList2.size();
                                    int i3 = 0;
                                    while (true) {
                                        arrayList2 = arrayList2;
                                        if (i3 < size3) {
                                            ((TLRPC.Message) arrayList2.get(i3)).stickerVerified = 2;
                                            i3++;
                                        }
                                    }
                                }
                                jn7 notificationCenter = ls6Var2.getNotificationCenter();
                                Object[] objArr = new Object[1];
                                objArr[c] = arrayList2;
                                notificationCenter.k(106, objArr);
                                jf7 messagesStorage = ls6Var2.getMessagesStorage();
                                messagesStorage.getClass();
                                Utilities.d.c(new q41(messagesStorage, arrayList2, (byte) 17));
                                return;
                            default:
                                ls6 ls6Var3 = ls6Var;
                                String str4 = str;
                                TLObject tLObject3 = tLObject;
                                HashMap hashMap = ls6Var3.L0;
                                ArrayList arrayList3 = (ArrayList) hashMap.get(str4);
                                if (arrayList3 != null) {
                                    for (int i4 = 0; i4 < arrayList3.size(); i4++) {
                                        if (tLObject3 != null) {
                                            ((icc) arrayList3.get(i4)).a(Boolean.TRUE, (TLRPC.TL_messages_stickerSet) tLObject3);
                                        } else {
                                            ((icc) arrayList3.get(i4)).a(Boolean.FALSE, null);
                                        }
                                    }
                                }
                                hashMap.remove(str4);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
