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
    public final int f4367a;
    public final ArrayList f4368b = new ArrayList();
    public boolean f4369c;
    public boolean d;
    public boolean e;
    public boolean f4370f;
    public File f4371g;

    public b1(int i10) {
        this.f4367a = i10;
        if (!this.e && !this.f4370f) {
            this.f4370f = true;
            x0 x0Var = new x0(this, 0);
            MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
            messagesStorage.getStorageQueue().postRunnable(new y0((Object) messagesStorage, true, (Object) x0Var, 0));
        }
    }

    public final void a(a1 a1Var) {
        String str;
        StringBuilder sb2;
        long j3;
        int i10 = this.f4367a;
        MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
        StringBuilder sb3 = new StringBuilder("StoryDraft append ");
        sb3.append(a1Var.f4305a);
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
                    sb3.append(l8Var.f4967b);
                    sb3.append(" (edit=");
                    sb3.append(l8Var.f4979g);
                    if (l8Var.f4979g) {
                        StringBuilder sb4 = new StringBuilder(", storyId=");
                        sb4.append(l8Var.f4977f);
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
                    arrayList2.add(Long.valueOf(l8Var.f4967b));
                    l8Var.i(true);
                }
            }
            if (arrayList2.isEmpty()) {
                return;
            }
            this.f4368b.removeAll(arrayList);
            int i11 = this.f4367a;
            MessagesStorage messagesStorage = MessagesStorage.getInstance(i11);
            messagesStorage.getStorageQueue().postRunnable(new w0(0, arrayList2, messagesStorage));
            NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesDraftsUpdated, new Object[0]);
        }
    }

    public final void d(l8 l8Var) {
        if (l8Var == null) {
            return;
        }
        e(l8Var);
        ArrayList arrayList = this.f4368b;
        arrayList.remove(l8Var);
        if (!l8Var.f5008w) {
            arrayList.add(0, l8Var);
        }
        a1 a1Var = new a1(l8Var);
        int i10 = this.f4367a;
        MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
        messagesStorage.getStorageQueue().postRunnable(new z0(messagesStorage, a1Var, 0));
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesDraftsUpdated, new Object[0]);
    }

    public final void e(l8 l8Var) {
        if (l8Var == null) {
            return;
        }
        if (l8Var.f4967b == 0) {
            l8Var.f4967b = Utilities.random.nextLong();
        }
        l8Var.d = System.currentTimeMillis();
        l8Var.f4970c = true;
        if (l8Var.M) {
            l8Var.L = f(l8Var.L);
        } else if (l8Var.L != null) {
            File x10 = l8.x(this.f4367a, l8Var.K);
            try {
                AndroidUtilities.copyFile(l8Var.L, x10);
                l8Var.L = f(x10);
                l8Var.M = true;
            } catch (IOException e) {
                FileLog.e(e);
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
        if (this.f4371g == null) {
            File file2 = new File(FileLoader.getDirectory(4), "drafts");
            this.f4371g = file2;
            if (!file2.exists()) {
                this.f4371g.mkdir();
            }
        }
        if (!file.getAbsolutePath().startsWith(this.f4371g.getAbsolutePath())) {
            File file3 = new File(this.f4371g, file.getName());
            if (file.renameTo(file3)) {
                return file3;
            }
        }
        return file;
    }
}
