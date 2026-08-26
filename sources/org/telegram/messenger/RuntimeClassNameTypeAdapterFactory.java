package org.telegram.messenger;

import androidx.car.app.HostException;
import com.google.android.gms.internal.mlkit_language_id_common.zzil;
import com.google.gson.ExclusionStrategy;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.internal.Streams;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public final class RuntimeClassNameTypeAdapterFactory<T> implements TypeAdapterFactory {
    private final Class<?> baseType;
    private final ExclusionStrategy exclusionStrategy;
    private final Map<String, Class<?>> labelToSubtype = new LinkedHashMap();
    private final Map<Class<?>, String> subtypeToLabel = new LinkedHashMap();
    private final String typeFieldName;

    private RuntimeClassNameTypeAdapterFactory(Class<?> cls, String str, ExclusionStrategy exclusionStrategy) {
        if (str == null || cls == null) {
            throw null;
        }
        this.baseType = cls;
        this.typeFieldName = str;
        this.exclusionStrategy = exclusionStrategy;
    }

    public static <T> RuntimeClassNameTypeAdapterFactory<T> of(Class<T> cls, String str, ExclusionStrategy exclusionStrategy) {
        return new RuntimeClassNameTypeAdapterFactory<>(cls, str, exclusionStrategy);
    }

    @Override
    public <R> TypeAdapter create(final Gson gson, final TypeToken<R> typeToken) {
        if (this.exclusionStrategy.shouldSkipClass(typeToken.rawType.getClass())) {
            return null;
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        final LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Class cls = typeToken.rawType;
        if (Object.class.isAssignableFrom(cls)) {
            TypeAdapter delegateAdapter = gson.getDelegateAdapter(this, typeToken);
            linkedHashMap.put(cls.getSimpleName(), delegateAdapter);
            linkedHashMap2.put(cls, delegateAdapter);
        }
        return new TypeAdapter() {
            private TypeAdapter getDelegate(Class<?> cls2) {
                TypeAdapter typeAdapter = (TypeAdapter) linkedHashMap2.get(cls2);
                if (typeAdapter != null) {
                    return typeAdapter;
                }
                for (Map.Entry entry : linkedHashMap2.entrySet()) {
                    if (((Class) entry.getKey()).isAssignableFrom(cls2)) {
                        return (TypeAdapter) entry.getValue();
                    }
                }
                return null;
            }

            @Override
            public R read(JsonReader jsonReader) {
                boolean z;
                JsonElement jsonElement;
                try {
                    try {
                        jsonReader.peek();
                        z = false;
                        try {
                            jsonElement = (JsonElement) TypeAdapters.JSON_ELEMENT.read(jsonReader);
                        } catch (EOFException e) {
                            e = e;
                            if (!z) {
                                throw new JsonIOException(e);
                            }
                            jsonElement = JsonNull.INSTANCE;
                        }
                    } catch (EOFException e2) {
                        e = e2;
                        z = true;
                    }
                    jsonElement.getClass();
                    if (!(jsonElement instanceof JsonObject)) {
                        if (jsonElement instanceof JsonNull) {
                            return null;
                        }
                        return gson.getDelegateAdapter(RuntimeClassNameTypeAdapterFactory.this, typeToken).fromJsonTree(jsonElement);
                    }
                    JsonElement jsonElement2 = (JsonElement) jsonElement.getAsJsonObject().members.remove(RuntimeClassNameTypeAdapterFactory.this.typeFieldName);
                    if (jsonElement2 == null) {
                        throw new HostException("cannot deserialize " + RuntimeClassNameTypeAdapterFactory.this.baseType + " because it does not define a field named " + RuntimeClassNameTypeAdapterFactory.this.typeFieldName);
                    }
                    String asString = jsonElement2.getAsString();
                    TypeAdapter delegateAdapter2 = (TypeAdapter) linkedHashMap.get(asString);
                    if (delegateAdapter2 == null) {
                        try {
                            delegateAdapter2 = gson.getDelegateAdapter(RuntimeClassNameTypeAdapterFactory.this, new TypeToken(Class.forName(asString)));
                        } catch (ClassNotFoundException e3) {
                            throw new HostException(zzil.m("Cannot find class ", asString), e3);
                        }
                    }
                    return delegateAdapter2.fromJsonTree(jsonElement);
                } catch (MalformedJsonException e4) {
                    throw new JsonIOException(e4);
                } catch (IOException e5) {
                    throw new JsonIOException(e5);
                } catch (NumberFormatException e6) {
                    throw new JsonIOException(e6);
                }
            }

            @Override
            public void write(JsonWriter jsonWriter, R r) {
                Class<?> cls2 = r.getClass();
                String simpleName = cls2.getSimpleName();
                TypeAdapter delegate = getDelegate(cls2);
                if (delegate == null) {
                    throw new HostException("cannot serialize " + cls2.getSimpleName() + "; did you forget to register a subtype?");
                }
                JsonElement jsonTree = delegate.toJsonTree(r);
                jsonTree.getClass();
                if (!(jsonTree instanceof JsonObject)) {
                    Streams.write(jsonTree, jsonWriter);
                    return;
                }
                JsonObject asJsonObject = jsonTree.getAsJsonObject();
                String str = RuntimeClassNameTypeAdapterFactory.this.typeFieldName;
                LinkedTreeMap linkedTreeMap = asJsonObject.members;
                if (linkedTreeMap.containsKey(str)) {
                    throw new HostException("cannot serialize " + cls2.getSimpleName() + " because it already defines a field named " + RuntimeClassNameTypeAdapterFactory.this.typeFieldName);
                }
                JsonObject jsonObject = new JsonObject();
                jsonObject.add(RuntimeClassNameTypeAdapterFactory.this.typeFieldName, new JsonPrimitive(simpleName));
                for (Map.Entry entry : (LinkedTreeMap.KeySet) linkedTreeMap.entrySet()) {
                    jsonObject.add((String) entry.getKey(), (JsonElement) entry.getValue());
                }
                Streams.write(jsonObject, jsonWriter);
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
