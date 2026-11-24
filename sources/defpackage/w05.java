package defpackage;

import j$.util.DesugarCollections;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
public final class w05 {
    public final String a;
    public final long b;
    public final byte[] c;
    public final byte[] d;
    public final int e;
    public w05 f;
    public List g;
    public TL_wallet.WalletOnchainGiftAction h;
    public TL_stars.StarGift i;

    public w05(String str, long j, byte[] bArr, byte[] bArr2, int i) {
        this.a = str;
        this.b = j;
        this.c = bArr;
        this.d = bArr2;
        this.e = i;
    }

    public static w05 a(ArrayList arrayList) {
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
                w05 b = b((TL_stars.TL_payments_starGiftOnchainOfferTxMessage) obj);
                arrayList2.add(b);
                j += b.b;
            }
            w05 w05Var = (w05) arrayList2.get(0);
            w05 w05Var2 = new w05(w05Var.a, j, w05Var.c, w05Var.d, w05Var.e);
            w05Var2.g = DesugarCollections.unmodifiableList(arrayList2);
            return w05Var2;
        }
        w26.j("Invalid prepared message count");
        return null;
    }

    public static w05 b(TL_stars.TL_payments_starGiftOnchainOfferTxMessage tL_payments_starGiftOnchainOfferTxMessage) {
        byte[] bArr;
        dd ddVar;
        int i;
        int i2;
        int[] iArr;
        TL_stars.TL_payments_starGiftOnchainOfferTxInitState tL_payments_starGiftOnchainOfferTxInitState = tL_payments_starGiftOnchainOfferTxMessage.init_state;
        dd ddVar2 = null;
        if (tL_payments_starGiftOnchainOfferTxInitState != null) {
            byte[] bArr2 = tL_payments_starGiftOnchainOfferTxInitState.code;
            byte[] bArr3 = tL_payments_starGiftOnchainOfferTxInitState.data;
            if (bArr2 != null && bArr2.length > 0) {
                ddVar = rve.b(bArr2);
            } else {
                ddVar = null;
            }
            if (bArr3 != null && bArr3.length > 0) {
                ddVar2 = rve.b(bArr3);
            }
            ArrayList arrayList = new ArrayList();
            ?? obj = new Object();
            arrayList.add(obj);
            ArrayList arrayList2 = new ArrayList();
            if (ddVar != null) {
                arrayList2.add(Integer.valueOf(rve.a(arrayList, ddVar)));
            }
            if (ddVar2 != null) {
                arrayList2.add(Integer.valueOf(rve.a(arrayList, ddVar2)));
            }
            if (ddVar != null) {
                i = 4;
            } else {
                i = 0;
            }
            if (ddVar2 != null) {
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
                ssb ssbVar = (ssb) obj2;
                i5 += (ssbVar.d.length * i4) + ssbVar.c.length + 2;
            }
            int i7 = 1;
            while (i7 < 4 && (i5 >>> (i7 << 3)) != 0) {
                i7++;
            }
            int max = Math.max(1, i7);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            rve.d(byteArrayOutputStream, -1242653582, 4);
            byteArrayOutputStream.write(i4 | 64);
            byteArrayOutputStream.write(max);
            rve.d(byteArrayOutputStream, arrayList.size(), i4);
            rve.d(byteArrayOutputStream, 1, i4);
            rve.d(byteArrayOutputStream, 0, i4);
            rve.d(byteArrayOutputStream, i5, max);
            rve.d(byteArrayOutputStream, 0, i4);
            int size3 = arrayList.size();
            int i8 = 0;
            while (i8 < size3) {
                Object obj3 = arrayList.get(i8);
                i8++;
                ssb ssbVar2 = (ssb) obj3;
                byteArrayOutputStream.write(ssbVar2.a);
                byteArrayOutputStream.write(ssbVar2.b);
                byte[] bArr4 = ssbVar2.c;
                byteArrayOutputStream.write(bArr4, 0, bArr4.length);
                for (int i9 : ssbVar2.d) {
                    rve.d(byteArrayOutputStream, i9, i4);
                }
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (rve.a == null) {
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
                rve.a = iArr2;
            }
            int i14 = -1;
            for (byte b : byteArray) {
                i14 = (i14 >>> 8) ^ rve.a[(b ^ i14) & 255];
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
        return new w05(tL_payments_starGiftOnchainOfferTxMessage.destination, tL_payments_starGiftOnchainOfferTxMessage.value, tL_payments_starGiftOnchainOfferTxMessage.body, bArr, tL_payments_starGiftOnchainOfferTxMessage.mode);
    }
}
