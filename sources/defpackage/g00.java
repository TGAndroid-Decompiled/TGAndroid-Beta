package defpackage;

import android.graphics.Bitmap;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.RandomAccessFile;
public abstract class g00 {
    public String a;
    public long b;
    public String c;
    public String d;
    public String e;
    public String f;
    public short g;
    public String h;
    public String i;
    public short j;
    public short k;
    public String l;
    public String m;
    public String n;
    public Bitmap o;
    public Bitmap p;
    public File q;

    public static g00 a(File file) {
        byte b;
        try {
            byte[] bArr = new byte[12];
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            randomAccessFile.readFully(bArr, 0, 8);
            randomAccessFile.close();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            if (bArr[4] == 102 && bArr[5] == 116 && bArr[6] == 121 && bArr[7] == 112) {
                return new hg6(bufferedInputStream);
            }
            if (bArr[0] == 102 && bArr[1] == 76 && bArr[2] == 97 && bArr[3] == 99) {
                br7 br7Var = new br7(file);
                if (!br7Var.s) {
                    return br7Var;
                }
                return null;
            } else if (!file.getAbsolutePath().endsWith("mp3") && (((b = bArr[0]) != 73 || bArr[1] != 68 || bArr[2] != 51) && (b != 84 || bArr[1] != 65 || bArr[2] != 71))) {
                br7 br7Var2 = new br7(file);
                if (!br7Var2.s) {
                    return br7Var2;
                }
                return null;
            } else {
                return new qg6(bufferedInputStream, file.length());
            }
        } catch (Exception unused) {
            return null;
        }
    }
}
