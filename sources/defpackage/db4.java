package defpackage;

import java.io.File;
public final class db4 extends vw5 implements op4 {
    public final byte b;
    public final Object c;

    public db4(Object obj, byte b) {
        super(0);
        this.b = b;
        this.c = obj;
    }

    @Override
    public final Object invoke() {
        switch (this.b) {
            case 0:
                Object obj = eb4.e;
                File file = (File) this.c;
                synchronized (obj) {
                    eb4.d.remove(file.getAbsolutePath());
                }
                return g5c.a;
            case 1:
                ((jc5) this.c).dispose();
                return g5c.a;
            case 2:
                File file2 = (File) ((kg8) this.c).invoke();
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
                return mcd.c((tdc) this.c);
        }
    }
}
