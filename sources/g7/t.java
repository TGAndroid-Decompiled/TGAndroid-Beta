package g7;

import android.util.Base64;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import java.util.ArrayList;
import java.util.List;
public abstract class t {
    public static z3.c a(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < list.size(); i9++) {
            String str = (String) list.get(i9);
            int i10 = d5.f0.f4349a;
            String[] split = str.split("=", 2);
            if (split.length != 2) {
                d5.a.K("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(PictureFrame.fromPictureBlock(new d5.y(Base64.decode(split[1], 0))));
                } catch (RuntimeException e10) {
                    d5.a.L("VorbisUtil", "Failed to parse vorbis picture", e10);
                }
            } else {
                arrayList.add(new c4.a(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new z3.c(arrayList);
    }

    public static m3.y b(d5.y yVar, boolean z10, boolean z11) {
        if (z10) {
            c(3, yVar, false);
        }
        yVar.p((int) yVar.i(), n8.d.f18513c);
        long i9 = yVar.i();
        String[] strArr = new String[(int) i9];
        for (int i10 = 0; i10 < i9; i10++) {
            strArr[i10] = yVar.p((int) yVar.i(), n8.d.f18513c);
        }
        if (z11 && (yVar.r() & 1) == 0) {
            throw h3.t1.a("framing bit expected to be set", null);
        }
        return new m3.y(strArr);
    }

    public static boolean c(int i9, d5.y yVar, boolean z10) {
        if (yVar.a() < 7) {
            if (!z10) {
                throw h3.t1.a("too short header: " + yVar.a(), null);
            }
            return false;
        } else if (yVar.r() != i9) {
            if (!z10) {
                throw h3.t1.a("expected header type " + Integer.toHexString(i9), null);
            }
            return false;
        } else if (yVar.r() == 118 && yVar.r() == 111 && yVar.r() == 114 && yVar.r() == 98 && yVar.r() == 105 && yVar.r() == 115) {
            return true;
        } else {
            if (z10) {
                return false;
            }
            throw h3.t1.a("expected characters 'vorbis'", null);
        }
    }
}
