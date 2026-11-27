package defpackage;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;
public final class rw8 implements m34 {
    public final byte a;
    public final HashMap b;
    public final HashMap c;

    public rw8(byte b) {
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
    public final m34 a(Class cls, zq7 zq7Var) {
        byte b = this.a;
        HashMap hashMap = this.c;
        HashMap hashMap2 = this.b;
        switch (b) {
            case 1:
                hashMap2.put(cls, zq7Var);
                hashMap.remove(cls);
                return this;
            case 2:
                hashMap2.put(cls, zq7Var);
                hashMap.remove(cls);
                return this;
            default:
                hashMap2.put(cls, zq7Var);
                hashMap.remove(cls);
                return this;
        }
    }

    public final void b(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap hashMap = this.c;
        HashMap hashMap2 = this.b;
        qw8 qw8Var = new qw8(byteArrayOutputStream, hashMap2, hashMap);
        if (obj == null) {
            return;
        }
        zq7 zq7Var = (zq7) hashMap2.get(obj.getClass());
        if (zq7Var != null) {
            zq7Var.a(obj, qw8Var);
            return;
        }
        Class<?> cls = obj.getClass();
        throw new RuntimeException("No encoder for " + cls);
    }

    public rw8(HashMap hashMap, HashMap hashMap2) {
        this.a = (byte) 0;
        this.b = hashMap;
        this.c = hashMap2;
    }
}
