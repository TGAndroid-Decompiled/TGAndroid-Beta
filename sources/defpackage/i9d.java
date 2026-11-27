package defpackage;

import android.content.Context;
public final class i9d implements ihd, ts3, tq2, pjf {
    @Override
    public final int a(Context context, String str, boolean z) {
        return vs3.d(context, str, z);
    }

    @Override
    public final int b(Context context, String str) {
        return vs3.a(context, str);
    }

    @Override
    public final Object b0(am2 am2Var) {
        return new x99(am2Var.d(sae.class));
    }

    @Override
    public final byte[] c(int i, int i2, byte[] bArr) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }
}
