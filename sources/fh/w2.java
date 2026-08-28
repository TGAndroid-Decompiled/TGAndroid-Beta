package fh;
public final class w2 implements Runnable {
    public final int f6831a;
    public final y3 f6832b;
    public final int f6833c;

    public w2(y3 y3Var, int i9, int i10) {
        this.f6831a = i10;
        this.f6832b = y3Var;
        this.f6833c = i9;
    }

    @Override
    public final void run() {
        switch (this.f6831a) {
            case 0:
                this.f6832b.f6884f.scrollBy(0, this.f6833c);
                return;
            default:
                s3 s3Var = this.f6832b.f6884f;
                if (s3Var != null) {
                    s3Var.setSpanCount(this.f6833c);
                    return;
                }
                return;
        }
    }
}
