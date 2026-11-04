package df;
public final class b extends jf.a {
    public final gf.b f8842a = new gf.p();

    public static boolean i(g gVar, int i3) {
        CharSequence charSequence = gVar.f8862a;
        if (gVar.f8867g < 4 && i3 < charSequence.length() && charSequence.charAt(i3) == '>') {
            return true;
        }
        return false;
    }

    @Override
    public final gf.a e() {
        return this.f8842a;
    }

    @Override
    public final a h(g gVar) {
        char charAt;
        int i3 = gVar.f8865e;
        if (i(gVar, i3)) {
            int i10 = gVar.f8864c + gVar.f8867g;
            int i11 = i10 + 1;
            CharSequence charSequence = gVar.f8862a;
            int i12 = i3 + 1;
            if (i12 < charSequence.length() && ((charAt = charSequence.charAt(i12)) == '\t' || charAt == ' ')) {
                i11 = i10 + 2;
            }
            return new a(-1, i11, false);
        }
        return null;
    }
}
