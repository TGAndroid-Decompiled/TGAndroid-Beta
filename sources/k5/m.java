package k5;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.BufferedReader;
import java.io.IOException;
public final class m {
    public final long f12333a;

    public m(long j3) {
        this.f12333a = j3;
    }

    public static m a(BufferedReader bufferedReader) {
        JsonReader jsonReader = new JsonReader(bufferedReader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    if (jsonReader.peek() == JsonToken.STRING) {
                        return new m(Long.parseLong(jsonReader.nextString()));
                    }
                    return new m(jsonReader.nextLong());
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof m) && this.f12333a == ((m) obj).f12333a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f12333a;
        return ((int) (j3 ^ (j3 >>> 32))) ^ 1000003;
    }

    public final String toString() {
        return a4.a.r(new StringBuilder("LogResponse{nextRequestWaitMillis="), this.f12333a, "}");
    }
}
