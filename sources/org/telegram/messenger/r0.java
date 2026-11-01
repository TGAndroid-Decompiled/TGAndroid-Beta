package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.HashSet;
import java.util.Set;
import org.telegram.tgnet.TLRPC;
public final class r0 implements m0 {
    public final String f17873a;
    public final HashSet f17874b;
    public HashSet f17875c;

    public r0(String str, Set set) {
        HashSet hashSet;
        this.f17873a = str;
        if (set == null) {
            hashSet = null;
        } else {
            hashSet = new HashSet(set);
        }
        this.f17874b = hashSet;
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
            if (!hashSet.equals(this.f17875c)) {
                this.f17875c = hashSet;
                editor.putStringSet(this.f17873a, new HashSet(this.f17875c));
                return true;
            }
        }
        return false;
    }

    @Override
    public final void b(SharedPreferences sharedPreferences) {
        HashSet hashSet;
        Set<String> stringSet = sharedPreferences.getStringSet(this.f17873a, this.f17874b);
        if (stringSet == null) {
            hashSet = null;
        } else {
            hashSet = new HashSet(stringSet);
        }
        this.f17875c = hashSet;
    }
}
