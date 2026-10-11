package fb;
public final class h extends Number {
    public final String f9818a;

    public h(String str) {
        this.f9818a = str;
    }

    @Override
    public final double doubleValue() {
        return Double.parseDouble(this.f9818a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            return this.f9818a.equals(((h) obj).f9818a);
        }
        return false;
    }

    @Override
    public final float floatValue() {
        return Float.parseFloat(this.f9818a);
    }

    public final int hashCode() {
        return this.f9818a.hashCode();
    }

    @Override
    public final int intValue() {
        String str = this.f9818a;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(str);
            }
        } catch (NumberFormatException unused2) {
            return d.i(str).intValue();
        }
    }

    @Override
    public final long longValue() {
        String str = this.f9818a;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return d.i(str).longValue();
        }
    }

    public final String toString() {
        return this.f9818a;
    }
}
