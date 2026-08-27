package je;

public abstract class a extends p {
    @Override
    public final void e(p pVar) {
        if (!(pVar instanceof a)) {
            throw new IllegalArgumentException("Parent of block must also be block (can not be inline)");
        }
        this.f12924b = pVar;
    }
}
