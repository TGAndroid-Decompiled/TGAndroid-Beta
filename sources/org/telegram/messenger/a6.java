package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class a6 {
    public final int[] f14578a;
    public final long[] f14579b;
    public boolean f14580c;
    public boolean d;
    public boolean e;
    public boolean f14581f;
    public boolean f14582g;
    public int h;

    public a6(int[] iArr, long j10, long j11, long j12, boolean z10, boolean z11, boolean z12, boolean z13, int i10, boolean z14) {
        int[] iArr2 = new int[4];
        this.f14578a = iArr2;
        this.f14579b = r2;
        System.arraycopy(iArr, 0, iArr2, 0, Math.max(iArr.length, 4));
        long[] jArr = {j10, j11, j12, 524288};
        this.f14580c = z10;
        this.d = z11;
        this.f14581f = z13;
        this.h = i10;
        this.f14582g = z12;
        this.e = z14;
    }

    public final boolean a(a6 a6Var) {
        int[] iArr = this.f14578a;
        int i10 = iArr[0];
        int[] iArr2 = a6Var.f14578a;
        if (i10 == iArr2[0] && iArr[1] == iArr2[1] && iArr[2] == iArr2[2] && iArr[3] == iArr2[3]) {
            long[] jArr = this.f14579b;
            long j10 = jArr[0];
            long[] jArr2 = a6Var.f14579b;
            if (j10 == jArr2[0] && jArr[1] == jArr2[1] && jArr[2] == jArr2[2] && jArr[3] == jArr2[3] && this.f14580c == a6Var.f14580c && this.d == a6Var.d && this.h == a6Var.h && this.e == a6Var.e) {
                return true;
            }
        }
        return false;
    }

    public final boolean b() {
        int i10 = 0;
        while (true) {
            int[] iArr = this.f14578a;
            if (i10 >= iArr.length) {
                return false;
            }
            if (iArr[i10] != 0) {
                return true;
            }
            i10++;
        }
    }

    public final void c(a6 a6Var) {
        int[] iArr = a6Var.f14578a;
        int[] iArr2 = this.f14578a;
        System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
        long[] jArr = a6Var.f14579b;
        long[] jArr2 = this.f14579b;
        System.arraycopy(jArr, 0, jArr2, 0, jArr2.length);
        this.f14580c = a6Var.f14580c;
        this.d = a6Var.d;
        this.f14581f = a6Var.f14581f;
        this.h = a6Var.h;
        this.e = a6Var.e;
    }

    public final void d(TLRPC.TL_autoDownloadSettings tL_autoDownloadSettings) {
        this.d = tL_autoDownloadSettings.audio_preload_next;
        this.f14580c = tL_autoDownloadSettings.video_preload_large;
        this.f14581f = tL_autoDownloadSettings.phonecalls_less_data;
        this.h = tL_autoDownloadSettings.video_upload_maxbitrate;
        long[] jArr = this.f14579b;
        int i10 = 0;
        jArr[0] = Math.max(512000, tL_autoDownloadSettings.photo_size_max);
        jArr[1] = Math.max(512000L, tL_autoDownloadSettings.video_size_max);
        jArr[2] = Math.max(512000L, tL_autoDownloadSettings.file_size_max);
        while (true) {
            int[] iArr = this.f14578a;
            if (i10 < iArr.length) {
                if (tL_autoDownloadSettings.photo_size_max != 0 && !tL_autoDownloadSettings.disabled) {
                    iArr[i10] = iArr[i10] | 1;
                } else {
                    iArr[i10] = iArr[i10] & (-2);
                }
                if (tL_autoDownloadSettings.video_size_max != 0 && !tL_autoDownloadSettings.disabled) {
                    iArr[i10] = iArr[i10] | 4;
                } else {
                    iArr[i10] = iArr[i10] & (-5);
                }
                if (tL_autoDownloadSettings.file_size_max != 0 && !tL_autoDownloadSettings.disabled) {
                    iArr[i10] = iArr[i10] | 8;
                } else {
                    iArr[i10] = iArr[i10] & (-9);
                }
                i10++;
            } else {
                this.e = true;
                return;
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int[] iArr = this.f14578a;
        sb2.append(iArr[0]);
        sb2.append("_");
        sb2.append(iArr[1]);
        sb2.append("_");
        sb2.append(iArr[2]);
        sb2.append("_");
        sb2.append(iArr[3]);
        sb2.append("_");
        long[] jArr = this.f14579b;
        sb2.append(jArr[0]);
        sb2.append("_");
        sb2.append(jArr[1]);
        sb2.append("_");
        sb2.append(jArr[2]);
        sb2.append("_");
        sb2.append(jArr[3]);
        sb2.append("_");
        sb2.append(this.f14580c ? 1 : 0);
        sb2.append("_");
        sb2.append(this.d ? 1 : 0);
        sb2.append("_");
        sb2.append(this.f14582g ? 1 : 0);
        sb2.append("_");
        sb2.append(this.f14581f ? 1 : 0);
        sb2.append("_");
        sb2.append(this.h);
        sb2.append("_");
        sb2.append(this.e ? 1 : 0);
        return sb2.toString();
    }

    public a6(String str, String str2) {
        String[] split;
        int[] iArr = new int[4];
        this.f14578a = iArr;
        long[] jArr = new long[4];
        this.f14579b = jArr;
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
            this.f14580c = Utilities.z(split2[8]).intValue() == 1;
            this.d = Utilities.z(split2[9]).intValue() == 1;
            this.f14582g = Utilities.z(split2[10]).intValue() == 1;
            if (split2.length >= 12) {
                this.f14581f = Utilities.z(split2[11]).intValue() == 1;
                split = null;
            } else {
                split = str2.split("_");
                this.f14581f = Utilities.z(split[11]).intValue() == 1;
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
}
