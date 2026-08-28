package g7;
public abstract class r {
    public static boolean a(d5.y r19, com.google.android.exoplayer2.extractor.FlacStreamMetadata r20, int r21, m3.n r22) {
        throw new UnsupportedOperationException("Method not decompiled: g7.r.a(d5.y, com.google.android.exoplayer2.extractor.FlacStreamMetadata, int, m3.n):boolean");
    }

    public static int b(int i9, d5.y yVar) {
        switch (i9) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i9 - 2);
            case 6:
                return yVar.r() + 1;
            case 7:
                return yVar.w() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i9 - 8);
            default:
                return -1;
        }
    }
}
