package defpackage;
public final class de implements dn7 {
    public final byte a;
    public final int[] b;

    public de(int[] iArr, byte b) {
        this.a = b;
        this.b = iArr;
    }

    @Override
    public final String c(int i) {
        byte b = this.a;
        int[] iArr = this.b;
        switch (b) {
            case 0:
                int i2 = iArr[i];
                if (i2 == 0) {
                    return k96.M0(2131748115, null);
                }
                if (i2 < 60) {
                    return k96.G(i2, "Minutes", new Object[0]);
                }
                if (i2 < 1440) {
                    return k96.G(i2 / 60, "Hours", new Object[0]);
                }
                if (i2 < 10080) {
                    return k96.G(i2 / 1440, "Days", new Object[0]);
                }
                if (i2 < 44640) {
                    return k96.G(i2 / 10080, "Weeks", new Object[0]);
                }
                if (i2 < 525600) {
                    return k96.G(i2 / 44640, "Months", new Object[0]);
                }
                return k96.G(i2 / 525600, "Years", new Object[0]);
            default:
                int i3 = iArr[i];
                if (i3 == 0) {
                    return k96.M0(2131753846, null);
                }
                if (i3 < 10080) {
                    return k96.G(i3 / 1440, "Days", new Object[0]);
                }
                if (i3 < 44640) {
                    return k96.G(i3 / 10080, "Weeks", new Object[0]);
                }
                if (i3 < 525600) {
                    return k96.G(i3 / 44640, "Months", new Object[0]);
                }
                return k96.G(i3 / 525600, "Years", new Object[0]);
        }
    }
}
