package defpackage;
public final class l58 implements jm7 {
    public final int a;
    public final qac b;
    public final jm7[] c;

    public l58(int i, qac qacVar, jm7[] jm7VarArr) {
        this.a = i;
        this.b = qacVar;
        this.c = jm7VarArr;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = nm7.t5;
        if (i == i3) {
            int intValue = ((Integer) objArr[0]).intValue();
            String[] strArr = (String[]) objArr[1];
            int[] iArr = (int[]) objArr[2];
            if (intValue == this.a) {
                qac qacVar = this.b;
                if (qacVar != null) {
                    qacVar.a(iArr);
                }
                nm7.e().n(this.c[0], i3);
            }
        }
    }
}
