package g7;

import android.os.SystemClock;

public abstract class e0 {
    public static com.google.android.exoplayer2.upstream.j0 a(b5.s sVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int length = sVar.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (sVar.f(i11, jElapsedRealtime)) {
                i10++;
            }
        }
        return new com.google.android.exoplayer2.upstream.j0(1, 0, length, i10);
    }
}
