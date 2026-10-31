package c2;
public final class l extends Exception {
    public l(j jVar) {
        this("Unhandled input format:", jVar);
    }

    public l(String str, j jVar) {
        super(str + " " + jVar);
    }
}
