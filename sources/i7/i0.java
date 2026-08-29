package i7;
public abstract class i0 {
    public static boolean a(f5.w r19, com.google.android.exoplayer2.extractor.FlacStreamMetadata r20, int r21, o3.n r22) {
        throw new UnsupportedOperationException("Method not decompiled: i7.i0.a(f5.w, com.google.android.exoplayer2.extractor.FlacStreamMetadata, int, o3.n):boolean");
    }

    public static int b(int i10, f5.w wVar) {
        switch (i10) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i10 - 2);
            case 6:
                return wVar.r() + 1;
            case 7:
                return wVar.w() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i10 - 8);
            default:
                return -1;
        }
    }
}
