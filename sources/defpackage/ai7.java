package defpackage;
public final class ai7 implements tf7 {
    public final float a;
    public final float b;

    public ai7(float f, float f2) {
        boolean z;
        if (f >= -90.0f && f <= 90.0f && f2 >= -180.0f && f2 <= 180.0f) {
            z = true;
        } else {
            z = false;
        }
        yve.e("Invalid latitude or longitude", z);
        this.a = f;
        this.b = f2;
    }

    @Override
    public final ko4 a() {
        return null;
    }

    @Override
    public final byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ai7.class == obj.getClass()) {
            ai7 ai7Var = (ai7) obj;
            if (this.a == ai7Var.a && this.b == ai7Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.valueOf(this.b).hashCode() + ((Float.valueOf(this.a).hashCode() + 527) * 31);
    }

    public final String toString() {
        return "xyz: latitude=" + this.a + ", longitude=" + this.b;
    }

    @Override
    public final void b(lt6 lt6Var) {
    }
}
