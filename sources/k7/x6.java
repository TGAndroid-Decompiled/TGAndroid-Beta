package k7;

import android.util.Base64;
import java.util.ArrayList;
import java.util.List;
public abstract class x6 {
    public static e4.c a(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = (String) list.get(i10);
            int i11 = h5.d0.f7237a;
            String[] split = str.split("=", 2);
            if (split.length != 2) {
                h5.a.K("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(h4.a.a(new h5.w(Base64.decode(split[1], 0))));
                } catch (RuntimeException e6) {
                    h5.a.L("VorbisUtil", "Failed to parse vorbis picture", e6);
                }
            } else {
                arrayList.add(new h4.b(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new e4.c(arrayList);
    }

    public static r3.x b(h5.w wVar, boolean z4, boolean z10) {
        if (z4) {
            c(3, wVar, false);
        }
        wVar.s((int) wVar.l(), r8.d.f46769c);
        long l10 = wVar.l();
        String[] strArr = new String[(int) l10];
        for (int i10 = 0; i10 < l10; i10++) {
            strArr[i10] = wVar.s((int) wVar.l(), r8.d.f46769c);
        }
        if (z10 && (wVar.u() & 1) == 0) {
            throw j3.r1.a("framing bit expected to be set", null);
        }
        return new r3.x(strArr);
    }

    public static boolean c(int i10, h5.w wVar, boolean z4) {
        if (wVar.a() < 7) {
            if (!z4) {
                throw j3.r1.a("too short header: " + wVar.a(), null);
            }
            return false;
        } else if (wVar.u() != i10) {
            if (!z4) {
                throw j3.r1.a("expected header type " + Integer.toHexString(i10), null);
            }
            return false;
        } else if (wVar.u() == 118 && wVar.u() == 111 && wVar.u() == 114 && wVar.u() == 98 && wVar.u() == 105 && wVar.u() == 115) {
            return true;
        } else {
            if (z4) {
                return false;
            }
            throw j3.r1.a("expected characters 'vorbis'", null);
        }
    }
}
