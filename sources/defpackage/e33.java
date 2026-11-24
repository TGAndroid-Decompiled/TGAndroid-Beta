package defpackage;

import android.os.Bundle;
import android.os.ResultReceiver;
public final class e33 {
    public static o13 a(String str, String str2) {
        if (rr5.a(str, "CREATE_CANCELED")) {
            return new m13(str2);
        }
        if (rr5.a(str, "CREATE_INTERRUPTED")) {
            return new q13(str2);
        }
        return new n13(str2, (byte) 2);
    }

    public static vu4 b(String str, String str2) {
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1567968963) {
                if (hashCode != -154594663) {
                    if (hashCode == 1996705159 && str.equals("GET_NO_CREDENTIALS")) {
                        return new sl7(str2);
                    }
                } else if (str.equals("GET_INTERRUPTED")) {
                    return new wu4(str2);
                }
            } else if (str.equals("GET_CANCELED_TAG")) {
                return new su4(str2);
            }
        }
        return new uu4(str2, (byte) 2);
    }

    public static void c(ResultReceiver resultReceiver, String str, String str2) {
        resultReceiver.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("FAILURE_RESPONSE", true);
        bundle.putString("EXCEPTION_TYPE", str);
        bundle.putString("EXCEPTION_MESSAGE", str2);
        resultReceiver.send(Integer.MAX_VALUE, bundle);
    }
}
