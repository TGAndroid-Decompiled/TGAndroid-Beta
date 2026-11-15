package hi;
public final class w4 implements tg.l1 {
    public final int f15287a;
    public final Object f15288b;
    public final float f15289c;

    public w4(Object obj, float f10, int i7) {
        this.f15287a = i7;
        this.f15288b = obj;
        this.f15289c = f10;
    }

    @Override
    public float get() {
        float baseFontSize;
        float f10;
        switch (this.f15287a) {
            case 0:
                baseFontSize = ((tg.o2) this.f15288b).getBaseFontSize();
                f10 = this.f15289c;
                break;
            default:
                baseFontSize = ((tg.o2) this.f15288b).getBaseFontSize();
                f10 = this.f15289c;
                break;
        }
        return baseFontSize / f10;
    }

    @Override
    public void r0(float f10) {
        switch (this.f15287a) {
            case 0:
                tg.o2 o2Var = (tg.o2) this.f15288b;
                o2Var.A0 = true;
                o2Var.setBaseFontSize((int) (this.f15289c * f10));
                return;
            default:
                tg.o2 o2Var2 = (tg.o2) this.f15288b;
                o2Var2.A0 = true;
                o2Var2.setBaseFontSize((int) (this.f15289c * f10));
                return;
        }
    }
}
