package c2;
public final class n extends Exception {
    public n(l lVar) {
        this("Unhandled input format:", lVar);
    }

    public n(String str, l lVar) {
        super(str + " " + lVar);
    }
}
