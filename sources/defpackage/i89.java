package defpackage;

import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;
public final class i89 {
    public final String a;
    public final Bundle b;
    public final HashSet c;

    public i89(String str, Bundle bundle, HashSet hashSet) {
        this.a = str;
        this.b = bundle;
        this.c = hashSet;
    }

    public static RemoteInput[] a(i89[] i89VarArr) {
        if (i89VarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[i89VarArr.length];
        for (int i = 0; i < i89VarArr.length; i++) {
            i89 i89Var = i89VarArr[i];
            i89Var.getClass();
            RemoteInput.Builder addExtras = new RemoteInput.Builder("extra_voice_reply").setLabel(i89Var.a).setChoices(null).setAllowFreeFormInput(true).addExtras(i89Var.b);
            if (Build.VERSION.SDK_INT >= 26) {
                Iterator it = i89Var.c.iterator();
                while (it.hasNext()) {
                    i10.j(addExtras, (String) it.next());
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                rs.s(addExtras);
            }
            remoteInputArr[i] = addExtras.build();
        }
        return remoteInputArr;
    }
}
