package id;

import java.io.Serializable;
import kotlin.jvm.internal.j;
import rd.p;
public final class b implements h, Serializable {
    public final h f15453a;
    public final f f15454b;

    public b(f element, h left) {
        j.e(left, "left");
        j.e(element, "element");
        this.f15453a = left;
        this.f15454b = element;
    }

    public final boolean equals(Object obj) {
        boolean z9;
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                int i7 = 2;
                b bVar2 = bVar;
                int i10 = 2;
                while (true) {
                    h hVar = bVar2.f15453a;
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
                    h hVar2 = bVar3.f15453a;
                    if (hVar2 instanceof b) {
                        bVar3 = (b) hVar2;
                    } else {
                        bVar3 = null;
                    }
                    if (bVar3 == null) {
                        break;
                    }
                    i7++;
                }
                if (i10 == i7) {
                    b bVar4 = this;
                    while (true) {
                        f fVar = bVar4.f15454b;
                        if (!j.a(bVar.get(fVar.getKey()), fVar)) {
                            z9 = false;
                            break;
                        }
                        h hVar3 = bVar4.f15453a;
                        if (hVar3 instanceof b) {
                            bVar4 = (b) hVar3;
                        } else {
                            j.c(hVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                            f fVar2 = (f) hVar3;
                            z9 = j.a(bVar.get(fVar2.getKey()), fVar2);
                            break;
                        }
                    }
                    if (z9) {
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
        return pVar.invoke(this.f15453a.fold(obj, pVar), this.f15454b);
    }

    @Override
    public final f get(g key) {
        j.e(key, "key");
        b bVar = this;
        while (true) {
            f fVar = bVar.f15454b.get(key);
            if (fVar != null) {
                return fVar;
            }
            h hVar = bVar.f15453a;
            if (hVar instanceof b) {
                bVar = (b) hVar;
            } else {
                return hVar.get(key);
            }
        }
    }

    public final int hashCode() {
        return this.f15454b.hashCode() + this.f15453a.hashCode();
    }

    @Override
    public final h minusKey(g key) {
        j.e(key, "key");
        f fVar = this.f15454b;
        f fVar2 = fVar.get(key);
        h hVar = this.f15453a;
        if (fVar2 != null) {
            return hVar;
        }
        h minusKey = hVar.minusKey(key);
        if (minusKey == hVar) {
            return this;
        }
        if (minusKey == i.f15456a) {
            return fVar;
        }
        return new b(fVar, minusKey);
    }

    @Override
    public final h plus(h context) {
        j.e(context, "context");
        if (context == i.f15456a) {
            return this;
        }
        return (h) context.fold(this, new b1.e(9));
    }

    public final String toString() {
        return "[" + ((String) fold("", new b1.e(8))) + ']';
    }
}
