package org.telegram.messenger;

import java.io.File;
public final class ne extends File {
    public final int f25912a;

    public ne(int i7, File file, String str) {
        super(file, str);
        this.f25912a = i7;
    }

    @Override
    public final boolean delete() {
        switch (this.f25912a) {
            case 0:
                if (s2.f26721a) {
                    a8.d("delete voice file (trimmed)");
                }
                return super.delete();
            case 1:
                if (s2.f26721a) {
                    a8.d("delete voice file (from resume)");
                }
                return super.delete();
            default:
                if (s2.f26721a) {
                    a8.d("delete camera file");
                }
                return super.delete();
        }
    }
}
