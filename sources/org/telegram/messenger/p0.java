package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.telegram.tgnet.TLRPC;
public final class p0 implements m0 {
    public Set f17545b = Collections.EMPTY_SET;
    public final String f17544a = "agent_bot_ids";

    @Override
    public final boolean a(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
        if (jSONValue instanceof TLRPC.TL_jsonArray) {
            TLRPC.TL_jsonArray tL_jsonArray = (TLRPC.TL_jsonArray) jSONValue;
            HashSet hashSet = new HashSet();
            int size = tL_jsonArray.value.size();
            for (int i10 = 0; i10 < size; i10++) {
                TLRPC.JSONValue jSONValue2 = tL_jsonArray.value.get(i10);
                if (jSONValue2 instanceof TLRPC.TL_jsonNumber) {
                    hashSet.add(Long.valueOf((long) ((TLRPC.TL_jsonNumber) jSONValue2).value));
                } else if (jSONValue2 instanceof TLRPC.TL_jsonString) {
                    try {
                        hashSet.add(Long.valueOf(Long.parseLong(((TLRPC.TL_jsonString) jSONValue2).value)));
                    } catch (NumberFormatException unused) {
                    }
                }
            }
            if (!hashSet.equals(this.f17545b)) {
                this.f17545b = hashSet;
                HashSet hashSet2 = new HashSet();
                for (Long l4 : this.f17545b) {
                    hashSet2.add(Long.toString(l4.longValue()));
                }
                editor.putStringSet(this.f17544a, hashSet2);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void b(SharedPreferences sharedPreferences) {
        Set<String> stringSet = sharedPreferences.getStringSet(this.f17544a, null);
        HashSet hashSet = new HashSet();
        if (stringSet != null) {
            for (String str : stringSet) {
                try {
                    hashSet.add(Long.valueOf(Long.parseLong(str)));
                } catch (NumberFormatException unused) {
                }
            }
        }
        this.f17545b = hashSet;
    }
}
