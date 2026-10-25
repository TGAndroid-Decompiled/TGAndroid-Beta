package bf;
public final class b extends gf.a {
    public final ef.b f3903a = new ef.p();

    public static boolean i(g gVar, int i10) {
        CharSequence charSequence = gVar.f3921a;
        if (gVar.f3925g < 4 && i10 < charSequence.length() && charSequence.charAt(i10) == '>') {
            return true;
        }
        return false;
    }

    @Override
    public final ef.a e() {
        return this.f3903a;
    }

    @Override
    public final a h(g gVar) {
        char charAt;
        int i10 = gVar.e;
        if (i(gVar, i10)) {
            int i11 = gVar.f3923c + gVar.f3925g;
            int i12 = i11 + 1;
            CharSequence charSequence = gVar.f3921a;
            int i13 = i10 + 1;
            if (i13 < charSequence.length() && ((charAt = charSequence.charAt(i13)) == '\t' || charAt == ' ')) {
                i12 = i11 + 2;
            }
            return new a(-1, i12, false);
        }
        return null;
    }
}
