package defpackage;

import java.util.Arrays;
public enum yfd {
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
    
    public static final hnd c;
    public final int a;

    static {
        yfd[] values;
        lp lpVar = new lp((byte) 20, false);
        lpVar.c = new Object[8];
        lpVar.b = 0;
        for (yfd yfdVar : values()) {
            Integer valueOf = Integer.valueOf(yfdVar.a);
            Object[] objArr = (Object[]) lpVar.c;
            int length = objArr.length;
            int i = (lpVar.b + 1) << 1;
            if (i > length) {
                if (i > length) {
                    length = length + (length >> 1) + 1;
                    length = length < i ? Integer.highestOneBit(i - 1) << 1 : length;
                    if (length < 0) {
                        length = Integer.MAX_VALUE;
                    }
                }
                objArr = Arrays.copyOf(objArr, length);
                lpVar.c = objArr;
            }
            int i2 = lpVar.b;
            int i3 = i2 << 1;
            objArr[i3] = valueOf;
            objArr[i3 + 1] = yfdVar;
            lpVar.b = i2 + 1;
        }
        zjd zjdVar = (zjd) lpVar.d;
        if (zjdVar == null) {
            hnd c2 = hnd.c(lpVar.b, (Object[]) lpVar.c, lpVar);
            zjd zjdVar2 = (zjd) lpVar.d;
            if (zjdVar2 == null) {
                c = c2;
                return;
            }
            throw zjdVar2.a();
        }
        throw zjdVar.a();
    }

    yfd(int i) {
        this.a = i;
    }
}
