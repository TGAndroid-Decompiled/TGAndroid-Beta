package ma;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.Map;
import ka.g;
public final class e implements ka.e, g {
    public final boolean f18402a = true;
    public final JsonWriter f18403b;
    public final Map f18404c;
    public final Map d;
    public final ka.d e;
    public final boolean f18405f;

    public e(Writer writer, Map map, Map map2, ka.d dVar, boolean z10) {
        this.f18403b = new JsonWriter(writer);
        this.f18404c = map;
        this.d = map2;
        this.e = dVar;
        this.f18405f = z10;
    }

    @Override
    public final ka.e a(ka.c cVar, Object obj) {
        i(obj, cVar.f16499a);
        return this;
    }

    @Override
    public final g b(String str) {
        j();
        this.f18403b.value(str);
        return this;
    }

    @Override
    public final g c(boolean z10) {
        j();
        this.f18403b.value(z10);
        return this;
    }

    @Override
    public final ka.e d(ka.c cVar, boolean z10) {
        String str = cVar.f16499a;
        j();
        JsonWriter jsonWriter = this.f18403b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(z10);
        return this;
    }

    @Override
    public final ka.e e(ka.c cVar, int i10) {
        String str = cVar.f16499a;
        j();
        JsonWriter jsonWriter = this.f18403b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(i10);
        return this;
    }

    @Override
    public final ka.e f(ka.c cVar, long j10) {
        String str = cVar.f16499a;
        j();
        JsonWriter jsonWriter = this.f18403b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(j10);
        return this;
    }

    @Override
    public final ka.e g(ka.c cVar, double d) {
        String str = cVar.f16499a;
        j();
        JsonWriter jsonWriter = this.f18403b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(d);
        return this;
    }

    public final e h(Object obj) {
        JsonWriter jsonWriter = this.f18403b;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        } else if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        } else {
            int i10 = 0;
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
                    while (i10 < length) {
                        jsonWriter.value(iArr[i10]);
                        i10++;
                    }
                } else if (obj instanceof long[]) {
                    long[] jArr = (long[]) obj;
                    int length2 = jArr.length;
                    while (i10 < length2) {
                        long j10 = jArr[i10];
                        j();
                        jsonWriter.value(j10);
                        i10++;
                    }
                } else if (obj instanceof double[]) {
                    double[] dArr = (double[]) obj;
                    int length3 = dArr.length;
                    while (i10 < length3) {
                        jsonWriter.value(dArr[i10]);
                        i10++;
                    }
                } else if (obj instanceof boolean[]) {
                    boolean[] zArr = (boolean[]) obj;
                    int length4 = zArr.length;
                    while (i10 < length4) {
                        jsonWriter.value(zArr[i10]);
                        i10++;
                    }
                } else if (obj instanceof Number[]) {
                    Number[] numberArr = (Number[]) obj;
                    int length5 = numberArr.length;
                    while (i10 < length5) {
                        h(numberArr[i10]);
                        i10++;
                    }
                } else {
                    Object[] objArr = (Object[]) obj;
                    int length6 = objArr.length;
                    while (i10 < length6) {
                        h(objArr[i10]);
                        i10++;
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
                ka.d dVar = (ka.d) this.f18404c.get(obj.getClass());
                if (dVar != null) {
                    jsonWriter.beginObject();
                    dVar.a(obj, this);
                    jsonWriter.endObject();
                    return this;
                }
                ka.f fVar = (ka.f) this.d.get(obj.getClass());
                if (fVar != null) {
                    fVar.a(obj, this);
                    return this;
                } else if (obj instanceof Enum) {
                    if (obj instanceof f) {
                        int a2 = ((f) obj).a();
                        j();
                        jsonWriter.value(a2);
                        return this;
                    }
                    String name = ((Enum) obj).name();
                    j();
                    jsonWriter.value(name);
                    return this;
                } else {
                    jsonWriter.beginObject();
                    this.e.a(obj, this);
                    jsonWriter.endObject();
                    return this;
                }
            }
        }
    }

    public final e i(Object obj, String str) {
        boolean z10 = this.f18405f;
        JsonWriter jsonWriter = this.f18403b;
        if (z10) {
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
        if (this.f18402a) {
            return;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }
}
