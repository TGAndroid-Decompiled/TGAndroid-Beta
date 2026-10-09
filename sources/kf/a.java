package kf;

import android.graphics.Bitmap;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.RandomAccessFile;
import mf.m;
public abstract class a {
    public String f14793a;
    public long f14794b;
    public String f14795c;
    public String d;
    public String f14796e;
    public String f14797f;
    public short f14798g;
    public String h;
    public String f14799i;
    public short f14800j;
    public short f14801k;
    public String f14802l;
    public String f14803m;
    public String f14804n;
    public Bitmap f14805o;
    public Bitmap f14806p;
    public File f14807q;

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
                if (!bVar.f14809s) {
                    return bVar;
                }
                return null;
            }
            if (!file.getAbsolutePath().endsWith("mp3") && (((b10 = bArr[0]) != 73 || bArr[1] != 68 || bArr[2] != 51) && (b10 != 84 || bArr[1] != 65 || bArr[2] != 71))) {
                b bVar2 = new b(file);
                if (!bVar2.f14809s) {
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
