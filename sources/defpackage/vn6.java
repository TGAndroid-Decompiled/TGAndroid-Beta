package defpackage;

import java.io.File;
public final class vn6 extends File {
    public final byte a;

    public vn6(File file, String str, byte b) {
        super(file, str);
        this.a = b;
    }

    @Override
    public final boolean delete() {
        switch (this.a) {
            case 0:
                if (f11.a) {
                    cc4.d("delete voice file (trimmed)");
                }
                return super.delete();
            default:
                if (f11.a) {
                    cc4.d("delete voice file (from resume)");
                }
                return super.delete();
        }
    }
}
