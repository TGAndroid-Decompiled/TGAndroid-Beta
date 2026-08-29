package le;
public abstract class a extends p {
    @Override
    public final void e(p pVar) {
        if (pVar instanceof a) {
            this.f15205b = pVar;
            return;
        }
        throw new IllegalArgumentException("Parent of block must also be block (can not be inline)");
    }
}
