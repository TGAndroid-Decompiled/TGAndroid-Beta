package defpackage;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class dr3 {
    public final int[] a;
    public final long[] b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;

    public dr3(String str, String str2) {
        boolean z;
        boolean z2;
        boolean z3;
        String[] split;
        boolean z4;
        boolean z5;
        int[] iArr = new int[4];
        this.a = iArr;
        long[] jArr = new long[4];
        this.b = jArr;
        String[] split2 = str.split("_");
        if (split2.length >= 11) {
            iArr[0] = Utilities.z(split2[0]).intValue();
            iArr[1] = Utilities.z(split2[1]).intValue();
            iArr[2] = Utilities.z(split2[2]).intValue();
            iArr[3] = Utilities.z(split2[3]).intValue();
            jArr[0] = Utilities.z(split2[4]).intValue();
            jArr[1] = Utilities.z(split2[5]).intValue();
            jArr[2] = Utilities.z(split2[6]).intValue();
            jArr[3] = Utilities.z(split2[7]).intValue();
            if (Utilities.z(split2[8]).intValue() == 1) {
                z = true;
            } else {
                z = false;
            }
            this.c = z;
            if (Utilities.z(split2[9]).intValue() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.d = z2;
            if (Utilities.z(split2[10]).intValue() == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.g = z3;
            if (split2.length >= 12) {
                if (Utilities.z(split2[11]).intValue() == 1) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                this.f = z5;
                split = null;
            } else {
                split = str2.split("_");
                if (Utilities.z(split[11]).intValue() == 1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.f = z4;
            }
            if (split2.length >= 13) {
                this.h = Utilities.z(split2[12]).intValue();
            } else {
                split = split == null ? str2.split("_") : split;
                this.h = Utilities.z(split[12]).intValue();
            }
            if (split2.length >= 14) {
                this.e = Utilities.z(split2[13]).intValue() == 1;
            } else {
                this.e = Utilities.z((split == null ? str2.split("_") : split)[13]).intValue() == 1;
            }
        }
    }

    public final boolean a(dr3 dr3Var) {
        int[] iArr = this.a;
        int i = iArr[0];
        int[] iArr2 = dr3Var.a;
        if (i == iArr2[0] && iArr[1] == iArr2[1] && iArr[2] == iArr2[2] && iArr[3] == iArr2[3]) {
            long[] jArr = this.b;
            long j = jArr[0];
            long[] jArr2 = dr3Var.b;
            if (j == jArr2[0] && jArr[1] == jArr2[1] && jArr[2] == jArr2[2] && jArr[3] == jArr2[3] && this.c == dr3Var.c && this.d == dr3Var.d && this.h == dr3Var.h && this.e == dr3Var.e) {
                return true;
            }
        }
        return false;
    }

    public final boolean b() {
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                return false;
            }
            if (iArr[i] != 0) {
                return true;
            }
            i++;
        }
    }

    public final void c(dr3 dr3Var) {
        int[] iArr = dr3Var.a;
        int[] iArr2 = this.a;
        System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
        long[] jArr = dr3Var.b;
        long[] jArr2 = this.b;
        System.arraycopy(jArr, 0, jArr2, 0, jArr2.length);
        this.c = dr3Var.c;
        this.d = dr3Var.d;
        this.f = dr3Var.f;
        this.h = dr3Var.h;
        this.e = dr3Var.e;
    }

    public final void d(TLRPC.TL_autoDownloadSettings tL_autoDownloadSettings) {
        this.d = tL_autoDownloadSettings.audio_preload_next;
        this.c = tL_autoDownloadSettings.video_preload_large;
        this.f = tL_autoDownloadSettings.phonecalls_less_data;
        this.h = tL_autoDownloadSettings.video_upload_maxbitrate;
        long[] jArr = this.b;
        int i = 0;
        jArr[0] = Math.max(512000, tL_autoDownloadSettings.photo_size_max);
        jArr[1] = Math.max(512000L, tL_autoDownloadSettings.video_size_max);
        jArr[2] = Math.max(512000L, tL_autoDownloadSettings.file_size_max);
        while (true) {
            int[] iArr = this.a;
            if (i < iArr.length) {
                if (tL_autoDownloadSettings.photo_size_max != 0 && !tL_autoDownloadSettings.disabled) {
                    iArr[i] = iArr[i] | 1;
                } else {
                    iArr[i] = iArr[i] & (-2);
                }
                if (tL_autoDownloadSettings.video_size_max != 0 && !tL_autoDownloadSettings.disabled) {
                    iArr[i] = iArr[i] | 4;
                } else {
                    iArr[i] = iArr[i] & (-5);
                }
                if (tL_autoDownloadSettings.file_size_max != 0 && !tL_autoDownloadSettings.disabled) {
                    iArr[i] = iArr[i] | 8;
                } else {
                    iArr[i] = iArr[i] & (-9);
                }
                i++;
            } else {
                this.e = true;
                return;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int[] iArr = this.a;
        sb.append(iArr[0]);
        sb.append("_");
        sb.append(iArr[1]);
        sb.append("_");
        sb.append(iArr[2]);
        sb.append("_");
        sb.append(iArr[3]);
        sb.append("_");
        long[] jArr = this.b;
        sb.append(jArr[0]);
        sb.append("_");
        sb.append(jArr[1]);
        sb.append("_");
        sb.append(jArr[2]);
        sb.append("_");
        sb.append(jArr[3]);
        sb.append("_");
        sb.append(this.c ? 1 : 0);
        sb.append("_");
        sb.append(this.d ? 1 : 0);
        sb.append("_");
        sb.append(this.g ? 1 : 0);
        sb.append("_");
        sb.append(this.f ? 1 : 0);
        sb.append("_");
        sb.append(this.h);
        sb.append("_");
        sb.append(this.e ? 1 : 0);
        return sb.toString();
    }

    public dr3(int[] iArr, long j, long j2, long j3, boolean z, boolean z2, boolean z3, boolean z4, int i, boolean z5) {
        int[] iArr2 = new int[4];
        this.a = iArr2;
        this.b = r2;
        System.arraycopy(iArr, 0, iArr2, 0, Math.max(iArr.length, 4));
        long[] jArr = {j, j2, j3, 524288};
        this.c = z;
        this.d = z2;
        this.f = z4;
        this.h = i;
        this.g = z3;
        this.e = z5;
    }
}
