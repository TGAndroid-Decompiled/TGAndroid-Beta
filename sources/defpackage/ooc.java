package defpackage;
public final class ooc implements p8c {
    public final byte a;
    public final toc b;

    public ooc(toc tocVar, byte b) {
        this.a = b;
        this.b = tocVar;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        toc tocVar = this.b;
        switch (b) {
            case 0:
                tocVar.g0((p8c) obj);
                return;
            case 1:
                String str = (String) obj;
                if (str != null) {
                    u21.b0(tocVar).f0(str, false);
                    return;
                }
                m21 I = u21.b0(tocVar).I(2131623990, k96.M0(2131742945, null), k96.M0(2131742943, null));
                I.j = 5000;
                I.j();
                tocVar.a.g3.O(true);
                return;
            default:
                tocVar.d0((Boolean) obj);
                return;
        }
    }
}
