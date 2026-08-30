package l3;
public final class z {
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && z.class == obj.getClass()) {
                z zVar = (z) obj;
                if (Float.compare(0.0f, 0.0f) == 0) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.floatToIntBits(0.0f) + 16337;
    }
}
