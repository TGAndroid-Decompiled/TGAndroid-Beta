package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.HashSet;
import java.util.Set;
import org.telegram.tgnet.TLRPC;
public final class r0 implements m0 {
    public final String f17671a;
    public final HashSet f17672b;
    public HashSet f17673c;

    public r0(String str, Set set) {
        HashSet hashSet;
        this.f17671a = str;
        if (set == null) {
            hashSet = null;
        } else {
            hashSet = new HashSet(set);
        }
        this.f17672b = hashSet;
    }

    @Override
    public final boolean a(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
        if (jSONValue instanceof TLRPC.TL_jsonArray) {
            TLRPC.TL_jsonArray tL_jsonArray = (TLRPC.TL_jsonArray) jSONValue;
            HashSet hashSet = new HashSet();
            int size = tL_jsonArray.value.size();
            for (int i10 = 0; i10 < size; i10++) {
                TLRPC.JSONValue jSONValue2 = tL_jsonArray.value.get(i10);
                if (jSONValue2 instanceof TLRPC.TL_jsonString) {
                    hashSet.add(((TLRPC.TL_jsonString) jSONValue2).value);
                }
            }
            if (!hashSet.equals(this.f17673c)) {
                this.f17673c = hashSet;
                editor.putStringSet(this.f17671a, new HashSet(this.f17673c));
                return true;
            }
        }
        return false;
    }

    @Override
    public final void b(SharedPreferences sharedPreferences) {
        HashSet hashSet;
        Set<String> stringSet = sharedPreferences.getStringSet(this.f17671a, this.f17672b);
        if (stringSet == null) {
            hashSet = null;
        } else {
            hashSet = new HashSet(stringSet);
        }
        this.f17673c = hashSet;
    }
}
