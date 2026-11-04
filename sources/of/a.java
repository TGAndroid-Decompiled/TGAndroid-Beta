package of;

import android.graphics.Bitmap;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.RandomAccessFile;
import qf.l;
public abstract class a {
    public String f21037a;
    public long f21038b;
    public String f21039c;
    public String d;
    public String f21040e;
    public String f21041f;
    public short f21042g;
    public String h;
    public String f21043i;
    public short f21044j;
    public short f21045k;
    public String f21046l;
    public String f21047m;
    public String f21048n;
    public Bitmap f21049o;
    public Bitmap f21050p;
    public File f21051q;

    public static a a(File file) {
        byte b10;
        try {
            byte[] bArr = new byte[12];
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            randomAccessFile.readFully(bArr, 0, 8);
            randomAccessFile.close();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            if (bArr[4] == 102 && bArr[5] == 116 && bArr[6] == 121 && bArr[7] == 112) {
                return new pf.a(bufferedInputStream);
            }
            if (bArr[0] == 102 && bArr[1] == 76 && bArr[2] == 97 && bArr[3] == 99) {
                b bVar = new b(file);
                if (!bVar.f21053s) {
                    return bVar;
                }
                return null;
            }
            if (!file.getAbsolutePath().endsWith("mp3") && (((b10 = bArr[0]) != 73 || bArr[1] != 68 || bArr[2] != 51) && (b10 != 84 || bArr[1] != 65 || bArr[2] != 71))) {
                b bVar2 = new b(file);
                if (!bVar2.f21053s) {
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
