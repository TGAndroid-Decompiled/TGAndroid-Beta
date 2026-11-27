package defpackage;

import java.io.File;
public final class ad4 extends az5 implements sr4 {
    public final byte b;
    public final Object c;

    public ad4(Object obj, byte b) {
        super(0);
        this.b = b;
        this.c = obj;
    }

    @Override
    public final Object invoke() {
        switch (this.b) {
            case 0:
                Object obj = bd4.e;
                File file = (File) this.c;
                synchronized (obj) {
                    bd4.d.remove(file.getAbsolutePath());
                }
                return g9c.a;
            case 1:
                ((ke5) this.c).dispose();
                return g9c.a;
            case 2:
                File file2 = (File) ((yj8) this.c).invoke();
                String name = file2.getName();
                name.getClass();
                String str = "";
                int lastIndexOf = name.lastIndexOf(46, name.length() - 1);
                if (lastIndexOf != -1) {
                    str = name.substring(lastIndexOf + 1, name.length());
                }
                if (str.equals("preferences_pb")) {
                    File absoluteFile = file2.getAbsoluteFile();
                    absoluteFile.getClass();
                    return absoluteFile;
                }
                throw new IllegalStateException(("File extension for file: " + file2 + " does not match required extension for Preferences file: preferences_pb").toString());
            default:
                return fhd.c((shc) this.c);
        }
    }
}
