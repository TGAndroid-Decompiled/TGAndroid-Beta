package defpackage;
public final class wlc implements lf7 {
    public final String a;
    public final String b;

    public wlc(String str, String str2) {
        this.a = vod.d(str);
        this.b = str2;
    }

    @Override
    public final go4 a() {
        return null;
    }

    @Override
    public final void b(ht6 ht6Var) {
        String str = this.a;
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1935137620:
                if (str.equals("TOTALTRACKS")) {
                    c = 0;
                    break;
                }
                break;
            case -215998278:
                if (str.equals("TOTALDISCS")) {
                    c = 1;
                    break;
                }
                break;
            case -113312716:
                if (str.equals("TRACKNUMBER")) {
                    c = 2;
                    break;
                }
                break;
            case 62359119:
                if (str.equals("ALBUM")) {
                    c = 3;
                    break;
                }
                break;
            case 67703139:
                if (str.equals("GENRE")) {
                    c = 4;
                    break;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c = 5;
                    break;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c = 6;
                    break;
                }
                break;
            case 905239725:
                if (str.equals("DISCSUBTITLE")) {
                    c = 7;
                    break;
                }
                break;
            case 993300766:
                if (str.equals("DISCNUMBER")) {
                    c = '\b';
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c = '\t';
                    break;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c = '\n';
                    break;
                }
                break;
        }
        String str2 = this.b;
        switch (c) {
            case 0:
                Integer f = ine.f(str2);
                if (f != null) {
                    ht6Var.p = f;
                    return;
                }
                return;
            case 1:
                Integer f2 = ine.f(str2);
                if (f2 != null) {
                    ht6Var.E = f2;
                    return;
                }
                return;
            case 2:
                Integer f3 = ine.f(str2);
                if (f3 != null) {
                    ht6Var.o = f3;
                    return;
                }
                return;
            case 3:
                ht6Var.c = str2;
                return;
            case 4:
                ht6Var.F = str2;
                return;
            case 5:
                ht6Var.a = str2;
                return;
            case 6:
                ht6Var.g = str2;
                return;
            case 7:
                ht6Var.C = str2;
                return;
            case '\b':
                Integer f4 = ine.f(str2);
                if (f4 != null) {
                    ht6Var.D = f4;
                    return;
                }
                return;
            case '\t':
                ht6Var.d = str2;
                return;
            case '\n':
                ht6Var.b = str2;
                return;
            default:
                return;
        }
    }

    @Override
    public final byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && wlc.class == obj.getClass()) {
            wlc wlcVar = (wlc) obj;
            if (this.a.equals(wlcVar.a) && this.b.equals(wlcVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + ts2.j(527, 31, this.a);
    }

    public final String toString() {
        return "VC: " + this.a + "=" + this.b;
    }
}
