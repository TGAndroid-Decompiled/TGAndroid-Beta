package c8;

import android.opengl.GLES20;
import android.opengl.GLES30;
import android.util.AtomicFile;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public abstract class bd {
    public static int a(int i7, String str) {
        int glCreateShader = GLES20.glCreateShader(i7);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        String glGetShaderInfoLog = GLES20.glGetShaderInfoLog(glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        throw new IllegalStateException(glGetShaderInfoLog);
    }

    public static boolean b(int i7, AtomicFile atomicFile) {
        DataInputStream dataInputStream;
        if (!atomicFile.getBaseFile().isFile()) {
            return false;
        }
        try {
            dataInputStream = new DataInputStream(atomicFile.openRead());
        } catch (Exception unused) {
        }
        if (dataInputStream.readInt() == 1145524273) {
            int readInt = dataInputStream.readInt();
            int readInt2 = dataInputStream.readInt();
            if (readInt2 > 0 && readInt2 <= 16777216) {
                int[] iArr = new int[1];
                byte[] bArr = new byte[readInt2];
                dataInputStream.readFully(bArr);
                if (dataInputStream.read() == -1) {
                    ByteBuffer order = ByteBuffer.allocateDirect(readInt2).order(ByteOrder.nativeOrder());
                    order.put(bArr).position(0);
                    while (GLES20.glGetError() != 0) {
                    }
                    GLES30.glProgramBinary(i7, readInt, order, readInt2);
                    int glGetError = GLES20.glGetError();
                    GLES20.glGetProgramiv(i7, 35714, iArr, 0);
                    if (glGetError == 0 && iArr[0] != 0) {
                        dataInputStream.close();
                        return true;
                    }
                    dataInputStream.close();
                    atomicFile.delete();
                    return false;
                }
                throw new IllegalStateException("Invalid binary size");
            }
            throw new IllegalStateException("Invalid binary length");
        }
        throw new IllegalStateException("Invalid program cache");
    }

    public static void c(int i7, AtomicFile atomicFile) {
        FileOutputStream fileOutputStream = null;
        try {
            int[] iArr = new int[1];
            int[] iArr2 = new int[1];
            GLES20.glGetProgramiv(i7, 34625, iArr, 0);
            int i10 = iArr[0];
            if (i10 > 0 && i10 <= 16777216) {
                ByteBuffer order = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
                GLES30.glGetProgramBinary(i7, iArr[0], iArr, 0, iArr2, 0, order);
                int i11 = iArr[0];
                if (i11 > 0) {
                    byte[] bArr = new byte[i11];
                    order.position(0);
                    order.get(bArr);
                    fileOutputStream = atomicFile.startWrite();
                    DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
                    dataOutputStream.writeInt(1145524273);
                    dataOutputStream.writeInt(iArr2[0]);
                    dataOutputStream.writeInt(i11);
                    dataOutputStream.write(bArr);
                    dataOutputStream.flush();
                    atomicFile.finishWrite(fileOutputStream);
                }
            }
        } catch (Exception unused) {
            if (fileOutputStream != null) {
                atomicFile.failWrite(fileOutputStream);
            }
        }
    }
}
