package e0;

import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;
public final class l0 {
    public final CharSequence f10239a;
    public final Bundle f10240b;
    public final HashSet f10241c;

    public l0(String str, Bundle bundle, HashSet hashSet) {
        this.f10239a = str;
        this.f10240b = bundle;
        this.f10241c = hashSet;
    }

    public static RemoteInput[] a(l0[] l0VarArr) {
        if (l0VarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[l0VarArr.length];
        for (int i7 = 0; i7 < l0VarArr.length; i7++) {
            l0 l0Var = l0VarArr[i7];
            l0Var.getClass();
            RemoteInput.Builder addExtras = new RemoteInput.Builder("extra_voice_reply").setLabel(l0Var.f10239a).setChoices(null).setAllowFreeFormInput(true).addExtras(l0Var.f10240b);
            if (Build.VERSION.SDK_INT >= 26) {
                Iterator it = l0Var.f10241c.iterator();
                while (it.hasNext()) {
                    f2.i.f(addExtras, (String) it.next());
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
