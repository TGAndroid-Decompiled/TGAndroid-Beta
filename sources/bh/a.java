package bh;

import android.text.TextUtils;
import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class a {
    public final int f2641a;
    public final TLRPC.Document f2642b;
    public final String f2643c;
    public final MessageObject d;
    public final String f2644e;
    public boolean f2645f;
    public boolean f2646g;

    public a(int i10, MessageObject messageObject, TLRPC.Document document, String str) {
        this.f2641a = i10;
        this.d = messageObject;
        this.f2642b = document;
        this.f2643c = str;
        this.f2644e = TextUtils.isEmpty(str) ? FileLoader.getAttachFileName(document) : str;
        a();
    }

    public final void a() {
        boolean z10;
        boolean z11 = false;
        String str = this.f2643c;
        if (str != null) {
            z10 = new File(str).exists();
        } else {
            z10 = false;
        }
        int i10 = this.f2641a;
        if (!z10) {
            z10 = FileLoader.getInstance(i10).getPathToAttach(this.f2642b).exists();
        }
        this.f2645f = z10;
        String str2 = this.f2644e;
        if (!TextUtils.isEmpty(str2) && FileLoader.getInstance(i10).isLoadingFile(str2)) {
            z11 = true;
        }
        this.f2646g = z11;
    }
}
