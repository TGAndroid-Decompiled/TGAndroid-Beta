package i5;
public final class h extends com.googlecode.mp4parser.c {
    public static final v4.b f16150e;

    static {
        ze.a aVar = new ze.a(h.class, "DataEntryUrlBox.java");
        f16150e = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.DataEntryUrlBox", "", "", "java.lang.String"));
    }

    @Override
    public final long getContentSize() {
        return 4L;
    }

    public final String toString() {
        c.w(ze.a.b(f16150e, this, this));
        return "DataEntryUrlBox[]";
    }
}
