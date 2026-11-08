package n5;

import a8.p0;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.BufferedReader;
import java.io.IOException;
public final class u {
    public final long f20480a;

    public u(long j3) {
        this.f20480a = j3;
    }

    public static u a(BufferedReader bufferedReader) {
        JsonReader jsonReader = new JsonReader(bufferedReader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    if (jsonReader.peek() == JsonToken.STRING) {
                        return new u(Long.parseLong(jsonReader.nextString()));
                    }
                    return new u(jsonReader.nextLong());
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
        if ((obj instanceof u) && this.f20480a == ((u) obj).f20480a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f20480a;
        return ((int) (j3 ^ (j3 >>> 32))) ^ 1000003;
    }

    public final String toString() {
        return p0.r(new StringBuilder("LogResponse{nextRequestWaitMillis="), this.f20480a, "}");
    }
}
