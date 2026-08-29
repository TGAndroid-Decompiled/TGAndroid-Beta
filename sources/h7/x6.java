package h7;

import android.os.SystemClock;
public abstract class x6 {
    public static com.google.android.exoplayer2.upstream.j0 a(d5.r rVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = rVar.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (rVar.e(i11, elapsedRealtime)) {
                i10++;
            }
        }
        return new com.google.android.exoplayer2.upstream.j0(1, 0, length, i10);
    }
}
