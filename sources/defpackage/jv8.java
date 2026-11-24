package defpackage;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;
public final class jv8 implements c44 {
    public final byte a;
    public final HashMap b;
    public final HashMap c;

    public jv8(byte b) {
        this.a = b;
        switch (b) {
            case 2:
                this.b = new HashMap();
                this.c = new HashMap();
                return;
            case 3:
                this.b = new HashMap();
                this.c = new HashMap();
                return;
            default:
                this.b = new HashMap();
                this.c = new HashMap();
                return;
        }
    }

    @Override
    public final c44 a(Class cls, cq7 cq7Var) {
        byte b = this.a;
        HashMap hashMap = this.c;
        HashMap hashMap2 = this.b;
        switch (b) {
            case 1:
                hashMap2.put(cls, cq7Var);
                hashMap.remove(cls);
                return this;
            case 2:
                hashMap2.put(cls, cq7Var);
                hashMap.remove(cls);
                return this;
            default:
                hashMap2.put(cls, cq7Var);
                hashMap.remove(cls);
                return this;
        }
    }

    public final void b(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap hashMap = this.c;
        HashMap hashMap2 = this.b;
        iv8 iv8Var = new iv8(byteArrayOutputStream, hashMap2, hashMap);
        if (obj == null) {
            return;
        }
        cq7 cq7Var = (cq7) hashMap2.get(obj.getClass());
        if (cq7Var != null) {
            cq7Var.a(obj, iv8Var);
            return;
        }
        Class<?> cls = obj.getClass();
        throw new RuntimeException("No encoder for " + cls);
    }

    public jv8(HashMap hashMap, HashMap hashMap2) {
        this.a = (byte) 0;
        this.b = hashMap;
        this.c = hashMap2;
    }
}
