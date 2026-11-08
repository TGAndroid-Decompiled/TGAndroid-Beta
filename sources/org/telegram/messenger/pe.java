package org.telegram.messenger;

import java.io.File;
public final class pe extends File {
    public final int f24548a;

    public pe(int i7, File file, String str) {
        super(file, str);
        this.f24548a = i7;
    }

    @Override
    public final boolean delete() {
        switch (this.f24548a) {
            case 0:
                if (r2.f25212a) {
                    a8.d("delete voice file (trimmed)");
                }
                return super.delete();
            case 1:
                if (r2.f25212a) {
                    a8.d("delete voice file (from resume)");
                }
                return super.delete();
            default:
                if (r2.f25212a) {
                    a8.d("delete camera file");
                }
                return super.delete();
        }
    }
}
