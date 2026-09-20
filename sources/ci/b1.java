package ci;

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
    public final int f4382a;
    public final ArrayList f4383b = new ArrayList();
    public boolean f4384c;
    public boolean d;
    public boolean e;
    public boolean f4385f;
    public File f4386g;

    public b1(int i10) {
        this.f4382a = i10;
        if (!this.e && !this.f4385f) {
            this.f4385f = true;
            x0 x0Var = new x0(this, 0);
            MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
            messagesStorage.getStorageQueue().postRunnable(new y0((Object) messagesStorage, true, (Object) x0Var, 0));
        }
    }

    public final void a(a1 a1Var) {
        String str;
        StringBuilder sb2;
        long j3;
        int i10 = this.f4382a;
        MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
        StringBuilder sb3 = new StringBuilder("StoryDraft append ");
        sb3.append(a1Var.f4314a);
        sb3.append(" (edit=");
        sb3.append(a1Var.G);
        if (a1Var.G) {
            StringBuilder sb4 = new StringBuilder(", storyId=");
            sb4.append(a1Var.H);
            sb4.append(", ");
            if (a1Var.J != 0) {
                sb2 = new StringBuilder("documentId=");
                j3 = a1Var.J;
            } else {
                sb2 = new StringBuilder("photoId=");
                j3 = a1Var.K;
            }
            sb2.append(j3);
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
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesDraftsUpdated, new Object[0]);
    }

    public final void b(o8 o8Var) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(o8Var);
        c(arrayList);
    }

    public final void c(ArrayList arrayList) {
        String str;
        StringBuilder sb2;
        long j3;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                o8 o8Var = (o8) arrayList.get(i10);
                if (o8Var != null) {
                    StringBuilder sb3 = new StringBuilder("StoryDraft delete ");
                    sb3.append(o8Var.f5146b);
                    sb3.append(" (edit=");
                    sb3.append(o8Var.f5158g);
                    if (o8Var.f5158g) {
                        StringBuilder sb4 = new StringBuilder(", storyId=");
                        sb4.append(o8Var.f5156f);
                        sb4.append(", ");
                        if (o8Var.H != 0) {
                            sb2 = new StringBuilder("documentId=");
                            j3 = o8Var.H;
                        } else {
                            sb2 = new StringBuilder("photoId=");
                            j3 = o8Var.I;
                        }
                        sb2.append(j3);
                        sb4.append(sb2.toString());
                        sb4.append(", expireDate=");
                        sb4.append(o8Var.J);
                        str = sb4.toString();
                    } else {
                        str = "";
                    }
                    sb3.append(str);
                    sb3.append(", now=");
                    sb3.append(System.currentTimeMillis());
                    sb3.append(")");
                    FileLog.d(sb3.toString());
                    arrayList2.add(Long.valueOf(o8Var.f5146b));
                    o8Var.i(true);
                }
            }
            if (arrayList2.isEmpty()) {
                return;
            }
            this.f4383b.removeAll(arrayList);
            int i11 = this.f4382a;
            MessagesStorage messagesStorage = MessagesStorage.getInstance(i11);
            messagesStorage.getStorageQueue().postRunnable(new w0(0, arrayList2, messagesStorage));
            NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesDraftsUpdated, new Object[0]);
        }
    }

    public final void d(o8 o8Var) {
        if (o8Var == null) {
            return;
        }
        e(o8Var);
        ArrayList arrayList = this.f4383b;
        arrayList.remove(o8Var);
        if (!o8Var.f5187w) {
            arrayList.add(0, o8Var);
        }
        a1 a1Var = new a1(o8Var);
        int i10 = this.f4382a;
        MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
        messagesStorage.getStorageQueue().postRunnable(new z0(messagesStorage, a1Var, 0));
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesDraftsUpdated, new Object[0]);
    }

    public final void e(o8 o8Var) {
        if (o8Var == null) {
            return;
        }
        if (o8Var.f5146b == 0) {
            o8Var.f5146b = Utilities.random.nextLong();
        }
        o8Var.d = System.currentTimeMillis();
        o8Var.f5149c = true;
        if (o8Var.M) {
            o8Var.L = f(o8Var.L);
        } else if (o8Var.L != null) {
            File x10 = o8.x(this.f4382a, o8Var.K);
            try {
                AndroidUtilities.copyFile(o8Var.L, x10);
                o8Var.L = f(x10);
                o8Var.M = true;
            } catch (IOException e) {
                FileLog.e(e);
            }
        }
        o8Var.Z0 = f(o8Var.Z0);
        o8Var.P0 = f(o8Var.P0);
        o8Var.O0 = f(o8Var.O0);
    }

    public final File f(File file) {
        if (file == null) {
            return null;
        }
        if (this.f4386g == null) {
            File file2 = new File(FileLoader.getDirectory(4), "drafts");
            this.f4386g = file2;
            if (!file2.exists()) {
                this.f4386g.mkdir();
            }
        }
        if (!file.getAbsolutePath().startsWith(this.f4386g.getAbsolutePath())) {
            File file3 = new File(this.f4386g, file.getName());
            if (file.renameTo(file3)) {
                return file3;
            }
        }
        return file;
    }
}
