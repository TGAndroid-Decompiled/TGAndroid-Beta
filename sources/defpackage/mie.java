package defpackage;
public final class mie extends RuntimeException {
    public mie() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }
}
