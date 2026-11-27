package defpackage;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.BufferedReader;
import java.io.IOException;
public final class ea0 {
    public final long a;

    public ea0(long j) {
        this.a = j;
    }

    public static ea0 a(BufferedReader bufferedReader) {
        ea0 ea0Var;
        JsonReader jsonReader = new JsonReader(bufferedReader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    if (jsonReader.peek() == JsonToken.STRING) {
                        ea0Var = new ea0(Long.parseLong(jsonReader.nextString()));
                    } else {
                        ea0Var = new ea0(jsonReader.nextLong());
                    }
                    return ea0Var;
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
        if ((obj instanceof ea0) && this.a == ((ea0) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return 1000003 ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        return qu6.p(new StringBuilder("LogResponse{nextRequestWaitMillis="), this.a, "}");
    }
}
