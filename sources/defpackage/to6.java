package defpackage;

import android.content.Context;
import android.media.session.MediaController;
import java.util.ArrayList;
import java.util.HashMap;
public class to6 {
    public final MediaController a;
    public final Object b = new Object();
    public final ArrayList c = new ArrayList();
    public final HashMap d = new HashMap();
    public final kx6 e;

    public to6(Context context, kx6 kx6Var) {
        this.e = kx6Var;
        MediaController mediaController = new MediaController(context, kx6Var.b);
        this.a = mediaController;
        if (kx6Var.a() == null) {
            mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new j23(this));
        }
    }
}
