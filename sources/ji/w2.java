package ji;
public final class w2 implements Runnable {
    public final int f13584a;
    public final h1 f13585b;
    public final int f13586c;

    public w2(h1 h1Var, int i10, int i11) {
        this.f13584a = i11;
        this.f13585b = h1Var;
        this.f13586c = i10;
    }

    @Override
    public final void run() {
        switch (this.f13584a) {
            case 0:
                h1 h1Var = this.f13585b;
                h1Var.r();
                h1Var.setSelection(Math.max(0, Math.min(this.f13586c, h1Var.length())));
                return;
            case 1:
                h1 h1Var2 = this.f13585b;
                h1Var2.r();
                h1Var2.setSelection(Math.max(0, Math.min(this.f13586c, h1Var2.length())));
                return;
            case 2:
                h1 h1Var3 = this.f13585b;
                h1Var3.r();
                h1Var3.setSelection(Math.max(0, Math.min(this.f13586c, h1Var3.length())));
                return;
            case 3:
                h1 h1Var4 = this.f13585b;
                h1Var4.r();
                h1Var4.setSelection(Math.min(this.f13586c, h1Var4.length()));
                return;
            default:
                h1 h1Var5 = this.f13585b;
                h1Var5.r();
                h1Var5.setSelection(Math.max(0, Math.min(this.f13586c, h1Var5.length())));
                return;
        }
    }
}
