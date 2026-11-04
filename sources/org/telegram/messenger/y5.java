package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class y5 {
    public final int[] f26524a;
    public final long[] f26525b;
    public boolean f26526c;
    public boolean d;
    public boolean f26527e;
    public boolean f26528f;
    public boolean f26529g;
    public int h;

    public y5(int[] iArr, long j10, long j11, long j12, boolean z10, boolean z11, boolean z12, boolean z13, int i3, boolean z14) {
        int[] iArr2 = new int[4];
        this.f26524a = iArr2;
        this.f26525b = r2;
        System.arraycopy(iArr, 0, iArr2, 0, Math.max(iArr.length, 4));
        long[] jArr = {j10, j11, j12, 524288};
        this.f26526c = z10;
        this.d = z11;
        this.f26528f = z13;
        this.h = i3;
        this.f26529g = z12;
        this.f26527e = z14;
    }

    public final boolean a(y5 y5Var) {
        int[] iArr = this.f26524a;
        int i3 = iArr[0];
        int[] iArr2 = y5Var.f26524a;
        if (i3 == iArr2[0] && iArr[1] == iArr2[1] && iArr[2] == iArr2[2] && iArr[3] == iArr2[3]) {
            long[] jArr = this.f26525b;
            long j10 = jArr[0];
            long[] jArr2 = y5Var.f26525b;
            if (j10 == jArr2[0] && jArr[1] == jArr2[1] && jArr[2] == jArr2[2] && jArr[3] == jArr2[3] && this.f26526c == y5Var.f26526c && this.d == y5Var.d && this.h == y5Var.h && this.f26527e == y5Var.f26527e) {
                return true;
            }
        }
        return false;
    }

    public final boolean b() {
        int i3 = 0;
        while (true) {
            int[] iArr = this.f26524a;
            if (i3 >= iArr.length) {
                return false;
            }
            if (iArr[i3] != 0) {
                return true;
            }
            i3++;
        }
    }

    public final void c(y5 y5Var) {
        int[] iArr = y5Var.f26524a;
        int[] iArr2 = this.f26524a;
        System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
        long[] jArr = y5Var.f26525b;
        long[] jArr2 = this.f26525b;
        System.arraycopy(jArr, 0, jArr2, 0, jArr2.length);
        this.f26526c = y5Var.f26526c;
        this.d = y5Var.d;
        this.f26528f = y5Var.f26528f;
        this.h = y5Var.h;
        this.f26527e = y5Var.f26527e;
    }

    public final void d(TLRPC.TL_autoDownloadSettings tL_autoDownloadSettings) {
        this.d = tL_autoDownloadSettings.audio_preload_next;
        this.f26526c = tL_autoDownloadSettings.video_preload_large;
        this.f26528f = tL_autoDownloadSettings.phonecalls_less_data;
        this.h = tL_autoDownloadSettings.video_upload_maxbitrate;
        long[] jArr = this.f26525b;
        int i3 = 0;
        jArr[0] = Math.max(512000, tL_autoDownloadSettings.photo_size_max);
        jArr[1] = Math.max(512000L, tL_autoDownloadSettings.video_size_max);
        jArr[2] = Math.max(512000L, tL_autoDownloadSettings.file_size_max);
        while (true) {
            int[] iArr = this.f26524a;
            if (i3 < iArr.length) {
                if (tL_autoDownloadSettings.photo_size_max != 0 && !tL_autoDownloadSettings.disabled) {
                    iArr[i3] = iArr[i3] | 1;
                } else {
                    iArr[i3] = iArr[i3] & (-2);
                }
                if (tL_autoDownloadSettings.video_size_max != 0 && !tL_autoDownloadSettings.disabled) {
                    iArr[i3] = iArr[i3] | 4;
                } else {
                    iArr[i3] = iArr[i3] & (-5);
                }
                if (tL_autoDownloadSettings.file_size_max != 0 && !tL_autoDownloadSettings.disabled) {
                    iArr[i3] = iArr[i3] | 8;
                } else {
                    iArr[i3] = iArr[i3] & (-9);
                }
                i3++;
            } else {
                this.f26527e = true;
                return;
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int[] iArr = this.f26524a;
        sb2.append(iArr[0]);
        sb2.append("_");
        sb2.append(iArr[1]);
        sb2.append("_");
        sb2.append(iArr[2]);
        sb2.append("_");
        sb2.append(iArr[3]);
        sb2.append("_");
        long[] jArr = this.f26525b;
        sb2.append(jArr[0]);
        sb2.append("_");
        sb2.append(jArr[1]);
        sb2.append("_");
        sb2.append(jArr[2]);
        sb2.append("_");
        sb2.append(jArr[3]);
        sb2.append("_");
        sb2.append(this.f26526c ? 1 : 0);
        sb2.append("_");
        sb2.append(this.d ? 1 : 0);
        sb2.append("_");
        sb2.append(this.f26529g ? 1 : 0);
        sb2.append("_");
        sb2.append(this.f26528f ? 1 : 0);
        sb2.append("_");
        sb2.append(this.h);
        sb2.append("_");
        sb2.append(this.f26527e ? 1 : 0);
        return sb2.toString();
    }

    public y5(String str, String str2) {
        String[] split;
        int[] iArr = new int[4];
        this.f26524a = iArr;
        long[] jArr = new long[4];
        this.f26525b = jArr;
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
            this.f26526c = Utilities.z(split2[8]).intValue() == 1;
            this.d = Utilities.z(split2[9]).intValue() == 1;
            this.f26529g = Utilities.z(split2[10]).intValue() == 1;
            if (split2.length >= 12) {
                this.f26528f = Utilities.z(split2[11]).intValue() == 1;
                split = null;
            } else {
                split = str2.split("_");
                this.f26528f = Utilities.z(split[11]).intValue() == 1;
            }
            if (split2.length >= 13) {
                this.h = Utilities.z(split2[12]).intValue();
            } else {
                split = split == null ? str2.split("_") : split;
                this.h = Utilities.z(split[12]).intValue();
            }
            if (split2.length >= 14) {
                this.f26527e = Utilities.z(split2[13]).intValue() == 1;
            } else {
                this.f26527e = Utilities.z((split == null ? str2.split("_") : split)[13]).intValue() == 1;
            }
        }
    }
}
