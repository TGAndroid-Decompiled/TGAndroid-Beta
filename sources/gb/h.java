package gb;
public final class h extends Number {
    public final String f10963a;

    public h(String str) {
        this.f10963a = str;
    }

    @Override
    public final double doubleValue() {
        return Double.parseDouble(this.f10963a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            return this.f10963a.equals(((h) obj).f10963a);
        }
        return false;
    }

    @Override
    public final float floatValue() {
        return Float.parseFloat(this.f10963a);
    }

    public final int hashCode() {
        return this.f10963a.hashCode();
    }

    @Override
    public final int intValue() {
        String str = this.f10963a;
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
        String str = this.f10963a;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return d.i(str).longValue();
        }
    }

    public final String toString() {
        return this.f10963a;
    }
}
