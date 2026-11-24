package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
public final class kw8 {
    public final short a;
    public final byte[] b;
    public final Object c;
    public final Object d;

    public kw8(int i, String str, int i2, ArrayList arrayList, byte[] bArr) {
        List unmodifiableList;
        this.c = str;
        this.a = i2;
        if (arrayList == null) {
            unmodifiableList = Collections.EMPTY_LIST;
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(arrayList);
        }
        this.d = unmodifiableList;
        this.b = bArr;
    }

    public final int a() {
        short s = this.a;
        if (s != 2) {
            if (s != 3) {
                return 0;
            }
            return 512;
        }
        return 2048;
    }

    public kw8(UUID uuid, int i, byte[] bArr, UUID[] uuidArr) {
        this.c = uuid;
        this.a = i;
        this.b = bArr;
        this.d = uuidArr;
    }
}
