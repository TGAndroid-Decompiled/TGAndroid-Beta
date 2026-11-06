package gf;
public final class b extends mf.a {
    public final kf.b f13870a = new kf.p();

    public static boolean i(h hVar, int i7) {
        CharSequence charSequence = hVar.f13892a;
        if (hVar.f13897g < 4 && i7 < charSequence.length() && charSequence.charAt(i7) == '>') {
            return true;
        }
        return false;
    }

    @Override
    public final kf.a e() {
        return this.f13870a;
    }

    @Override
    public final a h(h hVar) {
        char charAt;
        int i7 = hVar.f13895e;
        if (i(hVar, i7)) {
            int i10 = hVar.f13894c + hVar.f13897g;
            int i11 = i10 + 1;
            CharSequence charSequence = hVar.f13892a;
            int i12 = i7 + 1;
            if (i12 < charSequence.length() && ((charAt = charSequence.charAt(i12)) == '\t' || charAt == ' ')) {
                i11 = i10 + 2;
            }
            return new a(-1, i11, false);
        }
        return null;
    }
}
