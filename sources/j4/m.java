package j4;

import android.content.Context;
import java.util.HashMap;
import java.util.HashSet;
public final class m implements c0 {
    public final b3.b f13505a;
    public final we.b f13506b;
    public final long f13507c;
    public final long d;
    public final long f13508e;
    public final float f13509f;
    public final float f13510g;

    public m(Context context, m3.i iVar) {
        we.b bVar = new we.b(context, 12);
        this.f13506b = bVar;
        ?? obj = new Object();
        obj.f1413a = iVar;
        obj.f1414b = new HashMap();
        obj.f1415c = new HashSet();
        obj.d = new HashMap();
        this.f13505a = obj;
        if (bVar != ((we.b) obj.f1416e)) {
            obj.f1416e = bVar;
            ((HashMap) obj.f1414b).clear();
            ((HashMap) obj.d).clear();
        }
        this.f13507c = -9223372036854775807L;
        this.d = -9223372036854775807L;
        this.f13508e = -9223372036854775807L;
        this.f13509f = -3.4028235E38f;
        this.f13510g = -3.4028235E38f;
    }

    public static c0 b(Class cls, com.google.android.exoplayer2.upstream.l lVar) {
        try {
            return (c0) cls.getConstructor(com.google.android.exoplayer2.upstream.l.class).newInstance(lVar);
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override
    public final j4.a a(h3.f1 r28) {
        throw new UnsupportedOperationException("Method not decompiled: j4.m.a(h3.f1):j4.a");
    }
}
