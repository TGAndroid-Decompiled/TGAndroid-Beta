package org.telegram.messenger;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
public final class RuntimeClassNameTypeAdapterFactory<T> implements pa.v {
    private final Class<?> baseType;
    private final pa.a exclusionStrategy;
    private final Map<String, Class<?>> labelToSubtype = new LinkedHashMap();
    private final Map<Class<?>, String> subtypeToLabel = new LinkedHashMap();
    private final String typeFieldName;

    private RuntimeClassNameTypeAdapterFactory(Class<?> cls, String str, pa.a aVar) {
        if (str != null && cls != null) {
            this.baseType = cls;
            this.typeFieldName = str;
            this.exclusionStrategy = aVar;
            return;
        }
        throw null;
    }

    public static <T> RuntimeClassNameTypeAdapterFactory<T> of(Class<T> cls, String str, pa.a aVar) {
        return new RuntimeClassNameTypeAdapterFactory<>(cls, str, aVar);
    }

    @Override
    public <R> pa.u create(final pa.g gVar, final wa.a<R> aVar) {
        pa.a aVar2 = this.exclusionStrategy;
        Class cls = aVar.f49483a;
        Class cls2 = aVar.f49483a;
        if (aVar2.shouldSkipClass(cls.getClass())) {
            return null;
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        final LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (Object.class.isAssignableFrom(cls2)) {
            pa.u c3 = gVar.c(this, aVar);
            linkedHashMap.put(cls2.getSimpleName(), c3);
            linkedHashMap2.put(cls2, c3);
        }
        return new pa.u() {
            private pa.u getDelegate(Class<?> cls3) {
                pa.u uVar = (pa.u) linkedHashMap2.get(cls3);
                if (uVar != null) {
                    return uVar;
                }
                for (Map.Entry entry : linkedHashMap2.entrySet()) {
                    if (((Class) entry.getKey()).isAssignableFrom(cls3)) {
                        return (pa.u) entry.getValue();
                    }
                }
                return null;
            }

            @Override
            public R read(xa.a r4) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.RuntimeClassNameTypeAdapterFactory.AnonymousClass1.read(xa.a):java.lang.Object");
            }

            @Override
            public void write(xa.b bVar, R r10) {
                Class<?> cls3 = r10.getClass();
                String simpleName = cls3.getSimpleName();
                pa.u delegate = getDelegate(cls3);
                if (delegate != null) {
                    pa.i jsonTree = delegate.toJsonTree(r10);
                    jsonTree.getClass();
                    if (!(jsonTree instanceof pa.l)) {
                        ra.d.l(jsonTree, bVar);
                        return;
                    }
                    ra.l lVar = jsonTree.i().f44247a;
                    if (!lVar.containsKey(RuntimeClassNameTypeAdapterFactory.this.typeFieldName)) {
                        pa.l lVar2 = new pa.l();
                        lVar2.o(RuntimeClassNameTypeAdapterFactory.this.typeFieldName, new pa.m(simpleName));
                        Iterator it = ((ra.j) lVar.entrySet()).iterator();
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            lVar2.o((String) entry.getKey(), (pa.i) entry.getValue());
                        }
                        ra.d.l(lVar2, bVar);
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
