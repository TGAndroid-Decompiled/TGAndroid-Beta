package defpackage;

import java.util.Arrays;
public enum hdd {
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
    
    public static final skd c;
    public final int a;

    static {
        hdd[] values;
        kq kqVar = new kq((byte) 19, false);
        kqVar.c = new Object[8];
        kqVar.b = 0;
        for (hdd hddVar : values()) {
            Integer valueOf = Integer.valueOf(hddVar.a);
            Object[] objArr = (Object[]) kqVar.c;
            int length = objArr.length;
            int i = (kqVar.b + 1) << 1;
            if (i > length) {
                if (i > length) {
                    length = length + (length >> 1) + 1;
                    length = length < i ? Integer.highestOneBit(i - 1) << 1 : length;
                    if (length < 0) {
                        length = Integer.MAX_VALUE;
                    }
                }
                objArr = Arrays.copyOf(objArr, length);
                kqVar.c = objArr;
            }
            int i2 = kqVar.b;
            int i3 = i2 << 1;
            objArr[i3] = valueOf;
            objArr[i3 + 1] = hddVar;
            kqVar.b = i2 + 1;
        }
        jhd jhdVar = (jhd) kqVar.d;
        if (jhdVar == null) {
            skd c2 = skd.c(kqVar.b, (Object[]) kqVar.c, kqVar);
            jhd jhdVar2 = (jhd) kqVar.d;
            if (jhdVar2 == null) {
                c = c2;
                return;
            }
            throw jhdVar2.a();
        }
        throw jhdVar.a();
    }

    hdd(int i) {
        this.a = i;
    }
}
