package lh;

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

    public final int f15624a;

    public final ArrayList f15625b = new ArrayList();

    public boolean f15626c;
    public boolean d;

    public boolean f15627e;

    public boolean f15628f;

    public File f15629g;

    public a1(int i10) {
        this.f15624a = i10;
        if (this.f15627e || this.f15628f) {
            return;
        }
        this.f15628f = true;
        x0 x0Var = new x0(this, 0);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
        messagesStorage.getStorageQueue().postRunnable(new hh.t5((Object) messagesStorage, true, (Object) x0Var, 3));
    }

    public final void a(z0 z0Var) {
        String string;
        StringBuilder sb2;
        long j10;
        int i10 = this.f15624a;
        MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
        StringBuilder sb3 = new StringBuilder("StoryDraft append ");
        sb3.append(z0Var.f17139a);
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
            string = sb4.toString();
        } else {
            string = "";
        }
        sb3.append(string);
        sb3.append(", now=");
        sb3.append(System.currentTimeMillis());
        sb3.append(")");
        FileLog.d(sb3.toString());
        messagesStorage.getStorageQueue().postRunnable(new y0(messagesStorage, z0Var, 1));
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesDraftsUpdated, new Object[0]);
    }

    public final void b(ArrayList arrayList) {
        String string;
        StringBuilder sb2;
        long j10;
        if (arrayList == null) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            z7 z7Var = (z7) arrayList.get(i10);
            if (z7Var != null) {
                StringBuilder sb3 = new StringBuilder("StoryDraft delete ");
                sb3.append(z7Var.f17196b);
                sb3.append(" (edit=");
                sb3.append(z7Var.f17209g);
                if (z7Var.f17209g) {
                    StringBuilder sb4 = new StringBuilder(", storyId=");
                    sb4.append(z7Var.f17207f);
                    sb4.append(", ");
                    if (z7Var.H != 0) {
                        sb2 = new StringBuilder("documentId=");
                        j10 = z7Var.H;
                    } else {
                        sb2 = new StringBuilder("photoId=");
                        j10 = z7Var.I;
                    }
                    sb2.append(j10);
                    sb4.append(sb2.toString());
                    sb4.append(", expireDate=");
                    sb4.append(z7Var.J);
                    string = sb4.toString();
                } else {
                    string = "";
                }
                sb3.append(string);
                sb3.append(", now=");
                sb3.append(System.currentTimeMillis());
                sb3.append(")");
                FileLog.d(sb3.toString());
                arrayList2.add(Long.valueOf(z7Var.f17196b));
                z7Var.i(true);
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        this.f15625b.removeAll(arrayList);
        int i11 = this.f15624a;
        MessagesStorage messagesStorage = MessagesStorage.getInstance(i11);
        messagesStorage.getStorageQueue().postRunnable(new w0(0, arrayList2, messagesStorage));
        NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesDraftsUpdated, new Object[0]);
    }

    public final void c(z7 z7Var) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(z7Var);
        b(arrayList);
    }

    public final void d(z7 z7Var) {
        if (z7Var == null) {
            return;
        }
        e(z7Var);
        ArrayList arrayList = this.f15625b;
        arrayList.remove(z7Var);
        if (!z7Var.f17238w) {
            arrayList.add(0, z7Var);
        }
        z0 z0Var = new z0(z7Var);
        int i10 = this.f15624a;
        MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
        messagesStorage.getStorageQueue().postRunnable(new y0(messagesStorage, z0Var, 0));
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesDraftsUpdated, new Object[0]);
    }

    public final void e(z7 z7Var) {
        if (z7Var == null) {
            return;
        }
        if (z7Var.f17196b == 0) {
            z7Var.f17196b = Utilities.random.nextLong();
        }
        z7Var.d = System.currentTimeMillis();
        z7Var.f17199c = true;
        if (z7Var.M) {
            z7Var.L = f(z7Var.L);
        } else if (z7Var.L != null) {
            File fileX = z7.x(this.f15624a, z7Var.K);
            try {
                AndroidUtilities.copyFile(z7Var.L, fileX);
                z7Var.L = f(fileX);
                z7Var.M = true;
            } catch (IOException e9) {
                FileLog.e(e9);
            }
        }
        z7Var.Z0 = f(z7Var.Z0);
        z7Var.P0 = f(z7Var.P0);
        z7Var.O0 = f(z7Var.O0);
    }

    public final File f(File file) {
        if (file == null) {
            return null;
        }
        if (this.f15629g == null) {
            File file2 = new File(FileLoader.getDirectory(4), "drafts");
            this.f15629g = file2;
            if (!file2.exists()) {
                this.f15629g.mkdir();
            }
        }
        if (!file.getAbsolutePath().startsWith(this.f15629g.getAbsolutePath())) {
            File file3 = new File(this.f15629g, file.getName());
            if (file.renameTo(file3)) {
                return file3;
            }
        }
        return file;
    }
}
