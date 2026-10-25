package fb;

import j$.util.Objects;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
public final class m extends i {
    public final Serializable f10398a;

    public m(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f10398a = bool;
    }

    public static boolean r(m mVar) {
        Serializable serializable = mVar.f10398a;
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
                Serializable serializable = mVar.f10398a;
                Serializable serializable2 = this.f10398a;
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
                            i10 = hb.d.i(m());
                        }
                        if (serializable instanceof BigDecimal) {
                            i11 = (BigDecimal) serializable;
                        } else {
                            i11 = hb.d.i(mVar.m());
                        }
                        if (i10.compareTo(i11) == 0) {
                            return true;
                        }
                        return false;
                    }
                    double p10 = p();
                    double p11 = mVar.p();
                    if (p10 != p11) {
                        if (Double.isNaN(p10) && Double.isNaN(p11)) {
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
        Serializable serializable = this.f10398a;
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
        Serializable serializable = this.f10398a;
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
        Serializable serializable = this.f10398a;
        if (serializable instanceof BigInteger) {
            return (BigInteger) serializable;
        }
        if (r(this)) {
            return BigInteger.valueOf(q().longValue());
        }
        String m10 = m();
        hb.d.d(m10);
        return new BigInteger(m10);
    }

    public final boolean o() {
        Serializable serializable = this.f10398a;
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).booleanValue();
        }
        return Boolean.parseBoolean(m());
    }

    public final double p() {
        if (this.f10398a instanceof Number) {
            return q().doubleValue();
        }
        return Double.parseDouble(m());
    }

    public final Number q() {
        Serializable serializable = this.f10398a;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new hb.i((String) serializable);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public m(Number number) {
        Objects.requireNonNull(number);
        this.f10398a = number;
    }

    public m(String str) {
        Objects.requireNonNull(str);
        this.f10398a = str;
    }
}
