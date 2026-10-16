package gb;
public final class j extends Number {
    public final String f10057a;

    public j(String str) {
        this.f10057a = str;
    }

    @Override
    public final double doubleValue() {
        return Double.parseDouble(this.f10057a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            return this.f10057a.equals(((j) obj).f10057a);
        }
        return false;
    }

    @Override
    public final float floatValue() {
        return Float.parseFloat(this.f10057a);
    }

    public final int hashCode() {
        return this.f10057a.hashCode();
    }

    @Override
    public final int intValue() {
        String str = this.f10057a;
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
        String str = this.f10057a;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return d.i(str).longValue();
        }
    }

    public final String toString() {
        return this.f10057a;
    }
}
