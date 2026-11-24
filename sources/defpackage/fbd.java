package defpackage;

import java.util.Arrays;
public enum fbd {
    RESPONSE_CODE_UNSPECIFIED(-999),
    SERVICE_TIMEOUT(-3),
    FEATURE_NOT_SUPPORTED(-2),
    SERVICE_DISCONNECTED(-1),
    OK(0),
    USER_CANCELED(1),
    SERVICE_UNAVAILABLE(2),
    BILLING_UNAVAILABLE(3),
    ITEM_UNAVAILABLE(4),
    DEVELOPER_ERROR(5),
    ERROR(6),
    ITEM_ALREADY_OWNED(7),
    ITEM_NOT_OWNED(8),
    EXPIRED_OFFER_TOKEN(11),
    NETWORK_ERROR(12);
    
    public static final qid c;
    public final int a;

    static {
        fbd[] values;
        kp kpVar = new kp((byte) 19, false);
        kpVar.c = new Object[8];
        kpVar.b = 0;
        for (fbd fbdVar : values()) {
            Integer valueOf = Integer.valueOf(fbdVar.a);
            Object[] objArr = (Object[]) kpVar.c;
            int length = objArr.length;
            int i = (kpVar.b + 1) << 1;
            if (i > length) {
                if (i > length) {
                    length = length + (length >> 1) + 1;
                    length = length < i ? Integer.highestOneBit(i - 1) << 1 : length;
                    if (length < 0) {
                        length = Integer.MAX_VALUE;
                    }
                }
                objArr = Arrays.copyOf(objArr, length);
                kpVar.c = objArr;
            }
            int i2 = kpVar.b;
            int i3 = i2 << 1;
            objArr[i3] = valueOf;
            objArr[i3 + 1] = fbdVar;
            kpVar.b = i2 + 1;
        }
        ifd ifdVar = (ifd) kpVar.d;
        if (ifdVar == null) {
            qid c2 = qid.c(kpVar.b, (Object[]) kpVar.c, kpVar);
            ifd ifdVar2 = (ifd) kpVar.d;
            if (ifdVar2 == null) {
                c = c2;
                return;
            }
            throw ifdVar2.a();
        }
        throw ifdVar.a();
    }

    fbd(int i) {
        this.a = i;
    }
}
