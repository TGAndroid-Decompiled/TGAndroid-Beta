package id;

import java.io.Serializable;
import rd.p;
public final class b implements h, Serializable {
    public final h f10562a;
    public final f f10563b;

    public b(f element, h left) {
        kotlin.jvm.internal.i.e(left, "left");
        kotlin.jvm.internal.i.e(element, "element");
        this.f10562a = left;
        this.f10563b = element;
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
                    h hVar = bVar2.f10562a;
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
                    h hVar2 = bVar3.f10562a;
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
                        f fVar = bVar4.f10563b;
                        if (!kotlin.jvm.internal.i.a(bVar.get(fVar.getKey()), fVar)) {
                            z10 = false;
                            break;
                        }
                        h hVar3 = bVar4.f10562a;
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
        return pVar.invoke(this.f10562a.fold(obj, pVar), this.f10563b);
    }

    @Override
    public final f get(g key) {
        kotlin.jvm.internal.i.e(key, "key");
        b bVar = this;
        while (true) {
            f fVar = bVar.f10563b.get(key);
            if (fVar != null) {
                return fVar;
            }
            h hVar = bVar.f10562a;
            if (hVar instanceof b) {
                bVar = (b) hVar;
            } else {
                return hVar.get(key);
            }
        }
    }

    public final int hashCode() {
        return this.f10563b.hashCode() + this.f10562a.hashCode();
    }

    @Override
    public final h minusKey(g key) {
        kotlin.jvm.internal.i.e(key, "key");
        f fVar = this.f10563b;
        f fVar2 = fVar.get(key);
        h hVar = this.f10562a;
        if (fVar2 != null) {
            return hVar;
        }
        h minusKey = hVar.minusKey(key);
        if (minusKey == hVar) {
            return this;
        }
        if (minusKey == i.f10565a) {
            return fVar;
        }
        return new b(fVar, minusKey);
    }

    @Override
    public final h plus(h context) {
        kotlin.jvm.internal.i.e(context, "context");
        if (context == i.f10565a) {
            return this;
        }
        return (h) context.fold(this, new b1.e(5));
    }

    public final String toString() {
        return "[" + ((String) fold("", new b1.e(4))) + ']';
    }
}
