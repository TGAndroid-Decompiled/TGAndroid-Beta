package defpackage;

import android.content.ClipboardManager;
import java.util.ArrayList;
import org.telegram.utils.twidget.z;
public final class zsc implements Runnable {
    public final byte a;
    public final int b;
    public final Object c;

    public zsc(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    @Override
    public final void run() {
        CharSequence text;
        byte b = this.a;
        int i = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                atc atcVar = (atc) obj;
                ArrayList arrayList = atcVar.w;
                try {
                    ClipboardManager clipboardManager = (ClipboardManager) atcVar.getParentActivity().getSystemService("clipboard");
                    if (clipboardManager != null && clipboardManager.getPrimaryClip() != null && clipboardManager.getPrimaryClip().getItemCount() != 0 && (text = clipboardManager.getPrimaryClip().getItemAt(0).getText()) != null) {
                        String[] split = text.toString().trim().toLowerCase().split("\\s+");
                        for (int i2 = 0; i < arrayList.size() && i2 < split.length; i2++) {
                            ((zuc) arrayList.get(i)).setText(split[i2]);
                            i++;
                        }
                        atcVar.c0();
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 1:
                muc mucVar = (muc) obj;
                if (!mucVar.r && i == mucVar.K) {
                    mucVar.M = false;
                    mucVar.a.g3.O(true);
                    return;
                }
                return;
            case 2:
                hyc hycVar = (hyc) obj;
                kfc kfcVar = hycVar.a;
                if (i == -1) {
                    if (kfcVar.c0()) {
                        kfcVar.f0();
                        hycVar.n();
                    }
                    hycVar.K = false;
                    return;
                } else if (i == 1) {
                    if (hycVar.L) {
                        hycVar.L = false;
                        kfcVar.g0();
                        return;
                    }
                    return;
                } else if (i != -3 && i == -2 && kfcVar.c0()) {
                    hycVar.L = true;
                    kfcVar.f0();
                    hycVar.n();
                    return;
                } else {
                    return;
                }
            default:
                try {
                    ((z) obj).h(i);
                    return;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}
