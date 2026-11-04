package e0;

import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;
public final class m0 {
    public final CharSequence f9272a;
    public final Bundle f9273b;
    public final HashSet f9274c;

    public m0(String str, Bundle bundle, HashSet hashSet) {
        this.f9272a = str;
        this.f9273b = bundle;
        this.f9274c = hashSet;
    }

    public static RemoteInput[] a(m0[] m0VarArr) {
        if (m0VarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[m0VarArr.length];
        for (int i3 = 0; i3 < m0VarArr.length; i3++) {
            m0 m0Var = m0VarArr[i3];
            m0Var.getClass();
            RemoteInput.Builder addExtras = new RemoteInput.Builder("extra_voice_reply").setLabel(m0Var.f9272a).setChoices(null).setAllowFreeFormInput(true).addExtras(m0Var.f9273b);
            if (Build.VERSION.SDK_INT >= 26) {
                Iterator it = m0Var.f9274c.iterator();
                while (it.hasNext()) {
                    y6.a.f(addExtras, (String) it.next());
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                d2.d.n(addExtras);
            }
            remoteInputArr[i3] = addExtras.build();
        }
        return remoteInputArr;
    }
}
