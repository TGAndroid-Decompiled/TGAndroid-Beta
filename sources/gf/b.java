package gf;
public final class b extends mf.a {
    public final kf.b f13872a = new kf.p();

    public static boolean i(h hVar, int i7) {
        CharSequence charSequence = hVar.f13894a;
        if (hVar.f13899g < 4 && i7 < charSequence.length() && charSequence.charAt(i7) == '>') {
            return true;
        }
        return false;
    }

    @Override
    public final kf.a e() {
        return this.f13872a;
    }

    @Override
    public final a h(h hVar) {
        char charAt;
        int i7 = hVar.f13897e;
        if (i(hVar, i7)) {
            int i10 = hVar.f13896c + hVar.f13899g;
            int i11 = i10 + 1;
            CharSequence charSequence = hVar.f13894a;
            int i12 = i7 + 1;
            if (i12 < charSequence.length() && ((charAt = charSequence.charAt(i12)) == '\t' || charAt == ' ')) {
                i11 = i10 + 2;
            }
            return new a(-1, i11, false);
        }
        return null;
    }
}
