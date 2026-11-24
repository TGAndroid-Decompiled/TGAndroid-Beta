package defpackage;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.BufferedReader;
import java.io.IOException;
public final class cb0 {
    public final long a;

    public cb0(long j) {
        this.a = j;
    }

    public static cb0 a(BufferedReader bufferedReader) {
        cb0 cb0Var;
        JsonReader jsonReader = new JsonReader(bufferedReader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    if (jsonReader.peek() == JsonToken.STRING) {
                        cb0Var = new cb0(Long.parseLong(jsonReader.nextString()));
                    } else {
                        cb0Var = new cb0(jsonReader.nextLong());
                    }
                    return cb0Var;
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
        if ((obj instanceof cb0) && this.a == ((cb0) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return 1000003 ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        return kt6.q(new StringBuilder("LogResponse{nextRequestWaitMillis="), this.a, "}");
    }
}
