package org.telegram.messenger;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
public final class RuntimeClassNameTypeAdapterFactory<T> implements la.v {
    private final Class<?> baseType;
    private final la.a exclusionStrategy;
    private final Map<String, Class<?>> labelToSubtype = new LinkedHashMap();
    private final Map<Class<?>, String> subtypeToLabel = new LinkedHashMap();
    private final String typeFieldName;

    private RuntimeClassNameTypeAdapterFactory(Class<?> cls, String str, la.a aVar) {
        if (str != null && cls != null) {
            this.baseType = cls;
            this.typeFieldName = str;
            this.exclusionStrategy = aVar;
            return;
        }
        throw null;
    }

    public static <T> RuntimeClassNameTypeAdapterFactory<T> of(Class<T> cls, String str, la.a aVar) {
        return new RuntimeClassNameTypeAdapterFactory<>(cls, str, aVar);
    }

    @Override
    public <R> la.u create(final la.g gVar, final sa.a<R> aVar) {
        la.a aVar2 = this.exclusionStrategy;
        Class cls = aVar.f47502a;
        Class cls2 = aVar.f47502a;
        if (aVar2.shouldSkipClass(cls.getClass())) {
            return null;
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        final LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (Object.class.isAssignableFrom(cls2)) {
            la.u c10 = gVar.c(this, aVar);
            linkedHashMap.put(cls2.getSimpleName(), c10);
            linkedHashMap2.put(cls2, c10);
        }
        return new la.u() {
            private la.u getDelegate(Class<?> cls3) {
                la.u uVar = (la.u) linkedHashMap2.get(cls3);
                if (uVar != null) {
                    return uVar;
                }
                for (Map.Entry entry : linkedHashMap2.entrySet()) {
                    if (((Class) entry.getKey()).isAssignableFrom(cls3)) {
                        return (la.u) entry.getValue();
                    }
                }
                return null;
            }

            @Override
            public R read(ta.a r4) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.RuntimeClassNameTypeAdapterFactory.AnonymousClass1.read(ta.a):java.lang.Object");
            }

            @Override
            public void write(ta.c cVar, R r10) {
                Class<?> cls3 = r10.getClass();
                String simpleName = cls3.getSimpleName();
                la.u delegate = getDelegate(cls3);
                if (delegate != null) {
                    la.i jsonTree = delegate.toJsonTree(r10);
                    jsonTree.getClass();
                    if (!(jsonTree instanceof la.l)) {
                        na.d.l(jsonTree, cVar);
                        return;
                    }
                    na.m mVar = jsonTree.i().f16727a;
                    if (!mVar.containsKey(RuntimeClassNameTypeAdapterFactory.this.typeFieldName)) {
                        la.l lVar = new la.l();
                        lVar.o(RuntimeClassNameTypeAdapterFactory.this.typeFieldName, new la.m(simpleName));
                        Iterator it = ((na.k) mVar.entrySet()).iterator();
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            lVar.o((String) entry.getKey(), (la.i) entry.getValue());
                        }
                        na.d.l(lVar, cVar);
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
