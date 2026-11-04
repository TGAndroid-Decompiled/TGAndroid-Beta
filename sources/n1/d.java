package n1;

import android.content.Context;
import b8.hb;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.j;
import o1.i;
public final class d {
    public final ja.b f20120a;
    public final i f20121b;
    public final Context f20122c;
    public final String d;
    public final dd.i f20123e;
    public final LinkedHashSet f20124f;

    public d(Context context, String sharedPreferencesName, Set keysToMigrate, ja.b bVar, i iVar) {
        LinkedHashSet linkedHashSet;
        j.e(context, "context");
        j.e(sharedPreferencesName, "sharedPreferencesName");
        j.e(keysToMigrate, "keysToMigrate");
        a aVar = new a(0, context, sharedPreferencesName);
        this.f20120a = bVar;
        this.f20121b = iVar;
        this.f20122c = context;
        this.d = sharedPreferencesName;
        this.f20123e = hb.b(aVar);
        if (keysToMigrate == e.f20125a) {
            linkedHashSet = null;
        } else {
            linkedHashSet = new LinkedHashSet(keysToMigrate);
        }
        this.f20124f = linkedHashSet;
    }

    public final java.lang.Object a(java.lang.Object r5, hd.c r6) {
        throw new UnsupportedOperationException("Method not decompiled: n1.d.a(java.lang.Object, hd.c):java.lang.Object");
    }
}
