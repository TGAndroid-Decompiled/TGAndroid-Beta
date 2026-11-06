package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
public abstract class v0 {
    public static void a() {
        t0.f25555b.getSharedPreferences("saved_tokens_login", 0).edit().clear().apply();
        t0.f25555b.getSharedPreferences("saved_tokens", 0).edit().clear().apply();
    }

    public static ArrayList b() {
        SharedPreferences sharedPreferences = t0.f25555b.getSharedPreferences("saved_tokens_login", 0);
        int i7 = sharedPreferences.getInt("count", 0);
        if (i7 == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < i7; i10++) {
            try {
                SerializedData serializedData = new SerializedData(Utilities.v(sharedPreferences.getString("log_in_token_" + i10, "")));
                TLRPC.auth_Authorization TLdeserialize = TLRPC.auth_Authorization.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                if (TLdeserialize instanceof TLRPC.TL_auth_authorization) {
                    arrayList.add((TLRPC.TL_auth_authorization) TLdeserialize);
                }
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
        return arrayList;
    }
}
