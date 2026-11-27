package defpackage;
public final class em5 extends yi6 {
    public final byte g;
    public final String h;
    public final String i;

    public em5(String str, String str2, byte b) {
        this.g = b;
        this.h = str;
        this.i = str2;
    }

    @Override
    public final void a(zpd zpdVar) {
        switch (this.g) {
            case 0:
                zpdVar.i(this);
                return;
            default:
                zpdVar.s(this);
                return;
        }
    }

    @Override
    public final String f() {
        byte b = this.g;
        String str = this.i;
        String str2 = this.h;
        switch (b) {
            case 0:
                return "destination=" + str2 + ", title=" + str;
            default:
                return "destination=" + str2 + ", title=" + str;
        }
    }
}
