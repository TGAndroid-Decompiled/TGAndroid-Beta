package defpackage;
public final class joc implements tf7 {
    public final String a;
    public final String b;

    public joc(String str, String str2) {
        this.a = jrd.d(str);
        this.b = str2;
    }

    @Override
    public final ko4 a() {
        return null;
    }

    @Override
    public final void b(lt6 lt6Var) {
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
                Integer f = ype.f(str2);
                if (f != null) {
                    lt6Var.p = f;
                    return;
                }
                return;
            case 1:
                Integer f2 = ype.f(str2);
                if (f2 != null) {
                    lt6Var.E = f2;
                    return;
                }
                return;
            case 2:
                Integer f3 = ype.f(str2);
                if (f3 != null) {
                    lt6Var.o = f3;
                    return;
                }
                return;
            case 3:
                lt6Var.c = str2;
                return;
            case 4:
                lt6Var.F = str2;
                return;
            case 5:
                lt6Var.a = str2;
                return;
            case 6:
                lt6Var.g = str2;
                return;
            case 7:
                lt6Var.C = str2;
                return;
            case '\b':
                Integer f4 = ype.f(str2);
                if (f4 != null) {
                    lt6Var.D = f4;
                    return;
                }
                return;
            case '\t':
                lt6Var.d = str2;
                return;
            case '\n':
                lt6Var.b = str2;
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
        if (obj != null && joc.class == obj.getClass()) {
            joc jocVar = (joc) obj;
            if (this.a.equals(jocVar.a) && this.b.equals(jocVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + bs2.j(527, 31, this.a);
    }

    public final String toString() {
        return "VC: " + this.a + "=" + this.b;
    }
}
