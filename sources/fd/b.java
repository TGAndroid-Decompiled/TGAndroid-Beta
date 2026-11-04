package fd;

import java.io.Serializable;
import kotlin.jvm.internal.j;
import od.p;
public final class b implements h, Serializable {
    public final h f11564a;
    public final f f11565b;

    public b(f element, h left) {
        j.e(left, "left");
        j.e(element, "element");
        this.f11564a = left;
        this.f11565b = element;
    }

    public final boolean equals(Object obj) {
        boolean z10;
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                int i3 = 2;
                b bVar2 = bVar;
                int i10 = 2;
                while (true) {
                    h hVar = bVar2.f11564a;
                    if (hVar instanceof b) {
                        bVar2 = (b) hVar;
                    } else {
                        bVar2 = null;
                    }
                    if (bVar2 == null) {
                        break;
                    }
                    i10++;
                }
                b bVar3 = this;
                while (true) {
                    h hVar2 = bVar3.f11564a;
                    if (hVar2 instanceof b) {
                        bVar3 = (b) hVar2;
                    } else {
                        bVar3 = null;
                    }
                    if (bVar3 == null) {
                        break;
                    }
                    i3++;
                }
                if (i10 == i3) {
                    b bVar4 = this;
                    while (true) {
                        f fVar = bVar4.f11565b;
                        if (!j.a(bVar.get(fVar.getKey()), fVar)) {
                            z10 = false;
                            break;
                        }
                        h hVar3 = bVar4.f11564a;
                        if (hVar3 instanceof b) {
                            bVar4 = (b) hVar3;
                        } else {
                            j.c(hVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                            f fVar2 = (f) hVar3;
                            z10 = j.a(bVar.get(fVar2.getKey()), fVar2);
                            break;
                        }
                    }
                    if (z10) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override
    public final Object fold(Object obj, p pVar) {
        return pVar.invoke(this.f11564a.fold(obj, pVar), this.f11565b);
    }

    @Override
    public final f get(g key) {
        j.e(key, "key");
        b bVar = this;
        while (true) {
            f fVar = bVar.f11565b.get(key);
            if (fVar != null) {
                return fVar;
            }
            h hVar = bVar.f11564a;
            if (hVar instanceof b) {
                bVar = (b) hVar;
            } else {
                return hVar.get(key);
            }
        }
    }

    public final int hashCode() {
        return this.f11565b.hashCode() + this.f11564a.hashCode();
    }

    @Override
    public final h minusKey(g key) {
        j.e(key, "key");
        f fVar = this.f11565b;
        f fVar2 = fVar.get(key);
        h hVar = this.f11564a;
        if (fVar2 != null) {
            return hVar;
        }
        h minusKey = hVar.minusKey(key);
        if (minusKey == hVar) {
            return this;
        }
        if (minusKey == i.f11567a) {
            return fVar;
        }
        return new b(fVar, minusKey);
    }

    @Override
    public final h plus(h context) {
        j.e(context, "context");
        if (context == i.f11567a) {
            return this;
        }
        return (h) context.fold(this, new ae.j(9));
    }

    public final String toString() {
        return "[" + ((String) fold("", new ae.j(8))) + ']';
    }
}
