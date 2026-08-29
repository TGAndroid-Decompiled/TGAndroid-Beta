package i7;

import android.util.Base64;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import java.util.ArrayList;
import java.util.List;
public abstract class w5 {
    public static b4.c a(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = (String) list.get(i10);
            int i11 = f5.d0.f6579a;
            String[] split = str.split("=", 2);
            if (split.length != 2) {
                f5.a.K("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(PictureFrame.fromPictureBlock(new f5.w(Base64.decode(split[1], 0))));
                } catch (RuntimeException e10) {
                    f5.a.L("VorbisUtil", "Failed to parse vorbis picture", e10);
                }
            } else {
                arrayList.add(new e4.a(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new b4.c(arrayList);
    }

    public static o3.y b(f5.w wVar, boolean z10, boolean z11) {
        if (z10) {
            c(3, wVar, false);
        }
        wVar.p((int) wVar.i(), p8.d.f45658c);
        long i10 = wVar.i();
        String[] strArr = new String[(int) i10];
        for (int i11 = 0; i11 < i10; i11++) {
            strArr[i11] = wVar.p((int) wVar.i(), p8.d.f45658c);
        }
        if (z11 && (wVar.r() & 1) == 0) {
            throw j3.t1.a("framing bit expected to be set", null);
        }
        return new o3.y(strArr);
    }

    public static boolean c(int i10, f5.w wVar, boolean z10) {
        if (wVar.a() < 7) {
            if (!z10) {
                throw j3.t1.a("too short header: " + wVar.a(), null);
            }
            return false;
        } else if (wVar.r() != i10) {
            if (!z10) {
                throw j3.t1.a("expected header type " + Integer.toHexString(i10), null);
            }
            return false;
        } else if (wVar.r() == 118 && wVar.r() == 111 && wVar.r() == 114 && wVar.r() == 98 && wVar.r() == 105 && wVar.r() == 115) {
            return true;
        } else {
            if (z10) {
                return false;
            }
            throw j3.t1.a("expected characters 'vorbis'", null);
        }
    }
}
