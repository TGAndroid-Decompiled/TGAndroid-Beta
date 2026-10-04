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
    public final int f4727a;
    public final ArrayList f4728b = new ArrayList();
    public boolean f4729c;
    public boolean d;
    public boolean f4730e;
    public boolean f4731f;
    public File f4732g;

    public b1(int i10) {
        this.f4727a = i10;
        if (!this.f4730e && !this.f4731f) {
            this.f4731f = true;
            x0 x0Var = new x0(this, 0);
            MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
            messagesStorage.getStorageQueue().postRunnable(new y0((Object) messagesStorage, true, (Object) x0Var, 0));
        }
    }

    public final void a(a1 a1Var) {
        String str;
        StringBuilder sb2;
        long j3;
        int i10 = this.f4727a;
        MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
        StringBuilder sb3 = new StringBuilder("StoryDraft append ");
        sb3.append(a1Var.f4657a);
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

    public final void b(k8 k8Var) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(k8Var);
        c(arrayList);
    }

    public final void c(ArrayList arrayList) {
        String str;
        StringBuilder sb2;
        long j3;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                k8 k8Var = (k8) arrayList.get(i10);
                if (k8Var != null) {
                    StringBuilder sb3 = new StringBuilder("StoryDraft delete ");
                    sb3.append(k8Var.f5313b);
                    sb3.append(" (edit=");
                    sb3.append(k8Var.f5326g);
                    if (k8Var.f5326g) {
                        StringBuilder sb4 = new StringBuilder(", storyId=");
                        sb4.append(k8Var.f5324f);
                        sb4.append(", ");
                        if (k8Var.H != 0) {
                            sb2 = new StringBuilder("documentId=");
                            j3 = k8Var.H;
                        } else {
                            sb2 = new StringBuilder("photoId=");
                            j3 = k8Var.I;
                        }
                        sb2.append(j3);
                        sb4.append(sb2.toString());
                        sb4.append(", expireDate=");
                        sb4.append(k8Var.J);
                        str = sb4.toString();
                    } else {
                        str = "";
                    }
                    sb3.append(str);
                    sb3.append(", now=");
                    sb3.append(System.currentTimeMillis());
                    sb3.append(")");
                    FileLog.d(sb3.toString());
                    arrayList2.add(Long.valueOf(k8Var.f5313b));
                    k8Var.i(true);
                }
            }
            if (arrayList2.isEmpty()) {
                return;
            }
            this.f4728b.removeAll(arrayList);
            int i11 = this.f4727a;
            MessagesStorage messagesStorage = MessagesStorage.getInstance(i11);
            messagesStorage.getStorageQueue().postRunnable(new w0(0, arrayList2, messagesStorage));
            NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesDraftsUpdated, new Object[0]);
        }
    }

    public final void d(k8 k8Var) {
        if (k8Var == null) {
            return;
        }
        e(k8Var);
        ArrayList arrayList = this.f4728b;
        arrayList.remove(k8Var);
        if (!k8Var.f5355w) {
            arrayList.add(0, k8Var);
        }
        a1 a1Var = new a1(k8Var);
        int i10 = this.f4727a;
        MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
        messagesStorage.getStorageQueue().postRunnable(new z0(messagesStorage, a1Var, 0));
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesDraftsUpdated, new Object[0]);
    }

    public final void e(k8 k8Var) {
        if (k8Var == null) {
            return;
        }
        if (k8Var.f5313b == 0) {
            k8Var.f5313b = Utilities.random.nextLong();
        }
        k8Var.d = System.currentTimeMillis();
        k8Var.f5316c = true;
        if (k8Var.M) {
            k8Var.L = f(k8Var.L);
        } else if (k8Var.L != null) {
            File x10 = k8.x(this.f4727a, k8Var.K);
            try {
                AndroidUtilities.copyFile(k8Var.L, x10);
                k8Var.L = f(x10);
                k8Var.M = true;
            } catch (IOException e7) {
                FileLog.e(e7);
            }
        }
        k8Var.Z0 = f(k8Var.Z0);
        k8Var.P0 = f(k8Var.P0);
        k8Var.O0 = f(k8Var.O0);
    }

    public final File f(File file) {
        if (file == null) {
            return null;
        }
        if (this.f4732g == null) {
            File file2 = new File(FileLoader.getDirectory(4), "drafts");
            this.f4732g = file2;
            if (!file2.exists()) {
                this.f4732g.mkdir();
            }
        }
        if (!file.getAbsolutePath().startsWith(this.f4732g.getAbsolutePath())) {
            File file3 = new File(this.f4732g, file.getName());
            if (file.renameTo(file3)) {
                return file3;
            }
        }
        return file;
    }
}
