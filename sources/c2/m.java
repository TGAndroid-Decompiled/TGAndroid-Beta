package c2;
public final class m extends Exception {
    public m(k kVar) {
        this("Unhandled input format:", kVar);
    }

    public m(String str, k kVar) {
        super(str + " " + kVar);
    }
}
