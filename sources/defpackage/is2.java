package defpackage;

import android.content.SharedPreferences;
import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.telegram.tgnet.TLRPC;
public final class is2 extends yr2 {
    public final Set d;
    public final int e;
    public volatile Set f;

    public is2(String str, Set set, int i) {
        super(str);
        Set unmodifiableSet = DesugarCollections.unmodifiableSet(new HashSet(set));
        this.d = unmodifiableSet;
        this.e = i;
        this.f = unmodifiableSet;
    }

    @Override
    public final boolean b(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
        if (jSONValue instanceof TLRPC.TL_jsonArray) {
            TLRPC.TL_jsonArray tL_jsonArray = (TLRPC.TL_jsonArray) jSONValue;
            HashSet hashSet = new HashSet();
            int size = tL_jsonArray.value.size();
            for (int i = 0; i < size; i++) {
                TLRPC.JSONValue jSONValue2 = tL_jsonArray.value.get(i);
                if (jSONValue2 instanceof TLRPC.TL_jsonNumber) {
                    double d = ((TLRPC.TL_jsonNumber) jSONValue2).value;
                    if (d == Math.rint(d) && Math.abs(d) < 9.223372036854776E18d) {
                        hashSet.add(Long.valueOf((long) d));
                    }
                } else if (jSONValue2 instanceof TLRPC.TL_jsonString) {
                    String str = ((TLRPC.TL_jsonString) jSONValue2).value;
                    Long l = null;
                    if (str != null) {
                        try {
                            l = Long.valueOf(Long.parseLong(str));
                        } catch (NumberFormatException unused) {
                        }
                    }
                    if (l != null) {
                        hashSet.add(l);
                    }
                }
            }
            if (!hashSet.equals(this.f)) {
                this.f = DesugarCollections.unmodifiableSet(hashSet);
                HashSet hashSet2 = new HashSet();
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    hashSet2.add(Long.toString(((Long) it.next()).longValue()));
                }
                editor.putStringSet(e(), hashSet2);
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean c(SharedPreferences.Editor editor) {
        if (this.e == 2 && !this.f.equals(this.d)) {
            this.f = this.d;
            editor.remove(e());
            return true;
        }
        return false;
    }

    @Override
    public final void d(android.content.SharedPreferences r5) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.is2.d(android.content.SharedPreferences):void");
    }

    public final String toString() {
        return this.a + "=" + this.f;
    }
}
