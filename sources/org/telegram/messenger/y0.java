package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
public abstract class y0 {
    public static void a() {
        w0.f19025b.getSharedPreferences("saved_tokens_login", 0).edit().clear().apply();
        w0.f19025b.getSharedPreferences("saved_tokens", 0).edit().clear().apply();
    }

    public static ArrayList b() {
        SharedPreferences sharedPreferences = w0.f19025b.getSharedPreferences("saved_tokens_login", 0);
        int i10 = sharedPreferences.getInt("count", 0);
        if (i10 == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < i10; i11++) {
            try {
                SerializedData serializedData = new SerializedData(Utilities.v(sharedPreferences.getString("log_in_token_" + i11, "")));
                TLRPC.auth_Authorization TLdeserialize = TLRPC.auth_Authorization.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                if (TLdeserialize instanceof TLRPC.TL_auth_authorization) {
                    arrayList.add((TLRPC.TL_auth_authorization) TLdeserialize);
                }
            } catch (Exception e) {
                f8.g(e, true);
            }
        }
        return arrayList;
    }
}
