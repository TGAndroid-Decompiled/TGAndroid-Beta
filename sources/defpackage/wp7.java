package defpackage;

import android.content.SharedPreferences;
public final class wp7 {
    public final int a;

    public wp7(int i) {
        this.a = i;
    }

    public final void a(org.telegram.tgnet.TLRPC.NotificationSound r17, android.content.SharedPreferences.Editor r18, long r19, long r21, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wp7.a(org.telegram.tgnet.TLRPC$NotificationSound, android.content.SharedPreferences$Editor, long, long, int):void");
    }

    public final SharedPreferences b() {
        return uc7.s1(this.a).X3;
    }

    public final int c(int i, long j, long j2, String str) {
        String p = ip7.p(j, j2, true);
        SharedPreferences b = b();
        if (b.contains(str + p)) {
            return qu6.g(str, p, b(), i);
        }
        return qu6.g(str, ip7.p(j, 0L, true), b(), i);
    }

    public final long d(long j, long j2) {
        String p = ip7.p(j, j2, true);
        SharedPreferences b = b();
        if (b.contains("sound_document_id_" + p)) {
            SharedPreferences b2 = b();
            return b2.getLong("sound_document_id_" + p, 0L);
        }
        String p2 = ip7.p(j, 0L, true);
        SharedPreferences b3 = b();
        return b3.getLong("sound_document_id_" + p2, 0L);
    }

    public final boolean e(long j, long j2) {
        String p = ip7.p(j, j2, false);
        SharedPreferences b = b();
        if (b.contains("custom_" + p)) {
            SharedPreferences b2 = b();
            return b2.getBoolean("custom_" + p, false);
        }
        String p2 = ip7.p(j, 0L, false);
        SharedPreferences b3 = b();
        return b3.getBoolean("custom_" + p2, false);
    }

    public final String f(long j, long j2) {
        String p = ip7.p(j, j2, false);
        SharedPreferences b = b();
        if (b.contains("sound_path_" + p)) {
            SharedPreferences b2 = b();
            return b2.getString("sound_path_" + p, null);
        }
        String p2 = ip7.p(j, 0L, false);
        SharedPreferences b3 = b();
        return b3.getString("sound_path_" + p2, null);
    }
}
