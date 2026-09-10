package bi;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
public final class f1 {
    public final int f2683a;
    public final ArrayList f2684b = new ArrayList();
    public boolean f2685c;
    public boolean d;
    public boolean e;
    public boolean f2686f;
    public File f2687g;

    public f1(int i10) {
        this.f2683a = i10;
        if (!this.e && !this.f2686f) {
            this.f2686f = true;
            b1 b1Var = new b1(this, 0);
            MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
            messagesStorage.getStorageQueue().postRunnable(new c1((Object) messagesStorage, true, (Object) b1Var, 0));
        }
    }

    public final void a(e1 e1Var) {
        String str;
        StringBuilder sb2;
        long j3;
        int i10 = this.f2683a;
        MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
        StringBuilder sb3 = new StringBuilder("StoryDraft append ");
        sb3.append(e1Var.f2578a);
        sb3.append(" (edit=");
        sb3.append(e1Var.G);
        if (e1Var.G) {
            StringBuilder sb4 = new StringBuilder(", storyId=");
            sb4.append(e1Var.H);
            sb4.append(", ");
            if (e1Var.J != 0) {
                sb2 = new StringBuilder("documentId=");
                j3 = e1Var.J;
            } else {
                sb2 = new StringBuilder("photoId=");
                j3 = e1Var.K;
            }
            sb2.append(j3);
            sb4.append(sb2.toString());
            sb4.append(", expireDate=");
            sb4.append(e1Var.L);
            str = sb4.toString();
        } else {
            str = "";
        }
        sb3.append(str);
        sb3.append(", now=");
        sb3.append(System.currentTimeMillis());
        sb3.append(")");
        FileLog.d(sb3.toString());
        messagesStorage.getStorageQueue().postRunnable(new d1(messagesStorage, e1Var, 1));
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesDraftsUpdated, new Object[0]);
    }

    public final void b(r9 r9Var) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(r9Var);
        c(arrayList);
    }

    public final void c(ArrayList arrayList) {
        String str;
        StringBuilder sb2;
        long j3;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                r9 r9Var = (r9) arrayList.get(i10);
                if (r9Var != null) {
                    StringBuilder sb3 = new StringBuilder("StoryDraft delete ");
                    sb3.append(r9Var.f3562b);
                    sb3.append(" (edit=");
                    sb3.append(r9Var.f3574g);
                    if (r9Var.f3574g) {
                        StringBuilder sb4 = new StringBuilder(", storyId=");
                        sb4.append(r9Var.f3572f);
                        sb4.append(", ");
                        if (r9Var.H != 0) {
                            sb2 = new StringBuilder("documentId=");
                            j3 = r9Var.H;
                        } else {
                            sb2 = new StringBuilder("photoId=");
                            j3 = r9Var.I;
                        }
                        sb2.append(j3);
                        sb4.append(sb2.toString());
                        sb4.append(", expireDate=");
                        sb4.append(r9Var.J);
                        str = sb4.toString();
                    } else {
                        str = "";
                    }
                    sb3.append(str);
                    sb3.append(", now=");
                    sb3.append(System.currentTimeMillis());
                    sb3.append(")");
                    FileLog.d(sb3.toString());
                    arrayList2.add(Long.valueOf(r9Var.f3562b));
                    r9Var.i(true);
                }
            }
            if (arrayList2.isEmpty()) {
                return;
            }
            this.f2684b.removeAll(arrayList);
            int i11 = this.f2683a;
            MessagesStorage messagesStorage = MessagesStorage.getInstance(i11);
            messagesStorage.getStorageQueue().postRunnable(new a1(0, arrayList2, messagesStorage));
            NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesDraftsUpdated, new Object[0]);
        }
    }

    public final void d(r9 r9Var) {
        if (r9Var == null) {
            return;
        }
        e(r9Var);
        ArrayList arrayList = this.f2684b;
        arrayList.remove(r9Var);
        if (!r9Var.f3603w) {
            arrayList.add(0, r9Var);
        }
        e1 e1Var = new e1(r9Var);
        int i10 = this.f2683a;
        MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
        messagesStorage.getStorageQueue().postRunnable(new d1(messagesStorage, e1Var, 0));
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesDraftsUpdated, new Object[0]);
    }

    public final void e(r9 r9Var) {
        if (r9Var == null) {
            return;
        }
        if (r9Var.f3562b == 0) {
            r9Var.f3562b = Utilities.random.nextLong();
        }
        r9Var.d = System.currentTimeMillis();
        r9Var.f3565c = true;
        if (r9Var.M) {
            r9Var.L = f(r9Var.L);
        } else if (r9Var.L != null) {
            File x10 = r9.x(this.f2683a, r9Var.K);
            try {
                AndroidUtilities.copyFile(r9Var.L, x10);
                r9Var.L = f(x10);
                r9Var.M = true;
            } catch (IOException e) {
                FileLog.e(e);
            }
        }
        r9Var.Z0 = f(r9Var.Z0);
        r9Var.P0 = f(r9Var.P0);
        r9Var.O0 = f(r9Var.O0);
    }

    public final File f(File file) {
        if (file == null) {
            return null;
        }
        if (this.f2687g == null) {
            File file2 = new File(FileLoader.getDirectory(4), "drafts");
            this.f2687g = file2;
            if (!file2.exists()) {
                this.f2687g.mkdir();
            }
        }
        if (!file.getAbsolutePath().startsWith(this.f2687g.getAbsolutePath())) {
            File file3 = new File(this.f2687g, file.getName());
            if (file.renameTo(file3)) {
                return file3;
            }
        }
        return file;
    }
}
