package defpackage;

import java.nio.ByteBuffer;
import java.util.UUID;
public abstract class lwe {
    public static byte[] a(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int i;
        int i2;
        if (bArr != null) {
            i = bArr.length;
        } else {
            i = 0;
        }
        int i3 = i + 32;
        if (uuidArr != null) {
            i3 += (uuidArr.length << 4) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i3);
        allocate.putInt(i3);
        allocate.putInt(1886614376);
        if (uuidArr != null) {
            i2 = 16777216;
        } else {
            i2 = 0;
        }
        allocate.putInt(i2);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr != null && bArr.length != 0) {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        } else {
            allocate.putInt(0);
        }
        return allocate.array();
    }

    public static sx8 b(byte[] bArr) {
        UUID[] uuidArr;
        ey7 ey7Var = new ey7(bArr);
        if (ey7Var.c < 32) {
            return null;
        }
        ey7Var.N(0);
        int a = ey7Var.a();
        int m = ey7Var.m();
        if (m != a) {
            efd.f("PsshAtomUtil", "Advertised atom size (" + m + ") does not match buffer size: " + a);
            return null;
        }
        int m2 = ey7Var.m();
        if (m2 != 1886614376) {
            c00.p(m2, "Atom type is not pssh: ", "PsshAtomUtil");
            return null;
        }
        int e = zy0.e(ey7Var.m());
        if (e > 1) {
            c00.p(e, "Unsupported pssh version: ", "PsshAtomUtil");
            return null;
        }
        UUID uuid = new UUID(ey7Var.u(), ey7Var.u());
        if (e == 1) {
            int E = ey7Var.E();
            uuidArr = new UUID[E];
            for (int i = 0; i < E; i++) {
                uuidArr[i] = new UUID(ey7Var.u(), ey7Var.u());
            }
        } else {
            uuidArr = null;
        }
        int E2 = ey7Var.E();
        int a2 = ey7Var.a();
        if (E2 != a2) {
            efd.f("PsshAtomUtil", "Atom data size (" + E2 + ") does not match the bytes left: " + a2);
            return null;
        }
        byte[] bArr2 = new byte[E2];
        ey7Var.k(0, E2, bArr2);
        return new sx8(uuid, e, bArr2, uuidArr);
    }

    public static byte[] c(UUID uuid, byte[] bArr) {
        sx8 b = b(bArr);
        if (b == null) {
            return null;
        }
        UUID uuid2 = (UUID) b.c;
        if (!uuid.equals(uuid2)) {
            efd.f("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + uuid2 + ".");
            return null;
        }
        return b.b;
    }
}
