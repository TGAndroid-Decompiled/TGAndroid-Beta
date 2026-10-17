package gb;
public final class h extends Number {
    public final String f10961a;

    public h(String str) {
        this.f10961a = str;
    }

    @Override
    public final double doubleValue() {
        return Double.parseDouble(this.f10961a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            return this.f10961a.equals(((h) obj).f10961a);
        }
        return false;
    }

    @Override
    public final float floatValue() {
        return Float.parseFloat(this.f10961a);
    }

    public final int hashCode() {
        return this.f10961a.hashCode();
    }

    @Override
    public final int intValue() {
        String str = this.f10961a;
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
        String str = this.f10961a;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return d.i(str).longValue();
        }
    }

    public final String toString() {
        return this.f10961a;
    }
}
