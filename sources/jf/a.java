package jf;

import android.graphics.Bitmap;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.RandomAccessFile;
import lf.n;
public abstract class a {
    public String f12978a;
    public long f12979b;
    public String f12980c;
    public String d;
    public String e;
    public String f12981f;
    public short f12982g;
    public String h;
    public String f12983i;
    public short f12984j;
    public short f12985k;
    public String f12986l;
    public String f12987m;
    public String f12988n;
    public Bitmap f12989o;
    public Bitmap f12990p;
    public File f12991q;

    public static a a(File file) {
        byte b10;
        try {
            byte[] bArr = new byte[12];
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            randomAccessFile.readFully(bArr, 0, 8);
            randomAccessFile.close();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            if (bArr[4] == 102 && bArr[5] == 116 && bArr[6] == 121 && bArr[7] == 112) {
                return new kf.a(bufferedInputStream);
            }
            if (bArr[0] == 102 && bArr[1] == 76 && bArr[2] == 97 && bArr[3] == 99) {
                b bVar = new b(file);
                if (!bVar.f12993s) {
                    return bVar;
                }
                return null;
            }
            if (!file.getAbsolutePath().endsWith("mp3") && (((b10 = bArr[0]) != 73 || bArr[1] != 68 || bArr[2] != 51) && (b10 != 84 || bArr[1] != 65 || bArr[2] != 71))) {
                b bVar2 = new b(file);
                if (!bVar2.f12993s) {
                    return bVar2;
                }
                return null;
            }
            return new n(bufferedInputStream, file.length());
        } catch (Exception unused) {
            return null;
        }
    }
}
