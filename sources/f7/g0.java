package f7;

import android.os.SystemClock;
public abstract class g0 {
    public static com.google.android.exoplayer2.upstream.j0 a(b5.t tVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = tVar.length();
        int i9 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            if (tVar.f(i10, elapsedRealtime)) {
                i9++;
            }
        }
        return new com.google.android.exoplayer2.upstream.j0(1, 0, length, i9);
    }
}
