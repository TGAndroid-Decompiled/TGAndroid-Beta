package m5;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.BufferedReader;
import java.io.IOException;
public final class u {
    public final long f19168a;

    public u(long j10) {
        this.f19168a = j10;
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
        if ((obj instanceof u) && this.f19168a == ((u) obj).f19168a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f19168a;
        return ((int) (j10 ^ (j10 >>> 32))) ^ 1000003;
    }

    public final String toString() {
        return a1.g.r(new StringBuilder("LogResponse{nextRequestWaitMillis="), this.f19168a, "}");
    }
}
