package eh;

import android.text.TextUtils;
import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class a {
    public final int f5610a;
    public final TLRPC.Document f5611b;
    public final String f5612c;
    public final MessageObject d;
    public final String f5613e;
    public boolean f5614f;
    public boolean f5615g;

    public a(int i10, MessageObject messageObject, TLRPC.Document document, String str) {
        this.f5610a = i10;
        this.d = messageObject;
        this.f5611b = document;
        this.f5612c = str;
        this.f5613e = TextUtils.isEmpty(str) ? FileLoader.getAttachFileName(document) : str;
        a();
    }

    public final void a() {
        boolean z4;
        boolean z10 = false;
        String str = this.f5612c;
        if (str != null) {
            z4 = new File(str).exists();
        } else {
            z4 = false;
        }
        int i10 = this.f5610a;
        if (!z4) {
            z4 = FileLoader.getInstance(i10).getPathToAttach(this.f5611b).exists();
        }
        this.f5614f = z4;
        String str2 = this.f5613e;
        if (!TextUtils.isEmpty(str2) && FileLoader.getInstance(i10).isLoadingFile(str2)) {
            z10 = true;
        }
        this.f5615g = z10;
    }
}
