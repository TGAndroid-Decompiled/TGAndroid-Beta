package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.telegram.tgnet.TLRPC;
public final class m0 implements k0 {
    public Set f24154b = Collections.EMPTY_SET;
    public final String f24153a = "agent_bot_ids";

    @Override
    public final boolean a(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
        if (jSONValue instanceof TLRPC.TL_jsonArray) {
            TLRPC.TL_jsonArray tL_jsonArray = (TLRPC.TL_jsonArray) jSONValue;
            HashSet hashSet = new HashSet();
            int size = tL_jsonArray.value.size();
            for (int i3 = 0; i3 < size; i3++) {
                TLRPC.JSONValue jSONValue2 = tL_jsonArray.value.get(i3);
                if (jSONValue2 instanceof TLRPC.TL_jsonNumber) {
                    hashSet.add(Long.valueOf((long) ((TLRPC.TL_jsonNumber) jSONValue2).value));
                } else if (jSONValue2 instanceof TLRPC.TL_jsonString) {
                    try {
                        hashSet.add(Long.valueOf(Long.parseLong(((TLRPC.TL_jsonString) jSONValue2).value)));
                    } catch (NumberFormatException unused) {
                    }
                }
            }
            if (!hashSet.equals(this.f24154b)) {
                this.f24154b = hashSet;
                HashSet hashSet2 = new HashSet();
                for (Long l10 : this.f24154b) {
                    hashSet2.add(Long.toString(l10.longValue()));
                }
                editor.putStringSet(this.f24153a, hashSet2);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void b(SharedPreferences sharedPreferences) {
        Set<String> stringSet = sharedPreferences.getStringSet(this.f24153a, null);
        HashSet hashSet = new HashSet();
        if (stringSet != null) {
            for (String str : stringSet) {
                try {
                    hashSet.add(Long.valueOf(Long.parseLong(str)));
                } catch (NumberFormatException unused) {
                }
            }
        }
        this.f24154b = hashSet;
    }
}
