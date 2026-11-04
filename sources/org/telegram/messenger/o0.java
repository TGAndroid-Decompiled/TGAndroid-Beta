package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.HashSet;
import java.util.Set;
import org.telegram.tgnet.TLRPC;
public final class o0 implements k0 {
    public final String f24468a;
    public final HashSet f24469b;
    public HashSet f24470c;

    public o0(String str, Set set) {
        HashSet hashSet;
        this.f24468a = str;
        if (set == null) {
            hashSet = null;
        } else {
            hashSet = new HashSet(set);
        }
        this.f24469b = hashSet;
    }

    @Override
    public final boolean a(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
        if (jSONValue instanceof TLRPC.TL_jsonArray) {
            TLRPC.TL_jsonArray tL_jsonArray = (TLRPC.TL_jsonArray) jSONValue;
            HashSet hashSet = new HashSet();
            int size = tL_jsonArray.value.size();
            for (int i3 = 0; i3 < size; i3++) {
                TLRPC.JSONValue jSONValue2 = tL_jsonArray.value.get(i3);
                if (jSONValue2 instanceof TLRPC.TL_jsonString) {
                    hashSet.add(((TLRPC.TL_jsonString) jSONValue2).value);
                }
            }
            if (!hashSet.equals(this.f24470c)) {
                this.f24470c = hashSet;
                editor.putStringSet(this.f24468a, new HashSet(this.f24470c));
                return true;
            }
        }
        return false;
    }

    @Override
    public final void b(SharedPreferences sharedPreferences) {
        HashSet hashSet;
        Set<String> stringSet = sharedPreferences.getStringSet(this.f24468a, this.f24469b);
        if (stringSet == null) {
            hashSet = null;
        } else {
            hashSet = new HashSet(stringSet);
        }
        this.f24470c = hashSet;
    }
}
