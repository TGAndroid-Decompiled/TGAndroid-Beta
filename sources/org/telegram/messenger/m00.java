package org.telegram.messenger;
public final class m00 implements Runnable {
    public final int f23960a;
    public final f10 f23961b;
    public final String f23962c;
    public final ij d;
    public final long f23963e;
    public final int f23964f;

    public m00(f10 f10Var, String str, ij ijVar, long j3, int i7, int i10) {
        this.f23960a = i10;
        this.f23961b = f10Var;
        this.f23962c = str;
        this.d = ijVar;
        this.f23963e = j3;
        this.f23964f = i7;
    }

    @Override
    public final void run() {
        switch (this.f23960a) {
            case 0:
                f10 f10Var = this.f23961b;
                ij ijVar = this.d;
                long j3 = this.f23963e;
                int i7 = this.f23964f;
                b6.d(this.f23962c, new p00(f10Var, ijVar, j3, i7), new p00(f10Var, ijVar, j3, i7), false);
                return;
            default:
                f10 f10Var2 = this.f23961b;
                f10Var2.getClass();
                String str = this.f23962c;
                if (str == null) {
                    str = "und";
                }
                ij ijVar2 = this.d;
                ijVar2.f23262k.originalLanguage = str;
                f10Var2.getMessagesStorage().X1(this.f23963e, ijVar2.f23262k);
                f10Var2.f22350w.remove(Integer.valueOf(this.f23964f));
                f10Var2.f(ijVar2);
                return;
        }
    }
}
