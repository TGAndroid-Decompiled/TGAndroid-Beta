package oi;

import android.view.View;
public final class n2 implements Runnable {
    public final int f22188a;
    public final s3 f22189b;
    public final a f22190c;
    public final int d;

    public n2(s3 s3Var, a aVar, int i7, int i10) {
        this.f22188a = i10;
        this.f22189b = s3Var;
        this.f22190c = aVar;
        this.d = i7;
    }

    @Override
    public final void run() {
        View C1;
        View C12;
        switch (this.f22188a) {
            case 0:
                s3 s3Var = this.f22189b;
                a aVar = this.f22190c;
                if (aVar == null) {
                    s3Var.getClass();
                    C1 = null;
                } else {
                    C1 = s3Var.C1(aVar);
                }
                if (C1 instanceof z5) {
                    z5 z5Var = (z5) C1;
                    z5Var.B();
                    z5Var.getEditText().setSelection(Math.min(this.d, z5Var.getEditText().length()));
                    return;
                }
                return;
            case 1:
                s3 s3Var2 = this.f22189b;
                a aVar2 = this.f22190c;
                if (aVar2 == null) {
                    s3Var2.getClass();
                    C12 = null;
                } else {
                    C12 = s3Var2.C1(aVar2);
                }
                if (C12 instanceof z5) {
                    z5 z5Var2 = (z5) C12;
                    z5Var2.B();
                    z5Var2.getEditText().setSelection(Math.min(this.d, z5Var2.getEditText().length()));
                    return;
                }
                return;
            case 2:
                View C13 = this.f22189b.C1(this.f22190c);
                if (C13 instanceof z5) {
                    z5 z5Var3 = (z5) C13;
                    z5Var3.B();
                    z5Var3.getEditText().setSelection(Math.max(0, Math.min(this.d, z5Var3.getEditText().length())));
                    return;
                }
                return;
            case 3:
                View C14 = this.f22189b.C1(this.f22190c);
                if (C14 instanceof z5) {
                    z5 z5Var4 = (z5) C14;
                    z5Var4.B();
                    z5Var4.getEditText().setSelection(Math.max(0, Math.min(this.d, z5Var4.getEditText().length())));
                    return;
                }
                return;
            case 4:
                View C15 = this.f22189b.C1(this.f22190c);
                if (C15 instanceof z5) {
                    z5 z5Var5 = (z5) C15;
                    z5Var5.B();
                    z5Var5.getEditText().setSelection(Math.max(0, Math.min(this.d, z5Var5.getEditText().length())));
                    return;
                }
                return;
            default:
                View C16 = this.f22189b.C1(this.f22190c);
                if (C16 instanceof z5) {
                    z5 z5Var6 = (z5) C16;
                    z5Var6.B();
                    z5Var6.getEditText().setSelection(Math.max(0, Math.min(this.d, z5Var6.getEditText().length())));
                    return;
                }
                return;
        }
    }
}
