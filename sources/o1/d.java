package o1;

import a8.ab;
import android.content.Context;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.j;
import p1.i;
public final class d {
    public final ka.b f20706a;
    public final i f20707b;
    public final Context f20708c;
    public final String d;
    public final gd.i f20709e;
    public final LinkedHashSet f20710f;

    public d(Context context, String sharedPreferencesName, Set keysToMigrate, ka.b bVar, i iVar) {
        LinkedHashSet linkedHashSet;
        j.e(context, "context");
        j.e(sharedPreferencesName, "sharedPreferencesName");
        j.e(keysToMigrate, "keysToMigrate");
        a aVar = new a(0, context, sharedPreferencesName);
        this.f20706a = bVar;
        this.f20707b = iVar;
        this.f20708c = context;
        this.d = sharedPreferencesName;
        this.f20709e = ab.b(aVar);
        if (keysToMigrate == e.f20711a) {
            linkedHashSet = null;
        } else {
            linkedHashSet = new LinkedHashSet(keysToMigrate);
        }
        this.f20710f = linkedHashSet;
    }

    public final java.lang.Object a(java.lang.Object r5, kd.c r6) {
        throw new UnsupportedOperationException("Method not decompiled: o1.d.a(java.lang.Object, kd.c):java.lang.Object");
    }
}
