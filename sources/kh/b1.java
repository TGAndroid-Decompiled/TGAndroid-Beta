package kh;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
public final class b1 {
    public final int f14976a;
    public final ArrayList f14977b = new ArrayList();
    public boolean f14978c;
    public boolean d;
    public boolean f14979e;
    public boolean f14980f;
    public File f14981g;

    public b1(int i9) {
        this.f14976a = i9;
        if (!this.f14979e && !this.f14980f) {
            this.f14980f = true;
            y0 y0Var = new y0(this, 0);
            MessagesStorage messagesStorage = MessagesStorage.getInstance(i9);
            messagesStorage.getStorageQueue().postRunnable(new gh.u5((Object) messagesStorage, true, (Object) y0Var, 3));
        }
    }

    public final void a(a1 a1Var) {
        String str;
        StringBuilder sb2;
        long j10;
        int i9 = this.f14976a;
        MessagesStorage messagesStorage = MessagesStorage.getInstance(i9);
        StringBuilder sb3 = new StringBuilder("StoryDraft append ");
        sb3.append(a1Var.f14846a);
        sb3.append(" (edit=");
        sb3.append(a1Var.G);
        if (a1Var.G) {
            StringBuilder sb4 = new StringBuilder(", storyId=");
            sb4.append(a1Var.H);
            sb4.append(", ");
            if (a1Var.J != 0) {
                sb2 = new StringBuilder("documentId=");
                j10 = a1Var.J;
            } else {
                sb2 = new StringBuilder("photoId=");
                j10 = a1Var.K;
            }
            sb2.append(j10);
            sb4.append(sb2.toString());
            sb4.append(", expireDate=");
            sb4.append(a1Var.L);
            str = sb4.toString();
        } else {
            str = "";
        }
        sb3.append(str);
        sb3.append(", now=");
        sb3.append(System.currentTimeMillis());
        sb3.append(")");
        FileLog.d(sb3.toString());
        messagesStorage.getStorageQueue().postRunnable(new z0(messagesStorage, a1Var, 1));
        NotificationCenter.getInstance(i9).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesDraftsUpdated, new Object[0]);
    }

    public final void b(ArrayList arrayList) {
        String str;
        StringBuilder sb2;
        long j10;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList();
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                a8 a8Var = (a8) arrayList.get(i9);
                if (a8Var != null) {
                    StringBuilder sb3 = new StringBuilder("StoryDraft delete ");
                    sb3.append(a8Var.f14904b);
                    sb3.append(" (edit=");
                    sb3.append(a8Var.f14917g);
                    if (a8Var.f14917g) {
                        StringBuilder sb4 = new StringBuilder(", storyId=");
                        sb4.append(a8Var.f14915f);
                        sb4.append(", ");
                        if (a8Var.H != 0) {
                            sb2 = new StringBuilder("documentId=");
                            j10 = a8Var.H;
                        } else {
                            sb2 = new StringBuilder("photoId=");
                            j10 = a8Var.I;
                        }
                        sb2.append(j10);
                        sb4.append(sb2.toString());
                        sb4.append(", expireDate=");
                        sb4.append(a8Var.J);
                        str = sb4.toString();
                    } else {
                        str = "";
                    }
                    sb3.append(str);
                    sb3.append(", now=");
                    sb3.append(System.currentTimeMillis());
                    sb3.append(")");
                    FileLog.d(sb3.toString());
                    arrayList2.add(Long.valueOf(a8Var.f14904b));
                    a8Var.i(true);
                }
            }
            if (arrayList2.isEmpty()) {
                return;
            }
            this.f14977b.removeAll(arrayList);
            int i10 = this.f14976a;
            MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
            messagesStorage.getStorageQueue().postRunnable(new x0(0, arrayList2, messagesStorage));
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesDraftsUpdated, new Object[0]);
        }
    }

    public final void c(a8 a8Var) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(a8Var);
        b(arrayList);
    }

    public final void d(a8 a8Var) {
        if (a8Var == null) {
            return;
        }
        e(a8Var);
        ArrayList arrayList = this.f14977b;
        arrayList.remove(a8Var);
        if (!a8Var.f14946w) {
            arrayList.add(0, a8Var);
        }
        a1 a1Var = new a1(a8Var);
        int i9 = this.f14976a;
        MessagesStorage messagesStorage = MessagesStorage.getInstance(i9);
        messagesStorage.getStorageQueue().postRunnable(new z0(messagesStorage, a1Var, 0));
        NotificationCenter.getInstance(i9).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesDraftsUpdated, new Object[0]);
    }

    public final void e(a8 a8Var) {
        if (a8Var == null) {
            return;
        }
        if (a8Var.f14904b == 0) {
            a8Var.f14904b = Utilities.random.nextLong();
        }
        a8Var.d = System.currentTimeMillis();
        a8Var.f14907c = true;
        if (a8Var.M) {
            a8Var.L = f(a8Var.L);
        } else if (a8Var.L != null) {
            File x10 = a8.x(this.f14976a, a8Var.K);
            try {
                AndroidUtilities.copyFile(a8Var.L, x10);
                a8Var.L = f(x10);
                a8Var.M = true;
            } catch (IOException e10) {
                FileLog.e(e10);
            }
        }
        a8Var.Z0 = f(a8Var.Z0);
        a8Var.P0 = f(a8Var.P0);
        a8Var.O0 = f(a8Var.O0);
    }

    public final File f(File file) {
        if (file == null) {
            return null;
        }
        if (this.f14981g == null) {
            File file2 = new File(FileLoader.getDirectory(4), "drafts");
            this.f14981g = file2;
            if (!file2.exists()) {
                this.f14981g.mkdir();
            }
        }
        if (!file.getAbsolutePath().startsWith(this.f14981g.getAbsolutePath())) {
            File file3 = new File(this.f14981g, file.getName());
            if (file.renameTo(file3)) {
                return file3;
            }
        }
        return file;
    }
}
