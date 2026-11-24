package defpackage;

import android.app.Activity;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
public abstract class dd5 extends l5c {
    public final int Q;
    public final ArrayList R;
    public boolean S;
    public t1b T;
    public boolean U;
    public boolean V;
    public int W;
    public int X;
    public boolean Y;
    public int Z;
    public String a0;
    public String b0;
    public int c0;
    public j45 d0;
    public final boolean[] e0;

    public dd5(o39 o39Var, Activity activity, int i) {
        super(o39Var, activity, i, 0, false, null, null);
        this.R = new ArrayList();
        this.W = 0;
        this.X = -1;
        this.e0 = new boolean[1];
        this.w = new ur4(this, (byte) 11);
        this.Q = i;
    }

    public static String Y(String str, boolean[] zArr) {
        boolean z;
        if (zArr != null) {
            zArr[0] = false;
        }
        if (str != null && !str.isEmpty()) {
            String trim = str.trim();
            if (trim.length() > 1) {
                if ((trim.charAt(0) == '#' || trim.charAt(0) == '$') && trim.indexOf(64) < 0) {
                    if (zArr != null) {
                        if (trim.charAt(0) == '$') {
                            z = true;
                        } else {
                            z = false;
                        }
                        zArr[0] = z;
                    }
                    return trim.substring(1);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public final void W() {
        t1b t1bVar = this.T;
        if (t1bVar != null && t1bVar.I != 0) {
            ConnectionsManager.getInstance(t1bVar.c).cancelRequest(t1bVar.I, true);
            t1bVar.I = 0;
        }
        this.S = false;
        if (this.X >= 0) {
            ConnectionsManager.getInstance(this.Q).cancelRequest(this.X, true);
            this.X = -1;
        }
        gl.r(this.d0);
        this.W++;
        this.V = false;
    }

    public final void X() {
        o39 o39Var;
        if (!TextUtils.isEmpty(this.a0) && !this.Y && !this.V && (o39Var = this.d) != null) {
            for (int i = 0; i < o39Var.getChildCount(); i++) {
                if (o39Var.getChildAt(i) instanceof pi4) {
                    Z(this.a0);
                    return;
                }
            }
        }
    }

    public final void Z(String str) {
        this.a0 = str;
        String Y = Y(str, this.e0);
        if (!TextUtils.equals(this.b0, Y)) {
            this.R.clear();
            this.Y = false;
            this.Z = 0;
            W();
        } else if (this.V) {
            return;
        }
        int i = this.W + 1;
        this.W = i;
        if (Y == null) {
            return;
        }
        this.V = true;
        O(true);
        j45 j45Var = new j45(this, i, Y, (byte) 2);
        this.d0 = j45Var;
        gl.d3(j45Var, 300L);
    }
}
