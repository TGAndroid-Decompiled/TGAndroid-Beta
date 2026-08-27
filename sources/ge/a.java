package ge;

public final class a extends le.a {

    public final je.b f6845a = new je.b();

    public static boolean i(e eVar, int i10) {
        CharSequence charSequence = eVar.f6862a;
        return eVar.f6867g < 4 && i10 < charSequence.length() && charSequence.charAt(i10) == '>';
    }

    @Override
    public final je.a e() {
        return this.f6845a;
    }

    @Override
    public final e4.h h(e eVar) {
        char cCharAt;
        int i10 = eVar.f6865e;
        if (!i(eVar, i10)) {
            return null;
        }
        int i11 = eVar.f6864c + eVar.f6867g;
        int i12 = i11 + 1;
        CharSequence charSequence = eVar.f6862a;
        int i13 = i10 + 1;
        if (i13 < charSequence.length() && ((cCharAt = charSequence.charAt(i13)) == '\t' || cCharAt == ' ')) {
            i12 = i11 + 2;
        }
        return new e4.h(-1, i12, false);
    }
}
