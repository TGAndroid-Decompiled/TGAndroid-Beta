package e0;

import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;
public final class l0 {
    public final CharSequence f9924a;
    public final Bundle f9925b;
    public final HashSet f9926c;

    public l0(String str, Bundle bundle, HashSet hashSet) {
        this.f9924a = str;
        this.f9925b = bundle;
        this.f9926c = hashSet;
    }

    public static RemoteInput[] a(l0[] l0VarArr) {
        if (l0VarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[l0VarArr.length];
        for (int i7 = 0; i7 < l0VarArr.length; i7++) {
            l0 l0Var = l0VarArr[i7];
            l0Var.getClass();
            RemoteInput.Builder addExtras = new RemoteInput.Builder("extra_voice_reply").setLabel(l0Var.f9924a).setChoices(null).setAllowFreeFormInput(true).addExtras(l0Var.f9925b);
            if (Build.VERSION.SDK_INT >= 26) {
                Iterator it = l0Var.f9926c.iterator();
                while (it.hasNext()) {
                    f2.h.f(addExtras, (String) it.next());
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                ab.y.n(addExtras);
            }
            remoteInputArr[i7] = addExtras.build();
        }
        return remoteInputArr;
    }
}
