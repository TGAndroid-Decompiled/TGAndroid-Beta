package m4;
public final class o0 implements e2.h {
    public final int f16018a;
    public final float f16019b;

    public o0(float f7, int i10) {
        this.f16018a = i10;
        this.f16019b = f7;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f16018a) {
            case 0:
                ((j1) obj).a(this.f16019b);
                return;
            default:
                ((j1) obj).U(this.f16019b);
                return;
        }
    }
}
