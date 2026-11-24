package defpackage;

import android.os.SystemClock;
import java.nio.charset.StandardCharsets;
import org.json.JSONObject;
public final class qxc {
    public static final String[] m = {"t.me", "telegram.me", "telegram.dog"};
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public int d;
    public int e;
    public boolean i;
    public boolean j;
    public int l;
    public long f = -4611686018427387904L;
    public long g = -4611686018427387904L;
    public long h = -4611686018427387904L;
    public final long[] k = new long[10];

    public qxc(JSONObject jSONObject) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if (jSONObject != null && jSONObject.optBoolean("preview")) {
            z = true;
        } else {
            z = false;
        }
        if (jSONObject != null && !z && jSONObject.optBoolean("canQuery")) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.a = z2;
        if (z2 && jSONObject.optBoolean("backgroundQuery")) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.b = z3;
        if (z2 && jSONObject.has("wallet") && !jSONObject.isNull("wallet")) {
            z4 = true;
        }
        this.c = z4;
    }

    public final synchronized boolean a(boolean z) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (z) {
            long[] jArr = this.k;
            int i = this.l;
            if (elapsedRealtime - jArr[i] >= 1000) {
                jArr[i] = elapsedRealtime;
                this.l = (i + 1) % jArr.length;
                return true;
            }
        }
        return false;
    }

    public final boolean b(long j) {
        if (this.e < this.d && j - this.f <= 10000) {
            return true;
        }
        return false;
    }

    public final synchronized boolean c(boolean z) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (z && b(elapsedRealtime)) {
            this.e = this.d;
            return true;
        }
        return false;
    }

    public final synchronized boolean d(String str, boolean z, boolean z2) {
        if (!this.a || this.i || str == null || str.getBytes(StandardCharsets.UTF_8).length > 64 || (z && !this.c)) {
            return false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (z2 && b(elapsedRealtime)) {
            this.e = this.d;
            this.h = -4611686018427387904L;
            this.j = true;
        } else if (!this.b || z || elapsedRealtime - this.g < 1000) {
            return false;
        } else {
            this.g = elapsedRealtime;
        }
        this.i = true;
        return true;
    }

    public final synchronized boolean e(String str, boolean z) {
        if (!this.c || this.i || str == null || str.length() > 262144 || !z) {
            return false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (b(elapsedRealtime)) {
            this.e = this.d;
        } else if (elapsedRealtime - this.h > 10000) {
            return false;
        }
        this.h = -4611686018427387904L;
        this.j = true;
        this.i = true;
        return true;
    }
}
