package o1;

import a8.ab;
import android.content.Context;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.j;
import p1.i;
public final class d {
    public final ka.b f20701a;
    public final i f20702b;
    public final Context f20703c;
    public final String d;
    public final gd.i f20704e;
    public final LinkedHashSet f20705f;

    public d(Context context, String sharedPreferencesName, Set keysToMigrate, ka.b bVar, i iVar) {
        LinkedHashSet linkedHashSet;
        j.e(context, "context");
        j.e(sharedPreferencesName, "sharedPreferencesName");
        j.e(keysToMigrate, "keysToMigrate");
        a aVar = new a(0, context, sharedPreferencesName);
        this.f20701a = bVar;
        this.f20702b = iVar;
        this.f20703c = context;
        this.d = sharedPreferencesName;
        this.f20704e = ab.b(aVar);
        if (keysToMigrate == e.f20706a) {
            linkedHashSet = null;
        } else {
            linkedHashSet = new LinkedHashSet(keysToMigrate);
        }
        this.f20705f = linkedHashSet;
    }

    public final java.lang.Object a(java.lang.Object r5, kd.c r6) {
        throw new UnsupportedOperationException("Method not decompiled: o1.d.a(java.lang.Object, kd.c):java.lang.Object");
    }
}
