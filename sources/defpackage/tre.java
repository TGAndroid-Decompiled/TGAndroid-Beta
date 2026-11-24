package defpackage;

import java.nio.ByteBuffer;
import java.util.UUID;
public abstract class tre {
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

    public static ju8 b(byte[] bArr) {
        UUID[] uuidArr;
        xu7 xu7Var = new xu7(bArr);
        if (xu7Var.c < 32) {
            return null;
        }
        xu7Var.N(0);
        int a = xu7Var.a();
        int m = xu7Var.m();
        if (m != a) {
            lad.f("PsshAtomUtil", "Advertised atom size (" + m + ") does not match buffer size: " + a);
            return null;
        }
        int m2 = xu7Var.m();
        if (m2 != 1886614376) {
            b00.o(m2, "Atom type is not pssh: ", "PsshAtomUtil");
            return null;
        }
        int e = ry0.e(xu7Var.m());
        if (e > 1) {
            b00.o(e, "Unsupported pssh version: ", "PsshAtomUtil");
            return null;
        }
        UUID uuid = new UUID(xu7Var.u(), xu7Var.u());
        if (e == 1) {
            int E = xu7Var.E();
            uuidArr = new UUID[E];
            for (int i = 0; i < E; i++) {
                uuidArr[i] = new UUID(xu7Var.u(), xu7Var.u());
            }
        } else {
            uuidArr = null;
        }
        int E2 = xu7Var.E();
        int a2 = xu7Var.a();
        if (E2 != a2) {
            lad.f("PsshAtomUtil", "Atom data size (" + E2 + ") does not match the bytes left: " + a2);
            return null;
        }
        byte[] bArr2 = new byte[E2];
        xu7Var.k(0, E2, bArr2);
        return new ju8(uuid, e, bArr2, uuidArr);
    }

    public static byte[] c(UUID uuid, byte[] bArr) {
        ju8 b = b(bArr);
        if (b == null) {
            return null;
        }
        UUID uuid2 = (UUID) b.c;
        if (!uuid.equals(uuid2)) {
            lad.f("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + uuid2 + ".");
            return null;
        }
        return b.b;
    }
}
