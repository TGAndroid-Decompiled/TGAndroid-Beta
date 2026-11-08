package org.telegram.messenger;

import android.content.SharedPreferences;
public final class et {
    public final int f22275a;

    public et(int i7) {
        this.f22275a = i7;
    }

    public final void a(org.telegram.tgnet.TLRPC.NotificationSound r17, android.content.SharedPreferences.Editor r18, long r19, long r21, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.et.a(org.telegram.tgnet.TLRPC$NotificationSound, android.content.SharedPreferences$Editor, long, long, int):void");
    }

    public final SharedPreferences b() {
        return qp.s1(this.f22275a).f24764d7;
    }

    public final int c(int i7, long j3, long j10, String str) {
        String v = dt.v(j3, j10, true);
        SharedPreferences b10 = b();
        if (b10.contains(str + v)) {
            SharedPreferences b11 = b();
            return b11.getInt(str + v, i7);
        }
        String v10 = dt.v(j3, 0L, true);
        SharedPreferences b12 = b();
        return b12.getInt(str + v10, i7);
    }

    public final long d(long j3, long j10) {
        String v = dt.v(j3, j10, true);
        SharedPreferences b10 = b();
        if (b10.contains("sound_document_id_" + v)) {
            SharedPreferences b11 = b();
            return b11.getLong("sound_document_id_" + v, 0L);
        }
        String v10 = dt.v(j3, 0L, true);
        SharedPreferences b12 = b();
        return b12.getLong("sound_document_id_" + v10, 0L);
    }

    public final boolean e(long j3, long j10) {
        String v = dt.v(j3, j10, false);
        SharedPreferences b10 = b();
        if (b10.contains("custom_" + v)) {
            SharedPreferences b11 = b();
            return b11.getBoolean("custom_" + v, false);
        }
        String v10 = dt.v(j3, 0L, false);
        SharedPreferences b12 = b();
        return b12.getBoolean("custom_" + v10, false);
    }

    public final String f(long j3, long j10) {
        String v = dt.v(j3, j10, false);
        SharedPreferences b10 = b();
        if (b10.contains("sound_path_" + v)) {
            SharedPreferences b11 = b();
            return b11.getString("sound_path_" + v, null);
        }
        String v10 = dt.v(j3, 0L, false);
        SharedPreferences b12 = b();
        return b12.getString("sound_path_" + v10, null);
    }
}
