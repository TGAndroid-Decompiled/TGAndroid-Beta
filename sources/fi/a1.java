package fi;

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
    public final int f10496a;
    public final ArrayList f10497b = new ArrayList();
    public boolean f10498c;
    public boolean d;
    public boolean e;
    public boolean f10499f;
    public File f10500g;

    public a1(int i10) {
        this.f10496a = i10;
        if (!this.e && !this.f10499f) {
            this.f10499f = true;
            x0 x0Var = new x0(this, 0);
            MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
            messagesStorage.getStorageQueue().postRunnable(new bi.u7((Object) messagesStorage, true, (Object) x0Var, 3));
        }
    }

    public final void a(z0 z0Var) {
        String str;
        StringBuilder sb2;
        long j10;
        int i10 = this.f10496a;
        MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
        StringBuilder sb3 = new StringBuilder("StoryDraft append ");
        sb3.append(z0Var.f12016a);
        sb3.append(" (edit=");
        sb3.append(z0Var.G);
        if (z0Var.G) {
            StringBuilder sb4 = new StringBuilder(", storyId=");
            sb4.append(z0Var.H);
            sb4.append(", ");
            if (z0Var.J != 0) {
                sb2 = new StringBuilder("documentId=");
                j10 = z0Var.J;
            } else {
                sb2 = new StringBuilder("photoId=");
                j10 = z0Var.K;
            }
            sb2.append(j10);
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

    public final void b(w7 w7Var) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(w7Var);
        c(arrayList);
    }

    public final void c(ArrayList arrayList) {
        String str;
        StringBuilder sb2;
        long j10;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                w7 w7Var = (w7) arrayList.get(i10);
                if (w7Var != null) {
                    StringBuilder sb3 = new StringBuilder("StoryDraft delete ");
                    sb3.append(w7Var.f11890b);
                    sb3.append(" (edit=");
                    sb3.append(w7Var.f11902g);
                    if (w7Var.f11902g) {
                        StringBuilder sb4 = new StringBuilder(", storyId=");
                        sb4.append(w7Var.f11900f);
                        sb4.append(", ");
                        if (w7Var.H != 0) {
                            sb2 = new StringBuilder("documentId=");
                            j10 = w7Var.H;
                        } else {
                            sb2 = new StringBuilder("photoId=");
                            j10 = w7Var.I;
                        }
                        sb2.append(j10);
                        sb4.append(sb2.toString());
                        sb4.append(", expireDate=");
                        sb4.append(w7Var.J);
                        str = sb4.toString();
                    } else {
                        str = "";
                    }
                    sb3.append(str);
                    sb3.append(", now=");
                    sb3.append(System.currentTimeMillis());
                    sb3.append(")");
                    FileLog.d(sb3.toString());
                    arrayList2.add(Long.valueOf(w7Var.f11890b));
                    w7Var.i(true);
                }
            }
            if (arrayList2.isEmpty()) {
                return;
            }
            this.f10497b.removeAll(arrayList);
            int i11 = this.f10496a;
            MessagesStorage messagesStorage = MessagesStorage.getInstance(i11);
            messagesStorage.getStorageQueue().postRunnable(new w0(0, arrayList2, messagesStorage));
            NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesDraftsUpdated, new Object[0]);
        }
    }

    public final void d(w7 w7Var) {
        if (w7Var == null) {
            return;
        }
        e(w7Var);
        ArrayList arrayList = this.f10497b;
        arrayList.remove(w7Var);
        if (!w7Var.f11931w) {
            arrayList.add(0, w7Var);
        }
        z0 z0Var = new z0(w7Var);
        int i10 = this.f10496a;
        MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
        messagesStorage.getStorageQueue().postRunnable(new y0(messagesStorage, z0Var, 0));
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesDraftsUpdated, new Object[0]);
    }

    public final void e(w7 w7Var) {
        if (w7Var == null) {
            return;
        }
        if (w7Var.f11890b == 0) {
            w7Var.f11890b = Utilities.random.nextLong();
        }
        w7Var.d = System.currentTimeMillis();
        w7Var.f11893c = true;
        if (w7Var.M) {
            w7Var.L = f(w7Var.L);
        } else if (w7Var.L != null) {
            File x9 = w7.x(this.f10496a, w7Var.K);
            try {
                AndroidUtilities.copyFile(w7Var.L, x9);
                w7Var.L = f(x9);
                w7Var.M = true;
            } catch (IOException e) {
                FileLog.e(e);
            }
        }
        w7Var.Z0 = f(w7Var.Z0);
        w7Var.P0 = f(w7Var.P0);
        w7Var.O0 = f(w7Var.O0);
    }

    public final File f(File file) {
        if (file == null) {
            return null;
        }
        if (this.f10500g == null) {
            File file2 = new File(FileLoader.getDirectory(4), "drafts");
            this.f10500g = file2;
            if (!file2.exists()) {
                this.f10500g.mkdir();
            }
        }
        if (!file.getAbsolutePath().startsWith(this.f10500g.getAbsolutePath())) {
            File file3 = new File(this.f10500g, file.getName());
            if (file.renameTo(file3)) {
                return file3;
            }
        }
        return file;
    }
}
