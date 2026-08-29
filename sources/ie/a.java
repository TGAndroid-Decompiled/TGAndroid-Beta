package ie;
public final class a extends ne.a {
    public final le.b f8882a = new le.p();

    public static boolean i(e eVar, int i10) {
        CharSequence charSequence = eVar.f8899a;
        if (eVar.f8904g < 4 && i10 < charSequence.length() && charSequence.charAt(i10) == '>') {
            return true;
        }
        return false;
    }

    @Override
    public final le.a e() {
        return this.f8882a;
    }

    @Override
    public final g4.h h(e eVar) {
        char charAt;
        int i10 = eVar.f8902e;
        if (i(eVar, i10)) {
            int i11 = eVar.f8901c + eVar.f8904g;
            int i12 = i11 + 1;
            CharSequence charSequence = eVar.f8899a;
            int i13 = i10 + 1;
            if (i13 < charSequence.length() && ((charAt = charSequence.charAt(i13)) == '\t' || charAt == ' ')) {
                i12 = i11 + 2;
            }
            return new g4.h(-1, i12, false);
        }
        return null;
    }
}
