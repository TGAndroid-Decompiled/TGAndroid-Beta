package org.telegram.messenger;
public final class m00 implements Runnable {
    public final int f23959a;
    public final f10 f23960b;
    public final String f23961c;
    public final ij d;
    public final long f23962e;
    public final int f23963f;

    public m00(f10 f10Var, String str, ij ijVar, long j3, int i7, int i10) {
        this.f23959a = i10;
        this.f23960b = f10Var;
        this.f23961c = str;
        this.d = ijVar;
        this.f23962e = j3;
        this.f23963f = i7;
    }

    @Override
    public final void run() {
        switch (this.f23959a) {
            case 0:
                f10 f10Var = this.f23960b;
                ij ijVar = this.d;
                long j3 = this.f23962e;
                int i7 = this.f23963f;
                b6.d(this.f23961c, new p00(f10Var, ijVar, j3, i7), new p00(f10Var, ijVar, j3, i7), false);
                return;
            default:
                f10 f10Var2 = this.f23960b;
                f10Var2.getClass();
                String str = this.f23961c;
                if (str == null) {
                    str = "und";
                }
                ij ijVar2 = this.d;
                ijVar2.f23244k.originalLanguage = str;
                f10Var2.getMessagesStorage().X1(this.f23962e, ijVar2.f23244k);
                f10Var2.f22331w.remove(Integer.valueOf(this.f23963f));
                f10Var2.f(ijVar2);
                return;
        }
    }
}
