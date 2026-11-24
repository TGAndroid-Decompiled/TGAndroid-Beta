package defpackage;
public final class wfe extends RuntimeException {
    public wfe() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }
}
