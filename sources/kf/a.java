package kf;

import android.graphics.Bitmap;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.RandomAccessFile;
import mf.l;
public abstract class a {
    public String f14901a;
    public long f14902b;
    public String f14903c;
    public String d;
    public String f14904e;
    public String f14905f;
    public short f14906g;
    public String h;
    public String f14907i;
    public short f14908j;
    public short f14909k;
    public String f14910l;
    public String f14911m;
    public String f14912n;
    public Bitmap f14913o;
    public Bitmap f14914p;
    public File f14915q;

    public static a a(File file) {
        byte b10;
        try {
            byte[] bArr = new byte[12];
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            randomAccessFile.readFully(bArr, 0, 8);
            randomAccessFile.close();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            if (bArr[4] == 102 && bArr[5] == 116 && bArr[6] == 121 && bArr[7] == 112) {
                return new lf.a(bufferedInputStream);
            }
            if (bArr[0] == 102 && bArr[1] == 76 && bArr[2] == 97 && bArr[3] == 99) {
                b bVar = new b(file);
                if (!bVar.f14917s) {
                    return bVar;
                }
                return null;
            }
            if (!file.getAbsolutePath().endsWith("mp3") && (((b10 = bArr[0]) != 73 || bArr[1] != 68 || bArr[2] != 51) && (b10 != 84 || bArr[1] != 65 || bArr[2] != 71))) {
                b bVar2 = new b(file);
                if (!bVar2.f14917s) {
                    return bVar2;
                }
                return null;
            }
            return new l(bufferedInputStream, file.length());
        } catch (Exception unused) {
            return null;
        }
    }
}
