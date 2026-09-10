package bi;

import org.telegram.messenger.AndroidUtilities;
public final class h3 implements Runnable {
    public final int f2784a;
    public final m3 f2785b;
    public final ai.b f2786c;

    public h3(m3 m3Var, ai.b bVar, int i10) {
        this.f2784a = i10;
        this.f2785b = m3Var;
        this.f2786c = bVar;
    }

    @Override
    public final void run() {
        switch (this.f2784a) {
            case 0:
                m3 m3Var = this.f2785b;
                m3Var.getClass();
                AndroidUtilities.runOnUIThread(new h3(m3Var, this.f2786c, 1), 320L);
                return;
            default:
                m3 m3Var2 = this.f2785b;
                m3Var2.getClass();
                this.f2786c.run(new ai.b(m3Var2, 4));
                return;
        }
    }
}
