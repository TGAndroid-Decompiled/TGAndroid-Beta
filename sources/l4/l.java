package l4;

import android.content.Context;
import java.util.HashMap;
import java.util.HashSet;
public final class l implements b0 {
    public final a5.j f14360a;
    public final ze.b f14361b;
    public final long f14362c;
    public final long d;
    public final long f14363e;
    public final float f14364f;
    public final float f14365g;

    public l(Context context, o3.i iVar) {
        com.google.android.exoplayer2.upstream.w wVar = new com.google.android.exoplayer2.upstream.w();
        ?? obj = new Object();
        obj.f50824a = context.getApplicationContext();
        obj.f50825b = wVar;
        this.f14361b = obj;
        ?? obj2 = new Object();
        obj2.f211a = iVar;
        obj2.d = new HashMap();
        obj2.f212b = new HashSet();
        obj2.f214e = new HashMap();
        this.f14360a = obj2;
        if (obj != ((ze.b) obj2.f213c)) {
            obj2.f213c = obj;
            ((HashMap) obj2.d).clear();
            ((HashMap) obj2.f214e).clear();
        }
        this.f14362c = -9223372036854775807L;
        this.d = -9223372036854775807L;
        this.f14363e = -9223372036854775807L;
        this.f14364f = -3.4028235E38f;
        this.f14365g = -3.4028235E38f;
    }

    public static b0 b(Class cls, com.google.android.exoplayer2.upstream.l lVar) {
        try {
            return (b0) cls.getConstructor(com.google.android.exoplayer2.upstream.l.class).newInstance(lVar);
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override
    public final l4.a a(j3.f1 r28) {
        throw new UnsupportedOperationException("Method not decompiled: l4.l.a(j3.f1):l4.a");
    }
}
