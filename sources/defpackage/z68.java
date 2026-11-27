package defpackage;
public final class z68 implements fn7 {
    public final int a;
    public final pcc b;
    public final fn7[] c;

    public z68(int i, pcc pccVar, fn7[] fn7VarArr) {
        this.a = i;
        this.b = pccVar;
        this.c = fn7VarArr;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = jn7.s5;
        if (i == i3) {
            int intValue = ((Integer) objArr[0]).intValue();
            String[] strArr = (String[]) objArr[1];
            int[] iArr = (int[]) objArr[2];
            if (intValue == this.a) {
                pcc pccVar = this.b;
                if (pccVar != null) {
                    pccVar.a(iArr);
                }
                jn7.e().n(this.c[0], i3);
            }
        }
    }
}
