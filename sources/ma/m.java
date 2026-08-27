package ma;

import j$.util.Objects;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

public final class m extends i {

    public final Serializable f17912a;

    public m(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f17912a = bool;
    }

    public static boolean s(m mVar) {
        Serializable serializable = mVar.f17912a;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        Serializable serializable = mVar.f17912a;
        Serializable serializable2 = this.f17912a;
        if (serializable2 == null) {
            return serializable == null;
        }
        if (s(this) && s(mVar)) {
            if ((serializable2 instanceof BigInteger) || (serializable instanceof BigInteger)) {
                return o().equals(mVar.o());
            }
            return r().longValue() == mVar.r().longValue();
        }
        if (!(serializable2 instanceof Number) || !(serializable instanceof Number)) {
            return serializable2.equals(serializable);
        }
        if ((serializable2 instanceof BigDecimal) && (serializable instanceof BigDecimal)) {
            return (serializable2 instanceof BigDecimal ? (BigDecimal) serializable2 : oa.d.i(n())).compareTo(serializable instanceof BigDecimal ? (BigDecimal) serializable : oa.d.i(mVar.n())) == 0;
        }
        double dQ = q();
        double dQ2 = mVar.q();
        if (dQ != dQ2) {
            return Double.isNaN(dQ) && Double.isNaN(dQ2);
        }
        return true;
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        Serializable serializable = this.f17912a;
        if (serializable == null) {
            return 31;
        }
        if (s(this)) {
            jDoubleToLongBits = r().longValue();
        } else {
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(r().doubleValue());
        }
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    @Override
    public final String n() {
        Serializable serializable = this.f17912a;
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
        Serializable serializable = this.f17912a;
        if (serializable instanceof BigInteger) {
            return (BigInteger) serializable;
        }
        if (s(this)) {
            return BigInteger.valueOf(r().longValue());
        }
        String strN = n();
        oa.d.d(strN);
        return new BigInteger(strN);
    }

    public final boolean p() {
        Serializable serializable = this.f17912a;
        return serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(n());
    }

    public final double q() {
        return this.f17912a instanceof Number ? r().doubleValue() : Double.parseDouble(n());
    }

    public final Number r() {
        Serializable serializable = this.f17912a;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new oa.h((String) serializable);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public m(Number number) {
        Objects.requireNonNull(number);
        this.f17912a = number;
    }

    public m(String str) {
        Objects.requireNonNull(str);
        this.f17912a = str;
    }
}
