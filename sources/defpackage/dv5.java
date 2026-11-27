package defpackage;

import java.io.Serializable;
public enum dv5 {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(n51.class, n51.c),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);
    
    public final Class a;

    dv5(Class cls, Serializable serializable) {
        this.a = cls;
    }
}
