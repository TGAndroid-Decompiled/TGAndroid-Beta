package defpackage;

import android.content.Context;
public final class ad extends xmb {
    public final byte d;

    public ad(Context context, byte b) {
        super(context);
        this.d = b;
    }

    @Override
    public final void setEnabled(boolean z) {
        float f;
        float f2;
        float f3;
        float f4;
        switch (this.d) {
            case 0:
                super.setEnabled(z);
                if (z) {
                    f = 1.0f;
                } else {
                    f = 0.5f;
                }
                setAlpha(f);
                return;
            case 1:
                super.setEnabled(z);
                if (z) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.5f;
                }
                setAlpha(f2);
                return;
            case 2:
                super.setEnabled(z);
                if (z) {
                    f3 = 1.0f;
                } else {
                    f3 = 0.5f;
                }
                setAlpha(f3);
                return;
            default:
                super.setEnabled(z);
                if (z) {
                    f4 = 1.0f;
                } else {
                    f4 = 0.5f;
                }
                setAlpha(f4);
                return;
        }
    }

    @Override
    public final void setTextColor(int i) {
        switch (this.d) {
            case 0:
                super.setTextColor(i);
                setBackground(aob.H0(hl.L(20.0f), i));
                return;
            case 1:
                super.setTextColor(i);
                setBackground(aob.H0(hl.L(20.0f), i));
                return;
            case 2:
                super.setTextColor(i);
                setBackground(aob.H0(hl.L(20.0f), i));
                return;
            default:
                super.setTextColor(i);
                setBackgroundDrawable(aob.H0(hl.L(20.0f), i));
                return;
        }
    }
}
