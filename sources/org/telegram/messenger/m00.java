package org.telegram.messenger;
public final class m00 implements Runnable {
    public final int f23952a;
    public final f10 f23953b;
    public final String f23954c;
    public final ij d;
    public final long f23955e;
    public final int f23956f;

    public m00(f10 f10Var, String str, ij ijVar, long j3, int i7, int i10) {
        this.f23952a = i10;
        this.f23953b = f10Var;
        this.f23954c = str;
        this.d = ijVar;
        this.f23955e = j3;
        this.f23956f = i7;
    }

    @Override
    public final void run() {
        switch (this.f23952a) {
            case 0:
                f10 f10Var = this.f23953b;
                ij ijVar = this.d;
                long j3 = this.f23955e;
                int i7 = this.f23956f;
                b6.d(this.f23954c, new p00(f10Var, ijVar, j3, i7), new p00(f10Var, ijVar, j3, i7), false);
                return;
            default:
                f10 f10Var2 = this.f23953b;
                f10Var2.getClass();
                String str = this.f23954c;
                if (str == null) {
                    str = "und";
                }
                ij ijVar2 = this.d;
                ijVar2.f23237k.originalLanguage = str;
                f10Var2.getMessagesStorage().X1(this.f23955e, ijVar2.f23237k);
                f10Var2.f22324w.remove(Integer.valueOf(this.f23956f));
                f10Var2.f(ijVar2);
                return;
        }
    }
}
