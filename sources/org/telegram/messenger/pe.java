package org.telegram.messenger;

import java.io.File;
public final class pe extends File {
    public final int f17432a;

    public pe(int i10, File file, String str) {
        super(file, str);
        this.f17432a = i10;
    }

    @Override
    public final boolean delete() {
        switch (this.f17432a) {
            case 0:
                if (v2.f18448a) {
                    f8.d("delete voice file (trimmed)");
                }
                return super.delete();
            case 1:
                if (v2.f18448a) {
                    f8.d("delete voice file (from resume)");
                }
                return super.delete();
            default:
                if (v2.f18448a) {
                    f8.d("delete camera file");
                }
                return super.delete();
        }
    }
}
