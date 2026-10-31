package cf;

import android.graphics.Bitmap;
import ef.l;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.RandomAccessFile;
public abstract class a {
    public String f4142a;
    public long f4143b;
    public String f4144c;
    public String d;
    public String e;
    public String f4145f;
    public short f4146g;
    public String h;
    public String f4147i;
    public short f4148j;
    public short f4149k;
    public String f4150l;
    public String f4151m;
    public String f4152n;
    public Bitmap f4153o;
    public Bitmap f4154p;
    public File f4155q;

    public static a a(File file) {
        byte b10;
        try {
            byte[] bArr = new byte[12];
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            randomAccessFile.readFully(bArr, 0, 8);
            randomAccessFile.close();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            if (bArr[4] == 102 && bArr[5] == 116 && bArr[6] == 121 && bArr[7] == 112) {
                return new df.a(bufferedInputStream);
            }
            if (bArr[0] == 102 && bArr[1] == 76 && bArr[2] == 97 && bArr[3] == 99) {
                c cVar = new c(file);
                if (!cVar.f4157s) {
                    return cVar;
                }
                return null;
            }
            if (!file.getAbsolutePath().endsWith("mp3") && (((b10 = bArr[0]) != 73 || bArr[1] != 68 || bArr[2] != 51) && (b10 != 84 || bArr[1] != 65 || bArr[2] != 71))) {
                c cVar2 = new c(file);
                if (!cVar2.f4157s) {
                    return cVar2;
                }
                return null;
            }
            return new l(bufferedInputStream, file.length());
        } catch (Exception unused) {
            return null;
        }
    }
}
