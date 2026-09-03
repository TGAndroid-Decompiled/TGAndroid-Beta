package n7;

import java.io.Serializable;
public final class f extends l7.f implements Serializable {
    public final Object f15332b;
    public final l7.e f15333c;

    public f(Object obj, l7.e eVar) {
        super(1, false);
        this.f15332b = obj;
        this.f15333c = eVar;
    }

    @Override
    public final Object getKey() {
        return this.f15332b;
    }

    @Override
    public final Object getValue() {
        return this.f15333c;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
