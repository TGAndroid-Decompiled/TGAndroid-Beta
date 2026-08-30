package dh;

import android.text.TextUtils;
import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class a {
    public final int f4879a;
    public final TLRPC.Document f4880b;
    public final String f4881c;
    public final MessageObject d;
    public final String e;
    public boolean f4882f;
    public boolean f4883g;

    public a(int i10, MessageObject messageObject, TLRPC.Document document, String str) {
        this.f4879a = i10;
        this.d = messageObject;
        this.f4880b = document;
        this.f4881c = str;
        this.e = TextUtils.isEmpty(str) ? FileLoader.getAttachFileName(document) : str;
        a();
    }

    public final void a() {
        boolean z4;
        boolean z10 = false;
        String str = this.f4881c;
        if (str != null) {
            z4 = new File(str).exists();
        } else {
            z4 = false;
        }
        int i10 = this.f4879a;
        if (!z4) {
            z4 = FileLoader.getInstance(i10).getPathToAttach(this.f4880b).exists();
        }
        this.f4882f = z4;
        String str2 = this.e;
        if (!TextUtils.isEmpty(str2) && FileLoader.getInstance(i10).isLoadingFile(str2)) {
            z10 = true;
        }
        this.f4883g = z10;
    }
}
