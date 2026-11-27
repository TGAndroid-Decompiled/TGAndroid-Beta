package defpackage;

import java.io.DataInputStream;
public abstract class oue {
    public static float[] a(DataInputStream dataInputStream) {
        int readInt = dataInputStream.readInt();
        float[] fArr = new float[readInt];
        for (int i = 0; i < readInt; i++) {
            fArr[i] = dataInputStream.readFloat();
        }
        return fArr;
    }
}
