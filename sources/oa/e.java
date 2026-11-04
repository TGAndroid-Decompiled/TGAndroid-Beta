package oa;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.Map;
import ma.g;
public final class e implements ma.e, g {
    public final boolean f20950a = true;
    public final JsonWriter f20951b;
    public final Map f20952c;
    public final Map d;
    public final ma.d f20953e;
    public final boolean f20954f;

    public e(Writer writer, Map map, Map map2, ma.d dVar, boolean z10) {
        this.f20951b = new JsonWriter(writer);
        this.f20952c = map;
        this.d = map2;
        this.f20953e = dVar;
        this.f20954f = z10;
    }

    @Override
    public final ma.e a(ma.c cVar, Object obj) {
        i(obj, cVar.f19220a);
        return this;
    }

    @Override
    public final ma.e b(ma.c cVar, boolean z10) {
        String str = cVar.f19220a;
        j();
        JsonWriter jsonWriter = this.f20951b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(z10);
        return this;
    }

    @Override
    public final ma.e c(ma.c cVar, double d) {
        String str = cVar.f19220a;
        j();
        JsonWriter jsonWriter = this.f20951b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(d);
        return this;
    }

    @Override
    public final g d(String str) {
        j();
        this.f20951b.value(str);
        return this;
    }

    @Override
    public final ma.e e(ma.c cVar, int i3) {
        String str = cVar.f19220a;
        j();
        JsonWriter jsonWriter = this.f20951b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(i3);
        return this;
    }

    @Override
    public final ma.e f(ma.c cVar, long j10) {
        String str = cVar.f19220a;
        j();
        JsonWriter jsonWriter = this.f20951b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(j10);
        return this;
    }

    @Override
    public final g g(boolean z10) {
        j();
        this.f20951b.value(z10);
        return this;
    }

    public final e h(Object obj) {
        JsonWriter jsonWriter = this.f20951b;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        } else if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        } else {
            int i3 = 0;
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
                    while (i3 < length) {
                        jsonWriter.value(iArr[i3]);
                        i3++;
                    }
                } else if (obj instanceof long[]) {
                    long[] jArr = (long[]) obj;
                    int length2 = jArr.length;
                    while (i3 < length2) {
                        long j10 = jArr[i3];
                        j();
                        jsonWriter.value(j10);
                        i3++;
                    }
                } else if (obj instanceof double[]) {
                    double[] dArr = (double[]) obj;
                    int length3 = dArr.length;
                    while (i3 < length3) {
                        jsonWriter.value(dArr[i3]);
                        i3++;
                    }
                } else if (obj instanceof boolean[]) {
                    boolean[] zArr = (boolean[]) obj;
                    int length4 = zArr.length;
                    while (i3 < length4) {
                        jsonWriter.value(zArr[i3]);
                        i3++;
                    }
                } else if (obj instanceof Number[]) {
                    Number[] numberArr = (Number[]) obj;
                    int length5 = numberArr.length;
                    while (i3 < length5) {
                        h(numberArr[i3]);
                        i3++;
                    }
                } else {
                    Object[] objArr = (Object[]) obj;
                    int length6 = objArr.length;
                    while (i3 < length6) {
                        h(objArr[i3]);
                        i3++;
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
                    } catch (ClassCastException e10) {
                        throw new RuntimeException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e10);
                    }
                }
                jsonWriter.endObject();
                return this;
            } else {
                ma.d dVar = (ma.d) this.f20952c.get(obj.getClass());
                if (dVar != null) {
                    jsonWriter.beginObject();
                    dVar.a(obj, this);
                    jsonWriter.endObject();
                    return this;
                }
                ma.f fVar = (ma.f) this.d.get(obj.getClass());
                if (fVar != null) {
                    fVar.a(obj, this);
                    return this;
                } else if (obj instanceof Enum) {
                    if (obj instanceof f) {
                        int a10 = ((f) obj).a();
                        j();
                        jsonWriter.value(a10);
                        return this;
                    }
                    String name = ((Enum) obj).name();
                    j();
                    jsonWriter.value(name);
                    return this;
                } else {
                    jsonWriter.beginObject();
                    this.f20953e.a(obj, this);
                    jsonWriter.endObject();
                    return this;
                }
            }
        }
    }

    public final e i(Object obj, String str) {
        boolean z10 = this.f20954f;
        JsonWriter jsonWriter = this.f20951b;
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
        if (this.f20950a) {
            return;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }
}
