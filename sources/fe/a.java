package fe;
public final class a extends ke.a {
    public final ie.b f6045a = new ie.p();

    public static boolean i(e eVar, int i9) {
        CharSequence charSequence = eVar.f6062a;
        if (eVar.f6067g < 4 && i9 < charSequence.length() && charSequence.charAt(i9) == '>') {
            return true;
        }
        return false;
    }

    @Override
    public final ie.a e() {
        return this.f6045a;
    }

    @Override
    public final e4.h h(e eVar) {
        char charAt;
        int i9 = eVar.f6065e;
        if (i(eVar, i9)) {
            int i10 = eVar.f6064c + eVar.f6067g;
            int i11 = i10 + 1;
            CharSequence charSequence = eVar.f6062a;
            int i12 = i9 + 1;
            if (i12 < charSequence.length() && ((charAt = charSequence.charAt(i12)) == '\t' || charAt == ' ')) {
                i11 = i10 + 2;
            }
            return new e4.h(-1, i11, false);
        }
        return null;
    }
}
