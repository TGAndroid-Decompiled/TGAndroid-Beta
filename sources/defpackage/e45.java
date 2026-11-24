package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class e45 implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public e45(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    private final void a() {
        ArrayList arrayList = (ArrayList) this.c;
        ArrayList arrayList2 = (ArrayList) this.d;
        dw9 dw9Var = (dw9) this.e;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        String lowerCase = ((String) this.b).toLowerCase();
        for (int i = 0; i < arrayList.size(); i++) {
            if (((TLRPC.TL_messages_stickerSet) arrayList.get(i)).keywords != null) {
                ArrayList<TLRPC.TL_stickerKeyword> arrayList5 = ((TLRPC.TL_messages_stickerSet) arrayList.get(i)).keywords;
                for (int i2 = 0; i2 < arrayList5.size(); i2++) {
                    for (int i3 = 0; i3 < arrayList5.get(i2).keyword.size(); i3++) {
                        String str = arrayList5.get(i2).keyword.get(i3);
                        if (lowerCase.equals(str)) {
                            arrayList3.add(Long.valueOf(arrayList5.get(i2).document_id));
                        } else if (lowerCase.contains(str) || str.contains(lowerCase)) {
                            arrayList4.add(Long.valueOf(arrayList5.get(i2).document_id));
                        }
                    }
                }
            }
        }
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            if ((arrayList2.get(i4) instanceof TLRPC.TL_stickerSetFullCovered) && ((TLRPC.TL_stickerSetFullCovered) arrayList2.get(i4)).keywords != null) {
                ArrayList<TLRPC.TL_stickerKeyword> arrayList6 = ((TLRPC.TL_stickerSetFullCovered) arrayList2.get(i4)).keywords;
                for (int i5 = 0; i5 < arrayList6.size(); i5++) {
                    for (int i6 = 0; i6 < arrayList6.get(i5).keyword.size(); i6++) {
                        String str2 = arrayList6.get(i5).keyword.get(i6);
                        if (lowerCase.equals(str2)) {
                            arrayList3.add(Long.valueOf(arrayList6.get(i5).document_id));
                        } else if (lowerCase.contains(str2) || str2.contains(lowerCase)) {
                            arrayList4.add(Long.valueOf(arrayList6.get(i5).document_id));
                        }
                    }
                }
            }
        }
        arrayList3.addAll(arrayList4);
        dw9Var.a(arrayList3);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e45.run():void");
    }
}
