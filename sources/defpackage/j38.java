package defpackage;
public final class j38 implements gk7 {
    public final int a;
    public final p8c b;
    public final gk7[] c;

    public j38(int i, p8c p8cVar, gk7[] gk7VarArr) {
        this.a = i;
        this.b = p8cVar;
        this.c = gk7VarArr;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = kk7.r5;
        if (i == i3) {
            int intValue = ((Integer) objArr[0]).intValue();
            String[] strArr = (String[]) objArr[1];
            int[] iArr = (int[]) objArr[2];
            if (intValue == this.a) {
                p8c p8cVar = this.b;
                if (p8cVar != null) {
                    p8cVar.a(iArr);
                }
                kk7.e().n(this.c[0], i3);
            }
        }
    }
}
