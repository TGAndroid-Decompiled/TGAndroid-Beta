package defpackage;
public final class vde extends RuntimeException {
    public vde() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }
}
