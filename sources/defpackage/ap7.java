package defpackage;

import android.content.SharedPreferences;
public final class ap7 {
    public final int a;

    public ap7(int i) {
        this.a = i;
    }

    public final void a(org.telegram.tgnet.TLRPC.NotificationSound r17, android.content.SharedPreferences.Editor r18, long r19, long r21, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ap7.a(org.telegram.tgnet.TLRPC$NotificationSound, android.content.SharedPreferences$Editor, long, long, int):void");
    }

    public final SharedPreferences b() {
        return oc7.r1(this.a).W3;
    }

    public final int c(int i, long j, long j2, String str) {
        String p = lo7.p(j, j2, true);
        SharedPreferences b = b();
        if (b.contains(str + p)) {
            return kt6.g(str, p, b(), i);
        }
        return kt6.g(str, lo7.p(j, 0L, true), b(), i);
    }

    public final long d(long j, long j2) {
        String p = lo7.p(j, j2, true);
        SharedPreferences b = b();
        if (b.contains("sound_document_id_" + p)) {
            SharedPreferences b2 = b();
            return b2.getLong("sound_document_id_" + p, 0L);
        }
        String p2 = lo7.p(j, 0L, true);
        SharedPreferences b3 = b();
        return b3.getLong("sound_document_id_" + p2, 0L);
    }

    public final boolean e(long j, long j2) {
        String p = lo7.p(j, j2, false);
        SharedPreferences b = b();
        if (b.contains("custom_" + p)) {
            SharedPreferences b2 = b();
            return b2.getBoolean("custom_" + p, false);
        }
        String p2 = lo7.p(j, 0L, false);
        SharedPreferences b3 = b();
        return b3.getBoolean("custom_" + p2, false);
    }

    public final String f(long j, long j2) {
        String p = lo7.p(j, j2, false);
        SharedPreferences b = b();
        if (b.contains("sound_path_" + p)) {
            SharedPreferences b2 = b();
            return b2.getString("sound_path_" + p, null);
        }
        String p2 = lo7.p(j, 0L, false);
        SharedPreferences b3 = b();
        return b3.getString("sound_path_" + p2, null);
    }
}
