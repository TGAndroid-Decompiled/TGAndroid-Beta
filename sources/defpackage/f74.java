package defpackage;

import android.content.DialogInterface;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;
public final class f74 implements DialogInterface.OnCancelListener {
    public final byte a;
    public final int b;
    public final int[] c;

    public f74(int i, int[] iArr, byte b) {
        this.a = b;
        this.b = i;
        this.c = iArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        byte b = this.a;
        int[] iArr = this.c;
        int i = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = ExternalActionActivity.y;
                ConnectionsManager.getInstance(i).cancelRequest(iArr[0], true);
                return;
            default:
                String str = LaunchActivity.C1;
                ConnectionsManager.getInstance(i).cancelRequest(iArr[0], true);
                return;
        }
    }
}
