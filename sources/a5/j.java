package a5;

import android.text.Layout;

public final class j {

    public CharSequence f85c;

    public long f83a = 0;

    public long f84b = 0;
    public int d = 2;

    public float f86e = -3.4028235E38f;

    public int f87f = 1;

    public int f88g = 0;
    public float h = -3.4028235E38f;

    public int f89i = Integer.MIN_VALUE;

    public float f90j = 1.0f;

    public int f91k = Integer.MIN_VALUE;

    public final r4.b a() {
        Layout.Alignment alignment;
        float f10 = this.h;
        float f11 = -3.4028235E38f;
        if (f10 == -3.4028235E38f) {
            int i10 = this.d;
            if (i10 != 4) {
                f10 = i10 != 5 ? 0.5f : 1.0f;
            } else {
                f10 = 0.0f;
            }
        }
        int i11 = this.f89i;
        if (i11 == Integer.MIN_VALUE) {
            int i12 = this.d;
            if (i12 == 1) {
                i11 = 0;
            } else if (i12 == 3) {
                i11 = 2;
            } else if (i12 == 4) {
                i11 = 0;
            } else if (i12 != 5) {
                i11 = 1;
            } else {
                i11 = 2;
            }
        }
        r4.b bVar = new r4.b();
        int i13 = this.d;
        if (i13 == 1) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i13 == 2) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else if (i13 == 3) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else if (i13 == 4) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i13 != 5) {
            com.google.android.recaptcha.internal.a.s(i13, "Unknown textAlignment: ", "WebvttCueParser");
            alignment = null;
        } else {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        }
        bVar.f46723c = alignment;
        float f12 = this.f86e;
        int i14 = this.f87f;
        if (f12 != -3.4028235E38f && i14 == 0 && (f12 < 0.0f || f12 > 1.0f)) {
            f11 = 1.0f;
        } else if (f12 != -3.4028235E38f) {
            f11 = f12;
        } else if (i14 == 0) {
            f11 = 1.0f;
        }
        bVar.f46724e = f11;
        bVar.f46725f = i14;
        bVar.f46726g = this.f88g;
        bVar.h = f10;
        bVar.f46727i = i11;
        float f13 = this.f90j;
        if (i11 == 0) {
            f10 = 1.0f - f10;
        } else if (i11 == 1) {
            f10 = f10 <= 0.5f ? f10 * 2.0f : (1.0f - f10) * 2.0f;
        } else if (i11 != 2) {
            throw new IllegalStateException(String.valueOf(i11));
        }
        bVar.f46730l = Math.min(f13, f10);
        bVar.f46734p = this.f91k;
        CharSequence charSequence = this.f85c;
        if (charSequence != null) {
            bVar.f46721a = charSequence;
        }
        return bVar;
    }
}
