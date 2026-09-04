package c2;
public final class g extends Exception {
    public g(f fVar) {
        this("Unhandled input format:", fVar);
    }

    public g(String str, f fVar) {
        super(str + " " + fVar);
    }
}
