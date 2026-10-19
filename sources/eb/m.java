package eb;

import j$.util.Objects;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
public final class m extends i {
    public final Serializable f8575a;

    public m(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f8575a = bool;
    }

    public static boolean r(m mVar) {
        Serializable serializable = mVar.f8575a;
        if (serializable instanceof Number) {
            Number number = (Number) serializable;
            if ((number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        BigDecimal i10;
        BigDecimal i11;
        if (this != obj) {
            if (obj != null && m.class == obj.getClass()) {
                m mVar = (m) obj;
                Serializable serializable = mVar.f8575a;
                Serializable serializable2 = this.f8575a;
                if (serializable2 == null) {
                    if (serializable == null) {
                        return true;
                    }
                    return false;
                } else if (r(this) && r(mVar)) {
                    if (!(serializable2 instanceof BigInteger) && !(serializable instanceof BigInteger)) {
                        if (q().longValue() == mVar.q().longValue()) {
                            return true;
                        }
                        return false;
                    }
                    return n().equals(mVar.n());
                } else if ((serializable2 instanceof Number) && (serializable instanceof Number)) {
                    if ((serializable2 instanceof BigDecimal) && (serializable instanceof BigDecimal)) {
                        if (serializable2 instanceof BigDecimal) {
                            i10 = (BigDecimal) serializable2;
                        } else {
                            i10 = gb.d.i(m());
                        }
                        if (serializable instanceof BigDecimal) {
                            i11 = (BigDecimal) serializable;
                        } else {
                            i11 = gb.d.i(mVar.m());
                        }
                        if (i10.compareTo(i11) == 0) {
                            return true;
                        }
                        return false;
                    }
                    double p5 = p();
                    double p9 = mVar.p();
                    if (p5 != p9) {
                        if (Double.isNaN(p5) && Double.isNaN(p9)) {
                            return true;
                        }
                        return false;
                    }
                    return true;
                } else {
                    return serializable2.equals(serializable);
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long doubleToLongBits;
        Serializable serializable = this.f8575a;
        if (serializable == null) {
            return 31;
        }
        if (r(this)) {
            doubleToLongBits = q().longValue();
        } else if (serializable instanceof Number) {
            doubleToLongBits = Double.doubleToLongBits(q().doubleValue());
        } else {
            return serializable.hashCode();
        }
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    @Override
    public final String m() {
        Serializable serializable = this.f8575a;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return q().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        throw new AssertionError("Unexpected value type: " + serializable.getClass());
    }

    public final BigInteger n() {
        Serializable serializable = this.f8575a;
        if (serializable instanceof BigInteger) {
            return (BigInteger) serializable;
        }
        if (r(this)) {
            return BigInteger.valueOf(q().longValue());
        }
        String m10 = m();
        gb.d.d(m10);
        return new BigInteger(m10);
    }

    public final boolean o() {
        Serializable serializable = this.f8575a;
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).booleanValue();
        }
        return Boolean.parseBoolean(m());
    }

    public final double p() {
        if (this.f8575a instanceof Number) {
            return q().doubleValue();
        }
        return Double.parseDouble(m());
    }

    public final Number q() {
        Serializable serializable = this.f8575a;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new gb.h((String) serializable);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public m(Number number) {
        Objects.requireNonNull(number);
        this.f8575a = number;
    }

    public m(String str) {
        Objects.requireNonNull(str);
        this.f8575a = str;
    }
}
