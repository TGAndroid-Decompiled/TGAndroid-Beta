package o;

import java.util.HashMap;
public final class a extends f {
    public final HashMap f20462e = new HashMap();

    @Override
    public final c h(Object obj) {
        return (c) this.f20462e.get(obj);
    }

    @Override
    public final Object i(Object obj) {
        Object i3 = super.i(obj);
        this.f20462e.remove(obj);
        return i3;
    }
}
