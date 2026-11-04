package org.telegram.messenger;

import java.io.File;
public final class je extends File {
    public final int f23662a;

    public je(int i3, File file, String str) {
        super(file, str);
        this.f23662a = i3;
    }

    @Override
    public final boolean delete() {
        switch (this.f23662a) {
            case 0:
                if (r2.f25040a) {
                    a8.d("delete voice file (trimmed)");
                }
                return super.delete();
            case 1:
                if (r2.f25040a) {
                    a8.d("delete voice file (from resume)");
                }
                return super.delete();
            default:
                if (r2.f25040a) {
                    a8.d("delete camera file");
                }
                return super.delete();
        }
    }
}
