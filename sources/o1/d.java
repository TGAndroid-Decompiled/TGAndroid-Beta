package o1;

import android.content.Context;
import b7.h;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.j;
import p1.i;
public final class d {
    public final ka.b f21679a;
    public final i f21680b;
    public final Context f21681c;
    public final String d;
    public final gd.i f21682e;
    public final LinkedHashSet f21683f;

    public d(Context context, String sharedPreferencesName, Set keysToMigrate, ka.b bVar, i iVar) {
        LinkedHashSet linkedHashSet;
        j.e(context, "context");
        j.e(sharedPreferencesName, "sharedPreferencesName");
        j.e(keysToMigrate, "keysToMigrate");
        a aVar = new a(0, context, sharedPreferencesName);
        this.f21679a = bVar;
        this.f21680b = iVar;
        this.f21681c = context;
        this.d = sharedPreferencesName;
        this.f21682e = h.b(aVar);
        if (keysToMigrate == e.f21684a) {
            linkedHashSet = null;
        } else {
            linkedHashSet = new LinkedHashSet(keysToMigrate);
        }
        this.f21683f = linkedHashSet;
    }

    public final java.lang.Object a(java.lang.Object r5, kd.c r6) {
        throw new UnsupportedOperationException("Method not decompiled: o1.d.a(java.lang.Object, kd.c):java.lang.Object");
    }
}
