package defpackage;

import java.io.Serializable;
public enum ind {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(efd.class, efd.c),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);
    
    public final Class a;

    ind(Class cls, Serializable serializable) {
        this.a = cls;
    }
}
