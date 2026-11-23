package o1;

import android.content.Context;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.j;
import p1.i;
public final class d {
    public final ka.b f21614a;
    public final i f21615b;
    public final Context f21616c;
    public final String d;
    public final gd.i f21617e;
    public final LinkedHashSet f21618f;

    public d(Context context, String sharedPreferencesName, Set keysToMigrate, ka.b bVar, i iVar) {
        LinkedHashSet linkedHashSet;
        j.e(context, "context");
        j.e(sharedPreferencesName, "sharedPreferencesName");
        j.e(keysToMigrate, "keysToMigrate");
        a aVar = new a(0, context, sharedPreferencesName);
        this.f21614a = bVar;
        this.f21615b = iVar;
        this.f21616c = context;
        this.d = sharedPreferencesName;
        this.f21617e = b5.a.c(aVar);
        if (keysToMigrate == e.f21619a) {
            linkedHashSet = null;
        } else {
            linkedHashSet = new LinkedHashSet(keysToMigrate);
        }
        this.f21618f = linkedHashSet;
    }

    public final java.lang.Object a(java.lang.Object r5, kd.c r6) {
        throw new UnsupportedOperationException("Method not decompiled: o1.d.a(java.lang.Object, kd.c):java.lang.Object");
    }
}
