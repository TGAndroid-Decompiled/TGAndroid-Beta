package ke;
public final class a extends pe.a {
    public final ne.b f11102a = new ne.p();

    public static boolean i(e eVar, int i10) {
        CharSequence charSequence = eVar.f11119a;
        if (eVar.f11124g < 4 && i10 < charSequence.length() && charSequence.charAt(i10) == '>') {
            return true;
        }
        return false;
    }

    @Override
    public final ne.a e() {
        return this.f11102a;
    }

    @Override
    public final j4.h h(e eVar) {
        char charAt;
        int i10 = eVar.f11122e;
        if (i(eVar, i10)) {
            int i11 = eVar.f11121c + eVar.f11124g;
            int i12 = i11 + 1;
            CharSequence charSequence = eVar.f11119a;
            int i13 = i10 + 1;
            if (i13 < charSequence.length() && ((charAt = charSequence.charAt(i13)) == '\t' || charAt == ' ')) {
                i12 = i11 + 2;
            }
            return new j4.h(-1, i12, false);
        }
        return null;
    }
}
