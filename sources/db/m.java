package db;

import j$.util.Objects;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
public final class m extends i {
    public final Serializable f6684a;

    public m(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f6684a = bool;
    }

    public static boolean s(m mVar) {
        Serializable serializable = mVar.f6684a;
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
                Serializable serializable = mVar.f6684a;
                Serializable serializable2 = this.f6684a;
                if (serializable2 == null) {
                    if (serializable == null) {
                        return true;
                    }
                    return false;
                } else if (s(this) && s(mVar)) {
                    if (!(serializable2 instanceof BigInteger) && !(serializable instanceof BigInteger)) {
                        if (r().longValue() == mVar.r().longValue()) {
                            return true;
                        }
                        return false;
                    }
                    return o().equals(mVar.o());
                } else if ((serializable2 instanceof Number) && (serializable instanceof Number)) {
                    if ((serializable2 instanceof BigDecimal) && (serializable instanceof BigDecimal)) {
                        if (serializable2 instanceof BigDecimal) {
                            i10 = (BigDecimal) serializable2;
                        } else {
                            i10 = fb.d.i(n());
                        }
                        if (serializable instanceof BigDecimal) {
                            i11 = (BigDecimal) serializable;
                        } else {
                            i11 = fb.d.i(mVar.n());
                        }
                        if (i10.compareTo(i11) == 0) {
                            return true;
                        }
                        return false;
                    }
                    double q6 = q();
                    double q10 = mVar.q();
                    if (q6 != q10) {
                        if (Double.isNaN(q6) && Double.isNaN(q10)) {
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
        Serializable serializable = this.f6684a;
        if (serializable == null) {
            return 31;
        }
        if (s(this)) {
            doubleToLongBits = r().longValue();
        } else if (serializable instanceof Number) {
            doubleToLongBits = Double.doubleToLongBits(r().doubleValue());
        } else {
            return serializable.hashCode();
        }
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    @Override
    public final String n() {
        Serializable serializable = this.f6684a;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return r().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        throw new AssertionError("Unexpected value type: " + serializable.getClass());
    }

    public final BigInteger o() {
        Serializable serializable = this.f6684a;
        if (serializable instanceof BigInteger) {
            return (BigInteger) serializable;
        }
        if (s(this)) {
            return BigInteger.valueOf(r().longValue());
        }
        String n10 = n();
        fb.d.d(n10);
        return new BigInteger(n10);
    }

    public final boolean p() {
        Serializable serializable = this.f6684a;
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).booleanValue();
        }
        return Boolean.parseBoolean(n());
    }

    public final double q() {
        if (this.f6684a instanceof Number) {
            return r().doubleValue();
        }
        return Double.parseDouble(n());
    }

    public final Number r() {
        Serializable serializable = this.f6684a;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new fb.h((String) serializable);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public m(Number number) {
        Objects.requireNonNull(number);
        this.f6684a = number;
    }

    public m(String str) {
        Objects.requireNonNull(str);
        this.f6684a = str;
    }
}
