package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.HashSet;
import java.util.Set;
import org.telegram.tgnet.TLRPC;
public final class o0 implements k0 {
    public final String f24264a;
    public final HashSet f24265b;
    public HashSet f24266c;

    public o0(String str, Set set) {
        HashSet hashSet;
        this.f24264a = str;
        if (set == null) {
            hashSet = null;
        } else {
            hashSet = new HashSet(set);
        }
        this.f24265b = hashSet;
    }

    @Override
    public final boolean a(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
        if (jSONValue instanceof TLRPC.TL_jsonArray) {
            TLRPC.TL_jsonArray tL_jsonArray = (TLRPC.TL_jsonArray) jSONValue;
            HashSet hashSet = new HashSet();
            int size = tL_jsonArray.value.size();
            for (int i7 = 0; i7 < size; i7++) {
                TLRPC.JSONValue jSONValue2 = tL_jsonArray.value.get(i7);
                if (jSONValue2 instanceof TLRPC.TL_jsonString) {
                    hashSet.add(((TLRPC.TL_jsonString) jSONValue2).value);
                }
            }
            if (!hashSet.equals(this.f24266c)) {
                this.f24266c = hashSet;
                editor.putStringSet(this.f24264a, new HashSet(this.f24266c));
                return true;
            }
        }
        return false;
    }

    @Override
    public final void b(SharedPreferences sharedPreferences) {
        HashSet hashSet;
        Set<String> stringSet = sharedPreferences.getStringSet(this.f24264a, this.f24265b);
        if (stringSet == null) {
            hashSet = null;
        } else {
            hashSet = new HashSet(stringSet);
        }
        this.f24266c = hashSet;
    }
}
