package defpackage;

import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;
public final class g69 {
    public final String a;
    public final Bundle b;
    public final HashSet c;

    public g69(String str, Bundle bundle, HashSet hashSet) {
        this.a = str;
        this.b = bundle;
        this.c = hashSet;
    }

    public static RemoteInput[] a(g69[] g69VarArr) {
        if (g69VarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[g69VarArr.length];
        for (int i = 0; i < g69VarArr.length; i++) {
            g69 g69Var = g69VarArr[i];
            g69Var.getClass();
            RemoteInput.Builder addExtras = new RemoteInput.Builder("extra_voice_reply").setLabel(g69Var.a).setChoices(null).setAllowFreeFormInput(true).addExtras(g69Var.b);
            if (Build.VERSION.SDK_INT >= 26) {
                Iterator it = g69Var.c.iterator();
                while (it.hasNext()) {
                    i00.j(addExtras, (String) it.next());
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                rr.s(addExtras);
            }
            remoteInputArr[i] = addExtras.build();
        }
        return remoteInputArr;
    }
}
