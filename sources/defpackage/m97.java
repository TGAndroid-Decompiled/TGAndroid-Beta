package defpackage;
public final class m97 implements gk7 {
    public final int a;
    public final byte b;
    public final int c;
    public final long d;
    public final ca7 e;
    public final na7 f;

    public m97(na7 na7Var, int i, int i2, int i3, long j, ca7 ca7Var) {
        this.f = na7Var;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = j;
        this.e = ca7Var;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = kk7.H;
        ca7 ca7Var = this.e;
        int i4 = this.a;
        na7 na7Var = this.f;
        int i5 = kk7.G;
        if (i == i5 && ((Integer) objArr[0]).intValue() == i4) {
            int intValue = ((Integer) objArr[1]).intValue();
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            boolean booleanValue2 = ((Boolean) objArr[3]).booleanValue();
            int intValue2 = ((Integer) objArr[4]).intValue();
            byte b = this.b;
            if (intValue < b / 2 && !booleanValue2 && booleanValue) {
                int i6 = this.c;
                long j = this.d;
                if (i6 != 0) {
                    na7Var.b3(j, 0L, false, b, i6, 0, false, 0, this.a, 3, intValue2, 0, 0L, -1, 0, 0, 0, false, 0, true, false, false, null, 0L);
                    return;
                } else {
                    na7Var.b3(j, 0L, false, b, i6, 0, false, 0, this.a, 2, intValue2, 0, 0L, -1, 0, 0, 0, false, 0, true, false, false, null, 0L);
                    return;
                }
            }
            na7Var.getNotificationCenter().n(this, i5);
            na7Var.getNotificationCenter().n(this, i3);
            if (ca7Var != null) {
                ca7Var.m(booleanValue);
            }
        } else if (i == i3 && ((Integer) objArr[0]).intValue() == i4) {
            na7Var.getNotificationCenter().n(this, i5);
            na7Var.getNotificationCenter().n(this, i3);
            if (ca7Var != null) {
                ca7Var.a();
            }
        }
    }
}
