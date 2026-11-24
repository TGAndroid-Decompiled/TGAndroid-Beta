package defpackage;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.BufferedReader;
import java.io.IOException;
public final class ca0 {
    public final long a;

    public ca0(long j) {
        this.a = j;
    }

    public static ca0 a(BufferedReader bufferedReader) {
        ca0 ca0Var;
        JsonReader jsonReader = new JsonReader(bufferedReader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    if (jsonReader.peek() == JsonToken.STRING) {
                        ca0Var = new ca0(Long.parseLong(jsonReader.nextString()));
                    } else {
                        ca0Var = new ca0(jsonReader.nextLong());
                    }
                    return ca0Var;
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
        if ((obj instanceof ca0) && this.a == ((ca0) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return 1000003 ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        return ls6.p(new StringBuilder("LogResponse{nextRequestWaitMillis="), this.a, "}");
    }
}
