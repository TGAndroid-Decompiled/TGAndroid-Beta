package gf;
public final class b extends mf.a {
    public final kf.b f13529a = new kf.p();

    public static boolean i(g gVar, int i7) {
        CharSequence charSequence = gVar.f13549a;
        if (gVar.f13554g < 4 && i7 < charSequence.length() && charSequence.charAt(i7) == '>') {
            return true;
        }
        return false;
    }

    @Override
    public final kf.a e() {
        return this.f13529a;
    }

    @Override
    public final a h(g gVar) {
        char charAt;
        int i7 = gVar.f13552e;
        if (i(gVar, i7)) {
            int i10 = gVar.f13551c + gVar.f13554g;
            int i11 = i10 + 1;
            CharSequence charSequence = gVar.f13549a;
            int i12 = i7 + 1;
            if (i12 < charSequence.length() && ((charAt = charSequence.charAt(i12)) == '\t' || charAt == ' ')) {
                i11 = i10 + 2;
            }
            return new a(-1, i11, false);
        }
        return null;
    }
}
