package org.telegram.messenger;

import j$.util.Objects;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.tgnet.ConnectionsManager;
public final class e3 {
    public int f15362a;
    public String f15363b;
    public String f15364c;
    public HashSet d;

    public final void a(String str) {
        int i10 = this.f15362a;
        js.e.remove(Integer.valueOf(hashCode()));
        HashSet hashSet = this.d;
        int[] iArr = new int[hashSet.size()];
        Iterator it = hashSet.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            iArr[i11] = ((Integer) it.next()).intValue();
            i11++;
        }
        ConnectionsManager.getInstance(i10);
        ConnectionsManager.native_receivedCaptchaResult(i10, iArr, str);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f15362a), this.f15363b, this.f15364c);
    }
}
