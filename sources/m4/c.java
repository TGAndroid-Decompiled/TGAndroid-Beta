package m4;

import android.net.Uri;
import f5.d0;
import j3.g;
import java.util.Arrays;
import k3.d;
public final class c implements g {
    public static final c f16848f = new c(new b[0], 0, -9223372036854775807L, 0);
    public static final b h;
    public static final String f16849n;
    public static final String f16850r;
    public static final String f16851s;
    public static final String v;
    public static final d f16852w;
    public final int f16853a;
    public final long f16854b;
    public final long f16855c;
    public final int d;
    public final b[] f16856e;

    static {
        b bVar = new b(0L, -1, -1, new int[0], new Uri[0], new long[0], 0L, false);
        int[] iArr = bVar.f16845e;
        int length = iArr.length;
        int max = Math.max(0, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = bVar.f16846f;
        int length2 = jArr.length;
        int max2 = Math.max(0, length2);
        long[] copyOf2 = Arrays.copyOf(jArr, max2);
        Arrays.fill(copyOf2, length2, max2, -9223372036854775807L);
        h = new b(bVar.f16842a, 0, bVar.f16844c, copyOf, (Uri[]) Arrays.copyOf(bVar.d, 0), copyOf2, bVar.h, bVar.f16847n);
        int i10 = d0.f6579a;
        f16849n = Integer.toString(1, 36);
        f16850r = Integer.toString(2, 36);
        f16851s = Integer.toString(3, 36);
        v = Integer.toString(4, 36);
        f16852w = new d(29);
    }

    public c(b[] bVarArr, long j10, long j11, int i10) {
        this.f16854b = j10;
        this.f16855c = j11;
        this.f16853a = bVarArr.length + i10;
        this.f16856e = bVarArr;
        this.d = i10;
    }

    public final b a(int i10) {
        int i11 = this.d;
        if (i10 < i11) {
            return h;
        }
        return this.f16856e[i10 - i11];
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && c.class == obj.getClass()) {
                c cVar = (c) obj;
                int i10 = d0.f6579a;
                if (this.f16853a == cVar.f16853a && this.f16854b == cVar.f16854b && this.f16855c == cVar.f16855c && this.d == cVar.d && Arrays.equals(this.f16856e, cVar.f16856e)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((this.f16853a * 961) + ((int) this.f16854b)) * 31) + ((int) this.f16855c)) * 31) + this.d) * 31) + Arrays.hashCode(this.f16856e);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=");
        sb2.append(this.f16854b);
        sb2.append(", adGroups=[");
        int i10 = 0;
        while (true) {
            b[] bVarArr = this.f16856e;
            if (i10 < bVarArr.length) {
                sb2.append("adGroup(timeUs=");
                sb2.append(bVarArr[i10].f16842a);
                sb2.append(", ads=[");
                for (int i11 = 0; i11 < bVarArr[i10].f16845e.length; i11++) {
                    sb2.append("ad(state=");
                    int i12 = bVarArr[i10].f16845e[i11];
                    if (i12 != 0) {
                        if (i12 != 1) {
                            if (i12 != 2) {
                                if (i12 != 3) {
                                    if (i12 != 4) {
                                        sb2.append('?');
                                    } else {
                                        sb2.append('!');
                                    }
                                } else {
                                    sb2.append('P');
                                }
                            } else {
                                sb2.append('S');
                            }
                        } else {
                            sb2.append('R');
                        }
                    } else {
                        sb2.append('_');
                    }
                    sb2.append(", durationUs=");
                    sb2.append(bVarArr[i10].f16846f[i11]);
                    sb2.append(')');
                    if (i11 < bVarArr[i10].f16845e.length - 1) {
                        sb2.append(", ");
                    }
                }
                sb2.append("])");
                if (i10 < bVarArr.length - 1) {
                    sb2.append(", ");
                }
                i10++;
            } else {
                sb2.append("])");
                return sb2.toString();
            }
        }
    }
}
