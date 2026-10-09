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
public final class a1 {
    public final int f4711a;
    public final ArrayList f4712b = new ArrayList();
    public boolean f4713c;
    public boolean d;
    public boolean f4714e;
    public boolean f4715f;
    public File f4716g;

    public a1(int i10) {
        this.f4711a = i10;
        if (!this.f4714e && !this.f4715f) {
            this.f4715f = true;
            w0 w0Var = new w0(this, 0);
            MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
            messagesStorage.getStorageQueue().postRunnable(new x0((Object) messagesStorage, true, (Object) w0Var, 0));
        }
    }

    public final void a(z0 z0Var) {
        String str;
        StringBuilder sb2;
        long j3;
        int i10 = this.f4711a;
        MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
        StringBuilder sb3 = new StringBuilder("StoryDraft append ");
        sb3.append(z0Var.f6381a);
        sb3.append(" (edit=");
        sb3.append(z0Var.G);
        if (z0Var.G) {
            StringBuilder sb4 = new StringBuilder(", storyId=");
            sb4.append(z0Var.H);
            sb4.append(", ");
            if (z0Var.J != 0) {
                sb2 = new StringBuilder("documentId=");
                j3 = z0Var.J;
            } else {
                sb2 = new StringBuilder("photoId=");
                j3 = z0Var.K;
            }
            sb2.append(j3);
            sb4.append(sb2.toString());
            sb4.append(", expireDate=");
            sb4.append(z0Var.L);
            str = sb4.toString();
        } else {
            str = "";
        }
        sb3.append(str);
        sb3.append(", now=");
        sb3.append(System.currentTimeMillis());
        sb3.append(")");
        FileLog.d(sb3.toString());
        messagesStorage.getStorageQueue().postRunnable(new y0(messagesStorage, z0Var, 1));
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesDraftsUpdated, new Object[0]);
    }

    public final void b(l8 l8Var) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(l8Var);
        c(arrayList);
    }

    public final void c(ArrayList arrayList) {
        String str;
        StringBuilder sb2;
        long j3;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                l8 l8Var = (l8) arrayList.get(i10);
                if (l8Var != null) {
                    StringBuilder sb3 = new StringBuilder("StoryDraft delete ");
                    sb3.append(l8Var.f5397b);
                    sb3.append(" (edit=");
                    sb3.append(l8Var.f5410g);
                    if (l8Var.f5410g) {
                        StringBuilder sb4 = new StringBuilder(", storyId=");
                        sb4.append(l8Var.f5408f);
                        sb4.append(", ");
                        if (l8Var.H != 0) {
                            sb2 = new StringBuilder("documentId=");
                            j3 = l8Var.H;
                        } else {
                            sb2 = new StringBuilder("photoId=");
                            j3 = l8Var.I;
                        }
                        sb2.append(j3);
                        sb4.append(sb2.toString());
                        sb4.append(", expireDate=");
                        sb4.append(l8Var.J);
                        str = sb4.toString();
                    } else {
                        str = "";
                    }
                    sb3.append(str);
                    sb3.append(", now=");
                    sb3.append(System.currentTimeMillis());
                    sb3.append(")");
                    FileLog.d(sb3.toString());
                    arrayList2.add(Long.valueOf(l8Var.f5397b));
                    l8Var.i(true);
                }
            }
            if (arrayList2.isEmpty()) {
                return;
            }
            this.f4712b.removeAll(arrayList);
            int i11 = this.f4711a;
            MessagesStorage messagesStorage = MessagesStorage.getInstance(i11);
            messagesStorage.getStorageQueue().postRunnable(new v0(0, arrayList2, messagesStorage));
            NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesDraftsUpdated, new Object[0]);
        }
    }

    public final void d(l8 l8Var) {
        if (l8Var == null) {
            return;
        }
        e(l8Var);
        ArrayList arrayList = this.f4712b;
        arrayList.remove(l8Var);
        if (!l8Var.f5439w) {
            arrayList.add(0, l8Var);
        }
        z0 z0Var = new z0(l8Var);
        int i10 = this.f4711a;
        MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
        messagesStorage.getStorageQueue().postRunnable(new y0(messagesStorage, z0Var, 0));
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesDraftsUpdated, new Object[0]);
    }

    public final void e(l8 l8Var) {
        if (l8Var == null) {
            return;
        }
        if (l8Var.f5397b == 0) {
            l8Var.f5397b = Utilities.random.nextLong();
        }
        l8Var.d = System.currentTimeMillis();
        l8Var.f5400c = true;
        if (l8Var.M) {
            l8Var.L = f(l8Var.L);
        } else if (l8Var.L != null) {
            File x10 = l8.x(this.f4711a, l8Var.K);
            try {
                AndroidUtilities.copyFile(l8Var.L, x10);
                l8Var.L = f(x10);
                l8Var.M = true;
            } catch (IOException e7) {
                FileLog.e(e7);
            }
        }
        l8Var.Z0 = f(l8Var.Z0);
        l8Var.P0 = f(l8Var.P0);
        l8Var.O0 = f(l8Var.O0);
    }

    public final File f(File file) {
        if (file == null) {
            return null;
        }
        if (this.f4716g == null) {
            File file2 = new File(FileLoader.getDirectory(4), "drafts");
            this.f4716g = file2;
            if (!file2.exists()) {
                this.f4716g.mkdir();
            }
        }
        if (!file.getAbsolutePath().startsWith(this.f4716g.getAbsolutePath())) {
            File file3 = new File(this.f4716g, file.getName());
            if (file.renameTo(file3)) {
                return file3;
            }
        }
        return file;
    }
}
