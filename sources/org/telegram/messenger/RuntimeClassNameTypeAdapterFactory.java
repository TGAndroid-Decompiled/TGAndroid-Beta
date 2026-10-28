package org.telegram.messenger;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
public final class RuntimeClassNameTypeAdapterFactory<T> implements fb.v {
    private final Class<?> baseType;
    private final fb.a exclusionStrategy;
    private final Map<String, Class<?>> labelToSubtype = new LinkedHashMap();
    private final Map<Class<?>, String> subtypeToLabel = new LinkedHashMap();
    private final String typeFieldName;

    private RuntimeClassNameTypeAdapterFactory(Class<?> cls, String str, fb.a aVar) {
        if (str != null && cls != null) {
            this.baseType = cls;
            this.typeFieldName = str;
            this.exclusionStrategy = aVar;
            return;
        }
        throw null;
    }

    public static <T> RuntimeClassNameTypeAdapterFactory<T> of(Class<T> cls, String str, fb.a aVar) {
        return new RuntimeClassNameTypeAdapterFactory<>(cls, str, aVar);
    }

    @Override
    public <R> fb.u create(final fb.g gVar, final mb.a<R> aVar) {
        fb.a aVar2 = this.exclusionStrategy;
        Class cls = aVar.f18406a;
        Class cls2 = aVar.f18406a;
        if (aVar2.shouldSkipClass(cls.getClass())) {
            return null;
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        final LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (Object.class.isAssignableFrom(cls2)) {
            fb.u c10 = gVar.c(this, aVar);
            linkedHashMap.put(cls2.getSimpleName(), c10);
            linkedHashMap2.put(cls2, c10);
        }
        return new fb.u() {
            private fb.u getDelegate(Class<?> cls3) {
                fb.u uVar = (fb.u) linkedHashMap2.get(cls3);
                if (uVar != null) {
                    return uVar;
                }
                for (Map.Entry entry : linkedHashMap2.entrySet()) {
                    if (((Class) entry.getKey()).isAssignableFrom(cls3)) {
                        return (fb.u) entry.getValue();
                    }
                }
                return null;
            }

            @Override
            public R read(nb.a r4) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.RuntimeClassNameTypeAdapterFactory.AnonymousClass1.read(nb.a):java.lang.Object");
            }

            @Override
            public void write(nb.b bVar, R r6) {
                Class<?> cls3 = r6.getClass();
                String simpleName = cls3.getSimpleName();
                fb.u delegate = getDelegate(cls3);
                if (delegate != null) {
                    fb.i jsonTree = delegate.toJsonTree(r6);
                    jsonTree.getClass();
                    if (!(jsonTree instanceof fb.l)) {
                        hb.d.l(jsonTree, bVar);
                        return;
                    }
                    hb.m mVar = jsonTree.h().f10396a;
                    if (!mVar.containsKey(RuntimeClassNameTypeAdapterFactory.this.typeFieldName)) {
                        fb.l lVar = new fb.l();
                        lVar.n(RuntimeClassNameTypeAdapterFactory.this.typeFieldName, new fb.m(simpleName));
                        Iterator it = ((hb.k) mVar.entrySet()).iterator();
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            lVar.n((String) entry.getKey(), (fb.i) entry.getValue());
                        }
                        hb.d.l(lVar, bVar);
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
