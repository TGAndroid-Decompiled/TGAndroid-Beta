package defpackage;

import java.io.File;
public final class rn6 extends File {
    public final byte a;

    public rn6(File file, String str, byte b) {
        super(file, str);
        this.a = b;
    }

    @Override
    public final boolean delete() {
        switch (this.a) {
            case 0:
                if (e21.a) {
                    fc4.d("delete voice file (trimmed)");
                }
                return super.delete();
            default:
                if (e21.a) {
                    fc4.d("delete voice file (from resume)");
                }
                return super.delete();
        }
    }
}
