package nh;

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
    public final int f17372a;
    public final ArrayList f17373b = new ArrayList();
    public boolean f17374c;
    public boolean d;
    public boolean f17375e;
    public boolean f17376f;
    public File f17377g;

    public a1(int i10) {
        this.f17372a = i10;
        if (!this.f17375e && !this.f17376f) {
            this.f17376f = true;
            x0 x0Var = new x0(this, 0);
            MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
            messagesStorage.getStorageQueue().postRunnable(new jh.r5((Object) messagesStorage, true, (Object) x0Var, 3));
        }
    }

    public final void a(z0 z0Var) {
        String str;
        StringBuilder sb2;
        long j10;
        int i10 = this.f17372a;
        MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
        StringBuilder sb3 = new StringBuilder("StoryDraft append ");
        sb3.append(z0Var.f18919a);
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

    public final void b(ArrayList arrayList) {
        String str;
        StringBuilder sb2;
        long j10;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                o7 o7Var = (o7) arrayList.get(i10);
                if (o7Var != null) {
                    StringBuilder sb3 = new StringBuilder("StoryDraft delete ");
                    sb3.append(o7Var.f18257b);
                    sb3.append(" (edit=");
                    sb3.append(o7Var.f18270g);
                    if (o7Var.f18270g) {
                        StringBuilder sb4 = new StringBuilder(", storyId=");
                        sb4.append(o7Var.f18268f);
                        sb4.append(", ");
                        if (o7Var.H != 0) {
                            sb2 = new StringBuilder("documentId=");
                            j10 = o7Var.H;
                        } else {
                            sb2 = new StringBuilder("photoId=");
                            j10 = o7Var.I;
                        }
                        sb2.append(j10);
                        sb4.append(sb2.toString());
                        sb4.append(", expireDate=");
                        sb4.append(o7Var.J);
                        str = sb4.toString();
                    } else {
                        str = "";
                    }
                    sb3.append(str);
                    sb3.append(", now=");
                    sb3.append(System.currentTimeMillis());
                    sb3.append(")");
                    FileLog.d(sb3.toString());
                    arrayList2.add(Long.valueOf(o7Var.f18257b));
                    o7Var.i(true);
                }
            }
            if (arrayList2.isEmpty()) {
                return;
            }
            this.f17373b.removeAll(arrayList);
            int i11 = this.f17372a;
            MessagesStorage messagesStorage = MessagesStorage.getInstance(i11);
            messagesStorage.getStorageQueue().postRunnable(new w0(0, arrayList2, messagesStorage));
            NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesDraftsUpdated, new Object[0]);
        }
    }

    public final void c(o7 o7Var) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(o7Var);
        b(arrayList);
    }

    public final void d(o7 o7Var) {
        if (o7Var == null) {
            return;
        }
        e(o7Var);
        ArrayList arrayList = this.f17373b;
        arrayList.remove(o7Var);
        if (!o7Var.f18299w) {
            arrayList.add(0, o7Var);
        }
        z0 z0Var = new z0(o7Var);
        int i10 = this.f17372a;
        MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
        messagesStorage.getStorageQueue().postRunnable(new y0(messagesStorage, z0Var, 0));
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesDraftsUpdated, new Object[0]);
    }

    public final void e(o7 o7Var) {
        if (o7Var == null) {
            return;
        }
        if (o7Var.f18257b == 0) {
            o7Var.f18257b = Utilities.random.nextLong();
        }
        o7Var.d = System.currentTimeMillis();
        o7Var.f18260c = true;
        if (o7Var.M) {
            o7Var.L = f(o7Var.L);
        } else if (o7Var.L != null) {
            File x4 = o7.x(this.f17372a, o7Var.K);
            try {
                AndroidUtilities.copyFile(o7Var.L, x4);
                o7Var.L = f(x4);
                o7Var.M = true;
            } catch (IOException e10) {
                FileLog.e(e10);
            }
        }
        o7Var.Z0 = f(o7Var.Z0);
        o7Var.P0 = f(o7Var.P0);
        o7Var.O0 = f(o7Var.O0);
    }

    public final File f(File file) {
        if (file == null) {
            return null;
        }
        if (this.f17377g == null) {
            File file2 = new File(FileLoader.getDirectory(4), "drafts");
            this.f17377g = file2;
            if (!file2.exists()) {
                this.f17377g.mkdir();
            }
        }
        if (!file.getAbsolutePath().startsWith(this.f17377g.getAbsolutePath())) {
            File file3 = new File(this.f17377g, file.getName());
            if (file.renameTo(file3)) {
                return file3;
            }
        }
        return file;
    }
}
