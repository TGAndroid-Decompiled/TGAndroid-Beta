package defpackage;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
public final class wu5 implements ao7, z8c {
    public final boolean a = true;
    public final JsonWriter b;
    public final HashMap c;
    public final HashMap d;
    public final nu5 e;
    public final boolean f;

    public wu5(Writer writer, HashMap hashMap, HashMap hashMap2, nu5 nu5Var, boolean z) {
        this.b = new JsonWriter(writer);
        this.c = hashMap;
        this.d = hashMap2;
        this.e = nu5Var;
        this.f = z;
    }

    @Override
    public final ao7 a(w84 w84Var, Object obj) {
        i(obj, w84Var.a);
        return this;
    }

    @Override
    public final z8c b(String str) {
        j();
        this.b.value(str);
        return this;
    }

    @Override
    public final z8c c(boolean z) {
        j();
        this.b.value(z);
        return this;
    }

    @Override
    public final ao7 d(w84 w84Var, boolean z) {
        String str = w84Var.a;
        j();
        JsonWriter jsonWriter = this.b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(z);
        return this;
    }

    @Override
    public final ao7 e(w84 w84Var, int i) {
        String str = w84Var.a;
        j();
        JsonWriter jsonWriter = this.b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(i);
        return this;
    }

    @Override
    public final ao7 f(w84 w84Var, double d) {
        String str = w84Var.a;
        j();
        JsonWriter jsonWriter = this.b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(d);
        return this;
    }

    @Override
    public final ao7 g(w84 w84Var, long j) {
        String str = w84Var.a;
        j();
        JsonWriter jsonWriter = this.b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(j);
        return this;
    }

    public final wu5 h(Object obj) {
        JsonWriter jsonWriter = this.b;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        } else if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        } else {
            int i = 0;
            if (obj.getClass().isArray()) {
                if (obj instanceof byte[]) {
                    j();
                    jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
                    return this;
                }
                jsonWriter.beginArray();
                if (obj instanceof int[]) {
                    int[] iArr = (int[]) obj;
                    int length = iArr.length;
                    while (i < length) {
                        jsonWriter.value(iArr[i]);
                        i++;
                    }
                } else if (obj instanceof long[]) {
                    long[] jArr = (long[]) obj;
                    int length2 = jArr.length;
                    while (i < length2) {
                        long j = jArr[i];
                        j();
                        jsonWriter.value(j);
                        i++;
                    }
                } else if (obj instanceof double[]) {
                    double[] dArr = (double[]) obj;
                    int length3 = dArr.length;
                    while (i < length3) {
                        jsonWriter.value(dArr[i]);
                        i++;
                    }
                } else if (obj instanceof boolean[]) {
                    boolean[] zArr = (boolean[]) obj;
                    int length4 = zArr.length;
                    while (i < length4) {
                        jsonWriter.value(zArr[i]);
                        i++;
                    }
                } else if (obj instanceof Number[]) {
                    Number[] numberArr = (Number[]) obj;
                    int length5 = numberArr.length;
                    while (i < length5) {
                        h(numberArr[i]);
                        i++;
                    }
                } else {
                    Object[] objArr = (Object[]) obj;
                    int length6 = objArr.length;
                    while (i < length6) {
                        h(objArr[i]);
                        i++;
                    }
                }
                jsonWriter.endArray();
                return this;
            } else if (obj instanceof Collection) {
                jsonWriter.beginArray();
                for (Object obj2 : (Collection) obj) {
                    h(obj2);
                }
                jsonWriter.endArray();
                return this;
            } else if (obj instanceof Map) {
                jsonWriter.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        i(entry.getValue(), (String) key);
                    } catch (ClassCastException e) {
                        throw new RuntimeException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                    }
                }
                jsonWriter.endObject();
                return this;
            } else {
                zn7 zn7Var = (zn7) this.c.get(obj.getClass());
                if (zn7Var != null) {
                    jsonWriter.beginObject();
                    zn7Var.a(obj, this);
                    jsonWriter.endObject();
                    return this;
                }
                y8c y8cVar = (y8c) this.d.get(obj.getClass());
                if (y8cVar != null) {
                    y8cVar.a(obj, this);
                    return this;
                } else if (obj instanceof Enum) {
                    if (obj instanceof jn7) {
                        int a = ((jn7) obj).a();
                        j();
                        jsonWriter.value(a);
                        return this;
                    }
                    String name = ((Enum) obj).name();
                    j();
                    jsonWriter.value(name);
                    return this;
                } else {
                    jsonWriter.beginObject();
                    this.e.a(obj, this);
                    throw null;
                }
            }
        }
    }

    public final wu5 i(Object obj, String str) {
        boolean z = this.f;
        JsonWriter jsonWriter = this.b;
        if (z) {
            if (obj == null) {
                return this;
            }
            j();
            jsonWriter.name(str);
            h(obj);
            return this;
        }
        j();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        h(obj);
        return this;
    }

    public final void j() {
        if (this.a) {
            return;
        }
        sc8.j("Parent context used since this context was created. Cannot use this context anymore.");
    }
}
