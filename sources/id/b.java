package id;

import java.io.Serializable;
import rd.p;
public final class b implements h, Serializable {
    public final h f11977a;
    public final f f11978b;

    public b(f element, h left) {
        kotlin.jvm.internal.i.e(left, "left");
        kotlin.jvm.internal.i.e(element, "element");
        this.f11977a = left;
        this.f11978b = element;
    }

    public final boolean equals(Object obj) {
        boolean z10;
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                int i10 = 2;
                b bVar2 = bVar;
                int i11 = 2;
                while (true) {
                    h hVar = bVar2.f11977a;
                    if (hVar instanceof b) {
                        bVar2 = (b) hVar;
                    } else {
                        bVar2 = null;
                    }
                    if (bVar2 == null) {
                        break;
                    }
                    i11++;
                }
                b bVar3 = this;
                while (true) {
                    h hVar2 = bVar3.f11977a;
                    if (hVar2 instanceof b) {
                        bVar3 = (b) hVar2;
                    } else {
                        bVar3 = null;
                    }
                    if (bVar3 == null) {
                        break;
                    }
                    i10++;
                }
                if (i11 == i10) {
                    b bVar4 = this;
                    while (true) {
                        f fVar = bVar4.f11978b;
                        if (!kotlin.jvm.internal.i.a(bVar.get(fVar.getKey()), fVar)) {
                            z10 = false;
                            break;
                        }
                        h hVar3 = bVar4.f11977a;
                        if (hVar3 instanceof b) {
                            bVar4 = (b) hVar3;
                        } else {
                            kotlin.jvm.internal.i.c(hVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                            f fVar2 = (f) hVar3;
                            z10 = kotlin.jvm.internal.i.a(bVar.get(fVar2.getKey()), fVar2);
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
        return pVar.invoke(this.f11977a.fold(obj, pVar), this.f11978b);
    }

    @Override
    public final f get(g key) {
        kotlin.jvm.internal.i.e(key, "key");
        b bVar = this;
        while (true) {
            f fVar = bVar.f11978b.get(key);
            if (fVar != null) {
                return fVar;
            }
            h hVar = bVar.f11977a;
            if (hVar instanceof b) {
                bVar = (b) hVar;
            } else {
                return hVar.get(key);
            }
        }
    }

    public final int hashCode() {
        return this.f11978b.hashCode() + this.f11977a.hashCode();
    }

    @Override
    public final h minusKey(g key) {
        kotlin.jvm.internal.i.e(key, "key");
        f fVar = this.f11978b;
        f fVar2 = fVar.get(key);
        h hVar = this.f11977a;
        if (fVar2 != null) {
            return hVar;
        }
        h minusKey = hVar.minusKey(key);
        if (minusKey == hVar) {
            return this;
        }
        if (minusKey == i.f11980a) {
            return fVar;
        }
        return new b(fVar, minusKey);
    }

    @Override
    public final h plus(h context) {
        kotlin.jvm.internal.i.e(context, "context");
        if (context == i.f11980a) {
            return this;
        }
        return (h) context.fold(this, new b1.e(5));
    }

    public final String toString() {
        return "[" + ((String) fold("", new b1.e(4))) + ']';
    }
}
