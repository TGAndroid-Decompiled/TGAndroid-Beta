package e0;

import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;
public final class n0 {
    public final CharSequence f9570a;
    public final Bundle f9571b;
    public final HashSet f9572c;

    public n0(String str, Bundle bundle, HashSet hashSet) {
        this.f9570a = str;
        this.f9571b = bundle;
        this.f9572c = hashSet;
    }

    public static RemoteInput[] a(n0[] n0VarArr) {
        if (n0VarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[n0VarArr.length];
        for (int i10 = 0; i10 < n0VarArr.length; i10++) {
            n0 n0Var = n0VarArr[i10];
            n0Var.getClass();
            RemoteInput.Builder addExtras = new RemoteInput.Builder("extra_voice_reply").setLabel(n0Var.f9570a).setChoices(null).setAllowFreeFormInput(true).addExtras(n0Var.f9571b);
            if (Build.VERSION.SDK_INT >= 26) {
                Iterator it = n0Var.f9572c.iterator();
                while (it.hasNext()) {
                    x6.a.c(addExtras, (String) it.next());
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                b2.d.m(addExtras);
            }
            remoteInputArr[i10] = addExtras.build();
        }
        return remoteInputArr;
    }
}
