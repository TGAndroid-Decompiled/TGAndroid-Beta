package gb;
public final class i extends Number {
    public final String f10053a;

    public i(String str) {
        this.f10053a = str;
    }

    @Override
    public final double doubleValue() {
        return Double.parseDouble(this.f10053a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            return this.f10053a.equals(((i) obj).f10053a);
        }
        return false;
    }

    @Override
    public final float floatValue() {
        return Float.parseFloat(this.f10053a);
    }

    public final int hashCode() {
        return this.f10053a.hashCode();
    }

    @Override
    public final int intValue() {
        String str = this.f10053a;
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
        String str = this.f10053a;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return d.i(str).longValue();
        }
    }

    public final String toString() {
        return this.f10053a;
    }
}
