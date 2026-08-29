package e2;

import j$.util.Objects;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public final class i {
    public final int f5789a;
    public final int f5790b;
    public final long f5791c;
    public final long d;

    public i(long j10, int i10, int i11, long j11) {
        this.f5789a = i10;
        this.f5790b = i11;
        this.f5791c = j10;
        this.d = j11;
    }

    public static i a(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            i iVar = new i(dataInputStream.readLong(), dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong());
            dataInputStream.close();
            return iVar;
        } catch (Throwable th2) {
            try {
                dataInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void b(File file) {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f5789a);
            dataOutputStream.writeInt(this.f5790b);
            dataOutputStream.writeLong(this.f5791c);
            dataOutputStream.writeLong(this.d);
            dataOutputStream.close();
        } catch (Throwable th2) {
            try {
                dataOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof i)) {
            i iVar = (i) obj;
            if (this.f5790b == iVar.f5790b && this.f5791c == iVar.f5791c && this.f5789a == iVar.f5789a && this.d == iVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f5790b), Long.valueOf(this.f5791c), Integer.valueOf(this.f5789a), Long.valueOf(this.d));
    }
}
