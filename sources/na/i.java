package na;
public final class i extends Number {
    public final String f18539a;

    public i(String str) {
        this.f18539a = str;
    }

    @Override
    public final double doubleValue() {
        return Double.parseDouble(this.f18539a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            return this.f18539a.equals(((i) obj).f18539a);
        }
        return false;
    }

    @Override
    public final float floatValue() {
        return Float.parseFloat(this.f18539a);
    }

    public final int hashCode() {
        return this.f18539a.hashCode();
    }

    @Override
    public final int intValue() {
        String str = this.f18539a;
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
        String str = this.f18539a;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return d.i(str).longValue();
        }
    }

    public final String toString() {
        return this.f18539a;
    }
}
