package jf;

import android.graphics.Bitmap;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.RandomAccessFile;
import lf.m;
public abstract class a {
    public String f14098a;
    public long f14099b;
    public String f14100c;
    public String d;
    public String f14101e;
    public String f14102f;
    public short f14103g;
    public String h;
    public String f14104i;
    public short f14105j;
    public short f14106k;
    public String f14107l;
    public String f14108m;
    public String f14109n;
    public Bitmap f14110o;
    public Bitmap f14111p;
    public File f14112q;

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
                if (!bVar.f14114s) {
                    return bVar;
                }
                return null;
            }
            if (!file.getAbsolutePath().endsWith("mp3") && (((b10 = bArr[0]) != 73 || bArr[1] != 68 || bArr[2] != 51) && (b10 != 84 || bArr[1] != 65 || bArr[2] != 71))) {
                b bVar2 = new b(file);
                if (!bVar2.f14114s) {
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
