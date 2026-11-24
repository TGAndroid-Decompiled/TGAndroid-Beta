package defpackage;

import java.io.File;
public final class pl6 extends File {
    public final byte a;

    public pl6(File file, String str, byte b) {
        super(file, str);
        this.a = b;
    }

    @Override
    public final boolean delete() {
        switch (this.a) {
            case 0:
                if (w01.a) {
                    fa4.d("delete voice file (trimmed)");
                }
                return super.delete();
            default:
                if (w01.a) {
                    fa4.d("delete voice file (from resume)");
                }
                return super.delete();
        }
    }
}
