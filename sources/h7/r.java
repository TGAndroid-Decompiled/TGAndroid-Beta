package h7;

import com.google.android.exoplayer2.extractor.FlacStreamMetadata;

public abstract class r {
    public static boolean a(d5.z zVar, FlacStreamMetadata flacStreamMetadata, int i10, m3.n nVar) {
        int iR;
        byte[] bArr;
        int i11;
        int i12;
        long jS = zVar.s();
        long j10 = jS >>> 16;
        if (j10 == i10) {
            boolean z10 = (j10 & 1) == 1;
            int i13 = (int) ((jS >> 12) & 15);
            int i14 = (int) ((jS >> 8) & 15);
            int i15 = (int) (15 & (jS >> 4));
            int i16 = (int) ((jS >> 1) & 7);
            boolean z11 = (jS & 1) == 1;
            if (i15 > 7 ? !(i15 > 10 || flacStreamMetadata.channels != 2) : i15 == flacStreamMetadata.channels - 1) {
                if ((i16 == 0 || i16 == flacStreamMetadata.bitsPerSampleLookupKey) && !z11) {
                    try {
                        long jX = zVar.x();
                        if (!z10) {
                            jX *= (long) flacStreamMetadata.maxBlockSizeSamples;
                        }
                        nVar.f17620a = jX;
                        int iB = b(i13, zVar);
                        if (iB != -1 && iB <= flacStreamMetadata.maxBlockSizeSamples) {
                            int i17 = flacStreamMetadata.sampleRate;
                            if (i14 == 0) {
                                iR = zVar.r();
                                int i18 = zVar.f4859b;
                                bArr = zVar.f4858a;
                                i11 = i18 - 1;
                                i12 = 0;
                                for (int i19 = zVar.f4859b; i19 < i11; i19++) {
                                    i12 = d5.g0.f4806n[i12 ^ (bArr[i19] & 255)];
                                }
                                int i20 = d5.g0.f4795a;
                                if (iR == i12) {
                                    return true;
                                }
                            } else if (i14 <= 11) {
                                if (i14 == flacStreamMetadata.sampleRateLookupKey) {
                                    iR = zVar.r();
                                    int i110 = zVar.f4859b;
                                    bArr = zVar.f4858a;
                                    i11 = i110 - 1;
                                    i12 = 0;
                                    while (i19 < i11) {
                                        i12 = d5.g0.f4806n[i12 ^ (bArr[i19] & 255)];
                                    }
                                    int i21 = d5.g0.f4795a;
                                    if (iR == i12) {
                                        return true;
                                    }
                                }
                            } else if (i14 == 12) {
                                if (zVar.r() * 1000 == i17) {
                                    iR = zVar.r();
                                    int i111 = zVar.f4859b;
                                    bArr = zVar.f4858a;
                                    i11 = i111 - 1;
                                    i12 = 0;
                                    while (i19 < i11) {
                                        i12 = d5.g0.f4806n[i12 ^ (bArr[i19] & 255)];
                                    }
                                    int i22 = d5.g0.f4795a;
                                    if (iR == i12) {
                                        return true;
                                    }
                                }
                            } else if (i14 <= 14) {
                                int iW = zVar.w();
                                if (i14 == 14) {
                                    iW *= 10;
                                }
                                if (iW == i17) {
                                    iR = zVar.r();
                                    int i112 = zVar.f4859b;
                                    bArr = zVar.f4858a;
                                    i11 = i112 - 1;
                                    i12 = 0;
                                    while (i19 < i11) {
                                        i12 = d5.g0.f4806n[i12 ^ (bArr[i19] & 255)];
                                    }
                                    int i23 = d5.g0.f4795a;
                                    if (iR == i12) {
                                        return true;
                                    }
                                }
                            }
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
        return false;
    }

    public static int b(int i10, d5.z zVar) {
        switch (i10) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i10 - 2);
            case 6:
                return zVar.r() + 1;
            case 7:
                return zVar.w() + 1;
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
