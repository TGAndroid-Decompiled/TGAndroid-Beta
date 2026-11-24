package defpackage;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.a;
public final class sb4 implements Runnable {
    public final byte a = 1;
    public final int b;
    public final ArrayList c;

    public sb4(int i, ArrayList arrayList) {
        this.b = i;
        this.c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                ArrayList arrayList = this.c;
                int i = this.b;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    File file = (File) arrayList.get(i2);
                    File file2 = new File(file.getAbsolutePath() + ".enc");
                    if (file2.exists()) {
                        try {
                            if (!file2.delete()) {
                                file2.deleteOnExit();
                            }
                        } catch (Exception e) {
                            fc4.g(e, true);
                        }
                        try {
                            File cacheDir = a.b.getCacheDir();
                            File file3 = new File(cacheDir, file.getName() + ".enc.key");
                            if (!file3.delete()) {
                                file3.deleteOnExit();
                            }
                        } catch (Exception e2) {
                            fc4.g(e2, true);
                        }
                    } else if (file.exists()) {
                        try {
                            if (!file.delete()) {
                                file.deleteOnExit();
                            }
                        } catch (Exception e3) {
                            fc4.g(e3, true);
                        }
                    }
                    try {
                        File parentFile = file.getParentFile();
                        File file4 = new File(parentFile, "q_" + file.getName());
                        if (file4.exists() && !file4.delete()) {
                            file4.deleteOnExit();
                        }
                    } catch (Exception e4) {
                        fc4.g(e4, true);
                    }
                }
                if (i == 2) {
                    fn5.z().f();
                    return;
                }
                return;
            default:
                int i3 = this.b;
                oc7.r1(i3).d4(this.c, true);
                return;
        }
    }

    public sb4(ArrayList arrayList, int i) {
        this.c = arrayList;
        this.b = i;
    }
}
