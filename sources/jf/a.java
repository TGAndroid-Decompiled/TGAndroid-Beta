package jf;

import android.graphics.Bitmap;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.RandomAccessFile;
import lf.m;
public abstract class a {
    public String f12980a;
    public long f12981b;
    public String f12982c;
    public String d;
    public String e;
    public String f12983f;
    public short f12984g;
    public String h;
    public String f12985i;
    public short f12986j;
    public short f12987k;
    public String f12988l;
    public String f12989m;
    public String f12990n;
    public Bitmap f12991o;
    public Bitmap f12992p;
    public File f12993q;

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
                if (!bVar.f12995s) {
                    return bVar;
                }
                return null;
            }
            if (!file.getAbsolutePath().endsWith("mp3") && (((b10 = bArr[0]) != 73 || bArr[1] != 68 || bArr[2] != 51) && (b10 != 84 || bArr[1] != 65 || bArr[2] != 71))) {
                b bVar2 = new b(file);
                if (!bVar2.f12995s) {
                    return bVar2;
                }
                return null;
            }
            return new m(bufferedInputStream, file.length());
        } catch (Exception unused) {
            return null;
        }
    }
}
