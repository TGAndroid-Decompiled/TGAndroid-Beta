package org.telegram.messenger;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
public final class RuntimeClassNameTypeAdapterFactory<T> implements na.v {
    private final Class<?> baseType;
    private final na.a exclusionStrategy;
    private final Map<String, Class<?>> labelToSubtype = new LinkedHashMap();
    private final Map<Class<?>, String> subtypeToLabel = new LinkedHashMap();
    private final String typeFieldName;

    private RuntimeClassNameTypeAdapterFactory(Class<?> cls, String str, na.a aVar) {
        if (str != null && cls != null) {
            this.baseType = cls;
            this.typeFieldName = str;
            this.exclusionStrategy = aVar;
            return;
        }
        throw null;
    }

    public static <T> RuntimeClassNameTypeAdapterFactory<T> of(Class<T> cls, String str, na.a aVar) {
        return new RuntimeClassNameTypeAdapterFactory<>(cls, str, aVar);
    }

    @Override
    public <R> na.u create(final na.g gVar, final ua.a<R> aVar) {
        na.a aVar2 = this.exclusionStrategy;
        Class cls = aVar.f49163a;
        Class cls2 = aVar.f49163a;
        if (aVar2.shouldSkipClass(cls.getClass())) {
            return null;
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        final LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (Object.class.isAssignableFrom(cls2)) {
            na.u c3 = gVar.c(this, aVar);
            linkedHashMap.put(cls2.getSimpleName(), c3);
            linkedHashMap2.put(cls2, c3);
        }
        return new na.u() {
            private na.u getDelegate(Class<?> cls3) {
                na.u uVar = (na.u) linkedHashMap2.get(cls3);
                if (uVar != null) {
                    return uVar;
                }
                for (Map.Entry entry : linkedHashMap2.entrySet()) {
                    if (((Class) entry.getKey()).isAssignableFrom(cls3)) {
                        return (na.u) entry.getValue();
                    }
                }
                return null;
            }

            @Override
            public R read(va.a r4) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.RuntimeClassNameTypeAdapterFactory.AnonymousClass1.read(va.a):java.lang.Object");
            }

            @Override
            public void write(va.b bVar, R r6) {
                Class<?> cls3 = r6.getClass();
                String simpleName = cls3.getSimpleName();
                na.u delegate = getDelegate(cls3);
                if (delegate != null) {
                    na.i jsonTree = delegate.toJsonTree(r6);
                    jsonTree.getClass();
                    if (!(jsonTree instanceof na.l)) {
                        pa.d.l(jsonTree, bVar);
                        return;
                    }
                    pa.l lVar = jsonTree.i().f17194a;
                    if (!lVar.containsKey(RuntimeClassNameTypeAdapterFactory.this.typeFieldName)) {
                        na.l lVar2 = new na.l();
                        lVar2.o(RuntimeClassNameTypeAdapterFactory.this.typeFieldName, new na.m(simpleName));
                        Iterator it = ((pa.j) lVar.entrySet()).iterator();
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            lVar2.o((String) entry.getKey(), (na.i) entry.getValue());
                        }
                        pa.d.l(lVar2, bVar);
                        return;
                    }
                    throw new RuntimeException("cannot serialize " + cls3.getSimpleName() + " because it already defines a field named " + RuntimeClassNameTypeAdapterFactory.this.typeFieldName);
                }
                throw new RuntimeException("cannot serialize " + cls3.getSimpleName() + "; did you forget to register a subtype?");
            }
        }.nullSafe();
    }

    public RuntimeClassNameTypeAdapterFactory<T> registerSubtype(Class<? extends T> cls, String str) {
        if (cls != null && str != null) {
            if (!this.subtypeToLabel.containsKey(cls) && !this.labelToSubtype.containsKey(str)) {
                this.labelToSubtype.put(str, cls);
                this.subtypeToLabel.put(cls, str);
                return this;
            }
            throw new IllegalArgumentException("types and labels must be unique");
        }
        throw null;
    }

    public static <T> RuntimeClassNameTypeAdapterFactory<T> of(Class<T> cls) {
        return new RuntimeClassNameTypeAdapterFactory<>(cls, "class", null);
    }

    public RuntimeClassNameTypeAdapterFactory<T> registerSubtype(Class<? extends T> cls) {
        return registerSubtype(cls, cls.getSimpleName());
    }
}
