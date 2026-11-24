package defpackage;

import java.io.Serializable;
public enum sre {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(tke.class, tke.c),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);
    
    public final Class a;

    sre(Class cls, Serializable serializable) {
        this.a = cls;
    }
}
