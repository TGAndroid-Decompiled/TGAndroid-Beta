package af;
public final class c extends ff.a {
    public final df.b f553a = new df.p();

    public static boolean i(h hVar, int i10) {
        CharSequence charSequence = hVar.f571a;
        if (hVar.f575g < 4 && i10 < charSequence.length() && charSequence.charAt(i10) == '>') {
            return true;
        }
        return false;
    }

    @Override
    public final df.a e() {
        return this.f553a;
    }

    @Override
    public final a h(h hVar) {
        char charAt;
        int i10 = hVar.e;
        if (i(hVar, i10)) {
            int i11 = hVar.f573c + hVar.f575g;
            int i12 = i11 + 1;
            CharSequence charSequence = hVar.f571a;
            int i13 = i10 + 1;
            if (i13 < charSequence.length() && ((charAt = charSequence.charAt(i13)) == '\t' || charAt == ' ')) {
                i12 = i11 + 2;
            }
            return new a(-1, i12, false);
        }
        return null;
    }
}
