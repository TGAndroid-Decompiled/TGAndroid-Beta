package defpackage;

import java.io.Serializable;
public abstract class qdd implements Serializable {
    public Object a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    public boolean b() {
        return false;
    }
}
