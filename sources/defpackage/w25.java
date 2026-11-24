package defpackage;

import j$.util.DesugarCollections;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
public final class w25 {
    public final String a;
    public final long b;
    public final byte[] c;
    public final byte[] d;
    public final int e;
    public w25 f;
    public List g;
    public TL_wallet.WalletOnchainGiftAction h;
    public TL_stars.StarGift i;

    public w25(String str, long j, byte[] bArr, byte[] bArr2, int i) {
        this.a = str;
        this.b = j;
        this.c = bArr;
        this.d = bArr2;
        this.e = i;
    }

    public static w25 a(ArrayList arrayList) {
        if (arrayList != null && !arrayList.isEmpty() && arrayList.size() <= 255) {
            if (arrayList.size() == 1) {
                return b((TL_stars.TL_payments_starGiftOnchainOfferTxMessage) arrayList.get(0));
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            long j = 0;
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                w25 b = b((TL_stars.TL_payments_starGiftOnchainOfferTxMessage) obj);
                arrayList2.add(b);
                j += b.b;
            }
            w25 w25Var = (w25) arrayList2.get(0);
            w25 w25Var2 = new w25(w25Var.a, j, w25Var.c, w25Var.d, w25Var.e);
            w25Var2.g = DesugarCollections.unmodifiableList(arrayList2);
            return w25Var2;
        }
        u36.j("Invalid prepared message count");
        return null;
    }

    public static w25 b(TL_stars.TL_payments_starGiftOnchainOfferTxMessage tL_payments_starGiftOnchainOfferTxMessage) {
        byte[] bArr;
        de deVar;
        int i;
        int i2;
        int[] iArr;
        TL_stars.TL_payments_starGiftOnchainOfferTxInitState tL_payments_starGiftOnchainOfferTxInitState = tL_payments_starGiftOnchainOfferTxMessage.init_state;
        de deVar2 = null;
        if (tL_payments_starGiftOnchainOfferTxInitState != null) {
            byte[] bArr2 = tL_payments_starGiftOnchainOfferTxInitState.code;
            byte[] bArr3 = tL_payments_starGiftOnchainOfferTxInitState.data;
            if (bArr2 != null && bArr2.length > 0) {
                deVar = txe.b(bArr2);
            } else {
                deVar = null;
            }
            if (bArr3 != null && bArr3.length > 0) {
                deVar2 = txe.b(bArr3);
            }
            ArrayList arrayList = new ArrayList();
            ?? obj = new Object();
            arrayList.add(obj);
            ArrayList arrayList2 = new ArrayList();
            if (deVar != null) {
                arrayList2.add(Integer.valueOf(txe.a(arrayList, deVar)));
            }
            if (deVar2 != null) {
                arrayList2.add(Integer.valueOf(txe.a(arrayList, deVar2)));
            }
            if (deVar != null) {
                i = 4;
            } else {
                i = 0;
            }
            if (deVar2 != null) {
                i2 = 2;
            } else {
                i2 = 0;
            }
            obj.c = new byte[]{(byte) (((i | i2) << 3) | 4)};
            obj.d = new int[arrayList2.size()];
            int i3 = 0;
            while (true) {
                iArr = obj.d;
                if (i3 >= iArr.length) {
                    break;
                }
                iArr[i3] = ((Integer) arrayList2.get(i3)).intValue();
                i3++;
            }
            obj.a = iArr.length;
            obj.b = 1;
            int size = arrayList.size();
            int i4 = 1;
            while (i4 < 4 && (size >>> (i4 << 3)) != 0) {
                i4++;
            }
            int size2 = arrayList.size();
            int i5 = 0;
            int i6 = 0;
            while (i6 < size2) {
                Object obj2 = arrayList.get(i6);
                i6++;
                tub tubVar = (tub) obj2;
                i5 += (tubVar.d.length * i4) + tubVar.c.length + 2;
            }
            int i7 = 1;
            while (i7 < 4 && (i5 >>> (i7 << 3)) != 0) {
                i7++;
            }
            int max = Math.max(1, i7);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            txe.d(byteArrayOutputStream, -1242653582, 4);
            byteArrayOutputStream.write(i4 | 64);
            byteArrayOutputStream.write(max);
            txe.d(byteArrayOutputStream, arrayList.size(), i4);
            txe.d(byteArrayOutputStream, 1, i4);
            txe.d(byteArrayOutputStream, 0, i4);
            txe.d(byteArrayOutputStream, i5, max);
            txe.d(byteArrayOutputStream, 0, i4);
            int size3 = arrayList.size();
            int i8 = 0;
            while (i8 < size3) {
                Object obj3 = arrayList.get(i8);
                i8++;
                tub tubVar2 = (tub) obj3;
                byteArrayOutputStream.write(tubVar2.a);
                byteArrayOutputStream.write(tubVar2.b);
                byte[] bArr4 = tubVar2.c;
                byteArrayOutputStream.write(bArr4, 0, bArr4.length);
                for (int i9 : tubVar2.d) {
                    txe.d(byteArrayOutputStream, i9, i4);
                }
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (txe.a == null) {
                int[] iArr2 = new int[256];
                for (int i10 = 0; i10 < 256; i10++) {
                    int i11 = i10;
                    for (int i12 = 0; i12 < 8; i12++) {
                        int i13 = i11 & 1;
                        i11 >>>= 1;
                        if (i13 != 0) {
                            i11 ^= -2097792136;
                        }
                    }
                    iArr2[i10] = i11;
                }
                txe.a = iArr2;
            }
            int i14 = -1;
            for (byte b : byteArray) {
                i14 = (i14 >>> 8) ^ txe.a[(b ^ i14) & 255];
            }
            int i15 = ~i14;
            byte[] bArr5 = new byte[byteArray.length + 4];
            System.arraycopy(byteArray, 0, bArr5, 0, byteArray.length);
            bArr5[byteArray.length] = (byte) i15;
            bArr5[byteArray.length + 1] = (byte) (i15 >>> 8);
            bArr5[byteArray.length + 2] = (byte) (i15 >>> 16);
            bArr5[byteArray.length + 3] = (byte) (i15 >>> 24);
            bArr = bArr5;
        } else {
            bArr = null;
        }
        return new w25(tL_payments_starGiftOnchainOfferTxMessage.destination, tL_payments_starGiftOnchainOfferTxMessage.value, tL_payments_starGiftOnchainOfferTxMessage.body, bArr, tL_payments_starGiftOnchainOfferTxMessage.mode);
    }
}
