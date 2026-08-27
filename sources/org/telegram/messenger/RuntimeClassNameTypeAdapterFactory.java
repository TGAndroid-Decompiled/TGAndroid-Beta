package org.telegram.messenger;

import java.io.EOFException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public final class RuntimeClassNameTypeAdapterFactory<T> implements ma.v {
    private final Class<?> baseType;
    private final ma.a exclusionStrategy;
    private final Map<String, Class<?>> labelToSubtype = new LinkedHashMap();
    private final Map<Class<?>, String> subtypeToLabel = new LinkedHashMap();
    private final String typeFieldName;

    private RuntimeClassNameTypeAdapterFactory(Class<?> cls, String str, ma.a aVar) {
        if (str == null || cls == null) {
            throw null;
        }
        this.baseType = cls;
        this.typeFieldName = str;
        this.exclusionStrategy = aVar;
    }

    public static <T> RuntimeClassNameTypeAdapterFactory<T> of(Class<T> cls, String str, ma.a aVar) {
        return new RuntimeClassNameTypeAdapterFactory<>(cls, str, aVar);
    }

    @Override
    public <R> ma.u create(final ma.g gVar, final ta.a<R> aVar) {
        ma.a aVar2 = this.exclusionStrategy;
        Class cls = aVar.f48151a;
        Class cls2 = aVar.f48151a;
        if (aVar2.shouldSkipClass(cls.getClass())) {
            return null;
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        final LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (Object.class.isAssignableFrom(cls2)) {
            ma.u uVarC = gVar.c(this, aVar);
            linkedHashMap.put(cls2.getSimpleName(), uVarC);
            linkedHashMap2.put(cls2, uVarC);
        }
        return new ma.u() {
            private ma.u getDelegate(Class<?> cls3) {
                ma.u uVar = (ma.u) linkedHashMap2.get(cls3);
                if (uVar != null) {
                    return uVar;
                }
                for (Map.Entry entry : linkedHashMap2.entrySet()) {
                    if (((Class) entry.getKey()).isAssignableFrom(cls3)) {
                        return (ma.u) entry.getValue();
                    }
                }
                return null;
            }

            @Override
            public R read(ua.a aVar3) {
                boolean z10;
                ma.i iVar;
                try {
                    try {
                        aVar3.x();
                        z10 = false;
                        try {
                            iVar = (ma.i) pa.h1.f45646z.read(aVar3);
                        } catch (EOFException e9) {
                            e = e9;
                            if (!z10) {
                                throw new ma.j(e);
                            }
                            iVar = ma.k.f17910a;
                        }
                    } catch (EOFException e10) {
                        e = e10;
                        z10 = true;
                    }
                    iVar.getClass();
                    if (!(iVar instanceof ma.l)) {
                        if (iVar instanceof ma.k) {
                            return null;
                        }
                        return gVar.c(RuntimeClassNameTypeAdapterFactory.this, aVar).fromJsonTree(iVar);
                    }
                    ma.i iVar2 = (ma.i) iVar.i().f17911a.remove(RuntimeClassNameTypeAdapterFactory.this.typeFieldName);
                    if (iVar2 == null) {
                        throw new a7.c("cannot deserialize " + RuntimeClassNameTypeAdapterFactory.this.baseType + " because it does not define a field named " + RuntimeClassNameTypeAdapterFactory.this.typeFieldName);
                    }
                    String strN = iVar2.n();
                    ma.u uVarC2 = (ma.u) linkedHashMap.get(strN);
                    if (uVarC2 == null) {
                        try {
                            uVarC2 = gVar.c(RuntimeClassNameTypeAdapterFactory.this, new ta.a(Class.forName(strN)));
                        } catch (ClassNotFoundException e11) {
                            throw new a7.c(s3.c.e("Cannot find class ", strN), e11);
                        }
                    }
                    return uVarC2.fromJsonTree(iVar);
                } catch (IOException e12) {
                    throw new ma.j(e12);
                } catch (NumberFormatException e13) {
                    throw new ma.j(e13);
                } catch (ua.c e14) {
                    throw new ma.j(e14);
                }
            }

            @Override
            public void write(ua.b bVar, R r10) {
                Class<?> cls3 = r10.getClass();
                String simpleName = cls3.getSimpleName();
                ma.u delegate = getDelegate(cls3);
                if (delegate == null) {
                    throw new a7.c("cannot serialize " + cls3.getSimpleName() + "; did you forget to register a subtype?");
                }
                ma.i jsonTree = delegate.toJsonTree(r10);
                jsonTree.getClass();
                if (!(jsonTree instanceof ma.l)) {
                    oa.d.l(jsonTree, bVar);
                    return;
                }
                oa.l lVar = jsonTree.i().f17911a;
                if (lVar.containsKey(RuntimeClassNameTypeAdapterFactory.this.typeFieldName)) {
                    throw new a7.c("cannot serialize " + cls3.getSimpleName() + " because it already defines a field named " + RuntimeClassNameTypeAdapterFactory.this.typeFieldName);
                }
                ma.l lVar2 = new ma.l();
                lVar2.o(RuntimeClassNameTypeAdapterFactory.this.typeFieldName, new ma.m(simpleName));
                for (Map.Entry entry : (oa.j) lVar.entrySet()) {
                    lVar2.o((String) entry.getKey(), (ma.i) entry.getValue());
                }
                oa.d.l(lVar2, bVar);
            }
        }.nullSafe();
    }

    public RuntimeClassNameTypeAdapterFactory<T> registerSubtype(Class<? extends T> cls, String str) {
        if (cls == null || str == null) {
            throw null;
        }
        if (this.subtypeToLabel.containsKey(cls) || this.labelToSubtype.containsKey(str)) {
            throw new IllegalArgumentException("types and labels must be unique");
        }
        this.labelToSubtype.put(str, cls);
        this.subtypeToLabel.put(cls, str);
        return this;
    }

    public static <T> RuntimeClassNameTypeAdapterFactory<T> of(Class<T> cls) {
        return new RuntimeClassNameTypeAdapterFactory<>(cls, "class", null);
    }

    public RuntimeClassNameTypeAdapterFactory<T> registerSubtype(Class<? extends T> cls) {
        return registerSubtype(cls, cls.getSimpleName());
    }
}
